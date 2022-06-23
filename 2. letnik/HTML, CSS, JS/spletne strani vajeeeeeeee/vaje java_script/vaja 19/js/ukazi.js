var x = "";
var y = "";

function IzračunVsote() {
	x = parseInt(document.getElementById("steviloX1").value);
	y = parseInt(document.getElementById("steviloY1").value);
	var vsota = x + y;
	window.alert("Vsota: " + x + " + " + y + " = " + vsota);
}

function IzračunRazlike() {
	x = parseInt(document.getElementById("steviloX2").value);
	y = parseInt(document.getElementById("steviloY2").value);
	var razlika = x - y;
	window.alert("Razlika: " + x + " - " + y + " = " + razlika);
}

function IzračunProdukta() {
	x = parseInt(document.getElementById("steviloX3").value);
	y = parseInt(document.getElementById("steviloY3").value);
	var produkt = x * y;
	window.alert("Produkt: " + x + " * " + y + " = " + produkt);
}

function IzračunKoličnika() {
	x = parseInt(document.getElementById("steviloX4").value);
	y = parseInt(document.getElementById("steviloY4").value);
	var količnik = x / y;
	window.alert("Produkt: " + x + " / " + y + " = " + količnik);
}







/* function IzracunajSestevek() {
	var x1 = parseInt(document.getElementById("steviloX1").value);
	var x2 = parseInt(document.getElementById("steviloX2").value);
	var y1 = parseInt(document.getElementById("steviloY1").value);
	var y2 = parseInt(document.getElementById("steviloY2").value);
	var odgovor = parseInt(document.getElementById("a").value);
	var sestevek1 = x1 + y1;
	var sestevek2 = x2 + y2;
	if (odgovor == sestevek1) {
		window.alert("Odgovor je pravilen!");
	}
	else {
		if (odgovor == sestevek2) {
			window.alert("Odgovor je pravilen!");
		}
		else {
			if (odgovor !== sestevek2)  {
				window.alert("Odgovor je napačen!");
			}
		}
	}
} */