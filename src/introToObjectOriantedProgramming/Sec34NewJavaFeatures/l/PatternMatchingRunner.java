package introToObjectOriantedProgramming.Sec34NewJavaFeatures.l;

public class PatternMatchingRunner {

    record Transaction(String sender, String receiver, int amount){}

    private static void PrintTransactionOld(Object objTransaction){
        if(objTransaction instanceof Transaction transaction){
            String sender = transaction.sender();
            String receiver = transaction.receiver();
            int amount = transaction.amount();

            System.out.println("sender: " + sender);
            System.out.println("reciever: " + receiver);
            System.out.println("amount: " + amount);
        }
    }

    private static void PrintTransactionNew (Object objTransaction){
        if(objTransaction
                instanceof
                Transaction(String sender, String receiver, int amount)){
            System.out.println("sender: " + sender);
            System.out.println("reciever: " + receiver);
            System.out.println("amount: " + amount);
        }
    }

    public static void main(String[] args) {
//        Object objStr = "some string";
//
//        if (objStr instanceof String str){
//            System.out.println("Is string");
//            //var str = (String)objStr;
//            System.out.println(str.toUpperCase());
//        }

        PrintTransactionNew(new Transaction("louise", "kyle", 20));
    }
}
