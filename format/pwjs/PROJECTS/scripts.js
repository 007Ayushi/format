// let x=document.querySelector("h2");
// setTimeout(function(){
//     x.style.color="red";
//     x.style.fontFamily="Gill Sans"
//     x.style.fontFamily=130
// },4000);


// let y=document.querySelector("h1");
// y.style.backgroundColor="red";
// setTimeout(function(){
//    y.innerHTML="changed";
// },2000)//executes first


/*
DOM:->console,Element selection,Change HTML and CSS
Event Listeners:->If I click any element
or i hover the element ,or remove the mouse from that element

 */

let x=document.getElementById("ele1");
x.addEventListener("click",function(){
    x.innerHTML="jigglypuff";
    x.style.backgroundColor="yellow";
    x.style.color="red";
})

x.addEventListener("mouseleave",function(){
    x.style.backgroundColor="white";
    x.style.color="black";
})

let y=document.getElementById("ele2");
y.addEventListener("mousemove",function(){
    y.style.color="white";
    y.style.backgroundColor="orange";
})
let z=document.getElementById("ele3");
z.addEventListener("click",function(){
    z.style.backgroundColor="purple";
    z.style.color="white";
})

z.addEventListener("click",function(){
    x.style.backgroundColor="yellow";
    x.style.color="black";
    x.style.fontFamily="italic";
    x.innerHTML="ayushi gupta is here";
})

let g=document.getElementById("ele4");
g.addEventListener("mouseenter",function(){
    g.style.fontFamily="Sans-serif";
    g.style.backgroundColor="pink";
    g.style.color="black";
})

g.addEventListener("mouseleave",function(){
    g.style.backgroundColor="palegreen";
    g.style.color="green";
})