package u10;

import com.zing.zalo.shortvideo.data.model.ComplexAds;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.VideoAdsData;
import com.zing.zalo.shortvideo.data.remote.common.NoDataException;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.model.VideoAdsInfo;
import e10.InterfaceC18170g;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19071q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import on0.AbstractC24341v;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import u10.C26948b;
import vm0.AbstractC28298d;
import w00.AbstractC28684a;
import wm0.AbstractC29104l;
import z10.C31179n0;

/* renamed from: u10.a */
/* loaded from: classes5.dex */
public final class C26947a {
    public static final b Companion = new b(null);

    /* renamed from: p */
    private static final ArrayList f127388p = new ArrayList();

    /* renamed from: q */
    private static int f127389q;

    /* renamed from: r */
    private static int f127390r;

    /* renamed from: s */
    private static int f127391s;

    /* renamed from: a */
    private final CoroutineScope f127392a;

    /* renamed from: b */
    private final InterfaceC18170g f127393b;

    /* renamed from: c */
    private ArrayList f127394c;

    /* renamed from: d */
    private LoadMoreInfo f127395d;

    /* renamed from: e */
    private ComplexAds.Config f127396e;

    /* renamed from: f */
    private C26948b f127397f;

    /* renamed from: g */
    private int f127398g;

    /* renamed from: h */
    private int f127399h;

    /* renamed from: i */
    private int f127400i;

    /* renamed from: j */
    private int f127401j;

    /* renamed from: k */
    private boolean f127402k;

    /* renamed from: l */
    private InterfaceC18509p f127403l;

    /* renamed from: m */
    private InterfaceC18494a f127404m;

    /* renamed from: n */
    private ArrayList f127405n;

    /* renamed from: o */
    private String f127406o;

    /* renamed from: u10.a$a */
    /* loaded from: classes5.dex */
    /* synthetic */ class a extends C19071q implements InterfaceC18494a {
        a(Object obj) {
            super(0, obj, C26947a.class, "checkIfAdsIsReady", "checkIfAdsIsReady()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m138834h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m138834h() {
            ((C26947a) this.f94922q).m138793A();
        }
    }

    /* renamed from: u10.a$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u10.a$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ Video f127407q;

            /* renamed from: r */
            final /* synthetic */ C19059j0 f127408r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Video video, C19059j0 c19059j0) {
                super(1);
                this.f127407q = video;
                this.f127408r = c19059j0;
            }

            /* renamed from: a */
            public final void m138847a(C26947a c26947a) {
                AbstractC19074t.m100208f(c26947a, "provider");
                Iterator it = c26947a.m138824E().iterator();
                while (it.hasNext()) {
                    C26948b.a aVar = (C26948b.a) it.next();
                    if (C26947a.Companion.m138838l(aVar.m138881b(), this.f127407q)) {
                        this.f127408r.f94941p = aVar;
                        return;
                    }
                }
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m138847a((C26947a) obj);
                return C24848g0.f119245a;
            }
        }

        /* renamed from: u10.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C32987b extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ Video f127409q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32987b(Video video) {
                super(1);
                this.f127409q = video;
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean mo205i9(VideoAdsData videoAdsData) {
                AbstractC19074t.m100208f(videoAdsData, "it");
                return Boolean.valueOf(C26947a.Companion.m138838l(videoAdsData, this.f127409q));
            }
        }

        /* renamed from: u10.a$b$c */
        /* loaded from: classes5.dex */
        static final class c extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ int f127410q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(int i11) {
                super(1);
                this.f127410q = i11;
            }

            /* renamed from: a */
            public final void m138849a(C26947a c26947a) {
                AbstractC19074t.m100208f(c26947a, "provider");
                c26947a.f127397f.m138874l(this.f127410q);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m138849a((C26947a) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: u10.a$b$d */
        /* loaded from: classes5.dex */
        public static final class d extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ String f127411q;

            /* renamed from: r */
            final /* synthetic */ long f127412r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str, long j11) {
                super(1);
                this.f127411q = str;
                this.f127412r = j11;
            }

            /* renamed from: a */
            public final void m138850a(C26947a c26947a) {
                AbstractC19074t.m100208f(c26947a, "provider");
                c26947a.f127397f.m138875m(this.f127411q, this.f127412r);
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m138850a((C26947a) obj);
                return C24848g0.f119245a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        private final C26947a m138836c(String str) {
            boolean m127128x;
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    for (C26947a c26947a : C26947a.f127388p) {
                        if (AbstractC19074t.m100204b(str, c26947a.m138825F())) {
                            return c26947a;
                        }
                    }
                }
            }
            return null;
        }

        /* renamed from: d */
        private final void m138837d(String str, InterfaceC18505l interfaceC18505l) {
            C26947a m138836c = m138836c(str);
            if (m138836c != null) {
                interfaceC18505l.mo205i9(m138836c);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final boolean m138838l(VideoAdsData videoAdsData, Video video) {
            VideoAdsInfo videoAdsInfo;
            VideoAdsInfo m52881b;
            String str = null;
            if (video != null) {
                videoAdsInfo = video.m52881b();
            } else {
                videoAdsInfo = null;
            }
            if (videoAdsInfo == null || !AbstractC19074t.m100204b(videoAdsData.m51275n().m51371t(), video.m52911t())) {
                return false;
            }
            String m51265d = videoAdsData.m51265d();
            VideoAdsInfo m52881b2 = video.m52881b();
            if (m52881b2 != null) {
                str = m52881b2.m52928d();
            }
            if (!AbstractC19074t.m100204b(m51265d, str) || (m52881b = video.m52881b()) == null || videoAdsData.m51270i() != m52881b.m52933i()) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final C26948b.a m138839b(String str, Video video) {
            if (video == null) {
                return null;
            }
            C19059j0 c19059j0 = new C19059j0();
            m138837d(str, new a(video, c19059j0));
            return (C26948b.a) c19059j0.f94941p;
        }

        /* renamed from: e */
        public final String m138840e() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_ad_called", C26947a.f127389q);
            jSONObject.put("total_ad_showed", C26947a.f127390r);
            jSONObject.put("total_ad_called_empty", C26947a.f127391s);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        /* renamed from: f */
        public final int m138841f(String str) {
            ArrayList m138824E;
            C26947a m138836c = m138836c(str);
            if (m138836c != null && (m138824E = m138836c.m138824E()) != null) {
                return m138824E.size();
            }
            return 0;
        }

        /* renamed from: g */
        public final void m138842g(String str, Video video) {
            boolean m127128x;
            boolean m131542D;
            AbstractC19074t.m100208f(video, "video");
            if (str != null) {
                m127128x = AbstractC24341v.m127128x(str);
                if (!m127128x) {
                    for (C26947a c26947a : C26947a.f127388p) {
                        if (AbstractC19074t.m100204b(c26947a.m138825F(), str)) {
                            m131542D = AbstractC25378x.m131542D(c26947a.f127394c, new C32987b(video));
                            if (m131542D) {
                                c26947a.f127402k = false;
                                c26947a.f127401j++;
                                C26947a.f127390r++;
                                if (c26947a.f127394c.isEmpty()) {
                                    c26947a.m138796D();
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: h */
        public final void m138843h(String str, int i11) {
            if (i11 == -1) {
                return;
            }
            m138837d(str, new c(i11));
        }

        /* renamed from: i */
        public final void m138844i(String str, String str2, long j11) {
            m138837d(str, new d(str2, j11));
        }

        /* renamed from: j */
        public final void m138845j() {
            Iterator it = C26947a.f127388p.iterator();
            while (it.hasNext()) {
                ((C26947a) it.next()).m138827I();
            }
            C26947a.f127388p.clear();
        }

        /* renamed from: k */
        public final void m138846k() {
            C26947a.f127389q = 0;
            C26947a.f127390r = 0;
            C26947a.f127391s = 0;
        }
    }

    /* renamed from: u10.a$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a */
        private final List f127413a;

        /* renamed from: b */
        private final LoadMoreInfo f127414b;

        /* renamed from: c */
        private final ComplexAds.Config f127415c;

        /* renamed from: d */
        private final C26948b.d f127416d;

        /* renamed from: e */
        private final List f127417e;

        /* renamed from: f */
        private final int f127418f;

        /* renamed from: g */
        private final int f127419g;

        /* renamed from: h */
        private final int f127420h;

        /* renamed from: i */
        private final int f127421i;

        /* renamed from: j */
        private final boolean f127422j;

        public c(List list, LoadMoreInfo loadMoreInfo, ComplexAds.Config config, C26948b.d dVar, List list2, int i11, int i12, int i13, int i14, boolean z11) {
            AbstractC19074t.m100208f(list, "adsQueue");
            AbstractC19074t.m100208f(dVar, "history");
            AbstractC19074t.m100208f(list2, "adsHistory");
            this.f127413a = list;
            this.f127414b = loadMoreInfo;
            this.f127415c = config;
            this.f127416d = dVar;
            this.f127417e = list2;
            this.f127418f = i11;
            this.f127419g = i12;
            this.f127420h = i13;
            this.f127421i = i14;
            this.f127422j = z11;
        }

        /* renamed from: a */
        public final List m138851a() {
            return this.f127417e;
        }

        /* renamed from: b */
        public final List m138852b() {
            return this.f127413a;
        }

        /* renamed from: c */
        public final ComplexAds.Config m138853c() {
            return this.f127415c;
        }

        /* renamed from: d */
        public final int m138854d() {
            return this.f127421i;
        }

        /* renamed from: e */
        public final int m138855e() {
            return this.f127419g;
        }

        /* renamed from: f */
        public final int m138856f() {
            return this.f127418f;
        }

        /* renamed from: g */
        public final int m138857g() {
            return this.f127420h;
        }

        /* renamed from: h */
        public final C26948b.d m138858h() {
            return this.f127416d;
        }

        /* renamed from: i */
        public final LoadMoreInfo m138859i() {
            return this.f127414b;
        }

        /* renamed from: j */
        public final boolean m138860j() {
            return this.f127422j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u10.a$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f127423t;

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
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f127423t;
            try {
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        InterfaceC18170g interfaceC18170g = C26947a.this.f127393b;
                        int i12 = C26947a.this.f127401j;
                        int i13 = C26947a.this.f127400i;
                        int m138870e = C26947a.this.f127397f.m138870e(C26947a.this.f127397f.m138869d());
                        C26947a c26947a = C26947a.this;
                        List m138798O = c26947a.m138798O(c26947a.m138824E());
                        LoadMoreInfo loadMoreInfo = C26947a.this.f127395d;
                        this.f127423t = 1;
                        obj = interfaceC18170g.mo96572S(i12, i13, m138870e, m138798O, loadMoreInfo, this);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                    }
                    ComplexAds complexAds = (ComplexAds) obj;
                    if (complexAds.m50878a().m51168m().isEmpty()) {
                        C26947a.f127391s++;
                    }
                    C26947a.this.f127394c.addAll(complexAds.m50878a().m51168m());
                    C26947a.this.f127396e = complexAds.m50879b();
                    C26947a.this.f127397f.m138877o(C26947a.this.f127396e);
                    C26947a.this.f127395d = complexAds.m50878a().m51169n();
                    C26947a.this.f127399h = 0;
                    C26947a.this.f127398g = -1;
                    C26947a.this.m138793A();
                } catch (Exception e11) {
                    C26947a c26947a2 = C26947a.this;
                    c26947a2.f127398g = c26947a2.f127397f.m138869d();
                    C26947a.this.f127399h++;
                    if (e11 instanceof NoDataException) {
                        C26947a.f127391s++;
                    }
                }
                return C24848g0.f119245a;
            } finally {
                C26947a.this.f127400i++;
                C26947a.f127389q++;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u10.a$e */
    /* loaded from: classes5.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {
        e() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(C26947a c26947a) {
            AbstractC19074t.m100208f(c26947a, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(c26947a.m138825F(), C26947a.this.m138825F()));
        }
    }

    public C26947a(CoroutineScope coroutineScope, c cVar) {
        AbstractC19074t.m100208f(coroutineScope, "scope");
        this.f127392a = coroutineScope;
        this.f127393b = AbstractC28684a.Companion.m143667D();
        this.f127394c = new ArrayList();
        this.f127397f = new C26948b();
        this.f127398g = -1;
        this.f127405n = new ArrayList();
        f127388p.add(this);
        if (cVar != null) {
            m138828J(cVar);
        }
        this.f127397f.m138878p(new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final void m138793A() {
        InterfaceC18509p interfaceC18509p;
        ComplexAds.Config config;
        Object m131205e0;
        Object m131205e02;
        Object m131205e03;
        int m138871f = this.f127397f.m138871f();
        int m138872g = this.f127397f.m138872g();
        if (this.f127402k || (interfaceC18509p = this.f127403l) == null || (config = this.f127396e) == null) {
            return;
        }
        if (!this.f127394c.isEmpty()) {
            m131205e0 = AbstractC25332a0.m131205e0(this.f127394c);
            VideoAdsData videoAdsData = (VideoAdsData) m131205e0;
            if (((m138872g >= config.m50884d() || videoAdsData.m51277p()) && m138871f >= config.m50883c()) || m138871f >= config.m50881a()) {
                this.f127402k = true;
                Integer valueOf = Integer.valueOf(this.f127397f.m138869d());
                m131205e02 = AbstractC25332a0.m131205e0(this.f127394c);
                int intValue = ((Number) interfaceC18509p.mo240pC(valueOf, m131205e02)).intValue();
                if (intValue == -1) {
                    return;
                }
                ArrayList arrayList = this.f127405n;
                m131205e03 = AbstractC25332a0.m131205e0(this.f127394c);
                arrayList.add(new C26948b.a((VideoAdsData) m131205e03, config, this.f127397f.m138870e(intValue)));
                return;
            }
            return;
        }
        if (this.f127399h > 0) {
            m138796D();
        }
    }

    /* renamed from: B */
    private final int m138794B(int i11) {
        if (i11 < 0 || i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 1;
        }
        return m138794B(i11 - 2) + m138794B(i11 - 1);
    }

    /* renamed from: C */
    private final int m138795C() {
        int i11 = this.f127399h;
        if (i11 == 0) {
            return 0;
        }
        ComplexAds.Config config = this.f127396e;
        if (config == null) {
            return m138794B(i11 + 5);
        }
        return i11 * config.m50882b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public final void m138796D() {
        if (this.f127399h <= 0 || this.f127397f.m138869d() - this.f127398g >= m138795C()) {
            BuildersKt__Builders_commonKt.m112540d(this.f127392a, null, null, new d(null), 3, null);
        }
    }

    /* renamed from: H */
    public static /* synthetic */ void m138797H(C26947a c26947a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c26947a.m138826G(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public final List m138798O(ArrayList arrayList) {
        int m131511r;
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((C26948b.a) it.next()).m138882c()));
        }
        return arrayList2;
    }

    /* renamed from: E */
    public final ArrayList m138824E() {
        return this.f127405n;
    }

    /* renamed from: F */
    public final String m138825F() {
        return this.f127406o;
    }

    /* renamed from: G */
    public final void m138826G(boolean z11) {
        this.f127396e = null;
        this.f127395d = null;
        this.f127400i = 0;
        this.f127399h = 0;
        this.f127401j = 0;
        this.f127405n.clear();
        this.f127394c.clear();
        if (!z11) {
            m138796D();
        }
    }

    /* renamed from: I */
    public final void m138827I() {
        m138826G(true);
        AbstractC25378x.m131542D(f127388p, new e());
        this.f127403l = null;
        this.f127404m = null;
    }

    /* renamed from: J */
    public final void m138828J(c cVar) {
        AbstractC19074t.m100208f(cVar, "savedInstance");
        this.f127394c.addAll(cVar.m138852b());
        this.f127395d = cVar.m138859i();
        this.f127396e = cVar.m138853c();
        this.f127397f.m138876n(cVar.m138858h());
        this.f127405n.addAll(cVar.m138851a());
        this.f127398g = cVar.m138856f();
        this.f127399h = cVar.m138855e();
        this.f127400i = cVar.m138857g();
        this.f127401j = cVar.m138854d();
        this.f127402k = cVar.m138860j();
    }

    /* renamed from: K */
    public final void m138829K(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "callback");
        this.f127404m = interfaceC18494a;
    }

    /* renamed from: L */
    public final void m138830L(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "callback");
        this.f127403l = interfaceC18509p;
    }

    /* renamed from: M */
    public final void m138831M(String str) {
        this.f127406o = str;
    }

    /* renamed from: N */
    public final c m138832N() {
        List m131185M0;
        List m131185M02;
        m131185M0 = AbstractC25332a0.m131185M0(this.f127394c);
        LoadMoreInfo loadMoreInfo = this.f127395d;
        ComplexAds.Config config = this.f127396e;
        C26948b.d m138879q = this.f127397f.m138879q();
        m131185M02 = AbstractC25332a0.m131185M0(this.f127405n);
        return new c(m131185M0, loadMoreInfo, config, m138879q, m131185M02, this.f127398g, this.f127399h, this.f127400i, this.f127401j, this.f127402k);
    }

    /* renamed from: z */
    public final void m138833z(C31179n0 c31179n0) {
        AbstractC19074t.m100208f(c31179n0, "adapter");
        this.f127397f.m138867b(c31179n0);
    }
}
