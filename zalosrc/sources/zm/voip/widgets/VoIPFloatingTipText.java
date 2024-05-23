package zm.voip.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import bp0.AbstractC3104p;
import bp0.AbstractC3105q;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p588vw.C28652r;

/* loaded from: classes7.dex */
public class VoIPFloatingTipText extends FrameLayout {

    /* renamed from: A */
    public int f150128A;

    /* renamed from: B */
    public int f150129B;

    /* renamed from: C */
    public int f150130C;

    /* renamed from: D */
    public int f150131D;

    /* renamed from: E */
    private int f150132E;

    /* renamed from: F */
    private int f150133F;

    /* renamed from: G */
    private float f150134G;

    /* renamed from: H */
    private float f150135H;

    /* renamed from: I */
    private boolean f150136I;

    /* renamed from: p */
    private RobotoTextView f150137p;

    /* renamed from: q */
    private Path f150138q;

    /* renamed from: r */
    private Paint f150139r;

    /* renamed from: s */
    private Paint f150140s;

    /* renamed from: t */
    private int f150141t;

    /* renamed from: u */
    private int f150142u;

    /* renamed from: v */
    private int f150143v;

    /* renamed from: w */
    private int f150144w;

    /* renamed from: x */
    private int f150145x;

    /* renamed from: y */
    public int f150146y;

    /* renamed from: z */
    public int f150147z;

    public VoIPFloatingTipText(Context context) {
        super(context);
        this.f150141t = 25;
        this.f150142u = 25;
        this.f150143v = 1;
        this.f150144w = 2;
        this.f150145x = 30;
        this.f150146y = 10;
        this.f150147z = 10;
        this.f150128A = 10;
        this.f150129B = 10;
        this.f150130C = 0;
        this.f150131D = 0;
        this.f150132E = 0;
        this.f150133F = 0;
        this.f150134G = 0.0f;
        this.f150135H = 0.0f;
        this.f150136I = false;
        m157427b(context);
    }

    /* renamed from: a */
    private Path m157426a(RectF rectF, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        Path path = new Path();
        float f21 = 0.0f;
        if (f11 < 0.0f) {
            f15 = 0.0f;
        } else {
            f15 = f11;
        }
        if (f12 < 0.0f) {
            f16 = 0.0f;
        } else {
            f16 = f12;
        }
        if (f14 < 0.0f) {
            f17 = 0.0f;
        } else {
            f17 = f14;
        }
        if (f13 < 0.0f) {
            f18 = 0.0f;
        } else {
            f18 = f13;
        }
        int i11 = this.f150143v;
        if (i11 == 2) {
            f19 = this.f150141t;
        } else {
            f19 = 0.0f;
        }
        if (i11 == 1) {
            f21 = this.f150141t;
        }
        float f22 = f19 + rectF.left;
        float f23 = rectF.top;
        float f24 = rectF.right - f21;
        float f25 = rectF.bottom;
        float f26 = f25 / 2.0f;
        float f27 = f15 / 2.0f;
        float f28 = f22 + f27;
        path.moveTo(f28, f23);
        float f29 = f16 / 2.0f;
        path.lineTo(f24 - f29, f23);
        path.quadTo(f24, f23, f24, f29 + f23);
        if (this.f150143v == 1) {
            path.lineTo(f24, f26 - this.f150142u);
            path.lineTo(rectF.right, f26);
            path.lineTo(f24, this.f150142u + f26);
        }
        float f31 = f18 / 2.0f;
        path.lineTo(f24, f25 - f31);
        path.quadTo(f24, f25, f24 - f31, f25);
        float f32 = f17 / 2.0f;
        path.lineTo(f22 + f32, f25);
        path.quadTo(f22, f25, f22, f25 - f32);
        if (this.f150143v == 2) {
            path.lineTo(f22, this.f150142u + f26);
            path.lineTo(rectF.left, f26);
            path.lineTo(f22, f26 - this.f150142u);
        }
        path.lineTo(f22, f27 + f23);
        path.quadTo(f22, f23, f28, f23);
        path.close();
        return path;
    }

    /* renamed from: b */
    void m157427b(Context context) {
        setWillNotDraw(false);
        this.f150137p = new RobotoTextView(context);
        this.f150137p.setLayoutParams(AbstractC3105q.m15698a(-2, -2));
        this.f150137p.setGravity(17);
        this.f150137p.setPadding(this.f150129B, this.f150146y, this.f150128A, this.f150147z);
        this.f150137p.setTextSize(1, 14.0f);
        addView(this.f150137p);
        Paint paint = new Paint(1);
        this.f150139r = paint;
        paint.setColor(Color.parseColor("#FFFFFF"));
        this.f150139r.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f150140s = paint2;
        paint2.setColor(Color.parseColor("#0068ff"));
        this.f150140s.setStyle(Paint.Style.STROKE);
        this.f150140s.setStrokeWidth(2.0f);
    }

    /* renamed from: c */
    public void m157428c(float f11, float f12) {
        float m15650a;
        this.f150134G = f11;
        this.f150135H = f12;
        if (f11 < AbstractC3104p.f13190g / 2.0f) {
            m15650a = f11 + AbstractC3104p.m15687s0(false) + AbstractC3104p.m15650a(2.0f);
            setPosition(2);
        } else {
            m15650a = (f11 - this.f150132E) - AbstractC3104p.m15650a(2.0f);
            setPosition(1);
        }
        setTranslationX(m15650a);
        setTranslationY((f12 + (AbstractC3104p.m15636M(false) / 2.0f)) - (this.f150133F / 2.0f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f150138q;
        if (path != null) {
            canvas.drawPath(path, this.f150139r);
            Paint paint = this.f150140s;
            if (paint != null) {
                canvas.drawPath(this.f150138q, paint);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f150130C;
        if (i13 > 0 && size > i13) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f150130C, View.MeasureSpec.getMode(i11));
        }
        super.onMeasure(i11, i12);
        this.f150132E = getMeasuredWidth();
        this.f150133F = getMeasuredHeight();
        if (this.f150136I) {
            m157428c(this.f150134G, this.f150135H);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        RectF rectF = new RectF(AbstractC3104p.m15650a(2.0f) / 2.0f, AbstractC3104p.m15650a(2.0f) / 2.0f, i11 - (AbstractC3104p.m15650a(2.0f) / 2.0f), i12 - (AbstractC3104p.m15650a(2.0f) / 2.0f));
        int i15 = this.f150145x;
        this.f150138q = m157426a(rectF, i15, i15, i15, i15);
    }

    public void setArrowHeight(int i11) {
        this.f150141t = i11;
    }

    public void setArrowWidth(int i11) {
        this.f150142u = i11;
    }

    public void setCorner(int i11) {
        this.f150145x = i11;
    }

    public void setNeedUpdatePosition(boolean z11) {
        this.f150136I = z11;
    }

    public void setPosition(int i11) {
        this.f150143v = i11;
        if (i11 != 1) {
            if (i11 == 2) {
                setPadding(this.f150129B + this.f150141t, this.f150146y, this.f150128A, this.f150147z);
            }
        } else {
            setPadding(this.f150129B, this.f150146y, this.f150128A + this.f150141t, this.f150147z);
        }
        RectF rectF = new RectF(AbstractC3104p.m15650a(this.f150144w) / 2.0f, AbstractC3104p.m15650a(this.f150144w) / 2.0f, getWidth() - (AbstractC3104p.m15650a(2.0f) / 2.0f), getHeight() - (AbstractC3104p.m15650a(2.0f) / 2.0f));
        int i12 = this.f150145x;
        this.f150138q = m157426a(rectF, i12, i12, i12, i12);
        postInvalidate();
    }

    public void setStrokeWidthBorder(int i11) {
        this.f150144w = i11;
    }

    public void setText(CharSequence charSequence) {
        if (!(charSequence instanceof SpannableString)) {
            charSequence = new SpannableString(charSequence);
        }
        this.f150137p.setText(C28652r.m143349v().m143354E((SpannableString) charSequence));
    }

    public void setXAnchorView(float f11) {
        this.f150134G = f11;
    }

    public void setYAnchorView(float f11) {
        this.f150135H = f11;
    }
}
