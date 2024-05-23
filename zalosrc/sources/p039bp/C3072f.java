package p039bp;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import bi0.AbstractC2807a;
import bo.InterfaceC3045u2;
import bo.InterfaceC3058y;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.mvp.feed.view.MoveTabUserManageView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import me0.AbstractC23136l9;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import p022ap.C2278i;
import p205hc.C19964c;
import p425po.AbstractC24884f;
import p425po.AbstractC24887i;
import p425po.AbstractC24888j;
import p425po.C24882d;
import p425po.C24883e;
import p425po.C24885g;
import p425po.C24886h;
import p425po.C24889k;
import p425po.C24890l;
import p425po.C24891m;
import p425po.C24892n;
import p425po.C24894p;
import p455qo.C25397a;
import p455qo.C25400b0;
import p455qo.C25435t;
import p455qo.C25438v;
import p455qo.C25442z;
import p458qr.AbstractC25468a;
import p461qu.AbstractC25495a;
import p534u1.AbstractC26941a;
import p723zo.C32531j;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25378x;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: bp.f */
/* loaded from: classes4.dex */
public final class C3072f extends AbstractC1796t0 implements InterfaceC3045u2 {
    public static final j Companion = new j(null);

    /* renamed from: A */
    private final List f12478A;

    /* renamed from: B */
    private final Map f12479B;

    /* renamed from: C */
    private final C1761c0 f12480C;

    /* renamed from: D */
    private final MutableSharedFlow f12481D;

    /* renamed from: E */
    private final C1761c0 f12482E;

    /* renamed from: F */
    private final C1761c0 f12483F;

    /* renamed from: G */
    private final C1761c0 f12484G;

    /* renamed from: H */
    private String f12485H;

    /* renamed from: I */
    private boolean f12486I;

    /* renamed from: s */
    private final InterfaceC24854k f12487s;

    /* renamed from: t */
    private final InterfaceC24854k f12488t;

    /* renamed from: u */
    private final InterfaceC24854k f12489u;

    /* renamed from: v */
    private final InterfaceC24854k f12490v;

    /* renamed from: w */
    private final InterfaceC24854k f12491w;

    /* renamed from: x */
    private final MutableSharedFlow f12492x;

    /* renamed from: y */
    private final Map f12493y;

    /* renamed from: z */
    private final C1761c0 f12494z;

    /* renamed from: bp.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a */
        public static final a f12495a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.f$a0 */
    /* loaded from: classes4.dex */
    public static final class a0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a0 f12496q = new a0();

        a0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25397a mo12V4() {
            return new C25397a(null, null, 3, null);
        }
    }

    /* renamed from: bp.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a */
        public static final b f12497a = new b();

        private b() {
        }
    }

    /* renamed from: bp.f$b0 */
    /* loaded from: classes4.dex */
    public static final class b0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12498t;

        /* renamed from: u */
        private /* synthetic */ Object f12499u;

        /* renamed from: bp.f$b0$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f12501t;

            /* renamed from: u */
            final /* synthetic */ C3072f f12502u;

            /* renamed from: bp.f$b0$a$a */
            /* loaded from: classes4.dex */
            public static final class C32653a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C3072f f12503p;

                C32653a(C3072f c3072f) {
                    this.f12503p = c3072f;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object mo12109b(f fVar, Continuation continuation) {
                    if (fVar instanceof e) {
                        this.f12503p.m14883z1();
                    } else if (fVar instanceof g) {
                        if (this.f12503p.m14835W0() && this.f12503p.m14837X0()) {
                            this.f12503p.m14881y0();
                        }
                    } else if (fVar instanceof h) {
                        if (this.f12503p.m14835W0() && this.f12503p.m14837X0()) {
                            this.f12503p.m14870s0();
                        } else {
                            C3072f c3072f = this.f12503p;
                            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            c3072f.m14802B1(m118743r0);
                        }
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C3072f c3072f, Continuation continuation) {
                super(2, continuation);
                this.f12502u = c3072f;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f12502u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f12501t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableSharedFlow mutableSharedFlow = this.f12502u.f12492x;
                    C32653a c32653a = new C32653a(this.f12502u);
                    this.f12501t = 1;
                    if (mutableSharedFlow.mo97893a(c32653a, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: bp.f$b0$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f12504t;

            /* renamed from: u */
            final /* synthetic */ C3072f f12505u;

            /* renamed from: bp.f$b0$b$a */
            /* loaded from: classes4.dex */
            public static final class a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C3072f f12506p;

                a(C3072f c3072f) {
                    this.f12506p = c3072f;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object mo12109b(c cVar, Continuation continuation) {
                    this.f12506p.f12482E.mo9224q(cVar);
                    this.f12506p.f12485H = "";
                    this.f12506p.m14878w1();
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C3072f c3072f, Continuation continuation) {
                super(2, continuation);
                this.f12505u = c3072f;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f12505u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f12504t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    MutableSharedFlow mutableSharedFlow = this.f12505u.f12481D;
                    a aVar = new a(this.f12505u);
                    this.f12504t = 1;
                    if (mutableSharedFlow.mo97893a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                throw new KotlinNothingValueException();
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        b0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b0 b0Var = new b0(continuation);
            b0Var.f12499u = obj;
            return b0Var;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12498t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f12499u;
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new a(C3072f.this, null), 3, null);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new b(C3072f.this, null), 3, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$c */
    /* loaded from: classes4.dex */
    public interface c {
    }

    /* renamed from: bp.f$c0 */
    /* loaded from: classes4.dex */
    public static final class c0 extends AbstractC29096d {

        /* renamed from: s */
        Object f12507s;

        /* renamed from: t */
        /* synthetic */ Object f12508t;

        /* renamed from: v */
        int f12510v;

        c0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f12508t = obj;
            this.f12510v |= Integer.MIN_VALUE;
            return C3072f.this.m14843a1(this);
        }
    }

    /* renamed from: bp.f$d */
    /* loaded from: classes4.dex */
    public interface d {
    }

    /* renamed from: bp.f$d0 */
    /* loaded from: classes4.dex */
    public static final class d0 implements FlowCollector {

        /* renamed from: bp.f$d0$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29096d {

            /* renamed from: s */
            Object f12512s;

            /* renamed from: t */
            /* synthetic */ Object f12513t;

            /* renamed from: v */
            int f12515v;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f12513t = obj;
                this.f12515v |= Integer.MIN_VALUE;
                return d0.this.mo12109b(null, this);
            }
        }

        d0() {
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
            a aVar;
            Object m142578e;
            int i11;
            d0 d0Var;
            List m131187O0;
            List m131187O02;
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i12 = aVar.f12515v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    aVar.f12515v = i12 - Integer.MIN_VALUE;
                    Object obj = aVar.f12513t;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = aVar.f12515v;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            d0Var = (d0) aVar.f12512s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        if (abstractC25468a instanceof AbstractC25468a.c) {
                            Map map = C3072f.this.f12493y;
                            C3072f c3072f = C3072f.this;
                            synchronized (map) {
                                Map map2 = c3072f.f12493y;
                                l lVar = l.f12542p;
                                m131187O0 = AbstractC25332a0.m131187O0(((C25435t.b) ((AbstractC25468a.c) abstractC25468a).m131935a()).m131734b());
                                map2.put(lVar, m131187O0);
                                Map map3 = c3072f.f12493y;
                                l lVar2 = l.f12544r;
                                m131187O02 = AbstractC25332a0.m131187O0(((C25435t.b) ((AbstractC25468a.c) abstractC25468a).m131935a()).m131733a());
                                map3.put(lVar2, m131187O02);
                                c3072f.f12492x.mo113433d(e.f12516a);
                            }
                        } else if (abstractC25468a instanceof AbstractC25468a.a) {
                            aVar.f12512s = this;
                            aVar.f12515v = 1;
                            if (DelayKt.m112666b(400L, aVar) == m142578e) {
                                return m142578e;
                            }
                            d0Var = this;
                        } else if (abstractC25468a instanceof AbstractC25468a.b) {
                            C3072f.this.f12492x.mo113433d(g.f12522a);
                        }
                        return C24848g0.f119245a;
                    }
                    C3072f.this.f12492x.mo113433d(h.f12524a);
                    return C24848g0.f119245a;
                }
            }
            aVar = new a(continuation);
            Object obj2 = aVar.f12513t;
            m142578e = AbstractC28298d.m142578e();
            i11 = aVar.f12515v;
            if (i11 == 0) {
            }
            C3072f.this.f12492x.mo113433d(h.f12524a);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: bp.f$e */
    /* loaded from: classes4.dex */
    public static final class e implements f {

        /* renamed from: a */
        public static final e f12516a = new e();

        private e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.f$e0 */
    /* loaded from: classes4.dex */
    public static final class e0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e0 f12517q = new e0();

        e0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25435t mo12V4() {
            return new C25435t(null, null, 3, null);
        }
    }

    /* renamed from: bp.f$f */
    /* loaded from: classes4.dex */
    public interface f {
    }

    /* renamed from: bp.f$f0 */
    /* loaded from: classes4.dex */
    public static final class f0 extends AbstractC29096d {

        /* renamed from: s */
        Object f12518s;

        /* renamed from: t */
        /* synthetic */ Object f12519t;

        /* renamed from: v */
        int f12521v;

        f0(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f12519t = obj;
            this.f12521v |= Integer.MIN_VALUE;
            return C3072f.this.m14845b1(this);
        }
    }

    /* renamed from: bp.f$g */
    /* loaded from: classes4.dex */
    public static final class g implements f {

        /* renamed from: a */
        public static final g f12522a = new g();

        private g() {
        }
    }

    /* renamed from: bp.f$g0 */
    /* loaded from: classes4.dex */
    public static final class g0 implements FlowCollector {
        g0() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
            List m131187O0;
            if (abstractC25468a instanceof AbstractC25468a.c) {
                Map map = C3072f.this.f12493y;
                C3072f c3072f = C3072f.this;
                synchronized (map) {
                    try {
                        Map map2 = c3072f.f12493y;
                        l lVar = l.f12543q;
                        m131187O0 = AbstractC25332a0.m131187O0(((C25438v.b) ((AbstractC25468a.c) abstractC25468a).m131935a()).m131758a());
                        map2.put(lVar, m131187O0);
                        if (!c3072f.m14835W0() || !c3072f.m14837X0()) {
                            c3072f.f12492x.mo113433d(e.f12516a);
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return C24848g0.f119245a;
        }
    }

    /* renamed from: bp.f$h */
    /* loaded from: classes4.dex */
    public static final class h implements f {

        /* renamed from: a */
        public static final h f12524a = new h();

        private h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.f$h0 */
    /* loaded from: classes4.dex */
    public static final class h0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final h0 f12525q = new h0();

        h0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25438v mo12V4() {
            return new C25438v(null, null, 3, null);
        }
    }

    /* renamed from: bp.f$i */
    /* loaded from: classes4.dex */
    public static final class i extends n {

        /* renamed from: b */
        private final w f12526b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(w wVar) {
            super(wVar);
            AbstractC19074t.m100208f(wVar, "sectionRowViewData");
            this.f12526b = wVar;
        }

        /* renamed from: a */
        public w m14904a() {
            return this.f12526b;
        }
    }

    /* renamed from: bp.f$i0 */
    /* loaded from: classes4.dex */
    public static final class i0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12527t;

        /* renamed from: v */
        final /* synthetic */ String f12529v;

        /* renamed from: bp.f$i0$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3072f f12530p;

            a(C3072f c3072f) {
                this.f12530p = c3072f;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                List m131187O0;
                List m131187O02;
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    Map map = this.f12530p.f12493y;
                    C3072f c3072f = this.f12530p;
                    synchronized (map) {
                        Map map2 = c3072f.f12493y;
                        l lVar = l.f12546t;
                        m131187O0 = AbstractC25332a0.m131187O0(((C25400b0.b) ((AbstractC25468a.c) abstractC25468a).m131935a()).m131615b());
                        map2.put(lVar, m131187O0);
                        Map map3 = c3072f.f12493y;
                        l lVar2 = l.f12547u;
                        m131187O02 = AbstractC25332a0.m131187O0(((C25400b0.b) ((AbstractC25468a.c) abstractC25468a).m131935a()).m131614a());
                        map3.put(lVar2, m131187O02);
                        c3072f.f12492x.mo113433d(e.f12516a);
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    C3072f c3072f2 = this.f12530p;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    c3072f2.m14802B1(m118743r0);
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, Continuation continuation) {
            super(2, continuation);
            this.f12529v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i0(this.f12529v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12527t;
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
                C25400b0 m14816M0 = C3072f.this.m14816M0();
                C25400b0.a aVar = new C25400b0.a(this.f12529v, 2);
                this.f12527t = 1;
                obj = m14816M0.m101498a(aVar, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Flow flow = (Flow) obj;
            if (flow != null) {
                a aVar2 = new a(C3072f.this);
                this.f12527t = 2;
                if (flow.mo97893a(aVar2, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$j */
    /* loaded from: classes4.dex */
    public static final class j {
        private j() {
        }

        public /* synthetic */ j(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: bp.f$j0 */
    /* loaded from: classes4.dex */
    public static final class j0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12531t;

        /* renamed from: u */
        final /* synthetic */ C24886h f12532u;

        /* renamed from: v */
        final /* synthetic */ C3072f f12533v;

        /* renamed from: bp.f$j0$a */
        /* loaded from: classes4.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3072f f12534p;

            /* renamed from: q */
            final /* synthetic */ C24886h f12535q;

            a(C3072f c3072f, C24886h c24886h) {
                this.f12534p = c3072f;
                this.f12535q = c24886h;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    if (((Boolean) ((AbstractC25468a.c) abstractC25468a).m131935a()).booleanValue()) {
                        this.f12534p.m14860j1(this.f12535q.m129403e(), C24886h.d.f119409p);
                    } else {
                        this.f12534p.m14810F1(this.f12535q.m129403e(), C24886h.d.f119410q);
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f12534p.m14810F1(this.f12535q.m129403e(), C24886h.d.f119411r);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f12534p.m14810F1(this.f12535q.m129403e(), C24886h.d.f119410q);
                }
                return C24848g0.f119245a;
            }
        }

        /* renamed from: bp.f$j0$b */
        /* loaded from: classes4.dex */
        public static final class b implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C3072f f12536p;

            /* renamed from: q */
            final /* synthetic */ C24886h f12537q;

            b(C3072f c3072f, C24886h c24886h) {
                this.f12536p = c3072f;
                this.f12537q = c24886h;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(AbstractC25468a abstractC25468a, Continuation continuation) {
                if (abstractC25468a instanceof AbstractC25468a.c) {
                    if (((Boolean) ((AbstractC25468a.c) abstractC25468a).m131935a()).booleanValue()) {
                        this.f12536p.m14860j1(this.f12537q.m129403e(), C24886h.d.f119410q);
                    } else {
                        this.f12536p.m14810F1(this.f12537q.m129403e(), C24886h.d.f119409p);
                    }
                } else if (abstractC25468a instanceof AbstractC25468a.b) {
                    this.f12536p.m14810F1(this.f12537q.m129403e(), C24886h.d.f119411r);
                } else if (abstractC25468a instanceof AbstractC25468a.a) {
                    this.f12536p.m14810F1(this.f12537q.m129403e(), C24886h.d.f119409p);
                }
                return C24848g0.f119245a;
            }
        }

        /* renamed from: bp.f$j0$c */
        /* loaded from: classes4.dex */
        public /* synthetic */ class c {

            /* renamed from: a */
            public static final /* synthetic */ int[] f12538a;

            static {
                int[] iArr = new int[C24886h.d.values().length];
                try {
                    iArr[C24886h.d.f119410q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C24886h.d.f119409p.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f12538a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(C24886h c24886h, C3072f c3072f, Continuation continuation) {
            super(2, continuation);
            this.f12532u = c24886h;
            this.f12533v = c3072f;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j0(this.f12532u, this.f12533v, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Flow flow;
            Flow flow2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12531t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj);
                            flow2 = (Flow) obj;
                            if (flow2 != null) {
                                b bVar = new b(this.f12533v, this.f12532u);
                                this.f12531t = 4;
                                if (flow2.mo97893a(bVar, this) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    flow = (Flow) obj;
                    if (flow != null) {
                        a aVar = new a(this.f12533v, this.f12532u);
                        this.f12531t = 2;
                        if (flow.mo97893a(aVar, this) == m142578e) {
                            return m142578e;
                        }
                    }
                }
            } else {
                AbstractC24862s.m129228b(obj);
                int i12 = c.f12538a[this.f12532u.m129401c().ordinal()];
                if (i12 == 1) {
                    C25397a m14801B0 = this.f12533v.m14801B0();
                    C25397a.a aVar2 = new C25397a.a(this.f12532u.m129403e(), this.f12533v.m14818N0(this.f12532u.m129402d()));
                    this.f12531t = 1;
                    obj = m14801B0.m101498a(aVar2, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    flow = (Flow) obj;
                    if (flow != null) {
                    }
                } else if (i12 == 2) {
                    C25442z m14814L0 = this.f12533v.m14814L0();
                    C25442z.a aVar3 = new C25442z.a(this.f12532u.m129403e(), this.f12533v.m14818N0(this.f12532u.m129402d()));
                    this.f12531t = 3;
                    obj = m14814L0.m101498a(aVar3, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    flow2 = (Flow) obj;
                    if (flow2 != null) {
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$k */
    /* loaded from: classes4.dex */
    public static final class k {

        /* renamed from: a */
        private final List f12539a;

        public k(List list) {
            AbstractC19074t.m100208f(list, "contentTypeList");
            this.f12539a = list;
        }

        /* renamed from: a */
        public final List m14910a() {
            return this.f12539a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && AbstractC19074t.m100204b(this.f12539a, ((k) obj).f12539a);
        }

        public int hashCode() {
            return this.f12539a.hashCode();
        }

        public String toString() {
            return "ContentOrder(contentTypeList=" + this.f12539a + ")";
        }
    }

    /* renamed from: bp.f$k0 */
    /* loaded from: classes4.dex */
    public static final class k0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12540t;

        k0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12540t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        C3072f.this.m14880x1();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                MutableSharedFlow mutableSharedFlow = C3072f.this.f12492x;
                g gVar = g.f12522a;
                this.f12540t = 1;
                if (mutableSharedFlow.mo12109b(gVar, this) == m142578e) {
                    return m142578e;
                }
            }
            this.f12540t = 2;
            if (DelayKt.m112666b(400L, this) == m142578e) {
                return m142578e;
            }
            C3072f.this.m14880x1();
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$l */
    /* loaded from: classes4.dex */
    public static final class l extends Enum {

        /* renamed from: p */
        public static final l f12542p = new l("ADDED", 0);

        /* renamed from: q */
        public static final l f12543q = new l("SUGGEST", 1);

        /* renamed from: r */
        public static final l f12544r = new l("CONTACT", 2);

        /* renamed from: s */
        public static final l f12545s = new l("DESCRIPTION", 3);

        /* renamed from: t */
        public static final l f12546t = new l("SEARCH_ADDED", 4);

        /* renamed from: u */
        public static final l f12547u = new l("SEARCH_NOT_ADDED", 5);

        /* renamed from: v */
        public static final l f12548v = new l("SEARCH_EMPTY", 6);

        /* renamed from: w */
        public static final l f12549w = new l("EMPTY_FRIEND", 7);

        /* renamed from: x */
        private static final /* synthetic */ l[] f12550x;

        /* renamed from: y */
        private static final /* synthetic */ InterfaceC30165a f12551y;

        static {
            l[] m14912b = m14912b();
            f12550x = m14912b;
            f12551y = AbstractC30166b.m148796a(m14912b);
        }

        private l(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ l[] m14912b() {
            return new l[]{f12542p, f12543q, f12544r, f12545s, f12546t, f12547u, f12548v, f12549w};
        }

        public static l valueOf(String str) {
            return (l) Enum.valueOf(l.class, str);
        }

        public static l[] values() {
            return (l[]) f12550x.clone();
        }
    }

    /* renamed from: bp.f$l0 */
    /* loaded from: classes4.dex */
    public static final class l0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12552t;

        l0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f12552t;
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
                C3072f c3072f = C3072f.this;
                this.f12552t = 1;
                if (c3072f.m14843a1(this) == m142578e) {
                    return m142578e;
                }
            }
            C3072f c3072f2 = C3072f.this;
            this.f12552t = 2;
            if (c3072f2.m14845b1(this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$m */
    /* loaded from: classes4.dex */
    public static final class m extends n {

        /* renamed from: b */
        private final w f12554b;

        /* renamed from: c */
        private final List f12555c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(w wVar, List list) {
            super(wVar);
            AbstractC19074t.m100208f(wVar, "sectionRowViewData");
            AbstractC19074t.m100208f(list, "childRows");
            this.f12554b = wVar;
            this.f12555c = list;
        }

        /* renamed from: a */
        public final List m14914a() {
            return this.f12555c;
        }

        /* renamed from: b */
        public w m14915b() {
            return this.f12554b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.f$m0 */
    /* loaded from: classes4.dex */
    public static final class m0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final m0 f12556q = new m0();

        m0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25442z mo12V4() {
            return new C25442z(null, null, 3, null);
        }
    }

    /* renamed from: bp.f$n */
    /* loaded from: classes4.dex */
    public static abstract class n implements d {

        /* renamed from: a */
        private final w f12557a;

        public n(w wVar) {
            AbstractC19074t.m100208f(wVar, "sectionRowViewData");
            this.f12557a = wVar;
        }
    }

    /* renamed from: bp.f$n0 */
    /* loaded from: classes4.dex */
    public static final class n0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f12558q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n0(String str) {
            super(1);
            this.f12558q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final Boolean mo205i9(AbstractC24887i abstractC24887i) {
            boolean z11;
            AbstractC19074t.m100208f(abstractC24887i, "it");
            if ((abstractC24887i instanceof C24886h) && AbstractC19074t.m100204b(((C24886h) abstractC24887i).m129402d(), this.f12558q)) {
                z11 = true;
            } else {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: bp.f$o */
    /* loaded from: classes4.dex */
    public static final class o implements d {

        /* renamed from: a */
        private final List f12559a;

        public o(List list) {
            AbstractC19074t.m100208f(list, "rowList");
            this.f12559a = list;
        }

        /* renamed from: a */
        public final List m14918a() {
            return this.f12559a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && AbstractC19074t.m100204b(this.f12559a, ((o) obj).f12559a);
        }

        public int hashCode() {
            return this.f12559a.hashCode();
        }

        public String toString() {
            return "FullListAdapterViewData(rowList=" + this.f12559a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp.f$o0 */
    /* loaded from: classes4.dex */
    public static final class o0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final o0 f12560q = new o0();

        o0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25400b0 mo12V4() {
            return new C25400b0(null, 1, null);
        }
    }

    /* renamed from: bp.f$p */
    /* loaded from: classes4.dex */
    public static final class p implements y {

        /* renamed from: a */
        public static final p f12561a = new p();

        private p() {
        }
    }

    /* renamed from: bp.f$p0 */
    /* loaded from: classes4.dex */
    public static final class p0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12562t;

        /* renamed from: v */
        final /* synthetic */ String f12564v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p0(String str, Continuation continuation) {
            super(2, continuation);
            this.f12564v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p0(this.f12564v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12562t == 0) {
                AbstractC24862s.m129228b(obj);
                C3072f.this.f12484G.mo9224q(new C19964c(new x(this.f12564v)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$q */
    /* loaded from: classes4.dex */
    public static final class q implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C3072f();
        }
    }

    /* renamed from: bp.f$q0 */
    /* loaded from: classes4.dex */
    public static final class q0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12565t;

        q0(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new q0(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12565t == 0) {
                AbstractC24862s.m129228b(obj);
                C3072f.this.f12494z.mo9224q(new o(C3072f.this.f12478A));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$r */
    /* loaded from: classes4.dex */
    public static final class r implements d {

        /* renamed from: a */
        private final List f12567a;

        public r(List list) {
            AbstractC19074t.m100208f(list, "listProfileRowsViewData");
            this.f12567a = list;
        }

        /* renamed from: a */
        public final List m14922a() {
            return this.f12567a;
        }
    }

    /* renamed from: bp.f$r0 */
    /* loaded from: classes4.dex */
    public static final class r0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12568t;

        /* renamed from: v */
        final /* synthetic */ AbstractC24884f f12570v;

        /* renamed from: w */
        final /* synthetic */ int f12571w;

        /* renamed from: x */
        final /* synthetic */ List f12572x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(AbstractC24884f abstractC24884f, int i11, List list, Continuation continuation) {
            super(2, continuation);
            this.f12570v = abstractC24884f;
            this.f12571w = i11;
            this.f12572x = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new r0(this.f12570v, this.f12571w, this.f12572x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12568t == 0) {
                AbstractC24862s.m129228b(obj);
                C3072f.this.f12494z.mo9224q(new m(new w(this.f12570v, this.f12571w), this.f12572x));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$s */
    /* loaded from: classes4.dex */
    public static final class s implements t {

        /* renamed from: a */
        private final String f12573a;

        public s(String str) {
            AbstractC19074t.m100208f(str, "uId");
            this.f12573a = str;
        }

        /* renamed from: a */
        public final String m14924a() {
            return this.f12573a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && AbstractC19074t.m100204b(this.f12573a, ((s) obj).f12573a);
        }

        public int hashCode() {
            return this.f12573a.hashCode();
        }

        public String toString() {
            return "NavigateProfileView(uId=" + this.f12573a + ")";
        }
    }

    /* renamed from: bp.f$s0 */
    /* loaded from: classes4.dex */
    public static final class s0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12574t;

        /* renamed from: v */
        final /* synthetic */ AbstractC24884f f12576v;

        /* renamed from: w */
        final /* synthetic */ int f12577w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s0(AbstractC24884f abstractC24884f, int i11, Continuation continuation) {
            super(2, continuation);
            this.f12576v = abstractC24884f;
            this.f12577w = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new s0(this.f12576v, this.f12577w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12574t == 0) {
                AbstractC24862s.m129228b(obj);
                C3072f.this.f12494z.mo9224q(new i(new w(this.f12576v, this.f12577w)));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$t */
    /* loaded from: classes4.dex */
    public interface t {
    }

    /* renamed from: bp.f$t0 */
    /* loaded from: classes4.dex */
    public static final class t0 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f12578t;

        /* renamed from: v */
        final /* synthetic */ List f12580v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(List list, Continuation continuation) {
            super(2, continuation);
            this.f12580v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new t0(this.f12580v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f12578t == 0) {
                AbstractC24862s.m129228b(obj);
                C3072f.this.f12494z.mo9224q(new r(this.f12580v));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((t0) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: bp.f$u */
    /* loaded from: classes4.dex */
    public static class u implements d {

        /* renamed from: a */
        private final AbstractC24887i f12581a;

        /* renamed from: b */
        private final int f12582b;

        public u(AbstractC24887i abstractC24887i, int i11) {
            AbstractC19074t.m100208f(abstractC24887i, "rowData");
            this.f12581a = abstractC24887i;
            this.f12582b = i11;
        }
    }

    /* renamed from: bp.f$v */
    /* loaded from: classes4.dex */
    public static final class v extends u {

        /* renamed from: c */
        private final C24886h f12583c;

        /* renamed from: d */
        private final int f12584d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(C24886h c24886h, int i11) {
            super(c24886h, i11);
            AbstractC19074t.m100208f(c24886h, "rowData");
            this.f12583c = c24886h;
            this.f12584d = i11;
        }

        /* renamed from: a */
        public int m14927a() {
            return this.f12584d;
        }

        /* renamed from: b */
        public C24886h m14928b() {
            return this.f12583c;
        }
    }

    /* renamed from: bp.f$w */
    /* loaded from: classes4.dex */
    public static final class w extends u {

        /* renamed from: c */
        private final AbstractC24888j f12585c;

        /* renamed from: d */
        private final int f12586d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(AbstractC24888j abstractC24888j, int i11) {
            super(abstractC24888j, i11);
            AbstractC19074t.m100208f(abstractC24888j, "rowData");
            this.f12585c = abstractC24888j;
            this.f12586d = i11;
        }

        /* renamed from: a */
        public int m14929a() {
            return this.f12586d;
        }

        /* renamed from: b */
        public AbstractC24888j m14930b() {
            return this.f12585c;
        }
    }

    /* renamed from: bp.f$x */
    /* loaded from: classes4.dex */
    public static final class x implements y {

        /* renamed from: a */
        private final String f12587a;

        public x(String str) {
            AbstractC19074t.m100208f(str, "message");
            this.f12587a = str;
        }

        /* renamed from: a */
        public final String m14931a() {
            return this.f12587a;
        }
    }

    /* renamed from: bp.f$y */
    /* loaded from: classes4.dex */
    public interface y {
    }

    /* renamed from: bp.f$z */
    /* loaded from: classes4.dex */
    public /* synthetic */ class z {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12588a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12589b;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.f12545s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.f12542p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.f12544r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.f12543q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.f12546t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.f12547u.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.f12549w.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[l.f12548v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f12588a = iArr;
            int[] iArr2 = new int[AbstractC24884f.c.values().length];
            try {
                iArr2[AbstractC24884f.c.f119396q.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AbstractC24884f.c.f119397r.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            f12589b = iArr2;
        }
    }

    public C3072f() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        List m131506n;
        m129210a = AbstractC24856m.m129210a(e0.f12517q);
        this.f12487s = m129210a;
        m129210a2 = AbstractC24856m.m129210a(o0.f12560q);
        this.f12488t = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(a0.f12496q);
        this.f12489u = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(m0.f12556q);
        this.f12490v = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(h0.f12525q);
        this.f12491w = m129210a5;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        MutableSharedFlow m113477a = SharedFlowKt.m113477a(1, 1, bufferOverflow);
        m113477a.mo113433d(g.f12522a);
        this.f12492x = m113477a;
        Map synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC19074t.m100207e(synchronizedMap, "synchronizedMap(...)");
        this.f12493y = synchronizedMap;
        this.f12494z = new C1761c0();
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f12478A = synchronizedList;
        Map synchronizedMap2 = Collections.synchronizedMap(new LinkedHashMap());
        AbstractC19074t.m100207e(synchronizedMap2, "synchronizedMap(...)");
        this.f12479B = synchronizedMap2;
        m131506n = AbstractC25368s.m131506n(1);
        this.f12480C = new C1761c0(m131506n);
        MutableSharedFlow m113477a2 = SharedFlowKt.m113477a(1, 1, bufferOverflow);
        a aVar = a.f12495a;
        m113477a2.mo113433d(aVar);
        this.f12481D = m113477a2;
        this.f12482E = new C1761c0(aVar);
        this.f12483F = new C1761c0();
        this.f12484G = new C1761c0();
        this.f12485H = "";
        m14827S0();
    }

    /* renamed from: A1 */
    private final void m14800A1(k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = kVar.m14910a().iterator();
        while (it.hasNext()) {
            arrayList.addAll(m14871t0((l) it.next()));
        }
        m14806D1(arrayList);
    }

    /* renamed from: B0 */
    public final C25397a m14801B0() {
        return (C25397a) this.f12489u.getValue();
    }

    /* renamed from: B1 */
    public final void m14802B1(String str) {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new p0(str, null), 2, null);
    }

    /* renamed from: C0 */
    private final List m14803C0(String str) {
        List list;
        synchronized (this.f12479B) {
            list = (List) this.f12479B.get(str);
            if (list == null) {
                list = AbstractC25368s.m131502j();
            }
        }
        return list;
    }

    /* renamed from: C1 */
    private final void m14804C1(String str, C24886h.d dVar) {
        synchronized (this.f12479B) {
            try {
                Iterator it = this.f12479B.entrySet().iterator();
                while (it.hasNext()) {
                    for (AbstractC24887i abstractC24887i : (Iterable) ((Map.Entry) it.next()).getValue()) {
                        if ((abstractC24887i instanceof C24886h) && AbstractC19074t.m100204b(((C24886h) abstractC24887i).m129403e(), str)) {
                            ((C24886h) abstractC24887i).m129404f(dVar);
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: D0 */
    private final String m14805D0(ContactProfile contactProfile) {
        String str = contactProfile.f42437s;
        if (str != null && str.length() != 0) {
            String m40383Q = contactProfile.m40383Q(true, false);
            if (m40383Q != null && m40383Q.length() != 0) {
                AbstractC19074t.m100205c(m40383Q);
                return m40383Q;
            }
            String str2 = contactProfile.f42437s;
            AbstractC19074t.m100207e(str2, "dpn");
            return str2;
        }
        return "";
    }

    /* renamed from: D1 */
    private final void m14806D1(List list) {
        synchronized (this.f12478A) {
            this.f12478A.clear();
            this.f12478A.addAll(list);
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new q0(null), 2, null);
        }
    }

    /* renamed from: E0 */
    private final AbstractC24884f.c m14807E0(String str) {
        synchronized (this.f12478A) {
            for (AbstractC24887i abstractC24887i : this.f12478A) {
                if ((abstractC24887i instanceof AbstractC24884f) && AbstractC19074t.m100204b(((AbstractC24884f) abstractC24887i).mo129392c(), str)) {
                    return ((AbstractC24884f) abstractC24887i).mo129393e();
                }
            }
            return AbstractC24884f.c.f119397r;
        }
    }

    /* renamed from: E1 */
    private final void m14808E1(AbstractC24884f abstractC24884f) {
        AbstractC24884f.c mo129393e = abstractC24884f.mo129393e();
        AbstractC24884f.c cVar = AbstractC24884f.c.f119397r;
        if (mo129393e == cVar) {
            cVar = AbstractC24884f.c.f119396q;
        }
        C24860q m14812G1 = m14812G1(abstractC24884f, cVar);
        AbstractC24884f abstractC24884f2 = (AbstractC24884f) m14812G1.m129215c();
        int intValue = ((Number) m14812G1.m129216d()).intValue();
        if (abstractC24884f2 != null && intValue != -1) {
            synchronized (this.f12493y) {
                try {
                    if (AbstractC19074t.m100204b(abstractC24884f2.mo129392c(), "SECTION_ROW_ADDED_USER_TAG")) {
                        List list = (List) this.f12493y.get(l.f12542p);
                        if (list == null) {
                            list = AbstractC25368s.m131502j();
                        }
                        int i11 = z.f12589b[abstractC24884f2.mo129393e().ordinal()];
                        if (i11 != 1) {
                            if (i11 == 2) {
                                m14876v1(abstractC24884f2.mo129392c(), m14813K0(abstractC24884f2.mo129392c()));
                                m14882y1(abstractC24884f2.mo129392c());
                                BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new s0(abstractC24884f2, intValue, null), 2, null);
                            }
                        } else {
                            List m14803C0 = m14803C0(abstractC24884f2.mo129392c());
                            List arrayList = new ArrayList();
                            for (Object obj : m14803C0) {
                                if (obj instanceof C24886h) {
                                    arrayList.add(obj);
                                }
                            }
                            if (arrayList.isEmpty()) {
                                arrayList = m14864n0(list, AbstractC24884f.c.f119396q);
                            }
                            List list2 = arrayList;
                            m14829T0(list2, intValue + 1);
                            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new r0(abstractC24884f2, intValue, list2, null), 2, null);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: F0 */
    private final C25435t m14809F0() {
        return (C25435t) this.f12487s.getValue();
    }

    /* renamed from: F1 */
    public final void m14810F1(String str, C24886h.d dVar) {
        synchronized (this.f12478A) {
            try {
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                for (Object obj : this.f12478A) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    AbstractC24887i abstractC24887i = (AbstractC24887i) obj;
                    if ((abstractC24887i instanceof C24886h) && AbstractC19074t.m100204b(((C24886h) abstractC24887i).m129403e(), str)) {
                        ((C24886h) abstractC24887i).m129404f(dVar);
                        arrayList.add(new v((C24886h) abstractC24887i, i11));
                    }
                    i11 = i12;
                }
                if (!arrayList.isEmpty()) {
                    BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), Dispatchers.m112681c(), null, new t0(arrayList, null), 2, null);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: G0 */
    private final C25438v m14811G0() {
        return (C25438v) this.f12491w.getValue();
    }

    /* renamed from: G1 */
    private final C24860q m14812G1(AbstractC24884f abstractC24884f, AbstractC24884f.c cVar) {
        C24860q c24860q;
        synchronized (this.f12478A) {
            try {
                AbstractC24887i abstractC24887i = null;
                int i11 = -1;
                int i12 = 0;
                for (Object obj : this.f12478A) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    AbstractC24887i abstractC24887i2 = (AbstractC24887i) obj;
                    if ((abstractC24887i2 instanceof AbstractC24884f) && AbstractC19074t.m100204b(((AbstractC24884f) abstractC24887i2).mo129392c(), abstractC24884f.mo129392c())) {
                        ((AbstractC24884f) abstractC24887i2).mo129395g(cVar);
                        i11 = i12;
                        abstractC24887i = abstractC24887i2;
                    }
                    i12 = i13;
                }
                c24860q = new C24860q(abstractC24887i, Integer.valueOf(i11));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c24860q;
    }

    /* renamed from: K0 */
    private final List m14813K0(String str) {
        ArrayList arrayList;
        synchronized (this.f12478A) {
            List list = this.f12478A;
            arrayList = new ArrayList();
            for (Object obj : list) {
                AbstractC24887i abstractC24887i = (AbstractC24887i) obj;
                if ((abstractC24887i instanceof C24886h) && AbstractC19074t.m100204b(((C24886h) abstractC24887i).m129402d(), str)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: L0 */
    public final C25442z m14814L0() {
        return (C25442z) this.f12490v.getValue();
    }

    /* renamed from: M0 */
    public final C25400b0 m14816M0() {
        return (C25400b0) this.f12488t.getValue();
    }

    /* renamed from: N0 */
    public final int m14818N0(String str) {
        if (AbstractC19074t.m100204b(str, "SECTION_ROW_SUGGESTION_TAG")) {
            return 2;
        }
        return 3;
    }

    /* renamed from: P0 */
    private final void m14821P0(AbstractC24884f abstractC24884f) {
        int i11 = z.f12589b[abstractC24884f.mo129393e().ordinal()];
        if (i11 == 1 || i11 == 2) {
            m14808E1(abstractC24884f);
        }
    }

    /* renamed from: Q0 */
    private final void m14823Q0() {
        this.f12484G.mo9224q(new C19964c(p.f12561a));
        m14880x1();
    }

    /* renamed from: R0 */
    private final void m14825R0() {
        m14880x1();
    }

    /* renamed from: S0 */
    private final void m14827S0() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b0(null), 3, null);
    }

    /* renamed from: T0 */
    private final void m14829T0(List list, int i11) {
        synchronized (this.f12478A) {
            this.f12478A.addAll(i11, list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:            if (m14833V0(r3) != false) goto L54;     */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m14831U0() {
        boolean z11;
        synchronized (this.f12493y) {
            try {
                List list = (List) this.f12493y.get(l.f12543q);
                if (list == null) {
                    list = AbstractC25368s.m131502j();
                }
                List list2 = (List) this.f12493y.get(l.f12542p);
                if (list2 == null) {
                    list2 = AbstractC25368s.m131502j();
                }
                List list3 = (List) this.f12493y.get(l.f12544r);
                if (list3 == null) {
                    list3 = AbstractC25368s.m131502j();
                }
                if (list.isEmpty() && list2.isEmpty()) {
                    if (!list3.isEmpty()) {
                    }
                    z11 = true;
                }
                z11 = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: V0 */
    private final boolean m14833V0(List list) {
        if (list.size() != 1 || !AbstractC25495a.m132086k(((ContactProfile) list.get(0)).f42434r)) {
            return false;
        }
        return true;
    }

    /* renamed from: W0 */
    public final boolean m14835W0() {
        boolean z11;
        synchronized (this.f12493y) {
            List list = (List) this.f12493y.get(l.f12542p);
            if (list != null) {
                z11 = list.isEmpty();
            } else {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: X0 */
    public final boolean m14837X0() {
        boolean z11;
        synchronized (this.f12493y) {
            List list = (List) this.f12493y.get(l.f12544r);
            if (list != null) {
                z11 = list.isEmpty();
            } else {
                z11 = true;
            }
        }
        return z11;
    }

    /* renamed from: Y0 */
    private final boolean m14839Y0() {
        boolean z11;
        boolean z12;
        boolean z13;
        synchronized (this.f12493y) {
            try {
                List list = (List) this.f12493y.get(l.f12547u);
                z11 = true;
                if (list != null) {
                    z12 = list.isEmpty();
                } else {
                    z12 = true;
                }
                List list2 = (List) this.f12493y.get(l.f12546t);
                if (list2 != null) {
                    z13 = list2.isEmpty();
                } else {
                    z13 = true;
                }
                if (!z12 || !z13) {
                    z11 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* renamed from: Z0 */
    private final boolean m14841Z0() {
        return AbstractC19074t.m100204b(m14893z0().mo9215f(), b.f12497a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14843a1(Continuation continuation) {
        c0 c0Var;
        Object m142578e;
        int i11;
        C3072f c3072f;
        Flow flow;
        if (continuation instanceof c0) {
            c0Var = (c0) continuation;
            int i12 = c0Var.f12510v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c0Var.f12510v = i12 - Integer.MIN_VALUE;
                Object obj = c0Var.f12508t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c0Var.f12510v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3072f = (C3072f) c0Var.f12507s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25435t m14809F0 = m14809F0();
                    C25435t.a aVar = new C25435t.a(0);
                    c0Var.f12507s = this;
                    c0Var.f12510v = 1;
                    obj = m14809F0.m101498a(aVar, c0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c3072f = this;
                }
                flow = (Flow) obj;
                if (flow == null) {
                    d0 d0Var = new d0();
                    c0Var.f12507s = null;
                    c0Var.f12510v = 2;
                    if (flow.mo97893a(d0Var, c0Var) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        c0Var = new c0(continuation);
        Object obj2 = c0Var.f12508t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c0Var.f12510v;
        if (i11 == 0) {
        }
        flow = (Flow) obj2;
        if (flow == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m14845b1(Continuation continuation) {
        f0 f0Var;
        Object m142578e;
        int i11;
        C3072f c3072f;
        Flow flow;
        if (continuation instanceof f0) {
            f0Var = (f0) continuation;
            int i12 = f0Var.f12521v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                f0Var.f12521v = i12 - Integer.MIN_VALUE;
                Object obj = f0Var.f12519t;
                m142578e = AbstractC28298d.m142578e();
                i11 = f0Var.f12521v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3072f = (C3072f) f0Var.f12518s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C25438v m14811G0 = m14811G0();
                    C25438v.a aVar = new C25438v.a(0);
                    f0Var.f12518s = this;
                    f0Var.f12521v = 1;
                    obj = m14811G0.m101498a(aVar, f0Var);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c3072f = this;
                }
                flow = (Flow) obj;
                if (flow == null) {
                    g0 g0Var = new g0();
                    f0Var.f12518s = null;
                    f0Var.f12521v = 2;
                    if (flow.mo97893a(g0Var, f0Var) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            }
        }
        f0Var = new f0(continuation);
        Object obj2 = f0Var.f12519t;
        m142578e = AbstractC28298d.m142578e();
        i11 = f0Var.f12521v;
        if (i11 == 0) {
        }
        flow = (Flow) obj2;
        if (flow == null) {
        }
    }

    /* renamed from: c1 */
    private final List m14847c1(List list, boolean z11) {
        CharSequence m127168X0;
        Object m127206e1;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            String str2 = contactProfile.f42440t;
            AbstractC19074t.m100207e(str2, "dpnNoSign");
            m127168X0 = AbstractC24342w.m127168X0(str2);
            m127206e1 = AbstractC24344y.m127206e1(m127168X0.toString());
            if (m127206e1 == null) {
                m127206e1 = "";
            }
            String obj = m127206e1.toString();
            if (z11 && !AbstractC19074t.m100204b(str, obj)) {
                String upperCase = obj.toUpperCase(Locale.ROOT);
                AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                arrayList.add(new C24889k(upperCase));
                str = obj;
            }
            String str3 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str3, "uid");
            String m14805D0 = m14805D0(contactProfile);
            String str4 = contactProfile.f42446v;
            AbstractC19074t.m100207e(str4, "avt");
            arrayList.add(new C24886h(str3, m14805D0, str4, C24886h.d.f119410q, null, 16, null));
        }
        return arrayList;
    }

    /* renamed from: d1 */
    static /* synthetic */ List m14848d1(C3072f c3072f, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return c3072f.m14847c1(list, z11);
    }

    /* renamed from: e1 */
    private final List m14850e1(List list, String str) {
        int m131511r;
        List<ContactProfile> list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (ContactProfile contactProfile : list2) {
            String str2 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            String m14805D0 = m14805D0(contactProfile);
            String str3 = contactProfile.f42446v;
            AbstractC19074t.m100207e(str3, "avt");
            arrayList.add(new C24886h(str2, m14805D0, str3, C24886h.d.f119409p, str));
        }
        return arrayList;
    }

    /* renamed from: f1 */
    static /* synthetic */ List m14852f1(C3072f c3072f, List list, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "";
        }
        return c3072f.m14850e1(list, str);
    }

    /* renamed from: g1 */
    private final List m14854g1(List list, String str) {
        int m131511r;
        List<ContactProfile> list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (ContactProfile contactProfile : list2) {
            String str2 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            String m14805D0 = m14805D0(contactProfile);
            String str3 = contactProfile.f42446v;
            AbstractC19074t.m100207e(str3, "avt");
            arrayList.add(new C24886h(str2, m14805D0, str3, C24886h.d.f119410q, str));
        }
        return arrayList;
    }

    /* renamed from: h1 */
    private final void m14856h1(String str) {
        this.f12483F.mo9224q(new C19964c(new s(str)));
    }

    /* renamed from: i1 */
    private final void m14858i1() {
        this.f12486I = true;
    }

    /* renamed from: j1 */
    public final void m14860j1(String str, C24886h.d dVar) {
        m14810F1(str, dVar);
        m14804C1(str, dVar);
        m14858i1();
    }

    /* renamed from: l0 */
    private final void m14862l0() {
        synchronized (this.f12479B) {
            this.f12479B.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: m0 */
    private final List m14863m0(List list) {
        AbstractC24884f.c m14807E0;
        if (list.isEmpty()) {
            m14807E0 = AbstractC24884f.c.f119395p;
        } else {
            m14807E0 = m14807E0("SECTION_ROW_ADDED_USER_TAG");
            if (m14807E0 == AbstractC24884f.c.f119395p) {
                m14807E0 = AbstractC24884f.c.f119397r;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C24892n(AbstractC23136l9.m118742r(8.0f), 0, 2, null));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_contact_native_added);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        arrayList.add(new C24890l(m118743r0, format, m14807E0, "SECTION_ROW_ADDED_USER_TAG"));
        arrayList.addAll(m14864n0(list, m14807E0));
        return arrayList;
    }

    /* renamed from: n0 */
    private final List m14864n0(List list, AbstractC24884f.c cVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar == AbstractC24884f.c.f119396q || cVar == AbstractC24884f.c.f119395p) {
            arrayList.addAll(m14850e1(list, "SECTION_ROW_ADDED_USER_TAG"));
        }
        return arrayList;
    }

    /* renamed from: o0 */
    private final List m14865o0(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C24892n(AbstractC23136l9.m118742r(8.0f), 0, 2, null));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_contact);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(new C24890l(m118743r0, null, null, null, 14, null));
        if (!list.isEmpty()) {
            arrayList.addAll(m14848d1(this, list, false, 2, null));
        } else {
            C24894p c24894p = new C24894p(false, 1, null);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_have_added_everyone);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            c24894p.m129426K(m118743r02);
            c24894p.m129433R(AbstractC16781w.TimelineEmptyListIllustrator);
            c24894p.m129434S(AbstractC23136l9.m118742r(96.0f));
            c24894p.m129420E(AbstractC2807a.ui_background);
            c24894p.m129425J(false);
            arrayList.add(new C24883e(c24894p));
        }
        return arrayList;
    }

    /* renamed from: o1 */
    private final void m14866o1(C24886h c24886h) {
        m14856h1(c24886h.m129403e());
    }

    /* renamed from: p0 */
    private final List m14867p0(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m14852f1(this, list, null, 2, null));
        return arrayList;
    }

    /* renamed from: q0 */
    private final List m14868q0(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m14847c1(list, false));
        return arrayList;
    }

    /* renamed from: r0 */
    private final List m14869r0(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty()) {
            if (!m14841Z0()) {
                arrayList.add(new C24892n(AbstractC23136l9.m118742r(8.0f), 0, 2, null));
            }
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggestion_section_title);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            arrayList.add(new C24890l(m118743r0, null, null, "SECTION_ROW_SUGGESTION_TAG", 6, null));
            arrayList.addAll(m14854g1(list, "SECTION_ROW_SUGGESTION_TAG"));
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public final void m14870s0() {
        List m131496e;
        C24894p c24894p = new C24894p(false, 1, null);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_connection_error);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        c24894p.m129436U(m118743r0);
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_network_error_detail);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        c24894p.m129426K(m118743r02);
        c24894p.m129431P(AbstractC16803z.im_connect);
        c24894p.m129434S(AbstractC23136l9.m118742r(128.0f));
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.tap_to_retry);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        c24894p.m129421F(m118743r03);
        c24894p.m129422G("timeline_manage_user_tab_other_error_network_retry");
        c24894p.m129420E(AbstractC2807a.ui_background);
        c24894p.m129425J(true);
        m131496e = AbstractC25366r.m131496e(new C24883e(c24894p));
        m14806D1(m131496e);
    }

    /* renamed from: t0 */
    private final List m14871t0(l lVar) {
        List m14875v0;
        synchronized (this.f12493y) {
            try {
                List list = (List) this.f12493y.get(lVar);
                switch (z.f12588a[lVar.ordinal()]) {
                    case 1:
                        m14875v0 = m14875v0();
                        break;
                    case 2:
                        if (list == null) {
                            m14875v0 = AbstractC25368s.m131502j();
                            break;
                        } else {
                            m14875v0 = m14863m0(list);
                            break;
                        }
                    case 3:
                        if (list == null) {
                            m14875v0 = AbstractC25368s.m131502j();
                            break;
                        } else {
                            m14875v0 = m14865o0(list);
                            break;
                        }
                    case 4:
                        if (list == null) {
                            m14875v0 = AbstractC25368s.m131502j();
                            break;
                        } else {
                            List list2 = (List) this.f12493y.get(l.f12542p);
                            if (list2 == null) {
                                list2 = AbstractC25368s.m131502j();
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                ContactProfile contactProfile = (ContactProfile) obj;
                                List list3 = list2;
                                boolean z11 = false;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it = list3.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (AbstractC19074t.m100204b(contactProfile.f42434r, ((ContactProfile) it.next()).f42434r)) {
                                                z11 = true;
                                            }
                                        }
                                    }
                                }
                                if (!z11) {
                                    arrayList.add(obj);
                                }
                            }
                            m14875v0 = m14869r0(arrayList);
                            break;
                        }
                    case 5:
                        if (list == null) {
                            m14875v0 = AbstractC25368s.m131502j();
                            break;
                        } else {
                            m14875v0 = m14867p0(list);
                            break;
                        }
                    case 6:
                        if (list == null) {
                            m14875v0 = AbstractC25368s.m131502j();
                            break;
                        } else {
                            m14875v0 = m14868q0(list);
                            break;
                        }
                    case 7:
                        m14875v0 = m14877w0();
                        break;
                    case 8:
                        m14875v0 = m14879x0();
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m14875v0;
    }

    /* renamed from: t1 */
    private final void m14872t1() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new k0(null), 3, null);
    }

    /* renamed from: u0 */
    private final k m14873u0() {
        boolean m127128x;
        List m131506n;
        List m131506n2;
        List m131506n3;
        List m131506n4;
        boolean m100204b = AbstractC19074t.m100204b(m14893z0().mo9215f(), a.f12495a);
        boolean m100204b2 = AbstractC19074t.m100204b(m14893z0().mo9215f(), b.f12497a);
        ArrayList arrayList = new ArrayList();
        if (m100204b) {
            if (!m14831U0()) {
                m131506n4 = AbstractC25368s.m131506n(l.f12545s, l.f12542p, l.f12543q, l.f12544r);
                arrayList.addAll(m131506n4);
            } else {
                arrayList.add(l.f12549w);
            }
        } else if (m100204b2) {
            m127128x = AbstractC24341v.m127128x(this.f12485H);
            if (!(!m127128x)) {
                m131506n = AbstractC25368s.m131506n(l.f12543q, l.f12544r);
                arrayList.addAll(m131506n);
            } else if (m14839Y0()) {
                m131506n3 = AbstractC25368s.m131506n(l.f12548v);
                arrayList.addAll(m131506n3);
            } else {
                m131506n2 = AbstractC25368s.m131506n(l.f12546t, l.f12547u);
                arrayList.addAll(m131506n2);
            }
        }
        return new k(arrayList);
    }

    /* renamed from: u1 */
    private final void m14874u1(C24886h c24886h) {
        m14856h1(c24886h.m129403e());
    }

    /* renamed from: v0 */
    private final List m14875v0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C24892n(AbstractC23136l9.m118742r(16.0f), C23212s8.m119606n(AbstractC2807a.ui_background)));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_move_tab_user_manage_view_first_description_about_user_post);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(new C24882d(m118743r0));
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.f43859xbabeb335);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        arrayList.add(new C24882d(m118743r02));
        arrayList.add(new C24892n(AbstractC23136l9.m118742r(16.0f), C23212s8.m119606n(AbstractC2807a.ui_background)));
        return arrayList;
    }

    /* renamed from: v1 */
    private final void m14876v1(String str, List list) {
        List m131187O0;
        synchronized (this.f12479B) {
            Map map = this.f12479B;
            m131187O0 = AbstractC25332a0.m131187O0(list);
        }
    }

    /* renamed from: w0 */
    private final List m14877w0() {
        List m131506n;
        C24894p c24894p = new C24894p(false, 1, null);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_have_any_friend);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        c24894p.m129426K(m118743r0);
        c24894p.m129427L(AbstractC2807a.text_01);
        c24894p.m129433R(AbstractC16781w.TimelineEmptyListIllustrator);
        c24894p.m129434S(AbstractC23136l9.m118742r(128.0f));
        c24894p.m129420E(AbstractC2807a.ui_background);
        c24894p.m129425J(true);
        C24848g0 c24848g0 = C24848g0.f119245a;
        m131506n = AbstractC25368s.m131506n(new C24883e(c24894p));
        return m131506n;
    }

    /* renamed from: w1 */
    public final void m14878w1() {
        c cVar = (c) m14893z0().mo9215f();
        if (AbstractC19074t.m100204b(cVar, a.f12495a)) {
            m14880x1();
        } else if (AbstractC19074t.m100204b(cVar, b.f12497a)) {
            m14883z1();
        }
    }

    /* renamed from: x0 */
    private final List m14879x0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C24892n(AbstractC23136l9.m118742r(48.0f), C23212s8.m119606n(AbstractC2807a.ui_background)));
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_emptyResult);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        arrayList.add(new C24885g(m118743r0));
        return arrayList;
    }

    /* renamed from: x1 */
    public final void m14880x1() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new l0(null), 3, null);
    }

    /* renamed from: y0 */
    public final void m14881y0() {
        List m131496e;
        m131496e = AbstractC25366r.m131496e(C24891m.f119427b);
        m14806D1(m131496e);
    }

    /* renamed from: y1 */
    private final void m14882y1(String str) {
        synchronized (this.f12478A) {
            AbstractC25378x.m131542D(this.f12478A, new n0(str));
        }
    }

    /* renamed from: z1 */
    public final void m14883z1() {
        m14862l0();
        m14800A1(m14873u0());
    }

    /* renamed from: A0 */
    public final LiveData m14884A0() {
        return this.f12494z;
    }

    /* renamed from: I0 */
    public final LiveData m14885I0() {
        return this.f12483F;
    }

    /* renamed from: J0 */
    public final LiveData m14886J0() {
        return this.f12480C;
    }

    /* renamed from: O0 */
    public final LiveData m14887O0() {
        return this.f12484G;
    }

    /* renamed from: k1 */
    public final void m14888k1() {
        this.f12481D.mo113433d(b.f12497a);
    }

    /* renamed from: l1 */
    public final void m14889l1() {
        this.f12481D.mo113433d(a.f12495a);
    }

    /* renamed from: m1 */
    public final void m14890m1() {
        C32531j.f150273a.m157495a().mo157491c(new C3070d(this.f12486I));
    }

    /* renamed from: n1 */
    public final void m14891n1(String str) {
        boolean m127128x;
        AbstractC19074t.m100208f(str, "text");
        this.f12485H = str;
        m127128x = AbstractC24341v.m127128x(str);
        if (!m127128x) {
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new i0(str, null), 3, null);
        } else {
            m14883z1();
        }
    }

    @Override // bo.InterfaceC3045u2
    /* renamed from: rG */
    public void mo14631rG(InterfaceC3058y interfaceC3058y) {
        AbstractC19074t.m100208f(interfaceC3058y, "event");
        if (interfaceC3058y instanceof C24886h.b) {
            m14892s1(((C24886h.b) interfaceC3058y).m129406a());
            return;
        }
        if (interfaceC3058y instanceof C2278i) {
            m14891n1(((C2278i) interfaceC3058y).m12005a());
            return;
        }
        if (interfaceC3058y instanceof C24886h.a) {
            m14866o1(((C24886h.a) interfaceC3058y).m129405a());
            return;
        }
        if (interfaceC3058y instanceof C24886h.c) {
            m14874u1(((C24886h.c) interfaceC3058y).m129407a());
            return;
        }
        if (interfaceC3058y instanceof AbstractC24887i.b) {
            m14872t1();
            return;
        }
        if (interfaceC3058y instanceof AbstractC24884f.a) {
            m14821P0(((AbstractC24884f.a) interfaceC3058y).m129396a());
            return;
        }
        if (interfaceC3058y instanceof AbstractC24884f.b) {
            m14821P0(((AbstractC24884f.b) interfaceC3058y).m129397a());
        } else if (interfaceC3058y instanceof MoveTabUserManageView.C8553c) {
            m14823Q0();
        } else if (interfaceC3058y instanceof MoveTabUserManageView.C8552b) {
            m14825R0();
        }
    }

    /* renamed from: s1 */
    public final void m14892s1(C24886h c24886h) {
        AbstractC19074t.m100208f(c24886h, "data");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new j0(c24886h, this, null), 3, null);
    }

    /* renamed from: z0 */
    public final LiveData m14893z0() {
        return this.f12482E;
    }
}
