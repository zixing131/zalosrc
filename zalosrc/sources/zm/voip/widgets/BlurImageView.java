package zm.voip.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes7.dex */
public class BlurImageView extends RecyclingImageView {

    /* renamed from: p */
    private Path f149883p;

    /* renamed from: q */
    private int f149884q;

    public BlurImageView(Context context) {
        super(context);
        this.f149884q = 0;
        m157268i();
    }

    /* renamed from: i */
    private void m157268i() {
        this.f149883p = new Path();
    }

    public int getCornerRadius() {
        return this.f149884q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        Path path = this.f149883p;
        int i11 = this.f149884q;
        path.addRoundRect(rectF, i11, i11, Path.Direction.CW);
        canvas.clipPath(this.f149883p);
        super.onDraw(canvas);
    }

    public void setCornerRadius(int i11) {
        this.f149884q = i11;
        invalidate();
    }

    public BlurImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f149884q = 0;
        m157268i();
    }

    public BlurImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f149884q = 0;
        m157268i();
    }
}
