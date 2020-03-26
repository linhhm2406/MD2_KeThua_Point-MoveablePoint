public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0,0,15,15);
//        MovablePoint movablePoint = new MovablePoint(0,0,15,15);
        movablePoint.move();
        movablePoint.move();
        movablePoint.move();
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
