package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.mc */
/* loaded from: classes.dex */
public final class C29930mc implements InterfaceC22715a {

    /* renamed from: A */
    public final FrameLayout f138695A;

    /* renamed from: B */
    public final SlidingTabLayout f138696B;

    /* renamed from: C */
    public final RobotoTextView f138697C;

    /* renamed from: D */
    public final ViewPager f138698D;

    /* renamed from: p */
    private final FrameLayout f138699p;

    /* renamed from: q */
    public final LinearLayout f138700q;

    /* renamed from: r */
    public final Button f138701r;

    /* renamed from: s */
    public final Button f138702s;

    /* renamed from: t */
    public final LinearLayout f138703t;

    /* renamed from: u */
    public final View f138704u;

    /* renamed from: v */
    public final View f138705v;

    /* renamed from: w */
    public final View f138706w;

    /* renamed from: x */
    public final ZAppCompatImageView f138707x;

    /* renamed from: y */
    public final ImageView f138708y;

    /* renamed from: z */
    public final ImageView f138709z;

    private C29930mc(FrameLayout frameLayout, LinearLayout linearLayout, Button button, Button button2, LinearLayout linearLayout2, View view, View view2, View view3, ZAppCompatImageView zAppCompatImageView, ImageView imageView, ImageView imageView2, FrameLayout frameLayout2, SlidingTabLayout slidingTabLayout, RobotoTextView robotoTextView, ViewPager viewPager) {
        this.f138699p = frameLayout;
        this.f138700q = linearLayout;
        this.f138701r = button;
        this.f138702s = button2;
        this.f138703t = linearLayout2;
        this.f138704u = view;
        this.f138705v = view2;
        this.f138706w = view3;
        this.f138707x = zAppCompatImageView;
        this.f138708y = imageView;
        this.f138709z = imageView2;
        this.f138695A = frameLayout2;
        this.f138696B = slidingTabLayout;
        this.f138697C = robotoTextView;
        this.f138698D = viewPager;
    }

    /* renamed from: a */
    public static C29930mc m148256a(View view) {
        View m117526a;
        View m117526a2;
        View m117526a3;
        int i11 = AbstractC6918a0.actionContainer;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.btnLogin;
            Button button = (Button) AbstractC22716b.m117526a(view, i11);
            if (button != null) {
                i11 = AbstractC6918a0.btnRegisterUsingPhoneNumber;
                Button button2 = (Button) AbstractC22716b.m117526a(view, i11);
                if (button2 != null) {
                    i11 = AbstractC6918a0.chipLanguage;
                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                    if (linearLayout2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.fakeMarginBottomView))) != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.fakeMarginTopView))) != null && (m117526a3 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.fakeTopView))) != null) {
                        i11 = AbstractC6918a0.icDropdown;
                        ZAppCompatImageView zAppCompatImageView = (ZAppCompatImageView) AbstractC22716b.m117526a(view, i11);
                        if (zAppCompatImageView != null) {
                            i11 = AbstractC6918a0.imgZalo;
                            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
                            if (imageView != null) {
                                i11 = AbstractC6918a0.imvAppLogo;
                                ImageView imageView2 = (ImageView) AbstractC22716b.m117526a(view, i11);
                                if (imageView2 != null) {
                                    FrameLayout frameLayout = (FrameLayout) view;
                                    i11 = AbstractC6918a0.sliding_tabs;
                                    SlidingTabLayout slidingTabLayout = (SlidingTabLayout) AbstractC22716b.m117526a(view, i11);
                                    if (slidingTabLayout != null) {
                                        i11 = AbstractC6918a0.tvChipLanguage;
                                        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView != null) {
                                            i11 = AbstractC6918a0.viewpager;
                                            ViewPager viewPager = (ViewPager) AbstractC22716b.m117526a(view, i11);
                                            if (viewPager != null) {
                                                return new C29930mc(frameLayout, linearLayout, button, button2, linearLayout2, m117526a, m117526a2, m117526a3, zAppCompatImageView, imageView, imageView2, frameLayout, slidingTabLayout, robotoTextView, viewPager);
                                            }
                                        }
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
    public static C29930mc m148257c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.start_up_new_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148256a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138699p;
    }
}
