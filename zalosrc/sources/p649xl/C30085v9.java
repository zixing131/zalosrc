package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.uicontrols.FeedRecyclerView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.ChangeableHeightRelativeLayout;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.v9 */
/* loaded from: classes3.dex */
public final class C30085v9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139678p;

    /* renamed from: q */
    public final RelativeLayout f139679q;

    /* renamed from: r */
    public final AspectRatioImageView f139680r;

    /* renamed from: s */
    public final RelativeLayout f139681s;

    /* renamed from: t */
    public final ChangeableHeightRelativeLayout f139682t;

    /* renamed from: u */
    public final FeedRecyclerView f139683u;

    /* renamed from: v */
    public final ZdsActionBar f139684v;

    private C30085v9(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AspectRatioImageView aspectRatioImageView, RelativeLayout relativeLayout3, ChangeableHeightRelativeLayout changeableHeightRelativeLayout, FeedRecyclerView feedRecyclerView, ZdsActionBar zdsActionBar) {
        this.f139678p = relativeLayout;
        this.f139679q = relativeLayout2;
        this.f139680r = aspectRatioImageView;
        this.f139681s = relativeLayout3;
        this.f139682t = changeableHeightRelativeLayout;
        this.f139683u = feedRecyclerView;
        this.f139684v = zdsActionBar;
    }

    /* renamed from: a */
    public static C30085v9 m148618a(View view) {
        int i11 = AbstractC6918a0.button_post_photo_container;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.icon_photo;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
            if (aspectRatioImageView != null) {
                RelativeLayout relativeLayout2 = (RelativeLayout) view;
                i11 = AbstractC6918a0.quick_picker_container;
                ChangeableHeightRelativeLayout changeableHeightRelativeLayout = (ChangeableHeightRelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (changeableHeightRelativeLayout != null) {
                    i11 = AbstractC6918a0.recyclerView;
                    FeedRecyclerView feedRecyclerView = (FeedRecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (feedRecyclerView != null) {
                        i11 = AbstractC6918a0.zds_action_bar;
                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                        if (zdsActionBar != null) {
                            return new C30085v9(relativeLayout2, relativeLayout, aspectRatioImageView, relativeLayout2, changeableHeightRelativeLayout, feedRecyclerView, zdsActionBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30085v9 m148619c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_album_preview_album_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148618a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139678p;
    }
}
