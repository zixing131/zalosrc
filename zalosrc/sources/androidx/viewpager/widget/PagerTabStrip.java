package androidx.viewpager.widget;

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

/* loaded from: classes2.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: F */
    private int f8749F;

    /* renamed from: G */
    private int f8750G;

    /* renamed from: H */
    private int f8751H;

    /* renamed from: I */
    private int f8752I;

    /* renamed from: J */
    private int f8753J;

    /* renamed from: K */
    private int f8754K;

    /* renamed from: L */
    private final Paint f8755L;

    /* renamed from: M */
    private final Rect f8756M;

    /* renamed from: N */
    private int f8757N;

    /* renamed from: O */
    private boolean f8758O;

    /* renamed from: P */
    private boolean f8759P;

    /* renamed from: Q */
    private int f8760Q;

    /* renamed from: R */
    private boolean f8761R;

    /* renamed from: S */
    private float f8762S;

    /* renamed from: T */
    private float f8763T;

    /* renamed from: U */
    private int f8764U;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$a */
    /* loaded from: classes2.dex */
    class ViewOnClickListenerC2048a implements View.OnClickListener {
        ViewOnClickListenerC2048a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f8772p.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$b */
    /* loaded from: classes2.dex */
    class ViewOnClickListenerC2049b implements View.OnClickListener {
        ViewOnClickListenerC2049b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f8772p;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f8755L = paint;
        this.f8756M = new Rect();
        this.f8757N = 255;
        this.f8758O = false;
        this.f8759P = false;
        int i11 = this.f8771C;
        this.f8749F = i11;
        paint.setColor(i11);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f8750G = (int) ((3.0f * f11) + 0.5f);
        this.f8751H = (int) ((6.0f * f11) + 0.5f);
        this.f8752I = (int) (64.0f * f11);
        this.f8754K = (int) ((16.0f * f11) + 0.5f);
        this.f8760Q = (int) ((1.0f * f11) + 0.5f);
        this.f8753J = (int) ((f11 * 32.0f) + 0.5f);
        this.f8764U = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f8773q.setFocusable(true);
        this.f8773q.setOnClickListener(new ViewOnClickListenerC2048a());
        this.f8775s.setFocusable(true);
        this.f8775s.setOnClickListener(new ViewOnClickListenerC2049b());
        if (getBackground() == null) {
            this.f8758O = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    /* renamed from: d */
    public void mo11154d(int i11, float f11, boolean z11) {
        Rect rect = this.f8756M;
        int height = getHeight();
        int left = this.f8774r.getLeft() - this.f8754K;
        int right = this.f8774r.getRight() + this.f8754K;
        int i12 = height - this.f8750G;
        rect.set(left, i12, right, height);
        super.mo11154d(i11, f11, z11);
        this.f8757N = (int) (Math.abs(f11 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f8774r.getLeft() - this.f8754K, i12, this.f8774r.getRight() + this.f8754K, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f8758O;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f8753J);
    }

    public int getTabIndicatorColor() {
        return this.f8749F;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f8774r.getLeft() - this.f8754K;
        int right = this.f8774r.getRight() + this.f8754K;
        int i11 = height - this.f8750G;
        this.f8755L.setColor((this.f8757N << 24) | (this.f8749F & 16777215));
        float f11 = height;
        canvas.drawRect(left, i11, right, f11, this.f8755L);
        if (this.f8758O) {
            this.f8755L.setColor((this.f8749F & 16777215) | (-16777216));
            canvas.drawRect(getPaddingLeft(), height - this.f8760Q, getWidth() - getPaddingRight(), f11, this.f8755L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f8761R) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && (Math.abs(x11 - this.f8762S) > this.f8764U || Math.abs(y11 - this.f8763T) > this.f8764U)) {
                    this.f8761R = true;
                }
            } else if (x11 < this.f8774r.getLeft() - this.f8754K) {
                ViewPager viewPager = this.f8772p;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x11 > this.f8774r.getRight() + this.f8754K) {
                ViewPager viewPager2 = this.f8772p;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else {
            this.f8762S = x11;
            this.f8763T = y11;
            this.f8761R = false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        boolean z11;
        super.setBackgroundColor(i11);
        if (!this.f8759P) {
            if ((i11 & (-16777216)) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f8758O = z11;
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        boolean z11;
        super.setBackgroundDrawable(drawable);
        if (!this.f8759P) {
            if (drawable == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f8758O = z11;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        boolean z11;
        super.setBackgroundResource(i11);
        if (!this.f8759P) {
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f8758O = z11;
        }
    }

    public void setDrawFullUnderline(boolean z11) {
        this.f8758O = z11;
        this.f8759P = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        int i15 = this.f8751H;
        if (i14 < i15) {
            i14 = i15;
        }
        super.setPadding(i11, i12, i13, i14);
    }

    public void setTabIndicatorColor(int i11) {
        this.f8749F = i11;
        this.f8755L.setColor(i11);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i11) {
        setTabIndicatorColor(AbstractC1388a.m6961c(getContext(), i11));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i11) {
        int i12 = this.f8752I;
        if (i11 < i12) {
            i11 = i12;
        }
        super.setTextSpacing(i11);
    }
}
