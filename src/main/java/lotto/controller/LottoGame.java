package lotto.controller;

import camp.nextstep.edu.missionutils.Console;
import lotto.domain.UserLotto;

public class LottoGame {
    private UserLotto user = new UserLotto();


    public LottoGame() {
        printPurchaseAmount();

        int input = user.setPurchaseAmount();
        user.validateUnit(input);

        System.out.println();
        System.out.println(input/1000+"개를 구매했습니다.");
        setPurchaseAmountLotto(input/1000);

        user.getPurchaseLottoNumbers();
    }

    public void setPurchaseAmountLotto(int input){
        while(input>0){
            user.setRandomNumber();
            input--;
        }
    }


    public void printPurchaseAmount(){
        System.out.println("구입 금액을 입력해주세요.");
    }


}
