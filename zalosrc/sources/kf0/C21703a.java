package kf0;

import li.AbstractC22490a;

/* renamed from: kf0.a */
/* loaded from: classes5.dex */
public final class C21703a {

    /* renamed from: a */
    public static final C21703a f105414a = new C21703a();

    private C21703a() {
    }

    /* renamed from: b */
    public static /* synthetic */ void m112010b(C21703a c21703a, Exception exc, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            exc = null;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        c21703a.m112011a(exc, str);
    }

    /* renamed from: a */
    public final void m112011a(Exception exc, String str) {
        String str2 = "Trace source open Mini App";
        if (exc != null) {
            Exception exc2 = new Exception("Trace source open Mini App", exc);
            if (str != null) {
                exc2 = new Exception("Trace source open Mini App (" + str + ")", exc);
            }
            AbstractC22490a.m116282e(exc2);
            return;
        }
        if (str != null) {
            str2 = "Trace source open Mini App (" + str + ")";
        }
        AbstractC22490a.m116282e(new Exception(str2));
    }
}
