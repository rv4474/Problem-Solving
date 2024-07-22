class Solution {
    static void bubbleSort(int[] arr,String[] num) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    String s=num[j];

                    arr[j] = arr[j+1];
                    num[j] = num[j+1];

                    arr[j+1] = temp;
                    num[j+1] = s;
                }
            }
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        bubbleSort(heights,names);
        return names;
    }
}