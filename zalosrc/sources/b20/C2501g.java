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

/* renamed from: b20.g */
/* loaded from: classes5.dex */
public final class C2501g extends RecyclerView.AbstractC1887n {

    /* renamed from: a */
    private final Paint f10193a;

    public C2501g(Context context) {
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setColor(AbstractC1388a.m6961c(context, AbstractC27406a.zch_layer_background));
        paint.setFlags(1);
        paint.setStyle(Paint.Style.FILL);
        this.f10193a = paint;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        int m9817A0;
        int i11;
        AbstractC19074t.m100208f(rect, "outRect");
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(recyclerView, "parent");
        AbstractC19074t.m100208f(c1899z, "state");
        if (recyclerView.getAdapter() == null || (m9817A0 = recyclerView.m9817A0(view)) == -1) {
            return;
        }
        if (m9817A0 != 0) {
            i11 = AbstractC26105g.m134347n(1);
        } else {
            i11 = 0;
        }
        rect.top = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: i */
    public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        OverScrollableRecyclerView overScrollableRecyclerView;
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
        if (overScrollableRecyclerView != null && ((OverScrollableRecyclerView) recyclerView).getAdapter() != null) {
            Iterator it = AbstractC1595r0.m8168a(recyclerView).iterator();
            while (it.hasNext() && (m9817A0 = recyclerView.m9817A0((view = (View) it.next()))) != -1) {
                if (m9817A0 != 0) {
                    float translationY = view.getTranslationY() + overScrollableRecyclerView.getOffsetY();
                    canvas.drawRect(AbstractC26105g.m134347n(80) + 0.0f, (view.getTop() + translationY) - AbstractC26105g.m134347n(1), ((OverScrollableRecyclerView) recyclerView).getWidth() - AbstractC26105g.m134347n(16), view.getTop() + translationY, this.f10193a);
                }
            }
        }
    }
}
