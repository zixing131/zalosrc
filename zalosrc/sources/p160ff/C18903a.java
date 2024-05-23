package p160ff;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.MainApplication;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23214t;
import me0.AbstractC23222t7;
import p129ef.C18422c;
import p354n3.C23528a;

/* renamed from: ff.a */
/* loaded from: classes3.dex */
public final class C18903a {

    /* renamed from: a */
    private final Context f94360a;

    /* renamed from: b */
    private final String f94361b;

    /* renamed from: c */
    private final String f94362c;

    /* renamed from: d */
    private final String f94363d;

    /* renamed from: e */
    private final String f94364e;

    /* renamed from: f */
    private final C23528a f94365f;

    public C18903a(Context context, String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "songId");
        AbstractC19074t.m100208f(str2, "albumCoverUrl");
        AbstractC19074t.m100208f(str3, "songName");
        AbstractC19074t.m100208f(str4, "artistName");
        this.f94360a = context;
        this.f94361b = str;
        this.f94362c = str2;
        this.f94363d = str3;
        this.f94364e = str4;
        this.f94365f = new C23528a(MainApplication.Companion.m35500c());
    }

    /* renamed from: b */
    private final Bitmap m99089b(Bitmap bitmap, int i11, int i12) {
        try {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            TextPaint textPaint = new TextPaint();
            MainApplication.C6895a c6895a = MainApplication.Companion;
            textPaint.setTypeface(Typeface.createFromAsset(c6895a.m35500c().getAssets(), "fonts/Roboto-Medium.ttf"));
            textPaint.setColor(-1);
            textPaint.setAntiAlias(true);
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTypeface(Typeface.createFromAsset(c6895a.m35500c().getAssets(), "fonts/Roboto-Regular.ttf"));
            textPaint2.setColor(-1);
            textPaint2.setAntiAlias(true);
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(AbstractC23136l9.m118641B(this.f94360a, AbstractC16801x.black_40));
            int i13 = AbstractC23222t7.f112539R;
            int i14 = (i12 - i13) / 2;
            textPaint.setTextSize(AbstractC23136l9.m118742r(15.0f));
            float measureText = textPaint.measureText(this.f94363d);
            textPaint2.setTextSize(AbstractC23136l9.m118742r(12.0f));
            int i15 = i14 + i13;
            int min = Math.min(i11, AbstractC23222t7.f112566j + i15 + ((int) Math.max(measureText, textPaint2.measureText(this.f94364e))) + AbstractC23222t7.f112576o);
            Bitmap createBitmap = Bitmap.createBitmap(min, i12, Bitmap.Config.ARGB_8888);
            AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(createBitmap);
            float f11 = i12;
            float f12 = f11 / 2.0f;
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, min, f11), f12, f12, paint2);
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(i14, i14, i15, i15), paint);
            int i16 = (((min - i14) - i13) - AbstractC23222t7.f112566j) - AbstractC23222t7.f112576o;
            StaticLayout m119625l = AbstractC23214t.m119625l(this.f94363d, textPaint, i16, 1);
            int height = m119625l.getHeight();
            StaticLayout m119625l2 = AbstractC23214t.m119625l(this.f94364e, textPaint2, i16, 1);
            int height2 = (((i12 - height) - AbstractC23222t7.f112552c) - m119625l2.getHeight()) / 2;
            canvas.save();
            canvas.translate(i15 + AbstractC23222t7.f112566j, height2);
            m119625l.draw(canvas);
            canvas.translate(0.0f, height + AbstractC23222t7.f112552c);
            m119625l2.draw(canvas);
            canvas.restore();
            return createBitmap;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: a */
    public final C18422c m99090a() {
        return new C18422c(this, this.f94361b, this.f94365f);
    }

    /* renamed from: c */
    public final Bitmap m99091c(Bitmap bitmap) {
        AbstractC19074t.m100208f(bitmap, "coverImage");
        return m99089b(bitmap, AbstractC23136l9.m118742r(184.0f), AbstractC23136l9.m118742r(56.0f));
    }

    /* renamed from: d */
    public final String m99092d() {
        return this.f94362c;
    }

    /* renamed from: e */
    public final String m99093e() {
        return this.f94361b;
    }

    public /* synthetic */ C18903a(Context context, String str, String str2, String str3, String str4, int i11, AbstractC19060k abstractC19060k) {
        this(context, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? "" : str3, (i11 & 16) != 0 ? "" : str4);
    }
}
