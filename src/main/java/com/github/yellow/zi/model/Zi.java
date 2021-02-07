package com.github.yellow.zi.model;

/**
 * @author YellowTail
 * @since 2021-02-02
 */
public class Zi {

    private String name;

    private BuShou buShou;

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final BuShou getBuShou() {
        return buShou;
    }

    public final void setBuShou(BuShou buShou) {
        this.buShou = buShou;
    }

    @Override
    public String toString() {
        return "Zi{" +
                (null == buShou ? "" : ", buShou=" + buShou) +
                '}';
    }
}
