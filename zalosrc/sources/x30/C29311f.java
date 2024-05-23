package x30;

import com.adtima.ads.ZAdsIncentivized;
import com.adtima.ads.ZAdsListener;
import com.zing.zalo.MainApplication;
import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicBoolean;
import x30.C29308c;

/* renamed from: x30.f */
/* loaded from: classes5.dex */
public class C29311f {

    /* renamed from: f */
    private static final String f135769f = "f";

    /* renamed from: a */
    private final ZAdsIncentivized f135770a;

    /* renamed from: c */
    private final InterfaceC29310e f135772c;

    /* renamed from: e */
    private final C29308c.b f135774e;

    /* renamed from: b */
    private final AtomicBoolean f135771b = new AtomicBoolean(false);

    /* renamed from: d */
    public AtomicBoolean f135773d = new AtomicBoolean(false);

    /* renamed from: x30.f$a */
    /* loaded from: classes5.dex */
    class a extends ZAdsListener {

        /* renamed from: a */
        final /* synthetic */ String f135775a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC29310e f135776b;

        /* renamed from: c */
        final /* synthetic */ C29308c.b f135777c;

        /* renamed from: d */
        final /* synthetic */ int f135778d;

        a(String str, InterfaceC29310e interfaceC29310e, C29308c.b bVar, int i11) {
            this.f135775a = str;
            this.f135776b = interfaceC29310e;
            this.f135777c = bVar;
            this.f135778d = i11;
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsClosed() {
            C29311f.this.m146439f(this.f135778d, this.f135775a, this.f135776b, false);
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsLoadFailed(int i11) {
            C29308c.b bVar;
            AbstractC20110a.m104543l(C29311f.f135769f).mo104548a("onAdsLoadFailed: code = " + i11 + "; zoneId = " + this.f135775a, new Object[0]);
            C29308c.m146424f(124005, String.format("{\"code\": %s, \"zoneId\": %s}", Integer.valueOf(i11), this.f135775a));
            C29306a m146416b = C29306a.m146416b(this.f135775a, i11);
            if (!this.f135776b.mo146432b(m146416b) && (bVar = this.f135777c) != null) {
                bVar.mo146420a(this.f135778d, m146416b);
            }
            C29311f.this.f135773d.set(false);
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsLoadFinished() {
            C29308c.b bVar;
            AbstractC20110a.m104543l(C29311f.f135769f).mo104548a("onAdsLoadFinished", new Object[0]);
            C29308c.m146425g(124002);
            C29306a m146417c = C29306a.m146417c(this.f135775a);
            if (!this.f135776b.mo146432b(m146417c) && (bVar = this.f135777c) != null) {
                bVar.mo146420a(this.f135778d, m146417c);
            }
            if (C29311f.this.f135771b.get()) {
                if (C29311f.this.f135770a.isAdsLoaded() && this.f135776b.mo146434d()) {
                    C29311f.this.m146442h(-1L);
                    C29308c.m146425g(124006);
                } else {
                    C29308c.m146424f(124006, "Not allow to show");
                }
            }
            C29311f.this.f135773d.set(false);
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsOpened() {
            C29308c.b bVar;
            AbstractC20110a.m104543l(C29311f.f135769f).mo104548a("onAdsOpened", new Object[0]);
            C29306a m146418d = C29306a.m146418d(this.f135775a);
            if (!this.f135776b.mo146432b(m146418d) && (bVar = this.f135777c) != null) {
                bVar.mo146420a(this.f135778d, m146418d);
            }
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsRewarded(Object obj, String str) {
            C29308c.b bVar;
            super.onAdsRewarded(obj, str);
            AbstractC20110a.m104543l(C29311f.f135769f).mo104548a("onAdsRewarded: %s", str);
            C29306a m146419e = C29306a.m146419e(this.f135775a, str);
            if (!this.f135776b.mo146432b(m146419e) && (bVar = this.f135777c) != null) {
                bVar.mo146420a(this.f135778d, m146419e);
            }
            C29308c.m146425g(124003);
        }

        @Override // com.adtima.ads.ZAdsListener
        public void onAdsClosed(boolean z11) {
            C29311f.this.m146439f(this.f135778d, this.f135775a, this.f135776b, z11);
        }
    }

    public C29311f(String str, int i11, InterfaceC29310e interfaceC29310e, C29308c.b bVar, String str2) {
        ZAdsIncentivized zAdsIncentivized = new ZAdsIncentivized(MainApplication.getAppContext(), str);
        this.f135770a = zAdsIncentivized;
        if (str2 != null) {
            zAdsIncentivized.setAdsContentId(str2);
        }
        zAdsIncentivized.setAdsOrientationPrefer(i11);
        this.f135772c = interfaceC29310e;
        this.f135774e = bVar;
        zAdsIncentivized.setAdsListener(new a(str, interfaceC29310e, bVar, interfaceC29310e.getType()));
        zAdsIncentivized.loadAds();
        this.f135773d.set(true);
        AbstractC20110a.m104543l(f135769f).mo104548a("request ad: %s", str);
        C29308c.m146425g(124007);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public void m146439f(int i11, String str, InterfaceC29310e interfaceC29310e, boolean z11) {
        C29308c.b bVar;
        AbstractC20110a.m104543l(f135769f).mo104548a("onAdsClosed. User action: %s", Boolean.valueOf(z11));
        C29308c.m146425g(124004);
        C29306a m146415a = C29306a.m146415a(str);
        if (!interfaceC29310e.mo146432b(m146415a) && (bVar = this.f135774e) != null) {
            bVar.mo146420a(i11, m146415a);
        }
    }

    /* renamed from: e */
    public String m146440e() {
        return this.f135770a.getAdsZoneId();
    }

    /* renamed from: g */
    public void m146441g() {
        C29308c.b bVar;
        AbstractC20110a.m104543l(f135769f).mo104548a("preloadAdsEnv: %s", this.f135770a.getAdsZoneId());
        this.f135771b.set(false);
        if (!this.f135770a.isAdsLoaded()) {
            if (!this.f135773d.get()) {
                this.f135770a.loadAds();
                this.f135773d.set(true);
                C29308c.m146425g(124007);
                return;
            }
            return;
        }
        C29306a m146417c = C29306a.m146417c(m146440e());
        if (!this.f135772c.mo146432b(m146417c) && (bVar = this.f135774e) != null) {
            bVar.mo146420a(this.f135772c.getType(), m146417c);
        }
    }

    /* renamed from: h */
    public void m146442h(long j11) {
        if (this.f135770a.isAdsLoaded()) {
            this.f135771b.set(false);
            this.f135772c.mo146433c();
            this.f135770a.show();
            C29308c.m146425g(124006);
            AbstractC20110a.m104543l(f135769f).mo104548a("show Ad: %s", this.f135770a.getAdsZoneId());
            return;
        }
        if (!this.f135773d.get()) {
            this.f135772c.mo146431a(j11);
            this.f135771b.set(true);
            this.f135770a.loadAds();
            this.f135773d.set(true);
            AbstractC20110a.m104543l(f135769f).mo104548a("request Ad: %s", this.f135770a.getAdsZoneId());
        }
    }
}
