package x30;

/* renamed from: x30.a */
/* loaded from: classes5.dex */
public class C29306a {

    /* renamed from: a */
    public final String f135760a;

    /* renamed from: b */
    public final String f135761b;

    /* renamed from: c */
    public final String f135762c;

    /* renamed from: d */
    public final int f135763d;

    protected C29306a(String str, String str2, String str3, int i11) {
        this.f135760a = str;
        this.f135761b = str2;
        this.f135762c = str3;
        this.f135763d = i11;
    }

    /* renamed from: a */
    public static C29306a m146415a(String str) {
        return new C29306a("onAdsClosed", str, null, -1);
    }

    /* renamed from: b */
    public static C29306a m146416b(String str, int i11) {
        return new C29306a("onAdsLoadFailed", str, null, i11);
    }

    /* renamed from: c */
    public static C29306a m146417c(String str) {
        return new C29306a("onAdsLoadFinished", str, null, -1);
    }

    /* renamed from: d */
    public static C29306a m146418d(String str) {
        return new C29306a("onAdsOpened", str, null, -1);
    }

    /* renamed from: e */
    public static C29306a m146419e(String str, String str2) {
        return new C29306a("onAdsRewarded", str, str2, -1);
    }
}
