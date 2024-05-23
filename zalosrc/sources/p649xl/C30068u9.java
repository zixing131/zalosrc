package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.AlbumListingView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.u9 */
/* loaded from: classes3.dex */
public final class C30068u9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139570p;

    /* renamed from: q */
    public final AlbumListingView f139571q;

    /* renamed from: r */
    public final RelativeLayout f139572r;

    /* renamed from: s */
    public final ZdsActionBar f139573s;

    private C30068u9(RelativeLayout relativeLayout, AlbumListingView albumListingView, RelativeLayout relativeLayout2, ZdsActionBar zdsActionBar) {
        this.f139570p = relativeLayout;
        this.f139571q = albumListingView;
        this.f139572r = relativeLayout2;
        this.f139573s = zdsActionBar;
    }

    /* renamed from: a */
    public static C30068u9 m148577a(View view) {
        int i11 = AbstractC6918a0.album_view_list;
        AlbumListingView albumListingView = (AlbumListingView) AbstractC22716b.m117526a(view, i11);
        if (albumListingView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i12 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i12);
            if (zdsActionBar != null) {
                return new C30068u9(relativeLayout, albumListingView, relativeLayout, zdsActionBar);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30068u9 m148578c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_album_listing_all, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148577a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139570p;
    }
}
