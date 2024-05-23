package p456qp;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p185gc.AbstractC19384h;
import p399op.C24405q;
import p426pp.C24902e;
import p426pp.C24903f;

/* renamed from: qp.f */
/* loaded from: classes4.dex */
public final class C25454f extends AbstractC19384h {

    /* renamed from: a */
    private final C24405q f121893a;

    /* renamed from: qp.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final C24902e f121894a;

        /* renamed from: b */
        private final C24903f f121895b;

        public a(C24902e c24902e, C24903f c24903f) {
            this.f121894a = c24902e;
            this.f121895b = c24903f;
        }

        /* renamed from: a */
        public final C24902e m131848a() {
            return this.f121894a;
        }

        /* renamed from: b */
        public final C24903f m131849b() {
            return this.f121895b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121894a, aVar.f121894a) && AbstractC19074t.m100204b(this.f121895b, aVar.f121895b);
        }

        public int hashCode() {
            C24902e c24902e = this.f121894a;
            int hashCode = (c24902e == null ? 0 : c24902e.hashCode()) * 31;
            C24903f c24903f = this.f121895b;
            return hashCode + (c24903f != null ? c24903f.hashCode() : 0);
        }

        public String toString() {
            return "Result(songContent=" + this.f121894a + ", songStreaming=" + this.f121895b + ")";
        }
    }

    public C25454f(C24405q c24405q) {
        AbstractC19074t.m100208f(c24405q, "musicRepo");
        this.f121893a = c24405q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a mo13388b(String str) {
        AbstractC19074t.m100208f(str, "params");
        return new a(this.f121893a.mo127593e(str), this.f121893a.mo127608r(str));
    }

    public /* synthetic */ C25454f(C24405q c24405q, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24405q.Companion.m127651a() : c24405q);
    }
}
