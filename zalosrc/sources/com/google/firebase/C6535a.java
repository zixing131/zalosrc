package com.google.firebase;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.a */
/* loaded from: classes.dex */
public final class C6535a extends AbstractC6596l {

    /* renamed from: a */
    private final long f36377a;

    /* renamed from: b */
    private final long f36378b;

    /* renamed from: c */
    private final long f36379c;

    public C6535a(long j11, long j12, long j13) {
        this.f36377a = j11;
        this.f36378b = j12;
        this.f36379c = j13;
    }

    @Override // com.google.firebase.AbstractC6596l
    /* renamed from: b */
    public long mo33458b() {
        return this.f36378b;
    }

    @Override // com.google.firebase.AbstractC6596l
    /* renamed from: c */
    public long mo33459c() {
        return this.f36377a;
    }

    @Override // com.google.firebase.AbstractC6596l
    /* renamed from: d */
    public long mo33460d() {
        return this.f36379c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6596l)) {
            return false;
        }
        AbstractC6596l abstractC6596l = (AbstractC6596l) obj;
        if (this.f36377a == abstractC6596l.mo33459c() && this.f36378b == abstractC6596l.mo33458b() && this.f36379c == abstractC6596l.mo33460d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f36377a;
        long j12 = this.f36378b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        long j13 = this.f36379c;
        return ((int) ((j13 >>> 32) ^ j13)) ^ i11;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f36377a + ", elapsedRealtime=" + this.f36378b + ", uptimeMillis=" + this.f36379c + "}";
    }
}
