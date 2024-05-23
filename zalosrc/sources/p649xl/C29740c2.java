package p649xl;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.c2 */
/* loaded from: classes3.dex */
public final class C29740c2 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137384p;

    /* renamed from: q */
    public final RecyclerView f137385q;

    /* renamed from: r */
    public final SwipeRefreshLayout f137386r;

    /* renamed from: s */
    public final ZdsActionBar f137387s;

    private C29740c2(RelativeLayout relativeLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ZdsActionBar zdsActionBar) {
        this.f137384p = relativeLayout;
        this.f137385q = recyclerView;
        this.f137386r = swipeRefreshLayout;
        this.f137387s = zdsActionBar;
    }

    /* renamed from: a */
    public static C29740c2 m147797a(View view) {
        int i11 = AbstractC6918a0.f37905rv;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.swipeRefreshLayout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC22716b.m117526a(view, i11);
            if (swipeRefreshLayout != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C29740c2((RelativeLayout) view, recyclerView, swipeRefreshLayout, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137384p;
    }
}
