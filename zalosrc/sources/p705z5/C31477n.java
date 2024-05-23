package p705z5;

import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import p520t8.InterfaceC26584c;
import p540u8.InterfaceC27098b;

/* renamed from: z5.n */
/* loaded from: classes2.dex */
public final class C31477n implements InterfaceC27098b {

    /* renamed from: d */
    private static final InterfaceC26584c f144964d = new InterfaceC26584c() { // from class: z5.m
        @Override // p520t8.InterfaceC26584c
        /* renamed from: a */
        public final void mo480a(Object obj, Object obj2) {
            int i11 = C31477n.f144965e;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };

    /* renamed from: e */
    public static final /* synthetic */ int f144965e = 0;

    /* renamed from: a */
    private final Map f144966a = new HashMap();

    /* renamed from: b */
    private final Map f144967b = new HashMap();

    /* renamed from: c */
    private final InterfaceC26584c f144968c = f144964d;

    @Override // p540u8.InterfaceC27098b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC27098b mo725a(Class cls, InterfaceC26584c interfaceC26584c) {
        this.f144966a.put(cls, interfaceC26584c);
        this.f144967b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C31491o m152322b() {
        return new C31491o(new HashMap(this.f144966a), new HashMap(this.f144967b), this.f144968c);
    }
}
