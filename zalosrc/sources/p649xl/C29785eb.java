package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.eb */
/* loaded from: classes3.dex */
public final class C29785eb implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137682p;

    /* renamed from: q */
    public final Button f137683q;

    /* renamed from: r */
    public final FrameLayout f137684r;

    /* renamed from: s */
    public final MultiStateView f137685s;

    /* renamed from: t */
    public final RecyclerView f137686t;

    /* renamed from: u */
    public final ZdsActionBar f137687u;

    private C29785eb(RelativeLayout relativeLayout, Button button, FrameLayout frameLayout, MultiStateView multiStateView, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f137682p = relativeLayout;
        this.f137683q = button;
        this.f137684r = frameLayout;
        this.f137685s = multiStateView;
        this.f137686t = recyclerView;
        this.f137687u = zdsActionBar;
    }

    /* renamed from: a */
    public static C29785eb m147903a(View view) {
        int i11 = AbstractC6918a0.btnSelectAll;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.llBottomPanel;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.multi_state_view;
                MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
                if (multiStateView != null) {
                    i11 = AbstractC6918a0.rvLeastInteractedFriend;
                    RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                    if (recyclerView != null) {
                        i11 = AbstractC6918a0.zds_action_bar;
                        ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                        if (zdsActionBar != null) {
                            return new C29785eb((RelativeLayout) view, button, frameLayout, multiStateView, recyclerView, zdsActionBar);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29785eb m147904c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.select_multi_least_interact_friend_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147903a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137682p;
    }
}
