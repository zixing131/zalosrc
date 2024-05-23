package p263jc;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import bg0.C2797c;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import dj.C17990p0;
import en0.InterfaceC18494a;
import fm0.InterfaceC19024a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import hn.C20099a;
import hn0.AbstractC20104d;
import ho0.AbstractC20110a;
import hu.C20128b;
import in.AbstractC20631e;
import in.C20629c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k30.C21459a;
import lc.EnumC22425a;
import me0.AbstractC23041d2;
import me0.AbstractC23160o0;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.InterfaceC23792b;
import on0.AbstractC24340u;
import on0.AbstractC24341v;
import p019aj.C0876j;
import p164fn.C19028b;
import p239ih.C20556f;
import p268ji.C21270p;
import p296kc.C21654a;
import p296kc.C21661h;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23310j;
import p423pi.C24759a;
import p423pi.C24760b;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p698yz.AbstractC31111g;
import p716zh.C31944h6;
import p716zh.C31973j5;
import pm.C24832c;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import zm.AbstractC32236a;

/* renamed from: jc.s */
/* loaded from: classes.dex */
public final class C21216s {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final InterfaceC23792b f103400a;

    /* renamed from: b */
    private final C0876j f103401b;

    /* renamed from: c */
    private final C7960e f103402c;

    /* renamed from: d */
    private final InterfaceC29232g f103403d;

    /* renamed from: e */
    private final InterfaceC29232g f103404e;

    /* renamed from: f */
    private final InterfaceC24854k f103405f;

    /* renamed from: g */
    private final InterfaceC24854k f103406g;

    /* renamed from: h */
    private int f103407h;

    /* renamed from: i */
    private int f103408i;

    /* renamed from: j */
    private final InterfaceC24854k f103409j;

    /* renamed from: k */
    private final InterfaceC24854k f103410k;

    /* renamed from: l */
    private final InterfaceC24854k f103411l;

    /* renamed from: m */
    private final Map f103412m;

    /* renamed from: n */
    private final AtomicBoolean f103413n;

    /* renamed from: o */
    private final InterfaceC24854k f103414o;

    /* renamed from: p */
    private final InterfaceC24854k f103415p;

    /* renamed from: q */
    private final InterfaceC24854k f103416q;

    /* renamed from: r */
    private final AtomicBoolean f103417r;

    /* renamed from: jc.s$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC23310j {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: jc.s$a$a */
        /* loaded from: classes.dex */
        public static final class C32849a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32849a f103418q = new C32849a();

            C32849a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a */
            public final C21216s mo12V4() {
                InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
                AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
                C0876j m120584H0 = AbstractC23306f.m120584H0();
                AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
                C7960e m120592K = AbstractC23306f.m120592K();
                AbstractC19074t.m100207e(m120592K, "provideDatabaseHelper(...)");
                return new C21216s(m120579F1, m120584H0, m120592K);
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(C32849a.f103418q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f103419q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24759a mo12V4() {
            C24759a.b bVar = C24759a.Companion;
            String m3855h = AbstractC0924m0.m3855h();
            AbstractC19074t.m100207e(m3855h, "getAutoDownloadMsgResourcesConfig(...)");
            return bVar.m128677c(m3855h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f103420q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24760b mo12V4() {
            return C24760b.Companion.m128699a(AbstractC0924m0.m3885i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f103421q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f103422q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2797c mo12V4() {
            return new C2797c(AbstractC0837p0.Companion.m2237f());
        }
    }

    /* renamed from: jc.s$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {
        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m109903a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m109903a() {
            C21216s.this.f103417r.set(false);
            Map map = C21216s.this.f103412m;
            AbstractC19074t.m100207e(map, "access$getAutoDownloadCacheMessages$p(...)");
            C21216s c21216s = C21216s.this;
            synchronized (map) {
                try {
                    for (C17945a0 c17945a0 : c21216s.f103412m.values()) {
                        AbstractC19074t.m100205c(c17945a0);
                        c21216s.m109872X0(c17945a0, true);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: jc.s$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {
        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m109904a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m109904a() {
            C21216s.this.f103417r.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f103425q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AtomicBoolean mo12V4() {
            return new AtomicBoolean(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$i */
    /* loaded from: classes.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final i f103426q = new i();

        i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AtomicBoolean mo12V4() {
            return new AtomicBoolean(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$j */
    /* loaded from: classes.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final j f103427q = new j();

        j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AtomicBoolean mo12V4() {
            return new AtomicBoolean(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$k */
    /* loaded from: classes.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f103428q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AtomicBoolean mo12V4() {
            return new AtomicBoolean(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$l */
    /* loaded from: classes.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final l f103429q = new l();

        l() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashSet mo12V4() {
            return new HashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.s$m */
    /* loaded from: classes.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final m f103430q = new m();

        m() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final double[][] mo12V4() {
            double[][] dArr = new double[3];
            for (int i11 = 0; i11 < 3; i11++) {
                dArr[i11] = new double[]{0.0d, 59.0d};
            }
            return dArr;
        }
    }

    public C21216s(InterfaceC23792b interfaceC23792b, C0876j c0876j, C7960e c7960e) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        InterfaceC24854k m129210a8;
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        AbstractC19074t.m100208f(c0876j, "msgRepo");
        AbstractC19074t.m100208f(c7960e, "dataBase");
        this.f103400a = interfaceC23792b;
        this.f103401b = c0876j;
        this.f103402c = c7960e;
        this.f103403d = AbstractC29233h.m145990a(b.f103419q);
        this.f103404e = AbstractC29233h.m145990a(c.f103420q);
        m129210a = AbstractC24856m.m129210a(m.f103430q);
        this.f103405f = m129210a;
        m129210a2 = AbstractC24856m.m129210a(j.f103427q);
        this.f103406g = m129210a2;
        this.f103407h = -1;
        this.f103408i = -1;
        m129210a3 = AbstractC24856m.m129210a(h.f103425q);
        this.f103409j = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(i.f103426q);
        this.f103410k = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(k.f103428q);
        this.f103411l = m129210a5;
        this.f103412m = Collections.synchronizedMap(new HashMap());
        this.f103413n = new AtomicBoolean(false);
        m129210a6 = AbstractC24856m.m129210a(e.f103422q);
        this.f103414o = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(d.f103421q);
        this.f103415p = m129210a7;
        m129210a8 = AbstractC24856m.m129210a(l.f103429q);
        this.f103416q = m129210a8;
        this.f103417r = new AtomicBoolean(false);
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        m109861N0(str);
    }

    /* renamed from: A0 */
    private final long m109769A0(C17945a0 c17945a0) {
        if (c17945a0.m95276v6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (!(m94929K2 instanceof C17990p0)) {
                return 0L;
            }
            return ((C17990p0) m94929K2).f91113B;
        }
        if (!c17945a0.m95306y8()) {
            return 0L;
        }
        C17969i0 m94929K22 = c17945a0.m94929K2();
        if (!(m94929K22 instanceof C17961f1)) {
            return 0L;
        }
        return ((C17961f1) m94929K22).m95453G();
    }

    /* renamed from: B */
    public static /* synthetic */ boolean m109770B(C21216s c21216s, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c21216s.m109850A(c17945a0, z11);
    }

    /* renamed from: B0 */
    private final List m109771B0(HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Map.Entry entry : hashMap.entrySet()) {
                m109839u((String) entry.getKey(), (ArrayList) entry.getValue(), arrayList);
            }
        } catch (Exception e11) {
            C21654a.m111575b(e11);
        }
        return arrayList;
    }

    /* renamed from: C0 */
    private final C24760b m109772C0() {
        return (C24760b) this.f103404e.getValue();
    }

    /* renamed from: D */
    public static /* synthetic */ boolean m109773D(C21216s c21216s, C17945a0 c17945a0, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return c21216s.m109851C(c17945a0, z11);
    }

    /* renamed from: E0 */
    private final void m109774E0(boolean z11) {
        if (!m109867T0() || !m109886m0().m128661w().m128683f()) {
            return;
        }
        C21654a.m111582i("getWhitelistDomain(): new whitelist " + m109886m0().m128661w(), null, false, 6, null);
        if (!m109886m0().m128661w().m128684g() || !C23055e5.m118272g(false)) {
            return;
        }
        if (z11) {
            this.f103417r.set(false);
        }
        if (this.f103417r.compareAndSet(false, true)) {
            new C20099a(m109886m0().m128661w(), new f(), new g()).m104512k();
        }
    }

    /* renamed from: F0 */
    private final HashMap m109775F0(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            ArrayList arrayList = (ArrayList) hashMap.get(c17945a0.mo95039W2());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(c17945a0);
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            hashMap.put(mo95039W2, arrayList);
        }
        return hashMap;
    }

    /* renamed from: G */
    private final boolean m109776G(C17945a0 c17945a0) {
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (!(m94929K2 instanceof C17990p0)) {
            return false;
        }
        C17990p0 c17990p0 = (C17990p0) m94929K2;
        c17945a0.m95244ra(c17990p0.f91113B);
        if (c17990p0.f91113B > m109886m0().m128647i() * ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) {
            return false;
        }
        return true;
    }

    /* renamed from: G0 */
    private final void m109777G0(String str, C17945a0 c17945a0, boolean z11) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: jc.c

            /* renamed from: q */
            public final /* synthetic */ boolean f103364q;

            /* renamed from: r */
            public final /* synthetic */ C21216s f103365r;

            /* renamed from: s */
            public final /* synthetic */ String f103366s;

            public /* synthetic */ RunnableC21200c(boolean z112, C21216s this, String str2) {
                r2 = z112;
                r3 = this;
                r4 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109779H0(C17945a0.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: H */
    private final boolean m109778H(C17945a0 c17945a0) {
        if (c17945a0.m95276v6()) {
            return m109776G(c17945a0);
        }
        if (c17945a0.m95306y8()) {
            return m109795Z(c17945a0);
        }
        return true;
    }

    /* renamed from: H0 */
    public static final void m109779H0(C17945a0 c17945a0, boolean z11, C21216s c21216s, String str) {
        int i11;
        AbstractC19074t.m100208f(c17945a0, "$msg");
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(str, "$currentUserUid");
        if (AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
            if (c17945a0.f90764y2) {
                c17945a0.m95093ba(c17945a0.m94983Q3(), "", c17945a0.f90768z2, true, new SensitiveData("gallery_save_video_detail", "video_download", null, 4, null));
                c17945a0.f90768z2 = false;
            }
            c17945a0.m95140g2(c17945a0.m94983Q3(), z11);
            c17945a0.m95183l2();
            return;
        }
        c17945a0.m95068Z0();
        if (c17945a0.m94847A6()) {
            i11 = 5;
        } else {
            i11 = 0;
        }
        if (ZMediaPlayer.cacheValidate(ZMediaPlayerSettings.getCacheDir(i11), c17945a0.m95293x2()) > 0) {
            if (c21216s.m109883j0(c17945a0) == null) {
                C21661h.f105066a.m111635x(c17945a0, EnumC22425a.f109727r);
            }
            c21216s.m109844w1(str, c17945a0, i11, z11);
        } else {
            if (c17945a0.m95107d3() != 4) {
                c17945a0.m95165ic(4, true);
            }
            if (m109770B(c21216s, c17945a0, false, 2, null)) {
                c21216s.m109834s0().mo13474a(new Runnable() { // from class: jc.e

                    /* renamed from: q */
                    public final /* synthetic */ String f103370q;

                    /* renamed from: r */
                    public final /* synthetic */ C17945a0 f103371r;

                    public /* synthetic */ RunnableC21202e(String str2, C17945a0 c17945a02) {
                        r2 = str2;
                        r3 = c17945a02;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C21216s.m109780I0(C21216s.this, r2, r3);
                    }
                });
            }
            c21216s.m109880h0(c17945a02, z11);
        }
    }

    /* renamed from: I0 */
    public static final void m109780I0(C21216s c21216s, String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(str, "$currentUserUid");
        AbstractC19074t.m100208f(c17945a0, "$msg");
        c21216s.f103402c.m42534s9(str, c17945a0);
    }

    /* renamed from: J */
    private final boolean m109781J(C17945a0 c17945a0, boolean z11) {
        if (!m109792V(c17945a0) || !m109778H(c17945a0)) {
            return false;
        }
        if (z11 || !AbstractC31111g.m151132m(m109830q0(this, false, 1, null), c17945a0.m94974P4(), m109837t0())) {
            return true;
        }
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C21654a.m111582i("Check input condition: msg expired CliID=" + m95029V3.m41044h() + ", GloID=" + m95029V3.m41046j() + ", OwnerID=" + m95029V3.m41048l() + ", SenderID=" + m95029V3.m41050n(), null, false, 6, null);
        return false;
    }

    /* renamed from: K0 */
    public static final void m109782K0(C21216s c21216s, MessageId messageId, String str, long j11, long j12) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(messageId, "$needToLoadMsgId");
        AbstractC19074t.m100208f(str, "$currentUserUid");
        C17945a0 m2635r = c21216s.f103401b.m2635r(messageId);
        if (m2635r == null) {
            return;
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: jc.h

            /* renamed from: q */
            public final /* synthetic */ String f103381q;

            /* renamed from: r */
            public final /* synthetic */ C17945a0 f103382r;

            /* renamed from: s */
            public final /* synthetic */ long f103383s;

            /* renamed from: t */
            public final /* synthetic */ long f103384t;

            public /* synthetic */ RunnableC21205h(String str2, C17945a0 m2635r2, long j112, long j122) {
                r2 = str2;
                r3 = m2635r2;
                r4 = j112;
                r6 = j122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109783L0(C21216s.this, r2, r3, r4, r6);
            }
        });
    }

    /* renamed from: L0 */
    public static final void m109783L0(C21216s c21216s, String str, C17945a0 c17945a0, long j11, long j12) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(str, "$currentUserUid");
        AbstractC19074t.m100208f(c17945a0, "$messageInDb");
        c21216s.m109871X(str, c17945a0, j11, j12, false);
    }

    /* renamed from: M */
    public static final void m109784M() {
        AbstractC20631e.Companion.m107520w(AbstractC20631e.e.f101523q);
    }

    /* renamed from: O */
    public static final void m109785O() {
        AbstractC20631e.Companion.m107520w(AbstractC20631e.e.f101522p);
    }

    /* renamed from: O0 */
    private final void m109786O0(C17945a0 c17945a0, boolean z11) {
        C19028b m100098b = C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94843p, false, false, 6, null);
        if (c17945a0.m95306y8()) {
            c17945a0.m94970Ob(m100098b, z11);
        } else {
            c17945a0.m94980Pb(m100098b, z11);
        }
    }

    /* renamed from: P0 */
    private final void m109787P0(List list) {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: jc.d

            /* renamed from: p */
            public final /* synthetic */ List f103367p;

            /* renamed from: q */
            public final /* synthetic */ C21216s f103368q;

            public /* synthetic */ RunnableC21201d(List list2, C21216s this) {
                r1 = list2;
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109789Q0(r1, r2);
            }
        });
    }

    /* renamed from: Q */
    public static final void m109788Q() {
        AbstractC20631e.Companion.m107520w(AbstractC20631e.e.f101526t);
    }

    /* renamed from: Q0 */
    public static final void m109789Q0(List list, C21216s c21216s) {
        AbstractC19074t.m100208f(list, "$downloadList");
        AbstractC19074t.m100208f(c21216s, "this$0");
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            C0876j c0876j = c21216s.f103401b;
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            C17945a0 m2636s = c0876j.m2636s(m95029V3);
            if (m2636s != null) {
                m2636s.m95308yb(c17945a0.m95020U4());
                c17945a0 = m2636s;
            }
            if (!(true ^ m109770B(c21216s, c17945a0, false, 2, null))) {
                if (c17945a0.m95020U4() == EnumC22425a.f109726q) {
                    arrayList.add(c17945a0);
                }
                c21216s.m109838t1(c17945a0, false);
            }
        }
        c21216s.f103413n.set(true);
        C21661h.f105066a.m111633R(arrayList);
        C21654a.m111582i("insertOldMsgListToDownloadQueue(): list size = " + list.size() + " - executed in (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)", null, false, 6, null);
    }

    /* renamed from: S */
    public static final void m109790S() {
        AbstractC20631e.Companion.m107520w(AbstractC20631e.e.f101524r);
    }

    /* renamed from: U */
    public static final void m109791U() {
        AbstractC20631e.Companion.m107520w(AbstractC20631e.e.f101525s);
    }

    /* renamed from: V */
    private final boolean m109792V(C17945a0 c17945a0) {
        int m109888n0 = m109888n0(c17945a0);
        c17945a0.m95254sa(m109888n0);
        if ((m109886m0().m128649k() & m109888n0) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private final boolean m109793W(C17945a0 c17945a0) {
        C31973j5 c31973j5;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        int m109889o0 = m109889o0(mo95039W2);
        if ((m109886m0().m128659u() & m109889o0) == 0) {
            return false;
        }
        if (m109889o0 != 16) {
            return true;
        }
        ContactProfile contactProfile = new ContactProfile(c17945a0.mo95039W2());
        if (contactProfile.m40374K0()) {
            c31973j5 = contactProfile.m40389U();
        } else {
            c31973j5 = null;
        }
        if (c31973j5 == null) {
            return false;
        }
        int m153732O = c31973j5.m153732O();
        if ((!m109873Y0(c17945a0) || m153732O > m109886m0().m128643e()) && ((!c17945a0.m95306y8() || m153732O > m109886m0().m128644f()) && ((!c17945a0.m95276v6() || m153732O > m109886m0().m128642d()) && !c17945a0.m95316z8()))) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    private final List m109794Y(String str, List list) {
        List m131502j;
        if (!m109886m0().m128636B()) {
            C21654a.m111582i("checkTriggerRolledItemCleaner(): OFF config", null, false, 6, null);
            return new ArrayList(list);
        }
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17945a0 c17945a0 = (C17945a0) it.next();
                if (c17945a0.m94974P4() > 0 && AbstractC31111g.m151132m(m109830q0(this, false, 1, null), c17945a0.m94974P4(), m109837t0())) {
                    arrayList.add(c17945a0);
                } else {
                    arrayList2.add(c17945a0);
                }
            }
            m109831q1(str, arrayList);
            m109847y1(arrayList);
            return arrayList2;
        } catch (Exception e11) {
            C21654a.m111575b(e11);
            C21654a.f105046a.m111590o(e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: Z */
    private final boolean m109795Z(C17945a0 c17945a0) {
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (!(m94929K2 instanceof C17961f1)) {
            return false;
        }
        C17961f1 c17961f1 = (C17961f1) m94929K2;
        if (c17961f1.m95453G() == 0) {
            return false;
        }
        c17945a0.m95244ra(c17961f1.m95453G());
        if (c17961f1.m95453G() > m109886m0().m128648j() * ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) {
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    private final int m109797a0(int i11) {
        double m104527c;
        m104527c = AbstractC20104d.m104527c(i11 & (-i11));
        return ((int) m104527c) - 1;
    }

    /* renamed from: a1 */
    private final void m109798a1(String str) {
        m109846y0().add(str);
    }

    /* renamed from: b0 */
    private final List m109800b0(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            Iterator it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C17945a0 c17945a02 = (C17945a0) it2.next();
                    if (AbstractC19074t.m100204b(c17945a0.m95029V3(), c17945a02.m95029V3())) {
                        c17945a0.m95300xb(c17945a02.m95012T4());
                        c17945a0.m95308yb(c17945a02.m95020U4());
                        break;
                    }
                }
            }
        }
        return list;
    }

    /* renamed from: c0 */
    private final void m109802c0(C17945a0 c17945a0, int i11, boolean z11) {
        try {
            String m95169j5 = c17945a0.m95169j5(c17945a0.m95293x2());
            AbstractC19074t.m100207e(m95169j5, "getVideoMsgAutoDownloadPath(...)");
            if (ZMediaPlayer.cloneVideoFromCache(ZMediaPlayerSettings.getVideoConfig(i11), ZMediaPlayerSettings.getCacheDir(i11), c17945a0.m95293x2(), m95169j5)) {
                c17945a0.m94934Ka(m95169j5);
                c17945a0.m95114dc(m95169j5);
                c17945a0.m95140g2(m95169j5, z11);
                c17945a0.m95183l2();
                if (c17945a0.f90764y2) {
                    c17945a0.m95093ba(m95169j5, "", c17945a0.f90768z2, true, new SensitiveData("gallery_save_video_detail", "video_download", null, 4, null));
                    c17945a0.f90768z2 = false;
                }
            } else {
                c17945a0.m95116e2(z11);
                c17945a0.m95175k2();
                if (c17945a0.f90764y2) {
                    c17945a0.m95190l9(c17945a0.f90768z2, 4, null);
                    c17945a0.f90764y2 = false;
                    c17945a0.f90768z2 = false;
                }
            }
        } catch (Exception e11) {
            C21654a.m111575b(e11);
            c17945a0.m95116e2(z11);
            c17945a0.m95175k2();
            if (c17945a0.f90764y2) {
                c17945a0.m95190l9(c17945a0.f90768z2, 1, e11);
                c17945a0.f90764y2 = false;
                c17945a0.f90768z2 = false;
            }
        }
    }

    /* renamed from: c1 */
    public static final void m109803c1(C17945a0 c17945a0, C21216s c21216s, String str) {
        AbstractC19074t.m100208f(c17945a0, "$msg");
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(str, "$currentUserUid");
        C21661h.f105066a.m111635x(c17945a0, c17945a0.m95020U4());
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C21654a.m111582i("Add into Auto DL queue: CliID=" + m95029V3.m41044h() + ", GloID=" + m95029V3.m41046j() + ", OwnerID=" + m95029V3.m41048l() + ", SenderID=" + m95029V3.m41050n(), C21654a.a.f105047p, false, 4, null);
        c21216s.f103402c.m42534s9(str, c17945a0);
    }

    /* renamed from: d0 */
    private final String m109805d0(Map map) {
        List m131185M0;
        synchronized (map) {
            m131185M0 = AbstractC25332a0.m131185M0(map.values());
        }
        int size = m131185M0.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            C17945a0 c17945a0 = (C17945a0) m131185M0.get(i15);
            if (m109873Y0(c17945a0)) {
                i11++;
            } else if (c17945a0.m95306y8()) {
                i14++;
            } else if (c17945a0.m95276v6()) {
                i13++;
            } else if (c17945a0.m95316z8()) {
                i12++;
            }
        }
        return "photo " + i11 + " - voice " + i12 + " - file " + i13 + " - video " + i14;
    }

    /* renamed from: e0 */
    private final void m109807e0(Integer[][] numArr, int i11, int i12, int i13, long j11) {
        m109849z0()[i12][0] = ((i13 + j11) % r5) * (60.0d / numArr[i12][i11].intValue());
    }

    /* renamed from: f1 */
    public static final void m109809f1(String str, C21216s c21216s, boolean z11) {
        AbstractC19074t.m100208f(str, "$currentUserUid");
        AbstractC19074t.m100208f(c21216s, "this$0");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                C21654a.m111582i("> Different user uid!", C21654a.a.f105049r, false, 4, null);
                return;
            }
            if (!c21216s.m109865S0()) {
                c21216s.f103402c.m42418i0(EnumC22425a.f109726q);
                C21654a.m111582i("> Not enable Auto Download flag! All Auto DL items cleared. (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)", C21654a.a.f105049r, false, 4, null);
            }
            List m42464m7 = c21216s.f103402c.m42464m7(str, "");
            AbstractC19074t.m100207e(m42464m7, "getWaitingDownloadMsgListFromDB(...)");
            String str2 = "Loaded " + m42464m7.size() + " items from DB. (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)";
            C21654a.a aVar = C21654a.a.f105047p;
            C21654a.m111582i(str2, aVar, false, 4, null);
            if (m42464m7.isEmpty()) {
                c21216s.f103413n.set(true);
                return;
            }
            List m109794Y = c21216s.m109794Y(str, m42464m7);
            C21654a.m111582i("> Filtered rolled, remain " + m109794Y.size() + " items. (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)", null, false, 6, null);
            List m109771B0 = c21216s.m109771B0(c21216s.m109775F0(m109794Y));
            C21654a.m111582i("> Mapped original msg data of " + m109771B0.size() + " items. (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)", null, false, 6, null);
            List m109811g0 = c21216s.m109811g0(str, m109771B0, z11);
            C21654a.m111582i("> Filtered unavailable msg, remain " + m109811g0.size() + " items. (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)", null, false, 6, null);
            c21216s.m109787P0(m109811g0);
            C21654a.m111582i("Loaded " + m109811g0.size() + " items into download queue. (" + (System.currentTimeMillis() - currentTimeMillis) + " ms)", aVar, false, 4, null);
            C21654a.m111583l(C21654a.f105046a, currentTimeMillis, System.currentTimeMillis(), null, 4, null);
        } catch (Exception e11) {
            C21654a.m111575b(e11);
            C21654a.f105046a.m111588k(currentTimeMillis, System.currentTimeMillis(), e11);
        }
    }

    /* renamed from: g0 */
    private final List m109811g0(String str, List list, boolean z11) {
        boolean m109781J;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (!c17945a0.m95219o8() && !c17945a0.m95091b6() && !c17945a0.m94959N6()) {
                if (AbstractC23041d2.m118194A(c17945a0.m94983Q3())) {
                    arrayList3.add(c17945a0);
                } else if (m109886m0().m128636B() && AbstractC31111g.m151132m(m109830q0(this, false, 1, null), c17945a0.m94974P4(), m109837t0())) {
                    arrayList4.add(c17945a0);
                } else {
                    if (c17945a0.m95020U4() == EnumC22425a.f109726q) {
                        if (z11) {
                            m109781J = m109851C(c17945a0, true);
                        } else {
                            m109781J = m109781J(c17945a0, true);
                        }
                        if (!m109781J) {
                            C17945a0 c17945a02 = (C17945a0) this.f103412m.remove(c17945a0.m95029V3());
                            if (c17945a02 != null) {
                                c17945a02.m95068Z0();
                                arrayList5.add(c17945a0);
                            }
                        }
                    }
                    arrayList.add(c17945a0);
                }
            } else {
                arrayList2.add(c17945a0);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(arrayList2);
        arrayList6.addAll(arrayList3);
        arrayList6.addAll(arrayList4);
        arrayList6.addAll(arrayList5);
        if (!arrayList6.isEmpty()) {
            if (!arrayList2.isEmpty()) {
                C21654a.m111582i("> Filter: deleteUndoListSize=" + arrayList2.size(), null, false, 6, null);
            }
            if (!arrayList3.isEmpty()) {
                C21654a.m111582i("> Filter: hasLocalFileListSize=" + arrayList3.size(), null, false, 6, null);
            }
            if (!arrayList4.isEmpty()) {
                C21654a.m111582i("> Filter: rolledListSize=" + arrayList4.size(), null, false, 6, null);
            }
            if (!arrayList5.isEmpty()) {
                C21654a.m111582i("> Filter: failConditionListSize=" + arrayList5.size(), null, false, 6, null);
            }
        }
        m109831q1(str, arrayList6);
        C21661h c21661h = C21661h.f105066a;
        c21661h.m111631N(arrayList2);
        c21661h.m111637z(arrayList3, C21270p.a.f103625r);
        m109847y1(arrayList4);
        return arrayList;
    }

    /* renamed from: h1 */
    public static final void m109813h1(C21216s c21216s, C17945a0 c17945a0, String str, C21270p.a aVar) {
        EnumC22425a enumC22425a;
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$msg");
        AbstractC19074t.m100208f(str, "$currentUserId");
        C17945a0 c17945a02 = (C17945a0) c21216s.f103412m.remove(c17945a0.m95029V3());
        C17945a0 m42218O4 = c21216s.f103402c.m42218O4(str, c17945a0);
        EnumC22425a enumC22425a2 = null;
        if (m42218O4 != null) {
            c21216s.f103402c.m42247Qc(str, c17945a0);
        } else {
            m42218O4 = null;
        }
        if (aVar != null) {
            if (c17945a02 == null || (enumC22425a = c17945a02.m95020U4()) == null) {
                if (m42218O4 != null) {
                    enumC22425a2 = m42218O4.m95020U4();
                }
                if (enumC22425a2 == null) {
                    enumC22425a = c17945a0.m95020U4();
                } else {
                    enumC22425a = enumC22425a2;
                }
            }
            AbstractC19074t.m100205c(enumC22425a);
            if (enumC22425a == EnumC22425a.f109728s) {
                C21661h.f105066a.m111630H(c17945a0, aVar);
            } else {
                C21661h.f105066a.m111629G(c17945a0, aVar, enumC22425a);
            }
        }
    }

    /* renamed from: j1 */
    public static final void m109816j1(C21216s c21216s, C17945a0 c17945a0, String str) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$msg");
        AbstractC19074t.m100208f(str, "$currentUserId");
        c21216s.f103412m.remove(c17945a0.m95029V3());
        c21216s.f103402c.m42247Qc(str, c17945a0);
    }

    /* renamed from: l0 */
    private final C2797c m109819l0() {
        return (C2797c) this.f103415p.getValue();
    }

    /* renamed from: l1 */
    public static final void m109820l1(C21216s c21216s, List list) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(list, "$msgList");
        ArrayList arrayList = new ArrayList();
        Map map = c21216s.f103412m;
        AbstractC19074t.m100207e(map, "autoDownloadCacheMessages");
        synchronized (map) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C17945a0 c17945a0 = (C17945a0) it.next();
                    C17945a0 c17945a02 = (C17945a0) c21216s.f103412m.remove(c17945a0.m95029V3());
                    if (c17945a02 != null) {
                        c17945a02.m95068Z0();
                        arrayList.add(c17945a0);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c21216s.m109825o1(arrayList);
    }

    /* renamed from: n1 */
    public static final void m109823n1(C21216s c21216s, String str) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(str, "$threadId");
        ArrayList arrayList = new ArrayList();
        Map map = c21216s.f103412m;
        AbstractC19074t.m100207e(map, "autoDownloadCacheMessages");
        synchronized (map) {
            try {
                Map map2 = c21216s.f103412m;
                AbstractC19074t.m100207e(map2, "autoDownloadCacheMessages");
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Object value = ((Map.Entry) it.next()).getValue();
                    if (!AbstractC19074t.m100204b(((C17945a0) value).mo95039W2(), str)) {
                        value = null;
                    }
                    C17945a0 c17945a0 = (C17945a0) value;
                    if (c17945a0 != null) {
                        it.remove();
                        c17945a0.m95068Z0();
                        arrayList.add(c17945a0);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c21216s.m109825o1(arrayList);
    }

    /* renamed from: o1 */
    private final void m109825o1(List list) {
        m109834s0().mo13474a(new Runnable() { // from class: jc.b

            /* renamed from: q */
            public final /* synthetic */ List f103362q;

            public /* synthetic */ RunnableC21199b(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109828p1(C21216s.this, r2);
            }
        });
    }

    /* renamed from: p0 */
    private final long m109827p0(boolean z11) {
        if (AbstractC32236a.m155477c()) {
            return System.currentTimeMillis();
        }
        if (z11) {
            return this.f103400a.mo124310e();
        }
        return this.f103400a.mo124314i();
    }

    /* renamed from: p1 */
    public static final void m109828p1(C21216s c21216s, List list) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        AbstractC19074t.m100208f(list, "$removedMessages");
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        c21216s.m109831q1(str, list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21654a.m111582i("Remove item from DB after delete msg: " + ((C17945a0) it.next()).m95029V3(), null, false, 6, null);
        }
        C21661h.f105066a.m111631N(list);
    }

    /* renamed from: q0 */
    static /* synthetic */ long m109830q0(C21216s c21216s, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return c21216s.m109827p0(z11);
    }

    /* renamed from: q1 */
    private final void m109831q1(String str, List list) {
        List m131195U;
        m131195U = AbstractC25332a0.m131195U(list, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        Iterator it = m131195U.iterator();
        while (it.hasNext()) {
            this.f103402c.m42258Rc(str, (List) it.next());
        }
    }

    /* renamed from: s0 */
    private final C2797c m109834s0() {
        return (C2797c) this.f103414o.getValue();
    }

    /* renamed from: s1 */
    private final void m109835s1() {
        for (double[] dArr : m109849z0()) {
            dArr[0] = 0.0d;
            dArr[1] = 59.0d;
        }
    }

    /* renamed from: t0 */
    private final int m109837t0() {
        Integer valueOf = Integer.valueOf(AbstractC0924m0.m3389R4());
        if (valueOf.intValue() < 10) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 10;
        }
        return valueOf.intValue();
    }

    /* renamed from: t1 */
    private final void m109838t1(C17945a0 c17945a0, boolean z11) {
        if (m109867T0() && !m109872X0(c17945a0, z11)) {
            return;
        }
        if (c17945a0.m95276v6()) {
            if (c17945a0.m95107d3() != 4) {
                c17945a0.m95165ic(4, false);
            }
            c17945a0.m95017Tb();
        } else if (c17945a0.m95306y8() && c17945a0.m95020U4() == EnumC22425a.f109727r) {
            if (c17945a0.m95107d3() != 4) {
                c17945a0.m95165ic(4, true);
            }
            c17945a0.m94970Ob(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94844q, false, false, 6, null), false);
        } else {
            if (c17945a0.m95107d3() != 4) {
                c17945a0.m95165ic(4, true);
            }
            c17945a0.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94844q, false, false, 6, null), false);
        }
    }

    /* renamed from: u */
    private final void m109839u(String str, List list, List list2) {
        List<List> m131195U;
        m131195U = AbstractC25332a0.m131195U(list, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        for (List list3 : m131195U) {
            list2.addAll(m109800b0(C7956b.Companion.m41573b().m41559t(str, list3), list3));
        }
    }

    /* renamed from: u0 */
    private final AtomicBoolean m109840u0() {
        return (AtomicBoolean) this.f103409j.getValue();
    }

    /* renamed from: v0 */
    private final AtomicBoolean m109841v0() {
        return (AtomicBoolean) this.f103410k.getValue();
    }

    /* renamed from: w */
    private final void m109842w(String str, int i11, int i12) {
        Long m127109o;
        int length;
        int length2;
        int i13;
        int i14;
        if (str.length() != 0) {
            m127109o = AbstractC24340u.m127109o(str);
            if (m127109o == null) {
                return;
            }
            this.f103407h = i11;
            Integer[][] m128646h = m109886m0().m128646h();
            if (m128646h == null) {
                length = -1;
            } else {
                length = m128646h.length;
            }
            if (m128646h == null) {
                length2 = -1;
            } else if (length == 0) {
                length2 = 0;
            } else {
                length2 = m128646h[0].length;
            }
            if (m128646h == null) {
                i13 = -1;
            } else if (length != 0 && length >= 2) {
                i13 = m128646h[1].length;
            } else {
                i13 = 0;
            }
            if (m128646h == null) {
                i14 = -1;
            } else if (length != 0 && length >= 3) {
                i14 = m128646h[2].length;
            } else {
                i14 = 0;
            }
            if (m128646h.length == 0) {
                m109835s1();
                return;
            }
            int i15 = 0;
            while (i15 < 3) {
                try {
                    int i16 = i15;
                    m109807e0(m128646h, i11, i15, i12, Long.parseLong(str));
                    i15 = i16 + 1;
                } catch (NullPointerException e11) {
                    AbstractC20110a.f98889a.mo104553f(e11, "Config size = " + length + ", photo size = " + length2 + ", video size = " + i13 + ", file size = " + i14, new Object[0]);
                    throw e11;
                }
            }
        }
    }

    /* renamed from: w0 */
    private final AtomicBoolean m109843w0() {
        return (AtomicBoolean) this.f103406g.getValue();
    }

    /* renamed from: w1 */
    private final void m109844w1(String str, C17945a0 c17945a0, int i11, boolean z11) {
        c17945a0.m95165ic(5, true);
        m109802c0(c17945a0, i11, z11);
        m109879g1(str, c17945a0, C21270p.a.f103626s);
    }

    /* renamed from: x0 */
    private final AtomicBoolean m109845x0() {
        return (AtomicBoolean) this.f103411l.getValue();
    }

    /* renamed from: y0 */
    private final HashSet m109846y0() {
        return (HashSet) this.f103416q.getValue();
    }

    /* renamed from: y1 */
    private final void m109847y1(ArrayList arrayList) {
        C21661h.f105066a.m111628F(arrayList);
        C21654a.f105046a.m111589n(arrayList);
    }

    /* renamed from: z */
    public static final void m109848z(C21216s c21216s) {
        AbstractC19074t.m100208f(c21216s, "this$0");
        Map map = c21216s.f103412m;
        AbstractC19074t.m100207e(map, "autoDownloadCacheMessages");
        synchronized (map) {
            try {
                ArrayList arrayList = new ArrayList();
                Map map2 = c21216s.f103412m;
                AbstractC19074t.m100207e(map2, "autoDownloadCacheMessages");
                for (Map.Entry entry : map2.entrySet()) {
                    MessageId messageId = (MessageId) entry.getKey();
                    C17945a0 c17945a0 = (C17945a0) entry.getValue();
                    C24759a m109886m0 = c21216s.m109886m0();
                    AbstractC19074t.m100205c(c17945a0);
                    if (m109886m0.m128637C(c17945a0)) {
                        Boolean m95127f1 = c17945a0.m95127f1();
                        AbstractC19074t.m100205c(m95127f1);
                        if (m95127f1.booleanValue()) {
                            C21654a.m111582i("cancelWaitingDownloadFileAndVideo(): CliID=" + messageId.m41044h() + ", GloID=" + messageId.m41046j() + ", OwnerID=" + messageId.m41048l() + ", SenderID=" + messageId.m41050n(), null, false, 6, null);
                            c21216s.f103402c.m42247Qc(CoreUtility.f89233i, c17945a0);
                            arrayList.add(messageId);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c21216s.f103412m.remove((MessageId) it.next());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c21216s.m109846y0().clear();
    }

    /* renamed from: z0 */
    private final double[][] m109849z0() {
        return (double[][]) this.f103405f.getValue();
    }

    /* renamed from: A */
    public final boolean m109850A(C17945a0 c17945a0, boolean z11) {
        Object obj;
        AbstractC19074t.m100208f(c17945a0, "msg");
        Map map = this.f103412m;
        AbstractC19074t.m100207e(map, "autoDownloadCacheMessages");
        synchronized (map) {
            try {
                obj = this.f103412m.get(c17945a0.m95029V3());
                if (obj == null && z11) {
                    Map map2 = this.f103412m;
                    AbstractC19074t.m100207e(map2, "autoDownloadCacheMessages");
                    map2.put(c17945a0.m95029V3(), c17945a0);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m109851C(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C21654a.m111582i("Check input condition: CliID=" + m95029V3.m41044h() + ", GloID=" + m95029V3.m41046j() + ", OwnerID=" + m95029V3.m41048l() + ", SenderID=" + m95029V3.m41050n(), null, false, 6, null);
        if (!m109781J(c17945a0, z11) || !m109793W(c17945a0)) {
            return false;
        }
        return true;
    }

    /* renamed from: D0 */
    public final List m109852D0(String str, String str2, EnumC22425a enumC22425a) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(enumC22425a, "downloadType");
        if (this.f103413n.get()) {
            ArrayList arrayList = new ArrayList();
            Map map = this.f103412m;
            AbstractC19074t.m100207e(map, "autoDownloadCacheMessages");
            synchronized (map) {
                try {
                    Map map2 = this.f103412m;
                    AbstractC19074t.m100207e(map2, "autoDownloadCacheMessages");
                    for (Map.Entry entry : map2.entrySet()) {
                        if (((C17945a0) entry.getValue()).m95020U4() == enumC22425a) {
                            if (str2.length() != 0 && !AbstractC19074t.m100204b(((C17945a0) entry.getValue()).mo95039W2(), str2)) {
                            }
                            arrayList.add(entry.getValue());
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return arrayList;
        }
        List m42464m7 = this.f103402c.m42464m7(str, str2);
        AbstractC19074t.m100207e(m42464m7, "getWaitingDownloadMsgListFromDB(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : m42464m7) {
            if (((C17945a0) obj).m95020U4() == enumC22425a) {
                arrayList2.add(obj);
            }
        }
        return m109771B0(m109775F0(arrayList2));
    }

    /* renamed from: E */
    public final int m109853E(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!m109886m0().m128639a(c17945a0)) {
            return 1;
        }
        if (!m109793W(c17945a0)) {
            return 2;
        }
        if (!m109792V(c17945a0)) {
            return 3;
        }
        if (!m109778H(c17945a0)) {
            return 4;
        }
        if (C21459a.m111034b(C20128b.m104760g()) < m109886m0().m128658t()) {
            return 5;
        }
        return 0;
    }

    /* renamed from: F */
    public final void m109854F(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        m109798a1(c17945a0.m95029V3().toString());
        c17945a0.m94891Fa(true);
        m109777G0(str, c17945a0, true);
    }

    /* renamed from: I */
    public final boolean m109855I(C17945a0 c17945a0) {
        int i11;
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!C23055e5.m118273h(false, 1, null)) {
            return false;
        }
        if (C23055e5.m118270e()) {
            i11 = 1;
        } else {
            i11 = 2;
        }
        if ((!c17945a0.m95316z8() || (m109886m0().m128653o() & i11) <= 0) && ((!m109873Y0(c17945a0) || (m109886m0().m128651m() & i11) <= 0) && ((!c17945a0.m95306y8() || (m109886m0().m128652n() & i11) <= 0) && (!c17945a0.m95276v6() || (m109886m0().m128650l() & i11) <= 0)))) {
            return false;
        }
        return true;
    }

    /* renamed from: J0 */
    public final void m109856J0(String str, MessageId messageId, long j11, long j12) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(messageId, "needToLoadMsgId");
        m109819l0().mo13474a(new Runnable() { // from class: jc.f

            /* renamed from: q */
            public final /* synthetic */ MessageId f103373q;

            /* renamed from: r */
            public final /* synthetic */ String f103374r;

            /* renamed from: s */
            public final /* synthetic */ long f103375s;

            /* renamed from: t */
            public final /* synthetic */ long f103376t;

            public /* synthetic */ RunnableC21203f(MessageId messageId2, String str2, long j112, long j122) {
                r2 = messageId2;
                r3 = str2;
                r4 = j112;
                r6 = j122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109782K0(C21216s.this, r2, r3, r4, r6);
            }
        });
    }

    /* renamed from: K */
    public final void m109857K() {
        long m109827p0 = m109827p0(false);
        int m119282q0 = AbstractC23160o0.m119282q0(m109827p0);
        if (m119282q0 == this.f103407h) {
            return;
        }
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        m109842w(str, m119282q0, AbstractC23160o0.m119231Z(m109827p0));
    }

    /* renamed from: L */
    public final void m109858L() {
        if (!m109840u0().get()) {
            return;
        }
        m109840u0().set(false);
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: jc.a
            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109784M();
            }
        });
    }

    /* renamed from: M0 */
    public final void m109859M0(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "configString");
        C21654a.m111582i("handleServerConfig(): " + str, C21654a.a.f105047p, false, 4, null);
        AbstractC0924m0.m3282Nd(str);
        this.f103403d.reset();
        m109774E0(z11);
        if (z11) {
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            m109877e1(str2, true);
        }
    }

    /* renamed from: N */
    public final void m109860N() {
        if (!m109841v0().get()) {
            return;
        }
        m109841v0().set(false);
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: jc.r
            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109785O();
            }
        });
    }

    /* renamed from: N0 */
    public final void m109861N0(String str) {
        AbstractC19074t.m100208f(str, "currentUserId");
        long m109827p0 = m109827p0(false);
        m109842w(str, AbstractC23160o0.m119282q0(m109827p0), AbstractC23160o0.m119231Z(m109827p0));
    }

    /* renamed from: P */
    public final void m109862P() {
        if (!m109845x0().get()) {
            return;
        }
        m109845x0().set(false);
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: jc.m
            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109788Q();
            }
        });
    }

    /* renamed from: R */
    public final void m109863R() {
        int m119300w0 = AbstractC23160o0.m119300w0(m109827p0(false));
        if (m119300w0 == this.f103408i) {
            return;
        }
        this.f103408i = m119300w0;
        if (!m109843w0().get()) {
            return;
        }
        m109843w0().set(false);
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: jc.o
            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109790S();
            }
        });
    }

    /* renamed from: R0 */
    public final boolean m109864R0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        C17945a0 m109883j0 = m109883j0(c17945a0);
        if (m109883j0 != null && m109883j0.m95020U4() == EnumC22425a.f109726q) {
            return true;
        }
        return false;
    }

    /* renamed from: S0 */
    public final boolean m109865S0() {
        return m109886m0().m128662x();
    }

    /* renamed from: T */
    public final void m109866T() {
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() == 0) {
            return;
        }
        long m109827p0 = m109827p0(false);
        int m119282q0 = AbstractC23160o0.m119282q0(m109827p0);
        int m119230Y0 = AbstractC23160o0.m119230Y0(m109827p0);
        int m119237b0 = AbstractC23160o0.m119237b0(m109827p0);
        if (m119282q0 != m109772C0().m128692a() || m119237b0 != AbstractC23160o0.m119237b0(m109772C0().m128693b()) || m119230Y0 != AbstractC23160o0.m119230Y0(m109772C0().m128693b())) {
            m109772C0().m128696e(m119282q0);
            m109772C0().m128697f(m109827p0);
            Arrays.fill((Object[]) m109772C0().m128695d(), (Object) 0L);
            Arrays.fill((Object[]) m109772C0().m128694c(), (Object) 0L);
            AbstractC0924m0.m3311Od(m109772C0().m128698g().toString());
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: jc.k
                @Override // java.lang.Runnable
                public final void run() {
                    C21216s.m109791U();
                }
            });
        }
    }

    /* renamed from: T0 */
    public final boolean m109867T0() {
        return m109886m0().m128661w().m128682e();
    }

    /* renamed from: U0 */
    public final boolean m109868U0(C17945a0 c17945a0) {
        long longValue;
        int intValue;
        AbstractC19074t.m100208f(c17945a0, "msg");
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() == 0) {
            return false;
        }
        boolean m94847A6 = c17945a0.m94847A6();
        boolean z11 = true;
        if (c17945a0.m95079a3() == 0 || c17945a0.m95079a3() == 1 || ((m94847A6 && m109886m0().m128655q().length == 0) || (!m94847A6 && m109886m0().m128654p().length == 0))) {
            return true;
        }
        int m109797a0 = m109797a0(c17945a0.m95079a3());
        if (m109797a0 >= 0 && m109797a0 < m109772C0().m128695d().length) {
            int m119282q0 = AbstractC23160o0.m119282q0(m109827p0(false));
            if (m94847A6) {
                if (m109886m0().m128655q()[m109797a0].length == 0) {
                    return true;
                }
                longValue = m109772C0().m128695d()[m109797a0].longValue();
                intValue = m109886m0().m128655q()[m109797a0][m119282q0].intValue();
            } else {
                if (m109886m0().m128654p()[m109797a0].length == 0) {
                    return true;
                }
                longValue = m109772C0().m128694c()[m109797a0].longValue();
                intValue = m109886m0().m128654p()[m109797a0][m119282q0].intValue();
            }
            long j11 = intValue;
            if (longValue >= 1048576 * j11) {
                z11 = false;
            }
            if (!z11) {
                C21654a.m111582i("Reach limit quota: usage=" + longValue + ", quota=" + j11, null, false, 6, null);
            }
            return z11;
        }
        throw new Exception("Invalid quota usage position: msgType=" + c17945a0.m95079a3() + ", quotaUsagePos=" + m109797a0 + ", size=" + m109772C0().m128695d().length);
    }

    /* renamed from: V0 */
    public final boolean m109869V0() {
        InterfaceC19024a m93148a = CoreUtility.m93148a();
        if (CoreUtility.f89239o) {
            return true;
        }
        if ((m93148a != null && m93148a.mo100080h()) || m109886m0().m128640b() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: W0 */
    public final boolean m109870W0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        boolean z11 = true;
        if (c17945a0.m95079a3() == 0 || c17945a0.m95079a3() == 1) {
            return true;
        }
        int m109797a0 = m109797a0(c17945a0.m95079a3());
        if (m109797a0 >= 0 && m109797a0 < m109849z0().length) {
            double m119300w0 = AbstractC23160o0.m119300w0(m109827p0(false)) * 1.0d;
            if (m119300w0 < m109849z0()[m109797a0][0] || m119300w0 > m109849z0()[m109797a0][1]) {
                z11 = false;
            }
            if (!z11) {
                C21654a.m111582i("Not in valid segment: currentMinuteInDouble=" + m119300w0 + ", minuteSegmentPos=" + m109797a0, null, false, 6, null);
            }
            return z11;
        }
        throw new Exception("Invalid segment position: msgType=" + c17945a0.m95079a3() + ", minuteSegmentPos=" + m109797a0 + ", size=" + m109849z0().length);
    }

    /* renamed from: X */
    public final void m109871X(String str, C17945a0 c17945a0, long j11, long j12, boolean z11) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        if (c17945a0 != null && c17945a0.m95306y8() && !m109846y0().contains(c17945a0.m95029V3().toString())) {
            double d11 = (j11 * 1.0d) / j12;
            if (j11 >= m109886m0().m128641c().m128731a() || d11 >= m109886m0().m128641c().m128732b()) {
                MessageId m95029V3 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                C21654a.m111582i("Add video into Visible DL queue: CliID=" + m95029V3.m41044h() + ", GloID=" + m95029V3.m41046j() + ", OwnerID=" + m95029V3.m41048l() + ", SenderID=" + m95029V3.m41050n(), C21654a.a.f105047p, false, 4, null);
                m109798a1(m95029V3.toString());
                m109777G0(str, c17945a0, false);
                if (z11) {
                    AbstractC23306f.m120573D1().m109954R(c17945a0);
                }
            }
        }
    }

    /* renamed from: X0 */
    public final boolean m109872X0(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        C24759a.c m128661w = m109886m0().m128661w();
        C24759a.c.b m128681d = m128661w.m128681d();
        String m128679b = m128661w.m128679b();
        String m95293x2 = c17945a0.m95293x2();
        AbstractC19074t.m100207e(m95293x2, "genDownloadTaskUrl(...)");
        String m153552r = C31944h6.m153552r(m95293x2);
        if (m153552r == null) {
            m153552r = "";
        }
        try {
            try {
                boolean m128689b = m128681d.m128689b(C31944h6.m153556w(m95293x2), m128681d.m128688a(c17945a0));
                if (!m128689b && z11) {
                    C21654a.m111584m(m153552r, m128679b);
                    return m128689b;
                }
                return m128689b;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(new Exception("Failed to match whitelist: urlHash=" + AbstractC23352g.m122788d(m95293x2) + ", domain=" + m153552r + ", msgType=" + c17945a0.m95041W4(), e11));
                if (z11) {
                    C21654a.m111584m(m153552r, m128679b);
                }
                return false;
            }
        } catch (Throwable th2) {
            if (z11) {
                C21654a.m111584m(m153552r, m128679b);
            }
            throw th2;
        }
    }

    /* renamed from: Y0 */
    public final boolean m109873Y0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95031V5() && !c17945a0.m94960N7()) {
            return false;
        }
        return true;
    }

    /* renamed from: Z0 */
    public final boolean m109874Z0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        return m109886m0().m128638D(c17945a0);
    }

    /* renamed from: b1 */
    public final void m109875b1(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(c17945a0, "msg");
        C21661h.f105066a.m111636y(c17945a0);
        if (!C24832c.m129122b(c17945a0) && m109865S0() && m109773D(this, c17945a0, false, 2, null)) {
            c17945a0.m95308yb(EnumC22425a.f109726q);
            if (!(!m109770B(this, c17945a0, false, 2, null))) {
                m109838t1(c17945a0, true);
                m109834s0().mo13474a(new Runnable() { // from class: jc.i

                    /* renamed from: q */
                    public final /* synthetic */ C21216s f103386q;

                    /* renamed from: r */
                    public final /* synthetic */ String f103387r;

                    public /* synthetic */ RunnableC21206i(C21216s this, String str2) {
                        r2 = this;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C21216s.m109803c1(C17945a0.this, r2, r3);
                    }
                });
            }
        }
    }

    /* renamed from: d1 */
    public final void m109876d1(int i11) {
        switch (i11) {
            case 4:
            case 5:
                m109841v0().set(true);
                return;
            case 6:
            case 7:
                m109840u0().set(true);
                return;
            case 8:
            case 9:
                m109843w0().set(true);
                return;
            case 10:
            case 11:
            default:
                return;
            case 12:
            case 13:
                m109845x0().set(true);
                return;
        }
    }

    /* renamed from: e1 */
    public final void m109877e1(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        m109834s0().mo13474a(new Runnable() { // from class: jc.q

            /* renamed from: p */
            public final /* synthetic */ String f103397p;

            /* renamed from: q */
            public final /* synthetic */ C21216s f103398q;

            /* renamed from: r */
            public final /* synthetic */ boolean f103399r;

            public /* synthetic */ RunnableC21214q(String str2, C21216s this, boolean z112) {
                r1 = str2;
                r2 = this;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109809f1(r1, r2, r3);
            }
        });
    }

    /* renamed from: f0 */
    public final void m109878f0() {
        String m127130z;
        String m127130z2;
        m127130z = AbstractC24341v.m127130z("─", 27);
        String m3855h = AbstractC0924m0.m3855h();
        boolean z11 = this.f103413n.get();
        int size = this.f103412m.size();
        Map map = this.f103412m;
        AbstractC19074t.m100207e(map, "autoDownloadCacheMessages");
        String m109805d0 = m109805d0(map);
        int m42238Q0 = this.f103402c.m42238Q0();
        m127130z2 = AbstractC24341v.m127130z("─", 50);
        C21654a.m111580g(m127130z + "\nConfigs: " + m3855h + "\nHas loaded db to mem: " + z11 + "\nMem size: " + size + "\nMem type count: " + m109805d0 + "\nDb size: " + m42238Q0 + "\n" + m127130z2, C21654a.a.f105047p, false);
    }

    /* renamed from: g1 */
    public final void m109879g1(String str, C17945a0 c17945a0, C21270p.a aVar) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(c17945a0, "msg");
        m109834s0().mo13474a(new Runnable() { // from class: jc.l

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f103391q;

            /* renamed from: r */
            public final /* synthetic */ String f103392r;

            /* renamed from: s */
            public final /* synthetic */ C21270p.a f103393s;

            public /* synthetic */ RunnableC21209l(C17945a0 c17945a02, String str2, C21270p.a aVar2) {
                r2 = c17945a02;
                r3 = str2;
                r4 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109813h1(C21216s.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: h0 */
    public final void m109880h0(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        c17945a0.m95094bb(1);
        if (!m109850A(c17945a0, false)) {
            C20629c.b bVar = C20629c.Companion;
            C20629c m107461a = bVar.m107461a();
            String m95293x2 = c17945a0.m95293x2();
            AbstractC19074t.m100207e(m95293x2, "genDownloadTaskUrl(...)");
            if (m107461a.m107454n(m95293x2, c17945a0.m95029V3().toString())) {
                C20629c m107461a2 = bVar.m107461a();
                String m95293x22 = c17945a0.m95293x2();
                AbstractC19074t.m100207e(m95293x22, "genDownloadTaskUrl(...)");
                AbstractC20631e.Companion.m107521x(m107461a2.m107453l(m95293x22), c17945a0, true);
                return;
            }
        }
        if (m109883j0(c17945a0) == null) {
            C21661h.f105066a.m111635x(c17945a0, EnumC22425a.f109727r);
        }
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        if (c17945a0.m95142g6()) {
            C20629c m107461a3 = C20629c.Companion.m107461a();
            String m95293x23 = c17945a0.m95293x2();
            AbstractC19074t.m100207e(m95293x23, "genDownloadTaskUrl(...)");
            if (!m107461a3.m107454n(m95293x23, m95029V3.toString())) {
                C21654a.m111582i("Force visible DL: msg not reset isDownloading flag.\nCliID=" + m95029V3.m41044h() + ", GloID=" + m95029V3.m41046j() + ", OwnerID=" + m95029V3.m41048l() + ", SenderID=" + m95029V3.m41050n() + ", UrlHash=" + AbstractC23352g.m122788d(c17945a0.m95293x2()) + ", trackingType=" + c17945a0.m95020U4(), C21654a.a.f105049r, false, 4, null);
            }
        }
        if (c17945a0.m95079a3() == 0) {
            c17945a0.m95254sa(m109888n0(c17945a0));
        }
        if (c17945a0.m95070Z2() == 0) {
            c17945a0.m95244ra(m109769A0(c17945a0));
        }
        m109786O0(c17945a0, z11);
    }

    /* renamed from: i0 */
    public final void m109881i0(int i11) {
        int m109797a0;
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        if (str.length() != 0 && (m109797a0 = m109797a0(i11)) >= 0 && m109797a0 < m109772C0().m128695d().length) {
            C21654a.m111582i("Force limit quota: type=" + i11, C21654a.a.f105049r, false, 4, null);
            m109772C0().m128695d()[m109797a0] = Long.MAX_VALUE;
            m109772C0().m128694c()[m109797a0] = Long.MAX_VALUE;
            AbstractC0924m0.m3311Od(m109772C0().m128698g().toString());
        }
    }

    /* renamed from: i1 */
    public final void m109882i1(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(c17945a0, "msg");
        C21654a.m111582i("removeCachedMessageOnVisibleVideoDownloadError(): " + c17945a0.m95029V3(), C21654a.a.f105049r, false, 4, null);
        m109834s0().mo13474a(new Runnable() { // from class: jc.g

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f103378q;

            /* renamed from: r */
            public final /* synthetic */ String f103379r;

            public /* synthetic */ RunnableC21204g(C17945a0 c17945a02, String str2) {
                r2 = c17945a02;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109816j1(C21216s.this, r2, r3);
            }
        });
    }

    /* renamed from: j0 */
    public final C17945a0 m109883j0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (this.f103413n.get()) {
            return m109884k0(c17945a0);
        }
        return this.f103402c.m42218O4(CoreUtility.f89233i, c17945a0);
    }

    /* renamed from: k0 */
    public final C17945a0 m109884k0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        return (C17945a0) this.f103412m.get(c17945a0.m95029V3());
    }

    /* renamed from: k1 */
    public final void m109885k1(List list) {
        AbstractC19074t.m100208f(list, "msgList");
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: jc.n

            /* renamed from: q */
            public final /* synthetic */ List f103395q;

            public /* synthetic */ RunnableC21211n(List list2) {
                r2 = list2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109820l1(C21216s.this, r2);
            }
        });
    }

    /* renamed from: m0 */
    public final C24759a m109886m0() {
        return (C24759a) this.f103403d.getValue();
    }

    /* renamed from: m1 */
    public final void m109887m1(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: jc.j

            /* renamed from: q */
            public final /* synthetic */ String f103389q;

            public /* synthetic */ RunnableC21207j(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109823n1(C21216s.this, r2);
            }
        });
    }

    /* renamed from: n0 */
    public final int m109888n0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (c17945a0.m95316z8()) {
            return 1;
        }
        if (m109873Y0(c17945a0)) {
            return 2;
        }
        if (c17945a0.m95306y8()) {
            return 4;
        }
        if (c17945a0.m95276v6()) {
            return 8;
        }
        return 0;
    }

    /* renamed from: o0 */
    public final int m109889o0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        ContactProfile contactProfile = new ContactProfile(str);
        if (contactProfile.m40384Q0()) {
            return 4;
        }
        if (contactProfile.m40374K0()) {
            return 16;
        }
        if (AbstractC21935u.m114515E(contactProfile.f42434r)) {
            return 2;
        }
        if (AbstractC21935u.m114558y(contactProfile.f42434r)) {
            return 1;
        }
        if (AbstractC21935u.m114518H(contactProfile.f42434r)) {
            return 8;
        }
        return 0;
    }

    /* renamed from: r0 */
    public final C17945a0 m109890r0(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        return this.f103402c.m42218O4(CoreUtility.f89233i, c17945a0);
    }

    /* renamed from: r1 */
    public final void m109891r1() {
        m109895x();
        this.f103412m.clear();
        this.f103403d.reset();
        this.f103404e.reset();
        m109846y0().clear();
        this.f103413n.set(false);
        this.f103417r.set(false);
    }

    /* renamed from: u1 */
    public final void m109892u1(C17945a0 c17945a0, int i11) {
        AbstractC19074t.m100208f(c17945a0, "msg");
        this.f103402c.m42315Xd(CoreUtility.f89233i, c17945a0, i11);
    }

    /* renamed from: v */
    public final void m109893v(Map map, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(map, "headers");
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (m109886m0().m128660v().length() > 0) {
            map.put("t-md", m109886m0().m128660v());
            map.put("nretry", String.valueOf(c17945a0.m95012T4()));
        }
    }

    /* renamed from: v1 */
    public final void m109894v1(C17945a0 c17945a0, String str) {
        int m109797a0;
        AbstractC19074t.m100208f(c17945a0, "msg");
        AbstractC19074t.m100208f(str, "filePath");
        int m95079a3 = c17945a0.m95079a3();
        boolean m94847A6 = c17945a0.m94847A6();
        if (c17945a0.m95215o4() != 1) {
            if (!m94847A6 || m109886m0().m128655q().length != 0) {
                if (m94847A6 || m109886m0().m128654p().length != 0) {
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    if (str2.length() != 0 && (m109797a0 = m109797a0(m95079a3)) >= 0 && m109797a0 < m109772C0().m128695d().length) {
                        long m106845r = new C20556f(str).m106845r();
                        if (m94847A6) {
                            if (m109886m0().m128655q()[m109797a0].length == 0 || m109772C0().m128695d()[m109797a0].longValue() == Long.MAX_VALUE) {
                                return;
                            }
                            Long[] m128695d = m109772C0().m128695d();
                            m128695d[m109797a0] = Long.valueOf(m128695d[m109797a0].longValue() + m106845r);
                        } else {
                            if (m109886m0().m128654p()[m109797a0].length == 0 || m109772C0().m128694c()[m109797a0].longValue() == Long.MAX_VALUE) {
                                return;
                            }
                            Long[] m128694c = m109772C0().m128694c();
                            m128694c[m109797a0] = Long.valueOf(m128694c[m109797a0].longValue() + m106845r);
                        }
                        AbstractC0924m0.m3311Od(m109772C0().m128698g().toString());
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final void m109895x() {
        Map map = this.f103412m;
        AbstractC19074t.m100207e(map, "autoDownloadCacheMessages");
        synchronized (map) {
            try {
                Map map2 = this.f103412m;
                AbstractC19074t.m100207e(map2, "autoDownloadCacheMessages");
                Iterator it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    ((C17945a0) ((Map.Entry) it.next()).getValue()).m95068Z0();
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x1 */
    public final void m109896x1(String str, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(c17945a0, "msg");
        if (m109883j0(c17945a0) == null) {
            C21661h.f105066a.m111635x(c17945a0, EnumC22425a.f109727r);
        }
        m109879g1(str, c17945a0, C21270p.a.f103626s);
    }

    /* renamed from: y */
    public final void m109897y() {
        m109834s0().mo13474a(new Runnable() { // from class: jc.p
            public /* synthetic */ RunnableC21213p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21216s.m109848z(C21216s.this);
            }
        });
    }
}
