package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.mlkit.vision.text.internal.d */
/* loaded from: classes3.dex */
abstract class AbstractC6770d {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Rect m34599a(List list) {
        Iterator it = list.iterator();
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            i13 = Math.min(i13, point.x);
            i11 = Math.max(i11, point.x);
            i14 = Math.min(i14, point.y);
            i12 = Math.max(i12, point.y);
        }
        return new Rect(i13, i14, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static List m34600b(zzf zzfVar) {
        double sin = Math.sin(Math.toRadians(zzfVar.f33156t));
        double cos = Math.cos(Math.toRadians(zzfVar.f33156t));
        double d11 = zzfVar.f33152p;
        double d12 = zzfVar.f33154r;
        Point point = new Point((int) (d11 + (d12 * cos)), (int) (zzfVar.f33153q + (d12 * sin)));
        double d13 = point.x;
        int i11 = zzfVar.f33155s;
        double d14 = i11 * sin;
        double d15 = r0[1].y + (i11 * cos);
        Point point2 = r0[0];
        int i12 = point2.x;
        Point point3 = r0[2];
        int i13 = point3.x;
        Point point4 = r0[1];
        Point[] pointArr = {new Point(zzfVar.f33152p, zzfVar.f33153q), point, new Point((int) (d13 - d14), (int) d15), new Point(i12 + (i13 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
