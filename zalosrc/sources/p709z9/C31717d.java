package p709z9;

import com.google.gson.AbstractC6750k;
import com.google.gson.C6743d;
import com.google.gson.InterfaceC6751l;
import com.google.gson.reflect.TypeToken;
import p637x9.InterfaceC29511b;
import p674y9.C30846c;

/* renamed from: z9.d */
/* loaded from: classes3.dex */
public final class C31717d implements InterfaceC6751l {

    /* renamed from: p */
    private final C30846c f145681p;

    public C31717d(C30846c c30846c) {
        this.f145681p = c30846c;
    }

    @Override // com.google.gson.InterfaceC6751l
    /* renamed from: a */
    public AbstractC6750k mo34566a(C6743d c6743d, TypeToken typeToken) {
        InterfaceC29511b interfaceC29511b = (InterfaceC29511b) typeToken.getRawType().getAnnotation(InterfaceC29511b.class);
        if (interfaceC29511b == null) {
            return null;
        }
        return m152601b(this.f145681p, c6743d, typeToken, interfaceC29511b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC6750k m152601b(C30846c c30846c, C6743d c6743d, TypeToken typeToken, InterfaceC29511b interfaceC29511b) {
        AbstractC6750k mo34566a;
        Object mo149955a = c30846c.m149954a(TypeToken.get(interfaceC29511b.value())).mo149955a();
        if (mo149955a instanceof AbstractC6750k) {
            mo34566a = (AbstractC6750k) mo149955a;
        } else if (mo149955a instanceof InterfaceC6751l) {
            mo34566a = ((InterfaceC6751l) mo149955a).mo34566a(c6743d, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo149955a.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (mo34566a != null && interfaceC29511b.nullSafe()) {
            return mo34566a.m34564a();
        }
        return mo34566a;
    }
}
