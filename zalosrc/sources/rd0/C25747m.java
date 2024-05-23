package rd0;

import androidx.work.AbstractC2147g0;

/* renamed from: rd0.m */
/* loaded from: classes4.dex */
public final class C25747m extends AbstractC25751q {

    /* renamed from: a */
    private final long f122895a;

    public C25747m(long j11) {
        super(null);
        this.f122895a = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25747m) && this.f122895a == ((C25747m) obj).f122895a;
    }

    public int hashCode() {
        return AbstractC2147g0.m11521a(this.f122895a);
    }

    public String toString() {
        return "UploadHTTPFeedPhotoSingleResponse(photoId=" + this.f122895a + ")";
    }
}
