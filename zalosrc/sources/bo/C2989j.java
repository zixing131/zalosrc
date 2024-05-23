package bo;

import androidx.work.AbstractC2144f;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import fn0.AbstractC19074t;

/* renamed from: bo.j */
/* loaded from: classes4.dex */
public final class C2989j {

    /* renamed from: a */
    private ProfilePreviewAlbumItem f11807a;

    /* renamed from: b */
    private boolean f11808b;

    /* renamed from: c */
    private String f11809c;

    /* renamed from: d */
    private String f11810d;

    /* renamed from: e */
    private String f11811e;

    /* renamed from: f */
    private final boolean f11812f;

    /* renamed from: g */
    private int f11813g;

    public C2989j(ProfilePreviewAlbumItem profilePreviewAlbumItem, boolean z11, String str, String str2, String str3, boolean z12) {
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "previewAlbumItem");
        AbstractC19074t.m100208f(str, "thumbURL");
        AbstractC19074t.m100208f(str2, "title");
        AbstractC19074t.m100208f(str3, "desc");
        this.f11807a = profilePreviewAlbumItem;
        this.f11808b = z11;
        this.f11809c = str;
        this.f11810d = str2;
        this.f11811e = str3;
        this.f11812f = z12;
    }

    /* renamed from: a */
    public final String m14171a() {
        return this.f11811e;
    }

    /* renamed from: b */
    public final ProfilePreviewAlbumItem m14172b() {
        return this.f11807a;
    }

    /* renamed from: c */
    public final int m14173c() {
        return this.f11813g;
    }

    /* renamed from: d */
    public final String m14174d() {
        return this.f11809c;
    }

    /* renamed from: e */
    public final String m14175e() {
        return this.f11810d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2989j)) {
            return false;
        }
        C2989j c2989j = (C2989j) obj;
        return AbstractC19074t.m100204b(this.f11807a, c2989j.f11807a) && this.f11808b == c2989j.f11808b && AbstractC19074t.m100204b(this.f11809c, c2989j.f11809c) && AbstractC19074t.m100204b(this.f11810d, c2989j.f11810d) && AbstractC19074t.m100204b(this.f11811e, c2989j.f11811e) && this.f11812f == c2989j.f11812f;
    }

    /* renamed from: f */
    public final boolean m14176f() {
        return this.f11808b;
    }

    /* renamed from: g */
    public final boolean m14177g() {
        return this.f11812f;
    }

    /* renamed from: h */
    public final void m14178h(int i11) {
        this.f11813g = i11;
    }

    public int hashCode() {
        return (((((((((this.f11807a.hashCode() * 31) + AbstractC2144f.m11520a(this.f11808b)) * 31) + this.f11809c.hashCode()) * 31) + this.f11810d.hashCode()) * 31) + this.f11811e.hashCode()) * 31) + AbstractC2144f.m11520a(this.f11812f);
    }

    public String toString() {
        return "AlbumRowPreviewAlbumData(previewAlbumItem=" + this.f11807a + ", isEmtpyThumb=" + this.f11808b + ", thumbURL=" + this.f11809c + ", title=" + this.f11810d + ", desc=" + this.f11811e + ", isSelected=" + this.f11812f + ")";
    }
}
