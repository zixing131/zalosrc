package km0;

import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import pm0.AbstractC24856m;
import pm0.EnumC24858o;
import pm0.InterfaceC24854k;

/* renamed from: km0.e */
/* loaded from: classes7.dex */
public abstract class AbstractC21770e {

    /* renamed from: d */
    public static final a f105722d = new a(null);

    /* renamed from: e */
    private static final InterfaceC24854k f105723e;

    /* renamed from: a */
    private boolean f105724a;

    /* renamed from: b */
    private boolean f105725b;

    /* renamed from: c */
    private NetworkCapabilities f105726c;

    /* renamed from: km0.e$a */
    /* loaded from: classes7.dex */
    public static final class a {
        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final AbstractC21770e m112304a() {
            return (AbstractC21770e) AbstractC21770e.f105723e.getValue();
        }

        private a() {
        }
    }

    /* renamed from: km0.e$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f105727q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC21770e mo12V4() {
            if (Build.VERSION.SDK_INT >= 24) {
                Context appContext = CoreUtility.getAppContext();
                AbstractC19074t.m100207e(appContext, "getAppContext()");
                return new C21771f(appContext);
            }
            Context appContext2 = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext2, "getAppContext()");
            return new C21772g(appContext2);
        }
    }

    static {
        InterfaceC24854k m129211b;
        m129211b = AbstractC24856m.m129211b(EnumC24858o.f119258q, b.f105727q);
        f105723e = m129211b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m112300a(NetworkCapabilities networkCapabilities) {
        this.f105726c = networkCapabilities;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void mo112301b(boolean z11) {
        this.f105724a = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public void mo112302d(boolean z11) {
        this.f105725b = z11;
    }

    /* renamed from: e */
    public boolean mo112303e() {
        return this.f105724a;
    }
}
