package com.google.zxing;

/* loaded from: classes3.dex */
public final class FormatException extends ReaderException {

    /* renamed from: r */
    private static final FormatException f37539r;

    static {
        FormatException formatException = new FormatException();
        f37539r = formatException;
        formatException.setStackTrace(ReaderException.f37542q);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m35250a() {
        if (ReaderException.f37541p) {
            return new FormatException();
        }
        return f37539r;
    }
}
