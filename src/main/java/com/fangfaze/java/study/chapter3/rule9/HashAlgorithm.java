package com.fangfaze.java.study.chapter3.rule9;

public class HashAlgorithm {

    private final int id;
    private final boolean aBoolean;
    private final int anInt;
    private final long aLong;
    private final float aFloat;
    private final String string;

    private final static float EPSILON = 0.00001f;

    public HashAlgorithm(int id, boolean aBoolean, int anInt, long aLong, float aFloat, String string) {
        this.id = id;
        this.aBoolean = aBoolean;
        this.anInt = anInt;
        this.aLong = aLong;
        this.aFloat = aFloat;
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof HashAlgorithm)) {
            return false;
        }
        HashAlgorithm ha = (HashAlgorithm) o;
        if (ha.aBoolean != aBoolean) {
            return false;
        }
        if (ha.anInt != anInt) {
            return false;
        }
        if (ha.aLong != aLong) {
            return false;
        }
        if (ha.aFloat != aFloat) {
            return false;
        }
        return this.string.equals(ha.string);
    }

    // 
    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 17;
        result = PRIME * result + (aBoolean ? 1 : 0);
        result = PRIME * result + (int) anInt;
        result = PRIME * result + (int) (aLong ^ (aLong >>> 32));
        // Float.floatToIntBits不能保证所有相等的float都能得到相同的hashcode.
        // 所以,应该避免float(以及double)作为比较的对象
//        result = PRIME * result + Float.floatToIntBits(aFloat);
        result = PRIME * result + (string != null ? string.hashCode() : 0);
        return result;
    }

}
