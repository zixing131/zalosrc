package hj0;

import android.app.Activity;
import bj0.C2822a;
import bj0.C2826e;
import com.android.billingclient.api.C3934p;
import fj0.AbstractC18986c;
import fj0.C18984a;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import qm0.AbstractC25332a0;
import wm0.AbstractC29094b;
import xi0.C29673d;

/* renamed from: hj0.c */
/* loaded from: classes7.dex */
public final class C20076c extends AbstractC18986c {

    /* renamed from: b */
    private final String f98706b;

    /* renamed from: c */
    private final C18984a f98707c;

    /* renamed from: d */
    private final C22501b f98708d;

    public C20076c(String str, C18984a c18984a, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c18984a, "handlerIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f98706b = str;
        this.f98707c = c18984a;
        this.f98708d = c22501b;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        String m131214n0;
        boolean m100204b;
        if (AbstractC19074t.m100204b(c2826e.m13655b(), "subscription")) {
            C2822a m13656c = c2826e.m13656c();
            AbstractC19074t.m100205c(m13656c);
            C3934p m99645e = this.f98707c.m99645e();
            AbstractC19074t.m100205c(m99645e);
            List m18671d = m99645e.m18671d();
            AbstractC19074t.m100205c(m18671d);
            ArrayList arrayList = new ArrayList();
            for (Object obj : m18671d) {
                C3934p.d dVar = (C3934p.d) obj;
                if (AbstractC19074t.m100204b(dVar.m18678a(), m13656c.m13640b())) {
                    if (m13656c.m13641c().length() == 0) {
                        m100204b = dVar.m18680c().containsAll(m13656c.m13642d());
                    } else {
                        m100204b = AbstractC19074t.m100204b(dVar.m18679b(), m13656c.m13641c());
                    }
                    if (m100204b) {
                        arrayList.add(obj);
                    }
                }
            }
            C3934p.d m147589e = c29673d.m147589e(arrayList);
            if (m147589e == null) {
                C22501b c22501b = this.f98708d;
                m131214n0 = AbstractC25332a0.m131214n0(m13656c.m13642d(), null, null, null, 0, null, null, 63, null);
                c22501b.mo104551d("Offer not found for tags: " + m131214n0 + ", basePlanId: " + m13656c.m13640b(), new Object[0]);
                c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.OFFER_NOT_FOUND, this.f98706b);
                return AbstractC29094b.m145339a(false);
            }
            this.f98707c.m99646f().m18628b(m147589e.m18681d());
            return m99652b(c2826e, c29673d, activity, continuation);
        }
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
