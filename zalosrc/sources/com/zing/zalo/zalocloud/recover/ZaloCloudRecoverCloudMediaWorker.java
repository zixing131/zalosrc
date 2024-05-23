package com.zing.zalo.zalocloud.recover;

import ac.C0708i;
import ac.C0732w;
import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.lifecycle.AbstractC1777k;
import androidx.lifecycle.LiveData;
import androidx.work.AbstractC2151i0;
import androidx.work.AbstractC2252t;
import androidx.work.C2142e;
import androidx.work.C2148h;
import androidx.work.C2149h0;
import androidx.work.C2244l;
import androidx.work.C2256x;
import androidx.work.CoroutineWorker;
import androidx.work.EnumC2134a;
import androidx.work.EnumC2242k;
import androidx.work.EnumC2254v;
import androidx.work.WorkerParameters;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zalocloud.recover.AbstractC16889b;
import com.zing.zalo.zalocloud.recover.C16890c;
import com.zing.zalo.zalocloud.recover.C16891d;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20128b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k30.C21459a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import ln0.AbstractC22543l;
import me0.AbstractC23088h5;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nl.C23870a;
import p019aj.C0876j;
import p348mi.AbstractC23306f;
import p363nh.C23750d;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* loaded from: classes7.dex */
public final class ZaloCloudRecoverCloudMediaWorker extends CoroutineWorker {

    /* renamed from: A */
    private static final InterfaceC24854k f85887A;

    /* renamed from: B */
    private static final MutableStateFlow f85888B;

    /* renamed from: C */
    private static final StateFlow f85889C;
    public static final C16883e Companion = new C16883e(null);

    /* renamed from: x */
    private static final InterfaceC24854k f85890x;

    /* renamed from: y */
    private static final InterfaceC24854k f85891y;

    /* renamed from: z */
    private static final InterfaceC24854k f85892z;

    /* renamed from: s */
    private final Context f85893s;

    /* renamed from: t */
    private final CoroutineScope f85894t;

    /* renamed from: u */
    private final CoroutineScope f85895u;

    /* renamed from: v */
    private long f85896v;

    /* renamed from: w */
    private float f85897w;

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$a */
    /* loaded from: classes7.dex */
    static final class C16879a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16879a f85898q = new C16879a();

        C16879a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2142e mo12V4() {
            return new C2142e.a().m11514b(EnumC2254v.UNMETERED).m11515c(true).m11517e(true).m11513a();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$b */
    /* loaded from: classes7.dex */
    static final class C16880b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16880b f85899q = new C16880b();

        C16880b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final AbstractC2151i0 mo12V4() {
            return AbstractC2151i0.m11547h(MainApplication.Companion.m35500c());
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$c */
    /* loaded from: classes7.dex */
    static final class C16881c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16881c f85900q = new C16881c();

        C16881c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C2256x mo12V4() {
            return (C2256x) ((C2256x.a) ((C2256x.a) ((C2256x.a) new C2256x.a(ZaloCloudRecoverCloudMediaWorker.class).m11862a("ZaloCloudRecoverCloudMediaWorker")).m11868i(EnumC2134a.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m11869j(ZaloCloudRecoverCloudMediaWorker.Companion.m90193g())).m11863b();
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$d */
    /* loaded from: classes7.dex */
    static final class C16882d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C16882d f85901q = new C16882d();

        C16882d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C16891d mo12V4() {
            C23870a m120679j2 = AbstractC23306f.m120679j2();
            AbstractC19074t.m100207e(m120679j2, "provideZaloCloudRepo(...)");
            C0876j m120584H0 = AbstractC23306f.m120584H0();
            AbstractC19074t.m100207e(m120584H0, "provideMessageRepo(...)");
            C16888a m120627V1 = AbstractC23306f.m120627V1();
            AbstractC19074t.m100207e(m120627V1, "provideZCloudGracePeriodManager(...)");
            return new C16891d(m120679j2, m120584H0, m120627V1);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$e */
    /* loaded from: classes7.dex */
    public static final class C16883e {
        private C16883e() {
        }

        public /* synthetic */ C16883e(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: g */
        public final C2142e m90193g() {
            return (C2142e) ZaloCloudRecoverCloudMediaWorker.f85892z.getValue();
        }

        /* renamed from: i */
        private final AbstractC2151i0 m90194i() {
            return (AbstractC2151i0) ZaloCloudRecoverCloudMediaWorker.f85890x.getValue();
        }

        /* renamed from: j */
        private final C2256x m90195j() {
            return (C2256x) ZaloCloudRecoverCloudMediaWorker.f85887A.getValue();
        }

        /* renamed from: k */
        public final C16891d m90196k() {
            return (C16891d) ZaloCloudRecoverCloudMediaWorker.f85891y.getValue();
        }

        /* renamed from: o */
        public final Flow m90197o() {
            return m90196k().m90293y();
        }

        /* renamed from: p */
        public final void m90198p(AbstractC16889b abstractC16889b) {
            if (abstractC16889b == null) {
                return;
            }
            if (abstractC16889b instanceof AbstractC16889b.a) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_low_battery", null, null, null, 14, null);
                return;
            }
            if (abstractC16889b instanceof AbstractC16889b.b) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_no_wifi", null, null, null, 14, null);
                return;
            }
            if (abstractC16889b instanceof AbstractC16889b.d) {
                long m90260c = ((AbstractC16889b.d) abstractC16889b).m90260c();
                C0732w m1189a = C0732w.Companion.m1189a();
                C0708i c0708i = new C0708i();
                c0708i.m1073d("free_storage_missing", C21459a.m111034b(m90260c));
                C24848g0 c24848g0 = C24848g0.f119245a;
                C0732w.m1177r(m1189a, "zcloud_grace_download_full_storage", null, c0708i, null, 10, null);
                return;
            }
            if (!(abstractC16889b instanceof AbstractC16889b.c)) {
                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_unknown_error", null, null, null, 14, null);
            }
        }

        /* renamed from: e */
        public final void m90199e() {
            m90196k().m90292r();
            m90194i().mo11549a("ZaloCloudRecoverCloudMediaWorker");
        }

        /* renamed from: f */
        public final C23750d m90200f(Context context, C16890c.a aVar) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            return C16890c.f85935a.m90261a(context, aVar);
        }

        /* renamed from: h */
        public final StateFlow m90201h() {
            return ZaloCloudRecoverCloudMediaWorker.f85889C;
        }

        /* renamed from: l */
        public final boolean m90202l() {
            if (C20128b.m104756c(MainApplication.Companion.m35500c()) > 15) {
                return true;
            }
            return false;
        }

        /* renamed from: m */
        public final boolean m90203m() {
            if (C20128b.m104764k() - AbstractC23306f.m120627V1().m90240k() >= 0) {
                return true;
            }
            return false;
        }

        /* renamed from: n */
        public final LiveData m90204n() {
            LiveData mo11556i = m90194i().mo11556i("ZaloCloudRecoverCloudMediaWorker");
            AbstractC19074t.m100207e(mo11556i, "getWorkInfosByTagLiveData(...)");
            return mo11556i;
        }

        /* renamed from: q */
        public final void m90205q(Context context) {
            int m116580c;
            AbstractC16889b abstractC16889b;
            if (context != null && AbstractC23306f.m120627V1().m90248s()) {
                ZaloCloudRecoverCloudMediaWorker.f85888B.mo113433d(AbstractC23306f.m120627V1().m90234d());
                C16888a m120627V1 = AbstractC23306f.m120627V1();
                AbstractC19074t.m100207e(m120627V1, "provideZCloudGracePeriodManager(...)");
                float m90243n = m120627V1.m90243n();
                m116580c = AbstractC22543l.m116580c(m120627V1.m90242m(), 1);
                float f11 = 100.0f - ((m90243n / m116580c) * 100);
                if (!m90202l()) {
                    abstractC16889b = new AbstractC16889b.a(f11);
                } else if (!C23055e5.m118270e()) {
                    abstractC16889b = new AbstractC16889b.b(f11);
                } else if (!m90203m()) {
                    abstractC16889b = new AbstractC16889b.d(m120627V1.m90240k() - C20128b.m104764k(), f11);
                } else {
                    abstractC16889b = null;
                }
                if (abstractC16889b != null) {
                    m90198p(abstractC16889b);
                    m90200f(context, new C16890c.a.b(abstractC16889b)).m124147b0();
                    m90207s(new AbstractC16884f.b(abstractC16889b));
                }
                AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).m11554f("ZaloCloudRecoverCloudMediaWorker", EnumC2242k.REPLACE, m90195j());
            }
        }

        /* renamed from: r */
        public final void m90206r() {
            AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).m11554f("ZaloCloudRecoverCloudMediaWorker", EnumC2242k.KEEP, m90195j()).getState();
        }

        /* renamed from: s */
        public final void m90207s(AbstractC16884f abstractC16884f) {
            AbstractC19074t.m100208f(abstractC16884f, "state");
            ZaloCloudRecoverCloudMediaWorker.f85888B.mo113433d(abstractC16884f);
            AbstractC23306f.m120627V1().m90225H(abstractC16884f.m90208a());
            if (abstractC16884f instanceof AbstractC16884f.b) {
                AbstractC23306f.m120627V1().m90227J(((AbstractC16884f.b) abstractC16884f).m90210b().m90258a());
            } else {
                AbstractC23306f.m120627V1().m90227J(AbstractC16889b.c.f85930d.m90258a());
            }
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$f */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC16884f {

        /* renamed from: a */
        private final int f85902a;

        /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$f$a */
        /* loaded from: classes7.dex */
        public static final class a extends AbstractC16884f {

            /* renamed from: b */
            private final float f85903b;

            public a(float f11) {
                super(2, null);
                this.f85903b = f11;
            }

            /* renamed from: b */
            public final float m90209b() {
                return this.f85903b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && Float.compare(this.f85903b, ((a) obj).f85903b) == 0;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f85903b);
            }

            public String toString() {
                return "Downloading(progress=" + this.f85903b + ")";
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$f$b */
        /* loaded from: classes7.dex */
        public static final class b extends AbstractC16884f {

            /* renamed from: b */
            private final AbstractC16889b f85904b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC16889b abstractC16889b) {
                super(3, null);
                AbstractC19074t.m100208f(abstractC16889b, "errorType");
                this.f85904b = abstractC16889b;
            }

            /* renamed from: b */
            public final AbstractC16889b m90210b() {
                return this.f85904b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC19074t.m100204b(this.f85904b, ((b) obj).f85904b);
            }

            public int hashCode() {
                return this.f85904b.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.f85904b + ")";
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$f$c */
        /* loaded from: classes7.dex */
        public static final class c extends AbstractC16884f {

            /* renamed from: b */
            public static final c f85905b = new c();

            private c() {
                super(0, null);
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$f$d */
        /* loaded from: classes7.dex */
        public static final class d extends AbstractC16884f {

            /* renamed from: b */
            private final int f85906b;

            public d(int i11) {
                super(i11, null);
                this.f85906b = i11;
            }

            /* renamed from: b */
            public final int m90211b() {
                return this.f85906b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f85906b == ((d) obj).f85906b;
            }

            public int hashCode() {
                return this.f85906b;
            }

            public String toString() {
                return "Success(stateValue=" + this.f85906b + ")";
            }
        }

        public /* synthetic */ AbstractC16884f(int i11, AbstractC19060k abstractC19060k) {
            this(i11);
        }

        /* renamed from: a */
        public final int m90208a() {
            return this.f85902a;
        }

        private AbstractC16884f(int i11) {
            this.f85902a = i11;
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$g */
    /* loaded from: classes7.dex */
    public static final class C16885g extends AbstractC29096d {

        /* renamed from: s */
        Object f85907s;

        /* renamed from: t */
        Object f85908t;

        /* renamed from: u */
        float f85909u;

        /* renamed from: v */
        /* synthetic */ Object f85910v;

        /* renamed from: x */
        int f85912x;

        C16885g(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f85910v = obj;
            this.f85912x |= Integer.MIN_VALUE;
            return ZaloCloudRecoverCloudMediaWorker.this.mo11443d(this);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$h */
    /* loaded from: classes7.dex */
    public static final class C16886h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85913t;

        /* renamed from: u */
        /* synthetic */ Object f85914u;

        /* renamed from: v */
        final /* synthetic */ C16888a f85915v;

        /* renamed from: w */
        final /* synthetic */ ZaloCloudRecoverCloudMediaWorker f85916w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16886h(C16888a c16888a, ZaloCloudRecoverCloudMediaWorker zaloCloudRecoverCloudMediaWorker, Continuation continuation) {
            super(2, continuation);
            this.f85915v = c16888a;
            this.f85916w = zaloCloudRecoverCloudMediaWorker;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16886h c16886h = new C16886h(this.f85915v, this.f85916w, continuation);
            c16886h.f85914u = obj;
            return c16886h;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f85913t == 0) {
                AbstractC24862s.m129228b(obj);
                C16891d.b bVar = (C16891d.b) this.f85914u;
                this.f85915v.m90231N(bVar.m90297d());
                this.f85915v.m90232O(bVar.m90296c());
                this.f85915v.m90229L(this.f85916w.f85896v);
                this.f85916w.f85896v = bVar.m90295b();
                this.f85916w.setProgressAsync(new C2148h.a().m11538e("Progress", bVar.m90294a()).m11534a());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(C16891d.b bVar, Continuation continuation) {
            return ((C16886h) mo238a(bVar, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$i */
    /* loaded from: classes7.dex */
    public static final class C16887i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f85917t;

        /* renamed from: u */
        /* synthetic */ Object f85918u;

        /* renamed from: com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker$i$a */
        /* loaded from: classes7.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f85920a;

            static {
                int[] iArr = new int[C2149h0.c.values().length];
                try {
                    iArr[C2149h0.c.RUNNING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C2149h0.c.SUCCEEDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C2149h0.c.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C2149h0.c.CANCELLED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f85920a = iArr;
            }
        }

        C16887i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C16887i c16887i = new C16887i(continuation);
            c16887i.f85918u = obj;
            return c16887i;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            AbstractC16884f abstractC16884f;
            AbstractC16884f abstractC16884f2;
            AbstractC16889b eVar;
            AbstractC16889b abstractC16889b;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f85917t;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            abstractC16889b = (AbstractC16889b) this.f85918u;
                            AbstractC24862s.m129228b(obj);
                            abstractC16884f = new AbstractC16884f.b(abstractC16889b);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        abstractC16884f2 = (AbstractC16884f) this.f85918u;
                        AbstractC24862s.m129228b(obj);
                        abstractC16884f = abstractC16884f2;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    List list = (List) this.f85918u;
                    if (list.isEmpty()) {
                        return C24848g0.f119245a;
                    }
                    C2149h0 c2149h0 = (C2149h0) list.get(0);
                    abstractC16884f = AbstractC16884f.c.f85905b;
                    int i12 = a.f85920a[c2149h0.m11542c().ordinal()];
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    ZaloCloudRecoverCloudMediaWorker.this.m90182y();
                                } else {
                                    AbstractC16889b.c cVar = AbstractC16889b.c.f85930d;
                                    int m11543d = c2149h0.m11543d();
                                    if (m11543d != -512) {
                                        if (m11543d != -256) {
                                            if (m11543d != 5) {
                                                if (m11543d == 7) {
                                                    eVar = new AbstractC16889b.b(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                                }
                                                eVar = cVar;
                                            } else {
                                                eVar = new AbstractC16889b.a(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                            }
                                        } else if (!C23055e5.m118270e()) {
                                            eVar = new AbstractC16889b.b(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                        } else {
                                            C16883e c16883e = ZaloCloudRecoverCloudMediaWorker.Companion;
                                            if (!c16883e.m90202l()) {
                                                eVar = new AbstractC16889b.a(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                            } else {
                                                if (!c16883e.m90203m()) {
                                                    eVar = new AbstractC16889b.d(ZaloCloudRecoverCloudMediaWorker.this.f85896v - C20128b.m104764k(), ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                                }
                                                eVar = cVar;
                                            }
                                        }
                                    } else {
                                        long m104764k = ZaloCloudRecoverCloudMediaWorker.this.f85896v - C20128b.m104764k();
                                        if (!C23055e5.m118270e()) {
                                            eVar = new AbstractC16889b.b(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                        } else if (!ZaloCloudRecoverCloudMediaWorker.Companion.m90202l()) {
                                            eVar = new AbstractC16889b.a(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                        } else if (m104764k > 0) {
                                            eVar = new AbstractC16889b.d(m104764k, ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                        } else {
                                            eVar = new AbstractC16889b.e(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                                        }
                                    }
                                    ZaloCloudRecoverCloudMediaWorker.Companion.m90198p(eVar);
                                    if (!AbstractC19074t.m100204b(eVar, cVar)) {
                                        ZaloCloudRecoverCloudMediaWorker zaloCloudRecoverCloudMediaWorker = ZaloCloudRecoverCloudMediaWorker.this;
                                        C2244l m90183z = zaloCloudRecoverCloudMediaWorker.m90183z(new C16890c.a.b(eVar));
                                        this.f85918u = eVar;
                                        this.f85917t = 2;
                                        if (zaloCloudRecoverCloudMediaWorker.m11447i(m90183z, this) == m142578e) {
                                            return m142578e;
                                        }
                                        abstractC16889b = eVar;
                                        abstractC16884f = new AbstractC16884f.b(abstractC16889b);
                                    }
                                }
                            } else {
                                C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_download_unknown_error", null, null, null, 14, null);
                                abstractC16884f = new AbstractC16884f.b(new AbstractC16889b.f(ZaloCloudRecoverCloudMediaWorker.this.f85897w));
                                C16890c.f85935a.m90261a(ZaloCloudRecoverCloudMediaWorker.this.m90184A(), new C16890c.a.b(new AbstractC16889b.e(ZaloCloudRecoverCloudMediaWorker.this.f85897w))).m124147b0();
                                ZaloCloudRecoverCloudMediaWorker.this.m90182y();
                            }
                        } else {
                            abstractC16884f = new AbstractC16884f.d(1);
                            C16890c.f85935a.m90261a(ZaloCloudRecoverCloudMediaWorker.this.m90184A(), C16890c.a.c.f85939a).m124147b0();
                            C26676b.m136957g("ZaloCloudRecoverCloudMediaWorker", "onFinishGracePeriod() - recover success", null, 4, null);
                            AbstractC23306f.m120627V1().m90251v(new AbstractC16884f.d(1));
                            ZaloCloudRecoverCloudMediaWorker.this.m90182y();
                        }
                    } else {
                        ZaloCloudRecoverCloudMediaWorker.this.f85897w = c2149h0.m11540a().m11530h("Progress", 0.0f);
                        AbstractC16884f.a aVar = new AbstractC16884f.a(ZaloCloudRecoverCloudMediaWorker.this.f85897w);
                        ZaloCloudRecoverCloudMediaWorker zaloCloudRecoverCloudMediaWorker2 = ZaloCloudRecoverCloudMediaWorker.this;
                        C2244l m90183z2 = zaloCloudRecoverCloudMediaWorker2.m90183z(new C16890c.a.C32793a(zaloCloudRecoverCloudMediaWorker2.f85897w));
                        this.f85918u = aVar;
                        this.f85917t = 1;
                        if (zaloCloudRecoverCloudMediaWorker2.m11447i(m90183z2, this) == m142578e) {
                            return m142578e;
                        }
                        abstractC16884f2 = aVar;
                        abstractC16884f = abstractC16884f2;
                    }
                }
                if (!AbstractC19074t.m100204b(abstractC16884f, AbstractC16884f.c.f85905b)) {
                    ZaloCloudRecoverCloudMediaWorker.this.m90181w(abstractC16884f);
                    ZaloCloudRecoverCloudMediaWorker.Companion.m90207s(abstractC16884f);
                }
            } catch (IllegalStateException unused) {
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ZaloCloudRecoverCloudMediaWorker", e11);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(List list, Continuation continuation) {
            return ((C16887i) mo238a(list, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        m129210a = AbstractC24856m.m129210a(C16880b.f85899q);
        f85890x = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C16882d.f85901q);
        f85891y = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C16879a.f85898q);
        f85892z = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(C16881c.f85900q);
        f85887A = m129210a4;
        MutableStateFlow m113503a = StateFlowKt.m113503a(AbstractC23306f.m120627V1().m90241l());
        f85888B = m113503a;
        f85889C = FlowKt.m113284b(m113503a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloCloudRecoverCloudMediaWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(workerParameters, "params");
        this.f85893s = context;
        this.f85894t = CoroutineScopeKt.m112637a(Dispatchers.m112680b());
        this.f85895u = CoroutineScopeKt.m112637a(Dispatchers.m112680b());
    }

    /* renamed from: w */
    public final void m90181w(AbstractC16884f abstractC16884f) {
        if (abstractC16884f instanceof AbstractC16884f.c) {
            return;
        }
        if (abstractC16884f instanceof AbstractC16884f.b) {
            C16888a.Companion.m90256a().m90220C(false);
        } else {
            C16888a.Companion.m90256a().m90220C(true);
        }
        MainTabView m67645lM = MainTabView.m67645lM();
        if (m67645lM != null) {
            m67645lM.m67679ON();
        }
    }

    /* renamed from: y */
    public final void m90182y() {
        CoroutineScopeKt.m112639c(this.f85895u, null, 1, null);
        CoroutineScopeKt.m112639c(this.f85894t, null, 1, null);
    }

    /* renamed from: z */
    public final C2244l m90183z(C16890c.a aVar) {
        int m118423d = AbstractC23088h5.m118423d("zalo_cloud_restore_msg_media", "");
        Notification mo6879e = Companion.m90200f(this.f85893s, aVar).mo6879e();
        AbstractC19074t.m100207e(mo6879e, "build(...)");
        if (Build.VERSION.SDK_INT >= 29) {
            return new C2244l(m118423d, mo6879e, 1);
        }
        return new C2244l(m118423d, mo6879e);
    }

    /* renamed from: A */
    public final Context m90184A() {
        return this.f85893s;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo11443d(Continuation continuation) {
        C16885g c16885g;
        Object obj;
        Object m142578e;
        int i11;
        C16888a m120627V1;
        int m116580c;
        float f11;
        ZaloCloudRecoverCloudMediaWorker zaloCloudRecoverCloudMediaWorker;
        if (continuation instanceof C16885g) {
            c16885g = (C16885g) continuation;
            int i12 = c16885g.f85912x;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c16885g.f85912x = i12 - Integer.MIN_VALUE;
                obj = c16885g.f85910v;
                m142578e = AbstractC28298d.m142578e();
                i11 = c16885g.f85912x;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            if (AbstractC19074t.m100204b((Boolean) obj, AbstractC29094b.m145339a(true))) {
                                AbstractC2252t.a m11891c = AbstractC2252t.a.m11891c();
                                AbstractC19074t.m100205c(m11891c);
                                return m11891c;
                            }
                            AbstractC2252t.a m11889a = AbstractC2252t.a.m11889a();
                            AbstractC19074t.m100205c(m11889a);
                            return m11889a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f11 = c16885g.f85909u;
                    m120627V1 = (C16888a) c16885g.f85908t;
                    zaloCloudRecoverCloudMediaWorker = (ZaloCloudRecoverCloudMediaWorker) c16885g.f85907s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    m120627V1 = AbstractC23306f.m120627V1();
                    AbstractC19074t.m100207e(m120627V1, "provideZCloudGracePeriodManager(...)");
                    m120627V1.m90226I(true);
                    float m90243n = m120627V1.m90243n();
                    m116580c = AbstractC22543l.m116580c(m120627V1.m90242m(), 1);
                    f11 = 100.0f - ((m90243n / m116580c) * 100);
                    C2244l m90183z = m90183z(new C16890c.a.C32793a(f11));
                    c16885g.f85907s = this;
                    c16885g.f85908t = m120627V1;
                    c16885g.f85909u = f11;
                    c16885g.f85912x = 1;
                    if (m11447i(m90183z, c16885g) == m142578e) {
                        return m142578e;
                    }
                    zaloCloudRecoverCloudMediaWorker = this;
                }
                zaloCloudRecoverCloudMediaWorker.setProgressAsync(new C2148h.a().m11538e("Progress", f11).m11534a());
                C16883e c16883e = Companion;
                FlowKt.m113270F(FlowKt.m113272H(c16883e.m90197o(), new C16886h(m120627V1, zaloCloudRecoverCloudMediaWorker, null)), zaloCloudRecoverCloudMediaWorker.f85894t);
                FlowKt.m113270F(FlowKt.m113272H(AbstractC1777k.m9308a(c16883e.m90204n()), new C16887i(null)), zaloCloudRecoverCloudMediaWorker.f85895u);
                C16891d m90196k = c16883e.m90196k();
                c16885g.f85907s = null;
                c16885g.f85908t = null;
                c16885g.f85912x = 2;
                obj = m90196k.m101503a(c16885g);
                if (obj == m142578e) {
                    return m142578e;
                }
                if (AbstractC19074t.m100204b((Boolean) obj, AbstractC29094b.m145339a(true))) {
                }
            }
        }
        c16885g = new C16885g(continuation);
        obj = c16885g.f85910v;
        m142578e = AbstractC28298d.m142578e();
        i11 = c16885g.f85912x;
        if (i11 == 0) {
        }
        zaloCloudRecoverCloudMediaWorker.setProgressAsync(new C2148h.a().m11538e("Progress", f11).m11534a());
        C16883e c16883e2 = Companion;
        FlowKt.m113270F(FlowKt.m113272H(c16883e2.m90197o(), new C16886h(m120627V1, zaloCloudRecoverCloudMediaWorker, null)), zaloCloudRecoverCloudMediaWorker.f85894t);
        FlowKt.m113270F(FlowKt.m113272H(AbstractC1777k.m9308a(c16883e2.m90204n()), new C16887i(null)), zaloCloudRecoverCloudMediaWorker.f85895u);
        C16891d m90196k2 = c16883e2.m90196k();
        c16885g.f85907s = null;
        c16885g.f85908t = null;
        c16885g.f85912x = 2;
        obj = m90196k2.m101503a(c16885g);
        if (obj == m142578e) {
        }
        if (AbstractC19074t.m100204b((Boolean) obj, AbstractC29094b.m145339a(true))) {
        }
    }
}
