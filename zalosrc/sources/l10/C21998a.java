package l10;

import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import x00.InterfaceC29280a;

/* renamed from: l10.a */
/* loaded from: classes5.dex */
public final class C21998a implements InterfaceC22000c {

    /* renamed from: a */
    private final InterfaceC29280a f108366a;

    public C21998a(InterfaceC29280a interfaceC29280a) {
        AbstractC19074t.m100208f(interfaceC29280a, ZinstantMetaConstant.MEMORY_CACHING_CONTENT_CACHE);
        this.f108366a = interfaceC29280a;
    }

    @Override // l10.InterfaceC22000c
    /* renamed from: a */
    public String mo114874a() {
        String m51234g;
        User mo146327b = this.f108366a.mo146327b();
        if (mo146327b == null || (m51234g = mo146327b.m51234g()) == null) {
            return "";
        }
        return m51234g;
    }

    @Override // l10.InterfaceC22000c
    /* renamed from: b */
    public String mo114875b() {
        return this.f108366a.mo146343r();
    }

    @Override // l10.InterfaceC22000c
    /* renamed from: c */
    public String mo114876c() {
        String mo146306H = this.f108366a.mo146306H();
        if (mo146306H == null) {
            return "";
        }
        return mo146306H;
    }

    @Override // l10.InterfaceC22000c
    public boolean isValid() {
        if (mo114876c().length() > 0 && mo114874a().length() > 0 && mo114875b().length() > 0) {
            return true;
        }
        return false;
    }
}
