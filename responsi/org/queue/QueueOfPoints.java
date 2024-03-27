/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.queue;

import org.point.Point;

public class QueueOfPoints extends Queue {
    public QueueOfPoints() {

    }

    @Override
    public Point getHead() {
        int tail = list.size();
        if (tail > 0) {
            return (Point)list.get(0);
        }
        return null;
    }

    @Override
    public Point getTail() {
        int tail = list.size();
        if (tail > 0) {
            return (Point)list.get(tail-1);
        }
        return null;
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
    public void cetak() {
        int head, tail;
        Point P;
        head = 0;
        tail = list.size();
        if (tail > 0) {
            for (int i=head;i<tail;i++) {
                P = this.getElmt(i);
                P.cetak();
            }
        }
    }
}
