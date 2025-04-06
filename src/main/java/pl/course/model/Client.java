package pl.course.model;

public class Client {
    private String clientName;
    private int money;
    private int maxWageCapability;

    public Client() {
    }

    public Client(String clientName, int money, int maxWageCapability) {
        this.clientName = clientName;
        this.money = money;
        this.maxWageCapability = maxWageCapability;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMaxWageCapability() {
        return maxWageCapability;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", money=" + money +
                ", maxWageCapability=" + maxWageCapability +
                '}';
    }

    public void setMaxWageCapability(int maxWageCapability) {
        this.maxWageCapability = maxWageCapability;
    }
}

