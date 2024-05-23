package x70;

import ag0.C0843s0;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;
import java.lang.reflect.Field;

/* renamed from: x70.g1 */
/* loaded from: classes6.dex */
public abstract class AbstractC29417g1 {
    /* renamed from: a */
    public static final OverScroller m146573a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            try {
                Field declaredField = RecyclerView.class.getDeclaredField(C0843s0.f2982W);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(recyclerView);
                Field declaredField2 = Class.forName(recyclerView.getClass().getName() + "$ViewFlinger").getDeclaredField("mOverScroller");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(obj);
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type android.widget.OverScroller");
                return (OverScroller) obj2;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
