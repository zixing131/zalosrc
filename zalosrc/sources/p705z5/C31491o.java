package p705z5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p520t8.InterfaceC26584c;

/* renamed from: z5.o */
/* loaded from: classes2.dex */
public final class C31491o {

    /* renamed from: a */
    private final Map f144994a;

    /* renamed from: b */
    private final Map f144995b;

    /* renamed from: c */
    private final InterfaceC26584c f144996c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31491o(Map map, Map map2, InterfaceC26584c interfaceC26584c) {
        this.f144994a = map;
        this.f144995b = map2;
        this.f144996c = interfaceC26584c;
    }

    /* renamed from: a */
    public final byte[] m152326a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C31449l(byteArrayOutputStream, this.f144994a, this.f144995b, this.f144996c).m152299j(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
