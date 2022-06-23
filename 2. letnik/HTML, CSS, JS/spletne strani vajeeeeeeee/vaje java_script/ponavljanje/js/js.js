

function pozdrav() {
    var ime = document.getElementById('ime').value;
    var priimek = document.getElementById('priimek').value;
    var spol = document.getElementById('spol').value;

    if(spol == "m") {
        document.getElementById('vsebina').innerHTML ="Pozdravljen "+ime+" "+priimek+"!";
    }

    if(spol == "z") {
        document.getElementById('vsebina').innerHTML ="Pozdravljena "+ime+" "+priimek+"!";
    }
}

function izpis_st() {
    var st = parseInt(document.getElementById('stevilo').value);
    document.getElementById('izpis_st').innerHTML = "<h1>"+st+"</h1>"
}