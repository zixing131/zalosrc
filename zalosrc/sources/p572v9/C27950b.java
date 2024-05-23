package p572v9;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p052c8.C3339c;
import p052c8.InterfaceC3342e;
import p052c8.InterfaceC3345h;
import p052c8.InterfaceC3347j;

/* renamed from: v9.b */
/* loaded from: classes.dex */
public class C27950b implements InterfaceC3347j {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m140875c(String str, C3339c c3339c, InterfaceC3342e interfaceC3342e) {
        try {
            AbstractC27951c.m140877b(str);
            return c3339c.m16829h().mo13078a(interfaceC3342e);
        } finally {
            AbstractC27951c.m140876a();
        }
    }

    @Override // p052c8.InterfaceC3347j
    /* renamed from: a */
    public List mo16870a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C3339c c3339c : componentRegistrar.getComponents()) {
            final String m16830i = c3339c.m16830i();
            if (m16830i != null) {
                c3339c = c3339c.m16836t(new InterfaceC3345h() { // from class: v9.a
                    @Override // p052c8.InterfaceC3345h
                    /* renamed from: a */
                    public final Object mo13078a(InterfaceC3342e interfaceC3342e) {
                        Object m140875c;
                        m140875c = C27950b.m140875c(m16830i, c3339c, interfaceC3342e);
                        return m140875c;
                    }
                });
            }
            arrayList.add(c3339c);
        }
        return arrayList;
    }
}
