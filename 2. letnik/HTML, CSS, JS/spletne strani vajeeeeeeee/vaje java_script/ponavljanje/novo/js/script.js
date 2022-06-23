function sprememba1() {
    document.getElementById('memes').innerHTML = '';
    document.getElementById('memes').innerHTML = '<img src="images/hellow.jpg" id="slikca1">';
}

function sprememba2() {
    document.getElementById('memes').innerHTML = '';
    document.getElementById('memes').innerHTML = '<img src="images/canthear.jpg" id="slikca2">';
}

function spremeni() {
    var sirina = parseInt(document.getElementById('sirina').value);

    document.getElementById('slikca1').style = "width: "+sirina+"px;";
    document.getElementById('slikca2').style = "width: "+sirina+"px;";
}