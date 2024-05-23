package x30;

import ho0.AbstractC20110a;
import org.json.JSONException;
import org.json.JSONObject;
import vg.AbstractC28207v1;

/* renamed from: x30.h */
/* loaded from: classes5.dex */
public class C29313h implements InterfaceC29310e {

    /* renamed from: g */
    private static final String f135790g = "h";

    /* renamed from: a */
    private final a f135791a;

    /* renamed from: b */
    private final int f135792b;

    /* renamed from: c */
    public String f135793c;

    /* renamed from: e */
    private long f135795e;

    /* renamed from: f */
    private final Object f135796f = new Object();

    /* renamed from: d */
    private long f135794d = 10000;

    /* renamed from: x30.h$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo146454a(String str);

        /* renamed from: b */
        boolean mo146455b();
    }

    public C29313h(String str, a aVar, int i11) {
        this.f135791a = aVar;
        this.f135792b = i11;
        this.f135793c = str;
    }

    @Override // x30.InterfaceC29310e
    /* renamed from: a */
    public void mo146431a(long j11) {
        synchronized (this.f135796f) {
            try {
                if (j11 < 0) {
                    this.f135794d = 10000L;
                } else {
                    this.f135794d = j11;
                }
                this.f135795e = System.currentTimeMillis();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // x30.InterfaceC29310e
    /* renamed from: b */
    public boolean mo146432b(C29306a c29306a) {
        char c11;
        if (c29306a == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", c29306a.f135760a);
            jSONObject.put("zoneId", c29306a.f135761b);
            String str = c29306a.f135760a;
            switch (str.hashCode()) {
                case -2076769921:
                    if (str.equals("onAdsRewarded")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -913596940:
                    if (str.equals("onAdsLoadFailed")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -67813603:
                    if (str.equals("onAdsClosed")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 279127578:
                    if (str.equals("onAdsOpened")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1152530537:
                    if (str.equals("onAdsLoadFinished")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            if (c11 != 0 && c11 != 1 && c11 != 2) {
                if (c11 != 3) {
                    if (c11 != 4) {
                        AbstractC20110a.m104543l(f135790g).mo104551d("UnSupport Ads event: %s", c29306a.f135760a);
                        return true;
                    }
                    jSONObject.put("errorCode", c29306a.f135763d);
                    String str2 = "javascript:" + this.f135793c + "('" + AbstractC28207v1.m141903O0(c29306a.f135763d, "onAdsLoadFailed", jSONObject.toString(), m146451e()) + "')";
                    a m146452f = m146452f();
                    if (m146452f == null) {
                        return false;
                    }
                    m146452f.mo146454a(str2);
                    return true;
                }
                jSONObject.put("tokenId", c29306a.f135762c);
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
        String str3 = "javascript:" + this.f135793c + "('" + AbstractC28207v1.m141919S0(m146451e(), jSONObject.toString()) + "')";
        a m146452f2 = m146452f();
        if (m146452f2 == null) {
            return false;
        }
        m146452f2.mo146454a(str3);
        return true;
    }

    @Override // x30.InterfaceC29310e
    /* renamed from: c */
    public void mo146433c() {
        synchronized (this.f135796f) {
            this.f135794d = 10000L;
            this.f135795e = 0L;
        }
    }

    @Override // x30.InterfaceC29310e
    /* renamed from: d */
    public boolean mo146434d() {
        a m146452f = m146452f();
        if (m146452f != null && !m146453g()) {
            return m146452f.mo146455b();
        }
        return false;
    }

    /* renamed from: e */
    String m146451e() {
        return this.f135792b == 1 ? "action.open.adtima.ads" : "action.open.adtima.ads.interstitial";
    }

    /* renamed from: f */
    public a m146452f() {
        a aVar;
        synchronized (this.f135796f) {
            aVar = this.f135791a;
        }
        return aVar;
    }

    /* renamed from: g */
    public boolean m146453g() {
        synchronized (this.f135796f) {
            try {
                if (System.currentTimeMillis() - this.f135795e < this.f135794d) {
                    return false;
                }
                AbstractC20110a.m104543l(f135790g).mo104548a(" Ad is timeout", new Object[0]);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x30.InterfaceC29310e
    public int getType() {
        return this.f135792b;
    }
}
