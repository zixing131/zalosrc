package com.google.android.play.core.review;

import android.app.PendingIntent;

/* loaded from: classes3.dex */
final class zza extends ReviewInfo {

    /* renamed from: p */
    private final PendingIntent f36344p;

    /* renamed from: q */
    private final boolean f36345q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(PendingIntent pendingIntent, boolean z11) {
        if (pendingIntent != null) {
            this.f36344p = pendingIntent;
            this.f36345q = z11;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: a */
    public final PendingIntent mo33374a() {
        return this.f36344p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.review.ReviewInfo
    /* renamed from: b */
    public final boolean mo33375b() {
        return this.f36345q;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f36344p.equals(reviewInfo.mo33374a()) && this.f36345q == reviewInfo.mo33375b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i11;
        int hashCode = (this.f36344p.hashCode() ^ 1000003) * 1000003;
        if (true != this.f36345q) {
            i11 = 1237;
        } else {
            i11 = 1231;
        }
        return hashCode ^ i11;
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f36344p.toString() + ", isNoOp=" + this.f36345q + "}";
    }
}
