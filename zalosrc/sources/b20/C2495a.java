package b20;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c20.C3226p;
import fn0.AbstractC19074t;

/* renamed from: b20.a */
/* loaded from: classes5.dex */
public final class C2495a extends RecyclerView.AbstractC1887n {
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        if (recyclerView.getAdapter() == null) {
            return;
        }
        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
        if (C3226p.Companion.m16364g()) {
            i11 = (i12 * 2) / 5;
        } else {
            i11 = (i12 * 3) / 4;
        }
        int i13 = (i12 - i11) / 2;
        int i14 = i11 / 40;
        int m9817A0 = recyclerView.m9817A0(view);
        if (m9817A0 == 0) {
            rect.set(i13, 0, i14, 0);
        } else if (m9817A0 == r6.mo10003k() - 1) {
            rect.set(0, 0, i13, 0);
        } else {
            rect.set(0, 0, i14, 0);
        }
    }
}
