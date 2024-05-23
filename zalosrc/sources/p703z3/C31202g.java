package p703z3;

import java.util.List;
import p703z3.AbstractC31208m;

/* renamed from: z3.g */
/* loaded from: classes.dex */
final class C31202g extends AbstractC31208m {

    /* renamed from: a */
    private final long f144142a;

    /* renamed from: b */
    private final long f144143b;

    /* renamed from: c */
    private final AbstractC31206k f144144c;

    /* renamed from: d */
    private final Integer f144145d;

    /* renamed from: e */
    private final String f144146e;

    /* renamed from: f */
    private final List f144147f;

    /* renamed from: g */
    private final EnumC31211p f144148g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z3.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC31208m.a {

        /* renamed from: a */
        private Long f144149a;

        /* renamed from: b */
        private Long f144150b;

        /* renamed from: c */
        private AbstractC31206k f144151c;

        /* renamed from: d */
        private Integer f144152d;

        /* renamed from: e */
        private String f144153e;

        /* renamed from: f */
        private List f144154f;

        /* renamed from: g */
        private EnumC31211p f144155g;

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: a */
        public AbstractC31208m mo152063a() {
            String str = "";
            if (this.f144149a == null) {
                str = " requestTimeMs";
            }
            if (this.f144150b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C31202g(this.f144149a.longValue(), this.f144150b.longValue(), this.f144151c, this.f144152d, this.f144153e, this.f144154f, this.f144155g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: b */
        public AbstractC31208m.a mo152064b(AbstractC31206k abstractC31206k) {
            this.f144151c = abstractC31206k;
            return this;
        }

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: c */
        public AbstractC31208m.a mo152065c(List list) {
            this.f144154f = list;
            return this;
        }

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: d */
        AbstractC31208m.a mo152066d(Integer num) {
            this.f144152d = num;
            return this;
        }

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: e */
        AbstractC31208m.a mo152067e(String str) {
            this.f144153e = str;
            return this;
        }

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: f */
        public AbstractC31208m.a mo152068f(EnumC31211p enumC31211p) {
            this.f144155g = enumC31211p;
            return this;
        }

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: g */
        public AbstractC31208m.a mo152069g(long j11) {
            this.f144149a = Long.valueOf(j11);
            return this;
        }

        @Override // p703z3.AbstractC31208m.a
        /* renamed from: h */
        public AbstractC31208m.a mo152070h(long j11) {
            this.f144150b = Long.valueOf(j11);
            return this;
        }
    }

    /* synthetic */ C31202g(long j11, long j12, AbstractC31206k abstractC31206k, Integer num, String str, List list, EnumC31211p enumC31211p, a aVar) {
        this(j11, j12, abstractC31206k, num, str, list, enumC31211p);
    }

    @Override // p703z3.AbstractC31208m
    /* renamed from: b */
    public AbstractC31206k mo152056b() {
        return this.f144144c;
    }

    @Override // p703z3.AbstractC31208m
    /* renamed from: c */
    public List mo152057c() {
        return this.f144147f;
    }

    @Override // p703z3.AbstractC31208m
    /* renamed from: d */
    public Integer mo152058d() {
        return this.f144145d;
    }

    @Override // p703z3.AbstractC31208m
    /* renamed from: e */
    public String mo152059e() {
        return this.f144146e;
    }

    public boolean equals(Object obj) {
        AbstractC31206k abstractC31206k;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC31208m)) {
            return false;
        }
        AbstractC31208m abstractC31208m = (AbstractC31208m) obj;
        if (this.f144142a == abstractC31208m.mo152061g() && this.f144143b == abstractC31208m.mo152062h() && ((abstractC31206k = this.f144144c) != null ? abstractC31206k.equals(abstractC31208m.mo152056b()) : abstractC31208m.mo152056b() == null) && ((num = this.f144145d) != null ? num.equals(abstractC31208m.mo152058d()) : abstractC31208m.mo152058d() == null) && ((str = this.f144146e) != null ? str.equals(abstractC31208m.mo152059e()) : abstractC31208m.mo152059e() == null) && ((list = this.f144147f) != null ? list.equals(abstractC31208m.mo152057c()) : abstractC31208m.mo152057c() == null)) {
            EnumC31211p enumC31211p = this.f144148g;
            if (enumC31211p == null) {
                if (abstractC31208m.mo152060f() == null) {
                    return true;
                }
            } else if (enumC31211p.equals(abstractC31208m.mo152060f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p703z3.AbstractC31208m
    /* renamed from: f */
    public EnumC31211p mo152060f() {
        return this.f144148g;
    }

    @Override // p703z3.AbstractC31208m
    /* renamed from: g */
    public long mo152061g() {
        return this.f144142a;
    }

    @Override // p703z3.AbstractC31208m
    /* renamed from: h */
    public long mo152062h() {
        return this.f144143b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j11 = this.f144142a;
        long j12 = this.f144143b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC31206k abstractC31206k = this.f144144c;
        int i12 = 0;
        if (abstractC31206k == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC31206k.hashCode();
        }
        int i13 = (i11 ^ hashCode) * 1000003;
        Integer num = this.f144145d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i14 = (i13 ^ hashCode2) * 1000003;
        String str = this.f144146e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i15 = (i14 ^ hashCode3) * 1000003;
        List list = this.f144147f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i16 = (i15 ^ hashCode4) * 1000003;
        EnumC31211p enumC31211p = this.f144148g;
        if (enumC31211p != null) {
            i12 = enumC31211p.hashCode();
        }
        return i16 ^ i12;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f144142a + ", requestUptimeMs=" + this.f144143b + ", clientInfo=" + this.f144144c + ", logSource=" + this.f144145d + ", logSourceName=" + this.f144146e + ", logEvents=" + this.f144147f + ", qosTier=" + this.f144148g + "}";
    }

    private C31202g(long j11, long j12, AbstractC31206k abstractC31206k, Integer num, String str, List list, EnumC31211p enumC31211p) {
        this.f144142a = j11;
        this.f144143b = j12;
        this.f144144c = abstractC31206k;
        this.f144145d = num;
        this.f144146e = str;
        this.f144147f = list;
        this.f144148g = enumC31211p;
    }
}
