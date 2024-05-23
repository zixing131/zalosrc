package l50;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i50.C20304a;
import k50.C21475c;
import p185gc.AbstractC19384h;

/* renamed from: l50.g */
/* loaded from: classes5.dex */
public final class C22085g extends AbstractC19384h {

    /* renamed from: a */
    private final C20304a f108702a;

    /* renamed from: l50.g$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final C21475c f108703a;

        public a(C21475c c21475c) {
            this.f108703a = c21475c;
        }

        /* renamed from: a */
        public final C21475c m115231a() {
            return this.f108703a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f108703a, ((a) obj).f108703a);
        }

        public int hashCode() {
            C21475c c21475c = this.f108703a;
            if (c21475c == null) {
                return 0;
            }
            return c21475c.hashCode();
        }

        public String toString() {
            return "Result(ringtoneContent=" + this.f108703a + ")";
        }
    }

    public C22085g(C20304a c20304a) {
        AbstractC19074t.m100208f(c20304a, "ringtoneRepo");
        this.f108702a = c20304a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a mo13388b(String str) {
        AbstractC19074t.m100208f(str, "params");
        return new a(this.f108702a.mo105985e(str));
    }

    public /* synthetic */ C22085g(C20304a c20304a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C20304a.Companion.m106001a() : c20304a);
    }
}
