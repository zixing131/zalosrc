package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class il3 extends ff3 {

    /* renamed from: b */
    public final hi3 f22216b = new hi3();

    /* renamed from: c */
    public ByteBuffer f22217c;

    /* renamed from: d */
    public boolean f22218d;

    /* renamed from: e */
    public long f22219e;

    /* renamed from: f */
    public ByteBuffer f22220f;

    /* renamed from: g */
    private final int f22221g;

    static {
        AbstractC4368bv.m20759b("media3.decoder");
    }

    public il3(int i11, int i12) {
        this.f22221g = i11;
    }

    /* renamed from: l */
    private final ByteBuffer m23293l(int i11) {
        int capacity;
        int i12 = this.f22221g;
        if (i12 == 1) {
            return ByteBuffer.allocate(i11);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i11);
        }
        ByteBuffer byteBuffer = this.f22217c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new zzgh(capacity, i11);
    }

    @Override // com.google.android.gms.internal.ads.ff3
    /* renamed from: b */
    public void mo20090b() {
        super.mo20090b();
        ByteBuffer byteBuffer = this.f22217c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f22220f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f22218d = false;
    }

    /* renamed from: i */
    public final void m23294i(int i11) {
        ByteBuffer byteBuffer = this.f22217c;
        if (byteBuffer == null) {
            this.f22217c = m23293l(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f22217c = byteBuffer;
            return;
        }
        ByteBuffer m23293l = m23293l(i12);
        m23293l.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m23293l.put(byteBuffer);
        }
        this.f22217c = m23293l;
    }

    /* renamed from: j */
    public final void m23295j() {
        ByteBuffer byteBuffer = this.f22217c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f22220f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: k */
    public final boolean m23296k() {
        return m22006d(1073741824);
    }
}
