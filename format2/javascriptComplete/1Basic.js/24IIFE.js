//IIFE:Immediately Invoked Function Expression
//immediately execute and some variable are declared inside global scope and many of the variable use them 
//to avoid this global pollute we use this 


(
    function chai(){
        //nammed IIFE
        console.log('DB CONNECTED');   
    })();

//when we pblm sometimes due to global scope so to avoid or prevent global scope pollution thats why we use iife.
//to stop execution use semicolon in iife
( (name)=>{
    //UNNAMED IIFE
        console.log(`db connected ${name}`);
    })('ayushi')

//how does javascript execute code + call stack
//javascript execution context
//js is single threaded and it uses process ;ss lgao


