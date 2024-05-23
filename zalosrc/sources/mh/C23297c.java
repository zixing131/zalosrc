package mh;

import ae.C0757b;
import ae.C0759d;
import ae.C0763h;
import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0943w;
import be0.C2779d;
import be0.C2780e;
import be0.C2787l;
import be0.C2788m;
import com.zing.zalo.data.entity.chat.message.LastDeliveredSeenData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19051f0;
import fn0.C19059j0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p461qu.AbstractC25495a;
import p716zh.C31973j5;
import p716zh.C32076q5;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: mh.c */
/* loaded from: classes3.dex */
public final class C23297c {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C7960e f113085a;

    /* renamed from: b */
    private final C0943w f113086b;

    /* renamed from: c */
    private final Map f113087c;

    /* renamed from: d */
    private final Set f113088d;

    /* renamed from: e */
    private final Map f113089e;

    /* renamed from: mh.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: mh.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f113090s;

        /* renamed from: t */
        Object f113091t;

        /* renamed from: u */
        Object f113092u;

        /* renamed from: v */
        /* synthetic */ Object f113093v;

        /* renamed from: x */
        int f113095x;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113093v = obj;
            this.f113095x |= Integer.MIN_VALUE;
            return C23297c.this.m120449g(null, this);
        }
    }

    /* renamed from: mh.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113096t;

        /* renamed from: u */
        final /* synthetic */ C19051f0 f113097u;

        /* renamed from: v */
        final /* synthetic */ String f113098v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C19051f0 c19051f0, String str, Continuation continuation) {
            super(2, continuation);
            this.f113097u = c19051f0;
            this.f113098v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f113097u, this.f113098v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113096t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f113097u.f94928p = C7960e.m41971c6().m42574w9(this.f113098v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f113099s;

        /* renamed from: t */
        /* synthetic */ Object f113100t;

        /* renamed from: v */
        int f113102v;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113100t = obj;
            this.f113102v |= Integer.MIN_VALUE;
            return C23297c.this.m120450h(this);
        }
    }

    /* renamed from: mh.c$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113103t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113103t == 0) {
                AbstractC24862s.m129228b(obj);
                C23297c.this.f113085a.m42159J0();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f113105s;

        /* renamed from: t */
        boolean f113106t;

        /* renamed from: u */
        /* synthetic */ Object f113107u;

        /* renamed from: w */
        int f113109w;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113107u = obj;
            this.f113109w |= Integer.MIN_VALUE;
            return C23297c.this.m120451i(false, this);
        }
    }

    /* renamed from: mh.c$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113110t;

        /* renamed from: v */
        final /* synthetic */ boolean f113112v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f113112v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f113112v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113110t == 0) {
                AbstractC24862s.m129228b(obj);
                C23297c.this.f113085a.m42172K0(this.f113112v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: A */
        int f113113A;

        /* renamed from: s */
        Object f113114s;

        /* renamed from: t */
        Object f113115t;

        /* renamed from: u */
        Object f113116u;

        /* renamed from: v */
        Object f113117v;

        /* renamed from: w */
        Object f113118w;

        /* renamed from: x */
        Object f113119x;

        /* renamed from: y */
        /* synthetic */ Object f113120y;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113120y = obj;
            this.f113113A |= Integer.MIN_VALUE;
            return C23297c.this.m120452j(null, this);
        }
    }

    /* renamed from: mh.c$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113122t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f113123u;

        /* renamed from: v */
        final /* synthetic */ C23297c f113124v;

        /* renamed from: w */
        final /* synthetic */ String f113125w;

        /* renamed from: x */
        final /* synthetic */ C19059j0 f113126x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C19059j0 c19059j0, C23297c c23297c, String str, C19059j0 c19059j02, Continuation continuation) {
            super(2, continuation);
            this.f113123u = c19059j0;
            this.f113124v = c23297c;
            this.f113125w = str;
            this.f113126x = c19059j02;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f113123u, this.f113124v, this.f113125w, this.f113126x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113122t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f113123u.f94941p = this.f113124v.f113086b.m4476k(AbstractC25495a.m132088m(this.f113125w));
                this.f113126x.f94941p = this.f113124v.f113086b.m4472f(AbstractC25495a.m132088m(this.f113125w));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113127t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f113128u;

        /* renamed from: v */
        final /* synthetic */ String f113129v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C19059j0 c19059j0, String str, Continuation continuation) {
            super(2, continuation);
            this.f113128u = c19059j0;
            this.f113129v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f113128u, this.f113129v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            MessageId messageId;
            AbstractC28298d.m142578e();
            if (this.f113127t == 0) {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j0 = this.f113128u;
                C17945a0 m41516L = C7956b.Companion.m41573b().m41516L(this.f113129v);
                if (m41516L != null) {
                    messageId = m41516L.m95029V3();
                } else {
                    messageId = null;
                }
                c19059j0.f94941p = messageId;
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113130t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f113131u;

        /* renamed from: v */
        final /* synthetic */ String f113132v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(C19059j0 c19059j0, String str, Continuation continuation) {
            super(2, continuation);
            this.f113131u = c19059j0;
            this.f113132v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f113131u, this.f113132v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            MessageId messageId;
            AbstractC28298d.m142578e();
            if (this.f113130t == 0) {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j0 = this.f113131u;
                C17945a0 m41516L = C7956b.Companion.m41573b().m41516L(this.f113132v);
                if (m41516L != null) {
                    messageId = m41516L.m95029V3();
                } else {
                    messageId = null;
                }
                c19059j0.f94941p = messageId;
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC29096d {

        /* renamed from: s */
        Object f113133s;

        /* renamed from: t */
        Object f113134t;

        /* renamed from: u */
        Object f113135u;

        /* renamed from: v */
        /* synthetic */ Object f113136v;

        /* renamed from: x */
        int f113138x;

        l(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113136v = obj;
            this.f113138x |= Integer.MIN_VALUE;
            return C23297c.this.m120446k(null, null, this);
        }
    }

    /* renamed from: mh.c$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113139t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f113140u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C19059j0 c19059j0, Continuation continuation) {
            super(2, continuation);
            this.f113140u = c19059j0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(this.f113140u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113139t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f113140u.f94941p = new JSONObject();
                return ((JSONObject) this.f113140u.f94941p).put("last_reason_pull", AbstractC0924m0.m3589Y1());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$n */
    /* loaded from: classes3.dex */
    public static final class n implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f113142b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f113143c;

        /* renamed from: mh.c$n$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f113144t;

            /* renamed from: u */
            final /* synthetic */ Object f113145u;

            /* renamed from: v */
            final /* synthetic */ C23297c f113146v;

            /* renamed from: w */
            final /* synthetic */ String f113147w;

            /* renamed from: x */
            final /* synthetic */ JSONObject f113148x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C23297c c23297c, String str, JSONObject jSONObject, Continuation continuation) {
                super(2, continuation);
                this.f113145u = obj;
                this.f113146v = c23297c;
                this.f113147w = str;
                this.f113148x = jSONObject;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f113145u, this.f113146v, this.f113147w, this.f113148x, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x009e A[RETURN] */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C23297c c23297c;
                String str;
                Map map;
                int i11;
                m142578e = AbstractC28298d.m142578e();
                int i12 = this.f113144t;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            AbstractC24862s.m129228b(obj);
                            this.f113146v.f113088d.remove(this.f113147w);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    Object obj2 = this.f113145u;
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONArray optJSONArray = ((JSONObject) obj2).optJSONArray("data");
                    if (optJSONArray != null) {
                        C2788m m120711s1 = AbstractC23306f.m120711s1();
                        C2788m.a aVar = new C2788m.a(optJSONArray);
                        this.f113144t = 1;
                        obj = m120711s1.m101498a(aVar, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    c23297c = this.f113146v;
                    str = this.f113147w;
                    this.f113144t = 2;
                    if (C23297c.m120448n(c23297c, str, false, this, 2, null) == m142578e) {
                        return m142578e;
                    }
                    this.f113146v.f113088d.remove(this.f113147w);
                    return C24848g0.f119245a;
                }
                C2788m.b bVar = (C2788m.b) obj;
                if (bVar != null) {
                    map = bVar.m13430a();
                } else {
                    map = null;
                }
                if (map != null) {
                    String str2 = this.f113147w;
                    JSONObject jSONObject = this.f113148x;
                    Integer num = (Integer) map.get(str2);
                    if (num != null) {
                        i11 = num.intValue();
                    } else {
                        i11 = 0;
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("numChanged", i11);
                    C0815e1.m2075D().m2100V(new C23648e(59, "", 1, "pull_status_message_response", "1", jSONObject.toString()), false);
                }
                c23297c = this.f113146v;
                str = this.f113147w;
                this.f113144t = 2;
                if (C23297c.m120448n(c23297c, str, false, this, 2, null) == m142578e) {
                }
                this.f113146v.f113088d.remove(this.f113147w);
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        n(String str, JSONObject jSONObject) {
            this.f113142b = str;
            this.f113143c = jSONObject;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            Map map = C23297c.this.f113089e;
            AbstractC19074t.m100207e(map, "access$getMapRetryCounterPullConversation$p(...)");
            String str = this.f113142b;
            Integer num = (Integer) C23297c.this.f113089e.get(this.f113142b);
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            map.put(str, Integer.valueOf(i11 + 1));
            C23297c.this.f113088d.remove(this.f113142b);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new a(obj, C23297c.this, this.f113142b, this.f113143c, null), 3, null);
        }
    }

    /* renamed from: mh.c$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC29096d {

        /* renamed from: s */
        Object f113149s;

        /* renamed from: t */
        Object f113150t;

        /* renamed from: u */
        Object f113151u;

        /* renamed from: v */
        Object f113152v;

        /* renamed from: w */
        /* synthetic */ Object f113153w;

        /* renamed from: y */
        int f113155y;

        o(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113153w = obj;
            this.f113155y |= Integer.MIN_VALUE;
            return C23297c.this.m120447l(null, null, null, this);
        }
    }

    /* renamed from: mh.c$p */
    /* loaded from: classes3.dex */
    public static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113156t;

        /* renamed from: u */
        final /* synthetic */ C19059j0 f113157u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(C19059j0 c19059j0, Continuation continuation) {
            super(2, continuation);
            this.f113157u = c19059j0;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f113157u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113156t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f113157u.f94941p = new JSONObject();
                return ((JSONObject) this.f113157u.f94941p).put("last_reason_pull", AbstractC0924m0.m3560X1());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.c$q */
    /* loaded from: classes3.dex */
    public static final class q implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ String f113159b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f113160c;

        /* renamed from: mh.c$q$a */
        /* loaded from: classes3.dex */
        static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f113161t;

            /* renamed from: u */
            final /* synthetic */ Object f113162u;

            /* renamed from: v */
            final /* synthetic */ C23297c f113163v;

            /* renamed from: w */
            final /* synthetic */ String f113164w;

            /* renamed from: x */
            final /* synthetic */ JSONObject f113165x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, C23297c c23297c, String str, JSONObject jSONObject, Continuation continuation) {
                super(2, continuation);
                this.f113162u = obj;
                this.f113163v = c23297c;
                this.f113164w = str;
                this.f113165x = jSONObject;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f113162u, this.f113163v, this.f113164w, this.f113165x, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x00a2 A[RETURN] */
            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C23297c c23297c;
                String str;
                Map map;
                int i11;
                m142578e = AbstractC28298d.m142578e();
                int i12 = this.f113161t;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            AbstractC24862s.m129228b(obj);
                            this.f113163v.f113088d.remove(this.f113164w);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    Object obj2 = this.f113162u;
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONArray optJSONArray = ((JSONObject) obj2).optJSONArray("data");
                    if (optJSONArray != null) {
                        C2787l m120708r1 = AbstractC23306f.m120708r1();
                        C2787l.a aVar = new C2787l.a(optJSONArray);
                        this.f113161t = 1;
                        obj = m120708r1.m101498a(aVar, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    c23297c = this.f113163v;
                    str = this.f113164w;
                    this.f113161t = 2;
                    if (C23297c.m120448n(c23297c, str, false, this, 2, null) == m142578e) {
                        return m142578e;
                    }
                    this.f113163v.f113088d.remove(this.f113164w);
                    return C24848g0.f119245a;
                }
                C2787l.b bVar = (C2787l.b) obj;
                if (bVar != null) {
                    map = bVar.m13427a();
                } else {
                    map = null;
                }
                if (map != null) {
                    String str2 = this.f113164w;
                    JSONObject jSONObject = this.f113165x;
                    Integer num = (Integer) map.get(AbstractC25495a.m132089n(str2));
                    if (num != null) {
                        i11 = num.intValue();
                    } else {
                        i11 = 0;
                    }
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    jSONObject.put("numChanged", i11);
                    C0815e1.m2075D().m2100V(new C23648e(59, "", 1, "pull_status_message_response", "2", jSONObject.toString()), false);
                }
                c23297c = this.f113163v;
                str = this.f113164w;
                this.f113161t = 2;
                if (C23297c.m120448n(c23297c, str, false, this, 2, null) == m142578e) {
                }
                this.f113163v.f113088d.remove(this.f113164w);
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        q(String str, JSONObject jSONObject) {
            this.f113159b = str;
            this.f113160c = jSONObject;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            int i11;
            Map map = C23297c.this.f113089e;
            AbstractC19074t.m100207e(map, "access$getMapRetryCounterPullConversation$p(...)");
            String str = this.f113159b;
            Integer num = (Integer) C23297c.this.f113089e.get(this.f113159b);
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 0;
            }
            map.put(str, Integer.valueOf(i11 + 1));
            C23297c.this.f113088d.remove(this.f113159b);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new a(obj, C23297c.this, this.f113159b, this.f113160c, null), 3, null);
        }
    }

    /* renamed from: mh.c$r */
    /* loaded from: classes3.dex */
    public static final class r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113166t;

        /* renamed from: v */
        final /* synthetic */ String f113168v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, Continuation continuation) {
            super(2, continuation);
            this.f113168v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new r(this.f113168v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113166t == 0) {
                AbstractC24862s.m129228b(obj);
                C23297c.this.f113085a.m42254R7(this.f113168v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C23297c(C7960e c7960e, C0943w c0943w) {
        AbstractC19074t.m100208f(c7960e, "dbHelper");
        AbstractC19074t.m100208f(c0943w, "groupDAO");
        this.f113085a = c7960e;
        this.f113086b = c0943w;
        this.f113087c = Collections.synchronizedMap(new HashMap());
        this.f113088d = Collections.synchronizedSet(new HashSet());
        this.f113089e = Collections.synchronizedMap(new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120446k(String str, JSONObject jSONObject, Continuation continuation) {
        l lVar;
        Object m142578e;
        int i11;
        C0757b c0757b;
        C19059j0 c19059j0;
        List m131496e;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i12 = lVar.f113138x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lVar.f113138x = i12 - Integer.MIN_VALUE;
                Object obj = lVar.f113136v;
                m142578e = AbstractC28298d.m142578e();
                i11 = lVar.f113138x;
                if (i11 == 0) {
                    if (i11 == 1) {
                        C19059j0 c19059j02 = (C19059j0) lVar.f113135u;
                        C0757b c0757b2 = (C0757b) lVar.f113134t;
                        String str2 = (String) lVar.f113133s;
                        AbstractC24862s.m129228b(obj);
                        c0757b = c0757b2;
                        c19059j0 = c19059j02;
                        str = str2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    c0757b = new C0757b();
                    c0757b.m1341j(new n(str, jSONObject));
                    c19059j0 = new C19059j0();
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    m mVar = new m(c19059j0, null);
                    lVar.f113133s = str;
                    lVar.f113134t = c0757b;
                    lVar.f113135u = c19059j0;
                    lVar.f113138x = 1;
                    if (BuildersKt.m112534g(m112680b, mVar, lVar) == m142578e) {
                        return m142578e;
                    }
                }
                m131496e = AbstractC25366r.m131496e(AbstractC29094b.m145341c(AbstractC25495a.m132090o(str)));
                String jSONObject2 = ((JSONObject) c19059j0.f94941p).toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                c0757b.m1349p(m131496e, jSONObject2);
                return C24848g0.f119245a;
            }
        }
        lVar = new l(continuation);
        Object obj2 = lVar.f113136v;
        m142578e = AbstractC28298d.m142578e();
        i11 = lVar.f113138x;
        if (i11 == 0) {
        }
        m131496e = AbstractC25366r.m131496e(AbstractC29094b.m145341c(AbstractC25495a.m132090o(str)));
        String jSONObject22 = ((JSONObject) c19059j0.f94941p).toString();
        AbstractC19074t.m100207e(jSONObject22, "toString(...)");
        c0757b.m1349p(m131496e, jSONObject22);
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120447l(String str, List list, JSONObject jSONObject, Continuation continuation) {
        o oVar;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        List list2;
        C0759d c0759d;
        List m131496e;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i12 = oVar.f113155y;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                oVar.f113155y = i12 - Integer.MIN_VALUE;
                Object obj = oVar.f113153w;
                m142578e = AbstractC28298d.m142578e();
                i11 = oVar.f113155y;
                if (i11 == 0) {
                    if (i11 == 1) {
                        C19059j0 c19059j02 = (C19059j0) oVar.f113152v;
                        c0759d = (C0759d) oVar.f113151u;
                        List list3 = (List) oVar.f113150t;
                        String str2 = (String) oVar.f113149s;
                        AbstractC24862s.m129228b(obj);
                        list2 = list3;
                        c19059j0 = c19059j02;
                        str = str2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C0759d c0759d2 = new C0759d();
                    c0759d2.m1341j(new q(str, jSONObject));
                    c19059j0 = new C19059j0();
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    p pVar = new p(c19059j0, null);
                    oVar.f113149s = str;
                    oVar.f113150t = list;
                    oVar.f113151u = c0759d2;
                    oVar.f113152v = c19059j0;
                    oVar.f113155y = 1;
                    if (BuildersKt.m112534g(m112680b, pVar, oVar) == m142578e) {
                        return m142578e;
                    }
                    list2 = list;
                    c0759d = c0759d2;
                }
                m131496e = AbstractC25366r.m131496e(new C0763h(AbstractC25495a.m132090o(str), list2));
                String jSONObject2 = ((JSONObject) c19059j0.f94941p).toString();
                AbstractC19074t.m100207e(jSONObject2, "toString(...)");
                c0759d.m1356k(m131496e, jSONObject2);
                return C24848g0.f119245a;
            }
        }
        oVar = new o(continuation);
        Object obj2 = oVar.f113153w;
        m142578e = AbstractC28298d.m142578e();
        i11 = oVar.f113155y;
        if (i11 == 0) {
        }
        m131496e = AbstractC25366r.m131496e(new C0763h(AbstractC25495a.m132090o(str), list2));
        String jSONObject22 = ((JSONObject) c19059j0.f94941p).toString();
        AbstractC19074t.m100207e(jSONObject22, "toString(...)");
        c0759d.m1356k(m131496e, jSONObject22);
        return C24848g0.f119245a;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m120448n(C23297c c23297c, String str, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c23297c.m120453m(str, z11, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120449g(String str, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C23297c c23297c;
        String str2;
        C19051f0 c19051f0;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f113095x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f113095x = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f113093v;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f113095x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    c19051f0 = (C19051f0) bVar.f113092u;
                    str2 = (String) bVar.f113091t;
                    c23297c = (C23297c) bVar.f113090s;
                    AbstractC24862s.m129228b(obj);
                    Map map = c23297c.f113087c;
                    AbstractC19074t.m100207e(map, "mapHasPulledStatusConversation");
                    map.put(str2, AbstractC29094b.m145339a(c19051f0.f94928p));
                    if (!c19051f0.f94928p) {
                        bVar.f113090s = null;
                        bVar.f113091t = null;
                        bVar.f113092u = null;
                        bVar.f113095x = 2;
                        if (c23297c.m120452j(str2, bVar) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    return C24848g0.f119245a;
                }
                AbstractC24862s.m129228b(obj);
                if (!AbstractC23295a.m120436c()) {
                    return C24848g0.f119245a;
                }
                if (!this.f113087c.containsKey(str)) {
                    C19051f0 c19051f02 = new C19051f0();
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    c cVar = new c(c19051f02, str, null);
                    bVar.f113090s = this;
                    bVar.f113091t = str;
                    bVar.f113092u = c19051f02;
                    bVar.f113095x = 1;
                    if (BuildersKt.m112534g(m112680b, cVar, bVar) == m142578e) {
                        return m142578e;
                    }
                    c23297c = this;
                    str2 = str;
                    c19051f0 = c19051f02;
                    Map map2 = c23297c.f113087c;
                    AbstractC19074t.m100207e(map2, "mapHasPulledStatusConversation");
                    map2.put(str2, AbstractC29094b.m145339a(c19051f0.f94928p));
                    if (!c19051f0.f94928p) {
                    }
                    return C24848g0.f119245a;
                }
                if (AbstractC19074t.m100204b(this.f113087c.get(str), AbstractC29094b.m145339a(false))) {
                    bVar.f113095x = 3;
                    if (m120452j(str, bVar) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f113093v;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f113095x;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120450h(Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        C23297c c23297c;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f113102v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f113102v = i12 - Integer.MIN_VALUE;
                Object obj = dVar.f113100t;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f113102v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c23297c = (C23297c) dVar.f113099s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    e eVar = new e(null);
                    dVar.f113099s = this;
                    dVar.f113102v = 1;
                    if (BuildersKt.m112534g(m112680b, eVar, dVar) == m142578e) {
                        return m142578e;
                    }
                    c23297c = this;
                }
                c23297c.f113087c.clear();
                c23297c.f113088d.clear();
                c23297c.f113089e.clear();
                return C24848g0.f119245a;
            }
        }
        dVar = new d(continuation);
        Object obj2 = dVar.f113100t;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f113102v;
        if (i11 == 0) {
        }
        c23297c.f113087c.clear();
        c23297c.f113088d.clear();
        c23297c.f113089e.clear();
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120451i(boolean z11, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        C23297c c23297c;
        Map map;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i12 = fVar.f113109w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                fVar.f113109w = i12 - Integer.MIN_VALUE;
                Object obj = fVar.f113107u;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f113109w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        z11 = fVar.f113106t;
                        c23297c = (C23297c) fVar.f113105s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    g gVar = new g(z11, null);
                    fVar.f113105s = this;
                    fVar.f113106t = z11;
                    fVar.f113109w = 1;
                    if (BuildersKt.m112534g(m112680b, gVar, fVar) == m142578e) {
                        return m142578e;
                    }
                    c23297c = this;
                }
                map = c23297c.f113087c;
                AbstractC19074t.m100207e(map, "mapHasPulledStatusConversation");
                synchronized (map) {
                    try {
                        ArrayList arrayList = new ArrayList();
                        for (String str : c23297c.f113087c.keySet()) {
                            if (AbstractC25495a.m132079d(str) == z11) {
                                arrayList.add(str);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c23297c.f113087c.remove((String) it.next());
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Set set = c23297c.f113088d;
                AbstractC19074t.m100207e(set, "setBlockingPullConversation");
                synchronized (set) {
                    try {
                        ArrayList arrayList2 = new ArrayList();
                        Set<String> set2 = c23297c.f113088d;
                        AbstractC19074t.m100207e(set2, "setBlockingPullConversation");
                        for (String str2 : set2) {
                            if (AbstractC25495a.m132079d(str2) == z11) {
                                arrayList2.add(str2);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            c23297c.f113088d.remove((String) it2.next());
                        }
                        C24848g0 c24848g02 = C24848g0.f119245a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                Map map2 = c23297c.f113089e;
                AbstractC19074t.m100207e(map2, "mapRetryCounterPullConversation");
                synchronized (map2) {
                    try {
                        ArrayList arrayList3 = new ArrayList();
                        for (String str3 : c23297c.f113089e.keySet()) {
                            if (AbstractC25495a.m132079d(str3) == z11) {
                                arrayList3.add(str3);
                            }
                        }
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            c23297c.f113089e.remove((String) it3.next());
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f113107u;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f113109w;
        if (i11 == 0) {
        }
        map = c23297c.f113087c;
        AbstractC19074t.m100207e(map, "mapHasPulledStatusConversation");
        synchronized (map) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0033. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /* JADX WARN: Type inference failed for: r4v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120452j(String str, Continuation continuation) {
        h hVar;
        h hVar2;
        Object m142578e;
        String str2;
        String str3;
        boolean z11;
        C19059j0 c19059j0;
        C23297c c23297c;
        C19051f0 c19051f0;
        String str4;
        HashSet hashSet;
        String str5;
        C19059j0 c19059j02;
        String str6;
        String str7;
        C19059j0 c19059j03;
        C19059j0 c19059j04;
        int i11;
        C23297c c23297c2;
        String str8;
        String str9;
        HashSet hashSet2;
        C19059j0 c19059j05;
        String str10;
        String str11;
        String str12;
        C23297c c23297c3;
        int i12;
        List m131185M0;
        MessageId messageId;
        String str13;
        ArrayList m13392a;
        ArrayList m13396a;
        C32076q5 c32076q5;
        String str14;
        int i13;
        MessageId messageId2;
        C23297c c23297c4;
        String str15;
        LastDeliveredSeenData m102794x;
        ?? r42;
        MessageId messageId3;
        String str16 = str;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i14 = hVar.f113113A;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f113113A = i14 - Integer.MIN_VALUE;
                hVar2 = hVar;
                Object obj = hVar2.f113120y;
                m142578e = AbstractC28298d.m142578e();
                String str17 = "tsPull";
                String str18 = "tid";
                switch (hVar2.f113113A) {
                    case 0:
                        AbstractC24862s.m129228b(obj);
                        if (this.f113088d.contains(str16)) {
                            return C24848g0.f119245a;
                        }
                        Integer num = (Integer) this.f113089e.get(str16);
                        if (num != null && num.intValue() > 3) {
                            return C24848g0.f119245a;
                        }
                        this.f113088d.add(str16);
                        if (!AbstractC25495a.m132079d(str)) {
                            str2 = "totalMem";
                            str3 = "cliMsgId";
                            z11 = false;
                            C19051f0 c19051f02 = new C19051f0();
                            c19051f02.f94928p = true;
                            c19059j0 = new C19059j0();
                            CoroutineDispatcher m112680b = Dispatchers.m112680b();
                            k kVar = new k(c19059j0, str16, null);
                            hVar2.f113114s = this;
                            hVar2.f113115t = str16;
                            hVar2.f113116u = c19051f02;
                            hVar2.f113117v = c19059j0;
                            hVar2.f113113A = 5;
                            if (BuildersKt.m112534g(m112680b, kVar, hVar2) == m142578e) {
                                return m142578e;
                            }
                            c23297c = this;
                            c19051f0 = c19051f02;
                            str4 = str16;
                            if (((MessageId) c19059j0.f94941p) != null && (m102794x = AbstractC23306f.m120606O1().m102794x(str4)) != null) {
                                if (!AbstractC23295a.m120437d()) {
                                    if (m102794x.m41029b() >= ((MessageId) c19059j0.f94941p).m41045i()) {
                                        c19051f0.f94928p = z11;
                                    }
                                } else if (m102794x.m41028a() >= ((MessageId) c19059j0.f94941p).m41045i()) {
                                    c19051f0.f94928p = z11;
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            }
                            if (!c19051f0.f94928p) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("tid", AbstractC25495a.m132089n(str4));
                                jSONObject.put(str2, 1);
                                jSONObject.put("numUidsPull", 1);
                                MessageId messageId4 = (MessageId) c19059j0.f94941p;
                                if (messageId4 != null) {
                                    jSONObject.put(str3, messageId4.m41045i());
                                }
                                jSONObject.put("tsPull", C23793c.Companion.m124321a().mo124310e());
                                hVar2.f113114s = null;
                                hVar2.f113115t = null;
                                hVar2.f113116u = null;
                                hVar2.f113117v = null;
                                hVar2.f113113A = 6;
                                if (c23297c.m120446k(str4, jSONObject, hVar2) == m142578e) {
                                    return m142578e;
                                }
                                return C24848g0.f119245a;
                            }
                            hVar2.f113114s = c23297c;
                            hVar2.f113115t = str4;
                            hVar2.f113116u = c19059j0;
                            hVar2.f113117v = null;
                            hVar2.f113113A = 7;
                            if (m120448n(c23297c, str4, false, hVar2, 2, null) == m142578e) {
                                return m142578e;
                            }
                            c23297c4 = c23297c;
                            str15 = str4;
                            r42 = z11;
                            c23297c4.f113088d.remove(str15);
                            String[] strArr = new String[2];
                            strArr[r42] = "1";
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("tid", AbstractC25495a.m132089n(str15));
                            jSONObject2.put(str2, 1);
                            messageId3 = (MessageId) c19059j0.f94941p;
                            if (messageId3 != null) {
                                jSONObject2.put(str3, messageId3.m41045i());
                            }
                            jSONObject2.put("tsPull", C23793c.Companion.m124321a().mo124310e());
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            strArr[1] = jSONObject2.toString();
                            C0815e1.m2075D().m2100V(new C23648e(59, "", 1, "pull_status_message_enough_local", strArr), r42);
                            return C24848g0.f119245a;
                        }
                        hashSet = new HashSet();
                        C19059j0 c19059j06 = new C19059j0();
                        C19059j0 c19059j07 = new C19059j0();
                        C19059j0 c19059j08 = new C19059j0();
                        CoroutineDispatcher m112680b2 = Dispatchers.m112680b();
                        str5 = "tsPull";
                        c19059j02 = c19059j06;
                        str6 = "cliMsgId";
                        str7 = "tid";
                        i iVar = new i(c19059j06, this, str, c19059j07, null);
                        hVar2.f113114s = this;
                        hVar2.f113115t = str16;
                        hVar2.f113116u = hashSet;
                        hVar2.f113117v = c19059j02;
                        c19059j03 = c19059j07;
                        hVar2.f113118w = c19059j03;
                        c19059j04 = c19059j08;
                        hVar2.f113119x = c19059j04;
                        i11 = 1;
                        hVar2.f113113A = 1;
                        if (BuildersKt.m112534g(m112680b2, iVar, hVar2) == m142578e) {
                            return m142578e;
                        }
                        c23297c2 = this;
                        if (((C32076q5) c19059j02.f94941p) == null) {
                            C31973j5 c31973j5 = (C31973j5) c19059j03.f94941p;
                            if (c31973j5 != null && c31973j5.m153745W() == i11) {
                                return C24848g0.f119245a;
                            }
                            for (String str19 : ((C32076q5) c19059j02.f94941p).m154718g()) {
                                if (!AbstractC19074t.m100204b(str19, CoreUtility.f89233i)) {
                                    hashSet.add(AbstractC29094b.m145341c(Integer.parseInt(str19)));
                                }
                            }
                            CoroutineDispatcher m112680b3 = Dispatchers.m112680b();
                            j jVar = new j(c19059j04, str16, null);
                            hVar2.f113114s = c23297c2;
                            hVar2.f113115t = str16;
                            hVar2.f113116u = hashSet;
                            hVar2.f113117v = c19059j02;
                            hVar2.f113118w = c19059j04;
                            hVar2.f113119x = null;
                            hVar2.f113113A = 2;
                            if (BuildersKt.m112534g(m112680b3, jVar, hVar2) == m142578e) {
                                return m142578e;
                            }
                            str9 = str16;
                            hashSet2 = hashSet;
                            messageId = (MessageId) c19059j04.f94941p;
                            if (messageId != null) {
                                if (AbstractC23295a.m120437d()) {
                                    C2780e.b bVar = (C2780e.b) AbstractC23306f.m120649c0().m101509a(new C2780e.a(AbstractC25495a.m132088m(str9), messageId));
                                    if (bVar != null && (m13396a = bVar.m13396a()) != null) {
                                        if (m13396a.size() < ((C32076q5) c19059j02.f94941p).m154717f() - i11) {
                                            Iterator it = m13396a.iterator();
                                            while (it.hasNext()) {
                                                hashSet2.remove(AbstractC29094b.m145341c((int) ((Number) it.next()).longValue()));
                                                str9 = str9;
                                            }
                                        }
                                        str13 = str9;
                                        C24848g0 c24848g03 = C24848g0.f119245a;
                                    }
                                } else {
                                    str13 = str9;
                                    C2779d.b bVar2 = (C2779d.b) AbstractC23306f.m120645b0().m101509a(new C2779d.a(AbstractC25495a.m132088m(str13), messageId));
                                    if (bVar2 != null && (m13392a = bVar2.m13392a()) != null) {
                                        if (m13392a.size() < ((C32076q5) c19059j02.f94941p).m154717f() - 1) {
                                            Iterator it2 = m13392a.iterator();
                                            while (it2.hasNext()) {
                                                hashSet2.remove(AbstractC29094b.m145341c((int) ((Number) it2.next()).longValue()));
                                            }
                                        }
                                        C24848g0 c24848g04 = C24848g0.f119245a;
                                    }
                                }
                                str8 = str13;
                                hashSet = hashSet2;
                                c19059j05 = c19059j02;
                                if (hashSet.size() <= 0) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put(str7, AbstractC25495a.m132089n(str8));
                                    C32076q5 c32076q52 = (C32076q5) c19059j05.f94941p;
                                    if (c32076q52 != null) {
                                        i12 = c32076q52.m154717f();
                                    } else {
                                        i12 = 0;
                                    }
                                    jSONObject3.put("totalMem", i12);
                                    jSONObject3.put("numUidsPull", hashSet.size());
                                    MessageId messageId5 = (MessageId) c19059j04.f94941p;
                                    if (messageId5 != null) {
                                        jSONObject3.put(str6, messageId5.m41045i());
                                    }
                                    jSONObject3.put(str5, C23793c.Companion.m124321a().mo124310e());
                                    m131185M0 = AbstractC25332a0.m131185M0(hashSet);
                                    hVar2.f113114s = null;
                                    hVar2.f113115t = null;
                                    hVar2.f113116u = null;
                                    hVar2.f113117v = null;
                                    hVar2.f113118w = null;
                                    hVar2.f113119x = null;
                                    hVar2.f113113A = 3;
                                    if (c23297c2.m120447l(str8, m131185M0, jSONObject3, hVar2) == m142578e) {
                                        return m142578e;
                                    }
                                    return C24848g0.f119245a;
                                }
                                str17 = str5;
                                hVar2.f113114s = c23297c2;
                                hVar2.f113115t = str8;
                                hVar2.f113116u = c19059j05;
                                hVar2.f113117v = c19059j04;
                                hVar2.f113118w = null;
                                hVar2.f113119x = null;
                                hVar2.f113113A = 4;
                                str10 = "totalMem";
                                str11 = str6;
                                str18 = str7;
                                if (m120448n(c23297c2, str8, false, hVar2, 2, null) == m142578e) {
                                    return m142578e;
                                }
                                str12 = str8;
                                c23297c3 = c23297c2;
                                c23297c3.f113088d.remove(str12);
                                String[] strArr2 = new String[2];
                                strArr2[0] = "2";
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put(str18, AbstractC25495a.m132089n(str12));
                                c32076q5 = (C32076q5) c19059j05.f94941p;
                                if (c32076q5 == null) {
                                    i13 = c32076q5.m154717f();
                                    str14 = str10;
                                } else {
                                    str14 = str10;
                                    i13 = 0;
                                }
                                jSONObject4.put(str14, i13);
                                messageId2 = (MessageId) c19059j04.f94941p;
                                if (messageId2 != null) {
                                    jSONObject4.put(str11, messageId2.m41045i());
                                }
                                jSONObject4.put(str17, C23793c.Companion.m124321a().mo124310e());
                                C24848g0 c24848g05 = C24848g0.f119245a;
                                strArr2[1] = jSONObject4.toString();
                                C0815e1.m2075D().m2100V(new C23648e(59, "", 1, "pull_status_message_enough_local", strArr2), false);
                                return C24848g0.f119245a;
                            }
                            str13 = str9;
                            str8 = str13;
                            hashSet = hashSet2;
                            c19059j05 = c19059j02;
                            if (hashSet.size() <= 0) {
                            }
                        } else {
                            str8 = str16;
                            c19059j05 = c19059j02;
                            if (hashSet.size() <= 0) {
                            }
                        }
                        break;
                    case 1:
                        c19059j04 = (C19059j0) hVar2.f113119x;
                        C19059j0 c19059j09 = (C19059j0) hVar2.f113118w;
                        C19059j0 c19059j010 = (C19059j0) hVar2.f113117v;
                        HashSet hashSet3 = (HashSet) hVar2.f113116u;
                        str16 = (String) hVar2.f113115t;
                        C23297c c23297c5 = (C23297c) hVar2.f113114s;
                        AbstractC24862s.m129228b(obj);
                        c19059j03 = c19059j09;
                        str6 = "cliMsgId";
                        str5 = "tsPull";
                        i11 = 1;
                        c19059j02 = c19059j010;
                        str7 = "tid";
                        hashSet = hashSet3;
                        c23297c2 = c23297c5;
                        if (((C32076q5) c19059j02.f94941p) == null) {
                        }
                        break;
                    case 2:
                        c19059j04 = (C19059j0) hVar2.f113118w;
                        C19059j0 c19059j011 = (C19059j0) hVar2.f113117v;
                        hashSet2 = (HashSet) hVar2.f113116u;
                        str9 = (String) hVar2.f113115t;
                        c23297c2 = (C23297c) hVar2.f113114s;
                        AbstractC24862s.m129228b(obj);
                        str6 = "cliMsgId";
                        str5 = "tsPull";
                        c19059j02 = c19059j011;
                        str7 = "tid";
                        i11 = 1;
                        messageId = (MessageId) c19059j04.f94941p;
                        if (messageId != null) {
                        }
                        str13 = str9;
                        str8 = str13;
                        hashSet = hashSet2;
                        c19059j05 = c19059j02;
                        if (hashSet.size() <= 0) {
                        }
                        break;
                    case 3:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 4:
                        c19059j04 = (C19059j0) hVar2.f113117v;
                        c19059j05 = (C19059j0) hVar2.f113116u;
                        str12 = (String) hVar2.f113115t;
                        c23297c3 = (C23297c) hVar2.f113114s;
                        AbstractC24862s.m129228b(obj);
                        str10 = "totalMem";
                        str11 = "cliMsgId";
                        c23297c3.f113088d.remove(str12);
                        String[] strArr22 = new String[2];
                        strArr22[0] = "2";
                        JSONObject jSONObject42 = new JSONObject();
                        jSONObject42.put(str18, AbstractC25495a.m132089n(str12));
                        c32076q5 = (C32076q5) c19059j05.f94941p;
                        if (c32076q5 == null) {
                        }
                        jSONObject42.put(str14, i13);
                        messageId2 = (MessageId) c19059j04.f94941p;
                        if (messageId2 != null) {
                        }
                        jSONObject42.put(str17, C23793c.Companion.m124321a().mo124310e());
                        C24848g0 c24848g052 = C24848g0.f119245a;
                        strArr22[1] = jSONObject42.toString();
                        C0815e1.m2075D().m2100V(new C23648e(59, "", 1, "pull_status_message_enough_local", strArr22), false);
                        return C24848g0.f119245a;
                    case 5:
                        c19059j0 = (C19059j0) hVar2.f113117v;
                        c19051f0 = (C19051f0) hVar2.f113116u;
                        String str20 = (String) hVar2.f113115t;
                        c23297c = (C23297c) hVar2.f113114s;
                        AbstractC24862s.m129228b(obj);
                        str4 = str20;
                        str2 = "totalMem";
                        str3 = "cliMsgId";
                        z11 = false;
                        if (((MessageId) c19059j0.f94941p) != null) {
                            if (!AbstractC23295a.m120437d()) {
                            }
                            C24848g0 c24848g06 = C24848g0.f119245a;
                            break;
                        }
                        if (!c19051f0.f94928p) {
                        }
                        break;
                    case 6:
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    case 7:
                        c19059j0 = (C19059j0) hVar2.f113116u;
                        str15 = (String) hVar2.f113115t;
                        c23297c4 = (C23297c) hVar2.f113114s;
                        AbstractC24862s.m129228b(obj);
                        str2 = "totalMem";
                        str3 = "cliMsgId";
                        r42 = 0;
                        c23297c4.f113088d.remove(str15);
                        String[] strArr3 = new String[2];
                        strArr3[r42] = "1";
                        JSONObject jSONObject22 = new JSONObject();
                        jSONObject22.put("tid", AbstractC25495a.m132089n(str15));
                        jSONObject22.put(str2, 1);
                        messageId3 = (MessageId) c19059j0.f94941p;
                        if (messageId3 != null) {
                        }
                        jSONObject22.put("tsPull", C23793c.Companion.m124321a().mo124310e());
                        C24848g0 c24848g022 = C24848g0.f119245a;
                        strArr3[1] = jSONObject22.toString();
                        C0815e1.m2075D().m2100V(new C23648e(59, "", 1, "pull_status_message_enough_local", strArr3), r42);
                        return C24848g0.f119245a;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        hVar = new h(continuation);
        hVar2 = hVar;
        Object obj2 = hVar2.f113120y;
        m142578e = AbstractC28298d.m142578e();
        String str172 = "tsPull";
        String str182 = "tid";
        switch (hVar2.f113113A) {
        }
    }

    /* renamed from: m */
    public final Object m120453m(String str, boolean z11, Continuation continuation) {
        Object m142578e;
        Map map = this.f113087c;
        AbstractC19074t.m100207e(map, "mapHasPulledStatusConversation");
        map.put(str, AbstractC29094b.m145339a(z11));
        if (z11) {
            Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new r(str, null), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m112534g == m142578e) {
                return m112534g;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }
}
