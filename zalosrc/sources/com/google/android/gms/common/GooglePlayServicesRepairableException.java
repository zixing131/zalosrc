package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes2.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: q */
    private final int f16149q;

    public GooglePlayServicesRepairableException(int i11, String str, Intent intent) {
        super(str, intent);
        this.f16149q = i11;
    }

    /* renamed from: b */
    public int m19192b() {
        return this.f16149q;
    }
}
