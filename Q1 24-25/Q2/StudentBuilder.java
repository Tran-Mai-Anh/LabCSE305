public class StudentBuilder implements CardBuilder {
    private String type;
    private String libraryService;
    private String printerService;
    private String classService;

    @Override
    public void setType() {
        this.type = "Student";
    }

    @Override
    public void setLibrary() {
        this.libraryService = "Limited";
    }

    @Override
    public void setPrinter() {
        this.printerService = "Standard";
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
