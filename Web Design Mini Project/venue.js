let disply = document.querySelector("#home");
let back = document.querySelector(".imagesContainer");
let prev = document.querySelector(".imgDetails");

disply.addEventListener(type:"click", listener () => {
    back.classList.remove("notActive")
    prev.classList.add("notActive")

})