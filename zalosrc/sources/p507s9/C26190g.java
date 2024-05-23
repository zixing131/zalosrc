package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.AbstractC6830s;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;

/* renamed from: s9.g */
/* loaded from: classes3.dex */
public final class C26190g extends AbstractC6826q implements InterfaceC6812j0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C26190g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private C26189f gaugeMetadata_;
    private String sessionId_ = "";
    private AbstractC6830s.e cpuMetricReadings_ = AbstractC6826q.m35095w();
    private AbstractC6830s.e androidMemoryReadings_ = AbstractC6826q.m35095w();

    /* renamed from: s9.g$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124450a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124450a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124450a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124450a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124450a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124450a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124450a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124450a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.g$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134606A(C26185b c26185b) {
            m35112u();
            ((C26190g) this.f37460q).m134593Q(c26185b);
            return this;
        }

        /* renamed from: B */
        public b m134607B(C26188e c26188e) {
            m35112u();
            ((C26190g) this.f37460q).m134594R(c26188e);
            return this;
        }

        /* renamed from: C */
        public b m134608C(C26189f c26189f) {
            m35112u();
            ((C26190g) this.f37460q).m134599b0(c26189f);
            return this;
        }

        /* renamed from: D */
        public b m134609D(String str) {
            m35112u();
            ((C26190g) this.f37460q).m134600c0(str);
            return this;
        }

        private b() {
            super(C26190g.DEFAULT_INSTANCE);
        }
    }

    static {
        C26190g c26190g = new C26190g();
        DEFAULT_INSTANCE = c26190g;
        AbstractC6826q.m35093I(C26190g.class, c26190g);
    }

    private C26190g() {
    }

    /* renamed from: Q */
    public void m134593Q(C26185b c26185b) {
        c26185b.getClass();
        m134595S();
        this.androidMemoryReadings_.add(c26185b);
    }

    /* renamed from: R */
    public void m134594R(C26188e c26188e) {
        c26188e.getClass();
        m134596T();
        this.cpuMetricReadings_.add(c26188e);
    }

    /* renamed from: S */
    private void m134595S() {
        AbstractC6830s.e eVar = this.androidMemoryReadings_;
        if (!eVar.mo34738O()) {
            this.androidMemoryReadings_ = AbstractC6826q.m35091E(eVar);
        }
    }

    /* renamed from: T */
    private void m134596T() {
        AbstractC6830s.e eVar = this.cpuMetricReadings_;
        if (!eVar.mo34738O()) {
            this.cpuMetricReadings_ = AbstractC6826q.m35091E(eVar);
        }
    }

    /* renamed from: W */
    public static C26190g m134597W() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public static b m134598a0() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* renamed from: b0 */
    public void m134599b0(C26189f c26189f) {
        c26189f.getClass();
        this.gaugeMetadata_ = c26189f;
        this.bitField0_ |= 2;
    }

    /* renamed from: c0 */
    public void m134600c0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* renamed from: U */
    public int m134601U() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: V */
    public int m134602V() {
        return this.cpuMetricReadings_.size();
    }

    /* renamed from: X */
    public C26189f m134603X() {
        C26189f c26189f = this.gaugeMetadata_;
        if (c26189f == null) {
            return C26189f.m134579P();
        }
        return c26189f;
    }

    /* renamed from: Y */
    public boolean m134604Y() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: Z */
    public boolean m134605Z() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        switch (a.f124450a[cVar.ordinal()]) {
            case 1:
                return new C26190g();
            case 2:
                return new b(null);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", C26188e.class, "gaugeMetadata_", "androidMemoryReadings_", C26185b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26190g.class) {
                        try {
                            interfaceC6827q0 = PARSER;
                            if (interfaceC6827q0 == null) {
                                interfaceC6827q0 = new AbstractC6826q.b(DEFAULT_INSTANCE);
                                PARSER = interfaceC6827q0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC6827q0;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
