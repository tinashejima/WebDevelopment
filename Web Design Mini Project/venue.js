//document.addEventListener('DOMContentLoaded', function(){

    //document.querySelector('#aboutProject', function dsplay(){

        //if (document.querySelector('#aboutProject').innerHTML==='none') {
        //    document.querySelector('#aboutProject').innerHTML='show';

        //} else {

           // document.querySelector('#aboutProject').innerHTML='show!'
//}
        
         // Step 2: Add an event listener to the link
         document.getElementById('aboutProject').addEventListener('click', function(event) {
            event.preventDefault(); // Prevent the default link behavior
        // Step 3: Toggle the visibility of the hidden div
        var aboutProjectDiv = document.getElementById('aboutProjectDiv');
        aboutProjectDiv.style.display = (aboutProjectDiv.style.display === 'none') ? 'block' : 'none';
    });