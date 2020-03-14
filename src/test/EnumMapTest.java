package test;

import java.util.EnumMap;

/**
 * <pre>
 * todo
 * </pre>
 * <p>
 * <pre>
 * --------------------------History--------------------------------
 * DATE              @AUTHOR            VERSION        DESCRIPTION
 * 2020/9/12   wenbb1@meicloud.com      V1.0.0          新建
 * </pre>
 */
public class EnumMapTest {

    public static void main(String[] args) {
        EnumMap enumMap = new EnumMap(Continent.class);
        enumMap.put(Continent.ASIA, "cn");
        enumMap.put(Continent.ASIA, "jp");
        enumMap.put(Continent.ASIA, "ind");
        enumMap.put(Continent.EURO, "uk");
        enumMap.put(Continent.AFRICA, "egy");
        enumMap.put(Continent.AMERICA, "usa");

    }

    enum Continent {
        ASIA,
        EURO,
        AFRICA,
        AMERICA,
        OCEAN;
    }
}
