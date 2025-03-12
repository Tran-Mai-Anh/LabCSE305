public interface CardBuilder {
    void setType();

    void setLibrary();

    void setPrinter();

    void setClass();

    User createCard(String id);
}
