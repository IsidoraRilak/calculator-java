public class CalculatorTest {

    public static void testCalculator_twoPositiveOperandsAllOperations_correctlyCalculated() {
        //Metoda testira kalkulator sa svim operacijama, koristeci 2 pozitivna broja(operanda)
        //Test ce odstampati uspesan rezultat testiranja samo ako kalkulator uspesno izvrsi matematicke operacije +-/*

        // inicijalizuju se operandi
        String first = "4";
        String second = "2";

        // incijalizuju se promenljive za ocekivane rezultate za svaku od operacija racunanja, koju podrzava kalkulator
        String expectedResultAddition = "6.0";

        //proverava operacije sabiranja. Ako je rezultat netacan, ispisuje se greska
        String actualResultAddition = Calculator.Run(first + "+" + second);

        //izvrsavanje testa i stampanje poruke rezultata
        if (!expectedResultAddition.equals(actualResultAddition)) {
            System.out.println("Test failed for operation addition. Expected " + expectedResultAddition + " but got " + actualResultAddition);
        } else {
            System.out.println("Test is successful for operation addition");
        }

    }

    public static void main(String[] args) {

        testCalculator_twoPositiveOperandsAllOperations_correctlyCalculated();

    }
}
