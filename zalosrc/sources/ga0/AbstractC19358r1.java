package ga0;

import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ga0.r1 */
/* loaded from: classes6.dex */
public abstract class AbstractC19358r1 extends AbstractRunnableC19355q1 {
    public static final a Companion = new a(null);

    /* renamed from: s */
    private final String f96162s;

    /* renamed from: ga0.r1$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC19358r1(InterfaceC18319c interfaceC18319c, String str) {
        super(interfaceC18319c);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        this.f96162s = str;
    }

    @Override // ga0.AbstractRunnableC19355q1, en0.InterfaceC18505l
    /* renamed from: f */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        String m97246b = c18316b.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "ACTION_SEARCH_TASK_RESULT_SET_DATA") || AbstractC19074t.m100204b(m97246b, "ACTION_SEARCH_TASK_RESULT_ADD_DATA")) {
            new C19342m0(this, c18316b, this.f96162s).m101441i();
            return null;
        }
        return super.mo205i9(c18316b);
    }

    @Override // ga0.AbstractRunnableC19355q1, ga0.InterfaceC19305a
    public boolean isCancelled() {
        return super.isCancelled();
    }

    /* renamed from: l */
    public final String m101455l() {
        return this.f96162s;
    }
}
