package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.KeyboardFrameLayout;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c6 */
/* loaded from: classes3.dex */
public final class C29744c6 implements InterfaceC22715a {

    /* renamed from: p */
    private final KeyboardFrameLayout f137399p;

    /* renamed from: q */
    public final KeyboardFrameLayout f137400q;

    /* renamed from: r */
    public final LinearLayout f137401r;

    /* renamed from: s */
    public final SwipeRefreshListView f137402s;

    private C29744c6(KeyboardFrameLayout keyboardFrameLayout, KeyboardFrameLayout keyboardFrameLayout2, LinearLayout linearLayout, SwipeRefreshListView swipeRefreshListView) {
        this.f137399p = keyboardFrameLayout;
        this.f137400q = keyboardFrameLayout2;
        this.f137401r = linearLayout;
        this.f137402s = swipeRefreshListView;
    }

    /* renamed from: a */
    public static C29744c6 m147804a(View view) {
        KeyboardFrameLayout keyboardFrameLayout = (KeyboardFrameLayout) view;
        int i11 = AbstractC6918a0.main_view;
        LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
        if (linearLayout != null) {
            i11 = AbstractC6918a0.swipe_refresh_layout;
            SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
            if (swipeRefreshListView != null) {
                return new C29744c6(keyboardFrameLayout, keyboardFrameLayout, linearLayout, swipeRefreshListView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29744c6 m147805c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_move_tab_user_timeline_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147804a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyboardFrameLayout getRoot() {
        return this.f137399p;
    }
}
