package p024ay;

import com.zing.zalo.p077ui.zviews.CommonZaloview;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: ay.y */
/* loaded from: classes4.dex */
public final class C2460y {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final CommonZaloview f10063a;

    /* renamed from: b */
    private final Set f10064b;

    /* renamed from: ay.y$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C2460y(CommonZaloview commonZaloview) {
        AbstractC19074t.m100208f(commonZaloview, "commonZaloview");
        this.f10063a = commonZaloview;
        this.f10064b = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m12481d(C2460y c2460y, String str) {
        AbstractC19074t.m100208f(c2460y, "this$0");
        AbstractC19074t.m100208f(str, "$reason");
        if (c2460y.f10064b.contains(str)) {
            c2460y.f10063a.mo46829Y();
        }
    }

    /* renamed from: b */
    public final void m12482b(String str) {
        AbstractC19074t.m100208f(str, "reason");
        this.f10064b.remove(str);
        if (this.f10064b.isEmpty()) {
            this.f10063a.mo49315c4();
        }
    }

    /* renamed from: c */
    public final void m12483c(final String str) {
        AbstractC19074t.m100208f(str, "reason");
        this.f10064b.add(str);
        AbstractC19444a.m101694b(new Runnable() { // from class: ay.x
            @Override // java.lang.Runnable
            public final void run() {
                C2460y.m12481d(C2460y.this, str);
            }
        }, 500L);
    }
}
