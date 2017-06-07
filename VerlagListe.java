
public class VerlagListe {
public enum Verlag {
	Verlag1 ("verlag_1"),
	Verlag2 ("verlag_2"),
	Verlag3 ("verlag_3"),
	Verlag4 ("verlag_4"),
	Verlag5 ("verlag_5");
	private final String name;
	Verlag(String verlagname){
		name = verlagname;
	}
	public String getVarlagName(){
		return name;
	}
}

}
