package p456qp;

import com.zing.zalo.common.C7853b;
import fn0.AbstractC19074t;
import p185gc.AbstractC19383g;

/* renamed from: qp.n */
/* loaded from: classes4.dex */
public final class C25462n extends AbstractC19383g {

    /* renamed from: qp.n$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final float f122030a;

        public a(float f11) {
            this.f122030a = f11;
        }

        /* renamed from: a */
        public final float m131918a() {
            return this.f122030a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f122030a, ((a) obj).f122030a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f122030a);
        }

        public String toString() {
            return "Params(volume=" + this.f122030a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        C7853b.Companion.m40150a().m40134i1(aVar.m131918a(), aVar.m131918a());
    }
}
