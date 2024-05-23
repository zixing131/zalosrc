package p277ju;

import android.graphics.Bitmap;
import java.lang.reflect.Array;

/* renamed from: ju.d */
/* loaded from: classes4.dex */
class C21366d {

    /* renamed from: d */
    int f104177d;

    /* renamed from: e */
    int f104178e;

    /* renamed from: r */
    private final Bitmap f104191r;

    /* renamed from: w */
    private int f104196w;

    /* renamed from: x */
    private int f104197x;

    /* renamed from: a */
    public int f104174a = 8;

    /* renamed from: c */
    public int f104176c = 0;

    /* renamed from: h */
    int f104181h = 3;

    /* renamed from: i */
    int[] f104182i = {1, 2, 3};

    /* renamed from: j */
    int[] f104183j = {1, 1, 1};

    /* renamed from: k */
    int[] f104184k = {1, 1, 1};

    /* renamed from: l */
    int[] f104185l = {0, 1, 1};

    /* renamed from: m */
    int[] f104186m = {0, 1, 1};

    /* renamed from: n */
    int[] f104187n = {0, 1, 1};

    /* renamed from: o */
    int f104188o = 63;

    /* renamed from: p */
    int f104189p = 0;

    /* renamed from: q */
    int f104190q = 0;

    /* renamed from: s */
    private final boolean[] f104192s = {false, false, false};

    /* renamed from: t */
    private final boolean[] f104193t = {false, false, false};

    /* renamed from: b */
    public Object[] f104175b = new Object[3];

    /* renamed from: u */
    private final int[] f104194u = new int[3];

    /* renamed from: v */
    private final int[] f104195v = new int[3];

    /* renamed from: f */
    int[] f104179f = new int[3];

    /* renamed from: g */
    int[] f104180g = new int[3];

    public C21366d(Bitmap bitmap) {
        this.f104191r = bitmap;
        this.f104178e = bitmap.getWidth();
        this.f104177d = bitmap.getHeight();
        m110733b();
    }

    /* renamed from: a */
    private int m110732a(int i11, int i12, int[] iArr, int i13, int i14) {
        if (iArr.length == i13 * i14) {
            if (i11 >= i13) {
                i11 = Math.max(0, (i13 - 1) - (i11 - i13));
            }
            if (i12 >= i14) {
                i12 = Math.max(0, (i14 - 1) - (i12 - i14));
            }
            return iArr[(i12 * i13) + i11];
        }
        throw new IllegalArgumentException("pixels.length (" + iArr.length + ") != w (" + i13 + ") * h (" + i14 + ")");
    }

    /* renamed from: b */
    private void m110733b() {
        int[] iArr = new int[this.f104178e * this.f104177d];
        this.f104196w = 1;
        this.f104197x = 1;
        for (int i11 = 0; i11 < this.f104181h; i11++) {
            this.f104196w = Math.max(this.f104196w, this.f104183j[i11]);
            this.f104197x = Math.max(this.f104197x, this.f104184k[i11]);
        }
        for (int i12 = 0; i12 < this.f104181h; i12++) {
            int[] iArr2 = this.f104194u;
            int i13 = this.f104178e;
            if (i13 % 8 != 0) {
                i13 = ((int) Math.ceil(i13 / 8.0d)) * 8;
            }
            int i14 = this.f104196w;
            int[] iArr3 = this.f104183j;
            iArr2[i12] = (i13 / i14) * iArr3[i12];
            int i15 = this.f104194u[i12];
            if (i15 != (this.f104178e / i14) * iArr3[i12]) {
                this.f104192s[i12] = true;
            }
            this.f104179f[i12] = (int) Math.ceil(i15 / 8.0d);
            int[] iArr4 = this.f104195v;
            int i16 = this.f104177d;
            if (i16 % 8 != 0) {
                i16 = ((int) Math.ceil(i16 / 8.0d)) * 8;
            }
            int i17 = this.f104197x;
            int[] iArr5 = this.f104184k;
            iArr4[i12] = (i16 / i17) * iArr5[i12];
            int i18 = this.f104195v[i12];
            if (i18 != (this.f104177d / i17) * iArr5[i12]) {
                this.f104193t[i12] = true;
            }
            this.f104180g[i12] = (int) Math.ceil(i18 / 8.0d);
        }
        try {
            Bitmap bitmap = this.f104191r;
            int i19 = this.f104178e;
            bitmap.getPixels(iArr, 0, i19, 0, 0, i19, this.f104177d);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        int[] iArr6 = {this.f104195v[0], this.f104194u[0]};
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr6);
        float[][] fArr2 = (float[][]) Array.newInstance((Class<?>) cls, this.f104195v[0], this.f104194u[0]);
        float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, this.f104195v[0], this.f104194u[0]);
        for (int i21 = 0; i21 < this.f104195v[0]; i21++) {
            int i22 = 0;
            while (i22 < this.f104194u[0]) {
                int m110732a = m110732a(i22, i21, iArr, this.f104178e, this.f104177d);
                double d11 = (m110732a >> 16) & 255;
                double d12 = (m110732a >> 8) & 255;
                double d13 = m110732a & 255;
                fArr[i21][i22] = (float) ((0.299d * d11) + (0.587d * d12) + (0.114d * d13));
                fArr3[i21][i22] = ((float) ((((-0.16874d) * d11) - (0.33126d * d12)) + (d13 * 0.5d))) + 128.0f;
                fArr2[i21][i22] = ((float) (((d11 * 0.5d) - (d12 * 0.41869d)) - (0.08131d * d13))) + 128.0f;
                i22++;
                iArr = iArr;
            }
        }
        Object[] objArr = this.f104175b;
        objArr[0] = fArr;
        objArr[1] = fArr3;
        objArr[2] = fArr2;
    }
}
