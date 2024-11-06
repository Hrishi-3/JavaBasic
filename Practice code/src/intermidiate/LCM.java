package intermidiate;

public class LCM {
    public static void main(String args []){
        int num1 = 12;
        int num2 = 44;
        int lcm =0;
        int max = (num1>num2)? num1 : num2;
        for (int i= max; i<= num1 * num2; i+=max){
            if (i%num1==0 && i%num2==0){
                lcm =i;
                break;
            }
        }
        System.out.println(lcm);
        // also i can find hcf using this formula 
        int hcf = (num1*num2)/lcm;
        System.out.println(hcf);
        //same goes with hcf program if you have to find lcm 
    }
}
