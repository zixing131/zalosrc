package la;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.Arrays;
import ma.InterfaceC22964a;
import pa.AbstractC24702b;

/* renamed from: la.a */
/* loaded from: classes3.dex */
public class C22166a {

    /* renamed from: a */
    private final InterfaceC22964a f109277a;

    /* renamed from: b */
    private final Rect f109278b;

    /* renamed from: c */
    private final Point[] f109279c;

    public C22166a(InterfaceC22964a interfaceC22964a, Matrix matrix) {
        this.f109277a = (InterfaceC22964a) AbstractC4205o.m19722k(interfaceC22964a);
        Rect mo117714a = interfaceC22964a.mo117714a();
        if (mo117714a != null && matrix != null) {
            AbstractC24702b.m128274c(mo117714a, matrix);
        }
        this.f109278b = mo117714a;
        Point[] mo117718e = interfaceC22964a.mo117718e();
        if (mo117718e != null && matrix != null) {
            AbstractC24702b.m128273b(mo117718e, matrix);
        }
        this.f109279c = mo117718e;
    }

    /* renamed from: a */
    public Rect m115779a() {
        return this.f109278b;
    }

    /* renamed from: b */
    public Point[] m115780b() {
        return this.f109279c;
    }

    /* renamed from: c */
    public int m115781c() {
        int format = this.f109277a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    /* renamed from: d */
    public byte[] m115782d() {
        byte[] mo117717d = this.f109277a.mo117717d();
        if (mo117717d != null) {
            return Arrays.copyOf(mo117717d, mo117717d.length);
        }
        return null;
    }

    /* renamed from: e */
    public String m115783e() {
        return this.f109277a.mo117715b();
    }

    /* renamed from: f */
    public int m115784f() {
        return this.f109277a.mo117716c();
    }
}
