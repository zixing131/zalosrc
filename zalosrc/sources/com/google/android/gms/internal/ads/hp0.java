package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class hp0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f21867p;

    /* renamed from: q */
    final /* synthetic */ String f21868q;

    /* renamed from: r */
    final /* synthetic */ long f21869r;

    /* renamed from: s */
    final /* synthetic */ kp0 f21870s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hp0(kp0 kp0Var, String str, String str2, long j11) {
        this.f21870s = kp0Var;
        this.f21867p = str;
        this.f21868q = str2;
        this.f21869r = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f21867p);
        hashMap.put("cachedSrc", this.f21868q);
        hashMap.put("totalDuration", Long.toString(this.f21869r));
        kp0.m23992h(this.f21870s, "onPrecacheEvent", hashMap);
    }
}
