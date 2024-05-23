package zm.voip.widgets.moduleviews;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import hd0.C20003a;
import ko0.C21790e;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import s30.AbstractC26125a;

/* loaded from: classes7.dex */
public class LabelCallRow extends ModulesView {

    /* renamed from: K */
    public C16719g f150190K;

    /* renamed from: L */
    public C22126c0 f150191L;

    /* renamed from: M */
    public C16719g f150192M;

    public LabelCallRow(Context context) {
        super(context);
        C16719g c16719g = new C16719g(context);
        this.f150190K = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColorCall));
        this.f150190K.m89106L().m89028L(-1, AbstractC23136l9.m118742r(4.0f));
        C16719g c16719g2 = new C16719g(context);
        this.f150192M = c16719g2;
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColorCall));
        this.f150192M.m89106L().m89028L(-1, AbstractC23136l9.m118742r(0.5f)).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f));
        C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), AbstractC23136l9.m118641B(context, AbstractC26125a.ND500_old), false);
        this.f150191L = c22126c0;
        c22126c0.m89106L().m89028L(-1, -2).m89024H(new C20003a(true, this.f150190K, this.f150192M)).m89042Z(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
        mo69681L(this.f150190K);
        mo69681L(this.f150192M);
        mo69681L(this.f150191L);
    }

    /* renamed from: V */
    public void m157448V(C21790e c21790e) {
        if (c21790e == null) {
            return;
        }
        try {
            int i11 = c21790e.f105765b;
            int i12 = 0;
            if (i11 != 1) {
                if (i11 == 4) {
                    this.f150191L.m111959G1(c21790e.f105767d);
                    this.f150190K.mo44614b1(8);
                    C16719g c16719g = this.f150192M;
                    if (!c21790e.f105766c) {
                        i12 = 8;
                    }
                    c16719g.mo44614b1(i12);
                }
            } else {
                this.f150191L.m111959G1(c21790e.f105767d);
                C16719g c16719g2 = this.f150190K;
                if (!c21790e.f105766c) {
                    i12 = 8;
                }
                c16719g2.mo44614b1(i12);
                this.f150192M.mo44614b1(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
