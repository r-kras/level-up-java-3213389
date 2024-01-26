package com.linkedin.javacodechallenges;
class easyPrograms {
    // Even or Odd
    public static boolean isEven(int number) {
        return (number % 2 == 1);
    }
    
    // Password Complexity
    public static boolean isPasswordComplex(String password) {
        return (password.length() > 5 
        && password.matches(".*[A-Z].*")
        && password.matches(".*[a-z].*")
        && password.matches(".*\\d.*"));
    }

    // Calculate Water Bill
    public static double calculateWaterBill(double gallonsUsage) {
        double extra = (Math.ceil(gallonsUsage/748) - 2);
        return extra > 0 ? 18.84 + 3.9 * extra : 18.84;
    }

    public static void main(String[] args) {
        //System.err.println(isPasswordComplex("Five09"));
        /*
        DoubleOrNothing game = new DoubleOrNothing();
        game.playGame();
        */
        //System.out.println(calculateWaterBill(2000));
        Person garry = new Person("Garry", "Blythe");
        short age = 41;
        garry.setAge(age);
        garry.introduction();
    }
}