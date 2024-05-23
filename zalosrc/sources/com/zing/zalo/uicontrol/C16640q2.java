package com.zing.zalo.uicontrol;

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
import au.C2343e;
import com.zing.zalo.MainApplication;
import p348mi.AbstractC23309i;

/* renamed from: com.zing.zalo.uicontrol.q2 */
/* loaded from: classes4.dex */
public class C16640q2 extends ShapeDrawable {

    /* renamed from: a */
    private final Paint f83886a;

    /* renamed from: b */
    private final Paint f83887b;

    /* renamed from: c */
    private final String f83888c;

    /* renamed from: d */
    private final int f83889d;

    /* renamed from: e */
    private final RectShape f83890e;

    /* renamed from: f */
    private final int f83891f;

    /* renamed from: g */
    private final int f83892g;

    /* renamed from: h */
    private final int f83893h;

    /* renamed from: i */
    private final float f83894i;

    /* renamed from: j */
    private final int f83895j;

    /* renamed from: k */
    int f83896k;

    /* renamed from: com.zing.zalo.uicontrol.q2$a */
    /* loaded from: classes4.dex */
    public static class a implements c, d, b {

        /* renamed from: l */
        public float f83908l;

        /* renamed from: a */
        String f83897a = "";

        /* renamed from: b */
        int f83898b = -7829368;

        /* renamed from: h */
        public int f83904h = -1;

        /* renamed from: c */
        int f83899c = 0;

        /* renamed from: d */
        int f83900d = -1;

        /* renamed from: e */
        int f83901e = -1;

        /* renamed from: g */
        RectShape f83903g = new RectShape();

        /* renamed from: f */
        Typeface f83902f = Typeface.create("sans-serif-light", 0);

        /* renamed from: i */
        int f83905i = -1;

        /* renamed from: j */
        boolean f83906j = false;

        /* renamed from: k */
        boolean f83907k = false;

        a() {
        }

        @Override // com.zing.zalo.uicontrol.C16640q2.c
        /* renamed from: a */
        public d mo88407a() {
            return this;
        }

        @Override // com.zing.zalo.uicontrol.C16640q2.d
        /* renamed from: b */
        public c mo88408b() {
            return this;
        }

        @Override // com.zing.zalo.uicontrol.C16640q2.c
        /* renamed from: c */
        public c mo88409c() {
            this.f83906j = true;
            return this;
        }

        @Override // com.zing.zalo.uicontrol.C16640q2.d
        /* renamed from: d */
        public C16640q2 mo88410d(String str, int i11, int i12) {
            m88416j(i12);
            return m88413g(str, i11);
        }

        @Override // com.zing.zalo.uicontrol.C16640q2.d
        /* renamed from: e */
        public C16640q2 mo88411e(String str, int i11) {
            m88414h();
            return m88413g(str, i11);
        }

        @Override // com.zing.zalo.uicontrol.C16640q2.d
        /* renamed from: f */
        public C16640q2 mo88412f(String str, int i11) {
            m88415i();
            return m88413g(str, i11);
        }

        /* renamed from: g */
        public C16640q2 m88413g(String str, int i11) {
            this.f83898b = i11;
            this.f83897a = str;
            return new C16640q2(this);
        }

        /* renamed from: h */
        public b m88414h() {
            this.f83903g = new RectShape();
            return this;
        }

        /* renamed from: i */
        public b m88415i() {
            this.f83903g = new OvalShape();
            return this;
        }

        /* renamed from: j */
        public b m88416j(int i11) {
            float f11 = i11;
            this.f83908l = f11;
            this.f83903g = new RoundRectShape(new float[]{f11, f11, f11, f11, f11, f11, f11, f11}, null, null);
            return this;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.q2$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    /* renamed from: com.zing.zalo.uicontrol.q2$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        d mo88407a();

        /* renamed from: c */
        c mo88409c();
    }

    /* renamed from: com.zing.zalo.uicontrol.q2$d */
    /* loaded from: classes4.dex */
    public interface d {
        /* renamed from: b */
        c mo88408b();

        /* renamed from: d */
        C16640q2 mo88410d(String str, int i11, int i12);

        /* renamed from: e */
        C16640q2 mo88411e(String str, int i11);

        /* renamed from: f */
        C16640q2 mo88412f(String str, int i11);
    }

    /* synthetic */ C16640q2(a aVar, AbstractC16644r2 abstractC16644r2) {
        this(aVar);
    }

    /* renamed from: a */
    public static d m88404a() {
        return new a();
    }

    /* renamed from: b */
    private void m88405b(Canvas canvas) {
        RectF rectF = new RectF(getBounds());
        int i11 = this.f83895j;
        rectF.inset(i11 / 2, i11 / 2);
        RectShape rectShape = this.f83890e;
        if (rectShape instanceof OvalShape) {
            canvas.drawOval(rectF, this.f83887b);
        } else if (rectShape instanceof RoundRectShape) {
            float f11 = this.f83894i;
            canvas.drawRoundRect(rectF, f11, f11, this.f83887b);
        } else {
            canvas.drawRect(rectF, this.f83887b);
        }
    }

    /* renamed from: c */
    private int m88406c(int i11) {
        return Color.rgb((int) (Color.red(i11) * 0.9f), (int) (Color.green(i11) * 0.9f), (int) (Color.blue(i11) * 0.9f));
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i11 = bounds.bottom;
        int i12 = bounds.top;
        if (i11 - i12 != this.f83896k) {
            this.f83896k = i11 - i12;
            int m12309c = C2343e.m12309c(this.f83889d);
            if (m12309c != 0) {
                getPaint().setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.f83896k, this.f83889d, m12309c, Shader.TileMode.MIRROR));
            }
        }
        super.draw(canvas);
        if (this.f83895j > 0) {
            m88405b(canvas);
        }
        int save = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int i13 = this.f83892g;
        if (i13 < 0) {
            i13 = bounds.width();
        }
        int i14 = this.f83891f;
        if (i14 < 0) {
            i14 = bounds.height();
        }
        int i15 = this.f83893h;
        if (i15 < 0) {
            i15 = Math.min(i13, i14) / 2;
        }
        this.f83886a.setTextSize(i15);
        canvas.drawText(this.f83888c, i13 / 2, (i14 / 2) - ((this.f83886a.descent() + this.f83886a.ascent()) / 2.0f), this.f83886a);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f83891f;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f83892g;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        this.f83886a.setAlpha(i11);
        this.f83887b.setAlpha(i11);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f83886a.setColorFilter(colorFilter);
    }

    private C16640q2(a aVar) {
        super(aVar.f83903g);
        this.f83896k = 0;
        this.f83890e = aVar.f83903g;
        this.f83891f = aVar.f83901e;
        this.f83892g = aVar.f83900d;
        this.f83894i = aVar.f83908l;
        this.f83888c = aVar.f83907k ? aVar.f83897a.toUpperCase() : aVar.f83897a;
        this.f83889d = aVar.f83898b;
        this.f83893h = aVar.f83905i;
        Paint paint = new Paint();
        this.f83886a = paint;
        paint.setColor(aVar.f83904h);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(aVar.f83906j);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeWidth(aVar.f83899c);
        try {
            if (AbstractC23309i.m122089kb() == 0) {
                Typeface createFromAsset = Typeface.createFromAsset(MainApplication.getAppContext().getAssets(), "fonts/Roboto-Light.ttf");
                if (createFromAsset != null) {
                    paint.setTypeface(createFromAsset);
                }
            } else {
                Typeface typeface = aVar.f83902f;
                if (typeface != null) {
                    paint.setTypeface(typeface);
                }
            }
        } catch (Exception unused) {
        }
        int i11 = aVar.f83899c;
        this.f83895j = i11;
        Paint paint2 = new Paint();
        this.f83887b = paint2;
        paint2.setColor(m88406c(this.f83889d));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(i11);
        getPaint().setColor(this.f83889d);
    }
}
