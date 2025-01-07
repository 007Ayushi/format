let arr=[1,2,3,4,5];
console.log(arr);//[ 1, 2, 3, 4, 5 ]

let x=arr.reduce(function(a,b){
    return a-b;
});
console.log(x);//-13