public class Player {
    private String name;
    private int age;
    private String type;
    private int[] statistics = new int[15];


    public Player(){
        
    }


    public void getAverage() {
        int total = 0;
        for (int i = 0; i < 15; i++) {
            total += statistics[i];
        }

        if (total > 0) {
            double average = total / 15;
            System.out.println("Bowling/ Batting Average: " + average);
            //return average;
        } else {
            System.out.println("Average can not be calculated (total = 0)");

        }

    }

    public void getPlayerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        for (int i = 0; i < 15; i++) {
            int score = statistics[i];
            System.out.println("Match " + i + " : " + score);
        }
    }

    public void getBestPerformance() {
        int maxScore = 0;
        for (int i = 0; i < 15; i++) {
            if (maxScore < statistics[i]) {
                maxScore = statistics[i];
            }
        }
        System.out.println("Best performance :" + maxScore);
    }

    public void getPlayerType() {
        System.out.println("Player type: " + type);
    }

}


