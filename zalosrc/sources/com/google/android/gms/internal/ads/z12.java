package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* loaded from: classes2.dex */
public final class z12 implements iv2 {

    /* renamed from: p */
    private final m12 f31324p;

    /* renamed from: q */
    private final q12 f31325q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z12(m12 m12Var, q12 q12Var) {
        this.f31324p = m12Var;
        this.f31325q = q12Var;
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: c */
    public final void mo20716c(bv2 bv2Var, String str) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue()) {
            return;
        }
        if (bv2.RENDERER == bv2Var) {
            this.f31324p.m24441g(zzt.zzB().mo105914b());
            return;
        }
        if (bv2.PRELOADED_LOADER != bv2Var && bv2.SERVER_TRANSACTION != bv2Var) {
            return;
        }
        this.f31324p.m24442h(zzt.zzB().mo105914b());
        final q12 q12Var = this.f31325q;
        final long m24438d = this.f31324p.m24438d();
        q12Var.f29125b.m23109a(new ju2() { // from class: com.google.android.gms.internal.ads.p12
            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                q12 q12Var2 = q12.this;
                long j11 = m24438d;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                if (!q12Var2.m27122a()) {
                    C5219yu m28620N = C5256zu.m28620N();
                    m28620N.m28353y(j11);
                    byte[] mo27346a = ((C5256zu) m28620N.m25898n()).mo27346a();
                    x12.m27806g(sQLiteDatabase, false, false);
                    x12.m27803d(sQLiteDatabase, j11, mo27346a);
                    return null;
                }
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: g */
    public final void mo20717g(bv2 bv2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: n */
    public final void mo20720n(bv2 bv2Var, String str) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue() && bv2.RENDERER == bv2Var && this.f31324p.m24437c() != 0) {
            this.f31324p.m24440f(zzt.zzB().mo105914b() - this.f31324p.m24437c());
        }
    }

    @Override // com.google.android.gms.internal.ads.iv2
    /* renamed from: o */
    public final void mo20721o(bv2 bv2Var, String str, Throwable th2) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21312m5)).booleanValue() && bv2.RENDERER == bv2Var && this.f31324p.m24437c() != 0) {
            this.f31324p.m24440f(zzt.zzB().mo105914b() - this.f31324p.m24437c());
        }
    }
}
