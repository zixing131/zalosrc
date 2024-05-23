package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class ev3 extends InputStream {

    /* renamed from: p */
    private Iterator f19825p;

    /* renamed from: q */
    private ByteBuffer f19826q;

    /* renamed from: r */
    private int f19827r = 0;

    /* renamed from: s */
    private int f19828s;

    /* renamed from: t */
    private int f19829t;

    /* renamed from: u */
    private boolean f19830u;

    /* renamed from: v */
    private byte[] f19831v;

    /* renamed from: w */
    private int f19832w;

    /* renamed from: x */
    private long f19833x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ev3(Iterable iterable) {
        this.f19825p = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f19827r++;
        }
        this.f19828s = -1;
        if (!m21819b()) {
            this.f19826q = dv3.f19429e;
            this.f19828s = 0;
            this.f19829t = 0;
            this.f19833x = 0L;
        }
    }

    /* renamed from: a */
    private final void m21818a(int i11) {
        int i12 = this.f19829t + i11;
        this.f19829t = i12;
        if (i12 == this.f19826q.limit()) {
            m21819b();
        }
    }

    /* renamed from: b */
    private final boolean m21819b() {
        this.f19828s++;
        if (!this.f19825p.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f19825p.next();
        this.f19826q = byteBuffer;
        this.f19829t = byteBuffer.position();
        if (this.f19826q.hasArray()) {
            this.f19830u = true;
            this.f19831v = this.f19826q.array();
            this.f19832w = this.f19826q.arrayOffset();
        } else {
            this.f19830u = false;
            this.f19833x = ix3.m23451m(this.f19826q);
            this.f19831v = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte m23447i;
        if (this.f19828s == this.f19827r) {
            return -1;
        }
        if (this.f19830u) {
            m23447i = this.f19831v[this.f19829t + this.f19832w];
            m21818a(1);
        } else {
            m23447i = ix3.m23447i(this.f19829t + this.f19833x);
            m21818a(1);
        }
        return m23447i & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) {
        if (this.f19828s == this.f19827r) {
            return -1;
        }
        int limit = this.f19826q.limit();
        int i13 = this.f19829t;
        int i14 = limit - i13;
        if (i12 > i14) {
            i12 = i14;
        }
        if (this.f19830u) {
            System.arraycopy(this.f19831v, i13 + this.f19832w, bArr, i11, i12);
            m21818a(i12);
        } else {
            int position = this.f19826q.position();
            this.f19826q.get(bArr, i11, i12);
            m21818a(i12);
        }
        return i12;
    }
}
