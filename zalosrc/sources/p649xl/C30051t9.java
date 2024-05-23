package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.album.ProfileAlbumThemePickerControl;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.CustomRelativeLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.Divider;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.t9 */
/* loaded from: classes3.dex */
public final class C30051t9 implements InterfaceC22715a {

    /* renamed from: p */
    private final CustomRelativeLayout f139454p;

    /* renamed from: q */
    public final RelativeLayout f139455q;

    /* renamed from: r */
    public final AspectRatioImageView f139456r;

    /* renamed from: s */
    public final Divider f139457s;

    /* renamed from: t */
    public final CustomRelativeLayout f139458t;

    /* renamed from: u */
    public final LinearLayout f139459u;

    /* renamed from: v */
    public final RelativeLayout f139460v;

    /* renamed from: w */
    public final SwipeRefreshListView f139461w;

    /* renamed from: x */
    public final ProfileAlbumThemePickerControl f139462x;

    /* renamed from: y */
    public final RobotoTextView f139463y;

    /* renamed from: z */
    public final ZdsActionBar f139464z;

    private C30051t9(CustomRelativeLayout customRelativeLayout, RelativeLayout relativeLayout, AspectRatioImageView aspectRatioImageView, Divider divider, CustomRelativeLayout customRelativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout2, SwipeRefreshListView swipeRefreshListView, ProfileAlbumThemePickerControl profileAlbumThemePickerControl, RobotoTextView robotoTextView, ZdsActionBar zdsActionBar) {
        this.f139454p = customRelativeLayout;
        this.f139455q = relativeLayout;
        this.f139456r = aspectRatioImageView;
        this.f139457s = divider;
        this.f139458t = customRelativeLayout2;
        this.f139459u = linearLayout;
        this.f139460v = relativeLayout2;
        this.f139461w = swipeRefreshListView;
        this.f139462x = profileAlbumThemePickerControl;
        this.f139463y = robotoTextView;
        this.f139464z = zdsActionBar;
    }

    /* renamed from: a */
    public static C30051t9 m148533a(View view) {
        int i11 = AbstractC6918a0.button_post_photo_container;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.icon_photo;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
            if (aspectRatioImageView != null) {
                i11 = AbstractC6918a0.line_separator;
                Divider divider = (Divider) AbstractC22716b.m117526a(view, i11);
                if (divider != null) {
                    CustomRelativeLayout customRelativeLayout = (CustomRelativeLayout) view;
                    i11 = AbstractC6918a0.sticky_header;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC6918a0.sticky_header_background;
                        RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout2 != null) {
                            i11 = AbstractC6918a0.swipe_refresh_layout;
                            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
                            if (swipeRefreshListView != null) {
                                i11 = AbstractC6918a0.theme_picker_control;
                                ProfileAlbumThemePickerControl profileAlbumThemePickerControl = (ProfileAlbumThemePickerControl) AbstractC22716b.m117526a(view, i11);
                                if (profileAlbumThemePickerControl != null) {
                                    i11 = AbstractC6918a0.tv_sticky_date;
                                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView != null) {
                                        i11 = AbstractC6918a0.zds_action_bar;
                                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                        if (zdsActionBar != null) {
                                            return new C30051t9(customRelativeLayout, relativeLayout, aspectRatioImageView, divider, customRelativeLayout, linearLayout, relativeLayout2, swipeRefreshListView, profileAlbumThemePickerControl, robotoTextView, zdsActionBar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30051t9 m148534c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_album_detail_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148533a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public CustomRelativeLayout getRoot() {
        return this.f139454p;
    }
}
