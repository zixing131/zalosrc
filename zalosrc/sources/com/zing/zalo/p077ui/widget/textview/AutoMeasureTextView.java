package com.zing.zalo.p077ui.widget.textview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.p077ui.widget.C13704p1;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class AutoMeasureTextView extends View {

    /* renamed from: A */
    private final RectF f71386A;

    /* renamed from: B */
    private final RectF f71387B;

    /* renamed from: C */
    private boolean f71388C;

    /* renamed from: D */
    private boolean f71389D;

    /* renamed from: E */
    private InterfaceC13795a f71390E;

    /* renamed from: F */
    private final int f71391F;

    /* renamed from: G */
    private float f71392G;

    /* renamed from: H */
    int f71393H;

    /* renamed from: I */
    int f71394I;

    /* renamed from: p */
    private StaticLayout f71395p;

    /* renamed from: q */
    private final C13704p1 f71396q;

    /* renamed from: r */
    private Drawable f71397r;

    /* renamed from: s */
    private CharSequence f71398s;

    /* renamed from: t */
    private boolean f71399t;

    /* renamed from: u */
    private int f71400u;

    /* renamed from: v */
    private int f71401v;

    /* renamed from: w */
    private int f71402w;

    /* renamed from: x */
    private int f71403x;

    /* renamed from: y */
    private int f71404y;

    /* renamed from: z */
    private int f71405z;

    /* renamed from: com.zing.zalo.ui.widget.textview.AutoMeasureTextView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13795a {
        /* renamed from: a */
        void mo43324a(CharSequence charSequence);

        /* renamed from: b */
        void mo43325b();
    }

    public AutoMeasureTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private int m77037a(int i11) {
        int i12;
        Drawable drawable;
        int i13 = this.f71400u + this.f71401v;
        if (!this.f71399t) {
            i13 = 0;
        }
        int paddingLeft = (i11 - getPaddingLeft()) - getPaddingRight();
        int i14 = paddingLeft - i13;
        if (TextUtils.isEmpty(this.f71398s)) {
            this.f71398s = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(this.f71398s, this.f71396q, i14, TextUtils.TruncateAt.END);
        StaticLayout staticLayout = new StaticLayout(ellipsize, this.f71396q, (int) this.f71396q.measureText(ellipsize.toString()), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f71395p = staticLayout;
        int height = staticLayout.getHeight();
        if (this.f71399t) {
            i12 = this.f71400u;
        } else {
            i12 = 0;
        }
        int max = Math.max(height, i12);
        int width = this.f71395p.getWidth();
        this.f71402w = (max - height) / 2;
        int i15 = this.f71393H;
        if (i15 == 2) {
            this.f71403x = i14 - width;
        } else if (i15 == 1) {
            this.f71403x = (paddingLeft - width) / 2;
        } else {
            this.f71403x = 0;
        }
        if (this.f71399t && (drawable = this.f71397r) != null) {
            this.f71404y = (max - this.f71400u) / 2;
            this.f71405z = this.f71403x + width + this.f71401v;
            Rect bounds = drawable.getBounds();
            RectF rectF = this.f71386A;
            int i16 = bounds.left;
            int i17 = this.f71405z;
            int i18 = this.f71391F;
            rectF.left = (i16 + i17) - i18;
            int i19 = bounds.top;
            int i21 = this.f71404y;
            rectF.top = (i19 + i21) - i18;
            rectF.right = bounds.right + i17 + i18;
            rectF.bottom = bounds.bottom + i21 + i18;
        }
        return max + getPaddingTop() + getPaddingBottom();
    }

    public int getFontStyle() {
        return this.f71394I;
    }

    public CharSequence getText() {
        return this.f71398s;
    }

    @Override // android.view.View
    public int getTextAlignment() {
        return this.f71393H;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.save();
        canvas.translate(this.f71403x, this.f71402w);
        this.f71395p.draw(canvas);
        canvas.restore();
        canvas.save();
        if (this.f71399t && this.f71397r != null) {
            canvas.translate(this.f71405z, this.f71404y);
            this.f71397r.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = (int) ((View.MeasureSpec.getSize(i11) * 1.0f) / getScaleX());
        setMeasuredDimension(size, m77037a(size));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC13795a interfaceC13795a;
        InterfaceC13795a interfaceC13795a2;
        int action = motionEvent.getAction();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (action == 1) {
            if (this.f71386A.contains(x11, y11) && this.f71388C && (interfaceC13795a2 = this.f71390E) != null) {
                interfaceC13795a2.mo43325b();
            }
            if (this.f71387B.contains(x11, y11) && this.f71389D && (interfaceC13795a = this.f71390E) != null) {
                interfaceC13795a.mo43324a(this.f71398s);
            }
        } else if (action == 0) {
            this.f71388C = false;
            this.f71389D = false;
            if (this.f71386A.contains(x11, y11) && this.f71399t) {
                this.f71388C = true;
                return true;
            }
            if (this.f71387B.contains(x11, y11)) {
                this.f71389D = true;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(InterfaceC13795a interfaceC13795a) {
        this.f71390E = interfaceC13795a;
    }

    public void setDrawableMarginLeft(int i11) {
        if (this.f71401v != i11) {
            this.f71401v = i11;
            requestLayout();
        }
    }

    public void setDrawableSize(int i11) {
        Drawable drawable;
        if (this.f71400u != i11 && (drawable = this.f71397r) != null) {
            this.f71400u = i11;
            drawable.setBounds(0, 0, i11, i11);
            requestLayout();
        }
    }

    public void setDrawableVisible(boolean z11) {
        this.f71399t = z11;
        requestLayout();
    }

    public void setEditDrawable(Drawable drawable) {
        this.f71397r = drawable;
        if (drawable != null) {
            int i11 = this.f71400u;
            drawable.setBounds(0, 0, i11, i11);
        }
        requestLayout();
    }

    public void setFontStyle(int i11) {
        if (i11 != this.f71394I) {
            this.f71394I = i11;
            if (i11 != 1) {
                this.f71396q.m76612b(5);
            } else {
                this.f71396q.m76612b(7);
            }
            requestLayout();
        }
    }

    public void setText(CharSequence charSequence) {
        CharSequence charSequence2 = this.f71398s;
        if (charSequence2 != charSequence) {
            if (charSequence2 == null || charSequence == null || !charSequence2.equals(charSequence)) {
                if (TextUtils.isEmpty(charSequence)) {
                    charSequence = "";
                }
                this.f71398s = charSequence;
                requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i11) {
        if (i11 != this.f71393H) {
            this.f71393H = i11;
            requestLayout();
        }
    }

    public void setTextColor(int i11) {
        this.f71396q.setColor(i11);
        invalidate();
    }

    public void setTextSize(float f11) {
        float applyDimension = TypedValue.applyDimension(2, f11, getResources().getDisplayMetrics());
        if (this.f71392G != applyDimension) {
            this.f71392G = applyDimension;
            this.f71396q.setTextSize(applyDimension);
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AutoMeasureTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int i12;
        Drawable m118665N;
        this.f71388C = false;
        this.f71389D = false;
        this.f71392G = 0.0f;
        int i13 = AbstractC16803z.icn_userprofile_alias_edit;
        this.f71399t = false;
        this.f71398s = "";
        this.f71393H = 0;
        int i14 = -16777216;
        if (attributeSet != null) {
            try {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.AutoMeasureTextView);
                this.f71392G = obtainStyledAttributes.getDimension(AbstractC8923h0.AutoMeasureTextView_atTextSize, this.f71392G);
                i14 = obtainStyledAttributes.getColor(AbstractC8923h0.AutoMeasureTextView_atTextColor, -16777216);
                i13 = obtainStyledAttributes.getResourceId(AbstractC8923h0.AutoMeasureTextView_atDrawable, i13);
                this.f71399t = obtainStyledAttributes.getBoolean(AbstractC8923h0.AutoMeasureTextView_atDrawableVisible, this.f71399t);
                this.f71393H = obtainStyledAttributes.getInt(AbstractC8923h0.AutoMeasureTextView_atAlignment, this.f71393H);
                i12 = obtainStyledAttributes.getInt(AbstractC8923h0.AutoMeasureTextView_atFontStyle, 0);
                try {
                    obtainStyledAttributes.recycle();
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    this.f71400u = AbstractC23136l9.m118742r(18.0f);
                    this.f71401v = AbstractC23136l9.m118742r(6.0f);
                    this.f71391F = AbstractC23136l9.m118742r(20.0f);
                    m118665N = AbstractC23136l9.m118665N(context, i13);
                    this.f71397r = m118665N;
                    if (m118665N != null) {
                    }
                    C13704p1 c13704p1 = new C13704p1(1);
                    this.f71396q = c13704p1;
                    c13704p1.setTextSize(this.f71392G);
                    c13704p1.setColor(i14);
                    setFontStyle(i12);
                    this.f71386A = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                    this.f71387B = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                }
            } catch (Exception e12) {
                e = e12;
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        this.f71400u = AbstractC23136l9.m118742r(18.0f);
        this.f71401v = AbstractC23136l9.m118742r(6.0f);
        this.f71391F = AbstractC23136l9.m118742r(20.0f);
        m118665N = AbstractC23136l9.m118665N(context, i13);
        this.f71397r = m118665N;
        if (m118665N != null) {
            int i15 = this.f71400u;
            m118665N.setBounds(0, 0, i15, i15);
        }
        C13704p1 c13704p12 = new C13704p1(1);
        this.f71396q = c13704p12;
        c13704p12.setTextSize(this.f71392G);
        c13704p12.setColor(i14);
        setFontStyle(i12);
        this.f71386A = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f71387B = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
