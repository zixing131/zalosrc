package com.zing.zalo.zinstant.exception;

/* loaded from: classes7.dex */
public class ZinstantException extends Exception {

    /* renamed from: p */
    int f87664p;

    public ZinstantException(int i11, String str) {
        super(str);
        this.f87664p = i11;
    }

    /* renamed from: a */
    public int m91676a() {
        return this.f87664p;
    }

    /* renamed from: b */
    public boolean m91677b() {
        return this.f87664p == 405;
    }

    /* renamed from: c */
    public boolean m91678c() {
        int i11 = this.f87664p;
        return i11 == 301 || i11 == 302 || i11 == 402 || i11 == 500;
    }
}
