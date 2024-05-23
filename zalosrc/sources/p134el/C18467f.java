package p134el;

import fn0.AbstractC19060k;

/* renamed from: el.f */
/* loaded from: classes3.dex */
public final class C18467f implements InterfaceC18463b {

    /* renamed from: a */
    private final int f93035a;

    public C18467f(int i11) {
        this.f93035a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18467f) && this.f93035a == ((C18467f) obj).f93035a;
    }

    public int hashCode() {
        return this.f93035a;
    }

    public String toString() {
        return "EmojiTouchUpParam(dump=" + this.f93035a + ")";
    }

    public /* synthetic */ C18467f(int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
