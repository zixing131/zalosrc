package p109ds;

import android.content.Context;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kd0.C21693c;
import me0.AbstractC23222t7;
import p691yr.C31060j;

/* renamed from: ds.b */
/* loaded from: classes4.dex */
public final class C18063b extends C16716d {

    /* renamed from: M0 */
    private final int f91446M0;

    /* renamed from: N0 */
    private List f91447N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18063b(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        int m150947v = C31060j.f143193a.m150947v();
        this.f91446M0 = m150947v;
        this.f91447N0 = new ArrayList();
        for (int i11 = 0; i11 < m150947v; i11++) {
            C21693c c21693c = new C21693c(context);
            c21693c.m111929z1(6);
            C16718f m89106L = c21693c.m89106L();
            int i12 = AbstractC23222t7.f112586t;
            m89106L.m89028L(i12, i12).m89027K(true);
            if (i11 >= 1) {
                c21693c.m89106L().m89054h0((C16719g) this.f91447N0.get(i11 - 1)).m89034R(AbstractC23222t7.f112552c);
            }
            m89001g1(c21693c);
            this.f91447N0.add(c21693c);
        }
    }

    /* renamed from: o1 */
    public final void m96028o1(List list) {
        AbstractC19074t.m100208f(list, "topReactionIds");
        int size = this.f91447N0.size();
        for (int i11 = 0; i11 < size; i11++) {
            C21693c c21693c = (C21693c) this.f91447N0.get(i11);
            if (list.size() > i11) {
                c21693c.mo44614b1(0);
                C31060j c31060j = C31060j.f143193a;
                int intValue = ((Number) list.get(i11)).intValue();
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                c21693c.mo111925v1(C31060j.m150906E(c31060j, intValue, context, null, 4, null));
            } else {
                c21693c.mo44614b1(8);
                c21693c.mo111925v1(null);
            }
        }
    }
}
