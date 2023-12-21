public class Main {
    public static void main(String[] args) {
        int ticketprice = 10_000; // Стоимость билета
        int milesprice = 20; // Стоимость одной мили
        int bonusmiles = ticketprice / milesprice; //Количество бонусных миль
        System.out.println("Количество начисленных миль за купленный билет  " + bonusmiles);
     
    }
}