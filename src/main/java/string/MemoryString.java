package string;

public class MemoryString {
    String name;

    MemoryString(String name) {
        this.name=name;
    }
    public static void main(String[] args) {
        String name = "aa";//池引用
        String s = new String("aa");//对象引用指向池
        String bb = "bb";//池引用
        String aabb = name + "bb"; //优化成StringBuilder
        String s1 = "aa" + "bb";//池引用
        String aabb1 = "aabb";//池引用
        String c = name;//赋值
        System.out.println(c=="aa");//t
        System.out.println(s1 == aabb1);//t 池引用和池引用
        System.out.println(aabb.intern()==aabb1);//t 池引用和池引用
        System.out.println(aabb==s1);//f 变量引用时不等同 池引用
        System.out.println(aabb==aabb1);//f
        MemoryString aaC = new MemoryString(name);
        MemoryString stringC = new MemoryString(name);
        MemoryString newS = new MemoryString(s);
        System.out.println(aaC.name == stringC.name);//t
        System.out.println(aaC == stringC); //f
        System.out.println(aaC.equals(stringC));//f
        System.out.println(aaC == newS);//f
        System.out.println(aaC.name == newS.name);//f
        System.out.println(name == s);//f
    }
}
