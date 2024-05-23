package rd0;

import androidx.work.AbstractC2147g0;

/* renamed from: rd0.s */
/* loaded from: classes4.dex */
public final class C25753s extends AbstractC25751q {

    /* renamed from: a */
    private final long f122917a;

    public C25753s(long j11) {
        super(null);
        this.f122917a = j11;
    }

    /* renamed from: a */
    public final long m132890a() {
        return this.f122917a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25753s) && this.f122917a == ((C25753s) obj).f122917a;
    }

    public int hashCode() {
        return AbstractC2147g0.m11521a(this.f122917a);
    }

    public String toString() {
        return "UploadSocialHTTPPhotoResponse(photoId=" + this.f122917a + ")";
    }
}
