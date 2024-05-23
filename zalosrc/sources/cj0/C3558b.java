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

/* renamed from: cj0.b */
/* loaded from: classes7.dex */
public final class C3558b extends AbstractC3559c {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private final C22501b f15046b;

    /* renamed from: cj0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj0.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: A */
        int f15047A;

        /* renamed from: s */
        Object f15048s;

        /* renamed from: t */
        Object f15049t;

        /* renamed from: u */
        Object f15050u;

        /* renamed from: v */
        Object f15051v;

        /* renamed from: w */
        Object f15052w;

        /* renamed from: x */
        Object f15053x;

        /* renamed from: y */
        /* synthetic */ Object f15054y;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15054y = obj;
            this.f15047A |= Integer.MIN_VALUE;
            return C3558b.this.mo18081d(null, null, null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3558b(C22501b c22501b) {
        super(c22501b);
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f15046b = c22501b;
    }

    @Override // cj0.AbstractC3559c
    /* renamed from: c */
    public Object mo18080c(C2826e c2826e, C18984a c18984a, Continuation continuation) {
        C3940r c3940r;
        if (c2826e.m13656c() == null) {
            return null;
        }
        if (c18984a != null) {
            c3940r = c18984a.m99647g();
        } else {
            c3940r = null;
        }
        if (c3940r == null) {
            this.f15046b.mo104551d("DeferredReplacementController: getBillingItemToInsert: Fail to insert billing item, we don't have purchase to insert.", new Object[0]);
            return null;
        }
        String m13657d = c2826e.m13657d();
        Object obj = c3940r.m18688c().get(0);
        AbstractC19074t.m100207e(obj, "purchase.products[0]");
        return new C0880c(0, m13657d, (String) obj, null, null, null, c2826e.m13658e(), c2826e.m13660g(), 0, c2826e.m13655b(), c2826e.m13654a(), c2826e.m13659f(), 313, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // cj0.AbstractC3559c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo18081d(AbstractC0878a abstractC0878a, C2826e c2826e, C3940r c3940r, String str, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        String str2;
        C2826e c2826e2;
        C3940r c3940r2;
        C3558b c3558b;
        AbstractC0878a abstractC0878a2;
        String str3;
        C0880c c0880c;
        String str4;
        C0880c c0880c2;
        AbstractC0878a abstractC0878a3;
        C3558b c3558b2;
        C2826e c2826e3;
        AbstractC0878a abstractC0878a4;
        String str5;
        String str6;
        String str7;
        C2826e c2826e4;
        C3558b c3558b3;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f15047A;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f15047A = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f15054y;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f15047A;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 == 4) {
                                    c0880c2 = (C0880c) bVar.f15051v;
                                    str4 = (String) bVar.f15050u;
                                    c2826e4 = (C2826e) bVar.f15049t;
                                    c3558b3 = (C3558b) bVar.f15048s;
                                    AbstractC24862s.m129228b(obj);
                                    c3558b2 = c3558b3;
                                    c2826e2 = c2826e4;
                                    c3558b2.m18086f(c2826e2, c0880c2);
                                    c3558b2.f15046b.m116345w("DeferredReplacementController: " + str4 + " Billing Item for server: " + c0880c2, new Object[0]);
                                    return c0880c2;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C0880c c0880c3 = (C0880c) bVar.f15048s;
                            AbstractC24862s.m129228b(obj);
                            return c0880c3;
                        }
                        str3 = (String) bVar.f15053x;
                        str5 = (String) bVar.f15052w;
                        c3940r2 = (C3940r) bVar.f15051v;
                        c2826e3 = (C2826e) bVar.f15050u;
                        abstractC0878a4 = (AbstractC0878a) bVar.f15049t;
                        c3558b2 = (C3558b) bVar.f15048s;
                        AbstractC24862s.m129228b(obj);
                        str2 = str5;
                        str4 = str3;
                        c0880c2 = (C0880c) obj;
                        abstractC0878a3 = abstractC0878a4;
                        c2826e2 = c2826e3;
                        if (c0880c2 == null) {
                            C0880c m2708a = C0880c.Companion.m2708a(c3940r2, str2);
                            c3558b2.f15046b.m116345w("DeferredReplacementController: " + str4 + " Create a new billing item for server: " + m2708a, new Object[0]);
                            C22501b c22501b = c3558b2.f15046b;
                            bVar.f15048s = m2708a;
                            bVar.f15049t = null;
                            bVar.f15050u = null;
                            bVar.f15051v = null;
                            bVar.f15052w = null;
                            bVar.f15053x = null;
                            bVar.f15047A = 3;
                            if (abstractC0878a3.m2668h(m2708a, c22501b, bVar) == m142578e) {
                                return m142578e;
                            }
                            return m2708a;
                        }
                        if (c0880c2.m2697e().length() == 0) {
                            bVar.f15048s = c3558b2;
                            bVar.f15049t = c2826e2;
                            bVar.f15050u = str4;
                            bVar.f15051v = c0880c2;
                            bVar.f15052w = null;
                            bVar.f15053x = null;
                            bVar.f15047A = 4;
                            if (c3558b2.m18083a(abstractC0878a3, c0880c2, c3940r2, bVar) == m142578e) {
                                return m142578e;
                            }
                            c2826e4 = c2826e2;
                            c3558b3 = c3558b2;
                            c3558b2 = c3558b3;
                            c2826e2 = c2826e4;
                        }
                        c3558b2.m18086f(c2826e2, c0880c2);
                        c3558b2.f15046b.m116345w("DeferredReplacementController: " + str4 + " Billing Item for server: " + c0880c2, new Object[0]);
                        return c0880c2;
                    }
                    str3 = (String) bVar.f15053x;
                    String str8 = (String) bVar.f15052w;
                    c3940r2 = (C3940r) bVar.f15051v;
                    c2826e2 = (C2826e) bVar.f15050u;
                    abstractC0878a2 = (AbstractC0878a) bVar.f15049t;
                    C3558b c3558b4 = (C3558b) bVar.f15048s;
                    AbstractC24862s.m129228b(obj);
                    str2 = str8;
                    c3558b = c3558b4;
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (c2826e != null) {
                        String m13657d = c2826e.m13657d();
                        bVar.f15048s = this;
                        bVar.f15049t = abstractC0878a;
                        bVar.f15050u = c2826e;
                        bVar.f15051v = c3940r;
                        str2 = str;
                        bVar.f15052w = str2;
                        bVar.f15053x = "getBillingItemToSubmitServer";
                        bVar.f15047A = 1;
                        Object mo2667g = abstractC0878a.mo2667g(m13657d, bVar);
                        if (mo2667g == m142578e) {
                            return m142578e;
                        }
                        c2826e2 = c2826e;
                        c3558b = this;
                        abstractC0878a2 = abstractC0878a;
                        str3 = "getBillingItemToSubmitServer";
                        obj = mo2667g;
                        c3940r2 = c3940r;
                    } else {
                        str2 = str;
                        c2826e2 = c2826e;
                        c3940r2 = c3940r;
                        c3558b = this;
                        abstractC0878a2 = abstractC0878a;
                        str3 = "getBillingItemToSubmitServer";
                        c0880c = null;
                        if (c0880c != null) {
                            bVar.f15048s = c3558b;
                            bVar.f15049t = abstractC0878a2;
                            bVar.f15050u = c2826e2;
                            bVar.f15051v = c3940r2;
                            bVar.f15052w = str2;
                            bVar.f15053x = str3;
                            bVar.f15047A = 2;
                            obj = c3558b.m18084b(c3940r2, abstractC0878a2, bVar);
                            if (obj == m142578e) {
                                return m142578e;
                            }
                            c2826e3 = c2826e2;
                            abstractC0878a4 = abstractC0878a2;
                            c3558b2 = c3558b;
                            str5 = str2;
                            str2 = str5;
                            str4 = str3;
                            c0880c2 = (C0880c) obj;
                            abstractC0878a3 = abstractC0878a4;
                            c2826e2 = c2826e3;
                            if (c0880c2 == null) {
                            }
                        } else {
                            C3558b c3558b5 = c3558b;
                            str4 = str3;
                            c0880c2 = c0880c;
                            abstractC0878a3 = abstractC0878a2;
                            c3558b2 = c3558b5;
                            if (c0880c2 == null) {
                            }
                        }
                    }
                }
                c0880c = (C0880c) obj;
                if (c0880c == null) {
                    str6 = c0880c.m2695c();
                } else {
                    str6 = null;
                }
                if (AbstractC19074t.m100204b(str6, c3940r2.m18688c().get(0))) {
                    if (c0880c != null) {
                        str7 = c0880c.m2700h();
                    } else {
                        str7 = null;
                    }
                    if (AbstractC19074t.m100204b(str7, c2826e2.m13654a())) {
                        c3558b.f15046b.m116345w("DeferredReplacementController: " + str3 + ": Get billing item by [tranxId] successfully", new Object[0]);
                        if (c0880c != null) {
                        }
                    }
                }
                c0880c = null;
                if (c0880c != null) {
                }
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f15054y;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f15047A;
        if (i11 == 0) {
        }
        c0880c = (C0880c) obj2;
        if (c0880c == null) {
        }
        if (AbstractC19074t.m100204b(str6, c3940r2.m18688c().get(0))) {
        }
        c0880c = null;
        if (c0880c != null) {
        }
    }
}
