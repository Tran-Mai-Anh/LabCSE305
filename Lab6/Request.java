public interface Request {
    void setPriority();

    void setExpire();

    void setStatus();

    void processRequest();
}
