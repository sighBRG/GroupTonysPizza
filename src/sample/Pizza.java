

public class Pizza {

        private String name;
        private double price;
        private int ordernumber;
        //default constructor
        public Pizza() {
        }


        public Pizza(String name, double price, int ordernumber) {
            this.name = name;
            this.price = price;
            this.ordernumber = ordernumber;
        }

        public int getOrdernumber() {
            return ordernumber;
        }

        public void setOrdernumber(int ordernumber) {
            this.ordernumber = ordernumber;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setNamn(String name) {
            this.name = name;
        }
    }