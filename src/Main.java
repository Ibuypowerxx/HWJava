public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_000; // Стоимость билета
        int milesPrice = 20; // Стоимость одной мили
        int bonusMiles = ticketPrice / milesPrice; //Количество бонусных миль
        System.out.println("Количество начисленных миль за купленный билет  " + bonusMiles);

    }
}
