package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r6 */
/* loaded from: classes3.dex */
public final class C30014r6 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139209p;

    /* renamed from: q */
    public final RelativeLayout f139210q;

    /* renamed from: r */
    public final RobotoTextView f139211r;

    /* renamed from: s */
    public final RecyclingImageView f139212s;

    /* renamed from: t */
    public final RecyclingImageView f139213t;

    /* renamed from: u */
    public final View f139214u;

    /* renamed from: v */
    public final RobotoTextView f139215v;

    private C30014r6(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RobotoTextView robotoTextView, RecyclingImageView recyclingImageView, RecyclingImageView recyclingImageView2, View view, RobotoTextView robotoTextView2) {
        this.f139209p = relativeLayout;
        this.f139210q = relativeLayout2;
        this.f139211r = robotoTextView;
        this.f139212s = recyclingImageView;
        this.f139213t = recyclingImageView2;
        this.f139214u = view;
        this.f139215v = robotoTextView2;
    }

    /* renamed from: a */
    public static C30014r6 m148440a(View view) {
        View m117526a;
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i11 = AbstractC6918a0.desc;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.iconLeft;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.iconRight;
                RecyclingImageView recyclingImageView2 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                if (recyclingImageView2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.line_bottom))) != null) {
                    i11 = AbstractC6918a0.title;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        return new C30014r6(relativeLayout, relativeLayout, robotoTextView, recyclingImageView, recyclingImageView2, m117526a, robotoTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30014r6 m148441c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_profile_album_row_select_info, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148440a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139209p;
    }
}
