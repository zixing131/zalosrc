package ag0;

import ae.C0766k;
import am.AbstractC0906d0;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import ck.C3566g;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.zviews.PhoneBookView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ls.C22642b;
import me0.AbstractC23028c0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23056e6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import me0.C23046d7;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21916c;
import p304ks.C21919e;
import p304ks.C21923i;
import p304ks.C21927m;
import p304ks.C21928n;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p371nv.C23952g;
import p716zh.C31901e8;
import pm0.C24865v;
import su.C26388b;
import vg.AbstractC28218w3;
import vg.C28203u6;

/* renamed from: ag0.x */
/* loaded from: classes.dex */
public abstract class AbstractC0852x {

    /* renamed from: h */
    static d f3063h;

    /* renamed from: a */
    static final AtomicInteger f3056a = new AtomicInteger(0);

    /* renamed from: b */
    static final AtomicBoolean f3057b = new AtomicBoolean(false);

    /* renamed from: c */
    static final AtomicBoolean f3058c = new AtomicBoolean(false);

    /* renamed from: d */
    static final AtomicBoolean f3059d = new AtomicBoolean(false);

    /* renamed from: e */
    public static final Map f3060e = Collections.synchronizedMap(new HashMap());

    /* renamed from: f */
    public static final AtomicInteger f3061f = new AtomicInteger(0);

    /* renamed from: g */
    public static boolean f3062g = false;

    /* renamed from: i */
    static int f3064i = 0;

    /* renamed from: j */
    static boolean f3065j = false;

    /* renamed from: k */
    static final List f3066k = new ArrayList();

    /* renamed from: ag0.x$a */
    /* loaded from: classes6.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f3067a;

        /* renamed from: b */
        final /* synthetic */ boolean f3068b;

        /* renamed from: c */
        final /* synthetic */ String f3069c;

        a(int i11, boolean z11, String str) {
            this.f3067a = i11;
            this.f3068b = z11;
            this.f3069c = str;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("submitPhoneContactsChanged error:");
                sb2.append(c20096c);
                AtomicInteger atomicInteger = AbstractC0852x.f3056a;
                if (atomicInteger.incrementAndGet() > 3) {
                    if (c20096c.m104491c() != -69) {
                        atomicInteger.set(5);
                        AbstractC0852x.f3063h.sendMessageDelayed(Message.obtain(AbstractC0852x.f3063h, 2, new e(this.f3067a)), 1800000L);
                    } else {
                        atomicInteger.set(0);
                    }
                } else {
                    AbstractC0852x.f3063h.sendMessageDelayed(Message.obtain(AbstractC0852x.f3063h, 2, new e(this.f3067a)), 300000 / Math.max(1, 4 - atomicInteger.get()));
                }
                AbstractC0852x.f3061f.incrementAndGet();
                AbstractC0852x.f3059d.set(false);
                AbstractC0852x.f3057b.set(false);
                C23744a.m124114c().m124116d(6060, Integer.valueOf(c20096c.m104491c()));
                PhoneBookView.m82590jM(c20096c.m104491c());
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PhoneContactWorker", e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int length;
            JSONObject optJSONObject;
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("submitPhoneContactsChanged success:");
                sb2.append(obj);
                JSONObject optJSONObject2 = ((JSONObject) obj).optJSONObject("data");
                ArrayList arrayList = new ArrayList();
                String str = "";
                if (optJSONObject2 != null) {
                    if (this.f3068b && optJSONObject2.optInt("code", 0) == 23000 && (optJSONObject = optJSONObject2.optJSONObject("error_title")) != null) {
                        str = optJSONObject.toString();
                    }
                    JSONArray optJSONArray = optJSONObject2.optJSONArray("list");
                    if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                        for (int i11 = 0; i11 < length; i11++) {
                            try {
                                JSONObject optJSONObject3 = optJSONArray.optJSONObject(i11);
                                if (optJSONObject3 != null) {
                                    String optString = optJSONObject3.optString("phone");
                                    String optString2 = optJSONObject3.optString("uid");
                                    if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                                        arrayList.add(new C1483e(optString2, optString));
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (!arrayList.isEmpty() && !this.f3068b) {
                            AbstractC0852x.m2329F(arrayList, true);
                        }
                    }
                }
                AbstractC0852x.m2349f(arrayList);
                AbstractC0852x.f3061f.incrementAndGet();
                AbstractC0852x.f3056a.set(0);
                AbstractC0852x.f3059d.set(false);
                AbstractC0852x.f3057b.set(false);
                AbstractC0852x.f3063h.sendMessage(AbstractC0852x.f3063h.obtainMessage(1, new e(this.f3068b, this.f3069c, str)));
                if (this.f3068b) {
                    C21923i.m114291c("Trigger get friend http from submit phonebook");
                    AbstractC23309i.m121757bj(0);
                    AbstractC23309i.m121728as(0L);
                }
                AbstractC23309i.m120830Cj(2);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PhoneContactWorker", e11);
            }
        }
    }

    /* renamed from: ag0.x$b */
    /* loaded from: classes6.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    long[] jArr = AbstractC23304d.f113397j;
                    AbstractC23309i.m121691Zt(currentTimeMillis + jArr[AbstractC0852x.f3064i]);
                    if (c20096c != null && c20096c.m104491c() == -69) {
                        AbstractC23309i.m121691Zt(System.currentTimeMillis() + 21600000);
                    }
                    int i11 = AbstractC0852x.f3064i + 1;
                    AbstractC0852x.f3064i = i11;
                    if (i11 >= jArr.length) {
                        AbstractC0852x.f3064i = 0;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                AbstractC0852x.f3065j = false;
            } catch (Throwable th2) {
                AbstractC0852x.f3065j = false;
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC23309i.m122105kr(System.currentTimeMillis());
            AbstractC23309i.m121691Zt(0L);
            AbstractC0852x.f3065j = false;
        }
    }

    /* renamed from: ag0.x$c */
    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a */
        public List f3070a;

        /* renamed from: g */
        public List f3076g;

        /* renamed from: i */
        public List f3078i;

        /* renamed from: j */
        public List f3079j;

        /* renamed from: k */
        public int f3080k;

        /* renamed from: b */
        public String f3071b = "";

        /* renamed from: c */
        public String f3072c = "";

        /* renamed from: d */
        public String f3073d = "";

        /* renamed from: e */
        public String f3074e = "";

        /* renamed from: f */
        public String f3075f = "";

        /* renamed from: h */
        public String f3077h = "";

        /* renamed from: l */
        public boolean f3081l = false;

        /* renamed from: ag0.x$c$a */
        /* loaded from: classes6.dex */
        public static class a {

            /* renamed from: a */
            public String f3082a = "";

            /* renamed from: b */
            public String f3083b = "";

            /* renamed from: c */
            public String f3084c = "";

            /* renamed from: d */
            public String f3085d = "";

            /* renamed from: a */
            public JSONObject m2371a() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("code", "");
                    jSONObject.put("country", this.f3082a);
                    jSONObject.put("street", this.f3083b);
                    jSONObject.put("city", this.f3084c);
                    jSONObject.put("zip", this.f3085d);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                return jSONObject;
            }

            /* renamed from: b */
            public boolean m2372b() {
                if (TextUtils.isEmpty(this.f3082a) && TextUtils.isEmpty(this.f3083b) && TextUtils.isEmpty(this.f3084c) && TextUtils.isEmpty(this.f3085d)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        public JSONObject m2370a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.f3071b);
                List list = this.f3070a;
                if (list != null && !list.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = this.f3070a.iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put("phone", jSONArray);
                }
                jSONObject.put("org", this.f3072c);
                jSONObject.put("dept", this.f3073d);
                jSONObject.put("job", this.f3074e);
                jSONObject.put("dob", this.f3075f);
                jSONObject.put("note", this.f3077h);
                List list2 = this.f3076g;
                if (list2 != null && !list2.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = this.f3076g.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put((String) it2.next());
                    }
                    jSONObject.put("email", jSONArray2);
                }
                List list3 = this.f3079j;
                if (list3 != null && !list3.isEmpty()) {
                    JSONArray jSONArray3 = new JSONArray();
                    Iterator it3 = this.f3079j.iterator();
                    while (it3.hasNext()) {
                        jSONArray3.put(((a) it3.next()).m2371a());
                    }
                    jSONObject.put("address", jSONArray3);
                }
                List list4 = this.f3078i;
                if (list4 != null && !list4.isEmpty()) {
                    JSONArray jSONArray4 = new JSONArray();
                    for (String str : this.f3078i) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("username", str);
                        jSONObject2.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, "");
                        jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
                        jSONArray4.put(jSONObject2);
                    }
                    jSONObject.put("social", jSONArray4);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* renamed from: ag0.x$d */
    /* loaded from: classes.dex */
    public static class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Object obj = message.obj;
                    if (obj instanceof e) {
                        e eVar = (e) obj;
                        AbstractC0852x.f3063h.removeMessages(1);
                        AbstractC0852x.m2342S(MainApplication.getAppContext(), eVar.f3086a, eVar.f3088c, eVar.f3089d);
                        return;
                    }
                    return;
                case 2:
                    Object obj2 = message.obj;
                    if (obj2 instanceof e) {
                        AbstractC0852x.f3063h.removeMessages(2);
                        AbstractC0852x.m2353j(MainApplication.getAppContext(), ((e) obj2).f3087b);
                        return;
                    }
                    return;
                case 3:
                    Object obj3 = message.obj;
                    if (obj3 instanceof SensitiveData) {
                        AbstractC0852x.f3063h.removeMessages(3);
                        AbstractC0852x.m2356m(MainApplication.getAppContext(), AbstractC0852x.f3057b.get() ? 1 : 0, (SensitiveData) obj3);
                        return;
                    }
                    return;
                case 4:
                    Object obj4 = message.obj;
                    if (obj4 instanceof SensitiveData) {
                        SensitiveData sensitiveData = (SensitiveData) obj4;
                        AbstractC0852x.f3063h.removeMessages(4);
                        AbstractC0852x.m2356m(MainApplication.getAppContext(), AbstractC0852x.f3057b.get() ? 1 : 0, sensitiveData);
                        d dVar = AbstractC0852x.f3063h;
                        dVar.sendMessageDelayed(dVar.obtainMessage(4, sensitiveData), 21600000L);
                        return;
                    }
                    return;
                case 5:
                    AbstractC0852x.f3063h.removeMessages(5);
                    AbstractC0852x.m2326C();
                    return;
                case 6:
                    AbstractC0852x.m2362s((List) message.obj);
                    return;
                case 7:
                    AbstractC0852x.m2362s((List) message.obj);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: ag0.x$e */
    /* loaded from: classes6.dex */
    public static class e {

        /* renamed from: a */
        public String f3086a;

        /* renamed from: b */
        public int f3087b;

        /* renamed from: c */
        public boolean f3088c;

        /* renamed from: d */
        public String f3089d;

        public e(int i11) {
            this.f3086a = null;
            this.f3088c = false;
            this.f3089d = "";
            this.f3087b = i11;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("lastMd5= ");
            sb2.append(this.f3086a);
            sb2.append(" submitType= ");
            if (this.f3087b == 0) {
                str = "SCHEDULE";
            } else {
                str = "MANUAL";
            }
            sb2.append(str);
            sb2.append(" isSubmitFull= ");
            sb2.append(this.f3088c);
            return sb2.toString();
        }

        public e(boolean z11, String str, String str2) {
            this.f3086a = str;
            this.f3088c = z11;
            this.f3089d = str2;
        }
    }

    /* renamed from: ag0.x$f */
    /* loaded from: classes6.dex */
    public static class f extends C31901e8 {

        /* renamed from: F */
        a f3090F;

        /* renamed from: ag0.x$f$a */
        /* loaded from: classes6.dex */
        public enum a {
            NO_ACTION,
            INSERT,
            DELETE,
            UPDATE
        }

        public f(C31901e8 c31901e8) {
            super(c31901e8);
            this.f3090F = a.NO_ACTION;
        }

        /* renamed from: B */
        public a m2373B() {
            return this.f3090F;
        }

        /* renamed from: C */
        public void m2374C(a aVar) {
            this.f3090F = aVar;
        }
    }

    /* renamed from: ag0.x$g */
    /* loaded from: classes6.dex */
    public static class g {

        /* renamed from: e */
        static volatile g f3096e;

        /* renamed from: a */
        AtomicBoolean f3097a = new AtomicBoolean(false);

        /* renamed from: b */
        AtomicBoolean f3098b = new AtomicBoolean(false);

        /* renamed from: c */
        AtomicBoolean f3099c = new AtomicBoolean(false);

        /* renamed from: d */
        Context f3100d;

        g() {
        }

        /* renamed from: b */
        public static synchronized g m2376b() {
            g gVar;
            synchronized (g.class) {
                synchronized (g.class) {
                    try {
                        if (f3096e == null) {
                            f3096e = new g();
                        }
                        gVar = f3096e;
                    } finally {
                    }
                }
                return gVar;
            }
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001c, B:10:0x0025, B:12:0x0029, B:14:0x0033, B:15:0x0042, B:17:0x0048, B:20:0x0050, B:23:0x0056, B:31:0x0066, B:33:0x0074, B:35:0x0084, B:37:0x0090, B:59:0x009a, B:41:0x009d, B:44:0x00ab, B:48:0x00b4, B:50:0x00bb, B:52:0x00c0, B:54:0x00cd, B:56:0x00d2, B:65:0x00de, B:67:0x00e4), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00cd A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:3:0x000a, B:5:0x0012, B:8:0x001c, B:10:0x0025, B:12:0x0029, B:14:0x0033, B:15:0x0042, B:17:0x0048, B:20:0x0050, B:23:0x0056, B:31:0x0066, B:33:0x0074, B:35:0x0084, B:37:0x0090, B:59:0x009a, B:41:0x009d, B:44:0x00ab, B:48:0x00b4, B:50:0x00bb, B:52:0x00c0, B:54:0x00cd, B:56:0x00d2, B:65:0x00de, B:67:0x00e4), top: B:2:0x000a }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        int m2377a() {
            boolean z11;
            int m120923F1;
            List m114265d;
            int size;
            new JSONArray();
            int m122452u1 = AbstractC23309i.m122452u1();
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (this.f3098b.get() && this.f3097a.get()) {
                if (this.f3099c.compareAndSet(false, true)) {
                    C21919e c21919e = AbstractC23304d.f113453x;
                    if (c21919e != null && (size = (m114265d = c21919e.m114265d()).size()) > 0) {
                        List<C31901e8> m2802h = AbstractC0906d0.m2802h(this.f3100d);
                        HashMap hashMap = new HashMap();
                        for (C31901e8 c31901e8 : m2802h) {
                            if (c31901e8 != null && c31901e8.m153301s()) {
                                hashMap.put(c31901e8.m153298m(), c31901e8);
                            }
                        }
                        long j11 = 0;
                        for (int i11 = 0; i11 < size; i11++) {
                            C22642b c22642b = (C22642b) m114265d.get(i11);
                            if (hashMap.containsKey(c22642b.f111043b)) {
                                C31901e8 c31901e82 = (C31901e8) hashMap.get(c22642b.f111043b);
                                if (!TextUtils.isEmpty(c22642b.f111044c) && c22642b.f111044c.equals(c31901e82.m153295h())) {
                                    j11++;
                                    if (j11 > 20) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (j11 >= Math.min(20, size)) {
                            z11 = true;
                            m120923F1 = AbstractC23309i.m120923F1();
                            if (m120923F1 != 1 && m120923F1 != 2) {
                                boolean m118296c = AbstractC23057e7.m118296c();
                                if (!z11) {
                                    AbstractC23309i.m120755Ai(1);
                                    if (!m118296c) {
                                        AbstractC23309i.m121139Kw(3);
                                        AbstractC23057e7.m118305l(true);
                                        AbstractC23304d.f113443u1.set(true);
                                    }
                                    m122452u1 = 2;
                                } else {
                                    AbstractC23309i.m120755Ai(0);
                                    if (!m118296c) {
                                        AbstractC23309i.m121139Kw(3);
                                        AbstractC23057e7.m118305l(false);
                                        AbstractC23304d.f113443u1.set(true);
                                    }
                                    m122452u1 = 3;
                                }
                            }
                        }
                    }
                    z11 = false;
                    m120923F1 = AbstractC23309i.m120923F1();
                    if (m120923F1 != 1) {
                        boolean m118296c2 = AbstractC23057e7.m118296c();
                        if (!z11) {
                        }
                    }
                }
                if (AbstractC23309i.m122377s0() != 1) {
                    AbstractC23309i.m121986hl(false);
                }
                AbstractC23309i.m120830Cj(m122452u1);
                AbstractC23309i.m121235Nh(true);
                return m122452u1;
            }
            return m122452u1;
        }

        /* renamed from: c */
        public int m2378c(Context context) {
            this.f3100d = context;
            this.f3098b.set(true);
            return m2377a();
        }

        /* renamed from: d */
        public void m2379d(boolean z11) {
            try {
                this.f3097a.set(z11);
                if (z11) {
                    if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112032i) == 0) {
                        AbstractC0852x.m2338O(new SensitiveData("phonebook_sync_on_get_server_phonebook_done", "phonebook_auto_scan"));
                    } else {
                        AbstractC23309i.m120755Ai(-1);
                    }
                    m2377a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: A */
    public static void m2324A(String str) {
    }

    /* renamed from: B */
    private static List m2325B(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31901e8 c31901e8 = (C31901e8) it.next();
            c31901e8.m153306z(AbstractC23056e6.m118285k(c31901e8.m153297j()));
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C31901e8 c31901e82 = (C31901e8) it2.next();
            String m153298m = c31901e82.m153298m();
            if (!TextUtils.isEmpty(m153298m)) {
                C31901e8 c31901e83 = (C31901e8) hashMap.get(m153298m);
                if (c31901e83 != null && !TextUtils.isEmpty(c31901e83.m153297j())) {
                    if (c31901e83.m153293e() > c31901e82.m153293e()) {
                        hashMap.put(m153298m, c31901e82);
                    }
                } else {
                    hashMap.put(m153298m, c31901e82);
                }
            }
        }
        for (C31901e8 c31901e84 : hashMap.values()) {
            if (TextUtils.isEmpty(c31901e84.m153295h())) {
                c31901e84.m153305y(c31901e84.m153297j());
            }
        }
        return new ArrayList(hashMap.values());
    }

    /* renamed from: C */
    static void m2326C() {
        C21927m.m114302u().m114314L();
        C18644n.m98524E();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m2327D(Context context) {
        Throwable th2;
        Cursor cursor;
        if (!C8937j0.m47663l("phonebook_sync_scan_favorite_contacts")) {
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("start Favorite getPhoneContacts:");
            sb2.append(currentTimeMillis);
            ArrayList arrayList = new ArrayList();
            C8937j0.m47661j().m50393d(new SensitiveData("phonebook_sync_scan_favorite_contacts", "phonebook_sync"));
            cursor = C26388b.m135984j(context, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "starred='1'", null, "display_name COLLATE LOCALIZED ASC", true);
            if (cursor != null) {
                try {
                    try {
                        if (cursor.getCount() > 0) {
                            cursor.moveToFirst();
                            int columnIndex = cursor.getColumnIndex("display_name");
                            int columnIndex2 = cursor.getColumnIndex("data1");
                            int columnIndex3 = cursor.getColumnIndex("_id");
                            do {
                                try {
                                    String string = cursor.getString(columnIndex);
                                    String string2 = cursor.getString(columnIndex2);
                                    long j11 = cursor.getLong(columnIndex3);
                                    if (string != null) {
                                        string = string.trim();
                                    }
                                    C31901e8 c31901e8 = new C31901e8(string, string2);
                                    c31901e8.m153304x(j11);
                                    if (c31901e8.m153297j() != null && c31901e8.m153297j().length() > 9) {
                                        c31901e8.m153306z(AbstractC23056e6.m118285k(c31901e8.m153297j()));
                                        arrayList.add(c31901e8);
                                    }
                                } catch (Exception e11) {
                                    AbstractC23350e.m122776f("PhoneContactWorker", e11);
                                }
                            } while (cursor.moveToNext());
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        C8937j0.m47661j().m50392b("phonebook_sync_scan_favorite_contacts", true);
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                } catch (Exception unused) {
                    C8937j0.m47661j().m50392b("phonebook_sync_scan_favorite_contacts", false);
                    C8937j0.m47661j().m50392b("phonebook_sync_scan_favorite_contacts", true);
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                    return null;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("end getPhoneContacts:");
            sb3.append(System.currentTimeMillis() - currentTimeMillis);
            C8937j0.m47661j().m50392b("phonebook_sync_scan_favorite_contacts", true);
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            cursor = null;
        } catch (Throwable th4) {
            th2 = th4;
            cursor = null;
            C8937j0.m47661j().m50392b("phonebook_sync_scan_favorite_contacts", true);
            if (cursor != null) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m2328E(Context context, SensitiveData sensitiveData) {
        Throwable th2;
        Cursor cursor;
        Cursor cursor2;
        long currentTimeMillis;
        ArrayList arrayList;
        try {
            currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("start getPhoneContacts:");
            sb2.append(currentTimeMillis);
            f3060e.clear();
            arrayList = new ArrayList();
        } catch (Exception unused) {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            C8937j0.m47661j().m50393d(sensitiveData);
            cursor2 = C26388b.m135984j(context, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "display_name COLLATE LOCALIZED ASC", true);
            if (cursor2 != null) {
                try {
                    try {
                        if (cursor2.getCount() > 0) {
                            cursor2.moveToFirst();
                            int columnIndex = cursor2.getColumnIndex("display_name");
                            int columnIndex2 = cursor2.getColumnIndex("data1");
                            int columnIndex3 = cursor2.getColumnIndex("_id");
                            int columnIndex4 = cursor2.getColumnIndex("account_type");
                            do {
                                try {
                                    String string = cursor2.getString(columnIndex);
                                    String string2 = cursor2.getString(columnIndex2);
                                    long j11 = cursor2.getLong(columnIndex3);
                                    if (string != null) {
                                        string = string.trim();
                                    }
                                    C31901e8 c31901e8 = new C31901e8(string, string2);
                                    c31901e8.m153304x(j11);
                                    if (columnIndex4 > -1) {
                                        c31901e8.m153303w(cursor2.getString(columnIndex4));
                                    }
                                    if (c31901e8.m153297j() != null && c31901e8.m153297j().length() > 9) {
                                        arrayList.add(c31901e8);
                                    }
                                } catch (Exception e11) {
                                    AbstractC23350e.m122776f("PhoneContactWorker", e11);
                                }
                            } while (cursor2.moveToNext());
                            AbstractC23309i.m122000hz(0);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("end getPhoneContacts:");
                            sb3.append(System.currentTimeMillis() - currentTimeMillis);
                            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                            if (cursor2 != null) {
                                try {
                                    cursor2.close();
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                            }
                            return arrayList;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        cursor = cursor2;
                        C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                        if (cursor == null) {
                            try {
                                cursor.close();
                                throw th2;
                            } catch (Exception e13) {
                                e13.printStackTrace();
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                } catch (Exception unused2) {
                    AbstractC23309i.m122000hz(4);
                    C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
                    C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                    if (cursor2 == null) {
                        try {
                            cursor2.close();
                            return null;
                        } catch (Exception e14) {
                            e14.printStackTrace();
                            return null;
                        }
                    }
                    return null;
                }
            }
            if (cursor2 != null && cursor2.getCount() <= 0) {
                AbstractC23309i.m122000hz(3);
            } else if (cursor2 == null) {
                AbstractC23309i.m122000hz(1);
            }
            StringBuilder sb32 = new StringBuilder();
            sb32.append("end getPhoneContacts:");
            sb32.append(System.currentTimeMillis() - currentTimeMillis);
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            if (cursor2 != null) {
            }
            return arrayList;
        } catch (Exception unused3) {
            cursor2 = null;
            AbstractC23309i.m122000hz(4);
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            if (cursor2 == null) {
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            cursor = null;
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            if (cursor == null) {
            }
        }
    }

    /* renamed from: F */
    public static void m2329F(List list, boolean z11) {
        d dVar;
        if (list != null && !list.isEmpty() && (dVar = f3063h) != null) {
            if (z11) {
                dVar.sendMessage(dVar.obtainMessage(7, list));
            } else {
                dVar.sendMessage(dVar.obtainMessage(6, list));
            }
        }
    }

    /* renamed from: G */
    public static void m2330G() {
        d dVar = f3063h;
        if (dVar != null) {
            dVar.removeMessages(5);
            f3063h.sendEmptyMessageDelayed(5, 100L);
        }
    }

    /* renamed from: H */
    public static void m2331H() {
        try {
            List<C3566g> list = f3066k;
            synchronized (list) {
                try {
                    m2368y();
                    boolean z11 = false;
                    for (C3566g c3566g : list) {
                        if (c3566g.f15123f == 2 && c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            c3566g.f15123f = 3;
                            z11 = true;
                        }
                    }
                    if (z11) {
                        m2335L();
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I */
    public static void m2332I(String str) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!AbstractC23309i.m121418Sf()) {
            return;
        }
        C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), str);
        if (m2801g != null && !TextUtils.isEmpty(m2801g.m153298m())) {
            List<C3566g> list = f3066k;
            synchronized (list) {
                try {
                    m2368y();
                    for (C3566g c3566g : list) {
                        if (c3566g.f15121d.equals(m2801g.m153298m()) && c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            c3566g.f15123f = 3;
                            m2335L();
                            return;
                        }
                    }
                    return;
                } finally {
                }
            }
        }
        List<C3566g> list2 = f3066k;
        synchronized (list2) {
            try {
                m2368y();
                for (C3566g c3566g2 : list2) {
                    if (c3566g2.f15119b.equals(str) && c3566g2.f15118a.equals(CoreUtility.f89233i)) {
                        c3566g2.f15123f = 3;
                        m2335L();
                        return;
                    }
                }
                return;
            } finally {
            }
        }
        e11.printStackTrace();
    }

    /* renamed from: J */
    public static void m2333J() {
        AbstractC23309i.m121140Kx(true);
        f3059d.set(false);
        f3058c.set(false);
        f3057b.set(false);
        AbstractC23309i.m121465Tp("");
        AbstractC23309i.m121326Py(0L);
        f3061f.set(0);
        AbstractC23309i.m122626yr(0L);
    }

    /* renamed from: K */
    public static void m2334K(Set set) {
        try {
            if (set.isEmpty()) {
                return;
            }
            List<C3566g> list = f3066k;
            synchronized (list) {
                try {
                    m2368y();
                    boolean z11 = false;
                    for (C3566g c3566g : list) {
                        if (c3566g.f15123f == 3 && c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            if (set.contains(c3566g.f15118a + ";" + c3566g.f15119b + ";" + c3566g.f15121d)) {
                                c3566g.f15123f = 2;
                                z11 = true;
                            }
                        }
                    }
                    if (z11) {
                        m2335L();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    public static void m2335L() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = f3066k;
            synchronized (list) {
                try {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        List list2 = f3066k;
                        C3566g c3566g = (C3566g) list2.get(size);
                        if (c3566g.f15123f == 3 && System.currentTimeMillis() - c3566g.f15122e > 172800000) {
                            list2.remove(size);
                        } else {
                            jSONArray.put(c3566g.m18122a());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            AbstractC23309i.m120765As(jSONArray.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    public static void m2336M(String str, String str2) {
        try {
            Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.putExtra("phone", str2);
            intent.putExtra("name", str);
            intent.setType("vnd.android.cursor.item/contact");
            intent.addFlags(268468224);
            MainApplication.getAppContext().startActivity(intent);
            ZaloBubbleActivity.m57031a5();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030 A[Catch: Exception -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0017, blocks: (B:8:0x0013, B:20:0x0030), top: B:2:0x0001 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0018 -> B:9:0x0033). Please report as a decompilation issue!!! */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void m2337N(List list) {
        FileWriter fileWriter = null;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            try {
                String m118088h = AbstractC23028c0.m118088h(list);
                FileWriter fileWriter2 = new FileWriter(C20131e.f99303a.m104933O());
                try {
                    fileWriter2.write(m118088h);
                    fileWriter2.close();
                } catch (Exception e12) {
                    e = e12;
                    fileWriter = fileWriter2;
                    AbstractC23350e.m122776f("PhoneContactWorker", e);
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                } catch (OutOfMemoryError e13) {
                    e = e13;
                    fileWriter = fileWriter2;
                    AbstractC23350e.m122776f("PhoneContactWorker", e);
                    if (fileWriter != null) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (Exception e14) {
                            e14.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e15) {
                e = e15;
            } catch (OutOfMemoryError e16) {
                e = e16;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: O */
    public static void m2338O(SensitiveData sensitiveData) {
        if (f3063h == null) {
            return;
        }
        SensitiveData m118247j = C23046d7.m118247j(sensitiveData, "phonebook");
        if (!C8937j0.m47663l(m118247j.m35528c())) {
            if (C23046d7.m118246i(m118247j.m35528c())) {
                AbstractC19444a.m101697e(new Runnable() { // from class: ag0.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC0852x.m2367x();
                    }
                });
            }
        } else {
            d dVar = f3063h;
            dVar.sendMessage(dVar.obtainMessage(3, m118247j));
        }
    }

    /* renamed from: P */
    public static void m2339P() {
        try {
            if (!AbstractC23309i.m121418Sf()) {
                return;
            }
            List<C3566g> list = f3066k;
            synchronized (list) {
                try {
                    m2368y();
                    boolean z11 = false;
                    for (C3566g c3566g : list) {
                        if (c3566g.f15123f == 0 && c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            z11 = true;
                            c3566g.f15123f = 1;
                        }
                    }
                    if (z11) {
                        m2335L();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    public static void m2340Q(SensitiveData sensitiveData) {
        m2333J();
        f3057b.set(true);
        m2338O(sensitiveData);
    }

    /* renamed from: R */
    static void m2341R(Context context, String str, boolean z11, int i11, int i12, String str2) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("jsonContact:");
            sb2.append(str);
            if (!str2.equals(AbstractC23309i.m122530w5())) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a(i11, z11, str2));
                c0766k.mo1389A8(str, str2, true, AbstractC23309i.m121083Jd(), z11, AbstractC23309i.m121706a7(), i12, i11);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("submitPhoneContactsChanged - override:");
                sb3.append(z11);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                AbstractC23309i.m121326Py(currentTimeMillis);
                AbstractC23309i.m122181mr(currentTimeMillis);
                f3059d.set(false);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("PhoneContactWorker", e11);
        }
    }

    /* renamed from: S */
    static void m2342S(Context context, String str, boolean z11, String str2) {
        List m2802h = AbstractC0906d0.m2802h(context);
        m2337N(m2802h);
        AbstractC23309i.m121140Kx(false);
        if (z11) {
            AbstractC23309i.m121727ar(System.currentTimeMillis());
            if (m2802h.size() > 0 && AbstractC23309i.m121715af()) {
                AbstractC23309i.m121986hl(false);
                AbstractC23309i.m120754Ah(false);
                AbstractC23309i.m120755Ai(-2);
                AbstractC23309i.m121709aA(false);
                C21919e c21919e = AbstractC23304d.f113453x;
                if (c21919e != null) {
                    c21919e.m114262a();
                }
                C7960e.m41971c6().m42467mb();
                g.m2376b().m2379d(false);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        AbstractC23309i.m121326Py(currentTimeMillis);
        AbstractC23309i.m122181mr(currentTimeMillis);
        AbstractC23309i.m121465Tp(str);
        C23744a.m124114c().m124116d(6060, str2);
        PhoneBookView.m82591kM(0, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:            if (r7.moveToFirst() != false) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:            r8.add(java.lang.Long.valueOf(r7.getLong(r7.getColumnIndex("contact_id"))));     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[Catch: all -> 0x006f, Exception -> 0x007d, Merged into TryCatch #3 {all -> 0x006f, Exception -> 0x007d, blocks: (B:6:0x000e, B:8:0x0024, B:10:0x0059, B:17:0x005f, B:23:0x0073, B:18:0x0076, B:13:0x0080, B:24:0x0083, B:27:0x008a, B:29:0x00ee, B:35:0x0107), top: B:5:0x000e }] */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m2343T(Context context, C31901e8 c31901e8, String str, SensitiveData sensitiveData) {
        Cursor m135981g;
        ArrayList arrayList;
        if (context != null && c31901e8 != null) {
            try {
                if (C8937j0.m47663l(sensitiveData.m35528c())) {
                    ContentResolver m135977c = C26388b.m135977c(context);
                    String[] strArr = {String.valueOf(c31901e8.m153294g())};
                    C8937j0.m47661j().m50393d(sensitiveData);
                    m135981g = C26388b.m135981g(m135977c, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"_id", "contact_id"}, "_id = ?", strArr, null, true);
                    arrayList = new ArrayList();
                    if (m135981g != null) {
                    }
                    if (arrayList.size() != 1) {
                        String[] strArr2 = {String.valueOf(arrayList.get(0)), "vnd.android.cursor.item/name"};
                        ArrayList<ContentProviderOperation> arrayList2 = new ArrayList<>();
                        Uri uri = ContactsContract.Data.CONTENT_URI;
                        arrayList2.add(ContentProviderOperation.newUpdate(uri).withSelection("contact_id = ? and mimetype = ?", strArr2).withValue("data2", "").withValue("data5", "").withValue("data3", "").withValue("data6", "").withValue("data4", "").build());
                        arrayList2.add(ContentProviderOperation.newUpdate(uri).withSelection("contact_id = ? and mimetype = ?", strArr2).withValue("data1", str).build());
                        if (m135977c.applyBatch("com.android.contacts", arrayList2).length > 0) {
                            f3060e.put(String.valueOf(c31901e8.m153300r()), str);
                            return 0;
                        }
                    }
                }
            } catch (Exception e11) {
                C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
                e11.printStackTrace();
                return -1;
            } finally {
                C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            }
        }
        return -1;
        if (m135981g.moveToNext()) {
        }
        try {
            m135981g.close();
        } catch (Exception unused) {
        }
        if (arrayList.size() != 1) {
        }
        return -1;
    }

    /* renamed from: c */
    public static void m2346c(C31901e8 c31901e8) {
        if (c31901e8 == null) {
            return;
        }
        try {
            List<C3566g> list = f3066k;
            synchronized (list) {
                try {
                    m2368y();
                    for (C3566g c3566g : list) {
                        if (c3566g.f15121d.equals(c31901e8.m153298m()) && c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            return;
                        }
                    }
                    C3566g c3566g2 = new C3566g();
                    c3566g2.f15118a = CoreUtility.f89233i;
                    c3566g2.f15121d = c31901e8.m153298m();
                    c3566g2.f15122e = System.currentTimeMillis();
                    c3566g2.f15120c = c31901e8.m153295h();
                    if (c31901e8.m153300r() > 0) {
                        c3566g2.f15119b = String.valueOf(c31901e8.m153300r());
                        c3566g2.f15123f = 0;
                    } else {
                        c3566g2.f15123f = 3;
                    }
                    f3066k.add(c3566g2);
                    m2335L();
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m2347d(List list) {
        try {
            if (AbstractC23309i.m121418Sf() && list != null && !list.isEmpty()) {
                synchronized (f3066k) {
                    try {
                        m2368y();
                        Iterator it = list.iterator();
                        boolean z11 = false;
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), str);
                            if (m2801g != null && !TextUtils.isEmpty(m2801g.m153298m())) {
                                for (C3566g c3566g : f3066k) {
                                    if (TextUtils.equals(c3566g.f15121d, m2801g.m153298m()) && CoreUtility.f89233i.equals(c3566g.f15118a)) {
                                        c3566g.f15123f = 3;
                                        z11 = true;
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                for (C3566g c3566g2 : f3066k) {
                                    if (TextUtils.equals(c3566g2.f15119b, str) && CoreUtility.f89233i.equals(c3566g2.f15118a)) {
                                        c3566g2.f15123f = 3;
                                        z11 = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (z11) {
                            m2335L();
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m2348e() {
        try {
            if (AbstractC23309i.m121418Sf() && AbstractC23309i.m121828df() && System.currentTimeMillis() - AbstractC23309i.m122053jd() > AbstractC23309i.m121591X3()) {
                AbstractC23309i.m122361rl(false);
                C23744a.m124114c().m124116d(6084, new Object[0]);
                m2331H();
                AbstractC23647d.m123897g("5801169");
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public static void m2349f(List list) {
        boolean z11;
        boolean z12;
        try {
            if (!AbstractC23309i.m121418Sf()) {
                return;
            }
            HashSet hashSet = new HashSet();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add((String) ((C1483e) it.next()).f6374a);
                }
            }
            List<C3566g> list2 = f3066k;
            synchronized (list2) {
                try {
                    m2368y();
                    z11 = false;
                    z12 = false;
                    for (C3566g c3566g : list2) {
                        if (c3566g.f15123f == 1 && c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            if (!hashSet.contains(c3566g.f15119b) && AbstractC21935u.m114555v(c3566g.f15119b, true)) {
                                c3566g.f15123f = 2;
                                z11 = true;
                                z12 = true;
                            } else {
                                c3566g.f15123f = 3;
                                z11 = true;
                            }
                        } else if (c3566g.f15123f == 2 && c3566g.f15118a.equals(CoreUtility.f89233i) && hashSet.contains(c3566g.f15119b)) {
                            c3566g.f15123f = 3;
                            z11 = true;
                        }
                    }
                    if (z11) {
                        m2335L();
                    }
                } finally {
                }
            }
            if (z12) {
                AbstractC23309i.m121030Hy(System.currentTimeMillis());
                AbstractC23309i.m122361rl(true);
            }
            if (z11) {
                C23744a.m124114c().m124116d(6084, new Object[0]);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m2350g(List list, long j11) {
        List<C31901e8> m2369z;
        try {
            if (!AbstractC23309i.m121418Sf() || list == null || (m2369z = m2369z()) == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashMap.put(((C31901e8) it.next()).m153298m(), Boolean.TRUE);
            }
            HashSet hashSet = new HashSet();
            List list2 = f3066k;
            synchronized (list2) {
                try {
                    m2368y();
                    boolean z11 = false;
                    for (int size = list2.size() - 1; size >= 0; size--) {
                        List list3 = f3066k;
                        C3566g c3566g = (C3566g) list3.get(size);
                        if (c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            if (hashMap.containsKey(c3566g.f15121d)) {
                                list3.remove(size);
                                z11 = true;
                            } else {
                                hashSet.add(c3566g.f15121d);
                            }
                        }
                    }
                    int size2 = f3066k.size();
                    int i11 = 0;
                    for (C31901e8 c31901e8 : m2369z) {
                        if (!hashMap.containsKey(c31901e8.m153298m()) && !hashSet.contains(c31901e8.m153298m())) {
                            C3566g c3566g2 = new C3566g();
                            c3566g2.f15118a = CoreUtility.f89233i;
                            c3566g2.f15121d = c31901e8.m153298m();
                            c3566g2.f15122e = System.currentTimeMillis();
                            c3566g2.f15120c = c31901e8.m153295h();
                            C31901e8 m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), c31901e8.m153298m());
                            if (m2800f != null && m2800f.m153300r() > 0) {
                                c3566g2.f15119b = String.valueOf(m2800f.m153300r());
                                c3566g2.f15123f = 0;
                            } else {
                                c3566g2.f15123f = 3;
                            }
                            f3066k.add(c3566g2);
                            hashSet.add(c31901e8.m153298m());
                            i11++;
                            z11 = true;
                        }
                    }
                    if (i11 > AbstractC23309i.m121189M8() || (j11 != 0 && System.currentTimeMillis() - j11 > AbstractC23309i.m122091kd())) {
                        while (true) {
                            List list4 = f3066k;
                            if (size2 >= list4.size()) {
                                break;
                            }
                            ((C3566g) list4.get(size2)).f15123f = 3;
                            size2++;
                        }
                    }
                    if (z11) {
                        m2335L();
                        C23744a.m124114c().m124116d(6084, new Object[0]);
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    static void m2351h(Context context, SensitiveData sensitiveData) {
        boolean z11;
        List m2358o;
        try {
            if (f3065j) {
                return;
            }
            if (AbstractC23057e7.m118297d() && System.currentTimeMillis() - AbstractC23309i.m121187M6() > 604800000) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (f3057b.get() || z11) {
                long m122238o9 = AbstractC23309i.m122238o9();
                if ((m122238o9 == 0 || (m122238o9 > 0 && System.currentTimeMillis() > m122238o9)) && (m2358o = m2358o(context, sensitiveData)) != null && !m2358o.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = m2358o.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((c) it.next()).m2370a());
                    }
                    String jSONArray2 = jSONArray.toString();
                    String m122788d = AbstractC23352g.m122788d(jSONArray2);
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new b());
                    f3065j = true;
                    c0766k.mo1570X4(jSONArray2, m122788d, true, AbstractC23309i.m121083Jd(), true, AbstractC23309i.m121706a7());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("PhoneContactWorker", e11);
        }
    }

    /* renamed from: i */
    public static void m2352i() {
        if (f3063h == null) {
            return;
        }
        f3063h.sendMessage(Message.obtain(f3063h, 2, new e(0)));
    }

    /* renamed from: j */
    static void m2353j(Context context, int i11) {
        boolean z11;
        List m2369z;
        if (!TextUtils.isEmpty(CoreUtility.f89232h) && !CoreUtility.f89232h.equals("null") && !TextUtils.isEmpty(CoreUtility.f89233i)) {
            if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112032i) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((AbstractC23057e7.m118297d() || f3057b.get()) && z11) {
                long currentTimeMillis = System.currentTimeMillis() - AbstractC23309i.m122353rd();
                AtomicInteger atomicInteger = f3061f;
                long j11 = atomicInteger.get() * 2 * 30000;
                long j12 = 0;
                if (j11 > 360000) {
                    atomicInteger.set(0);
                    j11 = 0;
                }
                if (Math.abs(currentTimeMillis) > j11) {
                    AtomicBoolean atomicBoolean = f3059d;
                    if (!atomicBoolean.get()) {
                        atomicBoolean.set(true);
                        if (AbstractC23309i.m121419Sg()) {
                            m2369z = null;
                        } else {
                            m2369z = m2369z();
                        }
                        List m2802h = AbstractC0906d0.m2802h(context);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("phoneContactListLocal:");
                        sb2.append(m2802h.size());
                        if (m2369z == null) {
                            m2369z = new ArrayList();
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("phoneContactListServer:");
                        sb3.append(m2369z.size());
                        List m2361r = m2361r(m2802h, m2369z);
                        if (m2361r != null && !m2361r.isEmpty()) {
                            if (!m2369z.isEmpty() && m2802h.isEmpty()) {
                                atomicBoolean.set(false);
                                f3057b.set(false);
                                C23744a.m124114c().m124116d(6060, 0);
                                PhoneBookView.m82590jM(0);
                                return;
                            }
                            m2339P();
                            int m122452u1 = AbstractC23309i.m122452u1();
                            boolean isEmpty = m2369z.isEmpty();
                            Collections.sort(m2361r);
                            String m2357n = m2357n(m2361r, isEmpty);
                            m2341R(context, m2357n, isEmpty, i11, m122452u1, AbstractC23352g.m122788d(m2357n));
                            return;
                        }
                        atomicBoolean.set(false);
                        f3057b.set(false);
                        C23744a.m124114c().m124116d(6060, 0);
                        PhoneBookView.m82590jM(0);
                        return;
                    }
                }
                if (f3059d.get()) {
                    j12 = 60000;
                }
                f3063h.sendMessageDelayed(Message.obtain(f3063h, 2, new e(i11)), Math.max(j11 - Math.abs(currentTimeMillis), j12));
            }
        }
    }

    /* renamed from: k */
    public static Map m2354k(Context context, List list, SensitiveData sensitiveData) {
        ArrayList<ContentProviderOperation> arrayList;
        HashMap hashMap = new HashMap();
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            try {
                int size = (list.size() + 494) / 495;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 * 495;
                    try {
                        int min = Math.min(i12 + 495, list.size());
                        arrayList = new ArrayList<>();
                        for (int i13 = i12; i13 < min; i13++) {
                            C31901e8 c31901e8 = (C31901e8) list.get(i13);
                            arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("_id=" + c31901e8.m153294g(), null).withValue("data1", c31901e8.f146559u).build());
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    try {
                        C8937j0.m47661j().m50393d(sensitiveData);
                        ContentProviderResult[] applyBatch = context.getContentResolver().applyBatch("com.android.contacts", arrayList);
                        for (int i14 = 0; i14 < applyBatch.length; i14++) {
                            if (applyBatch[i14].count.intValue() < 1 && i14 < list.size()) {
                                C31901e8 c31901e82 = (C31901e8) list.get(i14 + i12);
                                hashMap.put(Long.valueOf(c31901e82.m153294g()), c31901e82);
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        try {
                            e.printStackTrace();
                        } catch (Exception e13) {
                            e = e13;
                            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
                            e.printStackTrace();
                            if (list != null && !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    C31901e8 c31901e83 = (C31901e8) it.next();
                                    if (c31901e83 != null) {
                                        hashMap.put(Long.valueOf(c31901e83.m153294g()), c31901e83);
                                    }
                                }
                            }
                            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                            return hashMap;
                        }
                    }
                }
            } catch (Exception e14) {
                e = e14;
            }
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            return hashMap;
        } catch (Throwable th3) {
            th = th3;
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:39|(2:40|41)|(4:43|(1:45)(1:74)|46|(8:48|49|50|51|52|53|(2:57|58)|(1:56)))|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:39|40|41|(4:43|(1:45)(1:74)|46|(8:48|49|50|51|52|53|(2:57|58)|(1:56)))|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ac, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ad, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019b, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x019c, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019f, code lost:            r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:            if (r9.moveToFirst() != false) goto L238;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:            r0 = r9.getColumnIndex("contact_id");        r11 = r9.getString(r9.getColumnIndex("data1"));        r12 = me0.AbstractC23056e6.m118285k(r11);        r13 = r9.getString(r9.getColumnIndex("display_name"));     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:            if (r11 == null) goto L157;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:            if (r12.equals(r19) == false) goto L161;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:            r10.add(new pm0.C24865v(java.lang.Long.valueOf(r9.getLong(r0)), r11, r13));     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:            if (r9.moveToNext() != false) goto L263;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00aa, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:            r9.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ea, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01f4, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e8, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f0, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e6, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01ec, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bc, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bd, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8 A[Catch: all -> 0x00a7, Exception -> 0x00bc, TRY_LEAVE, TryCatch #8 {Exception -> 0x00bc, blocks: (B:7:0x001b, B:9:0x0023, B:11:0x002d, B:13:0x006e, B:23:0x00b5, B:28:0x00b2, B:37:0x00c2, B:39:0x00c8, B:65:0x01f8), top: B:6:0x001b, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2355l(Context context, String str, SensitiveData sensitiveData) {
        int i11;
        Cursor m135981g;
        boolean z11;
        ContentResolver contentResolver;
        SensitiveData m118247j = C23046d7.m118247j(sensitiveData, "phonebook");
        boolean z12 = false;
        if (!C8937j0.m47663l(m118247j.m35528c())) {
            return false;
        }
        try {
            try {
                C31901e8 m2800f = AbstractC0906d0.m2800f(context, str);
                if (m2800f != null && m2800f.m153294g() >= 0) {
                    ContentResolver m135977c = C26388b.m135977c(context);
                    String[] strArr = {"_id", "contact_id", "display_name", "data1"};
                    String[] strArr2 = {String.valueOf(m2800f.m153294g())};
                    C8937j0.m47661j().m50393d(m118247j);
                    Cursor m135981g2 = C26388b.m135981g(m135977c, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, strArr, "_id = ?", strArr2, null, true);
                    ArrayList arrayList = new ArrayList();
                    if (m135981g2 != null) {
                    }
                    if (arrayList.size() == 1) {
                        String valueOf = String.valueOf(((C24865v) arrayList.get(0)).m129232d());
                        String str2 = (String) ((C24865v) arrayList.get(0)).m129233e();
                        String str3 = (String) ((C24865v) arrayList.get(0)).m129234f();
                        try {
                            m135981g = C26388b.m135981g(m135977c, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, strArr, "contact_id = ?", new String[]{valueOf}, null, true);
                        } catch (Exception e11) {
                            e = e11;
                            i11 = 0;
                        }
                        if (m135981g != null) {
                            if (m135981g.getCount() > 1) {
                                z11 = false;
                            } else {
                                z11 = true;
                            }
                            m135981g.close();
                            if (!z11) {
                                try {
                                    String[] strArr3 = {str2, str3};
                                    contentResolver = m135977c;
                                    try {
                                        i11 = C26388b.m135975a(contentResolver, ContactsContract.Data.CONTENT_URI, "data1 = ? AND display_name = ?", strArr3, true);
                                    } catch (Exception e12) {
                                        e = e12;
                                        C23952g.m125345j("DELETE_CONTACT_BY_PHONE_ID", e.getMessage());
                                        e.printStackTrace();
                                        i11 = 0;
                                        if (i11 == 0) {
                                        }
                                        if (i11 > 0) {
                                        }
                                        return z12;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    contentResolver = m135977c;
                                }
                                if (i11 == 0) {
                                    try {
                                        i11 = C26388b.m135975a(contentResolver, ContactsContract.Data.CONTENT_URI, "_id = ?", new String[]{String.valueOf(m2800f.m153294g())}, true);
                                    } catch (Exception e14) {
                                        try {
                                            C23952g.m125345j("DELETE_CONTACT_BY_PHONE_DISPLAY_NAME", e14.getMessage());
                                            e14.printStackTrace();
                                        } catch (Exception e15) {
                                            e = e15;
                                            C23952g.m125345j("DELETE_CONTACT", e.getMessage());
                                            e.printStackTrace();
                                            if (i11 > 0) {
                                            }
                                            return z12;
                                        }
                                    }
                                }
                                if (i11 > 0) {
                                    z12 = true;
                                }
                            }
                        }
                        int i12 = C26388b.m135975a(m135977c, ContactsContract.Data.CONTENT_URI, "contact_id = " + valueOf, null, true);
                        i12 += C26388b.m135975a(m135977c, Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, valueOf), null, null, true);
                        i12 += C26388b.m135975a(m135977c, Uri.withAppendedPath(ContactsContract.RawContacts.CONTENT_URI, valueOf), null, null, true);
                        ArrayList<ContentProviderOperation> arrayList2 = new ArrayList<>();
                        arrayList2.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id = ?", new String[]{valueOf}).build());
                        i12 += m135977c.applyBatch("com.android.contacts", arrayList2).length;
                        i11 = i12;
                        if (i11 > 0) {
                        }
                    }
                    return z12;
                }
            } catch (Exception e16) {
                C8937j0.m47661j().m50392b(m118247j.m35528c(), false);
                e16.printStackTrace();
            }
            return false;
        } finally {
            C8937j0.m47661j().m50392b(m118247j.m35528c(), true);
        }
    }

    /* renamed from: m */
    static void m2356m(Context context, int i11, SensitiveData sensitiveData) {
        long abs = Math.abs(System.currentTimeMillis() - AbstractC23309i.m121706a7());
        if (abs > 30000) {
            AtomicBoolean atomicBoolean = f3058c;
            atomicBoolean.set(true);
            List m2328E = m2328E(context, sensitiveData);
            if (m2328E != null) {
                List m2325B = m2325B(m2328E);
                m2350g(m2325B, AbstractC23309i.m121223N5());
                AbstractC23309i.m122104kq(System.currentTimeMillis());
                f3062g = true;
                AbstractC0906d0.m2798d(m2325B);
                AbstractC23309i.m122626yr(System.currentTimeMillis());
                C21916c.m114210e().m114214d(2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("doScanPhoneContacts reload zalo list:");
                sb2.append(m2325B.size());
                AbstractC23309i.m120791Bh(false);
                if (CoreUtility.f89232h != null && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                    C18644n.m98531l().m98556s("doScanPhoneContacts");
                } else {
                    C21927m.m114302u().m114314L();
                }
                int m120923F1 = AbstractC23309i.m120923F1();
                int m122452u1 = AbstractC23309i.m122452u1();
                if (m122452u1 != 2 && m122452u1 != 1) {
                    m122452u1 = g.m2376b().m2378c(MainApplication.getAppContext());
                }
                if (m122452u1 != -1) {
                    m120923F1 = m122452u1;
                }
                AbstractC23309i.m120830Cj(m120923F1);
                f3063h.sendMessage(Message.obtain(f3063h, 2, new e(i11)));
            } else {
                C23744a.m124114c().m124116d(6060, 0);
                PhoneBookView.m82590jM(0);
            }
            atomicBoolean.set(false);
            C18644n.m98524E();
        } else {
            d dVar = f3063h;
            dVar.sendMessageDelayed(dVar.obtainMessage(3, sensitiveData), 30000 - abs);
        }
        m2351h(context, sensitiveData);
    }

    /* renamed from: n */
    static String m2357n(List list, boolean z11) {
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                f fVar = (f) list.get(i11);
                String str = "";
                if (z11) {
                    try {
                        if (!TextUtils.isEmpty(fVar.m153298m())) {
                            JSONObject jSONObject = new JSONObject();
                            if (fVar.m153295h() != null) {
                                str = fVar.m153295h();
                            }
                            jSONObject.put("name", str);
                            jSONObject.put("phone", fVar.m153298m());
                            jSONArray4.put(jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                } else if (fVar.m2373B() == f.a.UPDATE) {
                    if (!TextUtils.isEmpty(fVar.m153298m())) {
                        JSONObject jSONObject2 = new JSONObject();
                        if (fVar.m153295h() != null) {
                            str = fVar.m153295h();
                        }
                        jSONObject2.put("name", str);
                        jSONObject2.put("phone", fVar.m153298m());
                        jSONArray3.put(jSONObject2);
                    }
                } else if (fVar.m2373B() == f.a.INSERT) {
                    if (!TextUtils.isEmpty(fVar.m153298m())) {
                        JSONObject jSONObject3 = new JSONObject();
                        if (fVar.m153295h() != null) {
                            str = fVar.m153295h();
                        }
                        jSONObject3.put("name", str);
                        jSONObject3.put("phone", fVar.m153298m());
                        jSONArray.put(jSONObject3);
                    }
                } else if (fVar.m2373B() == f.a.DELETE && !TextUtils.isEmpty(fVar.m153298m())) {
                    jSONArray2.put(fVar.m153298m());
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("PhoneContactWorker", e11);
                return "{\"all\":[], {\"add\":[], \"delete\":[], \"update\":[]}";
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("all", jSONArray4);
        jSONObject4.put("add", jSONArray);
        jSONObject4.put("delete", jSONArray2);
        jSONObject4.put("update", jSONArray3);
        return jSONObject4.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x020e, code lost:            if (r12.getInt(r12.getColumnIndex("data2")) == 3) goto L318;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:46:0x00d6. Please report as an issue. */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static List m2358o(Context context, SensitiveData sensitiveData) {
        c cVar;
        List list;
        char c11;
        String string;
        int columnIndex;
        int type;
        List list2;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                C8937j0.m47661j().m50393d(sensitiveData);
                Cursor m135984j = C26388b.m135984j(context, ContactsContract.Data.CONTENT_URI, null, null, null, "contact_id ASC", true);
                if (m135984j.moveToFirst()) {
                    int columnIndex2 = m135984j.getColumnIndex("contact_id");
                    int columnIndex3 = m135984j.getColumnIndex("mimetype");
                    cVar = new c();
                    cVar.f3080k = m135984j.getInt(columnIndex2);
                    do {
                        try {
                            if (m135984j.getInt(columnIndex2) != cVar.f3080k) {
                                if (!TextUtils.isEmpty(cVar.f3071b) && (list2 = cVar.f3070a) != null && !list2.isEmpty() && cVar.f3081l) {
                                    arrayList.add(cVar);
                                }
                                c cVar2 = new c();
                                try {
                                    cVar2.f3080k = m135984j.getInt(columnIndex2);
                                    cVar = cVar2;
                                } catch (Exception e11) {
                                    e = e11;
                                    cVar = cVar2;
                                    e.printStackTrace();
                                }
                            }
                            String string2 = m135984j.getString(columnIndex3);
                            switch (string2.hashCode()) {
                                case -1569536764:
                                    if (string2.equals("vnd.android.cursor.item/email_v2")) {
                                        c11 = 4;
                                        break;
                                    }
                                    break;
                                case -1328682538:
                                    if (string2.equals("vnd.android.cursor.item/contact_event")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                                case -1079224304:
                                    if (string2.equals("vnd.android.cursor.item/name")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case -1079210633:
                                    if (string2.equals("vnd.android.cursor.item/note")) {
                                        c11 = 5;
                                        break;
                                    }
                                    break;
                                case -601229436:
                                    if (string2.equals("vnd.android.cursor.item/postal-address_v2")) {
                                        c11 = 7;
                                        break;
                                    }
                                    break;
                                case 684173810:
                                    if (string2.equals("vnd.android.cursor.item/phone_v2")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                                case 689862072:
                                    if (string2.equals("vnd.android.cursor.item/organization")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 950831081:
                                    if (string2.equals("vnd.android.cursor.item/im")) {
                                        c11 = 6;
                                        break;
                                    }
                                    break;
                            }
                            c11 = 65535;
                            switch (c11) {
                                case 0:
                                    int columnIndex4 = m135984j.getColumnIndex("data1");
                                    int type2 = m135984j.getType(columnIndex4);
                                    if (type2 > 0 && type2 < 4) {
                                        String string3 = m135984j.getString(columnIndex4);
                                        if (!TextUtils.isEmpty(string3)) {
                                            cVar.f3071b = string3;
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    int columnIndex5 = m135984j.getColumnIndex("data1");
                                    int type3 = m135984j.getType(columnIndex5);
                                    if (type3 > 0 && type3 < 4) {
                                        String string4 = m135984j.getString(columnIndex5);
                                        if (!TextUtils.isEmpty(string4)) {
                                            List list3 = cVar.f3070a;
                                            if (list3 == null) {
                                                ArrayList arrayList2 = new ArrayList();
                                                cVar.f3070a = arrayList2;
                                                arrayList2.add(string4);
                                                break;
                                            } else {
                                                list3.add(string4);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    int columnIndex6 = m135984j.getColumnIndex("data1");
                                    int type4 = m135984j.getType(columnIndex6);
                                    if (type4 > 0 && type4 < 4) {
                                        String string5 = m135984j.getString(columnIndex6);
                                        if (!TextUtils.isEmpty(string5)) {
                                            cVar.f3072c = string5;
                                            cVar.f3081l = true;
                                        }
                                    }
                                    int columnIndex7 = m135984j.getColumnIndex("data4");
                                    int type5 = m135984j.getType(columnIndex7);
                                    if (type5 > 0 && type5 < 4) {
                                        String string6 = m135984j.getString(columnIndex7);
                                        if (!TextUtils.isEmpty(string6)) {
                                            cVar.f3074e = string6;
                                            cVar.f3081l = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 3:
                                    int columnIndex8 = m135984j.getColumnIndex("data1");
                                    int type6 = m135984j.getType(columnIndex8);
                                    if (type6 > 0 && type6 < 4) {
                                        string = m135984j.getString(columnIndex8);
                                        if (!TextUtils.isEmpty(string)) {
                                            try {
                                                break;
                                            } catch (Exception e12) {
                                                AbstractC20110a.m104539h(e12);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    int columnIndex9 = m135984j.getColumnIndex("data1");
                                    int type7 = m135984j.getType(columnIndex9);
                                    if (type7 > 0 && type7 < 4) {
                                        String string7 = m135984j.getString(columnIndex9);
                                        if (!TextUtils.isEmpty(string7)) {
                                            if (cVar.f3076g == null) {
                                                cVar.f3076g = new ArrayList();
                                            }
                                            cVar.f3076g.add(string7);
                                            cVar.f3081l = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 5:
                                    int columnIndex10 = m135984j.getColumnIndex("data1");
                                    int type8 = m135984j.getType(columnIndex10);
                                    if (type8 > 0 && type8 < 4) {
                                        String string8 = m135984j.getString(columnIndex10);
                                        if (!TextUtils.isEmpty(string8)) {
                                            cVar.f3077h = string8;
                                            cVar.f3081l = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 6:
                                    int columnIndex11 = m135984j.getColumnIndex("data1");
                                    int type9 = m135984j.getType(columnIndex11);
                                    if (type9 > 0 && type9 < 4) {
                                        String string9 = m135984j.getString(columnIndex11);
                                        if (!TextUtils.isEmpty(string9)) {
                                            if (cVar.f3078i == null) {
                                                cVar.f3078i = new ArrayList();
                                            }
                                            cVar.f3078i.add(string9);
                                            cVar.f3081l = true;
                                            break;
                                        }
                                    }
                                    break;
                                case 7:
                                    c.a aVar = new c.a();
                                    int columnIndex12 = m135984j.getColumnIndex("data4");
                                    int type10 = m135984j.getType(columnIndex12);
                                    if (type10 > 0 && type10 < 4) {
                                        String string10 = m135984j.getString(columnIndex12);
                                        if (!TextUtils.isEmpty(string10)) {
                                            aVar.f3083b = string10;
                                        }
                                    }
                                    int columnIndex13 = m135984j.getColumnIndex("data10");
                                    int type11 = m135984j.getType(columnIndex13);
                                    if (type11 > 0 && type11 < 4) {
                                        String string11 = m135984j.getString(columnIndex13);
                                        if (!TextUtils.isEmpty(string11)) {
                                            aVar.f3082a = string11;
                                        }
                                    }
                                    int columnIndex14 = m135984j.getColumnIndex("data7");
                                    int type12 = m135984j.getType(columnIndex14);
                                    if (type12 > 0 && type12 < 4) {
                                        String string12 = m135984j.getString(columnIndex14);
                                        if (!TextUtils.isEmpty(string12)) {
                                            aVar.f3084c = string12;
                                        }
                                    }
                                    int columnIndex15 = m135984j.getColumnIndex("data9");
                                    int type13 = m135984j.getType(columnIndex15);
                                    if (type13 > 0 && type13 < 4) {
                                        String string13 = m135984j.getString(columnIndex15);
                                        if (!TextUtils.isEmpty(string13)) {
                                            aVar.f3085d = string13;
                                        }
                                    }
                                    if (aVar.m2372b() && (type = m135984j.getType((columnIndex = m135984j.getColumnIndex("data1")))) > 0 && type < 4) {
                                        String string14 = m135984j.getString(columnIndex);
                                        if (!TextUtils.isEmpty(string14)) {
                                            aVar.f3083b = string14;
                                        }
                                    }
                                    if (!aVar.m2372b()) {
                                        if (cVar.f3079j == null) {
                                            cVar.f3079j = new ArrayList();
                                        }
                                        cVar.f3079j.add(aVar);
                                        cVar.f3081l = true;
                                        break;
                                    }
                                    break;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } while (m135984j.moveToNext());
                    if (!TextUtils.isEmpty(cVar.f3071b) && (list = cVar.f3070a) != null && !list.isEmpty() && cVar.f3081l) {
                        arrayList.add(cVar);
                    }
                    m135984j.close();
                }
            } catch (Exception e14) {
                e14.printStackTrace();
                C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
            }
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            return arrayList;
            cVar.f3075f = string;
            cVar.f3081l = true;
        } catch (Throwable th2) {
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            throw th2;
        }
    }

    /* renamed from: p */
    public static List m2359p() {
        ArrayList arrayList = new ArrayList();
        if (!AbstractC23309i.m121418Sf()) {
            return arrayList;
        }
        try {
            List<C3566g> list = f3066k;
            synchronized (list) {
                try {
                    m2368y();
                    for (C3566g c3566g : list) {
                        if (c3566g.f15123f == 2 && c3566g.f15118a.equals(CoreUtility.f89233i)) {
                            ContactProfile m98552o = C18644n.m98531l().m98552o(c3566g.f15119b);
                            if (m98552o == null) {
                                m98552o = C21927m.m114302u().m114312J().m153138j(c3566g.f15119b);
                            }
                            if (m98552o != null) {
                                ContactProfile contactProfile = new ContactProfile(m98552o);
                                contactProfile.f42455y = c3566g.f15121d;
                                contactProfile.m40401d1(c3566g.f15120c);
                                contactProfile.f42440t = AbstractC23262x6.m120002o(AbstractC28218w3.m142177a(contactProfile));
                                if (C23302b.f113247a.m120523d(contactProfile.f42446v)) {
                                    contactProfile.f42427o1 = AbstractC23028c0.m118087g(AbstractC28218w3.m142177a(contactProfile));
                                }
                                arrayList.add(contactProfile);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new Comparator() { // from class: ag0.w
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int m2366w;
                        m2366w = AbstractC0852x.m2366w((ContactProfile) obj, (ContactProfile) obj2);
                        return m2366w;
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: q */
    static ArrayList m2360q(String str) {
        String str2;
        String str3;
        JSONObject jSONObject;
        String str4;
        String str5;
        String str6;
        long optLong;
        String str7 = "numberInter";
        String str8 = "number";
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length > 0) {
                int i11 = 0;
                while (i11 < length) {
                    try {
                        jSONObject = jSONArray.getJSONObject(i11);
                        str4 = "";
                        if (!jSONObject.has(str8)) {
                            str5 = "";
                        } else {
                            str5 = jSONObject.getString(str8);
                        }
                        if (!jSONObject.has(str7)) {
                            str6 = "";
                        } else {
                            str6 = jSONObject.getString(str7);
                        }
                        optLong = jSONObject.optLong("zaloUid");
                        str2 = str7;
                        str3 = str8;
                    } catch (Exception e11) {
                        e = e11;
                        str2 = str7;
                        str3 = str8;
                    }
                    try {
                        long optLong2 = jSONObject.optLong("dbId");
                        if (str6.equals("")) {
                            str6 = AbstractC23056e6.m118285k(str5);
                        }
                        String str9 = str6;
                        if (jSONObject.has("displayName")) {
                            str4 = jSONObject.getString("displayName");
                        }
                        C31901e8 c31901e8 = new C31901e8(optLong, str4, str5, str9);
                        c31901e8.m153304x(optLong2);
                        arrayList.add(c31901e8);
                    } catch (Exception e12) {
                        e = e12;
                        AbstractC23350e.m122776f("PhoneContactWorker", e);
                        i11++;
                        str7 = str2;
                        str8 = str3;
                    }
                    i11++;
                    str7 = str2;
                    str8 = str3;
                }
            }
        } catch (Exception e13) {
            AbstractC23350e.m122776f("PhoneContactWorker", e13);
        }
        return arrayList;
    }

    /* renamed from: r */
    static List m2361r(List list, List list2) {
        int i11;
        ArrayList arrayList = new ArrayList();
        if (list != null && list2 != null) {
            HashSet hashSet = new HashSet(list2.size());
            Iterator it = list.iterator();
            while (true) {
                i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                C31901e8 c31901e8 = (C31901e8) it.next();
                while (true) {
                    if (i11 < list2.size()) {
                        C31901e8 c31901e82 = (C31901e8) list2.get(i11);
                        if (c31901e82.m153302t(c31901e8)) {
                            hashSet.add(Integer.valueOf(i11));
                            if (c31901e8.m153295h() != null && !c31901e8.m153295h().equals(c31901e82.m153295h())) {
                                f fVar = new f(c31901e8);
                                fVar.m2374C(f.a.UPDATE);
                                arrayList.add(fVar);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("update:");
                                sb2.append(fVar);
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        f fVar2 = new f(c31901e8);
                        fVar2.m2374C(f.a.INSERT);
                        arrayList.add(fVar2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("insert:");
                        sb3.append(fVar2);
                        break;
                    }
                }
            }
            while (i11 < list2.size()) {
                C31901e8 c31901e83 = (C31901e8) list2.get(i11);
                if (!hashSet.contains(Integer.valueOf(i11))) {
                    f fVar3 = new f(c31901e83);
                    fVar3.m2374C(f.a.DELETE);
                    arrayList.add(fVar3);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("delete:");
                    sb4.append(fVar3);
                }
                i11++;
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    static void m2362s(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1483e c1483e = (C1483e) it.next();
            String str = (String) c1483e.f6374a;
            if (!TextUtils.isEmpty(str)) {
                String str2 = (String) c1483e.f6375b;
                if (str2 == null) {
                    str2 = "";
                }
                if (!TextUtils.isEmpty(str2)) {
                    String.format("update phone of user:%s with:%s", str, str2);
                    C21928n.m114372h().m114386p(str, str2);
                    C28203u6.f131407a.m141803A(str, str2);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(str);
                    if (m98552o != null) {
                        m98552o.m40417m1(str2);
                    }
                }
            }
        }
        d dVar = f3063h;
        if (dVar != null) {
            dVar.sendEmptyMessageDelayed(5, 5000L);
        }
    }

    /* renamed from: t */
    public static synchronized void m2363t() {
        synchronized (AbstractC0852x.class) {
            try {
                if (f3063h != null) {
                    return;
                }
                if (Math.abs(System.currentTimeMillis() - AbstractC23309i.m120817C6()) > 604800000) {
                    AbstractC23309i.m121727ar(System.currentTimeMillis());
                    m2333J();
                }
                HandlerThread handlerThread = new HandlerThread("Z:PhoneContactWorker", 10);
                handlerThread.start();
                f3063h = new d(handlerThread.getLooper());
                SensitiveData sensitiveData = new SensitiveData("phonebook_auto_scan_by_interval", "phonebook_auto_scan");
                if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                    return;
                }
                d dVar = f3063h;
                dVar.sendMessageDelayed(dVar.obtainMessage(4, sensitiveData), 21600000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: u */
    public static boolean m2364u() {
        return f3058c.get();
    }

    /* renamed from: v */
    public static boolean m2365v() {
        return f3059d.get();
    }

    /* renamed from: w */
    public static /* synthetic */ int m2366w(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* renamed from: x */
    public static /* synthetic */ void m2367x() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_sensitive_phonebook_block_title));
    }

    /* renamed from: y */
    public static void m2368y() {
        try {
            List list = f3066k;
            if (list.isEmpty()) {
                synchronized (list) {
                    try {
                        if (list.isEmpty()) {
                            String m121669Z7 = AbstractC23309i.m121669Z7();
                            if (!TextUtils.isEmpty(m121669Z7)) {
                                JSONArray jSONArray = new JSONArray(m121669Z7);
                                list.clear();
                                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                    f3066k.add(new C3566g(jSONArray.getJSONObject(i11)));
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    static List m2369z() {
        try {
            C20131e c20131e = C20131e.f99303a;
            if (AbstractC23041d2.m118194A(c20131e.m104933O())) {
                return m2360q(AbstractC23041d2.m118196C(c20131e.m104933O()));
            }
            return null;
        } catch (Exception | OutOfMemoryError e11) {
            AbstractC23350e.m122776f("PhoneContactWorker", e11);
            return null;
        }
    }
}
