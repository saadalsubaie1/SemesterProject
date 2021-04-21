
package real_estate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Node{
        protected Property property;
        protected Node next;
        
        public Node(Property property, Node next) {
                super();
                this.property = property;
                this.next = next;
        }
}

class LinkedList{
        Node head;
        
        public LinkedList() {
                this.head = null;
        }
        
        public void display() {
                Node p = head;
                
                while (p != null) {
                        System.out.println(p.property.getAddress());
                        p = p.next;
                }
        }
        
        public void writeToFile(Property property) throws IOException {
                File file1 = new File("./property.txt");
                FileWriter fileWriter = new FileWriter(file1, true);
                
                if (property.getClass() == Flat.class) {
                        fileWriter.append("Flat");
                        fileWriter.append(" " + property.getAddress());
                        fileWriter.append(" " + property.getOwner().getName());
                        fileWriter.append(" " + property.getOwner().getContact());
                        fileWriter.append(" " + property.getOwner().getId());
                        fileWriter.append(" " + property.getPrice());
                        fileWriter.append(" Available: " + property.isAvailable());
                        if (property.isRentSale() == true) {
                                fileWriter.append("Rent");
                        }
                        
                        else {
                                fileWriter.append("Sale");
                        }
                        
                        fileWriter.append(" Area:" + property.getArea());
                        
                        fileWriter.append("\n");
                        
                        fileWriter.flush();
                        fileWriter.close();
                }
                
                else if (property.getClass() == Shops.class) {
                        fileWriter.append("Shop");
                        fileWriter.append(" " + property.getAddress());
                        fileWriter.append(" " + property.getOwner().getName());
                        fileWriter.append(" " + property.getOwner().getContact());
                        fileWriter.append(" " + property.getOwner().getId());
                        fileWriter.append(" " + property.getPrice());
                        fileWriter.append(" Available:");
                        if (property.isRentSale() == true) {
                                fileWriter.append("Rent");
                        }
                        
                        else {
                                fileWriter.append("Sale");
                        }
                        
                        fileWriter.append(" Area:" + property.getArea());
                        
                        fileWriter.append("\n");
                        
                        fileWriter.flush();
                        fileWriter.close();
                }
        }
        
        public void addProperty(Property property) throws IOException {
                if (head == null) {
                        this.head = new Node(property, null);
                        writeToFile(property);
                }
                
                else {
                        Node p;
                        p = head;
                        
                        while (p.next != null) {
                                p = p.next;
                        }
                        
                        Node q = new Node(property, null);
                        p.next = q;
                        
                        writeToFile(property);
                }
        }
        
        //search a property by it being a flat/shop
        //or by it being available for rent/sale
        public ArrayList<Property> searchProperty() {
                Scanner sc = new Scanner(System.in);
                ArrayList<Property> properties = new ArrayList();
                
                Node p;
                
                System.out.println("How would you like to search for properties?");
                System.out.println("(T: type, R: Rental/Sale");
                char choice = sc.nextLine().charAt(0);
                
                switch(choice) {
                case 'T': System.out.println("Flat/Shop?");
                                  String type = sc.nextLine();
                                  
                                  p = head;
                                  
                                  while (p != null) {
                                          if (p.property.getClass() == Flat.class && type.equals("Flat")) {
                                                  properties.add(p.property);
                                          }
                                          
                                          else if (p.property.getClass() == Shops.class && type.equals("Shop")) {
                                                  properties.add(p.property);
                                          }
                                          
                                          else {
                                                  p = p.next;
                                          }
                                  }
                                  break;
                                  
                case 'R': System.out.println("Rent/Sale?");
                                  String type1 = sc.nextLine();
                                  
                                  p = head;
                                  
                                  while (p != null) {
                                          if (p.property.isRentSale() == true && type1.equals("Rent")) {
                                                  properties.add(p.property);
                                          }
                                          
                                          else if (p.property.isRentSale() == false && type1.equals("Sale")) {
                                                  properties.add(p.property);
                                          }
                                          
                                          else {
                                                  p = p.next;
                                          }
                                  }
                }
                
                if (properties.size() == 0) {
                        return null;
                }
                
                else {
                        return properties;
                }
        }
        
        //still struggling a little with deleteProperty method
//        public void deleteProperty() {
//                if (this.head == null) {
//                        System.out.println("There are no rooms to delete!!");
//                }
//        }
}

public class Main {
        public static void main(String [] args) throws IOException {
                Flat flat1 = new Flat(4, "California", new Owners("Damon", "1234566789", "1000"), 10000, true, true, 4000);
                Flat flat2 = new Flat(3, "New Jersey", new Owners("Stefan", "1246743224", "1001"), 20000, true, false, 3000);
                
                Shops shop1 = new Shops(2000, "Manhattan", new Owners("Elena", "346753234", "2000"), 4000, false, false, 2000);
                Shops shop2 = new Shops(3000, "New York", new Owners("Caroline", "292839274", "2001"), 5000, false, true, 1000);
                
                LinkedList propertyList = new LinkedList();
                
                propertyList.addProperty(flat1);
                propertyList.addProperty(flat2);
                propertyList.addProperty(shop1);
                propertyList.addProperty(shop2);
              propertyList.searchProperty();
                
                propertyList.display();
        }
}
    

