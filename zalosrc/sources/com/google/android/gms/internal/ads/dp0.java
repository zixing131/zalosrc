package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes2.dex */
final class dp0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f19378p;

    /* renamed from: q */
    final /* synthetic */ String f19379q;

    /* renamed from: r */
    final /* synthetic */ int f19380r;

    /* renamed from: s */
    final /* synthetic */ int f19381s;

    /* renamed from: t */
    final /* synthetic */ kp0 f19382t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dp0(kp0 kp0Var, String str, String str2, int i11, int i12, boolean z11) {
        this.f19382t = kp0Var;
        this.f19378p = str;
        this.f19379q = str2;
        this.f19380r = i11;
        this.f19381s = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f19378p);
        hashMap.put("cachedSrc", this.f19379q);
        hashMap.put("bytesLoaded", Integer.toString(this.f19380r));
        hashMap.put("totalBytes", Integer.toString(this.f19381s));
        hashMap.put("cacheReady", "0");
        kp0.m23992h(this.f19382t, "onPrecacheEvent", hashMap);
    }
}
