package me0;

import ag0.AbstractC0837p0;
import am.AbstractC0906d0;
import am.C0927o;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.core.content.AbstractC1388a;
import au.C2343e;
import com.zing.zalo.C8937j0;
import com.zing.zalo.C9353s;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import gm0.AbstractC19512f;
import ho0.AbstractC20110a;
import hu.C20131e;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p716zh.C31901e8;
import su.C26388b;
import vg.C28203u6;

/* renamed from: me0.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC23028c0 {

    /* renamed from: a */
    static String[] f112007a;

    /* renamed from: b */
    static String[] f112008b = {"032", "033", "034", "035", "036", "037", "038", "039", "070", "079", "077", "076", "078", "083", "084", "085", "081", "082", "058", "056", "059"};

    /* renamed from: c */
    static String[] f112009c;

    /* renamed from: d */
    static String[] f112010d;

    static {
        String[] strArr = {"0162", "0163", "0164", "0165", "0166", "0167", "0168", "0169", "0120", "0121", "0122", "0126", "0128", "0123", "0124", "0125", "0127", "0129", "0188", "0186", "0199"};
        f112007a = strArr;
        f112009c = new String[strArr.length];
        f112010d = new String[strArr.length];
        for (int i11 = 0; i11 < f112007a.length; i11++) {
            f112009c[i11] = "84" + f112007a[i11].substring(1);
            f112010d[i11] = "+84" + f112008b[i11].substring(1);
        }
    }

    /* renamed from: b */
    public static String m118082b(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        for (char c11 : charArray) {
            if (c11 >= '0' && c11 <= '9') {
                sb2.append(c11);
            }
        }
        String sb3 = sb2.toString();
        int indexOf = sb3.indexOf("84");
        if (indexOf > -1 && sb3.length() - indexOf == 12) {
            return sb3.substring(indexOf);
        }
        return sb3;
    }

    /* renamed from: c */
    public static ArrayList m118083c(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "numberInter";
        String str7 = "number";
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length > 0) {
                int i11 = 0;
                while (i11 < length) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        String str8 = "";
                        if (!jSONObject.has(str7)) {
                            str4 = "";
                        } else {
                            str4 = jSONObject.getString(str7);
                        }
                        if (!jSONObject.has(str6)) {
                            str5 = "";
                        } else {
                            str5 = jSONObject.getString(str6);
                        }
                        long optLong = jSONObject.optLong("zaloUid");
                        str2 = str6;
                        str3 = str7;
                        try {
                            long optLong2 = jSONObject.optLong("dbId");
                            if (str5.equals("")) {
                                str5 = AbstractC23056e6.m118285k(str4);
                            }
                            String str9 = str5;
                            if (jSONObject.has("displayName")) {
                                str8 = jSONObject.getString("displayName");
                            }
                            C31901e8 c31901e8 = new C31901e8(optLong, str8, str4, str9);
                            c31901e8.m153304x(optLong2);
                            arrayList.add(c31901e8);
                        } catch (Exception e11) {
                            e = e11;
                            AbstractC20110a.m104539h(e);
                            i11++;
                            str6 = str2;
                            str7 = str3;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str2 = str6;
                        str3 = str7;
                    }
                    i11++;
                    str6 = str2;
                    str7 = str3;
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ContactProfile m118084d(String str) {
        if (str == null) {
            return null;
        }
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c == null && str.equals(CoreUtility.f89233i)) {
            return AbstractC23304d.f113368c0;
        }
        return m141809c;
    }

    /* renamed from: e */
    public static String m118085e(ContactProfile contactProfile, boolean z11, int i11) {
        if (contactProfile == null) {
            return "";
        }
        if (contactProfile.f42434r.equals(CoreUtility.f89233i) && z11) {
            return MainApplication.getAppContext().getString(i11);
        }
        return contactProfile.m40383Q(true, false);
    }

    /* renamed from: f */
    public static String m118086f(String str, boolean z11, int i11) {
        return m118085e(C28203u6.f131407a.m141809c(str), z11, i11);
    }

    /* renamed from: g */
    public static String m118087g(String str) {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            String[] m119973H = AbstractC23262x6.m119973H(str);
            if (m119973H.length > 1) {
                if (TextUtils.isEmpty(m119973H[0]) && TextUtils.isEmpty(m119973H[m119973H.length - 1])) {
                    sb2.append("#");
                } else {
                    if (!TextUtils.isEmpty(m119973H[0])) {
                        sb2.append(m119973H[0].charAt(0));
                    }
                    if (!TextUtils.isEmpty(m119973H[m119973H.length - 1])) {
                        sb2.append(m119973H[m119973H.length - 1].charAt(0));
                    }
                }
            } else if (m119973H.length == 1 && !TextUtils.isEmpty(m119973H[0])) {
                sb2.append(m119973H[0].charAt(0));
            } else {
                sb2.append("#");
            }
        } else {
            sb2.append("#");
        }
        return sb2.toString().toUpperCase();
    }

    /* renamed from: h */
    public static synchronized String m118088h(List list) {
        String sb2;
        synchronized (AbstractC23028c0.class) {
            try {
                int size = list.size();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("[");
                for (int i11 = 0; i11 < size; i11++) {
                    try {
                        int length = sb3.length();
                        try {
                            try {
                                C31901e8 c31901e8 = (C31901e8) list.get(i11);
                                sb3.append("{");
                                sb3.append("\"dbId\":");
                                sb3.append(JSONObject.quote(String.valueOf(c31901e8.m153294g())));
                                sb3.append(",");
                                sb3.append("\"zaloUid\":");
                                sb3.append(JSONObject.quote(String.valueOf(c31901e8.m153300r())));
                                sb3.append(",");
                                sb3.append("\"displayName\":");
                                sb3.append(JSONObject.quote(c31901e8.m153295h()));
                                sb3.append(",");
                                sb3.append("\"numberInter\":");
                                sb3.append(JSONObject.quote(c31901e8.m153298m()));
                                sb3.append(",");
                                sb3.append("\"number\":");
                                sb3.append(JSONObject.quote(c31901e8.m153297j()));
                                if (i11 != size - 1) {
                                    sb3.append("},");
                                } else {
                                    sb3.append("}");
                                }
                            } catch (Exception unused) {
                                sb3.delete(length, sb3.length());
                                String str = AbstractC23059e9.f112067a;
                            }
                        } catch (Exception e11) {
                            AbstractC23350e.m122776f(AbstractC23059e9.f112067a, e11);
                            String str2 = AbstractC23059e9.f112067a;
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                sb3.append("]");
                sb2 = sb3.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb2;
    }

    /* renamed from: i */
    public static String m118089i(String str) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c != null) {
            return m141809c.f42437s;
        }
        return "";
    }

    /* renamed from: j */
    public static /* synthetic */ void m118090j(Context context) {
        FileWriter fileWriter = null;
        try {
            try {
                try {
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (!AbstractC0906d0.m2804j()) {
                m118091k(context);
                return;
            }
            String str = AbstractC23059e9.f112067a;
            List<C31901e8> m2802h = AbstractC0906d0.m2802h(context);
            String m118088h = m118088h(m2802h);
            FileWriter fileWriter2 = new FileWriter(C20131e.f99303a.m104932N());
            try {
                try {
                    fileWriter2.write(m118088h);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    Collections.sort(m2802h, C31901e8.f146550E);
                    for (C31901e8 c31901e8 : m2802h) {
                        messageDigest.update(AbstractC17522a.m93346i(c31901e8.m153300r()));
                        String m153298m = c31901e8.m153298m();
                        if (m153298m != null) {
                            messageDigest.update(m153298m.getBytes(StandardCharsets.UTF_8));
                        }
                        String m153295h = c31901e8.m153295h();
                        if (m153295h != null) {
                            messageDigest.update(m153295h.getBytes(StandardCharsets.UTF_8));
                        }
                    }
                    String m101985d = AbstractC19512f.m101985d(messageDigest.digest());
                    AbstractC20110a.m104535d("phone-contact hash: %s", m101985d);
                    String m120741A4 = AbstractC23309i.m120741A4();
                    AbstractC20110a.m104535d("phone-contact old hash: %s", m120741A4);
                    AbstractC23309i.m121359Qu(AbstractC23309i.m121704a5());
                    if (m120741A4 == null || !m120741A4.equalsIgnoreCase(m101985d)) {
                        AbstractC20110a.m104535d("phone-contact write to database", new Object[0]);
                        C0927o m4426d = C0927o.m4426d(context);
                        SQLiteDatabase writableDatabase = C0927o.m4426d(context).getWritableDatabase();
                        m4426d.m4428f().m2874o(writableDatabase);
                        m4426d.m4428f().m2860a();
                        try {
                            C0927o.m4425c(m4426d.m4428f());
                            for (C31901e8 c31901e82 : m2802h) {
                                C0927o.m4427h(m4426d.m4428f(), c31901e82.m153294g(), c31901e82.m153295h(), c31901e82.m153297j(), c31901e82.m153298m(), c31901e82.m153300r());
                            }
                            writableDatabase.setTransactionSuccessful();
                            AbstractC23309i.m121427So(m101985d);
                            try {
                                writableDatabase.endTransaction();
                            } catch (Exception e13) {
                                AbstractC23350e.m122776f(AbstractC23059e9.f112067a, e13);
                            }
                        } catch (Throwable th2) {
                            if (writableDatabase != null) {
                                try {
                                    writableDatabase.endTransaction();
                                } catch (Exception e14) {
                                    AbstractC23350e.m122776f(AbstractC23059e9.f112067a, e14);
                                }
                            }
                            throw th2;
                        }
                    }
                    AbstractC23309i.m120791Bh(true);
                    fileWriter2.close();
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter = fileWriter2;
                    if (fileWriter != null) {
                        try {
                            fileWriter.close();
                        } catch (Exception e15) {
                            e15.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
                fileWriter = fileWriter2;
                AbstractC23350e.m122776f(AbstractC23059e9.f112067a, e);
                if (fileWriter != null) {
                    fileWriter.close();
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: k */
    public static synchronized void m118091k(Context context) {
        synchronized (AbstractC23028c0.class) {
            try {
                try {
                    C20131e c20131e = C20131e.f99303a;
                    if (AbstractC23041d2.m118194A(c20131e.m104932N())) {
                        String m121704a5 = AbstractC23309i.m121704a5();
                        if (AbstractC0906d0.m2804j()) {
                            if (m121704a5 != null && !m121704a5.equalsIgnoreCase(AbstractC23309i.m121597X9())) {
                            }
                        }
                        String str = AbstractC23059e9.f112067a;
                        ArrayList<C31901e8> m118083c = m118083c(AbstractC23041d2.m118196C(c20131e.m104932N()));
                        if (m121704a5 != null && !m121704a5.equalsIgnoreCase(AbstractC23309i.m121597X9())) {
                            for (C31901e8 c31901e8 : m118083c) {
                                c31901e8.m153306z(AbstractC23056e6.m118285k(c31901e8.m153297j()));
                            }
                            AbstractC23309i.m120791Bh(false);
                        }
                        AbstractC0906d0.m2798d(m118083c);
                        String str2 = AbstractC23059e9.f112067a;
                    }
                } catch (Exception e11) {
                    e = e11;
                    AbstractC23350e.m122776f(AbstractC23059e9.f112067a, e);
                } catch (OutOfMemoryError e12) {
                    e = e12;
                    AbstractC23350e.m122776f(AbstractC23059e9.f112067a, e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: l */
    public static Drawable m118092l(Context context, String str, int i11, SensitiveData sensitiveData) {
        Drawable mo88412f;
        C8937j0.m47661j().m50393d(sensitiveData);
        Cursor m135984j = C26388b.m135984j(context, Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name", "_id"}, null, null, null, true);
        String str2 = null;
        String str3 = null;
        if (m135984j != null) {
            while (m135984j.moveToNext()) {
                str2 = m135984j.getString(m135984j.getColumnIndexOrThrow("display_name"));
                str3 = m135984j.getString(m135984j.getColumnIndexOrThrow("_id"));
            }
            m135984j.close();
        }
        if (TextUtils.isEmpty(str2)) {
            mo88412f = AbstractC1388a.m6964f(context, i11);
        } else {
            mo88412f = C16640q2.m88404a().mo88412f(m118087g(str2), C2343e.m12308b("", false, true));
        }
        if (str3 == null) {
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
            return mo88412f;
        }
        try {
            try {
                InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str3)), false);
                if (openContactPhotoInputStream != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), AbstractC23170p.m119347e(BitmapFactory.decodeStream(openContactPhotoInputStream)));
                    try {
                        openContactPhotoInputStream.close();
                        mo88412f = bitmapDrawable;
                    } catch (IOException e11) {
                        e = e11;
                        mo88412f = bitmapDrawable;
                        C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
                        e.printStackTrace();
                        return mo88412f;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
            return mo88412f;
        } finally {
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
        }
    }

    /* renamed from: m */
    public static List m118093m(SensitiveData sensitiveData) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                try {
                    C8937j0.m47661j().m50393d(sensitiveData);
                    cursor = C26388b.m135984j(MainApplication.getAppContext(), ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, "display_name COLLATE LOCALIZED ASC", true);
                    if (cursor != null && cursor.moveToFirst()) {
                        int columnIndex = cursor.getColumnIndex("display_name");
                        int columnIndex2 = cursor.getColumnIndex("data1");
                        int columnIndex3 = cursor.getColumnIndex("_id");
                        do {
                            try {
                                String string = cursor.getString(columnIndex2);
                                if (string != null && string.length() > 6) {
                                    C31901e8 c31901e8 = new C31901e8(cursor.getString(columnIndex), string);
                                    c31901e8.m153304x(cursor.getLong(columnIndex3));
                                    arrayList.add(c31901e8);
                                }
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        } while (cursor.moveToNext());
                    }
                    C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
                    if (cursor != null) {
                        cursor.close();
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
            return arrayList;
        } catch (Throwable th2) {
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
            if (0 != 0) {
                try {
                    cursor.close();
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
            }
            throw th2;
        }
    }

    /* renamed from: n */
    public static List m118094n(List list, SensitiveData sensitiveData) {
        ArrayList arrayList = new ArrayList();
        C9353s m47661j = C8937j0.m47661j();
        String m35528c = sensitiveData.m35528c();
        Cursor cursor = null;
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            try {
            } catch (Exception e12) {
                m47661j.m50392b(m35528c, false);
                e12.printStackTrace();
                m47661j.m50392b(m35528c, true);
                if (cursor != null) {
                    cursor.close();
                }
            }
            if (list.isEmpty()) {
                m47661j.m50392b(m35528c, true);
                return arrayList;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (sb2.length() == 0) {
                    sb2.append("_id");
                    sb2.append(" IN (");
                    sb2.append(longValue);
                } else {
                    sb2.append(",");
                    sb2.append(longValue);
                }
            }
            sb2.append(")");
            m47661j.m50393d(sensitiveData);
            cursor = C26388b.m135984j(MainApplication.getAppContext(), ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, sb2.toString(), null, "display_name COLLATE LOCALIZED ASC", true);
            if (cursor != null && cursor.moveToFirst()) {
                int columnIndex = cursor.getColumnIndex("display_name");
                int columnIndex2 = cursor.getColumnIndex("data1");
                int columnIndex3 = cursor.getColumnIndex("_id");
                do {
                    try {
                        C31901e8 c31901e8 = new C31901e8(cursor.getString(columnIndex), cursor.getString(columnIndex2));
                        c31901e8.m153304x(cursor.getLong(columnIndex3));
                        arrayList.add(c31901e8);
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                } while (cursor.moveToNext());
            }
            m47661j.m50392b(m35528c, true);
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } finally {
        }
    }

    /* renamed from: o */
    public static synchronized void m118095o(Context context) {
        synchronized (AbstractC23028c0.class) {
            String str = AbstractC23059e9.f112067a;
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: me0.b0

                /* renamed from: p */
                public final /* synthetic */ Context f111982p;

                public /* synthetic */ RunnableC23017b0(Context context2) {
                    r1 = context2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC23028c0.m118090j(r1);
                }
            });
        }
    }
}
