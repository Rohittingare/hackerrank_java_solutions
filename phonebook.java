//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class phonebook{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonebook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
           
            phonebook.put(name,phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
           
            if(phonebook.get(s)!= null){
                System.out.println(s+"="+phonebook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
