package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.AbstractC1298f;

/* loaded from: classes2.dex */
public class MotionButton extends AppCompatButton {

    /* renamed from: r */
    private float f5388r;

    /* renamed from: s */
    private float f5389s;

    /* renamed from: t */
    private Path f5390t;

    /* renamed from: u */
    ViewOutlineProvider f5391u;

    /* renamed from: v */
    RectF f5392v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    /* loaded from: classes2.dex */
    public class C1286a extends ViewOutlineProvider {
        C1286a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (Math.min(r3, r4) * MotionButton.this.f5388r) / 2.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    /* loaded from: classes2.dex */
    public class C1287b extends ViewOutlineProvider {
        C1287b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f5389s);
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5388r = 0.0f;
        this.f5389s = Float.NaN;
        m6343c(context, attributeSet);
    }

    /* renamed from: c */
    private void m6343c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == AbstractC1298f.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f5389s;
    }

    public float getRoundPercent() {
        return this.f5388r;
    }

    public void setRound(float f11) {
        boolean z11;
        if (Float.isNaN(f11)) {
            this.f5389s = f11;
            float f12 = this.f5388r;
            this.f5388r = -1.0f;
            setRoundPercent(f12);
            return;
        }
        if (this.f5389s != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5389s = f11;
        if (f11 != 0.0f) {
            if (this.f5390t == null) {
                this.f5390t = new Path();
            }
            if (this.f5392v == null) {
                this.f5392v = new RectF();
            }
            if (this.f5391u == null) {
                C1287b c1287b = new C1287b();
                this.f5391u = c1287b;
                setOutlineProvider(c1287b);
            }
            setClipToOutline(true);
            this.f5392v.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f5390t.reset();
            Path path = this.f5390t;
            RectF rectF = this.f5392v;
            float f13 = this.f5389s;
            path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f11) {
        boolean z11;
        if (this.f5388r != f11) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f5388r = f11;
        if (f11 != 0.0f) {
            if (this.f5390t == null) {
                this.f5390t = new Path();
            }
            if (this.f5392v == null) {
                this.f5392v = new RectF();
            }
            if (this.f5391u == null) {
                C1286a c1286a = new C1286a();
                this.f5391u = c1286a;
                setOutlineProvider(c1286a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f5388r) / 2.0f;
            this.f5392v.set(0.0f, 0.0f, width, height);
            this.f5390t.reset();
            this.f5390t.addRoundRect(this.f5392v, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z11) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5388r = 0.0f;
        this.f5389s = Float.NaN;
        m6343c(context, attributeSet);
    }
}
