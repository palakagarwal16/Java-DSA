package STRINGS;

public  class practice {
    public static String  reverse(String s ){
    StringBuilder Sb = new StringBuilder(s);
    return Sb.reverse().toString();
}

    public static void main(String[] args) {
        String ans = reverse("hi how are you ");
        System.out.println(ans);
    }}
