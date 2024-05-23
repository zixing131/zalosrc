package fo;

import com.zing.zalo.feed.mvp.profile.model.C8676a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.C18521e;
import p185gc.AbstractC19382f;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* renamed from: fo.f */
/* loaded from: classes4.dex */
public final class C19086f extends AbstractC19382f {

    /* renamed from: a */
    private final C18521e f95005a;

    /* renamed from: fo.f$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f95006a;

        /* renamed from: b */
        private final int f95007b;

        /* renamed from: c */
        private final int f95008c;

        /* renamed from: d */
        private final C8676a f95009d;

        public a(String str, int i11, int i12, C8676a c8676a) {
            AbstractC19074t.m100208f(str, "userId");
            this.f95006a = str;
            this.f95007b = i11;
            this.f95008c = i12;
            this.f95009d = c8676a;
        }

        /* renamed from: a */
        public final C8676a m100268a() {
            return this.f95009d;
        }

        /* renamed from: b */
        public final int m100269b() {
            return this.f95008c;
        }

        /* renamed from: c */
        public final int m100270c() {
            return this.f95007b;
        }

        /* renamed from: d */
        public final String m100271d() {
            return this.f95006a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95006a, aVar.f95006a) && this.f95007b == aVar.f95007b && this.f95008c == aVar.f95008c && AbstractC19074t.m100204b(this.f95009d, aVar.f95009d);
        }

        public int hashCode() {
            int hashCode = ((((this.f95006a.hashCode() * 31) + this.f95007b) * 31) + this.f95008c) * 31;
            C8676a c8676a = this.f95009d;
            return hashCode + (c8676a == null ? 0 : c8676a.hashCode());
        }

        public String toString() {
            return "Param(userId=" + this.f95006a + ", typeAlbum=" + this.f95007b + ", page=" + this.f95008c + ", appendAlbumCollection=" + this.f95009d + ")";
        }

        public /* synthetic */ a(String str, int i11, int i12, C8676a c8676a, int i13, AbstractC19060k abstractC19060k) {
            this(str, i11, i12, (i13 & 8) != 0 ? null : c8676a);
        }
    }

    public C19086f(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f95005a = c18521e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19382f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo13397b(a aVar, Continuation continuation) {
        Object m142578e;
        Object mo97901e = this.f95005a.mo97901e(aVar.m100271d(), aVar.m100270c(), aVar.m100269b(), aVar.m100268a(), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97901e == m142578e) {
            return mo97901e;
        }
        return C24848g0.f119245a;
    }

    public /* synthetic */ C19086f(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
