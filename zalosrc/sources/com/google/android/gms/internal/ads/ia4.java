package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ia4 extends ha4 {

    /* renamed from: i */
    private int[] f22128i;

    /* renamed from: j */
    private int[] f22129j;

    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: a */
    public final void mo20072a(ByteBuffer byteBuffer) {
        int[] iArr = this.f22129j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m22776d = m22776d(((limit - position) / this.f21595b.f24447d) * this.f21596c.f24447d);
        while (position < limit) {
            for (int i11 : iArr) {
                m22776d.putShort(byteBuffer.getShort(i11 + i11 + position));
            }
            position += this.f21595b.f24447d;
        }
        byteBuffer.position(limit);
        m22776d.flip();
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: c */
    public final m94 mo20073c(m94 m94Var) {
        boolean z11;
        boolean z12;
        int[] iArr = this.f22128i;
        if (iArr == null) {
            return m94.f24443e;
        }
        if (m94Var.f24446c == 2) {
            if (m94Var.f24445b != iArr.length) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = 0;
            while (true) {
                int length = iArr.length;
                if (i11 < length) {
                    int i12 = iArr[i11];
                    if (i12 < m94Var.f24445b) {
                        if (i12 != i11) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z11 |= z12;
                        i11++;
                    } else {
                        throw new zznf(m94Var);
                    }
                } else {
                    if (z11) {
                        return new m94(m94Var.f24444a, length, 2);
                    }
                    return m94.f24443e;
                }
            }
        } else {
            throw new zznf(m94Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: e */
    protected final void mo20074e() {
        this.f22129j = this.f22128i;
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: g */
    protected final void mo20076g() {
        this.f22129j = null;
        this.f22128i = null;
    }

    /* renamed from: i */
    public final void m23151i(int[] iArr) {
        this.f22128i = iArr;
    }
}
