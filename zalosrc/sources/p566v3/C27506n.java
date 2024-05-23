package p566v3;

import p596w3.C28706d;
import p631x3.AbstractC29302c;

/* renamed from: v3.n */
/* loaded from: classes2.dex */
public class C27506n {

    /* renamed from: a */
    private final C28706d f129396a;

    /* renamed from: b */
    private final C28706d f129397b;

    /* renamed from: v3.n$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public C27507o f129398a;

        /* renamed from: b */
        public C27507o f129399b;

        /* renamed from: a */
        public C27506n m140642a() {
            return new C27506n(this.f129398a, this.f129399b);
        }
    }

    public C27506n(C27507o c27507o, C27507o c27507o2) {
        this.f129396a = C28706d.m143763e((C27507o) AbstractC29302c.m146400b(c27507o, c27507o != null, "color_start"), C28706d.b.START);
        this.f129397b = C28706d.m143763e((C27507o) AbstractC29302c.m146400b(c27507o2, c27507o2 != null, "color_end"), C28706d.b.END);
    }

    /* renamed from: a */
    public C28706d m140640a() {
        return this.f129397b;
    }

    /* renamed from: b */
    public C28706d m140641b() {
        return this.f129396a;
    }

    public C27506n(C27506n c27506n) {
        C28706d c28706d = c27506n.f129396a;
        if (c28706d != null) {
            this.f129396a = new C28706d(c28706d);
        } else {
            this.f129396a = null;
        }
        C28706d c28706d2 = c27506n.f129397b;
        if (c28706d2 != null) {
            this.f129397b = new C28706d(c28706d2);
        } else {
            this.f129397b = null;
        }
    }
}
