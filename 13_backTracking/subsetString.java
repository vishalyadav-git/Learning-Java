public class subsetString {
    public static void subset(String str, String add, int i){
        // base
        if(i==str.length()){
            System.out.println(add);
            return;
        }
        // if yes
        subset(str, add+str.charAt(i), i+1);
        // if no
        subset(str, add, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "", 0);
    }
}
