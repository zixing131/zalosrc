package p455qo;

import androidx.work.AbstractC2147g0;
import bo.C3000l0;
import bo.C3020p0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185gc.AbstractC19383g;
import p398oo.C24371m0;
import qm0.AbstractC25370t;

/* renamed from: qo.g0 */
/* loaded from: classes4.dex */
public final class C25410g0 extends AbstractC19383g {

    /* renamed from: a */
    private final C24371m0 f121657a;

    /* renamed from: qo.g0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final long f121658a;

        public a(long j11) {
            this.f121658a = j11;
        }

        /* renamed from: a */
        public final long m131648a() {
            return this.f121658a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f121658a == ((a) obj).f121658a;
        }

        public int hashCode() {
            return AbstractC2147g0.m11521a(this.f121658a);
        }

        public String toString() {
            return "Params(albumId=" + this.f121658a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.g0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ a f121659q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(2);
            this.f121659q = aVar;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            AbstractC19074t.m100208f(c3020p0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(c3000l0, "feedContent");
            List list = c3000l0.f11899s;
            AbstractC19074t.m100207e(list, "listNewFeed");
            a aVar = this.f121659q;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C3020p0 c3020p02 = (C3020p0) obj;
                if (c3020p02 != null && c3020p02.m14504e0() && c3020p02.f12023C.f12106O.m13958a() == aVar.m131648a()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c3000l0.m14345m1(((C3020p0) it.next()).f12057p);
            }
            return Boolean.valueOf(!arrayList.isEmpty());
        }
    }

    public /* synthetic */ C25410g0(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(a aVar) {
        int m131511r;
        AbstractC19074t.m100208f(aVar, "params");
        C24371m0 c24371m0 = this.f121657a;
        List m127477m = c24371m0.m127477m();
        m131511r = AbstractC25370t.m131511r(m127477m, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m127477m.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3000l0) it.next()).f11895q);
        }
        c24371m0.m127482t(arrayList, new b(aVar));
    }

    public C25410g0(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121657a = c24371m0;
    }
}
