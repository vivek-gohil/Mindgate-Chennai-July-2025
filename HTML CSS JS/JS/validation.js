console.log("File is linked!!");

function validateDetails() {
    console.log("validationDetails() start");

    document.getElementById("errorname").innerHTML = "";
    document.getElementById("errorage").innerHTML = "";
    document.getElementById("erroremail").innerHTML = "";
    document.getElementById("errorcountry").innerHTML = "";

    var flag = true;

    let employeeDetailsForm = document.emloyeedetailsform;

    if (employeeDetailsForm.name.value == "") {
        document.getElementById("errorname").innerHTML = "Invalid Name";
        //employeeDetailsForm.name.focus();
        flag = false;
    }

    if (employeeDetailsForm.age.value == "" || isNaN(parseInt(employeeDetailsForm.age.value)) || employeeDetailsForm.age.value < 18) {
        document.getElementById("errorage").innerHTML = "Invalid Age";
        // employeeDetailsForm.age.focus();
        flag = false;
    }

    if (employeeDetailsForm.email.value == "") {
        document.getElementById("erroremail").innerHTML = "Email cannot be blank";
        flag = false;
    }

    if (employeeDetailsForm.country.value == "-") {
        document.getElementById("errorcountry").innerHTML = "Select Country";
        flag = false;
    }

    return flag;
}