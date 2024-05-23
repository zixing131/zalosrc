package p596w3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p631x3.InterpolatorC29303d;

/* renamed from: w3.a */
/* loaded from: classes2.dex */
public abstract class AbstractC28703a {
    /* renamed from: a */
    public static List m143754a(float[][][] fArr) {
        if (fArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (float[][] fArr2 : fArr) {
            float[] fArr3 = fArr2[0];
            float f11 = fArr3[0];
            float f12 = fArr3[1];
            float[] fArr4 = fArr2[1];
            arrayList.add(new InterpolatorC29303d(f11, f12, fArr4[0], fArr4[1]));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
