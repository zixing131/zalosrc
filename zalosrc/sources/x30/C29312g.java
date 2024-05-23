package x30;

import com.adtima.ads.ZAdsInterstitial;
import com.adtima.ads.ZAdsListener;
import com.zing.zalo.MainApplication;
import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicBoolean;
import x30.C29308c;

/* renamed from: x30.g */
/* loaded from: classes5.dex */
public class C29312g {

    /* renamed from: e */
    private static final String f135780e = "g";

    /* renamed from: a */
    private final ZAdsInterstitial f135781a;

    /* renamed from: b */
    private final AtomicBoolean f135782b = new AtomicBoolean(false);

    /* renamed from: c */
    private final InterfaceC29310e f135783c;

    /* renamed from: d */
    private final C29308c.b f135784d;

    /* renamed from: x30.g$a */
    /* loaded from: classes5.dex */
    class a extends ZAdsListener {

        /* renamed from: a */
        final /* synthetic */ String f135785a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC29310e f135786b;

        /* renamed from: c */
        final /* synthetic */ C29308c.b f135787c;

        /* renamed from: d */
        final /* synthetic */ int f135788d;

        a(String str, InterfaceC29310e interfaceC29310e, C29308c.b bVar, int i11) {
            this.f135785a = str;
            this.f135786b = interfaceC29310e;
            this.f135787c = bVar;
            this.f135788d = i11;
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsClosed() {
            C29312g.this.m146447f(this.f135788d, this.f135785a, this.f135786b, false);
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsLoadFailed(int i11) {
            C29308c.b bVar;
            AbstractC20110a.m104543l(C29312g.f135780e).mo104548a("onAdsLoadFailed: code = " + i11 + "; zoneId = " + this.f135785a, new Object[0]);
            C29308c.m146424f(124005, String.format("{\"code\": %s, \"zoneId\": %s}", Integer.valueOf(i11), this.f135785a));
            C29306a m146416b = C29306a.m146416b(this.f135785a, i11);
            if (!this.f135786b.mo146432b(m146416b) && (bVar = this.f135787c) != null) {
                bVar.mo146420a(this.f135788d, m146416b);
            }
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsLoadFinished() {
            C29308c.b bVar;
            AbstractC20110a.m104543l(C29312g.f135780e).mo104548a("onAdsLoadFinished", new Object[0]);
            C29308c.m146425g(124002);
            C29306a m146417c = C29306a.m146417c(this.f135785a);
            if (!this.f135786b.mo146432b(m146417c) && (bVar = this.f135787c) != null) {
                bVar.mo146420a(this.f135788d, m146417c);
            }
            if (C29312g.this.f135782b.get()) {
                if (C29312g.this.f135781a.isAdsLoaded() && this.f135786b.mo146434d()) {
                    C29312g.this.m146450h(-1L);
                    C29308c.m146425g(124006);
                } else {
                    C29308c.m146424f(124006, "Not allow to show");
                }
            }
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsOpened() {
            C29308c.b bVar;
            AbstractC20110a.m104543l(C29312g.f135780e).mo104548a("onAdsOpened", new Object[0]);
            C29306a m146418d = C29306a.m146418d(this.f135785a);
            if (!this.f135786b.mo146432b(m146418d) && (bVar = this.f135787c) != null) {
                bVar.mo146420a(this.f135788d, m146418d);
            }
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsRewarded(Object obj, String str) {
            C29308c.b bVar;
            super.onAdsRewarded(obj, str);
            AbstractC20110a.m104543l(C29312g.f135780e).mo104548a("onAdsRewarded: %s", str);
            C29306a m146419e = C29306a.m146419e(this.f135785a, str);
            if (!this.f135786b.mo146432b(m146419e) && (bVar = this.f135787c) != null) {
                bVar.mo146420a(this.f135788d, m146419e);
            }
            C29308c.m146425g(124003);
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsClosed(boolean z11) {
            C29312g.this.m146447f(this.f135788d, this.f135785a, this.f135786b, z11);
        }
    }

    public C29312g(String str, int i11, InterfaceC29310e interfaceC29310e, C29308c.b bVar, String str2) {
        ZAdsInterstitial zAdsInterstitial = new ZAdsInterstitial(MainApplication.getAppContext(), str);
        this.f135781a = zAdsInterstitial;
        if (str2 != null) {
            zAdsInterstitial.setAdsContentId(str2);
        }
        zAdsInterstitial.setAdsOrientationPrefer(i11);
        this.f135783c = interfaceC29310e;
        this.f135784d = bVar;
        zAdsInterstitial.setAdsListener(new a(str, interfaceC29310e, bVar, interfaceC29310e.getType()));
        zAdsInterstitial.loadAds();
        AbstractC20110a.m104543l(f135780e).mo104548a("request ad: %s", str);
        C29308c.m146425g(124007);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m146447f(int i11, String str, InterfaceC29310e interfaceC29310e, boolean z11) {
        C29308c.b bVar;
        AbstractC20110a.m104543l(f135780e).mo104548a("onAdsClosed. User action: %s", Boolean.valueOf(z11));
        C29308c.m146425g(124004);
        C29306a m146415a = C29306a.m146415a(str);
        if (!interfaceC29310e.mo146432b(m146415a) && (bVar = this.f135784d) != null) {
            bVar.mo146420a(i11, m146415a);
        }
    }

    /* renamed from: e */
    public String m146448e() {
        return this.f135781a.getAdsZoneId();
    }

    /* renamed from: g */
    public void m146449g() {
        C29308c.b bVar;
        AbstractC20110a.m104543l(f135780e).mo104548a("preloadAdsEnv: %s", this.f135781a.getAdsZoneId());
        this.f135782b.set(false);
        if (!this.f135781a.isAdsLoaded()) {
            this.f135781a.loadAds();
            C29308c.m146425g(124007);
            return;
        }
        C29306a m146417c = C29306a.m146417c(m146448e());
        if (!this.f135783c.mo146432b(m146417c) && (bVar = this.f135784d) != null) {
            bVar.mo146420a(this.f135783c.getType(), m146417c);
        }
    }

    /* renamed from: h */
    public void m146450h(long j11) {
        if (this.f135781a.isAdsLoaded()) {
            this.f135782b.set(false);
            this.f135783c.mo146433c();
            this.f135781a.show();
            C29308c.m146425g(124006);
            AbstractC20110a.m104543l(f135780e).mo104548a("show Ad: %s", this.f135781a.getAdsZoneId());
            return;
        }
        this.f135783c.mo146431a(j11);
        this.f135782b.set(true);
        this.f135781a.loadAds();
        AbstractC20110a.m104543l(f135780e).mo104548a("request Ad: %s", this.f135781a.getAdsZoneId());
    }
}
