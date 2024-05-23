package za;

import com.google.zxing.EnumC6846a;
import com.google.zxing.InterfaceC6850e;
import java.util.Map;
import va.C27954b;

/* renamed from: za.o */
/* loaded from: classes3.dex */
public final class C31742o implements InterfaceC6850e {

    /* renamed from: a */
    private final C31737j f145811a = new C31737j();

    @Override // com.google.zxing.InterfaceC6850e
    /* renamed from: a */
    public C27954b mo960a(String str, EnumC6846a enumC6846a, int i11, int i12, Map map) {
        if (enumC6846a == EnumC6846a.UPC_A) {
            return this.f145811a.mo960a('0' + str, EnumC6846a.EAN_13, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + enumC6846a);
    }
}
