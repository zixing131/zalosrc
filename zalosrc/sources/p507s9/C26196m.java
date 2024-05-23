package p507s9;

import com.google.protobuf.AbstractC6784a;
import com.google.protobuf.AbstractC6810i1;
import com.google.protobuf.AbstractC6826q;
import com.google.protobuf.AbstractC6830s;
import com.google.protobuf.C6788b0;
import com.google.protobuf.C6791c0;
import com.google.protobuf.InterfaceC6812j0;
import com.google.protobuf.InterfaceC6827q0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: s9.m */
/* loaded from: classes3.dex */
public final class C26196m extends AbstractC6826q implements InterfaceC6812j0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final C26196m DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC6827q0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private C6791c0 counters_ = C6791c0.m34744e();
    private C6791c0 customAttributes_ = C6791c0.m34744e();
    private String name_ = "";
    private AbstractC6830s.e subtraces_ = AbstractC6826q.m35095w();
    private AbstractC6830s.e perfSessions_ = AbstractC6826q.m35095w();

    /* renamed from: s9.m$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f124481a;

        static {
            int[] iArr = new int[AbstractC6826q.c.values().length];
            f124481a = iArr;
            try {
                iArr[AbstractC6826q.c.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f124481a[AbstractC6826q.c.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f124481a[AbstractC6826q.c.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f124481a[AbstractC6826q.c.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f124481a[AbstractC6826q.c.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f124481a[AbstractC6826q.c.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f124481a[AbstractC6826q.c.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s9.m$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6826q.a implements InterfaceC6812j0 {
        /* synthetic */ b(a aVar) {
            this();
        }

        /* renamed from: A */
        public b m134751A(Iterable iterable) {
            m35112u();
            ((C26196m) this.f37460q).m134725V(iterable);
            return this;
        }

        /* renamed from: B */
        public b m134752B(Iterable iterable) {
            m35112u();
            ((C26196m) this.f37460q).m134726W(iterable);
            return this;
        }

        /* renamed from: C */
        public b m134753C(C26194k c26194k) {
            m35112u();
            ((C26196m) this.f37460q).m134727X(c26194k);
            return this;
        }

        /* renamed from: D */
        public b m134754D(C26196m c26196m) {
            m35112u();
            ((C26196m) this.f37460q).m134728Y(c26196m);
            return this;
        }

        /* renamed from: E */
        public b m134755E(Map map) {
            m35112u();
            ((C26196m) this.f37460q).m134732h0().putAll(map);
            return this;
        }

        /* renamed from: G */
        public b m134756G(Map map) {
            m35112u();
            ((C26196m) this.f37460q).m134733i0().putAll(map);
            return this;
        }

        /* renamed from: H */
        public b m134757H(String str, long j11) {
            str.getClass();
            m35112u();
            ((C26196m) this.f37460q).m134732h0().put(str, Long.valueOf(j11));
            return this;
        }

        /* renamed from: I */
        public b m134758I(String str, String str2) {
            str.getClass();
            str2.getClass();
            m35112u();
            ((C26196m) this.f37460q).m134733i0().put(str, str2);
            return this;
        }

        /* renamed from: L */
        public b m134759L(long j11) {
            m35112u();
            ((C26196m) this.f37460q).m134739s0(j11);
            return this;
        }

        /* renamed from: N */
        public b m134760N(long j11) {
            m35112u();
            ((C26196m) this.f37460q).m134740t0(j11);
            return this;
        }

        /* renamed from: O */
        public b m134761O(String str) {
            m35112u();
            ((C26196m) this.f37460q).m134741u0(str);
            return this;
        }

        private b() {
            super(C26196m.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: s9.m$c */
    /* loaded from: classes3.dex */
    private static final class c {

        /* renamed from: a */
        static final C6788b0 f124482a = C6788b0.m34730d(AbstractC6810i1.b.f37337z, "", AbstractC6810i1.b.f37331t, 0L);
    }

    /* renamed from: s9.m$d */
    /* loaded from: classes3.dex */
    private static final class d {

        /* renamed from: a */
        static final C6788b0 f124483a;

        static {
            AbstractC6810i1.b bVar = AbstractC6810i1.b.f37337z;
            f124483a = C6788b0.m34730d(bVar, "", bVar, "");
        }
    }

    static {
        C26196m c26196m = new C26196m();
        DEFAULT_INSTANCE = c26196m;
        AbstractC6826q.m35093I(C26196m.class, c26196m);
    }

    private C26196m() {
    }

    /* renamed from: V */
    public void m134725V(Iterable iterable) {
        m134729a0();
        AbstractC6784a.m34710d(iterable, this.perfSessions_);
    }

    /* renamed from: W */
    public void m134726W(Iterable iterable) {
        m134730b0();
        AbstractC6784a.m34710d(iterable, this.subtraces_);
    }

    /* renamed from: X */
    public void m134727X(C26194k c26194k) {
        c26194k.getClass();
        m134729a0();
        this.perfSessions_.add(c26194k);
    }

    /* renamed from: Y */
    public void m134728Y(C26196m c26196m) {
        c26196m.getClass();
        m134730b0();
        this.subtraces_.add(c26196m);
    }

    /* renamed from: a0 */
    private void m134729a0() {
        AbstractC6830s.e eVar = this.perfSessions_;
        if (!eVar.mo34738O()) {
            this.perfSessions_ = AbstractC6826q.m35091E(eVar);
        }
    }

    /* renamed from: b0 */
    private void m134730b0() {
        AbstractC6830s.e eVar = this.subtraces_;
        if (!eVar.mo34738O()) {
            this.subtraces_ = AbstractC6826q.m35091E(eVar);
        }
    }

    /* renamed from: f0 */
    public static C26196m m134731f0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: h0 */
    public Map m134732h0() {
        return m134736p0();
    }

    /* renamed from: i0 */
    public Map m134733i0() {
        return m134737q0();
    }

    /* renamed from: n0 */
    private C6791c0 m134734n0() {
        return this.counters_;
    }

    /* renamed from: o0 */
    private C6791c0 m134735o0() {
        return this.customAttributes_;
    }

    /* renamed from: p0 */
    private C6791c0 m134736p0() {
        if (!this.counters_.m34748i()) {
            this.counters_ = this.counters_.m34751n();
        }
        return this.counters_;
    }

    /* renamed from: q0 */
    private C6791c0 m134737q0() {
        if (!this.customAttributes_.m34748i()) {
            this.customAttributes_ = this.customAttributes_.m34751n();
        }
        return this.customAttributes_;
    }

    /* renamed from: r0 */
    public static b m134738r0() {
        return (b) DEFAULT_INSTANCE.m35103r();
    }

    /* renamed from: s0 */
    public void m134739s0(long j11) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j11;
    }

    /* renamed from: t0 */
    public void m134740t0(long j11) {
        this.bitField0_ |= 8;
        this.durationUs_ = j11;
    }

    /* renamed from: u0 */
    public void m134741u0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* renamed from: Z */
    public boolean m134742Z(String str) {
        str.getClass();
        return m134735o0().containsKey(str);
    }

    /* renamed from: c0 */
    public int m134743c0() {
        return m134734n0().size();
    }

    /* renamed from: d0 */
    public Map m134744d0() {
        return Collections.unmodifiableMap(m134734n0());
    }

    /* renamed from: e0 */
    public Map m134745e0() {
        return Collections.unmodifiableMap(m134735o0());
    }

    /* renamed from: g0 */
    public long m134746g0() {
        return this.durationUs_;
    }

    /* renamed from: j0 */
    public String m134747j0() {
        return this.name_;
    }

    /* renamed from: k0 */
    public List m134748k0() {
        return this.perfSessions_;
    }

    /* renamed from: l0 */
    public List m134749l0() {
        return this.subtraces_;
    }

    /* renamed from: m0 */
    public boolean m134750m0() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC6826q
    /* renamed from: u */
    protected final Object mo35106u(AbstractC6826q.c cVar, Object obj, Object obj2) {
        switch (a.f124481a[cVar.ordinal()]) {
            case 1:
                return new C26196m();
            case 2:
                return new b(null);
            case 3:
                return AbstractC6826q.m35092H(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f124482a, "subtraces_", C26196m.class, "customAttributes_", d.f124483a, "perfSessions_", C26194k.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC6827q0 interfaceC6827q0 = PARSER;
                if (interfaceC6827q0 == null) {
                    synchronized (C26196m.class) {
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
