package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.t5 */
/* loaded from: classes3.dex */
public final class C30047t5 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139386p;

    /* renamed from: q */
    public final MultiStateView f139387q;

    /* renamed from: r */
    public final RecyclerView f139388r;

    /* renamed from: s */
    public final ZdsActionBar f139389s;

    private C30047t5(LinearLayout linearLayout, MultiStateView multiStateView, RecyclerView recyclerView, ZdsActionBar zdsActionBar) {
        this.f139386p = linearLayout;
        this.f139387q = multiStateView;
        this.f139388r = recyclerView;
        this.f139389s = zdsActionBar;
    }

    /* renamed from: a */
    public static C30047t5 m148522a(View view) {
        int i11 = AbstractC6918a0.multi_state_view;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.recycler_category_event;
            RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
            if (recyclerView != null) {
                i11 = AbstractC6918a0.zds_action_bar;
                ZdsActionBar zdsActionBar = (ZdsActionBar) AbstractC22716b.m117526a(view, i11);
                if (zdsActionBar != null) {
                    return new C30047t5((LinearLayout) view, multiStateView, recyclerView, zdsActionBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139386p;
    }
}
