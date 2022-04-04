window.onload = function(){
    alert("A página foi carrega!")
};
document.addEventListener ("click", () => console.log("Ativadin"));

function text(){
    var x = document.getElementsByClassName("cl1");
    x[0].innerHTML = "0oiie";
};

function text1(){
    var y = document.getElementsByClassName("cl1");
    y[1].innerHTML = "Hello";
};

function text2(){
    var w = document.getElementsByClassName("cl2");
    w[0].innerHTML = "Bonjur";
};

function text3(){
    var a = document.getElementsByClassName("cl2");
    a[1].innerHTML = "Hola";
};

function text4 (){
    alert("Aperta ALT + F4 ae irmão! CONFIA...")
};

function ax (nome) {
    alert("Bem vindo(a)! " + nome);
}

const nome = prompt ("Diga-me seu nome:");

ax (nome);