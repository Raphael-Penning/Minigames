
import java.util.Random;
import java.util.Scanner

public class {

private int maxnumber = 10; 

  public static void main(String[] args)
  {
    erstelleZufallsZahl();
  }
  
  
  public static void erstelleZufallsZahl() {
    Random zufallsgenerator = new Random();
    for (int i = 0; i < 1; i++) {
      int zahl = zufallsgenerator.nextInt(maxnumber);
      System.out.println("Gebe eine Zahl zwischen 0 und " + maxnumber + " ein!");
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
        if(zahl == number) {
            System.out.println("Richtig erraten die Zahl war: " + zahl + " !");
        }else System.out.println("Die Zahl war " + zahl + "! NEXT TRY");
    }
  }
}

