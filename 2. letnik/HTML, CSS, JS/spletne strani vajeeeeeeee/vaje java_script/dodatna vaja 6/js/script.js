var drzava = ["Slovenija", "Avstrija", "Kuba", "Grčija", "Indija"];
var glavno_mesto = ["Ljubljana", "Dunaj", "Havana", "Atene", "New Delhi"];
var izpis, grb_izpis, barva_prva = "1", barva_druga = "1", barva_tretja = "1", barva_cetrta = "1", barva_peta = "1";

function tabela() {
    izpis = document.getElementById('celota');
    izpis.innerHTML = "<table id='vsebina'><tr><td id='naslov'>Država</td><td id='naslov'>Glavno mesto</td></tr></table>";
    izpis = document.getElementById('vsebina');
    for(let i = 0; i < 5; i++) {
        izpis.innerHTML += "<tr><td onclick='barva()' id='barva"+i+"'>"+drzava[i]+"</td><td ondblclick='grb()' id='grb"+i+"'>"+glavno_mesto[i]+"</td>";
    }
}

function barva() {
        document.getElementById("barva0").onclick = function() {
            barva_prva = + barva_prva + 1;
            if(barva_prva % 2 == 0) {
                document.getElementById("barva0").style = "color: blue; font-size: 2em;";
            }
            if(barva_prva % 2 != 0) {
                document.getElementById("barva0").style = "color: black; font-size: 1em;";
            }
        }
        document.getElementById("barva1").onclick = function() {
            barva_druga = + barva_druga + 1;
            if(barva_druga % 2 == 0) {
                document.getElementById("barva1").style = "color: blue; font-size: 2em;";
            }
            if(barva_druga % 2 != 0) {
                document.getElementById("barva1").style = "color: black; font-size: 1em;";
            }
        }
        document.getElementById("barva2").onclick = function() {
            barva_tretja = + barva_tretja + 1;
            if(barva_tretja % 2 == 0) {
                document.getElementById("barva2").style = "color: blue; font-size: 2em;";
            }
            if(barva_tretja % 2 != 0) {
                document.getElementById("barva2").style = "color: black; font-size: 1em;";
            }
        }
        document.getElementById("barva3").onclick = function() {
            barva_cetrta = + barva_cetrta + 1;
            if(barva_cetrta % 2 == 0) {
                document.getElementById("barva3").style = "color: blue; font-size: 2em;";
            }
            if(barva_cetrta % 2 != 0) {
                document.getElementById("barva3").style = "color: black; font-size: 1em;";
            }
        }
        document.getElementById("barva4").onclick = function() {
            barva_peta = + barva_peta + 1;
            if(barva_peta % 2 == 0) {
                document.getElementById("barva4").style = "color: blue; font-size: 2em;";
            }
            if(barva_peta % 2 != 0) {
                document.getElementById("barva4").style = "color: black; font-size: 1em;";
            }
        }
    }

function grb() {
    document.getElementById("grb0").ondblclick = function() {
        window.open("/glavno mesto/slovenija.html");
    }
    document.getElementById("grb1").ondblclick = function() {
        window.open("/glavno mesto/avstrija.html");
    }
    document.getElementById("grb2").ondblclick = function() {
        window.open("/glavno mesto/kuba.html");
    }
    document.getElementById("grb3").ondblclick = function() {
        window.open("/glavno mesto/grčija.html");
    }
    document.getElementById("grb4").ondblclick = function() {
        window.open("/glavno mesto/indija.html");
    }
}
