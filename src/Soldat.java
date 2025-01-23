public class Soldat implements ISupport{
    private ISupport next = null;

    @Override
    public void setNext(ISupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Order request) {
        if (request.getType() == ETypeOrder.SERGENT) {
            request.setConclusion("Je vais executer l'ordre du Sergent");
        } else {
            if (next != null){
                next.handleRequest(request);
            } else {
                request.setConclusion("Je ne peut executer l'ordre du Sergent");
            }
        }
    }
}
