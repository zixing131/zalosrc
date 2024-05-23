package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.i5 */
/* loaded from: classes2.dex */
public final class C4600i5 implements jm4 {

    /* renamed from: j */
    public static final qm4 f22068j = new qm4() { // from class: com.google.android.gms.internal.ads.h5
        @Override // com.google.android.gms.internal.ads.qm4
        /* renamed from: a */
        public final /* synthetic */ jm4[] mo20401a(Uri uri, Map map) {
            return pm4.m25488a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.qm4
        public final jm4[] zza() {
            return new jm4[]{new C4600i5(0)};
        }
    };

    /* renamed from: c */
    private final x02 f22071c;

    /* renamed from: d */
    private final wz1 f22072d;

    /* renamed from: e */
    private mm4 f22073e;

    /* renamed from: f */
    private long f22074f;

    /* renamed from: h */
    private boolean f22076h;

    /* renamed from: i */
    private boolean f22077i;

    /* renamed from: a */
    private final C4636j5 f22069a = new C4636j5(true, null);

    /* renamed from: b */
    private final x02 f22070b = new x02(ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);

    /* renamed from: g */
    private long f22075g = -1;

    public C4600i5(int i11) {
        x02 x02Var = new x02(10);
        this.f22071c = x02Var;
        byte[] m27777h = x02Var.m27777h();
        this.f22072d = new wz1(m27777h, m27777h.length);
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: a */
    public final boolean mo19968a(km4 km4Var) {
        int i11 = 0;
        while (true) {
            yl4 yl4Var = (yl4) km4Var;
            yl4Var.mo23963f(this.f22071c.m27777h(), 0, 10, false);
            this.f22071c.m27775f(0);
            if (this.f22071c.m27790u() != 4801587) {
                break;
            }
            this.f22071c.m27776g(3);
            int m27787r = this.f22071c.m27787r();
            i11 += m27787r + 10;
            yl4Var.m28247k(m27787r, false);
        }
        km4Var.zzj();
        yl4 yl4Var2 = (yl4) km4Var;
        yl4Var2.m28247k(i11, false);
        if (this.f22075g == -1) {
            this.f22075g = i11;
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        do {
            yl4Var2.mo23963f(this.f22071c.m27777h(), 0, 2, false);
            this.f22071c.m27775f(0);
            if (!C4636j5.m23521d(this.f22071c.m27792w())) {
                i12++;
                km4Var.zzj();
                yl4Var2.m28247k(i12, false);
            } else {
                i13++;
                if (i13 >= 4 && i14 > 188) {
                    return true;
                }
                yl4Var2.mo23963f(this.f22071c.m27777h(), 0, 4, false);
                this.f22072d.m27751h(14);
                int m27746c = this.f22072d.m27746c(13);
                if (m27746c <= 6) {
                    i12++;
                    km4Var.zzj();
                    yl4Var2.m28247k(i12, false);
                } else {
                    yl4Var2.m28247k(m27746c - 6, false);
                    i14 += m27746c;
                }
            }
            i13 = 0;
            i14 = 0;
        } while (i12 - i11 < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: c */
    public final void mo19970c(mm4 mm4Var) {
        this.f22073e = mm4Var;
        this.f22069a.mo20010b(mm4Var, new C4344b7(Integer.MIN_VALUE, 0, 1));
        mm4Var.zzC();
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: e */
    public final void mo19971e(long j11, long j12) {
        this.f22076h = false;
        this.f22069a.zze();
        this.f22074f = j12;
    }

    @Override // com.google.android.gms.internal.ads.jm4
    /* renamed from: f */
    public final int mo19972f(km4 km4Var, C4667k c4667k) {
        v71.m27171b(this.f22073e);
        int mo19942a = km4Var.mo19942a(this.f22070b.m27777h(), 0, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        if (!this.f22077i) {
            this.f22073e.mo21603f(new C4741m(-9223372036854775807L, 0L));
            this.f22077i = true;
        }
        if (mo19942a == -1) {
            return -1;
        }
        this.f22070b.m27775f(0);
        this.f22070b.m27774e(mo19942a);
        if (!this.f22076h) {
            this.f22069a.mo20011c(this.f22074f, 4);
            this.f22076h = true;
        }
        this.f22069a.mo20009a(this.f22070b);
        return 0;
    }
}
