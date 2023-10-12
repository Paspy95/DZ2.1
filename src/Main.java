// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int clientScore = 100;
        int depositeAmount = 1_100;
        int bonus = depositeAmount / 100;
        if (depositeAmount < 1_000) {
            bonus = 0;
        }
        int scoteAfterDeposite = clientScore + depositeAmount + bonus;
        System.out.println(scoteAfterDeposite);
    }
}