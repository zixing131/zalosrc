package p010a4;

import java.util.Map;
import p010a4.AbstractC0116i;

/* renamed from: a4.b */
/* loaded from: classes.dex */
final class C0109b extends AbstractC0116i {

    /* renamed from: a */
    private final String f650a;

    /* renamed from: b */
    private final Integer f651b;

    /* renamed from: c */
    private final C0115h f652c;

    /* renamed from: d */
    private final long f653d;

    /* renamed from: e */
    private final long f654e;

    /* renamed from: f */
    private final Map f655f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a4.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0116i.a {

        /* renamed from: a */
        private String f656a;

        /* renamed from: b */
        private Integer f657b;

        /* renamed from: c */
        private C0115h f658c;

        /* renamed from: d */
        private Long f659d;

        /* renamed from: e */
        private Long f660e;

        /* renamed from: f */
        private Map f661f;

        @Override // p010a4.AbstractC0116i.a
        /* renamed from: d */
        public AbstractC0116i mo494d() {
            String str = "";
            if (this.f656a == null) {
                str = " transportName";
            }
            if (this.f658c == null) {
                str = str + " encodedPayload";
            }
            if (this.f659d == null) {
                str = str + " eventMillis";
            }
            if (this.f660e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f661f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C0109b(this.f656a, this.f657b, this.f658c, this.f659d.longValue(), this.f660e.longValue(), this.f661f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p010a4.AbstractC0116i.a
        /* renamed from: e */
        protected Map mo495e() {
            Map map = this.f661f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p010a4.AbstractC0116i.a
        /* renamed from: f */
        public AbstractC0116i.a mo496f(Map map) {
            if (map != null) {
                this.f661f = map;
                return this;
            }
            throw new NullPointerException("Null autoMetadata");
        }

        @Override // p010a4.AbstractC0116i.a
        /* renamed from: g */
        public AbstractC0116i.a mo497g(Integer num) {
            this.f657b = num;
            return this;
        }

        @Override // p010a4.AbstractC0116i.a
        /* renamed from: h */
        public AbstractC0116i.a mo498h(C0115h c0115h) {
            if (c0115h != null) {
                this.f658c = c0115h;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        @Override // p010a4.AbstractC0116i.a
        /* renamed from: i */
        public AbstractC0116i.a mo499i(long j11) {
            this.f659d = Long.valueOf(j11);
            return this;
        }

        @Override // p010a4.AbstractC0116i.a
        /* renamed from: j */
        public AbstractC0116i.a mo500j(String str) {
            if (str != null) {
                this.f656a = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        @Override // p010a4.AbstractC0116i.a
        /* renamed from: k */
        public AbstractC0116i.a mo501k(long j11) {
            this.f660e = Long.valueOf(j11);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p010a4.AbstractC0116i
    /* renamed from: c */
    public Map mo488c() {
        return this.f655f;
    }

    @Override // p010a4.AbstractC0116i
    /* renamed from: d */
    public Integer mo489d() {
        return this.f651b;
    }

    @Override // p010a4.AbstractC0116i
    /* renamed from: e */
    public C0115h mo490e() {
        return this.f652c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0116i)) {
            return false;
        }
        AbstractC0116i abstractC0116i = (AbstractC0116i) obj;
        if (this.f650a.equals(abstractC0116i.mo492j()) && ((num = this.f651b) != null ? num.equals(abstractC0116i.mo489d()) : abstractC0116i.mo489d() == null) && this.f652c.equals(abstractC0116i.mo490e()) && this.f653d == abstractC0116i.mo491f() && this.f654e == abstractC0116i.mo493k() && this.f655f.equals(abstractC0116i.mo488c())) {
            return true;
        }
        return false;
    }

    @Override // p010a4.AbstractC0116i
    /* renamed from: f */
    public long mo491f() {
        return this.f653d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f650a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f651b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f652c.hashCode()) * 1000003;
        long j11 = this.f653d;
        int i11 = (hashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f654e;
        return ((i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.f655f.hashCode();
    }

    @Override // p010a4.AbstractC0116i
    /* renamed from: j */
    public String mo492j() {
        return this.f650a;
    }

    @Override // p010a4.AbstractC0116i
    /* renamed from: k */
    public long mo493k() {
        return this.f654e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f650a + ", code=" + this.f651b + ", encodedPayload=" + this.f652c + ", eventMillis=" + this.f653d + ", uptimeMillis=" + this.f654e + ", autoMetadata=" + this.f655f + "}";
    }

    private C0109b(String str, Integer num, C0115h c0115h, long j11, long j12, Map map) {
        this.f650a = str;
        this.f651b = num;
        this.f652c = c0115h;
        this.f653d = j11;
        this.f654e = j12;
        this.f655f = map;
    }
}
