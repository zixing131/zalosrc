package cj0;

import aj0.AbstractC0878a;
import aj0.C0880c;
import bj0.C2826e;
import com.android.billingclient.api.C3940r;
import fj0.C18984a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import pm0.AbstractC24862s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: cj0.a */
/* loaded from: classes.dex */
public final class C3557a extends AbstractC3559c {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private final C22501b f15029b;

    /* renamed from: cj0.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj0.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f15030s;

        /* renamed from: t */
        Object f15031t;

        /* renamed from: u */
        Object f15032u;

        /* renamed from: v */
        Object f15033v;

        /* renamed from: w */
        Object f15034w;

        /* renamed from: x */
        /* synthetic */ Object f15035x;

        /* renamed from: z */
        int f15037z;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15035x = obj;
            this.f15037z |= Integer.MIN_VALUE;
            return C3557a.this.mo18081d(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj0.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f15038s;

        /* renamed from: t */
        Object f15039t;

        /* renamed from: u */
        Object f15040u;

        /* renamed from: v */
        Object f15041v;

        /* renamed from: w */
        Object f15042w;

        /* renamed from: x */
        /* synthetic */ Object f15043x;

        /* renamed from: z */
        int f15045z;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15043x = obj;
            this.f15045z |= Integer.MIN_VALUE;
            return C3557a.this.m18082g(null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3557a(C22501b c22501b) {
        super(c22501b);
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f15029b = c22501b;
    }

    @Override // cj0.AbstractC3559c
    /* renamed from: c */
    public Object mo18080c(C2826e c2826e, C18984a c18984a, Continuation continuation) {
        return new C0880c(0, c2826e.m13657d(), c2826e.m13654a(), null, null, null, c2826e.m13658e(), c2826e.m13660g(), 0, c2826e.m13655b(), c2826e.m13654a(), c2826e.m13659f(), 313, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // cj0.AbstractC3559c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo18081d(AbstractC0878a abstractC0878a, C2826e c2826e, C3940r c3940r, String str, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C3557a c3557a;
        String str2;
        C0880c c0880c;
        C0880c c0880c2;
        C3557a c3557a2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f15037z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f15037z = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f15035x;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f15037z;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                c0880c2 = (C0880c) bVar.f15032u;
                                str2 = (String) bVar.f15031t;
                                c3557a2 = (C3557a) bVar.f15030s;
                                AbstractC24862s.m129228b(obj);
                                c0880c = c0880c2;
                                c3557a = c3557a2;
                                c3557a.f15029b.m116345w("DefaultProcessPurchaseController: " + str2 + " Billing item for server: " + c0880c, new Object[0]);
                                return c0880c;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0880c c0880c3 = (C0880c) bVar.f15030s;
                        AbstractC24862s.m129228b(obj);
                        return c0880c3;
                    }
                    String str3 = (String) bVar.f15034w;
                    str = (String) bVar.f15033v;
                    c3940r = (C3940r) bVar.f15032u;
                    AbstractC0878a abstractC0878a2 = (AbstractC0878a) bVar.f15031t;
                    c3557a = (C3557a) bVar.f15030s;
                    AbstractC24862s.m129228b(obj);
                    str2 = str3;
                    abstractC0878a = abstractC0878a2;
                } else {
                    AbstractC24862s.m129228b(obj);
                    bVar.f15030s = this;
                    bVar.f15031t = abstractC0878a;
                    bVar.f15032u = c3940r;
                    bVar.f15033v = str;
                    bVar.f15034w = "getBillingItemToSubmitServer";
                    bVar.f15037z = 1;
                    Object m18082g = m18082g(c2826e, c3940r, abstractC0878a, bVar);
                    if (m18082g == m142578e) {
                        return m142578e;
                    }
                    c3557a = this;
                    obj = m18082g;
                    str2 = "getBillingItemToSubmitServer";
                }
                c0880c = (C0880c) obj;
                if (c0880c != null) {
                    C0880c m2708a = C0880c.Companion.m2708a(c3940r, str);
                    c3557a.f15029b.m116345w("DefaultProcessPurchaseController: " + str2 + " Create a new billing item for server: " + m2708a, new Object[0]);
                    C22501b c22501b = c3557a.f15029b;
                    bVar.f15030s = m2708a;
                    bVar.f15031t = null;
                    bVar.f15032u = null;
                    bVar.f15033v = null;
                    bVar.f15034w = null;
                    bVar.f15037z = 2;
                    if (abstractC0878a.m2668h(m2708a, c22501b, bVar) == m142578e) {
                        return m142578e;
                    }
                    return m2708a;
                }
                if (c0880c.m2697e().length() == 0) {
                    bVar.f15030s = c3557a;
                    bVar.f15031t = str2;
                    bVar.f15032u = c0880c;
                    bVar.f15033v = null;
                    bVar.f15034w = null;
                    bVar.f15037z = 3;
                    if (c3557a.m18083a(abstractC0878a, c0880c, c3940r, bVar) == m142578e) {
                        return m142578e;
                    }
                    c0880c2 = c0880c;
                    c3557a2 = c3557a;
                    c0880c = c0880c2;
                    c3557a = c3557a2;
                }
                c3557a.f15029b.m116345w("DefaultProcessPurchaseController: " + str2 + " Billing item for server: " + c0880c, new Object[0]);
                return c0880c;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f15035x;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f15037z;
        if (i11 == 0) {
        }
        c0880c = (C0880c) obj2;
        if (c0880c != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18082g(C2826e c2826e, C3940r c3940r, AbstractC0878a abstractC0878a, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        C0880c c0880c;
        C0880c c0880c2;
        AbstractC0878a abstractC0878a2;
        C3940r c3940r2;
        C3557a c3557a;
        C3557a c3557a2;
        C2826e c2826e2;
        String str;
        C0880c c0880c3;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f15045z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f15045z = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f15043x;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f15045z;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            c2826e = (C2826e) cVar.f15039t;
                            c3557a = (C3557a) cVar.f15038s;
                            AbstractC24862s.m129228b(obj);
                            c0880c2 = (C0880c) obj;
                            c3557a.m18086f(c2826e, c0880c2);
                            return c0880c2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) cVar.f15042w;
                    abstractC0878a = (AbstractC0878a) cVar.f15041v;
                    c3940r = (C3940r) cVar.f15040u;
                    c2826e2 = (C2826e) cVar.f15039t;
                    c3557a2 = (C3557a) cVar.f15038s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (c2826e != null && AbstractC19074t.m100204b(c2826e.m13654a(), c3940r.m18688c().get(0)) && !c2826e.m13661h()) {
                        c0880c = C0880c.Companion.m2709b(c2826e);
                        this.f15029b.m116345w("Get billing item by tranxID successful.", new Object[0]);
                    } else {
                        c0880c = null;
                    }
                    if (c0880c == null) {
                        String m18691f = c3940r.m18691f();
                        AbstractC19074t.m100207e(m18691f, "purchase.purchaseToken");
                        cVar.f15038s = this;
                        cVar.f15039t = c2826e;
                        cVar.f15040u = c3940r;
                        cVar.f15041v = abstractC0878a;
                        cVar.f15042w = "priorityGetBillingItemFromDb";
                        cVar.f15045z = 1;
                        obj = abstractC0878a.mo2666f(m18691f, cVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c3557a2 = this;
                        c2826e2 = c2826e;
                        str = "priorityGetBillingItemFromDb";
                    } else {
                        c0880c2 = c0880c;
                        abstractC0878a2 = abstractC0878a;
                        c3940r2 = c3940r;
                        c3557a = this;
                        if (c0880c2 == null) {
                            cVar.f15038s = c3557a;
                            cVar.f15039t = c2826e;
                            cVar.f15040u = null;
                            cVar.f15041v = null;
                            cVar.f15042w = null;
                            cVar.f15045z = 2;
                            obj = c3557a.m18084b(c3940r2, abstractC0878a2, cVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            c0880c2 = (C0880c) obj;
                        }
                        c3557a.m18086f(c2826e, c0880c2);
                        return c0880c2;
                    }
                }
                c0880c3 = (C0880c) obj;
                if (c0880c3 != null) {
                    c3557a2.f15029b.m116345w("DefaultProcessPurchaseController: " + str + ": Get billing item by purchase token successful.", new Object[0]);
                }
                c2826e = c2826e2;
                c0880c2 = c0880c3;
                abstractC0878a2 = abstractC0878a;
                c3940r2 = c3940r;
                c3557a = c3557a2;
                if (c0880c2 == null) {
                }
                c3557a.m18086f(c2826e, c0880c2);
                return c0880c2;
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f15043x;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f15045z;
        if (i11 == 0) {
        }
        c0880c3 = (C0880c) obj2;
        if (c0880c3 != null) {
        }
        c2826e = c2826e2;
        c0880c2 = c0880c3;
        abstractC0878a2 = abstractC0878a;
        c3940r2 = c3940r;
        c3557a = c3557a2;
        if (c0880c2 == null) {
        }
        c3557a.m18086f(c2826e, c0880c2);
        return c0880c2;
    }
}
