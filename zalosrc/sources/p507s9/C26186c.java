package p507s9;

import com.google.protobuf.AbstractC6810i1;
import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.C6788b0;
import com.google.protobuf.C6791c0;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;
import java.util.Map;
import p507s9.C26184a;

/* renamed from: s9.c */
/* loaded from: classes3.dex */
public final class C26186c extends AbstractC6826q implements InterfaceC6812j0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C26186c DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC6827q0 PARSER;
    private C26184a androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C6791c0 customAttributes_ = C6791c0.m34744e();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* renamed from: s9.c$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124438a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124438a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124438a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124438a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124438a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124438a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124438a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124438a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.c$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public boolean m134557A() {
            return ((C26186c) this.f37460q).m134554V();
        }

        /* renamed from: B */
        public b m134558B(Map map) {
            m35112u();
            ((C26186c) this.f37460q).m134545T().putAll(map);
            return this;
        }

        /* renamed from: C */
        public b m134559C(C26184a.b bVar) {
            m35112u();
            ((C26186c) this.f37460q).m134548a0((C26184a) bVar.m35109q());
            return this;
        }

        /* renamed from: D */
        public b m134560D(String str) {
            m35112u();
            ((C26186c) this.f37460q).m134549b0(str);
            return this;
        }

        /* renamed from: E */
        public b m134561E(EnumC26187d enumC26187d) {
            m35112u();
            ((C26186c) this.f37460q).m134550c0(enumC26187d);
            return this;
        }

        /* renamed from: G */
        public b m134562G(String str) {
            m35112u();
            ((C26186c) this.f37460q).m134551d0(str);
            return this;
        }

        private b() {
            super(C26186c.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: s9.c$c */
    /* loaded from: classes3.dex */
    private static final class c {

        /* renamed from: a */
        static final C6788b0 f124439a;

        static {
            AbstractC6810i1.b bVar = AbstractC6810i1.b.f37337z;
            f124439a = C6788b0.m34730d(bVar, "", bVar, "");
        }
    }

    static {
        C26186c c26186c = new C26186c();
        DEFAULT_INSTANCE = c26186c;
        AbstractC6826q.m35093I(C26186c.class, c26186c);
    }

    private C26186c() {
    }

    /* renamed from: S */
    public static C26186c m134544S() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: T */
    public Map m134545T() {
        return m134546Y();
    }

    /* renamed from: Y */
    private C6791c0 m134546Y() {
        if (!this.customAttributes_.m34748i()) {
            this.customAttributes_ = this.customAttributes_.m34751n();
        }
        return this.customAttributes_;
    }

    /* renamed from: Z */
    public static b m134547Z() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* renamed from: a0 */
    public void m134548a0(C26184a c26184a) {
        c26184a.getClass();
        this.androidAppInfo_ = c26184a;
        this.bitField0_ |= 4;
    }

    /* renamed from: b0 */
    public void m134549b0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* renamed from: c0 */
    public void m134550c0(EnumC26187d enumC26187d) {
        this.applicationProcessState_ = enumC26187d.mo35139a();
        this.bitField0_ |= 8;
    }

    /* renamed from: d0 */
    public void m134551d0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    /* renamed from: R */
    public C26184a m134552R() {
        C26184a c26184a = this.androidAppInfo_;
        if (c26184a == null) {
            return C26184a.m134520P();
        }
        return c26184a;
    }

    /* renamed from: U */
    public boolean m134553U() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: V */
    public boolean m134554V() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: W */
    public boolean m134555W() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: X */
    public boolean m134556X() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        switch (a.f124438a[cVar.ordinal()]) {
            case 1:
                return new C26186c();
            case 2:
                return new b(null);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", EnumC26187d.m134563b(), "customAttributes_", c.f124439a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26186c.class) {
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
