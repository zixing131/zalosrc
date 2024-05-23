package androidx.work;

import fn0.AbstractC19074t;

/* renamed from: androidx.work.p */
/* loaded from: classes2.dex */
public abstract class AbstractC2248p {

    /* renamed from: a */
    private static final String f9459a;

    static {
        String m11897i = AbstractC2253u.m11897i("InputMerger");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"InputMerger\")");
        f9459a = m11897i;
    }

    /* renamed from: a */
    public static final AbstractC2246n m11884a(String str) {
        AbstractC19074t.m100208f(str, "className");
        try {
            Object newInstance = Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            AbstractC19074t.m100206d(newInstance, "null cannot be cast to non-null type androidx.work.InputMerger");
            return (AbstractC2246n) newInstance;
        } catch (Exception e11) {
            AbstractC2253u.m11895e().mo11901d(f9459a, "Trouble instantiating " + str, e11);
            return null;
        }
    }
}
