package p703z3;

import java.util.Arrays;
import p703z3.AbstractC31207l;

/* renamed from: z3.f */
/* loaded from: classes.dex */
final class C31201f extends AbstractC31207l {

    /* renamed from: a */
    private final long f144128a;

    /* renamed from: b */
    private final Integer f144129b;

    /* renamed from: c */
    private final long f144130c;

    /* renamed from: d */
    private final byte[] f144131d;

    /* renamed from: e */
    private final String f144132e;

    /* renamed from: f */
    private final long f144133f;

    /* renamed from: g */
    private final AbstractC31210o f144134g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z3.f$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC31207l.a {

        /* renamed from: a */
        private Long f144135a;

        /* renamed from: b */
        private Integer f144136b;

        /* renamed from: c */
        private Long f144137c;

        /* renamed from: d */
        private byte[] f144138d;

        /* renamed from: e */
        private String f144139e;

        /* renamed from: f */
        private Long f144140f;

        /* renamed from: g */
        private AbstractC31210o f144141g;

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: a */
        public AbstractC31207l mo152048a() {
            String str = "";
            if (this.f144135a == null) {
                str = " eventTimeMs";
            }
            if (this.f144137c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f144140f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C31201f(this.f144135a.longValue(), this.f144136b, this.f144137c.longValue(), this.f144138d, this.f144139e, this.f144140f.longValue(), this.f144141g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: b */
        public AbstractC31207l.a mo152049b(Integer num) {
            this.f144136b = num;
            return this;
        }

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: c */
        public AbstractC31207l.a mo152050c(long j11) {
            this.f144135a = Long.valueOf(j11);
            return this;
        }

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: d */
        public AbstractC31207l.a mo152051d(long j11) {
            this.f144137c = Long.valueOf(j11);
            return this;
        }

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: e */
        public AbstractC31207l.a mo152052e(AbstractC31210o abstractC31210o) {
            this.f144141g = abstractC31210o;
            return this;
        }

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: f */
        AbstractC31207l.a mo152053f(byte[] bArr) {
            this.f144138d = bArr;
            return this;
        }

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: g */
        AbstractC31207l.a mo152054g(String str) {
            this.f144139e = str;
            return this;
        }

        @Override // p703z3.AbstractC31207l.a
        /* renamed from: h */
        public AbstractC31207l.a mo152055h(long j11) {
            this.f144140f = Long.valueOf(j11);
            return this;
        }
    }

    /* synthetic */ C31201f(long j11, Integer num, long j12, byte[] bArr, String str, long j13, AbstractC31210o abstractC31210o, a aVar) {
        this(j11, num, j12, bArr, str, j13, abstractC31210o);
    }

    @Override // p703z3.AbstractC31207l
    /* renamed from: b */
    public Integer mo152041b() {
        return this.f144129b;
    }

    @Override // p703z3.AbstractC31207l
    /* renamed from: c */
    public long mo152042c() {
        return this.f144128a;
    }

    @Override // p703z3.AbstractC31207l
    /* renamed from: d */
    public long mo152043d() {
        return this.f144130c;
    }

    @Override // p703z3.AbstractC31207l
    /* renamed from: e */
    public AbstractC31210o mo152044e() {
        return this.f144134g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] mo152045f;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC31207l)) {
            return false;
        }
        AbstractC31207l abstractC31207l = (AbstractC31207l) obj;
        if (this.f144128a == abstractC31207l.mo152042c() && ((num = this.f144129b) != null ? num.equals(abstractC31207l.mo152041b()) : abstractC31207l.mo152041b() == null) && this.f144130c == abstractC31207l.mo152043d()) {
            byte[] bArr = this.f144131d;
            if (abstractC31207l instanceof C31201f) {
                mo152045f = ((C31201f) abstractC31207l).f144131d;
            } else {
                mo152045f = abstractC31207l.mo152045f();
            }
            if (Arrays.equals(bArr, mo152045f) && ((str = this.f144132e) != null ? str.equals(abstractC31207l.mo152046g()) : abstractC31207l.mo152046g() == null) && this.f144133f == abstractC31207l.mo152047h()) {
                AbstractC31210o abstractC31210o = this.f144134g;
                if (abstractC31210o == null) {
                    if (abstractC31207l.mo152044e() == null) {
                        return true;
                    }
                } else if (abstractC31210o.equals(abstractC31207l.mo152044e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p703z3.AbstractC31207l
    /* renamed from: f */
    public byte[] mo152045f() {
        return this.f144131d;
    }

    @Override // p703z3.AbstractC31207l
    /* renamed from: g */
    public String mo152046g() {
        return this.f144132e;
    }

    @Override // p703z3.AbstractC31207l
    /* renamed from: h */
    public long mo152047h() {
        return this.f144133f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j11 = this.f144128a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f144129b;
        int i12 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j12 = this.f144130c;
        int hashCode3 = (((((i11 ^ hashCode) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f144131d)) * 1000003;
        String str = this.f144132e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j13 = this.f144133f;
        int i13 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003;
        AbstractC31210o abstractC31210o = this.f144134g;
        if (abstractC31210o != null) {
            i12 = abstractC31210o.hashCode();
        }
        return i13 ^ i12;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f144128a + ", eventCode=" + this.f144129b + ", eventUptimeMs=" + this.f144130c + ", sourceExtension=" + Arrays.toString(this.f144131d) + ", sourceExtensionJsonProto3=" + this.f144132e + ", timezoneOffsetSeconds=" + this.f144133f + ", networkConnectionInfo=" + this.f144134g + "}";
    }

    private C31201f(long j11, Integer num, long j12, byte[] bArr, String str, long j13, AbstractC31210o abstractC31210o) {
        this.f144128a = j11;
        this.f144129b = num;
        this.f144130c = j12;
        this.f144131d = bArr;
        this.f144132e = str;
        this.f144133f = j13;
        this.f144134g = abstractC31210o;
    }
}
