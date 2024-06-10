import org.example.restbymonthservice.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);
        System.out.println("В этом году фрилансер отдохнет " + actual + " месяца");


        income = 10_000;
        expenses = 3_000;
        threshold = 20_000;
        expected = 3;
        actual = service.calculate(income, expenses, threshold);
        System.out.println("В этом году фрилансер отдохнет " + actual + " месяца");

        income = 5_000;
        expenses = 2_000;
        threshold = 10_000;
        expected = 2;
        actual = service.calculate(income, expenses, threshold);
        System.out.println("В этом году фрилансер отдохнет " + actual + " месяца");


        income = 500_000;
        expenses = 250_000;
        threshold = 1_000_000;
        expected = 6;
        actual = service.calculate(income, expenses, threshold);
        System.out.println("В этом году фрилансер отдохнет " + actual + " месяца");

    }

}

