package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.C1490a;
import androidx.core.view.accessibility.C1507g0;
import java.util.Calendar;
import p357n6.AbstractC23581f;
import p664y.AbstractC30228a;

/* loaded from: classes3.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: p */
    private final Calendar f35252p;

    /* renamed from: q */
    private final boolean f35253q;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: classes3.dex */
    class C6295a extends C1490a {
        C6295a() {
        }

        @Override // androidx.core.view.C1490a
        /* renamed from: g */
        public void mo7510g(View view, C1507g0 c1507g0) {
            super.mo7510g(view, c1507g0);
            c1507g0.m7622f0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m32261a(int i11, Rect rect) {
        if (i11 != 33) {
            if (i11 != 130) {
                super.onFocusChanged(true, i11, rect);
                return;
            } else {
                m32262b();
                throw null;
            }
        }
        m32262b();
        throw null;
    }

    /* renamed from: b */
    public AbstractC6301c m32262b() {
        AbstractC30228a.m149044a(super.getAdapter());
        return null;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public /* bridge */ /* synthetic */ ListAdapter getAdapter() {
        m32262b();
        return null;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m32262b();
        throw null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m32262b();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (z11) {
            m32261a(i11, rect);
        } else {
            super.onFocusChanged(false, i11, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (!super.onKeyDown(i11, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1) {
            return true;
        }
        getSelectedItemPosition();
        m32262b();
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f35253q) {
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i11) {
        m32262b();
        throw null;
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f35252p = AbstractC6303e.m32280c();
        if (AbstractC6300b.m32275q1(getContext())) {
            setNextFocusLeftId(AbstractC23581f.cancel_button);
            setNextFocusRightId(AbstractC23581f.confirm_button);
        }
        this.f35253q = AbstractC6300b.m32276r1(getContext());
        AbstractC1579n0.m7801A0(this, new C6295a());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ListAdapter getAdapter2() {
        m32262b();
        return null;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), AbstractC6301c.class.getCanonicalName()));
    }
}
