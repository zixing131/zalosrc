package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.TrackingTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j0 */
/* loaded from: classes3.dex */
public final class C29864j0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138219p;

    /* renamed from: q */
    public final Button f138220q;

    /* renamed from: r */
    public final Button f138221r;

    /* renamed from: s */
    public final TrackingTextView f138222s;

    /* renamed from: t */
    public final ZAppCompatImageView f138223t;

    /* renamed from: u */
    public final RobotoTextView f138224u;

    private C29864j0(LinearLayout linearLayout, Button button, Button button2, TrackingTextView trackingTextView, ZAppCompatImageView zAppCompatImageView, RobotoTextView robotoTextView) {
        this.f138219p = linearLayout;
        this.f138220q = button;
        this.f138221r = button2;
        this.f138222s = trackingTextView;
        this.f138223t = zAppCompatImageView;
        this.f138224u = robotoTextView;
    }

    /* renamed from: a */
    public static C29864j0 m148095a(View view) {
        int i11 = AbstractC6918a0.btn_allow;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.btn_later;
            Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
            if (button2 != null) {
                i11 = AbstractC6918a0.btn_learn_more;
                TrackingTextView trackingTextView = (TrackingTextView) AbstractC22716b.m117526a(view, i11);
                if (trackingTextView != null) {
                    i11 = AbstractC6918a0.imv_hint;
                    ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                    if (zAppCompatImageView != null) {
                        i11 = AbstractC6918a0.txt_description;
                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView != null) {
                            return new C29864j0((LinearLayout) view, button, button2, trackingTextView, zAppCompatImageView, robotoTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29864j0 m148096c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.bottom_sheet_battery_optimization_warning_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148095a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138219p;
    }
}
