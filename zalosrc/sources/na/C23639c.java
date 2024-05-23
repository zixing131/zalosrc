package na;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzq;
import ma.InterfaceC22964a;

/* renamed from: na.c */
/* loaded from: classes3.dex */
public final class C23639c implements InterfaceC22964a {

    /* renamed from: a */
    private final zzq f114525a;

    public C23639c(zzq zzqVar) {
        this.f114525a = zzqVar;
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: a */
    public final Rect mo117714a() {
        zzq zzqVar = this.f114525a;
        if (zzqVar.f33058t != null) {
            int i11 = 0;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            while (true) {
                Point[] pointArr = zzqVar.f33058t;
                if (i11 < pointArr.length) {
                    Point point = pointArr[i11];
                    i14 = Math.min(i14, point.x);
                    i12 = Math.max(i12, point.x);
                    i15 = Math.min(i15, point.y);
                    i13 = Math.max(i13, point.y);
                    i11++;
                } else {
                    return new Rect(i14, i15, i12, i13);
                }
            }
        } else {
            return null;
        }
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: b */
    public final String mo117715b() {
        return this.f114525a.f33055q;
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: c */
    public final int mo117716c() {
        return this.f114525a.f33057s;
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: d */
    public final byte[] mo117717d() {
        return this.f114525a.f33051D;
    }

    @Override // ma.InterfaceC22964a
    /* renamed from: e */
    public final Point[] mo117718e() {
        return this.f114525a.f33058t;
    }

    @Override // ma.InterfaceC22964a
    public final int getFormat() {
        return this.f114525a.f33054p;
    }
}
