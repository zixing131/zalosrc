package qn0;

import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import tn0.AbstractC26776b;
import tn0.AbstractC26779c;

/* renamed from: qn0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC25389d {
    /* renamed from: a */
    public static final InterfaceC25386a m131577a(AbstractC26776b abstractC26776b, InterfaceC21885c interfaceC21885c, String str) {
        AbstractC19074t.m100208f(abstractC26776b, "<this>");
        AbstractC19074t.m100208f(interfaceC21885c, "decoder");
        InterfaceC25386a mo131581c = abstractC26776b.mo131581c(interfaceC21885c, str);
        if (mo131581c != null) {
            return mo131581c;
        }
        AbstractC26779c.m137807a(str, abstractC26776b.mo131574e());
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final InterfaceC25393h m131578b(AbstractC26776b abstractC26776b, Encoder encoder, Object obj) {
        AbstractC19074t.m100208f(abstractC26776b, "<this>");
        AbstractC19074t.m100208f(encoder, "encoder");
        AbstractC19074t.m100208f(obj, "value");
        InterfaceC25393h mo131582d = abstractC26776b.mo131582d(encoder, obj);
        if (mo131582d != null) {
            return mo131582d;
        }
        AbstractC26779c.m137808b(AbstractC19061k0.m100169b(obj.getClass()), abstractC26776b.mo131574e());
        throw new KotlinNothingValueException();
    }
}
