package introToObjectOriantedProgramming.Sec34NewJavaFeatures.f;

public class SwitchRecordsRunner {

    sealed interface CustomerMessage permits Message, Feedback{}

    final record Message(String  text) implements CustomerMessage {}
    final record Feedback (int rating, String  description) implements CustomerMessage {}

    record SupportRequest(String username, CustomerMessage customerMessage){}

    public static void main(String[] args) {

        CustomerMessage customerMessage = new Message("Hello");
        CustomerMessage customerFeedback = new Feedback(5,"Really Good");

        String response = switch (customerFeedback){
            case Message(String text) -> text;
            case Feedback(int rating, String  description) -> description;
        };

        System.out.println(response);

        SupportRequest supportRequest = new SupportRequest("Xeno", new Feedback(1, "Needs more kibble"));

        String responseMessage = switch (supportRequest){
            case SupportRequest(String username, Message message) -> message.text;
            case SupportRequest(String username, Feedback feedback) -> feedback.description;
        };

        System.out.println(responseMessage);
    }
}
