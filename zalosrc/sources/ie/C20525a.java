package ie;

import ae.C0766k;
import am.AbstractC0924m0;
import bp0.AbstractC3082b0;
import com.zing.zalo.calls.ringbacktone.domain.exception.ExceptionRingBackTone;
import com.zing.zalo.calls.ringbacktone.domain.exception.ExceptionRingBackToneNoNetwork;
import com.zing.zalo.calls.ringbacktone.domain.exception.ExceptionRingBackToneNotVipUser;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionRingtoneNotFound;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import je.C21228a;
import je.C21229b;
import ke.InterfaceC21698a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.AbstractC23041d2;
import me0.C23055e5;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25366r;
import um0.C27317h;
import vi0.C28264b;
import vi0.EnumC28265c;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* renamed from: ie.a */
/* loaded from: classes3.dex */
public final class C20525a implements InterfaceC21698a {
    public static final a Companion = new a(null);

    /* renamed from: ie.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: ie.a$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ Continuation f100809a;

        /* renamed from: b */
        final /* synthetic */ File f100810b;

        b(Continuation continuation, File file) {
            this.f100809a = continuation;
            this.f100810b = file;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            Continuation continuation = this.f100809a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(0));
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            AbstractC23041d2.m118207f(this.f100810b);
            this.f100809a.mo112492g(C24861r.m129218b(Integer.valueOf(i11)));
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
        }
    }

    /* renamed from: ie.a$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f100811a;

        c(Continuation continuation) {
            this.f100811a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC3082b0.m15424f("RBTRepoImpl", "getAllRingBackTones error " + c20096c);
            Continuation continuation = this.f100811a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionRingBackTone())));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    JSONArray optJSONArray = optJSONObject.optJSONArray("items");
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                AbstractC19074t.m100205c(optJSONObject2);
                                arrayList.add(new C21228a(optJSONObject2));
                            }
                        }
                    }
                    int optInt = optJSONObject.optInt("status");
                    long optLong = optJSONObject.optLong("expiredDate");
                    Continuation continuation = this.f100811a;
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(new C21229b(optInt, 1000 * optLong, new ArrayList(arrayList), 0, 8, null)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Continuation continuation2 = this.f100811a;
            C24861r.a aVar2 = C24861r.f119264q;
            continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionRingBackTone())));
        }
    }

    /* renamed from: ie.a$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f100812a;

        d(Continuation continuation) {
            this.f100812a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC3082b0.m15424f("RBTRepoImpl", "getRingBackTone error " + c20096c);
            Continuation continuation = this.f100812a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new Exception())));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && jSONObject.optInt("error_code") != 1001) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    Continuation continuation = this.f100812a;
                    C24861r.a aVar = C24861r.f119264q;
                    AbstractC19074t.m100205c(optJSONObject);
                    continuation.mo112492g(C24861r.m129218b(new C21228a(optJSONObject)));
                } else {
                    Continuation continuation2 = this.f100812a;
                    C24861r.a aVar2 = C24861r.f119264q;
                    continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingtoneNotFound.f56347p)));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                Continuation continuation3 = this.f100812a;
                C24861r.a aVar3 = C24861r.f119264q;
                continuation3.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new Exception())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ie.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f100813s;

        /* renamed from: t */
        /* synthetic */ Object f100814t;

        /* renamed from: v */
        int f100816v;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f100814t = obj;
            this.f100816v |= Integer.MIN_VALUE;
            return C20525a.this.mo106624e(null, this);
        }
    }

    /* renamed from: ie.a$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f100817a;

        f(Continuation continuation) {
            this.f100817a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC3082b0.m15424f("RBTRepoImpl", "getSelectedRingBackToneId error " + c20096c);
            Continuation continuation = this.f100817a;
            C24861r.a aVar = C24861r.f119264q;
            continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new Exception())));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                if ((obj instanceof JSONObject) && (optJSONObject = ((JSONObject) obj).optJSONObject("data")) != null) {
                    Continuation continuation = this.f100817a;
                    ContactProfile.C7868d c7868d = new ContactProfile.C7868d(optJSONObject);
                    C24861r.a aVar = C24861r.f119264q;
                    continuation.mo112492g(C24861r.m129218b(String.valueOf(c7868d.f42490x)));
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            Continuation continuation2 = this.f100817a;
            C24861r.a aVar2 = C24861r.f119264q;
            continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new Exception())));
        }
    }

    /* renamed from: ie.a$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ Continuation f100818a;

        g(Continuation continuation) {
            this.f100818a = continuation;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            Integer num;
            AbstractC3082b0.m15424f("RBTRepoImpl", "pushSelectedRingBackTone error " + c20096c);
            if (c20096c != null) {
                num = Integer.valueOf(c20096c.m104491c());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 2035) {
                Continuation continuation = this.f100818a;
                C24861r.a aVar = C24861r.f119264q;
                continuation.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingBackToneNotVipUser.f40394p)));
            } else {
                Continuation continuation2 = this.f100818a;
                C24861r.a aVar2 = C24861r.f119264q;
                continuation2.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(new ExceptionRingBackTone())));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Object m129227a;
            JSONArray optJSONArray;
            boolean z11 = false;
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("listUpdated") && (optJSONArray = jSONObject.optJSONArray("listUpdated")) != null && optJSONArray.length() > 0) {
                    z11 = true;
                }
            }
            Continuation continuation = this.f100818a;
            C24861r.a aVar = C24861r.f119264q;
            if (z11) {
                m129227a = C24848g0.f119245a;
            } else {
                m129227a = AbstractC24862s.m129227a(new ExceptionRingBackTone());
            }
            continuation.mo112492g(C24861r.m129218b(m129227a));
        }
    }

    /* renamed from: ie.a$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f100819t;

        /* renamed from: u */
        final /* synthetic */ C21228a f100820u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(C21228a c21228a, Continuation continuation) {
            super(2, continuation);
            this.f100820u = c21228a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f100820u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f100819t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC0924m0.m4297vn(this.f100820u.m110003c().toString());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: i */
    private final boolean m106615i(File file) {
        if (C19172a.m100600k("rbt@cache", 1) == 1 && file.exists() && file.isFile() && file.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final Object m106616j(C21228a c21228a, File file, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        C20627a c20627a = new C20627a(false);
        c20627a.m107420h0(file.getPath());
        c20627a.m107419g0(new b(c27317h, file));
        c20627a.m107488m(c21228a.m110005e());
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* renamed from: k */
    private final String m106617k(C21228a c21228a) {
        return AbstractC23352g.m122788d(c21228a.m110002b() + m106619m(c21228a.m110005e())) + ".m4a";
    }

    /* renamed from: l */
    private final String m106618l(C21228a c21228a) {
        String path = new File(C28264b.Companion.m142373a().m142367c(EnumC28265c.f131804t), m106617k(c21228a)).getPath();
        AbstractC19074t.m100207e(path, "getPath(...)");
        return path;
    }

    /* renamed from: m */
    private final String m106619m(String str) {
        try {
            URI uri = new URI(str);
            String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
            AbstractC19074t.m100207e(uri2, "toString(...)");
            return uri2;
        } catch (Exception unused) {
            return str;
        }
    }

    @Override // ke.InterfaceC21698a
    /* renamed from: a */
    public C21228a mo106620a() {
        boolean m127128x;
        try {
            String m4011m5 = AbstractC0924m0.m4011m5();
            AbstractC19074t.m100205c(m4011m5);
            m127128x = AbstractC24341v.m127128x(m4011m5);
            if (m127128x) {
                return null;
            }
            return new C21228a(new JSONObject(m4011m5));
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // ke.InterfaceC21698a
    /* renamed from: b */
    public Object mo106621b(int i11, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingBackToneNoNetwork.f40393p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d(c27317h));
            c0766k.mo1528Ra(i11, 0);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // ke.InterfaceC21698a
    /* renamed from: c */
    public Object mo106622c(String str, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingBackToneNoNetwork.f40393p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new g(c27317h));
            c0766k.mo1592Za(str);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        m142578e2 = AbstractC28298d.m142578e();
        if (m139856a == m142578e2) {
            return m139856a;
        }
        return C24848g0.f119245a;
    }

    @Override // ke.InterfaceC21698a
    /* renamed from: d */
    public Object mo106623d(Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingBackToneNoNetwork.f40393p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(c27317h));
            c0766k.mo1716q4(200, 0);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // ke.InterfaceC21698a
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo106624e(C21228a c21228a, Continuation continuation) {
        e eVar;
        Object m142578e;
        int i11;
        File file;
        int intValue;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f100816v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f100816v = i12 - Integer.MIN_VALUE;
                Object obj = eVar.f100814t;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f100816v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        file = (File) eVar.f100813s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    File file2 = new File(m106618l(c21228a));
                    if (m106615i(file2)) {
                        AbstractC3082b0.m15424f("RBTRepoImpl", "getRingBackToneFile cached");
                        file2.setLastModified(System.currentTimeMillis());
                        String path = file2.getPath();
                        AbstractC19074t.m100207e(path, "getPath(...)");
                        return path;
                    }
                    AbstractC23041d2.m118207f(file2);
                    eVar.f100813s = file2;
                    eVar.f100816v = 1;
                    Object m106616j = m106616j(c21228a, file2, eVar);
                    if (m106616j == m142578e) {
                        return m142578e;
                    }
                    obj = m106616j;
                    file = file2;
                }
                intValue = ((Number) obj).intValue();
                AbstractC3082b0.m15424f("RBTRepoImpl", "getRingBackToneFile download with result " + intValue);
                if (intValue != 0) {
                    String path2 = file.getPath();
                    AbstractC19074t.m100207e(path2, "getPath(...)");
                    return path2;
                }
                return "";
            }
        }
        eVar = new e(continuation);
        Object obj2 = eVar.f100814t;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f100816v;
        if (i11 == 0) {
        }
        intValue = ((Number) obj2).intValue();
        AbstractC3082b0.m15424f("RBTRepoImpl", "getRingBackToneFile download with result " + intValue);
        if (intValue != 0) {
        }
    }

    @Override // ke.InterfaceC21698a
    /* renamed from: f */
    public Object mo106625f(int i11, Continuation continuation) {
        Continuation m142576c;
        List m131496e;
        Object m142578e;
        m142576c = AbstractC28297c.m142576c(continuation);
        C27317h c27317h = new C27317h(m142576c);
        if (!C23055e5.m118273h(false, 1, null)) {
            C24861r.a aVar = C24861r.f119264q;
            c27317h.mo112492g(C24861r.m129218b(AbstractC24862s.m129227a(ExceptionRingBackToneNoNetwork.f40393p)));
        } else {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new f(c27317h));
            String str = CoreUtility.f89233i;
            m131496e = AbstractC25366r.m131496e("20");
            c0766k.mo1550U8(str, ContactProfile.C7868d.m40446a(m131496e), 0, i11);
        }
        Object m139856a = c27317h.m139856a();
        m142578e = AbstractC28298d.m142578e();
        if (m139856a == m142578e) {
            AbstractC29100h.m145355c(continuation);
        }
        return m139856a;
    }

    @Override // ke.InterfaceC21698a
    /* renamed from: g */
    public C21228a mo106626g() {
        return new C21228a("0", null, null, null, 0, null, false, 126, null);
    }

    @Override // ke.InterfaceC21698a
    /* renamed from: h */
    public Object mo106627h(C21228a c21228a, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(Dispatchers.m112680b(), new h(c21228a, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }
}
