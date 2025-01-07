//CONTROL FLOW IN 1 SHOT
//if

// if(true){

// }
// if(false){the code will never execute if false will be put

// }


//comparison operator:<,>,<=,>=,==,!=,===(checks both type and values),!==
const isUserloggedIn=true;
const temperature=41
// if(temperature === 40){
//     console.log("less than 50");  
// }
// else {console.log("temperature is greater than 50");}

// if( 2 === "2"){
//    console.log("executed"); 
// }

// if(2!=3){
//     console.log("executed");   
// }

// const score=200
// if(score > 100){
//    let power="fly"
//     console.log(`user power: ${power}`);
    
// }
// console.log(`user power: ${power}`);//undefined

//short-hand notation,so immature code,not recommendable code
 const balance=1000
// if(balance > 500)console.log("test"),console.log("test2");


// //Nesting
// if(balance < 500){
//     console.log("less than 500");   
// }else if(balance < 750){
//     console.log("less than 750"); 
// }else if(balance <900){
//     console.log("less than 750");  
// }else{
//     console.log("less than 1000");
    
// }

const userLoggedIn=true
const debitCard=true
const loggedInFromGoogle=false
const loggedInFromEmail=true

// if(userLoggedIn && debitCard && 2==2){
//     console.log("allow to buy course"); 
// }
// if(loggedInFromGoogle || loggedInFromEmail){
//     console.log("user logged in");   
// }

//switch
// switch(key){
//     case value:
     
//     break;

//     default:
//         break;
// } 


//short cut button: shift+ alt + down arrow to copy and paste directly
//if we dont write break statement in swich then all the statement inside switch will execute along with default
// const month=3
// switch(month){
//     case 1:
//         console.log("jan");  
//         break;
//     case 2:
//         console.log("feb");  
//         break;
//     case 3:
//         console.log("march");  
        
//     case 4:
//         console.log("april");  
//          break;  
//      default:
//         console.log("default case match");
//         break;    
// }

// const mon="jan"
// switch(mon){
//     case "jan":
//         console.log("jan");
//         break;
//     case "feb":
//         console.log("feb");
//         break;
//     default:
//         console.log("no");      
// }

//truthy and falsy
 const userEmail="ayushi@.ai"
// if(userEmail){
//     console.log("got user email");  
// }else{
//     console.log("dont have email")
// }

// notes:
//     falsey values:false,0,-0,BigInt 0n,"",null,undefined,NaN
//     truthy values:"0",'false'," ",[],{},function(){}

if(userEmail.length === 0){
    console.log("array is empty")
}
const emptyObj={}
//It will give the array of keys :Object.keys()
if(Object.keys(emptyObj).length === 0){
    console.log("Object is empty");  
}

//false == 0  true,false == '', 0=='' : all gives true

//Nullish Coalescing Operator (??): null undefined for backened

// let val1;
// //val1=5 ?? 10 //5 ans
// val1=null ?? 10//10 //checks the safety for null to handle the situation

// val1=undefined ?? 15 //15

// val1=null ?? 10 ?? 15 //10
// console.log(val1);


//Terniary Operator

//condition ? true : false;

const iceTeaPrice=100
iceTeaPrice <=80 ? console.log("less than 80"): console.log("more than 80");



