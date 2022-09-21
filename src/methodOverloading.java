public class methodOverloading {
    public static void main(String[] args){
        int newScore = calculateScore("Masoom", 250);
        System.out.println(newScore +" Total score after bonus.");
        calculateScore(500);
        calculateScore();

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" Scored "+score+".");
        return score+100;
    }
    public static int calculateScore(int score){
        System.out.println("Print only Score "+score+".");
        return score+100;
    }
    public static int calculateScore(){
        return 0;
    }

}
