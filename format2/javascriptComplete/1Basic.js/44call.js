function SetUsername(username){
    //complex DB calls
    this.username=username//this will used createUser()this refernce 
    console.log("called");   
}
function createUser(username,email,password){
    //SetUsername(username)//it is not calling,we are only giving refernces not calling the explicit function
     //SetUsername.call(username)//we have to hold refernce bcoz in exceution context callMe() ht ja rha hai
     SetUsername.call(this,username)//hr ek function ka apna this hota hai,toh hm yha wala this  ka reference de rhe hai upar wale function ko
     this.email=email
    this.password=password
}

const chai=new createUser("chai","chai@ai","123")
console.log(chai);
