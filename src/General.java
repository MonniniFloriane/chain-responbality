public class General implements ISupport{
    private ISupport next = null;

    @Override
    public void setNext(ISupport next) {
        this.next = next;
    }

    @Override
    public void handleRequest(Order request) {
        if (request.getType() == ETypeOrder.GENERAL) {
            request.setConclusion("Je ne peut pas executer les ordres du président, je vais le passer au Caporal");
        } else {
            if (next != null){
                next.handleRequest(request);
            }
        }
    }
}
