package p507s9;

import com.google.protobuf.AbstractC6784a;
import com.google.protobuf.AbstractC6810i1;
import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.AbstractC6830s;
import com.google.protobuf.C6788b0;
import com.google.protobuf.C6791c0;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;
import java.util.List;

/* renamed from: s9.h */
/* loaded from: classes3.dex */
public final class C26191h extends AbstractC6826q implements InterfaceC6812j0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final C26191h DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private C6791c0 customAttributes_ = C6791c0.m34744e();
    private String url_ = "";
    private String responseContentType_ = "";
    private AbstractC6830s.e perfSessions_ = AbstractC6826q.m35095w();

    /* renamed from: s9.h$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124451a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124451a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124451a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124451a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124451a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124451a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124451a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124451a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.h$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134659A(Iterable iterable) {
            m35112u();
            ((C26191h) this.f37460q).m134632Z(iterable);
            return this;
        }

        /* renamed from: B */
        public b m134660B() {
            m35112u();
            ((C26191h) this.f37460q).m134633a0();
            return this;
        }

        /* renamed from: C */
        public long m134661C() {
            return ((C26191h) this.f37460q).m134649m0();
        }

        /* renamed from: D */
        public boolean m134662D() {
            return ((C26191h) this.f37460q).m134651o0();
        }

        /* renamed from: E */
        public boolean m134663E() {
            return ((C26191h) this.f37460q).m134653q0();
        }

        /* renamed from: G */
        public boolean m134664G() {
            return ((C26191h) this.f37460q).m134657u0();
        }

        /* renamed from: H */
        public b m134665H(long j11) {
            m35112u();
            ((C26191h) this.f37460q).m134637x0(j11);
            return this;
        }

        /* renamed from: I */
        public b m134666I(d dVar) {
            m35112u();
            ((C26191h) this.f37460q).m134638y0(dVar);
            return this;
        }

        /* renamed from: L */
        public b m134667L(int i11) {
            m35112u();
            ((C26191h) this.f37460q).m134639z0(i11);
            return this;
        }

        /* renamed from: N */
        public b m134668N(e eVar) {
            m35112u();
            ((C26191h) this.f37460q).m134610A0(eVar);
            return this;
        }

        /* renamed from: O */
        public b m134669O(long j11) {
            m35112u();
            ((C26191h) this.f37460q).m134611B0(j11);
            return this;
        }

        /* renamed from: P */
        public b m134670P(String str) {
            m35112u();
            ((C26191h) this.f37460q).m134612C0(str);
            return this;
        }

        /* renamed from: R */
        public b m134671R(long j11) {
            m35112u();
            ((C26191h) this.f37460q).m134613D0(j11);
            return this;
        }

        /* renamed from: S */
        public b m134672S(long j11) {
            m35112u();
            ((C26191h) this.f37460q).m134614E0(j11);
            return this;
        }

        /* renamed from: T */
        public b m134673T(long j11) {
            m35112u();
            ((C26191h) this.f37460q).m134615F0(j11);
            return this;
        }

        /* renamed from: U */
        public b m134674U(long j11) {
            m35112u();
            ((C26191h) this.f37460q).m134616G0(j11);
            return this;
        }

        /* renamed from: V */
        public b m134675V(String str) {
            m35112u();
            ((C26191h) this.f37460q).m134617H0(str);
            return this;
        }

        private b() {
            super(C26191h.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: s9.h$c */
    /* loaded from: classes3.dex */
    private static final class c {

        /* renamed from: a */
        static final C6788b0 f124452a;

        static {
            AbstractC6810i1.b bVar = AbstractC6810i1.b.f37337z;
            f124452a = C6788b0.m34730d(bVar, "", bVar, "");
        }
    }

    /* renamed from: s9.h$d */
    /* loaded from: classes3.dex */
    public enum d implements AbstractC6830s.a {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);


        /* renamed from: A */
        private static final AbstractC6830s.b f124453A = new a();

        /* renamed from: p */
        private final int f124465p;

        /* renamed from: s9.h$d$a */
        /* loaded from: classes3.dex */
        class a implements AbstractC6830s.b {
            a() {
            }
        }

        /* renamed from: s9.h$d$b */
        /* loaded from: classes3.dex */
        public static final class b implements AbstractC6830s.c {

            /* renamed from: a */
            static final AbstractC6830s.c f124466a = new b();

            private b() {
            }
        }

        d(int i11) {
            this.f124465p = i11;
        }

        /* renamed from: b */
        public static d m134676b(int i11) {
            switch (i11) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        /* renamed from: c */
        public static AbstractC6830s.c m134677c() {
            return b.f124466a;
        }

        @Override // com.google.protobuf.AbstractC6830s.a
        /* renamed from: a */
        public final int mo35139a() {
            return this.f124465p;
        }
    }

    /* renamed from: s9.h$e */
    /* loaded from: classes3.dex */
    public enum e implements AbstractC6830s.a {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);


        /* renamed from: s */
        private static final AbstractC6830s.b f124469s = new a();

        /* renamed from: p */
        private final int f124471p;

        /* renamed from: s9.h$e$a */
        /* loaded from: classes3.dex */
        class a implements AbstractC6830s.b {
            a() {
            }
        }

        /* renamed from: s9.h$e$b */
        /* loaded from: classes3.dex */
        public static final class b implements AbstractC6830s.c {

            /* renamed from: a */
            static final AbstractC6830s.c f124472a = new b();

            private b() {
            }
        }

        e(int i11) {
            this.f124471p = i11;
        }

        /* renamed from: b */
        public static AbstractC6830s.c m134678b() {
            return b.f124472a;
        }

        @Override // com.google.protobuf.AbstractC6830s.a
        /* renamed from: a */
        public final int mo35139a() {
            return this.f124471p;
        }
    }

    static {
        C26191h c26191h = new C26191h();
        DEFAULT_INSTANCE = c26191h;
        AbstractC6826q.m35093I(C26191h.class, c26191h);
    }

    private C26191h() {
    }

    /* renamed from: A0 */
    public void m134610A0(e eVar) {
        this.networkClientErrorReason_ = eVar.mo35139a();
        this.bitField0_ |= 16;
    }

    /* renamed from: B0 */
    public void m134611B0(long j11) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j11;
    }

    /* renamed from: C0 */
    public void m134612C0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* renamed from: D0 */
    public void m134613D0(long j11) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j11;
    }

    /* renamed from: E0 */
    public void m134614E0(long j11) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j11;
    }

    /* renamed from: F0 */
    public void m134615F0(long j11) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j11;
    }

    /* renamed from: G0 */
    public void m134616G0(long j11) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j11;
    }

    /* renamed from: H0 */
    public void m134617H0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* renamed from: Z */
    public void m134632Z(Iterable iterable) {
        m134634b0();
        AbstractC6784a.m34710d(iterable, this.perfSessions_);
    }

    /* renamed from: a0 */
    public void m134633a0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m134635d0().m134645i0();
    }

    /* renamed from: b0 */
    private void m134634b0() {
        AbstractC6830s.e eVar = this.perfSessions_;
        if (!eVar.mo34738O()) {
            this.perfSessions_ = AbstractC6826q.m35091E(eVar);
        }
    }

    /* renamed from: d0 */
    public static C26191h m134635d0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: w0 */
    public static b m134636w0() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* renamed from: x0 */
    public void m134637x0(long j11) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j11;
    }

    /* renamed from: y0 */
    public void m134638y0(d dVar) {
        this.httpMethod_ = dVar.mo35139a();
        this.bitField0_ |= 2;
    }

    /* renamed from: z0 */
    public void m134639z0(int i11) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i11;
    }

    /* renamed from: c0 */
    public long m134640c0() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: e0 */
    public d m134641e0() {
        d m134676b = d.m134676b(this.httpMethod_);
        if (m134676b == null) {
            return d.HTTP_METHOD_UNKNOWN;
        }
        return m134676b;
    }

    /* renamed from: f0 */
    public int m134642f0() {
        return this.httpResponseCode_;
    }

    /* renamed from: g0 */
    public List m134643g0() {
        return this.perfSessions_;
    }

    /* renamed from: h0 */
    public long m134644h0() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: i0 */
    public String m134645i0() {
        return this.responseContentType_;
    }

    /* renamed from: j0 */
    public long m134646j0() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: k0 */
    public long m134647k0() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: l0 */
    public long m134648l0() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: m0 */
    public long m134649m0() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: n0 */
    public String m134650n0() {
        return this.url_;
    }

    /* renamed from: o0 */
    public boolean m134651o0() {
        return (this.bitField0_ & 128) != 0;
    }

    /* renamed from: p0 */
    public boolean m134652p0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: q0 */
    public boolean m134653q0() {
        return (this.bitField0_ & 32) != 0;
    }

    /* renamed from: r0 */
    public boolean m134654r0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: s0 */
    public boolean m134655s0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: t0 */
    public boolean m134656t0() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        switch (a.f124451a[cVar.ordinal()]) {
            case 1:
                return new C26191h();
            case 2:
                return new b(null);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.m134677c(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.m134678b(), "customAttributes_", c.f124452a, "perfSessions_", C26194k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26191h.class) {
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

    /* renamed from: u0 */
    public boolean m134657u0() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* renamed from: v0 */
    public boolean m134658v0() {
        return (this.bitField0_ & 512) != 0;
    }
}
