package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gp0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f20785p;

    /* renamed from: q */
    final /* synthetic */ String f20786q;

    /* renamed from: r */
    final /* synthetic */ int f20787r;

    /* renamed from: s */
    final /* synthetic */ kp0 f20788s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gp0(kp0 kp0Var, String str, String str2, int i11) {
        this.f20788s = kp0Var;
        this.f20785p = str;
        this.f20786q = str2;
        this.f20787r = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f20785p);
        hashMap.put("cachedSrc", this.f20786q);
        hashMap.put("totalBytes", Integer.toString(this.f20787r));
        kp0.m23992h(this.f20788s, "onPrecacheEvent", hashMap);
    }
}
