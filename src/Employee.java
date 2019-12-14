public class Employee {
    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {

        if (finance == true) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        } else if (vehicle.getPrice() <= cust.getCashOnHand()) {
            processTransaction(cust,vehicle);
            ;
        } else {
            System.out.println("CUSTOMER Will need more money to purchase " + vehicle);
        }
    }

        public void runCreditHistory(Customer cust,double loanAmount){
            System.out.println("Ran credit history");
            System.out.println("customer approved to purchase vehicle");
        }
        public void processTransaction (Customer cust, Vehicle vehicle ){
            System.out.println("customer purchased the vehicle  " + vehicle +" for the price " + vehicle.getPrice());
        }
    }

