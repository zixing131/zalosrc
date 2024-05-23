package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class wb4 extends ha4 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae A[ADDED_TO_REGION, LOOP:4: B:33:0x00ae->B:34:0x00b0, LOOP_START, PHI: r0
  0x00ae: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0035, B:34:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.n94
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo20072a(ByteBuffer byteBuffer) {
        int i11;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i12 = limit - position;
        int i13 = this.f21595b.f24446c;
        if (i13 != 3) {
            if (i13 != 4) {
                if (i13 != 268435456) {
                    if (i13 != 536870912) {
                        if (i13 != 805306368) {
                            throw new IllegalStateException();
                        }
                    } else {
                        i12 /= 3;
                    }
                }
                ByteBuffer m22776d = m22776d(i12);
                i11 = this.f21595b.f24446c;
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 268435456) {
                            if (i11 != 536870912) {
                                if (i11 == 805306368) {
                                    while (position < limit) {
                                        m22776d.put(byteBuffer.get(position + 2));
                                        m22776d.put(byteBuffer.get(position + 3));
                                        position += 4;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                while (position < limit) {
                                    m22776d.put(byteBuffer.get(position + 1));
                                    m22776d.put(byteBuffer.get(position + 2));
                                    position += 3;
                                }
                            }
                        } else {
                            while (position < limit) {
                                m22776d.put(byteBuffer.get(position + 1));
                                m22776d.put(byteBuffer.get(position));
                                position += 2;
                            }
                        }
                    } else {
                        while (position < limit) {
                            short m22307A = (short) (g92.m22307A(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                            m22776d.put((byte) (m22307A & 255));
                            m22776d.put((byte) ((m22307A >> 8) & 255));
                            position += 4;
                        }
                    }
                } else {
                    while (position < limit) {
                        m22776d.put((byte) 0);
                        m22776d.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                m22776d.flip();
            }
            i12 /= 2;
            ByteBuffer m22776d2 = m22776d(i12);
            i11 = this.f21595b.f24446c;
            if (i11 != 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            m22776d2.flip();
        }
        i12 += i12;
        ByteBuffer m22776d22 = m22776d(i12);
        i11 = this.f21595b.f24446c;
        if (i11 != 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        m22776d22.flip();
    }

    @Override // com.google.android.gms.internal.ads.ha4
    /* renamed from: c */
    public final m94 mo20073c(m94 m94Var) {
        int i11 = m94Var.f24446c;
        if (i11 != 3) {
            if (i11 != 2) {
                if (i11 != 268435456 && i11 != 536870912 && i11 != 805306368 && i11 != 4) {
                    throw new zznf(m94Var);
                }
            } else {
                return m94.f24443e;
            }
        }
        return new m94(m94Var.f24444a, m94Var.f24445b, 2);
    }
}
