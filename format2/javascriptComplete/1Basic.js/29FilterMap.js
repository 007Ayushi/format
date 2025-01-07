const coding=["js","ruby","java","python","cpp"]
const values=coding.forEach((item)=>{
    //console.log(item); 
})
//console.log(values);//undefined //forEach loop doesnt return anything

//FILTER FUNCTION
const mynums=[1,2,3,4,5,6,7,8,9,10]
//const newnums=mynums.filter((num)=>num > 4)
//console.log(newnums);


const newnums1=mynums.filter((num)=>{
    return num > 4 // when we open scope then need to write return statement explicitly
})
//console.log(newnums1);

const newnums=[]
mynums.forEach((num)=>{
    if(num > 4){
        newnums.push(num);
    }
})
//console.log(newnums);


const books=[
    {title:'book one',genre:'fiction',publish:2020},
    {title:'book two',genre:'fiction',publish:2022},
    {title:'book three',genre:'non-fiction',publish:2000},
    {title:'book four',genre:'fiction',publish:2023},
    {title:'book five',genre:'non-fiction',publish:2010},
    {title:'book six',genre:'non-fiction',publish:2030},
    {}
]

const userBooks=books.filter((bk)=> bk.genre === 'fiction')
console.log(userBooks);

let userBook=books.filter((bk)=>{return bk.publish>2000})
console.log(userBook);

userBook=books.filter((bk)=>{
    return bk.publish>2000 && bk.genre==="fiction"})
console.log(userBook);

//MAP FUNCTION
const mynum=[1,2,3,4,5,6,7,8,9,10]
//const newnum=mynum.map((num)=>num+10)
//console.log(newnum);

//chaining
const newnum=mynum
            .map((num)=>num*10) 
            .map((num)=>num+1)
            .filter((num)=>num>=40)
console.log(newnum);

//REDUCE FUNCTION 
const sum=[1,2,3,4,5]
const total=sum.reduce(function (acc,crrval){
    console.log(`acc: ${acc} and currval : ${crrval}`);
    
    return acc + crrval
},0)

console.log(total)//output are
// acc: 0 and currval : 1
// acc: 1 and currval : 2
// acc: 3 and currval : 3
// acc: 6 and currval : 4
// acc: 10 and currval : 5
// 15

//we can use this method in shopping cart adding items price

const mytotal=sum.reduce((acc,curr)=>acc+curr,0)
console.log(mytotal);//15

const shoppingCart=[
    {
        itemName:"js course",
        price:2999
    },
    {
        itemName:"py course",
        price:1999
    },
    {
        itemName:"data science course",
        price:12999
    },
    {
        itemName:"web dev course",
        price:15000
    }
]

const ans=shoppingCart.reduce((acc,item)=> acc+item.price,0)
console.log(ans);

