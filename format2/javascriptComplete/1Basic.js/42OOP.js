//object literal : basic unit of OOPS: properties and methods
const user={
    username:"ayushi",
    loginCount:8,
    signedIn:true,

    getUserDetails:function(){
        //console.log("got user details from database"); 
        //console.log(`username : ${this.username}`); 
        //console.log(this);//this tellsnus about current context
              
    }
}
//console.log(user.username)
//console.log(user.getUserDetails());
//console.log(this);//{} : global context me this ka value

//browser mein this ka global context mein bhut sara defined hai

//constructor 

//const promise=new Promise() //new keyword is constructor function which allows us to create multiple instance with 1 object
//but in promises it needs new instances this must keep separate contexts
//new used to create new contexts and is callled constructor functions

function user1(username,loginCount,isLoggedIn){
    this.username=username; //variable=value
    this.loginCount=loginCount;
    this.isLoggedIn=isLoggedIn

    this.greeting=function(){
        console.log(`welcome ${this.username}`);
        
    }
    return this//it is implicitly defined 

}
const userOne=new user1("ayushi",12,true)
const userTwo=new user1("chai",11,false)
console.log(userOne);//userTwo overrides all the value of userOne when we dont use new keyword while creating instances
//console.log(userTwo);



//contructor function always gives a new instances 
//use of new  keyword creates a empty object(i.e instance)
//constructor function call hota h new keyword ke through jitna argument hai wo inject krte h
//function 


console.log(userOne.constructor);//[Function: user1] constuctor khud ke baare mein hi refernce deta hai user ke baare mein

//instanceof check mdn refernce






