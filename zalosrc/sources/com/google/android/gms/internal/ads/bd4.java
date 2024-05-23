package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
final class bd4 {

    /* renamed from: a */
    private long f17707a;

    /* renamed from: b */
    private long f17708b;

    /* renamed from: c */
    private boolean f17709c;

    /* renamed from: d */
    private final long m20480d(long j11) {
        return this.f17707a + Math.max(0L, ((this.f17708b - 529) * 1000000) / j11);
    }

    /* renamed from: a */
    public final long m20481a(C4671k3 c4671k3) {
        return m20480d(c4671k3.f23113z);
    }

    /* renamed from: b */
    public final long m20482b(C4671k3 c4671k3, il3 il3Var) {
        if (this.f17708b == 0) {
            this.f17707a = il3Var.f22219e;
        }
        if (this.f17709c) {
            return il3Var.f22219e;
        }
        ByteBuffer byteBuffer = il3Var.f22217c;
        byteBuffer.getClass();
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = (i11 << 8) | (byteBuffer.get(i12) & 255);
        }
        int m21586c = AbstractC4446e.m21586c(i11);
        if (m21586c == -1) {
            this.f17709c = true;
            this.f17708b = 0L;
            this.f17707a = il3Var.f22219e;
            lr1.m24356e("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return il3Var.f22219e;
        }
        long m20480d = m20480d(c4671k3.f23113z);
        this.f17708b += m21586c;
        return m20480d;
    }

    /* renamed from: c */
    public final void m20483c() {
        this.f17707a = 0L;
        this.f17708b = 0L;
        this.f17709c = false;
    }
}
