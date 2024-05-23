package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.w9 */
/* loaded from: classes3.dex */
public final class C30102w9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139801p;

    /* renamed from: q */
    public final RelativeLayout f139802q;

    /* renamed from: r */
    public final FeedRecyclerView f139803r;

    /* renamed from: s */
    public final ProfileAlbumThemePickerControl f139804s;

    /* renamed from: t */
    public final ZdsActionBar f139805t;

    private C30102w9(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, FeedRecyclerView feedRecyclerView, ProfileAlbumThemePickerControl profileAlbumThemePickerControl, ZdsActionBar zdsActionBar) {
        this.f139801p = relativeLayout;
        this.f139802q = relativeLayout2;
        this.f139803r = feedRecyclerView;
        this.f139804s = profileAlbumThemePickerControl;
        this.f139805t = zdsActionBar;
    }

    /* renamed from: a */
    public static C30102w9 m148655a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.recyclerView;
        FeedRecyclerView feedRecyclerView = (FeedRecyclerView) AbstractC22716b.m117526a(view, i11);
        if (feedRecyclerView != null) {
            i11 = AbstractC6918a0.theme_picker_control;
            ProfileAlbumThemePickerControl profileAlbumThemePickerControl = (ProfileAlbumThemePickerControl) AbstractC22716b.m117526a(view, i11);
            if (profileAlbumThemePickerControl != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C30102w9(relativeLayout, relativeLayout, feedRecyclerView, profileAlbumThemePickerControl, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30102w9 m148656c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_album_preview_theme_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148655a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139801p;
    }
}
