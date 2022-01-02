public class Solu {
    public static int maxArea(int[] height) {
        // we are given a list and we have to iterate backwards to find the maximum surface area there
        //TODO: you have to create the endpoints validation. now we are assuming that the list has 2 or more elements

        int min_height = 0;
        int width = 0;
        int start = 0;
        int reverse = height.length - 1;

        int mokMinH = 0;
        int mokStart = 0;
        int mokRev = height.length - 1;

        int area = 0;

        // iterate thru the list and calculate the min height
        for (int counter = 0; counter < height.length; counter++) {

            // calc the min height
            if (height[start] > height[reverse]){
                min_height = height[reverse];
                mokMinH = height[reverse];
            }
            else if (height[start] < height[reverse]){
                min_height = height[start];
                mokMinH = height[start];
            }
            if (height[counter] > min_height){
                if (mokMinH == height[mokStart]) mokStart = counter;
                else mokRev = counter;

                if (height[mokStart] > height[mokRev]){
                    mokMinH = height[mokRev];
                }
                else if (height[mokStart] < height[mokRev]){
                    mokMinH = height[mokStart];
                }
                // now if the mokarea with the new stuff is greater than the last one, do the change
                if (((mokRev - mokStart) * mokMinH) > area) {
                    if (min_height == height[start]) start = counter;
                    else reverse = counter;
                }
            }
            width = reverse - start;
            area = width * min_height;
        }
        return area;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
