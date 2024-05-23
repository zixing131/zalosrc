package ae;

import ag0.C0808c0;
import ag0.C0829l0;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.RequestPacket;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.AbstractC20095b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jm0.C21294d;
import jm0.C21295e;
import jm0.EnumC21297g;
import jm0.InterfaceC21299i;
import km0.AbstractC21767b;
import km0.EnumC21773h;
import km0.InterfaceC21766a;
import km0.InterfaceC21769d;
import me0.AbstractC23059e9;
import me0.AbstractC23161o1;
import org.json.JSONObject;
import p135em.C18489c;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p609wh.C29037t0;
import qm0.AbstractC25370t;
import th.AbstractC26684e;

/* renamed from: ae.f */
/* loaded from: classes.dex */
public abstract class AbstractC0761f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ae.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f2532q = new a();

        /* renamed from: ae.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C32616a implements InterfaceC21766a {

            /* renamed from: ae.f$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32617a implements InterfaceC21299i {

                /* renamed from: a */
                final /* synthetic */ InterfaceC21769d f2533a;

                C32617a(InterfaceC21769d interfaceC21769d) {
                    this.f2533a = interfaceC21769d;
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: c */
                public void mo1342c(C20096c c20096c) {
                    AbstractC19074t.m100208f(c20096c, "error_message");
                    InterfaceC21769d interfaceC21769d = this.f2533a;
                    int m104489a = c20096c.m104489a();
                    String m104493e = c20096c.m104493e();
                    AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                    interfaceC21769d.mo13651a(m104489a, m104493e);
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: f */
                public void mo1343f(JSONObject jSONObject) {
                    AbstractC19074t.m100208f(jSONObject, "object");
                    try {
                        this.f2533a.mo13652b(EnumC21773h.JSON, jSONObject);
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                        InterfaceC21769d interfaceC21769d = this.f2533a;
                        String m119318c = AbstractC23161o1.m119318c(502, "");
                        AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
                        interfaceC21769d.mo13651a(502, m119318c);
                    }
                }
            }

            /* renamed from: ae.f$a$a$b */
            /* loaded from: classes3.dex */
            public static final class b implements InterfaceC21299i {

                /* renamed from: a */
                final /* synthetic */ InterfaceC21769d f2534a;

                b(InterfaceC21769d interfaceC21769d) {
                    this.f2534a = interfaceC21769d;
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: c */
                public void mo1342c(C20096c c20096c) {
                    AbstractC19074t.m100208f(c20096c, "error_message");
                    InterfaceC21769d interfaceC21769d = this.f2534a;
                    int m104489a = c20096c.m104489a();
                    String m104493e = c20096c.m104493e();
                    AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                    interfaceC21769d.mo13651a(m104489a, m104493e);
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: f */
                public void mo1343f(JSONObject jSONObject) {
                    AbstractC19074t.m100208f(jSONObject, "object");
                    try {
                        this.f2534a.mo13652b(EnumC21773h.JSON, jSONObject);
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                        InterfaceC21769d interfaceC21769d = this.f2534a;
                        String m119318c = AbstractC23161o1.m119318c(502, "");
                        AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
                        interfaceC21769d.mo13651a(502, m119318c);
                    }
                }
            }

            /* renamed from: ae.f$a$a$c */
            /* loaded from: classes3.dex */
            public static final class c implements InterfaceC21299i {

                /* renamed from: a */
                final /* synthetic */ InterfaceC21769d f2535a;

                c(InterfaceC21769d interfaceC21769d) {
                    this.f2535a = interfaceC21769d;
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: c */
                public void mo1342c(C20096c c20096c) {
                    AbstractC19074t.m100208f(c20096c, "error_message");
                    InterfaceC21769d interfaceC21769d = this.f2535a;
                    int m104489a = c20096c.m104489a();
                    String m104493e = c20096c.m104493e();
                    AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                    interfaceC21769d.mo13651a(m104489a, m104493e);
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: f */
                public void mo1343f(JSONObject jSONObject) {
                    AbstractC19074t.m100208f(jSONObject, "object");
                    try {
                        this.f2535a.mo13652b(EnumC21773h.JSON, jSONObject);
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                        InterfaceC21769d interfaceC21769d = this.f2535a;
                        String m119318c = AbstractC23161o1.m119318c(502, "");
                        AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
                        interfaceC21769d.mo13651a(502, m119318c);
                    }
                }
            }

            /* renamed from: ae.f$a$a$d */
            /* loaded from: classes3.dex */
            public static final class d implements InterfaceC21299i {

                /* renamed from: a */
                final /* synthetic */ InterfaceC21769d f2536a;

                d(InterfaceC21769d interfaceC21769d) {
                    this.f2536a = interfaceC21769d;
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: c */
                public void mo1342c(C20096c c20096c) {
                    AbstractC19074t.m100208f(c20096c, "error_message");
                    InterfaceC21769d interfaceC21769d = this.f2536a;
                    int m104489a = c20096c.m104489a();
                    String m104493e = c20096c.m104493e();
                    AbstractC19074t.m100207e(m104493e, "getMessageBase(...)");
                    interfaceC21769d.mo13651a(m104489a, m104493e);
                }

                @Override // jm0.InterfaceC21299i
                /* renamed from: f */
                public void mo1343f(JSONObject jSONObject) {
                    AbstractC19074t.m100208f(jSONObject, "object");
                    this.f2536a.mo13652b(EnumC21773h.JSON, jSONObject);
                }
            }

            C32616a() {
            }

            @Override // km0.InterfaceC21766a
            /* renamed from: a */
            public void mo1365a(String str, int i11, boolean z11, Map map, InterfaceC21769d interfaceC21769d) {
                int m131511r;
                int m131511r2;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(map, "params");
                AbstractC19074t.m100208f(interfaceC21769d, "listener");
                if (!AbstractC0761f.m1362b(interfaceC21769d)) {
                    return;
                }
                C29037t0 c29037t0 = new C29037t0(new b(interfaceC21769d));
                c29037t0.f103775r = 11;
                if (AbstractC26684e.f126414g && z11) {
                    c29037t0.m110311h0(EnumC21297g.ENCRYPT_PARAMETER);
                }
                Set entrySet = map.entrySet();
                m131511r = AbstractC25370t.m131511r(entrySet, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Set entrySet2 = map.entrySet();
                m131511r2 = AbstractC25370t.m131511r(entrySet2, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = entrySet2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                c29037t0.m110314j(str, "", strArr, (String[]) arrayList2.toArray(new String[0]));
                if (i11 > -1) {
                    c29037t0.m110305c0(i11);
                }
                if (AbstractC20626a.m107394j(MainApplication.Companion.m35500c())) {
                    C0808c0.m2046b(c29037t0);
                    return;
                }
                String m119318c = AbstractC23161o1.m119318c(50001, "");
                AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
                interfaceC21769d.mo13651a(50001, m119318c);
            }

            @Override // km0.InterfaceC21766a
            /* renamed from: b */
            public void mo1366b(int i11, int i12, byte[] bArr, InterfaceC21769d interfaceC21769d) {
                AbstractC19074t.m100208f(bArr, "params");
                AbstractC19074t.m100208f(interfaceC21769d, "listener");
                if (!AbstractC0761f.m1362b(interfaceC21769d)) {
                    return;
                }
                C29037t0 c29037t0 = new C29037t0(new d(interfaceC21769d));
                c29037t0.f103775r = 2;
                RequestPacket requestPacket = new RequestPacket();
                requestPacket.m93301w((byte) 1);
                requestPacket.m93302x((byte) 0);
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                requestPacket.m93273D(Integer.parseInt(str));
                requestPacket.m93274E((byte) 3);
                requestPacket.m93295q((short) i11);
                requestPacket.m93275F((byte) i12);
                requestPacket.m93303y(bArr);
                c29037t0.m110313i0(requestPacket);
                if (AbstractC20626a.m107394j(MainApplication.Companion.m35500c())) {
                    C0829l0.m2174c(c29037t0);
                    return;
                }
                String m119318c = AbstractC23161o1.m119318c(502, "");
                AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
                interfaceC21769d.mo13651a(502, m119318c);
            }

            @Override // km0.InterfaceC21766a
            /* renamed from: c */
            public void mo1367c(String str, int i11, boolean z11, Map map, InterfaceC21769d interfaceC21769d) {
                int i12;
                int m131511r;
                int m131511r2;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(map, "params");
                AbstractC19074t.m100208f(interfaceC21769d, "listener");
                if (!AbstractC0761f.m1362b(interfaceC21769d)) {
                    return;
                }
                C29037t0 c29037t0 = new C29037t0(new C32617a(interfaceC21769d));
                if (AbstractC23059e9.m118343v()) {
                    i12 = 10;
                } else {
                    i12 = 0;
                }
                c29037t0.f103775r = i12;
                if (AbstractC26684e.f126414g && z11) {
                    c29037t0.m110311h0(EnumC21297g.ENCRYPT_PARAMETER);
                }
                Set entrySet = map.entrySet();
                m131511r = AbstractC25370t.m131511r(entrySet, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Set entrySet2 = map.entrySet();
                m131511r2 = AbstractC25370t.m131511r(entrySet2, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = entrySet2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                c29037t0.m110314j(str, "", strArr, (String[]) arrayList2.toArray(new String[0]));
                if (i11 > -1) {
                    c29037t0.m110305c0(i11);
                }
                if (AbstractC20626a.m107394j(MainApplication.Companion.m35500c())) {
                    C0808c0.m2046b(c29037t0);
                    return;
                }
                String m119318c = AbstractC23161o1.m119318c(50001, "");
                AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
                interfaceC21769d.mo13651a(50001, m119318c);
            }

            @Override // km0.InterfaceC21766a
            /* renamed from: d */
            public void mo1368d(String str, int i11, boolean z11, Map map, byte[] bArr, File file, InterfaceC21769d interfaceC21769d) {
                C21294d c21294d;
                C21295e c21295e;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(map, "params");
                AbstractC19074t.m100208f(interfaceC21769d, "listener");
                if (bArr != null) {
                    c21294d = new C21294d("file", "filename", "application/octet-stream", bArr);
                } else {
                    c21294d = null;
                }
                if (file != null) {
                    c21295e = new C21295e("file", "filename", "application/octet-stream", file);
                } else {
                    c21295e = null;
                }
                mo1369e(str, i11, z11, map, c21294d, c21295e, interfaceC21769d);
            }

            @Override // km0.InterfaceC21766a
            /* renamed from: e */
            public void mo1369e(String str, int i11, boolean z11, Map map, C21294d c21294d, C21295e c21295e, InterfaceC21769d interfaceC21769d) {
                int m131511r;
                int m131511r2;
                AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100208f(map, "params");
                AbstractC19074t.m100208f(interfaceC21769d, "listener");
                if (!AbstractC0761f.m1362b(interfaceC21769d)) {
                    return;
                }
                C29037t0 c29037t0 = new C29037t0(new c(interfaceC21769d));
                c29037t0.f103775r = 6;
                if (AbstractC26684e.f126414g && z11) {
                    c29037t0.m110311h0(EnumC21297g.ENCRYPT_PARAMETER);
                }
                Set entrySet = map.entrySet();
                m131511r = AbstractC25370t.m131511r(entrySet, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Set entrySet2 = map.entrySet();
                m131511r2 = AbstractC25370t.m131511r(entrySet2, 10);
                ArrayList arrayList2 = new ArrayList(m131511r2);
                Iterator it2 = entrySet2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                c29037t0.m110314j(str, "", strArr, (String[]) arrayList2.toArray(new String[0]));
                if (c21294d != null) {
                    c29037t0.m110310h(c21294d);
                }
                if (c21295e != null) {
                    c29037t0.m110310h(c21295e);
                }
                if (i11 > -1) {
                    c29037t0.m110305c0(i11);
                }
                if (AbstractC20626a.m107394j(MainApplication.Companion.m35500c())) {
                    C0808c0.m2046b(c29037t0);
                    return;
                }
                String m119318c = AbstractC23161o1.m119318c(50001, "");
                AbstractC19074t.m100207e(m119318c, "getErrorMsgFromCode(...)");
                interfaceC21769d.mo13651a(50001, m119318c);
            }

            @Override // km0.InterfaceC21766a
            /* renamed from: f */
            public String mo1370f(String str) {
                AbstractC19074t.m100208f(str, "key");
                String m97849k = C18489c.m97849k(C7962g.c.a.m42670h(str));
                AbstractC19074t.m100207e(m97849k, "getObjectHost(...)");
                return m97849k;
            }

            @Override // km0.InterfaceC21766a
            /* renamed from: g */
            public Map mo1371g() {
                HashMap hashMap = new HashMap();
                try {
                    C1483e m1359c = AbstractC0760e.m1359c();
                    AbstractC19074t.m100207e(m1359c, "getCommonParametersForLoginRequest(...)");
                    int length = ((Object[]) m1359c.f6374a).length;
                    for (int i11 = 0; i11 < length; i11++) {
                        hashMap.put(((String[]) m1359c.f6374a)[i11], ((String[]) m1359c.f6375b)[i11]);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                return hashMap;
            }
        }

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC21766a mo12V4() {
            return new C32616a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m1362b(InterfaceC21769d interfaceC21769d) {
        if (AbstractC23304d.f113427q1.get()) {
            String str = AbstractC20095b.f98832d;
            AbstractC19074t.m100207e(str, "UNKNOWN_MSG");
            interfaceC21769d.mo13651a(502, str);
            return false;
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            CoreUtility.f89233i = AbstractC23309i.m121738b1();
        }
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            String str2 = AbstractC20095b.f98832d;
            AbstractC19074t.m100207e(str2, "UNKNOWN_MSG");
            interfaceC21769d.mo13651a(502, str2);
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final void m1363c() {
        AbstractC21767b.f105718a.m112297b().mo145981a(a.f2532q);
    }
}
