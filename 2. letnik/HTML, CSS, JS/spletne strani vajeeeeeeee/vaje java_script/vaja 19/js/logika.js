	var x = "0";
	var y = "0";
	var z = "0";




function btn1() {
	document.getElementById("steviloX1").disabled = true;
	document.getElementById("steviloX2").disabled = true;
	x = 1;
}

function btn1_2() {
	document.getElementById("steviloX1").disabled = true;
	document.getElementById("steviloX2").disabled = true;
	x = 2;
}

function btn2() {
	document.getElementById("steviloZ1").disabled = true;
	document.getElementById("steviloZ2").disabled = true;
	z = 1;
}

function btn2_2() {
	document.getElementById("steviloZ1").disabled = true;
	document.getElementById("steviloZ2").disabled = true;
	z = 2;
}

function btn3() {
	document.getElementById("steviloY1").disabled = true;
	document.getElementById("steviloY2").disabled = true;
	y = 1;
}

function btn3_2() {
	document.getElementById("steviloY1").disabled = true;
	document.getElementById("steviloY2").disabled = true;
	y = 2;
}

function logika() {
	/* x1 = parseInt(document.getElementById("steviloZ1").value);
	x2 = parseInt(document.getElementById("steviloZ2").value);
	y1 = parseInt(document.getElementById("steviloY1").value);
	y2 = parseInt(document.getElementById("steviloY2").value);
	z1 = parseInt(document.getElementById("steviloZ1").value);
	z2 = parseInt(document.getElementById("steviloZ2").value); */

	if(x == 1) {
		if (z == 1) {
			if (y == 1) {
				alert("0 in 0 = 0");
			} else {
				if (y == 2) {
					alert("0 in 1 = 0");
				}
				else {
					alert("Napaka!");
				}
			}
		}else {
			if (z == 2) {
				if (y == 1) {
					alert("0 ali 0 = 0");
				} else{ 
					if (y == 2) {
						alert("0 ali 1 = 1");
					}
					else {
						alert("Napaka!");
					}
				}
			}
			else {
				alert("Napaka!");
			}
		}
	} 
	else {
		if(x == 2) {
			if (z == 1) {
				if (y == 1) {
					alert("1 in 0 = 0");
				} else{
					if (y == 2) {
						alert("1 in 1 = 1");
					}
					else {
						alert("Napaka!");
					}
				}
			} else {
				if (z == 2) {
					if (y == 1) {
						alert("1 ali 0 = 1");
					} else {
						if (y == 2) {
							alert("1 ali 1 = 1");
						}
						else {
							alert("Napaka!");
						}
					}
				}
				else {
					alert("Napaka!");
				}
			}
		}
		else {
			alert("Napaka!");
		}
	}

	document.getElementById("steviloX1").disabled = false;
	document.getElementById("steviloX2").disabled = false;
	document.getElementById("steviloZ1").disabled = false;
	document.getElementById("steviloZ2").disabled = false;
	document.getElementById("steviloY1").disabled = false;
	document.getElementById("steviloY2").disabled = false;
}
