public class BEDA_TestClass {
    String str;

    public BEDA_TestClass() {
        str = new String("Kleiner Witz!");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "BEDA_TestClass{" +
                "str='" + str + '\'' +
                '}';
    }
}
