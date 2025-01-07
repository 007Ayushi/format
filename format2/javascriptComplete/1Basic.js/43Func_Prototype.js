function multiplyBy5(num){
    return num*5
}

multiplyBy5.power=2
console.log(multiplyBy5(5));

console.log(multiplyBy5.power);
console.log(multiplyBy5.prototype);//bydefault kuch context set hote h,toh us prototype ka method ka this hai:{}

// prototype property:
// Functions in JavaScript have a default prototype object, which is used for inheritance in constructor functions.
// Here, multiplyBy5.prototype is an empty object {} by default since multiplyBy5 is not used as a constructor.
function createUser(username,score){
    this.username=username
    this.score=score
}

createUser.prototype.increment=function(){
    this.score++;//this refers to current object
}
createUser.prototype.printMe=function(){
    console.log(`score is ${this.score}`);
    
}
const chai=new createUser("chai",25)
const tea=new createUser("tea",10)

chai.printMe()

//we have injected methods in createUser but without new keyword the functions are not defined.


//PROTOTYPES IN DETAILS:
let myName="ayushi     "
console.log(myName.trueLength);//we have to create a method i.e trueLength

let myHeros=["thor","spiderman"]
let heroPower={
    thor:"hammer",
    spiderman:"sling",
    getSpiderPower:function(){
        console.log(`spidy power is ${this.spiderman}`);
        
    }
}
//bydefault functions of object are called factory functions
Object.prototype.ayushi=function(){
    console.log(`ayushi is present in all objects`);   
}
heroPower.ayushi()//ayushi is present in all objects

myHeros.ayushi()

//we have added a new property in object that is used by all childs likes array,object

Array.prototype.sayAyushi=function(){
    console.log(`ayushi sats hello`);   
}

myHeros.sayAyushi()//ayushi sats hello : this is correct bcoz we have injected new property in array i.e is accessible
//heroPower.sayAyushi()//heroPower.sayAyushi is not a function


//INHERITANCE
const user={
    name:"ayushi",
    email:"ayushi41@ai"
}
const Teacher={
    makeVideo:true,
}
const TeachingSupport={
    isAvailable:false
}

const TASupport={
    makeAssignment:'js Assignment',
    fullTime:true,
    __proto__:TeachingSupport
}
Teacher.__proto__=user//outdated approach

//modern syntax :In JavaScript, every object has an internal link to another object, called its prototype
// Object.setPrototypeOf(obj, prototype)
// obj: The object whose prototype you want to set.
// prototype: The object you want to use as the prototype.
Object.setPrototypeOf(TeachingSupport,Teacher)


let anotherUserName="ayushi    "
String.prototype.trueLength=function(){
  console.log(`${this}`);
    //console.log(`${this.name}`);//undefined
    console.log(`true length is ${this.trim().length}`);//true length is 6 
   
}
anotherUserName.trueLength()
"tiya      ".trueLength()
"jiya         ".trueLength()
