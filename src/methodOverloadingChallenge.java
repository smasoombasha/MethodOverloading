public class methodOverloadingChallenge {
    public static void main(String[] args){

       double total = calcFeetAndInchesToCentimeters(0, 6);
        if(total < 0){
            System.out.println("Invalid Values of Feet Or Inch.");
        }else{
            System.out.println("calculation of FeetandInchesToCentimeter "+total);
        }
        calcFeetAndInchesToCentimeters(156);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && (inches >=0 && inches <= 12)){
             double feetcenti = feet * 30.48;
             double inchcenti = inches * 2.54;
            double totalCentimeters = feetcenti + inchcenti;
            System.out.println("Feet to Centimeter "+feetcenti+". Inches to Centimeter "+inchcenti+". total Centimeters"+totalCentimeters+".");
            return totalCentimeters;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0){
            double totalFeets =(int) inches / 12;
            double remaininginches = (int) inches % 12;
            System.out.println("Inches are equal to "+totalFeets+" Feets. And remaining inches "+remaininginches);
            return calcFeetAndInchesToCentimeters(totalFeets, remaininginches);
        }
        return -1;
    }
}
