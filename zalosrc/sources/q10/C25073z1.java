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

/* renamed from: q10.z1 */
/* loaded from: classes5.dex */
public final class C25073z1 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f120441p;

    /* renamed from: q */
    public final SimpleShadowTextView f120442q;

    /* renamed from: r */
    public final SimpleShadowTextView f120443r;

    /* renamed from: s */
    public final SimpleShadowTextView f120444s;

    /* renamed from: t */
    public final LinearLayout f120445t;

    /* renamed from: u */
    public final SimpleShadowTextView f120446u;

    /* renamed from: v */
    public final SimpleShadowTextView f120447v;

    private C25073z1(LinearLayout linearLayout, SimpleShadowTextView simpleShadowTextView, SimpleShadowTextView simpleShadowTextView2, SimpleShadowTextView simpleShadowTextView3, LinearLayout linearLayout2, SimpleShadowTextView simpleShadowTextView4, SimpleShadowTextView simpleShadowTextView5) {
        this.f120441p = linearLayout;
        this.f120442q = simpleShadowTextView;
        this.f120443r = simpleShadowTextView2;
        this.f120444s = simpleShadowTextView3;
        this.f120445t = linearLayout2;
        this.f120446u = simpleShadowTextView4;
        this.f120447v = simpleShadowTextView5;
    }

    /* renamed from: a */
    public static C25073z1 m129986a(View view) {
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
                                return new C25073z1((LinearLayout) view, simpleShadowTextView, simpleShadowTextView2, simpleShadowTextView3, linearLayout, simpleShadowTextView4, simpleShadowTextView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25073z1 m129987c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_livestream_popup_confirm, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129986a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f120441p;
    }
}
