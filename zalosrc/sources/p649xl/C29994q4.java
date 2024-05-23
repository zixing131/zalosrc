package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q4 */
/* loaded from: classes3.dex */
public final class C29994q4 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139088p;

    /* renamed from: q */
    public final RoundCornerImageView f139089q;

    /* renamed from: r */
    public final ZAppCompatImageView f139090r;

    private C29994q4(FrameLayout frameLayout, RoundCornerImageView roundCornerImageView, ZAppCompatImageView zAppCompatImageView) {
        this.f139088p = frameLayout;
        this.f139089q = roundCornerImageView;
        this.f139090r = zAppCompatImageView;
    }

    /* renamed from: a */
    public static C29994q4 m148394a(View view) {
        int i11 = AbstractC6918a0.report_photo_imv;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) AbstractC22716b.m117526a(view, i11);
        if (roundCornerImageView != null) {
            i11 = AbstractC6918a0.report_photo_remove_icon;
            ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
            if (zAppCompatImageView != null) {
                return new C29994q4((FrameLayout) view, roundCornerImageView, zAppCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29994q4 m148395c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.item_photo_report_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148394a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139088p;
    }
}
