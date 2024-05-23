package p509sp;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* renamed from: sp.l */
/* loaded from: classes4.dex */
public abstract class AbstractC26363l {
    /* renamed from: b */
    public static final void m135708b(final RecyclerView recyclerView, final int i11) {
        AbstractC19074t.m100208f(recyclerView, "<this>");
        recyclerView.m9866X1();
        if (!m135710d(recyclerView, i11)) {
            recyclerView.m9837K1(i11);
            recyclerView.post(new Runnable() { // from class: sp.k
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26363l.m135709c(RecyclerView.this, i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m135709c(RecyclerView recyclerView, int i11) {
        AbstractC19074t.m100208f(recyclerView, "$this_scrollSelectedFilterCategoryToCenter");
        m135710d(recyclerView, i11);
    }

    /* renamed from: d */
    private static final boolean m135710d(RecyclerView recyclerView, int i11) {
        View view;
        RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.mo9732P(i11);
        } else {
            view = null;
        }
        if (view == null || recyclerView.getWidth() <= 0) {
            return false;
        }
        recyclerView.m9845O1(view.getLeft() - ((recyclerView.getWidth() - view.getWidth()) / 2), 0);
        return true;
    }
}
