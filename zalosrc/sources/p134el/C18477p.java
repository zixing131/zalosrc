package p134el;

import fn0.AbstractC19074t;

/* renamed from: el.p */
/* loaded from: classes3.dex */
public final class C18477p implements InterfaceC18462a {

    /* renamed from: a */
    private final String f93056a;

    public C18477p(String str) {
        AbstractC19074t.m100208f(str, "cateId");
        this.f93056a = str;
    }

    /* renamed from: a */
    public final String m97821a() {
        return this.f93056a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18477p) && AbstractC19074t.m100204b(this.f93056a, ((C18477p) obj).f93056a);
    }

    public int hashCode() {
        return this.f93056a.hashCode();
    }

    public String toString() {
        return "StickerTouchUpParam(cateId=" + this.f93056a + ")";
    }
}
