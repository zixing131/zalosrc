package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ac4 extends ha4 {

    /* renamed from: i */
    private int f16997i;

    /* renamed from: j */
    private int f16998j;

    /* renamed from: k */
    private boolean f16999k;

    /* renamed from: l */
    private int f17000l;

    /* renamed from: m */
    private byte[] f17001m = g92.f20479f;

    /* renamed from: n */
    private int f17002n;

    /* renamed from: o */
    private long f17003o;

    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: a */
    public final void mo20072a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        if (i11 == 0) {
            return;
        }
        int min = Math.min(i11, this.f17000l);
        this.f17003o += min / this.f21595b.f24447d;
        this.f17000l -= min;
        byteBuffer.position(position + min);
        if (this.f17000l > 0) {
            return;
        }
        int i12 = i11 - min;
        int length = (this.f17002n + i12) - this.f17001m.length;
        ByteBuffer m22776d = m22776d(length);
        int m22322P = g92.m22322P(length, 0, this.f17002n);
        m22776d.put(this.f17001m, 0, m22322P);
        int m22322P2 = g92.m22322P(length - m22322P, 0, i12);
        byteBuffer.limit(byteBuffer.position() + m22322P2);
        m22776d.put(byteBuffer);
        byteBuffer.limit(limit);
        int i13 = i12 - m22322P2;
        int i14 = this.f17002n - m22322P;
        this.f17002n = i14;
        byte[] bArr = this.f17001m;
        System.arraycopy(bArr, m22322P, bArr, 0, i14);
        byteBuffer.get(this.f17001m, this.f17002n, i13);
        this.f17002n += i13;
        m22776d.flip();
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: c */
    public final m94 mo20073c(m94 m94Var) {
        if (m94Var.f24446c == 2) {
            this.f16999k = true;
            if (this.f16997i == 0 && this.f16998j == 0) {
                return m94.f24443e;
            }
            return m94Var;
        }
        throw new zznf(m94Var);
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: e */
    protected final void mo20074e() {
        if (this.f16999k) {
            this.f16999k = false;
            int i11 = this.f16998j;
            int i12 = this.f21595b.f24447d;
            this.f17001m = new byte[i11 * i12];
            this.f17000l = this.f16997i * i12;
        }
        this.f17002n = 0;
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: f */
    protected final void mo20075f() {
        if (this.f16999k) {
            if (this.f17002n > 0) {
                this.f17003o += r0 / this.f21595b.f24447d;
            }
            this.f17002n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: g */
    protected final void mo20076g() {
        this.f17001m = g92.f20479f;
    }

    /* renamed from: i */
    public final long m20077i() {
        return this.f17003o;
    }

    /* renamed from: j */
    public final void m20078j() {
        this.f17003o = 0L;
    }

    /* renamed from: k */
    public final void m20079k(int i11, int i12) {
        this.f16997i = i11;
        this.f16998j = i12;
    }

    @Override // com.google.android.gms.internal.ads.ha4, com.google.android.gms.internal.ads.n94
    public final ByteBuffer zzb() {
        int i11;
        if (super.zzh() && (i11 = this.f17002n) > 0) {
            m22776d(i11).put(this.f17001m, 0, this.f17002n).flip();
            this.f17002n = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ha4, com.google.android.gms.internal.ads.n94
    public final boolean zzh() {
        return super.zzh() && this.f17002n == 0;
    }
}
