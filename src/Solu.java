public class Solu {
    public static int maxArea(int[] height) {
        // we are given a list and we have to iterate backwards to find the maximum surface area there
        //TODO: you have to create the endpoints validation. now we are assuming that the list has 2 or more elements

        int min_height = 0;
        int width = 0;
        int start = 0;
        int reverse = height.length - 1;
        // iterate thru the list and calculate the min height
        for (int counter = 0; counter < height.length; counter++) {

            // calc the min height
            if (height[start] > height[reverse]) min_height = height[reverse];
            else min_height = height[start];

            if (height[counter] > min_height){
                if (min_height == height[start]) start = counter;
                else reverse = counter;
            }
            width = reverse - start;
        }
        return width * min_height;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
