package com.zing.p058v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.AbstractC1388a;

/* loaded from: classes3.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: F */
    private int f37681F;

    /* renamed from: G */
    private int f37682G;

    /* renamed from: H */
    private int f37683H;

    /* renamed from: I */
    private int f37684I;

    /* renamed from: J */
    private int f37685J;

    /* renamed from: K */
    private int f37686K;

    /* renamed from: L */
    private final Paint f37687L;

    /* renamed from: M */
    private final Rect f37688M;

    /* renamed from: N */
    private int f37689N;

    /* renamed from: O */
    private boolean f37690O;

    /* renamed from: P */
    private boolean f37691P;

    /* renamed from: Q */
    private int f37692Q;

    /* renamed from: R */
    private boolean f37693R;

    /* renamed from: S */
    private float f37694S;

    /* renamed from: T */
    private float f37695T;

    /* renamed from: U */
    private int f37696U;

    /* renamed from: com.zing.v4.view.PagerTabStrip$a */
    /* loaded from: classes3.dex */
    class ViewOnClickListenerC6861a implements View.OnClickListener {
        ViewOnClickListenerC6861a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f37704p.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* renamed from: com.zing.v4.view.PagerTabStrip$b */
    /* loaded from: classes3.dex */
    class ViewOnClickListenerC6862b implements View.OnClickListener {
        ViewOnClickListenerC6862b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f37704p;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f37687L = paint;
        this.f37688M = new Rect();
        this.f37689N = 255;
        this.f37690O = false;
        this.f37691P = false;
        int i11 = this.f37703C;
        this.f37681F = i11;
        paint.setColor(i11);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f37682G = (int) ((3.0f * f11) + 0.5f);
        this.f37683H = (int) ((6.0f * f11) + 0.5f);
        this.f37684I = (int) (64.0f * f11);
        this.f37686K = (int) ((16.0f * f11) + 0.5f);
        this.f37692Q = (int) ((1.0f * f11) + 0.5f);
        this.f37685J = (int) ((f11 * 32.0f) + 0.5f);
        this.f37696U = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f37705q.setFocusable(true);
        this.f37705q.setOnClickListener(new ViewOnClickListenerC6861a());
        this.f37707s.setFocusable(true);
        this.f37707s.setOnClickListener(new ViewOnClickListenerC6862b());
        if (getBackground() == null) {
            this.f37690O = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zing.p058v4.view.PagerTitleStrip
    /* renamed from: d */
    public void mo35297d(int i11, float f11, boolean z11) {
        super.mo35297d(i11, f11, z11);
        this.f37689N = (int) (Math.abs(f11 - 0.5f) * 2.0f * 255.0f);
        invalidate();
    }

    public boolean getDrawFullUnderline() {
        return this.f37690O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.zing.p058v4.view.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f37685J);
    }

    public int getTabIndicatorColor() {
        return this.f37681F;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f37706r.getLeft() - this.f37686K;
        int right = this.f37706r.getRight() + this.f37686K;
        int i11 = height - this.f37682G;
        this.f37687L.setColor((this.f37689N << 24) | (this.f37681F & 16777215));
        float f11 = height;
        canvas.drawRect(left, i11, right, f11, this.f37687L);
        if (this.f37690O) {
            this.f37687L.setColor((this.f37681F & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f37692Q, getWidth() - getPaddingRight(), f11, this.f37687L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f37693R) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x11 - this.f37694S) > this.f37696U || Math.abs(y11 - this.f37695T) > this.f37696U)) {
                    this.f37693R = true;
                }
            } else if (x11 < this.f37706r.getLeft() - this.f37686K) {
                ViewPager viewPager = this.f37704p;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x11 > this.f37706r.getRight() + this.f37686K) {
                ViewPager viewPager2 = this.f37704p;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.f37694S = x11;
            this.f37695T = y11;
            this.f37693R = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        boolean z11;
        super.setBackgroundColor(i11);
        if (!this.f37691P) {
            if ((i11 & (-16777216)) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f37690O = z11;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z11;
        super.setBackgroundDrawable(drawable);
        if (!this.f37691P) {
            if (drawable == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f37690O = z11;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        boolean z11;
        super.setBackgroundResource(i11);
        if (!this.f37691P) {
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f37690O = z11;
        }
    }

    public void setDrawFullUnderline(boolean z11) {
        this.f37690O = z11;
        this.f37691P = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        int i15 = this.f37683H;
        if (i14 < i15) {
            i14 = i15;
        }
        super.setPadding(i11, i12, i13, i14);
    }

    public void setTabIndicatorColor(int i11) {
        this.f37681F = i11;
        this.f37687L.setColor(i11);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i11) {
        setTabIndicatorColor(AbstractC1388a.m6961c(getContext(), i11));
    }

    @Override // com.zing.p058v4.view.PagerTitleStrip
    public void setTextSpacing(int i11) {
        int i12 = this.f37684I;
        if (i11 < i12) {
            i11 = i12;
        }
        super.setTextSpacing(i11);
    }
}
