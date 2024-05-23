package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
/* loaded from: classes2.dex */
public abstract class AbstractC1932y {
    /* renamed from: a */
    public static int m10675a(RecyclerView.C1899z c1899z, AbstractC1928u abstractC1928u, View view, View view2, RecyclerView.AbstractC1888o abstractC1888o, boolean z11) {
        if (abstractC1888o.m10110a() != 0 && c1899z.m10253b() != 0 && view != null && view2 != null) {
            if (!z11) {
                return Math.abs(abstractC1888o.m10112b(view) - abstractC1888o.m10112b(view2)) + 1;
            }
            return Math.min(abstractC1928u.mo10657o(), abstractC1928u.mo10646d(view2) - abstractC1928u.mo10649g(view));
        }
        return 0;
    }

    /* renamed from: b */
    public static int m10676b(RecyclerView.C1899z c1899z, AbstractC1928u abstractC1928u, View view, View view2, RecyclerView.AbstractC1888o abstractC1888o, boolean z11, boolean z12) {
        int max;
        if (abstractC1888o.m10110a() == 0 || c1899z.m10253b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(abstractC1888o.m10112b(view), abstractC1888o.m10112b(view2));
        int max2 = Math.max(abstractC1888o.m10112b(view), abstractC1888o.m10112b(view2));
        if (z12) {
            max = Math.max(0, (c1899z.m10253b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z11) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC1928u.mo10646d(view2) - abstractC1928u.mo10649g(view)) / (Math.abs(abstractC1888o.m10112b(view) - abstractC1888o.m10112b(view2)) + 1))) + (abstractC1928u.mo10656n() - abstractC1928u.mo10649g(view)));
    }

    /* renamed from: c */
    public static int m10677c(RecyclerView.C1899z c1899z, AbstractC1928u abstractC1928u, View view, View view2, RecyclerView.AbstractC1888o abstractC1888o, boolean z11) {
        if (abstractC1888o.m10110a() != 0 && c1899z.m10253b() != 0 && view != null && view2 != null) {
            if (!z11) {
                return c1899z.m10253b();
            }
            return (int) (((abstractC1928u.mo10646d(view2) - abstractC1928u.mo10649g(view)) / (Math.abs(abstractC1888o.m10112b(view) - abstractC1888o.m10112b(view2)) + 1)) * c1899z.m10253b());
        }
        return 0;
    }
}
