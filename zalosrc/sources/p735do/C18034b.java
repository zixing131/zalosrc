package p735do;

import com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem;
import p137eo.C18526j;

/* renamed from: do.b */
/* loaded from: classes4.dex */
public final class C18034b extends AbstractC18033a {
    public C18034b() {
        super(10, null, 2, null);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C18526j)) {
            return false;
        }
        return m95881e((C18526j) obj);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof ProfileAlbumItem)) {
            return false;
        }
        return m95882f((ProfileAlbumItem) obj);
    }

    /* renamed from: e */
    public /* bridge */ boolean m95881e(C18526j c18526j) {
        return super.containsKey(c18526j);
    }

    /* renamed from: f */
    public /* bridge */ boolean m95882f(ProfileAlbumItem profileAlbumItem) {
        return super.containsValue(profileAlbumItem);
    }

    /* renamed from: g */
    public /* bridge */ ProfileAlbumItem m95883g(C18526j c18526j) {
        return (ProfileAlbumItem) super.get(c18526j);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C18526j)) {
            return null;
        }
        return m95883g((C18526j) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C18526j)) {
            return obj2;
        }
        return m95884h((C18526j) obj, (ProfileAlbumItem) obj2);
    }

    /* renamed from: h */
    public /* bridge */ ProfileAlbumItem m95884h(C18526j c18526j, ProfileAlbumItem profileAlbumItem) {
        return (ProfileAlbumItem) super.getOrDefault(c18526j, profileAlbumItem);
    }

    /* renamed from: i */
    public /* bridge */ ProfileAlbumItem m95885i(C18526j c18526j) {
        return (ProfileAlbumItem) super.remove(c18526j);
    }

    /* renamed from: k */
    public /* bridge */ boolean m95886k(C18526j c18526j, ProfileAlbumItem profileAlbumItem) {
        return super.remove(c18526j, profileAlbumItem);
    }

    @Override // p735do.AbstractC18033a, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof C18526j) {
            return m95885i((C18526j) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof C18526j) && (obj2 instanceof ProfileAlbumItem)) {
            return m95886k((C18526j) obj, (ProfileAlbumItem) obj2);
        }
        return false;
    }
}
