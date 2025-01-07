// //map basically agar mujhe ek array bnanana hai usise
// //related with some specific changes

let err=[1,6,-3,-8];
//console.log(err);
let brr=[];
for(const ele of err){
    brr.push(ele*2);
}
//console.log(brr);

// for(const ele of arr){
//     brr.push(Math.abs(ele));
// }
// //console.log(brr);

function twice(ele){
    return 2*ele;
}
let orr=err.map(twice);
//console.log(orr);

function square(ele){
    return ele*ele;
}



let drr2=err.map(square);
console.log(drr2);

let add1=err.map(function (ele){
    return ele+10;
});
console.log("add1 is ",add1);//[ 11, 16, 7, 2 ]

let add=err.map((ele)=>{
    return ele+20;
});
console.log(add);

err=err.map(ele =>ele*2);
console.log(err);


let arr=[10,20,30];
function fun(ele){
    return ele*10;
}
//1st Method
let crr=arr.map(fun);
console.log(crr);

//2nd Method
let drr1=arr.map(function fun(ele){
    return ele/10;
});
console.log(drr1);

//3rd method
let grr=arr.map((ele)=>{
    return ele*100;
});
console.log(grr);

//4th method
let frr=arr.map(ele=>ele*20);
console.log(frr);


