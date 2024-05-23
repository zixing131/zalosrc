package h10;

import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import p10.EnumC24604h;

/* renamed from: h10.k */
/* loaded from: classes5.dex */
public final class C19710k extends AbstractC19711l {

    /* renamed from: c */
    private final Long f97833c;

    /* renamed from: d */
    private final InteractEventResponse.InteractItem f97834d;

    /* renamed from: e */
    private final EnumC24604h f97835e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19710k(Long l11, InteractEventResponse.InteractItem interactItem, EnumC24604h enumC24604h) {
        super(l11, enumC24604h);
        AbstractC19074t.m100208f(enumC24604h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f97833c = l11;
        this.f97834d = interactItem;
        this.f97835e = enumC24604h;
    }

    @Override // h10.AbstractC19711l
    /* renamed from: a */
    public Long mo103448a() {
        return this.f97833c;
    }

    @Override // h10.AbstractC19711l
    /* renamed from: c */
    public EnumC24604h mo103449c() {
        return this.f97835e;
    }

    /* renamed from: d */
    public final InteractEventResponse.InteractItem m103450d() {
        return this.f97834d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19710k)) {
            return false;
        }
        C19710k c19710k = (C19710k) obj;
        return AbstractC19074t.m100204b(this.f97833c, c19710k.f97833c) && AbstractC19074t.m100204b(this.f97834d, c19710k.f97834d) && this.f97835e == c19710k.f97835e;
    }

    public int hashCode() {
        Long l11 = this.f97833c;
        int hashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        InteractEventResponse.InteractItem interactItem = this.f97834d;
        return ((hashCode + (interactItem != null ? interactItem.hashCode() : 0)) * 31) + this.f97835e.hashCode();
    }

    public String toString() {
        return "InteractEmitEvent(liveId=" + this.f97833c + ", interactItem=" + this.f97834d + ", type=" + this.f97835e + ")";
    }
}
