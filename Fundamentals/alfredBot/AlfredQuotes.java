import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting (String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String dateAnnouncement() {
        return String.format( "It is currently %s.", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1){
            return "Right away sir. She certainly isn't sophisticated enough for that";
        }
        else if (conversation.indexOf("Alfred")>-1){
            return "As you wish, naturally";
        }else{
            return "Right. And with that I shall retire";
        }
}}