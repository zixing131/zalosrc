package p455qo;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import is.C20834z0;
import java.util.List;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;

/* renamed from: qo.h0 */
/* loaded from: classes4.dex */
public final class C25412h0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121661a;

    /* renamed from: qo.h0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final List f121662a;

        /* renamed from: b */
        private final boolean f121663b;

        /* renamed from: c */
        private final boolean f121664c;

        public a(List list, boolean z11) {
            AbstractC19074t.m100208f(list, "listDelete");
            this.f121662a = list;
            this.f121663b = z11;
            this.f121664c = list.isEmpty();
        }

        /* renamed from: a */
        public final List m131652a() {
            return this.f121662a;
        }

        /* renamed from: b */
        public final boolean m131653b() {
            return this.f121663b;
        }

        /* renamed from: c */
        public final boolean m131654c() {
            return this.f121664c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f121662a, aVar.f121662a) && this.f121663b == aVar.f121663b;
        }

        public int hashCode() {
            return (this.f121662a.hashCode() * 31) + AbstractC2144f.m11520a(this.f121663b);
        }

        public String toString() {
            return "Params(listDelete=" + this.f121662a + ", isMyGroupFeed=" + this.f121663b + ")";
        }
    }

    public /* synthetic */ C25412h0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        AbstractC19074t.m100208f(aVar, "params");
        if (aVar.m131654c()) {
            return;
        }
        List m131652a = aVar.m131652a();
        if (aVar.m131653b()) {
            C24371m0.Companion.m127483a().m127474j(m131652a, false);
        } else {
            C24371m0.Companion.m127483a().m127474j(m131652a, true);
        }
        if (this.f121661a.m127477m().isEmpty()) {
            AbstractC20826v0.m108770L0(true);
        } else {
            C20834z0.f102412a.m108927f(true);
        }
    }

    public C25412h0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121661a = c24371m0;
    }
}
