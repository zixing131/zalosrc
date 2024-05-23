package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: p */
    private final EnumC6581a f36514p;

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    /* loaded from: classes3.dex */
    public enum EnumC6581a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(EnumC6581a enumC6581a) {
        this.f36514p = enumC6581a;
    }

    public FirebaseInstallationsException(String str, EnumC6581a enumC6581a) {
        super(str);
        this.f36514p = enumC6581a;
    }
}
