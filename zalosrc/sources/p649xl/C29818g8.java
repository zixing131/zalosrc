package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.recyclerview.ZRecyclerView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.g8 */
/* loaded from: classes3.dex */
public final class C29818g8 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137873p;

    /* renamed from: q */
    public final View f137874q;

    /* renamed from: r */
    public final FrameLayout f137875r;

    /* renamed from: s */
    public final ZRecyclerView f137876s;

    private C29818g8(RelativeLayout relativeLayout, View view, FrameLayout frameLayout, ZRecyclerView zRecyclerView) {
        this.f137873p = relativeLayout;
        this.f137874q = view;
        this.f137875r = frameLayout;
        this.f137876s = zRecyclerView;
    }

    /* renamed from: a */
    public static C29818g8 m147986a(View view) {
        int i11 = AbstractC6918a0.bottom_fake_view;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC6918a0.rvContainer;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.rvMiniProfile;
                ZRecyclerView zRecyclerView = (ZRecyclerView) AbstractC22716b.m117526a(view, i11);
                if (zRecyclerView != null) {
                    return new C29818g8((RelativeLayout) view, m117526a, frameLayout, zRecyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29818g8 m147987c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.mini_user_detail_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147986a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137873p;
    }
}
