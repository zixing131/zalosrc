package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.c5 */
/* loaded from: classes2.dex */
public final class C4378c5 implements jm4 {

    /* renamed from: d */
    public static final qm4 f18108d = new qm4() { // from class: com.google.android.gms.internal.ads.b5
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4378c5()};
        }
    };

    /* renamed from: a */
    private final C4415d5 f18109a = new C4415d5(null);

    /* renamed from: b */
    private final x02 f18110b = new x02(2786);

    /* renamed from: c */
    private boolean f18111c;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:            r9.zzj();        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:            if ((r5 - r3) >= 8192) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:            return false;     */
    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo19968a(km4 km4Var) {
        x02 x02Var = new x02(10);
        int i11 = 0;
        while (true) {
            yl4 yl4Var = (yl4) km4Var;
            yl4Var.mo23963f(x02Var.m27777h(), 0, 10, false);
            x02Var.m27775f(0);
            if (x02Var.m27790u() != 4801587) {
                break;
            }
            x02Var.m27776g(3);
            int m27787r = x02Var.m27787r();
            i11 += m27787r + 10;
            yl4Var.m28247k(m27787r, false);
        }
        km4Var.zzj();
        yl4 yl4Var2 = (yl4) km4Var;
        yl4Var2.m28247k(i11, false);
        int i12 = i11;
        while (true) {
            int i13 = 0;
            while (true) {
                yl4Var2.mo23963f(x02Var.m27777h(), 0, 6, false);
                x02Var.m27775f(0);
                if (x02Var.m27792w() != 2935) {
                    break;
                }
                i13++;
                if (i13 >= 4) {
                    return true;
                }
                int m23639b = jl4.m23639b(x02Var.m27777h());
                if (m23639b == -1) {
                    return false;
                }
                yl4Var2.m28247k(m23639b - 6, false);
            }
            yl4Var2.m28247k(i12, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f18109a.mo20010b(mm4Var, new C4344b7(Integer.MIN_VALUE, 0, 1));
        mm4Var.zzC();
        mm4Var.mo21603f(new C4741m(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        this.f18111c = false;
        this.f18109a.zze();
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        int mo19942a = km4Var.mo19942a(this.f18110b.m27777h(), 0, 2786);
        if (mo19942a == -1) {
            return -1;
        }
        this.f18110b.m27775f(0);
        this.f18110b.m27774e(mo19942a);
        if (!this.f18111c) {
            this.f18109a.mo20011c(0L, 4);
            this.f18111c = true;
        }
        this.f18109a.mo20009a(this.f18110b);
        return 0;
    }
}
