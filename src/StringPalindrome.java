public class StringPalindrome {

    public static boolean isStringPalindrome(String name){

        int startIndex = 0;
        int endIndex = name.length()-1;

        while(startIndex<=endIndex){
            if(name.charAt(startIndex) != name.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
