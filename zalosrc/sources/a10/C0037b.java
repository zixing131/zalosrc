package a10;

import com.zing.zalo.shortvideo.data.model.Channel;
import fn0.AbstractC19074t;

/* renamed from: a10.b */
/* loaded from: classes5.dex */
public final class C0037b {

    /* renamed from: a */
    private final String f164a;

    /* renamed from: b */
    private final Channel f165b;

    public C0037b(String str, Channel channel) {
        AbstractC19074t.m100208f(str, "userId");
        this.f164a = str;
        this.f165b = channel;
    }

    /* renamed from: a */
    public final Channel m122a() {
        return this.f165b;
    }

    /* renamed from: b */
    public final String m123b() {
        return this.f164a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0037b)) {
            return false;
        }
        C0037b c0037b = (C0037b) obj;
        return AbstractC19074t.m100204b(this.f164a, c0037b.f164a) && AbstractC19074t.m100204b(this.f165b, c0037b.f165b);
    }

    public int hashCode() {
        int hashCode = this.f164a.hashCode() * 31;
        Channel channel = this.f165b;
        return hashCode + (channel == null ? 0 : channel.hashCode());
    }

    public String toString() {
        return "ChannelTable(userId=" + this.f164a + ", channel=" + this.f165b + ")";
    }
}
