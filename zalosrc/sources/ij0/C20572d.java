package ij0;

import android.app.Activity;
import bj0.C2822a;
import bj0.C2826e;
import com.android.billingclient.api.C3940r;
import fj0.AbstractC18986c;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import jj0.EnumC21279d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import wm0.AbstractC29094b;
import xi0.C29673d;

/* renamed from: ij0.d */
/* loaded from: classes7.dex */
public final class C20572d extends AbstractC18986c {

    /* renamed from: b */
    private final String f101158b;

    /* renamed from: c */
    private final C20573e f101159c;

    /* renamed from: d */
    private final C22501b f101160d;

    public C20572d(String str, C20573e c20573e, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c20573e, "validateSubIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f101158b = str;
        this.f101159c = c20573e;
        this.f101160d = c22501b;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        Object obj;
        List m127132B0;
        boolean m127120J;
        C2822a m13656c = c2826e.m13656c();
        AbstractC19074t.m100205c(m13656c);
        if (m13656c.m13643e().length() > 0) {
            List m107024a = this.f101159c.m107024a();
            AbstractC19074t.m100205c(m107024a);
            Iterator it = m107024a.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC19074t.m100204b(((C3940r) obj).m18691f(), c2826e.m13656c().m13643e())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C3940r c3940r = (C3940r) obj;
            if (c3940r != null || !c2826e.m13656c().m13645g()) {
                m127132B0 = AbstractC24342w.m127132B0(c2826e.m13654a(), new String[]{"_"}, false, 0, 6, null);
                String str = (String) m127132B0.get(0);
                if (c3940r != null) {
                    Object obj2 = c3940r.m18688c().get(0);
                    AbstractC19074t.m100207e(obj2, "purchase.products[0]");
                    m127120J = AbstractC24341v.m127120J((String) obj2, str, false, 2, null);
                    if (!m127120J) {
                        this.f101160d.m116345w("Request payment has oldPurchaseToken not came from the same benefit group.", new Object[0]);
                        c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.OLD_PURCHASE_TOKEN_NOT_CAME_FROM_SAME_BENEFIT_GROUP, this.f101158b);
                    }
                }
                this.f101159c.m107027d(c3940r);
                return m99652b(c2826e, c29673d, activity, continuation);
            }
            this.f101160d.m116345w("Request payment has oldPurchaseToken that cannot be found from active subscription", new Object[0]);
            c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.OLD_PURCHASE_TOKEN_NOT_VALID, this.f101158b);
            return AbstractC29094b.m145339a(false);
        }
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
