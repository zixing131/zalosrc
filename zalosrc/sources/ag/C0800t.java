package ag;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.zing.zalo.cameradecor.filter.ColorFilterConfig;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.nio.IntBuffer;
import me0.AbstractC23009a3;
import me0.AbstractC23203s;
import p546uf.InterfaceC27243b;
import p643xf.C29615h;
import p643xf.C29617j;
import p679yf.C30923c;
import se0.AbstractC26236a;
import wf.C28951c;
import wf.C28953e;

/* renamed from: ag.t */
/* loaded from: classes3.dex */
public class C0800t extends C0788h implements InterfaceC0797q {

    /* renamed from: O */
    private Bitmap f2756O;

    /* renamed from: P */
    private C28951c f2757P;

    /* renamed from: Q */
    private C29617j f2758Q;

    /* renamed from: R */
    private C28953e f2759R;

    /* renamed from: S */
    private final C30923c f2760S;

    /* renamed from: T */
    private a f2761T;

    /* renamed from: U */
    private final int f2762U;

    /* renamed from: V */
    private final int f2763V;

    /* renamed from: W */
    private int f2764W;

    /* renamed from: X */
    private final ColorFilterConfig f2765X;

    /* renamed from: Y */
    private InterfaceC27243b f2766Y;

    /* renamed from: ag.t$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final String f2767a;

        /* renamed from: b */
        private final int f2768b;

        public a(String str, int i11) {
            this.f2767a = str;
            this.f2768b = i11;
        }
    }

    public C0800t(Context context, C30923c c30923c, int i11, int i12, ColorFilterConfig colorFilterConfig) {
        super(context, null, null);
        this.f2764W = 3;
        this.f2760S = c30923c;
        this.f2762U = i11;
        this.f2763V = i12;
        this.f2765X = colorFilterConfig;
        if (colorFilterConfig != null) {
            try {
                this.f2766Y = AbstractC23203s.m119548a(CoreUtility.getAppContext(), colorFilterConfig.f41831p, AbstractC23203s.m119549b(colorFilterConfig.f41831p));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ void m2018z0(Bitmap bitmap) {
        AbstractC23009a3.m117971v(bitmap, this.f2761T.f2767a, this.f2761T.f2768b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.C0788h, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        m1984v0(null);
        C29617j c29617j = this.f2758Q;
        if (c29617j != null) {
            c29617j.destroy();
        }
        C28951c c28951c = this.f2757P;
        if (c28951c != null) {
            c28951c.destroy();
        }
        C28953e c28953e = this.f2759R;
        if (c28953e != null) {
            c28953e.destroy();
        }
    }

    /* renamed from: A0 */
    public void m2019A0(Bitmap bitmap) {
        this.f2756O = bitmap;
    }

    /* renamed from: B0 */
    public void m2020B0(a aVar) {
        this.f2761T = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ag.C0788h, ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        if (z11) {
            C28951c c28951c = new C28951c();
            this.f2757P = c28951c;
            c28951c.m1995x();
            this.f2757P.mo1956Z(this.f2704t, this.f2705u);
            C28951c c28951c2 = this.f2757P;
            int i11 = this.f2762U;
            int i12 = this.f2763V;
            C30923c c30923c = this.f2760S;
            c28951c2.m144616i0(i11, i12, c30923c.f142621c, c30923c.f142627i);
            Bitmap bitmap = this.f2756O;
            if (bitmap != null) {
                C28953e c28953e = new C28953e(this.f2714F, bitmap, this.f2760S);
                this.f2759R = c28953e;
                c28953e.m1995x();
                this.f2759R.m144607c0(this.f2760S);
                this.f2759R.mo1956Z(this.f2704t, this.f2705u);
            }
            m1984v0(new C29615h(this.f2757P, this.f2758Q));
            if (this.f2765X != null) {
                if (!m1979o0()) {
                    m1985w0();
                }
                m1969e0(this.f2766Y, this.f2765X);
                return;
            }
            return;
        }
        C29617j c29617j = this.f2758Q;
        if (c29617j != null) {
            c29617j.mo1956Z(this.f2704t, this.f2705u);
        }
        C28951c c28951c3 = this.f2757P;
        if (c28951c3 != null) {
            c28951c3.mo1956Z(this.f2704t, this.f2705u);
        }
        C28953e c28953e2 = this.f2759R;
        if (c28953e2 != null) {
            c28953e2.mo1956Z(this.f2704t, this.f2705u);
        }
    }

    @Override // ag.InterfaceC0797q
    /* renamed from: k */
    public void mo2012k(SurfaceTexture surfaceTexture, boolean z11, float[] fArr) {
        GLES20.glViewport(0, 0, this.f2704t, this.f2705u);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        this.f2757P.m144601n0(fArr);
        onDrawFrame(null);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        C28953e c28953e = this.f2759R;
        if (c28953e != null) {
            c28953e.m1946J();
        }
        int i11 = this.f2764W;
        if (i11 > 0 && this.f2761T != null) {
            int i12 = i11 - 1;
            this.f2764W = i12;
            if (i12 == 0) {
                C30923c c30923c = this.f2760S;
                IntBuffer allocate = IntBuffer.allocate(c30923c.f142619a * c30923c.f142620b);
                allocate.rewind();
                C30923c c30923c2 = this.f2760S;
                GLES20.glReadPixels(0, 0, c30923c2.f142619a, c30923c2.f142620b, 6408, 5121, allocate);
                C30923c c30923c3 = this.f2760S;
                final Bitmap createBitmap = Bitmap.createBitmap(c30923c3.f142619a, c30923c3.f142620b, Bitmap.Config.ARGB_8888);
                int[] iArr = new int[this.f2760S.f142619a];
                int[] array = allocate.array();
                int i13 = 0;
                while (true) {
                    C30923c c30923c4 = this.f2760S;
                    if (i13 < c30923c4.f142620b / 2) {
                        int i14 = c30923c4.f142619a;
                        System.arraycopy(array, i13 * i14, iArr, 0, i14);
                        C30923c c30923c5 = this.f2760S;
                        int i15 = (c30923c5.f142620b - i13) - 1;
                        int i16 = c30923c5.f142619a;
                        System.arraycopy(array, i15 * i16, array, i13 * i16, i16);
                        C30923c c30923c6 = this.f2760S;
                        int i17 = (c30923c6.f142620b - i13) - 1;
                        int i18 = c30923c6.f142619a;
                        System.arraycopy(iArr, 0, array, i17 * i18, i18);
                        i13++;
                    } else {
                        createBitmap.copyPixelsFromBuffer(allocate);
                        allocate.rewind();
                        AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: ag.s
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0800t.this.m2018z0(createBitmap);
                            }
                        });
                        return;
                    }
                }
            }
        }
    }

    @Override // ag.InterfaceC0797q
    /* renamed from: l */
    public int mo2013l() {
        return this.f2757P.m144597l0();
    }

    @Override // ag.InterfaceC0797q
    /* renamed from: p */
    public void mo2014p(String str) {
        AbstractC26236a.m134894a(str);
    }

    @Override // ag.InterfaceC0797q
    /* renamed from: s */
    public void mo2015s() {
        C30923c c30923c = this.f2760S;
        GLES20.glViewport(0, 0, c30923c.f142619a, c30923c.f142620b);
        m1995x();
        C30923c c30923c2 = this.f2760S;
        mo1956Z(c30923c2.f142619a, c30923c2.f142620b);
    }
}
