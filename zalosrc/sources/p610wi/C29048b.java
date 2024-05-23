package p610wi;

import ae.C0766k;
import ag0.C0808c0;
import com.zing.zalo.backuprestore.exception.BackupRestoreException;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.NativeHttp;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import hu.C20128b;
import in.C20627a;
import in.InterfaceC20630d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import jm0.AbstractC21302l;
import jm0.AbstractC21309s;
import jm0.C21296f;
import jm0.InterfaceC21299i;
import jm0.InterfaceC21303m;
import me0.AbstractC23138m0;
import me0.C23055e5;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import mm0.AbstractC23356k;
import on0.C24329j;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p548ui.C27271a;
import p548ui.C27272b;
import p548ui.C27273c;
import p609wh.AbstractC29039u0;
import p609wh.C29000b;
import p609wh.C29037t0;
import pm0.AbstractC24856m;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25363p0;
import sc.C26220b;
import si.C26263i;

/* renamed from: wi.b */
/* loaded from: classes3.dex */
public final class C29048b implements InterfaceC29047a {
    public static final c Companion = new c(null);

    /* renamed from: a */
    private static final InterfaceC24854k f134548a;

    /* renamed from: b */
    private static final InterfaceC24854k f134549b;

    /* renamed from: wi.b$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f134550q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "***@***.***";
        }
    }

    /* renamed from: wi.b$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f134551q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24329j mo12V4() {
            return new C24329j("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
        }
    }

    /* renamed from: wi.b$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final String m145065c() {
            return (String) C29048b.f134549b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final C24329j m145066d() {
            return (C24329j) C29048b.f134548a.getValue();
        }
    }

    /* renamed from: wi.b$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f134553r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f134553r = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m145067a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            int optInt = jSONObject.optInt("error_code");
            if (optInt == 0) {
                C29048b.this.m145057w("Delete backup info success! " + jSONObject);
                this.f134553r.mo205i9(C24848g0.f119245a);
                return;
            }
            int optInt2 = jSONObject.optInt("error_message");
            C29048b.this.m145056v("Delete backup info failed! [" + optInt + ", " + optInt2 + "]");
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m145067a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wi.b$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ int f134554q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11) {
            super(2);
            this.f134554q = i11;
        }

        /* renamed from: a */
        public final void m145068a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            linkedHashMap.put("trigger_source", String.valueOf(this.f134554q));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m145068a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wi.b$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final f f134555q = new f();

        f() {
            super(2);
        }

        /* renamed from: a */
        public final void m145069a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "<anonymous parameter 1>");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m145069a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wi.b$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC21299i {

        /* renamed from: b */
        final /* synthetic */ String f134557b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18505l f134558c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18509p f134559d;

        g(String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
            this.f134557b = str;
            this.f134558c = interfaceC18505l;
            this.f134559d = interfaceC18509p;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            C29048b.this.m145056v("onRequestFailed(" + this.f134557b + "): " + c20096c);
            InterfaceC18509p interfaceC18509p = this.f134559d;
            Integer valueOf = Integer.valueOf(C29048b.this.m145051q(c20096c));
            String m104492d = c20096c.m104492d();
            AbstractC19074t.m100207e(m104492d, "getError_message(...)");
            interfaceC18509p.mo240pC(valueOf, m104492d);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "result");
            C29048b c29048b = C29048b.this;
            c29048b.m145057w("onRequestComplete(" + this.f134557b + ")" + c29048b.m145052r(jSONObject));
            this.f134558c.mo205i9(jSONObject);
        }
    }

    /* renamed from: wi.b$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f134560q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f134560q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m145070a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            InterfaceC18505l interfaceC18505l = this.f134560q;
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
            interfaceC18505l.mo205i9(jSONObject2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m145070a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wi.b$i */
    /* loaded from: classes3.dex */
    public static final class i implements InterfaceC20630d {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f134561a;

        /* renamed from: b */
        final /* synthetic */ C29048b f134562b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC18509p f134563c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18505l f134564d;

        i(InterfaceC18505l interfaceC18505l, C29048b c29048b, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l2) {
            this.f134561a = interfaceC18505l;
            this.f134562b = c29048b;
            this.f134563c = interfaceC18509p;
            this.f134564d = interfaceC18505l2;
        }

        @Override // in.InterfaceC20630d
        /* renamed from: a */
        public void mo91783a(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "path");
            this.f134561a.mo205i9(new JSONObject());
            this.f134562b.m145057w("NATIVE download Backup DB success: path=" + str + " , isFromCache: " + z11);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: b */
        public void mo91784b(int i11, boolean z11) {
            this.f134563c.mo240pC(Integer.valueOf(i11), "");
            this.f134562b.m145056v("NATIVE download Backup DB error: errorCode=" + i11);
        }

        @Override // in.InterfaceC20630d
        /* renamed from: c */
        public void mo91785c(long j11, String str) {
            AbstractC19074t.m100208f(str, "des");
            int i11 = (int) j11;
            this.f134564d.mo205i9(Integer.valueOf(i11));
            this.f134562b.m145057w("NATIVE download Backup DB progress: progress=" + i11);
        }
    }

    /* renamed from: wi.b$j */
    /* loaded from: classes3.dex */
    public static final class j implements InterfaceC21303m {

        /* renamed from: a */
        final /* synthetic */ InterfaceC18505l f134565a;

        /* renamed from: b */
        final /* synthetic */ C29048b f134566b;

        /* renamed from: c */
        final /* synthetic */ boolean f134567c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC18509p f134568d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC18505l f134569e;

        j(InterfaceC18505l interfaceC18505l, C29048b c29048b, boolean z11, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l2) {
            this.f134565a = interfaceC18505l;
            this.f134566b = c29048b;
            this.f134567c = z11;
            this.f134568d = interfaceC18509p;
            this.f134569e = interfaceC18505l2;
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: a */
        public void mo51590a(int i11) {
            C26220b.m134828k("On progress: " + i11);
            C26263i.m135055u().m135063B((long) i11);
            this.f134565a.mo205i9(Integer.valueOf(i11));
        }

        @Override // jm0.InterfaceC21303m
        /* renamed from: b */
        public void mo51591b(JSONObject jSONObject, boolean z11) {
            AbstractC19074t.m100208f(jSONObject, "data");
            this.f134566b.m145057w("Upload backup DB success! " + jSONObject);
            C26220b.m134816E(C26220b.f124587a, this.f134567c, 0, null, 6, null);
            this.f134569e.mo205i9(jSONObject);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
            C29048b c29048b = this.f134566b;
            c29048b.m145056v("Upload backup DB failed! " + c29048b.m145053s(c20096c));
            int m145051q = this.f134566b.m145051q(c20096c);
            String m104492d = c20096c.m104492d();
            C26220b c26220b = C26220b.f124587a;
            boolean z11 = this.f134567c;
            AbstractC19074t.m100205c(m104492d);
            c26220b.m134842D(z11, m145051q, m104492d);
            this.f134568d.mo240pC(Integer.valueOf(m145051q), m104492d);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public /* synthetic */ void mo1343f(JSONObject jSONObject) {
            AbstractC21302l.m110331a(this, jSONObject);
        }
    }

    /* renamed from: wi.b$k */
    /* loaded from: classes3.dex */
    static final class k extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f134570q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f134570q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m145071a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            this.f134570q.mo205i9(C27272b.Companion.m139627a(jSONObject.optJSONObject("data")));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m145071a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wi.b$l */
    /* loaded from: classes3.dex */
    static final class l extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ File f134571q;

        /* renamed from: r */
        final /* synthetic */ int f134572r;

        /* renamed from: s */
        final /* synthetic */ int f134573s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(File file, int i11, int i12) {
            super(2);
            this.f134571q = file;
            this.f134572r = i11;
            this.f134573s = i12;
        }

        /* renamed from: a */
        public final void m145072a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            String str;
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            String valueOf = String.valueOf(this.f134571q.length());
            if (C26263i.m135016J(this.f134572r)) {
                str = "0";
            } else {
                str = "1";
            }
            linkedHashMap.put("med", str);
            linkedHashMap.put("size", valueOf);
            linkedHashMap.put("nretry", String.valueOf(this.f134573s));
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m145072a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wi.b$m */
    /* loaded from: classes3.dex */
    static final class m extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18505l f134574q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(InterfaceC18505l interfaceC18505l) {
            super(1);
            this.f134574q = interfaceC18505l;
        }

        /* renamed from: a */
        public final void m145073a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "it");
            this.f134574q.mo205i9(C24848g0.f119245a);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m145073a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wi.b$n */
    /* loaded from: classes3.dex */
    static final class n extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ JSONObject f134575q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(JSONObject jSONObject) {
            super(2);
            this.f134575q = jSONObject;
        }

        /* renamed from: a */
        public final void m145074a(C29037t0 c29037t0, LinkedHashMap linkedHashMap) {
            AbstractC19074t.m100208f(c29037t0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(linkedHashMap, "reqParams");
            String jSONObject = this.f134575q.toString();
            AbstractC19074t.m100207e(jSONObject, "toString(...)");
            linkedHashMap.put("cloud_info", jSONObject);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m145074a((C29037t0) obj, (LinkedHashMap) obj2);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(b.f134551q);
        f134548a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(a.f134550q);
        f134549b = m129210a2;
    }

    /* renamed from: o */
    private final void m145049o(int i11, String str, String str2, int i12, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2) {
        if (!AbstractC23138m0.Companion.m118774a()) {
            interfaceC18509p.mo240pC(-2, "Invalid User ID");
            return;
        }
        if (!C23055e5.m118273h(false, 1, null)) {
            String str3 = AbstractC20095b.f98829a;
            AbstractC19074t.m100207e(str3, "NETWORK_ERROR_MSG");
            interfaceC18509p.mo240pC(50001, str3);
            return;
        }
        g gVar = new g(str2, interfaceC18505l, interfaceC18509p);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("client_type", "1");
        linkedHashMap.put("device_type", "1");
        linkedHashMap.put("client_version", String.valueOf(CoreUtility.f89236l));
        C29000b c29000b = new C29000b(gVar);
        c29000b.f103775r = i11;
        interfaceC18509p2.mo240pC(c29000b, linkedHashMap);
        String str4 = str + str2;
        Set keySet = linkedHashMap.keySet();
        AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
        String[] strArr = (String[]) keySet.toArray(new String[0]);
        Collection values = linkedHashMap.values();
        AbstractC19074t.m100207e(values, "<get-values>(...)");
        c29000b.m110314j(str4, "", strArr, (String[]) values.toArray(new String[0]));
        if (i12 != -1) {
            c29000b.m110305c0(i12);
        }
        c cVar = Companion;
        m145057w(cVar.m145066d().m127019g("executeRequest(): " + c29000b, cVar.m145065c()));
        C0808c0.m2046b(c29000b);
    }

    /* renamed from: p */
    static /* synthetic */ void m145050p(C29048b c29048b, int i11, String str, String str2, int i12, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18509p interfaceC18509p2, int i13, Object obj) {
        String str3;
        int i14;
        InterfaceC18509p interfaceC18509p3;
        if ((i13 & 2) != 0) {
            String m145033a = AbstractC29039u0.m145033a(AbstractC29039u0.b.MSG_BACKUP);
            AbstractC19074t.m100207e(m145033a, "getUrlCommand(...)");
            str3 = m145033a;
        } else {
            str3 = str;
        }
        if ((i13 & 8) != 0) {
            i14 = -1;
        } else {
            i14 = i12;
        }
        if ((i13 & 64) != 0) {
            interfaceC18509p3 = f.f134555q;
        } else {
            interfaceC18509p3 = interfaceC18509p2;
        }
        c29048b.m145049o(i11, str3, str2, i14, interfaceC18505l, interfaceC18509p, interfaceC18509p3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final int m145051q(C20096c c20096c) {
        if (c20096c.m104489a() == 200) {
            return c20096c.m104491c();
        }
        return c20096c.m104489a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final String m145052r(JSONObject jSONObject) {
        String optString = jSONObject.optString("data");
        AbstractC19074t.m100205c(optString);
        if (optString.length() == 0) {
            return "";
        }
        String str = ": " + optString;
        c cVar = Companion;
        return cVar.m145066d().m127019g(str, cVar.m145065c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final String m145053s(C20096c c20096c) {
        return "Error (" + m145051q(c20096c) + ", " + c20096c.m104492d() + ")";
    }

    /* renamed from: t */
    private final void m145054t() {
        NativeHttp.m93186a(true);
    }

    /* renamed from: u */
    private final void m145055u() {
        NativeHttp.m93187b(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m145056v(String str) {
        C26220b.m134824g("SMLBackupRestoreApiHelper", str, C26220b.a.f124591s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m145057w(String str) {
        C26220b.m134824g("SMLBackupRestoreApiHelper", str, C26220b.a.f124590r);
    }

    /* renamed from: x */
    private final void m145058x(C27273c c27273c, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18509p interfaceC18509p) {
        m145057w("NATIVE download Backup DB: params=" + c27273c);
        i iVar = new i(interfaceC18505l2, this, interfaceC18509p, interfaceC18505l);
        String[] strArr = {String.valueOf(c27273c.m139629b()), String.valueOf(c27273c.m139628a()), String.valueOf(c27273c.m139631d())};
        Hashtable hashtable = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        String m110343g = AbstractC21309s.m110343g(c27273c.m139632e(), "", new String[]{"backup_type", "encrypt_type", "imei_status"}, strArr, hashtable);
        String m110339c = AbstractC21309s.m110339c(hashtable);
        ArrayList arrayList = new ArrayList();
        arrayList.add("session_key=" + CoreUtility.f89232h);
        arrayList.add("api_key=" + CoreUtility.f89226b);
        arrayList.add("sig=" + m110339c);
        hashtable2.put("Cookie", AbstractC23356k.m122796b(arrayList, "; ") + ";");
        hashtable2.put("User-Agent", System.getProperties().getProperty("http.agent"));
        C20627a c20627a = new C20627a();
        c20627a.m107419g0(iVar);
        c20627a.f101478v = 26024;
        c20627a.m107420h0(c27273c.m139630c().getPath());
        c20627a.f101480x = hashtable2;
        c20627a.f101481y = true;
        c20627a.m107488m(m110343g);
    }

    /* renamed from: y */
    private final void m145059y(C27271a c27271a, boolean z11, String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l2) {
        int i11;
        String str2;
        HashMap m131406k;
        m145057w("NATIVE upload Backup DB: params=" + c27271a + ", url=" + str);
        C24720a m120676j = AbstractC23306f.m120676j();
        AbstractC19074t.m100207e(m120676j, "provideBackupRestoreConfigs(...)");
        C29000b c29000b = new C29000b(new j(interfaceC18505l2, this, z11, interfaceC18509p, interfaceC18505l));
        File m139614a = c27271a.m139614a();
        JSONObject m139615b = c27271a.m139615b();
        String m122785a = AbstractC23352g.m122785a(m139614a);
        if (m139615b != null) {
            i11 = m139615b.optInt("db_encrypt_type", 0);
        } else {
            i11 = 0;
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        C24860q[] c24860qArr = new C24860q[19];
        c24860qArr[0] = AbstractC24866w.m129235a("device_type", "1");
        c24860qArr[1] = AbstractC24866w.m129235a("client_version", String.valueOf(CoreUtility.f89236l));
        c24860qArr[2] = AbstractC24866w.m129235a("file_name", m139614a.getName());
        c24860qArr[3] = AbstractC24866w.m129235a("checksum", m122785a);
        c24860qArr[4] = AbstractC24866w.m129235a("file_size", String.valueOf(m139614a.length()));
        c24860qArr[5] = AbstractC24866w.m129235a("device_name", C20128b.m104758e(false, 1, null));
        c24860qArr[6] = AbstractC24866w.m129235a("model_code", C20128b.m104768o());
        c24860qArr[7] = AbstractC24866w.m129235a("client_time", String.valueOf(c27271a.m139617d()));
        c24860qArr[8] = AbstractC24866w.m129235a("client_file_id", String.valueOf(nextInt));
        if (m139615b == null || (str2 = m139615b.toString()) == null) {
            str2 = "";
        }
        c24860qArr[9] = AbstractC24866w.m129235a("db_info", str2);
        c24860qArr[10] = AbstractC24866w.m129235a("backup_type", String.valueOf(c27271a.m139618e()));
        c24860qArr[11] = AbstractC24866w.m129235a("sync_messages", "1");
        c24860qArr[12] = AbstractC24866w.m129235a("sync_session", c27271a.m139622i());
        c24860qArr[13] = AbstractC24866w.m129235a("encrypt_type", String.valueOf(i11));
        c24860qArr[14] = AbstractC24866w.m129235a("trigger_reason", String.valueOf(c27271a.m139623j()));
        c24860qArr[15] = AbstractC24866w.m129235a("network_type", String.valueOf(c27271a.m139621h()));
        c24860qArr[16] = AbstractC24866w.m129235a("fresh_install", String.valueOf(c27271a.m139619f()));
        c24860qArr[17] = AbstractC24866w.m129235a("imei_status", String.valueOf(c27271a.m139620g()));
        c24860qArr[18] = AbstractC24866w.m129235a("backup_storage", String.valueOf(c27271a.m139616c()));
        m131406k = AbstractC25363p0.m131406k(c24860qArr);
        m145060z(m131406k);
        boolean m128399P = m120676j.m128399P();
        if (m128399P) {
            c29000b.m110312i(str, "");
        } else {
            m145057w("Add params to request URL");
            Set keySet = m131406k.keySet();
            AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
            String[] strArr = (String[]) keySet.toArray(new String[0]);
            Collection values = m131406k.values();
            AbstractC19074t.m100207e(values, "<get-values>(...)");
            c29000b.m110314j(str, "", strArr, (String[]) values.toArray(new String[0]));
        }
        c29000b.f103775r = 9;
        C21296f c21296f = new C21296f("file_data", m139614a.getName(), "application/octet-stream", m139614a);
        c21296f.m110270m(AbstractC23306f.m120676j().m128430z());
        if (m128399P) {
            m145057w("Add params to request body");
            Hashtable hashtable = new Hashtable();
            for (Map.Entry entry : m131406k.entrySet()) {
                hashtable.put(entry.getKey(), entry.getValue());
            }
            c21296f.m110265h(hashtable);
        }
        c29000b.m110309g0(c21296f);
        c29000b.m110304b0(false);
        c29000b.m110305c0(24019);
        c29000b.f103773p = nextInt;
        c29000b.m110316k0(20000L);
        C0808c0.m2046b(c29000b);
    }

    /* renamed from: z */
    private final void m145060z(Map map) {
        try {
            if (map.containsKey("db_info")) {
                CharSequence charSequence = (CharSequence) map.get("db_info");
                if (charSequence != null && charSequence.length() != 0) {
                    return;
                }
                C26220b.m134819b(new BackupRestoreException("Invalid backup info: `db_info`=" + map.get("db_info")));
            }
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreApiHelper", e11);
        }
    }

    @Override // p610wi.InterfaceC29047a
    /* renamed from: a */
    public void mo145035a(InterfaceC20094a interfaceC20094a) {
        AbstractC19074t.m100208f(interfaceC20094a, "listener");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(interfaceC20094a);
        c0766k.m1828V();
    }

    @Override // p610wi.InterfaceC29047a
    /* renamed from: b */
    public void mo145036b(InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m145050p(this, 10, null, "/info", 11721, new h(interfaceC18505l), interfaceC18509p, null, 66, null);
    }

    @Override // p610wi.InterfaceC29047a
    /* renamed from: c */
    public void mo145037c(int i11, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m145050p(this, 10, null, "/remove", 11728, new d(interfaceC18505l), interfaceC18509p, new e(i11), 2, null);
    }

    @Override // p610wi.InterfaceC29047a
    /* renamed from: d */
    public void mo145038d(File file, int i11, int i12, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(file, "backupFile");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m145050p(this, 10, null, "/chk", 11719, new k(interfaceC18505l), interfaceC18509p, new l(file, i11, i12), 2, null);
    }

    @Override // p610wi.InterfaceC29047a
    /* renamed from: e */
    public void mo145039e(C27271a c27271a, String str, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l2) {
        AbstractC19074t.m100208f(c27271a, "params");
        AbstractC19074t.m100208f(str, "targetUrl");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        AbstractC19074t.m100208f(interfaceC18505l2, "onProgress");
        try {
            if (str.length() == 0) {
                str = AbstractC29039u0.m145033a(AbstractC29039u0.b.MSG_BACKUP) + "/uploadchunk";
            }
            String str2 = str;
            boolean m135016J = C26263i.m135016J(c27271a.m139618e());
            if (!C23055e5.m118272g(m135016J)) {
                m145056v("Network NOT available!");
                String str3 = AbstractC20095b.f98829a;
                AbstractC19074t.m100207e(str3, "NETWORK_ERROR_MSG");
                interfaceC18509p.mo240pC(50001, str3);
                return;
            }
            m145054t();
            m145059y(c27271a, m135016J, str2, interfaceC18505l, interfaceC18509p, interfaceC18505l2);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLBackupRestoreApiHelper", e11);
            String str4 = AbstractC20095b.f98832d;
            AbstractC19074t.m100207e(str4, "UNKNOWN_MSG");
            interfaceC18509p.mo240pC(502, str4);
        }
    }

    @Override // p610wi.InterfaceC29047a
    /* renamed from: f */
    public void mo145040f(JSONObject jSONObject, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(jSONObject, "backupMediaInfo");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        m145050p(this, 10, null, "/mediainfo", 0, new m(interfaceC18505l), interfaceC18509p, new n(jSONObject), 10, null);
    }

    @Override // p610wi.InterfaceC29047a
    /* renamed from: g */
    public void mo145041g(C27273c c27273c, InterfaceC18505l interfaceC18505l, InterfaceC18505l interfaceC18505l2, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(c27273c, "params");
        AbstractC19074t.m100208f(interfaceC18505l, "onProgress");
        AbstractC19074t.m100208f(interfaceC18505l2, "onSuccess");
        AbstractC19074t.m100208f(interfaceC18509p, "onError");
        if (!C23055e5.m118273h(false, 1, null)) {
            m145056v("Network NOT available!");
            String str = AbstractC20095b.f98829a;
            AbstractC19074t.m100207e(str, "NETWORK_ERROR_MSG");
            interfaceC18509p.mo240pC(50001, str);
            return;
        }
        m145055u();
        m145058x(c27273c, interfaceC18505l, interfaceC18505l2, interfaceC18509p);
    }
}
