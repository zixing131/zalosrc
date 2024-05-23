package p455qo;

import bo.C3000l0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: qo.y */
/* loaded from: classes4.dex */
public final class C25441y extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121814a;

    /* renamed from: qo.y$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f121815a;

        public a(String str) {
            AbstractC19074t.m100208f(str, "fid");
            this.f121815a = str;
        }

        /* renamed from: a */
        public final String m131776a() {
            return this.f121815a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f121815a, ((a) obj).f121815a);
        }

        public int hashCode() {
            return this.f121815a.hashCode();
        }

        public String toString() {
            return "Params(fid=" + this.f121815a + ")";
        }
    }

    public /* synthetic */ C25441y(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C3000l0 mo127471c = this.f121814a.mo127471c(aVar.m131776a());
        if (mo127471c != null && mo127471c.f11893p == 2) {
            mo127471c.m14298H1();
        }
    }

    public C25441y(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121814a = c24371m0;
    }
}
