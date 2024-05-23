package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ja */
/* loaded from: classes3.dex */
public final class C29874ja implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f138294p;

    /* renamed from: q */
    public final SwipeRefreshListView f138295q;

    /* renamed from: r */
    public final ZdsActionBar f138296r;

    private C29874ja(LinearLayout linearLayout, SwipeRefreshListView swipeRefreshListView, ZdsActionBar zdsActionBar) {
        this.f138294p = linearLayout;
        this.f138295q = swipeRefreshListView;
        this.f138296r = zdsActionBar;
    }

    /* renamed from: a */
    public static C29874ja m148124a(View view) {
        int i11 = AbstractC6918a0.rv_quick_message_list;
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) AbstractC22716b.m117526a(view, i11);
        if (swipeRefreshListView != null) {
            i11 = AbstractC6918a0.zds_action_bar;
            ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
            if (zdsActionBar != null) {
                return new C29874ja((LinearLayout) view, swipeRefreshListView, zdsActionBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29874ja m148125c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.quick_message_listing_full_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148124a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f138294p;
    }
}
