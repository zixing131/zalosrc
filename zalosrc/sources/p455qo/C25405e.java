package p455qo;

import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p185gc.AbstractC19384h;
import p398oo.C24371m0;
import qm0.AbstractC25370t;
import tn.C26747f0;

/* renamed from: qo.e */
/* loaded from: classes4.dex */
public final class C25405e extends AbstractC19384h {

    /* renamed from: a */
    private final C24371m0 f121638a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ ArrayList f121639q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(2);
            this.f121639q = arrayList;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo240pC(C3020p0 c3020p0, C3000l0 c3000l0) {
            boolean z11;
            AbstractC19074t.m100208f(c3020p0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(c3000l0, "feedContent");
            if (c3000l0.m14292F(this.f121639q)) {
                if (c3000l0.m14375y0() && !TextUtils.isEmpty(c3000l0.f11895q)) {
                    C26747f0.m137582I().m137653A0(c3000l0.f11895q);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    public C25405e() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19384h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo13388b(List list) {
        int m131511r;
        AbstractC19074t.m100208f(list, "params");
        ArrayList arrayList = new ArrayList(list);
        C24371m0 c24371m0 = this.f121638a;
        List m127477m = c24371m0.m127477m();
        m131511r = AbstractC25370t.m131511r(m127477m, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = m127477m.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3000l0) it.next()).f11895q);
        }
        boolean m127482t = c24371m0.m127482t(arrayList2, new a(arrayList));
        if (m127482t) {
            this.f121638a.mo127472d(0).m127392B();
        }
        return Boolean.valueOf(m127482t);
    }

    public C25405e(C24371m0 c24371m0) {
        AbstractC19074t.m100208f(c24371m0, "timelineRepo");
        this.f121638a = c24371m0;
    }

    public /* synthetic */ C25405e(C24371m0 c24371m0, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : c24371m0);
    }
}
