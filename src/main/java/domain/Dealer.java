package domain;

import java.util.List;
import java.util.stream.Collectors;

public class Dealer extends Player {
    private static final String DEALER_NAME = "딜러";
    private final Deck deck;
    private final List<Player> players;

    public Dealer(final List<String> names) {
        super(DEALER_NAME);
        deck = new Deck();
        players = names.stream()
                .map(Player::new)
                .collect(Collectors.toList());
    }

    public void init() {
        for (Player player : players) {
            player.drawCard(deck);
            player.drawCard(deck);
        }
    }

    public void drawCard(String playerName) {
        Player player = findPlayer(playerName);
        player.drawCard(deck);
    }

    private Player findPlayer(String playerName) {
        return players.stream()
                .filter(player -> player.getName().equals(playerName))
                .findFirst()
                .orElseThrow();
    }

    public List<Card> getCards(String playerName) {
        return findPlayer(playerName).getCards();
    }
}
