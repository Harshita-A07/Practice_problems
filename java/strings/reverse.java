package strings;

public class reverse {
    public static void main(String[] args) {
       System.out.println(reverse("hello world")); 
    }
    public static String reverse(String s){
        String str = s.trim();
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        return sb.toString().trim();
    }
}
