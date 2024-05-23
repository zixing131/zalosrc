package p385oa;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.nio.ByteBuffer;
import p234ia.InterfaceC20462h;
import p705z5.AbstractC31378fc;
import p705z5.AbstractC31406hc;

/* renamed from: oa.a */
/* loaded from: classes3.dex */
public class C24141a implements InterfaceC20462h {

    /* renamed from: a */
    private volatile Bitmap f116674a;

    /* renamed from: b */
    private volatile ByteBuffer f116675b;

    /* renamed from: c */
    private final int f116676c;

    /* renamed from: d */
    private final int f116677d;

    /* renamed from: e */
    private final int f116678e;

    /* renamed from: f */
    private final int f116679f;

    /* renamed from: g */
    private final Matrix f116680g;

    private C24141a(Bitmap bitmap, int i11) {
        this.f116674a = (Bitmap) AbstractC4205o.m19722k(bitmap);
        this.f116676c = bitmap.getWidth();
        this.f116677d = bitmap.getHeight();
        m126117m(i11);
        this.f116678e = i11;
        this.f116679f = -1;
        this.f116680g = null;
    }

    /* renamed from: a */
    public static C24141a m126114a(Bitmap bitmap, int i11) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C24141a c24141a = new C24141a(bitmap, i11);
        m126118n(-1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i11);
        return c24141a;
    }

    /* renamed from: b */
    public static C24141a m126115b(byte[] bArr, int i11, int i12, int i13, int i14) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C24141a c24141a = new C24141a(ByteBuffer.wrap((byte[]) AbstractC4205o.m19722k(bArr)), i11, i12, i13, i14);
        m126118n(i14, 2, elapsedRealtime, i12, i11, bArr.length, i13);
        return c24141a;
    }

    /* renamed from: c */
    public static C24141a m126116c(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C24141a c24141a = new C24141a(byteBuffer, i11, i12, i13, i14);
        m126118n(i14, 3, elapsedRealtime, i12, i11, byteBuffer.limit(), i13);
        return c24141a;
    }

    /* renamed from: m */
    private static int m126117m(int i11) {
        boolean z11 = true;
        if (i11 != 0 && i11 != 90 && i11 != 180) {
            if (i11 == 270) {
                i11 = 270;
            } else {
                z11 = false;
            }
        }
        AbstractC4205o.m19713b(z11, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i11;
    }

    /* renamed from: n */
    private static void m126118n(int i11, int i12, long j11, int i13, int i14, int i15, int i16) {
        AbstractC31406hc.m152248a(AbstractC31378fc.m152236b("vision-common"), i11, i12, j11, i13, i14, i15, i16);
    }

    /* renamed from: d */
    public Bitmap m126119d() {
        return this.f116674a;
    }

    /* renamed from: e */
    public ByteBuffer m126120e() {
        return this.f116675b;
    }

    /* renamed from: f */
    public Matrix m126121f() {
        return this.f116680g;
    }

    /* renamed from: g */
    public int m126122g() {
        return this.f116679f;
    }

    /* renamed from: h */
    public int m126123h() {
        return this.f116677d;
    }

    /* renamed from: i */
    public Image m126124i() {
        return null;
    }

    /* renamed from: j */
    public Image.Plane[] m126125j() {
        return null;
    }

    /* renamed from: k */
    public int m126126k() {
        return this.f116678e;
    }

    /* renamed from: l */
    public int m126127l() {
        return this.f116676c;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C24141a(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14) {
        boolean z11;
        if (i14 != 842094169) {
            if (i14 != 17) {
                z11 = false;
                AbstractC4205o.m19712a(z11);
                this.f116675b = (ByteBuffer) AbstractC4205o.m19722k(byteBuffer);
                AbstractC4205o.m19713b(byteBuffer.limit() > i11 * i12, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
                byteBuffer.rewind();
                this.f116676c = i11;
                this.f116677d = i12;
                m126117m(i13);
                this.f116678e = i13;
                this.f116679f = i14;
                this.f116680g = null;
            }
            i14 = 17;
        }
        z11 = true;
        AbstractC4205o.m19712a(z11);
        this.f116675b = (ByteBuffer) AbstractC4205o.m19722k(byteBuffer);
        AbstractC4205o.m19713b(byteBuffer.limit() > i11 * i12, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.f116676c = i11;
        this.f116677d = i12;
        m126117m(i13);
        this.f116678e = i13;
        this.f116679f = i14;
        this.f116680g = null;
    }
}
