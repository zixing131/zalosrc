package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.xc */
/* loaded from: classes3.dex */
public final class C30122xc implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f139949p;

    /* renamed from: q */
    public final FrameLayout f139950q;

    /* renamed from: r */
    public final LinearLayout f139951r;

    /* renamed from: s */
    public final LinearLayout f139952s;

    /* renamed from: t */
    public final RobotoTextView f139953t;

    /* renamed from: u */
    public final RobotoTextView f139954u;

    private C30122xc(FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139949p = frameLayout;
        this.f139950q = frameLayout2;
        this.f139951r = linearLayout;
        this.f139952s = linearLayout2;
        this.f139953t = robotoTextView;
        this.f139954u = robotoTextView2;
    }

    /* renamed from: a */
    public static C30122xc m148703a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = AbstractC6918a0.layoutFooterError;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.layoutFooterLoading;
            LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
            if (linearLayout2 != null) {
                i11 = AbstractC6918a0.tv_footer_error_msg;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.tv_footer_error_retry;
                    RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView2 != null) {
                        return new C30122xc(frameLayout, frameLayout, linearLayout, linearLayout2, robotoTextView, robotoTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30122xc m148704c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_archive_footer, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148703a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f139949p;
    }
}
