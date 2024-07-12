public class Main {
    public static void main(String[] args) {
        System.out.println("Questions covered");
        System.out.println("1. Check whether the string is palindrome or not");
        System.out.println("2. Write a program to Find the second max int in a array");

        System.out.println("1. Result : " + StringPalindrome.isStringPalindrome("racecar"));
        System.out.println("2. Result : " + FindSecondLargest.findSecondLargest(new int[]{1,2,3,10,24}));
    }
}