public class SearchinRange {
    public static void main( String[] args) {
        // In search in range isn't anything new just we are searching in a particular range we can take the previous example
        // lets say we want to search from index 1 to 4

        int[] elements = {32,1,4,56,53,23};

        int target = 56;

        int ans = linearSearch(elements,target,1,4);

        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0 ){
            return -1;
        }

        for (int i = start; i < end ; i++ ) {

            int ele = arr[i];
            if( ele == target ) {
                return i;
            }
        }

        return -1;
    }
}