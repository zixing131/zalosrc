package cy;

import com.zing.zalo.productcatalog.utils.SendProductSource;
import fn0.AbstractC19074t;
import p716zh.C32098s;

/* renamed from: cy.c */
/* loaded from: classes4.dex */
public final class C17584c {

    /* renamed from: a */
    private final SendProductSource f89559a;

    /* renamed from: b */
    private final int f89560b;

    /* renamed from: c */
    private final C32098s.a f89561c;

    public C17584c(SendProductSource sendProductSource, int i11, C32098s.a aVar) {
        AbstractC19074t.m100208f(sendProductSource, "sendProductSource");
        this.f89559a = sendProductSource;
        this.f89560b = i11;
        this.f89561c = aVar;
    }

    /* renamed from: a */
    public final int m93634a() {
        return this.f89560b;
    }

    /* renamed from: b */
    public final C32098s.a m93635b() {
        return this.f89561c;
    }

    /* renamed from: c */
    public final SendProductSource m93636c() {
        return this.f89559a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17584c)) {
            return false;
        }
        C17584c c17584c = (C17584c) obj;
        return AbstractC19074t.m100204b(this.f89559a, c17584c.f89559a) && this.f89560b == c17584c.f89560b && AbstractC19074t.m100204b(this.f89561c, c17584c.f89561c);
    }

    public int hashCode() {
        int hashCode = ((this.f89559a.hashCode() * 31) + this.f89560b) * 31;
        C32098s.a aVar = this.f89561c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ProductLinkMsgTrackingData(sendProductSource=" + this.f89559a + ", linkType=" + this.f89560b + ", productCatalogInfo=" + this.f89561c + ")";
    }
}
