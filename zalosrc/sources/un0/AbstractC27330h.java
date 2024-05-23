package un0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import kotlinx.serialization.json.JsonElement;

/* renamed from: un0.h */
/* loaded from: classes7.dex */
public abstract class AbstractC27330h {
    /* renamed from: a */
    public static final boolean m139899a(C27324b c27324b, Number number) {
        AbstractC19074t.m100208f(c27324b, "<this>");
        return c27324b.m139872a(AbstractC27331i.m139905b(number));
    }

    /* renamed from: b */
    public static final boolean m139900b(C27324b c27324b, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c27324b, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "builderAction");
        C27342t c27342t = new C27342t();
        interfaceC18505l.mo205i9(c27342t);
        return c27324b.m139872a(c27342t.m139948a());
    }

    /* renamed from: c */
    public static final JsonElement m139901c(C27342t c27342t, String str, Number number) {
        AbstractC19074t.m100208f(c27342t, "<this>");
        AbstractC19074t.m100208f(str, "key");
        return c27342t.m139949b(str, AbstractC27331i.m139905b(number));
    }

    /* renamed from: d */
    public static final JsonElement m139902d(C27342t c27342t, String str, String str2) {
        AbstractC19074t.m100208f(c27342t, "<this>");
        AbstractC19074t.m100208f(str, "key");
        return c27342t.m139949b(str, AbstractC27331i.m139906c(str2));
    }

    /* renamed from: e */
    public static final JsonElement m139903e(C27342t c27342t, String str, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(c27342t, "<this>");
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(interfaceC18505l, "builderAction");
        C27324b c27324b = new C27324b();
        interfaceC18505l.mo205i9(c27324b);
        return c27342t.m139949b(str, c27324b.m139873b());
    }
}
