//Toggle Navbar
const menu = document.querySelector(".menu-list");
const menuBtn = document.querySelector(".menu-btn");
const cancelBtn = document.querySelector(".cancel-btn");

menuBtn.onclick = ()=>{
    menu.classList.add("active");
    menuBtn.classList.add("hide");
};
cancelBtn.onclick = ()=>{
    menu.classList.remove("active");
    menuBtn.classList.remove("hide");
};

//Sticky Navbar
window.onscroll = function(){myFunction()};
var navbar_header = document.querySelector(".navbar");
var stk = navbar_header.offsetTop;

function myFunction(){
    if(window.pageYOffset > stk){
        navbar_header.classList.add("sticky");
    }
    else{
        navbar_header.classList.remove("sticky");
    }
}

//Answer show
var input2 = document.querySelector(".pswrd2");
var show2 = document.querySelector(".show2");

show2.addEventListener("click", active2);
function active2(){
    if(input2.type === "password"){
        input2.type = "text";
        show2.style.color = "#1da1f2";
        show2.textContent = "HIDE";
    }else{
        input2.type = "password";
        show2.style.color = "#111";
        show2.textContent = "SHOW";
    }
}

// secure question
const select2 = document.querySelector(".select");
const options_list2 = document.querySelector(".options-list2");
const options2 = document.querySelectorAll(".option");

select2.addEventListener("click", () => {
    options_list2.classList.toggle("active");
    select2.querySelector(".chevron-down").classList.toggle("up");
    select2.querySelector(".chevron-up").classList.toggle("down");
});
options2.forEach((option) => {
    option.addEventListener("click", () => {
        options2.forEach((option) => {option.classList.remove('selected')});
        select2.querySelector("span").innerHTML = option.innerHTML;
        option.classList.add("selected");
        options_list2.classList.toggle("active");
        select2.querySelector(".chevron-down").classList.toggle("up");
        select2.querySelector(".chevron-up").classList.toggle("down");
    });
});