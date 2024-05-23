package a10;

import com.zing.zalo.shortvideo.data.model.config.ChannelConfig;
import fn0.AbstractC19074t;

/* renamed from: a10.a */
/* loaded from: classes5.dex */
public final class C0036a {

    /* renamed from: a */
    private final int f162a;

    /* renamed from: b */
    private final ChannelConfig f163b;

    public C0036a(int i11, ChannelConfig channelConfig) {
        this.f162a = i11;
        this.f163b = channelConfig;
    }

    /* renamed from: a */
    public final ChannelConfig m120a() {
        return this.f163b;
    }

    /* renamed from: b */
    public final int m121b() {
        return this.f162a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0036a)) {
            return false;
        }
        C0036a c0036a = (C0036a) obj;
        return this.f162a == c0036a.f162a && AbstractC19074t.m100204b(this.f163b, c0036a.f163b);
    }

    public int hashCode() {
        int i11 = this.f162a * 31;
        ChannelConfig channelConfig = this.f163b;
        return i11 + (channelConfig == null ? 0 : channelConfig.hashCode());
    }

    public String toString() {
        return "ChannelConfigTb(id=" + this.f162a + ", channelConfig=" + this.f163b + ")";
    }
}
