package j00;

import a00.InterfaceC0017b;
import android.graphics.Bitmap;
import b00.C2480c;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i00.C20180c;
import k00.AbstractC21426c;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p733zz.C32609a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: j00.b */
/* loaded from: classes4.dex */
public final class C20899b implements InterfaceC20898a {
    public static final a Companion = new a(null);

    /* renamed from: j00.b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: j00.b$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        private CoroutineScope f102693t;

        /* renamed from: u */
        int f102694u;

        /* renamed from: w */
        final /* synthetic */ C2480c f102696w;

        /* renamed from: x */
        final /* synthetic */ Bitmap f102697x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C2480c c2480c, Bitmap bitmap, Continuation continuation) {
            super(2, continuation);
            this.f102696w = c2480c;
            this.f102697x = bitmap;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            AbstractC19074t.m100208f(continuation, "completion");
            b bVar = new b(this.f102696w, this.f102697x, continuation);
            bVar.f102693t = (CoroutineScope) obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f102694u == 0) {
                AbstractC24862s.m129228b(obj);
                C2480c m109341g = C20899b.this.m109341g(this.f102696w);
                InterfaceC0017b m12523f = m109341g.m12523f();
                AbstractC19074t.m100207e(m12523f, "dstBound.bottomRight");
                int x11 = ((int) m12523f.getX()) + 1;
                InterfaceC0017b m12523f2 = m109341g.m12523f();
                AbstractC19074t.m100207e(m12523f2, "dstBound.bottomRight");
                int y11 = ((int) m12523f2.getY()) + 1;
                if (!C20899b.this.m109340f(x11, y11, this.f102697x)) {
                    return C20899b.this.m109343i(this.f102697x, C20899b.this.m109342h(this.f102696w, m109341g), x11, y11);
                }
                return this.f102697x;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public final Object mo240pC(Object obj, Object obj2) {
            return ((b) mo238a(obj, (Continuation) obj2)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: f */
    public final boolean m109340f(int i11, int i12, Bitmap bitmap) {
        if (Math.abs(i11 - bitmap.getWidth()) <= 4 && Math.abs(i12 - bitmap.getHeight()) <= 4) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final C2480c m109341g(C2480c c2480c) {
        InterfaceC0017b m12524g = c2480c.m12524g();
        AbstractC19074t.m100207e(m12524g, "bound.topLeft");
        InterfaceC0017b m12525h = c2480c.m12525h();
        AbstractC19074t.m100207e(m12525h, "bound.topRight");
        InterfaceC0017b m12522e = c2480c.m12522e();
        AbstractC19074t.m100207e(m12522e, "bound.bottomLeft");
        C2480c m12519c = C2480c.m12519c((int) C32609a.m157939i(m12524g, m12525h), (int) C32609a.m157939i(m12524g, m12522e));
        AbstractC19074t.m100207e(m12519c, "Tetragram.createRectangl…ding(newWidth, newHeight)");
        return m12519c;
    }

    /* renamed from: h */
    public final C20180c m109342h(C2480c c2480c, C2480c c2480c2) {
        float[][] m12531o = c2480c.m12531o();
        float[][] m12531o2 = c2480c2.m12531o();
        double[][] dArr = new double[8];
        char c11 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            dArr[i11] = new double[8];
        }
        int i12 = 0;
        while (i12 <= 3) {
            int i13 = i12 * 2;
            double[] dArr2 = dArr[i13];
            float[] fArr = m12531o[i12];
            float f11 = fArr[c11];
            double[][] dArr3 = dArr;
            dArr2[c11] = f11;
            float f12 = fArr[1];
            int i14 = i12;
            dArr2[1] = f12;
            dArr2[2] = 1.0d;
            dArr2[3] = 0.0d;
            dArr2[4] = 0.0d;
            dArr2[5] = 0.0d;
            float[] fArr2 = m12531o2[i14];
            float f13 = fArr2[0];
            dArr2[6] = (-f11) * f13;
            dArr2[7] = (-f13) * f12;
            double[] dArr4 = dArr3[i13 + 1];
            dArr4[0] = 0.0d;
            dArr4[1] = 0.0d;
            dArr4[2] = 0.0d;
            dArr4[3] = f11;
            dArr4[4] = f12;
            dArr4[5] = 1.0d;
            float f14 = fArr2[1];
            dArr4[6] = (-f11) * f14;
            dArr4[7] = (-f12) * f14;
            i12 = i14 + 1;
            dArr = dArr3;
            c11 = 0;
        }
        C20180c c20180c = new C20180c(dArr);
        double[] dArr5 = new double[8];
        for (int i15 = 0; i15 <= 3; i15++) {
            int i16 = i15 * 2;
            float[] fArr3 = m12531o2[i15];
            dArr5[i16] = fArr3[0];
            dArr5[i16 + 1] = fArr3[1];
        }
        C20180c m105279r = c20180c.m105276m().m105279r(new C20180c(dArr5, 8));
        AbstractC19074t.m100207e(m105279r, "trsf");
        double[] m105272h = m105279r.m105272h();
        C20180c c20180c2 = new C20180c(3, 3);
        for (int i17 = 0; i17 <= 7; i17++) {
            c20180c2.m105277p(i17 / 3, i17 % 3, m105272h[i17]);
        }
        c20180c2.m105277p(2, 2, 1.0d);
        return c20180c2;
    }

    /* renamed from: i */
    public final Bitmap m109343i(Bitmap bitmap, C20180c c20180c, int i11, int i12) {
        if (!AbstractC21426c.m110930a(bitmap)) {
            return bitmap;
        }
        if (!AbstractC21426c.m110932c(c20180c) || !AbstractC21426c.m110931b(i11, i12)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, bitmap.getConfig());
        C20180c m105276m = c20180c.m105276m();
        AbstractC19074t.m100207e(m105276m, "transformMatrix.inverse()");
        double[][] m105269e = m105276m.m105269e();
        char c11 = 0;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = 0;
            while (i14 < i11) {
                double[] dArr = m105269e[2];
                double d11 = i14;
                double d12 = i13;
                double d13 = (dArr[c11] * d11) + (dArr[1] * d12) + dArr[2];
                double[] dArr2 = m105269e[c11];
                double d14 = (dArr2[c11] * d11) + (dArr2[1] * d12) + dArr2[2];
                int i15 = i13;
                int i16 = (int) (d14 / d13);
                double[] dArr3 = m105269e[1];
                int i17 = (int) ((((dArr3[0] * d11) + (dArr3[1] * d12)) + dArr3[2]) / d13);
                if (i16 >= 0 && i17 >= 0 && i16 < width && i17 < height) {
                    int pixel = bitmap.getPixel(i16, i17);
                    i13 = i15;
                    createBitmap.setPixel(i14, i13, pixel);
                } else {
                    i13 = i15;
                }
                i14++;
                c11 = 0;
            }
            i13++;
            c11 = 0;
        }
        return createBitmap;
    }

    @Override // j00.InterfaceC20898a
    /* renamed from: a */
    public Object mo109335a(Bitmap bitmap, C2480c c2480c, Continuation continuation) {
        return BuildersKt.m112534g(Dispatchers.m112680b(), new b(c2480c, bitmap, null), continuation);
    }
}
