package ok0;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;

/* renamed from: ok0.d */
/* loaded from: classes7.dex */
public final class C24287d {

    /* renamed from: a */
    private final String f117271a;

    /* renamed from: b */
    private final InterfaceC24285b f117272b;

    public C24287d(String str, InterfaceC24285b interfaceC24285b) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(interfaceC24285b, "drawable");
        this.f117271a = str;
        this.f117272b = interfaceC24285b;
    }

    /* renamed from: a */
    public final InterfaceC24285b m126793a() {
        return this.f117272b;
    }

    /* renamed from: b */
    public final String m126794b() {
        return this.f117271a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24287d)) {
            return false;
        }
        C24287d c24287d = (C24287d) obj;
        return AbstractC19074t.m100204b(this.f117271a, c24287d.f117271a) && AbstractC19074t.m100204b(this.f117272b, c24287d.f117272b);
    }

    public int hashCode() {
        return (this.f117271a.hashCode() * 31) + this.f117272b.hashCode();
    }

    public String toString() {
        return "ZinstantAnimationDrawableInfo(url=" + this.f117271a + ", drawable=" + this.f117272b + ')';
    }
}
