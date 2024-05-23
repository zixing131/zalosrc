package p706z6;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: z6.n */
/* loaded from: classes3.dex */
public class C31695n {

    /* renamed from: a */
    private final C31696o[] f145611a = new C31696o[4];

    /* renamed from: b */
    private final Matrix[] f145612b = new Matrix[4];

    /* renamed from: c */
    private final Matrix[] f145613c = new Matrix[4];

    /* renamed from: d */
    private final PointF f145614d = new PointF();

    /* renamed from: e */
    private final Path f145615e = new Path();

    /* renamed from: f */
    private final Path f145616f = new Path();

    /* renamed from: g */
    private final C31696o f145617g = new C31696o();

    /* renamed from: h */
    private final float[] f145618h = new float[2];

    /* renamed from: i */
    private final float[] f145619i = new float[2];

    /* renamed from: j */
    private final Path f145620j = new Path();

    /* renamed from: k */
    private final Path f145621k = new Path();

    /* renamed from: l */
    private boolean f145622l = true;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z6.n$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        static final C31695n f145623a = new C31695n();
    }

    /* renamed from: z6.n$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo152462a(C31696o c31696o, Matrix matrix, int i11);

        /* renamed from: b */
        void mo152463b(C31696o c31696o, Matrix matrix, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z6.n$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public final C31694m f145624a;

        /* renamed from: b */
        public final Path f145625b;

        /* renamed from: c */
        public final RectF f145626c;

        /* renamed from: d */
        public final b f145627d;

        /* renamed from: e */
        public final float f145628e;

        c(C31694m c31694m, float f11, RectF rectF, b bVar, Path path) {
            this.f145627d = bVar;
            this.f145624a = c31694m;
            this.f145628e = f11;
            this.f145626c = rectF;
            this.f145625b = path;
        }
    }

    public C31695n() {
        for (int i11 = 0; i11 < 4; i11++) {
            this.f145611a[i11] = new C31696o();
            this.f145612b[i11] = new Matrix();
            this.f145613c[i11] = new Matrix();
        }
    }

    /* renamed from: a */
    private float m152532a(int i11) {
        return (i11 + 1) * 90;
    }

    /* renamed from: b */
    private void m152533b(c cVar, int i11) {
        this.f145618h[0] = this.f145611a[i11].m152562k();
        this.f145618h[1] = this.f145611a[i11].m152563l();
        this.f145612b[i11].mapPoints(this.f145618h);
        if (i11 == 0) {
            Path path = cVar.f145625b;
            float[] fArr = this.f145618h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f145625b;
            float[] fArr2 = this.f145618h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f145611a[i11].m152557d(this.f145612b[i11], cVar.f145625b);
        b bVar = cVar.f145627d;
        if (bVar != null) {
            bVar.mo152462a(this.f145611a[i11], this.f145612b[i11], i11);
        }
    }

    /* renamed from: c */
    private void m152534c(c cVar, int i11) {
        int i12 = (i11 + 1) % 4;
        this.f145618h[0] = this.f145611a[i11].m152560i();
        this.f145618h[1] = this.f145611a[i11].m152561j();
        this.f145612b[i11].mapPoints(this.f145618h);
        this.f145619i[0] = this.f145611a[i12].m152562k();
        this.f145619i[1] = this.f145611a[i12].m152563l();
        this.f145612b[i12].mapPoints(this.f145619i);
        float f11 = this.f145618h[0];
        float[] fArr = this.f145619i;
        float max = Math.max(((float) Math.hypot(f11 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float m152538i = m152538i(cVar.f145626c, i11);
        this.f145617g.m152565n(0.0f, 0.0f);
        C31687f m152539j = m152539j(i11, cVar.f145624a);
        m152539j.mo31806b(max, m152538i, cVar.f145628e, this.f145617g);
        this.f145620j.reset();
        this.f145617g.m152557d(this.f145613c[i11], this.f145620j);
        if (this.f145622l && (m152539j.mo152395a() || m152541l(this.f145620j, i11) || m152541l(this.f145620j, i12))) {
            Path path = this.f145620j;
            path.op(path, this.f145616f, Path.Op.DIFFERENCE);
            this.f145618h[0] = this.f145617g.m152562k();
            this.f145618h[1] = this.f145617g.m152563l();
            this.f145613c[i11].mapPoints(this.f145618h);
            Path path2 = this.f145615e;
            float[] fArr2 = this.f145618h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f145617g.m152557d(this.f145613c[i11], this.f145615e);
        } else {
            this.f145617g.m152557d(this.f145613c[i11], cVar.f145625b);
        }
        b bVar = cVar.f145627d;
        if (bVar != null) {
            bVar.mo152463b(this.f145617g, this.f145613c[i11], i11);
        }
    }

    /* renamed from: f */
    private void m152535f(int i11, RectF rectF, PointF pointF) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    /* renamed from: g */
    private InterfaceC31684c m152536g(int i11, C31694m c31694m) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return c31694m.m152490t();
                }
                return c31694m.m152488r();
            }
            return c31694m.m152481j();
        }
        return c31694m.m152483l();
    }

    /* renamed from: h */
    private AbstractC31685d m152537h(int i11, C31694m c31694m) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return c31694m.m152489s();
                }
                return c31694m.m152487q();
            }
            return c31694m.m152480i();
        }
        return c31694m.m152482k();
    }

    /* renamed from: i */
    private float m152538i(RectF rectF, int i11) {
        float[] fArr = this.f145618h;
        C31696o c31696o = this.f145611a[i11];
        fArr[0] = c31696o.f145631c;
        fArr[1] = c31696o.f145632d;
        this.f145612b[i11].mapPoints(fArr);
        if (i11 != 1 && i11 != 3) {
            return Math.abs(rectF.centerY() - this.f145618h[1]);
        }
        return Math.abs(rectF.centerX() - this.f145618h[0]);
    }

    /* renamed from: j */
    private C31687f m152539j(int i11, C31694m c31694m) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return c31694m.m152485o();
                }
                return c31694m.m152486p();
            }
            return c31694m.m152484n();
        }
        return c31694m.m152479h();
    }

    /* renamed from: k */
    public static C31695n m152540k() {
        return a.f145623a;
    }

    /* renamed from: l */
    private boolean m152541l(Path path, int i11) {
        this.f145621k.reset();
        this.f145611a[i11].m152557d(this.f145612b[i11], this.f145621k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f145621k.computeBounds(rectF, true);
        path.op(this.f145621k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m152542m(c cVar, int i11) {
        m152537h(i11, cVar.f145624a).m152394b(this.f145611a[i11], 90.0f, cVar.f145628e, cVar.f145626c, m152536g(i11, cVar.f145624a));
        float m152532a = m152532a(i11);
        this.f145612b[i11].reset();
        m152535f(i11, cVar.f145626c, this.f145614d);
        Matrix matrix = this.f145612b[i11];
        PointF pointF = this.f145614d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f145612b[i11].preRotate(m152532a);
    }

    /* renamed from: n */
    private void m152543n(int i11) {
        this.f145618h[0] = this.f145611a[i11].m152560i();
        this.f145618h[1] = this.f145611a[i11].m152561j();
        this.f145612b[i11].mapPoints(this.f145618h);
        float m152532a = m152532a(i11);
        this.f145613c[i11].reset();
        Matrix matrix = this.f145613c[i11];
        float[] fArr = this.f145618h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f145613c[i11].preRotate(m152532a);
    }

    /* renamed from: d */
    public void m152544d(C31694m c31694m, float f11, RectF rectF, Path path) {
        m152545e(c31694m, f11, rectF, null, path);
    }

    /* renamed from: e */
    public void m152545e(C31694m c31694m, float f11, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f145615e.rewind();
        this.f145616f.rewind();
        this.f145616f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(c31694m, f11, rectF, bVar, path);
        for (int i11 = 0; i11 < 4; i11++) {
            m152542m(cVar, i11);
            m152543n(i11);
        }
        for (int i12 = 0; i12 < 4; i12++) {
            m152533b(cVar, i12);
            m152534c(cVar, i12);
        }
        path.close();
        this.f145615e.close();
        if (!this.f145615e.isEmpty()) {
            path.op(this.f145615e, Path.Op.UNION);
        }
    }
}
