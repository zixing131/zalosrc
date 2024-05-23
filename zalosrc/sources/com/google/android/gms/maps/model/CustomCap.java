package com.google.android.gms.maps.model;

import com.google.android.gms.common.internal.AbstractC4205o;
import p181g6.C19236b;

/* loaded from: classes2.dex */
public final class CustomCap extends Cap {

    /* renamed from: s */
    public final C19236b f33622s;

    /* renamed from: t */
    public final float f33623t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CustomCap(C19236b c19236b, float f11) {
        super(r0, f11);
        C19236b c19236b2 = (C19236b) AbstractC4205o.m19723l(c19236b, "bitmapDescriptor must not be null");
        if (f11 > 0.0f) {
            this.f33622s = c19236b;
            this.f33623t = f11;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    @Override // com.google.android.gms.maps.model.Cap
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f33622s) + " refWidth=" + this.f33623t + "]";
    }
}
