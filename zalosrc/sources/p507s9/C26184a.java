package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;

/* renamed from: s9.a */
/* loaded from: classes3.dex */
public final class C26184a extends AbstractC6826q implements InterfaceC6812j0 {
    private static final C26184a DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: s9.a$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124436a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124436a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124436a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124436a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124436a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124436a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124436a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124436a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134527A(String str) {
            m35112u();
            ((C26184a) this.f37460q).m134522T(str);
            return this;
        }

        /* renamed from: B */
        public b m134528B(String str) {
            m35112u();
            ((C26184a) this.f37460q).m134523U(str);
            return this;
        }

        /* renamed from: C */
        public b m134529C(String str) {
            m35112u();
            ((C26184a) this.f37460q).m134524V(str);
            return this;
        }

        private b() {
            super(C26184a.DEFAULT_INSTANCE);
        }
    }

    static {
        C26184a c26184a = new C26184a();
        DEFAULT_INSTANCE = c26184a;
        AbstractC6826q.m35093I(C26184a.class, c26184a);
    }

    private C26184a() {
    }

    /* renamed from: P */
    public static C26184a m134520P() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: S */
    public static b m134521S() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m134522T(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m134523U(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m134524V(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    /* renamed from: Q */
    public boolean m134525Q() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: R */
    public boolean m134526R() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f124436a[cVar.ordinal()]) {
            case 1:
                return new C26184a();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26184a.class) {
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
