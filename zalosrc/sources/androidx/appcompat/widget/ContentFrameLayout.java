package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;

/* loaded from: classes2.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: p */
    private TypedValue f4314p;

    /* renamed from: q */
    private TypedValue f4315q;

    /* renamed from: r */
    private TypedValue f4316r;

    /* renamed from: s */
    private TypedValue f4317s;

    /* renamed from: t */
    private TypedValue f4318t;

    /* renamed from: u */
    private TypedValue f4319u;

    /* renamed from: v */
    private final Rect f4320v;

    /* renamed from: w */
    private InterfaceC1111a f4321w;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1111a {
        /* renamed from: a */
        void mo4847a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m5270a(int i11, int i12, int i13, int i14) {
        this.f4320v.set(i11, i12, i13, i14);
        if (AbstractC1579n0.m7865e0(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4318t == null) {
            this.f4318t = new TypedValue();
        }
        return this.f4318t;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4319u == null) {
            this.f4319u = new TypedValue();
        }
        return this.f4319u;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4316r == null) {
            this.f4316r = new TypedValue();
        }
        return this.f4316r;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4317s == null) {
            this.f4317s = new TypedValue();
        }
        return this.f4317s;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4314p == null) {
            this.f4314p = new TypedValue();
        }
        return this.f4314p;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4315q == null) {
            this.f4315q = new TypedValue();
        }
        return this.f4315q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1111a interfaceC1111a = this.f4321w;
        if (interfaceC1111a != null) {
            interfaceC1111a.mo4847a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1111a interfaceC1111a = this.f4321w;
        if (interfaceC1111a != null) {
            interfaceC1111a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i11, int i12) {
        boolean z11;
        boolean z12;
        int measuredWidth;
        TypedValue typedValue;
        int i13;
        int i14;
        float fraction;
        TypedValue typedValue2;
        int i15;
        int i16;
        float fraction2;
        TypedValue typedValue3;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z13 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z11 = true;
        } else {
            z11 = false;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode == Integer.MIN_VALUE) {
            if (z11) {
                typedValue3 = this.f4317s;
            } else {
                typedValue3 = this.f4316r;
            }
            if (typedValue3 != null && (i17 = typedValue3.type) != 0) {
                if (i17 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i17 == 6) {
                    int i19 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i19, i19);
                } else {
                    i18 = 0;
                    if (i18 > 0) {
                        Rect rect = this.f4320v;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i11)), 1073741824);
                        z12 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z11) {
                                typedValue2 = this.f4318t;
                            } else {
                                typedValue2 = this.f4319u;
                            }
                            if (typedValue2 != null && (i15 = typedValue2.type) != 0) {
                                if (i15 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i15 == 6) {
                                    int i21 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction(i21, i21);
                                } else {
                                    i16 = 0;
                                    if (i16 > 0) {
                                        Rect rect2 = this.f4320v;
                                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i12)), 1073741824);
                                    }
                                }
                                i16 = (int) fraction2;
                                if (i16 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i11, i12);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z12 && mode == Integer.MIN_VALUE) {
                            if (!z11) {
                                typedValue = this.f4315q;
                            } else {
                                typedValue = this.f4314p;
                            }
                            if (typedValue != null && (i13 = typedValue.type) != 0) {
                                if (i13 != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (i13 == 6) {
                                    int i22 = displayMetrics.widthPixels;
                                    fraction = typedValue.getFraction(i22, i22);
                                } else {
                                    i14 = 0;
                                    if (i14 > 0) {
                                        Rect rect3 = this.f4320v;
                                        i14 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i14) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                        if (z13) {
                                            super.onMeasure(makeMeasureSpec, i12);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i14 = (int) fraction;
                                if (i14 > 0) {
                                }
                                if (measuredWidth < i14) {
                                }
                            }
                        }
                        z13 = false;
                        if (z13) {
                        }
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                }
            }
        }
        z12 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i11, i12);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z12) {
            if (!z11) {
            }
            if (typedValue != null) {
                if (i13 != 5) {
                }
                i14 = (int) fraction;
                if (i14 > 0) {
                }
                if (measuredWidth < i14) {
                }
            }
        }
        z13 = false;
        if (z13) {
        }
    }

    public void setAttachListener(InterfaceC1111a interfaceC1111a) {
        this.f4321w = interfaceC1111a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4320v = new Rect();
    }
}
