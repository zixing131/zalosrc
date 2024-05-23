package mh;

import am.AbstractC0924m0;
import am.C0943w;
import be0.C2778c;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import ln0.AbstractC22543l;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p348mi.C23305e;
import p461qu.AbstractC25495a;
import p716zh.C31832a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: mh.d */
/* loaded from: classes3.dex */
public final class C23298d {
    public static final b Companion = new b(null);

    /* renamed from: d */
    private static final InterfaceC24854k f113169d;

    /* renamed from: a */
    private final C23296b f113170a;

    /* renamed from: b */
    private final C23297c f113171b;

    /* renamed from: c */
    private final Map f113172c;

    /* renamed from: mh.d$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f113173q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23298d mo12V4() {
            return c.f113174a.m120485a();
        }
    }

    /* renamed from: mh.d$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23298d m120484a() {
            return (C23298d) C23298d.f113169d.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mh.d$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f113174a = new c();

        /* renamed from: b */
        private static final C23298d f113175b;

        static {
            C7960e m120592K = AbstractC23306f.m120592K();
            AbstractC19074t.m100207e(m120592K, "provideDatabaseHelper(...)");
            C23296b c23296b = new C23296b(m120592K);
            C7960e m41971c6 = C7960e.m41971c6();
            AbstractC19074t.m100207e(m41971c6, "getInstance(...)");
            f113175b = new C23298d(c23296b, new C23297c(m41971c6, C0943w.m4462l()));
        }

        private c() {
        }

        /* renamed from: a */
        public final C23298d m120485a() {
            return f113175b;
        }
    }

    /* renamed from: mh.d$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113176t;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113176t == 0) {
                AbstractC24862s.m129228b(obj);
                C23298d.this.f113172c.clear();
                C23298d.this.m120475h(2);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh.d$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113178t;

        /* renamed from: v */
        final /* synthetic */ int f113180v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: mh.d$e$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f113181t;

            /* renamed from: u */
            final /* synthetic */ int f113182u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, Continuation continuation) {
                super(2, continuation);
                this.f113182u = i11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f113182u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f113181t == 0) {
                    AbstractC24862s.m129228b(obj);
                    AbstractC0924m0.m3577Xi(this.f113182u);
                    AbstractC0924m0.m3548Wi(this.f113182u);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, Continuation continuation) {
            super(2, continuation);
            this.f113180v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f113180v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f113178t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineDispatcher m112680b = Dispatchers.m112680b();
                a aVar = new a(this.f113180v, null);
                this.f113178t = 1;
                if (BuildersKt.m112534g(m112680b, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            C23297c c23297c = C23298d.this.f113171b;
            this.f113178t = 2;
            if (c23297c.m120450h(this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.d$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113183t;

        /* renamed from: v */
        final /* synthetic */ boolean f113185v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: mh.d$f$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f113186t;

            /* renamed from: u */
            final /* synthetic */ boolean f113187u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(boolean z11, Continuation continuation) {
                super(2, continuation);
                this.f113187u = z11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f113187u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f113186t == 0) {
                    AbstractC24862s.m129228b(obj);
                    if (this.f113187u) {
                        AbstractC0924m0.m3548Wi(1);
                    } else {
                        AbstractC0924m0.m3577Xi(1);
                    }
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f113185v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f113185v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f113183t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineDispatcher m112680b = Dispatchers.m112680b();
                a aVar = new a(this.f113185v, null);
                this.f113183t = 1;
                if (BuildersKt.m112534g(m112680b, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            C23297c c23297c = C23298d.this.f113171b;
            boolean z11 = this.f113185v;
            this.f113183t = 2;
            if (c23297c.m120451i(z11, this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh.d$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113188t;

        /* renamed from: v */
        final /* synthetic */ String f113190v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Continuation continuation) {
            super(2, continuation);
            this.f113190v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f113190v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113188t == 0) {
                AbstractC24862s.m129228b(obj);
                Map map = C23298d.this.f113172c;
                AbstractC19074t.m100207e(map, "access$getMapDeliveredSeenByGroup$p(...)");
                C23298d c23298d = C23298d.this;
                String str = this.f113190v;
                synchronized (map) {
                    Map map2 = c23298d.f113172c;
                    AbstractC19074t.m100207e(map2, "access$getMapDeliveredSeenByGroup$p(...)");
                    map2.put(str, c23298d.f113170a.m120438a(str));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: mh.d$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113191t;

        /* renamed from: u */
        final /* synthetic */ ArrayList f113192u;

        /* renamed from: v */
        final /* synthetic */ C23298d f113193v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ArrayList arrayList, C23298d c23298d, Continuation continuation) {
            super(2, continuation);
            this.f113192u = arrayList;
            this.f113193v = c23298d;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f113192u, this.f113193v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113191t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!this.f113192u.isEmpty()) {
                    this.f113193v.f113170a.m120439b(this.f113192u);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh.d$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC29096d {

        /* renamed from: A */
        /* synthetic */ Object f113194A;

        /* renamed from: C */
        int f113196C;

        /* renamed from: s */
        Object f113197s;

        /* renamed from: t */
        Object f113198t;

        /* renamed from: u */
        Object f113199u;

        /* renamed from: v */
        Object f113200v;

        /* renamed from: w */
        Object f113201w;

        /* renamed from: x */
        int f113202x;

        /* renamed from: y */
        int f113203y;

        /* renamed from: z */
        boolean f113204z;

        i(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113194A = obj;
            this.f113196C |= Integer.MIN_VALUE;
            return C23298d.this.m120480p(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh.d$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113205t;

        /* renamed from: v */
        final /* synthetic */ ArrayList f113207v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f113207v = arrayList;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f113207v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113205t == 0) {
                AbstractC24862s.m129228b(obj);
                C23298d.this.f113170a.m120439b(this.f113207v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh.d$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC29096d {

        /* renamed from: B */
        int f113209B;

        /* renamed from: s */
        Object f113210s;

        /* renamed from: t */
        Object f113211t;

        /* renamed from: u */
        Object f113212u;

        /* renamed from: v */
        Object f113213v;

        /* renamed from: w */
        Object f113214w;

        /* renamed from: x */
        int f113215x;

        /* renamed from: y */
        int f113216y;

        /* renamed from: z */
        /* synthetic */ Object f113217z;

        k(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113217z = obj;
            this.f113209B |= Integer.MIN_VALUE;
            return C23298d.this.m120481q(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh.d$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f113218t;

        /* renamed from: v */
        final /* synthetic */ ArrayList f113220v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f113220v = arrayList;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f113220v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f113218t == 0) {
                AbstractC24862s.m129228b(obj);
                C23298d.this.f113170a.m120439b(this.f113220v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: mh.d$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC29096d {

        /* renamed from: A */
        int f113221A;

        /* renamed from: B */
        /* synthetic */ Object f113222B;

        /* renamed from: D */
        int f113224D;

        /* renamed from: s */
        Object f113225s;

        /* renamed from: t */
        Object f113226t;

        /* renamed from: u */
        Object f113227u;

        /* renamed from: v */
        Object f113228v;

        /* renamed from: w */
        Object f113229w;

        /* renamed from: x */
        Object f113230x;

        /* renamed from: y */
        Object f113231y;

        /* renamed from: z */
        int f113232z;

        m(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f113222B = obj;
            this.f113224D |= Integer.MIN_VALUE;
            return C23298d.this.m120482r(null, this);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f113173q);
        f113169d = m129210a;
    }

    public C23298d(C23296b c23296b, C23297c c23297c) {
        AbstractC19074t.m100208f(c23296b, "localSource");
        AbstractC19074t.m100208f(c23297c, "remoteSource");
        this.f113170a = c23296b;
        this.f113171b = c23297c;
        this.f113172c = Collections.synchronizedMap(new HashMap());
    }

    /* renamed from: j */
    public static final C23298d m120469j() {
        return Companion.m120484a();
    }

    /* renamed from: m */
    private final boolean m120470m(String str) {
        return this.f113172c.containsKey(str);
    }

    /* renamed from: n */
    private final Object m120471n(String str, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new g(str, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: e */
    public final Object m120472e(String str, Continuation continuation) {
        Object m142578e;
        if (!m120470m(str)) {
            Object m120471n = m120471n(str, continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m120471n == m142578e) {
                return m120471n;
            }
            return C24848g0.f119245a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: f */
    public final Object m120473f(String str, Continuation continuation) {
        Object m142578e;
        Object m120449g = this.f113171b.m120449g(str, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m120449g == m142578e) {
            return m120449g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: g */
    public final void m120474g() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new d(null), 3, null);
    }

    /* renamed from: h */
    public final void m120475h(int i11) {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new e(i11, null), 3, null);
    }

    /* renamed from: i */
    public final void m120476i(boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new f(z11, null), 3, null);
    }

    /* renamed from: k */
    public final ArrayList m120477k(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(messageId, "messageId");
        ArrayList arrayList = new ArrayList();
        Map map = this.f113172c;
        AbstractC19074t.m100207e(map, "mapDeliveredSeenByGroup");
        synchronized (map) {
            try {
                HashMap hashMap = (HashMap) this.f113172c.get(str);
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        MessageId m120557b = ((C23305e) entry.getValue()).m120557b();
                        if (m120557b != null && m120557b.m41056w(messageId)) {
                            arrayList.add(Long.valueOf(Long.parseLong((String) entry.getKey())));
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final ArrayList m120478l(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(messageId, "messageId");
        ArrayList arrayList = new ArrayList();
        Map map = this.f113172c;
        AbstractC19074t.m100207e(map, "mapDeliveredSeenByGroup");
        synchronized (map) {
            try {
                HashMap hashMap = (HashMap) this.f113172c.get(str);
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        MessageId m120558c = ((C23305e) entry.getValue()).m120558c();
                        if (m120558c != null && m120558c.m41056w(messageId)) {
                            arrayList.add(Long.valueOf(Long.parseLong((String) entry.getKey())));
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final Object m120479o(String str, MessageId messageId, List list, List list2, Continuation continuation) {
        Object m142578e;
        ArrayList arrayList = new ArrayList();
        Map map = this.f113172c;
        AbstractC19074t.m100207e(map, "mapDeliveredSeenByGroup");
        synchronized (map) {
            try {
                HashMap hashMap = (HashMap) this.f113172c.get(str);
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                Map map2 = this.f113172c;
                AbstractC19074t.m100207e(map2, "mapDeliveredSeenByGroup");
                map2.put(str, hashMap);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String valueOf = String.valueOf(((Number) it.next()).longValue());
                    C23305e c23305e = (C23305e) hashMap.get(valueOf);
                    if (c23305e != null) {
                        MessageId m120558c = c23305e.m120558c();
                        if (m120558c == null || m120558c.m41058y(messageId)) {
                            c23305e.m120561f(messageId);
                            arrayList.add(c23305e);
                        }
                    } else {
                        C23305e c23305e2 = new C23305e(str, valueOf, messageId, messageId);
                        hashMap.put(valueOf, c23305e2);
                        arrayList.add(c23305e2);
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String valueOf2 = String.valueOf(((Number) it2.next()).longValue());
                    C23305e c23305e3 = (C23305e) hashMap.get(valueOf2);
                    if (c23305e3 != null) {
                        MessageId m120557b = c23305e3.m120557b();
                        if (m120557b == null || m120557b.m41058y(messageId)) {
                            c23305e3.m120560e(messageId);
                            Iterator it3 = arrayList.iterator();
                            AbstractC19074t.m100207e(it3, "iterator(...)");
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                AbstractC19074t.m100207e(next, "next(...)");
                                C23305e c23305e4 = (C23305e) next;
                                if (AbstractC19074t.m100204b(c23305e4.m120556a(), str) && AbstractC19074t.m100204b(c23305e4.m120559d(), valueOf2)) {
                                    it3.remove();
                                }
                            }
                            arrayList.add(c23305e3);
                        }
                    } else {
                        C23305e c23305e5 = new C23305e(str, valueOf2, messageId, null);
                        hashMap.put(valueOf2, c23305e5);
                        arrayList.add(c23305e5);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new h(arrayList, this, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0149 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:20:0x00ad, B:22:0x00b7, B:23:0x00c0, B:25:0x00d0, B:27:0x00d6, B:29:0x00dd, B:31:0x00e9, B:33:0x00fb, B:35:0x0107, B:37:0x011a, B:38:0x012a, B:40:0x0133, B:42:0x0139, B:47:0x0149, B:49:0x014f, B:51:0x0155, B:54:0x0161, B:55:0x0169, B:57:0x0172, B:62:0x0143, B:69:0x017e), top: B:19:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0076 -> B:68:0x0199). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x00a2 -> B:17:0x00a5). Please report as a decompilation issue!!! */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120480p(C31832a c31832a, Continuation continuation) {
        i iVar;
        C23298d c23298d;
        Object m142578e;
        int i11;
        int size;
        ArrayList arrayList;
        C23298d c23298d2;
        List list;
        int i12;
        i iVar2;
        Object obj;
        HashMap hashMap;
        i iVar3;
        Object obj2;
        MessageId m152954d;
        C23305e c23305e;
        boolean z11;
        MessageId m120557b;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i13 = iVar.f113196C;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f113196C = i13 - Integer.MIN_VALUE;
                c23298d = this;
                Object obj3 = iVar.f113194A;
                m142578e = AbstractC28298d.m142578e();
                i11 = iVar.f113196C;
                int i14 = 1;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj3);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean m152950d = iVar.f113204z;
                    size = iVar.f113203y;
                    i12 = iVar.f113202x;
                    String sb2 = (String) iVar.f113201w;
                    C31832a.a aVar = (C31832a.a) iVar.f113200v;
                    list = (List) iVar.f113199u;
                    arrayList = (ArrayList) iVar.f113198t;
                    c23298d2 = (C23298d) iVar.f113197s;
                    AbstractC24862s.m129228b(obj3);
                    Map map = c23298d2.f113172c;
                    AbstractC19074t.m100207e(map, "mapDeliveredSeenByGroup");
                    synchronized (map) {
                        try {
                            HashMap hashMap2 = (HashMap) c23298d2.f113172c.get(sb2);
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            Map map2 = c23298d2.f113172c;
                            AbstractC19074t.m100207e(map2, "mapDeliveredSeenByGroup");
                            map2.put(sb2, hashMap2);
                            List m152948b = aVar.m152948b();
                            if (m152948b != null && m152948b.size() > 0) {
                                int size2 = m152948b.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    C31832a.b bVar = (C31832a.b) m152948b.get(i15);
                                    if (!bVar.m152959i()) {
                                        iVar3 = iVar;
                                        if (AbstractC19074t.m100204b(String.valueOf(bVar.m152956f()), CoreUtility.f89233i) || (m152954d = bVar.m152954d()) == null) {
                                            hashMap = hashMap2;
                                        } else {
                                            AbstractC19074t.m100205c(m152954d);
                                            String valueOf = String.valueOf(bVar.m152956f());
                                            C23305e c23305e2 = (C23305e) hashMap2.get(valueOf);
                                            if (c23305e2 == null) {
                                                obj2 = m142578e;
                                                c23305e = new C23305e(sb2, valueOf, null, null);
                                                hashMap2.put(valueOf, c23305e);
                                            } else {
                                                obj2 = m142578e;
                                                c23305e = c23305e2;
                                            }
                                            AbstractC19074t.m100205c(c23305e);
                                            if (c23305e.m120557b() != null && ((m120557b = c23305e.m120557b()) == null || !m120557b.m41058y(m152954d))) {
                                                z11 = false;
                                                if (m152950d) {
                                                    if (c23305e.m120558c() != null) {
                                                        MessageId m120558c = c23305e.m120558c();
                                                        if (m120558c != null) {
                                                            hashMap = hashMap2;
                                                            if (m120558c.m41058y(m152954d)) {
                                                            }
                                                            if (!z11) {
                                                                i15++;
                                                                iVar = iVar3;
                                                                hashMap2 = hashMap;
                                                                m142578e = obj2;
                                                            }
                                                            arrayList.add(c23305e);
                                                            i15++;
                                                            iVar = iVar3;
                                                            hashMap2 = hashMap;
                                                            m142578e = obj2;
                                                        }
                                                    } else {
                                                        hashMap = hashMap2;
                                                    }
                                                    c23305e.m120561f(m152954d);
                                                    arrayList.add(c23305e);
                                                    i15++;
                                                    iVar = iVar3;
                                                    hashMap2 = hashMap;
                                                    m142578e = obj2;
                                                }
                                                hashMap = hashMap2;
                                                if (!z11) {
                                                }
                                                arrayList.add(c23305e);
                                                i15++;
                                                iVar = iVar3;
                                                hashMap2 = hashMap;
                                                m142578e = obj2;
                                            }
                                            c23305e.m120560e(m152954d);
                                            z11 = true;
                                            if (m152950d) {
                                            }
                                            hashMap = hashMap2;
                                            if (!z11) {
                                            }
                                            arrayList.add(c23305e);
                                            i15++;
                                            iVar = iVar3;
                                            hashMap2 = hashMap;
                                            m142578e = obj2;
                                        }
                                    } else {
                                        hashMap = hashMap2;
                                        iVar3 = iVar;
                                    }
                                    obj2 = m142578e;
                                    i15++;
                                    iVar = iVar3;
                                    hashMap2 = hashMap;
                                    m142578e = obj2;
                                }
                            }
                            iVar2 = iVar;
                            obj = m142578e;
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    AbstractC23306f.m120631X().m101508a(new C2778c.b(AbstractC25495a.m132076a(sb2)));
                    iVar = iVar2;
                    m142578e = obj;
                    i12++;
                    i14 = 1;
                    if (i12 < size) {
                        aVar = (C31832a.a) list.get(i12);
                        if (aVar != null) {
                            int m152947a = aVar.m152947a();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m152947a);
                            sb2 = sb3.toString();
                            m152950d = aVar.m152950d();
                            iVar.f113197s = c23298d2;
                            iVar.f113198t = arrayList;
                            iVar.f113199u = list;
                            iVar.f113200v = aVar;
                            iVar.f113201w = sb2;
                            iVar.f113202x = i12;
                            iVar.f113203y = size;
                            iVar.f113204z = m152950d;
                            iVar.f113196C = i14;
                            if (c23298d2.m120472e(sb2, iVar) == m142578e) {
                                return m142578e;
                            }
                            Map map3 = c23298d2.f113172c;
                            AbstractC19074t.m100207e(map3, "mapDeliveredSeenByGroup");
                            synchronized (map3) {
                            }
                        }
                        i12++;
                        i14 = 1;
                        if (i12 < size) {
                        }
                    } else {
                        CoroutineDispatcher m112680b = Dispatchers.m112680b();
                        j jVar = new j(arrayList, null);
                        iVar.f113197s = null;
                        iVar.f113198t = null;
                        iVar.f113199u = null;
                        iVar.f113200v = null;
                        iVar.f113201w = null;
                        iVar.f113196C = 2;
                        if (BuildersKt.m112534g(m112680b, jVar, iVar) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                } else {
                    AbstractC24862s.m129228b(obj3);
                    ArrayList arrayList2 = new ArrayList();
                    List m152944a = c31832a.m152944a();
                    size = m152944a.size();
                    arrayList = arrayList2;
                    c23298d2 = c23298d;
                    list = m152944a;
                    i12 = 0;
                    if (i12 < size) {
                    }
                }
            }
        }
        c23298d = this;
        iVar = new i(continuation);
        Object obj32 = iVar.f113194A;
        m142578e = AbstractC28298d.m142578e();
        i11 = iVar.f113196C;
        int i142 = 1;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d A[Catch: all -> 0x00b6, TryCatch #0 {all -> 0x00b6, blocks: (B:20:0x00a6, B:22:0x00b0, B:23:0x00b9, B:25:0x00c9, B:27:0x00cf, B:29:0x00d6, B:33:0x014a, B:34:0x00e7, B:36:0x00fa, B:37:0x010a, B:39:0x0113, B:41:0x0119, B:45:0x0127, B:47:0x012d, B:49:0x0133, B:52:0x0144, B:53:0x0147, B:60:0x0123, B:63:0x0154), top: B:19:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x0075 -> B:62:0x016b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x009b -> B:17:0x009e). Please report as a decompilation issue!!! */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120481q(C31832a c31832a, Continuation continuation) {
        k kVar;
        C23298d c23298d;
        Object m142578e;
        int i11;
        ArrayList arrayList;
        C23298d c23298d2;
        List list;
        int size;
        int i12;
        k kVar2;
        k kVar3;
        C23305e c23305e;
        boolean z11;
        HashMap hashMap;
        MessageId m120557b;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i13 = kVar.f113209B;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f113209B = i13 - Integer.MIN_VALUE;
                c23298d = this;
                Object obj = kVar.f113217z;
                m142578e = AbstractC28298d.m142578e();
                i11 = kVar.f113209B;
                int i14 = 1;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    size = kVar.f113216y;
                    i12 = kVar.f113215x;
                    String sb2 = (String) kVar.f113214w;
                    C31832a.a aVar = (C31832a.a) kVar.f113213v;
                    list = (List) kVar.f113212u;
                    arrayList = (ArrayList) kVar.f113211t;
                    c23298d2 = (C23298d) kVar.f113210s;
                    AbstractC24862s.m129228b(obj);
                    Map map = c23298d2.f113172c;
                    AbstractC19074t.m100207e(map, "mapDeliveredSeenByGroup");
                    synchronized (map) {
                        try {
                            HashMap hashMap2 = (HashMap) c23298d2.f113172c.get(sb2);
                            if (hashMap2 == null) {
                                hashMap2 = new HashMap();
                            }
                            Map map2 = c23298d2.f113172c;
                            AbstractC19074t.m100207e(map2, "mapDeliveredSeenByGroup");
                            map2.put(sb2, hashMap2);
                            List m152948b = aVar.m152948b();
                            if (m152948b != null && m152948b.size() > 0) {
                                int size2 = m152948b.size();
                                int i15 = 0;
                                while (i15 < size2) {
                                    C31832a.b bVar = (C31832a.b) m152948b.get(i15);
                                    MessageId m152954d = bVar.m152954d();
                                    if (m152954d == null) {
                                        hashMap = hashMap2;
                                        kVar3 = kVar;
                                    } else {
                                        AbstractC19074t.m100205c(m152954d);
                                        String valueOf = String.valueOf(bVar.m152956f());
                                        C23305e c23305e2 = (C23305e) hashMap2.get(valueOf);
                                        if (c23305e2 == null) {
                                            kVar3 = kVar;
                                            c23305e = new C23305e(sb2, valueOf, null, null);
                                            hashMap2.put(valueOf, c23305e);
                                        } else {
                                            kVar3 = kVar;
                                            c23305e = c23305e2;
                                        }
                                        AbstractC19074t.m100205c(c23305e);
                                        if (c23305e.m120557b() != null && ((m120557b = c23305e.m120557b()) == null || !m120557b.m41058y(m152954d))) {
                                            z11 = false;
                                            if (c23305e.m120558c() == null) {
                                                MessageId m120558c = c23305e.m120558c();
                                                if (m120558c != null) {
                                                    hashMap = hashMap2;
                                                    if (m120558c.m41058y(m152954d)) {
                                                    }
                                                } else {
                                                    hashMap = hashMap2;
                                                }
                                                if (z11) {
                                                    arrayList.add(c23305e);
                                                }
                                            } else {
                                                hashMap = hashMap2;
                                            }
                                            c23305e.m120561f(m152954d);
                                            arrayList.add(c23305e);
                                        }
                                        c23305e.m120560e(m152954d);
                                        z11 = true;
                                        if (c23305e.m120558c() == null) {
                                        }
                                        c23305e.m120561f(m152954d);
                                        arrayList.add(c23305e);
                                    }
                                    i15++;
                                    kVar = kVar3;
                                    hashMap2 = hashMap;
                                }
                            }
                            kVar2 = kVar;
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    AbstractC23306f.m120631X().m101508a(new C2778c.b(AbstractC25495a.m132076a(sb2)));
                    kVar = kVar2;
                    i12++;
                    i14 = 1;
                    if (i12 < size) {
                        aVar = (C31832a.a) list.get(i12);
                        if (aVar != null) {
                            int m152947a = aVar.m152947a();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m152947a);
                            sb2 = sb3.toString();
                            kVar.f113210s = c23298d2;
                            kVar.f113211t = arrayList;
                            kVar.f113212u = list;
                            kVar.f113213v = aVar;
                            kVar.f113214w = sb2;
                            kVar.f113215x = i12;
                            kVar.f113216y = size;
                            kVar.f113209B = i14;
                            if (c23298d2.m120472e(sb2, kVar) == m142578e) {
                                return m142578e;
                            }
                            Map map3 = c23298d2.f113172c;
                            AbstractC19074t.m100207e(map3, "mapDeliveredSeenByGroup");
                            synchronized (map3) {
                            }
                        }
                        i12++;
                        i14 = 1;
                        if (i12 < size) {
                        }
                    } else {
                        CoroutineDispatcher m112680b = Dispatchers.m112680b();
                        l lVar = new l(arrayList, null);
                        kVar.f113210s = null;
                        kVar.f113211t = null;
                        kVar.f113212u = null;
                        kVar.f113213v = null;
                        kVar.f113214w = null;
                        kVar.f113209B = 2;
                        if (BuildersKt.m112534g(m112680b, lVar, kVar) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    List m152944a = c31832a.m152944a();
                    arrayList = arrayList2;
                    c23298d2 = c23298d;
                    list = m152944a;
                    size = m152944a.size();
                    i12 = 0;
                    if (i12 < size) {
                    }
                }
            }
        }
        c23298d = this;
        kVar = new k(continuation);
        Object obj2 = kVar.f113217z;
        m142578e = AbstractC28298d.m142578e();
        i11 = kVar.f113209B;
        int i142 = 1;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a4 -> B:10:0x00a7). Please report as a decompilation issue!!! */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m120482r(JSONArray jSONArray, Continuation continuation) {
        m mVar;
        C23298d c23298d;
        Object m142578e;
        int i11;
        HashMap hashMap;
        C23298d c23298d2;
        ArrayList arrayList;
        int length;
        int i12;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        m mVar2;
        Object obj;
        int i13;
        long m116581d;
        long m116581d2;
        long m116581d3;
        long m116581d4;
        MessageId messageId;
        MessageId m120557b;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i14 = mVar.f113224D;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f113224D = i14 - Integer.MIN_VALUE;
                c23298d = this;
                Object obj2 = mVar.f113222B;
                m142578e = AbstractC28298d.m142578e();
                i11 = mVar.f113224D;
                int i15 = 1;
                if (i11 == 0) {
                    if (i11 == 1) {
                        length = mVar.f113221A;
                        i12 = mVar.f113232z;
                        C19055h0 c19055h0 = (C19055h0) mVar.f113231y;
                        String optString = (String) mVar.f113230x;
                        JSONObject jSONObject = (JSONObject) mVar.f113229w;
                        arrayList = (ArrayList) mVar.f113228v;
                        hashMap = (HashMap) mVar.f113227u;
                        JSONArray jSONArray4 = (JSONArray) mVar.f113226t;
                        c23298d2 = (C23298d) mVar.f113225s;
                        AbstractC24862s.m129228b(obj2);
                        jSONArray2 = jSONArray4;
                        Map map = c23298d2.f113172c;
                        AbstractC19074t.m100207e(map, "mapDeliveredSeenByGroup");
                        synchronized (map) {
                            try {
                                HashMap hashMap2 = (HashMap) c23298d2.f113172c.get(optString);
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                }
                                Map map2 = c23298d2.f113172c;
                                AbstractC19074t.m100207e(map2, "mapDeliveredSeenByGroup");
                                map2.put(optString, hashMap2);
                                JSONArray optJSONArray = jSONObject.optJSONArray("ids");
                                if (optJSONArray != null) {
                                    AbstractC19074t.m100205c(optJSONArray);
                                    int length2 = optJSONArray.length();
                                    int i16 = 0;
                                    while (i16 < length2) {
                                        JSONArray jSONArray5 = jSONArray2;
                                        Object obj3 = optJSONArray.get(i16);
                                        m mVar3 = mVar;
                                        AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                                        JSONObject jSONObject2 = (JSONObject) obj3;
                                        String optString2 = jSONObject2.optString("id");
                                        C23305e c23305e = (C23305e) hashMap2.get(optString2);
                                        Object obj4 = m142578e;
                                        int i17 = length;
                                        JSONArray jSONArray6 = optJSONArray;
                                        m116581d = AbstractC22543l.m116581d(jSONObject2.optLong("cmiSeen"), 0L);
                                        m116581d2 = AbstractC22543l.m116581d(jSONObject2.optLong("gmiSeen"), 0L);
                                        m116581d3 = AbstractC22543l.m116581d(jSONObject2.optLong("cmiDeliver"), 0L);
                                        m116581d4 = AbstractC22543l.m116581d(jSONObject2.optLong("gmiDeliver"), 0L);
                                        MessageId.C7932a c7932a = MessageId.Companion;
                                        MessageId m41061f = MessageId.C7932a.m41061f(c7932a, m116581d3, m116581d4, AbstractC25495a.m132076a(optString), null, 8, null);
                                        MessageId m41061f2 = MessageId.C7932a.m41061f(c7932a, m116581d, m116581d2, AbstractC25495a.m132076a(optString), null, 8, null);
                                        MessageId messageId2 = null;
                                        if (c23305e != null) {
                                            messageId = c23305e.m120557b();
                                        } else {
                                            messageId = null;
                                        }
                                        if ((messageId != null || m41061f == null) && (m41061f == null || c23305e == null || (m120557b = c23305e.m120557b()) == null || !m120557b.m41058y(m41061f))) {
                                            if (c23305e != null) {
                                                messageId2 = c23305e.m120558c();
                                            }
                                            if (messageId2 == null) {
                                                if (m41061f2 != null) {
                                                }
                                            }
                                            if (m41061f2 != null) {
                                                if (c23305e != null) {
                                                    MessageId m120558c = c23305e.m120558c();
                                                    if (m120558c != null) {
                                                        if (!m120558c.m41058y(m41061f2)) {
                                                        }
                                                    }
                                                }
                                            }
                                            i16++;
                                            jSONArray2 = jSONArray5;
                                            mVar = mVar3;
                                            m142578e = obj4;
                                            length = i17;
                                            optJSONArray = jSONArray6;
                                        }
                                        AbstractC19074t.m100205c(optString2);
                                        AbstractC19074t.m100205c(optString);
                                        C23305e c23305e2 = new C23305e(optString, optString2, m41061f, m41061f2);
                                        arrayList.add(c23305e2);
                                        hashMap2.put(optString2, c23305e2);
                                        c19055h0.f94931p++;
                                        i16++;
                                        jSONArray2 = jSONArray5;
                                        mVar = mVar3;
                                        m142578e = obj4;
                                        length = i17;
                                        optJSONArray = jSONArray6;
                                    }
                                    jSONArray3 = jSONArray2;
                                    mVar2 = mVar;
                                    obj = m142578e;
                                    i13 = length;
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                } else {
                                    jSONArray3 = jSONArray2;
                                    mVar2 = mVar;
                                    obj = m142578e;
                                    i13 = length;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (c19055h0.f94931p > 0) {
                            AbstractC23306f.m120631X().m101508a(new C2778c.b(AbstractC25495a.m132076a(optString)));
                        }
                        AbstractC19074t.m100205c(optString);
                        hashMap.put(optString, AbstractC29094b.m145341c(c19055h0.f94931p));
                        i12++;
                        jSONArray2 = jSONArray3;
                        mVar = mVar2;
                        m142578e = obj;
                        length = i13;
                        i15 = 1;
                        if (i12 >= length) {
                            Object obj5 = jSONArray2.get(i12);
                            AbstractC19074t.m100206d(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                            jSONObject = (JSONObject) obj5;
                            optString = jSONObject.optString("tId");
                            c19055h0 = new C19055h0();
                            AbstractC19074t.m100205c(optString);
                            mVar.f113225s = c23298d2;
                            mVar.f113226t = jSONArray2;
                            mVar.f113227u = hashMap;
                            mVar.f113228v = arrayList;
                            mVar.f113229w = jSONObject;
                            mVar.f113230x = optString;
                            mVar.f113231y = c19055h0;
                            mVar.f113232z = i12;
                            mVar.f113221A = length;
                            mVar.f113224D = i15;
                            if (c23298d2.m120472e(optString, mVar) == m142578e) {
                                return m142578e;
                            }
                            Map map3 = c23298d2.f113172c;
                            AbstractC19074t.m100207e(map3, "mapDeliveredSeenByGroup");
                            synchronized (map3) {
                            }
                        } else {
                            if (!arrayList.isEmpty()) {
                                c23298d2.f113170a.m120439b(arrayList);
                            }
                            return hashMap;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    hashMap = new HashMap();
                    c23298d2 = c23298d;
                    arrayList = new ArrayList();
                    length = jSONArray.length();
                    i12 = 0;
                    jSONArray2 = jSONArray;
                    if (i12 >= length) {
                    }
                }
            }
        }
        c23298d = this;
        mVar = new m(continuation);
        Object obj22 = mVar.f113222B;
        m142578e = AbstractC28298d.m142578e();
        i11 = mVar.f113224D;
        int i152 = 1;
        if (i11 == 0) {
        }
    }
}
