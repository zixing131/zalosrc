package p084cs;

import com.zing.zalo.p077ui.widget.C13704p1;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cs.a */
/* loaded from: classes4.dex */
public final class C17567a {

    /* renamed from: a */
    private final List f89497a = new ArrayList();

    /* renamed from: b */
    private final boolean m93549b(C17568b c17568b, String str) {
        return this.f89497a.add(new C17571e(c17568b, str));
    }

    /* renamed from: a */
    public final void m93550a(C13704p1 c13704p1, C17570d c17570d, float f11, float f12, boolean z11, int i11) {
        AbstractC19074t.m100208f(c13704p1, "textPaint");
        AbstractC19074t.m100208f(c17570d, "provider");
        C17568b c17568b = new C17568b(f11, f12);
        String m93557f = c17568b.m93557f(c17570d, z11, i11);
        C17568b c17568b2 = new C17568b(c13704p1.measureText(m93557f), f12);
        m93549b(c17568b, m93557f);
        m93549b(c17568b2, c17570d.m93562c(i11));
    }

    /* renamed from: c */
    public final String m93551c(int i11, int i12, String str) {
        AbstractC19074t.m100208f(str, "statusText");
        int size = this.f89497a.size();
        for (int i13 = 0; i13 < size && ((C17571e) this.f89497a.get(i13)).m93569b().m93556e(i11, i12); i13++) {
            str = ((C17571e) this.f89497a.get(i13)).m93568a();
        }
        return str;
    }
}
