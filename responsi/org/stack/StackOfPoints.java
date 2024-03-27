/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.stack;

import org.point.Point;

public class StackOfPoints extends Stack {
    public StackOfPoints() {

    }

    @Override
    public boolean isElmt(Object elmt) {
        return elmt instanceof Point;
    }

    @Override
    public Point getElmt(int i) {
        return (Point)list.get(i);
    }

    @Override
    public Point getTop() {
        int top = list.size();
        if (top > 0) {
            return (Point)list.get(top-1);
        }
        return null;
    }

    @Override
    public void cetak() {
        int top = list.size();
        if (top > 0) {
            int i;
            Point P;
            for (i=top-1;i>=0;i--) {
                P = this.getElmt(i);
                P.cetak();
            }
        }
    }
}
