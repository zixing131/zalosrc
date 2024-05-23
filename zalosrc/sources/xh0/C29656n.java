package xh0;

import android.hardware.Camera;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* renamed from: xh0.n */
/* loaded from: classes7.dex */
public final class C29656n {

    /* renamed from: a */
    public static final C29656n f136924a = new C29656n();

    private C29656n() {
    }

    /* renamed from: a */
    public static final C29645f0 m147428a(List list, int i11, int i12) {
        int m131511r;
        List m131187O0;
        String m131214n0;
        AbstractC19074t.m100208f(list, "supportedSize");
        List<Camera.Size> list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        for (Camera.Size size : list2) {
            arrayList.add(new C29645f0(size.width, size.height));
        }
        m131187O0 = AbstractC25332a0.m131187O0(arrayList);
        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
        aVar.mo104556o(8, "Supported preview size:", new Object[0]);
        m131214n0 = AbstractC25332a0.m131214n0(m131187O0, "\n", null, null, 0, null, null, 62, null);
        aVar.mo104556o(8, m131214n0, new Object[0]);
        return C29651i0.m147400b(m131187O0, i11, i12);
    }
}
