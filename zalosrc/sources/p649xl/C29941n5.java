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

/* renamed from: xl.n5 */
/* loaded from: classes3.dex */
public final class C29941n5 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138757p;

    /* renamed from: q */
    public final RelativeLayout f138758q;

    /* renamed from: r */
    public final RobotoTextView f138759r;

    /* renamed from: s */
    public final RecyclingImageView f138760s;

    /* renamed from: t */
    public final ImageView f138761t;

    private C29941n5(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RobotoTextView robotoTextView, RecyclingImageView recyclingImageView, ImageView imageView) {
        this.f138757p = relativeLayout;
        this.f138758q = relativeLayout2;
        this.f138759r = robotoTextView;
        this.f138760s = recyclingImageView;
        this.f138761t = imageView;
    }

    /* renamed from: a */
    public static C29941n5 m148272a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.layout_name;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.layout_thumb;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.selected_border;
                ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView != null) {
                    return new C29941n5(relativeLayout, relativeLayout, robotoTextView, recyclingImageView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29941n5 m148273c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_item_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148272a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138757p;
    }
}
