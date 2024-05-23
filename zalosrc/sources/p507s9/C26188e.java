package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;

/* renamed from: s9.e */
/* loaded from: classes3.dex */
public final class C26188e extends AbstractC6826q implements InterfaceC6812j0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C26188e DEFAULT_INSTANCE;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* renamed from: s9.e$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124448a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124448a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124448a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124448a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124448a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124448a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124448a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124448a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134572A(long j11) {
            m35112u();
            ((C26188e) this.f37460q).m134569Q(j11);
            return this;
        }

        /* renamed from: B */
        public b m134573B(long j11) {
            m35112u();
            ((C26188e) this.f37460q).m134570R(j11);
            return this;
        }

        /* renamed from: C */
        public b m134574C(long j11) {
            m35112u();
            ((C26188e) this.f37460q).m134571S(j11);
            return this;
        }

        private b() {
            super(C26188e.DEFAULT_INSTANCE);
        }
    }

    static {
        C26188e c26188e = new C26188e();
        DEFAULT_INSTANCE = c26188e;
        AbstractC6826q.m35093I(C26188e.class, c26188e);
    }

    private C26188e() {
    }

    /* renamed from: P */
    public static b m134568P() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m134569Q(long j11) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public void m134570R(long j11) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m134571S(long j11) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j11;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f124448a[cVar.ordinal()]) {
            case 1:
                return new C26188e();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26188e.class) {
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
