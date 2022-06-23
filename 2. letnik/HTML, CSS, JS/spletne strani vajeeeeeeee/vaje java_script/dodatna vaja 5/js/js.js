var min2 = 3, max2 = 33, korak = 4;

function zaporedje(min, max, k) {
    var zapis = document.getElementById('vsebina');
    zapis.innerHTML = "";  
    for(var i = min; i <= max; i += k) {
        zapis.innerHTML += i + "<br><br>";
    }
}

function spremeni() {
    min2 = parseInt(document.getElementById('min').value);
    max2 = parseInt(document.getElementById('max').value);
    korak = parseInt(document.getElementById('korak').value);
    zaporedje(min2, max2, korak);
}

function sprememba() {
    var zapis = document.getElementById('naslov');
    zapis.style = "color: green;";
    document.getElementById('posebnes').style = "color: green;";
    document.getElementById('posebnes').innerHTML = "Ko se pomaknemo z miško nad njega, spremenimo barvo naslova.";
}

function nazaj() {
    var zapis = document.getElementById('naslov');
    zapis.style = "color: black;";
    document.getElementById('posebnes').style = "color: black;";
    document.getElementById('posebnes').innerHTML = "";
}