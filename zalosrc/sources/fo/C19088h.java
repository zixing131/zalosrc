package fo;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import p137eo.C18521e;
import p185gc.AbstractC19377a;

/* renamed from: fo.h */
/* loaded from: classes4.dex */
public final class C19088h extends AbstractC19377a {

    /* renamed from: a */
    private final C18521e f95013a;

    /* renamed from: fo.h$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f95014a;

        /* renamed from: b */
        private final long f95015b;

        /* renamed from: c */
        private final int f95016c;

        public a(String str, long j11, int i11) {
            AbstractC19074t.m100208f(str, "viewerId");
            this.f95014a = str;
            this.f95015b = j11;
            this.f95016c = i11;
        }

        /* renamed from: a */
        public final long m100276a() {
            return this.f95015b;
        }

        /* renamed from: b */
        public final int m100277b() {
            return this.f95016c;
        }

        /* renamed from: c */
        public final String m100278c() {
            return this.f95014a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f95014a, aVar.f95014a) && this.f95015b == aVar.f95015b && this.f95016c == aVar.f95016c;
        }

        public int hashCode() {
            return (((this.f95014a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f95015b)) * 31) + this.f95016c;
        }

        public String toString() {
            return "Param(viewerId=" + this.f95014a + ", albumId=" + this.f95015b + ", albumType=" + this.f95016c + ")";
        }
    }

    public C19088h(C18521e c18521e) {
        AbstractC19074t.m100208f(c18521e, "albumRepo");
        this.f95013a = c18521e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return this.f95013a.mo97887b(aVar.m100278c(), aVar.m100276a(), aVar.m100277b(), continuation);
    }

    public /* synthetic */ C19088h(C18521e c18521e, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C18521e.Companion.m97903a() : c18521e);
    }
}
