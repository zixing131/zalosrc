package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class rb4 extends ha4 {

    /* renamed from: i */
    private static final int f27161i = Float.floatToIntBits(Float.NaN);

    /* renamed from: i */
    private static void m26064i(int i11, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i11 * 4.656612875245797E-10d));
        if (floatToIntBits == f27161i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: a */
    public final void mo20072a(ByteBuffer byteBuffer) {
        ByteBuffer m22776d;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.f21595b.f24446c;
        if (i12 != 536870912) {
            if (i12 == 805306368) {
                m22776d = m22776d(i11);
                while (position < limit) {
                    m26064i((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m22776d);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            m22776d = m22776d((i11 / 3) * 4);
            while (position < limit) {
                m26064i(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m22776d);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m22776d.flip();
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: c */
    public final m94 mo20073c(m94 m94Var) {
        int i11 = m94Var.f24446c;
        if (g92.m22363u(i11)) {
            if (i11 != 4) {
                return new m94(m94Var.f24444a, m94Var.f24445b, 4);
            }
            return m94.f24443e;
        }
        throw new zznf(m94Var);
    }
}
