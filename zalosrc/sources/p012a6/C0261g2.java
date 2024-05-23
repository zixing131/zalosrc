package p012a6;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import p520t8.InterfaceC26584c;
import p540u8.InterfaceC27098b;

/* renamed from: a6.g2 */
/* loaded from: classes2.dex */
public final class C0261g2 implements InterfaceC27098b {

    /* renamed from: d */
    private static final InterfaceC26584c f1396d = new InterfaceC26584c() { // from class: a6.f2
        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public final void mo480a(Object obj, Object obj2) {
            int i11 = C0261g2.f1397e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e */
    public static final /* synthetic */ int f1397e = 0;

    /* renamed from: a */
    private final Map f1398a = new HashMap();

    /* renamed from: b */
    private final Map f1399b = new HashMap();

    /* renamed from: c */
    private final InterfaceC26584c f1400c = f1396d;

    @Override // p540u8.InterfaceC27098b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC27098b mo725a(Class cls, InterfaceC26584c interfaceC26584c) {
        this.f1398a.put(cls, interfaceC26584c);
        this.f1399b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C0280h2 m726b() {
        return new C0280h2(new HashMap(this.f1398a), new HashMap(this.f1399b), this.f1400c);
    }
}
