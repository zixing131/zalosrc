package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class fp0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f20214p;

    /* renamed from: q */
    final /* synthetic */ String f20215q;

    /* renamed from: r */
    final /* synthetic */ int f20216r;

    /* renamed from: s */
    final /* synthetic */ int f20217s;

    /* renamed from: t */
    final /* synthetic */ long f20218t;

    /* renamed from: u */
    final /* synthetic */ long f20219u;

    /* renamed from: v */
    final /* synthetic */ boolean f20220v;

    /* renamed from: w */
    final /* synthetic */ int f20221w;

    /* renamed from: x */
    final /* synthetic */ int f20222x;

    /* renamed from: y */
    final /* synthetic */ kp0 f20223y;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fp0(kp0 kp0Var, String str, String str2, int i11, int i12, long j11, long j12, boolean z11, int i13, int i14) {
        this.f20223y = kp0Var;
        this.f20214p = str;
        this.f20215q = str2;
        this.f20216r = i11;
        this.f20217s = i12;
        this.f20218t = j11;
        this.f20219u = j12;
        this.f20220v = z11;
        this.f20221w = i13;
        this.f20222x = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f20214p);
        hashMap.put("cachedSrc", this.f20215q);
        hashMap.put("bytesLoaded", Integer.toString(this.f20216r));
        hashMap.put("totalBytes", Integer.toString(this.f20217s));
        hashMap.put("bufferedDuration", Long.toString(this.f20218t));
        hashMap.put("totalDuration", Long.toString(this.f20219u));
        if (true != this.f20220v) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("cacheReady", str);
        hashMap.put("playerCount", Integer.toString(this.f20221w));
        hashMap.put("playerPreparedCount", Integer.toString(this.f20222x));
        kp0.m23992h(this.f20223y, "onPrecacheEvent", hashMap);
    }
}
