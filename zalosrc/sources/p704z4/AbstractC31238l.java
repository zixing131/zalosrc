package p704z4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4166b;
import p342m6.AbstractC22888j;
import p342m6.C22890k;

/* renamed from: z4.l */
/* loaded from: classes2.dex */
public abstract class AbstractC31238l {
    /* renamed from: a */
    public static void m152112a(Status status, Object obj, C22890k c22890k) {
        if (status.m19223M()) {
            c22890k.m117596c(obj);
        } else {
            c22890k.m117595b(AbstractC4166b.m19628a(status));
        }
    }

    /* renamed from: b */
    public static void m152113b(Status status, C22890k c22890k) {
        m152112a(status, null, c22890k);
    }

    /* renamed from: c */
    public static AbstractC22888j m152114c(AbstractC22888j abstractC22888j) {
        return abstractC22888j.mo117580i(new C31233i0());
    }

    /* renamed from: d */
    public static boolean m152115d(Status status, Object obj, C22890k c22890k) {
        if (status.m19223M()) {
            return c22890k.m117598e(obj);
        }
        return c22890k.m117597d(AbstractC4166b.m19628a(status));
    }
}
