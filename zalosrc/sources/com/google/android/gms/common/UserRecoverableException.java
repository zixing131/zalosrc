package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes2.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: p */
    private final Intent f16154p;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f16154p = intent;
    }

    /* renamed from: a */
    public Intent m19195a() {
        return new Intent(this.f16154p);
    }
}
