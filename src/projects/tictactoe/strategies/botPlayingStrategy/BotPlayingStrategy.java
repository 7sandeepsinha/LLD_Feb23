package projects.tictactoe.strategies.botPlayingStrategy;

import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player);
}
