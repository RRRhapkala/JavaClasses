
public class Statistics
{
    static int NumOfItems(int rangeMin,int rangeMax) {
        return rangeMax - rangeMin -1;    
    }
    static int SumOfNumbers(int rangeMin, int rangeMax) {
        return (rangeMin + rangeMax)/2 * NumOfItems(rangeMin, rangeMax);
    }
    static int ArimOfNumbers(int rangeMin, int rangeMax) {
        return SumOfNumbers(rangeMin, rangeMax) / NumOfItems(rangeMin, rangeMax);
    }
}
