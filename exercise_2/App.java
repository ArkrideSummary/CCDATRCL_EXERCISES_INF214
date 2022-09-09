import java.util.LinkedList;

class App {
	public static void main(String[] args){
		LinkedList<String> playlist = new LinkedList<>();
		
		playlist.add("Royals by Lorde");
		playlist.add("ない ない by ReoNa");
		playlist.add("逆夢 by King Gnu");
		playlist.add("Without Me by Eminem");
		playlist.add("Let's Get It Started by Black Eyed Peas");

		playlist.addFirst("I Miss You by Falcom Sound Team JDK");
		playlist.addLast("Human by Rag'n'Bone Man");

		System.out.println(playlist.get(0));

		playlist.set(6, "Radioactive by Imagine Dragons");
		playlist.remove(0);

		System.out.println("My playlist are: " + playlist);
	}
}
