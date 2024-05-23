package p012a6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p520t8.InterfaceC26584c;

/* renamed from: a6.h2 */
/* loaded from: classes2.dex */
public final class C0280h2 {

    /* renamed from: a */
    private final Map f1441a;

    /* renamed from: b */
    private final Map f1442b;

    /* renamed from: c */
    private final InterfaceC26584c f1443c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0280h2(Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f1441a = map;
        this.f1442b = map2;
        this.f1443c = interfaceC26584c;
    }

    /* renamed from: a */
    public final byte[] m744a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C0223e2(byteArrayOutputStream, this.f1441a, this.f1442b, this.f1443c).m680j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
