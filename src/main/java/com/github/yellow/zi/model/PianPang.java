package com.github.yellow.zi.model;

/**
 * @author YellowTail
 * @since 2021-02-02
 */
public class PianPang {

    private String one;
    private String two;

    public PianPang(String one, String two) {
        this.one = one;
        this.two = two;
    }

    public PianPang() {
    }

    public final String getOne() {
        return one;
    }

    public final void setOne(String one) {
        this.one = one;
    }

    public final String getTwo() {
        return two;
    }

    public final void setTwo(String two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "PianPang{" +
                (null == one ? "" : ", one='" + one + '\'') +
                (null == two ? "" : ", two='" + two + '\'') +
                '}';
    }
}
