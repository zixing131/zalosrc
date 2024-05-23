package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.InterfaceC6827q0;
import p507s9.C26186c;

/* renamed from: s9.i */
/* loaded from: classes3.dex */
public final class C26192i extends AbstractC6826q implements InterfaceC26193j {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final C26192i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C26186c applicationInfo_;
    private int bitField0_;
    private C26190g gaugeMetric_;
    private C26191h networkRequestMetric_;
    private C26196m traceMetric_;
    private C26197n transportInfo_;

    /* renamed from: s9.i$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124473a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124473a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124473a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124473a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124473a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124473a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124473a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124473a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.i$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC26193j {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134697A(C26186c.b bVar) {
            m35112u();
            ((C26192i) this.f37460q).m134685T((C26186c) bVar.m35109q());
            return this;
        }

        /* renamed from: B */
        public b m134698B(C26190g c26190g) {
            m35112u();
            ((C26192i) this.f37460q).m134686U(c26190g);
            return this;
        }

        /* renamed from: C */
        public b m134699C(C26191h c26191h) {
            m35112u();
            ((C26192i) this.f37460q).m134687V(c26191h);
            return this;
        }

        /* renamed from: D */
        public b m134700D(C26196m c26196m) {
            m35112u();
            ((C26192i) this.f37460q).m134688W(c26196m);
            return this;
        }

        @Override // p507s9.InterfaceC26193j
        /* renamed from: a */
        public boolean mo134691a() {
            return ((C26192i) this.f37460q).mo134691a();
        }

        @Override // p507s9.InterfaceC26193j
        /* renamed from: c */
        public boolean mo134692c() {
            return ((C26192i) this.f37460q).mo134692c();
        }

        @Override // p507s9.InterfaceC26193j
        /* renamed from: e */
        public C26191h mo134693e() {
            return ((C26192i) this.f37460q).mo134693e();
        }

        @Override // p507s9.InterfaceC26193j
        /* renamed from: i */
        public boolean mo134694i() {
            return ((C26192i) this.f37460q).mo134694i();
        }

        @Override // p507s9.InterfaceC26193j
        /* renamed from: j */
        public C26196m mo134695j() {
            return ((C26192i) this.f37460q).mo134695j();
        }

        @Override // p507s9.InterfaceC26193j
        /* renamed from: k */
        public C26190g mo134696k() {
            return ((C26192i) this.f37460q).mo134696k();
        }

        private b() {
            super(C26192i.DEFAULT_INSTANCE);
        }
    }

    static {
        C26192i c26192i = new C26192i();
        DEFAULT_INSTANCE = c26192i;
        AbstractC6826q.m35093I(C26192i.class, c26192i);
    }

    private C26192i() {
    }

    /* renamed from: S */
    public static b m134684S() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m134685T(C26186c c26186c) {
        c26186c.getClass();
        this.applicationInfo_ = c26186c;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m134686U(C26190g c26190g) {
        c26190g.getClass();
        this.gaugeMetric_ = c26190g;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m134687V(C26191h c26191h) {
        c26191h.getClass();
        this.networkRequestMetric_ = c26191h;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m134688W(C26196m c26196m) {
        c26196m.getClass();
        this.traceMetric_ = c26196m;
        this.bitField0_ |= 2;
    }

    /* renamed from: Q */
    public C26186c m134689Q() {
        C26186c c26186c = this.applicationInfo_;
        if (c26186c == null) {
            return C26186c.m134544S();
        }
        return c26186c;
    }

    /* renamed from: R */
    public boolean m134690R() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // p507s9.InterfaceC26193j
    /* renamed from: a */
    public boolean mo134691a() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p507s9.InterfaceC26193j
    /* renamed from: c */
    public boolean mo134692c() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p507s9.InterfaceC26193j
    /* renamed from: e */
    public C26191h mo134693e() {
        C26191h c26191h = this.networkRequestMetric_;
        if (c26191h == null) {
            return C26191h.m134635d0();
        }
        return c26191h;
    }

    @Override // p507s9.InterfaceC26193j
    /* renamed from: i */
    public boolean mo134694i() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p507s9.InterfaceC26193j
    /* renamed from: j */
    public C26196m mo134695j() {
        C26196m c26196m = this.traceMetric_;
        if (c26196m == null) {
            return C26196m.m134731f0();
        }
        return c26196m;
    }

    @Override // p507s9.InterfaceC26193j
    /* renamed from: k */
    public C26190g mo134696k() {
        C26190g c26190g = this.gaugeMetric_;
        if (c26190g == null) {
            return C26190g.m134597W();
        }
        return c26190g;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f124473a[cVar.ordinal()]) {
            case 1:
                return new C26192i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26192i.class) {
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
