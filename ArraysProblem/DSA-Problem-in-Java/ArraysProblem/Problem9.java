public class Problem9 {

    public static void findNumbers(int[] arr){

        int n = arr.length;

        int xor = 0;

        for(int i=0;i<n;i++){
            xor ^= arr[i];
            xor ^= (i+1);
        }

        int setBit = xor & -xor;

        int x = 0;
        int y = 0;

        for(int num : arr){
            if((num & setBit) != 0)
                x ^= num;
            else
                y ^= num;
        }

        for(int i=1;i<=n;i++){
            if((i & setBit) != 0)
                x ^= i;
            else
                y ^= i;
        }

        for(int num : arr){
            if(num == x){
                System.out.println("Repeating = "+x);
                System.out.println("Missing = "+y);
                return;
            }
        }

        System.out.println("Repeating = "+y);
        System.out.println("Missing = "+x);
    }

    public static void main(String[] args){

        int[] arr = {3,1,2,5,3};

        findNumbers(arr);
    }
}