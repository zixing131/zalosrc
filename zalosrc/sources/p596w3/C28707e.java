package p596w3;

import android.graphics.Matrix;
import java.util.List;
import p566v3.C27495c;
import p566v3.C27496d;

/* renamed from: w3.e */
/* loaded from: classes2.dex */
public class C28707e extends AbstractC28708f {

    /* renamed from: e */
    private final C27495c.b f133194e;

    /* renamed from: f */
    private final float[] f133195f;

    /* renamed from: w3.e$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f133196a;

        static {
            int[] iArr = new int[C27495c.b.values().length];
            f133196a = iArr;
            try {
                iArr[C27495c.b.ROTATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133196a[C27495c.b.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133196a[C27495c.b.POSITION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133196a[C27495c.b.X_POSITION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f133196a[C27495c.b.Y_POSITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private C28707e(List list, float[][][] fArr, C27495c.b bVar, float[] fArr2) {
        super(list, fArr);
        this.f133194e = bVar;
        fArr2 = fArr2 == null ? new float[2] : fArr2;
        this.f133195f = fArr2;
        if (bVar == C27495c.b.POSITION) {
            fArr2[0] = ((C27496d) list.get(0)).m140604b()[0];
            fArr2[1] = ((C27496d) list.get(0)).m140604b()[1];
        }
    }

    /* renamed from: e */
    private void m143771e(C27496d c27496d, C27496d c27496d2, float f11, Matrix matrix) {
        if (c27496d2 == null) {
            return;
        }
        matrix.postTranslate(AbstractC28708f.m143778c(c27496d.m140604b()[0], c27496d2.m140604b()[0], f11) - this.f133195f[0], AbstractC28708f.m143778c(c27496d.m140604b()[1], c27496d2.m140604b()[1], f11) - this.f133195f[1]);
    }

    /* renamed from: f */
    private void m143772f(C27496d c27496d, C27496d c27496d2, float f11, Matrix matrix) {
        float f12;
        float f13;
        float f14 = 0.0f;
        if (c27496d2 == null) {
            float f15 = c27496d.m140604b()[0];
            float[] fArr = this.f133195f;
            if (fArr != null) {
                f13 = fArr[0];
            } else {
                f13 = 0.0f;
            }
            if (fArr != null) {
                f14 = fArr[1];
            }
            matrix.postRotate(f15, f13, f14);
            return;
        }
        float m143778c = AbstractC28708f.m143778c(c27496d.m140604b()[0], c27496d2.m140604b()[0], f11);
        float[] fArr2 = this.f133195f;
        if (fArr2 != null) {
            f12 = fArr2[0];
        } else {
            f12 = 0.0f;
        }
        if (fArr2 != null) {
            f14 = fArr2[1];
        }
        matrix.postRotate(m143778c, f12, f14);
    }

    /* renamed from: g */
    private void m143773g(C27496d c27496d, C27496d c27496d2, float f11, Matrix matrix) {
        float f12;
        float f13;
        float f14 = 0.0f;
        if (c27496d2 == null) {
            float f15 = c27496d.m140604b()[0] / 100.0f;
            float f16 = c27496d.m140604b()[1] / 100.0f;
            float[] fArr = this.f133195f;
            if (fArr != null) {
                f13 = fArr[0];
            } else {
                f13 = 0.0f;
            }
            if (fArr != null) {
                f14 = fArr[1];
            }
            matrix.postScale(f15, f16, f13, f14);
            return;
        }
        float f17 = c27496d.m140604b()[0];
        float f18 = c27496d2.m140604b()[0];
        float f19 = c27496d.m140604b()[1];
        float f21 = c27496d2.m140604b()[1];
        float m143778c = AbstractC28708f.m143778c(f17, f18, f11) / 100.0f;
        float m143778c2 = AbstractC28708f.m143778c(f19, f21, f11) / 100.0f;
        float[] fArr2 = this.f133195f;
        if (fArr2 != null) {
            f12 = fArr2[0];
        } else {
            f12 = 0.0f;
        }
        if (fArr2 != null) {
            f14 = fArr2[1];
        }
        matrix.postScale(m143778c, m143778c2, f12, f14);
    }

    /* renamed from: h */
    private void m143774h(C27496d c27496d, C27496d c27496d2, float f11, Matrix matrix) {
        if (c27496d2 == null) {
            matrix.postTranslate(c27496d.m140604b()[0], 0.0f);
        } else {
            matrix.postTranslate(AbstractC28708f.m143778c(c27496d.m140604b()[0], c27496d2.m140604b()[0], f11), 0.0f);
        }
    }

    /* renamed from: i */
    private void m143775i(C27496d c27496d, C27496d c27496d2, float f11, Matrix matrix) {
        if (c27496d2 == null) {
            matrix.postTranslate(0.0f, c27496d.m140604b()[0]);
        } else {
            matrix.postTranslate(0.0f, AbstractC28708f.m143778c(c27496d.m140604b()[0], c27496d2.m140604b()[0], f11));
        }
    }

    /* renamed from: j */
    public static C28707e m143776j(C27495c c27495c) {
        if (c27495c.m140599e().m140603c()) {
            return new C28707e(c27495c.m140598d(), c27495c.m140600f(), c27495c.m140599e(), c27495c.m140596b());
        }
        throw new IllegalArgumentException("Cannot create a KeyFramedMatrixAnimation from a non matrix based KFAnimation.");
    }

    @Override // p596w3.AbstractC28708f
    /* renamed from: d */
    public void mo143756b(C27496d c27496d, C27496d c27496d2, float f11, Matrix matrix) {
        int i11 = a.f133196a[this.f133194e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            m143775i(c27496d, c27496d2, f11, matrix);
                            return;
                        }
                        throw new UnsupportedOperationException("Cannot apply matrix transformation to " + this.f133194e);
                    }
                    m143774h(c27496d, c27496d2, f11, matrix);
                    return;
                }
                m143771e(c27496d, c27496d2, f11, matrix);
                return;
            }
            m143773g(c27496d, c27496d2, f11, matrix);
            return;
        }
        m143772f(c27496d, c27496d2, f11, matrix);
    }
}
