package p197h4;

import java.util.Set;
import p197h4.AbstractC19756f;

/* renamed from: h4.c */
/* loaded from: classes.dex */
final class C19753c extends AbstractC19756f.b {

    /* renamed from: a */
    private final long f97854a;

    /* renamed from: b */
    private final long f97855b;

    /* renamed from: c */
    private final Set f97856c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h4.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC19756f.b.a {

        /* renamed from: a */
        private Long f97857a;

        /* renamed from: b */
        private Long f97858b;

        /* renamed from: c */
        private Set f97859c;

        @Override // p197h4.AbstractC19756f.b.a
        /* renamed from: a */
        public AbstractC19756f.b mo103472a() {
            String str = "";
            if (this.f97857a == null) {
                str = " delta";
            }
            if (this.f97858b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f97859c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C19753c(this.f97857a.longValue(), this.f97858b.longValue(), this.f97859c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p197h4.AbstractC19756f.b.a
        /* renamed from: b */
        public AbstractC19756f.b.a mo103473b(long j11) {
            this.f97857a = Long.valueOf(j11);
            return this;
        }

        @Override // p197h4.AbstractC19756f.b.a
        /* renamed from: c */
        public AbstractC19756f.b.a mo103474c(Set set) {
            if (set != null) {
                this.f97859c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // p197h4.AbstractC19756f.b.a
        /* renamed from: d */
        public AbstractC19756f.b.a mo103475d(long j11) {
            this.f97858b = Long.valueOf(j11);
            return this;
        }
    }

    /* synthetic */ C19753c(long j11, long j12, Set set, a aVar) {
        this(j11, j12, set);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p197h4.AbstractC19756f.b
    /* renamed from: b */
    public long mo103469b() {
        return this.f97854a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p197h4.AbstractC19756f.b
    /* renamed from: c */
    public Set mo103470c() {
        return this.f97856c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p197h4.AbstractC19756f.b
    /* renamed from: d */
    public long mo103471d() {
        return this.f97855b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC19756f.b)) {
            return false;
        }
        AbstractC19756f.b bVar = (AbstractC19756f.b) obj;
        if (this.f97854a == bVar.mo103469b() && this.f97855b == bVar.mo103471d() && this.f97856c.equals(bVar.mo103470c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f97854a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f97855b;
        return this.f97856c.hashCode() ^ ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f97854a + ", maxAllowedDelay=" + this.f97855b + ", flags=" + this.f97856c + "}";
    }

    private C19753c(long j11, long j12, Set set) {
        this.f97854a = j11;
        this.f97855b = j12;
        this.f97856c = set;
    }
}
