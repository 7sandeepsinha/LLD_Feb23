package projects.tictactoe.factories;

import projects.tictactoe.models.BotDifficultyLevel;
import projects.tictactoe.strategies.botPlayingStrategy.BotPlayingStrategy;
import projects.tictactoe.strategies.botPlayingStrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return new RandomBotPlayingStrategy();
    }
}
