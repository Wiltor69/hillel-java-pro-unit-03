package hillel;

public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer("Bill Harton", "manager","employr@gmail.com",
                    "+44-056-234-14-56", 28);
        System.out.println(employer);

        Car car = new Car();
        car.start();

    }
}
