package e80;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.utils.ToastUtils;
import e80.AbstractC18305j;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;

/* renamed from: e80.c */
/* loaded from: classes6.dex */
public final class C18298c extends AbstractC18305j {
    public static final a Companion = new a(null);

    /* renamed from: f */
    private final String f92571f;

    /* renamed from: g */
    private final b f92572g;

    /* renamed from: e80.c$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: e80.c$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        boolean mo69092a();

        /* renamed from: b */
        void mo69093b(boolean z11);

        /* renamed from: c */
        void mo69094c(List list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18298c(List list, String str, b bVar) {
        super(list);
        AbstractC19074t.m100208f(list, "items");
        AbstractC19074t.m100208f(str, "conversationId");
        this.f92571f = str;
        this.f92572g = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m97184n(C18298c c18298c) {
        AbstractC19074t.m100208f(c18298c, "this$0");
        b bVar = c18298c.f92572g;
        if (bVar != null) {
            bVar.mo69093b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m97185o(C18298c c18298c) {
        AbstractC19074t.m100208f(c18298c, "this$0");
        b bVar = c18298c.f92572g;
        if (bVar != null) {
            bVar.mo69094c(c18298c.m97207b());
        }
    }

    @Override // e80.AbstractC18305j
    /* renamed from: f */
    protected void mo97186f() {
        if (m97210e()) {
            return;
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: e80.a
            @Override // java.lang.Runnable
            public final void run() {
                C18298c.m97184n(C18298c.this);
            }
        });
        Iterator it = m97208c().iterator();
        while (it.hasNext()) {
            if (!((AbstractC18305j.a) it.next()).m97215b()) {
                b bVar = this.f92572g;
                if (bVar != null && bVar.mo69092a()) {
                    ToastUtils.m89266n(AbstractC8020f0.share_file_error_download, new Object[0]);
                    return;
                }
                return;
            }
        }
        AbstractC19444a.m101695c(new Runnable() { // from class: e80.b
            @Override // java.lang.Runnable
            public final void run() {
                C18298c.m97185o(C18298c.this);
            }
        });
    }

    @Override // e80.AbstractC18305j
    /* renamed from: g */
    protected void mo97187g(AbstractC18305j.a aVar) {
        AbstractC19074t.m100208f(aVar, "shareItem");
        try {
            try {
                aVar.m97214a();
                aVar.m97217d(true);
                aVar.m97216c(true);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } finally {
            aVar.m97216c(true);
            m97211h();
        }
    }
}
