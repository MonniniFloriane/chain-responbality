public class Caporal implements ISupport{
    private ISupport next = null;

    @Override
    public void setNext(ISupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Order request) {
        if (request.getType() == ETypeOrder.CAPORAL) {
            request.setConclusion("Je ne peut executer l'ordre du Général, je vais le passer au Sergent");
        } else {
            if (next != null){
                next.handleRequest(request);
            }
        }
    }
}
