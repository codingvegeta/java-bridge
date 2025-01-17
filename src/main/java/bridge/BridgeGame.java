package bridge;

import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    BridgeMaker bridgeMaker = BridgeMaker.getInstance();

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public boolean move(int inputCount, String readMoving) {
        boolean result = false;
        String input = readMoving;
        if (bridgeMaker.bridge.get(inputCount).equals(input)) {
            return true;
        }
        if (!bridgeMaker.bridge.get(inputCount).equals(input)) {
            return false;
        }
        return result;
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public String retry(String readGameCommand) {
        String str = "";
        String result = readGameCommand;
        if (result.equals("R")) {
            return "retry";
        }
        if (result.equals("Q")) {
            return "실패";
        }
        return str;
    }
}
