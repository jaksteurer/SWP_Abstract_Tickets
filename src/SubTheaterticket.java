
public class SubTheaterticket extends Tickets{
	
	private final int KOSTEN = 4000;
	private final int SCHAUSPIELERKOSTEN = 6000;
	private final int TICKETS = 4000;
	
	public void ausgabe() {
		//System.out.println("\n---------------------------------------");
		System.out.println("\n-------------Theaterticket-------------");
		System.out.println("Veranstaltung: "+this.veranstaltungsname);
		System.out.println("Veranstaltungsort: "+this.veranstaltungsort);
		System.out.println("Preis pro Ticket: "+ticketpreis+"€");
	}
	public SubTheaterticket(String name, String ort, double preis) {
		super(name, ort, preis);
		ausgabe();
	}
	double basispreis = getbasispreis()+KOSTEN+SCHAUSPIELERKOSTEN;
	
	double berechneTicketpreis() {
		this.ticketpreis = basispreis/TICKETS;
		return ticketpreis;
	}
}
