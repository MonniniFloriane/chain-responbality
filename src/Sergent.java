public class Sergent implements ISupport {
    private ISupport next = null;

    @Override
    public void setNext(ISupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Order request) {
        if (request.getType() == ETypeOrder.SERGENT) {
            request.setConclusion("Je ne peut executer l'ordre du Caporal, je vais le passer au Soldat");
        } else {
            if (next != null){
                next.handleRequest(request);
            }
        }
    }
}
