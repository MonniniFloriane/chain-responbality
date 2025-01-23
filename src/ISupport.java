public interface ISupport {
    void setNext(ISupport next);
    void handleRequest(Order request);
}
