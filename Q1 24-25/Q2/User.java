public class User {
    private String id;
    private String type;
    private String libraryService;
    private String printerService;
    private String classService;

    public User(String id, String type, String libraryService, String printerService, String classService) {
        this.id = id;
        this.type = type;
        this.libraryService = libraryService;
        this.printerService = printerService;
        this.classService = classService;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Type: " + type);
        System.out.println("Library Access: " + libraryService);
        System.out.println("Printer Access: " + printerService);
        System.out.println("Class Access: " + classService);
    }
}