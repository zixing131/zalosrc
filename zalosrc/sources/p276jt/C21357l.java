package p276jt;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.text.Layout;
import com.zing.zalo.zmedia.view.AbstractC17358g;
import et.AbstractC18594a;
import et.C18610q;
import im.C20612c;
import im.C20623n;
import java.nio.Buffer;
import org.json.JSONObject;
import p110dt.AbstractC18066a;
import p169fu.AbstractC19146a;
import p276jt.C21357l;
import se0.AbstractC26236a;

/* renamed from: jt.l */
/* loaded from: classes4.dex */
public class C21357l extends AbstractC21351f {

    /* renamed from: U */
    private final Object f104069U;

    /* renamed from: V */
    private String f104070V;

    /* renamed from: W */
    private b f104071W;

    /* renamed from: X */
    private Context f104072X;

    /* renamed from: Y */
    private Bitmap f104073Y;

    /* renamed from: Z */
    private int f104074Z;

    /* renamed from: a0 */
    private int f104075a0;

    /* renamed from: b0 */
    private int f104076b0;

    /* renamed from: c0 */
    private int f104077c0;

    /* renamed from: d0 */
    private int f104078d0;

    /* renamed from: e0 */
    private Path f104079e0;

    /* renamed from: f0 */
    public float[] f104080f0;

    /* renamed from: g0 */
    public int f104081g0;

    /* renamed from: h0 */
    public int f104082h0;

    /* renamed from: i0 */
    public Layout f104083i0;

    /* renamed from: j0 */
    private boolean f104084j0;

    /* renamed from: k0 */
    private boolean f104085k0;

    /* renamed from: l0 */
    private boolean f104086l0;

    /* renamed from: m0 */
    private boolean f104087m0;

    /* renamed from: n0 */
    private boolean f104088n0;

    /* renamed from: o0 */
    private boolean f104089o0;

    /* renamed from: p0 */
    protected float f104090p0;

    /* renamed from: q0 */
    protected float f104091q0;

    /* renamed from: r0 */
    public boolean f104092r0;

    /* renamed from: s0 */
    private boolean f104093s0;

    /* renamed from: jt.l$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo39668a();
    }

    /* renamed from: jt.l$b */
    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a */
        public int f104094a;

        /* renamed from: b */
        public String f104095b;

        /* renamed from: c */
        public int f104096c;

        /* renamed from: d */
        public int f104097d = -1;

        /* renamed from: e */
        public int f104098e = -16777216;

        /* renamed from: f */
        public int f104099f = 0;

        /* renamed from: g */
        public int f104100g = 0;

        /* renamed from: h */
        public int f104101h = 0;

        /* renamed from: i */
        public boolean f104102i = true;

        /* renamed from: j */
        public boolean f104103j = false;

        /* renamed from: k */
        public boolean f104104k = false;

        /* renamed from: l */
        public String f104105l = "";

        /* renamed from: m */
        public int f104106m = 128;

        /* renamed from: n */
        public int f104107n = 2;

        /* renamed from: o */
        public int f104108o = 3;

        /* renamed from: p */
        public float f104109p = 1.0f;
    }

    public C21357l() {
        this("", 0, 0, 0, 2, 1);
    }

    /* renamed from: O0 */
    private boolean m110646O0() {
        int i11 = this.f104076b0;
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: P0 */
    public /* synthetic */ void m110647P0(a aVar) {
        Bitmap bitmap;
        float m110649x0 = (float) m110649x0((int) (AbstractC18066a.m96060f(this.f104083i0) * this.f104024H), (int) (this.f104083i0.getHeight() * this.f104024H));
        float m110649x02 = (float) m110649x0((int) this.f104028L.width(), (int) this.f104028L.height());
        float f11 = this.f104024H;
        if (this.f104028L != null) {
            int i11 = this.f104078d0;
            if (m110649x0 > i11) {
                f11 = (i11 * 1.0f) / m110649x02;
            }
        }
        if (m110646O0()) {
            bitmap = AbstractC18066a.m96057c(this.f104083i0, f11);
        } else if (m110661L0()) {
            bitmap = AbstractC18066a.m96056b(this.f104072X, this.f104071W, this.f104079e0, this.f104083i0, f11);
        } else {
            bitmap = null;
        }
        synchronized (this.f104069U) {
            try {
                Bitmap bitmap2 = this.f104073Y;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.f104073Y = bitmap;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m110676y0();
        this.f104092r0 = false;
        m1952U(new RunnableC21356k(this));
        if (aVar != null) {
            aVar.mo39668a();
        }
    }

    /* renamed from: x0 */
    private double m110649x0(int i11, int i12) {
        return Math.sqrt((i11 * i11) + (i12 * i12));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        int i11 = this.f104075a0;
        if (i11 != -1) {
            AbstractC26236a.m134898e(i11);
            this.f104075a0 = -1;
        }
    }

    /* renamed from: A0 */
    public int m110650A0() {
        return this.f104077c0;
    }

    /* renamed from: B0 */
    public int m110651B0() {
        return this.f104076b0;
    }

    /* renamed from: C0 */
    public float[] m110652C0() {
        if (m110662M0()) {
            m110676y0();
        }
        return this.f104080f0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        synchronized (this.f104069U) {
            try {
                if (this.f104073Y != null) {
                    Rect rect = new Rect();
                    this.f104029M = rect;
                    this.f104075a0 = AbstractC18594a.m98198e(this.f104073Y, rect);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: D0 */
    public b m110653D0() {
        return this.f104071W;
    }

    @Override // ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        if (this.f104075a0 == -1) {
            return;
        }
        synchronized (this.f104069U) {
            try {
                Bitmap bitmap = this.f104073Y;
                if (bitmap != null && !bitmap.isRecycled()) {
                    AbstractC26236a.m134914u(this.f104075a0, this.f104073Y);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: E0 */
    public String m110654E0() {
        return this.f104070V;
    }

    /* renamed from: F0 */
    public boolean m110655F0() {
        return this.f104087m0;
    }

    /* renamed from: G0 */
    public boolean m110656G0() {
        return this.f104089o0;
    }

    /* renamed from: H0 */
    public boolean m110657H0() {
        return this.f104084j0;
    }

    /* renamed from: I0 */
    public boolean m110658I0() {
        return this.f104085k0;
    }

    /* renamed from: J0 */
    public boolean m110659J0() {
        return this.f104086l0;
    }

    /* renamed from: K0 */
    public boolean m110660K0() {
        return this.f104088n0;
    }

    /* renamed from: L0 */
    public boolean m110661L0() {
        int i11 = this.f104076b0;
        return i11 == 2 || i11 == 3;
    }

    /* renamed from: M0 */
    public boolean m110662M0() {
        return this.f104025I != this.f104091q0;
    }

    /* renamed from: N0 */
    public boolean m110663N0() {
        return this.f104024H != this.f104090p0;
    }

    /* renamed from: Q0 */
    public void m110664Q0() {
        this.f104084j0 = false;
        this.f104085k0 = false;
        this.f104089o0 = false;
        this.f104088n0 = false;
        this.f104087m0 = false;
        this.f104086l0 = false;
    }

    /* renamed from: R0 */
    public void m110665R0(boolean z11) {
        this.f104087m0 = z11;
    }

    /* renamed from: S0 */
    public void m110666S0(boolean z11) {
        this.f104089o0 = z11;
    }

    /* renamed from: T0 */
    public void m110667T0(boolean z11) {
        this.f104084j0 = z11;
    }

    /* renamed from: U0 */
    public void m110668U0(boolean z11) {
        this.f104085k0 = z11;
    }

    /* renamed from: V0 */
    public void m110669V0(boolean z11) {
        this.f104086l0 = z11;
    }

    /* renamed from: W0 */
    public void m110670W0(boolean z11) {
        this.f104088n0 = z11;
    }

    /* renamed from: X0 */
    public void m110671X0(Context context) {
        this.f104072X = context;
        m110675b1();
    }

    /* renamed from: Y0 */
    public void m110672Y0(b bVar) {
        this.f104071W = bVar;
        m110675b1();
    }

    /* renamed from: Z0 */
    public void m110673Z0(String str) {
        this.f104070V = str;
        m110675b1();
    }

    /* renamed from: a1 */
    public void m110674a1(int i11) {
        this.f104074Z = i11;
    }

    /* renamed from: b1 */
    public void m110675b1() {
        if (this.f104072X != null) {
            b bVar = this.f104071W;
            if (bVar.f104095b != null && bVar.f104106m > 0) {
                synchronized (this.f104069U) {
                    try {
                        Bitmap bitmap = this.f104073Y;
                        if (bitmap != null) {
                            bitmap.recycle();
                            this.f104073Y = null;
                        }
                        Layout m96058d = AbstractC18066a.m96058d(this.f104072X, this.f104071W, this.f104070V, this.f104077c0, m110661L0(), this.f104074Z);
                        this.f104083i0 = m96058d;
                        this.f104079e0 = AbstractC18066a.m96061g(m96058d, AbstractC17358g.m92489b(this.f104072X, 32.0f), 0);
                        if (m110646O0()) {
                            this.f104073Y = AbstractC18066a.m96057c(this.f104083i0, this.f104024H);
                        } else if (m110661L0()) {
                            this.f104073Y = AbstractC18066a.m96056b(this.f104072X, this.f104071W, this.f104079e0, this.f104083i0, this.f104024H);
                        }
                        if (this.f104073Y != null) {
                            m110612o0((int) (r1.getWidth() / this.f104024H), (int) (this.f104073Y.getHeight() / this.f104024H));
                            Bitmap bitmap2 = this.f104073Y;
                            if (bitmap2 != null && !bitmap2.isRecycled()) {
                                AbstractC18594a.m98201h(this.f104073Y, this.f104029M);
                            }
                        }
                        this.f104090p0 = this.f104024H;
                        m110676y0();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                m1952U(new RunnableC21356k(this));
            }
        }
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: d0 */
    public JSONObject mo110584d0() {
        JSONObject mo110584d0 = super.mo110584d0();
        mo110584d0.put("text", this.f104070V);
        mo110584d0.put("width", this.f104074Z);
        mo110584d0.put("color_selected_pos", this.f104081g0);
        mo110584d0.put("font_picker_pos", this.f104082h0);
        mo110584d0.put("caption_mode", this.f104076b0);
        mo110584d0.put("align_mode", this.f104077c0);
        mo110584d0.put("max_diagonal_bitmap", this.f104078d0);
        mo110584d0.put("id", this.f104071W.f104094a);
        mo110584d0.put("font_name", this.f104071W.f104095b);
        mo110584d0.put("line_height", this.f104071W.f104096c);
        mo110584d0.put("text_color", this.f104071W.f104097d);
        mo110584d0.put("stroke_color", this.f104071W.f104098e);
        mo110584d0.put("bg_color", this.f104071W.f104099f);
        mo110584d0.put("bg_start_color", this.f104071W.f104100g);
        mo110584d0.put("bg_end_color", this.f104071W.f104101h);
        mo110584d0.put("rounded", this.f104071W.f104102i);
        mo110584d0.put("light_mode", this.f104071W.f104103j);
        mo110584d0.put("gradient", this.f104071W.f104104k);
        mo110584d0.put("font_text", this.f104071W.f104105l);
        mo110584d0.put("size", this.f104071W.f104106m);
        mo110584d0.put("stroke_type", this.f104071W.f104107n);
        mo110584d0.put("scale_size", this.f104071W.f104109p);
        return mo110584d0;
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: k0 */
    protected void mo110585k0(float[] fArr, C18610q c18610q) {
        if (!this.f104035S) {
            return;
        }
        if (m1947K() < 1.0f) {
            GLES20.glBlendFunc(770, 771);
        } else {
            GLES20.glBlendFunc(1, 771);
        }
        GLES20.glUseProgram(c18610q.f93578a);
        GLES20.glEnableVertexAttribArray(c18610q.f93581d);
        GLES20.glEnableVertexAttribArray(c18610q.f93582e);
        GLES20.glVertexAttribPointer(c18610q.f93581d, 2, 5126, false, 0, (Buffer) m110617u0());
        GLES20.glVertexAttribPointer(c18610q.f93582e, 2, 5126, false, 0, (Buffer) this.f104026J);
        GLES20.glUniform1f(c18610q.f93587j, m1947K());
        GLES20.glUniformMatrix4fv(c18610q.f93580c, 1, false, fArr, 0);
        GLES20.glUniform1i(c18610q.f93583f, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f104075a0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(c18610q.f93581d);
        GLES20.glDisableVertexAttribArray(c18610q.f93582e);
        GLES20.glBindTexture(3553, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p276jt.AbstractC21351f
    /* renamed from: m0 */
    public void mo110586m0(JSONObject jSONObject) {
        super.mo110586m0(jSONObject);
        this.f104070V = jSONObject.getString("text");
        this.f104074Z = jSONObject.getInt("width");
        this.f104081g0 = jSONObject.getInt("color_selected_pos");
        this.f104082h0 = jSONObject.getInt("font_picker_pos");
        this.f104076b0 = jSONObject.getInt("caption_mode");
        this.f104077c0 = jSONObject.getInt("align_mode");
        this.f104078d0 = jSONObject.getInt("max_diagonal_bitmap");
        if (this.f104071W == null) {
            this.f104071W = new b();
        }
        this.f104071W.f104094a = jSONObject.getInt("id");
        this.f104071W.f104095b = jSONObject.getString("font_name");
        this.f104071W.f104096c = jSONObject.getInt("line_height");
        this.f104071W.f104097d = jSONObject.getInt("text_color");
        this.f104071W.f104098e = jSONObject.getInt("stroke_color");
        this.f104071W.f104099f = jSONObject.getInt("bg_color");
        this.f104071W.f104100g = jSONObject.getInt("bg_start_color");
        this.f104071W.f104101h = jSONObject.getInt("bg_end_color");
        this.f104071W.f104102i = jSONObject.getBoolean("rounded");
        this.f104071W.f104103j = jSONObject.getBoolean("light_mode");
        this.f104071W.f104104k = jSONObject.getBoolean("gradient");
        this.f104071W.f104105l = jSONObject.getString("font_text");
        this.f104071W.f104106m = jSONObject.getInt("size");
        this.f104071W.f104107n = jSONObject.getInt("stroke_type");
        this.f104071W.f104109p = (float) jSONObject.getDouble("scale_size");
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: p0 */
    public void mo97628p0(float f11) {
        if (f11 > 10.0f) {
            this.f104024H = 10.0f;
        } else if (f11 < 0.1d) {
            this.f104024H = 0.1f;
        } else {
            this.f104024H = f11;
        }
    }

    @Override // p276jt.AbstractC21351f
    /* renamed from: v0 */
    public void mo110587v0(C20612c c20612c) {
        int i11;
        try {
            int i12 = this.f104077c0;
            int i13 = this.f104081g0 + 1;
            b bVar = this.f104071W;
            if (bVar.f104103j) {
                i11 = bVar.f104094a * 10;
            } else {
                i11 = bVar.f104094a;
            }
            c20612c.m107294r().add(new C20623n(i12, i13, i11, this.f104076b0));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y0 */
    public void m110676y0() {
        RectF rectF;
        float f11;
        this.f104091q0 = this.f104025I;
        if (this.f104073Y != null && (rectF = this.f104028L) != null) {
            int m110649x0 = (int) m110649x0(Math.round(rectF.width() * this.f104024H), Math.round(this.f104028L.height() * this.f104024H));
            int m110649x02 = (int) m110649x0(this.f104073Y.getWidth(), this.f104073Y.getHeight());
            float f12 = m110649x02;
            float f13 = (m110649x0 * 1.0f) / f12;
            if (m110649x02 > 100) {
                f11 = 100.0f / f12;
                m110649x02 = 100;
            } else {
                f11 = 1.0f;
            }
            Bitmap createBitmap = Bitmap.createBitmap(m110649x02, m110649x02, Bitmap.Config.ARGB_8888);
            float width = createBitmap.getWidth() / 2.0f;
            float height = createBitmap.getHeight() / 2.0f;
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix();
            matrix.reset();
            matrix.postTranslate(width - (this.f104073Y.getWidth() / 2.0f), height - (this.f104073Y.getHeight() / 2.0f));
            matrix.postScale(f11, f11, width, height);
            matrix.postRotate(-this.f104025I, width, height);
            canvas.drawBitmap(this.f104073Y, matrix, null);
            float[] m100463b = AbstractC19146a.m100463b(createBitmap);
            createBitmap.recycle();
            float[] fArr = this.f104080f0;
            float f14 = m110649x02;
            fArr[0] = (((0.5f - m100463b[0]) * 1.0f) / f11) * f14 * f13;
            fArr[1] = (((m100463b[1] - 0.5f) * 1.0f) / f11) * f14 * f13;
            fArr[2] = (((0.5f - m100463b[2]) * 1.0f) / f11) * f14 * f13;
            fArr[3] = (((m100463b[3] - 0.5f) * 1.0f) / f11) * f14 * f13;
        }
    }

    /* renamed from: z0 */
    public void m110677z0(a aVar) {
        this.f104092r0 = true;
        AbstractC0837p0.m2227h().mo2040a(new Runnable() { // from class: jt.j

            /* renamed from: q */
            public final /* synthetic */ C21357l.a f104067q;

            public /* synthetic */ RunnableC21355j(C21357l.a aVar2) {
                r2 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C21357l.this.m110647P0(r2);
            }
        });
        this.f104090p0 = this.f104024H;
    }

    public C21357l(String str, b bVar, int i11, int i12, int i13, int i14) {
        this(str, 0, 0, bVar, i11, i12, i13, i14);
    }

    public C21357l(String str, int i11, int i12, b bVar, int i13, int i14, int i15, int i16) {
        this(str, i11, i12, 1.0f, 0.0f, bVar, i13, i14, i15, i16);
    }

    public C21357l(String str, int i11, int i12, float f11, float f12, b bVar, int i13, int i14, int i15, int i16) {
        super(i11, i12, f11, f12);
        this.f104069U = new Object();
        this.f104075a0 = -1;
        this.f104080f0 = new float[4];
        this.f104081g0 = -1;
        this.f104082h0 = 0;
        this.f104084j0 = false;
        this.f104085k0 = false;
        this.f104086l0 = false;
        this.f104087m0 = false;
        this.f104088n0 = false;
        this.f104089o0 = false;
        this.f104092r0 = false;
        this.f104093s0 = false;
        this.f104070V = str;
        this.f104071W = bVar;
        this.f104074Z = i13;
        this.f104076b0 = i14;
        this.f104077c0 = i15;
        this.f104078d0 = i16;
    }

    public C21357l(String str, int i11, int i12, int i13, int i14, int i15) {
        this("Roboto-Medium.ttf", str, i11, i12, i13, i14, i15);
    }

    public C21357l(String str, String str2, int i11, int i12, int i13, int i14, int i15) {
        this.f104069U = new Object();
        this.f104075a0 = -1;
        this.f104078d0 = 1000;
        this.f104080f0 = new float[4];
        this.f104081g0 = -1;
        this.f104082h0 = 0;
        this.f104084j0 = false;
        this.f104085k0 = false;
        this.f104086l0 = false;
        this.f104087m0 = false;
        this.f104088n0 = false;
        this.f104089o0 = false;
        this.f104092r0 = false;
        this.f104093s0 = false;
        this.f104070V = str2.toUpperCase();
        this.f104022F = i11;
        this.f104023G = i12;
        this.f104074Z = i13;
        this.f104024H = 1.0f;
        this.f104025I = 0.0f;
        b bVar = new b();
        this.f104071W = bVar;
        bVar.f104095b = str;
        this.f104076b0 = i14;
        this.f104077c0 = i15;
    }
}
