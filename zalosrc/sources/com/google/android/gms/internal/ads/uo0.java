package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class uo0 {

    /* renamed from: a */
    private long f28998a;

    /* renamed from: a */
    public final long m27016a(ByteBuffer byteBuffer) {
        C5235z9 c5235z9;
        C5198y9 c5198y9;
        long j11 = this.f28998a;
        if (j11 > 0) {
            return j11;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new C5049u9(new to0(duplicate), wo0.f30038c).m26807f().iterator();
            while (true) {
                c5235z9 = null;
                if (it.hasNext()) {
                    InterfaceC5123w9 interfaceC5123w9 = (InterfaceC5123w9) it.next();
                    if (interfaceC5123w9 instanceof C5198y9) {
                        c5198y9 = (C5198y9) interfaceC5123w9;
                        break;
                    }
                } else {
                    c5198y9 = null;
                    break;
                }
            }
            Iterator it2 = c5198y9.m26807f().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC5123w9 interfaceC5123w92 = (InterfaceC5123w9) it2.next();
                if (interfaceC5123w92 instanceof C5235z9) {
                    c5235z9 = (C5235z9) interfaceC5123w92;
                    break;
                }
            }
            long m28461h = (c5235z9.m28461h() * 1000) / c5235z9.m28462i();
            this.f28998a = m28461h;
            return m28461h;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
