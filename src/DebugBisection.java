public class DebugBisection {
    public static void main(String args[]) {
        float x =  0.750f;
        /*float r =x * x * x + 3 * x - 5;*/
        float r = (float) (3 * x - Math.cos(x) -1);
        System.out.println(r);
    }
}
