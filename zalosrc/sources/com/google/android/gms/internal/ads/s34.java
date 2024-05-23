package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class s34 implements o34 {

    /* renamed from: a */
    public final bf4 f27515a;

    /* renamed from: d */
    public int f27518d;

    /* renamed from: e */
    public boolean f27519e;

    /* renamed from: c */
    public final List f27517c = new ArrayList();

    /* renamed from: b */
    public final Object f27516b = new Object();

    public s34(if4 if4Var, boolean z11) {
        this.f27515a = new bf4(if4Var, z11);
    }

    /* renamed from: a */
    public final void m26243a(int i11) {
        this.f27518d = i11;
        this.f27519e = false;
        this.f27517c.clear();
    }

    @Override // com.google.android.gms.internal.ads.o34
    public final mr0 zza() {
        return this.f27515a.m20504C();
    }

    @Override // com.google.android.gms.internal.ads.o34
    public final Object zzb() {
        return this.f27516b;
    }
}
