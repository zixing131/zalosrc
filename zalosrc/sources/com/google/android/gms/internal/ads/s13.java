package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class s13 {

    /* renamed from: a */
    private final byte[] f27442a;

    /* renamed from: b */
    private int f27443b;

    /* renamed from: c */
    private int f27444c;

    /* renamed from: d */
    final /* synthetic */ t13 f27445d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s13(t13 t13Var, byte[] bArr, r13 r13Var) {
        this.f27445d = t13Var;
        this.f27442a = bArr;
    }

    /* renamed from: a */
    public final s13 m26221a(int i11) {
        this.f27444c = i11;
        return this;
    }

    /* renamed from: b */
    public final s13 m26222b(int i11) {
        this.f27443b = i11;
        return this;
    }

    /* renamed from: c */
    public final synchronized void m26223c() {
        try {
            t13 t13Var = this.f27445d;
            if (t13Var.f28114b) {
                t13Var.f28113a.mo26823L(this.f27442a);
                this.f27445d.f28113a.mo26821B(this.f27443b);
                this.f27445d.f28113a.mo26824b(this.f27444c);
                this.f27445d.f28113a.mo26822C(null);
                this.f27445d.f28113a.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}
