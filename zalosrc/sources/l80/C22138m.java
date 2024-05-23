package l80;

import android.content.Context;
import com.androidquery.util.C3977j;
import com.zing.zalo.uidrawing.C16716d;
import kd0.C21693c;
import me0.AbstractC23268y2;
import me0.C23278z2;
import p354n3.C23528a;

/* renamed from: l80.m */
/* loaded from: classes6.dex */
public class C22138m extends C16716d {

    /* renamed from: M0 */
    C21693c f109033M0;

    /* renamed from: N0 */
    C23528a f109034N0;

    /* renamed from: O0 */
    C3977j f109035O0;

    public C22138m(Context context, int i11, float f11) {
        super(context);
        this.f109034N0 = new C23528a(context);
        this.f109035O0 = new C3977j(context);
        m89106L().m89028L(-1, i11);
        C21693c c21693c = new C21693c(context);
        this.f109033M0 = c21693c;
        c21693c.m111929z1(5);
        this.f109033M0.m89106L().m89028L(-1, (int) (f11 * i11));
        m89001g1(this.f109033M0);
    }

    /* renamed from: o1 */
    public void m115471o1(String str) {
        AbstractC23268y2.m120033g(this.f109034N0, this.f109035O0, this.f109033M0, str, C23278z2.m120144n0(), false);
    }

    /* renamed from: p1 */
    public void m115472p1(int i11, int i12) {
        float m89112O = (i11 + m89112O()) / (i12 + m89112O());
        this.f109033M0.m89132a1((int) ((-m89112O) * (r4.m89112O() - m89112O())));
        invalidate();
    }
}
