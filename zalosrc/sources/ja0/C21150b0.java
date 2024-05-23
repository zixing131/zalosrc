package ja0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import p612wk.AbstractC29069a;

/* renamed from: ja0.b0 */
/* loaded from: classes6.dex */
public final class C21150b0 extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final InterfaceC18319c f103237I;

    /* renamed from: J */
    private final MultiStateView f103238J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21150b0(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.search_global_result_item_multi_state, viewGroup, false));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f103237I = interfaceC18319c;
        View view = this.f7784p;
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.ui.zviews.multistate.MultiStateView");
        MultiStateView multiStateView = (MultiStateView) view;
        this.f103238J = multiStateView;
        multiStateView.setEmptyViewString(multiStateView.getResources().getString(AbstractC8020f0.str_emptyResult));
    }

    /* renamed from: i0 */
    public final void m109642i0(AbstractC29069a.d dVar) {
        AbstractC19074t.m100208f(dVar, "data");
        if (dVar instanceof AbstractC29069a.d.c) {
            this.f103238J.setState(MultiStateView.EnumC15914e.EMPTY);
        } else if (dVar instanceof AbstractC29069a.d.b) {
            this.f103238J.setState(MultiStateView.EnumC15914e.FULL_EMPTY);
        }
    }
}
