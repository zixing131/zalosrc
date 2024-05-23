package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: p */
    private final EnumC6713a f36914p;

    /* renamed from: com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a */
    /* loaded from: classes3.dex */
    public enum EnumC6713a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* renamed from: p */
        private final int f36921p;

        EnumC6713a(int i11) {
            this.f36921p = i11;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f36914p = EnumC6713a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2) {
        super(str, th2);
        this.f36914p = EnumC6713a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, EnumC6713a enumC6713a) {
        super(str);
        this.f36914p = enumC6713a;
    }

    public FirebaseRemoteConfigException(String str, Throwable th2, EnumC6713a enumC6713a) {
        super(str, th2);
        this.f36914p = enumC6713a;
    }
}
