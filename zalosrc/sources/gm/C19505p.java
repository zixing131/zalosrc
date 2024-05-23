package gm;

import fm.C19011n;
import fm.C19022y;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: gm.p */
/* loaded from: classes3.dex */
public class C19505p {

    /* renamed from: a */
    Vector f96835a = new Vector();

    /* renamed from: gm.p$a */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        public int f96836a;

        /* renamed from: b */
        public int f96837b;

        public a() {
        }
    }

    /* renamed from: a */
    public int m101958a(byte[] bArr) {
        C19022y m100060j = C19022y.m100060j(ByteBuffer.wrap(bArr));
        for (int i11 = 0; i11 < m100060j.m100066n(); i11++) {
            C19011n m100064l = m100060j.m100064l(i11);
            a aVar = new a();
            aVar.f96836a = m100064l.m99980j();
            aVar.f96837b = m100064l.m99981k();
            this.f96835a.add(aVar);
        }
        return m100060j.m100066n();
    }

    /* renamed from: b */
    public a m101959b(int i11) {
        return (a) this.f96835a.get(i11);
    }

    /* renamed from: c */
    public int m101960c() {
        Vector vector = this.f96835a;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }
}
