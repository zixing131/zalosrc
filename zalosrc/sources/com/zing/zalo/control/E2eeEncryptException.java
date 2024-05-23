package com.zing.zalo.control;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes3.dex */
public final class E2eeEncryptException extends Exception {

    /* renamed from: p */
    private final int f42529p;

    /* renamed from: q */
    private final String f42530q;

    public E2eeEncryptException(int i11, String str) {
        AbstractC19074t.m100208f(str, "errorMessage");
        this.f42529p = i11;
        this.f42530q = str;
    }

    /* renamed from: a */
    public final int m40478a() {
        return this.f42529p;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Encrypt failed (" + this.f42529p + ") " + this.f42530q;
    }

    public /* synthetic */ E2eeEncryptException(int i11, String str, int i12, AbstractC19060k abstractC19060k) {
        this(i11, (i12 & 2) != 0 ? "" : str);
    }
}
