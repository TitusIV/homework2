public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Task 1");
        byte pen = 124;
        int pencil = 133;
        short rubber = 88;
        long paper = 257L;
        float inc = 3.8f;
        double tea = 6.5E00;
        boolean day = 24 > 12;
        char y = 20;
        System.out.println("Done");

        //Задание 2
        System.out.println("Task 2");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var commonWeight = boxer1 + boxer2;
        System.out.println("Common weight of boxers is " + commonWeight + " kg");
        var weightDifference = (boxer1 - boxer2) * (-1);
        System.out.println("Difference in weight of boxers is " + weightDifference + " kg");

        //Задание 3
        System.out.println("Task 3");
        var banana = 80;
        var milk = 1.05;
        var icecream = 100;
        var egg = 70;
        var breakfast = (banana * 5 + milk * 200 + icecream * 2 + egg * 4) / 1000;
        System.out.println("The weight of breakfact is " + breakfast + "kg");

        //Задание 4
        System.out.println("Task 4");
        var min = 0.25;
        var max = 0.5;
        var kgToLose = 7;
        var maxDays = kgToLose / min;
        System.out.println("Maximum days to lose weight is " + maxDays);
        var minDays = kgToLose / max;
        System.out.println("Minimum days to lose weight is " + minDays);
        var average = (maxDays + minDays) / 2;
        System.out.println("Average number of days to lose weight is "+ average);

        // Задание 5
        System.out.println("Task 5");
        System.out.println("Rre-raise:");
        int wageMasha = 67760;
        int wageMashaYearly = wageMasha * 12;
        System.out.println("Masha's old yearly income is " + wageMashaYearly + " roubles");
        int wageDenis = 83690;
        int wageDenisYearly = wageDenis *12;
        System.out.println("Denis's old yearly income is " + wageDenisYearly + " roubles");
        int wageKristina = 76230;
        int wageKristinaYearly = wageKristina * 12;
        System.out.println("Kristina's old yearly income is " + wageKristinaYearly + " roubles");

        System.out.println("After a raise:");

        int newWageMasha = wageMasha + (wageMasha / 100) * 10;
        System.out.println("Now Masha earns " + newWageMasha + " roubles a month");
        int wageDifferenceMasha = newWageMasha - wageMasha;
        System.out.println("Her monthly wage has incrased by " + wageDifferenceMasha + " roubles");
        int newIncomeMasha = newWageMasha * 12;
        System.out.println("Masha's new yearly income is " + newIncomeMasha + " roubles");
        int yearlyIncomeDifferenceMasha = newIncomeMasha - wageMashaYearly;
        System.out.println("Masha's yearly income has increased by " + yearlyIncomeDifferenceMasha + " roubles");

        int newWageDenis = wageDenis + (wageDenis / 100) * 10;
        System.out.println("Now Denis earns " + newWageDenis + " roubles a month");
        int wageDifferenceDenis = newWageDenis - wageDenis;
        System.out.println("His monthly wage has incrased by " + wageDifferenceDenis + " roubles");
        int newIncomeDenis = newWageDenis * 12;
        System.out.println("Denis's new yearly income is " + newIncomeDenis + " roubles");
        int yearlyIncomeDifferenceDenis = newIncomeDenis - wageDenisYearly;
        System.out.println("Denis's yearly income has increased by " + yearlyIncomeDifferenceDenis + " roubles");

        int newWageKristina = wageKristina + (wageKristina / 100) * 10;
        System.out.println("Now Kristina earns " + newWageKristina + " roubles a month");
        int wageDifferenceKristina = newWageKristina - wageKristina;
        System.out.println("Her monthly wage has incrased by " + wageDifferenceKristina + " roubles");
        int newIncomeKristina = newWageKristina * 12;
        System.out.println("Kristina's new yearly income is " + newIncomeKristina + " roubles");
        int yearlyIncomeDifferenceKristina = newIncomeKristina - wageKristinaYearly;
        System.out.println("Kristina's yearly income has increased by " + yearlyIncomeDifferenceKristina + " roubles");

    }
}