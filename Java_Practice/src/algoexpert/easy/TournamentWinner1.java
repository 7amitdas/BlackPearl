package algoexpert.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Coding Interview Questions
 * Tournament Winner Solution 1
 * {@link} https://www.algoexpert.io/questions/tournament-winner
 * 
 * @author Amit Das
 */

public class TournamentWinner1 {

	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		// Write your code here.
		Map<String, Integer> teamResultCount = new HashMap<>();
		String teamName = "";
		String winningTeamName = "";
		int winningTeamPoint = 0;
		for ( int eachMatch = 0; eachMatch < competitions.size(); eachMatch++ ) {
			if (results.get(eachMatch) == 1) {
				teamName = competitions.get(eachMatch).get(0);
				teamResultCount.put(teamName, teamResultCount.containsKey(teamName) ? teamResultCount.get(teamName) + 3 : 3);
			} else {
				teamName = competitions.get(eachMatch).get(1);
				teamResultCount.put(teamName, teamResultCount.containsKey(teamName) ? teamResultCount.get(teamName) + 3 : 3);
			}
		}
		for ( Map.Entry<String, Integer> team : teamResultCount.entrySet() ) {
			if (team.getValue() > winningTeamPoint) {
				winningTeamName = team.getKey();
				winningTeamPoint = team.getValue();
			}
		}
		return winningTeamName;
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> competitions = new ArrayList<>();
		ArrayList<Integer> results = new ArrayList<>();
		ArrayList<String> mat1 = new ArrayList<>();
		mat1.add("HTML");
		mat1.add("C#");
		ArrayList<String> mat2 = new ArrayList<>();
		mat2.add("C#");
		mat2.add("Python");
		ArrayList<String> mat3 = new ArrayList<>();
		mat3.add("Python");
		mat3.add("HTML");
		competitions.add(mat1);
		competitions.add(mat2);
		competitions.add(mat3);
		results.add(0);
		results.add(0);
		results.add(1);
		TournamentWinner1 t = new TournamentWinner1();
		System.out.println(t.tournamentWinner(competitions, results));
	}
}