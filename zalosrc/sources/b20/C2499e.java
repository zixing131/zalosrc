package b20;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import androidx.core.view.AbstractC1595r0;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import fn0.AbstractC19074t;
import java.util.Iterator;
import p148f3.C18711c;
import s20.AbstractC26105g;
import v00.AbstractC27406a;

/* renamed from: b20.e */
/* loaded from: classes5.dex */
public final class C2499e extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final Paint f10191a;

    public C2499e(Context context) {
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setColor(AbstractC1388a.m6961c(context, AbstractC27406a.zch_surface_background));
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f10191a = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int m9817A0;
        Integer num;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
        if (adapter == null || (m9817A0 = recyclerView.m9817A0(view)) == -1) {
            return;
        }
        int mo10005m = adapter.mo10005m(m9817A0);
        int i11 = 0;
        if (mo10005m != 0) {
            if (mo10005m == 1) {
                int i12 = m9817A0 + 1;
                if (i12 < adapter.mo10003k()) {
                    num = Integer.valueOf(adapter.mo10005m(i12));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    i11 = AbstractC26105g.m134347n(12);
                }
                rect.bottom = i11;
                return;
            }
            return;
        }
        if (m9817A0 != 0) {
            i11 = AbstractC26105g.m134347n(12);
        }
        rect.top = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: i */
    public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        OverScrollableRecyclerView overScrollableRecyclerView;
        RecyclerView.AbstractC1880g adapter;
        View view;
        int m9817A0;
        AbstractC19074t.m100208f(canvas, C18711c.f94014e);
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        if (recyclerView instanceof OverScrollableRecyclerView) {
            overScrollableRecyclerView = (OverScrollableRecyclerView) recyclerView;
        } else {
            overScrollableRecyclerView = null;
        }
        if (overScrollableRecyclerView != null && (adapter = ((OverScrollableRecyclerView) recyclerView).getAdapter()) != null) {
            Iterator it = AbstractC1595r0.m8168a(recyclerView).iterator();
            while (it.hasNext() && (m9817A0 = recyclerView.m9817A0((view = (View) it.next()))) != -1) {
                if (adapter.mo10005m(m9817A0) == 0 && m9817A0 != 0) {
                    float translationY = view.getTranslationY() + overScrollableRecyclerView.getOffsetY();
                    canvas.drawRect(0.0f, (view.getTop() + translationY) - AbstractC26105g.m134347n(12), ((OverScrollableRecyclerView) recyclerView).getWidth(), view.getTop() + translationY, this.f10191a);
                }
            }
        }
    }
}
