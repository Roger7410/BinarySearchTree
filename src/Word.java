public class Word implements Comparable<Word>{
    String str;
    int count;
    //public Word()
    public int compareTo(Word a){
        return this.str.compareTo(a.getStr());
    }
    Word(String str) {
        this.str = str;
        //this.count = c;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}

