package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class mt2 {

    /* renamed from: a */
    private final long f24745a;

    /* renamed from: c */
    private long f24747c;

    /* renamed from: b */
    private final lt2 f24746b = new lt2();

    /* renamed from: d */
    private int f24748d = 0;

    /* renamed from: e */
    private int f24749e = 0;

    /* renamed from: f */
    private int f24750f = 0;

    public mt2() {
        long mo105913a = zzt.zzB().mo105913a();
        this.f24745a = mo105913a;
        this.f24747c = mo105913a;
    }

    /* renamed from: a */
    public final int m24715a() {
        return this.f24748d;
    }

    /* renamed from: b */
    public final long m24716b() {
        return this.f24745a;
    }

    /* renamed from: c */
    public final long m24717c() {
        return this.f24747c;
    }

    /* renamed from: d */
    public final lt2 m24718d() {
        lt2 clone = this.f24746b.clone();
        lt2 lt2Var = this.f24746b;
        lt2Var.f24053p = false;
        lt2Var.f24054q = 0;
        return clone;
    }

    /* renamed from: e */
    public final String m24719e() {
        return "Created: " + this.f24745a + " Last accessed: " + this.f24747c + " Accesses: " + this.f24748d + "\nEntries retrieved: Valid: " + this.f24749e + " Stale: " + this.f24750f;
    }

    /* renamed from: f */
    public final void m24720f() {
        this.f24747c = zzt.zzB().mo105913a();
        this.f24748d++;
    }

    /* renamed from: g */
    public final void m24721g() {
        this.f24750f++;
        this.f24746b.f24054q++;
    }

    /* renamed from: h */
    public final void m24722h() {
        this.f24749e++;
        this.f24746b.f24053p = true;
    }
}
