package exem2;


import java.time.LocalDate;
import java.util.ArrayList;

public class Show {
    private byte id;
    private String showName;
    private LocalDate showDate;
    private ArrayList<Ticket> ticketsList = new ArrayList<>();

    public Show(byte id, String showName, LocalDate showDate, ArrayList<Ticket> ticketsList) {
        this.id = id;
        this.showName = showName;
        this.showDate = showDate;
        this.ticketsList = ticketsList;
    }

    public byte getId() {
        return this.id;
    }

    public String getShowName() {
        return this.showName;
    }

    public LocalDate getShowDate() {
        return this.showDate;
    }

    public ArrayList<Ticket> getTicketsList() {
        return this.ticketsList;
    }
    public void addTicketToList(Ticket ticket){
        for (int i=0; i<this.ticketsList.size(); i++){
            if (ticket.getId() == this.ticketsList.get(i).getId()){
                System.out.println(String.format("Ticket with id %s is already purchased. Not added",ticket.getId()));
                return;
            }
        }
        this.ticketsList.add(ticket);
        System.out.println(String.format("A %s ticket for %S has added to %s show!",ticket.getShowName(),ticket.getTicketCustomer().getFirstName(),this.showName));
    }
    public void removeTicketFromList(Ticket ticket){
        boolean flag = false;
        flag = this.ticketsList.isEmpty();
        if (flag){
            System.out.println(String.format("The ticket list to %s is empty. Impossible to remove!",this.showName));
            return;
        }
        int counter = 0;
        while (!flag && counter < this.ticketsList.size()){
            if (ticket.getId() == this.ticketsList.get(counter).getId()){
                this.ticketsList.remove(ticket);
                flag = true;
                System.out.println(String.format("Ticket with id %s has removed!",ticket.getId()));
            }
            counter++;
        }
        if (flag){
            System.out.println(String.format("This ticket with id %s is not exist. Impossible to remove!",ticket.getId()));
        }
    }
    public float calculateTotalNetRevenue(){
        float totalNetRevenue = 0f;
        for (Ticket ticket : this.ticketsList){
            totalNetRevenue += ticket.getTicketPrice();
        }
        return totalNetRevenue;
    }
    public float calculateTotalDiscount(){
        float totalDiscount = 0f;
        for(int i=0; i<this.ticketsList.size(); i++){
            totalDiscount += this.ticketsList.get(i).getTicketCustomer().getDiscount();
        }
        return totalDiscount;
    }
}