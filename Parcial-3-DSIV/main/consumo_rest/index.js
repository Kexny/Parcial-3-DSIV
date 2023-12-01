let baseUrl = "http://localhost:8080"
let imagenes = [];

function ObtenerImagenes() {
    fetch(baseUrl + '/imagenes').then(res=> {
        res.json().then(json=> {
            imagenes = json;
            ImprimirImagenes();
        })
    });
}

function ImprimirImagenes() {
    let contenedor = document.getElementById("mine");
    contenedor.innerHTML = "";
    imagenes.forEach(imagen=> {
        contenedor.innerHTML += MapearImagen(imagen);
    });
}

function MapearImagen(imagen) {
    return `
    <div class="fotos">
        <img src="${imagen.foto}"
        alt="" height="300" width="">
    </div>`;
}