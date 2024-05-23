package on0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: on0.n */
/* loaded from: classes.dex */
public abstract class AbstractC24333n {
    /* renamed from: a */
    public static void m127093a(Appendable appendable, Object obj, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(appendable, "<this>");
        if (interfaceC18505l != null) {
            appendable.append((CharSequence) interfaceC18505l.mo205i9(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
