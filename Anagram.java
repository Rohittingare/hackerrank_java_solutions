import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        char[] str = a1.toCharArray();
        char[] str2 = b1.toCharArray();
        
        int c1 = 0;
        int c2 = 0;
        char[] temp = str;
        for(char i : temp){
            c1 =0;
            c2 =0;
            for(char j : str){
                if(i==j){
                    c1++;
                }
            }
            for(char j : str2){
                if(i==j){
                    c2++;
                }
            }
            if(c1!=c2){
                return false;
                
            }
        }
        return true;
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
