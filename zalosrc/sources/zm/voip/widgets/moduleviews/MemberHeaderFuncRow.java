package zm.voip.widgets.moduleviews;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import ko0.C21789d;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes7.dex */
public class MemberHeaderFuncRow extends ModulesView {

    /* renamed from: K */
    public C16719g f150195K;

    /* renamed from: L */
    public C22126c0 f150196L;

    public MemberHeaderFuncRow(Context context) {
        super(context);
        C16719g c16719g = new C16719g(context);
        this.f150195K = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f150195K.m89106L().m89028L(-1, AbstractC23136l9.m118742r(4.0f));
        C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118742r(14.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor1), true);
        this.f150196L = c22126c0;
        c22126c0.m89106L().m89028L(-1, -2).m89023G(this.f150195K).m89042Z(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(8.0f));
        mo69681L(this.f150195K);
        mo69681L(this.f150196L);
    }

    /* renamed from: V */
    public void m157450V(C21789d c21789d) {
        int i11;
        if (c21789d == null) {
            return;
        }
        try {
            this.f150196L.m111959G1(c21789d.f105761f);
            C16719g c16719g = this.f150195K;
            if (c21789d.f105760e) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c16719g.mo44614b1(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
