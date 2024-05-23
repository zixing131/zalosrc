package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ep0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f19730p;

    /* renamed from: q */
    final /* synthetic */ String f19731q;

    /* renamed from: r */
    final /* synthetic */ long f19732r;

    /* renamed from: s */
    final /* synthetic */ long f19733s;

    /* renamed from: t */
    final /* synthetic */ long f19734t;

    /* renamed from: u */
    final /* synthetic */ long f19735u;

    /* renamed from: v */
    final /* synthetic */ long f19736v;

    /* renamed from: w */
    final /* synthetic */ boolean f19737w;

    /* renamed from: x */
    final /* synthetic */ int f19738x;

    /* renamed from: y */
    final /* synthetic */ int f19739y;

    /* renamed from: z */
    final /* synthetic */ kp0 f19740z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ep0(kp0 kp0Var, String str, String str2, long j11, long j12, long j13, long j14, long j15, boolean z11, int i11, int i12) {
        this.f19740z = kp0Var;
        this.f19730p = str;
        this.f19731q = str2;
        this.f19732r = j11;
        this.f19733s = j12;
        this.f19734t = j13;
        this.f19735u = j14;
        this.f19736v = j15;
        this.f19737w = z11;
        this.f19738x = i11;
        this.f19739y = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f19730p);
        hashMap.put("cachedSrc", this.f19731q);
        hashMap.put("bufferedDuration", Long.toString(this.f19732r));
        hashMap.put("totalDuration", Long.toString(this.f19733s));
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20963D1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f19734t));
            hashMap.put("qoeCachedBytes", Long.toString(this.f19735u));
            hashMap.put("totalBytes", Long.toString(this.f19736v));
            hashMap.put("reportTime", Long.toString(zzt.zzB().mo105913a()));
        }
        if (true != this.f19737w) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("cacheReady", str);
        hashMap.put("playerCount", Integer.toString(this.f19738x));
        hashMap.put("playerPreparedCount", Integer.toString(this.f19739y));
        kp0.m23992h(this.f19740z, "onPrecacheEvent", hashMap);
    }
}
