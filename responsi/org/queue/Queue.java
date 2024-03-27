/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.queue;

import org.list.List;

public class Queue extends List {
    protected Queue() {

    }

    public Object getHead() {
        int tail = list.size();
        if (tail > 0) {
            return list.get(0);
        }
        return null;
    }

    public Object getTail() {
        int tail = list.size();
        if (tail > 0) {
            return list.get(tail-1);
        }
        return null;
    }

    @Override
    public boolean isElmt(Object elmt) {
        return elmt instanceof Object;
    }

    @Override 
    public void del() {
        if (list.size() > 0) {
            list.remove(0);
        }
    }

    @Override
    public void cetak() {
        int head, tail;
        head = 0;
        tail = list.size();
        if (tail > 0) {
            for (int i=head;i<tail;i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
