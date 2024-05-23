package pa;

import android.graphics.Bitmap;
import android.media.Image;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4184h;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.mlkit.common.MlKitException;
import java.nio.ByteBuffer;
import p385oa.C24141a;

/* renamed from: pa.e */
/* loaded from: classes3.dex */
public class C24705e {

    /* renamed from: a */
    private static final C4184h f118670a = new C4184h("MLKitImageUtils", "");

    /* renamed from: b */
    private static final C24705e f118671b = new C24705e();

    private C24705e() {
    }

    /* renamed from: b */
    public static C24705e m128288b() {
        return f118671b;
    }

    /* renamed from: a */
    public InterfaceC4271b m128289a(C24141a c24141a) {
        int m126122g = c24141a.m126122g();
        if (m126122g != -1) {
            if (m126122g != 17) {
                if (m126122g != 35) {
                    if (m126122g != 842094169) {
                        throw new MlKitException("Unsupported image format: " + c24141a.m126122g(), 3);
                    }
                } else {
                    return BinderC4273d.m19913I3(c24141a.m126124i());
                }
            }
            return BinderC4273d.m19913I3((ByteBuffer) AbstractC4205o.m19722k(c24141a.m126120e()));
        }
        return BinderC4273d.m19913I3((Bitmap) AbstractC4205o.m19722k(c24141a.m126119d()));
    }

    /* renamed from: c */
    public int m128290c(C24141a c24141a) {
        return c24141a.m126122g();
    }

    /* renamed from: d */
    public int m128291d(C24141a c24141a) {
        if (c24141a.m126122g() == -1) {
            return ((Bitmap) AbstractC4205o.m19722k(c24141a.m126119d())).getAllocationByteCount();
        }
        if (c24141a.m126122g() != 17 && c24141a.m126122g() != 842094169) {
            if (c24141a.m126122g() != 35) {
                return 0;
            }
            return (((Image.Plane[]) AbstractC4205o.m19722k(c24141a.m126125j()))[0].getBuffer().limit() * 3) / 2;
        }
        return ((ByteBuffer) AbstractC4205o.m19722k(c24141a.m126120e())).limit();
    }
}
