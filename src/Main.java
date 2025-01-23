public class Main {
    public static void main(String[] args) {
        ISupport general = new General();
        ISupport caporal = new Caporal();
        ISupport sergent = new Sergent();
        ISupport soldat  = new Soldat();

        general.setNext(caporal);
        caporal.setNext(sergent);
        sergent.setNext(soldat);

        Order requestA = new Order(ETypeOrder.GENERAL, "Je n'y arrive pas");
        Order requestB = new Order(ETypeOrder.CAPORAL, "Je vais laisser ça au niveau en dessous");
        Order requestC = new Order(ETypeOrder.SERGENT, "Je vais laisser ça au larbin");
        Order requestD = new Order(ETypeOrder.SOLDAT, "???????");

        general.handleRequest(requestA);
        caporal.handleRequest(requestB);
        sergent.handleRequest(requestC);
        soldat.handleRequest(requestD);

        System.out.println(requestA.getConclusion());
        System.out.println(requestB.getConclusion());
        System.out.println(requestC.getConclusion());
        System.out.println(requestD.getConclusion());

    }
}