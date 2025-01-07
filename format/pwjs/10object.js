//Object is kind of like map/dictionary where we have key-value pairs

var details=["ayushi",7,true,99];
var x=5;
let obj={
    name:"ayushi",
    age:20,
    "nick name":"ayushi gupta",
    'clg name':"amity",
    percentage:99,
    isMarried:false
};

let obj1={
       "key":"value",
       "key2":"value2",
       "key3":"value3"

};
console.log(obj1);//{ key: 'value', key2: 'value2', key3: 'value3' }
console.log(obj);

// {
//   name: 'ayushi',
//   age: 20,
//   'nick name': 'ayushi gupta',
//   'clg name': 'amity',
//   percentage: 99,
//   isMarried: false
// }
obj.name="shyama";
console.log(obj);//{ name: 'ayushi', age: 20, percentage: 99, isMarried: false }
// {
//   name: 'shyama',
//   age: 20,
//   'nick name': 'ayushi gupta',
//   'clg name': 'amity',
//   percentage: 99,
//   isMarried: false
// }
console.log(obj.age);
console.log(obj.name,obj.age,obj["nick name"])//shyama 20 ayushi gupta
console.log(obj['age']);//20
obj['age']=100//100
console.log(obj.age);


console.log("details about u ");
for (const key in obj) {
    if (Object.prototype.hasOwnProperty.call(obj, key)) {
       console.log(key);
       console.log(obj[key]);
       console.log(key,obj[key]);
    }
}

for(const key in obj){//for in loop
  console.log(key,obj[key]);  
}
// name shyama
// age 100
// nick name ayushi gupta
// clg name amity
// percentage 99
// isMarried false

