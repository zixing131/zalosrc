package ht;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import et.C18596c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.LinkedList;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import se0.AbstractC26236a;
import se0.AbstractC26237b;

/* renamed from: ht.d */
/* loaded from: classes4.dex */
public class C20124d implements GLSurfaceView.Renderer {

    /* renamed from: s */
    private C18596c f99233s;

    /* renamed from: u */
    private ByteBuffer f99235u;

    /* renamed from: v */
    private int f99236v;

    /* renamed from: w */
    private int f99237w;

    /* renamed from: x */
    private int f99238x;

    /* renamed from: y */
    private int f99239y;

    /* renamed from: z */
    private int f99240z;

    /* renamed from: t */
    private int f99234t = -1;

    /* renamed from: A */
    private int f99226A = 1;

    /* renamed from: B */
    private float f99227B = 0.0f;

    /* renamed from: C */
    private float f99228C = 0.0f;

    /* renamed from: D */
    private float f99229D = 0.0f;

    /* renamed from: r */
    private final Queue f99232r = new LinkedList();

    /* renamed from: p */
    private final FloatBuffer f99230p = AbstractC26237b.m134918c(AbstractC26237b.f124626a);

    /* renamed from: q */
    private final FloatBuffer f99231q = AbstractC26237b.m134917b(AbstractC26237b.f124630e.length);

    public C20124d(C18596c c18596c) {
        this.f99233s = c18596c;
        m104740o(0);
    }

    /* renamed from: d */
    private float m104729d(float f11, float f12) {
        return f11 == 0.0f ? f12 : 1.0f - f12;
    }

    /* renamed from: e */
    private void m104730e() {
        int i11 = this.f99236v;
        float f11 = i11;
        int i12 = this.f99237w;
        float f12 = i12;
        int i13 = this.f99240z;
        if (i13 == 3 || i13 == 1) {
            f11 = i12;
            f12 = i11;
        }
        float max = Math.max(f11 / this.f99238x, f12 / this.f99239y);
        float round = Math.round(this.f99238x * max) / f11;
        float round2 = Math.round(this.f99239y * max) / f12;
        float[] fArr = AbstractC26237b.f124626a;
        float[] m134922g = AbstractC26237b.m134922g(this.f99240z, false, false);
        if (this.f99226A == 1) {
            float f13 = (1.0f - (1.0f / round)) / 2.0f;
            float f14 = (1.0f - (1.0f / round2)) / 2.0f;
            m134922g = new float[]{m104729d(m134922g[0], f13), m104729d(m134922g[1], f14), m104729d(m134922g[2], f13), m104729d(m134922g[3], f14), m104729d(m134922g[4], f13), m104729d(m134922g[5], f14), m104729d(m134922g[6], f13), m104729d(m134922g[7], f14)};
        } else {
            fArr = new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round};
        }
        this.f99230p.clear();
        this.f99230p.put(fArr).position(0);
        this.f99231q.clear();
        this.f99231q.put(m134922g).position(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m104731g() {
        GLES20.glDeleteTextures(1, new int[]{this.f99234t}, 0);
        this.f99234t = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m104732h(C18596c c18596c) {
        C18596c c18596c2 = this.f99233s;
        this.f99233s = c18596c;
        if (c18596c2 != null) {
            c18596c2.destroy();
        }
        this.f99233s.mo98209c();
        GLES20.glUseProgram(this.f99233s.m98213h());
        this.f99233s.mo98208b(this.f99236v, this.f99237w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m104733i(Bitmap bitmap, boolean z11) {
        Bitmap bitmap2;
        Bitmap bitmap3 = null;
        if (bitmap.getWidth() % 2 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() + 1, bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            bitmap3 = createBitmap;
        }
        if (bitmap3 != null) {
            bitmap2 = bitmap3;
        } else {
            bitmap2 = bitmap;
        }
        this.f99234t = AbstractC26236a.m134909p(bitmap2, this.f99234t, z11);
        if (bitmap3 != null && !bitmap3.isRecycled()) {
            bitmap3.recycle();
        }
        this.f99238x = bitmap.getWidth();
        this.f99239y = bitmap.getHeight();
        m104730e();
    }

    /* renamed from: j */
    private void m104734j() {
        synchronized (this.f99232r) {
            while (!this.f99232r.isEmpty()) {
                try {
                    ((Runnable) this.f99232r.poll()).run();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: f */
    public void m104735f() {
        m104736k(new Runnable() { // from class: ht.a
            @Override // java.lang.Runnable
            public final void run() {
                C20124d.this.m104731g();
            }
        });
    }

    /* renamed from: k */
    protected void m104736k(Runnable runnable) {
        synchronized (this.f99232r) {
            this.f99232r.add(runnable);
        }
    }

    /* renamed from: l */
    public Bitmap m104737l() {
        Bitmap createBitmap = Bitmap.createBitmap(this.f99236v, this.f99237w, Bitmap.Config.ARGB_8888);
        AbstractC26236a.m134910q(createBitmap, this.f99235u, this.f99238x, this.f99239y, this.f99236v, this.f99237w, false);
        this.f99235u.rewind();
        return createBitmap;
    }

    /* renamed from: m */
    public void m104738m(final C18596c c18596c) {
        m104736k(new Runnable() { // from class: ht.b
            @Override // java.lang.Runnable
            public final void run() {
                C20124d.this.m104732h(c18596c);
            }
        });
    }

    /* renamed from: n */
    public void m104739n(final Bitmap bitmap, final boolean z11) {
        if (bitmap == null) {
            return;
        }
        m104736k(new Runnable() { // from class: ht.c
            @Override // java.lang.Runnable
            public final void run() {
                C20124d.this.m104733i(bitmap, z11);
            }
        });
    }

    /* renamed from: o */
    public void m104740o(int i11) {
        this.f99240z = i11;
        m104730e();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(16640);
        m104734j();
        this.f99233s.mo98207a(this.f99234t, this.f99230p, this.f99231q);
        this.f99235u.rewind();
        GLES20.glReadPixels(0, 0, this.f99236v, this.f99237w, 6408, 5121, this.f99235u);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i11, int i12) {
        this.f99236v = i11;
        this.f99237w = i12;
        GLES20.glViewport(0, 0, i11, i12);
        GLES20.glUseProgram(this.f99233s.m98213h());
        this.f99233s.mo98208b(i11, i12);
        m104730e();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i11 * i12 * 4);
        this.f99235u = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(this.f99227B, this.f99228C, this.f99229D, 1.0f);
        GLES20.glDisable(2929);
        this.f99233s.mo98209c();
    }
}
