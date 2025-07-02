public class removeDuplicate {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean[] map){
        // Base case: reached end of string
if (idx == str.length()) {
    System.out.println(newStr);
    return;
}

// Step
char currChar = str.charAt(idx);
if (map[currChar - 'a'] == true) {
    // Character already seen, skip it
    removeDuplicates(str, idx + 1, newStr, map);
} else {
    // First time seeing this character
    map[currChar - 'a'] = true;
    removeDuplicates(str, idx + 1, newStr.append(currChar), map);
}

    }

    public static void main(String args[]){
       String str = "appnnacollege";
        // System.out.println(removeDuplicates(str, 0, null, null));
        removeDuplicates(str, 0,new StringBuilder (""), new boolean[26]);
    }

}
