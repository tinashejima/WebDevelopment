
function ShowPage(page) {
    document.querySelectorAll('div', function(){

        p1.style.display ='none';
    })
    document.querySelector(`#${page}`).style.display = 'block';

}

document.addEventListener('DOMContentLoaded', function(){

    document.querySelectorAll('a').forEach(a => {
        a.onclick = function(){
            ShowPage(this.dataset.page);
        }
    });
});

