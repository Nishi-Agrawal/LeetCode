import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * @author: Nishi Agrawal
 */

/*
 * Link: https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 * 
 * Runtime: 7 ms, faster than 76.03% of Java online submissions
 * Memory Usage: 38.8 MB, less than 89.24% of Java online submissions 
 * 
 * Q- In a deck of cards, each card has an integer written on it.
 * 
 * Return true if and only if you can choose X >= 2 such that it 
 * is possible to split the entire deck into 1 or more groups of cards, where:
 * Each group has exactly X cards.
 * All the cards in each group have the same integer.
 * 
 */

public class DeckOfCards {

	public static boolean hasGroupsSizeX(int[] deck) {
		if (deck.length <= 1) {
			return false;
		}
		boolean flag = true;
		Map<Integer, Integer> hp = new HashMap<>();
		for (int i : deck) {
			hp.put(i, (1 + hp.getOrDefault(i, 0)));
		}

		ArrayList<Integer> listOfValues = new ArrayList<>(hp.values());
		int first = listOfValues.get(0);
		if (first < 2) {
			return false;
		}
		for (int i = 2; i <= deck.length / 2; i++) {
			flag = true;
			for (int j = 0; j < listOfValues.size(); j++) {
				if (listOfValues.get(j) % i != 0) {
					flag = false;
				}
			}
			if (flag) {
				return true;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		int[] deck = { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 };
		System.out.println(hasGroupsSizeX(deck));

	}

}
