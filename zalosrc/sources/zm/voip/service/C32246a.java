package zm.voip.service;

import am.AbstractC0924m0;
import android.graphics.Bitmap;
import bp0.AbstractC3082b0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import me0.AbstractC23041d2;
import me0.C23278z2;
import mm0.AbstractC23352g;
import nh0.C23793c;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import p354n3.C23528a;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24002m;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import ro0.C25937a;
import sm0.AbstractC26327c;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: zm.voip.service.a */
/* loaded from: classes7.dex */
public final class C32246a {

    /* renamed from: h */
    public static final a f148777h = new a(null);

    /* renamed from: a */
    private final InterfaceC23792b f148778a;

    /* renamed from: b */
    private final InterfaceC24854k f148779b;

    /* renamed from: c */
    private volatile C25937a f148780c;

    /* renamed from: d */
    private final InterfaceC24854k f148781d;

    /* renamed from: e */
    private AtomicBoolean f148782e;

    /* renamed from: f */
    private String f148783f;

    /* renamed from: g */
    private final CoroutineScope f148784g;

    /* renamed from: zm.voip.service.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C32246a m155689a() {
            return b.f148785a.m155690a();
        }
    }

    /* renamed from: zm.voip.service.a$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f148785a = new b();

        /* renamed from: b */
        private static final C32246a f148786b = new C32246a(C23793c.Companion.m124321a());

        private b() {
        }

        /* renamed from: a */
        public final C32246a m155690a() {
            return f148786b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.a$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f148787q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23528a mo12V4() {
            return new C23528a(MainApplication.Companion.m35500c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.a$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f148788q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final List mo12V4() {
            return Collections.synchronizedList(new ArrayList());
        }
    }

    /* renamed from: zm.voip.service.a$e */
    /* loaded from: classes7.dex */
    public static final class e extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C25937a f148789l1;

        /* renamed from: m1 */
        final /* synthetic */ boolean f148790m1;

        /* renamed from: n1 */
        final /* synthetic */ C32246a f148791n1;

        e(C25937a c25937a, boolean z11, C32246a c32246a) {
            this.f148789l1 = c25937a;
            this.f148790m1 = z11;
            this.f148791n1 = c32246a;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap bitmap;
            C25937a c25937a = this.f148789l1;
            if (c3979l != null) {
                bitmap = c3979l.m18839c();
            } else {
                bitmap = null;
            }
            c25937a.m133641f(bitmap);
            if (this.f148790m1) {
                this.f148791n1.m155646I();
            }
        }
    }

    /* renamed from: zm.voip.service.a$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148792t;

        f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            ArrayList arrayList;
            int m131511r;
            File[] listFiles;
            AbstractC28298d.m142578e();
            if (this.f148792t == 0) {
                AbstractC24862s.m129228b(obj);
                List m155678x = C32246a.this.m155678x();
                C32246a c32246a = C32246a.this;
                synchronized (m155678x) {
                    List m155678x2 = c32246a.m155678x();
                    m131511r = AbstractC25370t.m131511r(m155678x2, 10);
                    arrayList = new ArrayList(m131511r);
                    Iterator it = m155678x2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(c32246a.m155681C(((C25937a) it.next()).m133639d()));
                    }
                }
                File file = new File(C20131e.f99303a.m104951f());
                if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                    AbstractC19074t.m100205c(listFiles);
                    for (File file2 : listFiles) {
                        if (file2.isFile() && !arrayList.contains(file2.getName())) {
                            AbstractC20130d.m104858T0(file2);
                        }
                    }
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zm.voip.service.a$g */
    /* loaded from: classes7.dex */
    public static final class g extends C24002m {

        /* renamed from: A0 */
        final /* synthetic */ C25937a f148794A0;

        /* renamed from: B0 */
        final /* synthetic */ boolean f148795B0;

        /* renamed from: y0 */
        final /* synthetic */ boolean f148796y0;

        /* renamed from: z0 */
        final /* synthetic */ C32246a f148797z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z11, C32246a c32246a, C25937a c25937a, boolean z12) {
            super(3);
            this.f148796y0 = z11;
            this.f148797z0 = c32246a;
            this.f148794A0 = c25937a;
            this.f148795B0 = z12;
        }

        @Override // p379o3.C24002m
        /* renamed from: E1 */
        protected void mo16457E1(String str, InterfaceC3968a interfaceC3968a, File file, C23995f c23995f) {
            if (file != null && this.f148796y0) {
                this.f148797z0.m155675t(this.f148794A0, file, this.f148795B0);
            }
        }
    }

    /* renamed from: zm.voip.service.a$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148798t;

        /* renamed from: u */
        final /* synthetic */ JSONObject f148799u;

        /* renamed from: v */
        final /* synthetic */ C32246a f148800v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(JSONObject jSONObject, C32246a c32246a, Continuation continuation) {
            super(2, continuation);
            this.f148799u = jSONObject;
            this.f148800v = c32246a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f148799u, this.f148800v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            JSONArray jSONArray;
            AbstractC28298d.m142578e();
            if (this.f148798t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC3082b0.m15424f("CallBg", "onReceiveBrandBgsCmd600 " + this.f148799u);
                C32246a c32246a = this.f148800v;
                JSONObject jSONObject = this.f148799u;
                if (jSONObject != null) {
                    jSONArray = jSONObject.optJSONArray("theme");
                } else {
                    jSONArray = null;
                }
                c32246a.m155653V(c32246a.m155647K(jSONArray), false, false);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zm.voip.service.a$i */
    /* loaded from: classes7.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148801t;

        /* renamed from: v */
        final /* synthetic */ boolean f148803v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f148803v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f148803v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f148801t == 0) {
                AbstractC24862s.m129228b(obj);
                String m2978D = AbstractC0924m0.m2978D();
                C32246a c32246a = C32246a.this;
                boolean z11 = this.f148803v;
                c32246a.f148783f = m2978D;
                AbstractC3082b0.m15424f("CallBg", "preloadBrandBackground " + m2978D);
                if (m2978D != null && m2978D.length() != 0) {
                    C32246a.m155654W(c32246a, c32246a.m155647K(new JSONArray(m2978D)), z11, false, 4, null);
                }
                c32246a.f148782e.set(true);
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

    /* renamed from: zm.voip.service.a$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148804t;

        /* renamed from: u */
        private /* synthetic */ Object f148805u;

        /* renamed from: zm.voip.service.a$j$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f148807t;

            /* renamed from: u */
            final /* synthetic */ C32246a f148808u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C32246a c32246a, Continuation continuation) {
                super(2, continuation);
                this.f148808u = c32246a;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f148808u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f148807t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C32246a c32246a = this.f148808u;
                    this.f148807t = 1;
                    if (C32246a.m155650N(c32246a, false, this, 1, null) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            j jVar = new j(continuation);
            jVar.f148805u = obj;
            return jVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f148804t == 0) {
                AbstractC24862s.m129228b(obj);
                BuildersKt__Builders_commonKt.m112540d((CoroutineScope) this.f148805u, null, null, new a(C32246a.this, null), 3, null);
                C32246a.m155651Q(C32246a.this, false, 1, null);
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

    /* renamed from: zm.voip.service.a$k */
    /* loaded from: classes7.dex */
    public static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148809t;

        /* renamed from: u */
        final /* synthetic */ boolean f148810u;

        /* renamed from: v */
        final /* synthetic */ C32246a f148811v;

        /* renamed from: zm.voip.service.a$k$a */
        /* loaded from: classes7.dex */
        public static final class a extends C23999j {

            /* renamed from: l1 */
            final /* synthetic */ C25937a f148812l1;

            /* renamed from: m1 */
            final /* synthetic */ C32246a f148813m1;

            a(C25937a c25937a, C32246a c32246a) {
                this.f148812l1 = c25937a;
                this.f148813m1 = c32246a;
            }

            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(interfaceC3968a, "iv");
                AbstractC19074t.m100208f(c23995f, "status");
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                if (c3979l != null) {
                    C25937a c25937a = this.f148812l1;
                    C32246a c32246a = this.f148813m1;
                    c25937a.m133641f(c3979l.m18839c());
                    c32246a.m155646I();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z11, C32246a c32246a, Continuation continuation) {
            super(2, continuation);
            this.f148810u = z11;
            this.f148811v = c32246a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f148810u, this.f148811v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean m127128x;
            AbstractC28298d.m142578e();
            if (this.f148809t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!this.f148810u) {
                    C32246a c32246a = this.f148811v;
                    if (c32246a.m155644G(c32246a.f148780c)) {
                        return C24848g0.f119245a;
                    }
                }
                String m100608s = C19172a.m100608s("features@voip@event_background@url", null, 2, null);
                long m100601l = C19172a.m100601l("features@voip@event_background@start_ts", 0, 2, null);
                long m100601l2 = C19172a.m100601l("features@voip@event_background@end_ts", 0, 2, null);
                AbstractC3082b0.m15424f("CallBg", " read configs url " + m100608s + " - start " + m100601l + " - end " + m100601l2);
                C25937a c25937a = this.f148811v.f148780c;
                if (c25937a != null) {
                    C32246a c32246a2 = this.f148811v;
                    if (AbstractC19074t.m100204b(c25937a.m133639d(), m100608s)) {
                        c25937a.m133642g(m100601l);
                        c25937a.m133640e(m100601l2);
                        if (c32246a2.m155644G(c25937a)) {
                            return C24848g0.f119245a;
                        }
                    }
                }
                C32246a c32246a3 = this.f148811v;
                C25937a c25937a2 = new C25937a(m100608s, C25937a.b.f123675p, m100601l, m100601l2, null, 16, null);
                C32246a c32246a4 = this.f148811v;
                m127128x = AbstractC24341v.m127128x(c25937a2.m133639d());
                if (!m127128x && c25937a2.m133636a() >= c32246a4.m155679y()) {
                    ((C23528a) c32246a4.m155677v().m123612r(new C3977j(MainApplication.Companion.m35500c()))).m123579C(c25937a2.m133639d(), C23278z2.f112845a.m120167B(), new a(c25937a2, c32246a4));
                    c32246a3.f148780c = c25937a2;
                    return C24848g0.f119245a;
                }
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

    /* renamed from: zm.voip.service.a$l */
    /* loaded from: classes7.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148814t;

        l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            List m131185M0;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f148814t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                if (!C32246a.this.f148782e.get()) {
                    C32246a c32246a = C32246a.this;
                    this.f148814t = 1;
                    if (C32246a.m155650N(c32246a, false, this, 1, null) == m142578e) {
                        return m142578e;
                    }
                } else if ((!C32246a.this.m155678x().isEmpty()) && C32246a.this.m155642E() == null) {
                    C32246a c32246a2 = C32246a.this;
                    m131185M0 = AbstractC25332a0.m131185M0(c32246a2.m155678x());
                    C32246a.m155654W(c32246a2, m131185M0, false, false, 6, null);
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.a$m */
    /* loaded from: classes7.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148816t;

        m(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f148816t == 0) {
                AbstractC24862s.m129228b(obj);
                C32246a.this.f148780c = null;
                C32246a.this.f148783f = null;
                C32246a.this.m155678x().clear();
                C32246a.this.f148782e.set(false);
                C32246a.this.m155676u();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zm.voip.service.a$n */
    /* loaded from: classes7.dex */
    public static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148818t;

        /* renamed from: v */
        final /* synthetic */ String f148820v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, Continuation continuation) {
            super(2, continuation);
            this.f148820v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(this.f148820v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f148818t == 0) {
                AbstractC24862s.m129228b(obj);
                if (!AbstractC19074t.m100204b(C32246a.this.f148783f, this.f148820v)) {
                    C32246a.this.f148783f = this.f148820v;
                    AbstractC0924m0.m3990le(this.f148820v);
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zm.voip.service.a$o */
    /* loaded from: classes7.dex */
    public static final class o extends AbstractC27310a implements CoroutineExceptionHandler {
        public o(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.a$p */
    /* loaded from: classes7.dex */
    public static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f148821t;

        /* renamed from: v */
        final /* synthetic */ JSONObject f148823v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(JSONObject jSONObject, Continuation continuation) {
            super(2, continuation);
            this.f148823v = jSONObject;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f148823v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            ArrayList arrayList;
            List m131223w0;
            ArrayList arrayList2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f148821t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                AbstractC3082b0.m15424f("CallBg", "updateBgFromCallCmd isPreload " + C32246a.this.f148782e.get() + " - " + this.f148823v);
                if (!C32246a.this.f148782e.get()) {
                    C32246a c32246a = C32246a.this;
                    this.f148821t = 1;
                    if (c32246a.m155649M(true, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            boolean z11 = false;
            if (this.f148823v == null) {
                C32246a c32246a2 = C32246a.this;
                List m155678x = c32246a2.m155678x();
                C32246a c32246a3 = C32246a.this;
                synchronized (m155678x) {
                    try {
                        List m155678x2 = c32246a3.m155678x();
                        arrayList2 = new ArrayList();
                        for (Object obj2 : m155678x2) {
                            if (z11) {
                                arrayList2.add(obj2);
                            } else {
                                C25937a c25937a = (C25937a) obj2;
                                if (c25937a.m133638c() >= c32246a3.m155679y() || c25937a.m133636a() <= c32246a3.m155679y()) {
                                    arrayList2.add(obj2);
                                    z11 = true;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                C32246a.m155654W(c32246a2, arrayList2, false, false, 6, null);
            } else {
                C25937a c25937a2 = new C25937a(this.f148823v, C25937a.b.f123676q);
                C32246a c32246a4 = C32246a.this;
                if (c25937a2.m133638c() == 0) {
                    c25937a2.m133642g(c32246a4.m155679y());
                }
                if (c25937a2.m133636a() == 0) {
                    c25937a2.m133640e(c32246a4.m155680z());
                }
                if (c32246a4.m155643F(c25937a2)) {
                    synchronized (c32246a4.m155678x()) {
                        try {
                            List m155678x3 = c32246a4.m155678x();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : m155678x3) {
                                if (z11) {
                                    arrayList3.add(obj3);
                                } else {
                                    C25937a c25937a3 = (C25937a) obj3;
                                    if (c25937a3.m133638c() >= c25937a2.m133636a() || c25937a3.m133636a() <= c25937a2.m133638c()) {
                                        arrayList3.add(obj3);
                                        z11 = true;
                                    }
                                }
                            }
                            m131223w0 = AbstractC25332a0.m131223w0(arrayList3, c25937a2);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    C32246a.m155654W(c32246a4, m131223w0, false, false, 6, null);
                } else {
                    synchronized (c32246a4.m155678x()) {
                        try {
                            List m155678x4 = c32246a4.m155678x();
                            arrayList = new ArrayList();
                            for (Object obj4 : m155678x4) {
                                if (z11) {
                                    arrayList.add(obj4);
                                } else {
                                    C25937a c25937a4 = (C25937a) obj4;
                                    if (c25937a4.m133638c() >= c32246a4.m155679y() || c25937a4.m133636a() <= c32246a4.m155679y()) {
                                        arrayList.add(obj4);
                                        z11 = true;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    C32246a.m155654W(c32246a4, arrayList, false, false, 6, null);
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: zm.voip.service.a$q */
    /* loaded from: classes7.dex */
    public static final class q implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            m135478b = AbstractC26327c.m135478b(Long.valueOf(((C25937a) obj).m133638c()), Long.valueOf(((C25937a) obj2).m133638c()));
            return m135478b;
        }
    }

    public C32246a(InterfaceC23792b interfaceC23792b) {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
        this.f148778a = interfaceC23792b;
        m129210a = AbstractC24856m.m129210a(c.f148787q);
        this.f148779b = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f148788q);
        this.f148781d = m129210a2;
        this.f148782e = new AtomicBoolean(false);
        this.f148784g = CoroutineScopeKt.m112637a(SupervisorKt.m112864b(null, 1, null).mo112823d0(new o(CoroutineExceptionHandler.f105837l)));
    }

    /* renamed from: A */
    private final File m155639A(String str) {
        return new File(C20131e.f99303a.m104951f() + m155681C(str));
    }

    /* renamed from: B */
    private final File m155640B(C25937a c25937a) {
        return m155639A(c25937a.m133639d());
    }

    /* renamed from: D */
    public static final C32246a m155641D() {
        return f148777h.m155689a();
    }

    /* renamed from: E */
    public final C25937a m155642E() {
        Object obj;
        C25937a c25937a;
        synchronized (m155678x()) {
            try {
                Iterator it = m155678x().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (m155644G((C25937a) obj)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                c25937a = (C25937a) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c25937a;
    }

    /* renamed from: F */
    public final boolean m155643F(C25937a c25937a) {
        if (c25937a != null && c25937a.m133639d().length() > 0 && c25937a.m133638c() < c25937a.m133636a() && c25937a.m133636a() > m155679y() && c25937a.m133638c() <= m155679y()) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final boolean m155644G(C25937a c25937a) {
        if (c25937a != null && m155643F(c25937a) && c25937a.m133637b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    private final void m155645H(C25937a c25937a, File file, boolean z11, boolean z12) {
        AbstractC3082b0.m15424f("CallBg", "loadBrandBackground " + z11 + " " + c25937a);
        ((C23528a) m155677v().m123612r(new C3977j(MainApplication.Companion.m35500c()))).m123601f(c25937a.m133639d(), file, new g(z11, this, c25937a, z12));
    }

    /* renamed from: I */
    public final void m155646I() {
        C23744a.Companion.m124119a().m124116d(40018, new Object[0]);
    }

    /* renamed from: K */
    public final List m155647K(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        AbstractC19074t.m100205c(optJSONObject);
                        arrayList.add(new C25937a(optJSONObject, C25937a.b.f123676q));
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    private final JSONArray m155648L() {
        JSONArray jSONArray = new JSONArray();
        synchronized (m155678x()) {
            try {
                Iterator it = m155678x().iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C25937a) it.next()).m133643h());
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jSONArray;
    }

    /* renamed from: M */
    public final Object m155649M(boolean z11, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new i(z11, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: N */
    static /* synthetic */ Object m155650N(C32246a c32246a, boolean z11, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c32246a.m155649M(z11, continuation);
    }

    /* renamed from: Q */
    public static /* synthetic */ Job m155651Q(C32246a c32246a, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c32246a.m155684P(z11);
    }

    /* renamed from: T */
    private final Job m155652T(String str) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new n(str, null), 2, null);
        return m112540d;
    }

    /* renamed from: V */
    public final void m155653V(List list, boolean z11, boolean z12) {
        List m131177E0;
        boolean z13;
        AbstractC3082b0.m15424f("CallBg", "updateBrandBackgrounds " + list);
        m131177E0 = AbstractC25332a0.m131177E0(m155655X(list), new q());
        m155674s(m131177E0);
        m155678x().clear();
        m155678x().addAll(m131177E0);
        m155676u();
        boolean z14 = false;
        if (!z11) {
            synchronized (m155678x()) {
                try {
                    z13 = false;
                    int i11 = 0;
                    for (Object obj : m155678x()) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            AbstractC25368s.m131509q();
                        }
                        C25937a c25937a = (C25937a) obj;
                        if (c25937a.m133637b() == null) {
                            boolean z15 = true;
                            if (i11 == 0) {
                                z13 = true;
                            }
                            File m155640B = m155640B(c25937a);
                            if (i11 != 0) {
                                z15 = false;
                            }
                            m155645H(c25937a, m155640B, z15, z12);
                        }
                        i11 = i12;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            z14 = z13;
        }
        if (z12 && !z11 && !z14) {
            m155646I();
        }
        String jSONArray = m155648L().toString();
        AbstractC19074t.m100207e(jSONArray, "toString(...)");
        m155652T(jSONArray);
    }

    /* renamed from: W */
    static /* synthetic */ void m155654W(C32246a c32246a, List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = true;
        }
        c32246a.m155653V(list, z11, z12);
    }

    /* renamed from: X */
    private final List m155655X(List list) {
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        for (Object obj : list) {
            if (z11) {
                arrayList.add(obj);
            } else {
                C25937a c25937a = (C25937a) obj;
                if (c25937a.m133639d().length() != 0 && c25937a.m133638c() > 0 && c25937a.m133636a() > 0 && c25937a.m133638c() <= c25937a.m133636a() && c25937a.m133636a() >= m155679y()) {
                    arrayList.add(obj);
                    z11 = true;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private final void m155674s(List list) {
        Object obj;
        synchronized (m155678x()) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C25937a c25937a = (C25937a) it.next();
                    if (c25937a.m133637b() == null) {
                        Iterator it2 = m155678x().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (AbstractC19074t.m100204b(((C25937a) obj).m133639d(), c25937a.m133639d())) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        C25937a c25937a2 = (C25937a) obj;
                        if (c25937a2 != null) {
                            c25937a.m133641f(c25937a2.m133637b());
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: t */
    public final void m155675t(C25937a c25937a, File file, boolean z11) {
        AbstractC3082b0.m15424f("CallBg", "decodeImage " + c25937a);
        m155677v().m123579C(file.getPath(), C23278z2.f112845a.m120167B(), new e(c25937a, z11, this));
    }

    /* renamed from: u */
    public final Job m155676u() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new f(null), 2, null);
        return m112540d;
    }

    /* renamed from: v */
    public final C23528a m155677v() {
        return (C23528a) this.f148779b.getValue();
    }

    /* renamed from: x */
    public final List m155678x() {
        Object value = this.f148781d.getValue();
        AbstractC19074t.m100207e(value, "getValue(...)");
        return (List) value;
    }

    /* renamed from: y */
    public final long m155679y() {
        return this.f148778a.mo124314i() / 1000;
    }

    /* renamed from: z */
    public final long m155680z() {
        Calendar calendar = Calendar.getInstance();
        AbstractC19074t.m100207e(calendar, "getInstance(...)");
        long j11 = 1000;
        calendar.setTimeInMillis(m155679y() * j11);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis() / j11;
    }

    /* renamed from: C */
    public final String m155681C(String str) {
        AbstractC19074t.m100208f(str, "originalURL");
        String m118220s = AbstractC23041d2.m118220s(str);
        AbstractC19074t.m100207e(m118220s, "getFileExtension(...)");
        return AbstractC23352g.m122788d(str) + m118220s;
    }

    /* renamed from: J */
    public final Job m155682J(JSONObject jSONObject) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new h(jSONObject, this, null), 2, null);
        return m112540d;
    }

    /* renamed from: O */
    public final Job m155683O() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new j(null), 2, null);
        return m112540d;
    }

    /* renamed from: P */
    public final Job m155684P(boolean z11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new k(z11, this, null), 2, null);
        return m112540d;
    }

    /* renamed from: R */
    public final Job m155685R() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new l(null), 2, null);
        return m112540d;
    }

    /* renamed from: S */
    public final Job m155686S() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new m(null), 2, null);
        return m112540d;
    }

    /* renamed from: U */
    public final Job m155687U(JSONObject jSONObject) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(this.f148784g, Dispatchers.m112680b(), null, new p(jSONObject, null), 2, null);
        return m112540d;
    }

    /* renamed from: w */
    public final C25937a m155688w() {
        C25937a c25937a;
        C25937a c25937a2;
        synchronized (m155678x()) {
            Iterator it = m155678x().iterator();
            do {
                c25937a = null;
                if (it.hasNext()) {
                    c25937a2 = (C25937a) it.next();
                } else {
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    if (!m155644G(this.f148780c)) {
                        return null;
                    }
                    return this.f148780c;
                }
            } while (!m155643F(c25937a2));
            if (c25937a2.m133637b() != null) {
                c25937a = c25937a2;
            }
            return c25937a;
        }
    }
}
