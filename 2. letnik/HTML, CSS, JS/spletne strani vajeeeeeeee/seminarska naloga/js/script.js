var naslov, besedilo, visina_slika, strani, žival = 0, stevilo, teža;
var next = document.getElementById('next');
var prev = document.getElementById('prev');

function main_kopno() {
    document.getElementById('kopno').style = "animation: blur-in 0.5s ease forwards;";
    naslov = document.getElementById('naslov_kopno');
    besedilo = document.getElementById('besedilo_kopno');
    naslov.style = "animation: vid-in 1s ease forwards;";
    besedilo.style = "animation: vid-bes-in 1s ease forwards;";
}

function reset_kopno() {
    
    naslov.style = " animation: vid-out 1s ease forwards;";
    besedilo.style = " animation: vid-bes-out 1s ease forwards;";
    document.getElementById('kopno').style = "animation: blur-out 0.5s ease forwards;";
}

function main_voda() {
    document.getElementById('vodno').style = "animation: blur-in 0.5s ease forwards;";
    naslov = document.getElementById('naslov_vodno');
    besedilo = document.getElementById('besedilo_vodno');
    naslov.style = "animation: vid-in 1s ease forwards;";
    besedilo.style = "animation: vid-bes-in 1s ease forwards;";
}

function reset_voda() {
    naslov.style = " animation: vid-out 1s ease forwards;";
    besedilo.style = " animation: vid-bes-out 1s ease forwards;";
    document.getElementById('vodno').style = "animation: blur-out 0.5s ease forwards;";
}

function main_zrak() {
    document.getElementById('zrak').style = "animation: blur-in 0.5s ease forwards;";
    naslov = document.getElementById('naslov_zrak');
    besedilo = document.getElementById('besedilo_zrak');
    naslov.style = "animation: vid-in 1s ease forwards;";
    besedilo.style = "animation: vid-bes-pos-in 1s ease forwards;";
}

function reset_zrak() {
    naslov.style = " animation: vid-out 1s ease forwards;";
    besedilo.style = " animation: vid-bes-pos-out 1s ease forwards;";
    document.getElementById('zrak').style = "animation: blur-out 0.5s ease forwards;";
}

function main_vrtovi() {
    document.getElementById('vrtovi').style = "animation: blur-in 0.5s ease forwards;";
    naslov = document.getElementById('naslov_vrtovi');
    besedilo = document.getElementById('besedilo_vrtovi');
    naslov.style = "animation: vid-in 1s ease forwards;";
    besedilo.style = "animation: vid-bes-pos-in 1s ease forwards;";
}

function reset_vrtovi() {
    naslov.style = " animation: vid-out 1s ease forwards;";
    besedilo.style = " animation: vid-bes-pos-out 1s ease forwards;";
    document.getElementById('vrtovi').style = "animation: blur-out 0.5s ease forwards;";
}

window.onresize = sprememba;

function sprememba() {
    var sirina = window.innerWidth;
    visina_slika = document.getElementsByClassName('celota');

    if(jQuery('body').hasClass('home')) {
        if(sirina < 1260) {
            document.getElementById('okno1').classList.replace('col-sm-6', 'col-sm-12');
            document.getElementById('okno2').classList.replace('col-sm-6', 'col-sm-12');
            document.getElementById('okno3').classList.replace('col-sm-6', 'col-sm-12');
            document.getElementById('okno4').classList.replace('col-sm-6', 'col-sm-12');
        }

        if(sirina < 650) {
            for(var i = 0; i < 4; i++) {
                visina_slika[i].style = "height: 70vh;";
            }
        }

        if(sirina > 650) {
            for(var i = 0; i < 4; i++) {
                visina_slika[i].style = "height: 40vh;";
            }
        } 

        if(sirina > 1260) {
            document.getElementById('okno1').classList.replace('col-sm-12', 'col-sm-6');
            document.getElementById('okno2').classList.replace('col-sm-12', 'col-sm-6');
            document.getElementById('okno3').classList.replace('col-sm-12', 'col-sm-6');
            document.getElementById('okno4').classList.replace('col-sm-12', 'col-sm-6');
        }
    }

    if(jQuery('img').hasClass('slike_strani')) {
            if(sirina < 1000) {
                document.getElementById('str1').classList.replace('col-sm-4', 'col-sm-12');
                document.getElementById('str2').classList.replace('col-sm-4', 'col-sm-12');
                document.getElementById('str3').classList.replace('col-sm-4', 'col-sm-12');
            }

            if(sirina > 1000) {
                document.getElementById('str1').classList.replace('col-sm-12', 'col-sm-4');
                document.getElementById('str2').classList.replace('col-sm-12', 'col-sm-4');
                document.getElementById('str3').classList.replace('col-sm-12', 'col-sm-4');
            }
    }

    if(jQuery('div').hasClass('pics')) {
        if(sirina > 900) {
            document.getElementById('pods').style.width = "30%";
        }

        if(sirina < 900) {
            document.getElementById('pods').style.width = "70%";
        }
    }
}
var slide_st = 1;
slike(slide_st);

function new_slide(n) {
slike(slide_st += n);
}

function slike(n) {
var i;
var slides = document.getElementsByClassName("pics");
if (n > slides.length) {
    slide_st = 1
    }
if (n < 1) {
    slide_st = slides.length
    }
for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
}

    slides[slide_st-1].style.display = "block";
}

function slon() {
    žival = 1;
}

function žirafa() {
    žival = 2;
}

function nosorog() {
    žival = 3;
}

function page1(){
    document.getElementById('vsebina-izračun').innerHTML = '<h1>Izberi žival:</h1><input type="radio" name="žival" onclick="slon()"><label>Slon</label><br><input type="radio" name="žival" onclick="žirafa()"><label>Žirafa</label><br><input type="radio" name="žival" onclick="nosorog()"><label>Nosorog</label><br><button type="button" class="vsebina-butn" onclick="page2()">Potrdi izbiro in nadaljuj.</button>';
}

function page2(){
    document.getElementById('vsebina-izračun').innerHTML = '<h1>Vnesi število živali:</h1><br><label>Število: </label><br><input type="number" id="stevilo"><br><br><button type="button" class="vsebina-butn" onclick="page3()">Potrdi in si oglej tabelo.</button>';
}

function page3(){
    stevilo = document.getElementById('stevilo').value;
    
    if(žival == 0) {
        document.getElementById('vsebina-izračun').innerHTML = '<button type="button" class="vsebina-butn" onclick="page1()">Žal poizkusi ponovno...</button>';
    }

    if(žival == 1) {
        teža = stevilo * 5000;
        document.getElementById('vsebina-izračun').innerHTML = '<table><tr><td>Žival</td><td>Slon</td></tr><tr><td>Število</td><td>'+stevilo+'</td></tr><tr><td>Teža ene živali</td><td>5000</td></tr><tr><td>Teža '+stevilo+'. živali</td><td>'+teža+' kg</td></tr></table><button type="button" class="vsebina-butn" onclick="page1()">Ponovno?</button>';
    }

    if(žival == 2) {
        teža = stevilo * 800;
        document.getElementById('vsebina-izračun').innerHTML = '<table><tr><td>Žival</td><td>Žirafa</td></tr><tr><td>Število</td><td>'+stevilo+'</td></tr><tr><td>Teža ene živali</td><td>800</td></tr><tr><td>Teža '+stevilo+'. živali</td><td>'+teža+' kg</td></tr></table><button type="button" class="vsebina-butn" onclick="page1()">Ponovno?</button>';
    }

    if(žival == 3) {
        teža = stevilo * 2300;
        document.getElementById('vsebina-izračun').innerHTML = '<table><tr><td>Žival</td><td>Nosorog</td></tr><tr><td>Število</td><td>'+stevilo+'</td></tr><tr><td>Teža ene živali</td><td>2300</td></tr><tr><td>Teža '+stevilo+'. živali</td><td>'+teža+' kg</td></tr></table><button type="button" class="vsebina-butn" onclick="page1()">Ponovno?</button>';
    }
    
}

function more_stuff() {
    document.getElementById('drop').style.display = "block";
    document.getElementById('mor').style.display = "none";
    document.getElementById('mor_hide').style.display = "block";
}

function more_stuff_hide() {
    document.getElementById('drop').style.display = "none";
    document.getElementById('mor').style.display = "block";
    document.getElementById('mor_hide').style.display = "none";
}