package ki0;

import android.content.Context;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import java.util.List;

/* renamed from: ki0.e */
/* loaded from: classes7.dex */
public class C21737e extends C16716d {
    public C21737e(Context context) {
        super(context);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: D0 */
    public void mo89091D0(boolean z11) {
        super.mo89091D0(z11);
        if (this.f84695D0 != null && m89143j0()) {
            for (C16719g c16719g : this.f84695D0) {
                if (c16719g != null) {
                    c16719g.mo89091D0(z11);
                }
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: E0 */
    public void mo89093E0(boolean z11) {
        super.mo89093E0(z11);
        if (this.f84695D0 != null && m89143j0()) {
            for (C16719g c16719g : this.f84695D0) {
                if (c16719g != null) {
                    c16719g.mo89093E0(z11);
                }
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: H0 */
    public void mo89099H0(boolean z11) {
        super.mo89099H0(z11);
        List<C16719g> list = this.f84695D0;
        if (list != null) {
            for (C16719g c16719g : list) {
                if (c16719g != null) {
                    c16719g.mo89099H0(z11);
                }
            }
        }
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: Q0 */
    public void mo89000Q0(boolean z11) {
        if (!m89143j0()) {
            super.mo89000Q0(false);
        } else {
            super.mo89000Q0(z11);
        }
    }
}
