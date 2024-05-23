package aq;

import ae.C0758c;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import is.AbstractC20833z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p040bq.InterfaceC3115a;
import p716zh.C32078q7;
import pm0.C24848g0;
import pm0.C24865v;

/* renamed from: aq.h */
/* loaded from: classes4.dex */
public final class C2288h implements InterfaceC2285e, InterfaceC2281a {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final Object f9679c = new Object();

    /* renamed from: d */
    private static C2288h f9680d;

    /* renamed from: e */
    private static int f9681e;

    /* renamed from: a */
    private final InterfaceC2285e f9682a;

    /* renamed from: b */
    private final InterfaceC2281a f9683b;

    /* renamed from: aq.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2288h m12129a() {
            if (C2288h.f9680d == null) {
                synchronized (C2288h.f9679c) {
                    C2288h.f9680d = new C2288h(new C2286f(), new C2282b(), null);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            }
            return C2288h.f9680d;
        }

        /* renamed from: b */
        public final int m12130b() {
            return C2288h.f9681e;
        }

        /* renamed from: c */
        public final void m12131c(int i11) {
            C2288h.f9681e = i11;
        }
    }

    /* renamed from: aq.h$b */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final a Companion = new a(null);

        /* renamed from: a */
        private final List f9684a;

        /* renamed from: b */
        private final List f9685b;

        /* renamed from: c */
        private final List f9686c;

        /* renamed from: d */
        private final List f9687d;

        /* renamed from: aq.h$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC19060k abstractC19060k) {
                this();
            }

            /* renamed from: a */
            public final b m12136a() {
                return new b(new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList());
            }
        }

        public b(List list, List list2, List list3, List list4) {
            AbstractC19074t.m100208f(list, "notificationList");
            AbstractC19074t.m100208f(list2, "objectIdList");
            AbstractC19074t.m100208f(list3, "contentList");
            AbstractC19074t.m100208f(list4, "notificationIdList");
            this.f9684a = list;
            this.f9685b = list2;
            this.f9686c = list3;
            this.f9687d = list4;
        }

        /* renamed from: a */
        public final List m12132a() {
            return this.f9686c;
        }

        /* renamed from: b */
        public final List m12133b() {
            return this.f9687d;
        }

        /* renamed from: c */
        public final List m12134c() {
            return this.f9684a;
        }

        /* renamed from: d */
        public final List m12135d() {
            return this.f9685b;
        }
    }

    /* renamed from: aq.h$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC3115a f9689b;

        c(InterfaceC3115a interfaceC3115a) {
            this.f9689b = interfaceC3115a;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            a aVar = C2288h.Companion;
            if (aVar.m12130b() < 1) {
                try {
                    aVar.m12131c(aVar.m12130b() + 1);
                    TimeUnit.MILLISECONDS.sleep(2000L);
                    C2288h.this.m12128t(this.f9689b);
                    return;
                } catch (InterruptedException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return;
                }
            }
            aVar.m12131c(0);
            this.f9689b.mo15734b(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "obj");
            C2288h.Companion.m12131c(0);
            C2288h c2288h = C2288h.this;
            b m12126u = c2288h.m12126u(obj, c2288h.mo12064h());
            C2288h.this.m12127v(m12126u.m12135d(), m12126u.m12132a(), m12126u.m12133b());
            this.f9689b.onSuccess(m12126u.m12134c());
        }
    }

    public /* synthetic */ C2288h(InterfaceC2285e interfaceC2285e, InterfaceC2281a interfaceC2281a, AbstractC19060k abstractC19060k) {
        this(interfaceC2285e, interfaceC2281a);
    }

    /* renamed from: s */
    public static final C2288h m12125s() {
        return Companion.m12129a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:            if (r7 == false) goto L16;     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b m12126u(Object obj, HashMap hashMap) {
        JSONObject jSONObject;
        try {
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
            JSONArray jSONArray = ((JSONObject) obj).getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            C24865v c24865v = new C24865v(new ArrayList(), new ArrayList(), new ArrayList());
            List list = (List) c24865v.m129229a();
            List list2 = (List) c24865v.m129230b();
            List list3 = (List) c24865v.m129231c();
            boolean mo12059c = mo12059c();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    jSONObject = jSONArray.getJSONObject(i11);
                } catch (Exception e11) {
                    e = e11;
                }
                if (jSONObject != null) {
                    C32078q7 c32078q7 = new C32078q7(jSONObject);
                    if (c32078q7.m154749L() != 122) {
                        if (c32078q7.m154749L() == 213) {
                        }
                        String jSONObject2 = jSONObject.toString();
                        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                        C24865v c24865v2 = new C24865v(c32078q7.m154738A(), String.valueOf(c32078q7.m154749L()), c32078q7.m154761r());
                        String str = (String) c24865v2.m129229a();
                        try {
                            c32078q7.f147742H = hashMap.containsKey(str + "_" + ((String) c24865v2.m129230b()) + "_" + ((String) c24865v2.m129231c()));
                            arrayList.add(c32078q7);
                            AbstractC19074t.m100205c(str);
                            list.add(str);
                            list2.add(jSONObject2);
                            list3.add(Long.valueOf(c32078q7.m154769z()));
                        } catch (Exception e12) {
                            e = e12;
                            AbstractC20110a.f98889a.mo104552e(e);
                        }
                    }
                }
            }
            return new b(arrayList, list, list2, list3);
        } catch (Exception e13) {
            AbstractC20110a.f98889a.mo104552e(e13);
            return b.Companion.m12136a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m12127v(List list, List list2, List list3) {
        try {
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            mo12060d(str);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            mo12062f(str2, list, list2, list3);
            mo12061e(false);
            AbstractC20833z.m108894I();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // aq.InterfaceC2281a
    /* renamed from: a */
    public void mo12021a(String str, String str2, C0758c c0758c) {
        AbstractC19074t.m100208f(str, "page");
        AbstractC19074t.m100208f(str2, "limit");
        AbstractC19074t.m100208f(c0758c, "feedBusiness");
        this.f9683b.mo12021a(str, str2, c0758c);
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: b */
    public int mo12058b(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "objId");
        AbstractC19074t.m100208f(str2, "actId");
        AbstractC19074t.m100208f(str3, "extraInfo");
        return this.f9682a.mo12058b(str, str2, str3);
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: c */
    public boolean mo12059c() {
        return this.f9682a.mo12059c();
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: d */
    public void mo12060d(String str) {
        AbstractC19074t.m100208f(str, "userId");
        this.f9682a.mo12060d(str);
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: e */
    public void mo12061e(boolean z11) {
        this.f9682a.mo12061e(z11);
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: f */
    public void mo12062f(String str, List list, List list2, List list3) {
        AbstractC19074t.m100208f(str, "userId");
        AbstractC19074t.m100208f(list, "objIdList");
        AbstractC19074t.m100208f(list2, "contentList");
        AbstractC19074t.m100208f(list3, "notificationIds");
        this.f9682a.mo12062f(str, list, list2, list3);
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: g */
    public int mo12063g(String str) {
        AbstractC19074t.m100208f(str, "actId");
        return this.f9682a.mo12063g(str);
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: h */
    public HashMap mo12064h() {
        HashMap mo12064h = this.f9682a.mo12064h();
        AbstractC19074t.m100207e(mo12064h, "getNewNotificationItems(...)");
        return mo12064h;
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: i */
    public List mo12065i(String str) {
        AbstractC19074t.m100208f(str, "userId");
        List mo12065i = this.f9682a.mo12065i(str);
        AbstractC19074t.m100207e(mo12065i, "getUserNotificationList(...)");
        return mo12065i;
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: j */
    public boolean mo12066j(String str, long j11) {
        AbstractC19074t.m100208f(str, "userId");
        return this.f9682a.mo12066j(str, j11);
    }

    @Override // aq.InterfaceC2285e
    /* renamed from: k */
    public int mo12067k() {
        return this.f9682a.mo12067k();
    }

    /* renamed from: t */
    public final void m12128t(InterfaceC3115a interfaceC3115a) {
        AbstractC19074t.m100208f(interfaceC3115a, "callbackState");
        c cVar = new c(interfaceC3115a);
        C0758c c0758c = new C0758c();
        c0758c.m1341j(cVar);
        mo12021a("1", "20", c0758c);
    }

    private C2288h(InterfaceC2285e interfaceC2285e, InterfaceC2281a interfaceC2281a) {
        this.f9682a = interfaceC2285e;
        this.f9683b = interfaceC2281a;
    }
}
