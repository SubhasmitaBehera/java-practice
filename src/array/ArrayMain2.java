package array;

public class ArrayMain2 {
    public static void main(String[] args) {
        int i ,j ,k=0 ;
        int arr[][][] = {  { {10,20},{30,40},{50,60} } , {{60,70},{70,80},{90,100} }  };     //| {10,20}     {30,40}    {50,60} |
        for(i=0 ; i<2 ;i++){                                                                // |                                |
            for(j=0 ; j<3 ; j++){                                                          //  |{60,70}     {70,80}    {90,100} |
                for(k=0 ; k<2 ; k++){
                    System.out.println("arr ["+i+"]["+j+"]["+k+"] = " + arr[i][j][k]);
                }
            }
            System.out.println("______________________________________");
        }

    }
}
