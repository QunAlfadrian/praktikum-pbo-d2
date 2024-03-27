/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.stack;

import org.list.List;

public abstract class Stack extends List {

    protected Stack() {

    }

    public Object getTop() {
        int top = list.size();
        if (top > 0) {
            return list.get(top-1);
        } 
        return null;
    }

    @Override
    public boolean isElmt(Object elmt) {
        return elmt instanceof Object;
    }

    @Override
    public void del() {
        int top = list.size();
        if (top > 0) {
            list.remove(top-1);
        }
    }

    @Override
    public void cetak() {
        int top = list.size();
        if (top > 0) {
            int i;
            for (i=top-1;i>=0;i--) {
                // System.out.printf("%d ", list.get(i));
                System.out.println(list.get(i));
            }
        }
    }
    
}
