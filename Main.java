import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var scanner = new Scanner(System.in);
    System.out.println("Wybierz tryb: 1 - suma \n2 - roznica \n3 - iloczyn \n4 - iloraz");
    int tryb = scanner.nextInt();

    System.out.println("Podaj liczbe a: ");
    double a = scanner.nextDouble();

    System.out.println("Podaj liczbe b: ");
    double b = scanner.nextDouble();

    double wynik;

    switch (tryb) {
      case 1:
        wynik = a+b;
        break;
      case 2:
        wynik = a-b;
        break;
      case 3:
        wynik = a*b;
        break;
      case 4:
        wynik = a/b;
        break;
      default:
        wynik = 0;
        break;
    }

    System.out.println("Wynik: " + wynik);
  }
}