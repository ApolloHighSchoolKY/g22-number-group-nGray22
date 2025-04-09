public class Range implements NumberGroup {
    private int val1;
    private int val2;

    public range(int a, int b){
        val1 = a;
        val2 = b;
    }
    toString(){
        for(int i= val1; i<=val2; i++)
         System.out.println(i);
    }
    
}
