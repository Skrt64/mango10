public class HonWorker implements Runnable{
    @Override
    public void run() {
        Heart hon = new Heart("red", 0, 0, 5);
        for (int i =0;i<40;i++){
            hon.drawHeart((i*(-1))*10,(i+1)*10);
            if(i%2 == 0) {
                hon.chColor("blue");
            }else{
                hon.chColor("red");
            }
        }
    }
}
