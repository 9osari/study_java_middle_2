package collection.compare.test;

public class Card implements Comparable<Card> {
    private int num;
    private String pattern;

    public Card(int num, String pattern) {
        this.num = num;
        this.pattern = pattern;
    }

    public int getNum() {
        return num;
    }
    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        String symbol = "";
        if(pattern.equals("Spade")) {
            symbol = "\u2660";
        } else if(pattern.equals("Heart")) {
            symbol = "\u2665";
        } else if(pattern.equals("Club")) {
            symbol = "\u2663";
        } else if(pattern.equals("Diamond")) {
            symbol = "\u2666";
        }

        return num + "(" + symbol + ")";
    }

    @Override
    public int compareTo(Card o) {
        if(this.num < o.num) {
            //작은 숫자가 먼저 나오는 경우
            return -1;
        } else if(this.num > o.num) {
            //같은 숫자의 경우
            return 1;
        } else {
            //같은 숫자의 경우 ♠, ♥, ♦, ♣ 순으로 정렬
            int thisPatternOrder = getPattern(this.pattern);
            int otherPatternOrder = getPattern(o.pattern);
            if(thisPatternOrder < otherPatternOrder) {
                return -1;
            } else if(thisPatternOrder > otherPatternOrder) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private int getPattern(String pattern) {
        int symbol = 0;
        if(pattern.equals("Spade")) {
            symbol = 1;
        } else if(pattern.equals("Heart")) {
            symbol = 2;
        } else if(pattern.equals("Club")) {
            symbol = 3;
        } else if(pattern.equals("Diamond")) {
            symbol = 4;
        }
        return symbol;
    }
}
