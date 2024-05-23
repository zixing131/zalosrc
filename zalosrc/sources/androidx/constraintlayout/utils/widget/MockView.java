package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.AbstractC1298f;

/* loaded from: classes2.dex */
public class MockView extends View {

    /* renamed from: p */
    private Paint f5377p;

    /* renamed from: q */
    private Paint f5378q;

    /* renamed from: r */
    private Paint f5379r;

    /* renamed from: s */
    private boolean f5380s;

    /* renamed from: t */
    private boolean f5381t;

    /* renamed from: u */
    protected String f5382u;

    /* renamed from: v */
    private Rect f5383v;

    /* renamed from: w */
    private int f5384w;

    /* renamed from: x */
    private int f5385x;

    /* renamed from: y */
    private int f5386y;

    /* renamed from: z */
    private int f5387z;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5377p = new Paint();
        this.f5378q = new Paint();
        this.f5379r = new Paint();
        this.f5380s = true;
        this.f5381t = true;
        this.f5382u = null;
        this.f5383v = new Rect();
        this.f5384w = Color.argb(255, 0, 0, 0);
        this.f5385x = Color.argb(255, 200, 200, 200);
        this.f5386y = Color.argb(255, 50, 50, 50);
        this.f5387z = 4;
        m6340a(context, attributeSet);
    }

    /* renamed from: a */
    private void m6340a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.MockView_mock_label) {
                    this.f5382u = obtainStyledAttributes.getString(index);
                } else if (index == AbstractC1298f.MockView_mock_showDiagonals) {
                    this.f5380s = obtainStyledAttributes.getBoolean(index, this.f5380s);
                } else if (index == AbstractC1298f.MockView_mock_diagonalsColor) {
                    this.f5384w = obtainStyledAttributes.getColor(index, this.f5384w);
                } else if (index == AbstractC1298f.MockView_mock_labelBackgroundColor) {
                    this.f5386y = obtainStyledAttributes.getColor(index, this.f5386y);
                } else if (index == AbstractC1298f.MockView_mock_labelColor) {
                    this.f5385x = obtainStyledAttributes.getColor(index, this.f5385x);
                } else if (index == AbstractC1298f.MockView_mock_showLabel) {
                    this.f5381t = obtainStyledAttributes.getBoolean(index, this.f5381t);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f5382u == null) {
            try {
                this.f5382u = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f5377p.setColor(this.f5384w);
        this.f5377p.setAntiAlias(true);
        this.f5378q.setColor(this.f5385x);
        this.f5378q.setAntiAlias(true);
        this.f5379r.setColor(this.f5386y);
        this.f5387z = Math.round(this.f5387z * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f5380s) {
            width--;
            height--;
            float f11 = width;
            float f12 = height;
            canvas.drawLine(0.0f, 0.0f, f11, f12, this.f5377p);
            canvas.drawLine(0.0f, f12, f11, 0.0f, this.f5377p);
            canvas.drawLine(0.0f, 0.0f, f11, 0.0f, this.f5377p);
            canvas.drawLine(f11, 0.0f, f11, f12, this.f5377p);
            canvas.drawLine(f11, f12, 0.0f, f12, this.f5377p);
            canvas.drawLine(0.0f, f12, 0.0f, 0.0f, this.f5377p);
        }
        String str = this.f5382u;
        if (str != null && this.f5381t) {
            this.f5378q.getTextBounds(str, 0, str.length(), this.f5383v);
            float width2 = (width - this.f5383v.width()) / 2.0f;
            float height2 = ((height - this.f5383v.height()) / 2.0f) + this.f5383v.height();
            this.f5383v.offset((int) width2, (int) height2);
            Rect rect = this.f5383v;
            int i11 = rect.left;
            int i12 = this.f5387z;
            rect.set(i11 - i12, rect.top - i12, rect.right + i12, rect.bottom + i12);
            canvas.drawRect(this.f5383v, this.f5379r);
            canvas.drawText(this.f5382u, width2, height2, this.f5378q);
        }
    }

    public MockView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5377p = new Paint();
        this.f5378q = new Paint();
        this.f5379r = new Paint();
        this.f5380s = true;
        this.f5381t = true;
        this.f5382u = null;
        this.f5383v = new Rect();
        this.f5384w = Color.argb(255, 0, 0, 0);
        this.f5385x = Color.argb(255, 200, 200, 200);
        this.f5386y = Color.argb(255, 50, 50, 50);
        this.f5387z = 4;
        m6340a(context, attributeSet);
    }
}
