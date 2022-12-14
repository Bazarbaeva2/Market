package enums;

public enum Products {
    RICE(150,5),
    PEAS(100,4),
    PASTA(100,2),
    MILK(110,3),
    KEFIR(95,1),
    SOUR_CREAM(200,5),
    COTTAGE_CHEESE(250,10),
    CHEESE(300,5),
    POTATOES(150,10),
    ONIONS(50,1),
    CARROTS(90,5),
    TOMATOES(150,5),
    CUCUMBERS(125,4),
    CABBAGES(250,4),
    HERBS(300,15),
    BREAD(60,1),
    BUTTER(145,5),
    JAM(250,10),
    WATER(100,5),
    SODA(60,2),
    JUICES(195,2),
    BEEF(450,15),
    LAMB(500,15),
    SOUP(350,5),
    SET_FILLET(550,10),
    CHICKEN(350,5),
    LEG(600,20),
    NUGGETS(300,4),
    CUTLETS(250,1),
    BATON(100,2),
    BUNS(80,1);

    int price;
    int amount;

    Products(int price, int amount) {
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this. price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "price=" + price +
                ", amount=" + amount +
                '}';
    }

    public Integer getSum() {
        return 0;
    }
}
