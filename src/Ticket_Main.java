
public class Ticket_Main{
	
	public static void main(String[] args) {
		
		//SubSportticket s1 = new SubSportticket(...) So erstellt man ein OBJEKT von Typ SubSportticket
		SubSportticket s1 = new SubSportticket("Air + Style","Olympia World Innsbruck",44.99);
		SubKonzertticket k1 = new SubKonzertticket("Cinello","Festspiele Erl",25);
		SubTheaterticket t1 = new SubTheaterticket("Der gestiefelte Kater","Wiener Staatsoper",30.99);
		Ticketshop shop = new Ticketshop();
		shop.bestellen(s1);
		shop.bestellen(k1);
		shop.bestellen(t1);
		System.out.println("\n--------------Ticketshop--------------");
		System.out.println("- Anzahl der Tickets im Ticketshop: "+shop.getAnzahlTickets());
		System.out.println("- Günstigstes Ticket im Ticketshop: "+ shop.günstigstesTicket());
		System.out.println("- Teuerstes Ticket im Ticketshop: "+ shop.teuerstesTicket());
	}
	
}
