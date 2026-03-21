class SimpleInterest {
    public static void main(String[] args) {
        double principal = 1500.99;
        double rateOfInterest = 4.75;
        double time = 5.1;
        double calculation = principal *rateOfInterest*time/100;
        System.out.println("Simple Interest Of "+principal+" amount with "+rateOfInterest+" rate of interest for "+time+" year time the result is: "+calculation);
    }
}
