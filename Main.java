import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Hauptmenu();
	}

	public static void Hauptmenu() {
		System.out.println("***************");
		System.out.println("*  Hauptmenü  *");
		System.out.println("***************");
		System.out.println("");
		System.out.println("Es stehen folgende operationen zur verfügung:");
		System.out.println("   (1)  addieren");
		System.out.println("   (2)  Lesen");
        System.out.println("   (3)  Ändern");
        System.out.println("   (4)  Entfernen");
        System.out.println("   (5)  Alle zeigen");
		System.out.println("");
		System.out.println("   (6)  Programm beenden");
		System.out.println("");
		System.out.println("Was möchten Sie tun:");
        checkint();
		int w = scanner.nextInt();
		switch (w) {
			case 1: add();
				break;
			case 2: Read();
				break;
			case 3: Edit();
				break;
			case 4:entfernen();
			break;
            case 5:ReadAll();
                break;
            case 6:
                break;
			default:	System.out.println("Ungültig Eingabe. Nochmal:");
                Hauptmenu();
				break;
		}
	}


	public static void add() {
		System.out.println("ID : ");
        checkint();
			int id = scanner.nextInt();

        System.out.println("Autor : ");
        String autor  = scanner.next();

        System.out.println("Titel : ");
        String titel  = scanner.next();

        System.out.println("ISBN : ");
        checkint();
        int iSBN = scanner.nextInt();

        System.out.println("Verlag : ");
        int verlag =  checkintR(1,5,false);

        System.out.println("Erscheinungsjahr : ");
        int erscheinungsjahr =   checkintR(1,2017,true);

        Books.add(new Books(id,  autor,  titel,  iSBN,  verlag,  erscheinungsjahr));

        System.out.println("");
        Hauptmenu();
    }
    public static void Read() {
        System.out.println("Index : ");
        if(Books.getAnzahl() == 0){
            System.out.println("kein Bücher noch");
            Hauptmenu();
        }else{
        int index = checkintR(1,Books.getAnzahl(),false);
        Books.read(index-1);

        System.out.println("");
        Hauptmenu();
    }}

    public static void entfernen() {
        System.out.println("Index : ");
        if(Books.getAnzahl() == 0){
            System.out.println("kein Bücher noch");
            Hauptmenu();
        }else{
        int index = checkintR(1,Books.getAnzahl(),false);
        Books.entfernen(index-1);

        System.out.println("");
        Hauptmenu();
    }}


	public static void Edit() {
        System.out.println("Index : ");
        if(Books.getAnzahl() == 0){
            System.out.println("kein Bücher noch");
            Hauptmenu();
        }else{
        int index = checkintR(1,Books.getAnzahl(),false);

        System.out.println("ID : ");
            checkint();
        int id = scanner.nextInt();

        System.out.println("Autor : ");
        String autor  = scanner.next();

        System.out.println("Titel : ");
        String titel  = scanner.next();

        System.out.println("ISBN : ");
            checkint();
        int iSBN = scanner.nextInt();

        System.out.println("Verlag : ");
        int verlag =  checkintR(1,5,false);

        System.out.println("Erscheinungsjahr : ");
        int erscheinungsjahr =   checkintR(1,2017,true);

        Books.edit(index-1,new Books(id,  autor,  titel,  iSBN,  verlag,  erscheinungsjahr));
        System.out.println("");
        Books.read(index-1);
        System.out.println("");
        Hauptmenu();
	}}

    public static void ReadAll() {
        Books.readAll();

        System.out.println("");
        Hauptmenu();
    }

    public static int checkintR(int start,int end,boolean jahr) {
        checkint();
	    int value = scanner.nextInt();

        while (value < start || value > end){
            if (jahr) {
                System.out.println("Bitte geben Sie nur Jahr als Zahlen ein:");
            }else{
                System.out.println("Bitte geben Sie nur Zahlen ein ("+start+" bis "+end+"):");
            }
            return checkintR(start,end,jahr);
        }
           return value;
    }
    public static void checkint() {
        while (!scanner.hasNextInt()) {
            System.out.println("Bitte geben Sie nur Zahlen ein:");
            scanner.next();
        }
    }
	

}
