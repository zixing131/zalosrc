package gm;

import fm.C19012o;
import fm.C19023z;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: gm.q */
/* loaded from: classes3.dex */
public class C19506q {

    /* renamed from: a */
    Vector f96839a = new Vector();

    /* renamed from: gm.q$a */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        public Long f96840a;

        /* renamed from: b */
        public Long f96841b;

        public a() {
        }
    }

    /* renamed from: a */
    public int m101961a(byte[] bArr) {
        C19023z m100067j = C19023z.m100067j(ByteBuffer.wrap(bArr));
        for (int i11 = 0; i11 < m100067j.m100073n(); i11++) {
            C19012o m100071l = m100067j.m100071l(i11);
            a aVar = new a();
            aVar.f96840a = Long.valueOf(m100071l.m99984j());
            aVar.f96841b = Long.valueOf(m100071l.m99985k());
            this.f96839a.add(aVar);
        }
        return m100067j.m100073n();
    }

    /* renamed from: b */
    public a m101962b(int i11) {
        return (a) this.f96839a.get(i11);
    }

    /* renamed from: c */
    public int m101963c() {
        Vector vector = this.f96839a;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }
}
