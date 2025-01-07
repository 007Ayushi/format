//Promise is basically a object and it is introduced in ES6
//Earlier bluebird and Q libraries:when promises were not there.
//through we use fetch api's catch() finally ye sb...
//now node js directly gives the functionality

//Promise object represents the eventual completion or failure of an asynchronous operation and its resulting value.
// IT HAS 3 states: pending,fulfilled,rejected

//it is promise consume: we have to create first promise
//fetch('https://something.com').then().catch().finally()

//promise has 2 parts : create then consume

//creating promise
const promiseOne=new Promise(function(resolve,reject){
    //Do an async task
    //DB calls,cryptography,networking
    setTimeout(function(){
        console.log('Async task is complete'); 
        resolve()   //it connects the promise with then() 
    },1000)
})
//promise returns here
promiseOne.then(function(){
    console.log("promise consumed");  
})

//output::
// Async task is complete
// promise consumed

//2nd way to create promise
new Promise(function(resolve,reject){
    setTimeout(function(){
        console.log("Async task 2");
        resolve()      
    },1000)
}).then(function(){
    console.log("async 2 resolved");
    
})


//3rd promise
const promiseThree=new Promise(function(resolve,reject){
    setTimeout(function(){
    resolve({username:"ayushi",email:"411@ayu.ai"})
    },1000)
})

promiseThree.then(function(user){
    console.log(user);  //here it shows that data is flowed from resolve() 
})

//4th promise
const promiseFour=new Promise(function(resolve,reject){
    setTimeout(function(){
        let error=false
        if(!error){
            resolve({username:"ayushi",password:"123"})
        }else{
            reject('error:something went wrong')
        }
    },1000)
})

//chaining
const username=promiseFour.then((user)=>{
    console.log(user);
    return user.username 
}).then((username)=>{
    console.log(username);
    
}).catch(function(error){
    console.log(error);
    
}).finally(function(){//mtlb btado ki program ho gya h
    console.log("the promise is either resolved or rejected");
    
})

//promise 5

const promiseFive=new Promise(function(resolve,reject){
    setTimeout(function(){
        let error=true
        if(!error){
            resolve({language:"javascript",password:"123"})
        }else{
            reject('error js went wrong')
        }
    },1000)
})

//ye thore der wait krta h kaam ke hone ka phir ho jata h toh thik ni toh whi pe error de deta h
async function consumepromiseFive() {
   try{
    const response=await promiseFive
    console.log(response);
   }catch(error){
    console.log(error);
   }   
}
consumepromiseFive()

//error ko handle krna hota h

// async function getAllUsers() {
//   try{
//     const response= await fetch('https://jsonplaceholder.typicode.com/users')
//     const data=await response.json()//time lg rha bhut isliye await kraye
//     console.log(data);   
//   } catch(error){
//     console.log("E:",error);
    
//   }
// }
// getAllUsers()
//string ko json mein convert krenge so we can extract information from it


fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>{
    return response.json()
})
.then((data)=>{
    console.log(data);
    
})
.catch((error)=>console.log(error));
