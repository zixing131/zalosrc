package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a6 */
/* loaded from: classes2.dex */
public final class C4306a6 implements InterfaceC4822o5 {

    /* renamed from: b */
    private InterfaceC4928r f16942b;

    /* renamed from: c */
    private boolean f16943c;

    /* renamed from: e */
    private int f16945e;

    /* renamed from: f */
    private int f16946f;

    /* renamed from: a */
    private final x02 f16941a = new x02(10);

    /* renamed from: d */
    private long f16944d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: a */
    public final void mo20009a(x02 x02Var) {
        v71.m27171b(this.f16942b);
        if (!this.f16943c) {
            return;
        }
        int m27778i = x02Var.m27778i();
        int i11 = this.f16946f;
        if (i11 < 10) {
            int min = Math.min(m27778i, 10 - i11);
            System.arraycopy(x02Var.m27777h(), x02Var.m27780k(), this.f16941a.m27777h(), this.f16946f, min);
            if (this.f16946f + min == 10) {
                this.f16941a.m27775f(0);
                if (this.f16941a.m27788s() == 73 && this.f16941a.m27788s() == 68 && this.f16941a.m27788s() == 51) {
                    this.f16941a.m27776g(3);
                    this.f16945e = this.f16941a.m27787r() + 10;
                } else {
                    lr1.m24356e("Id3Reader", "Discarding invalid ID3 tag");
                    this.f16943c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(m27778i, this.f16945e - this.f16946f);
        this.f16942b.mo23301e(x02Var, min2);
        this.f16946f += min2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: b */
    public final void mo20010b(mm4 mm4Var, C4344b7 c4344b7) {
        c4344b7.m20420c();
        InterfaceC4928r mo21604i = mm4Var.mo21604i(c4344b7.m20418a(), 5);
        this.f16942b = mo21604i;
        C5004t1 c5004t1 = new C5004t1();
        c5004t1.m26511h(c4344b7.m20419b());
        c5004t1.m26523s("application/id3");
        mo21604i.mo23300d(c5004t1.m26529y());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    /* renamed from: c */
    public final void mo20011c(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f16943c = true;
        if (j11 != -9223372036854775807L) {
            this.f16944d = j11;
        }
        this.f16945e = 0;
        this.f16946f = 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zzc() {
        int i11;
        v71.m27171b(this.f16942b);
        if (this.f16943c && (i11 = this.f16945e) != 0 && this.f16946f == i11) {
            long j11 = this.f16944d;
            if (j11 != -9223372036854775807L) {
                this.f16942b.mo23302f(j11, 1, i11, 0, null);
            }
            this.f16943c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4822o5
    public final void zze() {
        this.f16943c = false;
        this.f16944d = -9223372036854775807L;
    }
}
