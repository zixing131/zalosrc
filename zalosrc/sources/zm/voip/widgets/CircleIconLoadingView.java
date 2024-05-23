package zm.voip.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import bp0.AbstractC3104p;
import java.util.ArrayList;
import zm.voip.widgets.CircleIconLoadingView;

/* loaded from: classes7.dex */
public class CircleIconLoadingView extends View {

    /* renamed from: w */
    private static final float f149952w = AbstractC3104p.m15652b(0.7f);

    /* renamed from: x */
    private static final float f149953x = AbstractC3104p.m15652b(0.3f);

    /* renamed from: y */
    private static final int f149954y = AbstractC3104p.m15650a(9.0f);

    /* renamed from: p */
    private ArrayList f149955p;

    /* renamed from: q */
    public ValueAnimator f149956q;

    /* renamed from: r */
    private Paint f149957r;

    /* renamed from: s */
    private int f149958s;

    /* renamed from: t */
    private int f149959t;

    /* renamed from: u */
    private int f149960u;

    /* renamed from: v */
    private boolean f149961v;

    public CircleIconLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149955p = new ArrayList();
        this.f149960u = 0;
        this.f149961v = true;
        this.f149957r = new Paint(1);
        m157302d();
    }

    /* renamed from: d */
    private void m157302d() {
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 7);
        this.f149956q = ofInt;
        ofInt.setInterpolator(new LinearInterpolator());
        this.f149956q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ep0.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircleIconLoadingView.this.m157303e(valueAnimator);
            }
        });
        this.f149956q.setDuration(500L);
        this.f149956q.setRepeatCount(-1);
        this.f149956q.setRepeatMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m157303e(ValueAnimator valueAnimator) {
        int animatedFraction = (int) (valueAnimator.getAnimatedFraction() * 8.0f);
        if (animatedFraction != this.f149960u || this.f149961v) {
            this.f149961v = false;
            this.f149960u = animatedFraction;
            invalidate();
        }
    }

    /* renamed from: f */
    private Point m157304f(Point point) {
        return new Point((int) ((((point.x - this.f149958s) * Math.cos(0.7853981633974483d)) - ((point.y - this.f149959t) * Math.sin(0.7853981633974483d))) + this.f149958s), (int) (((point.x - r4) * Math.sin(0.7853981633974483d)) + ((point.y - this.f149959t) * Math.cos(0.7853981633974483d)) + this.f149959t));
    }

    /* renamed from: b */
    void m157305b(Canvas canvas) {
        ArrayList arrayList = this.f149955p;
        if (arrayList != null && arrayList.size() != 0) {
            this.f149957r.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f149957r.setColor(-1);
            float f11 = f149952w;
            int i11 = this.f149960u;
            for (int i12 = 0; i12 < this.f149955p.size() && i11 < this.f149955p.size(); i12++) {
                Point point = (Point) this.f149955p.get(i11);
                canvas.drawCircle(point.x, point.y, f11, this.f149957r);
                f11 += f149953x;
                i11++;
                if (i11 >= this.f149955p.size()) {
                    i11 = 0;
                }
            }
        }
    }

    /* renamed from: c */
    void m157306c() {
        if (this.f149958s == 0 && this.f149959t == 0) {
            return;
        }
        this.f149955p.clear();
        Point point = new Point(this.f149958s, this.f149959t - f149954y);
        this.f149955p.add(point);
        for (int i11 = 0; i11 < 7; i11++) {
            point = m157304f(point);
            this.f149955p.add(point);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f149956q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m157305b(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f149958s = getWidth() / 2;
        this.f149959t = getHeight() / 2;
        m157306c();
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        if (i11 == 0) {
            this.f149961v = true;
            ValueAnimator valueAnimator = this.f149956q;
            if (valueAnimator != null) {
                valueAnimator.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator2 = this.f149956q;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public CircleIconLoadingView(Context context) {
        super(context);
        this.f149955p = new ArrayList();
        this.f149960u = 0;
        this.f149961v = true;
        this.f149957r = new Paint(1);
        m157302d();
    }
}
