package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.a2 */
/* loaded from: classes5.dex */
public final class C24986a2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119743p;

    /* renamed from: q */
    public final PageBar f119744q;

    /* renamed from: r */
    public final C25021j1 f119745r;

    /* renamed from: s */
    public final LinearLayout f119746s;

    /* renamed from: t */
    public final FrameLayout f119747t;

    /* renamed from: u */
    public final ViewPager f119748u;

    private C24986a2(FrameLayout frameLayout, PageBar pageBar, C25021j1 c25021j1, LinearLayout linearLayout, FrameLayout frameLayout2, ViewPager viewPager) {
        this.f119743p = frameLayout;
        this.f119744q = pageBar;
        this.f119745r = c25021j1;
        this.f119746s = linearLayout;
        this.f119747t = frameLayout2;
        this.f119748u = viewPager;
    }

    /* renamed from: a */
    public static C24986a2 m129754a(View view) {
        View m117526a;
        int i11 = AbstractC27409d.barPage;
        PageBar pageBar = (PageBar) AbstractC22716b.m117526a(view, i11);
        if (pageBar != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.header))) != null) {
            C25021j1 m129858a = C25021j1.m129858a(m117526a);
            i11 = AbstractC27409d.lytContainer;
            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i11 = AbstractC27409d.viePager;
                ViewPager viewPager = (ViewPager) AbstractC22716b.m117526a(view, i11);
                if (viewPager != null) {
                    return new C24986a2(frameLayout, pageBar, m129858a, linearLayout, frameLayout, viewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C24986a2 m129755c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_block, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129754a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f119743p;
    }
}
