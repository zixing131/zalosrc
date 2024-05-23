package nk0;

import android.graphics.Canvas;
import com.zing.zalo.zinstant.utils.C17204p;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMSkeleton;
import java.util.ArrayList;
import java.util.Iterator;
import qk0.AbstractC25310f;

/* renamed from: nk0.u0 */
/* loaded from: classes7.dex */
public class C23859u0 extends AbstractC23825g0 {

    /* renamed from: H */
    public ArrayList f115208H;

    public C23859u0(C23855s0 c23855s0, ZOMSkeleton zOMSkeleton) {
        super(c23855s0, zOMSkeleton);
        this.f115208H = new ArrayList();
        m124671h2();
    }

    /* renamed from: h2 */
    private void m124671h2() {
        ZOM[] zomArr = ((ZOMSkeleton) m131007J()).mChildren;
        if (zomArr != null) {
            for (ZOM zom : zomArr) {
                AbstractC25310f m91834a = C17204p.m91834a(m131000E(), zom);
                if (m91834a instanceof AbstractC23825g0) {
                    this.f115208H.add((AbstractC23825g0) m91834a);
                }
            }
        }
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: j0 */
    public void mo124435j0(Canvas canvas) {
        Iterator it = this.f115208H.iterator();
        while (it.hasNext()) {
            ((AbstractC23825g0) it.next()).m131020o(canvas);
        }
    }
}
