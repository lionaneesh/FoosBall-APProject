package foosball.environment;

import foosball.strategy.Team;

public class Rods {
	public int x;
	public Team team;
	public int number_of_players;
	public int start;

	public Rods(int x, Team team, int start, int number_of_players) {
		this.x = x;
		this.team = team;
		this.number_of_players = number_of_players;
		this.start = start;
	}
}