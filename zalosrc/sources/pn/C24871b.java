package pn;

import android.view.View;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.InterfaceC1801w;
import androidx.lifecycle.RepeatOnLifecycleKt;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import jg0.AbstractC21247b;
import jg0.AbstractC21248c;
import jg0.AbstractC21250e;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mj0.AbstractC23322a;
import mn.AbstractC23359b;
import org.json.JSONArray;
import p173fz.C19172a;
import p367nn.C23886a;
import p367nn.EnumC23888c;
import p397on.C24314b;
import p397on.EnumC24313a;
import p663xz.InterfaceC30225a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: pn.b */
/* loaded from: classes3.dex */
public final class C24871b extends AbstractC23359b implements InterfaceC24870a {

    /* renamed from: s */
    private final C19172a f119285s;

    /* renamed from: t */
    private final InterfaceC30225a f119286t;

    /* renamed from: u */
    private final CoroutineDispatcher f119287u;

    /* renamed from: v */
    private final String f119288v;

    /* renamed from: w */
    private final String f119289w;

    /* renamed from: x */
    private final String f119290x;

    /* renamed from: y */
    private final MutableStateFlow f119291y;

    /* renamed from: z */
    private Job f119292z;

    /* renamed from: pn.b$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f119293a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f119294b;

        static {
            int[] iArr = new int[EnumC24313a.values().length];
            try {
                iArr[EnumC24313a.f117398q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24313a.f117397p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24313a.f117399r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f119293a = iArr;
            int[] iArr2 = new int[EnumC23888c.values().length];
            try {
                iArr2[EnumC23888c.f115483p.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC23888c.f115484q.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC23888c.f115485r.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC23888c.f115486s.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC23888c.f115488u.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC23888c.f115489v.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC23888c.f115490w.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC23888c.f115487t.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            f119294b = iArr2;
        }
    }

    /* renamed from: pn.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119295t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC1801w f119296u;

        /* renamed from: v */
        final /* synthetic */ C24871b f119297v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: pn.b$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f119298t;

            /* renamed from: u */
            final /* synthetic */ C24871b f119299u;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: pn.b$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32928a implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ C24871b f119300p;

                C32928a(C24871b c24871b) {
                    this.f119300p = c24871b;
                }

                /* renamed from: a */
                public final Object m129296a(int i11, Continuation continuation) {
                    this.f119300p.m122812m(AbstractC21248c.camera_editor_action_filter, i11);
                    return C24848g0.f119245a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: b */
                public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                    return m129296a(((Number) obj).intValue(), continuation);
                }
            }

            /* renamed from: pn.b$b$a$b, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32929b implements Flow {

                /* renamed from: p */
                final /* synthetic */ Flow f119301p;

                /* renamed from: pn.b$b$a$b$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C32930a implements FlowCollector {

                    /* renamed from: p */
                    final /* synthetic */ FlowCollector f119302p;

                    /* renamed from: pn.b$b$a$b$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C32931a extends AbstractC29096d {

                        /* renamed from: s */
                        /* synthetic */ Object f119303s;

                        /* renamed from: t */
                        int f119304t;

                        public C32931a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // wm0.AbstractC29093a
                        /* renamed from: o */
                        public final Object mo239o(Object obj) {
                            this.f119303s = obj;
                            this.f119304t |= Integer.MIN_VALUE;
                            return C32930a.this.mo12109b(null, this);
                        }
                    }

                    public C32930a(FlowCollector flowCollector) {
                        this.f119302p = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo12109b(Object obj, Continuation continuation) {
                        C32931a c32931a;
                        Object m142578e;
                        int i11;
                        if (continuation instanceof C32931a) {
                            c32931a = (C32931a) continuation;
                            int i12 = c32931a.f119304t;
                            if ((i12 & Integer.MIN_VALUE) != 0) {
                                c32931a.f119304t = i12 - Integer.MIN_VALUE;
                                Object obj2 = c32931a.f119303s;
                                m142578e = AbstractC28298d.m142578e();
                                i11 = c32931a.f119304t;
                                if (i11 == 0) {
                                    if (i11 == 1) {
                                        AbstractC24862s.m129228b(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    AbstractC24862s.m129228b(obj2);
                                    FlowCollector flowCollector = this.f119302p;
                                    if (((Long) obj) != null) {
                                        c32931a.f119304t = 1;
                                        if (flowCollector.mo12109b(obj, c32931a) == m142578e) {
                                            return m142578e;
                                        }
                                    }
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        c32931a = new C32931a(continuation);
                        Object obj22 = c32931a.f119303s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c32931a.f119304t;
                        if (i11 == 0) {
                        }
                        return C24848g0.f119245a;
                    }
                }

                public C32929b(Flow flow) {
                    this.f119301p = flow;
                }

                @Override // kotlinx.coroutines.flow.Flow
                /* renamed from: a */
                public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                    Object m142578e;
                    Object mo97893a = this.f119301p.mo97893a(new C32930a(flowCollector), continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (mo97893a == m142578e) {
                        return mo97893a;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* renamed from: pn.b$b$a$c */
            /* loaded from: classes3.dex */
            public static final class c implements Flow {

                /* renamed from: p */
                final /* synthetic */ Flow f119306p;

                /* renamed from: q */
                final /* synthetic */ C24871b f119307q;

                /* renamed from: pn.b$b$a$c$a, reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public static final class C32932a implements FlowCollector {

                    /* renamed from: p */
                    final /* synthetic */ FlowCollector f119308p;

                    /* renamed from: q */
                    final /* synthetic */ C24871b f119309q;

                    /* renamed from: pn.b$b$a$c$a$a, reason: collision with other inner class name */
                    /* loaded from: classes3.dex */
                    public static final class C32933a extends AbstractC29096d {

                        /* renamed from: s */
                        /* synthetic */ Object f119310s;

                        /* renamed from: t */
                        int f119311t;

                        public C32933a(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // wm0.AbstractC29093a
                        /* renamed from: o */
                        public final Object mo239o(Object obj) {
                            this.f119310s = obj;
                            this.f119311t |= Integer.MIN_VALUE;
                            return C32932a.this.mo12109b(null, this);
                        }
                    }

                    public C32932a(FlowCollector flowCollector, C24871b c24871b) {
                        this.f119308p = flowCollector;
                        this.f119309q = c24871b;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: b */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object mo12109b(Object obj, Continuation continuation) {
                        C32933a c32933a;
                        Object m142578e;
                        int i11;
                        if (continuation instanceof C32933a) {
                            c32933a = (C32933a) continuation;
                            int i12 = c32933a.f119311t;
                            if ((i12 & Integer.MIN_VALUE) != 0) {
                                c32933a.f119311t = i12 - Integer.MIN_VALUE;
                                Object obj2 = c32933a.f119310s;
                                m142578e = AbstractC28298d.m142578e();
                                i11 = c32933a.f119311t;
                                if (i11 == 0) {
                                    if (i11 == 1) {
                                        AbstractC24862s.m129228b(obj2);
                                    } else {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                } else {
                                    AbstractC24862s.m129228b(obj2);
                                    FlowCollector flowCollector = this.f119308p;
                                    Long l11 = (Long) obj;
                                    C24871b c24871b = this.f119309q;
                                    AbstractC19074t.m100205c(l11);
                                    Integer m145341c = AbstractC29094b.m145341c(c24871b.m129271E(l11.longValue()));
                                    c32933a.f119311t = 1;
                                    if (flowCollector.mo12109b(m145341c, c32933a) == m142578e) {
                                        return m142578e;
                                    }
                                }
                                return C24848g0.f119245a;
                            }
                        }
                        c32933a = new C32933a(continuation);
                        Object obj22 = c32933a.f119310s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c32933a.f119311t;
                        if (i11 == 0) {
                        }
                        return C24848g0.f119245a;
                    }
                }

                public c(Flow flow, C24871b c24871b) {
                    this.f119306p = flow;
                    this.f119307q = c24871b;
                }

                @Override // kotlinx.coroutines.flow.Flow
                /* renamed from: a */
                public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                    Object m142578e;
                    Object mo97893a = this.f119306p.mo97893a(new C32932a(flowCollector, this.f119307q), continuation);
                    m142578e = AbstractC28298d.m142578e();
                    if (mo97893a == m142578e) {
                        return mo97893a;
                    }
                    return C24848g0.f119245a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C24871b c24871b, Continuation continuation) {
                super(2, continuation);
                this.f119299u = c24871b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f119299u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f119298t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow m113267C = FlowKt.m113267C(FlowKt.m113298p(new c(new C32929b(this.f119299u.m129293I()), this.f119299u)), this.f119299u.f119287u);
                    C32928a c32928a = new C32928a(this.f119299u);
                    this.f119298t = 1;
                    if (m113267C.mo97893a(c32928a, this) == m142578e) {
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
        b(InterfaceC1801w interfaceC1801w, C24871b c24871b, Continuation continuation) {
            super(2, continuation);
            this.f119296u = interfaceC1801w;
            this.f119297v = c24871b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f119296u, this.f119297v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f119295t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC1801w interfaceC1801w = this.f119296u;
                AbstractC1785o.b bVar = AbstractC1785o.b.STARTED;
                a aVar = new a(this.f119297v, null);
                this.f119295t = 1;
                if (RepeatOnLifecycleKt.m9234b(interfaceC1801w, bVar, aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C24871b(View view, C19172a c19172a, InterfaceC30225a interfaceC30225a, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this(view, c19172a, interfaceC30225a, (i11 & 8) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }

    /* renamed from: A */
    static /* synthetic */ C23886a m129268A(C24871b c24871b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c24871b.m129291z(i11);
    }

    /* renamed from: C */
    private final C23886a m129269C(int i11) {
        return new C23886a(EnumC23888c.f115486s, AbstractC23322a.zds_ic_three_circles_blend_solid_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_filter), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: D */
    static /* synthetic */ C23886a m129270D(C24871b c24871b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c24871b.m129269C(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public final int m129271E(long j11) {
        return j11 == -10 ? AbstractC21247b.bg_oval_black_50 : AbstractC21247b.bg_oval_bright_blue;
    }

    /* renamed from: F */
    private final C23886a m129272F(int i11) {
        return new C23886a(EnumC23888c.f115489v, AbstractC23322a.zds_ic_location_solid_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_location), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: G */
    static /* synthetic */ C23886a m129273G(C24871b c24871b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c24871b.m129272F(i11);
    }

    /* renamed from: H */
    private final C24314b m129274H(EnumC24313a enumC24313a) {
        int i11;
        String m100608s;
        if (enumC24313a == null) {
            i11 = -1;
        } else {
            try {
                i11 = a.f119293a[enumC24313a.ordinal()];
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                return null;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    m100608s = null;
                } else {
                    m100608s = C19172a.m100608s(this.f119290x, null, 2, null);
                }
            } else {
                m100608s = C19172a.m100608s(this.f119289w, null, 2, null);
            }
        } else {
            m100608s = C19172a.m100608s(this.f119288v, null, 2, null);
        }
        return m129292B(m100608s);
    }

    /* renamed from: J */
    private final C23886a m129275J(int i11) {
        return new C23886a(EnumC23888c.f115490w, AbstractC23322a.zds_ic_clock_1_solid_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_speed), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: K */
    static /* synthetic */ C23886a m129276K(C24871b c24871b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c24871b.m129275J(i11);
    }

    /* renamed from: L */
    private final C23886a m129277L(int i11) {
        return new C23886a(EnumC23888c.f115484q, AbstractC23322a.zds_ic_sticker_solid_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_sticker), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: M */
    static /* synthetic */ C23886a m129278M(C24871b c24871b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c24871b.m129277L(i11);
    }

    /* renamed from: p */
    private final List m129281p() {
        List m131505m;
        m131505m = AbstractC25368s.m131505m(m129287v(16), m129278M(this, 0, 1, null), m129276K(this, 0, 1, null), m129270D(this, 0, 1, null), m129268A(this, 0, 1, null));
        return m131505m;
    }

    /* renamed from: q */
    private final List m129282q() {
        List m131505m;
        m131505m = AbstractC25368s.m131505m(m129287v(16), m129278M(this, 0, 1, null), m129289x(this, 0, 1, null), m129270D(this, 0, 1, null), m129286u(this, 0, 1, null), m129268A(this, 0, 1, null), m129273G(this, 0, 1, null));
        return m131505m;
    }

    /* renamed from: r */
    private final List m129283r() {
        List m131505m;
        m131505m = AbstractC25368s.m131505m(m129287v(16), m129278M(this, 0, 1, null), m129276K(this, 0, 1, null), m129270D(this, 0, 1, null), m129268A(this, 0, 1, null), m129273G(this, 0, 1, null));
        return m131505m;
    }

    /* renamed from: s */
    private final C23886a m129284s(EnumC23888c enumC23888c, int i11) {
        int i12;
        if (i11 == 0) {
            i12 = 16;
        } else {
            i12 = 8;
        }
        switch (a.f119294b[enumC23888c.ordinal()]) {
            case 1:
                return m129287v(i12);
            case 2:
                return m129277L(i12);
            case 3:
                return m129288w(i12);
            case 4:
                return m129269C(i12);
            case 5:
                return m129291z(i12);
            case 6:
                return m129272F(i12);
            case 7:
                return m129275J(i12);
            case 8:
                return m129285t(i12);
            default:
                return null;
        }
    }

    /* renamed from: t */
    private final C23886a m129285t(int i11) {
        return new C23886a(EnumC23888c.f115487t, AbstractC21247b.ic_blur_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_blur), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: u */
    static /* synthetic */ C23886a m129286u(C24871b c24871b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c24871b.m129285t(i11);
    }

    /* renamed from: v */
    private final C23886a m129287v(int i11) {
        return new C23886a(EnumC23888c.f115483p, AbstractC23322a.zds_ic_aa_solid_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_caption), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: w */
    private final C23886a m129288w(int i11) {
        return new C23886a(EnumC23888c.f115485r, AbstractC23322a.zds_ic_crop_rotate_solid_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_photo_crop), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: x */
    static /* synthetic */ C23886a m129289x(C24871b c24871b, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 8;
        }
        return c24871b.m129288w(i11);
    }

    /* renamed from: y */
    private final C24314b m129290y(EnumC24313a enumC24313a) {
        int i11;
        if (enumC24313a == null) {
            i11 = -1;
        } else {
            i11 = a.f119293a[enumC24313a.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                return new C24314b(m129281p(), 0, false, null, null, 30, null);
            }
            return new C24314b(m129283r(), 0, false, null, null, 30, null);
        }
        return new C24314b(m129282q(), 0, false, null, null, 30, null);
    }

    /* renamed from: z */
    private final C23886a m129291z(int i11) {
        return new C23886a(EnumC23888c.f115488u, AbstractC23322a.zds_ic_brush_solid_24, Integer.valueOf(AbstractC21250e.str_editor_overflow_doodle), 0, 0, Integer.valueOf(this.f119286t.mo149041e(i11)), null, 88, null);
    }

    /* renamed from: B */
    public final C24314b m129292B(String str) {
        List m131392y;
        EnumC23888c enumC23888c;
        C23886a m129284s;
        if (str != null && str.length() != 0) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                String[] strArr = new String[length];
                for (int i11 = 0; i11 < length; i11++) {
                    strArr[i11] = jSONArray.getString(i11);
                }
                ArrayList arrayList = new ArrayList();
                m131392y = AbstractC25358n.m131392y(strArr);
                int i12 = 0;
                for (Object obj : m131392y) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    String str2 = (String) obj;
                    EnumC23888c[] values = EnumC23888c.values();
                    int length2 = values.length;
                    int i14 = 0;
                    while (true) {
                        if (i14 < length2) {
                            enumC23888c = values[i14];
                            String name = enumC23888c.name();
                            Locale locale = Locale.ROOT;
                            String lowerCase = name.toLowerCase(locale);
                            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                            AbstractC19074t.m100205c(str2);
                            String lowerCase2 = str2.toLowerCase(locale);
                            AbstractC19074t.m100207e(lowerCase2, "toLowerCase(...)");
                            if (AbstractC19074t.m100204b(lowerCase, lowerCase2)) {
                                break;
                            }
                            i14++;
                        } else {
                            enumC23888c = null;
                            break;
                        }
                    }
                    if (enumC23888c != null && (m129284s = m129284s(enumC23888c, i12)) != null) {
                        arrayList.add(m129284s);
                    }
                    i12 = i13;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C24314b(arrayList, 0, false, null, null, 30, null);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return null;
    }

    /* renamed from: I */
    public final MutableStateFlow m129293I() {
        return this.f119291y;
    }

    @Override // pn.InterfaceC24870a
    /* renamed from: c */
    public void mo129265c(InterfaceC1801w interfaceC1801w) {
        Job m112540d;
        AbstractC19074t.m100208f(interfaceC1801w, "lifecycleOwner");
        Job job = this.f119292z;
        if (job != null) {
            Job.DefaultImpls.m112740a(job, null, 1, null);
        }
        m112540d = BuildersKt__Builders_commonKt.m112540d(AbstractC1803x.m9388a(interfaceC1801w), null, null, new b(interfaceC1801w, this, null), 3, null);
        this.f119292z = m112540d;
    }

    @Override // pn.InterfaceC24870a
    /* renamed from: e */
    public C24314b mo129266e(EnumC24313a enumC24313a) {
        C24314b m129274H = m129274H(enumC24313a);
        if (m129274H == null) {
            return m129290y(enumC24313a);
        }
        return m129274H;
    }

    @Override // pn.InterfaceC24870a
    /* renamed from: h */
    public void mo129267h(long j11) {
        this.f119291y.setValue(Long.valueOf(j11));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24871b(View view, C19172a c19172a, InterfaceC30225a interfaceC30225a, CoroutineDispatcher coroutineDispatcher) {
        super(view);
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(c19172a, "remoteConfig");
        AbstractC19074t.m100208f(interfaceC30225a, "resourcesProvider");
        AbstractC19074t.m100208f(coroutineDispatcher, "ioScheduler");
        this.f119285s = c19172a;
        this.f119286t = interfaceC30225a;
        this.f119287u = coroutineDispatcher;
        this.f119288v = "video_editor_action_config@photo_editor_action";
        this.f119289w = "video_editor_action_config@video_editor_action";
        this.f119290x = "video_editor_action_config@loop_editor_action";
        this.f119291y = StateFlowKt.m113503a(null);
    }
}
