public class Player {
    private String name;
    private int age;
    private String type;
    private int[] statistics;


    public Player(String name, int age, String type, int[] statistics){
        this.name = name;
        this.age = age;
        this.type = type;
        this.statistics = statistics;
    }


    public double getAverage() {
        int total = 0;
        double average;
        for (int i = 0; i < 15; i++) {
            total += statistics[i];
        }

        if (total > 0) {
            average = total / 15;
            //System.out.println("Bowling/ Batting Average: " + average);
            return average;

        } else {
            System.out.println("Average can not be calculated (total = 0)");
            return 0.0;
        }
    }

    public void getPlayerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Type: " + type);
        for (int i = 0; i < 15; i++) {
            int score = statistics[i];
            System.out.println("Match " + (i+1) + " : " + score);
        }
    }

    public int getBestPerformance() {
        int maxScore = 0;
        for (int i = 0; i < 15; i++) {
            if (maxScore < statistics[i]) {
                maxScore = statistics[i];
            }
        }
        //System.out.println("Best performance :" + maxScore);
        return maxScore;
    }

    public String getPlayerType() {
        //System.out.println("Player type: " + type);
        return type;
    }

}


