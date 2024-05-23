package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class bu1 implements ta1, zza, w71, q81, r81, l91, z71, InterfaceC5019tg, iv2 {

    /* renamed from: p */
    private final List f17983p;

    /* renamed from: q */
    private final pt1 f17984q;

    /* renamed from: r */
    private long f17985r;

    public bu1(pt1 pt1Var, vs0 vs0Var) {
        this.f17984q = pt1Var;
        this.f17983p = Collections.singletonList(vs0Var);
    }

    /* renamed from: Y */
    private final void m20713Y(Class cls, String str, Object... objArr) {
        this.f17984q.m25544a(this.f17983p, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: G */
    public final void mo20101G(cg0 cg0Var, String str, String str2) {
        m20713Y(w71.class, "onRewarded", cg0Var, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: Q */
    public final void mo20102Q() {
        m20713Y(w71.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5019tg
    /* renamed from: V */
    public final void mo20714V(String str, String str2) {
        m20713Y(InterfaceC5019tg.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(zze zzeVar) {
        m20713Y(z71.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: c */
    public final void mo20716c(bv2 bv2Var, String str) {
        m20713Y(av2.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: g */
    public final void mo20717g(bv2 bv2Var, String str) {
        m20713Y(av2.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(tq2 tq2Var) {
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
        this.f17985r = zzt.zzB().mo105914b();
        m20713Y(ta1.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: n */
    public final void mo20720n(bv2 bv2Var, String str) {
        m20713Y(av2.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: o */
    public final void mo20721o(bv2 bv2Var, String str, Throwable th2) {
        m20713Y(av2.class, "onTaskFailed", str, th2.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        m20713Y(zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: r */
    public final void mo20722r(Context context) {
        m20713Y(r81.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: t */
    public final void mo20723t(Context context) {
        m20713Y(r81.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.r81
    /* renamed from: z */
    public final void mo20724z(Context context) {
        m20713Y(r81.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzj() {
        m20713Y(w71.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final void zzl() {
        m20713Y(q81.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzm() {
        m20713Y(w71.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.l91
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (zzt.zzB().mo105914b() - this.f17985r));
        m20713Y(l91.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzo() {
        m20713Y(w71.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzr() {
        m20713Y(w71.class, "onRewardedVideoStarted", new Object[0]);
    }
}
