package cj0;

import aj0.AbstractC0878a;
import aj0.C0880c;
import bj0.C2826e;
import com.android.billingclient.api.C3878a;
import com.android.billingclient.api.C3940r;
import fj0.C18984a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import p248iy.AbstractC20887g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;

/* renamed from: cj0.c */
/* loaded from: classes.dex */
public abstract class AbstractC3559c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C22501b f15056a;

    /* renamed from: cj0.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj0.c$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f15057s;

        /* renamed from: t */
        Object f15058t;

        /* renamed from: u */
        /* synthetic */ Object f15059u;

        /* renamed from: w */
        int f15061w;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15059u = obj;
            this.f15061w |= Integer.MIN_VALUE;
            return AbstractC3559c.this.m18083a(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj0.c$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f15062s;

        /* renamed from: t */
        Object f15063t;

        /* renamed from: u */
        /* synthetic */ Object f15064u;

        /* renamed from: w */
        int f15066w;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15064u = obj;
            this.f15066w |= Integer.MIN_VALUE;
            return AbstractC3559c.this.m18085e(null, null, null, this);
        }
    }

    public AbstractC3559c(C22501b c22501b) {
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f15056a = c22501b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18083a(AbstractC0878a abstractC0878a, C0880c c0880c, C3940r c3940r, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        AbstractC3559c abstractC3559c;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f15061w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f15061w = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f15059u;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar2.f15061w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c0880c = (C0880c) bVar2.f15058t;
                        abstractC3559c = (AbstractC3559c) bVar2.f15057s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    String m18687b = c3940r.m18687b();
                    AbstractC19074t.m100207e(m18687b, "purchase.originalJson");
                    c0880c.m2705m(m18687b);
                    String m18691f = c3940r.m18691f();
                    AbstractC19074t.m100207e(m18691f, "purchase.purchaseToken");
                    c0880c.m2707o(m18691f);
                    String m18692g = c3940r.m18692g();
                    AbstractC19074t.m100207e(m18692g, "purchase.signature");
                    c0880c.m2706n(m18692g);
                    String m2701i = c0880c.m2701i();
                    String m2697e = c0880c.m2697e();
                    String m2699g = c0880c.m2699g();
                    String m2698f = c0880c.m2698f();
                    bVar2.f15057s = this;
                    bVar2.f15058t = c0880c;
                    bVar2.f15061w = 1;
                    obj = abstractC0878a.mo2672l(m2701i, m2697e, m2699g, m2698f, bVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    abstractC3559c = this;
                }
                int intValue = ((Number) obj).intValue();
                abstractC3559c.f15056a.m116346x(true, "ProcessPurchaseController: fillPurchaseDataToBillingItem: Update purchase by tranxId: " + c0880c.m2701i() + ". Affected row: " + intValue, new Object[0]);
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.f15059u;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar22.f15061w;
        if (i11 == 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        abstractC3559c.f15056a.m116346x(true, "ProcessPurchaseController: fillPurchaseDataToBillingItem: Update purchase by tranxId: " + c0880c.m2701i() + ". Affected row: " + intValue2, new Object[0]);
        return C24848g0.f119245a;
    }

    /* renamed from: b */
    public final Object m18084b(C3940r c3940r, AbstractC0878a abstractC0878a, Continuation continuation) {
        String str;
        C3878a m18686a = c3940r.m18686a();
        if (m18686a != null) {
            str = m18686a.m18521a();
        } else {
            str = null;
        }
        String str2 = str;
        if (str2 == null) {
            this.f15056a.m116345w("ProcessPurchaseController: queryBillingItemByProductIdAndPurchaseTime: Purchase's obfuscatedAccountId null. Get billing item by [product id + purchase time] successful.", new Object[0]);
            long m18690e = c3940r.m18690e();
            Object obj = c3940r.m18688c().get(0);
            AbstractC19074t.m100207e(obj, "purchase.products[0]");
            return abstractC0878a.mo2665e(m18690e, (String) obj, continuation);
        }
        this.f15056a.m116345w("ProcessPurchaseController: queryBillingItemByProductIdAndPurchaseTime: Get billing item by [product id + purchase time + purchaseObfuscatedAccountId: " + str2 + "] successful.", new Object[0]);
        long m18690e2 = c3940r.m18690e();
        Object obj2 = c3940r.m18688c().get(0);
        AbstractC19074t.m100207e(obj2, "purchase.products[0]");
        return abstractC0878a.mo2664d(m18690e2, (String) obj2, str2, continuation);
    }

    /* renamed from: c */
    public abstract Object mo18080c(C2826e c2826e, C18984a c18984a, Continuation continuation);

    /* renamed from: d */
    public abstract Object mo18081d(AbstractC0878a abstractC0878a, C2826e c2826e, C3940r c3940r, String str, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18085e(AbstractC0878a abstractC0878a, C2826e c2826e, C18984a c18984a, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        AbstractC3559c abstractC3559c;
        C0880c c0880c;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f15066w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f15066w = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f15064u;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f15066w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            AbstractC29094b.m145342d(((Number) obj).longValue());
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC0878a = (AbstractC0878a) cVar.f15063t;
                    abstractC3559c = (AbstractC3559c) cVar.f15062s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    cVar.f15062s = this;
                    cVar.f15063t = abstractC0878a;
                    cVar.f15066w = 1;
                    obj = mo18080c(c2826e, c18984a, cVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    abstractC3559c = this;
                }
                c0880c = (C0880c) obj;
                if (c0880c != null) {
                    C22501b c22501b = abstractC3559c.f15056a;
                    cVar.f15062s = null;
                    cVar.f15063t = null;
                    cVar.f15066w = 2;
                    obj = abstractC0878a.m2668h(c0880c, c22501b, cVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    AbstractC29094b.m145342d(((Number) obj).longValue());
                }
                return C24848g0.f119245a;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f15064u;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f15066w;
        if (i11 == 0) {
        }
        c0880c = (C0880c) obj2;
        if (c0880c != null) {
        }
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final void m18086f(C2826e c2826e, C0880c c0880c) {
        if (c2826e != null) {
            AbstractC20887g.m109217D(79921, null, 2, null);
            if (c0880c != null) {
                AbstractC20887g.m109217D(79922, null, 2, null);
                return;
            } else {
                AbstractC20887g.m109244v(79922, null, 2, null);
                return;
            }
        }
        if (c0880c == null || c0880c.m2704l() == 0) {
            AbstractC20887g.m109244v(79921, null, 2, null);
        }
        if (c0880c != null) {
            AbstractC20887g.m109217D(79923, null, 2, null);
        } else {
            AbstractC20887g.m109244v(79923, null, 2, null);
        }
    }
}
