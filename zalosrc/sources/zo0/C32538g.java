package zo0;

import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1780l0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p205hc.AbstractC19963b;
import p363nh.C23744a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qo0.InterfaceC25444b;
import vg.AbstractC28025b8;
import vg.C28212v6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import xm0.InterfaceC30165a;
import zm.voip.service.AbstractC32273e3;
import zm.voip.service.VoipAudioHelper;

/* renamed from: zo0.g */
/* loaded from: classes7.dex */
public final class C32538g extends AbstractC19963b implements C23744a.c {

    /* renamed from: z */
    public static final a f150283z = new a(null);

    /* renamed from: t */
    private final C23744a f150284t;

    /* renamed from: u */
    private final VoipAudioHelper f150285u;

    /* renamed from: v */
    private final MutableStateFlow f150286v;

    /* renamed from: w */
    private final StateFlow f150287w;

    /* renamed from: x */
    private MutableStateFlow f150288x;

    /* renamed from: y */
    private Job f150289y;

    /* renamed from: zo0.g$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: zo0.g$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f150290a;

        static {
            int[] iArr = new int[InterfaceC25444b.b.values().length];
            try {
                iArr[InterfaceC25444b.b.f121842q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterfaceC25444b.b.f121844s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f150290a = iArr;
        }
    }

    /* renamed from: zo0.g$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f150291t;

        /* renamed from: zo0.g$c$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C32538g f150293p;

            /* renamed from: zo0.g$c$a$a */
            /* loaded from: classes7.dex */
            public /* synthetic */ class C33073a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f150294a;

                static {
                    int[] iArr = new int[InterfaceC25444b.b.values().length];
                    try {
                        iArr[InterfaceC25444b.b.f121843r.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InterfaceC25444b.b.f121844s.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f150294a = iArr;
                }
            }

            a(C32538g c32538g) {
                this.f150293p = c32538g;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object mo12109b(InterfaceC25444b.b bVar, Continuation continuation) {
                int i11;
                if (bVar == null) {
                    i11 = -1;
                } else {
                    i11 = C33073a.f150294a[bVar.ordinal()];
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f150293p.m157514Z(false);
                        Job job = this.f150293p.f150289y;
                        if (job != null) {
                            Job.DefaultImpls.m112740a(job, null, 1, null);
                        }
                    }
                } else {
                    if (this.f150293p.m157507W()) {
                        this.f150293p.m157514Z(true);
                    }
                    Job job2 = this.f150293p.f150289y;
                    if (job2 != null) {
                        Job.DefaultImpls.m112740a(job2, null, 1, null);
                    }
                }
                return C24848g0.f119245a;
            }
        }

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f150291t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow stateFlow = C32538g.this.f150287w;
                a aVar = new a(C32538g.this);
                this.f150291t = 1;
                if (stateFlow.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C32538g(C23744a c23744a, VoipAudioHelper voipAudioHelper, C1780l0 c1780l0, AbstractC32273e3 abstractC32273e3) {
        int ordinal;
        int ordinal2;
        AbstractC19074t.m100208f(c23744a, "eventBus");
        AbstractC19074t.m100208f(voipAudioHelper, "audioHelper");
        AbstractC19074t.m100208f(c1780l0, "stateHandle");
        AbstractC19074t.m100208f(abstractC32273e3, "voipController");
        this.f150284t = c23744a;
        this.f150285u = voipAudioHelper;
        InterfaceC30165a m157522c = EnumC32540i.m157522c();
        Integer num = (Integer) c1780l0.m9318c("CALL_IS_SPLIT_MODE");
        if (num != null) {
            ordinal = num.intValue();
        } else {
            ordinal = EnumC32540i.f150295p.ordinal();
        }
        EnumC32540i enumC32540i = (EnumC32540i) m157522c.get(ordinal);
        InterfaceC30165a m157522c2 = EnumC32540i.m157522c();
        Integer num2 = (Integer) c1780l0.m9318c("CALL_IS_FILTER_ON");
        if (num2 != null) {
            ordinal2 = num2.intValue();
        } else {
            ordinal2 = EnumC32540i.f150295p.ordinal();
        }
        this.f150286v = StateFlowKt.m113503a(new C32532a(enumC32540i, (EnumC32540i) m157522c2.get(ordinal2), VoipAudioHelper.m155564P(), false, 8, null));
        StateFlow mo155837P = abstractC32273e3.mo155837P();
        AbstractC19074t.m100207e(mo155837P, "getFaceEffectFilterState(...)");
        this.f150287w = mo155837P;
        this.f150288x = StateFlowKt.m113503a(null);
    }

    /* renamed from: S */
    private final void m157506S(Object... objArr) {
        try {
            if (objArr.length == 0) {
                return;
            }
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj).intValue() == 0) {
                MutableStateFlow mutableStateFlow = this.f150286v;
                C32532a c32532a = (C32532a) mutableStateFlow.getValue();
                Object obj2 = objArr[1];
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type zm.voip.ui.views.callconfig.ConfigState");
                mutableStateFlow.setValue(C32532a.m157497b(c32532a, (EnumC32540i) obj2, null, 0, false, 14, null));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: W */
    public final boolean m157507W() {
        if (((C32532a) this.f150286v.getValue()).m157501e() == EnumC32540i.f150297r) {
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private final void m157508Y() {
        Job m112540d;
        Job job = this.f150289y;
        if (job == null || !job.mo112496c()) {
            m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new c(null), 3, null);
            this.f150289y = m112540d;
        }
    }

    /* renamed from: R */
    public final void m157509R(List list) {
        AbstractC19074t.m100208f(list, "tips");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28212v6 m141453i = AbstractC28025b8.m141453i((String) it.next());
            if (m141453i != null) {
                AbstractC19074t.m100205c(m141453i);
                if (m141453i.m142167f()) {
                    this.f150288x.setValue(m141453i);
                }
            }
        }
    }

    /* renamed from: T */
    public final void m157510T(String str) {
        AbstractC19074t.m100208f(str, "tipCat");
        AbstractC28025b8.m141442M(str);
    }

    /* renamed from: U */
    public final StateFlow m157511U() {
        return this.f150286v;
    }

    /* renamed from: V */
    public final StateFlow m157512V() {
        return this.f150288x;
    }

    /* renamed from: X */
    public final boolean m157513X() {
        if (((C32532a) this.f150286v.getValue()).m157501e() == EnumC32540i.f150299t) {
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    public final void m157514Z(boolean z11) {
        int i11;
        EnumC32540i enumC32540i;
        InterfaceC25444b.b bVar = (InterfaceC25444b.b) this.f150287w.getValue();
        if (bVar == null) {
            i11 = -1;
        } else {
            i11 = b.f150290a[bVar.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                MutableStateFlow mutableStateFlow = this.f150286v;
                C32532a c32532a = (C32532a) m157511U().getValue();
                if (z11) {
                    enumC32540i = EnumC32540i.f150299t;
                } else {
                    enumC32540i = EnumC32540i.f150298s;
                }
                mutableStateFlow.setValue(C32532a.m157497b(c32532a, null, enumC32540i, 0, false, 13, null));
                this.f150284t.m124116d(10041, 3, Integer.valueOf(z11 ? 1 : 0));
                return;
            }
            this.f150286v.setValue(C32532a.m157497b((C32532a) m157511U().getValue(), null, EnumC32540i.f150300u, 0, false, 13, null));
            return;
        }
        this.f150286v.setValue(C32532a.m157497b((C32532a) m157511U().getValue(), null, EnumC32540i.f150297r, 0, false, 13, null));
        m157508Y();
    }

    /* renamed from: a0 */
    public final void m157515a0() {
        this.f150284t.m124116d(10041, 1);
        this.f150286v.setValue(C32532a.m157497b((C32532a) m157511U().getValue(), null, null, 0, true, 7, null));
    }

    /* renamed from: b0 */
    public final void m157516b0(boolean z11) {
        EnumC32540i enumC32540i;
        MutableStateFlow mutableStateFlow = this.f150286v;
        C32532a c32532a = (C32532a) m157511U().getValue();
        if (z11) {
            enumC32540i = EnumC32540i.f150299t;
        } else {
            enumC32540i = EnumC32540i.f150298s;
        }
        mutableStateFlow.setValue(C32532a.m157497b(c32532a, enumC32540i, null, 0, true, 6, null));
        this.f150284t.m124116d(10041, 2);
    }

    /* renamed from: c0 */
    public final void m157517c0() {
        this.f150284t.m124115b(this, 10042);
        this.f150284t.m124115b(this, 40014);
        this.f150284t.m124115b(this, 10041);
    }

    /* renamed from: e0 */
    public final void m157518e0() {
        this.f150284t.m124117e(this, 10042);
        this.f150284t.m124117e(this, 40014);
        this.f150284t.m124117e(this, 10041);
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 != 10041) {
            if (i11 != 10042) {
                if (i11 == 40014) {
                    MutableStateFlow mutableStateFlow = this.f150286v;
                    mutableStateFlow.setValue(C32532a.m157497b((C32532a) mutableStateFlow.getValue(), null, null, VoipAudioHelper.m155564P(), false, 11, null));
                    return;
                }
                return;
            }
            this.f150286v.setValue(C32532a.m157497b((C32532a) m157511U().getValue(), null, null, 0, true, 7, null));
            return;
        }
        m157506S(Arrays.copyOf(objArr, objArr.length));
    }
}
