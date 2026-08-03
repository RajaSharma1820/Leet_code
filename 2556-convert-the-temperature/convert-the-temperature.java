class Solution {
    public double[] convertTemperature(double celsius) {
        double ff = (celsius*1.80+32.00);
        double kk = celsius+273.15;
        return new double[] {kk,ff};
    }
}