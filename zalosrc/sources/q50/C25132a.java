package q50;

import ag0.C0815e1;
import am.AbstractC0924m0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionInCall;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
import com.zing.zalo.p077ui.call.settingringtone.presenter.data.RingtoneData;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l50.C22079a;
import l50.C22081c;
import l50.C22083e;
import l50.C22086h;
import l50.C22089k;
import l50.C22093o;
import l50.C22095q;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;
import p205hc.AbstractC19963b;
import p205hc.C19964c;
import p207he.C20024r;
import p361nb.C23648e;
import p426pp.AbstractC24900c;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: q50.a */
/* loaded from: classes5.dex */
public final class C25132a extends AbstractC19963b {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final InterfaceC24854k f120655A;

    /* renamed from: B */
    private final InterfaceC24854k f120656B;

    /* renamed from: C */
    private final InterfaceC24854k f120657C;

    /* renamed from: D */
    private final InterfaceC24854k f120658D;

    /* renamed from: E */
    private final InterfaceC24854k f120659E;

    /* renamed from: t */
    private C1761c0 f120660t = new C1761c0();

    /* renamed from: u */
    private C1761c0 f120661u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f120662v = new C1761c0();

    /* renamed from: w */
    private C1761c0 f120663w = new C1761c0();

    /* renamed from: x */
    private C1761c0 f120664x = new C1761c0();

    /* renamed from: y */
    private final InterfaceC24854k f120665y;

    /* renamed from: z */
    private final InterfaceC24854k f120666z;

    /* renamed from: q50.a$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q50.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120667t;

        /* renamed from: u */
        final /* synthetic */ Integer f120668u;

        /* renamed from: v */
        final /* synthetic */ C25132a f120669v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Integer num, C25132a c25132a, Continuation continuation) {
            super(2, continuation);
            this.f120668u = num;
            this.f120669v = c25132a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f120668u, this.f120669v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f120667t == 0) {
                AbstractC24862s.m129228b(obj);
                Integer num = this.f120668u;
                if (num != null) {
                    this.f120669v.f120661u.mo9224q(AbstractC29094b.m145341c(num.intValue()));
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: q50.a$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f120670q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22079a mo12V4() {
            return new C22079a(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: q50.a$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f120671q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22081c mo12V4() {
            return new C22081c(null, 1, null);
        }
    }

    /* renamed from: q50.a$e */
    /* loaded from: classes5.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120672t;

        e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f120672t == 0) {
                AbstractC24862s.m129228b(obj);
                C25132a.this.m130227K0(0);
                C25132a.this.m130230N0();
                C25132a.m130224D0(C25132a.this, 0, null, 2, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: q50.a$f */
    /* loaded from: classes5.dex */
    static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120674t;

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
            C24848g0 c24848g0;
            boolean m127128x;
            boolean m127128x2;
            AbstractC28298d.m142578e();
            if (this.f120674t == 0) {
                AbstractC24862s.m129228b(obj);
                RingtoneData ringtoneData = (RingtoneData) C25132a.this.m130255q0().m101506a();
                if (ringtoneData != null) {
                    C25132a c25132a = C25132a.this;
                    m127128x = AbstractC24341v.m127128x(ringtoneData.m58732d());
                    if (!m127128x) {
                        m127128x2 = AbstractC24341v.m127128x(ringtoneData.m58733e());
                        if (!m127128x2 && !AbstractC19074t.m100204b(c25132a.m130253o0().m101506a(), AbstractC29094b.m145339a(false))) {
                            c25132a.m130227K0(3);
                            c25132a.m130251j0(ringtoneData);
                            c25132a.m130223C0(3, ringtoneData.m58732d());
                            c24848g0 = C24848g0.f119245a;
                        }
                    }
                    c25132a.m130259z0();
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                }
                if (c24848g0 == null) {
                    C25132a.this.m130259z0();
                }
                C25132a.this.m130229M0();
                C25132a.this.m130230N0();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: q50.a$g */
    /* loaded from: classes5.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f120676q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22083e mo12V4() {
            return new C22083e(null, 1, null);
        }
    }

    /* renamed from: q50.a$h */
    /* loaded from: classes5.dex */
    static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h f120677q = new h();

        h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22086h mo12V4() {
            return new C22086h(null, 1, null);
        }
    }

    /* renamed from: q50.a$i */
    /* loaded from: classes5.dex */
    static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120678t;

        i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean m127128x;
            boolean m127128x2;
            AbstractC28298d.m142578e();
            if (this.f120678t == 0) {
                AbstractC24862s.m129228b(obj);
                C25132a.this.m130250i0((Integer) C25132a.this.m130254p0().m101509a(AbstractC29094b.m145339a(true)));
                RingtoneData ringtoneData = (RingtoneData) C25132a.this.m130255q0().m101506a();
                if (ringtoneData != null) {
                    C25132a c25132a = C25132a.this;
                    m127128x = AbstractC24341v.m127128x(ringtoneData.m58732d());
                    if (!m127128x) {
                        m127128x2 = AbstractC24341v.m127128x(ringtoneData.m58733e());
                        if (!m127128x2 && !AbstractC19074t.m100204b(c25132a.m130253o0().m101506a(), AbstractC29094b.m145339a(false))) {
                            c25132a.m130251j0(ringtoneData);
                        }
                    }
                }
                C25132a.this.m130252n0().m101504a();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: q50.a$j */
    /* loaded from: classes5.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120680t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f120680t == 0) {
                AbstractC24862s.m129228b(obj);
                if (C25132a.this.m130222A0()) {
                    C25132a.this.m130230N0();
                } else {
                    C25132a.this.m130226J0();
                    C25132a.this.m130229M0();
                }
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: q50.a$k */
    /* loaded from: classes5.dex */
    static final class k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final k f120682q = new k();

        k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22089k mo12V4() {
            return new C22089k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q50.a$l */
    /* loaded from: classes5.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120683t;

        /* renamed from: q50.a$l$a */
        /* loaded from: classes5.dex */
        public static final class a implements C22089k.a {

            /* renamed from: a */
            final /* synthetic */ C25132a f120685a;

            /* renamed from: q50.a$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            static final class C32947a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f120686t;

                /* renamed from: u */
                final /* synthetic */ C25132a f120687u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32947a(C25132a c25132a, Continuation continuation) {
                    super(2, continuation);
                    this.f120687u = c25132a;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32947a(this.f120687u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    RingtoneData m58730a;
                    AbstractC28298d.m142578e();
                    if (this.f120686t == 0) {
                        AbstractC24862s.m129228b(obj);
                        RingtoneData ringtoneData = (RingtoneData) this.f120687u.f120660t.mo9215f();
                        if (ringtoneData != null) {
                            C1761c0 c1761c0 = this.f120687u.f120660t;
                            m58730a = ringtoneData.m58730a((r20 & 1) != 0 ? ringtoneData.f56350a : null, (r20 & 2) != 0 ? ringtoneData.f56351b : null, (r20 & 4) != 0 ? ringtoneData.f56352c : null, (r20 & 8) != 0 ? ringtoneData.f56353d : null, (r20 & 16) != 0 ? ringtoneData.f56354e : false, (r20 & 32) != 0 ? ringtoneData.f56355f : 0, (r20 & 64) != 0 ? ringtoneData.f56356g : false, (r20 & 128) != 0 ? ringtoneData.f56357h : false, (r20 & 256) != 0 ? ringtoneData.f56358i : false);
                            c1761c0.mo9221n(m58730a);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32947a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: q50.a$l$a$b */
            /* loaded from: classes5.dex */
            static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f120688t;

                /* renamed from: u */
                final /* synthetic */ C25132a f120689u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(C25132a c25132a, Continuation continuation) {
                    super(2, continuation);
                    this.f120689u = c25132a;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f120689u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    RingtoneData m58730a;
                    AbstractC28298d.m142578e();
                    if (this.f120688t == 0) {
                        AbstractC24862s.m129228b(obj);
                        RingtoneData ringtoneData = (RingtoneData) this.f120689u.f120660t.mo9215f();
                        if (ringtoneData != null) {
                            C1761c0 c1761c0 = this.f120689u.f120660t;
                            m58730a = ringtoneData.m58730a((r20 & 1) != 0 ? ringtoneData.f56350a : null, (r20 & 2) != 0 ? ringtoneData.f56351b : null, (r20 & 4) != 0 ? ringtoneData.f56352c : null, (r20 & 8) != 0 ? ringtoneData.f56353d : null, (r20 & 16) != 0 ? ringtoneData.f56354e : true, (r20 & 32) != 0 ? ringtoneData.f56355f : 0, (r20 & 64) != 0 ? ringtoneData.f56356g : false, (r20 & 128) != 0 ? ringtoneData.f56357h : false, (r20 & 256) != 0 ? ringtoneData.f56358i : false);
                            c1761c0.mo9221n(m58730a);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: q50.a$l$a$c */
            /* loaded from: classes5.dex */
            static final class c extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f120690t;

                /* renamed from: u */
                final /* synthetic */ C25132a f120691u;

                /* renamed from: v */
                final /* synthetic */ int f120692v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(C25132a c25132a, int i11, Continuation continuation) {
                    super(2, continuation);
                    this.f120691u = c25132a;
                    this.f120692v = i11;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new c(this.f120691u, this.f120692v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    RingtoneData m58730a;
                    AbstractC28298d.m142578e();
                    if (this.f120690t == 0) {
                        AbstractC24862s.m129228b(obj);
                        RingtoneData ringtoneData = (RingtoneData) this.f120691u.f120660t.mo9215f();
                        if (ringtoneData != null) {
                            C25132a c25132a = this.f120691u;
                            int i11 = this.f120692v;
                            C1761c0 c1761c0 = c25132a.f120660t;
                            m58730a = ringtoneData.m58730a((r20 & 1) != 0 ? ringtoneData.f56350a : null, (r20 & 2) != 0 ? ringtoneData.f56351b : null, (r20 & 4) != 0 ? ringtoneData.f56352c : null, (r20 & 8) != 0 ? ringtoneData.f56353d : null, (r20 & 16) != 0 ? ringtoneData.f56354e : true, (r20 & 32) != 0 ? ringtoneData.f56355f : i11, (r20 & 64) != 0 ? ringtoneData.f56356g : false, (r20 & 128) != 0 ? ringtoneData.f56357h : false, (r20 & 256) != 0 ? ringtoneData.f56358i : false);
                            c1761c0.mo9221n(m58730a);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: q50.a$l$a$d */
            /* loaded from: classes5.dex */
            static final class d extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f120693t;

                /* renamed from: u */
                final /* synthetic */ C25132a f120694u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(C25132a c25132a, Continuation continuation) {
                    super(2, continuation);
                    this.f120694u = c25132a;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new d(this.f120694u, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    RingtoneData m58730a;
                    AbstractC28298d.m142578e();
                    if (this.f120693t == 0) {
                        AbstractC24862s.m129228b(obj);
                        RingtoneData ringtoneData = (RingtoneData) this.f120694u.f120660t.mo9215f();
                        if (ringtoneData != null) {
                            C1761c0 c1761c0 = this.f120694u.f120660t;
                            m58730a = ringtoneData.m58730a((r20 & 1) != 0 ? ringtoneData.f56350a : null, (r20 & 2) != 0 ? ringtoneData.f56351b : null, (r20 & 4) != 0 ? ringtoneData.f56352c : null, (r20 & 8) != 0 ? ringtoneData.f56353d : null, (r20 & 16) != 0 ? ringtoneData.f56354e : false, (r20 & 32) != 0 ? ringtoneData.f56355f : 0, (r20 & 64) != 0 ? ringtoneData.f56356g : false, (r20 & 128) != 0 ? ringtoneData.f56357h : false, (r20 & 256) != 0 ? ringtoneData.f56358i : false);
                            c1761c0.mo9221n(m58730a);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            a(C25132a c25132a) {
                this.f120685a = c25132a;
            }

            @Override // l50.C22089k.a
            /* renamed from: a */
            public void mo115240a(Exception exc) {
                AbstractC19074t.m100208f(exc, "exception");
                if (exc instanceof ExceptionInCall) {
                    C25132a c25132a = this.f120685a;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticky_player_conflict_call);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    c25132a.m130228L0(m118743r0);
                }
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f120685a), Dispatchers.m112681c(), null, new C32947a(this.f120685a, null), 2, null);
            }

            @Override // l50.C22089k.a
            /* renamed from: b */
            public void mo115241b(int i11, int i12) {
                C22089k.a.C32878a.m115245b(this, i11, i12);
            }

            @Override // l50.C22089k.a
            /* renamed from: c */
            public void mo115242c() {
                C22089k.a.C32878a.m115244a(this);
            }

            @Override // l50.C22089k.a
            /* renamed from: d */
            public void mo115243d() {
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f120685a), Dispatchers.m112681c(), null, new b(this.f120685a, null), 2, null);
            }

            @Override // l50.C22089k.a
            public void onProgressChanged(int i11) {
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f120685a), Dispatchers.m112681c(), null, new c(this.f120685a, i11, null), 2, null);
            }

            @Override // l50.C22089k.a
            public void onStop() {
                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this.f120685a), Dispatchers.m112681c(), null, new d(this.f120685a, null), 2, null);
            }
        }

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
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f120683t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C0815e1.m2075D().m2100V(new C23648e(28, "setting_call_ringtone", 0, "call_play_ringtone", "1"), false);
                if (AbstractC19074t.m100204b(C25132a.this.m130253o0().m101506a(), AbstractC29094b.m145339a(true))) {
                    C22089k m130256s0 = C25132a.this.m130256s0();
                    String m3683b7 = AbstractC0924m0.m3683b7();
                    AbstractC19074t.m100207e(m3683b7, "getUriRingtone(...)");
                    C22089k.b bVar = new C22089k.b(m3683b7, new a(C25132a.this));
                    this.f120683t = 1;
                    if (m130256s0.m101507a(bVar, this) == m142578e) {
                        return m142578e;
                    }
                } else {
                    C25132a c25132a = C25132a.this;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_general_error);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    c25132a.m130228L0(m118743r0);
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
    /* renamed from: q50.a$m */
    /* loaded from: classes5.dex */
    public static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f120695t;

        /* renamed from: v */
        final /* synthetic */ int f120697v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: q50.a$m$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C25132a f120698p;

            /* renamed from: q */
            final /* synthetic */ int f120699q;

            a(C25132a c25132a, int i11) {
                this.f120698p = c25132a;
                this.f120699q = i11;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC24900c abstractC24900c, Continuation continuation) {
                if (!(abstractC24900c instanceof AbstractC24900c.b)) {
                    if (abstractC24900c instanceof AbstractC24900c.a) {
                        C25132a c25132a = this.f120698p;
                        c25132a.m130250i0((Integer) c25132a.m130254p0().m101509a(AbstractC29094b.m145339a(true)));
                        if (((AbstractC24900c.a) abstractC24900c).m129473a() instanceof ExceptionNoNetwork) {
                            C25132a c25132a2 = this.f120698p;
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_no_internet);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            c25132a2.m130228L0(m118743r0);
                        } else {
                            C25132a c25132a3 = this.f120698p;
                            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ringtone_general_error);
                            AbstractC19074t.m100207e(m118743r02, "getString(...)");
                            c25132a3.m130228L0(m118743r02);
                        }
                    } else if (abstractC24900c instanceof AbstractC24900c.c) {
                        this.f120698p.m130250i0(AbstractC29094b.m145341c(this.f120699q));
                        AbstractC0924m0.m3323Op(this.f120699q);
                        if (this.f120699q == 0) {
                            this.f120698p.m130225I0();
                        }
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i11, Continuation continuation) {
            super(2, continuation);
            this.f120697v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(this.f120697v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            String str;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f120695t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C25132a.this.m130250i0(AbstractC29094b.m145341c(this.f120697v));
                C22093o m130257v0 = C25132a.this.m130257v0();
                int i12 = this.f120697v;
                RingtoneData ringtoneData = (RingtoneData) C25132a.this.f120660t.mo9215f();
                if (ringtoneData == null || (str = ringtoneData.m58732d()) == null) {
                    str = "";
                }
                C22093o.a aVar = new C22093o.a(i12, str);
                this.f120695t = 1;
                obj = m130257v0.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C25132a.this, this.f120697v);
                this.f120695t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: q50.a$n */
    /* loaded from: classes5.dex */
    static final class n extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final n f120700q = new n();

        n() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22093o mo12V4() {
            return new C22093o(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: q50.a$o */
    /* loaded from: classes5.dex */
    static final class o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final o f120701q = new o();

        o() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C22095q mo12V4() {
            return new C22095q();
        }
    }

    public C25132a() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        m129210a = AbstractC24856m.m129210a(h.f120677q);
        this.f120665y = m129210a;
        m129210a2 = AbstractC24856m.m129210a(k.f120682q);
        this.f120666z = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(d.f120671q);
        this.f120655A = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(o.f120701q);
        this.f120656B = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(g.f120676q);
        this.f120657C = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(n.f120700q);
        this.f120658D = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(c.f120670q);
        this.f120659E = m129210a7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public final boolean m130222A0() {
        RingtoneData ringtoneData = (RingtoneData) this.f120660t.mo9215f();
        if (ringtoneData != null && ringtoneData.m58736h()) {
            return true;
        }
        RingtoneData ringtoneData2 = (RingtoneData) this.f120660t.mo9215f();
        if (ringtoneData2 != null && ringtoneData2.m58737i()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public final void m130223C0(int i11, String str) {
        C0815e1.m2075D().m2100V(new C23648e(28, "setting_call", 0, "call_setting_ringtone_selected", String.valueOf(i11), str), false);
    }

    /* renamed from: D0 */
    static /* synthetic */ void m130224D0(C25132a c25132a, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        c25132a.m130223C0(i11, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public final void m130225I0() {
        if (!C20024r.m103941j() && !C7853b.Companion.m40150a().m40133i0()) {
            this.f120662v.mo9221n(new C19964c(Boolean.TRUE));
            return;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_sticky_player_conflict_call);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        m130228L0(m118743r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public final Job m130226J0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new l(null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public final Job m130227K0(int i11) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new m(i11, null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public final void m130228L0(String str) {
        this.f120664x.mo9221n(new C19964c(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public final void m130229M0() {
        this.f120662v.mo9221n(new C19964c(Boolean.FALSE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public final void m130230N0() {
        m130258w0().m101504a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public final Job m130250i0(Integer num) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new b(num, this, null), 2, null);
        return m112540d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public final void m130251j0(RingtoneData ringtoneData) {
        String str;
        if (ringtoneData != null) {
            String m58732d = ringtoneData.m58732d();
            RingtoneData ringtoneData2 = (RingtoneData) this.f120660t.mo9215f();
            if (ringtoneData2 != null) {
                str = ringtoneData2.m58732d();
            } else {
                str = null;
            }
            if (!AbstractC19074t.m100204b(m58732d, str)) {
                this.f120660t.mo9221n(ringtoneData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public final C22079a m130252n0() {
        return (C22079a) this.f120659E.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public final C22081c m130253o0() {
        return (C22081c) this.f120655A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public final C22083e m130254p0() {
        return (C22083e) this.f120657C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final C22086h m130255q0() {
        return (C22086h) this.f120665y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public final C22089k m130256s0() {
        return (C22089k) this.f120666z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public final C22093o m130257v0() {
        return (C22093o) this.f120658D.getValue();
    }

    /* renamed from: w0 */
    private final C22095q m130258w0() {
        return (C22095q) this.f120656B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public final void m130259z0() {
        this.f120663w.mo9221n(new C19964c(1));
    }

    /* renamed from: B0 */
    public final Job m130260B0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new i(null), 2, null);
        return m112540d;
    }

    /* renamed from: E0 */
    public final void m130261E0() {
        m130230N0();
        m130229M0();
        m130259z0();
    }

    /* renamed from: F0 */
    public final Job m130262F0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new j(null), 2, null);
        return m112540d;
    }

    /* renamed from: G0 */
    public final void m130263G0() {
        m130230N0();
    }

    /* renamed from: k0 */
    public final Job m130264k0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new e(null), 2, null);
        return m112540d;
    }

    /* renamed from: l0 */
    public final void m130265l0() {
        m130229M0();
        m130230N0();
        this.f120663w.mo9221n(new C19964c(2));
    }

    /* renamed from: m0 */
    public final Job m130266m0() {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112680b(), null, new f(null), 2, null);
        return m112540d;
    }

    /* renamed from: r0 */
    public final LiveData m130267r0() {
        return this.f120663w;
    }

    /* renamed from: t0 */
    public final LiveData m130268t0() {
        return this.f120662v;
    }

    /* renamed from: u0 */
    public final LiveData m130269u0() {
        return this.f120661u;
    }

    /* renamed from: x0 */
    public final LiveData m130270x0() {
        return this.f120664x;
    }

    /* renamed from: y0 */
    public final LiveData m130271y0() {
        return this.f120660t;
    }
}
