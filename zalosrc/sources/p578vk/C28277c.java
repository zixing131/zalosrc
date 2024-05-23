package p578vk;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import p578vk.AbstractC28275a;

/* renamed from: vk.c */
/* loaded from: classes3.dex */
public final class C28277c {

    /* renamed from: a */
    private final List f131943a;

    /* renamed from: b */
    private final List f131944b;

    /* renamed from: c */
    private final List f131945c;

    /* renamed from: d */
    private final AbstractC28275a.a0 f131946d;

    public C28277c(List list, List list2, List list3, AbstractC28275a.a0 a0Var) {
        AbstractC19074t.m100208f(list, "historyClickList");
        AbstractC19074t.m100208f(list2, "historyQueryList");
        AbstractC19074t.m100208f(list3, "quickAccessList");
        this.f131943a = list;
        this.f131944b = list2;
        this.f131945c = list3;
        this.f131946d = a0Var;
    }

    /* renamed from: a */
    public final List m142509a() {
        return this.f131943a;
    }

    /* renamed from: b */
    public final List m142510b() {
        return this.f131944b;
    }

    /* renamed from: c */
    public final List m142511c() {
        return this.f131945c;
    }

    /* renamed from: d */
    public final AbstractC28275a.a0 m142512d() {
        return this.f131946d;
    }

    public /* synthetic */ C28277c(List list, List list2, List list3, AbstractC28275a.a0 a0Var, int i11, AbstractC19060k abstractC19060k) {
        this(list, list2, list3, (i11 & 8) != 0 ? null : a0Var);
    }
}
