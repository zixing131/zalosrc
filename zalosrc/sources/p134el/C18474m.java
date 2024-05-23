package p134el;

import fn0.AbstractC19074t;
import x90.C29540n;

/* renamed from: el.m */
/* loaded from: classes3.dex */
public final class C18474m {

    /* renamed from: a */
    private final C29540n.u f93050a;

    public C18474m(C29540n.u uVar) {
        AbstractC19074t.m100208f(uVar, "rowItemData");
        this.f93050a = uVar;
    }

    /* renamed from: a */
    public final C29540n.u m97816a() {
        return this.f93050a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18474m) && AbstractC19074t.m100204b(this.f93050a, ((C18474m) obj).f93050a);
    }

    public int hashCode() {
        return this.f93050a.hashCode();
    }

    public String toString() {
        return "PromotionStickerDownloadParam(rowItemData=" + this.f93050a + ")";
    }
}
