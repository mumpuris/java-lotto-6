package lotto.domain;

import java.util.List;

public class LottoMachine {

    private static final int LOTTO_PRICE = 1000;

    private List<Integer> winningNumbers; //매주 토요일 오후 8시 35분
    private static final LottoMachine instance = new LottoMachine();

    private LottoMachine() {}

    public static LottoMachine getInstance() {
        return instance;
    }

}
