package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.InterfaceC6287c;
import p539u6.AbstractC27041a;

/* renamed from: com.google.android.material.circularreveal.b */
/* loaded from: classes3.dex */
public class C6286b {

    /* renamed from: j */
    public static final int f35221j = 2;

    /* renamed from: a */
    private final a f35222a;

    /* renamed from: b */
    private final View f35223b;

    /* renamed from: c */
    private final Path f35224c;

    /* renamed from: d */
    private final Paint f35225d;

    /* renamed from: e */
    private final Paint f35226e;

    /* renamed from: f */
    private InterfaceC6287c.e f35227f;

    /* renamed from: g */
    private Drawable f35228g;

    /* renamed from: h */
    private boolean f35229h;

    /* renamed from: i */
    private boolean f35230i;

    /* renamed from: com.google.android.material.circularreveal.b$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: c */
        void mo32222c(Canvas canvas);

        /* renamed from: d */
        boolean mo32223d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6286b(a aVar) {
        this.f35222a = aVar;
        View view = (View) aVar;
        this.f35223b = view;
        view.setWillNotDraw(false);
        this.f35224c = new Path();
        this.f35225d = new Paint(7);
        Paint paint = new Paint(1);
        this.f35226e = paint;
        paint.setColor(0);
    }

    /* renamed from: d */
    private void m32226d(Canvas canvas) {
        if (m32230o()) {
            Rect bounds = this.f35228g.getBounds();
            float width = this.f35227f.f35235a - (bounds.width() / 2.0f);
            float height = this.f35227f.f35236b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f35228g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: g */
    private float m32227g(InterfaceC6287c.e eVar) {
        return AbstractC27041a.m139197b(eVar.f35235a, eVar.f35236b, 0.0f, 0.0f, this.f35223b.getWidth(), this.f35223b.getHeight());
    }

    /* renamed from: i */
    private void m32228i() {
        if (f35221j == 1) {
            this.f35224c.rewind();
            InterfaceC6287c.e eVar = this.f35227f;
            if (eVar != null) {
                this.f35224c.addCircle(eVar.f35235a, eVar.f35236b, eVar.f35237c, Path.Direction.CW);
            }
        }
        this.f35223b.invalidate();
    }

    /* renamed from: n */
    private boolean m32229n() {
        boolean z11;
        InterfaceC6287c.e eVar = this.f35227f;
        if (eVar != null && !eVar.m32247a()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (f35221j == 0) {
            if (z11 || !this.f35230i) {
                return false;
            }
            return true;
        }
        return !z11;
    }

    /* renamed from: o */
    private boolean m32230o() {
        return (this.f35229h || this.f35228g == null || this.f35227f == null) ? false : true;
    }

    /* renamed from: p */
    private boolean m32231p() {
        if (!this.f35229h && Color.alpha(this.f35226e.getColor()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m32232a() {
        if (f35221j == 0) {
            this.f35229h = true;
            this.f35230i = false;
            this.f35223b.buildDrawingCache();
            Bitmap drawingCache = this.f35223b.getDrawingCache();
            if (drawingCache == null && this.f35223b.getWidth() != 0 && this.f35223b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f35223b.getWidth(), this.f35223b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f35223b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f35225d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f35229h = false;
            this.f35230i = true;
        }
    }

    /* renamed from: b */
    public void m32233b() {
        if (f35221j == 0) {
            this.f35230i = false;
            this.f35223b.destroyDrawingCache();
            this.f35225d.setShader(null);
            this.f35223b.invalidate();
        }
    }

    /* renamed from: c */
    public void m32234c(Canvas canvas) {
        if (m32229n()) {
            int i11 = f35221j;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        this.f35222a.mo32222c(canvas);
                        if (m32231p()) {
                            canvas.drawRect(0.0f, 0.0f, this.f35223b.getWidth(), this.f35223b.getHeight(), this.f35226e);
                        }
                    } else {
                        throw new IllegalStateException("Unsupported strategy " + i11);
                    }
                } else {
                    int save = canvas.save();
                    canvas.clipPath(this.f35224c);
                    this.f35222a.mo32222c(canvas);
                    if (m32231p()) {
                        canvas.drawRect(0.0f, 0.0f, this.f35223b.getWidth(), this.f35223b.getHeight(), this.f35226e);
                    }
                    canvas.restoreToCount(save);
                }
            } else {
                InterfaceC6287c.e eVar = this.f35227f;
                canvas.drawCircle(eVar.f35235a, eVar.f35236b, eVar.f35237c, this.f35225d);
                if (m32231p()) {
                    InterfaceC6287c.e eVar2 = this.f35227f;
                    canvas.drawCircle(eVar2.f35235a, eVar2.f35236b, eVar2.f35237c, this.f35226e);
                }
            }
        } else {
            this.f35222a.mo32222c(canvas);
            if (m32231p()) {
                canvas.drawRect(0.0f, 0.0f, this.f35223b.getWidth(), this.f35223b.getHeight(), this.f35226e);
            }
        }
        m32226d(canvas);
    }

    /* renamed from: e */
    public Drawable m32235e() {
        return this.f35228g;
    }

    /* renamed from: f */
    public int m32236f() {
        return this.f35226e.getColor();
    }

    /* renamed from: h */
    public InterfaceC6287c.e m32237h() {
        InterfaceC6287c.e eVar = this.f35227f;
        if (eVar == null) {
            return null;
        }
        InterfaceC6287c.e eVar2 = new InterfaceC6287c.e(eVar);
        if (eVar2.m32247a()) {
            eVar2.f35237c = m32227g(eVar2);
        }
        return eVar2;
    }

    /* renamed from: j */
    public boolean m32238j() {
        if (this.f35222a.mo32223d() && !m32229n()) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m32239k(Drawable drawable) {
        this.f35228g = drawable;
        this.f35223b.invalidate();
    }

    /* renamed from: l */
    public void m32240l(int i11) {
        this.f35226e.setColor(i11);
        this.f35223b.invalidate();
    }

    /* renamed from: m */
    public void m32241m(InterfaceC6287c.e eVar) {
        if (eVar == null) {
            this.f35227f = null;
        } else {
            InterfaceC6287c.e eVar2 = this.f35227f;
            if (eVar2 == null) {
                this.f35227f = new InterfaceC6287c.e(eVar);
            } else {
                eVar2.m32249c(eVar);
            }
            if (AbstractC27041a.m139198c(eVar.f35237c, m32227g(eVar), 1.0E-4f)) {
                this.f35227f.f35237c = Float.MAX_VALUE;
            }
        }
        m32228i();
    }
}
