package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;

/* renamed from: s9.f */
/* loaded from: classes3.dex */
public final class C26189f extends AbstractC6826q implements InterfaceC6812j0 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final C26189f DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* renamed from: s9.f$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124449a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124449a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124449a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124449a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124449a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124449a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124449a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124449a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.f$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134585A(int i11) {
            m35112u();
            ((C26189f) this.f37460q).m134581S(i11);
            return this;
        }

        /* renamed from: B */
        public b m134586B(int i11) {
            m35112u();
            ((C26189f) this.f37460q).m134582T(i11);
            return this;
        }

        /* renamed from: C */
        public b m134587C(int i11) {
            m35112u();
            ((C26189f) this.f37460q).m134583U(i11);
            return this;
        }

        private b() {
            super(C26189f.DEFAULT_INSTANCE);
        }
    }

    static {
        C26189f c26189f = new C26189f();
        DEFAULT_INSTANCE = c26189f;
        AbstractC6826q.m35093I(C26189f.class, c26189f);
    }

    private C26189f() {
    }

    /* renamed from: P */
    public static C26189f m134579P() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: R */
    public static b m134580R() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public void m134581S(int i11) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m134582T(int i11) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m134583U(int i11) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i11;
    }

    /* renamed from: Q */
    public boolean m134584Q() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f124449a[cVar.ordinal()]) {
            case 1:
                return new C26189f();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26189f.class) {
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
