package com.google.firebase.installations;

import com.google.firebase.installations.AbstractC6587f;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes3.dex */
final class C6582a extends AbstractC6587f {

    /* renamed from: a */
    private final String f36519a;

    /* renamed from: b */
    private final long f36520b;

    /* renamed from: c */
    private final long f36521c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6587f.a {

        /* renamed from: a */
        private String f36522a;

        /* renamed from: b */
        private Long f36523b;

        /* renamed from: c */
        private Long f36524c;

        @Override // com.google.firebase.installations.AbstractC6587f.a
        /* renamed from: a */
        public AbstractC6587f mo33630a() {
            String str = "";
            if (this.f36522a == null) {
                str = " token";
            }
            if (this.f36523b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f36524c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6582a(this.f36522a, this.f36523b.longValue(), this.f36524c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.AbstractC6587f.a
        /* renamed from: b */
        public AbstractC6587f.a mo33631b(String str) {
            if (str != null) {
                this.f36522a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.AbstractC6587f.a
        /* renamed from: c */
        public AbstractC6587f.a mo33632c(long j11) {
            this.f36524c = Long.valueOf(j11);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC6587f.a
        /* renamed from: d */
        public AbstractC6587f.a mo33633d(long j11) {
            this.f36523b = Long.valueOf(j11);
            return this;
        }
    }

    /* synthetic */ C6582a(String str, long j11, long j12, a aVar) {
        this(str, j11, j12);
    }

    @Override // com.google.firebase.installations.AbstractC6587f
    /* renamed from: b */
    public String mo33627b() {
        return this.f36519a;
    }

    @Override // com.google.firebase.installations.AbstractC6587f
    /* renamed from: c */
    public long mo33628c() {
        return this.f36521c;
    }

    @Override // com.google.firebase.installations.AbstractC6587f
    /* renamed from: d */
    public long mo33629d() {
        return this.f36520b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6587f)) {
            return false;
        }
        AbstractC6587f abstractC6587f = (AbstractC6587f) obj;
        if (this.f36519a.equals(abstractC6587f.mo33627b()) && this.f36520b == abstractC6587f.mo33629d() && this.f36521c == abstractC6587f.mo33628c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f36519a.hashCode() ^ 1000003) * 1000003;
        long j11 = this.f36520b;
        long j12 = this.f36521c;
        return ((hashCode ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f36519a + ", tokenExpirationTimestamp=" + this.f36520b + ", tokenCreationTimestamp=" + this.f36521c + "}";
    }

    private C6582a(String str, long j11, long j12) {
        this.f36519a = str;
        this.f36520b = j11;
        this.f36521c = j12;
    }
}
