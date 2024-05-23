package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s5 */
/* loaded from: classes3.dex */
public final class C30030s5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139290p;

    /* renamed from: q */
    public final MultiStateView f139291q;

    /* renamed from: r */
    public final RecyclerView f139292r;

    /* renamed from: s */
    public final ZdsActionBar f139293s;

    private C30030s5(LinearLayout linearLayout, MultiStateView multiStateView, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f139290p = linearLayout;
        this.f139291q = multiStateView;
        this.f139292r = recyclerView;
        this.f139293s = zdsActionBar;
    }

    /* renamed from: a */
    public static C30030s5 m148480a(View view) {
        int i11 = AbstractC6918a0.multi_state_view;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.recycler_category_event;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C30030s5((LinearLayout) view, multiStateView, recyclerView, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30030s5 m148481c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_manage_oa_category_info_detail_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148480a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139290p;
    }
}
