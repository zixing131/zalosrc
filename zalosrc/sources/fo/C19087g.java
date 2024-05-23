package fo;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.C18521e;
import p185gc.AbstractC19377a;

/* renamed from: fo.g */
/* loaded from: classes4.dex */
public final class C19087g extends AbstractC19377a {

    /* renamed from: a */
    private final C18521e f95010a;

    /* renamed from: fo.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f95011a;

        /* renamed from: b */
        private final int f95012b;

        public a(String str, int i11) {
            AbstractC19074t.m100208f(str, "userId");
            this.f95011a = str;
            this.f95012b = i11;
        }

        /* renamed from: a */
        public final int m100273a() {
            return this.f95012b;
        }

        /* renamed from: b */
        public final String m100274b() {
            return this.f95011a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95011a, aVar.f95011a) && this.f95012b == aVar.f95012b;
        }

        public int hashCode() {
            return (this.f95011a.hashCode() * 31) + this.f95012b;
        }

        public String toString() {
            return "Param(userId=" + this.f95011a + ", albumType=" + this.f95012b + ")";
        }
    }

    public C19087g(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f95010a = c18521e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return this.f95010a.mo97902f(aVar.m100274b(), aVar.m100273a());
    }

    public /* synthetic */ C19087g(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
