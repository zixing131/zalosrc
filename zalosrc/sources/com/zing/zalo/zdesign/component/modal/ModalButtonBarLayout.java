package com.zing.zalo.zdesign.component.modal;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC1579n0;
import bi0.AbstractC2811e;
import bi0.AbstractC2815i;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import com.zing.zalo.zdesign.component.Divider;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class ModalButtonBarLayout extends LinearLayout {
    public static final C17019a Companion = new C17019a(null);

    /* renamed from: p */
    private boolean f87044p;

    /* renamed from: q */
    private int f87045q;

    /* renamed from: r */
    private final int f87046r;

    /* renamed from: s */
    private boolean f87047s;

    /* renamed from: com.zing.zalo.zdesign.component.modal.ModalButtonBarLayout$a */
    /* loaded from: classes7.dex */
    public static final class C17019a {
        private C17019a() {
        }

        public /* synthetic */ C17019a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f87045q = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.ModalButtonBarLayout);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…ble.ModalButtonBarLayout)");
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, AbstractC2815i.ModalButtonBarLayout, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f87044p = obtainStyledAttributes.getBoolean(AbstractC2815i.ModalButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m91096a() {
        int paddingBottom;
        int i11 = 0;
        int m91097b = m91097b(0);
        if (m91097b >= 0) {
            View childAt = getChildAt(m91097b);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            i11 = layoutParams2.bottomMargin + getPaddingTop() + childAt.getMeasuredHeight() + layoutParams2.topMargin;
            if (m91098c()) {
                int m91097b2 = m91097b(m91097b + 1);
                if (m91097b2 >= 0) {
                    paddingBottom = getChildAt(m91097b2).getPaddingTop() + ((int) (16 * getResources().getDisplayMetrics().density));
                }
            } else {
                paddingBottom = getPaddingBottom();
            }
            i11 += paddingBottom;
        }
        if (AbstractC1579n0.m7814H(this) != i11) {
            setMinimumHeight(i11);
        }
    }

    /* renamed from: b */
    private final int m91097b(int i11) {
        int childCount = getChildCount();
        while (i11 < childCount) {
            if (getChildAt(i11).getVisibility() == 0) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: c */
    private final boolean m91098c() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    private final void setStacked(boolean z11) {
        int i11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i12;
        int i13;
        setOrientation(z11 ? 1 : 0);
        if (z11) {
            i11 = 1;
        } else {
            i11 = 80;
        }
        setGravity(i11);
        View findViewById = findViewById(AbstractC2811e.spacer);
        if (findViewById != null) {
            if (z11) {
                i13 = 8;
            } else {
                i13 = 4;
            }
            findViewById.setVisibility(i13);
        }
        boolean z12 = true;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof Divider) {
                if (z11) {
                    if (z12) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    childAt.setVisibility(i12);
                } else {
                    childAt.setVisibility(8);
                }
            }
            if (childAt instanceof ButtonWithProgress) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                if (marginLayoutParams != null) {
                    if (z11) {
                        if (childAt.getVisibility() == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        marginLayoutParams.width = -1;
                        Context context = getContext();
                        AbstractC19074t.m100207e(context, "context");
                        marginLayoutParams.leftMargin = C27276c.m139649b(context, 0);
                    } else {
                        marginLayoutParams.width = -2;
                        Context context2 = getContext();
                        AbstractC19074t.m100207e(context2, "context");
                        marginLayoutParams.leftMargin = C27276c.m139649b(context2, 8);
                    }
                    childAt.setLayoutParams(marginLayoutParams);
                }
            }
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f87046r, super.getMinimumHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:            if (r2 != false) goto L26;     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        boolean z11 = false;
        if (this.f87044p) {
            if (size > this.f87045q && m91098c()) {
                setStacked(false);
            }
            this.f87045q = size;
        }
        if (!m91098c() && View.MeasureSpec.getMode(i11) == 1073741824) {
            i13 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z11 = true;
        } else {
            i13 = i11;
        }
        super.onMeasure(i13, i12);
        if (this.f87044p && !m91098c() && ((getMeasuredWidthAndState() & (-16777216)) == 16777216 || this.f87047s)) {
            setStacked(true);
        }
        super.onMeasure(i11, i12);
        m91096a();
    }

    public final void setUseVerticalLayout(boolean z11) {
        this.f87047s = z11;
        requestLayout();
    }
}
