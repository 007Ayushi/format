arr=[1,2,3,4,5]
console.log(arr);//[ 1, 2, 3, 4, 5 ]
arr.push(10);
arr.pop();//removes last element
arr.push(90);//add the element from last
arr.unshift(100);//add at the first
console.log(arr);
arr.shift();//removes first element
console.log(arr);

n=arr.length;
console.log(n);
for(let i=1;i<n;i++){
    console.log(arr[i]);   
}
console.log("2nd element of arr is "+arr[2]);

let brr=[2,8,3,3]
brr.push(10);
console.log(brr);//[ 2, 8, 3, 3, 10 ]
brr[1]=20;
console.log(brr);//[ 2, 20, 3, 3, 10 ]

brr=100
console.log(brr);//100

const drr=[2,8,3,3]
drr.push(10);
console.log(drr);//2 8 3 3 10
drr[1]=20;
console.log("ELEMENTS ARE "+drr);//2 20 3 3 10

// drr=100
// console.log(100);//error TypeError: Assignment to constant variable.

crr=["ayushi",7,"kathalmore",true,[10,20,30]]
//console.log(crr);
// for(let i=0;i<crr.length;i++){
//     console.log(i,crr[i]);  
// }
//ForOf Loop
// for(const ele of crr){
// console.log(ele);
// }

crr1=[[1,2,3],[4,5,6,10]]
//console.log(crr1);

brr1=[10,20,30,40,50]
console.log(brr1);
for(let i=0;i<brr1.length;i++){
    brr1[i]*=2;
}
console.log(brr1);

for(let ele of brr1){
    ele*=2;//it creates a variable and make copy of each and every variable
    console.log(ele);  
}

console.log(brr1);
//forOf loop:-we can't print its index..

//ForEach Loop

brr2=[10,20,30]
console.log(brr2);
brr2.forEach((ele,i,brr2)=>{
    ele*=2;
    console.log(i);
    console.log(ele);//it also makes copy of every element
});
console.log(brr2);// It prints the index but forOf not.












