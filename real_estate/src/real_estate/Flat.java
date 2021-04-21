/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package real_estate;

public class Flat extends Property {
        private int numberOfRooms;

        public Flat() {
                super();
        }

        public Flat(int numberOfRooms, String address, Owners owner, int price, boolean available, boolean rentSale, int area) {
                super(address, owner, price, available, rentSale, area);
                this.numberOfRooms = numberOfRooms;
        }

        public int getNumberOfRooms() {
                return numberOfRooms;
        }

        public void setNumberOfRooms(int numberOfRooms) {
                this.numberOfRooms = numberOfRooms;
        }
        
}