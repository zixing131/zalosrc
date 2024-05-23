package p000;

import android.view.View;
import fn0.AbstractC19074t;

/* renamed from: n */
/* loaded from: classes2.dex */
public abstract class AbstractC23494n {
    /* renamed from: a */
    public static final int m123325a(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        return (int) (i11 * view.getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public static final void m123326b(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setVisibility(8);
    }

    /* renamed from: c */
    public static final void m123327c(View view, int i11, int i12) {
        AbstractC19074t.m100208f(view, "<this>");
        view.layout(i12, i11, view.getMeasuredWidth() + i12, view.getMeasuredHeight() + i11);
    }

    /* renamed from: d */
    public static final void m123328d(View view, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(view, "<this>");
        view.measure(View.MeasureSpec.makeMeasureSpec(i11, i12), View.MeasureSpec.makeMeasureSpec(i13, i14));
    }

    /* renamed from: e */
    public static final int m123329e(View view, int i11) {
        AbstractC19074t.m100208f(view, "<this>");
        return view.getResources().getDimensionPixelSize(i11);
    }

    /* renamed from: f */
    public static final void m123330f(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.setVisibility(0);
    }

    /* renamed from: g */
    public static final void m123331g(View view, int i11, int i12) {
        AbstractC19074t.m100208f(view, "<this>");
        view.layout(i12 - view.getMeasuredWidth(), i11, i12, view.getMeasuredHeight() + i11);
    }
}
