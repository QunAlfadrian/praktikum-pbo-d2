package org.kupu;

public class Data<T extends Kupu> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}
