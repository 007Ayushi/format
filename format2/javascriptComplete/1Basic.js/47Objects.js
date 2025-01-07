//Object.getOwnPropertyDescriptor(Math)//this method tells about the hidden property of data      

// console.log(Math.PI);
// Math.PI=5
// console.log(Math.PI)//can't be changeable..

const descripter=Object.getOwnPropertyDescriptor(Math,"PI")
console.log(descripter);

// output:-{
//     value: 3.141592653589793,
//     writable: false,
//     enumerable: false,
//     configurable: false
//   }

//const mynewObject=Object.create(null) 2nd way to create object

const student={
    name:"ayushi",
    roll:1,
    isAvailable:true,

    orderchai:function(){
        console.log("code phat gya hai");
        
    }
}
console.log(student);
// {
//     name: 'ayushi',
//     roll: 1,
//     isAvailable: true,
//     orderchai: [Function: orderchai]
//   }

console.log(Object.getOwnPropertyDescriptor(student));//undefined

console.log(Object.getOwnPropertyDescriptor(student,"name"));//name means which property u want to see in student object

// output:{
//     value: 'ayushi',
//     writable: true,
//     enumerable: true,
//     configurable: true
//   }

//yha we are changing name property in student object
Object.defineProperty(student,'name',{
    writable: false,
    enumerable:false
})
// console.log(Object.getOwnPropertyDescriptor(student,"name"));

// output::{
//     value: 'ayushi',
//     writable: false,
//     enumerable: false,
//     configurable: true
//   }

// for (let [key,value] of student) {
//     console.log(`${key}; ${value}`);   
// }//TypeError: student is not iterable


// for (let [key,value] of Object.entries(student)) {
//         console.log(`${key}; ${value}`);   
//     }

// roll; 1
// isAvailable; true
// orderchai; function(){
//         console.log("code phat gya hai");
        
//     }




//when a function is also included in the object then we need only key value pairs but without if statement the code is displaying the whole functons.
for (let [key,value] of Object.entries(student)) {
    if(typeof value !== 'function'){
      //  console.log(`${key}; ${value}`);
    }      
}

//output:- roll; 1
// isAvailable; true

// const b=12338748002n;
// console.log(typeof b);//bigint




