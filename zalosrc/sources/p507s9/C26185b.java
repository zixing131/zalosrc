package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;

/* renamed from: s9.b */
/* loaded from: classes3.dex */
public final class C26185b extends AbstractC6826q implements InterfaceC6812j0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C26185b DEFAULT_INSTANCE;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* renamed from: s9.b$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124437a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124437a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124437a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124437a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124437a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124437a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124437a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124437a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134536A(long j11) {
            m35112u();
            ((C26185b) this.f37460q).m134534P(j11);
            return this;
        }

        /* renamed from: B */
        public b m134537B(int i11) {
            m35112u();
            ((C26185b) this.f37460q).m134535Q(i11);
            return this;
        }

        private b() {
            super(C26185b.DEFAULT_INSTANCE);
        }
    }

    static {
        C26185b c26185b = new C26185b();
        DEFAULT_INSTANCE = c26185b;
        AbstractC6826q.m35093I(C26185b.class, c26185b);
    }

    private C26185b() {
    }

    /* renamed from: O */
    public static b m134533O() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public void m134534P(long j11) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public void m134535Q(int i11) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i11;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f124437a[cVar.ordinal()]) {
            case 1:
                return new C26185b();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26185b.class) {
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
