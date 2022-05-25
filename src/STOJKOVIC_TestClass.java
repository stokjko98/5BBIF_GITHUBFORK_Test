public class STOJKOVIC_TestClass {

    private String str;

    public STOJKOVIC_TestClass() {
        str = new String("HA HA HA");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "STOJKOVIC_TestClass{" +
                "str='" + str + '\'' +
                '}';
    }
}
