package na;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsm;
import ma.InterfaceC22964a;

/* renamed from: na.b */
/* loaded from: classes3.dex */
public final class C23638b implements InterfaceC22964a {

    /* renamed from: a */
    private final zzsm f114524a;

    public C23638b(zzsm zzsmVar) {
        this.f114524a = zzsmVar;
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: a */
    public final Rect mo117714a() {
        Point[] m30125K = this.f114524a.m30125K();
        if (m30125K != null) {
            int i11 = Integer.MIN_VALUE;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            for (Point point : m30125K) {
                i13 = Math.min(i13, point.x);
                i11 = Math.max(i11, point.x);
                i14 = Math.min(i14, point.y);
                i12 = Math.max(i12, point.y);
            }
            return new Rect(i13, i14, i11, i12);
        }
        return null;
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: b */
    public final String mo117715b() {
        return this.f114524a.m30123F();
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: c */
    public final int mo117716c() {
        return this.f114524a.m30126t();
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: d */
    public final byte[] mo117717d() {
        return this.f114524a.m30124J();
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: e */
    public final Point[] mo117718e() {
        return this.f114524a.m30125K();
    }

    @Override // ma.InterfaceC22964a
    public final int getFormat() {
        return this.f114524a.zza();
    }
}
