package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p045c1.C3186e;

/* loaded from: classes2.dex */
public class Placeholder extends View {

    /* renamed from: p */
    private int f5586p;

    /* renamed from: q */
    private View f5587q;

    /* renamed from: r */
    private int f5588r;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5586p = -1;
        this.f5587q = null;
        this.f5588r = 4;
        m6398a(attributeSet);
    }

    /* renamed from: a */
    private void m6398a(AttributeSet attributeSet) {
        super.setVisibility(this.f5588r);
        this.f5586p = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1298f.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.ConstraintLayout_placeholder_content) {
                    this.f5586p = obtainStyledAttributes.getResourceId(index, this.f5586p);
                } else if (index == AbstractC1298f.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f5588r = obtainStyledAttributes.getInt(index, this.f5588r);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public void m6399b(ConstraintLayout constraintLayout) {
        if (this.f5587q == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f5587q.getLayoutParams();
        layoutParams2.f5556v0.m16104m1(0);
        C3186e.b m16029C = layoutParams.f5556v0.m16029C();
        C3186e.b bVar = C3186e.b.FIXED;
        if (m16029C != bVar) {
            layoutParams.f5556v0.m16106n1(layoutParams2.f5556v0.m16070Y());
        }
        if (layoutParams.f5556v0.m16064V() != bVar) {
            layoutParams.f5556v0.m16053O0(layoutParams2.f5556v0.m16133z());
        }
        layoutParams2.f5556v0.m16104m1(8);
    }

    /* renamed from: c */
    public void m6400c(ConstraintLayout constraintLayout) {
        if (this.f5586p == -1 && !isInEditMode()) {
            setVisibility(this.f5588r);
        }
        View findViewById = constraintLayout.findViewById(this.f5586p);
        this.f5587q = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f5532j0 = true;
            this.f5587q.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f5587q;
    }

    public int getEmptyVisibility() {
        return this.f5588r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i11) {
        View findViewById;
        if (this.f5586p == i11) {
            return;
        }
        View view = this.f5587q;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f5587q.getLayoutParams()).f5532j0 = false;
            this.f5587q = null;
        }
        this.f5586p = i11;
        if (i11 != -1 && (findViewById = ((View) getParent()).findViewById(i11)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i11) {
        this.f5588r = i11;
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5586p = -1;
        this.f5587q = null;
        this.f5588r = 4;
        m6398a(attributeSet);
    }
}
