package gm;

import fm.C19013p;
import fm.C19016s;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: gm.n */
/* loaded from: classes3.dex */
public class C19503n {

    /* renamed from: a */
    Vector f96834a = new Vector();

    /* renamed from: a */
    public void m101952a(C19500k c19500k) {
        this.f96834a.add(c19500k);
    }

    /* renamed from: b */
    public int m101953b(byte[] bArr) {
        C19016s m100023n = C19016s.m100023n(ByteBuffer.wrap(bArr));
        for (int i11 = 0; i11 < m100023n.m100029r(); i11++) {
            C19013p m100027p = m100023n.m100027p(i11);
            C19500k c19500k = new C19500k();
            c19500k.m101949b(m100027p);
            this.f96834a.add(c19500k);
        }
        return m100023n.m100029r();
    }

    /* renamed from: c */
    public C19500k m101954c(int i11) {
        if (i11 >= this.f96834a.size()) {
            return null;
        }
        return (C19500k) this.f96834a.get(i11);
    }

    /* renamed from: d */
    public int m101955d() {
        return this.f96834a.size();
    }

    /* renamed from: e */
    public byte[] m101956e() {
        C19504o c19504o = new C19504o(1024);
        int[] iArr = new int[this.f96834a.size()];
        for (int i11 = 0; i11 < this.f96834a.size(); i11++) {
            iArr[i11] = ((C19500k) this.f96834a.get(i11)).m101948a(c19504o);
        }
        c19504o.m144103r(C19016s.m100021l(c19504o, C19016s.m100020k(c19504o, iArr)));
        return c19504o.m144082F();
    }
}
