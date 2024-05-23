package p134el;

/* renamed from: el.d */
/* loaded from: classes3.dex */
public final class C18465d implements InterfaceC18463b {

    /* renamed from: a */
    private final int f93031a;

    public C18465d(int i11) {
        this.f93031a = i11;
    }

    /* renamed from: a */
    public final int m97798a() {
        return this.f93031a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18465d) && this.f93031a == ((C18465d) obj).f93031a;
    }

    public int hashCode() {
        return this.f93031a;
    }

    public String toString() {
        return "EmojiDeleteTouchParam(eventAction=" + this.f93031a + ")";
    }
}
