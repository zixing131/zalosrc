package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.custom.CustomFrameLayout;
import com.zing.zalo.p077ui.widget.recyclerview.SlidingTabRecyclerView;
import com.zing.zalo.uicomponents.reddot.RedDotImageButton;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.qc */
/* loaded from: classes3.dex */
public final class C30002qc implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139137p;

    /* renamed from: q */
    public final RedDotImageButton f139138q;

    /* renamed from: r */
    public final FrameLayout f139139r;

    /* renamed from: s */
    public final CustomFrameLayout f139140s;

    /* renamed from: t */
    public final FrameLayout f139141t;

    /* renamed from: u */
    public final SlidingTabRecyclerView f139142u;

    /* renamed from: v */
    public final ViewPager2 f139143v;

    private C30002qc(FrameLayout frameLayout, RedDotImageButton redDotImageButton, FrameLayout frameLayout2, CustomFrameLayout customFrameLayout, FrameLayout frameLayout3, SlidingTabRecyclerView slidingTabRecyclerView, ViewPager2 viewPager2) {
        this.f139137p = frameLayout;
        this.f139138q = redDotImageButton;
        this.f139139r = frameLayout2;
        this.f139140s = customFrameLayout;
        this.f139141t = frameLayout3;
        this.f139142u = slidingTabRecyclerView;
        this.f139143v = viewPager2;
    }

    /* renamed from: a */
    public static C30002qc m148414a(View view) {
        int i11 = AbstractC6918a0.goto_store_btn;
        RedDotImageButton redDotImageButton = (RedDotImageButton) AbstractC22716b.m117526a(view, i11);
        if (redDotImageButton != null) {
            i11 = AbstractC6918a0.loading_progress;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.main_root;
                CustomFrameLayout customFrameLayout = (CustomFrameLayout) AbstractC22716b.m117526a(view, i11);
                if (customFrameLayout != null) {
                    i11 = AbstractC6918a0.sticker_indicator_container;
                    FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout2 != null) {
                        i11 = AbstractC6918a0.sticker_list_indicator;
                        SlidingTabRecyclerView slidingTabRecyclerView = (SlidingTabRecyclerView) AbstractC22716b.m117526a(view, i11);
                        if (slidingTabRecyclerView != null) {
                            i11 = AbstractC6918a0.sticker_panel_pager;
                            ViewPager2 viewPager2 = (ViewPager2) AbstractC22716b.m117526a(view, i11);
                            if (viewPager2 != null) {
                                return new C30002qc((FrameLayout) view, redDotImageButton, frameLayout, customFrameLayout, frameLayout2, slidingTabRecyclerView, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30002qc m148415c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sticker_panel_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148414a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139137p;
    }
}
