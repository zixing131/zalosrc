package p516t3;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: t3.a */
/* loaded from: classes2.dex */
public class C26467a {

    /* renamed from: a */
    private final Path f125665a;

    /* renamed from: b */
    private final float[] f125666b;

    public C26467a() {
        this(new Path(), new float[]{0.0f, 0.0f});
    }

    /* renamed from: a */
    private void m136383a(float f11, float f12) {
        float[] fArr = this.f125666b;
        fArr[0] = f11;
        fArr[1] = f12;
    }

    /* renamed from: i */
    private void m136384i(float f11, float f12) {
        float[] fArr = this.f125666b;
        fArr[0] = fArr[0] + f11;
        fArr[1] = fArr[1] + f12;
    }

    /* renamed from: b */
    public void m136385b(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f125665a.cubicTo(f11, f12, f13, f14, f15, f16);
        m136383a(f15, f16);
    }

    /* renamed from: c */
    public float[] m136386c() {
        return this.f125666b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public Path m136387d() {
        return this.f125665a;
    }

    /* renamed from: e */
    public boolean m136388e() {
        return this.f125665a.isEmpty();
    }

    /* renamed from: f */
    public void m136389f(float f11, float f12) {
        this.f125665a.lineTo(f11, f12);
        m136383a(f11, f12);
    }

    /* renamed from: g */
    public void m136390g(float f11, float f12) {
        this.f125665a.moveTo(f11, f12);
        m136383a(f11, f12);
    }

    /* renamed from: h */
    public void m136391h(float f11, float f12, float f13, float f14) {
        this.f125665a.quadTo(f11, f12, f13, f14);
        m136383a(f13, f14);
    }

    /* renamed from: j */
    public void m136392j(float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f125665a.rCubicTo(f11, f12, f13, f14, f15, f16);
        m136384i(f15, f16);
    }

    /* renamed from: k */
    public void m136393k(float f11, float f12) {
        this.f125665a.rLineTo(f11, f12);
        m136384i(f11, f12);
    }

    /* renamed from: l */
    public void m136394l(float f11, float f12) {
        this.f125665a.rMoveTo(f11, f12);
        m136384i(f11, f12);
    }

    /* renamed from: m */
    public void m136395m(float f11, float f12, float f13, float f14) {
        this.f125665a.rQuadTo(f11, f12, f13, f14);
        m136384i(f13, f14);
    }

    /* renamed from: n */
    public void m136396n() {
        this.f125665a.reset();
        m136383a(0.0f, 0.0f);
    }

    /* renamed from: o */
    public void m136397o(Matrix matrix) {
        this.f125665a.transform(matrix);
        matrix.mapPoints(this.f125666b);
    }

    C26467a(Path path, float[] fArr) {
        this.f125665a = path;
        this.f125666b = fArr;
    }
}
