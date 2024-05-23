package ti0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.C13778s1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ti0.e */
/* loaded from: classes7.dex */
public final class C26706e extends ShapeDrawable {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final Context f126614a;

    /* renamed from: b */
    private final Paint f126615b;

    /* renamed from: c */
    private final Paint f126616c;

    /* renamed from: d */
    private final String f126617d;

    /* renamed from: e */
    private final int f126618e;

    /* renamed from: f */
    private final int f126619f;

    /* renamed from: g */
    private final RectShape f126620g;

    /* renamed from: h */
    private final int f126621h;

    /* renamed from: i */
    private final int f126622i;

    /* renamed from: j */
    private final float f126623j;

    /* renamed from: k */
    private final float f126624k;

    /* renamed from: l */
    private final int f126625l;

    /* renamed from: m */
    private final Rect f126626m;

    /* renamed from: n */
    private int f126627n;

    /* renamed from: ti0.e$a */
    /* loaded from: classes7.dex */
    public static final class a implements d, e, c {

        /* renamed from: a */
        private Context f126628a;

        /* renamed from: b */
        private String f126629b;

        /* renamed from: c */
        private int f126630c;

        /* renamed from: d */
        private int f126631d;

        /* renamed from: e */
        private int f126632e;

        /* renamed from: f */
        private int f126633f;

        /* renamed from: g */
        private int f126634g;

        /* renamed from: h */
        private Typeface f126635h;

        /* renamed from: i */
        private RectShape f126636i;

        /* renamed from: j */
        private int f126637j;

        /* renamed from: k */
        private float f126638k;

        /* renamed from: l */
        private boolean f126639l;

        /* renamed from: m */
        private boolean f126640m;

        /* renamed from: n */
        private float f126641n;

        public a(Context context) {
            AbstractC19074t.m100208f(context, "context");
            this.f126628a = context;
            this.f126629b = "";
            this.f126630c = -7829368;
            this.f126631d = 0;
            this.f126637j = -1;
            this.f126632e = 0;
            this.f126633f = -1;
            this.f126634g = -1;
            this.f126636i = new RectShape();
            this.f126635h = Typeface.create("sans-serif-light", 0);
            this.f126638k = -1.0f;
            this.f126639l = false;
            this.f126640m = false;
        }

        @Override // ti0.C26706e.d
        /* renamed from: a */
        public e mo137296a() {
            return this;
        }

        @Override // ti0.C26706e.e
        /* renamed from: b */
        public d mo137297b() {
            return this;
        }

        @Override // ti0.C26706e.d
        /* renamed from: c */
        public d mo137298c(float f11) {
            this.f126638k = f11;
            return this;
        }

        @Override // ti0.C26706e.e
        /* renamed from: d */
        public C26706e mo137299d(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "text");
            m137316u();
            return m137301f(str, i11, i12);
        }

        @Override // ti0.C26706e.d
        /* renamed from: e */
        public d mo137300e(int i11) {
            this.f126637j = i11;
            return this;
        }

        /* renamed from: f */
        public C26706e m137301f(String str, int i11, int i12) {
            AbstractC19074t.m100208f(str, "text");
            this.f126630c = i11;
            this.f126631d = i12;
            this.f126629b = str;
            return new C26706e(this, null);
        }

        /* renamed from: g */
        public final int m137302g() {
            return this.f126632e;
        }

        /* renamed from: h */
        public final int m137303h() {
            return this.f126630c;
        }

        /* renamed from: i */
        public final int m137304i() {
            return this.f126631d;
        }

        /* renamed from: j */
        public final Context m137305j() {
            return this.f126628a;
        }

        /* renamed from: k */
        public final Typeface m137306k() {
            return this.f126635h;
        }

        /* renamed from: l */
        public final float m137307l() {
            return this.f126638k;
        }

        /* renamed from: m */
        public final int m137308m() {
            return this.f126634g;
        }

        /* renamed from: n */
        public final float m137309n() {
            return this.f126641n;
        }

        /* renamed from: o */
        public final RectShape m137310o() {
            return this.f126636i;
        }

        /* renamed from: p */
        public final String m137311p() {
            return this.f126629b;
        }

        /* renamed from: q */
        public final int m137312q() {
            return this.f126637j;
        }

        /* renamed from: r */
        public final boolean m137313r() {
            return this.f126640m;
        }

        /* renamed from: s */
        public final int m137314s() {
            return this.f126633f;
        }

        /* renamed from: t */
        public final boolean m137315t() {
            return this.f126639l;
        }

        /* renamed from: u */
        public c m137316u() {
            this.f126636i = new OvalShape();
            return this;
        }
    }

    /* renamed from: ti0.e$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final e m137317a(Context context) {
            AbstractC19074t.m100208f(context, "context");
            return new a(context);
        }
    }

    /* renamed from: ti0.e$c */
    /* loaded from: classes7.dex */
    public interface c {
    }

    /* renamed from: ti0.e$d */
    /* loaded from: classes7.dex */
    public interface d {
        /* renamed from: a */
        e mo137296a();

        /* renamed from: c */
        d mo137298c(float f11);

        /* renamed from: e */
        d mo137300e(int i11);
    }

    /* renamed from: ti0.e$e */
    /* loaded from: classes7.dex */
    public interface e {
        /* renamed from: b */
        d mo137297b();

        /* renamed from: d */
        C26706e mo137299d(String str, int i11, int i12);
    }

    public /* synthetic */ C26706e(a aVar, AbstractC19060k abstractC19060k) {
        this(aVar);
    }

    /* renamed from: a */
    private final void m137294a(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        int i11 = this.f126625l;
        rectF.inset(i11 / 2, i11 / 2);
        RectShape rectShape = this.f126620g;
        if (rectShape instanceof OvalShape) {
            canvas.drawOval(rectF, this.f126616c);
        } else if (rectShape instanceof RoundRectShape) {
            float f11 = this.f126624k;
            canvas.drawRoundRect(rectF, f11, f11, this.f126616c);
        } else {
            canvas.drawRect(rectF, this.f126616c);
        }
    }

    /* renamed from: b */
    private final int m137295b(int i11) {
        return Color.rgb((int) (Color.red(i11) * 0.9f), (int) (Color.green(i11) * 0.9f), (int) (Color.blue(i11) * 0.9f));
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        Rect bounds = getBounds();
        AbstractC19074t.m100207e(bounds, "bounds");
        int i11 = bounds.bottom;
        int i12 = bounds.top;
        if (i11 - i12 != this.f126627n) {
            this.f126627n = i11 - i12;
            if (this.f126619f != 0) {
                getPaint().setShader(new LinearGradient(0.0f, bounds.bottom - bounds.top, bounds.right - bounds.left, 0.0f, this.f126618e, this.f126619f, Shader.TileMode.MIRROR));
            } else {
                getPaint().setShader(null);
                getPaint().setColor(this.f126618e);
            }
        }
        super.draw(canvas);
        if (this.f126625l > 0) {
            m137294a(canvas);
        }
        int save = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int i13 = this.f126622i;
        if (i13 < 0) {
            i13 = bounds.width();
        }
        int i14 = this.f126621h;
        if (i14 < 0) {
            i14 = bounds.height();
        }
        float f11 = this.f126623j;
        if (f11 < 0.0f) {
            f11 = (Math.min(i13, i14) * 10.0f) / 24.0f;
        }
        this.f126615b.setTextSize(f11);
        canvas.drawText(this.f126617d, i13 / 2, (i14 / 2) - ((this.f126615b.descent() + this.f126615b.ascent()) / 2), this.f126615b);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f126621h;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f126622i;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        this.f126615b.setAlpha(i11);
        this.f126616c.setAlpha(i11);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f126615b.setColorFilter(colorFilter);
    }

    private C26706e(a aVar) {
        super(aVar.m137310o());
        String m137311p;
        this.f126626m = new Rect();
        Context m137305j = aVar.m137305j();
        this.f126614a = m137305j;
        this.f126620g = aVar.m137310o();
        this.f126621h = aVar.m137308m();
        this.f126622i = aVar.m137314s();
        this.f126624k = aVar.m137309n();
        if (aVar.m137313r()) {
            m137311p = aVar.m137311p().toUpperCase();
            AbstractC19074t.m100207e(m137311p, "this as java.lang.String).toUpperCase()");
        } else {
            m137311p = aVar.m137311p();
        }
        this.f126617d = m137311p;
        this.f126618e = aVar.m137303h();
        this.f126619f = aVar.m137304i();
        this.f126623j = aVar.m137307l();
        Paint paint = new Paint();
        this.f126615b = paint;
        paint.setColor(aVar.m137312q());
        paint.setAntiAlias(true);
        paint.setFakeBoldText(aVar.m137315t());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(aVar.m137302g());
        try {
            if (C13778s1.m76967h()) {
                Typeface m76693b = C13718q1.m76693b(m137305j);
                if (m76693b != null) {
                    paint.setTypeface(m76693b);
                }
            } else if (aVar.m137306k() != null) {
                paint.setTypeface(aVar.m137306k());
            }
        } catch (Exception unused) {
        }
        int m137302g = aVar.m137302g();
        this.f126625l = m137302g;
        Paint paint2 = new Paint();
        this.f126616c = paint2;
        paint2.setColor(m137295b(this.f126618e));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(m137302g);
        getPaint().setColor(this.f126618e);
    }
}
