public class AdminBuilder implements CardBuilder {
    private String type;
    private String libraryService;
    private String printerService;
    private String classService;

    @Override
    public void setType() {
        this.type = "Administrator";
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
        this.classService = "Unlimited";
    }

    @Override
    public User createCard(String id) {
        return new User(id, type, libraryService, printerService, classService);
    }
}
