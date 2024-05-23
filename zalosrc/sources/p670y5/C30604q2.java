package p670y5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p520t8.InterfaceC26584c;

/* renamed from: y5.q2 */
/* loaded from: classes2.dex */
public final class C30604q2 {

    /* renamed from: a */
    private final Map f141657a;

    /* renamed from: b */
    private final Map f141658b;

    /* renamed from: c */
    private final InterfaceC26584c f141659c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30604q2(Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f141657a = map;
        this.f141658b = map2;
        this.f141659c = interfaceC26584c;
    }

    /* renamed from: a */
    public final byte[] m149612a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C30547n2(byteArrayOutputStream, this.f141657a, this.f141658b, this.f141659c).m149580j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
