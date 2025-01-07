let a=10
const b=20
var c=30
console.log(a);
console.log(b);
console.log(c);

{
let l=10
const co=20
var c=30
}
//console.log(l);
//console.log(co);
console.log(c);


//conclusion:let and const are block scoped and var is global scope(it means we can invoke it from anywhere..)

//22.scope level and mini hoisting in js
// function one(){
//     const username="hitesh"
//     function two(){
//         const website="youtube"
//         console.log(username);
//     }
//     console.log(website)//we can't invoke child variable through parent method
//     two()//but we can parent variable using child methods.
// }
// one()//output:hitesh

if(true){
    const username="ayushi"
    if(username === "ayushi"){
        const website=" youtube"
        console.log(username+website);
        console.log(website);
    }
    // console.log(website);//it is not inoked here.
    
}

//interesting case and a good concept too:hoisting 
console.log(addone(5));//it is accessible 

function addone(num){
   return num+1
}

//addTwo(5)//it is not accessible before declaration
const addTwo=function(num){//addTwo is sometimes called expression
    return num+2
}


//23.THIS and ARROW FUNCTION:Introduced in ES6(2015)
//this is used to invoke/refer current contexts
const user={
    username:"ayushi",
    price:399,
    welcomemsg:function(){
        console.log(`${this.username},wlcm to the website`);
        console.log(this);
        
    }
}
//user.welcomemsg()//ayushi,wlcm to the website
//{ username: 'ayushi', price: 399, welcomemsg: [Function: welcomemsg] }
user.username="sam"
user.welcomemsg()
// console.log(this);//this will give {},it comes in node environment
//and this is referring to empty object,no context in global scope.
//nd the objects inside browser are window objects

//the engine which executes the js codes which found only in browser and 
//now the browser are standalone that we called as node,dino today
//nd the objects inside browser are window objects


// function chai(){
//   let username="hitesh"
//     console.log(this.username);//this is not usable in function in this way
// }
// chai() //output is undefined

// const chai=function(){
//     let username="ayushi"
//     console.log(this.username);
    
// }
// chai()//output:undefined

//ARROW FUNCTIONS
const chai=()=>{
    let username="ayushi"
    console.log(this.username);   
}
//chai()//undefined

//BASIC SYNTAX OF ARROW FUNCTIONS
// const addTwo1=(num1,num2)=>{
//     return num1+num2
// }
// console.log(addTwo1(3,4));

//IMPLICIT RETURN:means statement is of one line and the function is returing this value
// const addTwo1=(num1,num2)=>num1+num2
// console.log(addTwo1(10,10));//20

const addTwo1=(num1,num2)=>(num1+num2)
console.log(addTwo1(10,10));//20
//if we use parenthesis in the return statement without writing return it will invoke like after arrow function: const addTwo1=(num1,num2)=>(num1+num2)

//explicit return means where we have to write return statement.

const addTwo3=(num1,num2)=>({username:"ayushi"})//here the thing wrapped inside curly barces is object.
console.log(addTwo3(1,2));

// const myArr=[1,2,3,4,5]
// myArr.forEach()






