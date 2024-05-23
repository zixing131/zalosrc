package ki0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import fn0.AbstractC19074t;
import kd0.C21693c;

/* renamed from: ki0.f */
/* loaded from: classes7.dex */
public final class C21738f extends C21693c {

    /* renamed from: W0 */
    private Drawable f105571W0;

    public C21738f(Context context) {
        super(context);
    }

    @Override // kd0.C21693c
    /* renamed from: j1 */
    public void mo111914j1() {
        super.mo111914j1();
        this.f105571W0 = null;
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: s0 */
    public void mo89151s0(int i11, int[] iArr, int i12, int[] iArr2) {
        super.mo89151s0(i11, iArr, i12, iArr2);
        Drawable drawable = this.f105571W0;
        if (drawable != null) {
            AbstractC19074t.m100205c(drawable);
            drawable.setState(this.f84794x);
            Drawable drawable2 = this.f105571W0;
            AbstractC19074t.m100205c(drawable2);
            drawable2.invalidateSelf();
        }
    }

    @Override // kd0.C21693c
    /* renamed from: v1 */
    public void mo111925v1(Drawable drawable) {
        super.mo111925v1(drawable);
        this.f105571W0 = drawable;
        if (drawable != null) {
            AbstractC19074t.m100205c(drawable);
            drawable.setState(this.f84794x);
        }
    }
}
