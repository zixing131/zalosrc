package gm;

import fm.C18998a;
import fm.C19017t;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: gm.b */
/* loaded from: classes3.dex */
public class C19491b {

    /* renamed from: a */
    Vector f96793a = new Vector();

    /* renamed from: a */
    public void m101926a(C19490a c19490a) {
        this.f96793a.add(c19490a);
    }

    /* renamed from: b */
    public int m101927b(byte[] bArr) {
        C19017t m100034n = C19017t.m100034n(ByteBuffer.wrap(bArr));
        for (int i11 = 0; i11 < m100034n.m100040r(); i11++) {
            C18998a m100038p = m100034n.m100038p(i11);
            C19490a c19490a = new C19490a();
            c19490a.m101922c(m100038p);
            this.f96793a.add(c19490a);
        }
        return m100034n.m100040r();
    }

    /* renamed from: c */
    public C19490a m101928c(int i11) {
        if (i11 >= this.f96793a.size()) {
            return null;
        }
        return (C19490a) this.f96793a.get(i11);
    }

    /* renamed from: d */
    public int m101929d() {
        return this.f96793a.size();
    }

    /* renamed from: e */
    public byte[] m101930e() {
        C19504o c19504o = new C19504o(1024);
        int[] iArr = new int[this.f96793a.size()];
        for (int i11 = 0; i11 < this.f96793a.size(); i11++) {
            iArr[i11] = ((C19490a) this.f96793a.get(i11)).m101920a(c19504o);
        }
        c19504o.m144103r(C19017t.m100032l(c19504o, C19017t.m100031k(c19504o, iArr)));
        return c19504o.m144082F();
    }
}
