
public abstract class Tickets {
	
	protected String veranstaltungsort;
	protected String veranstaltungsname;
	private double basispreis;
	protected double ticketpreis;  
	
	abstract double berechneTicketpreis();
	
	//Konstruktor
	public Tickets(String name, String ort, double preis) {
		veranstaltungsort = ort;
		veranstaltungsname = name;
		ticketpreis = preis;
	}
	public double getbasispreis() {
		return basispreis;
	}
	public void ausgabe() {
		System.out.println("Veranstaltungsname: "+veranstaltungsname);
		System.out.println("Veranstaltungsort: "+veranstaltungsort);
		System.out.println("Preis pro Ticket: "+berechneTicketpreis()+" €");
	}
}
