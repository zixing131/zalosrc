package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l9 */
/* loaded from: classes3.dex */
public final class C29909l9 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f138589p;

    /* renamed from: q */
    public final RecyclerView f138590q;

    /* renamed from: r */
    public final SwipeRefreshLayout f138591r;

    /* renamed from: s */
    public final ZdsActionBar f138592s;

    private C29909l9(RelativeLayout relativeLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ZdsActionBar zdsActionBar) {
        this.f138589p = relativeLayout;
        this.f138590q = recyclerView;
        this.f138591r = swipeRefreshLayout;
        this.f138592s = zdsActionBar;
    }

    /* renamed from: a */
    public static C29909l9 m148205a(View view) {
        int i11 = AbstractC6918a0.rv_catalog_manage;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.swipe_refresh_layout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC22716b.m117526a(view, i11);
            if (swipeRefreshLayout != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C29909l9((RelativeLayout) view, recyclerView, swipeRefreshLayout, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29909l9 m148206c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_catalog_manage_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148205a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f138589p;
    }
}
