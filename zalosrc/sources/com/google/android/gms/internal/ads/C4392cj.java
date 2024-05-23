package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.internal.ads.cj */
/* loaded from: classes2.dex */
public final class C4392cj extends AbstractC5058ui {

    /* renamed from: b */
    public final C4319aj f18446b = new C4319aj();

    /* renamed from: c */
    public ByteBuffer f18447c;

    /* renamed from: d */
    public long f18448d;

    public C4392cj(int i11) {
    }

    /* renamed from: j */
    private final ByteBuffer m20905j(int i11) {
        int capacity;
        ByteBuffer byteBuffer = this.f18447c;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i11 + ")");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5058ui
    /* renamed from: b */
    public final void mo20906b() {
        super.mo20906b();
        ByteBuffer byteBuffer = this.f18447c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* renamed from: h */
    public final void m20907h(int i11) {
        ByteBuffer byteBuffer = this.f18447c;
        if (byteBuffer == null) {
            this.f18447c = m20905j(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f18447c.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            return;
        }
        ByteBuffer m20905j = m20905j(i12);
        if (position > 0) {
            this.f18447c.position(0);
            this.f18447c.limit(position);
            m20905j.put(this.f18447c);
        }
        this.f18447c = m20905j;
    }

    /* renamed from: i */
    public final boolean m20908i() {
        return m26969d(1073741824);
    }
}
