package bj0;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.Map;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import kotlin.coroutines.Continuation;
import lj0.C22501b;
import org.json.JSONObject;
import pm0.AbstractC24866w;
import pm0.C24861r;
import qm0.AbstractC25363p0;
import um0.C27317h;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;

/* renamed from: bj0.c */
/* loaded from: classes7.dex */
public final class C2824c {

    /* renamed from: a */
    private final InterfaceC21766a f11304a;

    /* renamed from: b */
    private final C22501b f11305b;

    /* renamed from: bj0.c$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC21769d {

        /* renamed from: b */
        final /* synthetic */ Continuation f11307b;

        a(Continuation continuation) {
            this.f11307b = continuation;
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: a */
        public void mo13651a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            C2824c.this.f11305b.m116346x(true, "onRequestError: " + i11 + ", " + str, new Object[0]);
            this.f11307b.mo112492g(C24861r.m129218b(Integer.valueOf(i11)));
        }

        @Override // km0.InterfaceC21769d
        /* renamed from: b */
        public void mo13652b(EnumC21773h enumC21773h, Object obj) {
            AbstractC19074t.m100208f(enumC21773h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            AbstractC19074t.m100208f(obj, "result");
            JSONObject jSONObject = (JSONObject) obj;
            C2824c.this.f11305b.m116346x(true, "onRequestSuccess: " + jSONObject, new Object[0]);
            this.f11307b.mo112492g(C24861r.m129218b(Integer.valueOf(jSONObject.optInt("errorCode", -1))));
        }
    }

    public C2824c(InterfaceC21766a interfaceC21766a, C22501b c22501b) {
        AbstractC19074t.m100208f(interfaceC21766a, "networkProvider");
        AbstractC19074t.m100208f(c22501b, "iapLogger");
        this.f11304a = interfaceC21766a;
        this.f11305b = c22501b;
    }

    /* renamed from: b */
    public final Object m13650b(String str, String str2, String str3, String str4, Continuation continuation) {
        Continuation m142576c;
        Map m131407l;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        a aVar = new a(c27317h);
        m131407l = AbstractC25363p0.m131407l(AbstractC24866w.m129235a("tranx_id", str), AbstractC24866w.m129235a("receipt", str2), AbstractC24866w.m129235a("receipt_sig", str3));
        this.f11305b.m116346x(true, "verifyGoogleReceipt with \ntranxID: " + str + "\noriginalJson: " + str2 + "\nsignature: " + str3 + "\nurl: " + str4, new Object[0]);
        this.f11304a.mo1365a(str4, 79900, true, m131407l, aVar);
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }
}
