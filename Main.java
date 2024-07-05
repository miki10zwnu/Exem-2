package exem2;

    import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

    public class Main {
        public static void main(String[] args) throws Exception {
            Customer ben = new Customer(1l,"Ben","Jamin","ben@jamin.com","Hapardes 2, Rehovot",CustomerType.VIP,22.25f);
            Ticket benTicket = new VipTicket(11l,"Sindarela",LocalDate.of(2023,7,15),(byte) 10,(byte) 12,ben,90f);
            System.out.println(String.format("%S paid %s",benTicket.getTicketCustomer().getFirstName(),benTicket.getTicketPrice()));
            Customer or = new Customer(2l,"Or","Shavit","or@shavit.com","Levitan 12, Kfar Saba",CustomerType.REGULAR,0f);
            Ticket orTicket = new RegularTicket(12l,"Sindarela",LocalDate.of(2023,7,15),(byte) 13,(byte) 23,or,90f);
            System.out.println(String.format("%S paid %s",orTicket.getTicketCustomer().getFirstName(),orTicket.getTicketPrice()));
            Customer guy = new Customer(3l,"Guy","Gefen","guy@gefen.com","Rashi 14, Tel Aviv",CustomerType.VIP,22.25f);
            Ticket guyTicket = new VipTicket(13l,"Sindarela",LocalDate.of(2023,7,15),(byte) 7,(byte) 31,guy,90f);
            Customer tal = new Customer(4l,"Tel","Levi","tal@levi.com","Hazahal 3, Raanana",CustomerType.VIP,22.5f);
            Ticket talTicket = new VipTicket(14l,"Sindarela",LocalDate.of(2023,7,15),(byte) 7,(byte) 30,tal,90f);
            Customer anna = new Customer(5l,"Anna","Bra","anna@bra.com","Megido 11, Hadera",CustomerType.REGULAR,22.5f);
            Ticket annaTicket = new RegularTicket(15l,"Sindarela",LocalDate.of(2023,7,15),(byte) 19,(byte) 12,anna,90f);
            Customer bar = new Customer(6l,"Bar","Levi","bar@levi.com","Yakinton 7, Raanana",CustomerType.REGULAR,0f);
            Ticket barTicket = new RegularTicket(16l,"Sindarela",LocalDate.of(2023,7,15),(byte) 1,(byte) 29,bar,90f);
            ArrayList<Ticket> sindaarelaList = new ArrayList<>(Arrays.asList(barTicket,orTicket,guyTicket,talTicket,annaTicket));
            Show sindarela = new Show((byte) 1,"Sindarela",LocalDate.of(2023,7,15),sindaarelaList);
            System.out.println(String.format("Before: The total net revenue of %S show is: %s",sindarela.getShowName(),sindarela.calculateTotalNetRevenue()));
            System.out.println(String.format("Before: The total net discount of %S show is: %s",sindarela.getShowName(),sindarela.calculateTotalDiscount()));
            sindarela.addTicketToList(barTicket);
            sindarela.addTicketToList(benTicket);
            sindarela.removeTicketFromList(talTicket);
            sindarela.removeTicketFromList(benTicket);
            System.out.println(String.format("After: The total net revenue of %S show is: %s",sindarela.getShowName(),sindarela.calculateTotalNetRevenue()));
            System.out.println(String.format("After: The total net discount of %S show is: %s",sindarela.getShowName(),sindarela.calculateTotalDiscount()));

            Popcorn popcorn = new Popcorn();
            ben.takeFoodVoucher(popcorn);
            ben.takeFoodVoucher(new Nachos());
            or.takeFoodVoucher(new Nachos());
        }
    }

