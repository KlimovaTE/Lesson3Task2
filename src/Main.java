public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double height = 1.8;
        double weight = 80;
        double bmi = service.calculate(height, weight);
        System.out.print("������ ����� ����: ");
        System.out.printf("%.2f", bmi);

    }
}