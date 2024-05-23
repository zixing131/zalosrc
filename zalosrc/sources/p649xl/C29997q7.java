package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q7 */
/* loaded from: classes3.dex */
public final class C29997q7 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139099p;

    /* renamed from: q */
    public final RobotoTextView f139100q;

    /* renamed from: r */
    public final RobotoButton f139101r;

    private C29997q7(LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoButton robotoButton) {
        this.f139099p = linearLayout;
        this.f139100q = robotoTextView;
        this.f139101r = robotoButton;
    }

    /* renamed from: a */
    public static C29997q7 m148403a(View view) {
        int i11 = AbstractC6918a0.onboard_content_tv;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.onboard_dismiss_btn;
            RobotoButton robotoButton = (RobotoButton) AbstractC22716b.m117526a(view, i11);
            if (robotoButton != null) {
                return new C29997q7((LinearLayout) view, robotoTextView, robotoButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29997q7 m148404c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_video_hd_onboard, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148403a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139099p;
    }
}
