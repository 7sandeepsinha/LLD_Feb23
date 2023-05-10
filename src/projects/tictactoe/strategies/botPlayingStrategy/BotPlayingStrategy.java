package projects.tictactoe.strategies.botPlayingStrategy;

import projects.tictactoe.models.Board;
import projects.tictactoe.models.Bot;
import projects.tictactoe.models.Move;
import projects.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
