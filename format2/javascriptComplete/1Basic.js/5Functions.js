//19 functions and parameters in javascript
function sayMYname(){
// console.log("A");
// console.log("B");
// console.log("C");
// console.log("D");
}
sayMYname()//function reference

function add(number1,number2){//number1 and number2 are parameters

//console.log(number1+number2);
}
add(10,20);//10 and 20 are arguments

function add(num1,num2){//number1 and number2 are parameters
    // let result=num1+num2
    // return result
    return num1+num2
    console.log("ayushi")
}
const ans=add(100,200);
//console.log(ans);

function logInuserMsg(username){
    return `${username} just logged in`;
}
// console.log(logInuserMsg("ayushi"));//ayushi just logged in
// console.log(logInuserMsg());//undefined just logged in

function loggedIn(username){
    if(username===undefined){
        console.log(`my name is ${username}`);
        return
    }
    return `${username} just logged in`
}
console.log(loggedIn());//my name is undefined //undefined


function loggedIn(username="rohan"){//it means ki minimum value rohan hai ar 
//koi value value aagyegi toh override ho jayegi
    if(username===undefined){//this block will never execute
        console.log(`my name is ${username}`);
        return
    }
    return `${username} just logged in`
}
//console.log(loggedIn())//rohan just logged in
console.log(loggedIn());


//... it works as rest or spread according to the situation in javascript
function calculateCartPrice(val1,val2, ...num1){//...is rest operator here
       return num1
}
console.log(calculateCartPrice(100,200,500,600));//[ 500, 600 100 - val1 and 200 -val2 

const user={
    username:"ayushi",
    price:1000
}

function handleObject(anyObject){
    console.log(`username is ${anyObject.username}and price is
        ${anyObject.price}`);
}
//handleObject(user);
/*
username is ayushiand price is 1000 */

handleObject({
    username:"samm",
    price:400
})
const mynewArr=[200,400,100,600]
function returnSecondValue(getnewArr){
    return getnewArr[1]
}
console.log(returnSecondValue(mynewArr));//400
console.log(returnSecondValue([200,10000,500,1000]))//10000

function addTwoNumber2(number1,number2){
    console.log(number1+number2);
}
const res=addTwoNumber2(10,20);
console.log(res);

function addTwoNumber1(num1,num2){
    let result=num1+num2;
    return result
}
console.log("result",addTwoNumber1(1,1));








