package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: q */
    private final int f36923q;

    public FirebaseRemoteConfigServerException(int i11, String str) {
        super(str);
        this.f36923q = i11;
    }

    /* renamed from: a */
    public int m34301a() {
        return this.f36923q;
    }

    public FirebaseRemoteConfigServerException(int i11, String str, Throwable th2) {
        super(str, th2);
        this.f36923q = i11;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.EnumC6713a enumC6713a) {
        super(str, enumC6713a);
        this.f36923q = -1;
    }

    public FirebaseRemoteConfigServerException(int i11, String str, FirebaseRemoteConfigException.EnumC6713a enumC6713a) {
        super(str, enumC6713a);
        this.f36923q = i11;
    }
}
