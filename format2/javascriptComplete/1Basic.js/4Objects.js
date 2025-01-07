//16 OBJECTS IN OBJECT:
//singleton if we create the object as constructor then it will be like singleton
//literal : when we create it as literal then not singleton

//object literal
//Object.create :- like constructor creation

// INTERVIEW QUESTION:DELACRE A SYMBOL AND USE IT IN THE OBJECT
const mySym=Symbol("key1")//delcare a symbol
const JsUser={
    name:"Ayushi",
    [mySym]:"key1",
    age:20,
    "full name":"ayushi gupta",
    email:"guptaayushi@gmai.com",
    location:"bangalore",
    isLoggedIn:false,
    lastlogInDays:["monday","tuesday"]
}
// console.log(JsUser.email)//guptaayushi@gmai.com
// console.log(JsUser["email"]);//guptaayushi@gmai.com
// console.log(JsUser["full name"]);//ayushi gupta
// console.log(JsUser[mySym]);//must to use square bracket in symbol
// //key1
JsUser.email="ayushichatgpt@gmail.com";
//Object.freeze(JsUser)//all the values are fixed now.
/*console.log(JsUser)
{ output is this
    name: 'Ayushi',
    age: 20,
    'full name': 'ayushi gupta',
    email: 'ayushichatgpt@gmail.com',
    location: 'bangalore',
    isLoggedIn: false,
    lastlogInDays: [ 'monday', 'tuesday' ],
    [Symbol(key1)]: 'key1'
  }
*/
JsUser.email="ayushimicrosoft@gmail.com";
//console.log(JsUser)

JsUser.greeting=function(){
    console.log("hello js user");
}
JsUser.greetingTwo=function(){
    console.log(`hello js user,my name is ${this.name}`);//string interpolation
}
console.log(JsUser.greeting());//hello js user //undefined

console.log(JsUser.greetingTwo());//hello js user,my name is Ayushi //undefined


//OBJECTS 17 PART 2
//const tinderUser=new Object()//singelton object h
//console.log(tinderUser)

const tinderUser={}//non singelton object haiii
//console.log(tinderUser);//{}

tinderUser.id="123abc"
tinderUser.name="sammy"
tinderUser.isLoggedIn=false
 console.log(tinderUser);//{ id:'123abc', name:'sammy', isLoggedIn: false }

const regularUser={
    email:"sammy@gmail.com",
    fullname:{
        userfullname:{
        firstname:"ayushi",
        lastname:"gupta"
    }
}
}
// console.log(regularUser.fullname.userfullname.firstname);//ayushi
console.log("122333");
console.log(regularUser.fullname?.userfullname.firstname);//we put a ? bcoz when we have to check if its exists then okk if not then //undefined
                                   
const obj1={1:"a",2:"b"}
const obj2={3:"c",4:"d"}

const obj3={obj1,obj2}
//console.log(obj3)//{ obj1: { '1': 'a', '2': 'b' }, obj2: { '3': 'c', '4': 'd' } }

const obj4=Object.assign({},obj1,obj2)//{}denotes source and obj1 and obj2 are targets
//console.log(obj4);//{ '1': 'a', '2': 'b', '3': 'c', '4': 'd' }
const obj5={...obj1,...obj2}
//console.log(obj5);//{ '1': 'a', '2': 'b', '3': 'c', '4': 'd' }

const users=[
    {
      id:1,
      email:"ayushi@gmail.com"
    },
    {
        id:1,
        email:"shyama@gmail.com"
    },{

    },{},{}
]
//console.log(users[1].email)//shyama@gmail.com

//console.log(tinderUser);
//console.log(Object.keys(tinderUser));//[ 'id', 'name', 'isLoggedIn' ]
//console.log(Object.values(tinderUser));//[ '123abc', 'sammy', false ]
//console.log(Object.entries(tinderUser));//[ [ 'id', '123abc' ], [ 'name', 'sammy' ], [ 'isLoggedIn', false ] ]

//console.log(tinderUser.hasOwnProperty('isLoggedIn'));//true checking that the key is present in the object

//OBJECTS de-structure and JSON API intro

const course={
    coursename:"js in hindi",
    price:"2000",
    courseInstructor:"hitesh sir"
}
//console.log(course.courseInstructor);//hitesh sir

//2ND WAY TO ACCESS THE KEYS IN A OBJECT
const {courseInstructor}=course
//console.log(courseInstructor)//hitesh sir


//3RD WAYS
const {courseInstructor:instructor}=course
//console.log(instructor)//hitesh sir


//de structing 
const navbar=({company})=>{
    console.log(company);
}
navbar({company:"ayushi"})


/*JSON DECLARATION
    {"name":"Ayushi gupta",
    "roll no":"007",
}*/
/* ARRAYS KE ANDAR MANY OBJECTS
   [ {},
    {},
    {}
]*/


const name=new Object({
    name1:'ayushi',
    fun(){
        console.log("hii singelton function")
    }
})
console.log(name.name1);
name.fun();


