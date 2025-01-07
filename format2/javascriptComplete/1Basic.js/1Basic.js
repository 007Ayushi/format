//console.log("ayushi");


//1.LET VS CONST VS VAR
const accountId=14453;

let accountEmail="ayushi637@gmail.com"
var accountPassword="12345"
accountCity="Ranchi"

//accountId=53 not allowed
accountEmail="ayushi@gmail.com"
accountPassword=2442
accountCity="jaipur"
let accountState;
//console.log(accountId);

/*
prefer not  to use var
bcoz of issue in block scope and functional scope
*/

//console.table([accountId,accountEmail,accountCity,accountState])

var a2;
//console.log(a2); undefined


let a;
//console.log(a); undefined
a="ayushi";


//2. Datatypes and ECMA Standards
"use strict";//treat all js code as newer version

//alert("hello")

//alert(2+3); we are using nodejs, not browser

//console.log(2+3);//5 code must be clean and easaily readable.

//3. DATATYPES 
let name="ayushi"
let age=20
let isLoggedIn=true
let state=null//it means empty h state

//PRIMITIVE DATATYPES
//number => 2 to power 53
//bigInt
//string => ""
//boolean => true/false
//null => standalone value
//undefined => means datatype defined nii hai
//symbol  => unique

//object
//console.log(typeof "ayushi");//string
//console.log(typeof null);//object NULL IS AN OBJECT
//console.log(typeof undefined);//undefined

//4.Datatype conversion confusion
let score=33
//console.log(typeof score);//number
//console.log(typeof(score));//number

//Conversion of string into Number
let score1="34"; // 
let valueInNumber=Number(score1);
//console.log(typeof valueInNumber);//number
//console.log(valueInNumber);//34

/*
CONVERSION INTO NUMBER
 null ->0 undefined->NaN ;true->1;"ayushi"->NaN;"34"->34;false->0
*/

// let isLogged=1
// let booleanislogged=Boolean(isLogged)
// console.log(booleanislogged);//1

/*
1 => true; 0 => false
""=> false; "ayushi"=>true
*/

let someNumber=33
let stringNumber=String(someNumber)
console.log("number converted into string",stringNumber);

//console.log(typeof stringNumber);//string



//7.WHY STRING TO NUMBER CONVERSION IS CONFUSING
// operations

let value=3
let negValue=-value
//console.log(negValue);//-3
//console.log(2+2);//4

let str1="hello"
let str2="ayushi"

let str3=str1+str2
//console.log(str3);//helloayushi

//console.log("1"+2);//12
//console.log(1+"2");//12

//console.log("1"+2+2)//122
//console.log(1+2+"2");32

//console.log(+true);//1
//console.log(+"");//0

let num1,num2,num3
num1,num2,num3=2+2

//console.log([num1,num2,num3])//[ undefined, undefined, 4 ]

let gameCounter=100
gameCounter++;
//console.log(gameCounter)//101


//use  mdn refernce to know more

//8.Comparison of datatypes 
// console.log(2>1);
// console.log(2>=1);
// console.log(2<1);
// console.log(2==1);
// console.log(2!=1);

// console.log("2">1);//true
// console.log("02">1);//true

// console.log(null>0);//false
// console.log(null==0);//false
// console.log(null>=0);//true

//NOTE: The reason is that an equality check ==
// and comparion >< >= <= works differntly.
//comparison convert null to a number treating it as 0
// thats why (3) null>=0 is true and null >0 is false.

//console.log(undefined==0);//false

//strict check === checks value as well as type of a variable
// console.log("2"===2);//false
// console.log("2"==2);//true

/*DataTypes : primitive and Non-primitive(reference type)
categorization based on the how we keep into the memory and how we access it
*/

//primitive type :call by value means copy of a variable is passed
//7 types : String,Number,Boolean,null ,undefined,Symbol(kisi bhi value ko unique bnanen ke liye),BigInt

//Reference type (Non-primitive):Arrays,objects,,Functions

const score2=22;
const score3=22.5

const isLoggediN=false
const outsideTemp=null
let userEmails;
const id =Symbol('123')
const anotherid=Symbol('123')

//console.log(id === anotherid)//false


const bigNumber=452588818152892938n;
//console.log(typeof bigNumber)//bigint

const heros=["ayushi","aditi","arjun"]
console.log(typeof heros)
let myobj={
    name:"ayushi",
    age:20
}
console.log(typeof myobj)//object

const myfunction=function (){
    console.log("ayushi ")
}

console.log(typeof myfunction);// object function h

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/typeof


 















