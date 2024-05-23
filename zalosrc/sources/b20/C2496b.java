package b20;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import v00.AbstractC27407b;

/* renamed from: b20.b */
/* loaded from: classes5.dex */
public final class C2496b extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final InterfaceC18494a f10178a;

    /* renamed from: b */
    private final int f10179b;

    public C2496b(Context context, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "getTopOffset");
        this.f10178a = interfaceC18494a;
        this.f10179b = context.getResources().getDimensionPixelSize(AbstractC27407b.zch_item_video_channel_spacing);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        if (recyclerView.getAdapter() == null) {
            return;
        }
        if (recyclerView.m9817A0(view) < 3) {
            rect.top = ((Number) this.f10178a.mo12V4()).intValue();
        } else {
            rect.top = this.f10179b;
        }
        rect.right = this.f10179b;
    }
}
