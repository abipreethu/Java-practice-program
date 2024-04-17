package polymorphism;

public class TempleRun extends Game {
	public String name(String gameName) {
		return gameName+" Welcome";
	}
	
	public int howManyLevels(int levels) {
		return levels+10;
	}
}
