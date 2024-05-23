package zm.voip.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes7.dex */
public class RoundedCallView extends FrameLayout {

    /* renamed from: s */
    private static final int[] f150091s = {1, 2, 4, 8};

    /* renamed from: p */
    private final Path f150092p;

    /* renamed from: q */
    private float f150093q;

    /* renamed from: r */
    private int f150094r;

    public RoundedCallView(Context context) {
        super(context);
        this.f150092p = new Path();
        this.f150093q = 0.0f;
        this.f150094r = 0;
    }

    /* renamed from: b */
    private void m157392b() {
        this.f150092p.reset();
        if (this.f150093q >= 1.0f && this.f150094r != 0) {
            float[] fArr = new float[8];
            for (int i11 = 0; i11 < 4; i11++) {
                if (m157393a(f150091s[i11])) {
                    int i12 = i11 * 2;
                    float f11 = this.f150093q;
                    fArr[i12] = f11;
                    fArr[i12 + 1] = f11;
                }
            }
            this.f150092p.addRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), fArr, Path.Direction.CW);
        }
        this.f150092p.close();
    }

    /* renamed from: a */
    public boolean m157393a(int i11) {
        return (this.f150094r & i11) == i11;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.f150092p);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.clipPath(this.f150092p);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public float getCornerRadius() {
        return this.f150093q;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        m157392b();
    }

    public void setCornerRadius(float f11) {
        if (this.f150093q != f11) {
            this.f150093q = f11;
            m157392b();
            invalidate();
        }
    }

    public void setRoundedCorner(int i11) {
        if (this.f150094r != i11) {
            this.f150094r = i11;
            m157392b();
            invalidate();
        }
    }

    public RoundedCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150092p = new Path();
        this.f150093q = 0.0f;
        this.f150094r = 0;
    }

    public RoundedCallView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f150092p = new Path();
        this.f150093q = 0.0f;
        this.f150094r = 0;
    }
}
