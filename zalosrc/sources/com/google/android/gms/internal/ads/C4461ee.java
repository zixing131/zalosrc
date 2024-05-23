package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
import p227i3.AbstractC20216t;
import p227i3.C20218v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.ads.ee */
/* loaded from: classes2.dex */
public final class C4461ee implements q13 {

    /* renamed from: a */
    private final zz2 f19598a;

    /* renamed from: b */
    private final r03 f19599b;

    /* renamed from: c */
    private final ViewOnAttachStateChangeListenerC4980se f19600c;

    /* renamed from: d */
    private final zzapx f19601d;

    /* renamed from: e */
    private final C4942rd f19602e;

    /* renamed from: f */
    private final C5091ve f19603f;

    public C4461ee(zz2 zz2Var, r03 r03Var, ViewOnAttachStateChangeListenerC4980se viewOnAttachStateChangeListenerC4980se, zzapx zzapxVar, C4942rd c4942rd, C5091ve c5091ve) {
        this.f19598a = zz2Var;
        this.f19599b = r03Var;
        this.f19600c = viewOnAttachStateChangeListenerC4980se;
        this.f19601d = zzapxVar;
        this.f19602e = c4942rd;
        this.f19603f = c5091ve;
    }

    /* renamed from: b */
    private final Map m21698b() {
        HashMap hashMap = new HashMap();
        C4606ib m25930b = this.f19599b.m25930b();
        hashMap.put(C20218v.f100059b, this.f19598a.mo21598b());
        hashMap.put("gms", Boolean.valueOf(this.f19598a.mo21599c()));
        hashMap.put("int", m25930b.m23216F0());
        hashMap.put("up", Boolean.valueOf(this.f19601d.m28675a()));
        hashMap.put(AbstractC20216t.f99969a, new Throwable());
        return hashMap;
    }

    /* renamed from: a */
    public final void m21699a(View view) {
        this.f19600c.m26286d(view);
    }

    @Override // com.google.android.gms.internal.ads.q13
    public final Map zza() {
        Map m21698b = m21698b();
        m21698b.put("lts", Long.valueOf(this.f19600c.m26284a()));
        return m21698b;
    }

    @Override // com.google.android.gms.internal.ads.q13
    public final Map zzb() {
        Map m21698b = m21698b();
        C4606ib m25929a = this.f19599b.m25929a();
        m21698b.put("gai", Boolean.valueOf(this.f19598a.mo21600d()));
        m21698b.put("did", m25929a.m23215E0());
        m21698b.put("dst", Integer.valueOf(m25929a.m23220t0() - 1));
        m21698b.put("doo", Boolean.valueOf(m25929a.m23217q0()));
        C4942rd c4942rd = this.f19602e;
        if (c4942rd != null) {
            m21698b.put("nt", Long.valueOf(c4942rd.m26070a()));
        }
        C5091ve c5091ve = this.f19603f;
        if (c5091ve != null) {
            m21698b.put("vs", Long.valueOf(c5091ve.m27215c()));
            m21698b.put("vf", Long.valueOf(this.f19603f.m27214b()));
        }
        return m21698b;
    }

    @Override // com.google.android.gms.internal.ads.q13
    public final Map zzc() {
        return m21698b();
    }
}
