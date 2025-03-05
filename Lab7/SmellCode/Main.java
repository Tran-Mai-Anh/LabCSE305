import java.util.*;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        if (content == null || sender == null || recipient == null) {
            throw new IllegalArgumentException("Message content, sender, and recipient must not be null.");
        }
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getContent() { return content; }
    public String getSender() { return sender; }
    public String getRecipient() { return recipient; }

    public String formatSummary() {
        return "Summary - From: " + sender + ", To: " + recipient + ", Content: " + content;
    }

    public String formatDetails() {
        return "Content: " + content + "\n"
                + "Sender: " + sender + "\n"
                + "Recipient: " + recipient + "\n"
                + "Content Length: " + content.length() + "\n"
                + "Sender Uppercase: " + sender.toUpperCase() + "\n"
                + "Recipient Lowercase: " + recipient.toLowerCase();
    }

    @Override
    public String toString() {
        return formatSummary();
    }
}

class MessagePrinter {
    public static void printMessage(Message message) {
        System.out.println(message.formatSummary());
    }

    public static void printAllMessages(Map<String, List<Message>> inbox) {
        for (Map.Entry<String, List<Message>> entry : inbox.entrySet()) {
            System.out.println("Messages for: " + entry.getKey());
            for (Message message : entry.getValue()) {
                printMessage(message);
            }
        }
    }
}

class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        if (content == null || content.trim().isEmpty() ||
            sender == null || sender.trim().isEmpty() ||
            recipient == null || recipient.trim().isEmpty()) {
            throw new IllegalArgumentException("Message content, sender, and recipient must not be empty or null.");
        }

        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, Collections.emptyList());
    }

    public void printAllMessages() {
        MessagePrinter.printAllMessages(inbox);
    }
}

public class Main {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A");
        for (Message message : tenantAMessages) {
            MessagePrinter.printMessage(message);
        }

        Message exampleMessage = new Message("Test", "Sender", "Recipient");
        System.out.println(exampleMessage.formatDetails());

        messagingService.printAllMessages();
    }
}