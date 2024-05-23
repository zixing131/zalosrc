package p135em;

import ae.C0766k;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import com.zing.zalo.MainApplication;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import gm0.AbstractC19512f;
import gm0.AbstractC19513g;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p135em.C18489c;
import p248iy.AbstractC20886f;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p371nv.C23952g;
import p609wh.AbstractC29039u0;

/* renamed from: em.c */
/* loaded from: classes.dex */
public class C18489c implements C7962g.c {

    /* renamed from: k */
    static final long[] f93079k = {60000, 120000, 300000, 900000, 3600000};

    /* renamed from: l */
    static final String f93080l = C18489c.class.getSimpleName();

    /* renamed from: m */
    static volatile ConcurrentHashMap f93081m = new ConcurrentHashMap();

    /* renamed from: n */
    static int f93082n = 0;

    /* renamed from: o */
    static boolean f93083o = false;

    /* renamed from: c */
    long f93084c;

    /* renamed from: d */
    int f93085d;

    /* renamed from: e */
    String f93086e;

    /* renamed from: f */
    int f93087f;

    /* renamed from: g */
    long f93088g;

    /* renamed from: h */
    long f93089h;

    /* renamed from: i */
    long f93090i;

    /* renamed from: j */
    String f93091j;

    /* renamed from: em.c$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {
        a() {
        }

        /* renamed from: d */
        public static /* synthetic */ String m97865d() {
            return AbstractC29039u0.m145033a(AbstractC29039u0.b.UPLOAD_QOS);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                C18489c.f93083o = false;
                if (c20096c.m104491c() != 50001) {
                    int i11 = C18489c.f93082n + 1;
                    C18489c.f93082n = i11;
                    long[] jArr = C18489c.f93079k;
                    if (i11 > jArr.length) {
                        C18489c.f93082n = jArr.length;
                    }
                    if (C18489c.f93082n < 1) {
                        C18489c.f93082n = 1;
                    }
                    AbstractC23309i.m121768bu(System.currentTimeMillis() + jArr[C18489c.f93082n - 1]);
                    C18489c.m97851o(C7962g.c.a.SERVICE_MAP);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C18489c.f93080l, e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C18489c.f93083o = false;
                AbstractC23309i.m121768bu(System.currentTimeMillis() + 86400000);
                C18489c.m97851o(C7962g.c.a.SERVICE_MAP);
                C18489c.m97855u(C18489c.m97844b((byte[]) obj));
                C18489c.f93082n = 0;
                AbstractC20886f.m109207g().mo145981a(new InterfaceC18494a() { // from class: em.b
                    @Override // en0.InterfaceC18494a
                    /* renamed from: V4 */
                    public final Object mo12V4() {
                        String m97865d;
                        m97865d = C18489c.a.m97865d();
                        return m97865d;
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C18489c.f93080l, e11);
            }
        }
    }

    public C18489c(C7962g.c.a aVar, String str, int i11) {
        this(aVar.m42671c(), str, i11);
    }

    /* renamed from: a */
    public static List m97843a(InputStream inputStream) {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return m97844b(byteArray);
            }
        }
    }

    /* renamed from: b */
    public static List m97844b(byte[] bArr) {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(AESUtils.m39915a(CoreUtility.f89231g, AbstractC19512f.m101984c(new String(bArr)))));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read <= 0) {
                break;
            }
            byteArrayOutputStream.write(bArr2, 0, read);
        }
        gZIPInputStream.close();
        byteArrayOutputStream.flush();
        String m101987a = AbstractC19513g.m101987a(byteArrayOutputStream.toByteArray());
        byteArrayOutputStream.close();
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject(m101987a);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                C7962g.c.a m42670h = C7962g.c.a.m42670h(next);
                if (m42670h != null && m42670h != C7962g.c.a.UNKNOWN) {
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        arrayList.add(new C18489c(m42670h.m42671c(), jSONArray.getString(i11), 80));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f93080l, e11);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static C18489c m97845g(int i11) {
        C18489c c18489c = (C18489c) f93081m.get(Integer.valueOf(i11));
        if (c18489c == null) {
            try {
                Cursor query = C7962g.m42665c(MainApplication.getAppContext()).getReadableDatabase().query("service_map", C7962g.c.f43292b, "type=?", new String[]{String.valueOf(i11)}, null, null, "last_used ASC");
                if (query.getCount() > 0 && query.moveToFirst()) {
                    C18489c c18489c2 = new C18489c(query);
                    try {
                        f93081m.put(Integer.valueOf(i11), c18489c2);
                        c18489c = c18489c2;
                    } catch (Exception e11) {
                        e = e11;
                        c18489c = c18489c2;
                        AbstractC23350e.m122776f(f93080l, e);
                        return c18489c;
                    }
                }
                query.close();
                if (c18489c != null) {
                    SQLiteDatabase writableDatabase = C7962g.m42665c(MainApplication.getAppContext()).getWritableDatabase();
                    c18489c.m97863q(System.currentTimeMillis());
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("last_used", Long.valueOf(c18489c.m97859f()));
                    writableDatabase.update("service_map", contentValues, "_id=?", new String[]{String.valueOf(c18489c.f93084c)});
                    String str = c18489c.f93086e;
                    if (str != null && str.startsWith("http://")) {
                        C23952g.m125345j("ServiceMap", c18489c.toString());
                        AbstractC20887g.m109245w(17101);
                    }
                }
            } catch (Exception e12) {
                e = e12;
            }
        }
        return c18489c;
    }

    /* renamed from: h */
    public static C18489c m97846h(C7962g.c.a aVar) {
        C18489c m97845g = m97845g(aVar.m42671c());
        if (m97845g == null) {
            return new C18489c(aVar);
        }
        return m97845g;
    }

    /* renamed from: i */
    public static List m97847i(int i11) {
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = C7962g.m42665c(MainApplication.getAppContext()).getReadableDatabase().query("service_map", C7962g.c.f43292b, "type=?", new String[]{String.valueOf(i11)}, null, null, "last_used DESC");
            if (query != null && query.getCount() > 0) {
                query.moveToFirst();
                do {
                    arrayList.add(new C18489c(query));
                } while (query.moveToNext());
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f93080l, e11);
        }
        return arrayList;
    }

    /* renamed from: j */
    public static List m97848j(C7962g.c.a aVar) {
        return m97847i(aVar.m42671c());
    }

    /* renamed from: k */
    public static String m97849k(C7962g.c.a aVar) {
        return m97846h(aVar).m97856c();
    }

    /* renamed from: n */
    public static C18489c m97850n(int i11) {
        C18489c c18489c = (C18489c) f93081m.get(Integer.valueOf(i11));
        if (c18489c != null) {
            f93081m.remove(Integer.valueOf(i11));
        }
        return c18489c;
    }

    /* renamed from: o */
    public static C18489c m97851o(C7962g.c.a aVar) {
        return m97850n(aVar.m42671c());
    }

    /* renamed from: r */
    public static synchronized void m97852r(boolean z11) {
        synchronized (C18489c.class) {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f93080l, e11);
            } finally {
            }
            if (!f93083o && (z11 || AbstractC23309i.m122312q9() <= System.currentTimeMillis())) {
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new a());
                c0766k.mo1576Xa();
                f93083o = true;
                AbstractC23309i.m121768bu(System.currentTimeMillis() + 86400000);
            }
        }
    }

    /* renamed from: s */
    public static void m97853s(int i11, List list) {
        if (list != null && list.size() != 0) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    SQLiteDatabase writableDatabase = C7962g.m42665c(MainApplication.getAppContext()).getWritableDatabase();
                    try {
                        writableDatabase.beginTransaction();
                        writableDatabase.delete("service_map", "type=?", new String[]{String.valueOf(i11)});
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C18489c c18489c = (C18489c) it.next();
                            c18489c.m97862p(currentTimeMillis);
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, Integer.valueOf(i11));
                            contentValues.put("host", c18489c.f93086e);
                            contentValues.put("port", Integer.valueOf(c18489c.f93087f));
                            contentValues.put("key_xor", Long.valueOf(c18489c.f93090i));
                            contentValues.put("key_ps", c18489c.f93091j);
                            contentValues.put("last_used", Long.valueOf(c18489c.f93089h));
                            contentValues.put("last_update", Long.valueOf(c18489c.f93088g));
                            writableDatabase.insert("service_map", null, contentValues);
                        }
                        writableDatabase.setTransactionSuccessful();
                        try {
                            if (writableDatabase.inTransaction()) {
                                writableDatabase.endTransaction();
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    } catch (Exception e12) {
                        e = e12;
                        AbstractC23350e.m122776f(f93080l, e);
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = writableDatabase;
                        if (sQLiteDatabase != null) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: t */
    public static void m97854t(C7962g.c.a aVar, List list) {
        m97853s(aVar.m42671c(), list);
    }

    /* renamed from: u */
    public static void m97855u(List list) {
        if (list != null && list.size() != 0) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C18489c c18489c = (C18489c) it.next();
                List list2 = (List) sparseArray.get(c18489c.f93085d);
                if (list2 == null) {
                    list2 = new ArrayList();
                    sparseArray.put(c18489c.f93085d, list2);
                }
                list2.add(c18489c);
            }
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                try {
                    List list3 = (List) sparseArray.valueAt(i11);
                    m97853s(((C18489c) list3.get(0)).f93085d, list3);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f(f93080l, e11);
                }
            }
        }
    }

    /* renamed from: c */
    public String m97856c() {
        return this.f93086e;
    }

    /* renamed from: d */
    public String m97857d() {
        return this.f93091j;
    }

    /* renamed from: e */
    public long m97858e() {
        return this.f93090i;
    }

    /* renamed from: f */
    public long m97859f() {
        return this.f93089h;
    }

    /* renamed from: l */
    public int m97860l() {
        return this.f93087f;
    }

    /* renamed from: m */
    public int m97861m() {
        return this.f93085d;
    }

    /* renamed from: p */
    public void m97862p(long j11) {
        this.f93088g = j11;
    }

    /* renamed from: q */
    public void m97863q(long j11) {
        this.f93089h = j11;
    }

    public String toString() {
        return "id=" + this.f93084c + "\ntype=" + this.f93085d + "\nhost=" + this.f93086e + "\nport=" + this.f93087f + "\nlastUpdate=" + this.f93088g + "\nlastUsed=" + this.f93089h + '\n';
    }

    public C18489c(C7962g.c.a aVar, String str, int i11, long j11) {
        this(aVar.m42671c(), str, i11, j11);
    }

    public C18489c(C7962g.c.a aVar, String str, int i11, long j11, String str2) {
        this(aVar.m42671c(), str, i11, j11, str2);
    }

    public C18489c(int i11, String str, int i12) {
        this.f93089h = 0L;
        this.f93085d = i11;
        this.f93086e = str;
        this.f93087f = i12;
        this.f93090i = 0L;
    }

    public C18489c(int i11, String str, int i12, long j11) {
        this.f93089h = 0L;
        this.f93085d = i11;
        this.f93086e = str;
        this.f93087f = i12;
        this.f93090i = j11;
    }

    public C18489c(int i11, String str, int i12, long j11, String str2) {
        this.f93089h = 0L;
        this.f93085d = i11;
        this.f93086e = str;
        this.f93087f = i12;
        this.f93090i = j11;
        this.f93091j = str2;
    }

    C18489c(Cursor cursor) {
        this.f93089h = 0L;
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        int columnIndex3 = cursor.getColumnIndex("host");
        int columnIndex4 = cursor.getColumnIndex("port");
        int columnIndex5 = cursor.getColumnIndex("key_xor");
        int columnIndex6 = cursor.getColumnIndex("key_ps");
        int columnIndex7 = cursor.getColumnIndex("last_update");
        int columnIndex8 = cursor.getColumnIndex("last_used");
        this.f93084c = cursor.getLong(columnIndex);
        this.f93085d = cursor.getInt(columnIndex2);
        this.f93086e = cursor.getString(columnIndex3);
        this.f93087f = cursor.getInt(columnIndex4);
        this.f93090i = columnIndex5 >= 0 ? cursor.getLong(columnIndex5) : 0L;
        this.f93091j = columnIndex6 >= 0 ? cursor.getString(columnIndex6) : "";
        this.f93088g = cursor.getLong(columnIndex7);
        this.f93089h = cursor.getLong(columnIndex8);
    }

    public C18489c(C7962g.c.a aVar) {
        this(aVar.m42671c(), aVar.m42673e(), aVar.m42674g());
    }
}
