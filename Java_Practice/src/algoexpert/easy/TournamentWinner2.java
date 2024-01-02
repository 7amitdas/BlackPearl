package algoexpert.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Coding Interview Questions
 * Tournament Winner  Solution 2
 * {@link} https://www.algoexpert.io/questions/tournament-winner
 * 
 * @author Amit Das
 */

public class TournamentWinner2 {

	public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
		// Write your code here.
		Map<String, Integer> teamResultCount = new HashMap<>();
		String winningTeamName = "";
		int winningTeamScore = 0;
		String tourWinnerTeam = "";
		int tourWinnerPoint = 0;
		for ( int eachMatch = 0; eachMatch < competitions.size(); eachMatch++ ) {
			winningTeamName = competitions.get(eachMatch).get(results.get(eachMatch) == 1 ? 0 : 1);
			winningTeamScore = teamResultCount.containsKey(winningTeamName) ? teamResultCount.get(winningTeamName) + 3 : 3;
			if (winningTeamScore > tourWinnerPoint) {
				tourWinnerPoint = winningTeamScore;
				tourWinnerTeam = winningTeamName;
			}
			teamResultCount.put(winningTeamName, winningTeamScore);
		}
		return tourWinnerTeam;
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
		TournamentWinner2 t = new TournamentWinner2();
		System.out.println(t.tournamentWinner(competitions, results));
	}
}