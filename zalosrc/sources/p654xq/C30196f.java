package p654xq;

import bo.C3020p0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import nh0.C23793c;
import nh0.InterfaceC23792b;
import p509sp.C26359h;
import p509sp.InterfaceC26357f;
import p618wq.C29190a;
import p618wq.C29191b;
import p618wq.C29192c;
import p725zq.C32543a;
import p725zq.C32544b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: xq.f */
/* loaded from: classes4.dex */
public final class C30196f implements InterfaceC30193c {
    public static final a Companion = new a(null);

    /* renamed from: l */
    private static volatile C30196f f140249l;

    /* renamed from: a */
    private final InterfaceC30191a f140250a;

    /* renamed from: b */
    private final InterfaceC30192b f140251b;

    /* renamed from: c */
    private final InterfaceC23792b f140252c;

    /* renamed from: d */
    private final InterfaceC26357f f140253d;

    /* renamed from: e */
    private final C32544b f140254e;

    /* renamed from: f */
    private AtomicBoolean f140255f;

    /* renamed from: g */
    private final Map f140256g;

    /* renamed from: h */
    private final Set f140257h;

    /* renamed from: i */
    private final Set f140258i;

    /* renamed from: j */
    private final Queue f140259j;

    /* renamed from: k */
    private final CoroutineScope f140260k;

    /* renamed from: xq.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final C30196f m148914a(InterfaceC30191a interfaceC30191a, InterfaceC30192b interfaceC30192b, InterfaceC23792b interfaceC23792b, InterfaceC26357f interfaceC26357f, C32544b c32544b) {
            if (interfaceC26357f == null) {
                interfaceC26357f = C26359h.f125209a;
            }
            InterfaceC26357f interfaceC26357f2 = interfaceC26357f;
            if (interfaceC30191a == null) {
                interfaceC30191a = new C30194d(interfaceC26357f2);
            }
            InterfaceC30191a interfaceC30191a2 = interfaceC30191a;
            if (interfaceC23792b == null) {
                interfaceC23792b = C23793c.Companion.m124321a();
            }
            InterfaceC23792b interfaceC23792b2 = interfaceC23792b;
            if (interfaceC30192b == null) {
                interfaceC30192b = new C30195e(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }
            InterfaceC30192b interfaceC30192b2 = interfaceC30192b;
            if (c32544b == null) {
                c32544b = C32544b.f150395a;
            }
            return new C30196f(interfaceC30191a2, interfaceC30192b2, interfaceC23792b2, interfaceC26357f2, c32544b);
        }

        /* renamed from: c */
        public static /* synthetic */ C30196f m148915c(a aVar, InterfaceC30191a interfaceC30191a, InterfaceC30192b interfaceC30192b, InterfaceC23792b interfaceC23792b, InterfaceC26357f interfaceC26357f, C32544b c32544b, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                interfaceC30191a = null;
            }
            if ((i11 & 2) != 0) {
                interfaceC30192b = null;
            }
            if ((i11 & 4) != 0) {
                interfaceC23792b = null;
            }
            if ((i11 & 8) != 0) {
                interfaceC26357f = null;
            }
            if ((i11 & 16) != 0) {
                c32544b = null;
            }
            return aVar.m148916b(interfaceC30191a, interfaceC30192b, interfaceC23792b, interfaceC26357f, c32544b);
        }

        /* renamed from: b */
        public final C30196f m148916b(InterfaceC30191a interfaceC30191a, InterfaceC30192b interfaceC30192b, InterfaceC23792b interfaceC23792b, InterfaceC26357f interfaceC26357f, C32544b c32544b) {
            C30196f c30196f = C30196f.f140249l;
            if (c30196f == null) {
                synchronized (this) {
                    c30196f = C30196f.f140249l;
                    if (c30196f == null) {
                        C30196f m148914a = C30196f.Companion.m148914a(interfaceC30191a, interfaceC30192b, interfaceC23792b, interfaceC26357f, c32544b);
                        C30196f.f140249l = m148914a;
                        c30196f = m148914a;
                    }
                }
            }
            return c30196f;
        }
    }

    /* renamed from: xq.f$a0 */
    /* loaded from: classes4.dex */
    static final class a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C29190a f140261q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(C29190a c29190a) {
            super(0);
            this.f140261q = c29190a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Update success, new info: " + this.f140261q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {
        b() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(Map.Entry entry) {
            AbstractC19074t.m100208f(entry, "it");
            return Boolean.valueOf(!C30196f.this.m148880E((C29190a) entry.getValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ int f140263q;

        /* renamed from: r */
        final /* synthetic */ List f140264r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, List list) {
            super(0);
            this.f140263q = i11;
            this.f140264r = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "List requests exceed " + this.f140263q + " items. Filtering: " + this.f140264r;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Request fail - Remove from waiting server response: " + C30196f.this.f140258i + " ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {
        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            Map map = C30196f.this.f140256g;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
            return "Request fail - Current cache: " + arrayList + " - Details: " + C30196f.this.f140256g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f140267s;

        /* renamed from: t */
        Object f140268t;

        /* renamed from: u */
        Object f140269u;

        /* renamed from: v */
        /* synthetic */ Object f140270v;

        /* renamed from: x */
        int f140272x;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f140270v = obj;
            this.f140272x |= Integer.MIN_VALUE;
            return C30196f.this.m148876A(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140273q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List list) {
            super(0);
            this.f140273q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "List feeds request: " + this.f140273q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {
        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Add to waiting server response: " + C30196f.this.f140258i + " ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {
        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Remove from preload waiting queue: " + C30196f.this.f140257h + " ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {
        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Request server done - Remove from waiting server response: " + C30196f.this.f140258i + " ";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {
        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Request server done - add result to cache: " + C30196f.this.f140256g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$l */
    /* loaded from: classes4.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f140278t;

        /* renamed from: v */
        final /* synthetic */ List f140280v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List list, Continuation continuation) {
            super(2, continuation);
            this.f140280v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f140280v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f140278t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC30192b interfaceC30192b = C30196f.this.f140251b;
                List list = this.f140280v;
                this.f140278t = 1;
                if (interfaceC30192b.mo148862a(list, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$m */
    /* loaded from: classes4.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Exception f140281q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Exception exc) {
            super(0);
            this.f140281q = exc;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Request fail - Exception: " + this.f140281q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$n */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C19059j0 f140282q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C19059j0 c19059j0) {
            super(0);
            this.f140282q = c19059j0;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "List feeds request: " + this.f140282q.f94941p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$o */
    /* loaded from: classes4.dex */
    public static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f140283t;

        /* renamed from: u */
        int f140284u;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: xq.f$o$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final a f140286q = new a();

            a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Start load local data";
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: xq.f$o$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C30196f f140287q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C30196f c30196f) {
                super(0);
                this.f140287q = c30196f;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                Map map = this.f140287q.f140256g;
                ArrayList arrayList = new ArrayList(map.size());
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                return "Load local and filter expired data complete, current cache: " + arrayList + " - Details: " + this.f140287q.f140256g;
            }
        }

        o(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C30196f c30196f;
            C30196f c30196f2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f140284u;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            C30196f.this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_LOCAL_DATA", new b(C30196f.this));
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                    C30196f.this.m148908v();
                    C30196f.this.f140255f.set(true);
                    c30196f2 = C30196f.this;
                    this.f140284u = 3;
                    if (c30196f2.m148889N(this) == m142578e) {
                        return m142578e;
                    }
                    C30196f.this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_LOCAL_DATA", new b(C30196f.this));
                    return C24848g0.f119245a;
                }
                c30196f = (C30196f) this.f140283t;
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C30196f.this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_LOCAL_DATA", a.f140286q);
                c30196f = C30196f.this;
                InterfaceC30192b interfaceC30192b = c30196f.f140251b;
                this.f140283t = c30196f;
                this.f140284u = 1;
                obj = interfaceC30192b.mo148864c(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            c30196f.m148907t((List) obj);
            InterfaceC30192b interfaceC30192b2 = C30196f.this.f140251b;
            List m148911y = C30196f.this.m148911y();
            this.f140283t = null;
            this.f140284u = 2;
            if (interfaceC30192b2.mo148865d(m148911y, this) == m142578e) {
                return m142578e;
            }
            C30196f.this.m148908v();
            C30196f.this.f140255f.set(true);
            c30196f2 = C30196f.this;
            this.f140284u = 3;
            if (c30196f2.m148889N(this) == m142578e) {
            }
            C30196f.this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_LOCAL_DATA", new b(C30196f.this));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$p */
    /* loaded from: classes4.dex */
    public static final class p extends AbstractC29096d {

        /* renamed from: s */
        Object f140288s;

        /* renamed from: t */
        Object f140289t;

        /* renamed from: u */
        Object f140290u;

        /* renamed from: v */
        /* synthetic */ Object f140291v;

        /* renamed from: x */
        int f140293x;

        p(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f140291v = obj;
            this.f140293x |= Integer.MIN_VALUE;
            return C30196f.this.mo148867b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$q */
    /* loaded from: classes4.dex */
    public static final class q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140294q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(List list) {
            super(0);
            this.f140294q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            int m131511r;
            List list = this.f140294q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29191b) it.next()).m145746b());
            }
            return "List all request (both on and off screen): " + arrayList + " - Detail: " + this.f140294q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$r */
    /* loaded from: classes4.dex */
    public static final class r extends AbstractC19075u implements InterfaceC18494a {
        r() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            Map map = C30196f.this.f140256g;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
            return "Current cache: " + arrayList + " - Details: " + C30196f.this.f140256g;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$s */
    /* loaded from: classes4.dex */
    public static final class s extends AbstractC19075u implements InterfaceC18494a {
        s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Waiting queue load new: " + C30196f.this.f140257h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$t */
    /* loaded from: classes4.dex */
    public static final class t extends AbstractC19075u implements InterfaceC18494a {
        t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Waiting server response list: " + C30196f.this.f140258i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$u */
    /* loaded from: classes4.dex */
    public static final class u extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140298q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(List list) {
            super(0);
            this.f140298q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            int m131511r;
            List list = this.f140298q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29191b) it.next()).m145746b());
            }
            return "List feeds on-screen expired: " + arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$v */
    /* loaded from: classes4.dex */
    public static final class v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140299q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(List list) {
            super(0);
            this.f140299q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            int m131511r;
            List list = this.f140299q;
            m131511r = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C29191b) it.next()).m145746b());
            }
            return "List feeds off-screen expired: " + arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$w */
    /* loaded from: classes4.dex */
    public static final class w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140300q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(List list) {
            super(0);
            this.f140300q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "Return result: " + this.f140300q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$x */
    /* loaded from: classes4.dex */
    public static final class x extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ List f140301q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(List list) {
            super(0);
            this.f140301q = list;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "List feeds request: " + this.f140301q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$y */
    /* loaded from: classes4.dex */
    public static final class y extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C29191b f140302q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(C29191b c29191b) {
            super(1);
            this.f140302q = c29191b;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C29191b c29191b) {
            return Boolean.valueOf(AbstractC19074t.m100204b(c29191b.m145746b(), this.f140302q.m145746b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xq.f$z */
    /* loaded from: classes4.dex */
    public static final class z extends AbstractC29096d {

        /* renamed from: s */
        Object f140303s;

        /* renamed from: t */
        Object f140304t;

        /* renamed from: u */
        /* synthetic */ Object f140305u;

        /* renamed from: w */
        int f140307w;

        z(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f140305u = obj;
            this.f140307w |= Integer.MIN_VALUE;
            return C30196f.this.m148889N(this);
        }
    }

    public C30196f(InterfaceC30191a interfaceC30191a, InterfaceC30192b interfaceC30192b, InterfaceC23792b interfaceC23792b, InterfaceC26357f interfaceC26357f, C32544b c32544b) {
        AbstractC19074t.m100208f(interfaceC30191a, "realTimeLikeCommentAPI");
        AbstractC19074t.m100208f(interfaceC30192b, "realTimeLikeCommentLocalDataSource");
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(interfaceC26357f, "logFlow");
        AbstractC19074t.m100208f(c32544b, "realTimeUtility");
        this.f140250a = interfaceC30191a;
        this.f140251b = interfaceC30192b;
        this.f140252c = interfaceC23792b;
        this.f140253d = interfaceC26357f;
        this.f140254e = c32544b;
        this.f140255f = new AtomicBoolean(false);
        this.f140256g = new ConcurrentHashMap();
        this.f140257h = Collections.synchronizedSet(new LinkedHashSet());
        this.f140258i = Collections.synchronizedSet(new LinkedHashSet());
        this.f140259j = new LinkedList();
        this.f140260k = CoroutineScopeKt.m112637a(Dispatchers.m112680b());
        m148886K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|(1:(1:(4:10|11|12|14)(2:26|27))(4:28|29|30|31))(6:44|45|46|(10:48|(2:51|49)|52|53|(2:56|54)|57|58|(1:60)(1:66)|61|(1:63)(1:64))|24|25)|32|33|(1:35)(2:36|37)))|69|6|(0)(0)|32|33|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0161, code lost:            r0 = e;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017b A[LOOP:0: B:19:0x0175->B:21:0x017b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m148876A(List list, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i11;
        C30196f c30196f;
        int m131511r;
        int m131511r2;
        Object m131205e0;
        int i12;
        C30196f c30196f2;
        List list2;
        CoroutineDispatcher m112680b;
        l lVar;
        List m131502j;
        int m131511r3;
        Iterator it;
        List list3 = list;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i13 = fVar.f140272x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f140272x = i13 - Integer.MIN_VALUE;
                Object obj = fVar.f140270v;
                m142578e = AbstractC28298d.m142578e();
                i11 = fVar.f140272x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            List list4 = (List) fVar.f140269u;
                            List list5 = (List) fVar.f140268t;
                            c30196f = (C30196f) fVar.f140267s;
                            try {
                                AbstractC24862s.m129228b(obj);
                                return list4;
                            } catch (Exception e11) {
                                e = e11;
                                list3 = list5;
                                List list6 = list3;
                                m131511r3 = AbstractC25370t.m131511r(list6, 10);
                                ArrayList arrayList = new ArrayList(m131511r3);
                                it = list6.iterator();
                                while (it.hasNext()) {
                                }
                                c30196f.m148912z(arrayList);
                                c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new m(e));
                                c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new d());
                                c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new e());
                                m131502j = AbstractC25368s.m131502j();
                                return m131502j;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list7 = (List) fVar.f140269u;
                    List list8 = (List) fVar.f140268t;
                    c30196f2 = (C30196f) fVar.f140267s;
                    try {
                        AbstractC24862s.m129228b(obj);
                        list2 = list7;
                        list3 = list8;
                    } catch (Exception e12) {
                        e = e12;
                        list3 = list8;
                        c30196f = c30196f2;
                        List list62 = list3;
                        m131511r3 = AbstractC25370t.m131511r(list62, 10);
                        ArrayList arrayList2 = new ArrayList(m131511r3);
                        it = list62.iterator();
                        while (it.hasNext()) {
                        }
                        c30196f.m148912z(arrayList2);
                        c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new m(e));
                        c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new d());
                        c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new e());
                        m131502j = AbstractC25368s.m131502j();
                        return m131502j;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    try {
                        if (!list3.isEmpty()) {
                            List list9 = list3;
                            m131511r = AbstractC25370t.m131511r(list9, 10);
                            ArrayList arrayList3 = new ArrayList(m131511r);
                            Iterator it2 = list9.iterator();
                            while (it2.hasNext()) {
                                arrayList3.add(((C29191b) it2.next()).m145746b());
                            }
                            List list10 = list3;
                            m131511r2 = AbstractC25370t.m131511r(list10, 10);
                            ArrayList arrayList4 = new ArrayList(m131511r2);
                            Iterator it3 = list10.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((C29191b) it3.next()).m145747c());
                            }
                            this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new g(arrayList3));
                            List m148910x = m148910x(arrayList3, 20);
                            m148904q(m148910x);
                            m148885J(list);
                            this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new h());
                            this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new i());
                            InterfaceC30192b interfaceC30192b = this.f140251b;
                            m131205e0 = AbstractC25332a0.m131205e0(m148910x);
                            int mo148863b = interfaceC30192b.mo148863b((String) m131205e0);
                            if (mo148863b > 0) {
                                i12 = mo148863b;
                            } else {
                                i12 = 1;
                            }
                            InterfaceC30191a interfaceC30191a = this.f140250a;
                            C29192c c29192c = new C29192c(m148910x, m148909w(arrayList4), i12, 0, 8, null);
                            fVar.f140267s = this;
                            fVar.f140268t = list3;
                            fVar.f140269u = m148910x;
                            fVar.f140272x = 1;
                            Object mo148861a = interfaceC30191a.mo148861a(c29192c, fVar);
                            if (mo148861a == m142578e) {
                                return m142578e;
                            }
                            c30196f2 = this;
                            list2 = m148910x;
                            obj = mo148861a;
                        }
                    } catch (Exception e13) {
                        e = e13;
                        c30196f = this;
                        List list622 = list3;
                        m131511r3 = AbstractC25370t.m131511r(list622, 10);
                        ArrayList arrayList22 = new ArrayList(m131511r3);
                        it = list622.iterator();
                        while (it.hasNext()) {
                            arrayList22.add(((C29191b) it.next()).m145746b());
                        }
                        c30196f.m148912z(arrayList22);
                        c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new m(e));
                        c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new d());
                        c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new e());
                        m131502j = AbstractC25368s.m131502j();
                        return m131502j;
                    }
                    m131502j = AbstractC25368s.m131502j();
                    return m131502j;
                }
                List list11 = (List) obj;
                c30196f2.m148884I(list2);
                c30196f2.m148907t(list11);
                c30196f2.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new j());
                c30196f2.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new k());
                m112680b = Dispatchers.m112680b();
                lVar = new l(list11, null);
                fVar.f140267s = c30196f2;
                fVar.f140268t = list3;
                fVar.f140269u = list11;
                fVar.f140272x = 2;
                if (BuildersKt.m112534g(m112680b, lVar, fVar) != m142578e) {
                    return m142578e;
                }
                return list11;
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f140270v;
        m142578e = AbstractC28298d.m142578e();
        i11 = fVar.f140272x;
        if (i11 == 0) {
        }
        List list112 = (List) obj2;
        c30196f2.m148884I(list2);
        c30196f2.m148907t(list112);
        c30196f2.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new j());
        c30196f2.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new k());
        m112680b = Dispatchers.m112680b();
        lVar = new l(list112, null);
        fVar.f140267s = c30196f2;
        fVar.f140268t = list3;
        fVar.f140269u = list112;
        fVar.f140272x = 2;
        if (BuildersKt.m112534g(m112680b, lVar, fVar) != m142578e) {
        }
    }

    /* renamed from: B */
    private final boolean m148877B(long j11) {
        if (this.f140252c.mo124314i() - j11 <= C32543a.f150389a.m157590b()) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    private final boolean m148878C(int i11) {
        return !AbstractC20826v0.m108826o0(i11);
    }

    /* renamed from: D */
    private final boolean m148879D(C29191b c29191b) {
        if (m148877B(c29191b.m145745a()) && m148878C(c29191b.m145748d())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final boolean m148880E(C29190a c29190a) {
        if (this.f140252c.mo124314i() < c29190a.m145739c() + c29190a.m145740d()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private final Object m148881F(List list, Continuation continuation) {
        Set m131188P0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        Set set = this.f140257h;
        AbstractC19074t.m100207e(set, "waitingLoadNewQueue");
        synchronized (set) {
            Set set2 = this.f140257h;
            AbstractC19074t.m100207e(set2, "waitingLoadNewQueue");
            linkedHashSet.addAll(set2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (hashSet.add(((C29191b) obj).m145746b())) {
                arrayList.add(obj);
            }
        }
        m131188P0 = AbstractC25332a0.m131188P0(arrayList);
        C19059j0 c19059j0 = new C19059j0();
        Set set3 = this.f140258i;
        AbstractC19074t.m100207e(set3, "waitingServerResponseList");
        synchronized (set3) {
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : m131188P0) {
                    if (!this.f140258i.contains(((C29191b) obj2).m145746b())) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList2.addAll(arrayList3);
                c19059j0.f94941p = arrayList2;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_INFO_FEED_ON_SCREEN_AND_WAITING_QUEUE", new n(c19059j0));
        return m148876A((List) c19059j0.f94941p, continuation);
    }

    /* renamed from: G */
    private final void m148882G() {
        BuildersKt__Builders_commonKt.m112540d(this.f140260k, null, null, new o(null), 3, null);
    }

    /* renamed from: H */
    private final Object m148883H(Continuation continuation) {
        List m131502j;
        if (this.f140257h.size() < C32543a.f150389a.m157594f()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        Set set = this.f140257h;
        AbstractC19074t.m100207e(set, "waitingLoadNewQueue");
        synchronized (set) {
            Set set2 = this.f140257h;
            AbstractC19074t.m100207e(set2, "waitingLoadNewQueue");
            arrayList.addAll(set2);
        }
        this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_PRELOAD_REAL_TIME_FEED_OFF_SCREEN", new x(arrayList));
        return m148876A(arrayList, continuation);
    }

    /* renamed from: I */
    private final void m148884I(List list) {
        Set set = this.f140258i;
        AbstractC19074t.m100207e(set, "waitingServerResponseList");
        synchronized (set) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (this.f140258i.contains(str)) {
                        this.f140258i.remove(str);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: J */
    private final void m148885J(List list) {
        Set set = this.f140257h;
        AbstractC19074t.m100207e(set, "waitingLoadNewQueue");
        synchronized (set) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C29191b c29191b = (C29191b) it.next();
                    Set set2 = this.f140257h;
                    AbstractC19074t.m100207e(set2, "waitingLoadNewQueue");
                    AbstractC25378x.m131541C(set2, new y(c29191b));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K */
    private final void m148886K() {
        m148887L();
        m148882G();
    }

    /* renamed from: L */
    private final void m148887L() {
        synchronized (this) {
            this.f140256g.clear();
            this.f140258i.clear();
            this.f140257h.clear();
            this.f140255f.set(false);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: M */
    private final void m148888M(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C29190a((String) it.next(), null, 0, C32543a.f150389a.m157591c(), 0L, 22, null));
        }
        m148907t(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m148889N(Continuation continuation) {
        z zVar;
        Object m142578e;
        int i11;
        C30196f c30196f;
        Iterator it;
        if (continuation instanceof z) {
            zVar = (z) continuation;
            int i12 = zVar.f140307w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zVar.f140307w = i12 - Integer.MIN_VALUE;
                Object obj = zVar.f140305u;
                m142578e = AbstractC28298d.m142578e();
                i11 = zVar.f140307w;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) zVar.f140304t;
                        c30196f = (C30196f) zVar.f140303s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ArrayList arrayList = new ArrayList();
                    synchronized (this.f140259j) {
                        arrayList.addAll(this.f140259j);
                        this.f140259j.clear();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                    c30196f = this;
                    it = arrayList.iterator();
                }
                while (it.hasNext()) {
                    List list = (List) it.next();
                    zVar.f140303s = c30196f;
                    zVar.f140304t = it;
                    zVar.f140307w = 1;
                    if (c30196f.mo148867b(list, zVar) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        zVar = new z(continuation);
        Object obj2 = zVar.f140305u;
        m142578e = AbstractC28298d.m142578e();
        i11 = zVar.f140307w;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: q */
    private final void m148904q(List list) {
        Set set = this.f140258i;
        AbstractC19074t.m100207e(set, "waitingServerResponseList");
        synchronized (set) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!this.f140258i.contains(str)) {
                        this.f140258i.add(str);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r */
    private final void m148905r(List list) {
        synchronized (this.f140259j) {
            try {
                this.f140259j.add(list);
                if (this.f140259j.size() > 3) {
                    this.f140259j.remove();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    private final void m148906s(List list) {
        C19059j0 c19059j0 = new C19059j0();
        Set set = this.f140258i;
        AbstractC19074t.m100207e(set, "waitingServerResponseList");
        synchronized (set) {
            ArrayList arrayList = new ArrayList();
            Set set2 = this.f140258i;
            AbstractC19074t.m100207e(set2, "waitingServerResponseList");
            arrayList.addAll(set2);
            c19059j0.f94941p = arrayList;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        Set set3 = this.f140257h;
        AbstractC19074t.m100207e(set3, "waitingLoadNewQueue");
        synchronized (set3) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C29191b c29191b = (C29191b) it.next();
                    if (!((List) c19059j0.f94941p).contains(c29191b.m145746b())) {
                        Set set4 = this.f140257h;
                        AbstractC19074t.m100207e(set4, "waitingLoadNewQueue");
                        Set set5 = set4;
                        if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                            Iterator it2 = set5.iterator();
                            while (it2.hasNext()) {
                                if (AbstractC19074t.m100204b(((C29191b) it2.next()).m145746b(), c29191b.m145746b())) {
                                    break;
                                }
                            }
                        }
                        this.f140257h.add(c29191b);
                    }
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public final void m148907t(List list) {
        synchronized (this.f140256g) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C29190a c29190a = (C29190a) it.next();
                    this.f140256g.put(c29190a.m145737a(), c29190a);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m148908v() {
        synchronized (this.f140256g) {
            AbstractC25378x.m131541C(this.f140256g.entrySet(), new b());
        }
    }

    /* renamed from: w */
    private final List m148909w(List list) {
        int m131511r;
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(AbstractC19074t.m100204b((String) it.next(), this.f140254e.m157601a())));
        }
        return arrayList;
    }

    /* renamed from: x */
    private final List m148910x(List list, int i11) {
        List m131179G0;
        if (list.size() > i11) {
            m131179G0 = AbstractC25332a0.m131179G0(list, i11);
            this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_REQUEST_SERVER", new c(i11, m131179G0));
            return m131179G0;
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final List m148911y() {
        List m131185M0;
        synchronized (this.f140256g) {
            try {
                Map map = this.f140256g;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (!m148880E((C29190a) entry.getValue())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                m131185M0 = AbstractC25332a0.m131185M0(linkedHashMap.keySet());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m131185M0;
    }

    /* renamed from: z */
    private final void m148912z(List list) {
        m148884I(list);
        m148888M(list);
    }

    @Override // p654xq.InterfaceC30193c
    /* renamed from: a */
    public void mo148866a(C3020p0 c3020p0) {
        long j11;
        AbstractC19074t.m100208f(c3020p0, "feedItem");
        synchronized (this.f140256g) {
            try {
                if (this.f140256g.containsKey(c3020p0.f12057p)) {
                    C29190a c29190a = (C29190a) this.f140256g.get(c3020p0.f12057p);
                    C29190a.a aVar = C29190a.f135245f;
                    if (c29190a != null) {
                        j11 = c29190a.m145740d();
                    } else {
                        j11 = 1800000;
                    }
                    C29190a m145743a = aVar.m145743a(c3020p0, j11);
                    Map map = this.f140256g;
                    String str = c3020p0.f12057p;
                    AbstractC19074t.m100207e(str, "fid");
                    map.put(str, m145743a);
                    this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_UPDATE_CACHED_DATA", new a0(m145743a));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // p654xq.InterfaceC30193c
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo148867b(List list, Continuation continuation) {
        p pVar;
        Object m142578e;
        int i11;
        List arrayList;
        C30196f c30196f;
        List list2;
        List m131502j;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i12 = pVar.f140293x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                pVar.f140293x = i12 - Integer.MIN_VALUE;
                Object obj = pVar.f140291v;
                m142578e = AbstractC28298d.m142578e();
                i11 = pVar.f140293x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            arrayList = (List) pVar.f140290u;
                            list2 = (List) pVar.f140289t;
                            c30196f = (C30196f) pVar.f140288s;
                            AbstractC24862s.m129228b(obj);
                            arrayList.addAll((Collection) obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        arrayList = (List) pVar.f140290u;
                        list2 = (List) pVar.f140289t;
                        c30196f = (C30196f) pVar.f140288s;
                        AbstractC24862s.m129228b(obj);
                        arrayList.addAll((Collection) obj);
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!this.f140255f.get()) {
                        m148905r(list);
                        m131502j = AbstractC25368s.m131502j();
                        return m131502j;
                    }
                    m148908v();
                    this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new q(list));
                    this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new r());
                    this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new s());
                    this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new t());
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (m148879D((C29191b) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList<C29191b> arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (((C29191b) obj3).m145749e()) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        if (!((C29191b) obj4).m145749e()) {
                            arrayList4.add(obj4);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj5 : arrayList4) {
                        if (!this.f140256g.containsKey(((C29191b) obj5).m145746b())) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (C29191b c29191b : arrayList3) {
                        if (((C29190a) this.f140256g.get(c29191b.m145746b())) == null) {
                            arrayList6.add(c29191b);
                        }
                    }
                    this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new u(arrayList6));
                    this.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new v(arrayList5));
                    m148906s(arrayList5);
                    arrayList = new ArrayList();
                    if (arrayList6.size() > 0) {
                        pVar.f140288s = this;
                        pVar.f140289t = arrayList;
                        pVar.f140290u = arrayList;
                        pVar.f140293x = 1;
                        obj = m148881F(arrayList6, pVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c30196f = this;
                        list2 = arrayList;
                        arrayList.addAll((Collection) obj);
                    } else {
                        pVar.f140288s = this;
                        pVar.f140289t = arrayList;
                        pVar.f140290u = arrayList;
                        pVar.f140293x = 2;
                        obj = m148883H(pVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        c30196f = this;
                        list2 = arrayList;
                        arrayList.addAll((Collection) obj);
                    }
                }
                c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new w(list2));
                return list2;
            }
        }
        pVar = new p(continuation);
        Object obj6 = pVar.f140291v;
        m142578e = AbstractC28298d.m142578e();
        i11 = pVar.f140293x;
        if (i11 == 0) {
        }
        c30196f.f140253d.mo135685a("REAL_TIME_LIKE_COMMENT", "REPO_LOAD_REAL_TIME_INFO", new w(list2));
        return list2;
    }

    /* renamed from: u */
    public final void m148913u() {
        m148887L();
        f140249l = null;
    }
}
