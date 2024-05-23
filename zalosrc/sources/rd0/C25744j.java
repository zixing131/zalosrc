package rd0;

import fn0.AbstractC19074t;

/* renamed from: rd0.j */
/* loaded from: classes4.dex */
public final class C25744j extends AbstractC25751q {

    /* renamed from: a */
    private final String f122891a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25744j(String str) {
        super(null);
        AbstractC19074t.m100208f(str, "dataResponse");
        this.f122891a = str;
    }

    /* renamed from: a */
    public final String m132870a() {
        return this.f122891a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25744j) && AbstractC19074t.m100204b(this.f122891a, ((C25744j) obj).f122891a);
    }

    public int hashCode() {
        return this.f122891a.hashCode();
    }

    public String toString() {
        return "UploadFeedVideoResponse(dataResponse=" + this.f122891a + ")";
    }
}
