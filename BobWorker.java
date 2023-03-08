public class BobWorker implements Runnable{
    @Override
    public void run() {
        Heart bob = new Heart("white", 10, 10, 4);
        for (int i =0;i<40;i++) {
            bob.drawHeart(((i + 1) * 10) + 10, ((i + 1) * 10) + 10);
            if(i%2 == 0) {
                        bob.chColor("yellow");
                    }else{
                        bob.chColor("white");
                    }
        }
    }
}
