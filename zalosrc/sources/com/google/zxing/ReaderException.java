package com.google.zxing;

/* loaded from: classes3.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: p */
    protected static final boolean f37541p;

    /* renamed from: q */
    protected static final StackTraceElement[] f37542q;

    static {
        boolean z11;
        if (System.getProperty("surefire.test.class.path") != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        f37541p = z11;
        f37542q = new StackTraceElement[0];
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
