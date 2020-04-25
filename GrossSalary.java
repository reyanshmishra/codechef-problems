import java.util.Scanner;

class GrossSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T > 0) {
            double HRA = 0, DA = 0;
            double baseSalary = scan.nextDouble();
            if (baseSalary >= 1500) {
                HRA = 500;
                DA = baseSalary * 0.98;
            } else {
                HRA = baseSalary * 0.1;
                DA = baseSalary * 0.9;
            }
            System.out.println(baseSalary + HRA + DA);

            T--;
        }
        scan.close();
    }
}
