public class Dealership {

    public static void main(String[]args){
        Customer cust1 = new Customer();

        cust1.setName("Akash");

        cust1.setAddress("123 Elmhurst");
        System.out.println(cust1.getAddress());


        cust1.setCashOnHand(12000);

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Honda");
        vehicle.setModel("Accord");
        vehicle.setPrice(11000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp,false);
    }
}
