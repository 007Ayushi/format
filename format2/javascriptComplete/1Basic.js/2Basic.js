//stack and heap memory in javascript

//stack(primitive) ,Heap(Non-primitive)

//1st way to declare strings
let myYoutubename="ayushi gupta";
let anothername=myYoutubename;
anothername="chai aur code";
// console.log(anothername);//chai aur code
// console.log(myYoutubename);//ayushi gupta original value mein no change

let user={
     email:"411ahsb@gmail.coom",
     upi:"user1@ybl"
}
let usertwo=user
usertwo.email="shyama@gmail.com"

// console.log(user.email);//shyama@gmail.com original value get changed.
// console.log(usertwo.email);//shyama@gmail.com


/*11.STRINGS IN JAVASCRIPT
denoted by both double and single quotes.*/
const name="ayushi"
const repoCount=100
//console.log(name+repoCount+"value");//ayushi100value

//using back ticks:console.log(`hello my name is ${name} and my repo count is ${repoCount}`);//hello my name is ayushi and my repo count is 100


//2nd way to declare strings
const gameName=new String("ayushi");

//console.log(gameName[0]);//a
//console.log(gameName.__proto__);//{}

//console.log(gameName.length);//6
// console.log(gameName.toLowerCase());//ayushi  original value change ni hoga bcoz stack 
// console.log(gameName.charAt(2));//u
// console.log(gameName.indexOf('s'));3

const newString=gameName.substring(0,4);//cant give negative values,bcoz it wont work in negative values
//console.log(newString);//ayus
const anotherString=gameName.slice(-9,4);
//console.log(anotherString);//ayus

const newString1="  ayushi      ";
//console.log(newString1.trim());//ayushi

const url="https:\\ayushi.com/ayushi%20gupta";
//console.log(url.replace('%20','-'));https:\ayushi.com/ayushi-gupta
//console.log(url.includes('ayushi'));//true
//console.log(url.split('/'))//[ 'https:\\ayushi.com', 'ayushi%20gupta' ]

//12.Number and Maths in Javascript
const marks=500;
//console.log(marks);//500
const balance=new Number(100);
//console.log(balance);//[Number: 100]
// console.log(balance.toString().length);//3
// console.log(balance.toFixed(2));//100.00

// const otherNumber=23.5673
// console.log(otherNumber.toPrecision(3));//23.6 if no. is 123.5673 then 124

const hundreds=100000
//console.log(hundreds.toLocaleString());//100,000
//console.log(hundreds.toLocaleString('en-IN'));//1,00,000

//console.log(Number.MAX_VALUE);1.7976931348623157e+308

// MATHS 
//console.log(Math.abs(-100)); //-ve change into +ve but +ve don't change into -ve
//console.log(Math.round(4.6));//5

// console.log(Math.ceil(4.5));//5
// console.log(Math.floor(4.5));//4
// console.log(Math.sqrt(100));//10
// console.log(Math.max(1,2,43,90));//90
// console.log(Math.random());//value b/w 0 and 1

// console.log((Math.random()*10)+1);// 1 and 9

// notes
const min=10
const max=20
//console.log(Math.floor(Math.random()*(max-min+1))+min)//10 and 20

//13.DATE AND TIME IN DEPTH
//Date objects defines a single moment in a  time in a platform independent format..

let myDate=new Date()
console.log("dates",myDate);//2024-11-03T18:30:49.994Z
console.log(myDate.toString());//Mon Nov 04 2024 00:00:49 GMT+0530 (India Standard Time)
console.log(myDate.toLocaleDateString());//11/4/2024
console.log(myDate.toDateString());//Mon Nov 04 2024
console.log(typeof myDate);//object

let mycreateDate=new Date(2024,11,2)
console.log(mycreateDate.toDateString())//Mon Dec 02 2024

let mycreateDate1=new Date(2023,11,2,12,0)
console.log(mycreateDate1.toLocaleString());//12/2/2023, 12:00:00 PM

let myDate1=new Date("02-12-2024")
console.log(myDate1.toLocaleDateString());//2/12/2024

let myTimeStamp=Date.now()
// console.log(myTimeStamp);//1730614947428

// console.log(mycreateDate.getTime());//1733077800000

//console.log(Math.floor(Date.now()/1000));1730615030

let newDate=new Date();
console.log("new date is ",newDate);// 2024-11-03T18:32:18.464Z
console.log(newDate.getDate());//3
console.log(newDate.getMonth()+1);//11
console.log(newDate.getDay());//0

// getday means : 0 represents Sunday
// 1 represents Monday
// 2 represents Tuesday

console.log(`today the date is ${newDate.getDate()} and the day is ${newDate.getDay()}`);//today the date is 4 and the day is 1

newDate.toLocaleString('default',{
     weekday :"long"
})






















