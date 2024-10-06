import java.util.Scanner;

import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    //introduction
    System.out.println("Dominic Shriver\nJava 2800\n"+ LocalDateTime.now());
    System.out.println("\nPlease answer \"yes\" or \"no\" to the following questions.");
    //scanner values
    String coffeeAnswer = "";
    String creamAnswer = "";
    String creamTypeAnswer = "";
    String sugarAnswer = "";
    String sugarTypeAnswer = "";
    String baconAnswer = "";
    String baconTypeAnswer = "";
    String baconTypeAnswer2 = "";
    String eggsAnswer = "";
    String eggsTypeAnswer = "";
    String eggsTypeAnswer2 = "";
    String toastAnswer = "";
    String toastTypeAnswer = "";
    
    //coffee start
    System.out.println("Would you like coffee?");
    Scanner coffee = new Scanner(System.in);
    coffeeAnswer = coffee.nextLine();
    if (coffeeAnswer.equals("yes")) {
      //cream start
      System.out.println("\nWould you like cream in your coffee?");
      Scanner cream = new Scanner(System.in);
      creamAnswer = cream.nextLine();
      if (creamAnswer.equals("yes")) {
        System.out.println("\nDo you want regular (yes) or non-dairy cream (no)?");
        Scanner creamType = new Scanner(System.in);
        creamTypeAnswer = creamType.nextLine();
      }
    
      //cream end
      //sugar start
      System.out.println("\nWould you like sugar in your coffee?");
      Scanner sugar = new Scanner(System.in);
      sugarAnswer = sugar.nextLine();
      if (sugarAnswer.equals("yes")) {
        System.out.println("\nWould you like regular sugar (yes) or a sugar substitute (no) ?");
        Scanner sugarType = new Scanner(System.in);
        sugarTypeAnswer = sugarType.nextLine();
      }
    }
      //sugar end
    //coffee end
    //bacon start
    System.out.println("\n\nWould you like Bacon?");
    Scanner bacon = new Scanner(System.in);
    baconAnswer = bacon.nextLine();
    if (baconAnswer.equals("yes")) {
      //bacon type start
      System.out.println("\nWould you like Bacon strips (yes) or Canadian Bacon (no)?");
      Scanner baconType = new Scanner(System.in);
      baconTypeAnswer = baconType.nextLine();
      System.out.println("\nWould you like traditional Bacon (yes) or vegan Bacon (no)?");
      Scanner baconType2 = new Scanner(System.in);
      baconTypeAnswer2 = baconType2.nextLine();
    }
    //bacon end
    //eggs start
    System.out.println("\n\nWould you like Eggs?");
    Scanner eggs = new Scanner(System.in);
    eggsAnswer = eggs.nextLine();
    if (eggsAnswer.equals("yes")) {
      System.out.println("\nPlease answer \"1\" \"2\" or \"3\" for the next questions.");
      //eggs type start
      System.out.println("Would you like Scrambled (1), sunny-side-up (2), or fried (3)?");
      Scanner eggsType = new Scanner(System.in);
      eggsTypeAnswer = eggsType.nextLine();
      if (eggsTypeAnswer.equals("3")) {
        System.out.println("\nWould you likke your fried eggs over easy (1), medium (2), or hard (3)?");
        Scanner eggsType2 = new Scanner(System.in);
        eggsTypeAnswer2 = eggsType2.nextLine();
      }
    }
      //eggs type end
    //eggs end
    //toast start
    System.out.println("\n\nWould you like toast (yes or no)?");
    Scanner toast = new Scanner(System.in);
    toastAnswer = toast.nextLine();
    if (toastAnswer.equals("yes")) {
      System.out.println("\nWould you like white toast (yes) or wheat toast (no)?");
      Scanner toastType = new Scanner(System.in);
      toastTypeAnswer = toastType.nextLine();
    }
    //toast end
    
    //order collection
    System.out.println("\nYour order is:\n");
    if (coffeeAnswer.equals("yes")) {
      System.out.print("Coffee");
      if (creamAnswer.equals("yes")) {
        System.out.print(" with Cream");
        if (creamTypeAnswer.equals("yes")) {
          System.out.print(" type Regular");
        }
        if (creamTypeAnswer.equals("no")) {
          System.out.print(" type Non-dairy");
        }
      }
      if (sugarAnswer.equals("yes")) {
        System.out.print(" with Sugar");
        if (sugarTypeAnswer.equals("yes")) {
          System.out.print(" type Regular");
        }
        if (sugarTypeAnswer.equals("no")) {
          System.out.print(" type Sugar Substitute");
        }
      }
    }
    if (baconAnswer.equals("yes")) {
      System.out.print("\nBacon");
      if (baconTypeAnswer.equals("yes")) {
        System.out.print(" Strips");
      }
      if (baconTypeAnswer.equals("no")) {
        System.out.print(" Canadian Bacon");
      }
      if (baconTypeAnswer2.equals("yes")) {
        System.out.print(" Traditional");
      }
      if (baconTypeAnswer2.equals("no")) {
        System.out.print(" Vegan");
      }
    }
    if (eggsAnswer.equals("yes")) {
      System.out.print("\nEggs");
      if (eggsTypeAnswer.equals("1")) {
        System.out.print(" Scrambled");
      }
      if (eggsTypeAnswer.equals("2")) {
        System.out.print(" Sunny-side-up");
      }
      if (eggsTypeAnswer.equals("3")) {
        System.out.print(" Fried");
        if (eggsTypeAnswer2.equals("1")) {
          System.out.print(" Over Easy");
        }
        if (eggsTypeAnswer2.equals("2")) {
          System.out.print(" Over Medium");
        }
        if (eggsTypeAnswer2.equals("3")) {
          System.out.print(" Over Hard");
        }
      }
    }
    if (toastAnswer.equals("yes")) {
      System.out.print("\nToast");
      if (toastTypeAnswer.equals("yes")) {
        System.out.print(" White");
      }
      if (toastTypeAnswer.equals("no")) {
        System.out.print(" Wheat");
      }
    }
    //is your order healthy
    if ((coffeeAnswer.equals("no") || (coffeeAnswer.equals("yes") && creamAnswer.equals("no") && sugarAnswer.equals("no")) || (coffeeAnswer.equals("yes") && creamTypeAnswer.equals("no") && sugarTypeAnswer.equals("no"))) && ((baconAnswer.equals("no")) || (baconTypeAnswer2.equals("no"))) && ((toastAnswer.equals("no")) || (toastTypeAnswer.equals("no")))) {
      System.out.print("\nYour order is healthy!");
    }
  }
    
}