/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.queue;

public class QueueOfNumber extends Queue {
    public QueueOfNumber() {

    }

    @Override
    public boolean isElmt(Object elmt) {
        return elmt instanceof Integer;
    }
}
