package p649xl;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.zf */
/* loaded from: classes3.dex */
public final class C30159zf implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f140170p;

    /* renamed from: q */
    public final RecyclerView f140171q;

    /* renamed from: r */
    public final SwipeRefreshLayout f140172r;

    /* renamed from: s */
    public final ZdsActionBar f140173s;

    private C30159zf(RelativeLayout relativeLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, ZdsActionBar zdsActionBar) {
        this.f140170p = relativeLayout;
        this.f140171q = recyclerView;
        this.f140172r = swipeRefreshLayout;
        this.f140173s = zdsActionBar;
    }

    /* renamed from: a */
    public static C30159zf m148792a(View view) {
        int i11 = AbstractC6918a0.f37905rv;
        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
        if (recyclerView != null) {
            i11 = AbstractC6918a0.swipeRefreshLayout;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) AbstractC22716b.m117526a(view, i11);
            if (swipeRefreshLayout != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C30159zf((RelativeLayout) view, recyclerView, swipeRefreshLayout, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f140170p;
    }
}
