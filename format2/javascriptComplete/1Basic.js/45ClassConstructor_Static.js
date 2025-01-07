//Class Constructor and Static

//INTRODUCED IN ES6
//constructor is called when we create a object by this keyword..
// class user{  //class is a keyword
//     constructor(username,email,password){//constructor
//         this.username=username;
//         this.email=email;
//         this.password=password;
//     }

//     encryptPassword(){//methods
//         return `${this.password}abc`
//     }
//     changeusername(){
//         return `${this.username.toUpperCase()}`
//     }
// }
// const ayu=new user("ayushi","ayushi@ai",12);
// console.log(ayu.encryptPassword());
// console.log(ayu.changeusername());


//behind the scene

function user(username,email,password){
    this.username=username;
    this.email=email;
    this.password=password;

}
user.prototype.encryptPassword=function(){
    return `${this.password}abc`
}
const tea=new user("tea","411ayu@ai",12);
//console.log(tea.encryptPassword());

//inheritance
class user1{
    constructor(username){
        this.username=username
    }
    logMe(){
        console.log(`username is ${this.username}`);
        
    }
}

class Teacher extends user1{
    constructor(username,email,password){
        //this.username=username;// Must call super constructor in derived class before accessing 'this' or returning from derived constructor
        super(username);//it will take user1 class username refernce
        this.email=email;
        this.password=password;
    }
    addCourse(){
        console.log(`a new course was added by ${this.username}`);    
    }

}
const chai=new Teacher("shi","411@ai",19);
//chai.addCourse()
const ayushi=new user1("ayushi gupta")
//ayushi.logMe()
//console.log(chai === ayushi);//false
//console.log(chai instanceof Teacher);//true

//Static properties
class user2{
    constructor(username){
        this.username=username
    }
    logMe(){
        console.log(`username:${this.username}`);
        
    }
    static createId(){ //to prevent access of createId from every element
        return `123`
    }
}
const ayushigupta=new user2("ayushi")
//console.log(ayushigupta.createId());

class student extends user2{
    constructor(username,email){
        super(username);
        this.email=email;
    }
   
}
const iphone=new student("apple","i@phone.com");
console.log(iphone.logMe());
//console.log(iphone.createId());//TypeError: iphone.createId is not a function





