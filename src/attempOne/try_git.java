package attempOne;

public class try_git {
	
	int  TotalNum() {
		int a = 232;
		int b = 3232;
		
		return a + b;
	}
		
	
	String Song = "Ahmed";
	String Lyrics = "Mara dobra ba isqhe";
	String SongWriter = "Fanoos";
	
	
	
	public try_git(String song, String lyrics, String songWriter) {
		super();
		Song = song;
		Lyrics = lyrics;
		SongWriter = songWriter;
	}



	public static void main(String[] args) {
		
		try_git n = new try_git("Ay Kash mara", "Hey Hey", "Rakesh");
		
		System.out.println(n.TotalNum());
		System.out.println(n.SongWriter);
		System.out.println(n.Song);
		System.out.println(n.Lyrics);
		
		
		
		
		
		
		
	}

}
