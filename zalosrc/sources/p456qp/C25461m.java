package p456qp;

import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;

/* renamed from: qp.m */
/* loaded from: classes4.dex */
public final class C25461m extends AbstractC19383g {

    /* renamed from: qp.m$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final int f122029a;

        public a(int i11) {
            this.f122029a = i11;
        }

        /* renamed from: a */
        public final int m131916a() {
            return this.f122029a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f122029a == ((a) obj).f122029a;
        }

        public int hashCode() {
            return this.f122029a;
        }

        public String toString() {
            return "Param(seekTime=" + this.f122029a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C25451c.f121865a.m131826q(aVar.m131916a());
    }
}
