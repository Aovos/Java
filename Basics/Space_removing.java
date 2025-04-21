package Basics;

public class Space_removing {

        public static void main(String[] args) {

            String name = "   Ann a   ";

            // .trim() removes all spaces before and after
            System.out.println(name.trim());

            // removing all spaces including in between
            System.out.println(name.replaceAll("\\s+", ""));
        }

}