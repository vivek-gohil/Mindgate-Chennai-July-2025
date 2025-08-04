let languages = ["C", "C++", "Java", "Python", "HTML", "XML"];

for (const l in languages) {
    console.log(l);
    console.log(languages[l]);
}
console.log("-----------------");
for (const l of languages) {
    console.log(l);
}




function printTable() {
    let n = parseInt(document.getElementById("number").value);
    let row = "";
    for (let i = 1; i <= 10; i++) {
        row += "<tr> <td> " + n + "</td><td>" + i + "</td><td> " + (n * i) + "</td></tr>";
    }
    document.getElementById("table").innerHTML = row;
}

function printEven() {
    let range = parseInt(document.getElementById("range").value);
    let evenNumbers = "";
    for (let i = 1; i <= range; i++) {
        if (i % 2 == 0) {
            evenNumbers = evenNumbers + i + "<br>";
        }
    }
    document.getElementById("numbersList").innerHTML = evenNumbers;
}

document.getElementById("today").innerHTML = new Date();

let day = new Date().getDay();
let dayName;

switch (day) {
    case 0:
        dayName = "Sunday";
        break;
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    case 3:
        dayName = "Wednesday";
        break;
    case 4:
        dayName = "Thursday";
        break;
    case 5:
        dayName = "Friday";
        break;
    case 6:
        dayName = "Saturday";
        break;
}

document.getElementById("name").innerHTML = dayName;


function addition() {
    let number1 = parseInt(document.getElementById("number1").value);
    let number2 = parseInt(document.getElementById("number1").value);

    let result = number1 + number2;

    document.getElementById("result").innerHTML = "Addition is :: " + result;
}

function changeText() {
    let element = document.getElementById("message");
    console.log(element);

    let htmlPart = element.innerHTML;
    console.log(htmlPart);

    element.innerHTML = "Hello World From JavaSript";

    console.log("Page changed!");
}