let s="  ayushi gupta  ";
console.log(s.toUpperCase());
console.log(s.toLowerCase());
s.toUpperCase();//ye kuch ni krega
let s2=s.toUpperCase();
console.log(s,s2);//ayushi gupta AYUSHI GUPTA

console.log(s,s.length);// ayushi gupta   16
let s1=s.trim();
console.log(s1,s1.length);//ayushi gupta 12

console.log(s1.lastIndexOf('a'));
console.log(s1.charAt(2));
console.log(s1[2]);
console.log(s1.slice(2));//ushi gupta substring from index i
console.log("slicing ",s.slice(2,6)); //substring from index i to j-1//ayus

let s4="ayus2hi is a student at amity Ranchi"
console.log(s4)
let ans=s4.split(' ');//splits on the basis of space ayus2hi
for(const ele of ans){
    console.log(ele);
}
let ans1="a,yu,shi,gu,pt,aa"
let ans2=ans1.split(',')
for(const ele of ans2){
    console.log("splits ",ele);
}

// splits  a
// splits  yu
// splits  shi
// splits  gu
// splits  pt
// splits  aa
