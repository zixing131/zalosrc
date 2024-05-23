package com.zing.zalo.p077ui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class LineColorPickerView extends View {

    /* renamed from: A */
    public int f69350A;

    /* renamed from: B */
    final int f69351B;

    /* renamed from: C */
    boolean f69352C;

    /* renamed from: D */
    int f69353D;

    /* renamed from: E */
    int f69354E;

    /* renamed from: F */
    int f69355F;

    /* renamed from: G */
    float f69356G;

    /* renamed from: H */
    boolean f69357H;

    /* renamed from: p */
    int f69358p;

    /* renamed from: q */
    float f69359q;

    /* renamed from: r */
    RectF f69360r;

    /* renamed from: s */
    RectF f69361s;

    /* renamed from: t */
    Paint f69362t;

    /* renamed from: u */
    Paint f69363u;

    /* renamed from: v */
    Paint f69364v;

    /* renamed from: w */
    Paint f69365w;

    /* renamed from: x */
    int[] f69366x;

    /* renamed from: y */
    float f69367y;

    /* renamed from: z */
    int f69368z;

    /* renamed from: com.zing.zalo.ui.widget.LineColorPickerView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13509a {
    }

    public LineColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69358p = AbstractC23136l9.m118742r(4.0f);
        this.f69359q = 0.5f;
        this.f69360r = new RectF();
        this.f69361s = new RectF();
        this.f69367y = -1.0f;
        this.f69368z = -1;
        this.f69350A = 0;
        this.f69351B = AbstractC23136l9.m118742r(14.0f);
        this.f69352C = false;
        this.f69353D = 0;
        m75768e();
    }

    /* renamed from: d */
    public static int m75764d(DisplayMetrics displayMetrics, int i11) {
        return (int) ((i11 * displayMetrics.density) + 0.5f);
    }

    /* renamed from: a */
    int m75765a(int i11, int i12, float f11) {
        return i11 + Math.round(f11 * (i12 - i11));
    }

    /* renamed from: b */
    int m75766b(int[] iArr, float f11) {
        if (f11 <= 0.0f) {
            return iArr[0];
        }
        if (f11 >= 1.0f) {
            return iArr[iArr.length - 1];
        }
        float length = f11 * (iArr.length - 1);
        int i11 = (int) length;
        float f12 = length - i11;
        int i12 = iArr[i11];
        int i13 = iArr[i11 + 1];
        return Color.argb(m75765a(Color.alpha(i12), Color.alpha(i13), f12), m75765a(Color.red(i12), Color.red(i13), f12), m75765a(Color.green(i12), Color.green(i13), f12), m75765a(Color.blue(i12), Color.blue(i13), f12));
    }

    /* renamed from: c */
    int m75767c(int[] iArr, int i11) {
        int i12 = this.f69351B;
        return m75766b(iArr, (i11 - i12) / (this.f69355F - (i12 * 2)));
    }

    /* renamed from: e */
    void m75768e() {
        this.f69366x = new int[]{-16776961, -16736257, -16711681, -16711936, -256, -65536, -311520, -65281, -1, -16777216};
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f69362t = new Paint(1);
        Paint paint = new Paint(1);
        this.f69363u = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f69363u.setColor(-1728053248);
        this.f69364v = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f69365w = paint2;
        paint2.setColor(this.f69366x[0]);
        this.f69365w.setStrokeWidth(m75764d(displayMetrics, 3));
        this.f69359q = 1.0f / (displayMetrics.densityDpi / 160.0f);
    }

    /* renamed from: f */
    void m75769f() {
        float f11 = this.f69367y;
        if (f11 != -1.0f) {
            int i11 = this.f69355F;
            int i12 = this.f69351B;
            int i13 = (int) ((f11 * (i11 - (i12 * 2))) + i12);
            this.f69353D = i13;
            if (i13 < i12) {
                this.f69353D = i12;
            } else if (i13 > i11 - i12) {
                this.f69353D = i11 - i12;
            }
            this.f69367y = -1.0f;
            this.f69368z = -1;
            return;
        }
        int i14 = this.f69368z;
        if (i14 != -1) {
            m75770g(i14);
            this.f69368z = -1;
        }
    }

    /* renamed from: g */
    public void m75770g(int i11) {
        int[] iArr;
        try {
            if (this.f69366x != null) {
                int i12 = 0;
                while (true) {
                    iArr = this.f69366x;
                    if (i12 < iArr.length) {
                        if (i11 == iArr[i12]) {
                            break;
                        } else {
                            i12++;
                        }
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 >= 0) {
                    float length = (i12 * 1.0f) / (iArr.length - 1);
                    int i13 = this.f69355F;
                    this.f69353D = (int) ((length * (i13 - (r1 * 2))) + this.f69351B);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public int getColor() {
        return this.f69365w.getColor();
    }

    public float getCurrentPositionPercent() {
        int i11 = this.f69353D;
        int i12 = this.f69351B;
        return (i11 - i12) / (this.f69355F - (i12 * 2));
    }

    public float getDraggingFactor() {
        return this.f69356G;
    }

    public int getVerticalPadding() {
        return AbstractC23136l9.m118742r(28.0f);
    }

    /* renamed from: h */
    void m75771h(boolean z11, boolean z12) {
        float f11;
        if (this.f69357H == z11) {
            return;
        }
        this.f69357H = z11;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        if (z12) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "draggingFactor", this.f69356G, f11);
            ofFloat.setInterpolator(new OvershootInterpolator(1.02f));
            ofFloat.setDuration(300);
            ofFloat.start();
            return;
        }
        setDraggingFactor(f11);
    }

    /* renamed from: i */
    void m75772i(boolean z11) {
        this.f69365w.setColor(m75767c(this.f69366x, this.f69353D));
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(0);
        float m118742r = AbstractC23136l9.m118742r(this.f69359q + 2.0f);
        canvas.drawRoundRect(this.f69361s, m118742r, m118742r, this.f69363u);
        float m118742r2 = AbstractC23136l9.m118742r(2.0f);
        canvas.drawRoundRect(this.f69360r, m118742r2, m118742r2, this.f69362t);
        int centerX = (int) (this.f69360r.centerX() - (this.f69356G * AbstractC23136l9.m118742r(72.0f)));
        int i11 = this.f69353D;
        float m118742r3 = (AbstractC23136l9.m118742r(18.0f) / 2) * (1.0f - this.f69356G);
        this.f69364v.setColor(1711276032);
        float f11 = centerX;
        canvas.drawCircle(f11, AbstractC23136l9.m118742r(1.0f) + i11, m118742r3, this.f69364v);
        this.f69364v.setColor(-1);
        float f12 = i11;
        canvas.drawCircle(f11, f12, m118742r3, this.f69364v);
        float m118742r4 = (AbstractC23136l9.m118742r(7.0f) / 2) * (1.0f - this.f69356G);
        this.f69364v.setColor(this.f69365w.getColor());
        canvas.drawCircle(f11, f12, m118742r4, this.f69364v);
        float m118742r5 = (AbstractC23136l9.m118742r(26.0f) / 2) * this.f69356G;
        this.f69364v.setColor(1711276032);
        canvas.drawCircle(f11, i11 + AbstractC23136l9.m118742r(1.0f), m118742r5, this.f69364v);
        this.f69364v.setColor(-1);
        canvas.drawCircle(f11, f12, m118742r5, this.f69364v);
        float m118742r6 = (AbstractC23136l9.m118742r(23.0f) / 2) * this.f69356G;
        this.f69364v.setColor(this.f69365w.getColor());
        canvas.drawCircle(f11, f12, m118742r6, this.f69364v);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int m118742r = (i14 - i12) - AbstractC23136l9.m118742r(28.0f);
        this.f69360r.set((((i13 - i11) - AbstractC23136l9.m118742r(10.0f)) - AbstractC23136l9.m118742r(18.0f)) + AbstractC23136l9.m118742r((18.0f - ((this.f69359q * 2.0f) + 4.0f)) / 2.0f), AbstractC23136l9.m118742r(14.0f), r6 + this.f69358p, r3 + m118742r);
        int m118742r2 = AbstractC23136l9.m118742r(this.f69359q);
        RectF rectF = this.f69361s;
        RectF rectF2 = this.f69360r;
        float f11 = m118742r2;
        rectF.set(rectF2.left - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AbstractC23136l9.m118742r(114.0f), 1073741824);
        int m118742r = AbstractC23136l9.m118742r((this.f69359q * 2.0f) + 174.0f + 28.0f);
        int i13 = this.f69350A;
        if (i13 > 0 && m118742r > i13) {
            m118742r = i13;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(m118742r, 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f69355F != i12) {
            this.f69362t.setShader(new LinearGradient(0.0f, this.f69351B, 0.0f, i12 - r12, this.f69366x, (float[]) null, Shader.TileMode.CLAMP));
        }
        if (this.f69355F > 0 && this.f69353D > 0) {
            float currentPositionPercent = getCurrentPositionPercent();
            this.f69367y = currentPositionPercent;
            if (currentPositionPercent < 0.0f) {
                this.f69367y = 0.0f;
            }
            if (this.f69367y > 1.0f) {
                this.f69367y = 1.0f;
            }
        }
        this.f69354E = i11;
        this.f69355F = i12;
        m75769f();
        m75772i(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:            if (r3 != 6) goto L28;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int width = getWidth() - AbstractC23136l9.m118742r(46.0f);
        int action = motionEvent.getAction();
        if (action == 0 && motionEvent.getX() < width) {
            return false;
        }
        int y11 = (int) motionEvent.getY();
        this.f69353D = y11;
        int i11 = this.f69351B;
        if (y11 < i11) {
            this.f69353D = i11;
        } else {
            int i12 = this.f69355F;
            if (y11 > i12 - i11) {
                this.f69353D = i12 - i11;
            }
        }
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                    }
                } else {
                    m75771h(true, true);
                    m75772i(false);
                }
            }
            m75771h(false, true);
            this.f69352C = false;
            m75772i(true);
        } else {
            m75771h(true, true);
            this.f69352C = true;
            m75772i(false);
        }
        return true;
    }

    public void setColorDefault(int i11) {
        this.f69368z = i11;
    }

    void setDraggingFactor(float f11) {
        this.f69356G = f11;
        invalidate();
    }

    public void setListener(InterfaceC13509a interfaceC13509a) {
    }

    public void setRestorePosY(float f11) {
        this.f69367y = f11;
        if (f11 != -1.0f) {
            this.f69365w.setColor(m75766b(this.f69366x, f11));
        }
    }
}
