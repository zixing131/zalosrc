package ws;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import d60.C17794c;
import d60.C17798g;
import dg0.AbstractC17930e;
import dg0.InterfaceC17929d;
import dj.C17945a0;
import eg0.C18426a;
import eg0.C18427b;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19636i1;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import i60.C20343i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kw.C21956b;
import ln0.AbstractC22543l;
import me0.AbstractC23138m0;
import me0.AbstractC23160o0;
import mg.C23288a;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p056cj.C3535c;
import p279jw.C21373a;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p461qu.AbstractC25495a;
import p528ts.C26893h;
import p585vs.C28609a;
import p585vs.C28610b;
import p585vs.C28611c;
import p645xh.C29628e;
import p716zh.C31909f1;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import th.AbstractC26681b;
import th.C26688i;
import vg.C28203u6;
import ws.C29210k;
import ws.C29213n;
import ws.C29224y;

/* renamed from: ws.k */
/* loaded from: classes4.dex */
public final class C29210k {
    public static final b Companion = new b(null);

    /* renamed from: u */
    private static final InterfaceC24854k f135289u;

    /* renamed from: a */
    private int f135290a;

    /* renamed from: b */
    private final Map f135291b;

    /* renamed from: c */
    private volatile boolean f135292c;

    /* renamed from: d */
    private e f135293d;

    /* renamed from: e */
    private final C29224y.b f135294e;

    /* renamed from: f */
    private boolean f135295f;

    /* renamed from: g */
    private int f135296g;

    /* renamed from: h */
    private final AtomicBoolean f135297h;

    /* renamed from: i */
    private final Map f135298i;

    /* renamed from: j */
    private final Map f135299j;

    /* renamed from: k */
    private final Map f135300k;

    /* renamed from: l */
    private final List f135301l;

    /* renamed from: m */
    private boolean f135302m;

    /* renamed from: n */
    private final Map f135303n;

    /* renamed from: o */
    private Map f135304o;

    /* renamed from: p */
    private long f135305p;

    /* renamed from: q */
    private C26893h f135306q;

    /* renamed from: r */
    private AtomicBoolean f135307r;

    /* renamed from: s */
    private final Set f135308s;

    /* renamed from: t */
    private final Map f135309t;

    /* renamed from: ws.k$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f135310q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29210k mo12V4() {
            return c.f135311a.m145897a();
        }
    }

    /* renamed from: ws.k$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29210k m145896a() {
            return (C29210k) C29210k.f135289u.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ws.k$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f135311a = new c();

        /* renamed from: b */
        private static final C29210k f135312b = new C29210k(null);

        private c() {
        }

        /* renamed from: a */
        public final C29210k m145897a() {
            return f135312b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ws.k$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        private long f135313a;

        /* renamed from: b */
        private long f135314b;

        /* renamed from: c */
        private long f135315c;

        /* renamed from: a */
        public final long m145898a() {
            return this.f135313a;
        }

        /* renamed from: b */
        public final long m145899b() {
            return this.f135315c;
        }

        /* renamed from: c */
        public final long m145900c() {
            return this.f135314b;
        }

        /* renamed from: d */
        public final boolean m145901d() {
            long j11 = this.f135313a;
            if (j11 <= 0) {
                return false;
            }
            long j12 = this.f135314b;
            return j12 <= 0 || j11 <= j12;
        }

        /* renamed from: e */
        public final void m145902e(long j11) {
            this.f135313a = j11;
        }

        /* renamed from: f */
        public final void m145903f(long j11) {
            this.f135315c = j11;
        }

        /* renamed from: g */
        public final void m145904g(long j11) {
            this.f135314b = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ws.k$e */
    /* loaded from: classes4.dex */
    public static final class e extends HandlerThread {

        /* renamed from: p */
        private final CountDownLatch f135316p;

        /* renamed from: q */
        private Handler f135317q;

        public e() {
            super("Z:PullMsgThread");
            this.f135316p = new CountDownLatch(1);
        }

        /* renamed from: a */
        public final Handler m145905a() {
            try {
                this.f135316p.await();
            } catch (InterruptedException e11) {
                AbstractC23350e.m122778h(e11);
            }
            return this.f135317q;
        }

        @Override // android.os.HandlerThread
        protected void onLooperPrepared() {
            super.onLooperPrepared();
            Looper looper = getLooper();
            if (looper != null) {
                this.f135317q = new Handler(looper);
            }
            this.f135316p.countDown();
        }
    }

    /* renamed from: ws.k$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ InterfaceC0765j f135319b;

        f(InterfaceC0765j interfaceC0765j) {
            this.f135319b = interfaceC0765j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m145907d(C29210k c29210k, InterfaceC0765j interfaceC0765j) {
            AbstractC19074t.m100208f(c29210k, "this$0");
            AbstractC19074t.m100208f(interfaceC0765j, "$business");
            if (AbstractC26681b.f126373r) {
                ToastUtils.m89268p("Retry pull list thread chat offline " + c29210k.f135296g);
            }
            C29199a.m145772b("pullListThreadChatOffline(1991), retry: " + c29210k.f135296g);
            interfaceC0765j.mo1622d9();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                C29210k.this.f135296g++;
                if (c20096c.m104491c() != -69 && C29210k.this.f135296g <= 3) {
                    InterfaceC17929d m94551d = AbstractC17930e.Companion.m94551d();
                    final C29210k c29210k = C29210k.this;
                    final InterfaceC0765j interfaceC0765j = this.f135319b;
                    m94551d.mo94531e(new Runnable() { // from class: ws.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            C29210k.f.m145907d(C29210k.this, interfaceC0765j);
                        }
                    }, AbstractC23160o0.m119261j0(C29210k.this.f135296g, 1000L));
                } else {
                    C29200a0.Companion.m145783d();
                    C29210k.this.f135296g = 0;
                    C29210k.this.f135295f = false;
                }
                C29210k.this.m145887u0(new ArrayList(), System.currentTimeMillis());
                C29199a.m145772b("pullListThreadChatOffline(1991) END, errorMessage=" + c20096c);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "response");
            try {
                C29210k.this.m145837I0((JSONObject) obj, "SOURCE_PULL");
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C29200a0.Companion.m145783d();
            C29210k.this.f135296g = 0;
            C29210k.this.f135295f = false;
        }
    }

    /* renamed from: ws.k$g */
    /* loaded from: classes4.dex */
    public static final class g implements C29224y.b {
        g() {
        }

        @Override // ws.C29224y.b
        /* renamed from: a */
        public void mo145908a() {
            C29210k.this.f135292c = false;
            C29210k.this.m145796S();
        }
    }

    /* renamed from: ws.k$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C28611c f135321a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f135322b;

        h(C28611c c28611c, ArrayList arrayList) {
            this.f135321a = c28611c;
            this.f135322b = arrayList;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.a aVar = C7959d.Companion;
            C7959d m41850e = aVar.m41850e();
            C28611c c28611c = this.f135321a;
            m41850e.m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
            aVar.m41850e().m41735P1(this.f135322b);
        }
    }

    /* renamed from: ws.k$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C28611c f135323a;

        i(C28611c c28611c) {
            this.f135323a = c28611c;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d m41850e = C7959d.Companion.m41850e();
            C28611c c28611c = this.f135323a;
            m41850e.m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
        }
    }

    /* renamed from: ws.k$j */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C28611c f135324a;

        j(C28611c c28611c) {
            this.f135324a = c28611c;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d m41850e = C7959d.Companion.m41850e();
            C28611c c28611c = this.f135324a;
            m41850e.m41692C3(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
        }
    }

    /* renamed from: ws.k$k */
    /* loaded from: classes4.dex */
    public static final class k extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f135325a;

        /* renamed from: b */
        final /* synthetic */ MessageId f135326b;

        k(String str, MessageId messageId) {
            this.f135325a = str;
            this.f135326b = messageId;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.a aVar = C7959d.Companion;
            C28609a m41784f1 = aVar.m41850e().m41784f1(this.f135325a);
            if (!m41784f1.f132639f) {
                long j11 = m41784f1.f132635b;
                if (j11 != 0 || m41784f1.f132636c != 0) {
                    long m41047k = this.f135326b.m41047k();
                    long j12 = m41784f1.f132636c;
                    long m41045i = this.f135326b.m41045i();
                    if (j11 > 0) {
                        if (m41047k > j11) {
                            aVar.m41850e().m41815o3(this.f135325a, this.f135326b);
                            return;
                        }
                        return;
                    } else {
                        if (m41045i > j12) {
                            aVar.m41850e().m41815o3(this.f135325a, this.f135326b);
                            return;
                        }
                        return;
                    }
                }
            }
            aVar.m41850e().m41723L1(this.f135325a, this.f135326b);
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f135310q);
        f135289u = m129210a;
    }

    public /* synthetic */ C29210k(AbstractC19060k abstractC19060k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final void m145784A(C29210k c29210k) {
        AbstractC19074t.m100208f(c29210k, "this$0");
        c29210k.f135297h.compareAndSet(true, false);
        if (!AbstractC23138m0.Companion.m118777d()) {
            return;
        }
        if (c29210k.m145857Z() && !c29210k.m145871j0()) {
            if (c29210k.m145878p0()) {
                c29210k.m145849T();
                C23744a.Companion.m124119a().m124116d(5207, 3);
                C21956b.m114657g("PullMsgOfflineManager", "Post event [NOTIFY_STATE_SYNC_MSG_DATA_MY_CLOUD]: state=0");
                return;
            } else if (c29210k.m145893y()) {
                c29210k.m145853V0(false, false);
                return;
            } else {
                C29199a.m145771a("[MyCloud] checkStartAutoSyncMsgMyCloud -> Auto-sync doesn't run");
                return;
            }
        }
        C29199a.m145771a("[MyCloud] checkStartAutoSyncMsgMyCloud -> Disabled in runnable");
    }

    /* renamed from: B */
    private final void m145785B(String str) {
        C29199a.m145771a("checkStartPullCloudMessageTasks START tag:" + str + ", checkEnablePullMsgOfflineWithoutChatType: " + m145890w());
        if (m145890w() && !m145871j0()) {
            m145840K0();
        }
        m145822z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m145786E0(C29210k c29210k) {
        AbstractC19074t.m100208f(c29210k, "this$0");
        c29210k.f135308s.remove("PENDING_AUTO_SYNC_MSG_REASON_SOCKET_LOCKED");
        c29210k.m145785B("onSocketConnectionUnlocked");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static final void m145787H(C28611c c28611c, boolean z11) {
        AbstractC19074t.m100208f(c28611c, "$job");
        C7959d.Companion.m41850e().m41785g0(c28611c.f132658a, c28611c.f132659b, z11);
    }

    /* renamed from: J0 */
    private final void m145788J0() {
        synchronized (this) {
            try {
                if (this.f135293d == null) {
                    e eVar = new e();
                    this.f135293d = eVar;
                    eVar.start();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m145789L(C29210k c29210k) {
        AbstractC19074t.m100208f(c29210k, "this$0");
        if (AbstractC23138m0.Companion.m118777d() && c29210k.m145857Z() && !c29210k.m145871j0()) {
            c29210k.m145853V0(false, true);
        }
    }

    /* renamed from: L0 */
    private final void m145790L0(ArrayList arrayList) {
        try {
            ArrayList arrayList2 = new ArrayList();
            if (!arrayList.isEmpty()) {
                List<C28609a> m41789h1 = C7959d.Companion.m41850e().m41789h1(arrayList);
                Map map = this.f135291b;
                AbstractC19074t.m100207e(map, "jobsMap");
                synchronized (map) {
                    try {
                        for (C28609a c28609a : m41789h1) {
                            C28611c c28611c = new C28611c(c28609a.f132634a, 0L, c28609a.f132635b, c28609a.f132636c);
                            c28611c.m143075g(MessageId.Companion.m41065d(c28609a.f132638e, c28609a.f132637d, c28609a.f132634a, ""));
                            if (!this.f135291b.containsKey(c28611c.f132658a)) {
                                Map map2 = this.f135291b;
                                AbstractC19074t.m100207e(map2, "jobsMap");
                                map2.put(c28611c.f132658a, c28611c);
                                arrayList2.add(c28611c);
                                C29199a.m145771a("queuePullOfflineJobs PullMsgOfflineJob= " + c28611c.m143076h());
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
                C7959d.Companion.m41850e().m41735P1(arrayList2);
                m145796S();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m145791N(C29210k c29210k, C17945a0 c17945a0) {
        C31973j5 m4472f;
        int m116584g;
        AbstractC19074t.m100208f(c29210k, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        try {
            try {
                synchronized (c29210k) {
                    try {
                        if (!c29210k.f135304o.containsKey(c17945a0.mo95039W2()) && c29210k.f135307r.get() && (m4472f = C0943w.m4462l().m4472f(c17945a0.mo95039W2())) != null && m4472f.m153732O() >= C26688i.f126427a.m137070d().m137121d()) {
                            C7959d.a aVar = C7959d.Companion;
                            C7959d m41850e = aVar.m41850e();
                            String mo95039W2 = c17945a0.mo95039W2();
                            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                            C28609a m41784f1 = m41850e.m41784f1(mo95039W2);
                            if (m41784f1.f132635b <= 0) {
                                if (m41784f1.f132636c > 0) {
                                }
                            }
                            String m153793y = m4472f.m153793y();
                            String m95019U3 = c17945a0.m95019U3();
                            AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
                            m116584g = AbstractC22543l.m116584g(c17945a0.m95019U3().length(), 10);
                            String substring = m95019U3.substring(0, m116584g);
                            AbstractC19074t.m100207e(substring, "substring(...)");
                            C29199a.m145771a("createGapPullMsgOfflineWhenReceivedMsgOnline groupName=" + m153793y + " msg: " + substring);
                            String mo95039W22 = c17945a0.mo95039W2();
                            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                            C28611c c28611c = new C28611c(mo95039W22, c17945a0.m95029V3().m41047k(), c17945a0.m95029V3().m41045i(), m41784f1.f132635b, m41784f1.f132636c, C28611c.f132656l);
                            if (c28611c.m143074f()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(c28611c);
                                aVar.m41850e().m41735P1(arrayList);
                                Map map = c29210k.f135304o;
                                AbstractC19074t.m100207e(map, "createGapWhenReceivedMsgOnlineMap");
                                map.put(c17945a0.mo95039W2(), c17945a0.mo95039W2());
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PullMsgOfflineManager", e11);
            }
        } finally {
            c29210k.m145862b1(c17945a0);
        }
    }

    /* renamed from: O */
    private final void m145792O() {
        C23288a.f113033a.mo13474a(new C18426a(new Runnable() { // from class: ws.h
            @Override // java.lang.Runnable
            public final void run() {
                C29210k.m145793P();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m145793P() {
        try {
            AbstractC23306f.m120584H0().m2631n();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Q */
    private final void m145794Q(final String str) {
        C23288a.f113033a.mo13474a(new C18427b(str, 0, new Runnable() { // from class: ws.g
            @Override // java.lang.Runnable
            public final void run() {
                C29210k.m145795R(str);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m145795R(String str) {
        AbstractC19074t.m100208f(str, "$chatId");
        try {
            AbstractC23306f.m120584H0().m2630m(str);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public final void m145796S() {
        if (this.f135292c) {
            C29199a.m145771a("PullMsgManager doNextTask pending");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Map map = this.f135291b;
        AbstractC19074t.m100207e(map, "jobsMap");
        synchronized (map) {
            if (this.f135291b.isEmpty()) {
                m145797T0();
                return;
            }
            Iterator it = this.f135291b.keySet().iterator();
            while (true) {
                if (!it.hasNext() || arrayList2.size() >= this.f135290a) {
                    break;
                }
                String str = (String) it.next();
                if (AbstractC25495a.m132079d(str)) {
                    Object obj = this.f135291b.get(str);
                    AbstractC19074t.m100205c(obj);
                    arrayList2.add(obj);
                } else {
                    Object obj2 = this.f135291b.get(str);
                    AbstractC19074t.m100205c(obj2);
                    arrayList.add(obj2);
                    break;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            if (arrayList2.size() > 0) {
                m145788J0();
                this.f135292c = true;
                C29224y.b bVar = this.f135294e;
                e eVar = this.f135293d;
                AbstractC19074t.m100205c(eVar);
                Handler m145905a = eVar.m145905a();
                AbstractC19074t.m100205c(m145905a);
                new C29224y(bVar, arrayList2, m145905a, true).m145973n();
                return;
            }
            if (arrayList.size() > 0) {
                m145788J0();
                this.f135292c = true;
                C29224y.b bVar2 = this.f135294e;
                e eVar2 = this.f135293d;
                AbstractC19074t.m100205c(eVar2);
                Handler m145905a2 = eVar2.m145905a();
                AbstractC19074t.m100205c(m145905a2);
                new C29224y(bVar2, arrayList, m145905a2, false).m145973n();
            }
        }
    }

    /* renamed from: T0 */
    private final void m145797T0() {
        synchronized (this) {
            try {
                e eVar = this.f135293d;
                if (eVar != null) {
                    try {
                        Handler m145905a = eVar.m145905a();
                        if (m145905a != null) {
                            m145905a.removeCallbacksAndMessages(null);
                        }
                        eVar.quitSafely();
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                    this.f135293d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: W */
    private final C29213n m145798W() {
        int size = this.f135301l.size();
        C29213n c29213n = null;
        for (int i11 = 0; i11 < size; i11++) {
            C29213n c29213n2 = (C29213n) this.f135301l.get(i11);
            if (c29213n == null || c29213n2.m145935t().m143054o() > c29213n.m145935t().m143054o()) {
                c29213n = c29213n2;
            }
        }
        return c29213n;
    }

    /* renamed from: X */
    private final int m145799X(ArrayList arrayList, long j11, long j12) {
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                C28611c c28611c = (C28611c) obj;
                long j13 = c28611c.f132661d;
                if (j13 <= 0 || c28611c.f132659b <= j11 || j13 >= j11) {
                    if (j13 == 0 && c28611c.f132659b > j11 && c28611c.f132662e < j12) {
                        return i11;
                    }
                } else {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public static final void m145800Y0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "$listThreadId");
        C7959d.Companion.m41850e().m41762X2(arrayList);
    }

    /* renamed from: c0 */
    public static final C29210k m145804c0() {
        return Companion.m145896a();
    }

    /* renamed from: d1 */
    private final void m145806d1(String str, MessageId messageId) {
        C29200a0.Companion.m145781b(str, new k(str, messageId));
    }

    /* renamed from: f1 */
    private final void m145809f1(String str, MessageId messageId) {
        C28609a c28609a = (C28609a) this.f135303n.get(str);
        if (c28609a != null) {
            if (messageId.m41052p()) {
                c28609a.f132638e = messageId.m41045i();
            }
            if (messageId.m41053q()) {
                c28609a.f132637d = messageId.m41047k();
            }
        }
    }

    /* renamed from: h0 */
    private final ArrayList m145812h0(String str) {
        ArrayList arrayList = null;
        C24848g0 c24848g0 = null;
        if (this.f135300k.containsKey(str)) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) this.f135300k.get(str);
            if (arrayList3 != null) {
                c24848g0 = C24848g0.f119245a;
                arrayList2 = arrayList3;
            }
            if (c24848g0 == null) {
                Map map = this.f135300k;
                AbstractC19074t.m100207e(map, "listPullOfflineJobMap");
                map.put(str, new ArrayList());
            }
            return arrayList2;
        }
        List m41817p1 = C7959d.Companion.m41850e().m41817p1(str);
        if (m41817p1 instanceof ArrayList) {
            arrayList = (ArrayList) m41817p1;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Map map2 = this.f135300k;
        AbstractC19074t.m100207e(map2, "listPullOfflineJobMap");
        map2.put(str, arrayList);
        if (!arrayList.isEmpty()) {
            C29199a.m145771a("getListPullOfflineJobInternal Load jobs from database threadId= " + str + ", job size= " + arrayList.size());
            m145821x0();
        }
        return arrayList;
    }

    /* renamed from: t0 */
    private final boolean m145820t0(C29213n c29213n) {
        return !c29213n.m145935t().m143064y();
    }

    /* renamed from: x0 */
    private final void m145821x0() {
        HashMap hashMap;
        try {
            Map map = this.f135300k;
            AbstractC19074t.m100207e(map, "listPullOfflineJobMap");
            synchronized (map) {
                hashMap = new HashMap(this.f135300k);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                C29199a.m145771a("logListPullOfflineJobs(listPullOfflineJobMap) key= " + ((String) entry.getKey()) + ", job count= " + ((ArrayList) entry.getValue()).size());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    private final void m145822z() {
        if (!AbstractC23138m0.Companion.m118777d()) {
            return;
        }
        if (m145857Z()) {
            if (this.f135297h.compareAndSet(false, true)) {
                C29199a.m145771a("[MyCloud] checkStartAutoSyncMsgMyCloud -> schedule task");
                AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: ws.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29210k.m145784A(C29210k.this);
                    }
                }, 10000L);
                return;
            }
            return;
        }
        C29199a.m145771a("[MyCloud] checkStartAutoSyncMsgMyCloud -> DISABLED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m145823z0(C29210k c29210k) {
        C28611c c28611c;
        AbstractC19074t.m100208f(c29210k, "this$0");
        MessageId m41530V = C7956b.Companion.m41573b().m41530V("204278670");
        Iterator it = c29210k.m145867f0("204278670").iterator();
        while (true) {
            if (it.hasNext()) {
                c28611c = (C28611c) it.next();
                if (c28611c.f132661d == C28611c.f132655k) {
                    break;
                }
            } else {
                c28611c = null;
                break;
            }
        }
        if (c28611c != null) {
            if (m41530V != null && m41530V.m41053q()) {
                if (m41530V.m41047k() > c28611c.f132659b) {
                    c28611c.f132659b = m41530V.m41047k();
                    C7959d.Companion.m41850e().m41692C3(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
                    C29199a.m145771a("[MyCloud] onRestoreBackupMessageCompleted->updatePullMsgOffline: " + c28611c.f132659b + " " + c28611c.f132661d + " " + c28611c.f132662e);
                    return;
                }
                return;
            }
            C7959d.Companion.m41850e().m41839y0(c28611c.f132658a, c28611c.f132659b, c28611c.f132661d, c28611c.f132662e);
            C29199a.m145771a("[MyCloud] onRestoreBackupMessageCompleted->deletePullMsgOffline: " + c28611c.f132659b + " " + c28611c.f132661d + " " + c28611c.f132662e);
            AbstractC0924m0.m4057nl(true);
            C29199a.m145771a("[MyCloud] onRestoreBackupMessageCompleted->setNeedCreateGapToSyncMsgMyCloudOnTop(true)");
            return;
        }
        AbstractC0924m0.m4057nl(true);
        C29199a.m145771a("[MyCloud] onRestoreBackupMessageCompleted->setNeedCreateGapToSyncMsgMyCloudOnTop(true)");
    }

    /* renamed from: A0 */
    public final void m145824A0() {
        C29199a.m145771a("onRestoreBackupMessageStarted");
        this.f135308s.add("PENDING_AUTO_SYNC_MSG_REASON_RESTORE_MSG");
        C17945a0 m2603B = AbstractC23306f.m120584H0().m2603B("204278670");
        if (m2603B != null) {
            MessageId m95029V3 = m2603B.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            String str = m95029V3.m41044h() + "_" + m95029V3.m41046j();
            AbstractC0924m0.m3432Si(str);
            C29199a.m145771a("[MyCloud] onRestoreBackupMessageStarted -> setLastMsgIdMyCloudUsingCreateGapAfterLogin = " + str);
        }
        if (m145857Z()) {
            m145854W0();
        }
    }

    /* renamed from: B0 */
    public final void m145825B0() {
        this.f135304o.clear();
        this.f135307r.set(true);
        AbstractC19074t.m100207e(this.f135301l, "queuePullMsgTask");
        if ((!r0.isEmpty()) && !m145878p0()) {
            m145849T();
        }
        m145785B("onSocketConnected");
    }

    /* renamed from: C */
    public final void m145826C() {
        int size = this.f135301l.size();
        while (true) {
            size--;
            AbstractC19074t.m100207e(this.f135301l, "queuePullMsgTask");
            if ((!r1.isEmpty()) && size >= 0) {
                if (((C29213n) this.f135301l.get(size)).m145935t().m143062w()) {
                    this.f135301l.remove(size);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: C0 */
    public final void m145827C0() {
        C29199a.m145771a("onSocketConnectionLocked");
        this.f135308s.add("PENDING_AUTO_SYNC_MSG_REASON_SOCKET_LOCKED");
    }

    /* renamed from: D */
    public final void m145828D() {
        int size = this.f135301l.size();
        while (true) {
            size--;
            AbstractC19074t.m100207e(this.f135301l, "queuePullMsgTask");
            if ((!r1.isEmpty()) && size >= 0) {
                if (((C29213n) this.f135301l.get(size)).m145935t().m143039F()) {
                    this.f135301l.remove(size);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: D0 */
    public final void m145829D0() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ws.b
            @Override // java.lang.Runnable
            public final void run() {
                C29210k.m145786E0(C29210k.this);
            }
        });
    }

    /* renamed from: E */
    public final void m145830E() {
        int size = this.f135301l.size();
        while (true) {
            size--;
            AbstractC19074t.m100207e(this.f135301l, "queuePullMsgTask");
            if ((!r1.isEmpty()) && size >= 0) {
                if (((C29213n) this.f135301l.get(size)).m145935t().m143038E()) {
                    this.f135301l.remove(size);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: F */
    public final void m145831F() {
        this.f135291b.clear();
        m145797T0();
        this.f135298i.clear();
        this.f135299j.clear();
        this.f135300k.clear();
        this.f135301l.clear();
        this.f135303n.clear();
        m145854W0();
    }

    /* renamed from: F0 */
    public final void m145832F0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "threadId");
        synchronized (this) {
            C26893h c26893h = this.f135306q;
            if (c26893h != null) {
                c26893h.m138589C(str, z11);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: G */
    public final void m145833G(final C28611c c28611c, final boolean z11) {
        AbstractC19074t.m100208f(c28611c, "job");
        ArrayList m145867f0 = m145867f0(c28611c.f132658a);
        int size = m145867f0.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                if (((C28611c) m145867f0.get(size)).f132659b < c28611c.f132659b || (z11 && ((C28611c) m145867f0.get(size)).f132659b == c28611c.f132659b)) {
                    m145867f0.remove(size);
                }
                if (i11 < 0) {
                    break;
                } else {
                    size = i11;
                }
            }
        }
        m145848S0(c28611c.f132658a, m145867f0);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ws.i
            @Override // java.lang.Runnable
            public final void run() {
                C29210k.m145787H(C28611c.this, z11);
            }
        });
        C29199a.m145771a("clearJobOutDateOnMemAndDatabase isLoadForward=" + z11 + " " + c28611c);
    }

    /* renamed from: G0 */
    public final void m145834G0(String str, List list, List list2, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "listMsgLoaded");
        AbstractC19074t.m100208f(list2, "listMsg");
        synchronized (this) {
            C26893h c26893h = this.f135306q;
            if (c26893h != null) {
                c26893h.m138590F(str, list, list2, i11, z11);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: H0 */
    public final void m145835H0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        synchronized (this) {
            C26893h c26893h = this.f135306q;
            if (c26893h != null) {
                c26893h.m138594k(str);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: I */
    public final long m145836I(MessageId messageId, MessageId messageId2) {
        long m41045i;
        long m41045i2;
        AbstractC19074t.m100208f(messageId, "firstMsgId");
        AbstractC19074t.m100208f(messageId2, "secondMsgId");
        if (messageId.m41053q() && messageId2.m41053q()) {
            m41045i = messageId.m41047k();
            m41045i2 = messageId2.m41047k();
        } else {
            m41045i = messageId.m41045i();
            m41045i2 = messageId2.m41045i();
        }
        return m41045i - m41045i2;
    }

    /* renamed from: I0 */
    public final void m145837I0(JSONObject jSONObject, String str) {
        AbstractC19074t.m100208f(jSONObject, "json");
        AbstractC19074t.m100208f(str, "source");
        try {
            C29199a.m145771a("parseDataListThreadOffline(1991) source= " + str + "\ndata= " + jSONObject);
            if (jSONObject.has("data")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                JSONArray jSONArray = new JSONArray();
                if (jSONObject2.has("group") && m145859a0()) {
                    jSONArray = jSONObject2.getJSONArray("group");
                    AbstractC19074t.m100207e(jSONArray, "getJSONArray(...)");
                }
                JSONArray jSONArray2 = new JSONArray();
                if (jSONObject2.has("single") && m145861b0()) {
                    jSONArray2 = jSONObject2.getJSONArray("single");
                    AbstractC19074t.m100207e(jSONArray2, "getJSONArray(...)");
                }
                if (jSONObject2.has("groupsPerRequest")) {
                    this.f135290a = jSONObject2.optInt("groupsPerRequest", 8);
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray2.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    if (jSONObject3 != null) {
                        long optLong = jSONObject3.optLong("uid");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(optLong);
                        String sb3 = sb2.toString();
                        long optLong2 = jSONObject3.optLong("last");
                        if (optLong2 > 0) {
                            C19636i1.Companion.m102800a().m102773l(sb3, optLong2);
                        }
                        arrayList.add(sb3);
                    }
                }
                int length2 = jSONArray.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i12);
                    if (jSONObject4 != null) {
                        String str2 = "group_" + jSONObject4.getLong("gid");
                        long j11 = jSONObject4.getLong("last");
                        if (j11 > 0) {
                            C19636i1.Companion.m102800a().m102773l(str2, j11);
                        }
                        arrayList.add(str2);
                    }
                }
                if (arrayList.size() > 0) {
                    m145790L0(arrayList);
                }
                this.f135307r.set(false);
                m145855X0(arrayList);
                m145887u0(arrayList, System.currentTimeMillis());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: J */
    public final int m145838J(String str) {
        int size;
        AbstractC19074t.m100208f(str, "threadId");
        ArrayList m145812h0 = m145812h0(str);
        synchronized (m145812h0) {
            size = m145812h0.size();
        }
        return size;
    }

    /* renamed from: K */
    public final void m145839K(MessageId messageId, MessageId messageId2, MessageId messageId3, boolean z11, boolean z12, boolean z13) {
        C29199a.m145771a("[MyCloud] createGapPullMsgCloud fromMsgId= " + messageId + ", toMsgId= " + messageId2 + ", lastDeleteMsgId= " + messageId3 + ", needCreateGAPSyncAll= " + z11 + ", needCreateGAPAfterLogin= " + z12);
        if (z11 && m145857Z()) {
            if (messageId != null && AbstractC0924m0.m4077ob()) {
                C7959d.Companion.m41850e().m41788h0("204278670");
                m145873l0(new C28611c("204278670", messageId.m41047k(), C28611c.f132655k, 0L));
                this.f135300k.remove("204278670");
                AbstractC0924m0.m4057nl(false);
                AbstractC0924m0.m4027ml(false);
            }
        } else if (z12 && messageId != null) {
            MessageId messageId4 = null;
            if (messageId2 != null) {
                int i11 = (m145836I(messageId, messageId2) > 0L ? 1 : (m145836I(messageId, messageId2) == 0L ? 0 : -1));
            } else if (messageId3 != null && m145836I(messageId, messageId3) > 0) {
                messageId4 = messageId3;
            }
            if (messageId4 != null && AbstractC0924m0.m4047nb()) {
                m145873l0(new C28611c("204278670", messageId.m41047k(), messageId4.m41047k(), messageId4.m41045i()));
                this.f135300k.remove("204278670");
            }
            AbstractC0924m0.m4027ml(false);
        }
        AbstractC0924m0.m3432Si("");
        if (z13) {
            if ((z12 || z11) && m145857Z()) {
                AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: ws.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29210k.m145789L(C29210k.this);
                    }
                }, 5000L);
                return;
            }
            return;
        }
        AbstractC0924m0.m4057nl(false);
        AbstractC0924m0.m4027ml(false);
    }

    /* renamed from: K0 */
    public final void m145840K0() {
        if (!this.f135295f && !m145874m0()) {
            this.f135295f = true;
            C29199a.m145771a("pullListThreadChatOffline(1991) START, retry count: " + this.f135296g);
            C29200a0.Companion.m145780a();
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(c0766k));
            c0766k.mo1622d9();
        }
    }

    /* renamed from: M */
    public final void m145841M(final C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ws.c
            @Override // java.lang.Runnable
            public final void run() {
                C29210k.m145791N(C29210k.this, c17945a0);
            }
        });
    }

    /* renamed from: M0 */
    public final void m145842M0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f135300k.remove(str);
    }

    /* renamed from: N0 */
    public final void m145843N0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "threadId");
        Map map = this.f135291b;
        AbstractC19074t.m100207e(map, "jobsMap");
        synchronized (map) {
            try {
                C28611c c28611c = (C28611c) this.f135291b.remove(str);
                if (c28611c != null) {
                    if (z11) {
                        Map map2 = this.f135291b;
                        AbstractC19074t.m100207e(map2, "jobsMap");
                        map2.put(str, c28611c);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: O0 */
    public final void m145844O0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        this.f135299j.remove(str);
    }

    /* renamed from: P0 */
    public final C29213n m145845P0(long j11) {
        for (C29213n c29213n : this.f135301l) {
            if (c29213n.f135338h == j11) {
                if (!this.f135301l.remove(c29213n)) {
                    return null;
                }
                return c29213n;
            }
        }
        return null;
    }

    /* renamed from: Q0 */
    public final void m145846Q0() {
        try {
            List<C28611c> m41813o1 = C7959d.Companion.m41850e().m41813o1();
            Map map = this.f135291b;
            AbstractC19074t.m100207e(map, "jobsMap");
            synchronized (map) {
                try {
                    for (C28611c c28611c : m41813o1) {
                        if (!this.f135291b.containsKey(c28611c.f132658a)) {
                            Map map2 = this.f135291b;
                            AbstractC19074t.m100207e(map2, "jobsMap");
                            map2.put(c28611c.f132658a, c28611c);
                        }
                        C29199a.m145771a("requeueOldJobsFromDB PullMsgOfflineJob= " + c28611c.m143076h());
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            m145796S();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: R0 */
    public final void m145847R0(boolean z11) {
        this.f135302m = z11;
    }

    /* renamed from: S0 */
    public final void m145848S0(String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(arrayList, "listJob");
        Map map = this.f135300k;
        AbstractC19074t.m100207e(map, "listPullOfflineJobMap");
        map.put(str, arrayList);
    }

    /* renamed from: T */
    public final void m145849T() {
        if (this.f135301l.isEmpty() && !m145893y()) {
            return;
        }
        C29213n m145798W = m145798W();
        if (!this.f135302m && m145798W != null && (C29628e.m147249E0().m93432x() || !m145820t0(m145798W))) {
            if (!m145798W.f135332b) {
                m145798W.m145934m();
            }
        } else if (!C29628e.m147249E0().m93432x() && m145878p0()) {
            C23744a.Companion.m124119a().m124116d(5207, 2);
            C21956b.m114657g("PullMsgOfflineManager", "Post event [NOTIFY_STATE_SYNC_MSG_DATA_MY_CLOUD]: state=2");
        }
    }

    /* renamed from: U */
    public final void m145850U(String str, C17798g c17798g) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(c17798g, "loadMessageLog");
        d dVar = (d) this.f135309t.remove(str);
        if (dVar != null && dVar.m145901d()) {
            c17798g.m94018f(dVar.m145898a());
            c17798g.m94022j(dVar.m145900c());
            c17798g.m94020h(dVar.m145899b());
            long m145898a = dVar.m145898a();
            long m145900c = dVar.m145900c();
            long m145899b = dVar.m145899b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fillLoadCloudMsgLog threadId= ");
            sb2.append(str);
            sb2.append(", tsGetOfflineThread= ");
            sb2.append(m145898a);
            sb2.append(", tsLoadMsgPreviewDone= ");
            sb2.append(m145900c);
            sb2.append(", tsInsertMsgPreviewDone= ");
            sb2.append(m145899b);
        }
    }

    /* renamed from: U0 */
    public final void m145851U0(String str, long j11, long j12, long j13, long j14, long j15) {
        C28611c c28611c;
        AbstractC19074t.m100208f(str, "threadId");
        ArrayList m145867f0 = m145867f0(str);
        synchronized (m145867f0) {
            try {
                int m145799X = m145799X(m145867f0, j11, j12);
                if (m145799X >= 0) {
                    c28611c = (C28611c) m145867f0.get(m145799X);
                } else {
                    c28611c = null;
                }
                if (c28611c != null) {
                    C28611c c28611c2 = new C28611c(c28611c.f132658a, c28611c.f132659b, j13, 0L);
                    C28611c c28611c3 = new C28611c(c28611c.f132658a, j14, c28611c.f132661d, c28611c.f132662e);
                    m145867f0.remove(m145799X);
                    ArrayList arrayList = new ArrayList();
                    if (c28611c2.m143074f()) {
                        m145867f0.add(m145799X, c28611c2);
                        arrayList.add(c28611c2);
                    }
                    if (c28611c3.m143074f()) {
                        m145867f0.add(m145799X, c28611c3);
                        arrayList.add(c28611c3);
                    }
                    try {
                        m145848S0(str, arrayList);
                        C0824j.m2153b(new h(c28611c, arrayList));
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                m145858Z0(str, j13, j14, j15);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: V */
    public final C17945a0 m145852V(List list) {
        AbstractC19074t.m100208f(list, "chatContents");
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i11 = size - 1;
            if (!((C17945a0) list.get(size)).m95161i7()) {
                return (C17945a0) list.get(size);
            }
            if (i11 >= 0) {
                size = i11;
            } else {
                return null;
            }
        }
    }

    /* renamed from: V0 */
    public final void m145853V0(boolean z11, boolean z12) {
        synchronized (this) {
            try {
                if (this.f135306q == null) {
                    String str = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str, "currentUserUid");
                    this.f135306q = new C26893h(str);
                }
                C26893h c26893h = this.f135306q;
                if (c26893h != null) {
                    c26893h.m138591I(z11, z12);
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: W0 */
    public final void m145854W0() {
        synchronized (this) {
            try {
                C26893h c26893h = this.f135306q;
                if (c26893h != null) {
                    c26893h.m138592K();
                }
                this.f135306q = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: X0 */
    public final void m145855X0(final ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listThreadId");
        C29199a.m145771a("syncAllGapCreatedWhenReceivedMsgOnline listThreadId= " + TextUtils.join(",", arrayList));
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            hashMap.put(str, str);
        }
        Map map = this.f135300k;
        AbstractC19074t.m100207e(map, "listPullOfflineJobMap");
        synchronized (map) {
            try {
                for (String str2 : this.f135300k.keySet()) {
                    ArrayList arrayList2 = (ArrayList) this.f135300k.get(str2);
                    if (arrayList2 != null) {
                        if (hashMap.containsKey(str2)) {
                            int size = arrayList2.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                Object obj = arrayList2.get(i11);
                                AbstractC19074t.m100207e(obj, "get(...)");
                                C28611c c28611c = (C28611c) obj;
                                if (c28611c.f132665h == C28611c.f132656l) {
                                    c28611c.f132665h = C28611c.f132657m;
                                }
                            }
                            Map map2 = this.f135300k;
                            AbstractC19074t.m100207e(map2, "listPullOfflineJobMap");
                            map2.put(str2, arrayList2);
                        } else {
                            for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                                Object obj2 = arrayList2.get(size2);
                                AbstractC19074t.m100207e(obj2, "get(...)");
                                if (((C28611c) obj2).f132665h == C28611c.f132656l) {
                                    arrayList2.remove(size2);
                                }
                            }
                            Map map3 = this.f135300k;
                            AbstractC19074t.m100207e(map3, "listPullOfflineJobMap");
                            map3.put(str2, arrayList2);
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ws.f
            @Override // java.lang.Runnable
            public final void run() {
                C29210k.m145800Y0(arrayList);
            }
        });
    }

    /* renamed from: Y */
    public final long m145856Y() {
        long j11 = this.f135305p;
        this.f135305p = 1 + j11;
        return j11;
    }

    /* renamed from: Z */
    public final boolean m145857Z() {
        if (m145861b0() && C21373a.f104231a.m110798j().m110816b()) {
            return true;
        }
        return false;
    }

    /* renamed from: Z0 */
    public final void m145858Z0(String str, long j11, long j12, long j13) {
        AbstractC19074t.m100208f(str, "threadId");
        C29199a.m145771a("syncListPullOfflineJobs threadId= " + str + ", bottomGlobalId= " + j11 + ", topGlobalId= " + j12 + ", topClientId= " + j13);
        ArrayList arrayList = (ArrayList) this.f135300k.get(str);
        if (arrayList == null) {
            return;
        }
        synchronized (arrayList) {
            try {
                Iterator it = arrayList.iterator();
                AbstractC19074t.m100207e(it, "iterator(...)");
                if (j11 != j12) {
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C28611c c28611c = (C28611c) next;
                        long j14 = c28611c.f132659b;
                        if (j11 < j14 || (c28611c.f132661d < j12 && c28611c.f132662e < j13)) {
                            long j15 = c28611c.f132661d;
                            if (j15 != 0) {
                                if (j14 >= j12 && j15 < j12) {
                                    c28611c.f132659b = j12;
                                } else if (j14 > j11 && j15 <= j11) {
                                    c28611c.f132661d = j11;
                                }
                                C0824j.m2153b(new j(c28611c));
                            } else {
                                if (j14 >= j12 && c28611c.f132662e < j13) {
                                    c28611c.f132659b = j12;
                                } else if (j14 > j11 && c28611c.f132662e < j13) {
                                    c28611c.f132661d = j11;
                                }
                                C0824j.m2153b(new j(c28611c));
                            }
                        }
                        it.remove();
                        C0824j.m2153b(new i(c28611c));
                        C29199a.m145771a("syncListPullOfflineJobs DELETE JOB: " + c28611c.m143076h());
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: a0 */
    public final boolean m145859a0() {
        if (AbstractC0924m0.m3356Q0() == 1 && C26688i.f126427a.m137070d().m137118a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a1 */
    public final void m145860a1(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "threadId");
        if (messageId == null) {
            Map map = this.f135298i;
            AbstractC19074t.m100207e(map, "conversationInfoExtraMap");
            map.put(str, null);
            C7959d.Companion.m41850e().m41805m0(str);
            return;
        }
        C31909f1 c31909f1 = (C31909f1) this.f135298i.get(str);
        if (c31909f1 != null) {
            MessageId messageId2 = c31909f1.f146610b;
            AbstractC19074t.m100207e(messageId2, "mLastDelMsgId");
            if (m145836I(messageId, messageId2) < 0) {
                return;
            }
        }
        Map map2 = this.f135298i;
        AbstractC19074t.m100207e(map2, "conversationInfoExtraMap");
        map2.put(str, new C31909f1(str, messageId));
        C7959d.a aVar = C7959d.Companion;
        if (aVar.m41850e().m41779d3(str, messageId) <= 0) {
            aVar.m41850e().m41711I1(str, messageId);
        }
    }

    /* renamed from: b0 */
    public final boolean m145861b0() {
        if (AbstractC0924m0.m3356Q0() == 1 && C21373a.f104231a.m110801m()) {
            return true;
        }
        return false;
    }

    /* renamed from: b1 */
    public final void m145862b1(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        m145806d1(mo95039W2, m95029V3);
    }

    /* renamed from: c1 */
    public final void m145863c1(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "threadId");
        if (messageId == null) {
            Map map = this.f135298i;
            AbstractC19074t.m100207e(map, "conversationInfoExtraMap");
            map.put(str, null);
        } else {
            Map map2 = this.f135298i;
            AbstractC19074t.m100207e(map2, "conversationInfoExtraMap");
            map2.put(str, new C31909f1(str, messageId));
        }
    }

    /* renamed from: d0 */
    public final C28611c m145864d0() {
        ArrayList arrayList = (ArrayList) this.f135300k.get("204278670");
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28611c c28611c = (C28611c) it.next();
                if (c28611c.m143073e()) {
                    return c28611c;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: e0 */
    public final MessageId m145865e0() {
        List m127132B0;
        MessageId messageId;
        String m3444T1 = AbstractC0924m0.m3444T1();
        if (!TextUtils.isEmpty(m3444T1)) {
            AbstractC19074t.m100205c(m3444T1);
            m127132B0 = AbstractC24342w.m127132B0(m3444T1, new String[]{"_"}, false, 0, 6, null);
            String[] strArr = (String[]) m127132B0.toArray(new String[0]);
            if (strArr.length == 2) {
                messageId = MessageId.Companion.m41066e(strArr[0], strArr[1], "204278670", "");
            } else {
                messageId = null;
            }
            if (messageId != null) {
                return messageId;
            }
        }
        C17945a0 m2603B = AbstractC23306f.m120584H0().m2603B("204278670");
        if (m2603B == null) {
            return null;
        }
        return m2603B.m95029V3();
    }

    /* renamed from: e1 */
    public final void m145866e1(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "messageId");
        if (messageId.m41047k() <= 0) {
            return;
        }
        C28609a m145892x = m145892x(str);
        if (m145892x.f132635b <= 0 && m145892x.f132636c <= 0) {
            m145809f1(str, messageId);
            C7959d.Companion.m41850e().m41727M1(str, messageId);
        } else if (m145892x.m143024a(messageId)) {
            m145809f1(str, messageId);
            C7959d.Companion.m41850e().m41823r3(str, messageId);
        }
    }

    /* renamed from: f0 */
    public final ArrayList m145867f0(String str) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(str, "threadId");
        ArrayList m145812h0 = m145812h0(str);
        synchronized (m145812h0) {
            arrayList = new ArrayList(m145812h0);
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public final ArrayList m145868g0(String str) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(str, "threadId");
        if (this.f135300k.containsKey(str)) {
            ArrayList arrayList2 = (ArrayList) this.f135300k.get(str);
            if (arrayList2 != null) {
                synchronized (arrayList2) {
                    arrayList = new ArrayList(arrayList2);
                }
                return arrayList;
            }
            return new ArrayList();
        }
        return new ArrayList();
    }

    /* renamed from: g1 */
    public final void m145869g1(C3535c c3535c, MessageId messageId) {
        AbstractC19074t.m100208f(c3535c, "currentChat");
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            String m17944I0 = c3535c.m17944I0();
            MessageId messageId2 = (MessageId) this.f135299j.get(m17944I0);
            if (messageId2 != null) {
                if (messageId.m41053q()) {
                    if (messageId2.m41053q()) {
                        if (messageId.m41047k() < messageId2.m41047k()) {
                            Map map = this.f135299j;
                            AbstractC19074t.m100207e(map, "minMessageIdMap");
                            map.put(m17944I0, messageId);
                            C29199a.m145771a("updateMinMessageId(1): " + messageId);
                        }
                    } else if (messageId2.m41052p()) {
                        if (messageId.m41045i() < messageId2.m41045i()) {
                            Map map2 = this.f135299j;
                            AbstractC19074t.m100207e(map2, "minMessageIdMap");
                            map2.put(m17944I0, messageId);
                            C29199a.m145771a("updateMinMessageId(2): " + messageId);
                        }
                    } else {
                        Map map3 = this.f135299j;
                        AbstractC19074t.m100207e(map3, "minMessageIdMap");
                        map3.put(m17944I0, messageId);
                        C29199a.m145771a("updateMinMessageId(3): " + messageId);
                    }
                } else if (messageId.m41052p()) {
                    if (messageId2.m41052p()) {
                        if (messageId.m41045i() < messageId2.m41045i()) {
                            Map map4 = this.f135299j;
                            AbstractC19074t.m100207e(map4, "minMessageIdMap");
                            map4.put(m17944I0, messageId);
                            C29199a.m145771a("updateMinMessageId(4): " + messageId);
                        }
                    } else if (!messageId2.m41053q()) {
                        Map map5 = this.f135299j;
                        AbstractC19074t.m100207e(map5, "minMessageIdMap");
                        map5.put(m17944I0, messageId);
                        C29199a.m145771a("updateMinMessageId(5): " + messageId);
                    }
                }
                MessageId m145870i0 = m145870i0(c3535c.m17944I0());
                MessageId m17939D0 = c3535c.m17939D0();
                if (m17939D0 == null) {
                    return;
                }
                if ((m145870i0.m41053q() && m17939D0.m41053q() && m145870i0.m41047k() < m17939D0.m41047k()) || (m145870i0.m41052p() && m17939D0.m41052p() && m145870i0.m41045i() < m17939D0.m41045i())) {
                    c3535c.m17956U0(m145870i0);
                    C29199a.m145771a("updateMinMessageId setLastCloudMsgId: " + m145870i0);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i0 */
    public final MessageId m145870i0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (this.f135299j.containsKey(str)) {
            Object obj = this.f135299j.get(str);
            AbstractC19074t.m100205c(obj);
            return (MessageId) obj;
        }
        MessageId m41529U = C7956b.Companion.m41573b().m41529U(str);
        Map map = this.f135299j;
        AbstractC19074t.m100207e(map, "minMessageIdMap");
        map.put(str, m41529U);
        return m41529U;
    }

    /* renamed from: j0 */
    public final boolean m145871j0() {
        boolean z11;
        Set set = this.f135308s;
        AbstractC19074t.m100207e(set, "pendingAutoSyncMsgReasons");
        synchronized (set) {
            try {
                if (this.f135308s.isEmpty()) {
                    z11 = false;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    for (String str : this.f135308s) {
                        sb2.append("\n\t");
                        sb2.append(str);
                    }
                    C29199a.m145771a("hasPendingAutoSyncMsgReasons: PENDING REASONS: " + ((Object) sb2));
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: k0 */
    public final boolean m145872k0(String str, long j11) {
        AbstractC19074t.m100208f(str, "threadId");
        Iterator it = m145868g0(str).iterator();
        while (it.hasNext()) {
            C28611c c28611c = (C28611c) it.next();
            if (c28611c.f132659b == j11 && c28611c.f132661d != C28611c.f132655k && c28611c.f132665h == C28611c.f132657m) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l0 */
    public final void m145873l0(C28611c c28611c) {
        AbstractC19074t.m100208f(c28611c, "job");
        C29199a.m145771a("insertNewPullMsgOfflineJob: " + c28611c.f132658a + " " + c28611c.f132659b + " " + c28611c.f132661d + " " + c28611c.f132662e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c28611c);
        C7959d.Companion.m41850e().m41735P1(arrayList);
        ArrayList m145812h0 = m145812h0(c28611c.f132658a);
        synchronized (m145812h0) {
            m145812h0.add(0, c28611c);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: m0 */
    public final boolean m145874m0() {
        return C26688i.f126427a.m137070d().m137120c();
    }

    /* renamed from: n0 */
    public final boolean m145875n0() {
        try {
            Iterator it = this.f135301l.iterator();
            while (it.hasNext()) {
                if (((C29213n) it.next()).m145935t().m143065z()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: o0 */
    public final boolean m145876o0() {
        try {
            Iterator it = this.f135301l.iterator();
            while (it.hasNext()) {
                if (((C29213n) it.next()).m145935t().m143060u()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: p */
    public final void m145877p(String str, boolean z11, boolean z12, C29213n.b bVar) {
        AbstractC19074t.m100208f(str, "threadId");
        try {
            m145885t(new C29213n(bVar, C28610b.Companion.m143066a(str, z11, z12)));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("PullMsgOfflineManager", e11);
        }
    }

    /* renamed from: p0 */
    public final boolean m145878p0() {
        try {
            Iterator it = this.f135301l.iterator();
            while (it.hasNext()) {
                if (((C29213n) it.next()).m145935t().m143039F()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: q */
    public final void m145879q(String str, MessageId messageId, C20343i c20343i, C29213n.b bVar) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "jumpMsgId");
        try {
            ContactProfile m141801m = C28203u6.m141801m(C28203u6.f131407a, str, false, 2, null);
            if (m141801m != null) {
                m145885t(new C29213n(bVar, C28610b.Companion.m143067b(AbstractC23306f.m120584H0().m2638u(m141801m), messageId, c20343i)));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("PullMsgOfflineManager", e11);
        }
    }

    /* renamed from: q0 */
    public final boolean m145880q0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (m145838J(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final void m145881r(String str, C29213n.b bVar) {
        ContactProfile m141801m;
        AbstractC19074t.m100208f(str, "threadId");
        try {
            if (!m145875n0() && (m141801m = C28203u6.m141801m(C28203u6.f131407a, str, false, 2, null)) != null) {
                m145885t(new C29213n(bVar, new C28610b(AbstractC23306f.m120584H0().m2638u(m141801m), 8, 0L, 0L)));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("PullMsgOfflineManager", e11);
        }
    }

    /* renamed from: r0 */
    public final boolean m145882r0() {
        return this.f135301l.isEmpty();
    }

    /* renamed from: s */
    public final void m145883s(String str, MessageId messageId, C29213n.b bVar) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "loadFromMessageId");
        try {
            ContactProfile m141801m = C28203u6.m141801m(C28203u6.f131407a, str, false, 2, null);
            if (m141801m != null) {
                m145885t(new C29213n(bVar, C28610b.Companion.m143068c(AbstractC23306f.m120584H0().m2638u(m141801m), messageId)));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("PullMsgOfflineManager", e11);
        }
    }

    /* renamed from: s0 */
    public final boolean m145884s0(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "msgId");
        ArrayList m145867f0 = m145867f0(str);
        long m41047k = messageId.m41047k();
        long m41045i = messageId.m41045i();
        Iterator it = m145867f0.iterator();
        while (it.hasNext()) {
            C28611c c28611c = (C28611c) it.next();
            long j11 = c28611c.f132661d;
            if (j11 <= 0 || c28611c.f132659b <= m41047k || j11 >= m41047k) {
                if (j11 == 0 && c28611c.f132659b > m41047k && c28611c.f132662e < m41045i) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public final void m145885t(C29213n c29213n) {
        AbstractC19074t.m100208f(c29213n, "task");
        this.f135301l.add(c29213n);
        C29199a.m145771a("addPullMsgTask PullMsgTask: " + c29213n + " size = " + this.f135301l.size());
        m145849T();
    }

    /* renamed from: u */
    public final C31909f1 m145886u(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (!this.f135298i.containsKey(str)) {
            C31909f1 m41743R0 = C7959d.Companion.m41850e().m41743R0(str);
            Map map = this.f135298i;
            AbstractC19074t.m100207e(map, "conversationInfoExtraMap");
            map.put(str, m41743R0);
            return m41743R0;
        }
        return (C31909f1) this.f135298i.get(str);
    }

    /* renamed from: u0 */
    public final void m145887u0(List list, long j11) {
        AbstractC19074t.m100208f(list, "threadIds");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            d dVar = (d) this.f135309t.get(str);
            if (dVar == null) {
                dVar = new d();
                this.f135309t.put(str, dVar);
            }
            dVar.m145902e(j11);
        }
        C17794c.Companion.m93979a().m93972h(list);
    }

    /* renamed from: v */
    public final boolean m145888v(boolean z11, boolean z12) {
        if ((z11 && m145859a0()) || (z12 && m145861b0())) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public final void m145889v0(String str, long j11) {
        AbstractC19074t.m100208f(str, "threadId");
        d dVar = (d) this.f135309t.get(str);
        if (dVar == null) {
            return;
        }
        dVar.m145903f(j11);
        C17794c.Companion.m93979a().m93971g(str);
    }

    /* renamed from: w */
    public final boolean m145890w() {
        if (!m145859a0() && !m145861b0()) {
            return false;
        }
        return true;
    }

    /* renamed from: w0 */
    public final void m145891w0(String str, long j11) {
        AbstractC19074t.m100208f(str, "threadId");
        d dVar = (d) this.f135309t.get(str);
        if (dVar == null) {
            return;
        }
        dVar.m145904g(j11);
    }

    /* renamed from: x */
    public final C28609a m145892x(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (this.f135303n.containsKey(str)) {
            Object obj = this.f135303n.get(str);
            AbstractC19074t.m100205c(obj);
            return (C28609a) obj;
        }
        C28609a m41784f1 = C7959d.Companion.m41850e().m41784f1(str);
        Map map = this.f135303n;
        AbstractC19074t.m100207e(map, "lastMsgIdMap");
        map.put(str, m41784f1);
        return m41784f1;
    }

    /* renamed from: y */
    public final boolean m145893y() {
        boolean m138598a;
        synchronized (this) {
            m138598a = C26893h.Companion.m138598a();
        }
        return m138598a;
    }

    /* renamed from: y0 */
    public final void m145894y0(boolean z11) {
        C29199a.m145771a("onRestoreBackupMessageCompleted successful: " + z11);
        this.f135308s.remove("PENDING_AUTO_SYNC_MSG_REASON_RESTORE_MSG");
        if (m145857Z()) {
            AbstractC0924m0.m3608Yk(true);
            if (!AbstractC0924m0.m4077ob()) {
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ws.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C29210k.m145823z0(C29210k.this);
                    }
                });
            }
        }
        m145794Q("204278670");
        m145792O();
    }

    private C29210k() {
        this.f135290a = 8;
        this.f135291b = Collections.synchronizedMap(new LinkedHashMap());
        this.f135294e = new g();
        this.f135297h = new AtomicBoolean(false);
        this.f135298i = Collections.synchronizedMap(new LinkedHashMap());
        this.f135299j = Collections.synchronizedMap(new LinkedHashMap());
        this.f135300k = Collections.synchronizedMap(new LinkedHashMap());
        this.f135301l = Collections.synchronizedList(new ArrayList());
        this.f135303n = Collections.synchronizedMap(new LinkedHashMap());
        this.f135304o = Collections.synchronizedMap(new LinkedHashMap());
        this.f135307r = new AtomicBoolean(false);
        this.f135308s = Collections.synchronizedSet(new HashSet());
        this.f135309t = new HashMap();
    }
}
