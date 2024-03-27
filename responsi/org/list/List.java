/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.list;

import java.util.ArrayList;

import org.exceptions.ObjectNotOfListTypeException;

public abstract class List {
    protected ArrayList<Object> list;

    public List() {
        list = new ArrayList<>();
    }

    public Object getElmt(int i) {
        return list.get(i);
    }

    public int getSize() {
        return list.size();
    }

    public void add(Object elmt) throws ObjectNotOfListTypeException {
        if (isElmt(elmt)) {
            list.add(elmt);
        } else {
            throw new ObjectNotOfListTypeException();
        }
    }

    public abstract boolean isElmt(Object elmt);

    public abstract void del();

    public abstract void cetak();
}
