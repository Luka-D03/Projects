function SpremeniVelikost() {
	document.getElementById('vsebina').style.fontSize = "1.5em";
}

function SpremeniBarvo() {
	document.getElementById('vsebina').style.color = "blue";
}

function SpremeniSliko() {
	document.getElementById('slika').src = "images/premCB.jpg";
}

function Filter() {
	document.getElementById('slika2').style.filter = "grayscale(100%)";
}

function PrikaziPodatke1() {
	document.getElementById('podatki1').innerHTML = "Luka Dolenc, 2003 v Ljubljani";
}

function PrikaziPodatke2_2() {
	document.write('Luka Dolenc, 2003 v Ljubljani');
}

function PrikaziPodatke3() {
	window.alert("Luka Dolenc, 2003 v Ljubljani");
}