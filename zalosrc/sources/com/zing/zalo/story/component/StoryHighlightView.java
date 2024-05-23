package com.zing.zalo.story.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public final class StoryHighlightView extends AppCompatImageView {

    /* renamed from: p */
    private final Paint f55117p;

    /* renamed from: q */
    private final Path f55118q;

    /* renamed from: r */
    private Rect f55119r;

    /* renamed from: s */
    private float f55120s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryHighlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        this.f55117p = paint;
        paint.setColor(Color.parseColor("#006AF5"));
        paint.setStrokeWidth(AbstractC23136l9.m118742r(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.f55118q = new Path();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        if (getWidth() > 0 && getHeight() > 0) {
            Rect rect = this.f55119r;
            Rect rect2 = null;
            if (rect == null) {
                AbstractC19074t.m100223u("hole");
                rect = null;
            }
            int i11 = rect.left;
            Rect rect3 = this.f55119r;
            if (rect3 == null) {
                AbstractC19074t.m100223u("hole");
                rect3 = null;
            }
            int i12 = rect3.top;
            Rect rect4 = this.f55119r;
            if (rect4 == null) {
                AbstractC19074t.m100223u("hole");
                rect4 = null;
            }
            int i13 = rect4.right;
            Rect rect5 = this.f55119r;
            if (rect5 == null) {
                AbstractC19074t.m100223u("hole");
            } else {
                rect2 = rect5;
            }
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            float f14 = rect2.bottom;
            float f15 = this.f55120s;
            canvas.drawRoundRect(f11, f12, f13, f14, f15, f15, this.f55117p);
            this.f55118q.reset();
            this.f55118q.moveTo(f11, this.f55120s + f12);
            this.f55118q.lineTo(f11, f14 - this.f55120s);
            this.f55118q.moveTo(this.f55120s + f11, f12);
            this.f55118q.lineTo(f13 - this.f55120s, f12);
            this.f55118q.moveTo(f13, f12 + this.f55120s);
            this.f55118q.lineTo(f13, f14 - this.f55120s);
            this.f55118q.moveTo(f11 + this.f55120s, f14);
            this.f55118q.lineTo(f13 - this.f55120s, f14);
            canvas.drawPath(this.f55118q, this.f55117p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryHighlightView(Context context, Rect rect, float f11) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(rect, "hole");
        Paint paint = new Paint();
        this.f55117p = paint;
        paint.setColor(Color.parseColor("#006AF5"));
        paint.setStrokeWidth(AbstractC23136l9.m118742r(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.f55118q = new Path();
        this.f55119r = rect;
        this.f55120s = f11;
    }
}
