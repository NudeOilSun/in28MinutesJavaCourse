package introToObjectOriantedProgramming.Section29Exceptions;

import java.util.Objects;
class CurrenciesDoNotMatchException extends RuntimeException{
    public CurrenciesDoNotMatchException(String message) {
        super(message);
    }
}
public class ThrowingExceptionRunner {
    static class Amount{
        private String currency;
        private int Amount;

        public Amount(String currency, int amount) {
            this.currency = currency;
            Amount = amount;
        }

        public void Add(Amount other) {
            if (!Objects.equals(this.currency, other.currency)){
                //throw new Exception("Currencies dont match");
                throw new CurrenciesDoNotMatchException("Currencies dont match");
            }
            this.Amount += other.Amount;
        }
        @Override
        public String toString() {
            return "Amount{" +
                    "currency='" + currency + '\'' +
                    ", Amount=" + Amount +
                    '}';
        }
    }
    public static void main(String[] args) {
        Amount amount = new Amount("USD",  10);
        Amount amount2 = new Amount("EUR",  20);

        amount.Add(amount2);
        System.out.println(amount) ;
    }
}
