package p398oo;

import com.zing.zalo.feed.mvp.feed.data.ExceptionFeedAPI;
import p425po.C24880b;

/* renamed from: oo.a */
/* loaded from: classes4.dex */
public final class C24346a {

    /* renamed from: a */
    public static final C24346a f117452a = new C24346a();

    private C24346a() {
    }

    /* renamed from: a */
    public final boolean m127218a(Exception exc) {
        if ((exc instanceof ExceptionFeedAPI) && ((ExceptionFeedAPI) exc).m45582b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m127219b(Exception exc) {
        if (exc instanceof ExceptionFeedAPI) {
            ExceptionFeedAPI exceptionFeedAPI = (ExceptionFeedAPI) exc;
            if (exceptionFeedAPI.m45582b() != null && exceptionFeedAPI.mo45581a().m104491c() == 18028) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m127220c(C24880b c24880b) {
        if (c24880b != null && c24880b.m129379a() == 18028) {
            return true;
        }
        return false;
    }
}
