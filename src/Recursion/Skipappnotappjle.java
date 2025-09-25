package Recursion;

public class Skipappnotappjle {

    static String skipappnotapple( String up){
    if (up.isEmpty()){ return "";}
    if( up.startsWith("app") && ! up.startsWith("apple")){
        return skipappnotapple( up.substring(3));
    }
    else {
        return (up.charAt(0) + skipappnotapple(up.substring(1)));
    }
    }

    public static void main(String[] args) {
       String ans = skipappnotapple("bacchhsapphbf");
        System.out.println(ans);

    }
}
