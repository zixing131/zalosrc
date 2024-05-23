package kc0;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.toolstorage.ThreadStorageInfo;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import gw.C19610a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import k30.C21459a;
import kc0.C21680s;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23041d2;
import mg.C23288a;
import mm0.AbstractC23350e;
import nl.C23870a;
import p019aj.C0876j;
import p348mi.AbstractC23306f;
import p396ol.C24302e;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25378x;
import sm0.AbstractC26327c;
import ta0.AbstractC26611a;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wa0.AbstractC28862a;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import xd0.C29588d;

/* renamed from: kc0.s */
/* loaded from: classes6.dex */
public final class C21680s extends AbstractC26611a {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final C19610a f105209I;

    /* renamed from: J */
    private final C29588d f105210J;

    /* renamed from: K */
    private final C0876j f105211K;

    /* renamed from: L */
    private final C23870a f105212L;

    /* renamed from: M */
    private ThreadStorageInfo f105213M;

    /* renamed from: N */
    private final C1761c0 f105214N;

    /* renamed from: O */
    private final LiveData f105215O;

    /* renamed from: P */
    private final ConcurrentHashMap f105216P;

    /* renamed from: Q */
    private final HashMap f105217Q;

    /* renamed from: R */
    private ArrayList f105218R;

    /* renamed from: S */
    private final List f105219S;

    /* renamed from: T */
    private final int f105220T;

    /* renamed from: U */
    private AtomicBoolean f105221U;

    /* renamed from: kc0.s$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: kc0.s$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105222t;

        /* renamed from: u */
        final /* synthetic */ ThreadStorageInfo f105223u;

        /* renamed from: v */
        final /* synthetic */ C21680s f105224v;

        /* renamed from: w */
        final /* synthetic */ ArrayList f105225w;

        /* renamed from: kc0.s$b$a */
        /* loaded from: classes6.dex */
        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m135478b;
                m135478b = AbstractC26327c.m135478b(Long.valueOf(((C25821b) obj2).m133145h().m133166c()), Long.valueOf(((C25821b) obj).m133145h().m133166c()));
                return m135478b;
            }
        }

        /* renamed from: kc0.s$b$b */
        /* loaded from: classes6.dex */
        public static final class C32872b implements Comparator {

            /* renamed from: p */
            final /* synthetic */ Comparator f105226p;

            public C32872b(Comparator comparator) {
                this.f105226p = comparator;
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m135478b;
                int compare = this.f105226p.compare(obj, obj2);
                if (compare == 0) {
                    m135478b = AbstractC26327c.m135478b(Long.valueOf(((C25821b) obj2).m133150m()), Long.valueOf(((C25821b) obj).m133150m()));
                    return m135478b;
                }
                return compare;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ThreadStorageInfo threadStorageInfo, C21680s c21680s, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f105223u = threadStorageInfo;
            this.f105224v = c21680s;
            this.f105225w = arrayList;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f105223u, this.f105224v, this.f105225w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List list;
            List m131177E0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f105222t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            AbstractC24862s.m129228b(obj);
                            list = (List) obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        list = (List) obj;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    list = (List) obj;
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21459a.m111041j();
                if (!TextUtils.isEmpty(this.f105223u.m74822z())) {
                    C23870a c23870a = this.f105224v.f105212L;
                    String m74822z = this.f105223u.m74822z();
                    this.f105222t = 1;
                    obj = c23870a.m124806d0(m74822z, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    list = (List) obj;
                } else if (AbstractC23306f.m120691m2().m2461l()) {
                    C23870a c23870a2 = this.f105224v.f105212L;
                    ArrayList arrayList = this.f105225w;
                    this.f105222t = 2;
                    obj = c23870a2.m124807e0(arrayList, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    list = (List) obj;
                } else {
                    C23870a c23870a3 = this.f105224v.f105212L;
                    this.f105222t = 3;
                    obj = c23870a3.m124806d0("204278670", this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    list = (List) obj;
                }
            }
            C26676b.m136957g("SMLZCloudManagementViewModel", "calculateConversationDataSize(): Loaded " + list.size() + " items(s)", null, 4, null);
            List list2 = this.f105224v.f105219S;
            List list3 = list;
            m131177E0 = AbstractC25332a0.m131177E0(list3, new C32872b(new a()));
            list2.addAll(m131177E0);
            C21680s.m111794f1(this.f105224v, false, 1, null);
            if (this.f105223u.m74776N() <= 0 && (!list.isEmpty())) {
                this.f105223u.m74790e();
                C21680s c21680s = this.f105224v;
                ThreadStorageInfo threadStorageInfo = this.f105223u;
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    c21680s.m111784Q0((C25821b) it.next(), threadStorageInfo);
                }
            }
            this.f105224v.f105213M = this.f105223u;
            this.f105224v.f105214N.mo9221n(this.f105223u);
            this.f105224v.m136605u0(false);
            C26676b.m136957g("SMLZCloudManagementViewModel", "calculateConversationDataSize(): COMPLETED", null, 4, null);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: kc0.s$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105227t;

        /* renamed from: v */
        final /* synthetic */ boolean f105229v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f105229v = z11;
        }

        /* renamed from: t */
        public static final void m111809t(C21680s c21680s) {
            c21680s.f105221U.compareAndSet(true, false);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f105229v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            List m131180H0;
            AbstractC28298d.m142578e();
            if (this.f105227t == 0) {
                AbstractC24862s.m129228b(obj);
                if (C21680s.this.f105221U.get()) {
                    return C24848g0.f119245a;
                }
                C21680s.this.f105221U.compareAndSet(false, true);
                Integer num = (Integer) C21680s.this.f105217Q.get(C21680s.this.m136584V());
                if (num == null) {
                    num = AbstractC29094b.m145341c(0);
                }
                int intValue = num.intValue();
                ArrayList arrayList = new ArrayList();
                List m111791Z0 = C21680s.this.m111791Z0(arrayList);
                if (intValue < m111791Z0.size() && !m111791Z0.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    int min = Math.min(C21680s.this.f105220T + intValue, m111791Z0.size());
                    if (!arrayList.isEmpty()) {
                        arrayList2.addAll(new ArrayList(arrayList.subList(intValue, min)));
                    }
                    List m111792a1 = C21680s.this.m111792a1(m111791Z0, arrayList2, intValue, min);
                    while (min < m111791Z0.size() && m111792a1.size() < C21680s.this.f105220T / 2) {
                        int min2 = Math.min(C21680s.this.f105220T + min, m111791Z0.size());
                        if (!arrayList.isEmpty()) {
                            arrayList2.addAll(new ArrayList(arrayList.subList(min, min2)));
                        }
                        m111792a1.addAll(C21680s.this.m111792a1(m111791Z0, arrayList2, min, min2));
                        min = min2;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList m111793b1 = C21680s.this.m111793b1(this.f105229v, arrayList3);
                    if (!AbstractC19074t.m100204b(C21680s.this.m136584V(), "All")) {
                        ArrayList m111787T0 = C21680s.this.m111787T0(m111792a1, arrayList2);
                        if (true ^ m111787T0.isEmpty()) {
                            C21680s.this.f105218R.addAll(m111787T0);
                            m131180H0 = AbstractC25332a0.m131180H0(m111792a1, m111787T0.size());
                            m111793b1.addAll(m131180H0);
                        }
                    } else {
                        m111793b1.addAll(m111792a1);
                        m111793b1.addAll(C21680s.this.m111788U0(arrayList3, min));
                    }
                    C26676b.m136957g("SMLZCloudManagementViewModel", "loadMoreItems(): Loaded " + m111793b1.size() + " item(s)", null, 4, null);
                    C21680s.this.m136599l0(m111793b1);
                    C21680s.this.f105217Q.put(C21680s.this.m136584V(), AbstractC29094b.m145341c(min));
                    AbstractC19444a.m101694b(new Runnable() { // from class: kc0.t
                        public /* synthetic */ RunnableC21681t() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C21680s.c.m111809t(C21680s.this);
                        }
                    }, 300L);
                    return C24848g0.f119245a;
                }
                C21680s.this.f105221U.compareAndSet(true, false);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: s */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: kc0.s$d */
    /* loaded from: classes6.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C25821b) obj2).m133145h().m133166c()), Long.valueOf(((C25821b) obj).m133145h().m133166c()));
            return m135478b;
        }
    }

    /* renamed from: kc0.s$e */
    /* loaded from: classes6.dex */
    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C25821b) obj).m133150m()), Long.valueOf(((C25821b) obj2).m133150m()));
            return m135478b;
        }
    }

    /* renamed from: kc0.s$f */
    /* loaded from: classes6.dex */
    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C25821b) obj2).m133150m()), Long.valueOf(((C25821b) obj).m133150m()));
            return m135478b;
        }
    }

    /* renamed from: kc0.s$g */
    /* loaded from: classes6.dex */
    public static final class g implements Comparator {

        /* renamed from: p */
        final /* synthetic */ Comparator f105230p;

        public g(Comparator comparator) {
            this.f105230p = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            int compare = this.f105230p.compare(obj, obj2);
            if (compare == 0) {
                m135478b = AbstractC26327c.m135478b(Long.valueOf(((C25821b) obj2).m133150m()), Long.valueOf(((C25821b) obj).m133150m()));
                return m135478b;
            }
            return compare;
        }
    }

    /* renamed from: kc0.s$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f105231q;

        /* renamed from: r */
        final /* synthetic */ C21680s f105232r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, C21680s c21680s) {
            super(1);
            this.f105231q = str;
            this.f105232r = c21680s;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C25821b c25821b) {
            AbstractC19074t.m100208f(c25821b, "it");
            boolean m100204b = AbstractC19074t.m100204b(c25821b.m133141d(), this.f105231q);
            if (m100204b && (!this.f105232r.f105218R.isEmpty())) {
                try {
                    this.f105232r.f105218R.remove(Integer.valueOf(this.f105232r.f105219S.indexOf(c25821b)));
                } catch (Exception e11) {
                    C26676b.m136957g("SMLZCloudManagementViewModel", "remainIndexList = " + this.f105232r.f105218R, null, 4, null);
                    C26676b.m136957g("SMLZCloudManagementViewModel", "cloudId = " + this.f105231q, null, 4, null);
                    C26676b.m136957g("SMLZCloudManagementViewModel", "listCloudMediaItem = " + this.f105232r.f105219S, null, 4, null);
                    AbstractC23350e.m122776f("SMLZCloudManagementViewModel", e11);
                }
            }
            return Boolean.valueOf(m100204b);
        }
    }

    /* renamed from: kc0.s$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25821b f105233q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(C25821b c25821b) {
            super(1);
            this.f105233q = c25821b;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            C25821b m75082d = c13380a.m75082d();
            if (m75082d != null) {
                str = m75082d.m133141d();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f105233q.m133141d()));
        }
    }

    /* renamed from: kc0.s$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C25821b f105234q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(C25821b c25821b) {
            super(1);
            this.f105234q = c25821b;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(C13380a c13380a) {
            String str;
            AbstractC19074t.m100208f(c13380a, "it");
            C25821b m75082d = c13380a.m75082d();
            if (m75082d != null) {
                str = m75082d.m133141d();
            } else {
                str = null;
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f105234q.m133141d()));
        }
    }

    public C21680s(C19610a c19610a, C29588d c29588d, C0876j c0876j, C23870a c23870a) {
        AbstractC19074t.m100208f(c19610a, "deleteMsgManager");
        AbstractC19074t.m100208f(c29588d, "deleteLocalMessages");
        AbstractC19074t.m100208f(c0876j, "msgRepo");
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        this.f105209I = c19610a;
        this.f105210J = c29588d;
        this.f105211K = c0876j;
        this.f105212L = c23870a;
        C1761c0 c1761c0 = new C1761c0();
        this.f105214N = c1761c0;
        this.f105215O = c1761c0;
        this.f105216P = new ConcurrentHashMap();
        this.f105217Q = new HashMap();
        this.f105218R = new ArrayList();
        this.f105219S = new ArrayList();
        this.f105220T = 50;
        this.f105221U = new AtomicBoolean(false);
    }

    /* renamed from: Q0 */
    public final void m111784Q0(C25821b c25821b, ThreadStorageInfo threadStorageInfo) {
        if (!AbstractC19646n0.m103031t1(c25821b.m133147j()) && !AbstractC19646n0.m102995k1(c25821b.m133147j())) {
            if (AbstractC19646n0.m102886D1(c25821b.m133147j())) {
                threadStorageInfo.m74814q0(threadStorageInfo.m74781T() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74812p0(threadStorageInfo.m74780S() + 1);
                return;
            } else if (AbstractC19646n0.m103003m1(c25821b.m133147j())) {
                threadStorageInfo.m74787Z(threadStorageInfo.m74816t() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74786Y(threadStorageInfo.m74813q() + 1);
                return;
            } else if (AbstractC19646n0.m102889E1(c25821b.m133147j())) {
                threadStorageInfo.m74817t0(threadStorageInfo.m74783V() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74815r0(threadStorageInfo.m74782U() + 1);
                return;
            } else {
                threadStorageInfo.m74794g0(threadStorageInfo.m74821y() + c25821b.m133145h().m133166c());
                threadStorageInfo.m74791e0(threadStorageInfo.m74820x() + 1);
                return;
            }
        }
        threadStorageInfo.m74798i0(threadStorageInfo.m74768C() + c25821b.m133145h().m133166c());
        threadStorageInfo.m74796h0(threadStorageInfo.m74767B() + 1);
    }

    /* renamed from: R0 */
    private final void m111785R0(List list) {
        List m131506n;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            if (mo95039W2.length() > 0) {
                if (!hashMap.containsKey(mo95039W2)) {
                    m131506n = AbstractC25368s.m131506n(c17945a0);
                    hashMap.put(mo95039W2, m131506n);
                } else {
                    Object obj = hashMap.get(mo95039W2);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.zing.zalo.data.chat.model.message.ChatContent>");
                    AbstractC19069o0.m100186c(obj).add(c17945a0);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: kc0.r

                /* renamed from: p */
                public final /* synthetic */ List f105206p;

                /* renamed from: q */
                public final /* synthetic */ C21680s f105207q;

                /* renamed from: r */
                public final /* synthetic */ String f105208r;

                public /* synthetic */ RunnableC21679r(List list2, C21680s this, String str2) {
                    r1 = list2;
                    r2 = this;
                    r3 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21680s.m111786S0(r1, r2, r3);
                }
            }, 2, null);
        }
    }

    /* renamed from: S0 */
    public static final void m111786S0(List list, C21680s c21680s, String str) {
        List<List> m131195U;
        AbstractC19074t.m100208f(list, "$selectedChatContents");
        AbstractC19074t.m100208f(c21680s, "this$0");
        AbstractC19074t.m100208f(str, "$uid");
        m131195U = AbstractC25332a0.m131195U(list, 50);
        for (List list2 : m131195U) {
            c21680s.f105210J.m101508a(new C29588d.c(str, list2, null, 4, null));
            c21680s.f105209I.m102641o(list2);
        }
    }

    /* renamed from: T0 */
    public final ArrayList m111787T0(List list, ArrayList arrayList) {
        if (!arrayList.isEmpty() && !list.isEmpty()) {
            Integer num = (Integer) this.f105217Q.get("All");
            int i11 = 0;
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue();
            ArrayList arrayList2 = new ArrayList();
            try {
                int i12 = 0;
                for (Object obj : list) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    Object obj2 = arrayList.get(i12);
                    AbstractC19074t.m100207e(obj2, "get(...)");
                    if (((Number) obj2).intValue() < intValue || this.f105218R.contains(arrayList.get(i12))) {
                        arrayList2.add(Integer.valueOf(i12));
                    }
                    i12 = i13;
                }
                if (arrayList2.size() == arrayList.size()) {
                    return new ArrayList();
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        int i14 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC25368s.m131509q();
                        }
                        ((Number) obj3).intValue();
                        if (!arrayList2.contains(Integer.valueOf(i11))) {
                            arrayList3.add(obj3);
                        }
                        i11 = i14;
                    }
                    return new ArrayList(arrayList3);
                }
                return arrayList;
            } catch (Exception e11) {
                C26676b.m136953c(e11);
                return new ArrayList();
            }
        }
        return new ArrayList();
    }

    /* renamed from: U0 */
    public final ArrayList m111788U0(ArrayList arrayList, int i11) {
        ArrayList arrayList2 = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        for (Object obj : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC25368s.m131509q();
            }
            Object obj2 = this.f105218R.get(i13);
            AbstractC19074t.m100207e(obj2, "get(...)");
            if (((Number) obj2).intValue() < i11) {
                arrayList2.add(Integer.valueOf(i13));
            }
            i13 = i14;
        }
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f105218R;
            ArrayList arrayList4 = new ArrayList();
            int i15 = 0;
            for (Object obj3 : arrayList3) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC25368s.m131509q();
                }
                ((Number) obj3).intValue();
                if (!arrayList2.contains(Integer.valueOf(i15))) {
                    arrayList4.add(obj3);
                }
                i15 = i16;
            }
            this.f105218R = new ArrayList(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : arrayList) {
                int i17 = i12 + 1;
                if (i12 < 0) {
                    AbstractC25368s.m131509q();
                }
                if (!arrayList2.contains(Integer.valueOf(i12))) {
                    arrayList5.add(obj4);
                }
                i12 = i17;
            }
            return new ArrayList(arrayList5);
        }
        return arrayList;
    }

    /* renamed from: W0 */
    private final void m111789W0(List list) {
        ArrayList<C25821b> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25821b m75082d = ((C13380a) it.next()).m75082d();
            if (m75082d != null) {
                arrayList.add(m75082d);
            }
        }
        for (C25821b c25821b : arrayList) {
            if (c25821b.m133154q()) {
                C24302e.Companion.m126919j().m126901g(c25821b.m133146i().m41048l(), c25821b.m133146i().m41050n(), c25821b.m133146i(), c25821b.m133141d());
            }
        }
    }

    /* renamed from: Y0 */
    public static final void m111790Y0(List list, C21680s c21680s, String str) {
        List<List> m131195U;
        AbstractC19074t.m100208f(list, "$selectedChatContents");
        AbstractC19074t.m100208f(c21680s, "this$0");
        AbstractC19074t.m100208f(str, "$uid");
        m131195U = AbstractC25332a0.m131195U(list, 50);
        for (List list2 : m131195U) {
            c21680s.f105210J.m101508a(new C29588d.c(str, list2, null, 4, null));
            c21680s.f105209I.m102641o(list2);
        }
    }

    /* renamed from: Z0 */
    public final List m111791Z0(ArrayList arrayList) {
        if (AbstractC19074t.m100204b(m136584V(), "All")) {
            return this.f105219S;
        }
        List list = this.f105219S;
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            C25821b c25821b = (C25821b) obj;
            if ((AbstractC19074t.m100204b(m136584V(), "File") && AbstractC16893a.m90328e(c25821b)) || ((AbstractC19074t.m100204b(m136584V(), "Voice message") && AbstractC16893a.m90332i(c25821b)) || ((AbstractC19074t.m100204b(m136584V(), "Photos") && (AbstractC16893a.m90330g(c25821b) || AbstractC16893a.m90327d(c25821b))) || (AbstractC19074t.m100204b(m136584V(), "Videos") && AbstractC16893a.m90331h(c25821b))))) {
                arrayList.add(Integer.valueOf(i11));
                arrayList2.add(obj);
            }
            i11 = i12;
        }
        return arrayList2;
    }

    /* renamed from: a1 */
    public final List m111792a1(List list, ArrayList arrayList, int i11, int i12) {
        List m131187O0;
        Iterator it;
        C17945a0 c17945a0;
        List subList = list.subList(i11, i12);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = subList.iterator();
        while (it2.hasNext()) {
            C25821b c25821b = (C25821b) it2.next();
            AbstractC16893a.m90326c(c25821b);
            String m133141d = c25821b.m133141d();
            C13380a c13380a = (C13380a) this.f105216P.get(m133141d);
            if (c13380a == null) {
                if (AbstractC25495a.m132078c(c25821b.m133146i().m41048l())) {
                    C17945a0 m2635r = this.f105211K.m2635r(c25821b.m133146i());
                    if (m2635r != null) {
                        C13380a c13380a2 = new C13380a(0, null, false, false, m2635r, c25821b, 0L, 79, null);
                        this.f105216P.put(m133141d, c13380a2);
                        it = it2;
                        c13380a = c13380a2;
                    } else {
                        arrayList.remove(Integer.valueOf(this.f105219S.indexOf(c25821b)));
                        C26676b.m136955e("SMLZCloudManagementViewModel", "getItemsForLoadMore(): Msg not found in ZDB (" + c25821b + ")", C26676b.b.f126335t);
                        it = it2;
                        c13380a = null;
                    }
                } else {
                    if (AbstractC16893a.m90326c(c25821b) == null) {
                        c17945a0 = this.f105211K.m2635r(c25821b.m133146i());
                    } else {
                        c17945a0 = null;
                    }
                    it = it2;
                    C13380a c13380a3 = new C13380a(0, null, false, false, c17945a0, c25821b, 0L, 79, null);
                    this.f105216P.put(m133141d, c13380a3);
                    c13380a = c13380a3;
                }
            } else {
                it = it2;
            }
            if (c13380a != null) {
                arrayList2.add(c13380a);
            }
            it2 = it;
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList2);
        return m131187O0;
    }

    /* renamed from: b1 */
    public final ArrayList m111793b1(boolean z11, ArrayList arrayList) {
        if (z11) {
            return new ArrayList();
        }
        List list = (List) m136594g0().mo9215f();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            if (AbstractC19074t.m100204b(m136584V(), "All") && (!list.isEmpty())) {
                Integer num = (Integer) this.f105217Q.get("All");
                int size = list.size() - this.f105218R.size();
                C26676b.m136957g("SMLZCloudManagementViewModel", "getLoadedList(): loadedListSize = " + list.size() + ", remainIndexListSize = " + this.f105218R.size(), null, 4, null);
                if (num != null && size > 0) {
                    arrayList2.addAll(list.subList(0, size));
                }
                if (!this.f105218R.isEmpty()) {
                    if (num != null) {
                        list = AbstractC25332a0.m131180H0(list, this.f105218R.size());
                    }
                    arrayList.addAll(list);
                }
            } else {
                arrayList2.addAll(list);
            }
            return arrayList2;
        }
        return new ArrayList();
    }

    /* renamed from: f1 */
    public static /* synthetic */ void m111794f1(C21680s c21680s, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c21680s.m111803e1(z11);
    }

    /* renamed from: g1 */
    private final boolean m111795g1(String str) {
        boolean m131542D;
        this.f105216P.remove(str);
        m131542D = AbstractC25378x.m131542D(this.f105219S, new h(str, this));
        return m131542D;
    }

    /* renamed from: h1 */
    private final synchronized ArrayList m111796h1(List list) {
        ArrayList arrayList;
        String str;
        Object obj;
        C25821b m75082d;
        try {
            arrayList = new ArrayList(m136587Y());
            Iterator it = arrayList.iterator();
            while (true) {
                str = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (((C13380a) obj).m75072B()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C13380a c13380a = (C13380a) obj;
            if (c13380a != null && (m75082d = c13380a.m75082d()) != null) {
                str = m75082d.m133141d();
            }
            ThreadStorageInfo threadStorageInfo = (ThreadStorageInfo) this.f105215O.mo9215f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C13380a c13380a2 = (C13380a) it2.next();
                C25821b m75082d2 = c13380a2.m75082d();
                if (m75082d2 != null) {
                    String m133141d = m75082d2.m133141d();
                    if (AbstractC19074t.m100204b(str, m133141d)) {
                        C7853b.Companion.m40150a().m40136j1();
                    }
                    AbstractC25378x.m131542D(arrayList, new i(m75082d2));
                    AbstractC25378x.m131541C(m136590b0(), new j(m75082d2));
                    AbstractC23041d2.m118208g(m75082d2.m133143f());
                    AbstractC23041d2.m118208g(m75082d2.m133149l());
                    m111795g1(m133141d);
                }
                if (threadStorageInfo != null) {
                    if (!c13380a2.m75071A() && !c13380a2.m75097s()) {
                        if (c13380a2.m75075E()) {
                            threadStorageInfo.m74814q0(threadStorageInfo.m74781T() - c13380a2.m75087i());
                        } else if (c13380a2.m75100v()) {
                            threadStorageInfo.m74787Z(threadStorageInfo.m74816t() - c13380a2.m75087i());
                        } else if (c13380a2.m75076F()) {
                            threadStorageInfo.m74817t0(threadStorageInfo.m74783V() - c13380a2.m75087i());
                        } else {
                            threadStorageInfo.m74794g0(threadStorageInfo.m74821y() - c13380a2.m75087i());
                        }
                    }
                    threadStorageInfo.m74798i0(threadStorageInfo.m74768C() - c13380a2.m75087i());
                }
            }
            C1761c0 c1761c0 = this.f105214N;
            if (threadStorageInfo == null) {
                threadStorageInfo = new ThreadStorageInfo(null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 262143, null);
            }
            c1761c0.mo9221n(threadStorageInfo);
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: R */
    public List mo111798R(List list) {
        String str;
        AbstractC19074t.m100208f(list, "selectedStorageUsageItems");
        if (list.isEmpty()) {
            return m136587Y();
        }
        m111789W0(list);
        List m144302a = AbstractC28862a.m144302a(list);
        ThreadStorageInfo threadStorageInfo = this.f105213M;
        if (threadStorageInfo == null || (str = threadStorageInfo.m74822z()) == null) {
            str = "";
        }
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            AbstractC18428c.m97659b(C23288a.f113033a, str2, 0, new Runnable() { // from class: kc0.q

                /* renamed from: p */
                public final /* synthetic */ List f105203p;

                /* renamed from: q */
                public final /* synthetic */ C21680s f105204q;

                /* renamed from: r */
                public final /* synthetic */ String f105205r;

                public /* synthetic */ RunnableC21678q(List m144302a2, C21680s this, String str22) {
                    r1 = m144302a2;
                    r2 = this;
                    r3 = str22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C21680s.m111790Y0(r1, r2, r3);
                }
            }, 2, null);
        } else {
            m111785R0(m144302a2);
        }
        return m111796h1(list);
    }

    /* renamed from: V0 */
    public final void m111799V0(ThreadStorageInfo threadStorageInfo, ArrayList arrayList) {
        AbstractC19074t.m100208f(threadStorageInfo, "threadStorageInfo");
        AbstractC19074t.m100208f(arrayList, "threadIdList");
        C26676b.m136957g("SMLZCloudManagementViewModel", "calculateConversationDataSize(): START", null, 4, null);
        m136605u0(true);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new b(threadStorageInfo, this, arrayList, null), 2, null);
    }

    /* renamed from: X0 */
    public final void m111800X0() {
        if (m136587Y().size() < 50) {
            m111794f1(this, false, 1, null);
        }
    }

    /* renamed from: c1 */
    public final int m111801c1() {
        return this.f105218R.size();
    }

    /* renamed from: d1 */
    public final LiveData m111802d1() {
        return this.f105215O;
    }

    /* renamed from: e1 */
    public final void m111803e1(boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new c(z11, null), 2, null);
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: o0 */
    public void mo111804o0(String str) {
        AbstractC19074t.m100208f(str, "tabType");
        super.mo111804o0(str);
        if (this.f105217Q.get(str) == null) {
            m111803e1(false);
        }
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: q0 */
    public void mo111805q0(String str) {
        List m131177E0;
        AbstractC19074t.m100208f(str, "filterType");
        super.mo111805q0(str);
        if (!AbstractC19074t.m100204b(str, m136586X()) && !this.f105221U.get()) {
            int hashCode = str.hashCode();
            if (hashCode != -1964972026) {
                if (hashCode != -1930444257) {
                    if (hashCode == 1616281276 && str.equals("Largest")) {
                        m131177E0 = AbstractC25332a0.m131177E0(this.f105219S, new g(new d()));
                    }
                    m131177E0 = AbstractC25368s.m131502j();
                } else {
                    if (str.equals("Oldest")) {
                        m131177E0 = AbstractC25332a0.m131177E0(this.f105219S, new e());
                    }
                    m131177E0 = AbstractC25368s.m131502j();
                }
            } else {
                if (str.equals("Newest")) {
                    m131177E0 = AbstractC25332a0.m131177E0(this.f105219S, new f());
                }
                m131177E0 = AbstractC25368s.m131502j();
            }
            this.f105219S.clear();
            this.f105219S.addAll(m131177E0);
            this.f105217Q.clear();
            this.f105218R.clear();
            m111803e1(true);
        }
    }

    @Override // ta0.AbstractC26611a
    /* renamed from: w0 */
    public List mo111806w0(List list) {
        AbstractC19074t.m100208f(list, "selectedStorageUsageItems");
        m111789W0(list);
        return m111796h1(list);
    }
}
