public class Order {
    private ETypeOrder type;
    private String request = "";
    private String conclusion = "";

    public Order(ETypeOrder type, String request) {
        this.type = type;
        this.request = request;
    }

    public ETypeOrder getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }
}
