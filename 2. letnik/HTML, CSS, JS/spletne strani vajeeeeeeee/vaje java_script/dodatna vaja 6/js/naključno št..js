var zgornje_st, random, vneseno;

function generiraj() {
    zgornje_st = parseInt(document.getElementById('stevilo').value);
    random = Math.floor(Math.random() * zgornje_st) +1;
    document.getElementById("drugo_okno").style = "display: block";
    document.getElementById("prvo_okno").style = "display: none";
}

function preverjanje() {
    vneseno = parseInt(document.getElementById("vneseno").value);
    if(random < vneseno) {
        document.getElementById("izpis").innerHTML = "Število je manjše od generiranega!";
        document.getElementById("poizkusi_ponovno").innerHTML = "Poizkusi ponovno.";
        document.getElementById("ponovno").style = "display: none";
        document.getElementById("poizkusi_ponovno").style = "display: block";
    }

    if(random > vneseno) {
        document.getElementById("izpis").innerHTML = "Število je večje od generiranega!";
        document.getElementById("poizkusi_ponovno").innerHTML = "Poizkusi ponovno.";
        document.getElementById("ponovno").style = "display: none";
        document.getElementById("poizkusi_ponovno").style = "display: block";
    }

    if(random == vneseno) {
        document.getElementById("izpis").innerHTML = "ČESTITAMO!!  Ugotovili ste pravo število!";
        document.getElementById("poizkusi_ponovno").style = "display: none";
        document.getElementById("ponovno").style = "display: block";
    }
    document.getElementById("drugo_okno").style = "display: none";
    document.getElementById("alert_okno").style = "display: block";
}

function ponovno() {
    document.getElementById("drugo_okno").style = "display: block";
    document.getElementById("alert_okno").style = "display: none";
    document.getElementById('vneseno').value = "";
}

function reset() {
    document.getElementById("prvo_okno").style = "display: block";
    document.getElementById("drugo_okno").style = "display: none";
    document.getElementById("alert_okno").style = "display: none";
    document.getElementById('stevilo').value = "";
    document.getElementById('vneseno').value = "";
}