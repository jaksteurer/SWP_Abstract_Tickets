
public class SubSportticket extends Tickets{
	
	private final int KOSTEN = 3000;
	private final int TICKETS = 7000;
	private final int SPIELERKOSTEN = 2500;

	public void ausgabe() {
		//System.out.println("\n-------------------------------------");
		System.out.println("--------------Sportticket--------------");
		System.out.println("Veranstaltung: "+this.veranstaltungsname);
		System.out.println("Veranstaltungsort: "+this.veranstaltungsort);
		System.out.println("Preis pro Ticket: "+ticketpreis+"€");
	}
	public SubSportticket(String name, String ort, double preis) {
		super(name, ort, preis);
		ausgabe();
	}
	double basispreis = getbasispreis()+KOSTEN+SPIELERKOSTEN;
	
	double berechneTicketpreis() {
		this.ticketpreis = basispreis/TICKETS;
		return ticketpreis;
	}
	
}

