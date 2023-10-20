package baseball.service.impl;

import java.util.ArrayList;
import java.util.List;

import baseball.service.RandomCodeService;
import camp.nextstep.edu.missionutils.Randoms;

public class RandomCodeServiceImpl implements RandomCodeService {

	@Override
	public List<Integer> makeRandomCodeList() {
		List<Integer> codes = new ArrayList<>();
		while (codes.size() < 3) {
			int randomNumber = Randoms.pickNumberInRange(1, 9);
			if (!codes.contains(randomNumber)) {
				codes.add(randomNumber);
			}
		}
		return codes;
	}
}
