package leet75;


public class Can_place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        if (n == 0) {
            return true;
        }

        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n == 1;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (count == n) {
                break;
            }
            if (i == 0) {
                if (flowerbed[1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count == n;
    }
}
