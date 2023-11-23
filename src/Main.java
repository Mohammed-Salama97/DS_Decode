public class Main {
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 4};
        Array<Integer> array = new Array<>();
        array.Resize(nums, 5);
        System.out.println(nums.length);
    }
}
