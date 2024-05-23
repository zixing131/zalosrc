package gm;

import fm.C19002e;
import fm.C19019v;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: gm.g */
/* loaded from: classes3.dex */
public class C19496g {

    /* renamed from: a */
    Vector f96811a = new Vector();

    /* renamed from: a */
    public int m101938a(byte[] bArr) {
        C19019v m100045j = C19019v.m100045j(ByteBuffer.wrap(bArr));
        for (int i11 = 0; i11 < m100045j.m100051n(); i11++) {
            C19002e m100049l = m100045j.m100049l(i11);
            C19495f c19495f = new C19495f();
            c19495f.m101937a(m100049l);
            this.f96811a.add(c19495f);
        }
        return m100045j.m100051n();
    }

    /* renamed from: b */
    public C19495f m101939b(int i11) {
        if (i11 >= this.f96811a.size()) {
            return null;
        }
        return (C19495f) this.f96811a.get(i11);
    }

    /* renamed from: c */
    public int m101940c() {
        return this.f96811a.size();
    }
}
