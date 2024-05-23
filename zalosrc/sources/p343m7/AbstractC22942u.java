package p343m7;

import java.util.Collections;
import java.util.Map;

/* renamed from: m7.u */
/* loaded from: classes3.dex */
public abstract class AbstractC22942u {
    /* renamed from: a */
    public abstract AbstractC22942u mo117647a(int i11);

    /* renamed from: b */
    abstract AbstractC22942u mo117648b(Map map);

    /* renamed from: c */
    abstract AbstractC22943v mo117649c();

    /* renamed from: d */
    public abstract Map mo117650d();

    /* renamed from: e */
    public final AbstractC22943v m117659e() {
        mo117648b(Collections.unmodifiableMap(mo117650d()));
        return mo117649c();
    }
}
