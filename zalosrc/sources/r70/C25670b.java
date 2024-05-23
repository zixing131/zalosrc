package r70;

import fn0.AbstractC19074t;
import p716zh.C31862c;

/* renamed from: r70.b */
/* loaded from: classes5.dex */
public final class C25670b extends AbstractC25672d {

    /* renamed from: c */
    private final C31862c f122635c;

    public C25670b(C31862c c31862c) {
        super(3);
        this.f122635c = c31862c;
    }

    /* renamed from: d */
    public final C31862c m132555d() {
        return this.f122635c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25670b) && AbstractC19074t.m100204b(this.f122635c, ((C25670b) obj).f122635c);
    }

    public int hashCode() {
        C31862c c31862c = this.f122635c;
        if (c31862c == null) {
            return 0;
        }
        return c31862c.hashCode();
    }

    public String toString() {
        return "QuickActionData(actionItem=" + this.f122635c + ")";
    }
}
