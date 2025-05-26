public class GitEven {
    public static void main(String[] args) {
        int[] arr={1,4,3,6,8,9,10};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) System.out.println("Even - "+arr[i]);
            else System.out.println("Odd - "+arr[i]);
            for(int j=1;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
        }
        System.out.println("Total number of prime numbers in the array: "+count);
    }
}
