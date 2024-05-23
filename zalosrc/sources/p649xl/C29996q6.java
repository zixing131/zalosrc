package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q6 */
/* loaded from: classes3.dex */
public final class C29996q6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139094p;

    /* renamed from: q */
    public final RelativeLayout f139095q;

    /* renamed from: r */
    public final ImageView f139096r;

    /* renamed from: s */
    public final RecyclingImageView f139097s;

    /* renamed from: t */
    public final RobotoTextView f139098t;

    private C29996q6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView) {
        this.f139094p = relativeLayout;
        this.f139095q = relativeLayout2;
        this.f139096r = imageView;
        this.f139097s = recyclingImageView;
        this.f139098t = robotoTextView;
    }

    /* renamed from: a */
    public static C29996q6 m148400a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.selected_border;
        ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
        if (imageView != null) {
            i11 = AbstractC6918a0.thumb;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.title;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29996q6(relativeLayout, relativeLayout, imageView, recyclingImageView, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29996q6 m148401c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_preview_theme_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148400a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139094p;
    }
}
