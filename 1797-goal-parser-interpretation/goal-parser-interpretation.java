class Solution {
    public String interpret(String command) {
        String s=command.replace("()","o");
        String d=s.replace("(al)","al");
        return d;
    }
}