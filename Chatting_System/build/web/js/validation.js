function validation(){
    var letter = /^[A-Za-z\s]*$/;
    var letters = /^[A-Za-z]+$/;
    var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,5})$/;
    var firstname = document.getElementById('firstname');
    var lastname = document.getElementById('lastname');
    var phoneno = document.getElementById('phoneno').value;
    var emailid = document.getElementById('emailid');
    
    if(firstname.value.match(letter)){
        return true;
    }else{
        //alert('first name only character');
        document.getElementById('error').innerHTML = "first name only character";
        document.getElementById('firstname').focus();
    }
    
    if(lastname.value.match(letters)){
        return true;
    }else{
        //alert('last name only character');
        document.getElementById('error2').innerHTML = "last name only character";
        document.getElementById('lastname').focus();
    }
    
    if(phoneno.length<10){
        document.getElementById('error3').innerHTML = "Phone no must be 10 digit";
        document.getElementById('phoneno').focus();
        return false;
    }
    
    if(emailid.value.match(reg)){
        return true;
    }else{
        alert('Enter a valid email id');
        document.getElementById('error4').innerHTML = "Enter a valid email id";
        document.getElementById('emailid').focus();
    }
}
function numbersonly(e){
    var unicode=e.charCode? e.charCode : e.keyCode;
    if (unicode !== 8){
        if (unicode<48||unicode>57)
            return false;
    }
}