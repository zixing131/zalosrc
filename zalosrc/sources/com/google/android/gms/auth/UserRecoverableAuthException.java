package com.google.android.gms.auth;

import android.content.Intent;

/* loaded from: classes2.dex */
public class UserRecoverableAuthException extends GoogleAuthException {

    /* renamed from: p */
    private final Intent f15916p;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.f15916p = intent;
    }

    /* renamed from: a */
    public Intent m19026a() {
        if (this.f15916p == null) {
            return null;
        }
        return new Intent(this.f15916p);
    }
}
