package p521t9;

import android.content.Context;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;

/* renamed from: t9.h */
/* loaded from: classes.dex */
public abstract class AbstractC26607h {

    /* renamed from: t9.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        String mo33624a(Object obj);
    }

    /* renamed from: b */
    public static C3339c m136567b(String str, String str2) {
        return C3339c.m16823l(AbstractC26605f.m136565a(str, str2), AbstractC26605f.class);
    }

    /* renamed from: c */
    public static C3339c m136568c(final String str, final a aVar) {
        return C3339c.m16824m(AbstractC26605f.class).m16841b(C3355r.m16909k(Context.class)).m16845f(new InterfaceC3345h() { // from class: t9.g
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                AbstractC26605f m136569d;
                m136569d = AbstractC26607h.m136569d(str, aVar, interfaceC3342e);
                return m136569d;
            }
        }).m16843d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC26605f m136569d(String str, a aVar, InterfaceC3342e interfaceC3342e) {
        return AbstractC26605f.m136565a(str, aVar.mo33624a((Context) interfaceC3342e.mo16847a(Context.class)));
    }
}
