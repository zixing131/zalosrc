package mu;

import java.util.ArrayList;
import nu.C23938d;
import nu.C23943i;
import p428pu.AbstractC24910b;

/* renamed from: mu.d */
/* loaded from: classes4.dex */
public class C23446d extends C23444b {

    /* renamed from: l */
    private static C23446d f113895l;

    private C23446d() {
    }

    /* renamed from: q */
    private ArrayList m123127q(String str) {
        return C23444b.m123108d().m123120o(C23444b.m123108d().m123121p(C23444b.m123108d().m123117b(str, 1)));
    }

    /* renamed from: r */
    public static C23446d m123128r() {
        if (f113895l == null) {
            f113895l = new C23446d();
        }
        return f113895l;
    }

    /* renamed from: s */
    public C23938d m123129s(String str) {
        String lowerCase = str.toLowerCase();
        C23938d c23938d = new C23938d();
        ArrayList m123127q = m123127q(lowerCase);
        while (!m123127q.isEmpty()) {
            C23943i c23943i = (C23943i) m123127q.get(0);
            m123127q.remove(0);
            if (c23943i.mo125298a(c23938d) && c23938d.m125307a(lowerCase, c23943i)) {
                c23938d = c23943i.mo125300g(c23938d);
            } else {
                if (c23938d.f115879k.size() == 0) {
                    c23938d = c23943i.mo125300g(c23938d);
                }
                if (c23938d.f115877i > 0) {
                    c23938d.f115876h = lowerCase.substring(c23938d.f115874f, c23938d.f115875g);
                }
                c23938d.f115880l = AbstractC24910b.m129570a(c23938d.f115877i, "dd/MM/yyyy HH:mm");
                c23938d.f115881m = AbstractC24910b.m129570a(c23938d.f115878j, "dd/MM/yyyy HH:mm");
                return c23938d;
            }
        }
        if (c23938d.f115877i > 0) {
            c23938d.f115876h = lowerCase.substring(c23938d.f115874f, c23938d.f115875g);
        }
        c23938d.f115880l = AbstractC24910b.m129570a(c23938d.f115877i, "dd/MM/yyyy HH:mm");
        c23938d.f115881m = AbstractC24910b.m129570a(c23938d.f115878j, "dd/MM/yyyy HH:mm");
        return c23938d;
    }
}
