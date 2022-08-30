package sample;

public class Coin extends Item {
        private int noCoin = 0;
        private String coinCT = "0";

        public int getNoCoin() {
                return noCoin;
        }

        void addCoin(){
                noCoin++;
        }
}
