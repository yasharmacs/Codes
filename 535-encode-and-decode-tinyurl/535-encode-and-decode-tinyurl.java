public class Codec {

    Map<String,String> store=new HashMap<>();
    private final String pre="https://leetcode.com/problems/";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int hash=longUrl.hashCode();
        int random=(int)(Math.random()*1000);
        String shortUrl = pre+hash+random;
        store.put(shortUrl,longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return store.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));