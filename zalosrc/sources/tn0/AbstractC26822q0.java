package tn0;

import fn0.AbstractC19074t;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: tn0.q0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26822q0 extends AbstractC26817o1 {
    /* renamed from: Z */
    protected abstract String mo137936Z(String str, String str2);

    /* renamed from: a0 */
    protected String mo137937a0(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "descriptor");
        return serialDescriptor.mo113950f(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tn0.AbstractC26817o1
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String mo137906V(SerialDescriptor serialDescriptor, int i11) {
        AbstractC19074t.m100208f(serialDescriptor, "<this>");
        return m137939c0(mo137937a0(serialDescriptor, i11));
    }

    /* renamed from: c0 */
    protected final String m137939c0(String str) {
        AbstractC19074t.m100208f(str, "nestedName");
        String str2 = (String) m137905U();
        if (str2 == null) {
            str2 = "";
        }
        return mo137936Z(str2, str);
    }
}
