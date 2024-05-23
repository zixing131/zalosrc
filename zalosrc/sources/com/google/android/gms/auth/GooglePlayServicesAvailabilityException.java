package com.google.android.gms.auth;

import android.content.Intent;

/* loaded from: classes2.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {

    /* renamed from: q */
    private final int f15908q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GooglePlayServicesAvailabilityException(int i11, String str, Intent intent) {
        super(str, intent);
        this.f15908q = i11;
    }
}
