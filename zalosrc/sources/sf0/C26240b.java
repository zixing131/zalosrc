package sf0;

import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import p278jv.C21369c;
import p454qn.AbstractC25384a;
import p729zu.InterfaceC32557a;
import uf0.EnumC27244a;

/* renamed from: sf0.b */
/* loaded from: classes5.dex */
public final class C26240b implements InterfaceC26239a {

    /* renamed from: a */
    private final InterfaceC32557a f124634a;

    /* renamed from: b */
    private boolean f124635b;

    /* renamed from: c */
    private final C1761c0 f124636c;

    /* renamed from: d */
    private final LiveData f124637d;

    /* renamed from: e */
    private final C1761c0 f124638e;

    /* renamed from: f */
    private final LiveData f124639f;

    /* renamed from: g */
    private final C1761c0 f124640g;

    /* renamed from: h */
    private final LiveData f124641h;

    public C26240b(InterfaceC32557a interfaceC32557a) {
        AbstractC19074t.m100208f(interfaceC32557a, "webViewBts");
        this.f124634a = interfaceC32557a;
        C1761c0 c1761c0 = new C1761c0();
        this.f124636c = c1761c0;
        this.f124637d = c1761c0;
        C1761c0 c1761c02 = new C1761c0(EnumC27244a.f128027r);
        this.f124638e = c1761c02;
        this.f124639f = c1761c02;
        C1761c0 c1761c03 = new C1761c0();
        this.f124640g = c1761c03;
        this.f124641h = c1761c03;
    }

    @Override // sf0.InterfaceC26239a
    /* renamed from: a */
    public LiveData mo134925a() {
        return this.f124639f;
    }

    @Override // sf0.InterfaceC26239a
    /* renamed from: b */
    public LiveData mo134926b() {
        return this.f124641h;
    }

    /* renamed from: c */
    public void m134927c(String str) {
        AbstractC19074t.m100208f(str, "newTitle");
        this.f124636c.mo9224q(str);
    }

    /* renamed from: d */
    public final void m134928d() {
        if (!this.f124635b && this.f124634a.canGoBack()) {
            this.f124634a.mo89719ra();
        } else {
            this.f124634a.mo89718cG();
        }
    }

    /* renamed from: e */
    public void m134929e(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "configs");
        JSONObject m131571b = AbstractC25384a.m131571b(str);
        if (m131571b != null) {
            str2 = m131571b.optString("left_button");
        } else {
            str2 = null;
        }
        if (AbstractC19074t.m100204b(str2, EnumC27244a.f128027r.m139384c())) {
            this.f124635b = true;
        }
    }

    /* renamed from: f */
    public void m134930f(C21369c c21369c) {
        AbstractC19074t.m100208f(c21369c, "loadingViewState");
        this.f124640g.mo9224q(c21369c);
        if (!this.f124635b && c21369c.m110762d() == 100) {
            if (!this.f124634a.canGoBack()) {
                this.f124638e.mo9224q(EnumC27244a.f128027r);
            } else {
                this.f124638e.mo9224q(EnumC27244a.f128026q);
            }
        }
    }

    @Override // sf0.InterfaceC26239a
    public LiveData getTitle() {
        return this.f124637d;
    }
}
