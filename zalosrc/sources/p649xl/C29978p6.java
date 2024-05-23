package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.uicontrols.FeedGridModulesView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p6 */
/* loaded from: classes3.dex */
public final class C29978p6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138964p;

    /* renamed from: q */
    public final Button f138965q;

    /* renamed from: r */
    public final RelativeLayout f138966r;

    /* renamed from: s */
    public final AspectRatioImageView f138967s;

    /* renamed from: t */
    public final ImageView f138968t;

    /* renamed from: u */
    public final FrameLayout f138969u;

    /* renamed from: v */
    public final FeedGridModulesView f138970v;

    /* renamed from: w */
    public final RobotoTextView f138971w;

    private C29978p6(RelativeLayout relativeLayout, Button button, RelativeLayout relativeLayout2, AspectRatioImageView aspectRatioImageView, ImageView imageView, FrameLayout frameLayout, FeedGridModulesView feedGridModulesView, RobotoTextView robotoTextView) {
        this.f138964p = relativeLayout;
        this.f138965q = button;
        this.f138966r = relativeLayout2;
        this.f138967s = aspectRatioImageView;
        this.f138968t = imageView;
        this.f138969u = frameLayout;
        this.f138970v = feedGridModulesView;
        this.f138971w = robotoTextView;
    }

    /* renamed from: a */
    public static C29978p6 m148362a(View view) {
        int i11 = AbstractC6918a0.btn_photo_grid_add;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i11 = AbstractC6918a0.imv_thumb_video;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
            if (aspectRatioImageView != null) {
                i11 = AbstractC6918a0.imv_video_feed_remove;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    i11 = AbstractC6918a0.layoutVideoFeed;
                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout != null) {
                        i11 = AbstractC6918a0.photo_preview_grid;
                        FeedGridModulesView feedGridModulesView = (FeedGridModulesView) AbstractC22716b.m117526a(view, i11);
                        if (feedGridModulesView != null) {
                            i11 = AbstractC6918a0.tv_video_duration;
                            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                            if (robotoTextView != null) {
                                return new C29978p6(relativeLayout, button, relativeLayout, aspectRatioImageView, imageView, frameLayout, feedGridModulesView, robotoTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29978p6 m148363c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_preview_grid, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148362a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138964p;
    }
}
