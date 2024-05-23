package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class wp0 implements i34 {

    /* renamed from: a */
    private final jj4 f30053a = new jj4(true, 65536);

    /* renamed from: b */
    private long f30054b = 15000000;

    /* renamed from: c */
    private long f30055c = 30000000;

    /* renamed from: d */
    private long f30056d = 2500000;

    /* renamed from: e */
    private long f30057e = 5000000;

    /* renamed from: f */
    private int f30058f;

    /* renamed from: g */
    private boolean f30059g;

    @Override // com.google.android.gms.internal.ads.i34
    /* renamed from: a */
    public final boolean mo23119a(long j11, float f11, boolean z11, long j12) {
        long j13 = z11 ? this.f30057e : this.f30056d;
        return j13 <= 0 || j11 >= j13;
    }

    @Override // com.google.android.gms.internal.ads.i34
    /* renamed from: b */
    public final boolean mo23120b(long j11, long j12, float f11) {
        boolean z11 = true;
        char c11 = j12 > this.f30055c ? (char) 0 : j12 < this.f30054b ? (char) 2 : (char) 1;
        int m23623a = this.f30053a.m23623a();
        int i11 = this.f30058f;
        if (c11 != 2 && (c11 != 1 || !this.f30059g || m23623a >= i11)) {
            z11 = false;
        }
        this.f30059g = z11;
        return z11;
    }

    @Override // com.google.android.gms.internal.ads.i34
    /* renamed from: c */
    public final void mo23121c(c44[] c44VarArr, dh4 dh4Var, ui4[] ui4VarArr) {
        int i11;
        int i12 = 0;
        this.f30058f = 0;
        while (true) {
            int length = c44VarArr.length;
            if (i12 < 2) {
                if (ui4VarArr[i12] != null) {
                    int i13 = this.f30058f;
                    if (c44VarArr[i12].zzb() != 1) {
                        i11 = 131072000;
                    } else {
                        i11 = 13107200;
                    }
                    this.f30058f = i13 + i11;
                }
                i12++;
            } else {
                this.f30053a.m23628f(this.f30058f);
                return;
            }
        }
    }

    /* renamed from: d */
    final void m27672d(boolean z11) {
        this.f30058f = 0;
        this.f30059g = false;
        if (z11) {
            this.f30053a.m23627e();
        }
    }

    /* renamed from: e */
    public final synchronized void m27673e(int i11) {
        this.f30056d = i11 * 1000;
    }

    /* renamed from: f */
    public final synchronized void m27674f(int i11) {
        this.f30057e = i11 * 1000;
    }

    /* renamed from: g */
    public final synchronized void m27675g(int i11) {
        this.f30055c = i11 * 1000;
    }

    /* renamed from: h */
    public final synchronized void m27676h(int i11) {
        this.f30054b = i11 * 1000;
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void zzb() {
        m27672d(false);
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void zzc() {
        m27672d(true);
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final void zzd() {
        m27672d(true);
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.i34
    public final jj4 zzi() {
        return this.f30053a;
    }
}
