package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.OnboardingOptionLayout;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.h2 */
/* loaded from: classes5.dex */
public final class C25014h2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119942p;

    /* renamed from: q */
    public final SimpleShadowTextView f119943q;

    /* renamed from: r */
    public final LinearLayout f119944r;

    /* renamed from: s */
    public final C25021j1 f119945s;

    /* renamed from: t */
    public final LoadingLayout f119946t;

    /* renamed from: u */
    public final OnboardingOptionLayout f119947u;

    /* renamed from: v */
    public final FrameLayout f119948v;

    /* renamed from: w */
    public final LinearLayout f119949w;

    /* renamed from: x */
    public final ScrollView f119950x;

    /* renamed from: y */
    public final SimpleShadowTextView f119951y;

    private C25014h2(FrameLayout frameLayout, SimpleShadowTextView simpleShadowTextView, LinearLayout linearLayout, C25021j1 c25021j1, LoadingLayout loadingLayout, OnboardingOptionLayout onboardingOptionLayout, FrameLayout frameLayout2, LinearLayout linearLayout2, ScrollView scrollView, SimpleShadowTextView simpleShadowTextView2) {
        this.f119942p = frameLayout;
        this.f119943q = simpleShadowTextView;
        this.f119944r = linearLayout;
        this.f119945s = c25021j1;
        this.f119946t = loadingLayout;
        this.f119947u = onboardingOptionLayout;
        this.f119948v = frameLayout2;
        this.f119949w = linearLayout2;
        this.f119950x = scrollView;
        this.f119951y = simpleShadowTextView2;
    }

    /* renamed from: a */
    public static C25014h2 m129838a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.btnSave;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.lytFooter;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.lytHeader))) != null) {
                C25021j1 m129858a = C25021j1.m129858a(m117526a);
                i11 = AbstractC27409d.lytLoading;
                LoadingLayout loadingLayout = (LoadingLayout) AbstractC22716b.m117526a(view, i11);
                if (loadingLayout != null) {
                    i11 = AbstractC27409d.lytOption;
                    OnboardingOptionLayout onboardingOptionLayout = (OnboardingOptionLayout) AbstractC22716b.m117526a(view, i11);
                    if (onboardingOptionLayout != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        i11 = AbstractC27409d.lytViewOnboarding;
                        LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                        if (linearLayout2 != null) {
                            i11 = AbstractC27409d.scrOption;
                            ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                            if (scrollView != null) {
                                i11 = AbstractC27409d.txtHeader;
                                SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                                if (simpleShadowTextView2 != null) {
                                    return new C25014h2(frameLayout, simpleShadowTextView, linearLayout, m129858a, loadingLayout, onboardingOptionLayout, frameLayout, linearLayout2, scrollView, simpleShadowTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25014h2 m129839c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_onboarding, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129838a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119942p;
    }
}
