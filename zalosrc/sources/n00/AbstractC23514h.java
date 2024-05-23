package n00;

import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ga0.AbstractRunnableC19355q1;

/* renamed from: n00.h */
/* loaded from: classes4.dex */
public abstract class AbstractC23514h extends AbstractRunnableC19355q1 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final String f114187s;

    /* renamed from: n00.h$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC23514h(InterfaceC18319c interfaceC18319c, String str) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        this.f114187s = str;
    }

    @Override // ga0.AbstractRunnableC19355q1, en0.InterfaceC18505l
    /* renamed from: f */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        if (AbstractC19074t.m100204b(c18316b.m97246b(), "ACTION_SEARCH_DISCOVERY_TASK_RESULT_SET_DATA")) {
            new C23507a(this, this.f114187s, c18316b).m101441i();
            return null;
        }
        return super.mo205i9(c18316b);
    }

    @Override // ga0.AbstractRunnableC19355q1, ga0.InterfaceC19305a
    public boolean isCancelled() {
        return super.isCancelled();
    }

    /* renamed from: l */
    public final String m123420l() {
        return this.f114187s;
    }
}
