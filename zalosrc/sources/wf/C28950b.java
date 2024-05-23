package wf;

import ag.AbstractC0784d;
import android.content.Context;
import android.graphics.Rect;
import android.opengl.Matrix;
import com.zing.zalocore.CoreUtility;
import se0.AbstractC26236a;
import se0.AbstractC26237b;
import zh0.AbstractC32212c;

/* renamed from: wf.b */
/* loaded from: classes3.dex */
public class C28950b extends AbstractC28949a {

    /* renamed from: U */
    protected boolean f134013U = false;

    /* renamed from: V */
    private final Context f134014V;

    public C28950b(Context context) {
        this.f134014V = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wf.AbstractC28949a, wf.AbstractC28955g, ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        try {
            this.f134007O.m2007i(this.f134014V);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        AbstractC26236a.m134894a("OESTexture - onInit");
    }

    @Override // wf.AbstractC28955g
    /* renamed from: k0 */
    public void mo144598k0() {
        if (!m144614g0()) {
            return;
        }
        if (m144615h0()) {
            this.f134012T = AbstractC0784d.f2701D;
        } else {
            this.f134012T = AbstractC0784d.f2700C;
        }
        int m155331a = AbstractC32212c.m155331a(CoreUtility.getAppContext());
        int abs = ((Math.abs(m144612e0()) + m155331a) + 180) % 360;
        String.format("updateDrawInfo %d - %d", Integer.valueOf(m155331a), Integer.valueOf(abs));
        int m144610c0 = m144610c0();
        int i11 = this.f2704t;
        int i12 = this.f2705u;
        float[] m134916a = AbstractC26237b.m134916a(m144610c0, new Rect((-i11) / 2, i12 / 2, i11 / 2, (-i12) / 2), null, m144613f0(), m144611d0(), abs, 1.0f, 1.0f);
        if (m134916a != null) {
            float[] fArr = new float[16];
            int i13 = this.f2704t;
            Matrix.orthoM(fArr, 0, -i13, i13, -r1, this.f2705u, -1.0f, 1.0f);
            Matrix.multiplyMM(this.f134008P, 0, fArr, 0, m134916a, 0);
        }
        this.f134009Q = true;
    }

    /* renamed from: m0 */
    public void m144599m0(int i11, boolean z11) {
        int[] iArr;
        if (!this.f134013U && (iArr = this.f134006N) != null) {
            AbstractC26236a.m134899f(iArr, 0);
            this.f134006N = null;
        }
        if (i11 > 0) {
            this.f134006N = r0;
            int[] iArr2 = {i11};
            this.f134013U = z11;
        }
    }
}
