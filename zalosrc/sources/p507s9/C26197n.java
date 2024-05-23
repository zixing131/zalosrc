package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.AbstractC6830s;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;

/* renamed from: s9.n */
/* loaded from: classes3.dex */
public final class C26197n extends AbstractC6826q implements InterfaceC6812j0 {
    private static final C26197n DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC6827q0 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* renamed from: s9.n$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124484a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124484a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124484a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124484a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124484a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124484a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124484a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124484a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.n$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        private b() {
            super(C26197n.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: s9.n$c */
    /* loaded from: classes3.dex */
    public enum c implements AbstractC6830s.a {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);


        /* renamed from: s */
        private static final AbstractC6830s.b f124487s = new a();

        /* renamed from: p */
        private final int f124489p;

        /* renamed from: s9.n$c$a */
        /* loaded from: classes3.dex */
        class a implements AbstractC6830s.b {
            a() {
            }
        }

        /* renamed from: s9.n$c$b */
        /* loaded from: classes3.dex */
        public static final class b implements AbstractC6830s.c {

            /* renamed from: a */
            static final AbstractC6830s.c f124490a = new b();

            private b() {
            }
        }

        c(int i11) {
            this.f124489p = i11;
        }

        /* renamed from: b */
        public static AbstractC6830s.c m134763b() {
            return b.f124490a;
        }

        @Override // com.google.protobuf.AbstractC6830s.a
        /* renamed from: a */
        public final int mo35139a() {
            return this.f124489p;
        }
    }

    static {
        C26197n c26197n = new C26197n();
        DEFAULT_INSTANCE = c26197n;
        AbstractC6826q.m35093I(C26197n.class, c26197n);
    }

    private C26197n() {
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        switch (a.f124484a[cVar.ordinal()]) {
            case 1:
                return new C26197n();
            case 2:
                return new b(null);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", c.m134763b()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26197n.class) {
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
