package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.view.MainPageLayout;
import com.zing.zalo.shortvideo.p072ui.widget.NonSwipeableViewPager;
import com.zing.zalo.shortvideo.p072ui.widget.menu.MenuBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.f2 */
/* loaded from: classes5.dex */
public final class C25006f2 implements InterfaceC22715a {

    /* renamed from: p */
    private final MainPageLayout f119901p;

    /* renamed from: q */
    public final MenuBar f119902q;

    /* renamed from: r */
    public final ImageView f119903r;

    /* renamed from: s */
    public final ImageView f119904s;

    /* renamed from: t */
    public final ImageView f119905t;

    /* renamed from: u */
    public final ImageView f119906u;

    /* renamed from: v */
    public final LinearLayout f119907v;

    /* renamed from: w */
    public final MainPageLayout f119908w;

    /* renamed from: x */
    public final View f119909x;

    /* renamed from: y */
    public final NonSwipeableViewPager f119910y;

    private C25006f2(MainPageLayout mainPageLayout, MenuBar menuBar, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, MainPageLayout mainPageLayout2, View view, NonSwipeableViewPager nonSwipeableViewPager) {
        this.f119901p = mainPageLayout;
        this.f119902q = menuBar;
        this.f119903r = imageView;
        this.f119904s = imageView2;
        this.f119905t = imageView3;
        this.f119906u = imageView4;
        this.f119907v = linearLayout;
        this.f119908w = mainPageLayout2;
        this.f119909x = view;
        this.f119910y = nonSwipeableViewPager;
    }

    /* renamed from: a */
    public static C25006f2 m129812a(View view) {
        int i11 = AbstractC27409d.barMenu;
        MenuBar menuBar = (MenuBar) AbstractC22716b.m117526a(view, i11);
        if (menuBar != null) {
            i11 = AbstractC27409d.btnBack;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC27409d.btnFloat;
                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                if (imageView2 != null) {
                    i11 = AbstractC27409d.btnProfile;
                    ImageView imageView3 = (ImageView) AbstractC22716b.m117526a(view, i11);
                    if (imageView3 != null) {
                        i11 = AbstractC27409d.btnSearch;
                        ImageView imageView4 = (ImageView) AbstractC22716b.m117526a(view, i11);
                        if (imageView4 != null) {
                            i11 = AbstractC27409d.lytHeader;
                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                            if (linearLayout != null) {
                                MainPageLayout mainPageLayout = (MainPageLayout) view;
                                i11 = AbstractC27409d.vieOverlay;
                                View m117526a = AbstractC22716b.m117526a(view, i11);
                                if (m117526a != null) {
                                    i11 = AbstractC27409d.viePager;
                                    NonSwipeableViewPager nonSwipeableViewPager = (NonSwipeableViewPager) AbstractC22716b.m117526a(view, i11);
                                    if (nonSwipeableViewPager != null) {
                                        return new C25006f2(mainPageLayout, menuBar, imageView, imageView2, imageView3, imageView4, linearLayout, mainPageLayout, m117526a, nonSwipeableViewPager);
                                    }
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
    public static C25006f2 m129813c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_page_main, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129812a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public MainPageLayout getRoot() {
        return this.f119901p;
    }
}
