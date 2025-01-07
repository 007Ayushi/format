//ARRAYS IN JAVASCRIPT
//arrays is an object nd it is resizable and can be made of mixed datatypes
const myArr=[0,1,2,3,4,5,true,"ayushi"];
//console.log(myArr[0]);

//imp. for interview  javascript array-copy operations create shallow copies
//All standard built-in copy operations with any javascript objects create shallow copies rather than deep copies.

//shallow copies (heap): of an object is a copy whose properties share the same refrence (point to same underlying values) as those of source object from which the copy was made.
//deep copy (stack): that dont share the same reference

const myHeros=["ayushi","gupta"]
const myArr2=new Array(10,20,30);
//console.log(myArr2[1]);

//Array methods
myArr.push(6);//adds element at end
//console.log(myArr);//[ 0, 1, 2, 3, 4, 5, true, 'ayushi', 6 ]
myArr.pop();//removes the last element
//console.log(myArr);//[ 0, 1, 2, 3, 4, 5, true, 'ayushi' ]
myArr.unshift(100);//adds element at the starting of the array
//console.log(myArr);//[ 100, 0, 1, 2, 3, 4, 5, true, 'ayushi' ]
myArr.shift();//dlts the first element of the array
//console.log(myArr);//[ 0, 1, 2, 3, 4, 5, true, 'ayushi' ]

// console.log(myArr.includes(1));//true
// console.log(myArr.indexOf(-1));//-1

const newArr=myArr.join()
//console.log(myArr)//[ 0, 1, 2, 3, 4, 5, true, 'ayushi' ]
//console.log(typeof myArr)//object
//console.log(newArr);//0,1,2,3,4,5,true,ayushi
//console.log(typeof newArr);//string


//slice and splice

//INTERVIEW QUESTIONS : DIFF B/W SLICE AND SPLICE
//console.log("A",myArr)//A [ 0, 1, 2, 3, 4, 5, true, 'ayushi' ]
const myn1=myArr.slice(1,3);
//console.log(myn1);//[ 1, 2 ]

//console.log("B",myArr);//B [ 0, 1, 2, 3, 4, 5, true, 'ayushi' ]

//const myn2=myArr.splice(1,3)
//console.log("C",myArr);//C [ 0, 4, 5, true, 'ayushi' ]

//console.log(myn2);//[ 1, 2, 3 ]

/*The splice() method of Array instances changes the 
contents of an array by removing or replacing 
existing elements and/or adding new elements in place.

To create a new array with a segment removed and/or replaced 
without mutating the original array, use toSpliced(). To access part of an array 
without modifying it, see slice(). */

/*ARRAY PART 2 15 */
const marvel_heros=["thor","ironman","spiderman"]
const dc_heros=["superman","flash","batsman"]
//marvel_heros.push(dc_heros)
//console.log(marvel_heros);//[ 'thor', 'ironman', 'spiderman', [ 'superman', 'flash', 'batsman' ] ]
//console.log(dc_heros)//[ 'superman', 'flash', 'batsman' ]

//console.log(marvel_heros[3][2]);//batsman

const allheros=marvel_heros.concat(dc_heros)
//console.log(allheros);//[ 'thor', 'ironman', 'spiderman', 'superman', 'flash', 'batsman' ]

const all_heros=[...marvel_heros,...dc_heros] //means individual element get separated.
//console.log(all_heros)//[ 'thor', 'ironman', 'spiderman', 'superman', 'flash', 'batsman' ]

const another_array=[1,2,3,[4,5,6],7,[6,7,[4,5]]];
const real_anotherarr=another_array.flat(Infinity)
//console.log(real_anotherarr)
//  all element got spread out.   [1, 2, 3, 4, 5,
//     6, 7, 6, 7, 4,
//     5
//   ]

//console.log(Array.isArray("ayushi"));//false checking that its an array or not
console.log("hii",Array.isArray([1,2,3]));
console.log(Array.from("ayushi"));//[ 'a', 'y', 'u', 's', 'h', 'i' ]
console.log(Array.from({name:"ayushi"}));// [] interesting case : we have to declare externally keys and values  
console.log(Array.from({ 0: "ayushi", length: 1 ,1:"shyama",length:2})); // ["ayushi"]
let scrore1=100
let scrore2=200
let scrore3=300

console.log(Array.of(scrore1,scrore2,scrore3));//[ 100, 200, 300 ]











