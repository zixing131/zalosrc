package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1579n0;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19187j;

/* loaded from: classes2.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: p */
    private boolean f4311p;

    /* renamed from: q */
    private int f4312q;

    /* renamed from: r */
    private int f4313r;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4312q = -1;
        this.f4313r = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.ButtonBarLayout);
        AbstractC1579n0.m7912y0(this, context, AbstractC19187j.ButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        this.f4311p = obtainStyledAttributes.getBoolean(AbstractC19187j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m5268a(int i11) {
        int childCount = getChildCount();
        while (i11 < childCount) {
            if (getChildAt(i11).getVisibility() == 0) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: b */
    private boolean m5269b() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    private void setStacked(boolean z11) {
        int i11;
        int i12;
        setOrientation(z11 ? 1 : 0);
        if (z11) {
            i11 = 5;
        } else {
            i11 = 80;
        }
        setGravity(i11);
        View findViewById = findViewById(AbstractC19183f.spacer);
        if (findViewById != null) {
            if (z11) {
                i12 = 8;
            } else {
                i12 = 4;
            }
            findViewById.setVisibility(i12);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f4313r, super.getMinimumHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004d, code lost:            if (r1 != false) goto L24;     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int i13;
        boolean z11;
        int size = View.MeasureSpec.getSize(i11);
        int i14 = 0;
        if (this.f4311p) {
            if (size > this.f4312q && m5269b()) {
                setStacked(false);
            }
            this.f4312q = size;
        }
        if (!m5269b() && View.MeasureSpec.getMode(i11) == 1073741824) {
            i13 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z11 = true;
        } else {
            i13 = i11;
            z11 = false;
        }
        super.onMeasure(i13, i12);
        if (this.f4311p && !m5269b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
        }
        super.onMeasure(i11, i12);
        int m5268a = m5268a(0);
        if (m5268a >= 0) {
            View childAt = getChildAt(m5268a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m5269b()) {
                int m5268a2 = m5268a(m5268a + 1);
                if (m5268a2 >= 0) {
                    paddingTop += getChildAt(m5268a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i14 = paddingTop;
            } else {
                i14 = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC1579n0.m7814H(this) != i14) {
            setMinimumHeight(i14);
        }
    }

    public void setAllowStacking(boolean z11) {
        if (this.f4311p != z11) {
            this.f4311p = z11;
            if (!z11 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
