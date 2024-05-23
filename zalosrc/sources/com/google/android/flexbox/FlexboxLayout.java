package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.C4005c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements InterfaceC4003a {

    /* renamed from: A */
    private int[] f15813A;

    /* renamed from: B */
    private SparseIntArray f15814B;

    /* renamed from: C */
    private C4005c f15815C;

    /* renamed from: D */
    private List f15816D;

    /* renamed from: E */
    private C4005c.b f15817E;

    /* renamed from: p */
    private int f15818p;

    /* renamed from: q */
    private int f15819q;

    /* renamed from: r */
    private int f15820r;

    /* renamed from: s */
    private int f15821s;

    /* renamed from: t */
    private int f15822t;

    /* renamed from: u */
    private Drawable f15823u;

    /* renamed from: v */
    private Drawable f15824v;

    /* renamed from: w */
    private int f15825w;

    /* renamed from: x */
    private int f15826x;

    /* renamed from: y */
    private int f15827y;

    /* renamed from: z */
    private int f15828z;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private void m18923A(int i11, int i12) {
        this.f15816D.clear();
        this.f15817E.m19004a();
        this.f15815C.m18996d(this.f15817E, i11, i12);
        this.f15816D = this.f15817E.f15880a;
        this.f15815C.m19000k(i11, i12);
        this.f15815C.m18999j(i11, i12, getPaddingLeft() + getPaddingRight());
        this.f15815C.m18992O();
        m18924B(this.f15818p, i11, i12, this.f15817E.f15881b);
    }

    /* renamed from: B */
    private void m18924B(int i11, int i12, int i13, int i14) {
        int sumOfCrossSize;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i11);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i14 = View.combineMeasuredStates(i14, 16777216);
                    }
                    resolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i12, i14);
            }
        } else {
            if (size < largestMainSize) {
                i14 = View.combineMeasuredStates(i14, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i12, i14);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i14 = View.combineMeasuredStates(i14, 256);
                    }
                    resolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                resolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i13, i14);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i14 = View.combineMeasuredStates(i14, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i13, i14);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* renamed from: C */
    private void m18925C() {
        if (this.f15823u == null && this.f15824v == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* renamed from: k */
    private boolean m18926k(int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (((C4004b) this.f15816D.get(i12)).m18959b() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private boolean m18927l(int i11, int i12) {
        for (int i13 = 1; i13 <= i12; i13++) {
            View m18949s = m18949s(i11 - i13);
            if (m18949s != null && m18949s.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    private void m18928m(Canvas canvas, boolean z11, boolean z12) {
        int i11;
        int i12;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f15816D.size();
        for (int i13 = 0; i13 < size; i13++) {
            C4004b c4004b = (C4004b) this.f15816D.get(i13);
            for (int i14 = 0; i14 < c4004b.f15866h; i14++) {
                int i15 = c4004b.f15873o + i14;
                View m18949s = m18949s(i15);
                if (m18949s != null && m18949s.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) m18949s.getLayoutParams();
                    if (m18932u(i15, i14)) {
                        if (z11) {
                            left = m18949s.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        } else {
                            left = (m18949s.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f15828z;
                        }
                        m18931q(canvas, left, c4004b.f15860b, c4004b.f15865g);
                    }
                    if (i14 == c4004b.f15866h - 1 && (this.f15826x & 4) > 0) {
                        if (z11) {
                            right = (m18949s.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f15828z;
                        } else {
                            right = m18949s.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        }
                        m18931q(canvas, right, c4004b.f15860b, c4004b.f15865g);
                    }
                }
            }
            if (m18933v(i13)) {
                if (z12) {
                    i12 = c4004b.f15862d;
                } else {
                    i12 = c4004b.f15860b - this.f15827y;
                }
                m18930p(canvas, paddingLeft, i12, max);
            }
            if (m18934w(i13) && (this.f15825w & 4) > 0) {
                if (z12) {
                    i11 = c4004b.f15860b - this.f15827y;
                } else {
                    i11 = c4004b.f15862d;
                }
                m18930p(canvas, paddingLeft, i11, max);
            }
        }
    }

    /* renamed from: n */
    private void m18929n(Canvas canvas, boolean z11, boolean z12) {
        int i11;
        int i12;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f15816D.size();
        for (int i13 = 0; i13 < size; i13++) {
            C4004b c4004b = (C4004b) this.f15816D.get(i13);
            for (int i14 = 0; i14 < c4004b.f15866h; i14++) {
                int i15 = c4004b.f15873o + i14;
                View m18949s = m18949s(i15);
                if (m18949s != null && m18949s.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) m18949s.getLayoutParams();
                    if (m18932u(i15, i14)) {
                        if (z12) {
                            top = m18949s.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        } else {
                            top = (m18949s.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f15827y;
                        }
                        m18930p(canvas, c4004b.f15859a, top, c4004b.f15865g);
                    }
                    if (i14 == c4004b.f15866h - 1 && (this.f15825w & 4) > 0) {
                        if (z12) {
                            bottom = (m18949s.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f15827y;
                        } else {
                            bottom = m18949s.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        m18930p(canvas, c4004b.f15859a, bottom, c4004b.f15865g);
                    }
                }
            }
            if (m18933v(i13)) {
                if (z11) {
                    i12 = c4004b.f15861c;
                } else {
                    i12 = c4004b.f15859a - this.f15828z;
                }
                m18931q(canvas, i12, paddingTop, max);
            }
            if (m18934w(i13) && (this.f15826x & 4) > 0) {
                if (z11) {
                    i11 = c4004b.f15859a - this.f15828z;
                } else {
                    i11 = c4004b.f15861c;
                }
                m18931q(canvas, i11, paddingTop, max);
            }
        }
    }

    /* renamed from: p */
    private void m18930p(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.f15823u;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, i13 + i11, this.f15827y + i12);
        this.f15823u.draw(canvas);
    }

    /* renamed from: q */
    private void m18931q(Canvas canvas, int i11, int i12, int i13) {
        Drawable drawable = this.f15824v;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i11, i12, this.f15828z + i11, i13 + i12);
        this.f15824v.draw(canvas);
    }

    /* renamed from: u */
    private boolean m18932u(int i11, int i12) {
        if (m18927l(i11, i12)) {
            if (mo18947j()) {
                if ((this.f15826x & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.f15825w & 1) == 0) {
                return false;
            }
            return true;
        }
        if (mo18947j()) {
            if ((this.f15826x & 2) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f15825w & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private boolean m18933v(int i11) {
        if (i11 < 0 || i11 >= this.f15816D.size()) {
            return false;
        }
        if (m18926k(i11)) {
            if (mo18947j()) {
                if ((this.f15825w & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.f15826x & 1) == 0) {
                return false;
            }
            return true;
        }
        if (mo18947j()) {
            if ((this.f15825w & 2) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f15826x & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m18934w(int i11) {
        if (i11 < 0 || i11 >= this.f15816D.size()) {
            return false;
        }
        for (int i12 = i11 + 1; i12 < this.f15816D.size(); i12++) {
            if (((C4004b) this.f15816D.get(i12)).m18959b() > 0) {
                return false;
            }
        }
        if (mo18947j()) {
            if ((this.f15825w & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f15826x & 4) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18935x(boolean z11, int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float f13;
        int i15;
        int i16;
        int i17;
        float f14;
        int i18;
        int i19;
        LayoutParams layoutParams;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = i13 - i11;
        int paddingBottom = (i14 - i12) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f15816D.size();
        int i22 = 0;
        while (i22 < size) {
            C4004b c4004b = (C4004b) this.f15816D.get(i22);
            if (m18933v(i22)) {
                int i23 = this.f15827y;
                paddingBottom -= i23;
                paddingTop += i23;
            }
            int i24 = this.f15820r;
            int i25 = 1;
            if (i24 == 0) {
                f11 = paddingLeft;
                f12 = i21 - paddingRight;
            } else if (i24 == 1) {
                int i26 = c4004b.f15863e;
                f12 = i26 - paddingLeft;
                f11 = (i21 - i26) + paddingRight;
            } else if (i24 == 2) {
                int i27 = c4004b.f15863e;
                f11 = paddingLeft + ((i21 - i27) / 2.0f);
                f12 = (i21 - paddingRight) - ((i21 - i27) / 2.0f);
            } else {
                if (i24 == 3) {
                    f11 = paddingLeft;
                    f13 = (i21 - c4004b.f15863e) / (c4004b.m18959b() != 1 ? r10 - 1 : 1.0f);
                    f12 = i21 - paddingRight;
                } else if (i24 == 4) {
                    int m18959b = c4004b.m18959b();
                    f13 = m18959b != 0 ? (i21 - c4004b.f15863e) / m18959b : 0.0f;
                    float f15 = f13 / 2.0f;
                    f11 = paddingLeft + f15;
                    f12 = (i21 - paddingRight) - f15;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.f15820r);
                }
                float max = Math.max(f13, 0.0f);
                i15 = 0;
                while (i15 < c4004b.f15866h) {
                    int i28 = c4004b.f15873o + i15;
                    View m18949s = m18949s(i28);
                    if (m18949s == null || m18949s.getVisibility() == 8) {
                        i16 = paddingLeft;
                        i17 = i15;
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) m18949s.getLayoutParams();
                        float f16 = f11 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                        float f17 = f12 - ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        if (m18932u(i28, i15)) {
                            int i29 = this.f15828z;
                            float f18 = i29;
                            f16 += f18;
                            i18 = i29;
                            f14 = f17 - f18;
                        } else {
                            f14 = f17;
                            i18 = 0;
                        }
                        if (i15 == c4004b.f15866h - i25 && (this.f15826x & 4) > 0) {
                            i19 = this.f15828z;
                            if (this.f15819q == 2) {
                                i16 = paddingLeft;
                                i17 = i15;
                                layoutParams = layoutParams2;
                                if (z11) {
                                    this.f15815C.m18989H(m18949s, c4004b, Math.round(f14) - m18949s.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + m18949s.getMeasuredHeight());
                                } else {
                                    this.f15815C.m18989H(m18949s, c4004b, Math.round(f16), paddingTop, Math.round(f16) + m18949s.getMeasuredWidth(), paddingTop + m18949s.getMeasuredHeight());
                                }
                            } else if (z11) {
                                i17 = i15;
                                i16 = paddingLeft;
                                layoutParams = layoutParams2;
                                this.f15815C.m18989H(m18949s, c4004b, Math.round(f14) - m18949s.getMeasuredWidth(), paddingBottom - m18949s.getMeasuredHeight(), Math.round(f14), paddingBottom);
                            } else {
                                i16 = paddingLeft;
                                i17 = i15;
                                layoutParams = layoutParams2;
                                this.f15815C.m18989H(m18949s, c4004b, Math.round(f16), paddingBottom - m18949s.getMeasuredHeight(), Math.round(f16) + m18949s.getMeasuredWidth(), paddingBottom);
                            }
                            f11 = f16 + m18949s.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth = f14 - ((m18949s.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (!z11) {
                                c4004b.m18960c(m18949s, i19, 0, i18, 0);
                            } else {
                                c4004b.m18960c(m18949s, i18, 0, i19, 0);
                            }
                            f12 = measuredWidth;
                        }
                        i19 = 0;
                        if (this.f15819q == 2) {
                        }
                        f11 = f16 + m18949s.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        float measuredWidth2 = f14 - ((m18949s.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                        if (!z11) {
                        }
                        f12 = measuredWidth2;
                    }
                    i15 = i17 + 1;
                    paddingLeft = i16;
                    i25 = 1;
                }
                int i31 = paddingLeft;
                int i32 = c4004b.f15865g;
                paddingTop += i32;
                paddingBottom -= i32;
                i22++;
                paddingLeft = i31;
            }
            f13 = 0.0f;
            float max2 = Math.max(f13, 0.0f);
            i15 = 0;
            while (i15 < c4004b.f15866h) {
            }
            int i312 = paddingLeft;
            int i322 = c4004b.f15865g;
            paddingTop += i322;
            paddingBottom -= i322;
            i22++;
            paddingLeft = i312;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016c  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m18936y(boolean z11, boolean z12, int i11, int i12, int i13, int i14) {
        float f11;
        int i15;
        float f12;
        float f13;
        int i16;
        int i17;
        float f14;
        int i18;
        int i19;
        LayoutParams layoutParams;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i21 = i14 - i12;
        int i22 = (i13 - i11) - paddingRight;
        int size = this.f15816D.size();
        for (int i23 = 0; i23 < size; i23++) {
            C4004b c4004b = (C4004b) this.f15816D.get(i23);
            if (m18933v(i23)) {
                int i24 = this.f15828z;
                paddingLeft += i24;
                i22 -= i24;
            }
            int i25 = this.f15820r;
            int i26 = 1;
            if (i25 != 0) {
                if (i25 != 1) {
                    if (i25 != 2) {
                        if (i25 != 3) {
                            if (i25 == 4) {
                                int m18959b = c4004b.m18959b();
                                if (m18959b != 0) {
                                    f13 = (i21 - c4004b.f15863e) / m18959b;
                                } else {
                                    f13 = 0.0f;
                                }
                                float f15 = f13 / 2.0f;
                                f11 = paddingTop + f15;
                                f12 = (i21 - paddingBottom) - f15;
                            } else {
                                throw new IllegalStateException("Invalid justifyContent is set: " + this.f15820r);
                            }
                        } else {
                            f11 = paddingTop;
                            int m18959b2 = c4004b.m18959b();
                            f13 = (i21 - c4004b.f15863e) / (m18959b2 != 1 ? m18959b2 - 1 : 1.0f);
                            f12 = i21 - paddingBottom;
                        }
                    } else {
                        int i27 = c4004b.f15863e;
                        float f16 = paddingTop + ((i21 - i27) / 2.0f);
                        float f17 = (i21 - paddingBottom) - ((i21 - i27) / 2.0f);
                        f13 = 0.0f;
                        f11 = f16;
                        f12 = f17;
                    }
                    float max = Math.max(f13, 0.0f);
                    i16 = 0;
                    while (i16 < c4004b.f15866h) {
                        int i28 = c4004b.f15873o + i16;
                        View m18949s = m18949s(i28);
                        if (m18949s == null || m18949s.getVisibility() == 8) {
                            i17 = i16;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) m18949s.getLayoutParams();
                            float f18 = f11 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
                            float f19 = f12 - ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                            if (m18932u(i28, i16)) {
                                int i29 = this.f15827y;
                                float f21 = i29;
                                f19 -= f21;
                                f14 = f18 + f21;
                                i18 = i29;
                            } else {
                                f14 = f18;
                                i18 = 0;
                            }
                            if (i16 == c4004b.f15866h - i26 && (this.f15825w & 4) > 0) {
                                i19 = this.f15827y;
                                if (!z11) {
                                    if (z12) {
                                        i17 = i16;
                                        layoutParams = layoutParams2;
                                        this.f15815C.m18990I(m18949s, c4004b, true, i22 - m18949s.getMeasuredWidth(), Math.round(f19) - m18949s.getMeasuredHeight(), i22, Math.round(f19));
                                    } else {
                                        i17 = i16;
                                        layoutParams = layoutParams2;
                                        this.f15815C.m18990I(m18949s, c4004b, true, i22 - m18949s.getMeasuredWidth(), Math.round(f14), i22, Math.round(f14) + m18949s.getMeasuredHeight());
                                    }
                                } else {
                                    i17 = i16;
                                    layoutParams = layoutParams2;
                                    if (z12) {
                                        this.f15815C.m18990I(m18949s, c4004b, false, paddingLeft, Math.round(f19) - m18949s.getMeasuredHeight(), paddingLeft + m18949s.getMeasuredWidth(), Math.round(f19));
                                    } else {
                                        this.f15815C.m18990I(m18949s, c4004b, false, paddingLeft, Math.round(f14), paddingLeft + m18949s.getMeasuredWidth(), Math.round(f14) + m18949s.getMeasuredHeight());
                                    }
                                }
                                LayoutParams layoutParams3 = layoutParams;
                                float measuredHeight = f14 + m18949s.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                                f12 = f19 - ((m18949s.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                                if (!z12) {
                                    c4004b.m18960c(m18949s, 0, i19, 0, i18);
                                } else {
                                    c4004b.m18960c(m18949s, 0, i18, 0, i19);
                                }
                                f11 = measuredHeight;
                            }
                            i19 = 0;
                            if (!z11) {
                            }
                            LayoutParams layoutParams32 = layoutParams;
                            float measuredHeight2 = f14 + m18949s.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams32).bottomMargin;
                            f12 = f19 - ((m18949s.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams32).topMargin);
                            if (!z12) {
                            }
                            f11 = measuredHeight2;
                        }
                        i16 = i17 + 1;
                        i26 = 1;
                    }
                    int i31 = c4004b.f15865g;
                    paddingLeft += i31;
                    i22 -= i31;
                } else {
                    int i32 = c4004b.f15863e;
                    f11 = (i21 - i32) + paddingBottom;
                    i15 = i32 - paddingTop;
                }
            } else {
                f11 = paddingTop;
                i15 = i21 - paddingBottom;
            }
            f12 = i15;
            f13 = 0.0f;
            float max2 = Math.max(f13, 0.0f);
            i16 = 0;
            while (i16 < c4004b.f15866h) {
            }
            int i312 = c4004b.f15865g;
            paddingLeft += i312;
            i22 -= i312;
        }
    }

    /* renamed from: z */
    private void m18937z(int i11, int i12) {
        this.f15816D.clear();
        this.f15817E.m19004a();
        this.f15815C.m18995c(this.f15817E, i11, i12);
        this.f15816D = this.f15817E.f15880a;
        this.f15815C.m19000k(i11, i12);
        if (this.f15821s == 3) {
            for (C4004b c4004b : this.f15816D) {
                int i13 = Integer.MIN_VALUE;
                for (int i14 = 0; i14 < c4004b.f15866h; i14++) {
                    View m18949s = m18949s(c4004b.f15873o + i14);
                    if (m18949s != null && m18949s.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) m18949s.getLayoutParams();
                        if (this.f15819q != 2) {
                            i13 = Math.max(i13, m18949s.getMeasuredHeight() + Math.max(c4004b.f15870l - m18949s.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        } else {
                            i13 = Math.max(i13, m18949s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((c4004b.f15870l - m18949s.getMeasuredHeight()) + m18949s.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        }
                    }
                }
                c4004b.f15865g = i13;
            }
        }
        this.f15815C.m18999j(i11, i12, getPaddingTop() + getPaddingBottom());
        this.f15815C.m18992O();
        m18924B(this.f15818p, i11, i12, this.f15817E.f15881b);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: a */
    public void mo18938a(View view, int i11, int i12, C4004b c4004b) {
        if (m18932u(i11, i12)) {
            if (mo18947j()) {
                int i13 = c4004b.f15863e;
                int i14 = this.f15828z;
                c4004b.f15863e = i13 + i14;
                c4004b.f15864f += i14;
                return;
            }
            int i15 = c4004b.f15863e;
            int i16 = this.f15827y;
            c4004b.f15863e = i15 + i16;
            c4004b.f15864f += i16;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.f15814B == null) {
            this.f15814B = new SparseIntArray(getChildCount());
        }
        this.f15813A = this.f15815C.m18998i(view, i11, layoutParams, this.f15814B);
        super.addView(view, i11, layoutParams);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: b */
    public int mo18939b(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: c */
    public View mo18940c(int i11) {
        return getChildAt(i11);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: d */
    public int mo18941d(int i11, int i12, int i13) {
        return ViewGroup.getChildMeasureSpec(i11, i12, i13);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: e */
    public int mo18942e(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: f */
    public void mo18943f(C4004b c4004b) {
        if (mo18947j()) {
            if ((this.f15826x & 4) > 0) {
                int i11 = c4004b.f15863e;
                int i12 = this.f15828z;
                c4004b.f15863e = i11 + i12;
                c4004b.f15864f += i12;
                return;
            }
            return;
        }
        if ((this.f15825w & 4) > 0) {
            int i13 = c4004b.f15863e;
            int i14 = this.f15827y;
            c4004b.f15863e = i13 + i14;
            c4004b.f15864f += i14;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: g */
    public View mo18944g(int i11) {
        return m18949s(i11);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getAlignContent() {
        return this.f15822t;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getAlignItems() {
        return this.f15821s;
    }

    @Nullable
    public Drawable getDividerDrawableHorizontal() {
        return this.f15823u;
    }

    @Nullable
    public Drawable getDividerDrawableVertical() {
        return this.f15824v;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getFlexDirection() {
        return this.f15818p;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C4004b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f15816D.size());
        for (C4004b c4004b : this.f15816D) {
            if (c4004b.m18959b() != 0) {
                arrayList.add(c4004b);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public List<C4004b> getFlexLinesInternal() {
        return this.f15816D;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getFlexWrap() {
        return this.f15819q;
    }

    public int getJustifyContent() {
        return this.f15820r;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getLargestMainSize() {
        Iterator it = this.f15816D.iterator();
        int i11 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i11 = Math.max(i11, ((C4004b) it.next()).f15863e);
        }
        return i11;
    }

    public int getShowDividerHorizontal() {
        return this.f15825w;
    }

    public int getShowDividerVertical() {
        return this.f15826x;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getSumOfCrossSize() {
        int i11;
        int i12;
        int size = this.f15816D.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            C4004b c4004b = (C4004b) this.f15816D.get(i14);
            if (m18933v(i14)) {
                if (mo18947j()) {
                    i12 = this.f15827y;
                } else {
                    i12 = this.f15828z;
                }
                i13 += i12;
            }
            if (m18934w(i14)) {
                if (mo18947j()) {
                    i11 = this.f15827y;
                } else {
                    i11 = this.f15828z;
                }
                i13 += i11;
            }
            i13 += c4004b.f15865g;
        }
        return i13;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: h */
    public void mo18945h(int i11, View view) {
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: i */
    public int mo18946i(View view, int i11, int i12) {
        int i13;
        int i14 = 0;
        if (mo18947j()) {
            if (m18932u(i11, i12)) {
                i14 = this.f15828z;
            }
            if ((this.f15826x & 4) > 0) {
                i13 = this.f15828z;
            } else {
                return i14;
            }
        } else {
            if (m18932u(i11, i12)) {
                i14 = this.f15827y;
            }
            if ((this.f15825w & 4) > 0) {
                i13 = this.f15827y;
            } else {
                return i14;
            }
        }
        return i14 + i13;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: j */
    public boolean mo18947j() {
        int i11 = this.f15818p;
        return i11 == 0 || i11 == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z11;
        boolean z12;
        if (this.f15824v == null && this.f15823u == null) {
            return;
        }
        if (this.f15825w == 0 && this.f15826x == 0) {
            return;
        }
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i11 = this.f15818p;
        boolean z13 = false;
        boolean z14 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        if (layoutDirection == 1) {
                            z13 = true;
                        }
                        if (this.f15819q == 2) {
                            z13 = !z13;
                        }
                        m18929n(canvas, z13, true);
                        return;
                    }
                    return;
                }
                if (layoutDirection != 1) {
                    z14 = false;
                }
                if (this.f15819q == 2) {
                    z14 = !z14;
                }
                m18929n(canvas, z14, false);
                return;
            }
            if (layoutDirection != 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.f15819q == 2) {
                z13 = true;
            }
            m18928m(canvas, z12, z13);
            return;
        }
        if (layoutDirection == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f15819q == 2) {
            z13 = true;
        }
        m18928m(canvas, z11, z13);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int layoutDirection = ViewCompat.getLayoutDirection(this);
        int i15 = this.f15818p;
        boolean z16 = false;
        if (i15 != 0) {
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        if (layoutDirection == 1) {
                            z16 = true;
                        }
                        if (this.f15819q == 2) {
                            z15 = !z16;
                        } else {
                            z15 = z16;
                        }
                        m18936y(z15, true, i11, i12, i13, i14);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f15818p);
                }
                if (layoutDirection == 1) {
                    z16 = true;
                }
                if (this.f15819q == 2) {
                    z14 = !z16;
                } else {
                    z14 = z16;
                }
                m18936y(z14, false, i11, i12, i13, i14);
                return;
            }
            if (layoutDirection != 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            m18935x(z13, i11, i12, i13, i14);
            return;
        }
        if (layoutDirection == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        m18935x(z12, i11, i12, i13, i14);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f15814B == null) {
            this.f15814B = new SparseIntArray(getChildCount());
        }
        if (this.f15815C.m18988F(this.f15814B)) {
            this.f15813A = this.f15815C.m18997h(this.f15814B);
        }
        int i13 = this.f15818p;
        if (i13 != 0 && i13 != 1) {
            if (i13 != 2 && i13 != 3) {
                throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f15818p);
            }
            m18923A(i11, i12);
            return;
        }
        m18937z(i11, i12);
    }

    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: s */
    public View m18949s(int i11) {
        if (i11 >= 0) {
            int[] iArr = this.f15813A;
            if (i11 < iArr.length) {
                return getChildAt(iArr[i11]);
            }
            return null;
        }
        return null;
    }

    public void setAlignContent(int i11) {
        if (this.f15822t != i11) {
            this.f15822t = i11;
            requestLayout();
        }
    }

    public void setAlignItems(int i11) {
        if (this.f15821s != i11) {
            this.f15821s = i11;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@Nullable Drawable drawable) {
        if (drawable == this.f15823u) {
            return;
        }
        this.f15823u = drawable;
        if (drawable != null) {
            this.f15827y = drawable.getIntrinsicHeight();
        } else {
            this.f15827y = 0;
        }
        m18925C();
        requestLayout();
    }

    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        if (drawable == this.f15824v) {
            return;
        }
        this.f15824v = drawable;
        if (drawable != null) {
            this.f15828z = drawable.getIntrinsicWidth();
        } else {
            this.f15828z = 0;
        }
        m18925C();
        requestLayout();
    }

    public void setFlexDirection(int i11) {
        if (this.f15818p != i11) {
            this.f15818p = i11;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public void setFlexLines(List<C4004b> list) {
        this.f15816D = list;
    }

    public void setFlexWrap(int i11) {
        if (this.f15819q != i11) {
            this.f15819q = i11;
            requestLayout();
        }
    }

    public void setJustifyContent(int i11) {
        if (this.f15820r != i11) {
            this.f15820r = i11;
            requestLayout();
        }
    }

    public void setShowDivider(int i11) {
        setShowDividerVertical(i11);
        setShowDividerHorizontal(i11);
    }

    public void setShowDividerHorizontal(int i11) {
        if (i11 != this.f15825w) {
            this.f15825w = i11;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i11) {
        if (i11 != this.f15826x) {
            this.f15826x = i11;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15815C = new C4005c(this);
        this.f15816D = new ArrayList();
        this.f15817E = new C4005c.b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4006d.FlexboxLayout, i11, 0);
        this.f15818p = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_flexDirection, 0);
        this.f15819q = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_flexWrap, 0);
        this.f15820r = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_justifyContent, 0);
        this.f15821s = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_alignItems, 4);
        this.f15822t = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_alignContent, 5);
        Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC4006d.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(AbstractC4006d.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(AbstractC4006d.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i12 = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_showDivider, 0);
        if (i12 != 0) {
            this.f15826x = i12;
            this.f15825w = i12;
        }
        int i13 = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_showDividerVertical, 0);
        if (i13 != 0) {
            this.f15826x = i13;
        }
        int i14 = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_showDividerHorizontal, 0);
        if (i14 != 0) {
            this.f15825w = i14;
        }
        obtainStyledAttributes.recycle();
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C3999a();

        /* renamed from: p */
        private int f15829p;

        /* renamed from: q */
        private float f15830q;

        /* renamed from: r */
        private float f15831r;

        /* renamed from: s */
        private int f15832s;

        /* renamed from: t */
        private float f15833t;

        /* renamed from: u */
        private int f15834u;

        /* renamed from: v */
        private int f15835v;

        /* renamed from: w */
        private int f15836w;

        /* renamed from: x */
        private int f15837x;

        /* renamed from: y */
        private boolean f15838y;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        /* loaded from: classes2.dex */
        static class C3999a implements Parcelable.Creator {
            C3999a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i11) {
                return new LayoutParams[i11];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15829p = 1;
            this.f15830q = 0.0f;
            this.f15831r = 1.0f;
            this.f15832s = -1;
            this.f15833t = -1.0f;
            this.f15836w = 16777215;
            this.f15837x = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4006d.FlexboxLayout_Layout);
            this.f15829p = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_Layout_layout_order, 1);
            this.f15830q = obtainStyledAttributes.getFloat(AbstractC4006d.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f15831r = obtainStyledAttributes.getFloat(AbstractC4006d.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f15832s = obtainStyledAttributes.getInt(AbstractC4006d.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f15833t = obtainStyledAttributes.getFraction(AbstractC4006d.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f15834u = obtainStyledAttributes.getDimensionPixelSize(AbstractC4006d.FlexboxLayout_Layout_layout_minWidth, 0);
            this.f15835v = obtainStyledAttributes.getDimensionPixelSize(AbstractC4006d.FlexboxLayout_Layout_layout_minHeight, 0);
            this.f15836w = obtainStyledAttributes.getDimensionPixelSize(AbstractC4006d.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f15837x = obtainStyledAttributes.getDimensionPixelSize(AbstractC4006d.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f15838y = obtainStyledAttributes.getBoolean(AbstractC4006d.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: A */
        public int mo18910A() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: E */
        public float mo18911E() {
            return this.f15830q;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: G */
        public float mo18912G() {
            return this.f15833t;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: L */
        public boolean mo18913L() {
            return this.f15838y;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: P */
        public int mo18914P() {
            return this.f15836w;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: c0 */
        public int mo18915c0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: d0 */
        public int mo18916d0() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f15829p;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: r */
        public int mo18917r() {
            return this.f15832s;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: s */
        public float mo18918s() {
            return this.f15831r;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: s0 */
        public int mo18919s0() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: v */
        public int mo18920v() {
            return this.f15834u;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: w0 */
        public int mo18921w0() {
            return this.f15835v;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f15829p);
            parcel.writeFloat(this.f15830q);
            parcel.writeFloat(this.f15831r);
            parcel.writeInt(this.f15832s);
            parcel.writeFloat(this.f15833t);
            parcel.writeInt(this.f15834u);
            parcel.writeInt(this.f15835v);
            parcel.writeInt(this.f15836w);
            parcel.writeInt(this.f15837x);
            parcel.writeByte(this.f15838y ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: y0 */
        public int mo18922y0() {
            return this.f15837x;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f15829p = 1;
            this.f15830q = 0.0f;
            this.f15831r = 1.0f;
            this.f15832s = -1;
            this.f15833t = -1.0f;
            this.f15836w = 16777215;
            this.f15837x = 16777215;
            this.f15829p = layoutParams.f15829p;
            this.f15830q = layoutParams.f15830q;
            this.f15831r = layoutParams.f15831r;
            this.f15832s = layoutParams.f15832s;
            this.f15833t = layoutParams.f15833t;
            this.f15834u = layoutParams.f15834u;
            this.f15835v = layoutParams.f15835v;
            this.f15836w = layoutParams.f15836w;
            this.f15837x = layoutParams.f15837x;
            this.f15838y = layoutParams.f15838y;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f15829p = 1;
            this.f15830q = 0.0f;
            this.f15831r = 1.0f;
            this.f15832s = -1;
            this.f15833t = -1.0f;
            this.f15836w = 16777215;
            this.f15837x = 16777215;
        }

        public LayoutParams(int i11, int i12) {
            super(new ViewGroup.LayoutParams(i11, i12));
            this.f15829p = 1;
            this.f15830q = 0.0f;
            this.f15831r = 1.0f;
            this.f15832s = -1;
            this.f15833t = -1.0f;
            this.f15836w = 16777215;
            this.f15837x = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f15829p = 1;
            this.f15830q = 0.0f;
            this.f15831r = 1.0f;
            this.f15832s = -1;
            this.f15833t = -1.0f;
            this.f15836w = 16777215;
            this.f15837x = 16777215;
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f15829p = 1;
            this.f15830q = 0.0f;
            this.f15831r = 1.0f;
            this.f15832s = -1;
            this.f15833t = -1.0f;
            this.f15836w = 16777215;
            this.f15837x = 16777215;
            this.f15829p = parcel.readInt();
            this.f15830q = parcel.readFloat();
            this.f15831r = parcel.readFloat();
            this.f15832s = parcel.readInt();
            this.f15833t = parcel.readFloat();
            this.f15834u = parcel.readInt();
            this.f15835v = parcel.readInt();
            this.f15836w = parcel.readInt();
            this.f15837x = parcel.readInt();
            this.f15838y = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }
}
