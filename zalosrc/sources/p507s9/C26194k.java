package p507s9;

import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.AbstractC6830s;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;
import com.google.protobuf.InterfaceC6832t;

/* renamed from: s9.k */
/* loaded from: classes3.dex */
public final class C26194k extends AbstractC6826q implements InterfaceC6812j0 {
    private static final C26194k DEFAULT_INSTANCE;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC6832t sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private AbstractC6830s.d sessionVerbosity_ = AbstractC6826q.m35094v();

    /* renamed from: s9.k$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC6832t {
        a() {
        }

        @Override // com.google.protobuf.InterfaceC6832t
        /* renamed from: b */
        public EnumC26195l mo35140a(Integer num) {
            EnumC26195l m134713b = EnumC26195l.m134713b(num.intValue());
            if (m134713b == null) {
                return EnumC26195l.SESSION_VERBOSITY_NONE;
            }
            return m134713b;
        }
    }

    /* renamed from: s9.k$b */
    /* loaded from: classes3.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f124474a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124474a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124474a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124474a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124474a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124474a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124474a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124474a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.k$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ c(a aVar) {
            this();
        }

        /* renamed from: A */
        public c m134711A(EnumC26195l enumC26195l) {
            m35112u();
            ((C26194k) this.f37460q).m134704O(enumC26195l);
            return this;
        }

        /* renamed from: B */
        public c m134712B(String str) {
            m35112u();
            ((C26194k) this.f37460q).m134707T(str);
            return this;
        }

        private c() {
            super(C26194k.DEFAULT_INSTANCE);
        }
    }

    static {
        C26194k c26194k = new C26194k();
        DEFAULT_INSTANCE = c26194k;
        AbstractC6826q.m35093I(C26194k.class, c26194k);
    }

    private C26194k() {
    }

    /* renamed from: O */
    public void m134704O(EnumC26195l enumC26195l) {
        enumC26195l.getClass();
        m134705P();
        this.sessionVerbosity_.mo35121T(enumC26195l.mo35139a());
    }

    /* renamed from: P */
    private void m134705P() {
        AbstractC6830s.d dVar = this.sessionVerbosity_;
        if (!dVar.mo34738O()) {
            this.sessionVerbosity_ = AbstractC6826q.m35090D(dVar);
        }
    }

    /* renamed from: S */
    public static c m134706S() {
        return (c) DEFAULT_INSTANCE.m35103r();
    }

    /* renamed from: T */
    public void m134707T(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* renamed from: Q */
    public EnumC26195l m134708Q(int i11) {
        return (EnumC26195l) sessionVerbosity_converter_.mo35140a(Integer.valueOf(this.sessionVerbosity_.getInt(i11)));
    }

    /* renamed from: R */
    public int m134709R() {
        return this.sessionVerbosity_.size();
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        switch (b.f124474a[cVar.ordinal()]) {
            case 1:
                return new C26194k();
            case 2:
                return new c(null);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", EnumC26195l.m134714c()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26194k.class) {
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
