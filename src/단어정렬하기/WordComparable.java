package 단어정렬하기;

public class WordComparable implements Comparable<WordComparable>{
    public String word;
    public WordComparable(String word) {
        this.word = word;
    }

    @Override
    public int compareTo(WordComparable o) {
        if (this.word.length() > o.word.length()) return 1;
        else if (this.word.length() == o.word.length()) return this.word.compareTo(o.word);
        else return -1;
    }
}
