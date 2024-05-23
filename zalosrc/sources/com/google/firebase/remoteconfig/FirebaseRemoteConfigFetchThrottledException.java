package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* renamed from: q */
    private final long f36922q;

    public FirebaseRemoteConfigFetchThrottledException(long j11) {
        this("Fetch was throttled.", j11);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j11) {
        super(str);
        this.f36922q = j11;
    }
}
