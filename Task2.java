package Homework7Class12;

public class Task2 {
    public static void main(String[] args) {
        /*
         Create a String and print it in reverse order (Sunday → yadnuS).
         */
     //one example
        String str = "Sunday";
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1 = input1.reverse();
        System.out.println(input1);

        // second example
        for (int i =str.length()-1; i >= 0; i--){
            System.out.print(str.charAt(i));
        }
    }
}

