/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.stack;

public class StackOfNumber extends Stack {
    public StackOfNumber() {

    }

    @Override
    public boolean isElmt(Object elmt) {
        return elmt instanceof Integer;
    }

    
}
