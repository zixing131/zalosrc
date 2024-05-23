package i60;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: i60.p */
/* loaded from: classes5.dex */
public final class C20350p {

    /* renamed from: a */
    private final String f100351a;

    /* renamed from: b */
    private final List f100352b;

    /* renamed from: c */
    private final String f100353c;

    /* renamed from: d */
    private final boolean f100354d;

    /* renamed from: e */
    private final boolean f100355e;

    public C20350p(String str, List list, String str2, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "msgIdList");
        AbstractC19074t.m100208f(str2, "icon");
        this.f100351a = str;
        this.f100352b = list;
        this.f100353c = str2;
        this.f100354d = z11;
        this.f100355e = z12;
    }

    /* renamed from: a */
    public final boolean m106086a() {
        return this.f100354d;
    }

    /* renamed from: b */
    public final String m106087b() {
        return this.f100353c;
    }

    /* renamed from: c */
    public final List m106088c() {
        return this.f100352b;
    }

    /* renamed from: d */
    public final boolean m106089d() {
        return this.f100355e;
    }

    /* renamed from: e */
    public final String m106090e() {
        return this.f100351a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20350p)) {
            return false;
        }
        C20350p c20350p = (C20350p) obj;
        return AbstractC19074t.m100204b(this.f100351a, c20350p.f100351a) && AbstractC19074t.m100204b(this.f100352b, c20350p.f100352b) && AbstractC19074t.m100204b(this.f100353c, c20350p.f100353c) && this.f100354d == c20350p.f100354d && this.f100355e == c20350p.f100355e;
    }

    public int hashCode() {
        return (((((((this.f100351a.hashCode() * 31) + this.f100352b.hashCode()) * 31) + this.f100353c.hashCode()) * 31) + AbstractC2144f.m11520a(this.f100354d)) * 31) + AbstractC2144f.m11520a(this.f100355e);
    }

    public String toString() {
        return "ReactionEvent(ownerId=" + this.f100351a + ", msgIdList=" + this.f100352b + ", icon=" + this.f100353c + ", hasExplosionAnim=" + this.f100354d + ", myReaction=" + this.f100355e + ")";
    }

    public /* synthetic */ C20350p(String str, List list, String str2, boolean z11, boolean z12, int i11, AbstractC19060k abstractC19060k) {
        this(str, list, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? false : z12);
    }
}
