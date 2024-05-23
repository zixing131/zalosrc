package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.CommentBox;
import com.zing.zalo.shortvideo.p072ui.widget.menu.PageBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.g2 */
/* loaded from: classes5.dex */
public final class C25010g2 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f119919p;

    /* renamed from: q */
    public final PageBar f119920q;

    /* renamed from: r */
    public final CommentBox f119921r;

    /* renamed from: s */
    public final View f119922s;

    /* renamed from: t */
    public final LinearLayout f119923t;

    /* renamed from: u */
    public final C25021j1 f119924u;

    /* renamed from: v */
    public final FrameLayout f119925v;

    /* renamed from: w */
    public final ViewPager f119926w;

    private C25010g2(FrameLayout frameLayout, PageBar pageBar, CommentBox commentBox, View view, LinearLayout linearLayout, C25021j1 c25021j1, FrameLayout frameLayout2, ViewPager viewPager) {
        this.f119919p = frameLayout;
        this.f119920q = pageBar;
        this.f119921r = commentBox;
        this.f119922s = view;
        this.f119923t = linearLayout;
        this.f119924u = c25021j1;
        this.f119925v = frameLayout2;
        this.f119926w = viewPager;
    }

    /* renamed from: a */
    public static C25010g2 m129825a(View view) {
        View m117526a;
        View m117526a2;
        int i11 = AbstractC27409d.barPage;
        PageBar pageBar = (PageBar) AbstractC22716b.m117526a(view, i11);
        if (pageBar != null) {
            i11 = AbstractC27409d.boxComment;
            CommentBox commentBox = (CommentBox) AbstractC22716b.m117526a(view, i11);
            if (commentBox != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.dimContent))) != null) {
                i11 = AbstractC27409d.lytContainer;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC27409d.lytHeader))) != null) {
                    C25021j1 m129858a = C25021j1.m129858a(m117526a2);
                    FrameLayout frameLayout = (FrameLayout) view;
                    i11 = AbstractC27409d.viePager;
                    ViewPager viewPager = (ViewPager) AbstractC22716b.m117526a(view, i11);
                    if (viewPager != null) {
                        return new C25010g2(frameLayout, pageBar, commentBox, m117526a, linearLayout, m129858a, frameLayout, viewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25010g2 m129826c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_notification, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129825a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f119919p;
    }
}
