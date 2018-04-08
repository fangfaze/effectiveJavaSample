package com.fangfaze.java.study.chapter3.rule9;

public class PhoneNumber {

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

    // 如果提供的格式,
    @Override
    public String toString() {
        return "(" + id + ")" + phoneNumber;
    }

}
