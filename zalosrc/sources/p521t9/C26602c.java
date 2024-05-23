package p521t9;

import java.util.Iterator;
import java.util.Set;
import p052c8.C3339c;
import p052c8.C3355r;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;

/* renamed from: t9.c */
/* loaded from: classes.dex */
public class C26602c implements InterfaceC26608i {

    /* renamed from: a */
    private final String f125941a;

    /* renamed from: b */
    private final C26603d f125942b;

    C26602c(Set set, C26603d c26603d) {
        this.f125941a = m136560e(set);
        this.f125942b = c26603d;
    }

    /* renamed from: c */
    public static C3339c m136558c() {
        return C3339c.m16821e(InterfaceC26608i.class).m16841b(C3355r.m16911m(AbstractC26605f.class)).m16845f(new InterfaceC3345h() { // from class: t9.b
            @Override // p052c8.InterfaceC3345h
            /* renamed from: a */
            public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                InterfaceC26608i m136559d;
                m136559d = C26602c.m136559d(interfaceC3342e);
                return m136559d;
            }
        }).m16843d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC26608i m136559d(InterfaceC3342e interfaceC3342e) {
        return new C26602c(interfaceC3342e.mo16849c(AbstractC26605f.class), C26603d.m136562a());
    }

    /* renamed from: e */
    private static String m136560e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC26605f abstractC26605f = (AbstractC26605f) it.next();
            sb2.append(abstractC26605f.mo136555b());
            sb2.append('/');
            sb2.append(abstractC26605f.mo136556c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // p521t9.InterfaceC26608i
    /* renamed from: a */
    public String mo136561a() {
        if (this.f125942b.m136563b().isEmpty()) {
            return this.f125941a;
        }
        return this.f125941a + ' ' + m136560e(this.f125942b.m136563b());
    }
}
