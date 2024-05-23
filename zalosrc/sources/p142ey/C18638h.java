package p142ey;

import ae.C0766k;
import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hm0.AbstractC20095b;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;

/* renamed from: ey.h */
/* loaded from: classes4.dex */
public final class C18638h {
    public static final c Companion = new c(null);

    /* renamed from: e */
    private static final InterfaceC24854k f93792e;

    /* renamed from: a */
    private final HashSet f93793a = new HashSet();

    /* renamed from: b */
    private final HashMap f93794b = new HashMap();

    /* renamed from: c */
    private final HashMap f93795c = new HashMap();

    /* renamed from: d */
    private HashMap f93796d;

    /* renamed from: ey.h$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo95329a(String str, int i11, String str2);

        /* renamed from: b */
        void mo95330b(String str, String str2, String str3);
    }

    /* renamed from: ey.h$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f93797q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C18638h mo12V4() {
            return d.f93798a.m98511a();
        }
    }

    /* renamed from: ey.h$c */
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C18638h m98510a() {
            return (C18638h) C18638h.f93792e.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ey.h$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f93798a = new d();

        /* renamed from: b */
        private static final C18638h f93799b = new C18638h();

        private d() {
        }

        /* renamed from: a */
        public final C18638h m98511a() {
            return f93799b;
        }
    }

    /* renamed from: ey.h$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ArrayList f93801b;

        e(ArrayList arrayList) {
            this.f93801b = arrayList;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C18638h.this.m98504k(this.f93801b, c20096c.m104491c(), c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "obj");
            try {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    C18638h c18638h = C18638h.this;
                    AbstractC19074t.m100205c(jSONObject);
                    c18638h.m98506m(jSONObject);
                }
            } catch (JSONException unused) {
                C18638h.this.m98504k(this.f93801b, -1, "Format response data is invalid");
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                C18638h.this.m98504k(this.f93801b, 112, e11.getMessage());
            }
        }
    }

    /* renamed from: ey.h$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f93802a;

        /* renamed from: b */
        final /* synthetic */ C18638h f93803b;

        /* renamed from: c */
        final /* synthetic */ String f93804c;

        f(boolean z11, C18638h c18638h, String str) {
            this.f93802a = z11;
            this.f93803b = c18638h;
            this.f93804c = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            this.f93803b.m98503j(this.f93804c, c20096c.m104491c(), c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "obj");
            try {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    if (!this.f93802a) {
                        C18638h c18638h = this.f93803b;
                        AbstractC19074t.m100205c(jSONObject);
                        c18638h.m98506m(jSONObject);
                    } else {
                        String optString = jSONObject.optString("qrImgLink");
                        if (optString != null && optString.length() != 0) {
                            C18638h c18638h2 = this.f93803b;
                            String str = this.f93804c;
                            AbstractC19074t.m100205c(optString);
                            c18638h2.m98505l(str, optString, jSONObject.optString("shortlink"));
                        }
                        this.f93803b.m98503j(this.f93804c, -1, "qrImgLink is empty");
                    }
                }
            } catch (JSONException unused) {
                this.f93803b.m98503j(this.f93804c, -1, "Format response data is invalid");
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                this.f93803b.m98503j(this.f93804c, 112, e11.getMessage());
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f93797q);
        f93792e = m129210a;
    }

    /* renamed from: f */
    public static final C18638h m98500f() {
        return Companion.m98510a();
    }

    /* renamed from: g */
    private final void m98501g(ArrayList arrayList) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(arrayList));
        c0766k.mo1606b9(arrayList);
    }

    /* renamed from: h */
    private final void m98502h(String str) {
        List m131496e;
        boolean z11 = true;
        if (AbstractC21935u.m114538e(str) != 1) {
            z11 = false;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new f(z11, this, str));
        if (!z11) {
            m131496e = AbstractC25366r.m131496e(str);
            c0766k.mo1606b9(m131496e);
        } else {
            c0766k.mo1768w8(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final synchronized void m98503j(String str, int i11, String str2) {
        String str3;
        try {
            try {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                aVar.mo104548a("[QRProfile] handleResultError " + str + "=" + i11 + "," + str2, new Object[0]);
                this.f93793a.remove(str);
                HashSet hashSet = (HashSet) this.f93794b.remove(str);
                if (hashSet != null) {
                    aVar.mo104548a("[QRProfile] onFail " + str + "=" + hashSet.size(), new Object[0]);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        a aVar2 = (a) it.next();
                        if (str2 == null) {
                            str3 = "";
                        } else {
                            str3 = str2;
                        }
                        aVar2.mo95329a(str, i11, str3);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m98504k(ArrayList arrayList, int i11, String str) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            AbstractC19074t.m100205c(str2);
            m98503j(str2, i11, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized void m98505l(String str, String str2, String str3) {
        try {
            try {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                aVar.mo104548a("[QRProfile] handleResultSuccess " + str + "=" + str2, new Object[0]);
                this.f93793a.remove(str);
                HashSet hashSet = (HashSet) this.f93794b.remove(str);
                if (hashSet != null) {
                    aVar.mo104548a("[QRProfile] onSuccess " + str + "=" + hashSet.size(), new Object[0]);
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).mo95330b(str, str2, str3);
                    }
                }
                this.f93795c.put(str, str2);
                if (str3 != null && str3.length() != 0) {
                    if (this.f93796d == null) {
                        this.f93796d = new HashMap();
                    }
                    HashMap hashMap = this.f93796d;
                    if (hashMap != null) {
                        hashMap.put(str, str3);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m98506m(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("list");
        int length = jSONArray.length();
        if (length > 0) {
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                String optString = jSONObject2.optString("uid");
                String optString2 = jSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                    AbstractC19074t.m100205c(optString);
                    AbstractC19074t.m100205c(optString2);
                    m98505l(optString, optString2, null);
                } else {
                    AbstractC19074t.m100205c(optString);
                    m98503j(optString, -1, "uid or qrImgLink is empty");
                }
            }
            return;
        }
        throw new JSONException("jsonArrProfile is empty");
    }

    /* renamed from: i */
    public final synchronized void m98507i(String str, a aVar) {
        AbstractC20110a.a aVar2;
        String str2;
        String str3;
        try {
            AbstractC19074t.m100208f(str, "uid");
            try {
                aVar2 = AbstractC20110a.f98889a;
                aVar2.mo104548a("[QRProfile] getQRCodeFromUid " + str, new Object[0]);
                str2 = (String) this.f93795c.get(str);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                if (aVar != null) {
                    String str4 = AbstractC20095b.f98833e;
                    AbstractC19074t.m100207e(str4, "UNKNOWN_EXCEPTION_MSG");
                    aVar.mo95329a(str, 112, str4);
                }
            }
            if (str2 != null) {
                aVar2.mo104548a("[QRProfile] CACHE " + str + "=" + str2, new Object[0]);
                if (aVar != null) {
                    HashMap hashMap = this.f93796d;
                    if (hashMap != null) {
                        str3 = (String) hashMap.get(str);
                    } else {
                        str3 = null;
                    }
                    aVar.mo95330b(str, str2, str3);
                }
                return;
            }
            if (!this.f93793a.contains(str)) {
                aVar2.mo104548a("[QRProfile] GET SERVER " + str, new Object[0]);
                this.f93793a.add(str);
                m98502h(str);
            }
            if (aVar != null) {
                HashSet hashSet = (HashSet) this.f93794b.get(str);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    this.f93794b.put(str, hashSet);
                }
                hashSet.add(aVar);
                aVar2.mo104548a("[QRProfile] CALLBACKS " + str + "=" + hashSet.size(), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: n */
    public final synchronized void m98508n(List list) {
        ArrayList arrayList;
        try {
            AbstractC19074t.m100208f(list, "listUid");
            try {
                AbstractC20110a.f98889a.mo104548a("[QRProfile] preload listUid=" + list.size(), new Object[0]);
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    aVar.mo104548a("[QRProfile] preload " + str, new Object[0]);
                    String str2 = (String) this.f93795c.get(str);
                    if (str2 != null) {
                        aVar.mo104548a("[QRProfile] preload CACHE " + str + "=" + str2, new Object[0]);
                    } else if (this.f93793a.contains(str)) {
                        aVar.mo104548a("[QRProfile] preload REQUESTING SERVER " + str, new Object[0]);
                    } else {
                        this.f93793a.add(str);
                        arrayList.add(str);
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            if (arrayList.isEmpty()) {
                AbstractC20110a.f98889a.mo104548a("[QRProfile] preload already", new Object[0]);
            } else {
                m98501g(arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
