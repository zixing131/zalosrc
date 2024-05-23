package fl0;

import com.zing.zalo.zinstant.ZinstantNativeBase;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ik0.C20594q;
import lk0.C22509g;
import pj0.InterfaceC24782h;
import pj0.InterfaceC24792r;

/* renamed from: fl0.g */
/* loaded from: classes7.dex */
public final class C18996g {

    /* renamed from: a */
    private final C18991b f94825a;

    /* renamed from: b */
    private final C20594q f94826b;

    /* renamed from: c */
    private final ZinstantNativeBase f94827c;

    /* renamed from: d */
    private final InterfaceC24782h f94828d;

    /* renamed from: e */
    private final InterfaceC24792r f94829e;

    /* renamed from: f */
    private final C22509g f94830f;

    /* renamed from: g */
    private final C18993d f94831g;

    public C18996g(C18991b c18991b, C20594q c20594q, ZinstantNativeBase zinstantNativeBase, InterfaceC24782h interfaceC24782h, InterfaceC24792r interfaceC24792r, C22509g c22509g, C18993d c18993d) {
        AbstractC19074t.m100208f(c18991b, "disk");
        AbstractC19074t.m100208f(c20594q, "zinstantCache");
        AbstractC19074t.m100208f(zinstantNativeBase, "zinstantNative");
        AbstractC19074t.m100208f(interfaceC24782h, "resourceDownloader");
        AbstractC19074t.m100208f(interfaceC24792r, "zinstantProvider");
        AbstractC19074t.m100208f(c22509g, "repository");
        AbstractC19074t.m100208f(c18993d, "keyProvider");
        this.f94825a = c18991b;
        this.f94826b = c20594q;
        this.f94827c = zinstantNativeBase;
        this.f94828d = interfaceC24782h;
        this.f94829e = interfaceC24792r;
        this.f94830f = c22509g;
        this.f94831g = c18993d;
    }

    /* renamed from: a */
    public final C18991b m99739a() {
        return this.f94825a;
    }

    /* renamed from: b */
    public final C18993d m99740b() {
        return this.f94831g;
    }

    /* renamed from: c */
    public final C22509g m99741c() {
        return this.f94830f;
    }

    /* renamed from: d */
    public final InterfaceC24782h m99742d() {
        return this.f94828d;
    }

    /* renamed from: e */
    public final C20594q m99743e() {
        return this.f94826b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18996g)) {
            return false;
        }
        C18996g c18996g = (C18996g) obj;
        return AbstractC19074t.m100204b(this.f94825a, c18996g.f94825a) && AbstractC19074t.m100204b(this.f94826b, c18996g.f94826b) && AbstractC19074t.m100204b(this.f94827c, c18996g.f94827c) && AbstractC19074t.m100204b(this.f94828d, c18996g.f94828d) && AbstractC19074t.m100204b(this.f94829e, c18996g.f94829e) && AbstractC19074t.m100204b(this.f94830f, c18996g.f94830f) && AbstractC19074t.m100204b(this.f94831g, c18996g.f94831g);
    }

    /* renamed from: f */
    public final ZinstantNativeBase m99744f() {
        return this.f94827c;
    }

    /* renamed from: g */
    public final InterfaceC24792r m99745g() {
        return this.f94829e;
    }

    public int hashCode() {
        return (((((((((((this.f94825a.hashCode() * 31) + this.f94826b.hashCode()) * 31) + this.f94827c.hashCode()) * 31) + this.f94828d.hashCode()) * 31) + this.f94829e.hashCode()) * 31) + this.f94830f.hashCode()) * 31) + this.f94831g.hashCode();
    }

    public String toString() {
        return "Utility(disk=" + this.f94825a + ", zinstantCache=" + this.f94826b + ", zinstantNative=" + this.f94827c + ", resourceDownloader=" + this.f94828d + ", zinstantProvider=" + this.f94829e + ", repository=" + this.f94830f + ", keyProvider=" + this.f94831g + ')';
    }

    public /* synthetic */ C18996g(C18991b c18991b, C20594q c20594q, ZinstantNativeBase zinstantNativeBase, InterfaceC24782h interfaceC24782h, InterfaceC24792r interfaceC24792r, C22509g c22509g, C18993d c18993d, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C18991b() : c18991b, c20594q, zinstantNativeBase, interfaceC24782h, interfaceC24792r, c22509g, c18993d);
    }
}
