let currentMove = 0;
let wynik = 0;
let bokX, bokY;
let liczby = [];
let liczbyWzorzec = [];
let dateStart, timeStart;
let timerInterval;

function initGameXY() {
    document.getElementById("plansza").innerHTML = "";
    document.getElementById("bingo").style.display = "none";
}

function startGameXY() {
    bokX = parseInt(document.getElementById("bokX").value);
    bokY = parseInt(document.getElementById("bokY").value);
    const plansza = document.getElementById("plansza");
    
    plansza.innerHTML = "";
    document.getElementById("bingo").style.display = "none";

    let totalCells = bokX * bokY;
    liczby = Array.from({ length: totalCells - 1 }, (_, i) => i + 1).concat(0);
    liczbyWzorzec = [...liczby];
    liczby = shuffle(liczby);

    currentMove = 0;
    wynik = 0;

    wynikGryPoPermutacjiXY();


    dateStart = new Date();
    timeStart = Math.round(dateStart.getTime() / 1000);


    clearInterval(timerInterval);
    timerInterval = setInterval(updateTimer, 1000);

    writeInfoXY();


    for (let i = 0; i < bokY; i++) {
        let row = plansza.insertRow();
        for (let j = 0; j < bokX; j++) {
            let cell = row.insertCell();
            let index = i * bokX + j;
            cell.id = `${i}.${j}`;
            cell.innerHTML = liczby[index] ? liczby[index] : "";
            cell.className = liczby[index] === 0 ? "empty" : "";
            cell.onclick = function () {
                moveTile(i, j);
            };


            cell.style.width = "60px";
            cell.style.height = "60px";
            cell.style.border = "2px solid black";
            cell.style.textAlign = "center";
            cell.style.fontSize = "24px";
            cell.style.fontWeight = "bold";
            cell.style.display = "table-cell";
        }
    }
}


function updateTimer() {
    let now = new Date();
    let timeNow = Math.round(now.getTime() / 1000);
    document.getElementById("time").innerHTML = timeNow - timeStart;
}

function moveTile(i, j) {
    let cell = document.getElementById(`${i}.${j}`);
    if (!cell.innerHTML) return;

    let directions = [
        [0, -1],
        [-1, 0],
        [0, 1], 
        [1, 0]  
    ];

    for (let [di, dj] of directions) {
        let ni = i + di, nj = j + dj;
        if (ni >= 0 && ni < bokY && nj >= 0 && nj < bokX) {
            let neighbor = document.getElementById(`${ni}.${nj}`);
            if (neighbor.innerHTML === "") {
                neighbor.innerHTML = cell.innerHTML;
                neighbor.className = "";
                cell.innerHTML = "";
                cell.className = "empty";

                let value = parseInt(neighbor.innerHTML);
                wynik -= (value === (i * bokX + j + 1));
                wynik += (value === (ni * bokX + nj + 1));

                currentMove++;
                writeInfoXY();
                return;
            }
        }
    }
}

function wynikGryPoPermutacjiXY() {
    wynik = 0;
    for (let i = 0; i < bokX * bokY; i++) {
        wynik += (liczby[i] === liczbyWzorzec[i]);
    }
}

function writeInfoXY() {
    document.getElementById("wynik").innerHTML = wynik;
    document.getElementById("current").innerHTML = currentMove;
    
    let bingoText = document.getElementById("bingo");

    if (wynik == bokX * bokY - 1) {
        bingoText.innerHTML = "BINGO!";
        bingoText.style.display = "block";
        clearInterval(timerInterval);
    } else if ((wynik >= bokX * bokY - 3) && rewersLast2XY()) {
        bingoText.innerHTML = "bingo!";
        bingoText.style.display = "block";
    } else {
        bingoText.style.display = "none";
    }
}

function rewersLast2XY() {
    if (bokX < 3) return 0;
    return (
        document.getElementById(`${bokY - 1}.${bokX - 3}`).innerHTML == bokX * bokY - 1 &&
        document.getElementById(`${bokY - 1}.${bokX - 2}`).innerHTML == bokX * bokY - 2
    );
}

function shuffle(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
    return array;
}
