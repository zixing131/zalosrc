package p456qp;

import fn0.AbstractC19074t;
import p185gc.AbstractC19384h;
import p509sp.InterfaceC26353b;

/* renamed from: qp.q */
/* loaded from: classes4.dex */
public final class C25465q extends AbstractC19384h {

    /* renamed from: qp.q$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC26353b f122036a;

        public a(InterfaceC26353b interfaceC26353b) {
            AbstractC19074t.m100208f(interfaceC26353b, "playSoundConfig");
            this.f122036a = interfaceC26353b;
        }

        /* renamed from: a */
        public final InterfaceC26353b m131926a() {
            return this.f122036a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC19074t.m100204b(this.f122036a, ((a) obj).f122036a);
        }

        public int hashCode() {
            return this.f122036a.hashCode();
        }

        public String toString() {
            return "Param(playSoundConfig=" + this.f122036a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo13388b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        InterfaceC26353b m131926a = aVar.m131926a();
        if (m131926a.mo117210a()) {
            m131926a.mo117211b(false);
            C25451c.f121865a.m131816d();
        } else {
            m131926a.mo117211b(true);
            C25451c.f121865a.m131817e();
        }
        return Boolean.valueOf(m131926a.mo117210a());
    }
}
