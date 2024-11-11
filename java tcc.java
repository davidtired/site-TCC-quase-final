AOS.init();

const btnOpenSidebar = document.querySelector(".icon-open");
const btnCloseSidebar = document.querySelector(".icon-close");
const headerMenu = document.querySelector(".header-menu");
const content = document.querySelector(".main");

btnOpenSidebar.addEventListener("click", showSidebar);

function showSidebar() {
    headerMenu.classList.toggle("hidden");

    headerMenu.style.marginRight = "0vw";

    headerMenu.style.visibility = "visible";

    headerMenu.style.animationName = "showSidebar";
}

btnCloseSidebar.addEventListener("click", () => {
    headerMenu.classList.toggle("hidden");
});


window.addEventListener("resize", function () {
    if (window.innerWidth > 900) {
        headerMenu.classList.remove("hidden");
    } else {
        headerMenu.classList.add("hidden");
    }
});

