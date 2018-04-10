package com.fangfaze.java.study.chapter3.rule9;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {

    private final int id;
    private final String phoneNumber;

    public PhoneNumber(int id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PhoneNumber)) {
            return false;
        }
        return this.phoneNumber.equals(((PhoneNumber) o).phoneNumber);
    }

    @Override
    public int hashCode() {
        return phoneNumber.hashCode();
    }

    // rule10
    @Override
    public String toString() {
        return "(" + id + ")" + phoneNumber;
    }

    // rule11
    @Override
    public PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        return id - phoneNumber.id;
    }
}
