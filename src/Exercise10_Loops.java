public class Exercise10_Loops {
    public static void main(String args[]){
        for (int i =1 ; i <=4; i++){
            for (int j= 1; j<=i; j++){
                System.out.print("*"+ " ");
            }
            for (int k =7; k>=2*i ; k--){
                System.out.print(" "+ " ");
            }
            for (int j= 1; j<=i; j++){
                System.out.print("*"+ " ");
            }

            System.out.println();
        }
        for (int i =1 ; i <=4; i++){
            for (int j= 4; j>=i; j--){
                System.out.print("*"+" ");
            }
            for (int k =3; k<=2*i; k++){
                System.out.print(" "+ " ");
            }
            for (int j= 4; j>=i; j--){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}

