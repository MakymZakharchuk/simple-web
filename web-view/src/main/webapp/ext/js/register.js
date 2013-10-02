var ValidationStatus = {
    OK: 'glyphicon glyphicon-check',
    BAN: 'glyphicon glyphicon-ban-circle',
    UNDEFINED: 'glyphicon glyphicon-asterisk'
};

var PasswordFields = function () {
    var passwordField1 = document.getElementsByName('password1');
    var passwordField2 = document.getElementsByName('password2')


    this.isValidPassword = function () {
        var pass1 = $(passwordField1).val();
        var pass2 = $(passwordField2).val();

        var alert1 = document.getElementById('pass1Status');
        var alert2 = document.getElementById('pass2Status');

        if (pass1.length > 2 && pass1 == pass2) {
            alert1.className = ValidationStatus.OK;
            alert2.className = ValidationStatus.OK;
            return true;
        }

        alert1.className = ValidationStatus.BAN;
        alert2.className = ValidationStatus.BAN;
        if (pass1.length == '') {
            alert1.className = ValidationStatus.UNDEFINED;
        }
        if (pass2.length == '') {
            alert2.className = ValidationStatus.UNDEFINED;
        }
        return false;
    };

};

var UserName = function () {
    var username = document.getElementsByName('username');
    this.isValidUserName = function () {
        var alert = document.getElementById('uNameStatus');
        var usernameVal = $(username).val();
        if (usernameVal.length > 3) {
            alert.className = ValidationStatus.OK;
            return true;
        }
        if (usernameVal.length == '') {
            alert.className = ValidationStatus.UNDEFINED;
            return false;
        }
        alert.className = ValidationStatus.BAN;
        return false;
    }
};

var passwordFields = new PasswordFields();
var userName = new UserName();


function fireChanged() {
    var validPass = passwordFields.isValidPassword();
    var validUserName = userName.isValidUserName();
    if (validPass && validUserName) {
        enableButtonRegister();
    } else {
        disableButtonRegister();
    }
}

function enableButtonRegister() {
    var buttonRegister = document.getElementById('register');
    buttonRegister.removeAttribute('disabled');
}

function disableButtonRegister() {
    var buttonRegister = document.getElementById('register');
    buttonRegister.setAttribute('disabled', 'true');
}


function removeValidation() {
    document.getElementById('pass1Status').className = ValidationStatus.UNDEFINED;
    document.getElementById('pass2Status').className = ValidationStatus.UNDEFINED;
    document.getElementById('uNameStatus').className = ValidationStatus.UNDEFINED;
    disableButtonRegister();
}
