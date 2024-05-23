package p528ts;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import b40.C2524c;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import gw.C19669z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kw.C21956b;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p279jw.C21373a;
import p279jw.C21374b;
import p348mi.AbstractC23306f;
import p361nb.C23648e;
import p363nh.C23744a;
import p585vs.C28610b;
import p585vs.C28611c;
import p585vs.C28615g;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import th.AbstractC26681b;
import us.C27363a;
import vg.C28203u6;
import ws.C29199a;
import ws.C29210k;
import ws.C29213n;

/* renamed from: ts.h */
/* loaded from: classes4.dex */
public final class C26893h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f127271a;

    /* renamed from: b */
    private final ArrayList f127272b;

    /* renamed from: c */
    private int f127273c;

    /* renamed from: d */
    private C28615g f127274d;

    /* renamed from: e */
    private C27363a f127275e;

    /* renamed from: f */
    private final InterfaceC24854k f127276f;

    /* renamed from: g */
    private final InterfaceC24854k f127277g;

    /* renamed from: h */
    private final InterfaceC24854k f127278h;

    /* renamed from: i */
    private int f127279i;

    /* renamed from: j */
    private boolean f127280j;

    /* renamed from: ts.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m138598a() {
            String str = CoreUtility.f89233i;
            if (str != null && str.length() != 0) {
                C29210k.b bVar = C29210k.Companion;
                if (!bVar.m145896a().m145857Z()) {
                    C29199a.m145771a("AutoSyncMsgWorker - checkNeedSyncCloudMsgAuto FALSE - Config disabled");
                    return false;
                }
                if (bVar.m145896a().m145871j0()) {
                    C29199a.m145771a("AutoSyncMsgWorker - checkNeedSyncCloudMsgAuto FALSE - Has pending reason");
                    return false;
                }
                if (AbstractC0924m0.m3251Mb()) {
                    C29199a.m145771a("AutoSyncMsgWorker - checkNeedSyncCloudMsgAuto FALSE - Restore msg task is running");
                    return false;
                }
                return true;
            }
            C29199a.m145771a("AutoSyncMsgWorker - checkNeedSyncCloudMsgAuto FALSE - currentUserUid empty");
            return false;
        }

        /* renamed from: b */
        public final void m138599b(C21374b c21374b) {
            AbstractC19074t.m100208f(c21374b, "newConfig");
            C21374b m110798j = C21373a.f104231a.m110798j();
            if (m110798j.m110816b() && !c21374b.m110816b()) {
                m110798j.m110820f(c21374b.m110816b());
                C29210k.Companion.m145896a().m145854W0();
                m138600c();
            } else if (m110798j.m110816b() && c21374b.m110816b() && m110798j.m110819e() < c21374b.m110819e()) {
                AbstractC0924m0.m3608Yk(true);
                AbstractC0924m0.m4057nl(true);
            }
        }

        /* renamed from: c */
        public final void m138600c() {
            AbstractC0924m0.m3637Zk(false);
            AbstractC0924m0.m3579Xk(false);
            C7959d.Companion.m41850e().m41791i0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ts.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f127281q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final JSONObject mo12V4() {
            String m3417S3 = AbstractC0924m0.m3417S3();
            AbstractC19074t.m100207e(m3417S3, "getMyCloudAutoSyncedMsgStats(...)");
            return new JSONObject(m3417S3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ts.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {
        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            HashMap hashMap = new HashMap();
            Iterator it = C26893h.this.m138596s().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Long valueOf = Long.valueOf(C26893h.this.m138580o().optLong(str, 0L));
                AbstractC19074t.m100205c(str);
                hashMap.put(str, valueOf);
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ts.h$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            HashMap hashMap = new HashMap();
            Iterator it = C26893h.this.m138596s().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case 3143036:
                        if (str.equals("file")) {
                            for (Integer num : AbstractC19646n0.m102882C0()) {
                                AbstractC19074t.m100205c(num);
                                AbstractC19074t.m100205c(str);
                                hashMap.put(num, str);
                            }
                            break;
                        } else {
                            break;
                        }
                    case 3556653:
                        if (str.equals("text")) {
                            for (Integer num2 : AbstractC19646n0.m102921P0()) {
                                AbstractC19074t.m100205c(num2);
                                AbstractC19074t.m100205c(str);
                                hashMap.put(num2, str);
                            }
                            break;
                        } else {
                            break;
                        }
                    case 106642994:
                        if (str.equals("photo")) {
                            for (Integer num3 : AbstractC19646n0.m102906K0()) {
                                AbstractC19074t.m100205c(num3);
                                AbstractC19074t.m100205c(str);
                                hashMap.put(num3, str);
                            }
                            break;
                        } else {
                            break;
                        }
                    case 112202875:
                        if (str.equals("video")) {
                            for (Integer num4 : AbstractC19646n0.m102942W0()) {
                                AbstractC19074t.m100205c(num4);
                                AbstractC19074t.m100205c(str);
                                hashMap.put(num4, str);
                            }
                            break;
                        } else {
                            break;
                        }
                }
            }
            return hashMap;
        }
    }

    public C26893h(String str) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(str, "uid");
        this.f127271a = str;
        this.f127272b = C2524c.f10266a.m12643d();
        m129210a = AbstractC24856m.m129210a(b.f127281q);
        this.f127276f = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new c());
        this.f127277g = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new d());
        this.f127278h = m129210a3;
    }

    /* renamed from: A */
    private final void m138560A(boolean z11) {
        if (!z11) {
            synchronized (this) {
                this.f127279i = 3;
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            m138586x();
            if (AbstractC0924m0.m3867hb()) {
                C23744a.Companion.m124119a().m124116d(5207, 4);
                C21956b.m114657g("AutoSyncMsgWorker", "Post event [NOTIFY_STATE_SYNC_MSG_DATA_MY_CLOUD]: state=4");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AutoSyncMsgWorker - onSyncCloudMsgSessionCompleted flowCompleted:");
        sb2.append(!z11);
        C29199a.m145771a(sb2.toString());
        C23744a.Companion.m124119a().m124116d(3201, Boolean.valueOf(!z11));
    }

    /* renamed from: B */
    static /* synthetic */ void m138561B(C26893h c26893h, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c26893h.m138560A(z11);
    }

    /* renamed from: D */
    public static final void m138562D(C26893h c26893h) {
        AbstractC19074t.m100208f(c26893h, "this$0");
        synchronized (c26893h) {
            if (c26893h.f127279i != 1) {
                return;
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            c26893h.m138575i();
        }
    }

    /* renamed from: E */
    private final void m138563E(String str) {
        try {
            C29199a.m145771a("AutoSyncMsgWorker - onSyncMsgAutoTaskFailed threadId=" + str);
            synchronized (this) {
                m138560A(true);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            C23744a.Companion.m124119a().m124116d(5207, 1);
            C21956b.m114657g("AutoSyncMsgWorker", "Post event [NOTIFY_STATE_SYNC_MSG_DATA_MY_CLOUD]: state=1");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: G */
    public static final void m138564G(String str) {
        AbstractC19074t.m100208f(str, "$threadId");
        C7959d.Companion.m41850e().m41694D0(str);
    }

    /* renamed from: H */
    public static final void m138565H(C28615g c28615g, C26893h c26893h, List list) {
        AbstractC19074t.m100208f(c28615g, "$syncCloudMsgInfo");
        AbstractC19074t.m100208f(c26893h, "this$0");
        AbstractC19074t.m100208f(list, "$listMsg");
        C7959d.Companion.m41850e().m41725L3(c28615g);
        c26893h.m138593L(list);
    }

    /* renamed from: J */
    public static final void m138566J(C26893h c26893h, boolean z11) {
        boolean m4077ob;
        boolean m4047nb;
        AbstractC19074t.m100208f(c26893h, "this$0");
        synchronized (c26893h) {
            if (!c26893h.m138576j(z11)) {
                return;
            }
            c26893h.f127279i = 1;
            C24848g0 c24848g0 = C24848g0.f119245a;
            boolean z12 = false;
            try {
                if (AbstractC0924m0.m3837gb()) {
                    Companion.m138600c();
                    AbstractC0924m0.m3608Yk(false);
                }
                m4077ob = AbstractC0924m0.m4077ob();
                m4047nb = AbstractC0924m0.m4047nb();
            } catch (Exception e11) {
                e = e11;
            }
            if (!m4077ob && !m4047nb) {
                boolean z13 = c26893h.m138575i();
                try {
                    if (z13) {
                        AbstractC0924m0.m3637Zk(true);
                        C23744a.Companion.m124119a().m124116d(5207, 0);
                        C21956b.m114657g("AutoSyncMsgWorker", "Post event [NOTIFY_STATE_SYNC_MSG_DATA_MY_CLOUD]: state=0");
                    } else {
                        synchronized (c26893h) {
                            c26893h.f127279i = 3;
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    z12 = z13;
                    AbstractC23350e.m122778h(e);
                    synchronized (c26893h) {
                        c26893h.f127279i = 3;
                        C24848g0 c24848g02 = C24848g0.f119245a;
                        z13 = z12;
                        c26893h.m138585w(z13);
                        return;
                    }
                }
                c26893h.m138585w(z13);
                return;
            }
            c26893h.m138560A(true);
            C29210k.Companion.m145896a().m145877p("204278670", m4077ob, m4047nb, null);
        }
    }

    /* renamed from: i */
    private final boolean m138575i() {
        C28615g m138595p;
        try {
            m138595p = m138595p();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("AutoSyncMsgWorker", e11);
        }
        if (m138595p != null) {
            ContactProfile m141801m = C28203u6.m141801m(C28203u6.f131407a, m138595p.m143107h(), false, 2, null);
            if (m141801m == null) {
                return false;
            }
            C29210k.Companion.m145896a().m145885t(new C29213n(null, new C28610b(AbstractC23306f.m120584H0().m2638u(m141801m), 6, 0L, 0L)));
            m138588z(m138595p);
            return true;
        }
        m138561B(this, false, 1, null);
        return false;
    }

    /* renamed from: j */
    private final boolean m138576j(boolean z11) {
        return this.f127279i == 0 || z11;
    }

    /* renamed from: l */
    public static final void m138577l(String str) {
        AbstractC19074t.m100208f(str, "$threadId");
        C7959d.Companion.m41850e().m41694D0(str);
    }

    /* renamed from: m */
    private final C27363a m138578m() {
        C27363a c27363a;
        String str;
        long m41008l;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long m41548n = C7956b.Companion.m41573b().m41548n("204278670");
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C17945a0 m2609J = AbstractC23306f.m120584H0().m2609J("204278670");
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
            Conversation m103201R = C19669z.Companion.m103232a().m103201R("204278670");
            if (m103201R != null) {
                if (m2609J != null) {
                    m41008l = m2609J.m94974P4();
                } else {
                    m41008l = m103201R.m41008l();
                }
                c27363a = new C27363a(m103201R.f42894r, "204278670", (int) m41548n, m103201R.m41008l(), m41008l);
            } else {
                c27363a = null;
            }
            if (c27363a != null) {
                str = c27363a.toString();
            } else {
                str = null;
            }
            C29199a.m145771a("AutoSyncMsgWorker - candidateForThread: " + str + " timeGetMsgCount=" + currentTimeMillis2 + ", timeGetOldestMsg=" + currentTimeMillis3);
            return c27363a;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: n */
    private final C21374b m138579n() {
        return C21373a.f104231a.m110798j();
    }

    /* renamed from: o */
    public final JSONObject m138580o() {
        return (JSONObject) this.f127276f.getValue();
    }

    /* renamed from: q */
    public static final void m138581q(C28615g c28615g) {
        AbstractC19074t.m100208f(c28615g, "$it");
        C7959d.Companion.m41850e().m41768Z1(c28615g);
    }

    /* renamed from: r */
    public static final void m138582r(C26893h c26893h) {
        AbstractC19074t.m100208f(c26893h, "this$0");
        C28615g c28615g = c26893h.f127274d;
        AbstractC19074t.m100205c(c28615g);
        c28615g.m143115p(0);
        C28615g c28615g2 = c26893h.f127274d;
        AbstractC19074t.m100205c(c28615g2);
        c28615g2.m143112m(0L);
        C7959d m41850e = C7959d.Companion.m41850e();
        C28615g c28615g3 = c26893h.f127274d;
        AbstractC19074t.m100205c(c28615g3);
        m41850e.m41725L3(c28615g3);
    }

    /* renamed from: t */
    private final HashMap m138583t() {
        return (HashMap) this.f127277g.getValue();
    }

    /* renamed from: v */
    private final boolean m138584v() {
        return this.f127279i == 1;
    }

    /* renamed from: w */
    private final void m138585w(boolean z11) {
        C29199a.m145771a("AutoSyncMsgWorker - onStartSyncCloudMsgResult result=" + z11);
        C23744a.Companion.m124119a().m124116d(3200, Boolean.valueOf(z11));
    }

    /* renamed from: x */
    private final void m138586x() {
        C29199a.m145771a("AutoSyncMsgWorker - onSyncCloudMsgFlowCompleted");
        if (!AbstractC0924m0.m3807fb()) {
            AbstractC0924m0.m3579Xk(true);
        }
        C2524c.f10266a.m12644e(m138583t());
        C23744a.Companion.m124119a().m124116d(3204, new Object[0]);
    }

    /* renamed from: y */
    private final void m138587y(C28615g c28615g) {
        C23744a.Companion.m124119a().m124116d(3203, c28615g);
        C29199a.m145771a("AutoSyncMsgWorker - onSyncCloudMsgForThreadCompleted syncCloudMsgInfo=" + c28615g);
    }

    /* renamed from: z */
    private final void m138588z(C28615g c28615g) {
        C29199a.m145771a("AutoSyncMsgWorker - onSyncCloudMsgForThreadStarted syncCloudMsgInfo=" + c28615g);
        C23744a.Companion.m124119a().m124116d(3202, c28615g);
    }

    /* renamed from: C */
    public final void m138589C(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "threadId");
        C29199a.m145771a("AutoSyncMsgWorker - onSyncMsgAutoTaskCompleted threadId=" + str + ", successful=" + z11);
        if (Companion.m138598a()) {
            try {
                if (z11) {
                    AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: ts.e
                        public /* synthetic */ RunnableC26890e() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26893h.m138562D(C26893h.this);
                        }
                    }, m138579n().m110818d());
                } else {
                    m138563E(str);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: F */
    public final void m138590F(String str, List list, List list2, int i11, boolean z11) {
        int i12;
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(list, "listMsgLoaded");
        AbstractC19074t.m100208f(list2, "listMsg");
        try {
            C29199a.m145771a("AutoSyncMsgWorker - onSyncMsgAutoTaskSucceeded threadId=" + str + ", listMsgLoaded=" + list.size() + ", listMsg=" + list2.size() + ", currentTotalMsg=" + i11 + ", hasMore=" + z11);
            synchronized (this) {
                try {
                    if (!m138584v()) {
                        return;
                    }
                    C28615g c28615g = this.f127274d;
                    if (c28615g == null) {
                        return;
                    }
                    if (!AbstractC19074t.m100204b(c28615g.m143107h(), str)) {
                        return;
                    }
                    this.f127273c += list.size();
                    c28615g.m143113n(c28615g.m143103d() + list2.size());
                    c28615g.m143116q(i11);
                    if (!z11) {
                        c28615g.m143112m(AbstractC23306f.m120579F1().mo124308a());
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    if (!list.isEmpty()) {
                        if (c28615g.m143100a() > 0) {
                            c28615g.m143111l(c28615g.m143100a() - 1);
                        }
                    } else if (i12 != 1) {
                        c28615g.m143111l(c28615g.m143100a() + 1);
                        C29199a.m145771a("AutoSyncMsgWorker - Number of empty response:" + c28615g.m143100a() + ", listMsgLoaded=" + list.size());
                        if (c28615g.m143100a() > 3) {
                            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ts.f

                                /* renamed from: p */
                                public final /* synthetic */ String f127267p;

                                public /* synthetic */ RunnableC26891f(String str2) {
                                    r1 = str2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C26893h.m138564G(r1);
                                }
                            });
                            C29199a.m145771a("AutoSyncMsgWorker - Empty responseCount exceeded limit, abort!. hasMore:" + z11);
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    }
                    c28615g.m143115p(i12);
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ts.g

                        /* renamed from: q */
                        public final /* synthetic */ C26893h f127269q;

                        /* renamed from: r */
                        public final /* synthetic */ List f127270r;

                        public /* synthetic */ RunnableC26892g(C26893h this, List list22) {
                            r2 = this;
                            r3 = list22;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26893h.m138565H(C28615g.this, r2, r3);
                        }
                    });
                    if (c28615g.m143106g() == 1 || this.f127273c >= m138579n().m110817c()) {
                        m138587y(c28615g);
                        ContactProfile m141801m = C28203u6.m141801m(C28203u6.f131407a, str2, false, 2, null);
                        if (m141801m != null) {
                            AbstractC23306f.m120584H0().m2638u(m141801m).m17956U0(null);
                            C29199a.m145771a("AutoSyncMsgWorker - Reset lastCloudMsgId");
                        }
                        if (this.f127273c >= m138579n().m110817c()) {
                            m138560A(false);
                        }
                    }
                    String str2 = "";
                    Conversation m103201R = C19669z.Companion.m103232a().m103201R(str2);
                    if (m103201R != null) {
                        str2 = m103201R.f42894r;
                    }
                    C29199a.m145771a("AutoSyncMsgWorker - onSyncMsgAutoTaskSucceeded threadName:" + ((Object) str2) + ", info: " + c28615g);
                    if (AbstractC26681b.f126373r) {
                        ToastUtils.m89268p("auto sync: process=" + this.f127273c + "/" + m138579n().m110817c() + " totalMsg=" + i11);
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: I */
    public final void m138591I(boolean z11, boolean z12) {
        synchronized (this) {
            try {
                C29210k.b bVar = C29210k.Companion;
                if (bVar.m145896a().m145857Z()) {
                    C2524c.f10266a.m12642a();
                }
                if (!m138576j(z12)) {
                    return;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                this.f127280j = z11;
                if (Companion.m138598a() && !bVar.m145896a().m145878p0()) {
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ts.a

                        /* renamed from: q */
                        public final /* synthetic */ boolean f127262q;

                        public /* synthetic */ RunnableC26886a(boolean z122) {
                            r2 = z122;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26893h.m138566J(C26893h.this, r2);
                        }
                    });
                } else {
                    m138585w(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K */
    public final void m138592K() {
        synchronized (this) {
            this.f127279i = 2;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        C29199a.m145771a("AutoSyncMsgWorker - stopSyncCloudMsgAuto WORKER HAS STOPPED!!!");
        m138560A(true);
    }

    /* renamed from: L */
    public final void m138593L(List list) {
        AbstractC19074t.m100208f(list, "listMsg");
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17945a0 c17945a0 = (C17945a0) it.next();
                if (m138597u().containsKey(Integer.valueOf(c17945a0.m95041W4()))) {
                    Object obj = m138597u().get(Integer.valueOf(c17945a0.m95041W4()));
                    AbstractC19074t.m100205c(obj);
                    String str = (String) obj;
                    HashMap m138583t = m138583t();
                    Object obj2 = m138583t().get(str);
                    AbstractC19074t.m100205c(obj2);
                    m138583t.put(str, Long.valueOf(((Number) obj2).longValue() + 1));
                } else {
                    HashMap m138583t2 = m138583t();
                    Object obj3 = m138583t().get("others");
                    AbstractC19074t.m100205c(obj3);
                    m138583t2.put("others", Long.valueOf(((Number) obj3).longValue() + 1));
                }
            }
            Iterator it2 = this.f127272b.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (m138583t().containsKey(str2)) {
                    m138580o().put(str2, m138583t().get(str2));
                }
            }
            AbstractC0924m0.m3697bl(m138580o().toString());
            AbstractC0924m0.m4087ol(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public final void m138594k(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        try {
            synchronized (this) {
                try {
                    C28615g c28615g = this.f127274d;
                    if (c28615g != null && AbstractC19074t.m100204b(c28615g.m143107h(), str)) {
                        C29210k.Companion.m145896a().m145828D();
                        m138560A(false);
                    }
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ts.b

                        /* renamed from: p */
                        public final /* synthetic */ String f127263p;

                        public /* synthetic */ RunnableC26887b(String str2) {
                            r1 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C26893h.m138577l(r1);
                        }
                    });
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p */
    public final C28615g m138595p() {
        C28615g c28615g;
        synchronized (this) {
            try {
                C28615g m41684A1 = C7959d.Companion.m41850e().m41684A1("204278670");
                this.f127274d = m41684A1;
                C27363a c27363a = null;
                if (m41684A1 == null) {
                    C27363a m138578m = m138578m();
                    if (m138578m != null) {
                        C28615g c28615g2 = new C28615g("204278670", 1, 1, AbstractC23306f.m120579F1().mo124308a(), 0L, m138578m.m140201a(), m138578m.m140201a(), 0, 0, C23648e.Companion.m123930b());
                        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ts.c
                            public /* synthetic */ RunnableC26888c() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C26893h.m138581q(C28615g.this);
                            }
                        });
                        this.f127274d = c28615g2;
                        c27363a = m138578m;
                    }
                    this.f127275e = c27363a;
                } else {
                    AbstractC19074t.m100205c(m41684A1);
                    if (m41684A1.m143106g() == 1) {
                        Iterator it = C29210k.Companion.m145896a().m145867f0("204278670").iterator();
                        while (it.hasNext()) {
                            C28611c c28611c = (C28611c) it.next();
                            long j11 = c28611c.f132661d;
                            if ((j11 > 0 && j11 != C28611c.f132655k) || c28611c.f132662e > 0) {
                                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ts.d
                                    public /* synthetic */ RunnableC26889d() {
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C26893h.m138582r(C26893h.this);
                                    }
                                });
                                break;
                            }
                        }
                        this.f127274d = null;
                    }
                }
                C28615g c28615g3 = this.f127274d;
                if (c28615g3 != null) {
                    String m143104e = c28615g3.m143104e();
                    C23648e.a aVar = C23648e.Companion;
                    if (!AbstractC19074t.m100204b(m143104e, aVar.m123930b())) {
                        c28615g3.m143114o(aVar.m123930b());
                        c28615g3.m143117r(c28615g3.m143110k() + 1);
                    }
                }
                c28615g = this.f127274d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28615g;
    }

    /* renamed from: s */
    public final ArrayList m138596s() {
        return this.f127272b;
    }

    /* renamed from: u */
    public final HashMap m138597u() {
        return (HashMap) this.f127278h.getValue();
    }
}
