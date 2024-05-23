package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes6.dex */
public class StoryPreviewView extends RecyclingImageView {

    /* renamed from: A */
    int f69814A;

    /* renamed from: B */
    int f69815B;

    /* renamed from: C */
    int f69816C;

    /* renamed from: D */
    int f69817D;

    /* renamed from: E */
    int f69818E;

    /* renamed from: p */
    private final float f69819p;

    /* renamed from: q */
    private final float f69820q;

    /* renamed from: r */
    private final int f69821r;

    /* renamed from: s */
    private final int f69822s;

    /* renamed from: t */
    private RoundRectShape f69823t;

    /* renamed from: u */
    private Paint f69824u;

    /* renamed from: v */
    public int f69825v;

    /* renamed from: w */
    public int f69826w;

    /* renamed from: x */
    private float f69827x;

    /* renamed from: y */
    boolean f69828y;

    /* renamed from: z */
    int f69829z;

    public StoryPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69819p = AbstractC23136l9.m118742r(4.0f);
        this.f69820q = 0.1f;
        this.f69821r = AbstractC23136l9.m118742r(10.0f);
        this.f69822s = AbstractC23136l9.m118742r(5.0f);
        this.f69828y = true;
        this.f69817D = 0;
        this.f69818E = 0;
        m75956j();
    }

    /* renamed from: i */
    private void m75955i(Canvas canvas) {
        int i11;
        try {
            if (m75957k()) {
                i11 = 0;
            } else {
                i11 = this.f69816C;
            }
            this.f69824u.setColor(this.f69829z);
            RoundRectShape roundRectShape = this.f69823t;
            if (roundRectShape != null) {
                int i12 = i11 * 2;
                roundRectShape.resize(this.f69814A - i12, this.f69815B - i12);
            }
            int i13 = this.f69825v;
            canvas.save();
            float f11 = i11;
            canvas.translate(f11, f11);
            canvas.clipRect(0, 0, i13, i13);
            RoundRectShape roundRectShape2 = this.f69823t;
            if (roundRectShape2 != null) {
                roundRectShape2.draw(canvas, this.f69824u);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f11, f11);
            int i14 = this.f69814A;
            int i15 = i11 * 2;
            canvas.clipRect((i14 - i13) - i15, 0, i14 - i15, i13);
            RoundRectShape roundRectShape3 = this.f69823t;
            if (roundRectShape3 != null) {
                roundRectShape3.draw(canvas, this.f69824u);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f11, f11);
            int i16 = this.f69815B;
            canvas.clipRect(0, (i16 - i13) - i15, i13, i16 - i15);
            RoundRectShape roundRectShape4 = this.f69823t;
            if (roundRectShape4 != null) {
                roundRectShape4.draw(canvas, this.f69824u);
            }
            canvas.restore();
            canvas.save();
            canvas.translate(f11, f11);
            int i17 = this.f69814A;
            int i18 = this.f69815B;
            canvas.clipRect((i17 - i13) - i15, (i18 - i13) - i15, i17 - i15, i18 - i15);
            RoundRectShape roundRectShape5 = this.f69823t;
            if (roundRectShape5 != null) {
                roundRectShape5.draw(canvas, this.f69824u);
            }
            canvas.restore();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    void m75956j() {
        int i11;
        float f11;
        if (m75957k()) {
            i11 = this.f69821r;
        } else {
            i11 = this.f69822s;
        }
        this.f69825v = i11;
        this.f69826w = AbstractC23136l9.m118742r(0.0f);
        if (m75957k()) {
            f11 = this.f69819p;
        } else {
            f11 = 0.1f;
        }
        this.f69827x = f11;
        this.f69816C = AbstractC23136l9.m118742r(2.0f);
        this.f69818E = AbstractC23136l9.m118659K(AbstractC16802y.story_bar_item_roundrect_corner_radius);
        this.f69829z = C23212s8.m119607o(getContext(), AbstractC16781w.ProfileSecondaryBackgroundColor);
        Paint paint = new Paint(1);
        this.f69824u = paint;
        paint.setColor(this.f69829z);
        int i12 = this.f69826w;
        float[] fArr = {i12, i12, i12, i12, i12, i12, i12, i12};
        float f12 = this.f69827x;
        RectF rectF = new RectF(f12, f12, f12, f12);
        int i13 = this.f69825v;
        this.f69823t = new RoundRectShape(fArr, rectF, new float[]{i13, i13, i13, i13, i13, i13, i13, i13});
    }

    /* renamed from: k */
    public boolean m75957k() {
        return this.f69817D == 1;
    }

    /* renamed from: l */
    void m75958l(int i11, int i12, float f11) {
        this.f69825v = i11;
        this.f69826w = i12;
        this.f69827x = f11;
        int i13 = this.f69826w;
        float[] fArr = {i13, i13, i13, i13, i13, i13, i13, i13};
        float f12 = this.f69827x;
        RectF rectF = new RectF(f12, f12, f12, f12);
        int i14 = this.f69825v;
        this.f69823t = new RoundRectShape(fArr, rectF, new float[]{i14, i14, i14, i14, i14, i14, i14, i14});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        int i11 = this.f69816C;
        canvas.clipRect(i11, i11, this.f69814A - i11, this.f69815B - i11);
        super.onDraw(canvas);
        canvas.restore();
        if (this.f69828y) {
            m75955i(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f69814A = View.MeasureSpec.getSize(i11);
        this.f69815B = View.MeasureSpec.getSize(i12);
        if (m75957k()) {
            m75958l(this.f69814A / 2, 0, this.f69819p);
        } else {
            m75958l(this.f69818E, 0, 0.1f);
        }
    }

    void setColorPaint(int i11) {
        this.f69829z = i11;
    }

    public void setPadding(int i11) {
        this.f69816C = i11;
    }

    public void setShape(int i11) {
        this.f69817D = i11;
    }

    void setShouldRound(boolean z11) {
        this.f69828y = z11;
    }

    public StoryPreviewView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69819p = AbstractC23136l9.m118742r(4.0f);
        this.f69820q = 0.1f;
        this.f69821r = AbstractC23136l9.m118742r(10.0f);
        this.f69822s = AbstractC23136l9.m118742r(5.0f);
        this.f69828y = true;
        this.f69817D = 0;
        this.f69818E = 0;
        m75956j();
    }
}
