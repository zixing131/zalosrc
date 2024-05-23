package p709z9;

import ca.C3380a;
import ca.C3382c;
import ca.EnumC3381b;
import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6751l;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p674y9.AbstractC30845b;

/* renamed from: z9.a */
/* loaded from: classes3.dex */
public final class C31714a extends AbstractC6750k {

    /* renamed from: c */
    public static final InterfaceC6751l f145673c = new a();

    /* renamed from: a */
    private final Class f145674a;

    /* renamed from: b */
    private final AbstractC6750k f145675b;

    /* renamed from: z9.a$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC6751l {
        a() {
        }

        @Override // com.google.gson.InterfaceC6751l
        /* renamed from: a */
        public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type m149936g = AbstractC30845b.m149936g(type);
            return new C31714a(c6743d, c6743d.m34526j(TypeToken.get(m149936g)), AbstractC30845b.m149940k(m149936g));
        }
    }

    public C31714a(C6743d c6743d, AbstractC6750k abstractC6750k, Class cls) {
        this.f145675b = new C31724k(c6743d, abstractC6750k, cls);
        this.f145674a = cls;
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: b */
    public Object mo34534b(C3380a c3380a) {
        if (c3380a.m17001N() == EnumC3381b.NULL) {
            c3380a.m16999J();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c3380a.m17003a();
        while (c3380a.m17010q()) {
            arrayList.add(this.f145675b.mo34534b(c3380a));
        }
        c3380a.m17007h();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f145674a, size);
        for (int i11 = 0; i11 < size; i11++) {
            Array.set(newInstance, i11, arrayList.get(i11));
        }
        return newInstance;
    }

    @Override // com.google.gson.AbstractC6750k
    /* renamed from: d */
    public void mo34535d(C3382c c3382c, Object obj) {
        if (obj == null) {
            c3382c.mo17043v();
            return;
        }
        c3382c.mo17035c();
        int length = Array.getLength(obj);
        for (int i11 = 0; i11 < length; i11++) {
            this.f145675b.mo34535d(c3382c, Array.get(obj, i11));
        }
        c3382c.mo17037h();
    }
}
