package Easy_difficulty;


import java.util.*;


public class find_the_difference_of_two_arrays {

    // Boolean array: values are in [-1000, 1000], so shift by 1000 to index 0..2000
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        boolean[] seen1 = new boolean[2001];
        boolean[] seen2 = new boolean[2001];

        for (int x : nums1) seen1[x + 1000] = true;
        for (int x : nums2) seen2[x + 1000] = true;

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 2001; i++) {
            if (seen1[i] && !seen2[i]) a.add(i - 1000);
            if (seen2[i] && !seen1[i]) b.add(i - 1000);
        }

        return List.of(a, b);
    }

    // HashSet version (11ms, beats 42.89%)
    public List<List<Integer>> findDifferenceHashSet(int[] nums1, int[] nums2) {

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
