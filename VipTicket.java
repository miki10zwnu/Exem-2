package exem2;


import java.time.LocalDate;

public class VipTicket extends Ticket{
    public VipTicket(long id, String name, LocalDate showDate, byte rowNumber, byte sitNumber, Customer ticketCustomer, float ticketPrice) throws Exception{
        super(id, name, showDate, rowNumber, sitNumber, ticketCustomer, ticketPrice);
        calculateTicketPrice(ticketPrice);
        printPurchase();
    }
    @Override
    public void calculateTicketPrice(float ticketPrice) throws Exception{
        if(super.getTicketCustomer().getCustomerType() != CustomerType.VIP){
            throw new Exception(String.format("An issue has occurred. %S %S IS NOT a VIP customer",super.getTicketCustomer().getFirstName(),super.getTicketCustomer().getLastName()));
        }
        super.setTicketPrice(ticketPrice - super.getTicketCustomer().getDiscount());
    }
    @Override
    public void printPurchase(){
        System.out.println(String.format("%S %S has purchased a vip ticket to %S",this.getTicketCustomer().getFirstName(),this.getTicketCustomer().getLastName(),this.getShowName()));
    }
}