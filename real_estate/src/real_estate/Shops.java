/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real_estate;

public class Shops extends Property {
        private int averageSale;

        public Shops() {
                super();
        }

        public Shops(int averageSale, String address, Owners owner, int price, boolean available, boolean rentSale, int area) {
                super(address, owner, price, available, rentSale, area);
                this.averageSale = averageSale;
        }

        public int getAverageSale() {
                return averageSale;
        }

        public void setAverageSale(int averageSale) {
                this.averageSale = averageSale;
        }
}