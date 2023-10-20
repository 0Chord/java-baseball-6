package baseball.service.impl;

import baseball.service.ValidateJudgeService;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidateJudgeServiceImpl implements ValidateJudgeService {
    @Override
    public String validateCodes(List<Integer> baseballCode, List<Integer> userCode) {
        return null;
    }

    @Override
    public void validateLegalUserCode(List<Integer> userCode) {
        Set<Integer> userCodeSet = new HashSet<>(userCode);
        if (userCode.size() != 3 && userCodeSet.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean restartValidateCode(Integer code) {
        if (code == 1) {
            return true;
        } else if (code == 2) {
            return false;
        }
        throw new IllegalArgumentException();
    }


}
