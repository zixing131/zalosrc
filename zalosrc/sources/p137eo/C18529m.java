package p137eo;

import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import fn0.AbstractC19074t;

/* renamed from: eo.m */
/* loaded from: classes4.dex */
public final class C18529m implements InterfaceC18527k {

    /* renamed from: a */
    private final String f93204a;

    /* renamed from: b */
    private final ProfileAlbumItem f93205b;

    public C18529m(String str, ProfileAlbumItem profileAlbumItem) {
        AbstractC19074t.m100208f(str, "viewerId");
        AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
        this.f93204a = str;
        this.f93205b = profileAlbumItem;
    }

    @Override // p137eo.InterfaceC18527k
    /* renamed from: a */
    public long mo97914a() {
        return this.f93205b.m46300c().m46277e();
    }

    @Override // p137eo.InterfaceC18527k
    /* renamed from: b */
    public String mo97915b() {
        return this.f93204a;
    }

    @Override // p137eo.InterfaceC18527k
    /* renamed from: c */
    public int mo97916c() {
        return this.f93205b.m46300c().m46288p();
    }

    /* renamed from: d */
    public final ProfileAlbumItem m97917d() {
        return this.f93205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18529m)) {
            return false;
        }
        C18529m c18529m = (C18529m) obj;
        return AbstractC19074t.m100204b(this.f93204a, c18529m.f93204a) && AbstractC19074t.m100204b(this.f93205b, c18529m.f93205b);
    }

    public int hashCode() {
        return (this.f93204a.hashCode() * 31) + this.f93205b.hashCode();
    }

    public String toString() {
        return "StateDetailAlbum(viewerId=" + this.f93204a + ", albumItem=" + this.f93205b + ")";
    }
}
