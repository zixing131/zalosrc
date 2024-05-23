package tn;

import ag0.C0815e1;
import ag0.C0824j;
import am.AbstractC0939u;
import android.os.Bundle;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.camera.videos.C7760a;
import com.zing.zalo.camera.videos.InterfaceC7761b;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import is.AbstractC20826v0;
import is.AbstractC20828w0;
import is.C20834z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.Job;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p107dq.InterfaceC18053i;
import p173fz.C19172a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p458qr.AbstractC25474g;
import p458qr.C25476i;
import p458qr.C25481n;
import p509sp.C26359h;
import p645xh.C29630g;
import pm0.C24848g0;
import tn.C26761p;
import tr.C26881e;
import vg.C28023b6;

/* renamed from: tn.p */
/* loaded from: classes4.dex */
public class C26761p {

    /* renamed from: g */
    static final Map f126939g = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: h */
    static final Map f126940h = new ConcurrentHashMap();

    /* renamed from: i */
    static final Map f126941i = Collections.synchronizedMap(new HashMap());

    /* renamed from: j */
    static volatile C26761p f126942j;

    /* renamed from: b */
    public long f126944b;

    /* renamed from: c */
    public long f126945c;

    /* renamed from: d */
    public long f126946d;

    /* renamed from: e */
    public boolean f126947e;

    /* renamed from: a */
    final g f126943a = new h();

    /* renamed from: f */
    private final Map f126948f = Collections.synchronizedMap(new a(20, 0.75f, true));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.p$a */
    /* loaded from: classes4.dex */
    public class a extends LinkedHashMap {
        a(int i11, float f11, boolean z11) {
            super(i11, f11, z11);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > 20) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: tn.p$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C3000l0 f126950a;

        b(C3000l0 c3000l0) {
            this.f126950a = c3000l0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42058A3(CoreUtility.f89233i, this.f126950a.f11895q);
        }
    }

    /* renamed from: tn.p$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC7761b.c {

        /* renamed from: a */
        final /* synthetic */ long f126952a;

        /* renamed from: b */
        final /* synthetic */ C3000l0 f126953b;

        c(long j11, C3000l0 c3000l0) {
            this.f126952a = j11;
            this.f126953b = c3000l0;
        }

        /* renamed from: g */
        public static /* synthetic */ String m137771g(C3000l0 c3000l0) {
            return "Compress error : feedContentId= " + c3000l0.f11895q;
        }

        /* renamed from: h */
        public static /* synthetic */ String m137772h(C3000l0 c3000l0, String str) {
            return "Compress finish : feedContentId= " + c3000l0.f11895q + ", with outputPath: " + str;
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: a */
        public void mo39571a(int i11) {
            Map map = C26761p.f126941i;
            synchronized (map) {
                try {
                    C26750h c26750h = (C26750h) map.get(Long.valueOf(this.f126952a));
                    if (c26750h != null) {
                        c26750h.m137693d(C23793c.m124316k().mo124314i());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: b */
        public void mo39572b(InterfaceC7761b interfaceC7761b) {
            C26761p c26761p;
            C26766u c26766u;
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: tn.q
                public /* synthetic */ C26762q() {
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m137771g;
                    m137771g = C26761p.c.m137771g(C3000l0.this);
                    return m137771g;
                }
            });
            try {
                try {
                    this.f126953b.m14322a0().f12023C.f12095D = false;
                    if (interfaceC7761b != null) {
                        AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[FeedAsyncManager] onError: %d, errorCode=%s, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), interfaceC7761b.mo39541e(), Long.valueOf(System.currentTimeMillis()));
                        C0815e1.m2075D().m2111i(interfaceC7761b);
                        Map map = C26761p.f126941i;
                        synchronized (map) {
                            try {
                                C26750h c26750h = (C26750h) map.remove(Long.valueOf(interfaceC7761b.mo39539c()));
                                if (c26750h != null && c26750h.m137690a() != null) {
                                    c26750h.m137690a().mo112734a(null);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        C25481n.f122071a.m131972b("POST_FEED", C26761p.this.m137740p("COMPRESS_VIDEO", this.f126953b), null);
                        this.f126953b.m14369v1(interfaceC7761b.mo39541e().m126581c());
                    } else {
                        this.f126953b.m14369v1(Integer.MIN_VALUE);
                    }
                    this.f126953b.m14286C1(-1000);
                    c26761p = C26761p.this;
                    c26766u = new C26766u(this.f126953b, c26761p.f126943a);
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    c26761p = C26761p.this;
                    c26766u = new C26766u(this.f126953b, c26761p.f126943a);
                }
                c26761p.m137766o(c26766u);
            } catch (Throwable th3) {
                C26761p c26761p2 = C26761p.this;
                c26761p2.m137766o(new C26766u(this.f126953b, c26761p2.f126943a));
                throw th3;
            }
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: c */
        public void mo39573c(InterfaceC7761b interfaceC7761b) {
            try {
                AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[FeedAsyncManager] onStartProcessing: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
                this.f126953b.m14322a0().f12023C.f12095D = true;
                C26881e.m138493d().m138511o(3, this.f126953b.f11895q);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.camera.videos.InterfaceC7761b.c
        /* renamed from: d */
        public void mo39574d(InterfaceC7761b interfaceC7761b, String str) {
            boolean containsKey;
            AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[FeedAsyncManager] onFinished: %d, curTime: %d", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(System.currentTimeMillis()));
            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: tn.r

                /* renamed from: q */
                public final /* synthetic */ String f126965q;

                public /* synthetic */ C26763r(String str2) {
                    r2 = str2;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    String m137772h;
                    m137772h = C26761p.c.m137772h(C3000l0.this, r2);
                    return m137772h;
                }
            });
            try {
                Map map = C26761p.f126941i;
                synchronized (map) {
                    try {
                        containsKey = map.containsKey(Long.valueOf(interfaceC7761b.mo39539c()));
                        C26750h c26750h = (C26750h) map.remove(Long.valueOf(interfaceC7761b.mo39539c()));
                        if (c26750h != null && c26750h.m137690a() != null) {
                            c26750h.m137690a().mo112734a(null);
                        }
                    } finally {
                    }
                }
                if (containsKey) {
                    C3020p0 m14322a0 = this.f126953b.m14322a0();
                    C3025q0 c3025q0 = m14322a0.f12023C;
                    c3025q0.f12092A.f48278r = str2;
                    c3025q0.f12093B.f88620c = str2;
                    C26761p.this.m137761i(this.f126953b);
                    C3025q0 c3025q02 = m14322a0.f12023C;
                    c3025q02.f12095D = false;
                    c3025q02.f12093B.f88630m = true;
                    C0815e1.m2075D().m2111i(interfaceC7761b);
                }
                C25481n.f122071a.m131972b("POST_FEED", C26761p.this.m137740p("COMPRESS_VIDEO", this.f126953b), null);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.p$d */
    /* loaded from: classes4.dex */
    public class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f126955a;

        d(String str) {
            this.f126955a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            Iterator it = C7960e.m41971c6().m42092D5(CoreUtility.f89233i).iterator();
            boolean z11 = false;
            while (it.hasNext() && !z11) {
                C3000l0 c3000l0 = (C3000l0) it.next();
                if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().f12057p.equals(this.f126955a)) {
                    C26761p.this.m137764l(c3000l0.f11895q);
                    z11 = true;
                }
            }
        }
    }

    /* renamed from: tn.p$e */
    /* loaded from: classes4.dex */
    public class e extends AbstractC25474g {

        /* renamed from: a */
        final /* synthetic */ C3020p0 f126957a;

        /* renamed from: b */
        final /* synthetic */ String f126958b;

        e(C3020p0 c3020p0, String str) {
            this.f126957a = c3020p0;
            this.f126958b = str;
        }

        @Override // p458qr.AbstractC25474g
        /* renamed from: a */
        public Object mo15774a() {
            C17391z c17391z = this.f126957a.f12023C.f12093B;
            if (c17391z != null) {
                AbstractC23041d2.m118208g(c17391z.f88620c);
                AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[FeedAsyncManager] clean local video file, fcid=%s, path=%s", this.f126958b, this.f126957a.f12023C.f12093B.f88620c);
                this.f126957a.f12023C.f12093B = null;
            }
            return super.mo15774a();
        }
    }

    /* renamed from: tn.p$f */
    /* loaded from: classes4.dex */
    public class f extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f126960a;

        f(String str) {
            this.f126960a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42058A3(CoreUtility.f89233i, this.f126960a);
            AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[FeedAsyncManager] removed async feed, fcid=%s", this.f126960a);
        }
    }

    /* renamed from: tn.p$g */
    /* loaded from: classes4.dex */
    public interface g {
        /* renamed from: a */
        void mo137773a(C26766u c26766u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tn.p$h */
    /* loaded from: classes4.dex */
    public final class h implements g {
        /* synthetic */ h(C26761p c26761p, AbstractC26764s abstractC26764s) {
            this();
        }

        @Override // tn.C26761p.g
        /* renamed from: a */
        public void mo137773a(C26766u c26766u) {
            C26761p.this.m137766o(c26766u);
            C26761p.this.m137758M();
        }

        private h() {
        }
    }

    private C26761p() {
        this.f126947e = false;
        m137760P(AbstractC23309i.m120922F0());
        this.f126947e = false;
    }

    /* renamed from: C */
    private void m137727C(C3000l0 c3000l0, int i11) {
        C3020p0 c3020p0;
        if (c3000l0 != null) {
            c3020p0 = c3000l0.m14322a0();
        } else {
            c3020p0 = null;
        }
        if (c3020p0 != null && c3020p0.f12058q == 22 && c3020p0.f12023C != null) {
            if (i11 == 3) {
                C26747f0.m137582I().m137666P0(c3020p0.f12023C.f12101J);
            } else if (i11 == 2) {
                C26747f0.m137582I().m137663M0(c3020p0.f12023C.f12101J);
            } else if (i11 == 5) {
                C26747f0.m137582I().m137661K0(c3020p0.f12023C.f12101J);
            }
        }
    }

    /* renamed from: J */
    private void m137728J(C26750h c26750h) {
        if (c26750h != null) {
            C7760a.f41634a.mo39563a(c26750h.m137692c().mo39539c());
            Job m137690a = c26750h.m137690a();
            if (m137690a != null) {
                m137690a.mo112734a(null);
            }
        }
    }

    /* renamed from: L */
    private void m137729L() {
        this.f126944b = 1800000L;
        this.f126945c = (long) (1800000 * 0.16d);
        this.f126946d = -1000L;
    }

    /* renamed from: N */
    private void m137730N(String str) {
        InterfaceC18053i m137767r;
        if (!TextUtils.isEmpty(str) && (m137767r = m137741q().m137767r(str)) != null) {
            m137767r.mo95944a();
        }
    }

    /* renamed from: n */
    public static void m137739n(C3000l0 c3000l0) {
        try {
            if (C26767v.m137782d().m137787f() > 0) {
                for (C3020p0 c3020p0 : c3000l0.f11899s) {
                    if (c3020p0 != null && c3020p0.m14494Y() && !TextUtils.isEmpty(c3020p0.f12040T) && m137741q().m137763k(c3020p0.f12040T)) {
                        m137741q().m137764l(c3020p0.f12040T);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p */
    public String m137740p(String str, C3000l0 c3000l0) {
        if (c3000l0 != null) {
            return str + "_" + c3000l0.f11895q;
        }
        return str;
    }

    /* renamed from: q */
    public static synchronized C26761p m137741q() {
        C26761p c26761p;
        synchronized (C26761p.class) {
            try {
                if (f126942j == null) {
                    f126942j = new C26761p();
                }
                c26761p = f126942j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c26761p;
    }

    /* renamed from: t */
    public static /* synthetic */ String m137742t() {
        return "no blending param, start upload";
    }

    /* renamed from: u */
    public static /* synthetic */ String m137743u() {
        return "video deleted";
    }

    /* renamed from: v */
    public static /* synthetic */ String m137744v(C3000l0 c3000l0) {
        return "Compress task: feedContentId= " + c3000l0.f11895q;
    }

    /* renamed from: w */
    public /* synthetic */ Boolean m137745w(InterfaceC7761b interfaceC7761b) {
        boolean z11;
        Map map = f126941i;
        synchronized (map) {
            try {
                C26750h c26750h = (C26750h) map.get(Long.valueOf(interfaceC7761b.mo39539c()));
                if (c26750h != null) {
                    if (C23793c.m124316k().mo124314i() - c26750h.m137691b() > this.f126946d) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    return Boolean.valueOf(z11);
                }
                return Boolean.FALSE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public /* synthetic */ C24848g0 m137746x(long j11, C3000l0 c3000l0, InterfaceC7761b interfaceC7761b) {
        try {
            Map map = f126941i;
            synchronized (map) {
                try {
                    if (map.containsKey(Long.valueOf(j11))) {
                        c3000l0.m14369v1(-700);
                        c3000l0.m14286C1(-1000);
                        c3000l0.m14322a0().f12023C.f12095D = false;
                        m137766o(new C26766u(c3000l0, this.f126943a));
                        map.remove(Long.valueOf(j11));
                        C7760a.f41634a.mo39563a(j11);
                        AbstractC20110a.m104543l("[VideoCompress]").mo104556o(8, "[FeedAsyncManager] manual time out task, id=%s, curTime=%s", Long.valueOf(interfaceC7761b.mo39539c()), Long.valueOf(C23793c.m124316k().mo124314i()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: y */
    public static /* synthetic */ String m137747y() {
        return "start compress task";
    }

    /* renamed from: z */
    public static /* synthetic */ int m137748z(C3000l0 c3000l0, C3000l0 c3000l02) {
        return -Long.compare(c3000l0.m14322a0().f12062u, c3000l02.m14322a0().f12062u);
    }

    /* renamed from: A */
    public void m137749A() {
        try {
            C26767v.m137782d().m137784b();
            ArrayList<C3000l0> m42092D5 = C7960e.m41971c6().m42092D5(CoreUtility.f89233i);
            if (m42092D5.size() > 0) {
                C29630g.m147299E0().m147319V0();
                ArrayList arrayList = new ArrayList();
                for (C3000l0 c3000l0 : m42092D5) {
                    if (c3000l0 != null) {
                        if (c3000l0.m14339j0() == 3) {
                            m137727C(c3000l0, 3);
                            C0824j.m2153b(new b(c3000l0));
                        } else {
                            C26767v.m137782d().m137783a(c3000l0);
                            if (c3000l0.m14339j0() == 1 || c3000l0.m14339j0() == 4) {
                                arrayList.add(c3000l0);
                            }
                        }
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    m137753F((C3000l0) arrayList.get(i11));
                }
                this.f126947e = true;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f126947e = true;
        }
    }

    /* renamed from: B */
    public int m137750B() {
        int m100600k = C19172a.m100600k("social@post_feed@limit_upload_feed", 30);
        if (m100600k < 5) {
            m100600k = 5;
        }
        if (m100600k > 1000) {
            return 1000;
        }
        return m100600k;
    }

    /* renamed from: D */
    void m137751D() {
        m137752E(null);
    }

    /* renamed from: E */
    void m137752E(Bundle bundle) {
        C20834z0.f102412a.m108927f(true);
        C23744a m124114c = C23744a.m124114c();
        Object[] objArr = new Object[1];
        if (bundle == null) {
            bundle = new Bundle();
        }
        objArr[0] = bundle;
        m124114c.m124116d(5100, objArr);
    }

    /* renamed from: F */
    public synchronized void m137753F(C3000l0 c3000l0) {
        try {
            if (c3000l0 != null) {
                try {
                    C3020p0 m14322a0 = c3000l0.m14322a0();
                    if (m14322a0 != null && m14322a0.f12058q == 17 && m14322a0.f12023C != null) {
                        C26881e.m138493d().m138506c(c3000l0.f11895q, c3000l0.m14339j0(), m14322a0.f12058q);
                        VideoBlendingParam videoBlendingParam = m14322a0.f12023C.f12092A;
                        if (videoBlendingParam == null) {
                            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: tn.i
                                @Override // en0.InterfaceC18494a
                                /* renamed from: V4 */
                                public final Object mo12V4() {
                                    String m137742t;
                                    m137742t = C26761p.m137742t();
                                    return m137742t;
                                }
                            });
                            m137761i(c3000l0);
                        } else {
                            long j11 = m14322a0.f12062u;
                            if (!TextUtils.isEmpty(videoBlendingParam.f48277q) && AbstractC23041d2.m118194A(videoBlendingParam.f48277q)) {
                                C26359h c26359h = C26359h.f125209a;
                                c26359h.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: tn.k
                                    public /* synthetic */ C26756k() {
                                    }

                                    @Override // en0.InterfaceC18494a
                                    /* renamed from: V4 */
                                    public final Object mo12V4() {
                                        String m137744v;
                                        m137744v = C26761p.m137744v(C3000l0.this);
                                        return m137744v;
                                    }
                                });
                                c cVar = new c(j11, c3000l0);
                                Map map = f126941i;
                                synchronized (map) {
                                    try {
                                        if (map.containsKey(Long.valueOf(j11))) {
                                            m137728J((C26750h) map.remove(Long.valueOf(j11)));
                                        }
                                    } finally {
                                    }
                                }
                                InterfaceC7761b mo39564b = C7760a.f41634a.mo39564b(j11, AbstractC20130d.m104830F0(), m14322a0.f12023C.f12092A, cVar, 4, null);
                                Job job = null;
                                C25481n.f122071a.m131973e("POST_FEED", m137740p("COMPRESS_VIDEO", c3000l0), null);
                                if (mo39564b != null) {
                                    if (this.f126946d >= 0) {
                                        job = AbstractC20828w0.Companion.m108854c(new InterfaceC18494a() { // from class: tn.l

                                            /* renamed from: q */
                                            public final /* synthetic */ InterfaceC7761b f126934q;

                                            public /* synthetic */ C26757l(InterfaceC7761b mo39564b2) {
                                                r2 = mo39564b2;
                                            }

                                            @Override // en0.InterfaceC18494a
                                            /* renamed from: V4 */
                                            public final Object mo12V4() {
                                                Boolean m137745w;
                                                m137745w = C26761p.this.m137745w(r2);
                                                return m137745w;
                                            }
                                        }, new InterfaceC18494a() { // from class: tn.m

                                            /* renamed from: q */
                                            public final /* synthetic */ long f126936q;

                                            /* renamed from: r */
                                            public final /* synthetic */ C3000l0 f126937r;

                                            /* renamed from: s */
                                            public final /* synthetic */ InterfaceC7761b f126938s;

                                            public /* synthetic */ C26758m(long j112, C3000l0 c3000l02, InterfaceC7761b mo39564b2) {
                                                r2 = j112;
                                                r4 = c3000l02;
                                                r5 = mo39564b2;
                                            }

                                            @Override // en0.InterfaceC18494a
                                            /* renamed from: V4 */
                                            public final Object mo12V4() {
                                                C24848g0 m137746x;
                                                m137746x = C26761p.this.m137746x(r2, r4, r5);
                                                return m137746x;
                                            }
                                        });
                                    }
                                    synchronized (map) {
                                        c26359h.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: tn.n
                                            @Override // en0.InterfaceC18494a
                                            /* renamed from: V4 */
                                            public final Object mo12V4() {
                                                String m137747y;
                                                m137747y = C26761p.m137747y();
                                                return m137747y;
                                            }
                                        });
                                        map.put(Long.valueOf(mo39564b2.mo39539c()), new C26750h(mo39564b2, C23793c.m124316k().mo124314i(), job));
                                    }
                                }
                            }
                            C26359h.f125209a.mo135685a("POST_FEED", "POST_FEED_VIDEO", new InterfaceC18494a() { // from class: tn.j
                                @Override // en0.InterfaceC18494a
                                /* renamed from: V4 */
                                public final Object mo12V4() {
                                    String m137743u;
                                    m137743u = C26761p.m137743u();
                                    return m137743u;
                                }
                            });
                            c3000l02.m14282A1(5);
                            m137766o(new C26766u(c3000l02, this.f126943a));
                        }
                    } else {
                        m137761i(c3000l02);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: G */
    public void m137754G(String str, InterfaceC18053i interfaceC18053i) {
        synchronized (this.f126948f) {
            this.f126948f.put(str, interfaceC18053i);
        }
    }

    /* renamed from: H */
    public void m137755H() {
        int m137750B = m137750B();
        ArrayList m137786e = C26767v.m137782d().m137786e();
        if (m137786e.size() >= m137750B) {
            Collections.sort(m137786e, new Comparator() { // from class: tn.o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m137748z;
                    m137748z = C26761p.m137748z((C3000l0) obj, (C3000l0) obj2);
                    return m137748z;
                }
            });
        }
        for (int i11 = 0; i11 < m137786e.size(); i11++) {
            if (i11 >= m137750B - 1) {
                m137764l(((C3000l0) m137786e.get(i11)).f11895q);
            }
        }
    }

    /* renamed from: I */
    public void m137756I() {
        ArrayList<C3000l0> m137786e = C26767v.m137782d().m137786e();
        if (m137786e != null) {
            for (C3000l0 c3000l0 : m137786e) {
                if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().m14488S()) {
                    m137764l(c3000l0.f11895q);
                }
            }
        }
    }

    /* renamed from: K */
    public void m137757K(String str) {
        try {
            AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[FeedAsyncManager] retry async feed, fcid=%s", str);
            if (!TextUtils.isEmpty(str) && !f126939g.containsKey(str)) {
                C28023b6.m141250h0().m141308Q(str);
                C3000l0 m137785c = C26767v.m137782d().m137785c(str);
                if (m137785c != null) {
                    AbstractC20826v0.m108801c(1);
                    m137785c.m14288D1();
                    C26767v.m137782d().m137788g(str);
                    m137753F(m137785c);
                    C20834z0.f102412a.m108927f(true);
                    m137752E(AbstractC20826v0.m108843x(m137785c));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: M */
    synchronized void m137758M() {
        Map map;
        try {
            map = f126939g;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (!map.isEmpty()) {
            Map map2 = f126940h;
            if (map2.size() <= 0) {
                C26766u c26766u = (C26766u) map.values().iterator().next();
                map2.put(c26766u.m137779e(), c26766u.m137779e());
                c26766u.m137781g();
            }
        }
    }

    /* renamed from: O */
    public void m137759O(String str) {
        synchronized (this.f126948f) {
            this.f126948f.remove(str);
        }
    }

    /* renamed from: P */
    public void m137760P(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("time_out", 30);
                double optDouble = jSONObject.optDouble("ratio_decrease_timeout", 0.16d);
                int optInt2 = jSONObject.optInt("time_out_video_processing", -1);
                long j11 = optInt * 60 * 1000;
                this.f126944b = j11;
                this.f126945c = (long) (optDouble * j11);
                this.f126946d = optInt2 * 1000;
            } else {
                m137729L();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            m137729L();
        }
    }

    /* renamed from: i */
    synchronized void m137761i(C3000l0 c3000l0) {
        int i11;
        try {
            if (c3000l0 != null) {
                try {
                    C25481n.f122071a.m131973e("POST_FEED", m137740p("UPLOAD_FEED", c3000l0), null);
                    C26766u c26766u = new C26766u(c3000l0, this.f126943a);
                    Map map = f126939g;
                    if (!map.containsKey(c26766u.m137779e())) {
                        map.put(c26766u.m137779e(), c26766u);
                        C26881e m138493d = C26881e.m138493d();
                        String str = c3000l0.f11895q;
                        int m14339j0 = c3000l0.m14339j0();
                        if (c3000l0.m14322a0() != null) {
                            i11 = c3000l0.m14322a0().f12058q;
                        } else {
                            i11 = 0;
                        }
                        m138493d.m138506c(str, m14339j0, i11);
                        if (c3000l0.m14339j0() == 1) {
                            AbstractC20826v0.m108801c(0);
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
            m137758M();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: j */
    public synchronized void m137762j() {
        C26766u c26766u;
        try {
            try {
                Map map = f126940h;
                if (map.size() > 0) {
                    for (String str : map.values()) {
                        if (!TextUtils.isEmpty(str) && (c26766u = (C26766u) f126939g.get(str)) != null) {
                            c26766u.m137776b();
                        }
                    }
                }
                f126939g.clear();
                C26881e.m138493d().m138508j();
                Map map2 = f126941i;
                synchronized (map2) {
                    try {
                        Iterator it = map2.values().iterator();
                        while (it.hasNext()) {
                            m137728J((C26750h) it.next());
                        }
                        f126941i.clear();
                    } finally {
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: k */
    public boolean m137763k(String str) {
        if (C26767v.m137782d().m137785c(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public synchronized void m137764l(String str) {
        C26766u c26766u;
        try {
            try {
                Map map = f126939g;
                if (map.containsKey(str) && (c26766u = (C26766u) map.get(str)) != null) {
                    c26766u.m137778d().m14282A1(5);
                }
                m137727C(C26767v.m137782d().m137785c(str), 5);
                C28023b6.m141250h0().m141308Q(str);
                C3000l0 m137785c = C26767v.m137782d().m137785c(str);
                String str2 = "";
                if (m137785c != null && m137785c.m14322a0() != null) {
                    C3020p0 m14322a0 = m137785c.m14322a0();
                    if (m14322a0.f12023C.f12093B != null) {
                        C25476i.m131959d(new e(m14322a0, str));
                    }
                    str2 = m137785c.f11904u0;
                }
                C26767v.m137782d().m137789h(str);
                C0824j.m2153b(new f(str));
                m137730N(str2);
                C20834z0.f102412a.m108927f(true);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: m */
    public synchronized void m137765m(String str) {
        try {
            Iterator it = C26767v.m137782d().m137786e().iterator();
            boolean z11 = false;
            while (it.hasNext() && !z11) {
                C3000l0 c3000l0 = (C3000l0) it.next();
                if (c3000l0 != null && c3000l0.m14322a0() != null && c3000l0.m14322a0().f12057p.equals(str)) {
                    m137764l(c3000l0.f11895q);
                    z11 = true;
                }
            }
            if (!z11) {
                C0824j.m2153b(new d(str));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: o */
    synchronized void m137766o(C26766u c26766u) {
        try {
            try {
                int m14339j0 = c26766u.m137778d().m14339j0();
                String str = c26766u.m137778d().f11895q;
                if (m14339j0 != 2) {
                    if (m14339j0 != 3) {
                        if (m14339j0 == 5) {
                            C26767v.m137782d().m137789h(str);
                            m137751D();
                        }
                    } else {
                        C26767v.m137782d().m137789h(str);
                        AbstractC23304d.f113354Z0 = true;
                        m137752E(AbstractC20826v0.m108843x(c26766u.m137778d()));
                    }
                } else {
                    AbstractC20110a.m104543l("[Flow post video]").mo104556o(8, "[FeedAsyncManager] notify feed async fail, fcid=%s", str);
                    C26767v.m137782d().m137788g(str);
                    C28023b6.m141250h0().m141302M1(MainApplication.getAppContext().getString(AbstractC8020f0.str_noti_post_feed_fail), c26766u.m137778d().f11895q, c26766u.m137778d().m14322a0().f12022B.f12280b);
                    m137751D();
                }
                f126939g.remove(c26766u.m137779e());
                f126940h.remove(c26766u.m137779e());
                C26881e.m138493d().m138509k(str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: r */
    public InterfaceC18053i m137767r(String str) {
        InterfaceC18053i interfaceC18053i;
        synchronized (this.f126948f) {
            interfaceC18053i = (InterfaceC18053i) this.f126948f.get(str);
        }
        return interfaceC18053i;
    }

    /* renamed from: s */
    public boolean m137768s() {
        if (C26767v.m137782d().m137787f() >= m137750B()) {
            return true;
        }
        return false;
    }
}
