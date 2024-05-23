package com.zing.zalo.p077ui.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.SlidingTabLayout;

/* loaded from: classes.dex */
public class SlidingTabStrip extends LinearLayout {

    /* renamed from: A */
    private final C13532a f69631A;

    /* renamed from: B */
    private boolean f69632B;

    /* renamed from: C */
    private boolean f69633C;

    /* renamed from: p */
    private final int f69634p;

    /* renamed from: q */
    private final Paint f69635q;

    /* renamed from: r */
    private final int f69636r;

    /* renamed from: s */
    private final int f69637s;

    /* renamed from: t */
    private final Paint f69638t;

    /* renamed from: u */
    private final int f69639u;

    /* renamed from: v */
    private final Paint f69640v;

    /* renamed from: w */
    private final float f69641w;

    /* renamed from: x */
    private int f69642x;

    /* renamed from: y */
    private float f69643y;

    /* renamed from: z */
    private SlidingTabLayout.InterfaceC13531d f69644z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.ui.widget.SlidingTabStrip$a */
    /* loaded from: classes.dex */
    public static class C13532a implements SlidingTabLayout.InterfaceC13531d {

        /* renamed from: a */
        private int[] f69645a;

        /* renamed from: b */
        private int[] f69646b;

        private C13532a() {
        }

        /* synthetic */ C13532a(AbstractC13649i2 abstractC13649i2) {
            this();
        }

        @Override // com.zing.zalo.p077ui.widget.SlidingTabLayout.InterfaceC13531d
        /* renamed from: a */
        public final int mo39372a(int i11) {
            int[] iArr = this.f69645a;
            return iArr[i11 % iArr.length];
        }

        @Override // com.zing.zalo.p077ui.widget.SlidingTabLayout.InterfaceC13531d
        /* renamed from: b */
        public final int mo39373b(int i11) {
            int[] iArr = this.f69646b;
            return iArr[i11 % iArr.length];
        }

        /* renamed from: c */
        void m75898c(int... iArr) {
            this.f69646b = iArr;
        }

        /* renamed from: d */
        void m75899d(int... iArr) {
            this.f69645a = iArr;
        }
    }

    public SlidingTabStrip(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m75894a(int i11, int i12, float f11) {
        float f12 = 1.0f - f11;
        return Color.rgb((int) ((Color.red(i11) * f11) + (Color.red(i12) * f12)), (int) ((Color.green(i11) * f11) + (Color.green(i12) * f12)), (int) ((Color.blue(i11) * f11) + (Color.blue(i12) * f12)));
    }

    /* renamed from: d */
    private static int m75895d(int i11, byte b11) {
        return Color.argb((int) b11, Color.red(i11), Color.green(i11), Color.blue(i11));
    }

    /* renamed from: b */
    public void m75896b(int i11) {
        boolean z11;
        if (i11 < getChildCount() && getChildAt(i11) != null) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                boolean z12 = true;
                if (i12 == i11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                childAt.setSelected(z11);
                View findViewById = getChildAt(i12).findViewById(AbstractC6918a0.icon);
                if (findViewById == null) {
                    findViewById = getChildAt(i12).findViewById(AbstractC6918a0.tabsText);
                }
                if (findViewById != null) {
                    if (i12 != i11) {
                        z12 = false;
                    }
                    findViewById.setSelected(z12);
                }
            }
        }
    }

    /* renamed from: c */
    public void m75897c(int i11, float f11) {
        this.f69642x = i11;
        this.f69643y = f11;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
            int height = getHeight();
            int childCount = getChildCount();
            float f11 = height;
            int min = (int) (Math.min(Math.max(0.0f, this.f69641w), 1.0f) * f11);
            SlidingTabLayout.InterfaceC13531d interfaceC13531d = this.f69644z;
            if (interfaceC13531d == null) {
                interfaceC13531d = this.f69631A;
            }
            if (childCount > 0) {
                View childAt = getChildAt(this.f69642x);
                int left = childAt.getLeft();
                int right = childAt.getRight();
                int mo39372a = interfaceC13531d.mo39372a(this.f69642x);
                if (this.f69643y > 0.0f && this.f69642x < getChildCount() - 1) {
                    int mo39372a2 = interfaceC13531d.mo39372a(this.f69642x + 1);
                    if (mo39372a != mo39372a2) {
                        mo39372a = m75894a(mo39372a2, mo39372a, this.f69643y);
                    }
                    View childAt2 = getChildAt(this.f69642x + 1);
                    float left2 = this.f69643y * childAt2.getLeft();
                    float f12 = this.f69643y;
                    left = (int) (left2 + ((1.0f - f12) * left));
                    right = (int) ((f12 * childAt2.getRight()) + ((1.0f - this.f69643y) * right));
                }
                this.f69638t.setColor(mo39372a);
                if (this.f69633C) {
                    float f13 = f11 / 2.0f;
                    this.f69638t.setAntiAlias(true);
                    canvas.drawCircle(left + ((right - left) / 2.0f), f13, f13, this.f69638t);
                } else {
                    canvas.drawRect(left, height - this.f69636r, right, height - this.f69637s, this.f69638t);
                }
            }
            if (this.f69632B) {
                int i11 = (height - min) / 2;
                for (int i12 = 0; i12 < childCount - 1; i12++) {
                    View childAt3 = getChildAt(i12);
                    this.f69640v.setColor(interfaceC13531d.mo39373b(i12));
                    canvas.drawLine(childAt3.getRight(), i11, childAt3.getRight(), i11 + min, this.f69640v);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setCircleView(boolean z11) {
        this.f69633C = z11;
        invalidate();
    }

    public void setCustomTabColorizer(SlidingTabLayout.InterfaceC13531d interfaceC13531d) {
        this.f69644z = interfaceC13531d;
        invalidate();
    }

    public void setDividerColors(int... iArr) {
        this.f69644z = null;
        this.f69631A.m75898c(iArr);
        invalidate();
    }

    public void setEnableDivider(boolean z11) {
        this.f69632B = z11;
        invalidate();
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f69644z = null;
        this.f69631A.m75899d(iArr);
        invalidate();
    }

    public SlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69632B = false;
        this.f69633C = false;
        setWillNotDraw(false);
        float f11 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i11 = typedValue.data;
        int m75895d = m75895d(i11, (byte) 38);
        this.f69639u = m75895d;
        C13532a c13532a = new C13532a();
        this.f69631A = c13532a;
        c13532a.m75899d(-1);
        c13532a.m75898c(m75895d(i11, (byte) 33));
        this.f69634p = (int) (2.0f * f11);
        Paint paint = new Paint();
        this.f69635q = paint;
        paint.setColor(m75895d);
        this.f69636r = (int) (4.0f * f11);
        this.f69637s = (int) (f11 * 0.75f);
        this.f69638t = new Paint();
        this.f69641w = 0.5f;
        Paint paint2 = new Paint();
        this.f69640v = paint2;
        paint2.setStrokeWidth(1.0f);
    }
}
