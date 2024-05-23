package b20;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import v00.AbstractC27407b;

/* renamed from: b20.h */
/* loaded from: classes5.dex */
public final class C2502h extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final Context f10194a;

    /* renamed from: b */
    private final InterfaceC18494a f10195b;

    /* renamed from: c */
    private final InterfaceC18494a f10196c;

    /* renamed from: d */
    private final int f10197d;

    /* renamed from: e */
    private final int f10198e;

    public C2502h(Context context, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18494a, "getTopOffset");
        AbstractC19074t.m100208f(interfaceC18494a2, "getVisibleHeight");
        this.f10194a = context;
        this.f10195b = interfaceC18494a;
        this.f10196c = interfaceC18494a2;
        this.f10197d = context.getResources().getDimensionPixelSize(AbstractC27407b.zch_page_video_similar_video_margin);
        this.f10198e = context.getResources().getDimensionPixelSize(AbstractC27407b.zch_page_video_similar_error_height);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int m9817A0 = recyclerView.m9817A0(view);
        int mo10005m = adapter.mo10005m(m9817A0);
        if (mo10005m != 0) {
            if (mo10005m == 1) {
                rect.top = ((Number) this.f10195b.mo12V4()).intValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = Math.max(this.f10198e, ((Number) this.f10196c.mo12V4()).intValue() - ((Number) this.f10195b.mo12V4()).intValue());
                    view.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            return;
        }
        if (m9817A0 < 2) {
            rect.top = ((Number) this.f10195b.mo12V4()).intValue();
        }
        if (m9817A0 % 2 == 0) {
            rect.left = this.f10197d;
        } else {
            rect.right = this.f10197d;
        }
    }
}
