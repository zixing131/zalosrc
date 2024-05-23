package v30;

import ae.C0766k;
import ag0.AbstractC0837p0;
import android.os.Build;
import au.AbstractC2378v0;
import com.adtima.ads.ZAdsErrorCode;
import com.zing.zalo.tflite.TensorflowLiteFeature;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import d30.C17724d;
import d30.C17725e;
import d30.InterfaceC17723c;
import en0.InterfaceC18509p;
import f30.C18714c;
import f30.C18715d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g30.C19216b;
import h30.InterfaceC19750c;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import me0.AbstractC23041d2;
import mm0.AbstractC23352g;
import org.json.JSONObject;
import p268ji.C21270p;
import p272jn.C21314e;
import p272jn.EnumC21310a;
import p348mi.AbstractC23306f;
import p684yk.InterfaceC31005a;
import p716zh.C31902e9;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25376w;
import v30.C27517h;
import v30.C27519j;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: v30.h */
/* loaded from: classes5.dex */
public final class C27517h {
    public static final c Companion = new c(null);

    /* renamed from: a */
    private final InterfaceC31005a f129451a;

    /* renamed from: b */
    private final File f129452b;

    /* renamed from: c */
    private C27513d f129453c;

    /* renamed from: d */
    private boolean f129454d;

    /* renamed from: e */
    private int f129455e;

    /* renamed from: f */
    private final C27519j f129456f;

    /* renamed from: g */
    private boolean f129457g;

    /* renamed from: h */
    private boolean f129458h;

    /* renamed from: i */
    private C18714c f129459i;

    /* renamed from: j */
    private final C27519j.c f129460j;

    /* renamed from: k */
    private boolean f129461k;

    /* renamed from: l */
    private int f129462l;

    /* renamed from: m */
    private int f129463m;

    /* renamed from: n */
    private C27513d f129464n;

    /* renamed from: o */
    private int f129465o;

    /* renamed from: p */
    private final C27519j f129466p;

    /* renamed from: q */
    private final AtomicBoolean f129467q;

    /* renamed from: r */
    private final C27519j.c f129468r;

    /* renamed from: s */
    private InterfaceC17723c f129469s;

    /* renamed from: t */
    private String f129470t;

    /* renamed from: u */
    private final CoroutineScope f129471u;

    /* renamed from: v30.h$a */
    /* loaded from: classes5.dex */
    public static final class a implements C27519j.c {
        a() {
        }

        @Override // v30.C27519j.c
        /* renamed from: a */
        public void mo140719a(boolean z11) {
            C27517h.this.f129457g = true;
        }

        @Override // v30.C27519j.c
        /* renamed from: b */
        public void mo140720b() {
            C27517h.this.f129457g = false;
        }
    }

    /* renamed from: v30.h$b */
    /* loaded from: classes5.dex */
    public static final class b implements C27519j.c {
        b() {
        }

        /* renamed from: d */
        public static final void m140722d(C27517h c27517h) {
            AbstractC19074t.m100208f(c27517h, "this$0");
            c27517h.m140677S(true);
        }

        @Override // v30.C27519j.c
        /* renamed from: a */
        public void mo140719a(boolean z11) {
            if (!z11) {
                AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: v30.i
                    public /* synthetic */ RunnableC27518i() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C27517h.b.m140722d(C27517h.this);
                    }
                });
            }
        }

        @Override // v30.C27519j.c
        /* renamed from: b */
        public void mo140720b() {
        }
    }

    /* renamed from: v30.h$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C27517h m140723a() {
            return d.f129474a.m140725a();
        }

        /* renamed from: b */
        public final File m140724b() {
            return new File(C20131e.f99303a.m104958i0());
        }
    }

    /* renamed from: v30.h$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f129474a = new d();

        /* renamed from: b */
        private static final C27517h f129475b;

        static {
            InterfaceC31005a m120726x1 = AbstractC23306f.m120726x1();
            AbstractC19074t.m100207e(m120726x1, "provideStickerRepo(...)");
            f129475b = new C27517h(m120726x1, null);
        }

        private d() {
        }

        /* renamed from: a */
        public final C27517h m140725a() {
            return f129475b;
        }
    }

    /* renamed from: v30.h$e */
    /* loaded from: classes5.dex */
    public static final class e implements InterfaceC19750c {
        e() {
        }

        @Override // h30.InterfaceC19750c
        /* renamed from: a */
        public void mo103466a(File file, File file2) {
            AbstractC19074t.m100208f(file, "folder");
            AbstractC19074t.m100208f(file2, "zipFile");
            AbstractC2378v0.m12424g(file, file2);
        }
    }

    /* renamed from: v30.h$f */
    /* loaded from: classes5.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ Map f129476q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Map map) {
            super(2);
            this.f129476q = map;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a */
        public final Integer mo240pC(C31902e9 c31902e9, C31902e9 c31902e92) {
            float f11;
            Float f12 = (Float) this.f129476q.get(c31902e9.m153318j());
            float f13 = -1.0f;
            if (f12 != null) {
                f11 = f12.floatValue();
            } else {
                f11 = -1.0f;
            }
            Float f14 = (Float) this.f129476q.get(c31902e92.m153318j());
            if (f14 != null) {
                f13 = f14.floatValue();
            }
            return Integer.valueOf(Float.compare(f13, f11));
        }
    }

    /* renamed from: v30.h$g */
    /* loaded from: classes5.dex */
    public static final class g implements C27519j.c {

        /* renamed from: b */
        final /* synthetic */ String f129478b;

        g(String str) {
            this.f129478b = str;
        }

        @Override // v30.C27519j.c
        /* renamed from: a */
        public void mo140719a(boolean z11) {
            try {
                C27517h.this.m140679V(this.f129478b);
            } catch (Exception e11) {
                C27514e.m140666a("onDownloadZipComplete -> processTrainingAndSubmitResultToTrainingHost exception\n" + e11.getStackTrace());
                C27517h.this.m140675Q(this.f129478b, -14);
            }
        }

        @Override // v30.C27519j.c
        /* renamed from: b */
        public void mo140720b() {
            C27517h.this.m140675Q(this.f129478b, -10);
        }
    }

    /* renamed from: v30.h$h */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f129479t;

        /* renamed from: u */
        int f129480u;

        /* renamed from: w */
        final /* synthetic */ boolean f129482w;

        /* renamed from: v30.h$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f129483t;

            /* renamed from: u */
            final /* synthetic */ C27517h f129484u;

            /* renamed from: v */
            final /* synthetic */ boolean f129485v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C27517h c27517h, boolean z11, Continuation continuation) {
                super(2, continuation);
                this.f129484u = c27517h;
                this.f129485v = z11;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f129484u, this.f129485v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f129483t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f129484u.m140694q(this.f129485v);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: v30.h$h$b */
        /* loaded from: classes5.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f129486t;

            /* renamed from: u */
            final /* synthetic */ C27517h f129487u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C27517h c27517h, Continuation continuation) {
                super(2, continuation);
                this.f129487u = c27517h;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new b(this.f129487u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f129486t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f129487u.m140705L().mo150740d(5184000000L);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* renamed from: v30.h$h$c */
        /* loaded from: classes5.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f129488t;

            /* renamed from: u */
            final /* synthetic */ C27517h f129489u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C27517h c27517h, Continuation continuation) {
                super(2, continuation);
                this.f129489u = c27517h;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new c(this.f129489u, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f129488t == 0) {
                    AbstractC24862s.m129228b(obj);
                    C17725e m140718w = this.f129489u.m140718w();
                    if (m140718w == null) {
                        return C24848g0.f119245a;
                    }
                    this.f129489u.m140705L().mo150735H(m140718w.m93830d());
                    this.f129489u.m140705L().mo150754r(AbstractC23306f.m120579F1().mo124314i());
                    AbstractC23306f.m120729y1().m99416w();
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f129482w = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f129482w, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00ad A[RETURN] */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Job m112540d;
            Job m112540d2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f129480u;
            try {
                try {
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        m112540d2 = (Job) this.f129479t;
                        AbstractC24862s.m129228b(obj);
                        this.f129479t = null;
                        this.f129480u = 3;
                        if (m112540d2.mo112736c0(this) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (C27517h.this.f129467q.getAndSet(true)) {
                        return C24848g0.f119245a;
                    }
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    a aVar = new a(C27517h.this, this.f129482w, null);
                    this.f129480u = 1;
                    if (BuildersKt.m112534g(m112680b, aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                if (C27517h.this.f129469s != null) {
                    m112540d = BuildersKt__Builders_commonKt.m112540d(C27517h.this.f129471u, null, null, new c(C27517h.this, null), 3, null);
                    m112540d2 = BuildersKt__Builders_commonKt.m112540d(C27517h.this.f129471u, null, null, new b(C27517h.this, null), 3, null);
                    this.f129479t = m112540d2;
                    this.f129480u = 2;
                    if (m112540d.mo112736c0(this) == m142578e) {
                        return m142578e;
                    }
                    this.f129479t = null;
                    this.f129480u = 3;
                    if (m112540d2.mo112736c0(this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
                return C24848g0.f119245a;
            } finally {
                C27517h.this.f129467q.set(false);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: v30.h$i */
    /* loaded from: classes5.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f129490t;

        /* renamed from: v */
        final /* synthetic */ String f129492v;

        /* renamed from: v30.h$i$a */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC19750c {
            a() {
            }

            @Override // h30.InterfaceC19750c
            /* renamed from: a */
            public void mo103466a(File file, File file2) {
                AbstractC19074t.m100208f(file, "folder");
                AbstractC19074t.m100208f(file2, "zipFile");
                AbstractC2378v0.m12424g(file, file2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Continuation continuation) {
            super(2, continuation);
            this.f129492v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f129492v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f129490t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                String str = C27517h.this.f129452b.getPath() + "/training_sort_sticker_model";
                String str2 = str + "/model.tflite";
                String str3 = str + "/mf_config.json";
                String str4 = str + "/supported_items.json";
                if (!AbstractC23041d2.m118194A(str) || !AbstractC23041d2.m118194A(str2) || !AbstractC23041d2.m118194A(str3) || !AbstractC23041d2.m118194A(str4)) {
                    C27517h.this.m140675Q(this.f129492v, -11);
                    return C24848g0.f119245a;
                }
                Map mo150733F = C27517h.this.m140705L().mo150733F();
                List mo150756t = C27517h.this.m140705L().mo150756t();
                Map mo150731D = C27517h.this.m140705L().mo150731D(C27517h.this.f129462l);
                try {
                    C17724d c17724d = new C17724d(str2, str3, str4, 1, mo150756t, mo150733F, new a(), new C27520k());
                    this.f129490t = 1;
                    obj = c17724d.m93821o(str, mo150731D, null, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    C27517h.this.m140675Q(this.f129492v, -13);
                    return C24848g0.f119245a;
                }
            }
            String str5 = (String) obj;
            if (str5.length() > 0) {
                C27517h.this.m140676R(str5, this.f129492v);
            } else {
                C27517h.this.m140675Q(this.f129492v, -12);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C27517h(InterfaceC31005a interfaceC31005a, AbstractC19060k abstractC19060k) {
        this(interfaceC31005a);
    }

    /* renamed from: A */
    private final void m140667A() {
        C27513d c27513d = this.f129464n;
        if (c27513d != null) {
            this.f129466p.m140735g(c27513d, this.f129465o, this.f129452b, "sort_sticker_model");
        }
    }

    /* renamed from: B */
    private final void m140668B() {
        C27513d c27513d = this.f129453c;
        if (c27513d != null) {
            this.f129456f.m140735g(c27513d, this.f129455e, this.f129452b, "model");
        }
    }

    /* renamed from: D */
    private final boolean m140669D() {
        if (m140673O() && this.f129461k && m140680Z()) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    private final String m140670I(int i11) {
        switch (i11) {
            case -14:
                return "process training and submit throw exception";
            case -13:
                return "create model process training and submit throw exception";
            case -12:
                return "not exist file save result data training";
            case -11:
                return "not exist file save data training";
            case -10:
                return "download model training failed";
            case -9:
                return "data notification for training invalid (checksum_folder)";
            case ZAdsErrorCode.SDK_NO_ADS_FREQUENCY_CAPPING /* -8 */:
                return "data notification for training invalid (checksum_zip)";
            case ZAdsErrorCode.SDK_INVALID_ZONE /* -7 */:
                return "data notification for training invalid (postLink)";
            case -6:
                return "data notification for training invalid (getLink)";
            case -5:
                return "data notification for training invalid (startTime/endTime)";
            case -4:
                return "module tensorflow life runtime unavailable";
            case -3:
                return "device unsupported";
            case -2:
                return "disable feature sort sticker";
            default:
                return "unknown";
        }
    }

    /* renamed from: J */
    public static final C27517h m140671J() {
        return Companion.m140723a();
    }

    /* renamed from: M */
    private final boolean m140672M() {
        if (((TensorflowLiteFeature) C21314e.Companion.m110366a().m110361j(EnumC21310a.f103787q, "default_feature", TensorflowLiteFeature.InterfaceC10920a.class)) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private final boolean m140673O() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: P */
    private final boolean m140674P() {
        try {
            String str = this.f129452b.getPath() + "/model";
            String str2 = str + "/vocab.txt";
            String str3 = str + "/config.json";
            if (AbstractC23041d2.m118194A(str2) && AbstractC23041d2.m118194A(str3)) {
                C27510a c27510a = new C27510a(str3, AbstractC23306f.m120579F1());
                String[] m140658m = c27510a.m140658m();
                AbstractC19074t.m100207e(m140658m, "getModelNames(...)");
                if (m140658m.length == 0) {
                    return false;
                }
                C18715d c18715d = new C18715d(str2, c27510a);
                String[] strArr = new String[c27510a.m140658m().length];
                int length = c27510a.m140658m().length;
                for (int i11 = 0; i11 < length; i11++) {
                    String str4 = str + "/" + c27510a.m140658m()[i11];
                    strArr[i11] = str4;
                    if (!AbstractC23041d2.m118194A(str4)) {
                        return false;
                    }
                }
                this.f129459i = new C18714c(strArr, c18715d, -1, c27510a, new C27512c(), new C27520k());
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: Q */
    public final void m140675Q(String str, int i11) {
        new C0766k().m1807E0(str, i11, null, "");
        C27514e.m140666a("postErrorToTrainingHost -> (" + i11 + ") " + m140670I(i11));
    }

    /* renamed from: R */
    public final void m140676R(String str, String str2) {
        try {
            File file = new File(str);
            new C0766k().m1807E0(str2, 0, file, AbstractC23352g.m122788d(AbstractC23352g.m122785a(file) + this.f129470t));
            C27514e.m140666a("postSuccessFileToTrainingHost");
        } catch (Exception unused) {
            C27514e.m140666a("postSuccessFileToTrainingHost -> exception");
        }
    }

    /* renamed from: S */
    public final void m140677S(boolean z11) {
        if (m140669D()) {
            BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112679a()), null, null, new h(z11, null), 3, null);
        }
    }

    /* renamed from: T */
    static /* synthetic */ void m140678T(C27517h c27517h, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c27517h.m140677S(z11);
    }

    /* renamed from: V */
    public final void m140679V(String str) {
        BuildersKt__Builders_commonKt.m112540d(this.f129471u, null, null, new i(str, null), 3, null);
    }

    /* renamed from: Z */
    private final boolean m140680Z() {
        TensorflowLiteFeature tensorflowLiteFeature;
        if (!m140672M() || (tensorflowLiteFeature = (TensorflowLiteFeature) C21314e.Companion.m110366a().m110361j(EnumC21310a.f103787q, "default_feature", TensorflowLiteFeature.InterfaceC10920a.class)) == null) {
            return false;
        }
        return tensorflowLiteFeature.initialize();
    }

    /* renamed from: q */
    public final void m140694q(boolean z11) {
        if (this.f129469s == null || z11) {
            String str = this.f129452b.getPath() + "/sort_sticker_model";
            String str2 = str + "/model.tflite";
            String str3 = str + "/mf_config.json";
            String str4 = str + "/supported_items.json";
            if (AbstractC23041d2.m118194A(str) && AbstractC23041d2.m118194A(str2) && AbstractC23041d2.m118194A(str3) && AbstractC23041d2.m118194A(str4)) {
                try {
                    this.f129469s = new C17724d(str2, str3, str4, 1, this.f129451a.mo150756t(), this.f129451a.mo150733F(), new e(), new C27520k());
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
    }

    /* renamed from: s */
    public static final void m140695s(C27517h c27517h) {
        AbstractC19074t.m100208f(c27517h, "this$0");
        m140678T(c27517h, false, 1, null);
    }

    /* renamed from: x */
    private final void m140696x(long j11, List list) {
        Collections.shuffle(list, new Random(j11));
    }

    /* renamed from: y */
    private final void m140697y(List list, Map map) {
        AbstractC25376w.m131534w(list, new Comparator() { // from class: v30.g
            public /* synthetic */ C27516g() {
            }

            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m140698z;
                m140698z = C27517h.m140698z(InterfaceC18509p.this, obj, obj2);
                return m140698z;
            }
        });
    }

    /* renamed from: z */
    public static final int m140698z(InterfaceC18509p interfaceC18509p, Object obj, Object obj2) {
        AbstractC19074t.m100208f(interfaceC18509p, "$tmp0");
        return ((Number) interfaceC18509p.mo240pC(obj, obj2)).intValue();
    }

    /* renamed from: C */
    public final void m140699C(String str, String str2, String str3, String str4, int i11) {
        int i12;
        AbstractC19074t.m100208f(str, "fullGetLink");
        AbstractC19074t.m100208f(str2, "fullPostLink");
        AbstractC19074t.m100208f(str3, "checkSumZip");
        AbstractC19074t.m100208f(str4, "checkSumFolder");
        if (i11 != 0) {
            m140675Q(str2, i11);
            return;
        }
        if (!m140669D()) {
            if (!m140673O()) {
                i12 = -3;
            } else if (!m140680Z()) {
                i12 = -4;
            } else {
                i12 = -2;
            }
            m140675Q(str2, i12);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, str);
        jSONObject.put("checksum_zip", str3);
        jSONObject.put("checksum_folder", str4);
        try {
            new C27519j(new g(str2)).m140735g(new C27513d(jSONObject), 0, this.f129452b, "training_sort_sticker_model");
        } catch (Exception e11) {
            C27514e.m140666a("downloadTrainingModelAndDoTraining -> queue task download data model training failed\n" + e11.getStackTrace());
        }
    }

    /* renamed from: E */
    public final boolean m140700E() {
        if (m140673O() && this.f129454d && m140680Z()) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final void m140701F() {
        this.f129461k = false;
    }

    /* renamed from: G */
    public final void m140702G() {
        this.f129454d = false;
    }

    /* renamed from: H */
    public final int m140703H() {
        return this.f129465o;
    }

    /* renamed from: K */
    public final synchronized String m140704K(String str, C19216b c19216b) {
        AbstractC19074t.m100208f(str, "input");
        AbstractC19074t.m100208f(c19216b, "trackingData");
        if (!this.f129457g) {
            m140668B();
            return "";
        }
        if (!this.f129458h) {
            this.f129458h = m140674P();
        }
        if (!this.f129458h) {
            return "";
        }
        C19216b c19216b2 = new C19216b();
        C18714c c18714c = this.f129459i;
        AbstractC19074t.m100205c(c18714c);
        String m98703i = c18714c.m98703i(str, c19216b2);
        AbstractC19074t.m100207e(m98703i, "runInference(...)");
        c19216b.m100853l(this.f129455e);
        c19216b.m100857p(c19216b2.m100848g());
        c19216b.m100855n(c19216b2.m100846e());
        c19216b.m100854m(c19216b2.m100845d());
        c19216b.m100851j(c19216b2.m100842a());
        return m98703i;
    }

    /* renamed from: L */
    public final InterfaceC31005a m140705L() {
        return this.f129451a;
    }

    /* renamed from: N */
    public final void m140706N(String str) {
        C18714c c18714c = this.f129459i;
        if (c18714c != null) {
            c18714c.m98702f(str);
        }
    }

    /* renamed from: U */
    public final void m140707U(String str, List list) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(list, "targetList");
        if (list.isEmpty()) {
            return;
        }
        Map mo150744h = this.f129451a.mo150744h();
        if (!mo150744h.isEmpty() && m140669D()) {
            m140697y(list, mo150744h);
        } else {
            m140696x(Long.parseLong(str), list);
        }
    }

    /* renamed from: W */
    public final void m140708W() {
        C18714c c18714c = this.f129459i;
        if (c18714c != null) {
            c18714c.m98704k();
        }
    }

    /* renamed from: X */
    public final void m140709X(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f129464n = new C27513d(jSONObject);
        this.f129462l = jSONObject.optInt("reconstruct_range");
        this.f129463m = jSONObject.optInt("reconstruct_interval", Integer.MAX_VALUE);
        boolean z11 = true;
        if (jSONObject.optInt("enable_feature") != 1) {
            z11 = false;
        }
        this.f129461k = z11;
        this.f129465o = jSONObject.optInt("version");
        String optString = jSONObject.optString("training_salt");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f129470t = optString;
    }

    /* renamed from: Y */
    public final void m140710Y(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f129453c = new C27513d(jSONObject);
        boolean z11 = true;
        if (jSONObject.optInt("enable_feature") != 1) {
            z11 = false;
        }
        this.f129454d = z11;
        this.f129455e = jSONObject.optInt("version");
    }

    /* renamed from: n */
    public final void m140711n() {
        if (!m140669D()) {
            return;
        }
        m140667A();
    }

    /* renamed from: o */
    public final void m140712o() {
        if (m140700E()) {
            m140668B();
        }
    }

    /* renamed from: p */
    public final void m140713p() {
        C18714c c18714c = this.f129459i;
        if (c18714c != null) {
            c18714c.m98700d();
        }
    }

    /* renamed from: r */
    public final void m140714r() {
        if (AbstractC23306f.m120579F1().mo124314i() - this.f129451a.mo150757u() > this.f129463m * 86400000) {
            AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: v30.f
                public /* synthetic */ RunnableC27515f() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C27517h.m140695s(C27517h.this);
                }
            });
        }
    }

    /* renamed from: t */
    public final synchronized void m140715t(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f129462l = jSONObject.optInt("reconstruct_range");
        this.f129463m = jSONObject.optInt("reconstruct_interval", Integer.MAX_VALUE);
        boolean z11 = true;
        if (jSONObject.optInt("enable_feature") != 1) {
            z11 = false;
        }
        this.f129461k = z11;
        String optString = jSONObject.optString("training_salt");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f129470t = optString;
        int optInt = jSONObject.optInt("version");
        if (optInt > this.f129465o) {
            this.f129464n = new C27513d(jSONObject);
            this.f129465o = optInt;
        }
    }

    /* renamed from: u */
    public final synchronized void m140716u(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        int optInt = jSONObject.optInt("version");
        boolean z11 = true;
        if (jSONObject.optInt("enable_feature") != 1) {
            z11 = false;
        }
        this.f129454d = z11;
        if (optInt > this.f129455e) {
            this.f129453c = new C27513d(jSONObject);
            this.f129455e = optInt;
            this.f129457g = false;
            this.f129458h = false;
        }
    }

    /* renamed from: v */
    public final void m140717v(String str) {
        C18714c c18714c = this.f129459i;
        if (c18714c != null) {
            c18714c.m98701e(str);
        }
    }

    /* renamed from: w */
    public final C17725e m140718w() {
        C17725e mo93807a;
        Map mo150731D = this.f129451a.mo150731D(this.f129462l);
        InterfaceC17723c interfaceC17723c = this.f129469s;
        if (interfaceC17723c != null && (mo93807a = interfaceC17723c.mo93807a(mo150731D)) != null) {
            C21270p.Companion.m110161b().m110153b0(mo150731D.size(), mo93807a, this.f129465o);
            return mo93807a;
        }
        return null;
    }

    private C27517h(InterfaceC31005a interfaceC31005a) {
        this.f129451a = interfaceC31005a;
        this.f129452b = Companion.m140724b();
        this.f129455e = -1;
        this.f129463m = Integer.MAX_VALUE;
        this.f129465o = -1;
        this.f129467q = new AtomicBoolean(false);
        this.f129470t = "";
        this.f129471u = CoroutineScopeKt.m112637a(Dispatchers.m112680b());
        a aVar = new a();
        this.f129460j = aVar;
        this.f129457g = false;
        this.f129458h = false;
        this.f129456f = new C27519j(aVar);
        b bVar = new b();
        this.f129468r = bVar;
        this.f129466p = new C27519j(bVar);
    }
}
