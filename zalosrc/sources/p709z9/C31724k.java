package p709z9;

import ca.C3380a;
import ca.C3382c;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p709z9.C31721h;

/* renamed from: z9.k */
/* loaded from: classes3.dex */
final class C31724k extends AbstractC6750k {

    /* renamed from: a */
    private final C6743d f145717a;

    /* renamed from: b */
    private final AbstractC6750k f145718b;

    /* renamed from: c */
    private final Type f145719c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31724k(C6743d c6743d, AbstractC6750k abstractC6750k, Type type) {
        this.f145717a = c6743d;
        this.f145718b = abstractC6750k;
        this.f145719c = type;
    }

    /* renamed from: e */
    private Type m152621e(Type type, Object obj) {
        if (obj != null) {
            if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
                return obj.getClass();
            }
            return type;
        }
        return type;
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: b */
    public Object mo34534b(C3380a c3380a) {
        return this.f145718b.mo34534b(c3380a);
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: d */
    public void mo34535d(C3382c c3382c, Object obj) {
        AbstractC6750k abstractC6750k = this.f145718b;
        Type m152621e = m152621e(this.f145719c, obj);
        if (m152621e != this.f145719c) {
            abstractC6750k = this.f145717a.m34526j(TypeToken.get(m152621e));
            if (abstractC6750k instanceof C31721h.b) {
                AbstractC6750k abstractC6750k2 = this.f145718b;
                if (!(abstractC6750k2 instanceof C31721h.b)) {
                    abstractC6750k = abstractC6750k2;
                }
            }
        }
        abstractC6750k.mo34535d(c3382c, obj);
    }
}
