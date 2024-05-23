package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p0 */
/* loaded from: classes3.dex */
public final class C29972p0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138924p;

    /* renamed from: q */
    public final ZAppCompatImageView f138925q;

    /* renamed from: r */
    public final LinearLayout f138926r;

    /* renamed from: s */
    public final RobotoTextView f138927s;

    private C29972p0(LinearLayout linearLayout, ZAppCompatImageView zAppCompatImageView, LinearLayout linearLayout2, RobotoTextView robotoTextView) {
        this.f138924p = linearLayout;
        this.f138925q = zAppCompatImageView;
        this.f138926r = linearLayout2;
        this.f138927s = robotoTextView;
    }

    /* renamed from: a */
    public static C29972p0 m148345a(View view) {
        int i11 = AbstractC6918a0.ivDeleteAll;
        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
        if (zAppCompatImageView != null) {
            i11 = AbstractC6918a0.llDeleteAll;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                i11 = AbstractC6918a0.tvDeleteAll;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    return new C29972p0((LinearLayout) view, zAppCompatImageView, linearLayout, robotoTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29972p0 m148346c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_delete_stranger_message, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148345a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138924p;
    }
}
