document.addEventListener ("click", () => console.log("Click Detectado"));

function text(){
    var x = document.getElementsByClassName("cl1");
    x[0].innerHTML = "Bem vindo(a)! " + nome;
};

function text1(){
    var y = document.getElementsByClassName("cl1");
    y[1].innerHTML = "Bem vindo(a)! " + nome;

    var w = document.getElementsByClassName("cl2");
    w[0].innerHTML = "Bem vindo(a)! " + nome;

    var a = document.getElementsByClassName("cl2");
    a[1].innerHTML = "Bem vindo(a)! " + nome;
};

function text2(){
    var x = document.getElementsByClassName("cl1");
    x[0].innerHTML = "";
};

function text3(){
    var d = document.getElementsByClassName("cl2");
    d[1] = alert("Bem vindo(a)! " + nome);
};

function text4 (){
    alert("Funcionou")
};

function text5 (){
    alert("A pagina foi carrega!")
};

const nome = prompt ("Diga-me seu nome:");