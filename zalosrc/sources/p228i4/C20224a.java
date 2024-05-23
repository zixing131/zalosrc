package p228i4;

import p228i4.AbstractC20232e;

/* renamed from: i4.a */
/* loaded from: classes.dex */
final class C20224a extends AbstractC20232e {

    /* renamed from: b */
    private final long f100092b;

    /* renamed from: c */
    private final int f100093c;

    /* renamed from: d */
    private final int f100094d;

    /* renamed from: e */
    private final long f100095e;

    /* renamed from: f */
    private final int f100096f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i4.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC20232e.a {

        /* renamed from: a */
        private Long f100097a;

        /* renamed from: b */
        private Integer f100098b;

        /* renamed from: c */
        private Integer f100099c;

        /* renamed from: d */
        private Long f100100d;

        /* renamed from: e */
        private Integer f100101e;

        @Override // p228i4.AbstractC20232e.a
        /* renamed from: a */
        AbstractC20232e mo105707a() {
            String str = "";
            if (this.f100097a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f100098b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f100099c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f100100d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f100101e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C20224a(this.f100097a.longValue(), this.f100098b.intValue(), this.f100099c.intValue(), this.f100100d.longValue(), this.f100101e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p228i4.AbstractC20232e.a
        /* renamed from: b */
        AbstractC20232e.a mo105708b(int i11) {
            this.f100099c = Integer.valueOf(i11);
            return this;
        }

        @Override // p228i4.AbstractC20232e.a
        /* renamed from: c */
        AbstractC20232e.a mo105709c(long j11) {
            this.f100100d = Long.valueOf(j11);
            return this;
        }

        @Override // p228i4.AbstractC20232e.a
        /* renamed from: d */
        AbstractC20232e.a mo105710d(int i11) {
            this.f100098b = Integer.valueOf(i11);
            return this;
        }

        @Override // p228i4.AbstractC20232e.a
        /* renamed from: e */
        AbstractC20232e.a mo105711e(int i11) {
            this.f100101e = Integer.valueOf(i11);
            return this;
        }

        @Override // p228i4.AbstractC20232e.a
        /* renamed from: f */
        AbstractC20232e.a mo105712f(long j11) {
            this.f100097a = Long.valueOf(j11);
            return this;
        }
    }

    /* synthetic */ C20224a(long j11, int i11, int i12, long j12, int i13, a aVar) {
        this(j11, i11, i12, j12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p228i4.AbstractC20232e
    /* renamed from: b */
    public int mo105702b() {
        return this.f100094d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p228i4.AbstractC20232e
    /* renamed from: c */
    public long mo105703c() {
        return this.f100095e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p228i4.AbstractC20232e
    /* renamed from: d */
    public int mo105704d() {
        return this.f100093c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p228i4.AbstractC20232e
    /* renamed from: e */
    public int mo105705e() {
        return this.f100096f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC20232e)) {
            return false;
        }
        AbstractC20232e abstractC20232e = (AbstractC20232e) obj;
        if (this.f100092b == abstractC20232e.mo105706f() && this.f100093c == abstractC20232e.mo105704d() && this.f100094d == abstractC20232e.mo105702b() && this.f100095e == abstractC20232e.mo105703c() && this.f100096f == abstractC20232e.mo105705e()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p228i4.AbstractC20232e
    /* renamed from: f */
    public long mo105706f() {
        return this.f100092b;
    }

    public int hashCode() {
        long j11 = this.f100092b;
        int i11 = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f100093c) * 1000003) ^ this.f100094d) * 1000003;
        long j12 = this.f100095e;
        return this.f100096f ^ ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f100092b + ", loadBatchSize=" + this.f100093c + ", criticalSectionEnterTimeoutMs=" + this.f100094d + ", eventCleanUpAge=" + this.f100095e + ", maxBlobByteSizePerRow=" + this.f100096f + "}";
    }

    private C20224a(long j11, int i11, int i12, long j12, int i13) {
        this.f100092b = j11;
        this.f100093c = i11;
        this.f100094d = i12;
        this.f100095e = j12;
        this.f100096f = i13;
    }
}
