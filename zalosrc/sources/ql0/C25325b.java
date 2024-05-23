package ql0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.Iterator;
import java.util.List;

/* renamed from: ql0.b */
/* loaded from: classes7.dex */
public class C25325b {

    /* renamed from: a */
    private Paint f121496a;

    /* renamed from: b */
    int f121497b;

    /* renamed from: c */
    int f121498c = -1;

    /* renamed from: d */
    int f121499d = Color.parseColor("#ff74c6f5");

    /* renamed from: e */
    int f121500e = Color.parseColor("#ff3c579d");

    public C25325b(Context context) {
        this.f121497b = 15;
        Paint paint = new Paint(1);
        this.f121496a = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f121496a.setStrokeCap(Paint.Cap.ROUND);
        int i11 = ((int) context.getResources().getDisplayMetrics().density) * 5;
        this.f121497b = i11;
        this.f121496a.setStrokeWidth(i11);
    }

    /* renamed from: a */
    public void m131162a(Canvas canvas, List list, long j11, long j12) {
        boolean z11;
        float f11;
        int i11;
        if (canvas != null && list != null && list.size() > 0) {
            int i12 = this.f121497b;
            float width = canvas.getWidth() - (i12 * 2);
            float size = (width * 1.0f) / list.size();
            float f12 = i12;
            if (j12 > 0 && j11 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f11 = (((((float) j11) * 1.0f) / ((float) j12)) * width) + f12;
            } else {
                f11 = 0.0f;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ZMediaPlayer.CacheItem cacheItem = (ZMediaPlayer.CacheItem) it.next();
                float f13 = f12 + (cacheItem.mIndex * size);
                float f14 = f13 + (((size - this.f121497b) * ((float) cacheItem.mCacheSize)) / ((float) cacheItem.mSize));
                Paint paint = this.f121496a;
                if (cacheItem.mCaching) {
                    i11 = this.f121500e;
                } else {
                    i11 = this.f121499d;
                }
                paint.setColor(i11);
                canvas.drawLine(f13, f12, f14, f12, this.f121496a);
                if (z11) {
                    this.f121496a.setColor(this.f121498c);
                    if (f14 <= f11) {
                        canvas.drawLine(f13, f12, f14, f12, this.f121496a);
                    } else if (f11 >= f13) {
                        canvas.drawLine(f13, f12, f11, f12, this.f121496a);
                    }
                }
            }
        }
    }
}
