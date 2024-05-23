package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.widget.SwitchView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.p0 */
/* loaded from: classes5.dex */
public final class C25042p0 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120174p;

    /* renamed from: q */
    public final RecyclingImageView f120175q;

    /* renamed from: r */
    public final RobotoTextView f120176r;

    /* renamed from: s */
    public final SwitchView f120177s;

    private C25042p0(FrameLayout frameLayout, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, SwitchView switchView) {
        this.f120174p = frameLayout;
        this.f120175q = recyclingImageView;
        this.f120176r = robotoTextView;
        this.f120177s = switchView;
    }

    /* renamed from: a */
    public static C25042p0 m129913a(View view) {
        int i11 = AbstractC27409d.ivIconStart;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC27409d.rowScroll;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC27409d.swvScroll;
                SwitchView switchView = (SwitchView) AbstractC22716b.m117526a(view, i11);
                if (switchView != null) {
                    return new C25042p0((FrameLayout) view, recyclingImageView, robotoTextView, switchView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25042p0 m129914c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_item_text_and_switch_bts, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129913a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120174p;
    }
}
