package l80;

import android.content.Context;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import hd0.C20003a;
import java.util.Iterator;

/* renamed from: l80.a */
/* loaded from: classes6.dex */
public class C22121a extends C16716d {
    public C22121a(Context context) {
        super(context);
    }

    @Override // com.zing.zalo.uidrawing.C16716d, com.zing.zalo.uidrawing.C16719g
    /* renamed from: q0 */
    public void mo44180q0(int i11, int i12, int i13, int i14) {
        C16719g c16719g;
        Iterator it = this.f84695D0.iterator();
        while (true) {
            c16719g = null;
            if (!it.hasNext()) {
                break;
            }
            C16719g c16719g2 = (C16719g) it.next();
            C16718f m89038V = c16719g2.m89106L().m89038V(i11);
            Boolean bool = Boolean.FALSE;
            m89038V.m89073z(bool).m89018B(bool).m89020D(null).m89023G(null).m89054h0(null);
            c16719g2.m89150n0(i11, i12, i13, i14);
        }
        int i15 = i11;
        for (C16719g c16719g3 : this.f84695D0) {
            if (c16719g3.m89136d0() != 8) {
                int m89114P = c16719g3.m89106L().f84720p + c16719g3.m89114P() + c16719g3.m89106L().f84722r;
                if (m89114P >= i15) {
                    if (c16719g == null) {
                        c16719g3.m89106L().m89018B(Boolean.TRUE);
                    } else {
                        c16719g3.m89106L().m89023G(c16719g);
                    }
                    c16719g3.m89106L().m89073z(Boolean.TRUE);
                    i15 = i11 - m89114P;
                } else {
                    if (c16719g != null) {
                        c16719g3.m89106L().m89054h0(c16719g);
                        c16719g3.m89106L().m89021E(new C20003a(c16719g));
                    } else {
                        C16718f m89106L = c16719g3.m89106L();
                        Boolean bool2 = Boolean.TRUE;
                        m89106L.m89073z(bool2);
                        c16719g3.m89106L().m89018B(bool2);
                    }
                    i15 -= m89114P;
                }
                c16719g = c16719g3;
            }
        }
        super.mo44180q0(i11, i12, i13, i14);
    }
}
