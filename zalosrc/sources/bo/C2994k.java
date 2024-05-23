package bo;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import fn0.AbstractC19074t;

/* renamed from: bo.k */
/* loaded from: classes4.dex */
public final class C2994k {

    /* renamed from: a */
    private ProfilePreviewAlbumItem f11827a;

    /* renamed from: b */
    private boolean f11828b;

    /* renamed from: c */
    private int f11829c;

    public C2994k(ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, int i11) {
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
        this.f11827a = profilePreviewAlbumItem;
        this.f11828b = z11;
        this.f11829c = i11;
    }

    /* renamed from: a */
    public final int m14198a() {
        return this.f11829c;
    }

    /* renamed from: b */
    public final ProfilePreviewAlbumItem m14199b() {
        return this.f11827a;
    }

    /* renamed from: c */
    public final boolean m14200c() {
        return this.f11828b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2994k)) {
            return false;
        }
        C2994k c2994k = (C2994k) obj;
        return AbstractC19074t.m100204b(this.f11827a, c2994k.f11827a) && this.f11828b == c2994k.f11828b && this.f11829c == c2994k.f11829c;
    }

    public int hashCode() {
        return (((this.f11827a.hashCode() * 31) + AbstractC2144f.m11520a(this.f11828b)) * 31) + this.f11829c;
    }

    public String toString() {
        return "AlbumRowPreviewItemSquareData(profilePreviewAlbumItem=" + this.f11827a + ", isShowPrivacyIcon=" + this.f11828b + ", layoutType=" + this.f11829c + ")";
    }
}
