package exem2;

import java.time.LocalDate;

public class RegularTicket extends Ticket{
    public RegularTicket(long id, String name, LocalDate showDate, byte rowNumber, byte sitNumber, Customer ticketCustomer, float ticketPrice) {
        super(id, name, showDate, rowNumber, sitNumber, ticketCustomer, ticketPrice);
        calculateTicketPrice(ticketPrice);
        printPurchase();
    }
    @Override
    public void calculateTicketPrice(float ticketPrice) {
        super.setTicketPrice(ticketPrice);
    }
    @Override
    public void printPurchase(){
        System.out.println(String.format("%S %S has purchased a regular ticket to %S",this.getTicketCustomer().getFirstName(),this.getTicketCustomer().getLastName(),this.getShowName()));
    }

}