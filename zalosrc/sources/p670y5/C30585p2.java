package p670y5;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import p520t8.InterfaceC26584c;
import p540u8.InterfaceC27098b;

/* renamed from: y5.p2 */
/* loaded from: classes2.dex */
public final class C30585p2 implements InterfaceC27098b {

    /* renamed from: d */
    private static final InterfaceC26584c f141609d = new InterfaceC26584c() { // from class: y5.o2
        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public final void mo480a(Object obj, Object obj2) {
            int i11 = C30585p2.f141610e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e */
    public static final /* synthetic */ int f141610e = 0;

    /* renamed from: a */
    private final Map f141611a = new HashMap();

    /* renamed from: b */
    private final Map f141612b = new HashMap();

    /* renamed from: c */
    private final InterfaceC26584c f141613c = f141609d;

    @Override // p540u8.InterfaceC27098b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC27098b mo725a(Class cls, InterfaceC26584c interfaceC26584c) {
        this.f141611a.put(cls, interfaceC26584c);
        this.f141612b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C30604q2 m149606b() {
        return new C30604q2(new HashMap(this.f141611a), new HashMap(this.f141612b), this.f141613c);
    }
}
