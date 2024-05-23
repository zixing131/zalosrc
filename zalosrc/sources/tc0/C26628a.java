package tc0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: tc0.a */
/* loaded from: classes4.dex */
public class C26628a {

    /* renamed from: a */
    Drawable f126083a;

    /* renamed from: b */
    Rect f126084b;

    public C26628a(Drawable drawable) {
        this.f126083a = drawable;
    }

    /* renamed from: a */
    public void m136730a(Canvas canvas) {
        Drawable drawable;
        int i11;
        int width;
        int height;
        if (canvas != null && (drawable = this.f126083a) != null && drawable.getIntrinsicWidth() > 0 && this.f126083a.getIntrinsicHeight() > 0) {
            Rect rect = this.f126084b;
            int i12 = 0;
            if (rect != null) {
                i11 = rect.left;
            } else {
                i11 = 0;
            }
            if (rect != null) {
                i12 = rect.top;
            }
            if (rect != null) {
                width = rect.width();
            } else {
                width = canvas.getWidth();
            }
            Rect rect2 = this.f126084b;
            if (rect2 != null) {
                height = rect2.height();
            } else {
                height = canvas.getHeight();
            }
            int i13 = i11 + (width / 2);
            int i14 = i12 + (height / 2);
            int intrinsicWidth = this.f126083a.getIntrinsicWidth();
            int intrinsicHeight = this.f126083a.getIntrinsicHeight();
            int i15 = i13 - (intrinsicWidth / 2);
            int i16 = i14 - (intrinsicHeight / 2);
            this.f126083a.setBounds(i15, i16, intrinsicWidth + i15, intrinsicHeight + i16);
            this.f126083a.draw(canvas);
        }
    }

    /* renamed from: b */
    public void m136731b(Rect rect) {
        this.f126084b = rect;
    }
}
