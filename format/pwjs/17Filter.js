//Filter out even elements
function fun(ele){
    if(ele%2!=0){
        return true;
    }
    else return false;
}
let arr=[1,9,2,7,6,2,8];
console.log(arr);

let brr=arr.filter(fun);
console.log(brr);//[ 1, 9, 7 ]

arr=arr.filter((ele)=>{
    if(ele%2!=0){
        return true;
    }
    else return false;
});
console.log("filtered elements are ",arr);

arr=arr.filter((ele)=>{
    // if(ele<5)return true;
    // else return false;
   return  (ele>5)?true:false;
});
console.log(arr);

arr=arr.filter(ele=>(ele>4));
console.log(arr);