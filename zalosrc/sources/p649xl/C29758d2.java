package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.d2 */
/* loaded from: classes3.dex */
public final class C29758d2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137472p;

    /* renamed from: q */
    public final C30125xf f137473q;

    /* renamed from: r */
    public final MultiStateView f137474r;

    /* renamed from: s */
    public final RecyclerView f137475s;

    /* renamed from: t */
    public final LinearLayout f137476t;

    /* renamed from: u */
    public final ZdsActionBar f137477u;

    private C29758d2(LinearLayout linearLayout, C30125xf c30125xf, MultiStateView multiStateView, RecyclerView recyclerView, LinearLayout linearLayout2, ZdsActionBar zdsActionBar) {
        this.f137472p = linearLayout;
        this.f137473q = c30125xf;
        this.f137474r = multiStateView;
        this.f137475s = recyclerView;
        this.f137476t = linearLayout2;
        this.f137477u = zdsActionBar;
    }

    /* renamed from: a */
    public static C29758d2 m147837a(View view) {
        int i11 = AbstractC6918a0.docked_filer;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            C30125xf m148711a = C30125xf.m148711a(m117526a);
            i11 = AbstractC6918a0.multi_state;
            MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
            if (multiStateView != null) {
                i11 = AbstractC6918a0.rcv_users;
                RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                if (recyclerView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i11 = AbstractC6918a0.zds_action_bar;
                    ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                    if (zdsActionBar != null) {
                        return new C29758d2(linearLayout, m148711a, multiStateView, recyclerView, linearLayout, zdsActionBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137472p;
    }
}
