package GroupProjects;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"apple", "peach", "mango", "grapes", "lemon", "avocado", "celery", "pomegranate", "watermelon", "melon"};
        dividerLineOfEquals();
        System.out.println("Welcome to EasyShop Store");
        dividerLineOfEquals();
        System.out.println("\nEnter the level of your membership. If you're not a member press 0");
        String membership = sc.next();
        dividerLineOfEquals();
        membershipStatus(membership);
        dividerLineOfEquals();
        System.out.println("\nEnter the name of the item you looking for: ");
        String item = sc.next();
        dividerLineOfEquals();
        isleNumber(item, arr);
        dividerLineOfEquals();
    }
    static void membershipStatus(String lvl){
        if(lvl.equals("0")) {
            System.out.println("Become a member to get your loyalty points");
        }else if(lvl.equals("1")) {
            System.out.println("You get 1 loyalty point(s)");
        }else if(lvl.equals("2")) {
            System.out.println("You get 2 loyalty point(s)");
        }else if(lvl.equals("3")) {
            System.out.println("You get 3 loyalty point(s)");
        }else{
            System.out.println(lvl + " is not a valid membership level");
        }
    }
    static void isleNumber(String item, String[] arr) {
        int isle;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(item)) {
                isle = i + 1;
                System.out.println(item + " is on isle number " + isle);
            }else{
                count++;
            }
            if(count == arr.length){
                System.out.println("We currently don't have " + item + "(s)" + " in stock");
            }
        }
    }
    static void dividerLineOfEquals(){
        System.out.println("===========================================================");
    }
}

