package test;

import model.Coin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CoinTest {
    private Coin coin;

    @Before
    public void setup(){
        coin = new Coin();
    }

    @Test
    public void testAlwaysGettingSameValue() {
        int timeChanged = 0;
        coin.flip();
        String lastStatus = coin.checkStatus();
        for(int i=0; i<5; i++) {
            coin.flip();
            String status = coin.checkStatus();
            if(!(status.equals(lastStatus))){
                timeChanged++;
                lastStatus = status;
            }
        }
        assertFalse(timeChanged==0);
    }

    @Test
    public void testFlipRandomness(){
        String lastStatus = "heads";
        int longestRunOfSameAnswer = 0;
        int currentRun = 0;
        for (int i=0; i<100; i++){
            coin.flip();
            String status = coin.checkStatus();
            System.out.println(status);
            if (status.equals(lastStatus)){
                currentRun++;
                if (currentRun > longestRunOfSameAnswer){
                    longestRunOfSameAnswer = currentRun;
                }
            }
            else {
                lastStatus = status;
                currentRun = 0;
            }
        }
        assertFalse(longestRunOfSameAnswer>10);
    }
}
