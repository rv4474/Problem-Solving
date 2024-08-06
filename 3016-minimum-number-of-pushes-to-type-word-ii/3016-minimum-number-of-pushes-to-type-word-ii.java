class Pair {
    char character;
    int value;

    public Pair(char character, int value) {
        this.character = character;
        this.value = value;
    }
    
    @Override
    public String toString() {
        return "(" + character + ", " + value + ")";
    }
}

class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (Character c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            set.add(c);
        }

        int l = map.size();
        if (l <= 8) return word.length();

        Comparator<Pair> maxHeapComparator = new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return Integer.compare(p2.value, p1.value);
            }
        };

        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(maxHeapComparator);
        for (char c : set) {
            maxHeap.add(new Pair(c, map.get(c)));
        }

        int a = 1, sum = 0;
        while (!maxHeap.isEmpty()) {
            Pair p = maxHeap.poll();
           
            if (a <= 8) {
                sum += p.value;
            } else if (a <= 16) {
                sum += p.value * 2;
            } else if (a <= 24) {
                sum += p.value * 3;
            } else {
                sum += p.value * 4;
            }
            a++;
        }

        return sum;
    }

}
