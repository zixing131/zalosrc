package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes2.dex */
public class C1916i extends RecyclerView.AbstractC1887n {

    /* renamed from: d */
    private static final int[] f8076d = {R.attr.listDivider};

    /* renamed from: a */
    private Drawable f8077a;

    /* renamed from: b */
    private int f8078b;

    /* renamed from: c */
    private final Rect f8079c = new Rect();

    public C1916i(Context context, int i11) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f8076d);
        this.f8077a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        m10511n(i11);
    }

    /* renamed from: l */
    private void m10509l(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i11, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.getLayoutManager().m10111a0(childAt, this.f8079c);
            int round = this.f8079c.right + Math.round(childAt.getTranslationX());
            this.f8077a.setBounds(round - this.f8077a.getIntrinsicWidth(), i11, round, height);
            this.f8077a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: m */
    private void m10510m(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int i11;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i11 = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i11, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i11 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            recyclerView.m9827E0(childAt, this.f8079c);
            int round = this.f8079c.bottom + Math.round(childAt.getTranslationY());
            this.f8077a.setBounds(i11, round - this.f8077a.getIntrinsicHeight(), width, round);
            this.f8077a.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: g */
    public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        Drawable drawable = this.f8077a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f8078b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
    /* renamed from: i */
    public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
        if (recyclerView.getLayoutManager() != null && this.f8077a != null) {
            if (this.f8078b == 1) {
                m10510m(canvas, recyclerView);
            } else {
                m10509l(canvas, recyclerView);
            }
        }
    }

    /* renamed from: n */
    public void m10511n(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f8078b = i11;
    }
}
