package b20;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import fn0.AbstractC19074t;
import s20.AbstractC26105g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;

/* renamed from: b20.f */
/* loaded from: classes5.dex */
public final class C2500f extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final Paint f10192a;

    public C2500f(Context context) {
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(AbstractC27406a.zch_divider_subtle));
        paint.setStrokeWidth(context.getResources().getDimension(AbstractC27407b.zch_divider_thick));
        this.f10192a = paint;
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
        try {
            int mo10005m = adapter.mo10005m(m9817A0);
            if (mo10005m != 0) {
                if (mo10005m != 3) {
                    if (mo10005m == 4 && m9817A0 == adapter.mo10003k() - 1) {
                        rect.bottom = AbstractC26105g.m134347n(12);
                        return;
                    }
                    return;
                }
                if (m9817A0 == 0) {
                    rect.top = AbstractC26105g.m134347n(1);
                    return;
                } else {
                    rect.top = AbstractC26105g.m134347n(8);
                    return;
                }
            }
            if (m9817A0 == 0) {
                rect.top = AbstractC26105g.m134347n(5);
            }
            if (adapter.mo10003k() - 1 > m9817A0 && adapter.mo10005m(m9817A0 + 1) == 3) {
                rect.bottom = AbstractC26105g.m134347n(12);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: k */
    public void mo10070k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        OverScrollableRecyclerView overScrollableRecyclerView;
        OverScrollableRecyclerView overScrollableRecyclerView2;
        RecyclerView.AbstractC1880g adapter;
        AbstractC19074t.m100208f(canvas, "canvas");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        if (recyclerView instanceof OverScrollableRecyclerView) {
            overScrollableRecyclerView = (OverScrollableRecyclerView) recyclerView;
        } else {
            overScrollableRecyclerView = null;
        }
        if (overScrollableRecyclerView == null || (adapter = (overScrollableRecyclerView2 = (OverScrollableRecyclerView) recyclerView).getAdapter()) == null) {
            return;
        }
        int childCount = overScrollableRecyclerView2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            int m9817A0 = recyclerView.m9817A0(childAt);
            if (adapter.mo10005m(m9817A0) == 3) {
                if (m9817A0 != 0) {
                    float translationY = (childAt.getTranslationY() + overScrollableRecyclerView.getOffsetY()) - AbstractC26105g.m134347n(8);
                    canvas.drawLine(childAt.getPaddingLeft(), childAt.getTop() + translationY, childAt.getRight() - childAt.getPaddingRight(), childAt.getTop() + translationY, this.f10192a);
                    return;
                }
                return;
            }
        }
    }
}
