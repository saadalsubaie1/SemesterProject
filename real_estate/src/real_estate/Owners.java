package real_estate;

public class Owners {
        private String name;
        private String contact;
        private String id;
        
        public Owners() {
                super();
        }

        public Owners(String name, String contact, String id) {
                super();
                this.name = name;
                this.contact = contact;
                this.id = id;
        }

        public String getName() {
                return name;
        }
        
        public void setName(String name) {
                this.name = name;
        }
        
        public String getContact() {
                return contact;
        }
        
        public void setContact(String contact) {
                this.contact = contact;
        }
        
        public String getId() {
                return id;
        }
        
        public void setId(String id) {
                this.id = id;
        }
}