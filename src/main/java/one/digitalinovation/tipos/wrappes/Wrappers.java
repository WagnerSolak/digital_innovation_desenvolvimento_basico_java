package one.digitalinovation.tipos.wrappes;

public class Wrappers {
    //Autoboxing => atribuo valor não necessitando "dar new", pois é um objeto
    // aceitando nulo, e possui alguns metodos
    // Byte => é uma classe agora
    Byte b = 127;  // byte
    Byte b2 = -128;
    Byte nullByte = null;

    Character c = 'A';
    Character c2 = 15;

    Short s = 32767; // short
    Short s2 = -32768;

    Integer i = 2147483647; // int
    Integer i2 = -2147483648;

    Long l = 9223372036854775807L;
    Long l2 = -9223372036854775808L;

    Float f = 65f; // float
    Float f2 = 65.0f;
    Float f3 = -0.5f;

    Double d = 1024.99; // Double
    Double d2 = 10.2456;

    Boolean bo = true;  // boolean
    Boolean bo2 = false;

    Boolean bo3 = Boolean.getBoolean("false"); // OK
    Boolean bo4 = Boolean.valueOf("true");  // OK


}
