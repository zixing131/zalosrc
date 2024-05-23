package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.f2 */
/* loaded from: classes3.dex */
public final class C29794f2 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137730p;

    /* renamed from: q */
    public final MultiStateView f137731q;

    /* renamed from: r */
    public final RecyclerView f137732r;

    private C29794f2(LinearLayout linearLayout, MultiStateView multiStateView, RecyclerView recyclerView) {
        this.f137730p = linearLayout;
        this.f137731q = multiStateView;
        this.f137732r = recyclerView;
    }

    /* renamed from: a */
    public static C29794f2 m147928a(View view) {
        int i11 = AbstractC6918a0.multi_state_view;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.recycle_view_collection;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                return new C29794f2((LinearLayout) view, multiStateView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29794f2 m147929c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.collection_listing_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147928a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137730p;
    }
}
