package k20;

import android.os.Bundle;
import android.util.SparseArray;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.UUID;
import p227i3.C20218v;
import pm0.C24848g0;
import s20.AbstractC26102d;
import v00.AbstractC27409d;

/* renamed from: k20.b */
/* loaded from: classes5.dex */
public final class C21456b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final c f104464a;

    /* renamed from: b */
    private final String f104465b;

    /* renamed from: c */
    private boolean f104466c;

    /* renamed from: d */
    private final b f104467d;

    /* renamed from: k20.b$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m111020a(Bundle bundle, String str) {
            AbstractC19074t.m100208f(str, "id");
            if (bundle == null) {
                return m111020a(new Bundle(), str);
            }
            AbstractC26102d.m134326a(bundle, "xViewStateId", str);
            return bundle;
        }

        /* renamed from: b */
        public final ZaloView m111021b(ZaloView zaloView, String str) {
            AbstractC19074t.m100208f(zaloView, "zv");
            AbstractC19074t.m100208f(str, "id");
            Bundle m92642L3 = zaloView.m92642L3();
            if (m92642L3 == null) {
                m92642L3 = new Bundle();
            }
            m111020a(m92642L3, str);
            zaloView.mo60305zK(m92642L3);
            return zaloView;
        }
    }

    /* renamed from: k20.b$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final SparseArray f104468a = new SparseArray();

        /* renamed from: a */
        public final Object m111022a(int i11) {
            return this.f104468a.get(i11, null);
        }

        /* renamed from: b */
        public final void m111023b(int i11, Object obj) {
            AbstractC19074t.m100208f(obj, C20218v.f100059b);
            this.f104468a.put(i11, obj);
        }
    }

    /* renamed from: k20.b$c */
    /* loaded from: classes5.dex */
    public interface c {

        /* renamed from: k20.b$c$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static void m111024a(c cVar, b bVar) {
                AbstractC19074t.m100208f(bVar, "extras");
            }

            /* renamed from: b */
            public static void m111025b(c cVar, b bVar) {
                AbstractC19074t.m100208f(bVar, "extras");
            }
        }

        /* renamed from: Mr */
        void mo53933Mr(InterfaceC18509p interfaceC18509p);

        /* renamed from: oH */
        void mo53935oH(b bVar);

        /* renamed from: pt */
        void mo53936pt(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k20.b$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ C17487o0 f104469q;

        /* renamed from: r */
        final /* synthetic */ C21456b f104470r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C17487o0 c17487o0, C21456b c21456b) {
            super(2);
            this.f104469q = c17487o0;
            this.f104470r = c21456b;
        }

        /* renamed from: a */
        public final void m111026a(Class cls, Bundle bundle) {
            AbstractC19074t.m100208f(cls, "klass");
            C17487o0 c17487o0 = this.f104469q;
            if (c17487o0 != null) {
                c17487o0.m93062f2(AbstractC27409d.masterFrame, cls, C21456b.Companion.m111020a(bundle, this.f104470r.m111016b()), 0, true);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m111026a((Class) obj, (Bundle) obj2);
            return C24848g0.f119245a;
        }
    }

    public C21456b(c cVar, String str) {
        AbstractC19074t.m100208f(cVar, "state");
        AbstractC19074t.m100208f(str, "id");
        this.f104467d = new b();
        this.f104464a = cVar;
        this.f104465b = str;
    }

    /* renamed from: a */
    public final b m111015a() {
        return this.f104467d;
    }

    /* renamed from: b */
    public final String m111016b() {
        return this.f104465b;
    }

    /* renamed from: c */
    public final void m111017c(b bVar) {
        AbstractC19074t.m100208f(bVar, "data");
        this.f104464a.mo53936pt(bVar);
        this.f104466c = true;
    }

    /* renamed from: d */
    public final void m111018d() {
        this.f104464a.mo53935oH(this.f104467d);
    }

    /* renamed from: e */
    public final void m111019e(C17487o0 c17487o0) {
        this.f104464a.mo53933Mr(new d(c17487o0, this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C21456b(c cVar) {
        this(cVar, r0);
        AbstractC19074t.m100208f(cVar, "state");
        String uuid = UUID.randomUUID().toString();
        AbstractC19074t.m100207e(uuid, "toString(...)");
    }
}
