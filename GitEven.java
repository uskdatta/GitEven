public class GitEven {
    public static void main(String[] args) {
        int[] arr={1,4,3,6,8,9,10};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0) System.out.println("Even - "+arr[i]);
            else System.out.println("Odd - "+arr[i]);
        }
    }
}
