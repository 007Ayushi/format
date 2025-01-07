import java.util.HashMap;
import java.util.Map;

class code{

    public static void hashMapMethods(){
   //syntax key value both are called as entry.
     HashMap<String,Integer> mp=new HashMap<>();


      //Adding Elements.
      mp.put("ayushi",7);
       mp.put("yash",4);
       mp.put("aditi",90);


       //Getting value of a key from the HashMap.
       System.out.println(mp.get("ayushi"));//7
       System.out.println(mp.get("aastha"));//null


       //Changing/updating value of a key in the HashMap
       mp.put("ayushi",43);
       System.out.println(mp.get("ayushi"));//43
       
       /*
        put has two behaviour ,if key doesnt exists then behaves linke Insertion.
        put has another behaviour updatation,if key exists already.
        */
        

        //Removing a pair from the HashMap
          mp.remove("ayushi");
          mp.remove("aditi");
          System.out.println(mp);//{yash=4}
          System.out.println(mp.remove("ajay"));//null

          /*Remove Method,if key exists then it will remove the entr
           * otherwise it returns null if key does'nt exists.
           */

           //checking if a key exists in the HashMap or not
           System.out.println(mp.containsKey("yash"));//true
           System.out.println(mp.containsKey("ayushi"));//false

           //Adding a new entry only if the new key doen't exixsts already
           mp.putIfAbsent("yashika", 80);//will enter
           mp.putIfAbsent("yash", 001);//will not enter
           System.out.println(mp);//{yash=4, yashika=80}

           //Get all keys in the HashMap
           System.out.println(mp.keySet());//[yash, yashika]

           //get all the values in the hashmap
            System.out.println(mp.values());//[4, 80]

          //Get all entries in the HashMap
           System.out.println(mp.entrySet());//[yash=4, yashika=80]


           //Traversing all entries of HashMap -mutiple methods
           for(String key:mp.keySet()){
            System.out.printf("Age of %s is %d\n",key,mp.get(key));// yash   yashika
            System.out.println();

            //2nd way
            for(Map.Entry<String,Integer> e:mp.entrySet()){
               System.out.printf("Age of %s is %d",e.getKey(),e.getValue());
            }

            // for(var e:mp.entrySet()){
            //   System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
            // }
          
           }


    }
    public static void main(String []args){
          hashMapMethods();
    }

}