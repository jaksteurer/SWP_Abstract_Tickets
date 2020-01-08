
public class SubKonzertticket extends Tickets {
	
	private final int KOSTEN = 4000;
	private final int MUSIKERKOSTEN = 3000;
	private final int TICKETS = 5000;
	
	public void ausgabe() {
		//System.out.println("\n---------------------------------------");
		System.out.println("\n-------------Konzertticket-------------");
		System.out.println("Veranstaltung: "+this.veranstaltungsname);
		System.out.println("Veranstaltungsort: "+this.veranstaltungsort);
		System.out.println("Preis pro Ticket: "+ticketpreis+"€");	
	}
	public SubKonzertticket(String name, String ort, double preis) {
		super(name, ort, preis);
		ausgabe();
	}
	double basispreis = getbasispreis()+KOSTEN+MUSIKERKOSTEN;

	double berechneTicketpreis() {
		this.ticketpreis = basispreis/TICKETS;
		return ticketpreis;
	}
}
