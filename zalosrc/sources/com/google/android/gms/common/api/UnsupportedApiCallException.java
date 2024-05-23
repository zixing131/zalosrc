package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: p */
    private final Feature f16177p;

    public UnsupportedApiCallException(Feature feature) {
        this.f16177p = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f16177p));
    }
}
