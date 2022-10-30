package lab_12_13;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public List<FlyAble> unableToFlyList (List<FlyAble> flyAblesList) {
        List<FlyAble> unableToFlyList = new ArrayList<>();
        for (FlyAble animal : flyAblesList) {
            if (!animal.isFlyAble()) {
                unableToFlyList.add(animal);
            }
        }
        return unableToFlyList;
    }

    public MoveAble winnerIs (List<MoveAble> moveAbleList) {
        MoveAble winner = moveAbleList.get(0);
        for (MoveAble animal : moveAbleList) {
            if (animal.speed() < winner.speed()) {
                winner = animal;
            }
        }
        return winner;
    }
}
