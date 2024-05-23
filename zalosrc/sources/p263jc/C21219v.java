package p263jc;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0927o;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dg0.AbstractC17930e;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17969i0;
import dj.C17990p0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import in.AbstractC20631e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lc.EnumC22425a;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import nh0.InterfaceC23792b;
import ni.C23794a;
import org.json.JSONArray;
import org.json.JSONObject;
import p019aj.C0876j;
import p164fn.C19028b;
import p296kc.C21654a;
import p296kc.C21661h;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23310j;
import p423pi.C24759a;
import p423pi.C24762d;
import p423pi.C24763e;
import p645xh.AbstractC29633j;
import p645xh.C29628e;
import p698yz.AbstractC31111g;
import pm0.C24848g0;
import zm.AbstractC32236a;

/* renamed from: jc.v */
/* loaded from: classes.dex */
public final class C21219v {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C23794a f103434a;

    /* renamed from: b */
    private final C0876j f103435b;

    /* renamed from: c */
    private final InterfaceC23792b f103436c;

    /* renamed from: d */
    private final C21216s f103437d;

    /* renamed from: e */
    private final C7960e f103438e;

    /* renamed from: f */
    private C24762d f103439f;

    /* renamed from: g */
    private final LinkedList f103440g;

    /* renamed from: jc.v$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC23310j {

        /* renamed from: jc.v$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C32850a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C32850a f103441q = new C32850a();

            C32850a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C21219v mo12V4() {
                C23794a m120660f = AbstractC23306f.m120660f();
                AbstractC19074t.m100207e(m120660f, "provideAutoDownloadRepo(...)");
                C0876j m120584H0 = AbstractC23306f.m120584H0();
                AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
                InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
                AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
                C21216s m120652d = AbstractC23306f.m120652d();
                AbstractC19074t.m100207e(m120652d, "provideAutoDownloadMsgResourcesController(...)");
                C7960e m120592K = AbstractC23306f.m120592K();
                AbstractC19074t.m100207e(m120592K, "provideDatabaseHelper(...)");
                return new C21219v(m120660f, m120584H0, m120579F1, m120652d, m120592K);
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private a() {
            super(C32850a.f103441q);
        }
    }

    /* renamed from: jc.v$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ List f103442a;

        /* renamed from: b */
        final /* synthetic */ C21219v f103443b;

        b(List list, C21219v c21219v) {
            this.f103442a = list;
            this.f103443b = c21219v;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ArrayList arrayList = new ArrayList();
            List<C24763e> list = this.f103442a;
            C21219v c21219v = this.f103443b;
            for (C24763e c24763e : list) {
                String str = "insertSyncItemsToDownloadQueue(): " + c24763e.m128716b();
                C21654a.a aVar = C21654a.a.f105051t;
                C21654a.m111581h("SyncActionMediaController", str, aVar, false, 8, null);
                C17945a0 m2635r = c21219v.f103435b.m2635r(c24763e.m128725k());
                if (m2635r != null && c21219v.m109949z(m2635r)) {
                    C21654a.m111581h("SyncActionMediaController", "insertSyncItemsToDownloadQueue(): pass condition: " + c24763e.m128716b(), aVar, false, 8, null);
                    AbstractC20631e.d dVar = AbstractC20631e.Companion;
                    String m95117e3 = m2635r.m95117e3();
                    AbstractC19074t.m100207e(m95117e3, "getDownloadTaskId(...)");
                    if (!dVar.m107517t(m95117e3)) {
                        arrayList.add(m2635r);
                        m2635r.m95308yb(EnumC22425a.f109728s);
                        if (c21219v.f103437d.m109850A(m2635r, true)) {
                            C21654a.m111581h("SyncActionMediaController", "insertSyncItemsToDownloadQueue(): pass checkAddMsgToCacheList: " + c24763e.m128716b(), aVar, false, 8, null);
                            c21219v.f103438e.m42534s9(CoreUtility.f89233i, m2635r);
                            c21219v.m109922P(m2635r);
                        }
                    }
                }
                c21219v.f103438e.m42348b7().m126730b(c24763e, false);
            }
            C21661h.f105066a.m111627E(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.v$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {
        c() {
            super(1);
        }

        /* renamed from: a */
        public final void m109958a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, C0927o.f3427r);
            C21654a.m111581h("SyncActionMediaController", "PULL action media: success (" + jSONObject + ")", C21654a.a.f105051t, false, 8, null);
            C21219v.this.m109950H(jSONObject, true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m109958a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.v$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final d f103445q = new d();

        d() {
            super(2);
        }

        /* renamed from: a */
        public final void m109959a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            C21654a.m111581h("SyncActionMediaController", "PULL action media: failed (errorCode=" + i11 + ", errorMessage=" + str + ")", C21654a.a.f105051t, false, 8, null);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m109959a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: jc.v$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC0939u {
        e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C21219v.this.m109941p();
            List<C24763e> m126729a = C21219v.this.f103438e.m42348b7().m126729a();
            C21654a.m111581h("SyncActionMediaController", "Resubmit: size=" + m126729a.size(), C21654a.a.f105051t, false, 8, null);
            C21219v c21219v = C21219v.this;
            for (C24763e c24763e : m126729a) {
                C17945a0 m2635r = c21219v.f103435b.m2635r(c24763e.m128725k());
                if (m2635r != null && c21219v.m109948y(m2635r)) {
                    synchronized (c21219v.f103440g) {
                        c21219v.f103440g.add(m2635r);
                        c21219v.m109920M();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } else {
                    C21654a.m111581h("SyncActionMediaController", "Resubmit: remove invalid item " + c24763e.m128716b(), C21654a.a.f105051t, false, 8, null);
                    c21219v.f103438e.m42348b7().m126733f(c24763e.m128716b());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.v$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ List f103447q;

        /* renamed from: r */
        final /* synthetic */ C21219v f103448r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, C21219v c21219v) {
            super(1);
            this.f103447q = list;
            this.f103448r = c21219v;
        }

        /* renamed from: a */
        public final void m109960a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            C21654a.m111581h("SyncActionMediaController", "submitSyncActionMedia(): success", C21654a.a.f105051t, false, 8, null);
            List list = this.f103447q;
            C21219v c21219v = this.f103448r;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c21219v.f103438e.m42348b7().m126734g(((C17945a0) it.next()).m95029V3().m41045i(), 1);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m109960a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jc.v$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final g f103449q = new g();

        g() {
            super(2);
        }

        /* renamed from: a */
        public final void m109961a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            C21654a.m111581h("SyncActionMediaController", "submitSyncActionMedia(): failed (errorCode=" + i11 + ", errorMessage=" + str + ")", C21654a.a.f105051t, false, 8, null);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m109961a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: jc.v$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ C17945a0 f103451b;

        h(C17945a0 c17945a0) {
            this.f103451b = c17945a0;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C21219v c21219v = C21219v.this;
            if (!c21219v.m109939n(c21219v.m109955q(), this.f103451b)) {
                return;
            }
            String str = "submitSyncActionMediaToQueue(): pass input condition " + this.f103451b.m95029V3().m41044h();
            C21654a.a aVar = C21654a.a.f105051t;
            C21654a.m111581h("SyncActionMediaController", str, aVar, false, 8, null);
            if (C21219v.this.f103438e.m42348b7().m126731c(this.f103451b.m95029V3().m41045i())) {
                return;
            }
            C21654a.m111581h("SyncActionMediaController", "submitSyncActionMediaToQueue(): VALID item, add to submit queue " + this.f103451b.m95029V3().m41044h(), aVar, false, 8, null);
            C21219v.this.f103438e.m42348b7().m126730b(new C24763e().m128724j(this.f103451b, C21219v.this.m109942r()), true);
            LinkedList linkedList = C21219v.this.f103440g;
            C21219v c21219v2 = C21219v.this;
            C17945a0 c17945a0 = this.f103451b;
            synchronized (linkedList) {
                c21219v2.f103440g.add(c17945a0);
                c21219v2.m109920M();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    public C21219v(C23794a c23794a, C0876j c0876j, InterfaceC23792b interfaceC23792b, C21216s c21216s, C7960e c7960e) {
        AbstractC19074t.m100208f(c23794a, "autoDownloadRepo");
        AbstractC19074t.m100208f(c0876j, "msgRepo");
        AbstractC19074t.m100208f(interfaceC23792b, "mTimeProvider");
        AbstractC19074t.m100208f(c21216s, "autoDownloadMsgResourcesController");
        AbstractC19074t.m100208f(c7960e, "mDbHelper");
        this.f103434a = c23794a;
        this.f103435b = c0876j;
        this.f103436c = interfaceC23792b;
        this.f103437d = c21216s;
        this.f103438e = c7960e;
        this.f103440g = new LinkedList();
    }

    /* renamed from: A */
    private final boolean m109911A(C24759a c24759a, C17945a0 c17945a0) {
        long m109943s = m109943s(c17945a0);
        if (m109943s < 0 || m109943s > c24759a.m128645g() * ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) {
            return false;
        }
        return true;
    }

    /* renamed from: B */
    private final boolean m109912B(C24762d c24762d, C17945a0 c17945a0) {
        long m109943s = m109943s(c17945a0);
        if (m109943s < 0) {
            return false;
        }
        if (c24762d.m128712c() != 0 && m109943s <= c24762d.m128712c() * ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    private final boolean m109913C(C24759a c24759a, C17945a0 c17945a0) {
        if (c17945a0.m95276v6()) {
            return m109911A(c24759a, c17945a0);
        }
        if (m109917G(c17945a0)) {
            return m109915E(c24759a, c17945a0);
        }
        return true;
    }

    /* renamed from: D */
    private final boolean m109914D(C24762d c24762d, C17945a0 c17945a0) {
        if (c17945a0.m95276v6()) {
            return m109912B(c24762d, c17945a0);
        }
        if (m109917G(c17945a0)) {
            return m109916F(c24762d, c17945a0);
        }
        return true;
    }

    /* renamed from: E */
    private final boolean m109915E(C24759a c24759a, C17945a0 c17945a0) {
        long m109944t = m109944t(c17945a0);
        if (m109944t < 0 || m109944t > c24759a.m128645g() * ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    private final boolean m109916F(C24762d c24762d, C17945a0 c17945a0) {
        long m109944t = m109944t(c17945a0);
        if (m109944t < 0) {
            return false;
        }
        if (c24762d.m128713d() != 0 && m109944t <= c24762d.m128713d() * ZMediaPlayerSettings.VideoConfig.ONE_MEGABYTE) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private final boolean m109917G(C17945a0 c17945a0) {
        if (!c17945a0.m95306y8() && !c17945a0.m95288w8()) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private final void m109918I(long j11) {
        C21654a.m111581h("SyncActionMediaController", "PULL action media: lastId=" + j11, C21654a.a.f105051t, false, 8, null);
        this.f103434a.m124327e(j11, new c(), d.f103445q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m109919K(long j11, C21219v c21219v) {
        AbstractC19074t.m100208f(c21219v, "this$0");
        AbstractC0924m0.m3457Te(j11);
        c21219v.m109918I(c21219v.f103434a.m124325c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final synchronized void m109920M() {
        try {
            if (this.f103440g.size() >= 20) {
                C21654a.m111581h("SyncActionMediaController", "scheduleRequest(): " + this.f103440g.size() + " >= 20", C21654a.a.f105051t, false, 8, null);
                m109924S();
            } else {
                AbstractC17930e.Companion.m94551d().mo94529c("SUBMIT_ACTION_SYNC_MEDIA_STATUS", new Runnable() { // from class: jc.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C21219v.m109921N(C21219v.this);
                    }
                }, 3600000L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m109921N(C21219v c21219v) {
        AbstractC19074t.m100208f(c21219v, "this$0");
        C21654a.m111581h("SyncActionMediaController", "scheduleRequest(): Reach time threshold", C21654a.a.f105051t, false, 8, null);
        c21219v.m109924S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public final void m109922P(C17945a0 c17945a0) {
        c17945a0.m95094bb(2);
        if (this.f103437d.m109867T0() && !this.f103437d.m109872X0(c17945a0, true)) {
            return;
        }
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        C21654a.m111581h("SyncActionMediaController", "startDownloadMessage(): pass whitelist: CliID=" + m95029V3.m41044h() + ", GloID=" + m95029V3.m41046j() + ", OwnerID=" + m95029V3.m41048l() + ", SenderID=" + m95029V3.m41050n(), C21654a.a.f105051t, false, 8, null);
        if (c17945a0.m95276v6()) {
            if (c17945a0.m95107d3() != 4) {
                c17945a0.m95165ic(4, false);
            }
            c17945a0.m95017Tb();
        } else {
            if (c17945a0.m95107d3() != 4) {
                c17945a0.m95165ic(4, true);
            }
            c17945a0.m94980Pb(C19028b.a.m100098b(C19028b.Companion, C19028b.b.f94844q, false, false, 6, null), false);
        }
    }

    /* renamed from: Q */
    private final void m109923Q(List list) {
        C21654a.m111581h("SyncActionMediaController", "SUBMIT action media: " + list.size() + " items", C21654a.a.f105051t, false, 8, null);
        this.f103434a.m124330h(list, new f(list, this), g.f103449q);
    }

    /* renamed from: S */
    private final void m109924S() {
        if (m109946v()) {
            return;
        }
        if (!C29628e.m147249E0().f89373e) {
            if (!C29628e.m147249E0().f89374f) {
                AbstractC29633j.m147365n();
                m109925T(2000L);
            }
            m109925T(3000L);
            m109920M();
            return;
        }
        m109940o();
    }

    /* renamed from: T */
    private final void m109925T(long j11) {
        try {
            Thread.sleep(j11);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SyncActionMediaController", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final boolean m109939n(C24762d c24762d, C17945a0 c17945a0) {
        if (m109956w() && c24762d.m128710a(c17945a0) && m109914D(c24762d, c17945a0) && !m109947x(c17945a0) && !c17945a0.m94889F6()) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private final void m109940o() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f103440g) {
            while (arrayList.size() <= 20 && (!this.f103440g.isEmpty())) {
                try {
                    arrayList.add(this.f103440g.pop());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        m109923Q(arrayList);
        m109920M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m109941p() {
        this.f103438e.m42348b7().m126732e(m109942r(), 1209600000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final long m109942r() {
        if (AbstractC32236a.m155477c()) {
            return System.currentTimeMillis();
        }
        return this.f103436c.mo124314i();
    }

    /* renamed from: s */
    private final long m109943s(C17945a0 c17945a0) {
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (!(m94929K2 instanceof C17990p0)) {
            return -1L;
        }
        C17990p0 c17990p0 = (C17990p0) m94929K2;
        c17945a0.m95244ra(c17990p0.f91113B);
        return c17990p0.f91113B;
    }

    /* renamed from: t */
    private final long m109944t(C17945a0 c17945a0) {
        C17969i0 m94929K2 = c17945a0.m94929K2();
        if (m94929K2 instanceof C17961f1) {
            C17961f1 c17961f1 = (C17961f1) m94929K2;
            if (c17961f1.m95453G() != 0) {
                return c17961f1.m95453G();
            }
            return -1L;
        }
        return -1L;
    }

    /* renamed from: u */
    private final void m109945u(List list) {
        C0824j.m2153b(new b(list, this));
    }

    /* renamed from: v */
    private final boolean m109946v() {
        return this.f103440g.isEmpty();
    }

    /* renamed from: x */
    private final boolean m109947x(C17945a0 c17945a0) {
        if (c17945a0.m95022U7()) {
            return true;
        }
        try {
            if (c17945a0.m94974P4() > 0) {
                if (AbstractC31111g.m151132m(m109942r(), c17945a0.m94974P4(), AbstractC0924m0.m3389R4())) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SyncActionMediaController", e11);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public final boolean m109948y(C17945a0 c17945a0) {
        if (c17945a0.m95219o8() || c17945a0.m95091b6() || c17945a0.m94959N6() || m109947x(c17945a0)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final boolean m109949z(C17945a0 c17945a0) {
        if (!m109948y(c17945a0) || AbstractC23041d2.m118194A(c17945a0.m94983Q3()) || c17945a0.m94889F6() || !this.f103437d.m109886m0().m128662x()) {
            return false;
        }
        return m109913C(AbstractC23306f.m120652d().m109886m0(), c17945a0);
    }

    /* renamed from: H */
    public final void m109950H(JSONObject jSONObject, boolean z11) {
        JSONArray optJSONArray;
        Object obj;
        AbstractC19074t.m100208f(jSONObject, C0927o.f3427r);
        try {
            int optInt = jSONObject.optInt("error_code", -1);
            String optString = jSONObject.optString("error_message", "");
            if (optInt != 0) {
                AbstractC23350e.m122777g("SyncActionMediaController", "onReceiveActionMedia(): errorCode=" + optInt + ", errorMessage=" + optString, C21654a.a.f105051t);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("actions")) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                C24763e.a aVar = C24763e.Companion;
                AbstractC19074t.m100205c(optJSONObject2);
                arrayList.add(aVar.m128726a(optJSONObject2));
            }
            m109945u(arrayList);
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                if (it.hasNext()) {
                    long m128721g = ((C24763e) next).m128721g();
                    do {
                        Object next2 = it.next();
                        long m128721g2 = ((C24763e) next2).m128721g();
                        if (m128721g < m128721g2) {
                            next = next2;
                            m128721g = m128721g2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            }
            C24763e c24763e = (C24763e) obj;
            if (c24763e != null) {
                long m128721g3 = c24763e.m128721g();
                if (z11) {
                    this.f103434a.m124329g(m128721g3);
                }
                if (optJSONObject.optInt("hasMore") == 1) {
                    C21654a.m111581h("SyncActionMediaController", "onReceiveActionMedia(): hasMore=1", C21654a.a.f105051t, false, 8, null);
                    m109918I(m128721g3);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SyncActionMediaController", e11);
        }
    }

    /* renamed from: J */
    public final void m109951J() {
        if (!m109956w()) {
            return;
        }
        final long m109942r = m109942r();
        if (m109942r - AbstractC0924m0.m3856h0() < 86400000) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: jc.u
            @Override // java.lang.Runnable
            public final void run() {
                C21219v.m109919K(m109942r, this);
            }
        });
    }

    /* renamed from: L */
    public final void m109952L() {
        if (!m109956w()) {
            return;
        }
        C0824j.m2153b(new e());
    }

    /* renamed from: O */
    public final void m109953O(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        AbstractC0924m0.m3409Ro(jSONObject.toString());
        this.f103439f = C24762d.Companion.m128714a(jSONObject);
    }

    /* renamed from: R */
    public final void m109954R(C17945a0 c17945a0) {
        if (c17945a0 != null && m109956w()) {
            C21654a.m111581h("SyncActionMediaController", "submitSyncActionMediaToQueue(): " + c17945a0.m95029V3().m41044h(), C21654a.a.f105051t, false, 8, null);
            C0824j.m2153b(new h(c17945a0));
        }
    }

    /* renamed from: q */
    public final C24762d m109955q() {
        String m3952k6 = AbstractC0924m0.m3952k6();
        C24762d c24762d = this.f103439f;
        if (c24762d != null) {
            AbstractC19074t.m100205c(c24762d);
            return c24762d;
        }
        AbstractC19074t.m100205c(m3952k6);
        if (m3952k6.length() > 0) {
            C24762d m128714a = C24762d.Companion.m128714a(new JSONObject(m3952k6));
            this.f103439f = m128714a;
            AbstractC19074t.m100205c(m128714a);
            return m128714a;
        }
        return new C24762d();
    }

    /* renamed from: w */
    public final boolean m109956w() {
        if (m109955q().m128711b() == 1) {
            return true;
        }
        return false;
    }
}
