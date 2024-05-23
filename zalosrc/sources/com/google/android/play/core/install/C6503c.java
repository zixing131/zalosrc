package com.google.android.play.core.install;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.install.c */
/* loaded from: classes3.dex */
public final class C6503c extends AbstractC6501a {

    /* renamed from: a */
    private final int f36324a;

    /* renamed from: b */
    private final long f36325b;

    /* renamed from: c */
    private final long f36326c;

    /* renamed from: d */
    private final int f36327d;

    /* renamed from: e */
    private final String f36328e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6503c(int i11, long j11, long j12, int i12, String str) {
        this.f36324a = i11;
        this.f36325b = j11;
        this.f36326c = j12;
        this.f36327d = i12;
        if (str != null) {
            this.f36328e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    @Override // com.google.android.play.core.install.AbstractC6501a
    /* renamed from: a */
    public final long mo33369a() {
        return this.f36325b;
    }

    @Override // com.google.android.play.core.install.AbstractC6501a
    /* renamed from: b */
    public final int mo33370b() {
        return this.f36327d;
    }

    @Override // com.google.android.play.core.install.AbstractC6501a
    /* renamed from: c */
    public final int mo33371c() {
        return this.f36324a;
    }

    @Override // com.google.android.play.core.install.AbstractC6501a
    /* renamed from: d */
    public final String mo33372d() {
        return this.f36328e;
    }

    @Override // com.google.android.play.core.install.AbstractC6501a
    /* renamed from: e */
    public final long mo33373e() {
        return this.f36326c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6501a) {
            AbstractC6501a abstractC6501a = (AbstractC6501a) obj;
            if (this.f36324a == abstractC6501a.mo33371c() && this.f36325b == abstractC6501a.mo33369a() && this.f36326c == abstractC6501a.mo33373e() && this.f36327d == abstractC6501a.mo33370b() && this.f36328e.equals(abstractC6501a.mo33372d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11 = this.f36324a ^ 1000003;
        long j11 = this.f36325b;
        long j12 = this.f36326c;
        return (((((((i11 * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f36327d) * 1000003) ^ this.f36328e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f36324a + ", bytesDownloaded=" + this.f36325b + ", totalBytesToDownload=" + this.f36326c + ", installErrorCode=" + this.f36327d + ", packageName=" + this.f36328e + "}";
    }
}
