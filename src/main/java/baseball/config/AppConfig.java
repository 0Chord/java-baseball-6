package baseball.config;

import baseball.game.BaseballGames;
import baseball.game.Game;
import baseball.game.GameLauncher;
import baseball.service.MessageGenerateService;
import baseball.service.RandomCodeService;
import baseball.service.UserCodeService;
import baseball.service.ValidateJudgeService;
import baseball.service.impl.MessageGenerateServiceImpl;
import baseball.service.impl.RandomCodeServiceImpl;
import baseball.service.impl.UserCodeServiceImpl;
import baseball.service.impl.ValidateJudgeServiceImpl;

public class AppConfig {

    public MessageGenerateService messageGenerateService() {
        return new MessageGenerateServiceImpl();
    }

    public RandomCodeService randomCodeService() {
        return new RandomCodeServiceImpl();
    }

    public UserCodeService userCodeService() {
        return new UserCodeServiceImpl();
    }

    public ValidateJudgeService validateJudgeService() {
        return new ValidateJudgeServiceImpl();
    }

    public Game baseballGame() {
        return new BaseballGames(validateJudgeService(), userCodeService(), messageGenerateService());
    }

    public GameLauncher gameLauncher() {
        return new GameLauncher(baseballGame(), randomCodeService(), validateJudgeService());
    }
}
