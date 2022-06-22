class Solution {
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        ans.addAll(freqMap.keySet());

        Collections.sort(ans, (o1, o2) -> {
            if (freqMap.get(o1) == freqMap.get(o2)) {
                return o1.compareTo(o2);
            }

            return freqMap.get(o2) - freqMap.get(o1);
        });

        return ans.subList(0, k);
    }
}
/*
public List<String> topKFrequent_pq(String[] words, int k) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<String>((word1, word2) -> {
            if (countMap.get(word1) == countMap.get(word2)) {
                return word2.compareTo(word1);
            }
            return countMap.get(word1) - countMap.get(word2);
        });

        for (String word : countMap.keySet()) {
            pq.offer(word);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
*/