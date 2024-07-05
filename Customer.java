package exem2;

    public class Customer {
        private long id;
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private CustomerType customerType;
        private float discount;
        private Voucher voucher;

        public Customer(long id, String firstName, String lastName, String email, String address, CustomerType customerType, float discount) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.address = address;
            this.customerType = customerType;
            this.discount = discount;
        }

        public long getId() {
            return this.id;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getEmail() {
            return this.email;
        }

        public String getAddress() {
            return this.address;
        }

        public CustomerType getCustomerType() {
            return this.customerType;
        }

        public float getDiscount() {
            return this.discount;
        }

        public Voucher getVoucher() {
            return this.voucher;
        }
        public void takeFoodVoucher(Voucher voucher){
            if (this.voucher == null){
                this.voucher = voucher;
                System.out.println(String.format("Hi %S %S!",this.firstName,this.lastName));
                voucher.eat();
            }
        }
    }
