//loops or Iterator

//for:variable initialisation,condition check,execute,value increment

// for (let i = 0; i <= 10; i++) {
//     const element = i;
//     if(element ==5){
//         console.log("5 is best number");        
//     }
//     console.log(element);
    
 // }0
// 1
// 2
// 3
// 4
// 5 is best number
// 5
// 6
// 7
// 8
// 9
// 10
//console.log(element);//ReferenceError: element is not defined


// for(let i=0;i<=10;i++){
//     console.log(`outer loop value : ${i}`); 
//     for(let j=1;j<=10;j++){
//       // console.log(`Inner loop value ${j} and inner loop ${i}`);
//         console.log(i +'*' + j+ '='+i*j);
//     }
// }


// let myarr=["flash","batman","superman"]
// console.log(myarr.length);

// for(let index=0;index<myarr.length;index++){
//     const element=myarr[index];
//     console.log(element);   
// }

//break and continue
// for (let index = 0; index <=20; index++) {
//     if(index==5){
//         console.log(`detected 5`);
//         break// to exist from the loop
        
//     }
//     console.log(`value of i is ${index}`); 
// }


//continue

// for (let index = 0; index <=20; index++) {
//     if(index==5){
//         console.log(`detected 5`);
//         continue  
//     }
//     console.log(`value of i is ${index}`); 
// }

// while and do while loop

let index=0
// while( index<=10 ){
//     console.log(`Value of index is ${index}`);
//     index=index+2   
// }

let myarr=['flash',"batsman","superman"]
let arr=0
while(arr<myarr.length){
    console.log(`value is ${myarr[arr]}`);
    arr=arr+1 
}

let score=11
do{
    console.log(`score is ${score}`);
    score+=1;
}while(score<= 10);//score is 11



