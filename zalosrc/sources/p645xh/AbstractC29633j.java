package p645xh;

import ag0.C0832n;
import am.AbstractC0908e0;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8012e0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.utils.EnumC16739a;
import com.zing.zalo.utils.cryptology.AESUtils;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import ho0.AbstractC20110a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import me0.AbstractC23044d5;
import me0.C23055e5;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import mm0.AbstractC23351f;
import p135em.C18489c;
import p348mi.AbstractC23304d;
import p372nw.C23953a;
import s00.AbstractC26080o;
import th.AbstractC26684e;

/* renamed from: xh.j */
/* loaded from: classes.dex */
public abstract class AbstractC29633j {
    /* renamed from: a */
    public static String m147352a() {
        String[] m125360a = new C23953a(MainApplication.getAppContext()).m125360a();
        String str = new String();
        int i11 = 0;
        while (i11 < m125360a.length) {
            str = str + m125360a[i11];
            i11++;
            if (i11 < m125360a.length) {
                str = str + ",";
            }
        }
        return str;
    }

    /* renamed from: b */
    public static ArrayList m147353b() {
        ArrayList arrayList = new ArrayList();
        List m97848j = C18489c.m97848j(C7962g.c.a.ALIAS_API);
        for (int i11 = 0; i11 < m97848j.size(); i11++) {
            arrayList.add(((C18489c) m97848j.get(i11)).m97856c());
        }
        List m97848j2 = C18489c.m97848j(C7962g.c.a.ACK_MSGID_S);
        for (int i12 = 0; i12 < m97848j2.size(); i12++) {
            arrayList.add(((C18489c) m97848j2.get(i12)).m97856c());
        }
        List m97848j3 = C18489c.m97848j(C7962g.c.a.API_TALK_S);
        for (int i13 = 0; i13 < m97848j3.size(); i13++) {
            arrayList.add(((C18489c) m97848j3.get(i13)).m97856c());
        }
        List m97848j4 = C18489c.m97848j(C7962g.c.a.AUTH_ZALOAPP_S);
        for (int i14 = 0; i14 < m97848j4.size(); i14++) {
            arrayList.add(((C18489c) m97848j4.get(i14)).m97856c());
        }
        List m97848j5 = C18489c.m97848j(C7962g.c.a.BKMSG_TALK);
        for (int i15 = 0; i15 < m97848j5.size(); i15++) {
            arrayList.add(((C18489c) m97848j5.get(i15)).m97856c());
        }
        List m97848j6 = C18489c.m97848j(C7962g.c.a.BROADCAST_MSG_S);
        for (int i16 = 0; i16 < m97848j6.size(); i16++) {
            arrayList.add(((C18489c) m97848j6.get(i16)).m97856c());
        }
        List m97848j7 = C18489c.m97848j(C7962g.c.a.CALENDAR_API_S);
        for (int i17 = 0; i17 < m97848j7.size(); i17++) {
            arrayList.add(((C18489c) m97848j7.get(i17)).m97856c());
        }
        List m97848j8 = C18489c.m97848j(C7962g.c.a.DRAW_TALK_M);
        for (int i18 = 0; i18 < m97848j8.size(); i18++) {
            arrayList.add(((C18489c) m97848j8.get(i18)).m97856c());
        }
        List m97848j9 = C18489c.m97848j(C7962g.c.a.FAILOVER_ZALOAPP_S);
        for (int i19 = 0; i19 < m97848j9.size(); i19++) {
            arrayList.add(((C18489c) m97848j9.get(i19)).m97856c());
        }
        List m97848j10 = C18489c.m97848j(C7962g.c.a.FRIEND_TALK_S);
        for (int i21 = 0; i21 < m97848j10.size(); i21++) {
            arrayList.add(((C18489c) m97848j10.get(i21)).m97856c());
        }
        List m97848j11 = C18489c.m97848j(C7962g.c.a.GET_FOLLOW_S);
        for (int i22 = 0; i22 < m97848j11.size(); i22++) {
            arrayList.add(((C18489c) m97848j11.get(i22)).m97856c());
        }
        List m97848j12 = C18489c.m97848j(C7962g.c.a.GROUP_API);
        for (int i23 = 0; i23 < m97848j12.size(); i23++) {
            arrayList.add(((C18489c) m97848j12.get(i23)).m97856c());
        }
        List m97848j13 = C18489c.m97848j(C7962g.c.a.ID_ZALOAPP_COM_S);
        for (int i24 = 0; i24 < m97848j13.size(); i24++) {
            arrayList.add(((C18489c) m97848j13.get(i24)).m97856c());
        }
        List m97848j14 = C18489c.m97848j(C7962g.c.a.ME_TALK);
        for (int i25 = 0; i25 < m97848j14.size(); i25++) {
            arrayList.add(((C18489c) m97848j14.get(i25)).m97856c());
        }
        List m97848j15 = C18489c.m97848j(C7962g.c.a.OAUTH_ZALOAPP_S);
        for (int i26 = 0; i26 < m97848j15.size(); i26++) {
            arrayList.add(((C18489c) m97848j15.get(i26)).m97856c());
        }
        List m97848j16 = C18489c.m97848j(C7962g.c.a.PHOTO_TALK);
        for (int i27 = 0; i27 < m97848j16.size(); i27++) {
            arrayList.add(((C18489c) m97848j16.get(i27)).m97856c());
        }
        List m97848j17 = C18489c.m97848j(C7962g.c.a.QOS_TALK_S);
        for (int i28 = 0; i28 < m97848j17.size(); i28++) {
            arrayList.add(((C18489c) m97848j17.get(i28)).m97856c());
        }
        List m97848j18 = C18489c.m97848j(C7962g.c.a.QOS_TALK_ZING_S);
        for (int i29 = 0; i29 < m97848j18.size(); i29++) {
            arrayList.add(((C18489c) m97848j18.get(i29)).m97856c());
        }
        List m97848j19 = C18489c.m97848j(C7962g.c.a.QOS_TRK_INSTALL_ZALO_APP_S);
        for (int i31 = 0; i31 < m97848j19.size(); i31++) {
            arrayList.add(((C18489c) m97848j19.get(i31)).m97856c());
        }
        List m97848j20 = C18489c.m97848j(C7962g.c.a.REGISTER_TALK_M_S);
        for (int i32 = 0; i32 < m97848j20.size(); i32++) {
            arrayList.add(((C18489c) m97848j20.get(i32)).m97856c());
        }
        List m97848j21 = C18489c.m97848j(C7962g.c.a.STORES_CREDITS_ZALO_APP_S);
        for (int i33 = 0; i33 < m97848j21.size(); i33++) {
            arrayList.add(((C18489c) m97848j21.get(i33)).m97856c());
        }
        List m97848j22 = C18489c.m97848j(C7962g.c.a.SUGGEST_STICKER);
        for (int i34 = 0; i34 < m97848j22.size(); i34++) {
            arrayList.add(((C18489c) m97848j22.get(i34)).m97856c());
        }
        List m97848j23 = C18489c.m97848j(C7962g.c.a.SYSTEM_SETTING_S);
        for (int i35 = 0; i35 < m97848j23.size(); i35++) {
            arrayList.add(((C18489c) m97848j23.get(i35)).m97856c());
        }
        List m97848j24 = C18489c.m97848j(C7962g.c.a.TALK_M);
        for (int i36 = 0; i36 < m97848j24.size(); i36++) {
            arrayList.add(((C18489c) m97848j24.get(i36)).m97856c());
        }
        List m97848j25 = C18489c.m97848j(C7962g.c.a.TAPI_M_S);
        for (int i37 = 0; i37 < m97848j25.size(); i37++) {
            arrayList.add(((C18489c) m97848j25.get(i37)).m97856c());
        }
        List m97848j26 = C18489c.m97848j(C7962g.c.a.VIP_ZALOAPP);
        for (int i38 = 0; i38 < m97848j26.size(); i38++) {
            arrayList.add(((C18489c) m97848j26.get(i38)).m97856c());
        }
        List m97848j27 = C18489c.m97848j(C7962g.c.a.ZALO_LOG);
        for (int i39 = 0; i39 < m97848j27.size(); i39++) {
            arrayList.add(((C18489c) m97848j27.get(i39)).m97856c());
        }
        List m97848j28 = C18489c.m97848j(C7962g.c.a.ZALO_M);
        for (int i41 = 0; i41 < m97848j28.size(); i41++) {
            arrayList.add(((C18489c) m97848j28.get(i41)).m97856c());
        }
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m147354c() {
        ArrayList arrayList = new ArrayList();
        List m97848j = C18489c.m97848j(C7962g.c.a.COM);
        for (int i11 = 0; i11 < m97848j.size(); i11++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(((C18489c) m97848j.get(i11)).m97856c().toString());
            sb2.append(":");
            sb2.append(((C18489c) m97848j.get(i11)).m97860l());
            arrayList.add(((C18489c) m97848j.get(i11)).m97856c() + ":" + ((C18489c) m97848j.get(i11)).m97860l());
        }
        List m97848j2 = C18489c.m97848j(C7962g.c.a.VIDEO_UPLOAD);
        for (int i12 = 0; i12 < m97848j2.size(); i12++) {
            arrayList.add(((C18489c) m97848j2.get(i12)).m97856c() + ":" + ((C18489c) m97848j2.get(i12)).m97860l());
        }
        List m97848j3 = C18489c.m97848j(C7962g.c.a.UPLOAD);
        for (int i13 = 0; i13 < m97848j3.size(); i13++) {
            arrayList.add(((C18489c) m97848j3.get(i13)).m97856c() + ":" + ((C18489c) m97848j3.get(i13)).m97860l());
        }
        return arrayList;
    }

    /* renamed from: d */
    public static synchronized boolean m147355d() {
        String str;
        String str2;
        synchronized (AbstractC29633j.class) {
            try {
            } catch (Exception e11) {
                AbstractC23350e.m122774d("SocketUtils", e11.toString());
            }
            if (!C23055e5.m118271f()) {
                return false;
            }
            if (!C0832n.f2925g && (str = CoreUtility.f89233i) != null && !str.equals("") && (str2 = CoreUtility.f89232h) != null && !str2.equals("") && !C0832n.f2926h) {
                if (!AbstractC23304d.f113427q1.get()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m147356e() {
        String str;
        String str2;
        try {
            if (C23055e5.m118271f() && !C0832n.f2925g && (str = CoreUtility.f89233i) != null && !str.equals("") && (str2 = CoreUtility.f89232h) != null) {
                if (!str2.equals("")) {
                    return true;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUtils", e11.toString());
        }
        return false;
    }

    /* renamed from: f */
    public static byte[] m147357f(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }

    /* renamed from: g */
    public static byte[] m147358g(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream2 = null;
        try {
            byte[] bArr2 = new byte[1024];
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = gZIPInputStream.read(bArr2);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr2, 0, read);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArrayOutputStream.close();
                            return byteArray;
                        }
                    } catch (Exception unused) {
                        if (gZIPInputStream != null) {
                            gZIPInputStream.close();
                        }
                        byteArrayInputStream.close();
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        gZIPInputStream2 = gZIPInputStream;
                        if (gZIPInputStream2 != null) {
                            gZIPInputStream2.close();
                        }
                        byteArrayInputStream.close();
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (Exception unused3) {
            gZIPInputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    /* renamed from: h */
    public static String m147359h(int i11, String str) {
        return "{\"error_code\":" + i11 + ",\"error_message\":\"" + str + "\"}";
    }

    /* renamed from: i */
    public static String m147360i(int i11, int i12, String str, int i13, String str2, int i14, int i15, int i16, int i17, String str3) {
        return "{\"resultCode\":\"" + i11 + "\",\"urlSize\":\"" + i12 + "\",\"url\":\"" + str + "\",\"urlRedirectSize\":\"" + i13 + "\",\"urlRedirect\":\"" + str2 + "\",\"totalChunk\":\"" + i14 + "\",\"totalSize\":\"" + i15 + "\",\"chunkIndex\":\"" + i16 + "\",\"chunkSize\":\"" + i17 + "\",\"pathLocalData\":\"" + str3 + "\"}";
    }

    /* renamed from: j */
    public static String m147361j(String str, String str2, String str3, String str4, String str5) {
        return "{\"url\":\"" + str + "\",\"id\":\"" + str2 + "\",\"cid\":\"" + str3 + "\",\"type\":\"" + str4 + "\",\"keyframe\":\"" + str5 + "\"}";
    }

    /* renamed from: k */
    public static synchronized void m147362k() {
        synchronized (AbstractC29633j.class) {
            try {
                if (CoreUtility.f89225a.equals("") || CoreUtility.f89226b.equals("") || CoreUtility.f89227c.equals("") || CoreUtility.f89228d.equals("") || CoreUtility.f89229e.equals("") || CoreUtility.f89231g.equals("")) {
                    try {
                        CoreUtility.f89225a = AESUtils.m89288b(1);
                        CoreUtility.f89226b = AESUtils.m89288b(2);
                        CoreUtility.f89227c = AESUtils.m89288b(3);
                        CoreUtility.f89228d = AESUtils.m89288b(4);
                        CoreUtility.f89229e = AESUtils.m89288b(5);
                        CoreUtility.f89230f = AESUtils.m89288b(6);
                        CoreUtility.f89231g = AESUtils.m89288b(7);
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("SocketUtils", e11);
                        com.zing.zalo.client.AESUtils aESUtils = new com.zing.zalo.client.AESUtils(MainApplication.getAppContext(), AbstractC8012e0.f43823dm);
                        CoreUtility.f89225a = aESUtils.m39918c();
                        CoreUtility.f89226b = aESUtils.m39919d();
                        CoreUtility.f89227c = aESUtils.m39920e();
                        CoreUtility.f89228d = aESUtils.m39924i();
                        CoreUtility.f89229e = aESUtils.m39923h();
                        CoreUtility.f89230f = aESUtils.m39922g();
                        CoreUtility.f89231g = aESUtils.m39921f();
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("SocketUtils", e12);
            }
        }
    }

    /* renamed from: l */
    public static void m147363l() {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89240p)) {
                CoreUtility.f89240p = AbstractC0908e0.m2815i("KEY_STRING_SOCKET_PRO_V1_KEY_SET_ID_" + CoreUtility.f89233i, "", true);
            }
            if (TextUtils.isEmpty(CoreUtility.f89241q)) {
                CoreUtility.f89241q = AbstractC0908e0.m2815i("KEY_STRING_SOCKET_PRO_V1_KEY_SET_VALUE_" + CoreUtility.f89233i, "", true);
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122778h(th2);
            CoreUtility.f89240p = "";
            CoreUtility.f89241q = "";
        }
    }

    /* renamed from: m */
    public static void m147364m() {
        try {
            long m2813g = AbstractC0908e0.m2813g("KEY_LONG_SOCKET_AUTHEN_V3_PUBLIC_KEY_" + CoreUtility.f89233i, 0L, true);
            CoreUtility.f89237m = m2813g;
            if (m2813g != 0) {
                AbstractC23044d5.m118231d(CoreUtility.getAppContext(), EnumC16739a.f84885b0);
                AbstractC20110a.m104535d("initSocketAuthenParams - public: %d", Long.valueOf(CoreUtility.f89237m));
                long m2813g2 = AbstractC0908e0.m2813g("KEY_LONG_SOCKET_AUTHEN_V3_PRIVATE_KEY_" + CoreUtility.f89233i, 0L, true);
                CoreUtility.f89238n = m2813g2;
                CoreUtils.m93453h(m2813g2);
            }
        } catch (Throwable th2) {
            AbstractC23350e.m122778h(th2);
            CoreUtility.f89237m = 0L;
            CoreUtility.f89238n = 0L;
        }
    }

    /* renamed from: n */
    public static void m147365n() {
        try {
            int m122768f = AbstractC23349d.m122768f();
            if (m122768f == 2) {
                AbstractC23351f.m122784a("CONNECTIVITY_CHANGE_MIDDILE: TRUE", true);
                m147368q();
            } else if (m122768f == 3) {
                AbstractC23351f.m122784a("CONNECTIVITY_CHANGE_PRIORITY_LOW: TRUE", true);
                m147366o();
            } else {
                AbstractC23351f.m122784a("CONNECTIVITY_CHANGE_PRIORITY_TOP: TRUE", true);
                m147367p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUtils", e11.toString());
        }
    }

    /* renamed from: o */
    public static void m147366o() {
        try {
            C29628e.m147249E0().m147287p1(MainApplication.getAppContext(), AbstractC26080o.a.f124275b);
            C29630g.m147299E0().m147316S0(MainApplication.getAppContext(), AbstractC26080o.a.f124275b);
            if (AbstractC26684e.f126408a) {
                C29632i.m147326E0().m147343S0(MainApplication.getAppContext(), AbstractC26080o.a.f124275b);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUtils", e11.toString());
        }
    }

    /* renamed from: p */
    public static void m147367p() {
        try {
            C29628e.m147249E0().m147287p1(MainApplication.getAppContext(), 1000);
            C29630g.m147299E0().m147316S0(MainApplication.getAppContext(), 1000);
            if (AbstractC26684e.f126408a) {
                C29632i.m147326E0().m147343S0(MainApplication.getAppContext(), 1000);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUtils", e11.toString());
        }
    }

    /* renamed from: q */
    public static void m147368q() {
        try {
            C29628e.m147249E0().m147287p1(MainApplication.getAppContext(), 3000);
            C29630g.m147299E0().m147316S0(MainApplication.getAppContext(), 3000);
            if (AbstractC26684e.f126408a) {
                C29632i.m147326E0().m147343S0(MainApplication.getAppContext(), 3000);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUtils", e11.toString());
        }
    }

    /* renamed from: r */
    public static void m147369r() {
        try {
            C29628e.m147249E0().m147290s1(MainApplication.getAppContext());
            C29630g.m147299E0().m147323Z0(MainApplication.getAppContext());
            if (AbstractC26684e.f126408a) {
                C29632i.m147326E0().m147350Z0(MainApplication.getAppContext());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122774d("SocketUtils", e11.toString());
        }
    }
}
