class Arrays_example{
    void demoarray(){
        int[] ages = new int[3];
        // float[] weights = new float[3];
        // String[] names = new String[3];
        ages[0] =1;
        ages[1] = 2;
        ages[2]=3;
        for(int i=0;i<3;i++){
            System.out.println(ages[i]);
        }
    }

}
public class arrays{
    public static void main(String[] args) {
        Arrays_example ex1 = new Arrays_example();
        ex1.demoarray();
        int[][] tilak = {{11,12},{13,14}};
        for (int  i=0;i<2;i++){
            for(int j =0;j<2;j++){
                System.out.println(tilak[i][j]);
            }
        }
        
    }
}