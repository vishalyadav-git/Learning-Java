public class subString {
    public static String subStr(String str, int si, int ei){
        String subString = "";
        for(int i=si; i<ei; i++){
            subString += str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str = "VishalYadav";
        System.out.println(subStr(str, 0, 7));
    }
}
