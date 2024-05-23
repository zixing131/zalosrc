package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gt2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ jt2 f20815a;

    /* renamed from: b */
    final /* synthetic */ kt2 f20816b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gt2(kt2 kt2Var, jt2 jt2Var) {
        this.f20816b = kt2Var;
        this.f20815a = jt2Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        synchronized (this.f20816b) {
            this.f20816b.f23484e = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i11;
        synchronized (this.f20816b) {
            try {
                this.f20816b.f23484e = null;
                arrayDeque = this.f20816b.f23483d;
                arrayDeque.addFirst(this.f20815a);
                kt2 kt2Var = this.f20816b;
                i11 = kt2Var.f23485f;
                if (i11 == 1) {
                    kt2Var.m24040h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
