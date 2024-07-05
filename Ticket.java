package exem2;

import java.time.LocalDate;

public abstract class Ticket implements Priceable, Printable{
    private long id;
    private String showName;
    private LocalDate showDate;
    private byte rowNumber;
    private byte sitNumber;
    private Customer ticketCustomer;
    private float ticketPrice;

    public Ticket(long id, String showName, LocalDate showDate, byte rowNumber, byte sitNumber, Customer ticketCustomer, float ticketPrice) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.rowNumber = rowNumber;
        this.sitNumber = sitNumber;
        this.ticketCustomer = ticketCustomer;
    }

    public long getId() {
        return this.id;
    }

    public String getShowName() {
        return this.showName;
    }

    public LocalDate getShowDate() {
        return this.showDate;
    }

    public byte getRowNumber() {
        return this.rowNumber;
    }

    public byte getSitNumber() {
        return this.sitNumber;
    }

    public Customer getTicketCustomer() {
        return this.ticketCustomer;
    }

    public float getTicketPrice() {
        return this.ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}