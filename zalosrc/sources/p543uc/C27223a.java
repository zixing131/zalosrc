package p543uc;

import fn0.AbstractC19074t;

/* renamed from: uc.a */
/* loaded from: classes3.dex */
public final class C27223a {

    /* renamed from: a */
    public static final C27223a f127987a = new C27223a();

    private C27223a() {
    }

    /* renamed from: a */
    public final int m139319a(String str) {
        if (str != null && str.length() != 0) {
            if (AbstractC19074t.m100204b("dailyLimitExceeded", str)) {
                return 40301;
            }
            if (AbstractC19074t.m100204b("userRateLimitExceeded", str)) {
                return 40302;
            }
            if (AbstractC19074t.m100204b("rateLimitExceeded", str)) {
                return 40303;
            }
            if (AbstractC19074t.m100204b("sharingRateLimitExceeded", str)) {
                return 40304;
            }
            if (AbstractC19074t.m100204b("appNotAuthorizedToFile", str)) {
                return 40306;
            }
            if (AbstractC19074t.m100204b("insufficientFilePermissions", str)) {
                return 40307;
            }
            if (AbstractC19074t.m100204b("domainPolicy", str)) {
                return 40308;
            }
            if (AbstractC19074t.m100204b("storageQuotaExceeded", str)) {
                return 40305;
            }
        }
        return 40300;
    }
}
