package y60;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: y60.c */
/* loaded from: classes5.dex */
public class C30801c extends Drawable {

    /* renamed from: a */
    Paint f142240a;

    public C30801c() {
        Paint paint = new Paint();
        this.f142240a = paint;
        paint.setAntiAlias(true);
        this.f142240a.setColor(C23212s8.m119606n(AbstractC16781w.ItemSeparatorColor));
    }

    /* renamed from: a */
    public void m149867a(boolean z11) {
        int m119606n;
        Paint paint = this.f142240a;
        if (z11) {
            m119606n = AbstractC23136l9.m118639A(AbstractC16801x.cAccent1);
        } else {
            m119606n = C23212s8.m119606n(AbstractC16781w.ItemSeparatorColor);
        }
        paint.setColor(m119606n);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        rectF.top = getBounds().bottom - AbstractC23136l9.m118742r(1.5f);
        rectF.bottom = getBounds().bottom;
        rectF.left = getBounds().centerX() - AbstractC23136l9.m118742r(21.0f);
        rectF.right = getBounds().centerX() + AbstractC23136l9.m118742r(21.0f);
        canvas.drawRoundRect(rectF, AbstractC23136l9.m118742r(2.0f), AbstractC23136l9.m118742r(2.0f), this.f142240a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
