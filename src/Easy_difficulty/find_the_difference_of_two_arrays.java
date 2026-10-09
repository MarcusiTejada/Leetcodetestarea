package Easy_difficulty;


import java.util.*;


public class find_the_difference_of_two_arrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        Set<Integer> unique = new HashSet<>();
        Set<Integer> unique2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            unique.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            unique2.add(nums2[i]);
        }

        for (int num : unique) {
            if (!unique2.contains(num)) {
                res.get(0).add(num);
            }
        }
        for (int num : unique2) {
            if (!unique.contains(num)) {
                res.get(1).add(num);
            }
        }


        return res;
    }
}
