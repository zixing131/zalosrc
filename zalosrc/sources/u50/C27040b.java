package u50;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.zing.zalo.AbstractC16801x;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: u50.b */
/* loaded from: classes5.dex */
public final class C27040b extends Drawable {
    public static final c Companion = new c(null);

    /* renamed from: g */
    private static final int f127682g = AbstractC23136l9.m118742r(70.0f);

    /* renamed from: h */
    private static final InterfaceC24854k f127683h;

    /* renamed from: i */
    private static final InterfaceC24854k f127684i;

    /* renamed from: a */
    private float f127685a;

    /* renamed from: b */
    private float f127686b;

    /* renamed from: c */
    private PointF f127687c = new PointF(0.0f, 0.0f);

    /* renamed from: d */
    private final RectF f127688d = new RectF();

    /* renamed from: e */
    private final RectF f127689e = new RectF();

    /* renamed from: f */
    private final Matrix f127690f = new Matrix();

    /* renamed from: u50.b$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f127691q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setColor(AbstractC23136l9.m118639A(AbstractC16801x.Dark_AppPrimaryColor));
            paint.setStrokeWidth(AbstractC23136l9.m118762x1(1.0f));
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    /* renamed from: u50.b$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f127692q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Paint mo12V4() {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            return paint;
        }
    }

    /* renamed from: u50.b$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public final Paint m139194c() {
            return (Paint) C27040b.f127684i.getValue();
        }

        /* renamed from: d */
        public final Paint m139195d() {
            return (Paint) C27040b.f127683h.getValue();
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(b.f127692q);
        f127683h = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f127691q);
        f127684i = m129210a2;
    }

    /* renamed from: c */
    public final void m139187c(Bitmap bitmap, int i11, int i12, RectF rectF) {
        AbstractC19074t.m100208f(bitmap, "inputBitmap");
        AbstractC19074t.m100208f(rectF, "bitmapVisibleRect");
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.RGB_565);
        AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        canvas.drawBitmap(bitmap, (Rect) null, new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom), (Paint) null);
        canvas.save();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        Companion.m139195d().setShader(new BitmapShader(createBitmap, tileMode, tileMode));
    }

    /* renamed from: d */
    public final void m139188d(float f11, float f12) {
        this.f127685a = f11;
        this.f127686b = f12;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        RectF rectF = this.f127688d;
        PointF pointF = this.f127687c;
        float f11 = pointF.x;
        int i11 = f127682g;
        float f12 = pointF.y;
        rectF.set(f11 - i11, f12 - i11, f11 + i11, f12 + i11);
        RectF rectF2 = this.f127689e;
        float f13 = this.f127685a;
        float f14 = this.f127686b;
        rectF2.set(f13 - i11, f14 - i11, f13 + i11, f14 + i11);
        this.f127690f.reset();
        this.f127690f.setRectToRect(this.f127688d, this.f127689e, Matrix.ScaleToFit.CENTER);
        this.f127690f.postScale(2.0f, 2.0f, this.f127685a, this.f127686b);
        c cVar = Companion;
        cVar.m139195d().getShader().setLocalMatrix(this.f127690f);
        canvas.drawCircle(this.f127685a, this.f127686b, i11, cVar.m139195d());
        float f15 = this.f127685a;
        float f16 = 30;
        float f17 = this.f127686b;
        canvas.drawLine(f15 - f16, f17, f15 + f16, f17, cVar.m139194c());
        float f18 = this.f127685a;
        float f19 = this.f127686b;
        canvas.drawLine(f18, f19 - f16, f18, f19 + f16, cVar.m139194c());
        canvas.drawCircle(this.f127685a, this.f127686b, i11, cVar.m139194c());
    }

    /* renamed from: e */
    public final void m139189e(PointF pointF) {
        AbstractC19074t.m100208f(pointF, "zoomPos");
        this.f127687c = pointF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        c cVar = Companion;
        cVar.m139195d().setAlpha(i11);
        cVar.m139194c().setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
