package vn0;

import fn0.AbstractC19074t;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pm0.C24838b0;
import pm0.C24844e0;
import pm0.C24867x;
import pm0.C24869z;
import qm0.AbstractC25379x0;
import rn0.AbstractC25935a;
import un0.AbstractC27331i;

/* renamed from: vn0.u0 */
/* loaded from: classes7.dex */
public abstract class AbstractC28347u0 {

    /* renamed from: a */
    private static final Set f132109a;

    static {
        Set m131555i;
        m131555i = AbstractC25379x0.m131555i(AbstractC25935a.m133605F(C24869z.f119283q).getDescriptor(), AbstractC25935a.m133606G(C24838b0.f119230q).getDescriptor(), AbstractC25935a.m133604E(C24867x.f119278q).getDescriptor(), AbstractC25935a.m133607H(C24844e0.f119240q).getDescriptor());
        f132109a = m131555i;
    }

    /* renamed from: a */
    public static final boolean m142786a(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        if (serialDescriptor.mo113955k() && AbstractC19074t.m100204b(serialDescriptor, AbstractC27331i.m139918o())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m142787b(SerialDescriptor serialDescriptor) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        if (serialDescriptor.mo113955k() && f132109a.contains(serialDescriptor)) {
            return true;
        }
        return false;
    }
}
