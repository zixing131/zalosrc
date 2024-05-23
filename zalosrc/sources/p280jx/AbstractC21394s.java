package p280jx;

import android.content.Context;
import com.zing.zalocore.CoreUtility;
import mx.AbstractC23466c;
import p171fx.AbstractC19166g;
import p190gx.AbstractC19676f;

/* renamed from: jx.s */
/* loaded from: classes4.dex */
public abstract class AbstractC21394s extends AbstractC19676f {
    /* renamed from: q */
    public static void m110853q(final Context context) {
        AbstractC19676f.m103251n(new Runnable() { // from class: jx.r
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC21394s.m110855s(context);
            }
        });
    }

    /* renamed from: r */
    private static void m110854r(long j11) {
        long j12 = j11 / 1048576;
        if (j12 > 50) {
            m110856t(System.currentTimeMillis() + "\t13\t" + CoreUtility.f89233i + "\t" + j12 + "\n");
        }
        AbstractC19166g.m100550D(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m110855s(Context context) {
        C21377b c21377b = new C21377b(context);
        if (!c21377b.m110830c()) {
            return;
        }
        C21376a m110828a = c21377b.m110828a();
        long currentTimeMillis = System.currentTimeMillis();
        long m100563m = AbstractC19166g.m100563m();
        if (m100563m == 0) {
            c21377b.f104259b.mo110836f(c21377b, m110828a);
            AbstractC19166g.m100549C(currentTimeMillis);
        } else if (currentTimeMillis - m100563m < 84600000) {
            c21377b.f104259b.mo110836f(c21377b, m110828a);
        } else {
            m110854r(c21377b.f104259b.mo110834d(c21377b, m110828a, m100563m, currentTimeMillis));
        }
    }

    /* renamed from: t */
    private static void m110856t(String str) {
        AbstractC23466c.m123219v(str, AbstractC23466c.m123207j("battery/bg_network/", false, true, false));
    }
}
