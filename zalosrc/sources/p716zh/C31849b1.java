package p716zh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Base64;
import au.AbstractC2336a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17527f;
import fg0.ThreadFactoryC18928a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23034c6;
import me0.AbstractC23056e6;
import me0.AbstractC23138m0;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p716zh.C31849b1;
import su.C26388b;

/* renamed from: zh.b1 */
/* loaded from: classes.dex */
public class C31849b1 {

    /* renamed from: f */
    static final String f146222f = "b1";

    /* renamed from: g */
    static volatile C31849b1 f146223g = null;

    /* renamed from: h */
    public static String f146224h = "vnd.android.cursor.item/com.zing.zalo.call";

    /* renamed from: i */
    public static String f146225i = "vnd.android.cursor.item/com.zing.zalo.message";

    /* renamed from: j */
    public static String f146226j = "vnd.android.cursor.item/com.zing.zalo.video.call";

    /* renamed from: b */
    e f146234b;

    /* renamed from: k */
    static final AtomicBoolean f146227k = new AtomicBoolean(false);

    /* renamed from: n */
    static final Object f146230n = new Object();

    /* renamed from: o */
    static boolean f146231o = false;

    /* renamed from: p */
    static boolean f146232p = false;

    /* renamed from: l */
    static final ExecutorService f146228l = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ContactSync"));

    /* renamed from: m */
    static final ExecutorService f146229m = Executors.newSingleThreadExecutor(new ThreadFactoryC18928a("ContactSync-data"));

    /* renamed from: a */
    String[] f146233a = {"contact_id", "data1", "data2", "data3"};

    /* renamed from: c */
    int f146235c = 0;

    /* renamed from: d */
    boolean f146236d = false;

    /* renamed from: e */
    boolean f146237e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.b1$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC0939u {
        a() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42134Gb();
            C7960e.m41971c6().m42145Hb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zh.b1$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {
        b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            C31849b1.this.f146237e = false;
            try {
                if (AbstractC23309i.m121563Wc() == 0) {
                    AbstractC23309i.m122337qy(3600000L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                    String string = jSONObject.getString("list_none_friends");
                    long j11 = jSONObject.getLong("expired_time");
                    int i11 = jSONObject.getInt("frame_size");
                    AbstractC23309i.m122337qy(j11 * 1000);
                    C31849b1.this.m153116x(new String(AbstractC17527f.m93440d(Base64.decode(string, 0), Utils.m89297a(1), i11, Integer.parseInt(CoreUtility.f89233i))));
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C31849b1.this.f146237e = false;
            }
        }
    }

    /* renamed from: zh.b1$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        public String f146240a;

        /* renamed from: b */
        public String f146241b;

        /* renamed from: g */
        public String f146246g;

        /* renamed from: h */
        public ArrayList f146247h;

        /* renamed from: c */
        public String f146242c = "";

        /* renamed from: d */
        public String f146243d = "";

        /* renamed from: e */
        public String f146244e = "";

        /* renamed from: f */
        public String f146245f = "";

        /* renamed from: i */
        public long f146248i = 0;

        /* renamed from: j */
        public boolean f146249j = false;

        /* renamed from: k */
        public HashMap f146250k = new HashMap();

        /* renamed from: l */
        public HashMap f146251l = new HashMap();

        /* renamed from: m */
        public HashMap f146252m = new HashMap();
    }

    /* renamed from: zh.b1$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo83929a(List list);

        /* renamed from: b */
        void mo83930b();
    }

    /* renamed from: zh.b1$e */
    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1 || i11 == 2) {
                C31849b1.this.m153118z(MainApplication.getAppContext(), true);
            }
        }
    }

    private C31849b1() {
        HandlerThread handlerThread = new HandlerThread("Z:ContactsSyncManager", 10);
        handlerThread.start();
        this.f146234b = new e(handlerThread.getLooper());
    }

    /* renamed from: f */
    private static Uri m153096f(Uri uri, boolean z11) {
        if (z11) {
            return uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
        }
        return uri;
    }

    /* renamed from: n */
    public static synchronized C31849b1 m153097n() {
        C31849b1 c31849b1;
        synchronized (C31849b1.class) {
            try {
                if (f146223g == null) {
                    synchronized (C31849b1.class) {
                        try {
                            if (f146223g == null) {
                                f146223g = new C31849b1();
                            }
                        } finally {
                        }
                    }
                }
                c31849b1 = f146223g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31849b1;
    }

    /* renamed from: r */
    public /* synthetic */ void m153098r(boolean z11) {
        if (AbstractC23309i.m122128lc() == 1) {
            m153115w("--not sync so perform sync--");
            m153118z(MainApplication.getAppContext(), z11);
        }
    }

    /* renamed from: s */
    public static /* synthetic */ void m153099s(d dVar) {
        try {
            List m42570w5 = C7960e.m41971c6().m42570w5();
            if (dVar != null) {
                dVar.mo83929a(m42570w5);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            if (dVar != null) {
                dVar.mo83930b();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:            if (r10 != null) goto L101;     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m153100t(String str) {
        e eVar;
        ArrayList arrayList;
        synchronized (f146230n) {
            try {
                try {
                    try {
                        if (TextUtils.isEmpty(str)) {
                            e eVar2 = this.f146234b;
                            if (eVar2 != null) {
                                eVar2.sendEmptyMessage(2);
                            }
                            return;
                        }
                        m153115w("PARSE none friend phone add data sync");
                        JSONArray jSONArray = new JSONArray(str);
                        if (jSONArray.length() > 0) {
                            C7960e.m41971c6().m42145Hb();
                            if (AbstractC23304d.f113437t != null) {
                                arrayList = new ArrayList();
                            } else {
                                arrayList = null;
                            }
                            m153115w("START inserting none friend phone data sync");
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                                if (jSONObject != null) {
                                    C31934gb c31934gb = new C31934gb(jSONObject);
                                    if (!TextUtils.isEmpty(c31934gb.f146730b) && !TextUtils.isEmpty(c31934gb.f146729a)) {
                                        c31934gb.f146730b = AbstractC23056e6.m118285k(c31934gb.f146730b);
                                        C7960e.m41971c6().m42445k9(c31934gb);
                                        if (arrayList != null) {
                                            ContactProfile contactProfile = new ContactProfile(c31934gb.f146729a);
                                            contactProfile.f42446v = c31934gb.f146733e;
                                            contactProfile.f42437s = contactProfile.m40383Q(true, false);
                                            contactProfile.f42460z1 = c31934gb.f146734f;
                                            arrayList.add(contactProfile);
                                        }
                                    }
                                }
                            }
                            AbstractC23304d.f113437t = arrayList;
                            m153115w("END insert none friend phone data sync");
                        }
                        eVar = this.f146234b;
                    } catch (Throwable th2) {
                        e eVar3 = this.f146234b;
                        if (eVar3 != null) {
                            eVar3.sendEmptyMessage(2);
                        }
                        throw th2;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    eVar = this.f146234b;
                    if (eVar != null) {
                        eVar.sendEmptyMessage(2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:            if (r8 != null) goto L94;     */
    /* JADX WARN: Finally extract failed */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m153101u(JSONArray jSONArray) {
        e eVar;
        synchronized (f146230n) {
            try {
                try {
                    try {
                        m153115w("PARSE get friend Add data sync");
                        if (jSONArray == null) {
                            e eVar2 = this.f146234b;
                            if (eVar2 != null) {
                                eVar2.sendEmptyMessage(2);
                            }
                            return;
                        }
                        if (jSONArray.length() > 0) {
                            C7960e.m41971c6().m42134Gb();
                            m153115w("START inserting get friend data sync");
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                                    String optString = jSONObject.optString("userId");
                                    String optString2 = jSONObject.optString("phoneNumber");
                                    if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                                        C7960e.m41971c6().m42434j9(new C31934gb(optString, AbstractC23056e6.m118285k(optString2), 0));
                                    }
                                } catch (Exception e11) {
                                    AbstractC23350e.m122776f(f146222f, e11);
                                }
                            }
                            m153115w("END insert get friend data sync");
                        }
                        eVar = this.f146234b;
                    } catch (Throwable th2) {
                        e eVar3 = this.f146234b;
                        if (eVar3 != null) {
                            eVar3.sendEmptyMessage(2);
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                    eVar = this.f146234b;
                    if (eVar != null) {
                        eVar.sendEmptyMessage(2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x041f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0286 A[LOOP:2: B:63:0x0153->B:72:0x0286, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029b A[EDGE_INSN: B:73:0x029b->B:133:0x029b BREAK  A[LOOP:2: B:63:0x0153->B:72:0x0286], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0255 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022f A[LOOP:3: B:84:0x01cf->B:98:0x022f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022e A[EDGE_INSN: B:99:0x022e->B:100:0x022e BREAK  A[LOOP:3: B:84:0x01cf->B:98:0x022f], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m153102v(SensitiveData sensitiveData, Context context) {
        Throwable th2;
        Cursor cursor;
        long currentTimeMillis;
        int i11;
        Cursor m135984j;
        Throwable th3;
        Cursor cursor2;
        HashMap hashMap;
        Cursor cursor3;
        Exception exc;
        long currentTimeMillis2;
        int i12;
        HashMap hashMap2 = new HashMap();
        long currentTimeMillis3 = System.currentTimeMillis();
        synchronized (f146230n) {
            ?? r62 = 0;
            try {
                m153104B(1);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (!m153114q()) {
                m153104B(1);
                return;
            }
            m153115w("performSync---");
            this.f146236d = false;
            List<C31934gb> m42560v5 = C7960e.m41971c6().m42560v5();
            m153115w("GET all data sync friend---size--" + m42560v5.size());
            for (C31934gb c31934gb : m42560v5) {
                if (!TextUtils.isEmpty(c31934gb.f146729a) && !TextUtils.isEmpty(c31934gb.f146730b) && !hashMap2.containsKey(c31934gb.f146730b)) {
                    hashMap2.put(c31934gb.f146730b, c31934gb.f146729a);
                }
            }
            List<C31934gb> m42570w5 = C7960e.m41971c6().m42570w5();
            m153115w("GET all data sync none friend---size--" + m42570w5.size());
            for (C31934gb c31934gb2 : m42570w5) {
                if (!TextUtils.isEmpty(c31934gb2.f146729a) && !TextUtils.isEmpty(c31934gb2.f146730b) && !hashMap2.containsKey(c31934gb2.f146730b)) {
                    hashMap2.put(c31934gb2.f146730b, c31934gb2.f146729a);
                }
            }
            m153115w("MAP-PHONE-UID---Size---" + hashMap2.size());
            if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    C8937j0.m47661j().m50393d(sensitiveData);
                    currentTimeMillis = System.currentTimeMillis();
                    i11 = 2;
                    m135984j = C26388b.m135984j(context, ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "display_name"}, "has_phone_number = '1' ", null, null, true);
                } catch (Exception e12) {
                    e = e12;
                    cursor = null;
                } catch (Throwable th4) {
                    th2 = th4;
                    cursor = null;
                }
                try {
                    try {
                        m153115w("Time query--------ALL-CONTACTS-----" + (System.currentTimeMillis() - currentTimeMillis));
                        if (m135984j != null && m135984j.getCount() > 0) {
                            m135984j.moveToFirst();
                            int columnIndexOrThrow = m135984j.getColumnIndexOrThrow("_id");
                            int columnIndexOrThrow2 = m135984j.getColumnIndexOrThrow("display_name");
                            while (true) {
                                String string = m135984j.getString(columnIndexOrThrow);
                                String string2 = m135984j.getString(columnIndexOrThrow2);
                                c cVar = new c();
                                cVar.f146251l.clear();
                                cVar.f146249j = r62;
                                cVar.f146250k.clear();
                                cVar.f146252m.clear();
                                cVar.f146241b = string;
                                cVar.f146245f = string2;
                                m153115w("Displayname1---" + string2);
                                ArrayList arrayList2 = new ArrayList();
                                try {
                                    currentTimeMillis2 = System.currentTimeMillis();
                                    Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                                    String[] strArr = new String[i11];
                                    strArr[r62] = "data1";
                                    strArr[1] = "data2";
                                    String[] strArr2 = new String[i11];
                                    strArr2[r62] = "vnd.android.cursor.item/phone_v2";
                                    strArr2[1] = string;
                                    cursor3 = C26388b.m135984j(context, uri, strArr, "mimetype = ? AND contact_id = ?", strArr2, null, true);
                                } catch (Exception e13) {
                                    e = e13;
                                    hashMap = hashMap2;
                                    cursor3 = null;
                                } catch (Throwable th5) {
                                    th3 = th5;
                                    cursor2 = null;
                                }
                                if (cursor3 != null) {
                                    try {
                                        try {
                                        } catch (Throwable th6) {
                                            th3 = th6;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                try {
                                                    cursor2.close();
                                                    throw th3;
                                                } catch (Exception e14) {
                                                    e14.printStackTrace();
                                                    throw th3;
                                                }
                                            }
                                            throw th3;
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        hashMap = hashMap2;
                                    }
                                    if (cursor3.getCount() > 0) {
                                        cursor3.moveToFirst();
                                        int columnIndexOrThrow3 = cursor3.getColumnIndexOrThrow("data1");
                                        int columnIndexOrThrow4 = cursor3.getColumnIndexOrThrow("data2");
                                        while (true) {
                                            String string3 = cursor3.getString(columnIndexOrThrow3);
                                            int i13 = cursor3.getInt(columnIndexOrThrow4);
                                            if (!TextUtils.isEmpty(string3)) {
                                                arrayList2.add(string3);
                                                String str = (String) hashMap2.get(AbstractC23056e6.m118285k(string3));
                                                if (!TextUtils.isEmpty(str)) {
                                                    i12 = columnIndexOrThrow3;
                                                    if (!str.equals(CoreUtility.f89233i) && !cVar.f146251l.containsKey(str)) {
                                                        cVar.f146251l.put(str, string3);
                                                        hashMap = hashMap2;
                                                        try {
                                                            cVar.f146252m.put(string3, Integer.valueOf(i13));
                                                            cVar.f146246g = string3;
                                                            cVar.f146240a = str;
                                                            if (!cursor3.moveToNext()) {
                                                                break;
                                                            }
                                                            columnIndexOrThrow3 = i12;
                                                            hashMap2 = hashMap;
                                                        } catch (Exception e16) {
                                                            e = e16;
                                                            e.printStackTrace();
                                                            if (cursor3 != null) {
                                                                try {
                                                                    cursor3.close();
                                                                } catch (Exception e17) {
                                                                    exc = e17;
                                                                    exc.printStackTrace();
                                                                    arrayList.add(cVar);
                                                                    if (!m135984j.moveToNext()) {
                                                                    }
                                                                }
                                                            }
                                                            arrayList.add(cVar);
                                                            if (!m135984j.moveToNext()) {
                                                            }
                                                        }
                                                    }
                                                    hashMap = hashMap2;
                                                    if (!cursor3.moveToNext()) {
                                                    }
                                                }
                                            }
                                            i12 = columnIndexOrThrow3;
                                            hashMap = hashMap2;
                                            if (!cursor3.moveToNext()) {
                                            }
                                        }
                                        m153115w("Time query ------------ALL-PHONE--------" + (System.currentTimeMillis() - currentTimeMillis2));
                                        cVar.f146247h = arrayList2;
                                        if (cursor3 != null) {
                                            try {
                                                cursor3.close();
                                            } catch (Exception e18) {
                                                exc = e18;
                                                exc.printStackTrace();
                                                arrayList.add(cVar);
                                                if (!m135984j.moveToNext()) {
                                                }
                                            }
                                        }
                                        arrayList.add(cVar);
                                        if (!m135984j.moveToNext()) {
                                            break;
                                        }
                                        hashMap2 = hashMap;
                                        r62 = 0;
                                        i11 = 2;
                                    }
                                }
                                hashMap = hashMap2;
                                m153115w("Time query ------------ALL-PHONE--------" + (System.currentTimeMillis() - currentTimeMillis2));
                                cVar.f146247h = arrayList2;
                                if (cursor3 != null) {
                                }
                                arrayList.add(cVar);
                                if (!m135984j.moveToNext()) {
                                }
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c cVar2 = (c) it.next();
                            ContentResolver contentResolver = context.getContentResolver();
                            m153115w("Start----Pre-Check----");
                            m153103A(contentResolver, cVar2);
                            if (cVar2.f146251l.size() > 0) {
                                m153115w("Add---Contact---Sync");
                                long currentTimeMillis4 = System.currentTimeMillis();
                                m153105g(context, cVar2);
                                m153115w("Time ADD CONTACT------" + (System.currentTimeMillis() - currentTimeMillis4));
                            }
                        }
                        m153115w("START--CHECK--AND--DELETE--DUP--CONTACT");
                        m153115w("END--CHECK--DUP");
                        m153104B(0);
                        if (f146231o) {
                            ToastUtils.showMess("Sync contact completed!");
                        }
                        C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                        m153115w("Time sync -------TIME----" + (System.currentTimeMillis() - currentTimeMillis3) + "--------CONTACTS_SIZE------" + arrayList.size());
                        if (this.f146236d) {
                            int i14 = this.f146235c;
                            if (i14 < 3) {
                                this.f146235c = i14 + 1;
                                e eVar = this.f146234b;
                                if (eVar != null) {
                                    eVar.sendEmptyMessageDelayed(1, 200L);
                                }
                            } else {
                                this.f146235c = 0;
                            }
                        } else {
                            this.f146235c = 0;
                        }
                    } catch (Exception e19) {
                        e = e19;
                        cursor = m135984j;
                        try {
                            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
                            e.printStackTrace();
                            this.f146236d = true;
                            m153104B(1);
                            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                            m153115w("Time sync -------TIME----" + (System.currentTimeMillis() - currentTimeMillis3) + "--------CONTACTS_SIZE------" + arrayList.size());
                            if (this.f146236d) {
                                int i15 = this.f146235c;
                                if (i15 < 3) {
                                    this.f146235c = i15 + 1;
                                    e eVar2 = this.f146234b;
                                    if (eVar2 != null) {
                                        eVar2.sendEmptyMessageDelayed(1, 200L);
                                    }
                                } else {
                                    this.f146235c = 0;
                                }
                            } else {
                                this.f146235c = 0;
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return;
                        } catch (Throwable th7) {
                            th2 = th7;
                            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                            m153115w("Time sync -------TIME----" + (System.currentTimeMillis() - currentTimeMillis3) + "--------CONTACTS_SIZE------" + arrayList.size());
                            if (!this.f146236d) {
                                int i16 = this.f146235c;
                                if (i16 < 3) {
                                    this.f146235c = i16 + 1;
                                    e eVar3 = this.f146234b;
                                    if (eVar3 != null) {
                                        eVar3.sendEmptyMessageDelayed(1, 200L);
                                    }
                                } else {
                                    this.f146235c = 0;
                                }
                            } else {
                                this.f146235c = 0;
                            }
                            if (cursor == null) {
                                try {
                                    cursor.close();
                                    throw th2;
                                } catch (Exception e21) {
                                    e21.printStackTrace();
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    }
                    if (m135984j != null) {
                        m135984j.close();
                    }
                } catch (Throwable th8) {
                    th2 = th8;
                    cursor = m135984j;
                    C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                    m153115w("Time sync -------TIME----" + (System.currentTimeMillis() - currentTimeMillis3) + "--------CONTACTS_SIZE------" + arrayList.size());
                    if (!this.f146236d) {
                    }
                    if (cursor == null) {
                    }
                }
            } catch (Exception e22) {
                e22.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x020a A[Catch: Exception -> 0x020e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x020e, blocks: (B:6:0x020a, B:104:0x021f), top: B:2:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[Catch: all -> 0x00e9, Exception -> 0x00ee, SYNTHETIC, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ee, blocks: (B:13:0x0046, B:15:0x004c, B:16:0x0076, B:20:0x00aa, B:22:0x00af, B:24:0x00b7, B:27:0x00bf, B:29:0x00c3, B:31:0x00c9, B:33:0x0117, B:62:0x01d2, B:87:0x01f5, B:86:0x01f2, B:96:0x00f2, B:97:0x0114), top: B:12:0x0046 }] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m153103A(ContentResolver contentResolver, c cVar) {
        Throwable th2;
        Cursor cursor;
        Cursor m135981g;
        String str;
        String str2;
        int i11;
        String str3;
        int i12;
        Throwable th3;
        Cursor cursor2;
        Exception exc;
        Cursor m135981g2;
        int i13;
        HashMap hashMap;
        String str4 = "sync3";
        String str5 = "sync2";
        try {
            try {
                m135981g = C26388b.m135981g(contentResolver, ContactsContract.RawContacts.CONTENT_URI, new String[]{"account_type", "_id", "sync1", "sync2", "sync3", "sync4"}, "contact_id=?", new String[]{cVar.f146241b}, null, true);
                if (m135981g != null) {
                    try {
                        try {
                            if (m135981g.getCount() > 0) {
                                int columnIndexOrThrow = m135981g.getColumnIndexOrThrow("account_type");
                                int columnIndexOrThrow2 = m135981g.getColumnIndexOrThrow("_id");
                                int columnIndexOrThrow3 = m135981g.getColumnIndexOrThrow("sync1");
                                int columnIndexOrThrow4 = m135981g.getColumnIndexOrThrow("sync2");
                                int columnIndexOrThrow5 = m135981g.getColumnIndexOrThrow("sync3");
                                int columnIndexOrThrow6 = m135981g.getColumnIndexOrThrow("sync4");
                                m135981g.moveToFirst();
                                int count = m135981g.getCount();
                                JSONArray jSONArray = new JSONArray();
                                int i14 = 0;
                                while (true) {
                                    String string = m135981g.getString(columnIndexOrThrow);
                                    str = str4;
                                    str2 = str5;
                                    long j11 = m135981g.getLong(columnIndexOrThrow2);
                                    int i15 = columnIndexOrThrow;
                                    String string2 = m135981g.getString(columnIndexOrThrow3);
                                    int i16 = columnIndexOrThrow2;
                                    String string3 = m135981g.getString(columnIndexOrThrow4);
                                    int i17 = columnIndexOrThrow3;
                                    String string4 = m135981g.getString(columnIndexOrThrow6);
                                    int i18 = columnIndexOrThrow4;
                                    String string5 = m135981g.getString(columnIndexOrThrow5);
                                    if (TextUtils.isEmpty(string)) {
                                        i11 = columnIndexOrThrow5;
                                        str3 = "";
                                    } else {
                                        i11 = columnIndexOrThrow5;
                                        str3 = string;
                                    }
                                    jSONArray.put(str3);
                                    if (string != null && string.equals(BuildConfig.APPLICATION_ID)) {
                                        if (!TextUtils.isEmpty(string4) && (hashMap = cVar.f146251l) != null && hashMap.containsKey(string4)) {
                                            cVar.f146251l.remove(string4);
                                            m153115w("PreCheck----REMOVE-IN-MAP---PHONE" + string2 + "---UID---" + string4);
                                        } else {
                                            i14++;
                                            m153109k(string3, string5);
                                            m153115w("PreCheck----REMOVE-RAWCONTACT---PHONE" + string2 + "---UID---" + string4);
                                        }
                                    } else {
                                        cVar.f146248i = j11;
                                    }
                                    i12 = i14;
                                    if (!m135981g.moveToNext()) {
                                        break;
                                    }
                                    i14 = i12;
                                    str4 = str;
                                    str5 = str2;
                                    columnIndexOrThrow = i15;
                                    columnIndexOrThrow2 = i16;
                                    columnIndexOrThrow3 = i17;
                                    columnIndexOrThrow4 = i18;
                                    columnIndexOrThrow5 = i11;
                                }
                                if (i12 > 0) {
                                    try {
                                        m135981g2 = C26388b.m135981g(contentResolver, ContactsContract.RawContacts.CONTENT_URI, new String[]{"account_type", "_id", "sync1", str2, str, "sync4"}, "contact_id=?", new String[]{cVar.f146241b}, null, true);
                                    } catch (Exception e11) {
                                        e = e11;
                                        cursor2 = null;
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                        cursor2 = null;
                                    }
                                    try {
                                        JSONArray jSONArray2 = new JSONArray();
                                        if (m135981g2 != null && m135981g2.getCount() > 0) {
                                            int columnIndexOrThrow7 = m135981g2.getColumnIndexOrThrow("account_type");
                                            m135981g2.moveToFirst();
                                            int count2 = m135981g2.getCount();
                                            do {
                                                String string6 = m135981g2.getString(columnIndexOrThrow7);
                                                if (TextUtils.isEmpty(string6)) {
                                                    string6 = "";
                                                }
                                                jSONArray2.put(string6);
                                            } while (m135981g2.moveToNext());
                                            i13 = count2;
                                        } else {
                                            i13 = 0;
                                        }
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("countOld", count);
                                        jSONObject.put("countNew", i13);
                                        jSONObject.put("countDelete", i12);
                                        jSONObject.put("arrayTypeOld", jSONArray);
                                        jSONObject.put("arrayTypeNew", jSONArray2);
                                        String jSONObject2 = jSONObject.toString();
                                        m153115w("DELETE CONTACT: " + jSONObject2);
                                        if (i13 == count - i12) {
                                            AbstractC20887g.m109248z(120100, jSONObject2);
                                        } else {
                                            AbstractC20887g.m109240r(120101, jSONObject2);
                                        }
                                        if (m135981g2 != null) {
                                            try {
                                                m135981g2.close();
                                            } catch (Exception e12) {
                                                exc = e12;
                                                exc.printStackTrace();
                                                if (m135981g == null) {
                                                }
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        cursor2 = m135981g2;
                                        try {
                                            e.printStackTrace();
                                            if (cursor2 != null) {
                                                try {
                                                    cursor2.close();
                                                } catch (Exception e14) {
                                                    exc = e14;
                                                    exc.printStackTrace();
                                                    if (m135981g == null) {
                                                    }
                                                }
                                            }
                                            if (m135981g == null) {
                                            }
                                        } catch (Throwable th5) {
                                            th3 = th5;
                                            if (cursor2 == null) {
                                                try {
                                                    cursor2.close();
                                                    throw th3;
                                                } catch (Exception e15) {
                                                    e15.printStackTrace();
                                                    throw th3;
                                                }
                                            }
                                            throw th3;
                                        }
                                    } catch (Throwable th6) {
                                        th3 = th6;
                                        cursor2 = m135981g2;
                                        if (cursor2 == null) {
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            th2 = th7;
                            cursor = m135981g;
                            if (cursor == null) {
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        cursor = m135981g;
                        try {
                            e.printStackTrace();
                            if (cursor != null) {
                                cursor.close();
                            }
                            return;
                        } catch (Throwable th8) {
                            th2 = th8;
                            if (cursor == null) {
                                try {
                                    cursor.close();
                                    throw th2;
                                } catch (Exception e17) {
                                    e17.printStackTrace();
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Exception e18) {
                e = e18;
                cursor = null;
            } catch (Throwable th9) {
                th2 = th9;
                cursor = null;
            }
            if (m135981g == null) {
                m135981g.close();
            }
        } catch (Exception e19) {
            e19.printStackTrace();
        }
    }

    /* renamed from: B */
    void m153104B(int i11) {
        m153115w("--set--state--" + i11);
        AbstractC23309i.m122632yx(i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:(9:49|50|51|52|53|54|55|56|57)|(5:93|94|95|96|(5:99|100|101|102|103)(15:98|64|65|66|67|68|69|70|71|72|73|74|75|76|77))(2:61|62)|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:49|50|51|52|53|54|55|56|57|(5:93|94|95|96|(5:99|100|101|102|103)(15:98|64|65|66|67|68|69|70|71|72|73|74|75|76|77))(2:61|62)|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0363, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0364, code lost:            r0.printStackTrace();     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0368, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x036a, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x036d, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x036e, code lost:            r5 = r17;        r15 = r18;     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m153105g(Context context, c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ContentResolver contentResolver;
        String str10;
        String str11;
        String str12;
        ArrayList<ContentProviderOperation> arrayList;
        Uri uri;
        String str13;
        boolean z11;
        String str14;
        C31849b1 c31849b1 = this;
        c cVar2 = cVar;
        String str15 = BuildConfig.APPLICATION_ID;
        String str16 = "account_type";
        String str17 = "ZaloAccount";
        String str18 = "account_name";
        String str19 = "1";
        String str20 = "data4";
        String str21 = "data3";
        String str22 = "data1";
        String str23 = "mimetype";
        if (AbstractC23309i.m120851D3() && AbstractC23138m0.m118770b() && cVar2 != null && !TextUtils.isEmpty(cVar2.f146241b) && !TextUtils.isEmpty(cVar2.f146245f) && !cVar2.f146251l.isEmpty()) {
            Iterator it = cVar2.f146251l.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str24 = (String) entry.getKey();
                String str25 = (String) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                Iterator it2 = it;
                sb2.append("Add contact Method---UserId---");
                sb2.append(str24);
                String str26 = str19;
                sb2.append("---Phone---");
                sb2.append(str25);
                c31849b1.m153115w(sb2.toString());
                if (!TextUtils.isEmpty(str25)) {
                    if (TextUtils.isEmpty(str24)) {
                        it = it2;
                        str19 = str26;
                    } else {
                        String valueOf = String.valueOf(AbstractC2336a0.m12293b(Long.parseLong(str24)));
                        String str27 = str20;
                        String m118285k = AbstractC23056e6.m118285k(str25);
                        c31849b1.m153115w("Add contact Method---UserId---" + str24 + "---UserIdnoise---" + valueOf);
                        try {
                            contentResolver = context.getContentResolver();
                        } catch (Exception e11) {
                            e = e11;
                            str = str15;
                            str2 = str16;
                            str3 = str18;
                            str4 = str22;
                            str5 = str23;
                            str6 = str27;
                            str7 = str21;
                        }
                        if (!m153114q()) {
                            return;
                        }
                        try {
                            str10 = str21;
                        } catch (Exception e12) {
                            e = e12;
                            str10 = str21;
                        }
                        try {
                            Uri build = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter(str18, str17).appendQueryParameter(str16, str15).build();
                            String[] strArr = new String[2];
                            strArr[0] = valueOf;
                            str11 = str22;
                            try {
                                str12 = str23;
                                try {
                                    strArr[1] = cVar2.f146241b;
                                } catch (Exception e13) {
                                    e = e13;
                                    e.printStackTrace();
                                    if (!m118285k.equals(AbstractC23056e6.f112062a)) {
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                                str12 = str23;
                            }
                            try {
                                int m135976b = C26388b.m135976b(context, build, "sync2 = ? AND sync3 = ?", strArr, true);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Add contact Method---Pre delete Raw Contact---");
                                if (m135976b > 0) {
                                    str14 = "OK";
                                } else {
                                    str14 = "FAIL";
                                }
                                sb3.append(str14);
                                c31849b1.m153115w(sb3.toString());
                            } catch (Exception e15) {
                                e = e15;
                                e.printStackTrace();
                                if (!m118285k.equals(AbstractC23056e6.f112062a)) {
                                }
                            }
                        } catch (Exception e16) {
                            e = e16;
                            str11 = str22;
                            str12 = str23;
                            e.printStackTrace();
                            if (!m118285k.equals(AbstractC23056e6.f112062a)) {
                            }
                        }
                        if (!m118285k.equals(AbstractC23056e6.f112062a)) {
                            it = it2;
                            str19 = str26;
                            str20 = str27;
                            str21 = str10;
                            str22 = str11;
                            str23 = str12;
                        } else {
                            try {
                                arrayList = new ArrayList<>();
                                arrayList.add(ContentProviderOperation.newInsert(m153096f(ContactsContract.RawContacts.CONTENT_URI, true)).withValue(str18, str17).withValue(str16, str15).withValue("sync1", str25).withValue("sync2", valueOf).withValue("sync3", cVar2.f146241b).withValue("sync4", str24).withYieldAllowed(true).build());
                                uri = ContactsContract.Data.CONTENT_URI;
                                str = str15;
                                str5 = str12;
                                try {
                                    str2 = str16;
                                    str4 = str11;
                                    try {
                                        arrayList.add(ContentProviderOperation.newInsert(m153096f(uri, true)).withValueBackReference("raw_contact_id", 0).withValue(str5, "vnd.android.cursor.item/name").withValue(str4, cVar2.f146245f).withYieldAllowed(true).build());
                                    } catch (Exception e17) {
                                        e = e17;
                                        str3 = str18;
                                        str6 = str27;
                                        str7 = str10;
                                        str8 = str17;
                                        str9 = str26;
                                        e.printStackTrace();
                                        c31849b1 = this;
                                        cVar2 = cVar;
                                        str22 = str4;
                                        str19 = str9;
                                        str21 = str7;
                                        str18 = str3;
                                        str20 = str6;
                                        it = it2;
                                        str17 = str8;
                                        str16 = str2;
                                        str23 = str5;
                                        str15 = str;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    str2 = str16;
                                    str3 = str18;
                                    str6 = str27;
                                    str7 = str10;
                                    str4 = str11;
                                    str8 = str17;
                                    str9 = str26;
                                    e.printStackTrace();
                                    c31849b1 = this;
                                    cVar2 = cVar;
                                    str22 = str4;
                                    str19 = str9;
                                    str21 = str7;
                                    str18 = str3;
                                    str20 = str6;
                                    it = it2;
                                    str17 = str8;
                                    str16 = str2;
                                    str23 = str5;
                                    str15 = str;
                                }
                            } catch (Exception e19) {
                                e = e19;
                                str = str15;
                                str3 = str18;
                                str6 = str27;
                                str7 = str10;
                                str5 = str12;
                                str2 = str16;
                            }
                            if (cVar2.f146249j && cVar2.f146250k.containsKey(str24)) {
                                c31849b1.m153115w("DUPLICATE_CONTACT---PHONE---" + str25);
                                str3 = str18;
                                str13 = str17;
                            } else {
                                String str28 = str17;
                                str3 = str18;
                                try {
                                } catch (Exception e21) {
                                    e = e21;
                                    str9 = str26;
                                    str6 = str27;
                                    str8 = str28;
                                    str7 = str10;
                                    e.printStackTrace();
                                    c31849b1 = this;
                                    cVar2 = cVar;
                                    str22 = str4;
                                    str19 = str9;
                                    str21 = str7;
                                    str18 = str3;
                                    str20 = str6;
                                    it = it2;
                                    str17 = str8;
                                    str16 = str2;
                                    str23 = str5;
                                    str15 = str;
                                }
                                if (cVar2.f146248i != 0) {
                                    try {
                                        str13 = str28;
                                    } catch (Exception e22) {
                                        e = e22;
                                        str13 = str28;
                                        str9 = str26;
                                        str6 = str27;
                                        str7 = str10;
                                        str8 = str13;
                                        e.printStackTrace();
                                        c31849b1 = this;
                                        cVar2 = cVar;
                                        str22 = str4;
                                        str19 = str9;
                                        str21 = str7;
                                        str18 = str3;
                                        str20 = str6;
                                        it = it2;
                                        str17 = str8;
                                        str16 = str2;
                                        str23 = str5;
                                        str15 = str;
                                    }
                                    try {
                                        arrayList.add(ContentProviderOperation.newUpdate(m153096f(ContactsContract.AggregationExceptions.CONTENT_URI, true)).withValueBackReference("raw_contact_id2", 0).withValue(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1).withValue("raw_contact_id1", Long.valueOf(cVar2.f146248i)).withYieldAllowed(true).build());
                                    } catch (Exception e23) {
                                        e = e23;
                                        str9 = str26;
                                        str6 = str27;
                                        str7 = str10;
                                        str8 = str13;
                                        e.printStackTrace();
                                        c31849b1 = this;
                                        cVar2 = cVar;
                                        str22 = str4;
                                        str19 = str9;
                                        str21 = str7;
                                        str18 = str3;
                                        str20 = str6;
                                        it = it2;
                                        str17 = str8;
                                        str16 = str2;
                                        str23 = str5;
                                        str15 = str;
                                    }
                                } else {
                                    str13 = str28;
                                    z11 = true;
                                    arrayList.add(ContentProviderOperation.newInsert(m153096f(uri, true)).withValueBackReference("raw_contact_id", 0).withValue(str5, "vnd.android.cursor.item/phone_v2").withValue(str4, str25).withValue("data2", cVar2.f146252m.get(str25)).withYieldAllowed(true).build());
                                    str7 = str10;
                                    ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(m153096f(uri, z11)).withValueBackReference("raw_contact_id", 0).withValue(str5, f146224h).withValue(str4, valueOf).withValue("data2", MainApplication.getAppContext().getString(AbstractC8020f0.zalo)).withValue(str7, String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_hook_contact_call), m118285k));
                                    str9 = str26;
                                    str6 = str27;
                                    arrayList.add(withValue.withValue(str6, str9).withYieldAllowed(true).build());
                                    str8 = str13;
                                    arrayList.add(ContentProviderOperation.newInsert(m153096f(uri, true)).withValueBackReference("raw_contact_id", 0).withValue(str5, f146225i).withValue(str4, valueOf).withValue("data2", MainApplication.getAppContext().getString(AbstractC8020f0.zalo)).withValue(str7, String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_hook_contact_message), m118285k)).withValue(str6, str9).withYieldAllowed(true).build());
                                    arrayList.add(ContentProviderOperation.newInsert(m153096f(uri, true)).withValueBackReference("raw_contact_id", 0).withValue(str5, f146226j).withValue(str4, valueOf).withValue("data2", MainApplication.getAppContext().getString(AbstractC8020f0.zalo)).withValue(str7, String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_hook_contact_video_call), m118285k)).withValue(str6, str9).withYieldAllowed(true).build());
                                    contentResolver.applyBatch("com.android.contacts", arrayList);
                                    c31849b1 = this;
                                    cVar2 = cVar;
                                    str22 = str4;
                                    str19 = str9;
                                    str21 = str7;
                                    str18 = str3;
                                    str20 = str6;
                                    it = it2;
                                    str17 = str8;
                                    str16 = str2;
                                    str23 = str5;
                                    str15 = str;
                                }
                            }
                            z11 = true;
                            str7 = str10;
                            ContentProviderOperation.Builder withValue2 = ContentProviderOperation.newInsert(m153096f(uri, z11)).withValueBackReference("raw_contact_id", 0).withValue(str5, f146224h).withValue(str4, valueOf).withValue("data2", MainApplication.getAppContext().getString(AbstractC8020f0.zalo)).withValue(str7, String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_hook_contact_call), m118285k));
                            str9 = str26;
                            str6 = str27;
                            arrayList.add(withValue2.withValue(str6, str9).withYieldAllowed(true).build());
                            str8 = str13;
                            arrayList.add(ContentProviderOperation.newInsert(m153096f(uri, true)).withValueBackReference("raw_contact_id", 0).withValue(str5, f146225i).withValue(str4, valueOf).withValue("data2", MainApplication.getAppContext().getString(AbstractC8020f0.zalo)).withValue(str7, String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_hook_contact_message), m118285k)).withValue(str6, str9).withYieldAllowed(true).build());
                            arrayList.add(ContentProviderOperation.newInsert(m153096f(uri, true)).withValueBackReference("raw_contact_id", 0).withValue(str5, f146226j).withValue(str4, valueOf).withValue("data2", MainApplication.getAppContext().getString(AbstractC8020f0.zalo)).withValue(str7, String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_hook_contact_video_call), m118285k)).withValue(str6, str9).withYieldAllowed(true).build());
                            contentResolver.applyBatch("com.android.contacts", arrayList);
                            c31849b1 = this;
                            cVar2 = cVar;
                            str22 = str4;
                            str19 = str9;
                            str21 = str7;
                            str18 = str3;
                            str20 = str6;
                            it = it2;
                            str17 = str8;
                            str16 = str2;
                            str23 = str5;
                            str15 = str;
                        }
                    }
                } else {
                    c31849b1 = this;
                    cVar2 = cVar;
                    str19 = str26;
                    it = it2;
                    str17 = str17;
                }
            }
        }
    }

    /* renamed from: h */
    public void m153106h(boolean z11) {
        m153115w("--checkAndSyncContact--");
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: zh.y0

            /* renamed from: q */
            public final /* synthetic */ boolean f148408q;

            public /* synthetic */ RunnableC32183y0(boolean z112) {
                r2 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31849b1.this.m153098r(r2);
            }
        });
    }

    /* renamed from: i */
    public void m153107i(Context context) {
        try {
            Account m153110l = m153110l();
            if (((AccountManager) context.getSystemService("account")).addAccountExplicitly(m153110l, null, null)) {
                ContentResolver.setIsSyncable(m153110l, "com.android.contacts", 1);
                ContentResolver.setSyncAutomatically(m153110l, "com.android.contacts", true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public void m153108j() {
        try {
            AccountManager accountManager = AccountManager.get(MainApplication.getAppContext());
            for (Account account : accountManager.getAccountsByType(BuildConfig.APPLICATION_ID)) {
                accountManager.removeAccount(account, null, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    void m153109k(String str, String str2) {
        String str3;
        if (!AbstractC23309i.m120851D3() || !m153114q()) {
            return;
        }
        try {
            int m135976b = C26388b.m135976b(MainApplication.getAppContext(), ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", "ZaloAccount").appendQueryParameter("account_type", BuildConfig.APPLICATION_ID).build(), "sync2 = ? AND sync3 = ?", new String[]{str, str2}, true);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete Raw Contact ");
            if (m135976b > 0) {
                str3 = "OK";
            } else {
                str3 = "FAIL";
            }
            sb2.append(str3);
            m153115w(sb2.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    Account m153110l() {
        return new Account("ZaloAccount", BuildConfig.APPLICATION_ID);
    }

    /* renamed from: m */
    public void m153111m(d dVar) {
        f146229m.execute(new Runnable() { // from class: zh.w0
            public /* synthetic */ RunnableC32155w0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31849b1.m153099s(C31849b1.d.this);
            }
        });
    }

    /* renamed from: o */
    public void m153112o() {
        if (this.f146237e) {
            return;
        }
        this.f146237e = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b());
        c0766k.mo1693n5();
    }

    /* renamed from: p */
    public void m153113p() {
        try {
            m153108j();
            C0824j.m2153b(new a());
            AbstractC23309i.m121281Oq(0L);
            AbstractC23309i.m122337qy(0L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0057 -> B:19:0x0093). Please report as a decompilation issue!!! */
    /* renamed from: q */
    boolean m153114q() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112032i) != 0) {
                return false;
            }
            return true;
        }
        if (!C8937j0.m47663l("phonebook_query_contacts_for_permission_check")) {
            return false;
        }
        SensitiveData sensitiveData = new SensitiveData("phonebook_query_contacts_for_permission_check", "phonebook_permission_check");
        Cursor cursor = null;
        try {
            try {
                try {
                    C8937j0.m47661j().m50393d(sensitiveData);
                    cursor = C26388b.m135984j(MainApplication.getAppContext(), ContactsContract.CommonDataKinds.Phone.CONTENT_URI, this.f146233a, null, null, null, true);
                } finally {
                    C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
            } catch (Exception e12) {
                C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
                e12.printStackTrace();
                C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                if (cursor != null) {
                    cursor.close();
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        if (cursor != null) {
            if (cursor.getCount() != 0) {
                C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                cursor.close();
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    void m153115w(String str) {
        if (f146232p) {
            AbstractC20110a.m104542k(8, str, new Object[0]);
        } else if (f146231o) {
            AbstractC20110a.m104535d(str, new Object[0]);
        }
    }

    /* renamed from: x */
    public void m153116x(String str) {
        f146229m.execute(new Runnable() { // from class: zh.z0

            /* renamed from: q */
            public final /* synthetic */ String f148493q;

            public /* synthetic */ RunnableC32197z0(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31849b1.this.m153100t(r2);
            }
        });
    }

    /* renamed from: y */
    public void m153117y(JSONArray jSONArray) {
        f146229m.execute(new Runnable() { // from class: zh.a1

            /* renamed from: q */
            public final /* synthetic */ JSONArray f146107q;

            public /* synthetic */ RunnableC31834a1(JSONArray jSONArray2) {
                r2 = jSONArray2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31849b1.this.m153101u(r2);
            }
        });
    }

    /* renamed from: z */
    public void m153118z(Context context, boolean z11) {
        e eVar = this.f146234b;
        if (eVar != null) {
            eVar.removeMessages(1);
        }
        if (!AbstractC23309i.m120851D3() || TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        if (z11) {
            m153107i(context);
        }
        f146228l.execute(new Runnable() { // from class: zh.x0

            /* renamed from: q */
            public final /* synthetic */ SensitiveData f148313q;

            /* renamed from: r */
            public final /* synthetic */ Context f148314r;

            public /* synthetic */ RunnableC32169x0(SensitiveData sensitiveData, Context context2) {
                r2 = sensitiveData;
                r3 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C31849b1.this.m153102v(r2, r3);
            }
        });
    }
}
