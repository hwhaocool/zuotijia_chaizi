package com.github.yellow.zi.model;

import java.util.List;

/**
 * @author YellowTail
 * @since 2021-02-02
 */
public class BuShou {

    private List<PianPang> list;

    public BuShou() {
    }

    public BuShou(List<PianPang> list) {
        this.list = list;
    }

    public final List<PianPang> getList() {
        return list;
    }

    public final void setList(List<PianPang> list) {
        this.list = list;
    }
}
