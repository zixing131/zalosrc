package qo0;

import android.content.Context;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.webrtc.EglBase;
import org.webrtc.videofilter.ZVideoFilter;
import org.webrtc.videofilter.ZVideoFilterAgent;
import p097db.AbstractC17849h;
import p113dw.EnumC18074c;
import p659xv.C30208g;
import p659xv.C30212k;
import p659xv.C30213l;
import p694yv.InterfaceC31086a;
import p730zv.AbstractC32560c;
import p730zv.InterfaceC32558a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qo0.InterfaceC25444b;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qo0.a */
/* loaded from: classes7.dex */
public final class C25443a implements InterfaceC25444b {

    /* renamed from: a */
    private final InterfaceC32558a f121825a;

    /* renamed from: b */
    private final C30208g f121826b;

    /* renamed from: c */
    private final InterfaceC31086a f121827c;

    /* renamed from: d */
    private final C25448h f121828d;

    /* renamed from: e */
    private InterfaceC25444b f121829e;

    /* renamed from: f */
    private CoroutineScope f121830f;

    /* renamed from: g */
    private final MutableStateFlow f121831g;

    /* renamed from: h */
    private final MutableStateFlow f121832h;

    /* renamed from: qo0.a$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121833t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC25444b f121834u;

        /* renamed from: v */
        final /* synthetic */ C25443a f121835v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qo0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32957a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C25443a f121836p;

            C32957a(C25443a c25443a) {
                this.f121836p = c25443a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(InterfaceC25444b.b bVar, Continuation continuation) {
                this.f121836p.f121832h.setValue(bVar);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC25444b interfaceC25444b, C25443a c25443a, Continuation continuation) {
            super(2, continuation);
            this.f121834u = interfaceC25444b;
            this.f121835v = c25443a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f121834u, this.f121835v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121833t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow mo131786c = this.f121834u.mo131786c();
                C32957a c32957a = new C32957a(this.f121835v);
                this.f121833t = 1;
                if (mo131786c.mo97893a(c32957a, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qo0.a$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121837t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC25444b f121838u;

        /* renamed from: v */
        final /* synthetic */ C25443a f121839v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qo0.a$b$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C25443a f121840p;

            a(C25443a c25443a) {
                this.f121840p = c25443a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(EnumC18074c enumC18074c, Continuation continuation) {
                this.f121840p.f121831g.setValue(enumC18074c);
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC25444b interfaceC25444b, C25443a c25443a, Continuation continuation) {
            super(2, continuation);
            this.f121838u = interfaceC25444b;
            this.f121839v = c25443a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f121838u, this.f121839v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121837t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow mo96120a = this.f121838u.mo96120a();
                a aVar = new a(this.f121839v);
                this.f121837t = 1;
                if (mo96120a.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25443a(InterfaceC32558a interfaceC32558a, C30208g c30208g, InterfaceC31086a interfaceC31086a, C25448h c25448h) {
        AbstractC19074t.m100208f(interfaceC32558a, "modelFileManager");
        AbstractC19074t.m100208f(c30208g, "dynamicFeatureManager");
        AbstractC19074t.m100208f(interfaceC31086a, "mpFaceEffectConfig");
        AbstractC19074t.m100208f(c25448h, "filterConfig");
        this.f121825a = interfaceC32558a;
        this.f121826b = c30208g;
        this.f121827c = interfaceC31086a;
        this.f121828d = c25448h;
        this.f121831g = StateFlowKt.m113503a(EnumC18074c.f91494p);
        this.f121832h = StateFlowKt.m113503a(InterfaceC25444b.b.f121841p);
    }

    @Override // p113dw.InterfaceC18073b
    /* renamed from: a */
    public StateFlow mo96120a() {
        return this.f121831g;
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent
    public boolean applyFilter(byte[] bArr, int i11, int i12, int i13, long j11) {
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            return interfaceC25444b.applyFilter(bArr, i11, i12, i13, j11);
        }
        return false;
    }

    @Override // qo0.InterfaceC25444b
    /* renamed from: b */
    public boolean mo131785b() {
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            return interfaceC25444b.mo131785b();
        }
        return false;
    }

    @Override // qo0.InterfaceC25444b
    /* renamed from: c */
    public StateFlow mo131786c() {
        return this.f121832h;
    }

    @Override // qo0.InterfaceC25444b
    /* renamed from: d */
    public void mo131787d(EglBase.Context context, Context context2, String str, C25447g c25447g) {
        boolean z11;
        boolean z12;
        InterfaceC25444b interfaceC25444b;
        AbstractC19074t.m100208f(context, "eglParentContext");
        AbstractC19074t.m100208f(context2, "context");
        AbstractC19074t.m100208f(str, "modelDir");
        AbstractC19074t.m100208f(c25447g, "config");
        this.f121832h.setValue(InterfaceC25444b.b.f121841p);
        boolean m131806b = this.f121828d.m131806b();
        boolean z13 = false;
        if (c25447g.m131801a() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (AbstractC17849h.m94294c() == ZVideoFilter.SupportType.YES.getValue()) {
            z12 = true;
        } else {
            z12 = false;
        }
        InterfaceC31086a interfaceC31086a = this.f121827c;
        if (m131806b && z11 && z12) {
            z13 = true;
        }
        C30213l c30213l = new C30213l();
        C30212k mo151067c = interfaceC31086a.mo151067c();
        if (z13 && interfaceC31086a.mo151065a() && mo151067c != null && c30213l.m148999b(mo151067c, context2)) {
            if (this.f121826b.m148983b()) {
                interfaceC25444b = this.f121826b.m148985d();
            } else {
                interfaceC25444b = null;
            }
            AbstractC32560c mo157654c = this.f121825a.mo157654c();
            CoroutineScope m112637a = CoroutineScopeKt.m112637a(SupervisorKt.m112864b(null, 1, null).mo112823d0(Dispatchers.m112681c()));
            this.f121830f = m112637a;
            if (interfaceC25444b != null && (mo157654c instanceof AbstractC32560c.b)) {
                AbstractC19074t.m100205c(m112637a);
                BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new a(interfaceC25444b, this, null), 3, null);
                CoroutineScope coroutineScope = this.f121830f;
                AbstractC19074t.m100205c(coroutineScope);
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new b(interfaceC25444b, this, null), 3, null);
                this.f121829e = interfaceC25444b;
                String absolutePath = ((AbstractC32560c.b) mo157654c).m157666a().getAbsolutePath();
                AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
                interfaceC25444b.mo131787d(context, context2, absolutePath, c25447g);
            }
        }
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent
    public ZVideoFilter.FilterType filterType() {
        ZVideoFilter.FilterType filterType;
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (C25448h.m131805a()) {
            if (interfaceC25444b != null) {
                filterType = interfaceC25444b.filterType();
            } else {
                filterType = ZVideoFilter.FilterType.NATIVE;
            }
        } else {
            if (interfaceC25444b != null) {
                filterType = interfaceC25444b.filterType();
            } else {
                filterType = null;
            }
            if (filterType == null) {
                filterType = ZVideoFilter.FilterType.NONE;
            }
        }
        AbstractC19074t.m100205c(filterType);
        return filterType;
    }

    @Override // qo0.InterfaceC25444b
    public ZVideoFilter.StatusCode getStatus() {
        ZVideoFilter.StatusCode status;
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b == null || (status = interfaceC25444b.getStatus()) == null) {
            return ZVideoFilter.StatusCode.NOT_SUPPORT;
        }
        return status;
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent
    public void onFallbackSoftwareEncoder() {
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            interfaceC25444b.onFallbackSoftwareEncoder();
        }
    }

    @Override // p113dw.InterfaceC18073b
    public void release() {
        InterfaceC27315f mo9207O;
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            interfaceC25444b.release();
        }
        this.f121829e = null;
        CoroutineScope coroutineScope = this.f121830f;
        if (coroutineScope != null && (mo9207O = coroutineScope.mo9207O()) != null) {
            JobKt__JobKt.m112765d(mo9207O, null, 1, null);
        }
        this.f121830f = null;
    }

    @Override // qo0.InterfaceC25444b
    public void resetState() {
        this.f121832h.setValue(InterfaceC25444b.b.f121841p);
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            interfaceC25444b.resetState();
        }
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent
    public boolean start(ZVideoFilterAgent.FilterObserver filterObserver) {
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            return interfaceC25444b.start(filterObserver);
        }
        return false;
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent
    public boolean stop() {
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            return interfaceC25444b.stop();
        }
        return false;
    }

    @Override // org.webrtc.videofilter.ZVideoFilterAgent
    public boolean applyFilter(int i11, int i12, int i13, float[] fArr, int i14, long j11) {
        InterfaceC25444b interfaceC25444b = this.f121829e;
        if (interfaceC25444b != null) {
            return interfaceC25444b.applyFilter(i11, i12, i13, fArr, i14, j11);
        }
        return false;
    }
}
