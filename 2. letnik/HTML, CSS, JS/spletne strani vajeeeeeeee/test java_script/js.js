var up, down, del, muca;

function Delitelji() {
    up = parseInt(document.getElementById('zgo_st').value);
    down = parseInt(document.getElementById('spo_st').value);
    del = parseInt(document.getElementById('del').value);
    muca = document.getElementById("muca");
    
    muca.innerHTML = "Delitelji so:<br>";
    for(down += 1; down < up; down++) {
        if(down % del == 0) {
            muca.innerHTML += del+" deli število <b>"+down+"<b><br>";
        }
    }
}