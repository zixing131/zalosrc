package pn;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zing.zalo.expandableview.button.CameraActionButton;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import mj0.AbstractC23322a;
import mn.AbstractC23358a;
import mn.AbstractC23359b;
import mn.InterfaceC23360c;
import mn.InterfaceC23362e;
import p367nn.C23886a;
import p367nn.EnumC23888c;
import p367nn.InterfaceC23890e;
import p367nn.InterfaceC23891f;
import p397on.C24314b;
import p397on.EnumC24313a;
import p663xz.InterfaceC30225a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: pn.c */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC24872c extends AbstractC23359b implements InterfaceC23890e, InterfaceC23891f, LayoutTransition.TransitionListener, View.OnClickListener, InterfaceC24870a {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private final C1761c0 f119313A;

    /* renamed from: B */
    private final LiveData f119314B;

    /* renamed from: C */
    private final C1761c0 f119315C;

    /* renamed from: D */
    private final LiveData f119316D;

    /* renamed from: E */
    private final C1761c0 f119317E;

    /* renamed from: s */
    private final InterfaceC23360c f119318s;

    /* renamed from: t */
    private final InterfaceC24870a f119319t;

    /* renamed from: u */
    private final InterfaceC30225a f119320u;

    /* renamed from: v */
    private final CoroutineDispatcher f119321v;

    /* renamed from: w */
    private Job f119322w;

    /* renamed from: x */
    private InterfaceC23362e f119323x;

    /* renamed from: y */
    private C24314b f119324y;

    /* renamed from: z */
    private AbstractC23358a f119325z;

    /* renamed from: pn.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: pn.c$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f119326a;

        static {
            int[] iArr = new int[EnumC23888c.values().length];
            try {
                iArr[EnumC23888c.f115491x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f119326a = iArr;
        }
    }

    /* renamed from: pn.c$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119327t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC1801w f119328u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC23362e f119329v;

        /* renamed from: w */
        final /* synthetic */ ViewOnClickListenerC24872c f119330w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: pn.c$c$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f119331t;

            /* renamed from: u */
            final /* synthetic */ InterfaceC23362e f119332u;

            /* renamed from: v */
            final /* synthetic */ ViewOnClickListenerC24872c f119333v;

            /* renamed from: w */
            final /* synthetic */ InterfaceC1801w f119334w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: pn.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32934a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ ViewOnClickListenerC24872c f119335p;

                /* renamed from: q */
                final /* synthetic */ InterfaceC23362e f119336q;

                /* renamed from: r */
                final /* synthetic */ InterfaceC1801w f119337r;

                C32934a(ViewOnClickListenerC24872c viewOnClickListenerC24872c, InterfaceC23362e interfaceC23362e, InterfaceC1801w interfaceC1801w) {
                    this.f119335p = viewOnClickListenerC24872c;
                    this.f119336q = interfaceC23362e;
                    this.f119337r = interfaceC1801w;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object mo12109b(C24314b c24314b, Continuation continuation) {
                    ViewOnClickListenerC24872c viewOnClickListenerC24872c = this.f119335p;
                    AbstractC19074t.m100205c(c24314b);
                    viewOnClickListenerC24872c.m129305v(c24314b, this.f119336q, this.f119337r);
                    this.f119335p.mo129265c(this.f119337r);
                    return C24848g0.f119245a;
                }
            }

            /* renamed from: pn.c$c$a$b */
            /* loaded from: classes3.dex */
            public static final class b implements Flow {

                /* renamed from: p */
                final /* synthetic */ Flow f119338p;

                /* renamed from: pn.c$c$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C32935a implements FlowCollector {

                    /* renamed from: p */
                    final /* synthetic */ FlowCollector f119339p;

                    /* renamed from: pn.c$c$a$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C32936a extends AbstractC29096d {

                        /* renamed from: s */
                        /* synthetic */ Object f119340s;

                        /* renamed from: t */
                        int f119341t;

                        public C32936a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // wm0.AbstractC29093a
                        /* renamed from: o */
                        public final Object mo239o(Object obj) {
                            this.f119340s = obj;
                            this.f119341t |= Integer.MIN_VALUE;
                            return C32935a.this.mo12109b(null, this);
                        }
                    }

                    public C32935a(FlowCollector flowCollector) {
                        this.f119339p = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo12109b(Object obj, Continuation continuation) {
                        C32936a c32936a;
                        Object m142578e;
                        int i11;
                        if (continuation instanceof C32936a) {
                            c32936a = (C32936a) continuation;
                            int i12 = c32936a.f119341t;
                            if ((i12 & Integer.MIN_VALUE) != 0) {
                                c32936a.f119341t = i12 - Integer.MIN_VALUE;
                                Object obj2 = c32936a.f119340s;
                                m142578e = AbstractC28298d.m142578e();
                                i11 = c32936a.f119341t;
                                if (i11 == 0) {
                                    if (i11 == 1) {
                                        AbstractC24862s.m129228b(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    AbstractC24862s.m129228b(obj2);
                                    FlowCollector flowCollector = this.f119339p;
                                    if (((EnumC24313a) obj) != null) {
                                        c32936a.f119341t = 1;
                                        if (flowCollector.mo12109b(obj, c32936a) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        c32936a = new C32936a(continuation);
                        Object obj22 = c32936a.f119340s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c32936a.f119341t;
                        if (i11 == 0) {
                        }
                        return C24848g0.f119245a;
                    }
                }

                public b(Flow flow) {
                    this.f119338p = flow;
                }

                @Override // kotlinx.coroutines.flow.Flow
                /* renamed from: a */
                public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                    Object m142578e;
                    Object mo97893a = this.f119338p.mo97893a(new C32935a(flowCollector), continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (mo97893a == m142578e) {
                        return mo97893a;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* renamed from: pn.c$c$a$c, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32937c implements Flow {

                /* renamed from: p */
                final /* synthetic */ Flow f119343p;

                /* renamed from: q */
                final /* synthetic */ ViewOnClickListenerC24872c f119344q;

                /* renamed from: pn.c$c$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C32938a implements FlowCollector {

                    /* renamed from: p */
                    final /* synthetic */ FlowCollector f119345p;

                    /* renamed from: q */
                    final /* synthetic */ ViewOnClickListenerC24872c f119346q;

                    /* renamed from: pn.c$c$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C32939a extends AbstractC29096d {

                        /* renamed from: s */
                        /* synthetic */ Object f119347s;

                        /* renamed from: t */
                        int f119348t;

                        public C32939a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // wm0.AbstractC29093a
                        /* renamed from: o */
                        public final Object mo239o(Object obj) {
                            this.f119347s = obj;
                            this.f119348t |= Integer.MIN_VALUE;
                            return C32938a.this.mo12109b(null, this);
                        }
                    }

                    public C32938a(FlowCollector flowCollector, ViewOnClickListenerC24872c viewOnClickListenerC24872c) {
                        this.f119345p = flowCollector;
                        this.f119346q = viewOnClickListenerC24872c;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo12109b(Object obj, Continuation continuation) {
                        C32939a c32939a;
                        Object m142578e;
                        int i11;
                        if (continuation instanceof C32939a) {
                            c32939a = (C32939a) continuation;
                            int i12 = c32939a.f119348t;
                            if ((i12 & Integer.MIN_VALUE) != 0) {
                                c32939a.f119348t = i12 - Integer.MIN_VALUE;
                                Object obj2 = c32939a.f119347s;
                                m142578e = AbstractC28298d.m142578e();
                                i11 = c32939a.f119348t;
                                if (i11 == 0) {
                                    if (i11 == 1) {
                                        AbstractC24862s.m129228b(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    AbstractC24862s.m129228b(obj2);
                                    FlowCollector flowCollector = this.f119345p;
                                    C24314b c24314b = (C24314b) obj;
                                    if (c24314b != null && !AbstractC19074t.m100204b(c24314b, this.f119346q.m129303q())) {
                                        c32939a.f119348t = 1;
                                        if (flowCollector.mo12109b(obj, c32939a) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        c32939a = new C32939a(continuation);
                        Object obj22 = c32939a.f119347s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c32939a.f119348t;
                        if (i11 == 0) {
                        }
                        return C24848g0.f119245a;
                    }
                }

                public C32937c(Flow flow, ViewOnClickListenerC24872c viewOnClickListenerC24872c) {
                    this.f119343p = flow;
                    this.f119344q = viewOnClickListenerC24872c;
                }

                @Override // kotlinx.coroutines.flow.Flow
                /* renamed from: a */
                public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                    Object m142578e;
                    Object mo97893a = this.f119343p.mo97893a(new C32938a(flowCollector, this.f119344q), continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (mo97893a == m142578e) {
                        return mo97893a;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* renamed from: pn.c$c$a$d */
            /* loaded from: classes3.dex */
            public static final class d implements Flow {

                /* renamed from: p */
                final /* synthetic */ Flow f119350p;

                /* renamed from: q */
                final /* synthetic */ ViewOnClickListenerC24872c f119351q;

                /* renamed from: pn.c$c$a$d$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C32940a implements FlowCollector {

                    /* renamed from: p */
                    final /* synthetic */ FlowCollector f119352p;

                    /* renamed from: q */
                    final /* synthetic */ ViewOnClickListenerC24872c f119353q;

                    /* renamed from: pn.c$c$a$d$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C32941a extends AbstractC29096d {

                        /* renamed from: s */
                        /* synthetic */ Object f119354s;

                        /* renamed from: t */
                        int f119355t;

                        public C32941a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // wm0.AbstractC29093a
                        /* renamed from: o */
                        public final Object mo239o(Object obj) {
                            this.f119354s = obj;
                            this.f119355t |= Integer.MIN_VALUE;
                            return C32940a.this.mo12109b(null, this);
                        }
                    }

                    public C32940a(FlowCollector flowCollector, ViewOnClickListenerC24872c viewOnClickListenerC24872c) {
                        this.f119352p = flowCollector;
                        this.f119353q = viewOnClickListenerC24872c;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo12109b(Object obj, Continuation continuation) {
                        C32941a c32941a;
                        Object m142578e;
                        int i11;
                        if (continuation instanceof C32941a) {
                            c32941a = (C32941a) continuation;
                            int i12 = c32941a.f119355t;
                            if ((i12 & Integer.MIN_VALUE) != 0) {
                                c32941a.f119355t = i12 - Integer.MIN_VALUE;
                                Object obj2 = c32941a.f119354s;
                                m142578e = AbstractC28298d.m142578e();
                                i11 = c32941a.f119355t;
                                if (i11 == 0) {
                                    if (i11 == 1) {
                                        AbstractC24862s.m129228b(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    AbstractC24862s.m129228b(obj2);
                                    FlowCollector flowCollector = this.f119352p;
                                    C24314b mo129266e = this.f119353q.mo129266e((EnumC24313a) obj);
                                    c32941a.f119355t = 1;
                                    if (flowCollector.mo12109b(mo129266e, c32941a) == m142578e) {
                                        return m142578e;
                                    }
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        c32941a = new C32941a(continuation);
                        Object obj22 = c32941a.f119354s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c32941a.f119355t;
                        if (i11 == 0) {
                        }
                        return C24848g0.f119245a;
                    }
                }

                public d(Flow flow, ViewOnClickListenerC24872c viewOnClickListenerC24872c) {
                    this.f119350p = flow;
                    this.f119351q = viewOnClickListenerC24872c;
                }

                @Override // kotlinx.coroutines.flow.Flow
                /* renamed from: a */
                public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                    Object m142578e;
                    Object mo97893a = this.f119350p.mo97893a(new C32940a(flowCollector, this.f119351q), continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (mo97893a == m142578e) {
                        return mo97893a;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC23362e interfaceC23362e, ViewOnClickListenerC24872c viewOnClickListenerC24872c, InterfaceC1801w interfaceC1801w, Continuation continuation) {
                super(2, continuation);
                this.f119332u = interfaceC23362e;
                this.f119333v = viewOnClickListenerC24872c;
                this.f119334w = interfaceC1801w;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f119332u, this.f119333v, this.f119334w, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f119331t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow m113267C = FlowKt.m113267C(FlowKt.m113298p(new C32937c(new d(FlowKt.m113298p(new b(this.f119332u.getExpandableActionViewConfig())), this.f119333v), this.f119333v)), this.f119333v.f119321v);
                    C32934a c32934a = new C32934a(this.f119333v, this.f119332u, this.f119334w);
                    this.f119331t = 1;
                    if (m113267C.mo97893a(c32934a, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1801w interfaceC1801w, InterfaceC23362e interfaceC23362e, ViewOnClickListenerC24872c viewOnClickListenerC24872c, Continuation continuation) {
            super(2, continuation);
            this.f119328u = interfaceC1801w;
            this.f119329v = interfaceC23362e;
            this.f119330w = viewOnClickListenerC24872c;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f119328u, this.f119329v, this.f119330w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f119327t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w interfaceC1801w = this.f119328u;
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(this.f119329v, this.f119330w, interfaceC1801w, null);
                this.f119327t = 1;
                if (RepeatOnLifecycleKt.m9234b(interfaceC1801w, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ ViewOnClickListenerC24872c(View view, InterfaceC23360c interfaceC23360c, InterfaceC24870a interfaceC24870a, InterfaceC30225a interfaceC30225a, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(view, interfaceC23360c, interfaceC24870a, interfaceC30225a, (i11 & 16) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }

    /* renamed from: p */
    private final void m129298p(AbstractC23358a abstractC23358a) {
        if (abstractC23358a instanceof AbstractC23358a.b) {
            InterfaceC23362e interfaceC23362e = this.f119323x;
            if (interfaceC23362e != null) {
                interfaceC23362e.mo38260a();
            }
            C1761c0 c1761c0 = this.f119313A;
            Boolean bool = Boolean.TRUE;
            c1761c0.mo9224q(bool);
            this.f119315C.mo9224q(bool);
            m122810k().setVisibility(0);
            return;
        }
        if (abstractC23358a instanceof AbstractC23358a.a) {
            InterfaceC23362e interfaceC23362e2 = this.f119323x;
            if (interfaceC23362e2 != null) {
                interfaceC23362e2.mo38265d();
            }
            C1761c0 c1761c02 = this.f119313A;
            Boolean bool2 = Boolean.FALSE;
            c1761c02.mo9224q(bool2);
            this.f119315C.mo9224q(bool2);
            m122810k().setVisibility(8);
        }
    }

    /* renamed from: r */
    private final void m129299r(EnumC23888c enumC23888c) {
        C24314b c24314b = this.f119324y;
        if (c24314b != null && !c24314b.m126967c()) {
            InterfaceC23362e interfaceC23362e = this.f119323x;
            if (interfaceC23362e != null) {
                interfaceC23362e.mo38273g(enumC23888c);
                return;
            }
            return;
        }
        if (this.f119325z.m122806b()) {
            InterfaceC23362e interfaceC23362e2 = this.f119323x;
            if (interfaceC23362e2 != null) {
                interfaceC23362e2.mo38273g(enumC23888c);
                return;
            }
            return;
        }
        AbstractC23358a.a aVar = AbstractC23358a.a.f113578a;
        this.f119325z = aVar;
        m129298p(aVar);
        InterfaceC23362e interfaceC23362e3 = this.f119323x;
        if (interfaceC23362e3 != null) {
            interfaceC23362e3.mo38273g(enumC23888c);
        }
    }

    /* renamed from: s */
    private final CameraActionButton m129300s(boolean z11, C23886a c23886a, InterfaceC1801w interfaceC1801w) {
        CameraActionButton mo122815a = this.f119318s.mo122815a(c23886a.m124962d());
        if (z11) {
            AbstractC19074t.m100206d(this, "null cannot be cast to non-null type com.zing.zalo.expandableview.button.ICameraActionButton");
            mo122815a.m43198c(c23886a, this, interfaceC1801w);
        } else {
            AbstractC19074t.m100206d(this, "null cannot be cast to non-null type com.zing.zalo.expandableview.button.ICameraActionButtonVisible");
            mo122815a.m43199d(c23886a, this, interfaceC1801w);
        }
        return mo122815a;
    }

    /* renamed from: t */
    private final CameraActionButton m129301t(InterfaceC1801w interfaceC1801w) {
        CameraActionButton m122816a = InterfaceC23360c.a.m122816a(this.f119318s, null, 1, null);
        C23886a c23886a = new C23886a(EnumC23888c.f115491x, AbstractC23322a.zds_ic_chevron_down_solid_24, null, 0, 0, Integer.valueOf(this.f119320u.mo149041e(8)), this.f119317E, 28, null);
        AbstractC19074t.m100206d(this, "null cannot be cast to non-null type com.zing.zalo.expandableview.button.CameraActionButtonListener");
        m122816a.m43197b(c23886a, this, interfaceC1801w);
        return m122816a;
    }

    @Override // p367nn.InterfaceC23891f
    /* renamed from: b */
    public LiveData mo124982b() {
        return this.f119314B;
    }

    @Override // pn.InterfaceC24870a
    /* renamed from: c */
    public void mo129265c(InterfaceC1801w interfaceC1801w) {
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        this.f119319t.mo129265c(interfaceC1801w);
    }

    @Override // pn.InterfaceC24870a
    /* renamed from: e */
    public C24314b mo129266e(EnumC24313a enumC24313a) {
        return this.f119319t.mo129266e(enumC24313a);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i11) {
        if (this.f119325z.m122807c()) {
            this.f119317E.mo9224q(Integer.valueOf(AbstractC23322a.zds_ic_chevron_up_solid_24));
        } else {
            this.f119317E.mo9224q(Integer.valueOf(AbstractC23322a.zds_ic_chevron_down_solid_24));
        }
    }

    @Override // p367nn.InterfaceC23890e
    /* renamed from: f */
    public LiveData mo124981f() {
        return this.f119316D;
    }

    @Override // p367nn.InterfaceC23889d
    /* renamed from: g */
    public void mo38273g(EnumC23888c enumC23888c) {
        AbstractC19074t.m100208f(enumC23888c, "id");
        if (b.f119326a[enumC23888c.ordinal()] == 1) {
            AbstractC23358a m122805a = this.f119325z.m122805a();
            this.f119325z = m122805a;
            m129298p(m122805a);
            return;
        }
        m129299r(enumC23888c);
    }

    @Override // pn.InterfaceC24870a
    /* renamed from: h */
    public void mo129267h(long j11) {
        this.f119319t.mo129267h(j11);
    }

    /* renamed from: o */
    public final boolean m129302o() {
        if (this.f119325z.m122807c()) {
            AbstractC23358a.a aVar = AbstractC23358a.a.f113578a;
            this.f119325z = aVar;
            m129298p(aVar);
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m129302o();
    }

    /* renamed from: q */
    public final C24314b m129303q() {
        return this.f119324y;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i11) {
    }

    /* renamed from: u */
    public final void m129304u(InterfaceC1801w interfaceC1801w, InterfaceC23362e interfaceC23362e) {
        Job m112540d;
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        AbstractC19074t.m100208f(interfaceC23362e, "handler");
        Job job = this.f119322w;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(interfaceC1801w), null, null, new c(interfaceC1801w, interfaceC23362e, this, null), 3, null);
        this.f119322w = m112540d;
    }

    /* renamed from: v */
    public final void m129305v(C24314b c24314b, InterfaceC23362e interfaceC23362e, InterfaceC1801w interfaceC1801w) {
        int paddingTop;
        int paddingEnd;
        AbstractC19074t.m100208f(c24314b, "config");
        AbstractC19074t.m100208f(interfaceC23362e, "handler");
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        this.f119324y = c24314b;
        this.f119323x = interfaceC23362e;
        m122810k().setOnClickListener(this);
        this.f119325z = AbstractC23358a.a.f113578a;
        this.f119317E.mo9224q(Integer.valueOf(AbstractC23322a.zds_ic_chevron_down_solid_24));
        C1761c0 c1761c0 = this.f119313A;
        Boolean bool = Boolean.FALSE;
        c1761c0.mo9224q(bool);
        this.f119315C.mo9224q(bool);
        m122810k().setVisibility(8);
        Integer m126969e = c24314b.m126969e();
        if (m126969e != null) {
            paddingTop = m126969e.intValue();
        } else {
            paddingTop = m122811l().getPaddingTop();
        }
        Integer m126968d = c24314b.m126968d();
        if (m126968d != null) {
            paddingEnd = m126968d.intValue();
        } else {
            paddingEnd = m122811l().getPaddingEnd();
        }
        int i11 = 0;
        m122811l().setPadding(0, paddingTop, paddingEnd, 0);
        m122811l().removeAllViews();
        m122811l().getLayoutTransition().removeTransitionListener(this);
        m122811l().getLayoutTransition().addTransitionListener(this);
        m122811l().getLayoutTransition().setDuration(250L);
        for (Object obj : c24314b.m126966b()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            m122811l().addView(m129300s(c24314b.m126965a(i11), (C23886a) obj, interfaceC1801w));
            i11 = i12;
        }
        if (c24314b.m126970f()) {
            m122811l().addView(m129301t(interfaceC1801w));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC24872c(View view, InterfaceC23360c interfaceC23360c, InterfaceC24870a interfaceC24870a, InterfaceC30225a interfaceC30225a, CoroutineDispatcher coroutineDispatcher) {
        super(view);
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(interfaceC23360c, "viewCreator");
        AbstractC19074t.m100208f(interfaceC24870a, "cameraViewController");
        AbstractC19074t.m100208f(interfaceC30225a, "resourcesProvider");
        AbstractC19074t.m100208f(coroutineDispatcher, "ioScheduler");
        this.f119318s = interfaceC23360c;
        this.f119319t = interfaceC24870a;
        this.f119320u = interfaceC30225a;
        this.f119321v = coroutineDispatcher;
        this.f119325z = AbstractC23358a.a.f113578a;
        C1761c0 c1761c0 = new C1761c0(Boolean.FALSE);
        this.f119313A = c1761c0;
        this.f119314B = c1761c0;
        C1761c0 c1761c02 = new C1761c0();
        this.f119315C = c1761c02;
        this.f119316D = c1761c02;
        this.f119317E = new C1761c0(Integer.valueOf(AbstractC23322a.zds_ic_chevron_down_solid_24));
    }
}
