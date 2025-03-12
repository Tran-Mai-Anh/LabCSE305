public class LecturerBuilder implements CardBuilder{
    private String type;
    private String libraryService;
    private String printerService;
    private String classService;

    @Override
    public void setType() {
        this.type = "Lecturer";
    }

    @Override
    public void setLibrary() {
        this.libraryService = "Unlimited";
    }

    @Override
    public void setPrinter() {
        this.printerService = "Free";
    }

    @Override
    public void setClass() {
        this.classService = "Limited";
    }

    @Override
    public User createCard(String id) {
        return new User(id, type, libraryService, printerService, classService);
    }
}
