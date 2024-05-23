package ge;

import com.zing.zalocore.connection.socket.AbstractC17522a;
import java.io.ByteArrayOutputStream;

/* renamed from: ge.n */
/* loaded from: classes3.dex */
public class C19422n {

    /* renamed from: a */
    public byte f96360a;

    /* renamed from: b */
    public int f96361b;

    /* renamed from: c */
    public byte f96362c;

    /* renamed from: d */
    public byte f96363d;

    public C19422n(byte b11, int i11, byte b12, byte b13) {
        this.f96360a = b11;
        this.f96361b = i11;
        this.f96362c = b12;
        this.f96363d = b13;
    }

    /* renamed from: a */
    public void m101567a(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(this.f96360a);
        byteArrayOutputStream.write(AbstractC17522a.m93344g(this.f96361b));
        byteArrayOutputStream.write(this.f96362c);
        byteArrayOutputStream.write(this.f96363d);
    }
}
