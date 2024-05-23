package ij0;

import android.app.Activity;
import bj0.C2822a;
import bj0.C2826e;
import com.android.billingclient.api.C3878a;
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
import qm0.AbstractC25332a0;
import wm0.AbstractC29094b;
import xi0.C29673d;

/* renamed from: ij0.b */
/* loaded from: classes7.dex */
public final class C20570b extends AbstractC18986c {

    /* renamed from: b */
    private final String f101145b;

    /* renamed from: c */
    private final C20573e f101146c;

    /* renamed from: d */
    private final C22501b f101147d;

    public C20570b(String str, C20573e c20573e, C22501b c22501b) {
        AbstractC19074t.m100208f(str, "jsCallback");
        AbstractC19074t.m100208f(c20573e, "validateSubIntermediateResult");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f101145b = str;
        this.f101146c = c20573e;
        this.f101147d = c22501b;
    }

    @Override // fj0.AbstractC18986c
    /* renamed from: a */
    public Object mo99651a(C2826e c2826e, C29673d c29673d, Activity activity, Continuation continuation) {
        List m127131A0;
        Object obj;
        Object m131205e0;
        boolean m127120J;
        List m107024a = this.f101146c.m107024a();
        AbstractC19074t.m100205c(m107024a);
        m127131A0 = AbstractC24342w.m127131A0(c2826e.m13654a(), new char[]{'_'}, false, 0, 6, null);
        String str = (String) m127131A0.get(0);
        Iterator it = m107024a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C3940r c3940r = (C3940r) next;
            C3878a m18686a = c3940r.m18686a();
            List m18688c = c3940r.m18688c();
            AbstractC19074t.m100207e(m18688c, "it.products");
            m131205e0 = AbstractC25332a0.m131205e0(m18688c);
            AbstractC19074t.m100207e(m131205e0, "it.products.first()");
            m127120J = AbstractC24341v.m127120J((String) m131205e0, str, false, 2, null);
            if (m127120J && m18686a != null && !AbstractC19074t.m100204b(m18686a.m18521a(), c2826e.m13659f())) {
                obj = next;
                break;
            }
        }
        C3940r c3940r2 = (C3940r) obj;
        C2822a m13656c = c2826e.m13656c();
        AbstractC19074t.m100205c(m13656c);
        if (!m13656c.m13639a() && c3940r2 != null) {
            this.f101147d.m116345w("Request payment has uuid that not match the uuid associated with this GG account.", new Object[0]);
            c29673d.m147555I(c2826e.m13657d(), c2826e.m13654a(), EnumC21279d.SWITCH_FROM_ANOTHER_ZA_ACC, this.f101145b);
            return AbstractC29094b.m145339a(false);
        }
        return m99652b(c2826e, c29673d, activity, continuation);
    }
}
