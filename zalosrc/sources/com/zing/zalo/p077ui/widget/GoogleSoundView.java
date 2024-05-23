package com.zing.zalo.p077ui.widget;

import android.animation.TimeAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.p077ui.widget.SoundView;
import me0.AbstractC23136l9;
import s00.AbstractC26080o;

/* loaded from: classes6.dex */
public class GoogleSoundView extends SoundView {

    /* renamed from: A */
    private Paint f69228A;

    /* renamed from: B */
    private boolean f69229B;

    /* renamed from: C */
    private int f69230C;

    /* renamed from: D */
    private int f69231D;

    /* renamed from: E */
    private float f69232E;

    /* renamed from: F */
    private float f69233F;

    /* renamed from: G */
    private float f69234G;

    /* renamed from: H */
    private float f69235H;

    /* renamed from: I */
    private float f69236I;

    /* renamed from: J */
    private TimeAnimator f69237J;

    /* renamed from: K */
    private int f69238K;

    /* renamed from: q */
    private final int f69239q;

    /* renamed from: r */
    private final int f69240r;

    /* renamed from: s */
    private final int f69241s;

    /* renamed from: t */
    private final int f69242t;

    /* renamed from: u */
    private final int f69243u;

    /* renamed from: v */
    private final int f69244v;

    /* renamed from: w */
    private final int f69245w;

    /* renamed from: x */
    private final int f69246x;

    /* renamed from: y */
    private final int f69247y;

    /* renamed from: z */
    private Paint f69248z;

    /* renamed from: com.zing.zalo.ui.widget.GoogleSoundView$a */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C13501a {

        /* renamed from: a */
        static final /* synthetic */ int[] f69249a;

        static {
            int[] iArr = new int[SoundView.EnumC13533a.values().length];
            f69249a = iArr;
            try {
                iArr[SoundView.EnumC13533a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69249a[SoundView.EnumC13533a.RECORDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69249a[SoundView.EnumC13533a.PREVIEW_FREEHAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69249a[SoundView.EnumC13533a.FREEHAND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f69249a[SoundView.EnumC13533a.PREVIEW_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public GoogleSoundView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m75723d(Context context, AttributeSet attributeSet) {
        int i11;
        int i12;
        float f11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.SoundView, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f69238K = obtainStyledAttributes.getInt(AbstractC8923h0.SoundView_soundViewMode, 0);
            obtainStyledAttributes.recycle();
        }
        setWillNotDraw(false);
        this.f69234G = 0.5f;
        this.f69232E = 0.0f;
        this.f69233F = 0.0f;
        this.f69229B = false;
        this.f69230C = 0;
        Paint paint = new Paint();
        this.f69248z = paint;
        paint.setAntiAlias(true);
        this.f69248z.setDither(true);
        Paint paint2 = this.f69248z;
        if (this.f69238K == 1) {
            i11 = this.f69244v;
        } else {
            i11 = this.f69245w;
        }
        paint2.setColor(i11);
        Paint paint3 = new Paint();
        this.f69228A = paint3;
        if (this.f69238K == 1) {
            i12 = this.f69246x;
        } else {
            i12 = this.f69247y;
        }
        paint3.setColor(i12);
        this.f69228A.setAntiAlias(true);
        this.f69235H = AbstractC23136l9.m118712h(context, 163.0f) / 2;
        if (this.f69238K == 1) {
            f11 = 0.35f;
        } else {
            f11 = 0.4f;
        }
        this.f69236I = f11;
        TimeAnimator timeAnimator = new TimeAnimator();
        this.f69237J = timeAnimator;
        timeAnimator.setRepeatCount(-1);
        this.f69237J.setTimeListener(new TimeAnimator.TimeListener() { // from class: com.zing.zalo.ui.widget.o0
            public /* synthetic */ C13698o0() {
            }

            @Override // android.animation.TimeAnimator.TimeListener
            public final void onTimeUpdate(TimeAnimator timeAnimator2, long j11, long j12) {
                GoogleSoundView.this.m75724e(timeAnimator2, j11, j12);
            }
        });
    }

    /* renamed from: e */
    public /* synthetic */ void m75724e(TimeAnimator timeAnimator, long j11, long j12) {
        invalidate();
    }

    /* renamed from: f */
    private void m75725f() {
        if (!this.f69237J.isStarted()) {
            this.f69237J.start();
        }
    }

    /* renamed from: g */
    private void m75726g() {
        if (this.f69237J.isStarted()) {
            this.f69237J.end();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.SoundView
    /* renamed from: a */
    public void mo75727a() {
        this.f69229B = true;
        setKeepScreenOn(true);
        m75725f();
    }

    @Override // com.zing.zalo.p077ui.widget.SoundView
    /* renamed from: b */
    public void mo75728b() {
        this.f69229B = false;
        setKeepScreenOn(false);
        m75726g();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f69231D = (int) (this.f69234G * (Math.min(getWidth(), getHeight()) / 2));
        float f11 = this.f69233F;
        float f12 = this.f69232E;
        if (f11 <= f12) {
            this.f69232E = f12 * 0.95f;
        } else {
            this.f69232E = f12 + ((f11 - f12) / 4.0f);
        }
        float f13 = this.f69236I;
        float f14 = f13 + (((1.0f - f13) * this.f69232E) / this.f69235H);
        if (this.f69229B) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, f14 * this.f69235H, this.f69248z);
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f69231D, this.f69228A);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        this.f69235H = View.MeasureSpec.getSize(i11) / 2;
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener;
        int width = getWidth();
        int height = getHeight();
        if (motionEvent.getAction() == 1) {
            int i11 = width / 2;
            if (i11 - this.f69231D <= motionEvent.getX()) {
                int i12 = height / 2;
                if (i12 - this.f69231D <= motionEvent.getY() && i11 + this.f69231D >= motionEvent.getX() && i12 + this.f69231D >= motionEvent.getY() && (onTouchListener = this.f69647p) != null) {
                    onTouchListener.onTouch(this, motionEvent);
                }
            }
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.widget.SoundView
    public void setState(SoundView.EnumC13533a enumC13533a) {
        int i11;
        int i12;
        int i13;
        int i14;
        try {
            int i15 = C13501a.f69249a[enumC13533a.ordinal()];
            if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4) {
                if (i15 == 5) {
                    Paint paint = this.f69248z;
                    if (this.f69238K == 1) {
                        i13 = this.f69240r;
                    } else {
                        i13 = this.f69241s;
                    }
                    paint.setColor(i13);
                    Paint paint2 = this.f69228A;
                    if (this.f69238K == 1) {
                        i14 = this.f69242t;
                    } else {
                        i14 = this.f69247y;
                    }
                    paint2.setColor(i14);
                    return;
                }
                return;
            }
            Paint paint3 = this.f69248z;
            if (this.f69238K == 1) {
                i11 = this.f69244v;
            } else {
                i11 = this.f69245w;
            }
            paint3.setColor(i11);
            Paint paint4 = this.f69228A;
            if (this.f69238K == 1) {
                i12 = this.f69246x;
            } else {
                i12 = this.f69247y;
            }
            paint4.setColor(i12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.widget.SoundView
    public void setVolume(int i11) {
        if (i11 > 18000) {
            i11 = 18000;
        } else if (i11 < 5000) {
            i11 = AbstractC26080o.a.f124275b;
        }
        this.f69233F = (i11 * this.f69235H) / 18000.0f;
    }

    public GoogleSoundView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69239q = Color.argb(255, 209, 31, 31);
        this.f69240r = Color.argb(22, 209, 31, 31);
        this.f69241s = Color.argb(25, 252, 74, 74);
        this.f69242t = Color.argb(255, 252, 74, 74);
        this.f69243u = Color.argb(255, 33, 106, 178);
        this.f69244v = Color.argb(112, 33, 106, 178);
        this.f69245w = Color.argb(25, 3, 165, 250);
        this.f69246x = Color.argb(255, 41, 130, 218);
        this.f69247y = Color.argb(0, 255, 255, 255);
        this.f69238K = 1;
        m75723d(context, attributeSet);
    }
}
