/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real_estate;

public class Property {
        private String address;
        private Owners owner;
        private int price;
        private boolean available;
        private boolean rentSale;
        private int area;
        
        public Property() {
                super();
        }

        public Property(String address, Owners owner, int price, boolean available, boolean rentSale, int area) {
                super();
                this.address = address;
                this.owner = owner;
                this.price = price;
                this.available = available;
                this.rentSale = rentSale;
                this.area = area;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public Owners getOwner() {
                return owner;
        }

        public void setOwner(Owners owner) {
                this.owner = owner;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public boolean isAvailable() {
                return available;
        }

        public void setAvailable(boolean available) {
                this.available = available;
        }

        public boolean isRentSale() {
                return rentSale;
        }

        public void setRentSale(boolean rentSale) {
                this.rentSale = rentSale;
        }

        public int getArea() {
                return area;
        }

        public void setArea(int area) {
                this.area = area;
        }

    @Override
    public String toString() {
        return "Property{" + "address=" + address + ", owner=" + owner + ", price=" + price + ", available=" + available + ", rentSale=" + rentSale + ", area=" + area + '}';
    }
        
}