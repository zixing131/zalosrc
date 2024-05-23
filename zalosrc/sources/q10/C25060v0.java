package q10;

import android.view.View;
import android.widget.ScrollView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.OnboardingContainerLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.OnboardingOptionLayout;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.OnboardingVideoItem;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.v0 */
/* loaded from: classes5.dex */
public final class C25060v0 implements InterfaceC22715a {

    /* renamed from: p */
    private final OnboardingVideoItem f120347p;

    /* renamed from: q */
    public final SimpleShadowTextView f120348q;

    /* renamed from: r */
    public final OnboardingContainerLayout f120349r;

    /* renamed from: s */
    public final OnboardingOptionLayout f120350s;

    /* renamed from: t */
    public final ScrollView f120351t;

    /* renamed from: u */
    public final SimpleShadowTextView f120352u;

    private C25060v0(OnboardingVideoItem onboardingVideoItem, SimpleShadowTextView simpleShadowTextView, OnboardingContainerLayout onboardingContainerLayout, OnboardingOptionLayout onboardingOptionLayout, ScrollView scrollView, SimpleShadowTextView simpleShadowTextView2) {
        this.f120347p = onboardingVideoItem;
        this.f120348q = simpleShadowTextView;
        this.f120349r = onboardingContainerLayout;
        this.f120350s = onboardingOptionLayout;
        this.f120351t = scrollView;
        this.f120352u = simpleShadowTextView2;
    }

    /* renamed from: a */
    public static C25060v0 m129954a(View view) {
        int i11 = AbstractC27409d.btnExpand;
        SimpleShadowTextView simpleShadowTextView = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
        if (simpleShadowTextView != null) {
            i11 = AbstractC27409d.lytContainer;
            OnboardingContainerLayout onboardingContainerLayout = (OnboardingContainerLayout) AbstractC22716b.m117526a(view, i11);
            if (onboardingContainerLayout != null) {
                i11 = AbstractC27409d.lytOption;
                OnboardingOptionLayout onboardingOptionLayout = (OnboardingOptionLayout) AbstractC22716b.m117526a(view, i11);
                if (onboardingOptionLayout != null) {
                    i11 = AbstractC27409d.scrOnboarding;
                    ScrollView scrollView = (ScrollView) AbstractC22716b.m117526a(view, i11);
                    if (scrollView != null) {
                        i11 = AbstractC27409d.txtTitle;
                        SimpleShadowTextView simpleShadowTextView2 = (SimpleShadowTextView) AbstractC22716b.m117526a(view, i11);
                        if (simpleShadowTextView2 != null) {
                            return new C25060v0((OnboardingVideoItem) view, simpleShadowTextView, onboardingContainerLayout, onboardingOptionLayout, scrollView, simpleShadowTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public OnboardingVideoItem getRoot() {
        return this.f120347p;
    }
}
