public class Heart {
    private final Turtle t = new Turtle();
    private final String color;


    public Heart(){
        this("black");
    }

    public Heart(String color){
        this(color, 0, 0);
    }

    public Heart(String color, double x, double y){
        this(color, x, y, 5);
    }

    public Heart(String color, double x, double y, double w){
        this(color, x, y, w, 10);
    }

    public Heart(String color, double x, double y, double w, double speed){
        this.t.setPosition(x, y);
        this.t.penColor(color);
        this.t.width(w);
        this.t.speed(speed);
        this.color = color;
    }

    public void drawHeart(){
        this.t.left(140);
        this.t.forward(113);
        for(int i=0;i<200;i++){
            this.t.right(1);
            this.t.forward(1);
        }
        this.t.left(120);
        for(int i=0;i<200;i++){
            this.t.right(1);
            this.t.forward(1);
        }
        this.t.forward(113);
    }
    public void drawHeart(double x, double y){
        this.t.up();
        this.t.setPosition(x, y);
        this.t.down();
        drawHeart();
    }
    public void drawHeart(String color, double x, double y){
        this.t.up();
        this.t.setPosition(x, y);
        this.t.penColor(color);
        this.t.down();
        drawHeart();
    }
    public void chColor(String color){
        this.t.penColor(color);
    }
}
