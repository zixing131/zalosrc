package ph;

import fn0.AbstractC19074t;
import java.util.ArrayList;

/* renamed from: ph.e */
/* loaded from: classes3.dex */
public final class C24752e {

    /* renamed from: a */
    private final C24753f f118849a;

    /* renamed from: b */
    private final ArrayList f118850b;

    /* renamed from: c */
    private final int f118851c;

    public C24752e(C24753f c24753f, ArrayList arrayList, int i11) {
        AbstractC19074t.m100208f(c24753f, "reactionMsgType");
        AbstractC19074t.m100208f(arrayList, "listMsgId");
        this.f118849a = c24753f;
        this.f118850b = arrayList;
        this.f118851c = i11;
    }

    /* renamed from: a */
    public final ArrayList m128585a() {
        return this.f118850b;
    }

    /* renamed from: b */
    public final C24753f m128586b() {
        return this.f118849a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24752e)) {
            return false;
        }
        C24752e c24752e = (C24752e) obj;
        return AbstractC19074t.m100204b(this.f118849a, c24752e.f118849a) && AbstractC19074t.m100204b(this.f118850b, c24752e.f118850b) && this.f118851c == c24752e.f118851c;
    }

    public int hashCode() {
        return (((this.f118849a.hashCode() * 31) + this.f118850b.hashCode()) * 31) + this.f118851c;
    }

    public String toString() {
        return "ReactionMsgSocketInfo(reactionMsgType=" + this.f118849a + ", listMsgId=" + this.f118850b + ", source=" + this.f118851c + ")";
    }
}
