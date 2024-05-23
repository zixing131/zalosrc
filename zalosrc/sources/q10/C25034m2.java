package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.m2 */
/* loaded from: classes5.dex */
public final class C25034m2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120111p;

    /* renamed from: q */
    public final SimpleShadowTextView f120112q;

    /* renamed from: r */
    public final SimpleShadowTextView f120113r;

    /* renamed from: s */
    public final SimpleShadowTextView f120114s;

    /* renamed from: t */
    public final LinearLayout f120115t;

    /* renamed from: u */
    public final SimpleShadowTextView f120116u;

    /* renamed from: v */
    public final SimpleShadowTextView f120117v;

    private C25034m2(LinearLayout linearLayout, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, LinearLayout linearLayout2, SimpleShadowTextView simpleShadowTextView4, SimpleShadowTextView simpleShadowTextView5) {
        this.f120111p = linearLayout;
        this.f120112q = simpleShadowTextView;
        this.f120113r = simpleShadowTextView2;
        this.f120114s = simpleShadowTextView3;
        this.f120115t = linearLayout2;
        this.f120116u = simpleShadowTextView4;
        this.f120117v = simpleShadowTextView5;
    }

    /* renamed from: a */
    public static C25034m2 m129890a(View view) {
        int i11 = AbstractC27409d.btnNegative;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.btnNeutral;
            SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
            if (simpleShadowTextView2 != null) {
                i11 = AbstractC27409d.btnPositive;
                SimpleShadowTextView simpleShadowTextView3 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                if (simpleShadowTextView3 != null) {
                    i11 = AbstractC27409d.lytActions;
                    LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout != null) {
                        i11 = AbstractC27409d.txtMessage;
                        SimpleShadowTextView simpleShadowTextView4 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView4 != null) {
                            i11 = AbstractC27409d.txtTitle;
                            SimpleShadowTextView simpleShadowTextView5 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                            if (simpleShadowTextView5 != null) {
                                return new C25034m2((LinearLayout) view, simpleShadowTextView, simpleShadowTextView2, simpleShadowTextView3, linearLayout, simpleShadowTextView4, simpleShadowTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25034m2 m129891c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_popup_confirm, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129890a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120111p;
    }
}
