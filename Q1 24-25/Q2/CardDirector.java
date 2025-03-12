public class CardDirector {
    private CardBuilder builder;

    public CardDirector(CardBuilder builder) {
        this.builder = builder;
    }

    public User createCard(String id) {
        builder.setType();
        builder.setLibrary();
        builder.setPrinter();
        builder.setClass();
        return builder.createCard(id);
    }

    public static User constructStudentCard(String id) {
        CardDirector director = new CardDirector(new StudentBuilder());
        return director.createCard(id);
    }
    
    public static User constructLecturerCard(String id) {
        CardDirector director = new CardDirector(new LecturerBuilder());
        return director.createCard(id);
    }
    
    public static User constructAdminCard(String id) {
        CardDirector director = new CardDirector(new AdminBuilder());
        return director.createCard(id);
    }
}
