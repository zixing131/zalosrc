package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.AbstractC1414a;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.internal.AbstractC6356w;
import p013a7.AbstractC0638a;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;
import p706z6.AbstractC31690i;
import p706z6.C31689h;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: j0 */
    private static final int f34822j0 = AbstractC23586k.Widget_MaterialComponents_Toolbar;

    /* renamed from: g0 */
    private Integer f34823g0;

    /* renamed from: h0 */
    private boolean f34824h0;

    /* renamed from: i0 */
    private boolean f34825i0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.toolbarStyle);
    }

    /* renamed from: Q */
    private Pair m31637Q(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i11 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    /* renamed from: R */
    private void m31638R(Context context) {
        int i11;
        Drawable background = getBackground();
        if (background != null && !(background instanceof ColorDrawable)) {
            return;
        }
        C31689h c31689h = new C31689h();
        if (background != null) {
            i11 = ((ColorDrawable) background).getColor();
        } else {
            i11 = 0;
        }
        c31689h.m152442c0(ColorStateList.valueOf(i11));
        c31689h.m152435R(context);
        c31689h.m152441b0(AbstractC1579n0.m7800A(this));
        AbstractC1579n0.m7807D0(this, c31689h);
    }

    /* renamed from: S */
    private void m31639S(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i11 += max;
            i12 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i11, view.getTop(), i12, view.getBottom());
    }

    /* renamed from: T */
    private void m31640T() {
        if (!this.f34824h0 && !this.f34825i0) {
            return;
        }
        TextView m32643c = AbstractC6356w.m32643c(this);
        TextView m32641a = AbstractC6356w.m32641a(this);
        if (m32643c == null && m32641a == null) {
            return;
        }
        Pair m31637Q = m31637Q(m32643c, m32641a);
        if (this.f34824h0 && m32643c != null) {
            m31639S(m32643c, m31637Q);
        }
        if (this.f34825i0 && m32641a != null) {
            m31639S(m32641a, m31637Q);
        }
    }

    /* renamed from: U */
    private Drawable m31641U(Drawable drawable) {
        if (drawable != null && this.f34823g0 != null) {
            Drawable m7200r = AbstractC1414a.m7200r(drawable);
            AbstractC1414a.m7196n(m7200r, this.f34823g0.intValue());
            return m7200r;
        }
        return drawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC31690i.m152469e(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m31640T();
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        AbstractC31690i.m152468d(this, f11);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(m31641U(drawable));
    }

    public void setNavigationIconTint(int i11) {
        this.f34823g0 = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z11) {
        if (this.f34825i0 != z11) {
            this.f34825i0 = z11;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z11) {
        if (this.f34824h0 != z11) {
            this.f34824h0 = z11;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i11) {
        super(AbstractC0638a.m909c(context, attributeSet, i11, r4), attributeSet, i11);
        int i12 = f34822j0;
        Context context2 = getContext();
        TypedArray m32639h = AbstractC6355v.m32639h(context2, attributeSet, AbstractC23587l.MaterialToolbar, i11, i12, new int[0]);
        if (m32639h.hasValue(AbstractC23587l.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(m32639h.getColor(AbstractC23587l.MaterialToolbar_navigationIconTint, -1));
        }
        this.f34824h0 = m32639h.getBoolean(AbstractC23587l.MaterialToolbar_titleCentered, false);
        this.f34825i0 = m32639h.getBoolean(AbstractC23587l.MaterialToolbar_subtitleCentered, false);
        m32639h.recycle();
        m31638R(context2);
    }
}
