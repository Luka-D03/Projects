var MIN = "";
var MAX = "";
var DELITELJ = "";
var DELITELJ2 = "";
var VRST = "";
var STOL = "";
var div = document.createElement('div');

function zaporedje() {
    MIN = parseInt(document.getElementById("MIN").value);
    MAX = parseInt(document.getElementById("MAX").value);
    DELITELJ = parseInt(document.getElementById("DELITELJ").value);
    document.getElementById("izpis").innerHTML = "Prikaz zaporedja števil, ki so deljiva s številom <span class='del'>"+DELITELJ+"</span> v seznamu med "+MIN+" in "+MAX+":<hr class='line'>";

    document.getElementById("👁‍🗨").style = "display: none";
    document.getElementById("💢").style = "display: inline-block";
/*     let button = document.createElement('button');
    button.onclick
    button.id = '💢';
    button.innerHTML = "Resetiraj zaporedje";
    document.getElementById('butns').appendChild(button);

    var btn1 = document.getElementById("👁‍🗨");
    var btn2 = document.getElementById("💢");
    btn2.parentNode.replaceChild(btn2, btn1); */

    for (MIN = MIN; MIN <= MAX; MIN++) {
        if (MIN % DELITELJ == 0) {
                let div = document.createElement('div');
                div.className = '✔';
                div.innerHTML = MIN;
                document.getElementById("🔳").appendChild(div);
            } else {
                let div = document.createElement('div');
                div.className = '❌';
                div.innerHTML = MIN;
                document.getElementById("🔳").appendChild(div);
            }
        if (MIN < MAX) {
            let div = document.createElement('div');
            div.className = '▫';
            div.innerHTML = ",\xa0";
            document.getElementById("🔳").appendChild(div);
        } else {
            let div = document.createElement('div');
            div.className = '▫';
            div.innerHTML = ".";
            document.getElementById("🔳").appendChild(div);
        }
        }
    }

function reset() {

    document.getElementById("💢").style = "display: none";
    document.getElementById("👁‍🗨").style = "display: inline-block";
    
    document.getElementById("🔳").innerHTML = "";
    document.getElementById("MIN").value = "";
    document.getElementById("MAX").value = "";
    document.getElementById("DELITELJ").value = "";
    document.getElementById("izpis").innerHTML = "";
    /* 
    let button = document.createElement('button');
    button.onclick = 'zaporedje';
    button.id = '👁‍🗨';
    button.innerHTML = "Prikaži zaporedje z označenimi števili";
    document.getElementById('butns').appendChild(button);

    var btn1 = document.getElementById("💢");
    var btn2 = document.getElementById("👁‍🗨");
    btn2.parentNode.replaceChild(btn2, btn1); */
}

function tabela() {
    VRST = parseInt(document.getElementById("VRST").value);
    STOL = parseInt(document.getElementById("STOL").value);
    DELITELJ2 = parseInt(document.getElementById("DELITELJ2").value);

    document.getElementById("izpis2").innerHTML = "Prikaz tabele <span class='tab'>"+VRST+" X "+STOL+"</span> kjer je uporabljeno množenje:<hr class='line'>";

    document.getElementById("👁‍🗨1").style = "display: none";
    document.getElementById("💢1").style = "display: inline-block";

    var y = 1;
    var d = 1;
    var a = 1;

    for (let i = 1; i <= VRST; i++) {
       for (a = 1, d = d * y; a <= STOL; a++, d += y) {
           if (d % DELITELJ2 == 0) {
            let div = document.createElement('div');
            div.className = '✔2';
            div.innerHTML = d;
            document.getElementById("🙌").appendChild(div);
           } else {
            let div = document.createElement('div');
            div.className = '❌2';
            div.innerHTML = d;
            document.getElementById("🙌").appendChild(div);
           }
       }
        let br = document.createElement('br');
        let br1 = document.createElement('br');
        document.getElementById("🙌").appendChild(br);
        document.getElementById("🙌").appendChild(br1);
        y++;
        d = 1;
    }

    /* for(var i = 1, y = 1; i <= VRST; i++) {
        for(var d = 1, x = 2; d <= x; d++, x++, y++) {
            if(d <= STOL) {
                if(d % DELITELJ2 == 0) {
                    let div = document.createElement('div');
                    div.className = '✔1';
                    div.innerHTML = y;
                    document.getElementById("🙌").appendChild(div);
                } else {
                    let div = document.createElement('div');
                    div.className = '❌1';
                    div.innerHTML = "y";
                    document.getElementById("🙌").appendChild(div);
                }
            } else {
                x = 0;
                let br = document.createElement('br');
                let br1 = document.createElement('br');
                document.getElementById("🙌").appendChild(br);
                document.getElementById("🙌").appendChild(br1);
            }
        }
        y = i + 1
    } */
}

function reset2() {

    document.getElementById("💢1").style = "display: none";
    document.getElementById("👁‍🗨1").style = "display: inline-block";
    
    document.getElementById("🙌").innerHTML = "";
    document.getElementById("VRST").value = "";
    document.getElementById("STOL").value = "";
    document.getElementById("DELITELJ2").value = "";
    document.getElementById("izpis2").innerHTML = "";
}