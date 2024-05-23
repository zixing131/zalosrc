package h10;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import p10.EnumC24604h;

/* renamed from: h10.l */
/* loaded from: classes5.dex */
public abstract class AbstractC19711l {

    /* renamed from: a */
    private final Long f97836a;

    /* renamed from: b */
    private final EnumC24604h f97837b;

    public AbstractC19711l(Long l11, EnumC24604h enumC24604h) {
        AbstractC19074t.m100208f(enumC24604h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f97836a = l11;
        this.f97837b = enumC24604h;
    }

    /* renamed from: a */
    public Long mo103448a() {
        return this.f97836a;
    }

    /* renamed from: b */
    public final String m103451b() {
        Long mo103448a = mo103448a();
        if (mo103448a != null) {
            return mo103448a.toString();
        }
        return null;
    }

    /* renamed from: c */
    public EnumC24604h mo103449c() {
        return this.f97837b;
    }
}
