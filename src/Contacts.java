public class Contacts {
        // variables/fields
        private String name;
        private int phoneNumber;

        // constructors
        public Contacts(){
        }
        public Contacts(String name){
            this.name = name;
        }
        public Contacts(String name, int phoneNumber){
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        // getters/setters
        public String getName(){
            return name;
        }

        public int getPhoneNumber(){
            return phoneNumber;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setPhoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
        }




}
