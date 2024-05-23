package com.google.mlkit.common;

import com.google.android.gms.common.internal.AbstractC4205o;

/* loaded from: classes3.dex */
public class MlKitException extends Exception {

    /* renamed from: p */
    private final int f37137p;

    public MlKitException(String str, int i11) {
        super(AbstractC4205o.m19719h(str, "Provided message must not be empty."));
        this.f37137p = i11;
    }

    /* renamed from: a */
    public int m34567a() {
        return this.f37137p;
    }

    public MlKitException(String str, int i11, Throwable th2) {
        super(AbstractC4205o.m19719h(str, "Provided message must not be empty."), th2);
        this.f37137p = i11;
    }
}
