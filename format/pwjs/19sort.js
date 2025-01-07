let arr=[1,-9,-2,7]; 
console.log(arr);

arr=arr.sort((a,b)=>Math.abs(a)-Math.abs(b));//[ 1, -2, 7, -9 ]
console.log(arr);//[ -2, -9, 1, 7 ] glt sorting deta hai

//creating custom sorting means descending order
//by using comparator
arr=arr.sort(function(a,b){
    return a-b;
});
console.log(arr);//[ -9, -2, 1, 7 ]

//2nd way
arr=arr.sort((a,b)=>b-a);
console.log(arr);
