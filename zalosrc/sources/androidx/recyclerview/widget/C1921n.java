package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.core.view.AbstractC1579n0;
import p701z1.AbstractC31150c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes2.dex */
public class C1921n implements InterfaceC1920m {

    /* renamed from: a */
    static final InterfaceC1920m f8189a = new C1921n();

    C1921n() {
    }

    /* renamed from: e */
    private static float m10613e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f11 = 0.0f;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = recyclerView.getChildAt(i11);
            if (childAt != view) {
                float m7800A = AbstractC1579n0.m7800A(childAt);
                if (m7800A > f11) {
                    f11 = m7800A;
                }
            }
        }
        return f11;
    }

    @Override // androidx.recyclerview.widget.InterfaceC1920m
    /* renamed from: a */
    public void mo10609a(View view) {
        Object tag = view.getTag(AbstractC31150c.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            AbstractC1579n0.m7817I0(view, ((Float) tag).floatValue());
        }
        view.setTag(AbstractC31150c.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1920m
    /* renamed from: b */
    public void mo10610b(View view) {
    }

    @Override // androidx.recyclerview.widget.InterfaceC1920m
    /* renamed from: c */
    public void mo10611c(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11) {
        if (z11 && view.getTag(AbstractC31150c.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(AbstractC1579n0.m7800A(view));
            AbstractC1579n0.m7817I0(view, m10613e(recyclerView, view) + 1.0f);
            view.setTag(AbstractC31150c.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f11);
        view.setTranslationY(f12);
    }

    @Override // androidx.recyclerview.widget.InterfaceC1920m
    /* renamed from: d */
    public void mo10612d(Canvas canvas, RecyclerView recyclerView, View view, float f11, float f12, int i11, boolean z11) {
    }
}
