package pr;

import androidx.work.AbstractC2144f;
import bo.C3020p0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p716zh.C32002l4;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pr.a */
/* loaded from: classes4.dex */
public final class C24905a {

    /* renamed from: a */
    private List f119501a;

    /* renamed from: b */
    private List f119502b;

    /* renamed from: c */
    private C32002l4 f119503c;

    /* renamed from: d */
    private boolean f119504d;

    public C24905a(List list, List list2, C32002l4 c32002l4, boolean z11) {
        AbstractC19074t.m100208f(list, "feedIds");
        AbstractC19074t.m100208f(list2, "ownerIds");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        this.f119501a = list;
        this.f119502b = list2;
        this.f119503c = c32002l4;
        this.f119504d = z11;
    }

    /* renamed from: a */
    public final C32002l4 m129508a() {
        return this.f119503c;
    }

    /* renamed from: b */
    public final List m129509b() {
        return this.f119501a;
    }

    /* renamed from: c */
    public final boolean m129510c() {
        return this.f119504d;
    }

    /* renamed from: d */
    public final List m129511d() {
        return this.f119502b;
    }

    /* renamed from: e */
    public final void m129512e(boolean z11) {
        this.f119504d = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24905a)) {
            return false;
        }
        C24905a c24905a = (C24905a) obj;
        return AbstractC19074t.m100204b(this.f119501a, c24905a.f119501a) && AbstractC19074t.m100204b(this.f119502b, c24905a.f119502b) && AbstractC19074t.m100204b(this.f119503c, c24905a.f119503c) && this.f119504d == c24905a.f119504d;
    }

    public int hashCode() {
        return (((((this.f119501a.hashCode() * 31) + this.f119502b.hashCode()) * 31) + this.f119503c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f119504d);
    }

    public String toString() {
        return "LoadSuggestCommentData(feedIds=" + this.f119501a + ", ownerIds=" + this.f119502b + ", entryPointChain=" + this.f119503c + ", needReloadInQueue=" + this.f119504d + ")";
    }

    public /* synthetic */ C24905a(List list, List list2, C32002l4 c32002l4, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? new ArrayList() : list2, (i11 & 4) != 0 ? C32002l4.Companion.m154287a(10000) : c32002l4, (i11 & 8) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24905a(List list, C32002l4 c32002l4) {
        this(null, null, null, false, 15, null);
        AbstractC19074t.m100208f(list, "feedItems");
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3020p0 c3020p0 = (C3020p0) it.next();
            String str = c3020p0.f12057p;
            AbstractC19074t.m100207e(str, "fid");
            arrayList.add(str);
            String m14465A = c3020p0.m14465A();
            AbstractC19074t.m100207e(m14465A, "getOwnerId(...)");
            arrayList2.add(m14465A);
        }
        this.f119501a = arrayList;
        this.f119502b = arrayList2;
        this.f119503c = c32002l4;
    }
}
