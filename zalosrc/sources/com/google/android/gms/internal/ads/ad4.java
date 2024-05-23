package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class ad4 extends il3 {

    /* renamed from: h */
    private long f17008h;

    /* renamed from: i */
    private int f17009i;

    /* renamed from: j */
    private int f17010j;

    public ad4() {
        super(2, 0);
        this.f17010j = 32;
    }

    @Override // com.google.android.gms.internal.ads.il3, com.google.android.gms.internal.ads.ff3
    /* renamed from: b */
    public final void mo20090b() {
        super.mo20090b();
        this.f17009i = 0;
    }

    /* renamed from: m */
    public final int m20091m() {
        return this.f17009i;
    }

    /* renamed from: n */
    public final long m20092n() {
        return this.f17008h;
    }

    /* renamed from: o */
    public final void m20093o(int i11) {
        this.f17010j = i11;
    }

    /* renamed from: p */
    public final boolean m20094p(il3 il3Var) {
        ByteBuffer byteBuffer;
        v71.m27173d(!il3Var.m22006d(1073741824));
        v71.m27173d(!il3Var.m22006d(268435456));
        v71.m27173d(!il3Var.m22006d(4));
        if (m20095q()) {
            if (this.f17009i < this.f17010j && il3Var.m22006d(Integer.MIN_VALUE) == m22006d(Integer.MIN_VALUE)) {
                ByteBuffer byteBuffer2 = il3Var.f22217c;
                if (byteBuffer2 != null && (byteBuffer = this.f22217c) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                    return false;
                }
            } else {
                return false;
            }
        }
        int i11 = this.f17009i;
        this.f17009i = i11 + 1;
        if (i11 == 0) {
            this.f22219e = il3Var.f22219e;
            if (il3Var.m22006d(1)) {
                m22005c(1);
            }
        }
        if (il3Var.m22006d(Integer.MIN_VALUE)) {
            m22005c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = il3Var.f22217c;
        if (byteBuffer3 != null) {
            m23294i(byteBuffer3.remaining());
            this.f22217c.put(byteBuffer3);
        }
        this.f17008h = il3Var.f22219e;
        return true;
    }

    /* renamed from: q */
    public final boolean m20095q() {
        return this.f17009i > 0;
    }
}
