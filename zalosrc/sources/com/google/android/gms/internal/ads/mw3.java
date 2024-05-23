package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class mw3 extends et3 {

    /* renamed from: p */
    final qw3 f24896p;

    /* renamed from: q */
    gt3 f24897q = m24771a();

    /* renamed from: r */
    final /* synthetic */ sw3 f24898r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mw3(sw3 sw3Var) {
        this.f24898r = sw3Var;
        this.f24896p = new qw3(sw3Var, null);
    }

    /* renamed from: a */
    private final gt3 m24771a() {
        qw3 qw3Var = this.f24896p;
        if (qw3Var.hasNext()) {
            return qw3Var.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24897q != null;
    }

    @Override // com.google.android.gms.internal.ads.gt3
    public final byte zza() {
        gt3 gt3Var = this.f24897q;
        if (gt3Var != null) {
            byte zza = gt3Var.zza();
            if (!this.f24897q.hasNext()) {
                this.f24897q = m24771a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
