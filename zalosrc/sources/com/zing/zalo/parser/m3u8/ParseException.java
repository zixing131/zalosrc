package com.zing.zalo.parser.m3u8;

/* loaded from: classes4.dex */
public class ParseException extends Exception {

    /* renamed from: p */
    private final String f48390p;

    /* renamed from: q */
    private final int f48391q;

    /* renamed from: a */
    public String m48315a() {
        return this.f48390p;
    }

    /* renamed from: b */
    public int m48316b() {
        return this.f48391q;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Error at line " + m48316b() + ": " + m48315a() + "\n" + super.getMessage();
    }
}
