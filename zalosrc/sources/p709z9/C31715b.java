package p709z9;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6751l;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import p674y9.AbstractC30845b;
import p674y9.C30846c;
import p674y9.InterfaceC30852i;

/* renamed from: z9.b */
/* loaded from: classes3.dex */
public final class C31715b implements InterfaceC6751l {

    /* renamed from: p */
    private final C30846c f145676p;

    /* renamed from: z9.b$a */
    /* loaded from: classes3.dex */
    private static final class a extends AbstractC6750k {

        /* renamed from: a */
        private final AbstractC6750k f145677a;

        /* renamed from: b */
        private final InterfaceC30852i f145678b;

        public a(C6743d c6743d, Type type, AbstractC6750k abstractC6750k, InterfaceC30852i interfaceC30852i) {
            this.f145677a = new C31724k(c6743d, abstractC6750k, type);
            this.f145678b = interfaceC30852i;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection mo34534b(C3380a c3380a) {
            if (c3380a.m17001N() == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            Collection collection = (Collection) this.f145678b.mo149955a();
            c3380a.m17003a();
            while (c3380a.m17010q()) {
                collection.add(this.f145677a.mo34534b(c3380a));
            }
            c3380a.m17007h();
            return collection;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Collection collection) {
            if (collection == null) {
                c3382c.mo17043v();
                return;
            }
            c3382c.mo17035c();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                this.f145677a.mo34535d(c3382c, it.next());
            }
            c3382c.mo17037h();
        }
    }

    public C31715b(C30846c c30846c) {
        this.f145676p = c30846c;
    }

    @Override // com.google.gson.InterfaceC6751l
    /* renamed from: a */
    public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
        Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type m149937h = AbstractC30845b.m149937h(type, rawType);
        return new a(c6743d, m149937h, c6743d.m34526j(TypeToken.get(m149937h)), this.f145676p.m149954a(typeToken));
    }
}
