package gl0;

import com.zing.zalo.zinstant.ZinstantNative;
import fl0.AbstractC18997h;
import fn0.AbstractC19074t;
import ik0.AbstractC20601x;
import ik0.C20594q;
import ik0.InterfaceC20585h;
import ik0.InterfaceC20587j;
import lk0.C22507e;
import lk0.C22509g;
import pj0.InterfaceC24775a;
import pj0.InterfaceC24782h;
import pj0.InterfaceC24792r;

/* renamed from: gl0.k */
/* loaded from: classes7.dex */
public final class C19489k extends AbstractC18997h {

    /* renamed from: b */
    private final InterfaceC24782h f96705b;

    /* renamed from: c */
    private final ZinstantNative f96706c;

    /* renamed from: d */
    private final C20594q f96707d;

    /* renamed from: e */
    private final C22509g f96708e;

    /* renamed from: f */
    private final C22507e f96709f;

    /* renamed from: g */
    private final InterfaceC24792r f96710g;

    /* renamed from: h */
    private final int f96711h;

    /* renamed from: i */
    private final InterfaceC20585h f96712i;

    /* renamed from: j */
    private final InterfaceC20587j f96713j;

    /* renamed from: k */
    private final InterfaceC24775a f96714k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19489k(InterfaceC24782h interfaceC24782h, ZinstantNative zinstantNative, C20594q c20594q, C22509g c22509g, C22507e c22507e, InterfaceC24792r interfaceC24792r, int i11, InterfaceC20585h interfaceC20585h, AbstractC20601x abstractC20601x, InterfaceC20587j interfaceC20587j, InterfaceC24775a interfaceC24775a) {
        super(abstractC20601x);
        AbstractC19074t.m100208f(interfaceC24782h, "resourceDownloader");
        AbstractC19074t.m100208f(zinstantNative, "zinstantNative");
        AbstractC19074t.m100208f(c20594q, "zinstantCache");
        AbstractC19074t.m100208f(c22509g, "repository");
        AbstractC19074t.m100208f(c22507e, "keyProvider");
        AbstractC19074t.m100208f(interfaceC24792r, "zinstantProvider");
        AbstractC19074t.m100208f(abstractC20601x, "zinstantRequest");
        this.f96705b = interfaceC24782h;
        this.f96706c = zinstantNative;
        this.f96707d = c20594q;
        this.f96708e = c22509g;
        this.f96709f = c22507e;
        this.f96710g = interfaceC24792r;
        this.f96711h = i11;
        this.f96712i = interfaceC20585h;
        this.f96713j = interfaceC20587j;
        this.f96714k = interfaceC24775a;
    }

    /* renamed from: b */
    public final InterfaceC20587j m101909b() {
        return this.f96713j;
    }

    /* renamed from: c */
    public final int m101910c() {
        return this.f96711h;
    }

    /* renamed from: d */
    public final C22507e m101911d() {
        return this.f96709f;
    }

    /* renamed from: e */
    public final InterfaceC20585h m101912e() {
        return this.f96712i;
    }

    /* renamed from: f */
    public final InterfaceC24775a m101913f() {
        return this.f96714k;
    }

    /* renamed from: g */
    public final C22509g m101914g() {
        return this.f96708e;
    }

    /* renamed from: h */
    public final InterfaceC24782h m101915h() {
        return this.f96705b;
    }

    /* renamed from: i */
    public final C20594q m101916i() {
        return this.f96707d;
    }

    /* renamed from: j */
    public final ZinstantNative m101917j() {
        return this.f96706c;
    }

    /* renamed from: k */
    public final InterfaceC24792r m101918k() {
        return this.f96710g;
    }
}
