import java.util.ArrayList;
import java.util.List;

public  class  Books implements Bibliotik{
	
	private int id ;
	private String autor;
	private String titel;
	private int ISBN;
	private int Verlag;
	VerlagListe.Verlag verlagName;
	private int Erscheinungsjahr;

    private static List<Books> list = new ArrayList<Books>(5);
	
	public Books(int id, String autor, String titel, int iSBN, int verlag, int erscheinungsjahr) {
		super();
		this.id = id;
		this.autor = autor;
		this.titel = titel;
		ISBN = iSBN;
		Verlag = verlag;
		Erscheinungsjahr = erscheinungsjahr;
	}
	

	public static int getAnzahl() {
		return list.size();
	}


	public static void add(Books x) {
		list.add(x);
	}

	public static void edit(int index,Books x) {
		list.set(index,x);
	}


	public static void read(int index) {
		System.out.println(list.get(index).toString());
		}

	public static void entfernen(int index) {
	list.remove(index);
	}


	public static void readAll() {
		int i = 1;
		for(Books b :list){
			System.out.println(i +": "+  b.toString());
			i++;
		};
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getVerlag() {
		return Verlag;
	}

	public void setVerlag(int verlag) {
		Verlag = verlag;
	}

	public static Books getBook(int index) {
		return list.get(index);
	}

	private String getVerlagName (){
		switch (getVerlag()){
		case 1: verlagName = VerlagListe.Verlag.Verlag1;
		break;
		case 2: verlagName = VerlagListe.Verlag.Verlag2;
			break;
		case 3: verlagName = VerlagListe.Verlag.Verlag3;
			break;
		case 4: verlagName = VerlagListe.Verlag.Verlag4;
			break;
		case 5: verlagName = VerlagListe.Verlag.Verlag5;
			break;
		default: verlagName = VerlagListe.Verlag.Verlag1;
			break;
		}

		return verlagName.getVarlagName();
	}

	public int getErscheinungsjahr() {
		return Erscheinungsjahr;
	}

	public void setErscheinungsjahr(int erscheinungsjahr) {
		Erscheinungsjahr = erscheinungsjahr;
	}
	
	@Override
	public String toString() {
		return "Buch ID =" + id + " ,Autor = " + autor + " ,Titel = " + titel + " ,ISBN = " + ISBN + " ,Verlag Name = " + getVerlagName() +" ,Erscheinungsjahr = " +  Erscheinungsjahr;
		
	}


}
