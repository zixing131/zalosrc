package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.nb */
/* loaded from: classes3.dex */
public final class C29947nb implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138799p;

    /* renamed from: q */
    public final View f138800q;

    /* renamed from: r */
    public final Badge f138801r;

    /* renamed from: s */
    public final RobotoTextView f138802s;

    /* renamed from: t */
    public final FrameLayout f138803t;

    /* renamed from: u */
    public final FrameLayout f138804u;

    /* renamed from: v */
    public final RecyclerView f138805v;

    /* renamed from: w */
    public final ZdsActionBar f138806w;

    private C29947nb(LinearLayout linearLayout, View view, Badge badge, RobotoTextView robotoTextView, FrameLayout frameLayout, FrameLayout frameLayout2, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f138799p = linearLayout;
        this.f138800q = view;
        this.f138801r = badge;
        this.f138802s = robotoTextView;
        this.f138803t = frameLayout;
        this.f138804u = frameLayout2;
        this.f138805v = recyclerView;
        this.f138806w = zdsActionBar;
    }

    /* renamed from: a */
    public static C29947nb m148289a(View view) {
        int i11 = AbstractC6918a0.add_separator;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC6918a0.blue_dot;
            Badge badge = (Badge) AbstractC22716b.m117526a(view, i11);
            if (badge != null) {
                i11 = AbstractC6918a0.btn_action_warning;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.layout_add_more_rbt;
                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout != null) {
                        i11 = AbstractC6918a0.ll_subscription_warning;
                        FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout2 != null) {
                            i11 = AbstractC6918a0.ring_back_tone_list;
                            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                            if (recyclerView != null) {
                                i11 = AbstractC6918a0.zds_action_bar;
                                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                                if (zdsActionBar != null) {
                                    return new C29947nb((LinearLayout) view, m117526a, badge, robotoTextView, frameLayout, frameLayout2, recyclerView, zdsActionBar);
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
    public static C29947nb m148290c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_call_ring_back_tone, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148289a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138799p;
    }
}
