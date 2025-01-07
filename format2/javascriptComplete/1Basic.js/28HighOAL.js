//28: HIGH ORDER ARRAY LOOPS

//ARRAYS SPECIFIC LOOPS
//for of
//["","",""]
//[{},{},{}]//OBJECT NOTATION

const arr=[1,2,3,4,5]
for (const num of arr) {
   // console.log(num);    
}
const greetings="hello world!"
for(const greet of greetings){
    console.log(`Each char is ${greet}`);   
}

//Maps

const map=new Map()
map.set('IN',"India");
map.set('USA',"united states of america")
map.set('Fr',"France")
console.log(map);


//de-structuring in array 
for(const [key,value] of map){
    console.log(key, ':-',value);   
}

//FOR OF LOOP DOESN'T WORK WITH object
// const myObject={
//     'game1':'NFS',
//     'game2':'spiderman'
// }
// for(const [key,value] of myObject){
//     console.log(key, ':-', value);   
// }TypeError: myObject is not iterable

const myObject={
    js:'javascript',
    cpp:'c++',
    rb:"ruby",
    swift:"swift by apple"
}

for(const key in myObject){
    console.log(`${key} shorcut is for ${myObject[key]}`);
    
}
// javascript
// c++
// ruby
// swift by apple

const programming=["js","java","py","cpp"]
for(const key in programming){
    // console.log(key);//keys
    // console.log(programming[key]);//value
       
}//0 1 2 3 : key

// for(const key in map){
//     console.log(key);   
// }//not iterable through for in loop

//object : forin
//arrays: forof or forin


//for each loop
const coding=["js","ruby","java","python","cpp"]
coding.forEach(function (item){
    console.log(item);   
})
coding.forEach((item)=> {
    console.log(item);
    
})


function printMe(item){
    console.log(item);  
}

coding.forEach(printMe)

coding.forEach((item,index,arr) => {
    console.log(item,index,arr);    
})

const myCoding=[
    {
        languageName:"javascript",
        languageFileName:"js"
    },

    {
        languageName:"java",
        languageFileName:"java"
    },
    {
        languageName:"python",
        languageFileName:"py"
    },

]

myCoding.forEach((key,value) => {
    //console.log(key,value);   
});

myCoding.forEach((item)=>{
    //console.log(item.languageFileName);
})
myCoding.forEach((item) =>
{
  console.log(item.languageName);   
})



