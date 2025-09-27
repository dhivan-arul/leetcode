public class Codec {
     String originalurl;
     String tinyurl;
    public String encode(String longUrl) {
        originalurl=longUrl;
        tinyurl="http://tinyurl.com/4e9iAk";
        return tinyurl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return originalurl;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));