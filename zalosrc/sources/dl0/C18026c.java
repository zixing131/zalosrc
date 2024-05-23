package dl0;

import bl0.AbstractC2838d;
import bl0.C2839e;
import cl0.C3591u;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import vk0.C28284f;
import zk0.InterfaceC32222a;

/* renamed from: dl0.c */
/* loaded from: classes7.dex */
public final class C18026c extends AbstractC2838d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18026c(C3591u c3591u, InterfaceC32222a interfaceC32222a) {
        super(c3591u, interfaceC32222a);
        AbstractC19074t.m100208f(c3591u, "zomDocumentInfo");
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        m142533d("native layout - without cache");
        ZOMDocument nativeLayout = ((C3591u) m142531b()).m13704i().m99744f().nativeLayout(((C3591u) m142531b()).m13701f().m99721f(), ((C3591u) m142531b()).m13701f().m99722g(), ((C3591u) m142531b()).m18196y(), ((C3591u) m142531b()).m18195x(), ((C3591u) m142531b()).m13701f().m99727l(), ((C3591u) m142531b()).m13701f().m99720e(), ((C3591u) m142531b()).m13701f().m99723h(), ((C3591u) m142531b()).m13701f().m99724i(), null, ((C3591u) m142531b()).m13701f().m99726k(), ((C3591u) m142531b()).m13701f().m99718c(), true, ((C3591u) m142531b()).m13703h().m99736f(), ((C3591u) m142531b()).m13703h().m99731a(), ((C3591u) m142531b()).m13701f().m99717b(), ((C3591u) m142531b()).m13701f().m99725j(), ((C3591u) m142531b()).m13701f().m99719d());
        if (nativeLayout != null) {
            if (!nativeLayout.allowReuse()) {
                nativeLayout.resetNativeObject();
            }
            return new C2839e(nativeLayout, null, 2, null);
        }
        return new C2839e(null, new C28284f(404, "native layout - document was null"), 1, null);
    }
}
