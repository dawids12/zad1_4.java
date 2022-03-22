import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int opcja;
    double a,b;
    Scanner s = new Scanner(System.in);
    System.out.println("1 - pole koła");
    System.out.println("Podaj opcje:");
    opcja = s.nextInt();
    System.out.println("Podaj a: ");
    a = s.nextDouble();
    System.out.println("Podaj b: ");
    b = s.nextDouble();

    switch(opcja)
      {
        case 1:
          double kolo1 = 3.14 * a*a;
          double kolo2 = 3.14 *b*b;
          System.out.println("Suma kół wynosi: " + (kolo1 + kolo2));
          break;
          
      
    case 2:
      System.out.println("Pole prostokąta wynosi: " + (a*b));
      break;
    case 3:
      System.out.println("Pole trójkąta prostokątnego wynosi: " + (0.5*a*b));
      break;
    case 4:
      double kwadrat1 = a*a;
      double kwadrat2 = b*b;
      System.out.println("Suma kwadratów wynosi: " + (kwadrat1 + kwadrat2));
      }
    
    
    
  }
}