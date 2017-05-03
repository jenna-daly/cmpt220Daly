import java.util.Scanner;

public class FinalProject {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the game: Choose your adventure! Type Y to start");
    String s1 = input.nextLine();

    if(s1.equals("Y")) {
      System.out.println("You're home alone and you've just turned off your lights 
        and gone to bed when you hear a strange noise. Do you get up to check it out (Y) or 
        do you stay in bed and convince yourself it was the AC unit (N)");
      String s2 = input.nextLine();
    }

    if(s2.equals("Y")) {
      System.out.println("Do you grab a flashlight (F) or your baseball bat (L)?");
      String s3 = input.nextLine();
    }

    if(s3.equals("F")) {
      System.out.println("You see the intruder in the kitchen and flash your light on
        their face!")
      System.out.println("Surprise! It's your twerpy brother who came back early
        from his camping trip.")
    }

    if(s3.equals("L")) {
      System.out.println("You see the intruder and immediately strike the kneecaps.");
      System.out.println("He screams and you retreat to turn on the lights.");
      System.out.println("Turns out it was your brother who got home early for the night.
        Looks like you're in some serious trouble with your parents.. after a quick trip
        to the hospital.. Better luck next time!")
    }

    if(s2.equals("N")) {
      System.out.println("Do you scroll through insta to avoid closing your eyes (I) or
        fall asleep without worry(S)");
      String s4 = input.nextLine();
    }

    if(s4.equals("I")) {
      System.out.println("You hear pattering through the hall and use the light of your
        phone to peer out of your door..");
      System.out.println("Lucky for you it's your sister who decided to come home
        after a party instead of sleeping over! All is well in life now(:");
    }

    if(s4.equals("S")) {
      System.out.println("You have been restfully sleeping when you're jolted awake.");
      System.out.println("You look up to see a masked figure and scream in terror! Under the
        emerges your sister who arrived home early from a party and decided this 
        was the fun thing to do. Better luck next time.");
    }
