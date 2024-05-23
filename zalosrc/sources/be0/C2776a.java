package be0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19074t;
import mh.C23298d;
import p185gc.AbstractC19383g;

/* renamed from: be0.a */
/* loaded from: classes4.dex */
public final class C2776a extends AbstractC19383g {

    /* renamed from: a */
    private final C23298d f11031a;

    /* renamed from: be0.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final boolean f11032a;

        public a(boolean z11) {
            this.f11032a = z11;
        }

        /* renamed from: a */
        public final boolean m13383a() {
            return this.f11032a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f11032a == ((a) obj).f11032a;
        }

        public int hashCode() {
            return AbstractC2144f.m11520a(this.f11032a);
        }

        public String toString() {
            return "Params(isGroup=" + this.f11032a + ")";
        }
    }

    public C2776a(C23298d c23298d) {
        AbstractC19074t.m100208f(c23298d, "statusMessageRepo");
        this.f11031a = c23298d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        this.f11031a.m120476i(aVar.m13383a());
    }
}
