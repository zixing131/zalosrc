package p709z9;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6745f;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.C6748i;
import com.google.gson.InterfaceC6751l;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import p674y9.AbstractC30845b;
import p674y9.AbstractC30849f;
import p674y9.AbstractC30855l;
import p674y9.C30846c;
import p674y9.InterfaceC30852i;

/* renamed from: z9.f */
/* loaded from: classes3.dex */
public final class C31719f implements InterfaceC6751l {

    /* renamed from: p */
    private final C30846c f145687p;

    /* renamed from: q */
    final boolean f145688q;

    /* renamed from: z9.f$a */
    /* loaded from: classes3.dex */
    private final class a extends AbstractC6750k {

        /* renamed from: a */
        private final AbstractC6750k f145689a;

        /* renamed from: b */
        private final AbstractC6750k f145690b;

        /* renamed from: c */
        private final InterfaceC30852i f145691c;

        public a(C6743d c6743d, Type type, AbstractC6750k abstractC6750k, Type type2, AbstractC6750k abstractC6750k2, InterfaceC30852i interfaceC30852i) {
            this.f145689a = new C31724k(c6743d, abstractC6750k, type);
            this.f145690b = new C31724k(c6743d, abstractC6750k2, type2);
            this.f145691c = interfaceC30852i;
        }

        /* renamed from: e */
        private String m152606e(AbstractC6745f abstractC6745f) {
            if (abstractC6745f.m34554m()) {
                C6748i m34550g = abstractC6745f.m34550g();
                if (m34550g.m34562u()) {
                    return String.valueOf(m34550g.m34559p());
                }
                if (m34550g.m34561s()) {
                    return Boolean.toString(m34550g.m34558n());
                }
                if (m34550g.m34563v()) {
                    return m34550g.m34560r();
                }
                throw new AssertionError();
            }
            if (abstractC6745f.m34552k()) {
                return "null";
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map mo34534b(C3380a c3380a) {
            EnumC3381b m17001N = c3380a.m17001N();
            if (m17001N == EnumC3381b.NULL) {
                c3380a.m16999J();
                return null;
            }
            Map map = (Map) this.f145691c.mo149955a();
            if (m17001N == EnumC3381b.BEGIN_ARRAY) {
                c3380a.m17003a();
                while (c3380a.m17010q()) {
                    c3380a.m17003a();
                    Object mo34534b = this.f145689a.mo34534b(c3380a);
                    if (map.put(mo34534b, this.f145690b.mo34534b(c3380a)) == null) {
                        c3380a.m17007h();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + mo34534b);
                    }
                }
                c3380a.m17007h();
            } else {
                c3380a.m17004b();
                while (c3380a.m17010q()) {
                    AbstractC30849f.f142352a.mo17015a(c3380a);
                    Object mo34534b2 = this.f145689a.mo34534b(c3380a);
                    if (map.put(mo34534b2, this.f145690b.mo34534b(c3380a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo34534b2);
                    }
                }
                c3380a.m17008i();
            }
            return map;
        }

        @Override // com.google.gson.AbstractC6750k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo34535d(C3382c c3382c, Map map) {
            boolean z11;
            if (map == null) {
                c3382c.mo17043v();
                return;
            }
            if (!C31719f.this.f145688q) {
                c3382c.mo17036d();
                for (Map.Entry entry : map.entrySet()) {
                    c3382c.mo17042s(String.valueOf(entry.getKey()));
                    this.f145690b.mo34535d(c3382c, entry.getValue());
                }
                c3382c.mo17038i();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i11 = 0;
            boolean z12 = false;
            for (Map.Entry entry2 : map.entrySet()) {
                AbstractC6745f m34565c = this.f145689a.m34565c(entry2.getKey());
                arrayList.add(m34565c);
                arrayList2.add(entry2.getValue());
                if (!m34565c.m34551j() && !m34565c.m34553l()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                z12 |= z11;
            }
            if (z12) {
                c3382c.mo17035c();
                int size = arrayList.size();
                while (i11 < size) {
                    c3382c.mo17035c();
                    AbstractC30855l.m149993a((AbstractC6745f) arrayList.get(i11), c3382c);
                    this.f145690b.mo34535d(c3382c, arrayList2.get(i11));
                    c3382c.mo17037h();
                    i11++;
                }
                c3382c.mo17037h();
                return;
            }
            c3382c.mo17036d();
            int size2 = arrayList.size();
            while (i11 < size2) {
                c3382c.mo17042s(m152606e((AbstractC6745f) arrayList.get(i11)));
                this.f145690b.mo34535d(c3382c, arrayList2.get(i11));
                i11++;
            }
            c3382c.mo17038i();
        }
    }

    public C31719f(C30846c c30846c, boolean z11) {
        this.f145687p = c30846c;
        this.f145688q = z11;
    }

    /* renamed from: b */
    private AbstractC6750k m152605b(C6743d c6743d, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return c6743d.m34526j(TypeToken.get(type));
        }
        return AbstractC31725l.f145751f;
    }

    @Override // com.google.gson.InterfaceC6751l
    /* renamed from: a */
    public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] m149939j = AbstractC30845b.m149939j(type, AbstractC30845b.m149940k(type));
        return new a(c6743d, m149939j[0], m152605b(c6743d, m149939j[0]), m149939j[1], c6743d.m34526j(TypeToken.get(m149939j[1])), this.f145687p.m149954a(typeToken));
    }
}
