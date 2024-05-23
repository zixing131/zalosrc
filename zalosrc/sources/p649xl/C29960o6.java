package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.o6 */
/* loaded from: classes3.dex */
public final class C29960o6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138866p;

    /* renamed from: q */
    public final RelativeLayout f138867q;

    /* renamed from: r */
    public final RecyclingImageView f138868r;

    /* renamed from: s */
    public final RobotoTextView f138869s;

    /* renamed from: t */
    public final AspectRatioImageView f138870t;

    /* renamed from: u */
    public final RelativeLayout f138871u;

    /* renamed from: v */
    public final FrameLayout f138872v;

    /* renamed from: w */
    public final ImageView f138873w;

    /* renamed from: x */
    public final AspectRatioImageView f138874x;

    /* renamed from: y */
    public final RobotoTextView f138875y;

    private C29960o6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, AspectRatioImageView aspectRatioImageView, RelativeLayout relativeLayout3, FrameLayout frameLayout, ImageView imageView, AspectRatioImageView aspectRatioImageView2, RobotoTextView robotoTextView2) {
        this.f138866p = relativeLayout;
        this.f138867q = relativeLayout2;
        this.f138868r = recyclingImageView;
        this.f138869s = robotoTextView;
        this.f138870t = aspectRatioImageView;
        this.f138871u = relativeLayout3;
        this.f138872v = frameLayout;
        this.f138873w = imageView;
        this.f138874x = aspectRatioImageView2;
        this.f138875y = robotoTextView2;
    }

    /* renamed from: a */
    public static C29960o6 m148317a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.cover;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.desc;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.icon;
                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                if (aspectRatioImageView != null) {
                    i11 = AbstractC6918a0.layout_thumb;
                    RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                    if (relativeLayout2 != null) {
                        i11 = AbstractC6918a0.overlay;
                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout != null) {
                            i11 = AbstractC6918a0.selected_icon;
                            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                            if (imageView != null) {
                                i11 = AbstractC6918a0.thumb_empty;
                                AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                                if (aspectRatioImageView2 != null) {
                                    i11 = AbstractC6918a0.title;
                                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                    if (robotoTextView2 != null) {
                                        return new C29960o6(relativeLayout, relativeLayout, recyclingImageView, robotoTextView, aspectRatioImageView, relativeLayout2, frameLayout, imageView, aspectRatioImageView2, robotoTextView2);
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
    public static C29960o6 m148318c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_preview_album_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148317a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138866p;
    }
}
