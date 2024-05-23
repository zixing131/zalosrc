package p591vz;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Map;
import km0.AbstractC21767b;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24866w;
import pm0.C24861r;
import qm0.AbstractC25363p0;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: vz.c */
/* loaded from: classes4.dex */
public final class C28679c {

    /* renamed from: vz.c$a */
    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: a */
        private final int f133125a;

        /* renamed from: vz.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C33018a extends a {
            public C33018a(int i11) {
                super(i11, null);
            }
        }

        /* renamed from: vz.c$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: b */
            public static final b f133126b = new b();

            private b() {
                super(0, null);
            }
        }

        public /* synthetic */ a(int i11, AbstractC19060k abstractC19060k) {
            this(i11);
        }

        private a(int i11) {
            this.f133125a = i11;
        }
    }

    /* renamed from: vz.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC21769d {

        /* renamed from: a */
        final /* synthetic */ Continuation f133127a;

        b(Continuation continuation) {
            this.f133127a = continuation;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            AbstractC20110a.f98889a.mo104554k("onRequestError: " + str + " (" + i11 + ")", new Object[0]);
            Continuation continuation = this.f133127a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(new a.C33018a(i11)));
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            AbstractC20110a.f98889a.mo104554k("ResultDataType: %s, data = %s", enumC21773h.name(), obj);
            Continuation continuation = this.f133127a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(a.b.f133126b));
        }
    }

    /* renamed from: a */
    public final Object m143638a(String str, float f11, Continuation continuation) {
        Continuation m142576c;
        Map m131407l;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        File file = new File(str);
        b bVar = new b(c27317h);
        InterfaceC21766a m112296a = AbstractC21767b.f105718a.m112296a();
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("session_key", CoreUtility.f89232h), AbstractC24866w.m129235a("client_type", "1"), AbstractC24866w.m129235a("client_version", String.valueOf(CoreUtility.f89236l)), AbstractC24866w.m129235a("model_score", String.valueOf(f11)));
        m112296a.mo1368d("https://qos-talk.123c.vn/api/qr/upload", -1, false, m131407l, null, file, bVar);
        AbstractC20110a.f98889a.mo104554k("Uploading bad qr to server", new Object[0]);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
