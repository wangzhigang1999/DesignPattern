public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男的给的评价是失败");
    }

    @Override
    public void getWomanResult(Women women) {
        System.out.println("女的给的评价是失败");
    }
}


