package com.zing.zalo.p062db;

import ag0.C0822i;
import am.AbstractC0924m0;
import am.C0896a;
import am.InterfaceC0947y;
import am.InterfaceC0949z;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import au.EnumC2382z;
import cn0.AbstractC3601a;
import com.zing.zalo.MainApplication;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p062db.zadb.Zadb;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17978l0;
import dj.C17990p0;
import dj.C18002t0;
import dj.C18013y0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19067n0;
import ga0.InterfaceC19305a;
import gw.AbstractC19646n0;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23149n0;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import nh0.C23793c;
import on0.AbstractC24334o;
import on0.AbstractC24340u;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p056cj.C3548p;
import p056cj.C3549q;
import p056cj.C3551s;
import p056cj.C3553u;
import p056cj.C3554v;
import p056cj.C3555w;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23309i;
import p365nk.C23805a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p716zh.C32098s;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: com.zing.zalo.db.f */
/* loaded from: classes3.dex */
public final class C7961f {
    public static final b Companion = new b(null);

    /* renamed from: h */
    private static final InterfaceC29232g f43264h = AbstractC29233h.m145990a(a.f43283q);

    /* renamed from: i */
    private static int f43265i;

    /* renamed from: j */
    private static int f43266j;

    /* renamed from: k */
    private static int f43267k;

    /* renamed from: l */
    private static int f43268l;

    /* renamed from: m */
    private static int f43269m;

    /* renamed from: n */
    private static int f43270n;

    /* renamed from: o */
    private static int f43271o;

    /* renamed from: p */
    private static int f43272p;

    /* renamed from: q */
    private static int f43273q;

    /* renamed from: r */
    private static int f43274r;

    /* renamed from: s */
    private static int f43275s;

    /* renamed from: a */
    private final Context f43276a;

    /* renamed from: b */
    private final String f43277b;

    /* renamed from: c */
    private InterfaceC0947y f43278c;

    /* renamed from: d */
    private boolean f43279d;

    /* renamed from: e */
    private boolean f43280e;

    /* renamed from: f */
    private final InterfaceC24854k f43281f;

    /* renamed from: g */
    private final AtomicBoolean f43282g;

    /* renamed from: com.zing.zalo.db.f$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f43283q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C7961f mo12V4() {
            Context m35500c = MainApplication.Companion.m35500c();
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            return new C7961f(m35500c, str, null);
        }
    }

    /* renamed from: com.zing.zalo.db.f$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m42657a() {
            try {
                if (C7961f.f43264h.mo9375b()) {
                    m42658b().m42640v();
                    C7961f.f43264h.reset();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            }
        }

        /* renamed from: b */
        public final C7961f m42658b() {
            return (C7961f) C7961f.f43264h.getValue();
        }

        /* renamed from: c */
        public final int[] m42659c(InterfaceC0949z interfaceC0949z) {
            AbstractC19074t.m100208f(interfaceC0949z, "it");
            int[] iArr = new int[C7961f.f43265i];
            iArr[C7961f.f43266j] = interfaceC0949z.getColumnIndex("cliMsgId");
            iArr[C7961f.f43267k] = interfaceC0949z.getColumnIndex("globalMsgId");
            iArr[C7961f.f43268l] = interfaceC0949z.getColumnIndex("message_search");
            iArr[C7961f.f43269m] = interfaceC0949z.getColumnIndex("timestamp");
            iArr[C7961f.f43270n] = interfaceC0949z.getColumnIndex("senderUid");
            iArr[C7961f.f43271o] = interfaceC0949z.getColumnIndex("ownerId");
            iArr[C7961f.f43272p] = interfaceC0949z.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            iArr[C7961f.f43273q] = interfaceC0949z.getColumnIndex("msgRowId");
            iArr[C7961f.f43274r] = interfaceC0949z.getColumnIndex("ttl");
            iArr[C7961f.f43275s] = interfaceC0949z.getColumnIndex("attachment");
            return iArr;
        }

        /* renamed from: d */
        public final C3554v m42660d(InterfaceC0949z interfaceC0949z, int[] iArr) {
            AbstractC19074t.m100208f(interfaceC0949z, "it");
            AbstractC19074t.m100208f(iArr, "indexes");
            long j11 = interfaceC0949z.getLong(iArr[C7961f.f43266j]);
            long j12 = interfaceC0949z.getLong(iArr[C7961f.f43267k]);
            String string = interfaceC0949z.getString(iArr[C7961f.f43268l]);
            AbstractC19074t.m100207e(string, "getString(...)");
            String string2 = interfaceC0949z.getString(iArr[C7961f.f43269m]);
            AbstractC19074t.m100207e(string2, "getString(...)");
            String string3 = interfaceC0949z.getString(iArr[C7961f.f43270n]);
            AbstractC19074t.m100207e(string3, "getString(...)");
            String string4 = interfaceC0949z.getString(iArr[C7961f.f43271o]);
            AbstractC19074t.m100207e(string4, "getString(...)");
            C3554v c3554v = new C3554v(j11, j12, string, string2, string3, string4, interfaceC0949z.getInt(iArr[C7961f.f43272p]), interfaceC0949z.getLong(iArr[C7961f.f43273q]), interfaceC0949z.getLong(iArr[C7961f.f43274r]));
            if (iArr[C7961f.f43275s] >= 0) {
                String string5 = interfaceC0949z.getString(iArr[C7961f.f43275s]);
                AbstractC19074t.m100207e(string5, "getString(...)");
                c3554v.m18067i(string5);
                return c3554v;
            }
            return c3554v;
        }

        /* renamed from: e */
        public final boolean m42661e() {
            try {
                MainApplication.C6895a c6895a = MainApplication.Companion;
                File databasePath = c6895a.m35500c().getDatabasePath("zalo_search");
                if (databasePath != null && databasePath.exists()) {
                    c6895a.m35500c().deleteDatabase("zalo_search");
                    return true;
                }
                return true;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104553f(e11, "[ZDB]", new Object[0]);
                return false;
            }
        }
    }

    /* renamed from: com.zing.zalo.db.f$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43284a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f43285b;

        static {
            int[] iArr = new int[EnumC2382z.values().length];
            try {
                iArr[EnumC2382z.f9945r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2382z.f9946s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2382z.f9947t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f43284a = iArr;
            int[] iArr2 = new int[C23805a.d.values().length];
            try {
                iArr2[C23805a.d.f115056p.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f43285b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.db.f$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            if (C7961f.this.m42655y().length() == 0) {
                return "";
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "chat_search_v4_%s", Arrays.copyOf(new Object[]{C7961f.this.m42655y()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
    }

    static {
        int i11 = f43265i;
        f43266j = i11;
        f43267k = i11 + 1;
        f43268l = i11 + 2;
        f43269m = i11 + 3;
        f43270n = i11 + 4;
        f43271o = i11 + 5;
        f43272p = i11 + 6;
        f43273q = i11 + 7;
        f43274r = i11 + 8;
        f43265i = i11 + 10;
        f43275s = i11 + 9;
    }

    public /* synthetic */ C7961f(Context context, String str, AbstractC19060k abstractC19060k) {
        this(context, str);
    }

    /* renamed from: A */
    private final Map m42610A() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String str = "SELECT max(msgRowId) AS maxId, ownerId FROM " + m42611B() + " GROUP BY ownerId";
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y = null;
            }
            InterfaceC0949z mo2777u = interfaceC0947y.mo2777u(str);
            if (mo2777u != null) {
                while (mo2777u.next()) {
                    try {
                        String string = mo2777u.getString(mo2777u.getColumnIndex("ownerId"));
                        Integer valueOf = Integer.valueOf(mo2777u.getInt(mo2777u.getColumnIndex("maxId")));
                        AbstractC19074t.m100205c(string);
                        linkedHashMap.put(string, valueOf);
                    } finally {
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2777u, null);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return linkedHashMap;
    }

    /* renamed from: B */
    private final String m42611B() {
        return (String) this.f43281f.getValue();
    }

    /* renamed from: C */
    private final boolean m42612C(String str) {
        try {
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y = null;
            }
            InterfaceC0949z mo2777u = interfaceC0947y.mo2777u("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'");
            if (mo2777u == null) {
                return false;
            }
            try {
                boolean next = mo2777u.next();
                AbstractC3601a.m18219a(mo2777u, null);
                if (!next) {
                    return false;
                }
                return true;
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            return false;
        }
    }

    /* renamed from: D */
    private final boolean m42613D() {
        if (this.f43279d && this.f43280e && m42611B().length() > 0 && !AbstractC0924m0.m4256ub() && !C7967l.Companion.m42748b().m42733H() && AbstractC23309i.m121160Lg()) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private final boolean m42614E(InterfaceC0947y interfaceC0947y) {
        boolean z11;
        try {
            interfaceC0947y.mo2851m();
            InterfaceC0949z mo2777u = interfaceC0947y.mo2777u("select 1");
            if (mo2777u == null) {
                return false;
            }
            try {
                if (mo2777u.getColumnCount() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC3601a.m18219a(mo2777u, null);
                if (!z11) {
                    return false;
                }
                return true;
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            return false;
        }
    }

    /* renamed from: F */
    private final void m42615F(MessageId messageId) {
        try {
            if (!m42613D()) {
                return;
            }
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y = null;
            }
            interfaceC0947y.mo2857x("DELETE FROM " + m42611B() + " WHERE ownerId = '" + messageId.m41048l() + "' AND ((" + messageId.m41047k() + " <> 0 AND globalMsgId = " + messageId.m41047k() + ") OR (cliMsgId = " + messageId.m41045i() + " AND (" + messageId.m41051o() + " = 0 OR senderUid = " + messageId.m41051o() + ")))");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109231i(str, 17523, e11.toString(), 0L, 17500, CoreUtility.f89236l);
        }
    }

    /* renamed from: H */
    public static final void m42616H(C7961f c7961f, MessageId messageId) {
        AbstractC19074t.m100208f(c7961f, "this$0");
        AbstractC19074t.m100208f(messageId, "$messageId");
        c7961f.m42615F(messageId);
    }

    /* renamed from: K */
    public static final void m42617K(C7961f c7961f, String str, String str2, String str3) {
        AbstractC19074t.m100208f(c7961f, "this$0");
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(str2, "$clientMsgIdSet");
        AbstractC19074t.m100208f(str3, "$globalMsgIdSet");
        c7961f.m42645I(str, str2, str3);
    }

    /* renamed from: L */
    private final void m42618L(String str) {
        try {
            if (!m42613D()) {
                return;
            }
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y = null;
            }
            interfaceC0947y.mo2857x("DELETE FROM " + m42611B() + " WHERE ownerId = '" + str + "'");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109231i(str2, 17523, e11.toString(), 0L, 17500, CoreUtility.f89236l);
        }
    }

    /* renamed from: N */
    public static final void m42619N(C7961f c7961f, String str) {
        AbstractC19074t.m100208f(c7961f, "this$0");
        AbstractC19074t.m100208f(str, "$ownerId");
        c7961f.m42618L(str);
    }

    /* renamed from: R */
    public static /* synthetic */ ArrayList m42620R(C7961f c7961f, String str, String str2, String str3, int i11, int i12, InterfaceC19305a interfaceC19305a, int i13, Object obj) {
        String str4;
        String str5;
        int i14;
        InterfaceC19305a interfaceC19305a2 = null;
        if ((i13 & 2) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i13 & 4) != 0) {
            str5 = null;
        } else {
            str5 = str3;
        }
        int i15 = 0;
        if ((i13 & 8) != 0) {
            i14 = 0;
        } else {
            i14 = i11;
        }
        if ((i13 & 16) == 0) {
            i15 = i12;
        }
        if ((i13 & 32) == 0) {
            interfaceC19305a2 = interfaceC19305a;
        }
        return c7961f.m42650Q(str, str4, str5, i14, i15, interfaceC19305a2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019e, code lost:            if (r15 == null) goto L235;     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c2, code lost:            if (r6 != null) goto L254;     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024a, code lost:            r6 = on0.AbstractC24341v.m127114D(r6, "\u200e", "", false, 4, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0278, code lost:            if (r7 == null) goto L271;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:            if (r5 != 19) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0156, code lost:            r8 = on0.AbstractC24341v.m127114D(r14, "\u200e", "", false, 4, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0180, code lost:            if (r14 == null) goto L228;     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0219 A[Catch: Exception -> 0x004b, TryCatch #1 {Exception -> 0x004b, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:25:0x02c6, B:29:0x02d2, B:30:0x02dc, B:34:0x0366, B:36:0x036a, B:37:0x0374, B:48:0x0040, B:50:0x0048, B:52:0x0051, B:55:0x0058, B:58:0x0063, B:60:0x00a2, B:61:0x005e, B:66:0x00ab, B:68:0x00b1, B:70:0x00b8, B:72:0x00c0, B:74:0x00c6, B:76:0x010b, B:77:0x0112, B:79:0x0136, B:81:0x013e, B:83:0x0144, B:86:0x0152, B:88:0x0156, B:90:0x0167, B:92:0x016b, B:94:0x016f, B:96:0x0183, B:98:0x0187, B:100:0x018b, B:102:0x01a1, B:104:0x01a5, B:108:0x01ae, B:110:0x01b2, B:112:0x01d2, B:114:0x0219, B:115:0x0220, B:118:0x01c8, B:121:0x01cf, B:127:0x023c, B:129:0x0246, B:131:0x024a, B:133:0x025d, B:135:0x0261, B:137:0x0265, B:139:0x027b, B:141:0x029e, B:142:0x02a5, B:146:0x02c0), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2 A[Catch: Exception -> 0x004b, TryCatch #1 {Exception -> 0x004b, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:25:0x02c6, B:29:0x02d2, B:30:0x02dc, B:34:0x0366, B:36:0x036a, B:37:0x0374, B:48:0x0040, B:50:0x0048, B:52:0x0051, B:55:0x0058, B:58:0x0063, B:60:0x00a2, B:61:0x005e, B:66:0x00ab, B:68:0x00b1, B:70:0x00b8, B:72:0x00c0, B:74:0x00c6, B:76:0x010b, B:77:0x0112, B:79:0x0136, B:81:0x013e, B:83:0x0144, B:86:0x0152, B:88:0x0156, B:90:0x0167, B:92:0x016b, B:94:0x016f, B:96:0x0183, B:98:0x0187, B:100:0x018b, B:102:0x01a1, B:104:0x01a5, B:108:0x01ae, B:110:0x01b2, B:112:0x01d2, B:114:0x0219, B:115:0x0220, B:118:0x01c8, B:121:0x01cf, B:127:0x023c, B:129:0x0246, B:131:0x024a, B:133:0x025d, B:135:0x0261, B:137:0x0265, B:139:0x027b, B:141:0x029e, B:142:0x02a5, B:146:0x02c0), top: B:2:0x0008 }] */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m42638r(C17945a0 c17945a0, boolean z11) {
        InterfaceC0947y interfaceC0947y;
        int i11;
        C18013y0 c18013y0;
        String str;
        String str2;
        CharSequence m127168X0;
        String str3;
        String str4;
        String str5;
        String str6;
        int i12;
        String str7;
        CharSequence m127168X02;
        String str8;
        String str9;
        C17990p0 c17990p0;
        String m127114D;
        String m127114D2;
        CharSequence m127168X03;
        C18002t0 c18002t0;
        String str10;
        String str11;
        String m127114D3;
        String m127114D4;
        CharSequence m127168X04;
        String str12 = "";
        try {
            if (m42613D() && !AbstractC0924m0.m4227tb()) {
                C19059j0 c19059j0 = new C19059j0();
                c19059j0.f94941p = "";
                int m95041W4 = c17945a0.m95041W4();
                if (m95041W4 != 0) {
                    if (m95041W4 != 12) {
                        if (m95041W4 != 22) {
                            if (m95041W4 != 3 && m95041W4 != 4) {
                                if (m95041W4 == 18) {
                                    C17969i0 m94929K2 = c17945a0.m94929K2();
                                    if (m94929K2 instanceof C18002t0) {
                                        c18002t0 = (C18002t0) m94929K2;
                                    } else {
                                        c18002t0 = null;
                                    }
                                    if (c18002t0 != null) {
                                        String str13 = c18002t0.f91011p;
                                        if (str13 == null) {
                                            str10 = "";
                                        } else {
                                            str10 = str13;
                                        }
                                        if (!c18002t0.f91184E) {
                                            str11 = c18002t0.f91015t;
                                            if (str11 == null) {
                                            }
                                            m127114D3 = AbstractC24341v.m127114D(str10, "\u200e", "", false, 4, null);
                                            m127114D4 = AbstractC24341v.m127114D(str11, "\u200e", "", false, 4, null);
                                            str12 = ((Object) (((Object) "") + m127114D3 + "\u200e")) + m127114D4;
                                            if (str12 != null) {
                                                m127168X04 = AbstractC24342w.m127168X0(str12);
                                                m127168X04.toString();
                                            }
                                        }
                                        str11 = "";
                                        m127114D3 = AbstractC24341v.m127114D(str10, "\u200e", "", false, 4, null);
                                        m127114D4 = AbstractC24341v.m127114D(str11, "\u200e", "", false, 4, null);
                                        str12 = ((Object) (((Object) "") + m127114D3 + "\u200e")) + m127114D4;
                                        if (str12 != null) {
                                        }
                                    }
                                }
                            }
                            C17969i0 m94929K22 = c17945a0.m94929K2();
                            str12 = m94929K22 != null ? m94929K22.f91011p : null;
                        } else {
                            C17969i0 m94929K23 = c17945a0.m94929K2();
                            if (m94929K23 instanceof C17990p0) {
                                c17990p0 = (C17990p0) m94929K23;
                            } else {
                                c17990p0 = null;
                            }
                            if (c17990p0 != null) {
                                m127114D = AbstractC24341v.m127114D(c17990p0.f91011p, "\u200e", "", false, 4, null);
                                String str14 = ((Object) "") + m127114D + "\u200e";
                                String str15 = c17990p0.f91115D;
                                AbstractC19074t.m100207e(str15, "mFileExt");
                                m127114D2 = AbstractC24341v.m127114D(str15, "\u200e", "", false, 4, null);
                                str12 = ((Object) str14) + m127114D2;
                                if (str12 != null) {
                                    m127168X03 = AbstractC24342w.m127168X0(str12);
                                    m127168X03.toString();
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("thumb", c17990p0.f91013r);
                                jSONObject.put("fileSize", c17990p0.f91113B);
                                jSONObject.put("fType", String.valueOf(c17990p0.f91123L));
                                c19059j0.f94941p = jSONObject.toString();
                            }
                        }
                    } else {
                        C17969i0 m94929K24 = c17945a0.m94929K2();
                        if (m94929K24 instanceof C18013y0) {
                            c18013y0 = (C18013y0) m94929K24;
                        } else {
                            c18013y0 = null;
                        }
                        if (c18013y0 != null) {
                            if (AbstractC19074t.m100204b("recommened.link", c18013y0.f91016u)) {
                                String str16 = c18013y0.f91011p;
                                if (str16 == null || str4 == null) {
                                    str4 = "";
                                }
                                C32098s c32098s = c18013y0.f91251B;
                                if (c32098s != null && (str9 = c32098s.f147953c) != null) {
                                    AbstractC19074t.m100205c(str9);
                                    str5 = AbstractC24341v.m127114D(str9, "\u200e", "", false, 4, null);
                                }
                                str5 = "";
                                C32098s c32098s2 = c18013y0.f91251B;
                                if (c32098s2 != null && (str8 = c32098s2.f147952b) != null) {
                                    AbstractC19074t.m100205c(str8);
                                    str6 = AbstractC24341v.m127114D(str8, "\u200e", "", false, 4, null);
                                }
                                str6 = "";
                                C32098s c32098s3 = c18013y0.f91251B;
                                if (c32098s3 != null) {
                                    i12 = c32098s3.f147956f;
                                } else {
                                    i12 = -1;
                                }
                                if (i12 != 1 && i12 != 3) {
                                    String str17 = c18013y0.f91015t;
                                    if (str17 != null) {
                                        str7 = AbstractC24341v.m127114D(str17, "\u200e", "", false, 4, null);
                                    }
                                    str7 = "";
                                    str12 = ((Object) (((Object) (((Object) (((Object) "") + str4 + "\u200e")) + str5 + "\u200e")) + str7 + "\u200e")) + str6;
                                    if (str12 != null) {
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("action", c18013y0.f91016u);
                                    jSONObject2.put("href", c18013y0.f91014s);
                                    jSONObject2.put("thumb", c18013y0.f91013r);
                                    c19059j0.f94941p = jSONObject2.toString();
                                } else {
                                    if (c32098s3 != null) {
                                        str7 = c32098s3.f147957g;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 == null) {
                                        str7 = "";
                                        str12 = ((Object) (((Object) (((Object) (((Object) "") + str4 + "\u200e")) + str5 + "\u200e")) + str7 + "\u200e")) + str6;
                                        if (str12 != null) {
                                            m127168X02 = AbstractC24342w.m127168X0(str12);
                                            m127168X02.toString();
                                        }
                                        JSONObject jSONObject22 = new JSONObject();
                                        jSONObject22.put("action", c18013y0.f91016u);
                                        jSONObject22.put("href", c18013y0.f91014s);
                                        jSONObject22.put("thumb", c18013y0.f91013r);
                                        c19059j0.f94941p = jSONObject22.toString();
                                    } else {
                                        AbstractC19074t.m100205c(str7);
                                        str12 = ((Object) (((Object) (((Object) (((Object) "") + str4 + "\u200e")) + str5 + "\u200e")) + str7 + "\u200e")) + str6;
                                        if (str12 != null) {
                                        }
                                        JSONObject jSONObject222 = new JSONObject();
                                        jSONObject222.put("action", c18013y0.f91016u);
                                        jSONObject222.put("href", c18013y0.f91014s);
                                        jSONObject222.put("thumb", c18013y0.f91013r);
                                        c19059j0.f94941p = jSONObject222.toString();
                                    }
                                }
                            } else if (AbstractC19074t.m100204b("recommened.user", c18013y0.f91016u)) {
                                String str18 = c18013y0.f91011p;
                                if (str18 == null || str == null) {
                                    str = "";
                                }
                                C17978l0 c17978l0 = c18013y0.f91253D;
                                if (c17978l0 != null && (str3 = c17978l0.f91053a) != null) {
                                    AbstractC19074t.m100205c(str3);
                                    str2 = AbstractC24341v.m127114D(str3, "\u200e", "", false, 4, null);
                                }
                                str2 = "";
                                str12 = ((Object) (((Object) "") + str + "\u200e")) + str2;
                                if (str12 != null) {
                                    m127168X0 = AbstractC24342w.m127168X0(str12);
                                    m127168X0.toString();
                                }
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("action", c18013y0.f91016u);
                                jSONObject3.put("href", c18013y0.f91014s);
                                jSONObject3.put("thumb", c18013y0.f91013r);
                                c19059j0.f94941p = jSONObject3.toString();
                            }
                        }
                    }
                } else {
                    str12 = c17945a0.m95019U3();
                }
                if (str12 != null && str12.length() != 0) {
                    if (z11) {
                        MessageId m95029V3 = c17945a0.m95029V3();
                        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                        m42615F(m95029V3);
                    }
                    MessageId m95029V32 = c17945a0.m95029V3();
                    AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                    String m42611B = m42611B();
                    String mo95039W2 = c17945a0.mo95039W2();
                    int m41051o = m95029V32.m41051o();
                    int m95041W42 = c17945a0.m95041W4();
                    long m94974P4 = c17945a0.m94974P4();
                    long m41045i = m95029V32.m41045i();
                    long m41047k = m95029V32.m41047k();
                    Object obj = c19059j0.f94941p;
                    String str19 = str12;
                    long m95303y4 = c17945a0.m95303y4();
                    long m95030V4 = c17945a0.m95030V4();
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        sb2.append("INSERT INTO ");
                        sb2.append(m42611B);
                        sb2.append(" (message_search, ownerId, senderUid, type, timestamp, cliMsgId, globalMsgId, attachment, msgRowId, ttl) VALUES (? ,'");
                        sb2.append(mo95039W2);
                        sb2.append("', ");
                        sb2.append(m41051o);
                        sb2.append(", ");
                        sb2.append(m95041W42);
                        sb2.append(", ");
                        sb2.append(m94974P4);
                        sb2.append(", ");
                        sb2.append(m41045i);
                        sb2.append(", ");
                        sb2.append(m41047k);
                        sb2.append(", '");
                        sb2.append(obj);
                        sb2.append("', ");
                        sb2.append(m95303y4);
                        sb2.append(", ");
                        sb2.append(m95030V4);
                        sb2.append(")");
                        String sb3 = sb2.toString();
                        InterfaceC0947y interfaceC0947y2 = this.f43278c;
                        if (interfaceC0947y2 == null) {
                            AbstractC19074t.m100223u("db");
                            i11 = 1;
                            interfaceC0947y = null;
                        } else {
                            interfaceC0947y = interfaceC0947y2;
                            i11 = 1;
                        }
                        Object[] objArr = new Object[i11];
                        objArr[0] = str19;
                        interfaceC0947y.mo2778v(sb3, objArr);
                    } catch (Exception e11) {
                        e = e11;
                        AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e);
                        String str20 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str20, "currentUserUid");
                        AbstractC20887g.m109231i(str20, 17522, e.toString(), 0L, 17500, CoreUtility.f89236l);
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: t */
    public static final void m42639t(C7961f c7961f, C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c7961f, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$chatContent");
        c7961f.m42638r(c17945a0, z11);
    }

    /* renamed from: v */
    public final void m42640v() {
        try {
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y != null) {
                if (interfaceC0947y == null) {
                    AbstractC19074t.m100223u("db");
                    interfaceC0947y = null;
                }
                interfaceC0947y.close();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:            if (r0 == null) goto L158;     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0284  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C3548p m42641w(InterfaceC0949z interfaceC0949z, int[] iArr) {
        CharSequence m127168X0;
        String str;
        String str2;
        C3549q c3549q;
        C3551s c3551s;
        String str3;
        Object m129218b;
        int i11;
        String m127113C;
        List m127131A0;
        int m131511r;
        Object m129218b2;
        String str4;
        C3551s c3551s2;
        String str5;
        String optString;
        CharSequence m127168X02;
        String str6;
        String optString2;
        CharSequence m127168X03;
        String obj;
        String str7;
        String str8;
        String optString3;
        CharSequence m127168X04;
        String obj2;
        String optString4;
        CharSequence m127168X05;
        String optString5;
        CharSequence m127168X06;
        CharSequence m127168X07;
        List m127131A02;
        int m131511r2;
        Object m129218b3;
        String str9;
        String str10;
        String str11;
        String str12;
        int i12;
        CharSequence m127168X08;
        int[] iArr2 = iArr;
        if (iArr2 != null) {
            if (iArr2.length != 11) {
                iArr2 = null;
            }
        }
        iArr2 = new int[]{interfaceC0949z.getColumnIndex("cliMsgId"), interfaceC0949z.getColumnIndex("globalMsgId"), interfaceC0949z.getColumnIndex("message_search"), interfaceC0949z.getColumnIndex("timestamp"), interfaceC0949z.getColumnIndex("senderUid"), interfaceC0949z.getColumnIndex("ownerId"), interfaceC0949z.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE), interfaceC0949z.getColumnIndex("msgRowId"), interfaceC0949z.getColumnIndex("match_count"), interfaceC0949z.getColumnIndex("attachment"), interfaceC0949z.getColumnIndex("ttl")};
        int[] iArr3 = iArr2;
        String string = interfaceC0949z.getString(iArr3[2]);
        int i13 = interfaceC0949z.getInt(iArr3[6]);
        AbstractC19074t.m100205c(string);
        m127168X0 = AbstractC24342w.m127168X0(string);
        String obj3 = m127168X0.toString();
        if (AbstractC19646n0.m103003m1(i13)) {
            str = "thumb";
            m127131A02 = AbstractC24342w.m127131A0(string, new char[]{8206}, false, 0, 6, null);
            List list = m127131A02;
            m131511r2 = AbstractC25370t.m131511r(list, 10);
            ArrayList arrayList = new ArrayList(m131511r2);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m127168X08 = AbstractC24342w.m127168X0((String) it.next());
                arrayList.add(m127168X08.toString());
            }
            try {
                C24861r.a aVar = C24861r.f119264q;
                m129218b3 = C24861r.m129218b(new JSONObject(interfaceC0949z.getString(iArr3[9])));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b3 = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b3)) {
                m129218b3 = null;
            }
            JSONObject jSONObject = (JSONObject) m129218b3;
            if (arrayList.size() == 2) {
                str9 = (String) arrayList.get(0);
            } else {
                str9 = string;
            }
            AbstractC19074t.m100205c(str9);
            long j11 = 0;
            if (jSONObject != null) {
                j11 = jSONObject.optLong("fileSize", 0L);
            }
            long j12 = j11;
            if (arrayList.size() != 2) {
                str10 = "";
            } else {
                str10 = (String) arrayList.get(1);
            }
            if (jSONObject != null) {
                str11 = jSONObject.optString(str, "");
            } else {
                str11 = null;
            }
            if (str11 == null) {
                str12 = "";
            } else {
                str12 = str11;
            }
            if (jSONObject != null) {
                i12 = jSONObject.optInt("fType", 1);
            } else {
                i12 = 1;
            }
            c3549q = new C3549q(str9, j12, str10, str12, i12, null, null, 96, null);
            str2 = "";
        } else {
            str = "thumb";
            str2 = obj3;
            c3549q = null;
        }
        if (AbstractC19646n0.m103035u1(i13)) {
            m127131A0 = AbstractC24342w.m127131A0(string, new char[]{8206}, false, 0, 6, null);
            List list2 = m127131A0;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                m127168X07 = AbstractC24342w.m127168X0((String) it2.next());
                arrayList2.add(m127168X07.toString());
            }
            try {
                C24861r.a aVar3 = C24861r.f119264q;
                m129218b2 = C24861r.m129218b(new JSONObject(interfaceC0949z.getString(iArr3[9])));
            } catch (Throwable th3) {
                C24861r.a aVar4 = C24861r.f119264q;
                m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
            }
            if (C24861r.m129223g(m129218b2)) {
                m129218b2 = null;
            }
            JSONObject jSONObject2 = (JSONObject) m129218b2;
            if (jSONObject2 != null && (optString5 = jSONObject2.optString("href", "")) != null) {
                m127168X06 = AbstractC24342w.m127168X0(optString5);
                String obj4 = m127168X06.toString();
                if (obj4 != null) {
                    str4 = obj4;
                    if (str4.length() <= 0 && arrayList2.size() == 4) {
                        str2 = (String) arrayList2.get(0);
                        String str13 = (String) arrayList2.get(1);
                        String str14 = (String) arrayList2.get(2);
                        String str15 = (String) arrayList2.get(3);
                        if (jSONObject2 != null && (optString4 = jSONObject2.optString("href", "")) != null) {
                            m127168X05 = AbstractC24342w.m127168X0(optString4);
                            String obj5 = m127168X05.toString();
                            if (obj5 != null) {
                                str7 = obj5;
                                if (jSONObject2 != null && (optString3 = jSONObject2.optString(str, "")) != null) {
                                    m127168X04 = AbstractC24342w.m127168X0(optString3);
                                    obj2 = m127168X04.toString();
                                    if (obj2 != null) {
                                        str8 = obj2;
                                        c3551s2 = new C3551s(str13, str14, str15, str7, str8, null, 32, null);
                                    }
                                }
                                str8 = "";
                                c3551s2 = new C3551s(str13, str14, str15, str7, str8, null, 32, null);
                            }
                        }
                        str7 = "";
                        if (jSONObject2 != null) {
                            m127168X04 = AbstractC24342w.m127168X0(optString3);
                            obj2 = m127168X04.toString();
                            if (obj2 != null) {
                            }
                        }
                        str8 = "";
                        c3551s2 = new C3551s(str13, str14, str15, str7, str8, null, 32, null);
                    } else {
                        c3551s2 = null;
                    }
                    if (c3551s2 == null && str4.length() > 0 && arrayList2.size() == 2) {
                        String str16 = (String) arrayList2.get(0);
                        String str17 = (String) arrayList2.get(1);
                        if (jSONObject2 != null && (optString2 = jSONObject2.optString(str, "")) != null) {
                            m127168X03 = AbstractC24342w.m127168X0(optString2);
                            obj = m127168X03.toString();
                            if (obj != null) {
                                str6 = obj;
                                c3551s2 = new C3551s(str16, str17, "", str4, str6, "recommened.user");
                                str2 = "";
                            }
                        }
                        str6 = "";
                        c3551s2 = new C3551s(str16, str17, "", str4, str6, "recommened.user");
                        str2 = "";
                    }
                    if (c3551s2 != null && str4.length() > 0) {
                        str2 = AbstractC25332a0.m131214n0(arrayList2, " ", null, null, 0, null, null, 62, null);
                        if (jSONObject2 != null && (optString = jSONObject2.optString(str, "")) != null) {
                            m127168X02 = AbstractC24342w.m127168X0(optString);
                            String obj6 = m127168X02.toString();
                            if (obj6 != null) {
                                str5 = obj6;
                                c3551s = new C3551s("", "", "", str4, str5, null, 32, null);
                            }
                        }
                        str5 = "";
                        c3551s = new C3551s("", "", "", str4, str5, null, 32, null);
                    } else {
                        c3551s = c3551s2;
                    }
                }
            }
            str4 = "";
            if (str4.length() <= 0) {
            }
            c3551s2 = null;
            if (c3551s2 == null) {
                String str162 = (String) arrayList2.get(0);
                String str172 = (String) arrayList2.get(1);
                if (jSONObject2 != null) {
                    m127168X03 = AbstractC24342w.m127168X0(optString2);
                    obj = m127168X03.toString();
                    if (obj != null) {
                    }
                }
                str6 = "";
                c3551s2 = new C3551s(str162, str172, "", str4, str6, "recommened.user");
                str2 = "";
            }
            if (c3551s2 != null) {
            }
            c3551s = c3551s2;
        } else {
            c3551s = null;
        }
        if (AbstractC19646n0.m103015p1(i13)) {
            m127113C = AbstractC24341v.m127113C(string, (char) 8206, ' ', false, 4, null);
            str3 = m127113C;
        } else {
            str3 = str2;
        }
        long j13 = interfaceC0949z.getLong(iArr3[0]);
        long j14 = interfaceC0949z.getLong(iArr3[1]);
        long j15 = interfaceC0949z.getLong(iArr3[3]);
        String string2 = interfaceC0949z.getString(iArr3[4]);
        AbstractC19074t.m100207e(string2, "getString(...)");
        String string3 = interfaceC0949z.getString(iArr3[5]);
        AbstractC19074t.m100207e(string3, "getString(...)");
        C3553u c3553u = new C3553u(j13, j14, str3, j15, string2, string3, i13, interfaceC0949z.getLong(iArr3[7]), interfaceC0949z.getLong(iArr3[10]));
        try {
            C24861r.a aVar5 = C24861r.f119264q;
            int i14 = iArr3[8];
            if (i14 != -1) {
                i11 = interfaceC0949z.getInt(i14);
            } else {
                i11 = 0;
            }
            m129218b = C24861r.m129218b(Integer.valueOf(i11));
        } catch (Throwable th4) {
            C24861r.a aVar6 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th4));
        }
        if (C24861r.m129223g(m129218b)) {
            m129218b = 0;
        }
        return new C3548p(c3553u, c3549q, c3551s, ((Number) m129218b).intValue());
    }

    /* renamed from: x */
    private final void m42642x(String str) {
        String m127098f;
        try {
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y = null;
            }
            m127098f = AbstractC24334o.m127098f("CREATE VIRTUAL TABLE " + str + " USING FTS4(TOKENIZE=unicode61 \"remove_diacritics=1\",\n                                  message_search, \n                                  ownerId, notindexed=ownerId,\n                                  senderUid INTEGER DEFAULT 0, notindexed=senderUid,\n                                  type INTEGER DEFAULT 0, notindexed=type,\n                                  timestamp INTEGER DEFAULT 0, notindexed=timestamp,\n                                  cliMsgId INTEGER DEFAULT 0, notindexed=cliMsgId,\n                                  globalMsgId INTEGER DEFAULT 0, notindexed=globalMsgId,\n                                  attachment, notindexed=attachment,\n                                  msgRowId INTEGER DEFAULT 0, notindexed=msgRowId,\n                                  ttl INTEGER DEFAULT 0, notindexed=ttl)\n                               ");
            interfaceC0947y.mo2857x(m127098f);
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
        }
    }

    /* renamed from: z */
    public static final C7961f m42643z() {
        return Companion.m42658b();
    }

    /* renamed from: G */
    public final void m42644G(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        C0822i.f2887p.m2150b(new Runnable() { // from class: am.q

            /* renamed from: q */
            public final /* synthetic */ MessageId f3438q;

            public /* synthetic */ RunnableC0931q(MessageId messageId2) {
                r2 = messageId2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7961f.m42616H(C7961f.this, r2);
            }
        });
    }

    /* renamed from: I */
    public final void m42645I(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "clientMsgIdSet");
        AbstractC19074t.m100208f(str3, "globalMsgIdSet");
        try {
            if (!m42613D()) {
                return;
            }
            if (str3.length() <= 0 && str2.length() <= 0) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (str2.length() > 0) {
                arrayList.add("cliMsgId IN (" + str2 + ")");
            }
            if (str3.length() > 0) {
                arrayList.add("globalMsgId IN (" + str3 + ")");
            }
            String str4 = "(" + TextUtils.join(" or ", arrayList) + ")";
            ArrayList arrayList2 = new ArrayList();
            if (str.length() > 0) {
                arrayList2.add("ownerId = '" + str + "'");
            }
            arrayList2.add("(" + str4 + ")");
            String join = TextUtils.join(" and ", arrayList2);
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y = null;
            }
            interfaceC0947y.mo2857x("DELETE FROM " + m42611B() + " WHERE " + join);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            String str5 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str5, "currentUserUid");
            AbstractC20887g.m109231i(str5, 17523, e11.toString(), 0L, 17500, CoreUtility.f89236l);
        }
    }

    /* renamed from: J */
    public final void m42646J(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "clientMsgIdSet");
        AbstractC19074t.m100208f(str3, "globalMsgIdSet");
        C0822i.f2887p.m2150b(new Runnable() { // from class: am.s

            /* renamed from: q */
            public final /* synthetic */ String f3442q;

            /* renamed from: r */
            public final /* synthetic */ String f3443r;

            /* renamed from: s */
            public final /* synthetic */ String f3444s;

            public /* synthetic */ RunnableC0935s(String str4, String str22, String str32) {
                r2 = str4;
                r3 = str22;
                r4 = str32;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7961f.m42617K(C7961f.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: M */
    public final void m42647M(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        C0822i.f2887p.m2150b(new Runnable() { // from class: am.r

            /* renamed from: q */
            public final /* synthetic */ String f3440q;

            public /* synthetic */ RunnableC0933r(String str2) {
                r2 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7961f.m42619N(C7961f.this, r2);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:            if (r13 == null) goto L189;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00dc A[Catch: Exception -> 0x00cb, TryCatch #5 {Exception -> 0x00cb, blocks: (B:44:0x0181, B:46:0x01bb, B:47:0x01c1, B:106:0x01d1, B:86:0x024c, B:111:0x0165, B:120:0x00c0, B:121:0x00d8, B:123:0x00dc, B:125:0x00ec, B:126:0x00fa, B:129:0x010f, B:131:0x0113, B:132:0x0155), top: B:119:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ec A[Catch: Exception -> 0x00cb, TryCatch #5 {Exception -> 0x00cb, blocks: (B:44:0x0181, B:46:0x01bb, B:47:0x01c1, B:106:0x01d1, B:86:0x024c, B:111:0x0165, B:120:0x00c0, B:121:0x00d8, B:123:0x00dc, B:125:0x00ec, B:126:0x00fa, B:129:0x010f, B:131:0x0113, B:132:0x0155), top: B:119:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: Exception -> 0x0026, TRY_ENTER, TryCatch #6 {Exception -> 0x0026, blocks: (B:3:0x0015, B:9:0x001f, B:14:0x002e, B:17:0x0035, B:19:0x004a, B:22:0x0051, B:25:0x006d, B:27:0x0073, B:31:0x007d, B:112:0x00af), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #6 {Exception -> 0x0026, blocks: (B:3:0x0015, B:9:0x001f, B:14:0x002e, B:17:0x0035, B:19:0x004a, B:22:0x0051, B:25:0x006d, B:27:0x0073, B:31:0x007d, B:112:0x00af), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bb A[Catch: Exception -> 0x00cb, TryCatch #5 {Exception -> 0x00cb, blocks: (B:44:0x0181, B:46:0x01bb, B:47:0x01c1, B:106:0x01d1, B:86:0x024c, B:111:0x0165, B:120:0x00c0, B:121:0x00d8, B:123:0x00dc, B:125:0x00ec, B:126:0x00fa, B:129:0x010f, B:131:0x0113, B:132:0x0155), top: B:119:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m42648O(String str, String str2, String str3, int i11, int i12, int i13, InterfaceC19305a interfaceC19305a) {
        ?? r52;
        String str4;
        String str5;
        String str6;
        int i14;
        int i15;
        ArrayList arrayList;
        String str7;
        List m131197W;
        String m118861i;
        int length;
        int i16;
        String sb2;
        String m127098f;
        InterfaceC0947y interfaceC0947y;
        InterfaceC0949z mo2777u;
        Throwable th2;
        ArrayList arrayList2;
        Integer m127107m;
        int i17 = i13;
        ArrayList arrayList3 = new ArrayList();
        try {
            if (!m42613D()) {
                return arrayList3;
            }
            if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                return arrayList3;
            }
            if (str != null && str.length() != 0) {
                str4 = "message_search match " + str;
                if (str2 != null && str2.length() != 0) {
                    str5 = " ownerId = '" + str2 + "'";
                    if (str3 != null && m127107m != null) {
                        if (m127107m.intValue() != 0) {
                            m127107m = null;
                        }
                        if (m127107m != null) {
                            str6 = "senderUid = " + m127107m.intValue() + " ";
                        }
                    }
                    str6 = "";
                    i14 = i17 & 1;
                    if (i14 == 0 && (i17 & 2) != 0 && (i17 & 4) != 0) {
                        arrayList = arrayList3;
                        m118861i = "";
                        str7 = m118861i;
                        i16 = i17;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        i15 = i17 & 2;
                        if (i15 == 0) {
                            str7 = "";
                            try {
                                List m102912M0 = AbstractC19646n0.m102912M0();
                                arrayList = arrayList3;
                                try {
                                    AbstractC19074t.m100207e(m102912M0, "getRecommendMsgTypes(...)");
                                    arrayList4.addAll(m102912M0);
                                } catch (Exception e11) {
                                    e = e11;
                                    r52 = arrayList;
                                    AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e);
                                    return r52;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                arrayList = arrayList3;
                            }
                        } else {
                            arrayList = arrayList3;
                            str7 = "";
                        }
                        if ((i17 & 4) != 0) {
                            List m102882C0 = AbstractC19646n0.m102882C0();
                            AbstractC19074t.m100207e(m102882C0, "getFileMsgTypes(...)");
                            arrayList4.addAll(m102882C0);
                        }
                        if (i14 != 0) {
                            List m102921P0 = AbstractC19646n0.m102921P0();
                            AbstractC19074t.m100207e(m102921P0, "getTextMsgTypes(...)");
                            arrayList4.addAll(m102921P0);
                        }
                        m131197W = AbstractC25332a0.m131197W(arrayList4);
                        m118861i = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131197W);
                        AbstractC19074t.m100207e(m118861i, "getInSetValuesClause(...)");
                        if (i17 != 15 && i15 != 0 && (i17 & 16) != 0) {
                            m118861i = "(" + m118861i + " OR " + ("(" + AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, AbstractC19646n0.m102921P0()) + " AND " + AbstractC23149n0.m118863k("message_search") + ")") + ")";
                        }
                        length = m118861i.length();
                        i16 = length;
                        if (length == 0) {
                            m118861i = str7;
                            i16 = length;
                        }
                    }
                    if (i12 <= 0 && i11 <= 0) {
                        sb2 = str7;
                        r52 = i16;
                        m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6, m118861i) + "\n                ORDER BY timestamp  DESC\n                " + sb2 + "\n                ");
                        interfaceC0947y = this.f43278c;
                        if (interfaceC0947y == null) {
                            AbstractC19074t.m100223u("db");
                            interfaceC0947y = null;
                        }
                        mo2777u = interfaceC0947y.mo2777u(m127098f);
                        if (mo2777u == null) {
                            try {
                                if (interfaceC19305a != null) {
                                    try {
                                        if (interfaceC19305a.isCancelled()) {
                                            AbstractC3601a.m18219a(mo2777u, null);
                                            return arrayList;
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        r52 = arrayList;
                                        try {
                                            throw th2;
                                        } catch (Throwable th4) {
                                            AbstractC3601a.m18219a(mo2777u, th2);
                                            throw th4;
                                        }
                                    }
                                }
                                try {
                                    int[] iArr = {mo2777u.getColumnIndex("cliMsgId"), mo2777u.getColumnIndex("globalMsgId"), mo2777u.getColumnIndex("message_search"), mo2777u.getColumnIndex("timestamp"), mo2777u.getColumnIndex("senderUid"), mo2777u.getColumnIndex("ownerId"), mo2777u.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE), mo2777u.getColumnIndex("msgRowId"), -1, mo2777u.getColumnIndex("attachment"), mo2777u.getColumnIndex("ttl")};
                                    while (mo2777u.next()) {
                                        if (interfaceC19305a != null) {
                                            if (interfaceC19305a.isCancelled()) {
                                                AbstractC3601a.m18219a(mo2777u, null);
                                                return arrayList;
                                            }
                                        }
                                        C3548p m42641w = m42641w(mo2777u, iArr);
                                        if (m42641w.m18037d().m18058g() == 0 || C23793c.Companion.m124321a().mo124314i() - m42641w.m18037d().m18057f() < m42641w.m18037d().m18058g()) {
                                            arrayList2 = arrayList;
                                            try {
                                                arrayList2.add(m42641w);
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th2 = th;
                                                r52 = arrayList2;
                                                throw th2;
                                            }
                                        } else {
                                            arrayList2 = arrayList;
                                        }
                                        arrayList = arrayList2;
                                    }
                                    arrayList2 = arrayList;
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    AbstractC3601a.m18219a(mo2777u, null);
                                    return arrayList2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    arrayList2 = arrayList;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e);
                                return r52;
                            }
                        } else {
                            return arrayList;
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" LIMIT ");
                    sb3.append(i11);
                    sb3.append(",");
                    sb3.append(i12);
                    sb3.append(" ");
                    sb2 = sb3.toString();
                    r52 = sb3;
                    m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6, m118861i) + "\n                ORDER BY timestamp  DESC\n                " + sb2 + "\n                ");
                    interfaceC0947y = this.f43278c;
                    if (interfaceC0947y == null) {
                    }
                    mo2777u = interfaceC0947y.mo2777u(m127098f);
                    if (mo2777u == null) {
                    }
                }
                str5 = "";
                if (str3 != null) {
                    m127107m = AbstractC24340u.m127107m(str3);
                    if (m127107m.intValue() != 0) {
                    }
                    if (m127107m != null) {
                    }
                }
                str6 = "";
                i14 = i17 & 1;
                if (i14 == 0) {
                }
                ArrayList arrayList42 = new ArrayList();
                i15 = i17 & 2;
                if (i15 == 0) {
                }
                if ((i17 & 4) != 0) {
                }
                if (i14 != 0) {
                }
                m131197W = AbstractC25332a0.m131197W(arrayList42);
                m118861i = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131197W);
                AbstractC19074t.m100207e(m118861i, "getInSetValuesClause(...)");
                if (i17 != 15) {
                    m118861i = "(" + m118861i + " OR " + ("(" + AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, AbstractC19646n0.m102921P0()) + " AND " + AbstractC23149n0.m118863k("message_search") + ")") + ")";
                }
                length = m118861i.length();
                i16 = length;
                if (length == 0) {
                }
                if (i12 <= 0) {
                    sb2 = str7;
                    r52 = i16;
                    m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6, m118861i) + "\n                ORDER BY timestamp  DESC\n                " + sb2 + "\n                ");
                    interfaceC0947y = this.f43278c;
                    if (interfaceC0947y == null) {
                    }
                    mo2777u = interfaceC0947y.mo2777u(m127098f);
                    if (mo2777u == null) {
                    }
                }
                StringBuilder sb32 = new StringBuilder();
                sb32.append(" LIMIT ");
                sb32.append(i11);
                sb32.append(",");
                sb32.append(i12);
                sb32.append(" ");
                sb2 = sb32.toString();
                r52 = sb32;
                m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6, m118861i) + "\n                ORDER BY timestamp  DESC\n                " + sb2 + "\n                ");
                interfaceC0947y = this.f43278c;
                if (interfaceC0947y == null) {
                }
                mo2777u = interfaceC0947y.mo2777u(m127098f);
                if (mo2777u == null) {
                }
            }
            str4 = "";
            if (str2 != null) {
                str5 = " ownerId = '" + str2 + "'";
                if (str3 != null) {
                }
                str6 = "";
                i14 = i17 & 1;
                if (i14 == 0) {
                }
                ArrayList arrayList422 = new ArrayList();
                i15 = i17 & 2;
                if (i15 == 0) {
                }
                if ((i17 & 4) != 0) {
                }
                if (i14 != 0) {
                }
                m131197W = AbstractC25332a0.m131197W(arrayList422);
                m118861i = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131197W);
                AbstractC19074t.m100207e(m118861i, "getInSetValuesClause(...)");
                if (i17 != 15) {
                }
                length = m118861i.length();
                i16 = length;
                if (length == 0) {
                }
                if (i12 <= 0) {
                }
                StringBuilder sb322 = new StringBuilder();
                sb322.append(" LIMIT ");
                sb322.append(i11);
                sb322.append(",");
                sb322.append(i12);
                sb322.append(" ");
                sb2 = sb322.toString();
                r52 = sb322;
                m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6, m118861i) + "\n                ORDER BY timestamp  DESC\n                " + sb2 + "\n                ");
                interfaceC0947y = this.f43278c;
                if (interfaceC0947y == null) {
                }
                mo2777u = interfaceC0947y.mo2777u(m127098f);
                if (mo2777u == null) {
                }
            }
            str5 = "";
            if (str3 != null) {
            }
            str6 = "";
            i14 = i17 & 1;
            if (i14 == 0) {
            }
            ArrayList arrayList4222 = new ArrayList();
            i15 = i17 & 2;
            if (i15 == 0) {
            }
            if ((i17 & 4) != 0) {
            }
            if (i14 != 0) {
            }
            m131197W = AbstractC25332a0.m131197W(arrayList4222);
            m118861i = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131197W);
            AbstractC19074t.m100207e(m118861i, "getInSetValuesClause(...)");
            if (i17 != 15) {
            }
            length = m118861i.length();
            i16 = length;
            if (length == 0) {
            }
            if (i12 <= 0) {
            }
            StringBuilder sb3222 = new StringBuilder();
            sb3222.append(" LIMIT ");
            sb3222.append(i11);
            sb3222.append(",");
            sb3222.append(i12);
            sb3222.append(" ");
            sb2 = sb3222.toString();
            r52 = sb3222;
            m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6, m118861i) + "\n                ORDER BY timestamp  DESC\n                " + sb2 + "\n                ");
            interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
            }
            mo2777u = interfaceC0947y.mo2777u(m127098f);
            if (mo2777u == null) {
            }
        } catch (Exception e14) {
            e = e14;
            r52 = arrayList3;
        }
    }

    /* renamed from: P */
    public final List m42649P(String str, int i11, InterfaceC19305a interfaceC19305a) {
        List m131197W;
        String m127098f;
        AbstractC19074t.m100208f(str, "keyword");
        ArrayList arrayList = new ArrayList();
        if (!m42613D()) {
            return arrayList;
        }
        int i12 = i11 & 1;
        String str2 = "";
        if (i12 == 0 || (i11 & 2) == 0 || (i11 & 4) == 0) {
            try {
                ArrayList arrayList2 = new ArrayList();
                int i13 = i11 & 2;
                if (i13 != 0) {
                    List m102912M0 = AbstractC19646n0.m102912M0();
                    AbstractC19074t.m100207e(m102912M0, "getRecommendMsgTypes(...)");
                    arrayList2.addAll(m102912M0);
                }
                if ((i11 & 4) != 0) {
                    List m102882C0 = AbstractC19646n0.m102882C0();
                    AbstractC19074t.m100207e(m102882C0, "getFileMsgTypes(...)");
                    arrayList2.addAll(m102882C0);
                }
                if (i12 != 0) {
                    List m102921P0 = AbstractC19646n0.m102921P0();
                    AbstractC19074t.m100207e(m102921P0, "getTextMsgTypes(...)");
                    arrayList2.addAll(m102921P0);
                }
                m131197W = AbstractC25332a0.m131197W(arrayList2);
                String m118861i = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131197W);
                AbstractC19074t.m100207e(m118861i, "getInSetValuesClause(...)");
                if (i11 != 15 && i13 != 0 && (i11 & 16) != 0) {
                    m118861i = "(" + m118861i + " OR " + ("(" + AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, AbstractC19646n0.m102921P0()) + " AND " + AbstractC23149n0.m118863k("message_search") + ")") + ")";
                }
                if (m118861i.length() != 0) {
                    str2 = m118861i;
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            }
        }
        String str3 = "message_search match " + str;
        InterfaceC0947y interfaceC0947y = this.f43278c;
        if (interfaceC0947y == null) {
            AbstractC19074t.m100223u("db");
            interfaceC0947y = null;
        }
        m127098f = AbstractC24334o.m127098f("\n                SELECT count(*) AS match_count, max(timestamp) as max_ts, cliMsgId, globalMsgId, message_search, senderUid, ownerId, type, msgRowId, attachment, ttl\n                FROM " + m42611B() + " \n                WHERE " + AbstractC23149n0.m118856d(str3, str2) + "\n                GROUP BY ownerId  \n                ORDER BY timestamp DESC\n                ");
        InterfaceC0949z mo2777u = interfaceC0947y.mo2777u(m127098f);
        if (mo2777u != null) {
            try {
                int[] iArr = {mo2777u.getColumnIndex("cliMsgId"), mo2777u.getColumnIndex("globalMsgId"), mo2777u.getColumnIndex("message_search"), mo2777u.getColumnIndex("max_ts"), mo2777u.getColumnIndex("senderUid"), mo2777u.getColumnIndex("ownerId"), mo2777u.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE), mo2777u.getColumnIndex("msgRowId"), mo2777u.getColumnIndex("match_count"), mo2777u.getColumnIndex("attachment"), mo2777u.getColumnIndex("ttl")};
                while (mo2777u.next()) {
                    if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                        AbstractC3601a.m18219a(mo2777u, null);
                        return arrayList;
                    }
                    C3548p m42641w = m42641w(mo2777u, iArr);
                    if (m42641w.m18037d().m18058g() == 0 || C23793c.Companion.m124321a().mo124314i() - m42641w.m18037d().m18057f() < m42641w.m18037d().m18058g()) {
                        arrayList.add(m42641w);
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2777u, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC3601a.m18219a(mo2777u, th2);
                    throw th3;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:            if (r10 == null) goto L123;     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: Exception -> 0x0016, TRY_ENTER, TryCatch #1 {Exception -> 0x0016, blocks: (B:3:0x0005, B:9:0x000f, B:14:0x001d, B:17:0x0024, B:19:0x0039, B:22:0x0040, B:25:0x005d, B:27:0x0063, B:31:0x006d, B:35:0x00a8, B:37:0x00e2, B:38:0x00e8, B:71:0x00f6, B:48:0x0110, B:59:0x0126, B:66:0x012c, B:67:0x012f, B:74:0x008c, B:69:0x00f0, B:41:0x00fc, B:42:0x0102, B:45:0x010a, B:50:0x0114, B:53:0x0120, B:58:0x0124, B:63:0x012a), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[Catch: Exception -> 0x0016, TryCatch #1 {Exception -> 0x0016, blocks: (B:3:0x0005, B:9:0x000f, B:14:0x001d, B:17:0x0024, B:19:0x0039, B:22:0x0040, B:25:0x005d, B:27:0x0063, B:31:0x006d, B:35:0x00a8, B:37:0x00e2, B:38:0x00e8, B:71:0x00f6, B:48:0x0110, B:59:0x0126, B:66:0x012c, B:67:0x012f, B:74:0x008c, B:69:0x00f0, B:41:0x00fc, B:42:0x0102, B:45:0x010a, B:50:0x0114, B:53:0x0120, B:58:0x0124, B:63:0x012a), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2 A[Catch: Exception -> 0x0016, TryCatch #1 {Exception -> 0x0016, blocks: (B:3:0x0005, B:9:0x000f, B:14:0x001d, B:17:0x0024, B:19:0x0039, B:22:0x0040, B:25:0x005d, B:27:0x0063, B:31:0x006d, B:35:0x00a8, B:37:0x00e2, B:38:0x00e8, B:71:0x00f6, B:48:0x0110, B:59:0x0126, B:66:0x012c, B:67:0x012f, B:74:0x008c, B:69:0x00f0, B:41:0x00fc, B:42:0x0102, B:45:0x010a, B:50:0x0114, B:53:0x0120, B:58:0x0124, B:63:0x012a), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x006a  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m42650Q(String str, String str2, String str3, int i11, int i12, InterfaceC19305a interfaceC19305a) {
        String str4;
        String str5;
        String str6;
        String m127098f;
        InterfaceC0947y interfaceC0947y;
        InterfaceC0949z mo2777u;
        Integer m127107m;
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
        }
        if (!m42613D()) {
            return arrayList;
        }
        if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
            return arrayList;
        }
        String str7 = "";
        if (str != null && str.length() != 0) {
            str4 = "message_search match " + str;
            if (str2 != null && str2.length() != 0) {
                str5 = "ownerId = '" + str2 + "'";
                if (str3 != null && m127107m != null) {
                    if (m127107m.intValue() != 0) {
                        m127107m = null;
                    }
                    if (m127107m != null) {
                        str6 = "senderUid = " + m127107m.intValue() + " ";
                    }
                }
                str6 = "";
                if (i12 <= 0 || i11 > 0) {
                    str7 = " LIMIT " + i11 + "," + i12 + " ";
                }
                m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6) + "\n                ORDER BY timestamp  DESC\n                " + str7 + "\n                ");
                interfaceC0947y = this.f43278c;
                if (interfaceC0947y == null) {
                    AbstractC19074t.m100223u("db");
                    interfaceC0947y = null;
                }
                mo2777u = interfaceC0947y.mo2777u(m127098f);
                if (mo2777u != null) {
                    if (interfaceC19305a != null) {
                        try {
                            if (interfaceC19305a.isCancelled()) {
                                AbstractC3601a.m18219a(mo2777u, null);
                                return arrayList;
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                AbstractC3601a.m18219a(mo2777u, th2);
                                throw th3;
                            }
                        }
                    }
                    int[] m42659c = Companion.m42659c(mo2777u);
                    while (mo2777u.next()) {
                        if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                            AbstractC3601a.m18219a(mo2777u, null);
                            return arrayList;
                        }
                        C3554v m42660d = Companion.m42660d(mo2777u, m42659c);
                        if (m42660d.m18066h()) {
                            arrayList.add(m42660d);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC3601a.m18219a(mo2777u, null);
                }
                return arrayList;
            }
            str5 = "";
            if (str3 != null) {
                m127107m = AbstractC24340u.m127107m(str3);
                if (m127107m.intValue() != 0) {
                }
                if (m127107m != null) {
                }
            }
            str6 = "";
            if (i12 <= 0) {
            }
            str7 = " LIMIT " + i11 + "," + i12 + " ";
            m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6) + "\n                ORDER BY timestamp  DESC\n                " + str7 + "\n                ");
            interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
            }
            mo2777u = interfaceC0947y.mo2777u(m127098f);
            if (mo2777u != null) {
            }
            return arrayList;
        }
        str4 = "";
        if (str2 != null) {
            str5 = "ownerId = '" + str2 + "'";
            if (str3 != null) {
            }
            str6 = "";
            if (i12 <= 0) {
            }
            str7 = " LIMIT " + i11 + "," + i12 + " ";
            m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6) + "\n                ORDER BY timestamp  DESC\n                " + str7 + "\n                ");
            interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
            }
            mo2777u = interfaceC0947y.mo2777u(m127098f);
            if (mo2777u != null) {
            }
            return arrayList;
        }
        str5 = "";
        if (str3 != null) {
        }
        str6 = "";
        if (i12 <= 0) {
        }
        str7 = " LIMIT " + i11 + "," + i12 + " ";
        m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str4, str5, str6) + "\n                ORDER BY timestamp  DESC\n                " + str7 + "\n                ");
        interfaceC0947y = this.f43278c;
        if (interfaceC0947y == null) {
        }
        mo2777u = interfaceC0947y.mo2777u(m127098f);
        if (mo2777u != null) {
        }
        return arrayList;
    }

    /* renamed from: S */
    public final List m42651S(String str) {
        String m127098f;
        AbstractC19074t.m100208f(str, "keyword");
        ArrayList arrayList = new ArrayList();
        if (!m42613D()) {
            return arrayList;
        }
        try {
            InterfaceC0947y interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y = null;
            }
            m127098f = AbstractC24334o.m127098f("\n                SELECT count(*) AS match_count, * \n                FROM " + m42611B() + "\n                WHERE  message_search match " + str + "\n                GROUP BY ownerId  \n                ORDER BY timestamp DESC\n                ");
            InterfaceC0949z mo2777u = interfaceC0947y.mo2777u(m127098f);
            if (mo2777u != null) {
                try {
                    char c11 = 0;
                    char c12 = 1;
                    char c13 = 2;
                    char c14 = 3;
                    int[] iArr = {mo2777u.getColumnIndex("cliMsgId"), mo2777u.getColumnIndex("globalMsgId"), mo2777u.getColumnIndex("message_search"), mo2777u.getColumnIndex("timestamp"), mo2777u.getColumnIndex("senderUid"), mo2777u.getColumnIndex("ownerId"), mo2777u.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE), mo2777u.getColumnIndex("msgRowId"), mo2777u.getColumnIndex("ttl"), mo2777u.getColumnIndex("match_count")};
                    while (mo2777u.next()) {
                        long j11 = mo2777u.getLong(iArr[c11]);
                        long j12 = mo2777u.getLong(iArr[c12]);
                        String string = mo2777u.getString(iArr[c13]);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        String string2 = mo2777u.getString(iArr[c14]);
                        AbstractC19074t.m100207e(string2, "getString(...)");
                        String string3 = mo2777u.getString(iArr[4]);
                        AbstractC19074t.m100207e(string3, "getString(...)");
                        String string4 = mo2777u.getString(iArr[5]);
                        AbstractC19074t.m100207e(string4, "getString(...)");
                        C3555w c3555w = new C3555w(j11, j12, string, string2, string3, string4, mo2777u.getInt(iArr[6]), mo2777u.getLong(iArr[7]), mo2777u.getLong(iArr[8]), mo2777u.getInt(iArr[9]));
                        if (c3555w.m18066h()) {
                            arrayList.add(c3555w);
                        }
                        c11 = 0;
                        c12 = 1;
                        c13 = 2;
                        c14 = 3;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC3601a.m18219a(mo2777u, null);
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:15|(21:20|(17:25|(1:98)(1:29)|30|31|(1:97)|34|(2:36|(2:38|(2:40|41)(1:42))(1:95))(1:96)|43|(2:45|(1:47))|48|49|50|51|(1:53)|54|(6:(3:86|87|(2:89|90))|57|(2:(3:66|(3:68|69|70)(1:72)|71)(3:63|64|65)|58)|73|74|75)|91)|99|(1:27)|98|30|31|(0)|97|34|(0)(0)|43|(0)|48|49|50|51|(0)|54|(0)|91)|100|(20:22|25|(0)|98|30|31|(0)|97|34|(0)(0)|43|(0)|48|49|50|51|(0)|54|(0)|91)|99|(0)|98|30|31|(0)|97|34|(0)(0)|43|(0)|48|49|50|51|(0)|54|(0)|91) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ca, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0216, code lost:            ho0.AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(r0);     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:3:0x001a, B:9:0x0024, B:12:0x002f, B:17:0x003a, B:20:0x0041, B:22:0x0058, B:25:0x005f, B:27:0x0079, B:29:0x0084, B:30:0x0090, B:34:0x00b5, B:40:0x00c5, B:42:0x00e4, B:43:0x0112, B:45:0x0121, B:47:0x0134, B:48:0x0178, B:95:0x00ee, B:96:0x00f8, B:97:0x0099), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:3:0x001a, B:9:0x0024, B:12:0x002f, B:17:0x003a, B:20:0x0041, B:22:0x0058, B:25:0x005f, B:27:0x0079, B:29:0x0084, B:30:0x0090, B:34:0x00b5, B:40:0x00c5, B:42:0x00e4, B:43:0x0112, B:45:0x0121, B:47:0x0134, B:48:0x0178, B:95:0x00ee, B:96:0x00f8, B:97:0x0099), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3 A[Catch: Exception -> 0x01ca, TryCatch #2 {Exception -> 0x01ca, blocks: (B:51:0x01be, B:53:0x01c3, B:54:0x01cc, B:89:0x01da, B:64:0x01f5, B:75:0x020b, B:84:0x0212, B:85:0x0215, B:80:0x020f, B:87:0x01d4, B:57:0x01e1, B:58:0x01e7, B:61:0x01ef, B:66:0x01f9, B:69:0x0205, B:74:0x0209), top: B:50:0x01be, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f8 A[Catch: Exception -> 0x002b, TryCatch #1 {Exception -> 0x002b, blocks: (B:3:0x001a, B:9:0x0024, B:12:0x002f, B:17:0x003a, B:20:0x0041, B:22:0x0058, B:25:0x005f, B:27:0x0079, B:29:0x0084, B:30:0x0090, B:34:0x00b5, B:40:0x00c5, B:42:0x00e4, B:43:0x0112, B:45:0x0121, B:47:0x0134, B:48:0x0178, B:95:0x00ee, B:96:0x00f8, B:97:0x0099), top: B:2:0x001a }] */
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m42652T(String str, String str2, List list, EnumC2382z enumC2382z, int i11, int i12, boolean z11, InterfaceC19305a interfaceC19305a) {
        String str3;
        String str4;
        String str5;
        int i13;
        List m131222v0;
        String m127098f;
        InterfaceC0947y interfaceC0947y;
        InterfaceC0949z mo2777u;
        AbstractC19074t.m100208f(enumC2382z, "mediaType");
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e11) {
            e = e11;
        }
        if (!m42613D()) {
            return arrayList;
        }
        if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
            return arrayList;
        }
        C1483e m119969D = AbstractC23262x6.m119969D(str);
        if (m119969D == null) {
            return arrayList;
        }
        String str6 = "";
        if (str != null && str.length() != 0) {
            str3 = "message_search match " + m119969D.f6374a;
            if (str2 != null && str2.length() != 0) {
                str4 = "ownerId = '" + str2 + "'";
                if (list != null || !(!list.isEmpty())) {
                    str5 = "";
                } else {
                    str5 = AbstractC23149n0.m118861i("senderUid", list);
                }
                AbstractC19074t.m100205c(str5);
                if (i12 <= 0 || i11 > 0) {
                    str6 = " LIMIT " + i11 + "," + i12 + " ";
                }
                i13 = c.f43284a[enumC2382z.ordinal()];
                if (i13 == 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            AbstractC23350e.m122774d("DatabaseSearch", "Error: Invalid media type {" + enumC2382z + "}");
                            return new ArrayList();
                        }
                        m131222v0 = AbstractC19646n0.m102882C0();
                        AbstractC19074t.m100207e(m131222v0, "getFileMsgTypes(...)");
                    } else {
                        m131222v0 = AbstractC19646n0.m102912M0();
                        AbstractC19074t.m100207e(m131222v0, "getRecommendMsgTypes(...)");
                    }
                } else {
                    List m102888E0 = AbstractC19646n0.m102888E0();
                    AbstractC19074t.m100207e(m102888E0, "getImageMediaMsgTypes(...)");
                    List m102942W0 = AbstractC19646n0.m102942W0();
                    AbstractC19074t.m100207e(m102942W0, "getVideoMsgTypes(...)");
                    m131222v0 = AbstractC25332a0.m131222v0(m102888E0, m102942W0);
                }
                String m118861i = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131222v0);
                AbstractC19074t.m100207e(m118861i, "getInSetValuesClause(...)");
                if (enumC2382z == EnumC2382z.f9946s) {
                    m118861i = m118861i + " AND attachment LIKE '%recommened.link%'";
                    if (z11) {
                        m118861i = "(" + m118861i + " OR " + ("(" + AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, AbstractC19646n0.m102921P0()) + " AND " + AbstractC23149n0.m118863k("message_search") + ")") + ")";
                    }
                }
                String str7 = " " + m118861i;
                m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str3, str4, str5, str7) + "\n                ORDER BY timestamp DESC\n                " + str6 + "\n                ");
                interfaceC0947y = this.f43278c;
                if (interfaceC0947y == null) {
                    AbstractC19074t.m100223u("db");
                    interfaceC0947y = null;
                }
                mo2777u = interfaceC0947y.mo2777u(m127098f);
                if (mo2777u != null) {
                    if (interfaceC19305a != null) {
                        try {
                            if (interfaceC19305a.isCancelled()) {
                                AbstractC3601a.m18219a(mo2777u, null);
                                return arrayList;
                            }
                        } finally {
                        }
                    }
                    int[] m42659c = Companion.m42659c(mo2777u);
                    while (mo2777u.next()) {
                        if (interfaceC19305a != null && interfaceC19305a.isCancelled()) {
                            AbstractC3601a.m18219a(mo2777u, null);
                            return arrayList;
                        }
                        C3554v m42660d = Companion.m42660d(mo2777u, m42659c);
                        if (m42660d.m18066h()) {
                            arrayList.add(m42660d);
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC3601a.m18219a(mo2777u, null);
                }
                return arrayList;
            }
            str4 = "";
            if (list != null) {
            }
            str5 = "";
            AbstractC19074t.m100205c(str5);
            if (i12 <= 0) {
            }
            str6 = " LIMIT " + i11 + "," + i12 + " ";
            i13 = c.f43284a[enumC2382z.ordinal()];
            if (i13 == 1) {
            }
            String m118861i2 = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131222v0);
            AbstractC19074t.m100207e(m118861i2, "getInSetValuesClause(...)");
            if (enumC2382z == EnumC2382z.f9946s) {
            }
            String str72 = " " + m118861i2;
            m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str3, str4, str5, str72) + "\n                ORDER BY timestamp DESC\n                " + str6 + "\n                ");
            interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
            }
            mo2777u = interfaceC0947y.mo2777u(m127098f);
            if (mo2777u != null) {
            }
            return arrayList;
        }
        str3 = "";
        if (str2 != null) {
            str4 = "ownerId = '" + str2 + "'";
            if (list != null) {
            }
            str5 = "";
            AbstractC19074t.m100205c(str5);
            if (i12 <= 0) {
            }
            str6 = " LIMIT " + i11 + "," + i12 + " ";
            i13 = c.f43284a[enumC2382z.ordinal()];
            if (i13 == 1) {
            }
            String m118861i22 = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131222v0);
            AbstractC19074t.m100207e(m118861i22, "getInSetValuesClause(...)");
            if (enumC2382z == EnumC2382z.f9946s) {
            }
            String str722 = " " + m118861i22;
            m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str3, str4, str5, str722) + "\n                ORDER BY timestamp DESC\n                " + str6 + "\n                ");
            interfaceC0947y = this.f43278c;
            if (interfaceC0947y == null) {
            }
            mo2777u = interfaceC0947y.mo2777u(m127098f);
            if (mo2777u != null) {
            }
            return arrayList;
        }
        str4 = "";
        if (list != null) {
        }
        str5 = "";
        AbstractC19074t.m100205c(str5);
        if (i12 <= 0) {
        }
        str6 = " LIMIT " + i11 + "," + i12 + " ";
        i13 = c.f43284a[enumC2382z.ordinal()];
        if (i13 == 1) {
        }
        String m118861i222 = AbstractC23149n0.m118861i(ZinstantMetaConstant.IMPRESSION_META_TYPE, m131222v0);
        AbstractC19074t.m100207e(m118861i222, "getInSetValuesClause(...)");
        if (enumC2382z == EnumC2382z.f9946s) {
        }
        String str7222 = " " + m118861i222;
        m127098f = AbstractC24334o.m127098f("\n                SELECT *\n                FROM  " + m42611B() + "\n                WHERE  " + AbstractC23149n0.m118856d(str3, str4, str5, str7222) + "\n                ORDER BY timestamp DESC\n                " + str6 + "\n                ");
        interfaceC0947y = this.f43278c;
        if (interfaceC0947y == null) {
        }
        mo2777u = interfaceC0947y.mo2777u(m127098f);
        if (mo2777u != null) {
        }
        return arrayList;
    }

    /* renamed from: s */
    public final void m42653s(C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        C0822i.f2887p.m2150b(new Runnable() { // from class: am.p

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f3435q;

            /* renamed from: r */
            public final /* synthetic */ boolean f3436r;

            public /* synthetic */ RunnableC0929p(C17945a0 c17945a02, boolean z112) {
                r2 = c17945a02;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C7961f.m42639t(C7961f.this, r2, r3);
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:18|19|(9:24|25|(9:56|57|(1:59)(1:113)|60|61|(5:65|(2:67|68)(11:(1:71)(1:95)|72|73|(1:94)(2:77|(1:79)(7:93|81|(1:83)(1:92)|84|(1:86)|87|(2:89|90)(1:91)))|80|81|(0)(0)|84|(0)|87|(0)(0))|69|62|63)|96|(1:98)(5:100|(1:102)|103|(1:105)(1:107)|106)|99)(1:27)|28|29|30|(1:35)|33|34)|121|(1:123)|124|25|(0)(0)|28|29|30|(1:35)(1:36)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0268, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0269, code lost:            r9 = r16;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0264, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0265, code lost:            r9 = r16;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cb A[Catch: all -> 0x01ab, Exception -> 0x01af, TryCatch #8 {Exception -> 0x01af, all -> 0x01ab, blocks: (B:63:0x012a, B:65:0x0130, B:73:0x0169, B:75:0x017f, B:77:0x0187, B:81:0x01bb, B:84:0x01c7, B:86:0x01cb, B:87:0x01cf, B:89:0x01de, B:98:0x01f6, B:100:0x0205, B:102:0x020d, B:103:0x0211, B:106:0x0223), top: B:62:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de A[Catch: all -> 0x01ab, Exception -> 0x01af, TryCatch #8 {Exception -> 0x01af, all -> 0x01ab, blocks: (B:63:0x012a, B:65:0x0130, B:73:0x0169, B:75:0x017f, B:77:0x0187, B:81:0x01bb, B:84:0x01c7, B:86:0x01cb, B:87:0x01cf, B:89:0x01de, B:98:0x01f6, B:100:0x0205, B:102:0x020d, B:103:0x0211, B:106:0x0223), top: B:62:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c5  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m42654u() {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        List m131505m;
        String m127098f;
        Map m42610A;
        String str;
        boolean z14;
        boolean z15;
        String str2;
        Map map;
        String str3;
        Iterator it;
        String str4;
        boolean z16;
        InterfaceC0947y interfaceC0947y;
        Integer num;
        String str5 = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str5);
        if (str5.length() != 0 && this.f43279d && m42611B().length() != 0 && AbstractC23309i.m121160Lg() && !C7967l.Companion.m42748b().m42733H()) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                i11 = 1;
            } catch (Exception e11) {
                e = e11;
                z11 = false;
            } catch (Throwable th2) {
                th = th2;
                z11 = false;
            }
            if (!this.f43282g.compareAndSet(false, true)) {
                this.f43282g.set(false);
                return;
            }
            if (!AbstractC0924m0.m4256ub() && m42612C(m42611B())) {
                z13 = false;
                if (!AbstractC0924m0.m4227tb()) {
                    try {
                        this.f43280e = false;
                        String m42611B = m42611B();
                        m131505m = AbstractC25368s.m131505m(0, 3, 4, 19, 22, 12, 18);
                        m127098f = AbstractC24334o.m127098f("INSERT INTO " + m42611B + " (message_search, ownerId, senderUid, type, timestamp, cliMsgId, globalMsgId, attachment, msgRowId, ttl)\n                                     SELECT get_search_text(MsgContent, MsgType, BinNet), \n                                     {OWNERID},\n                                     SenderId,\n                                     MsgType, \n                                     cast(TimeStamp as INTEGER), \n                                     CliMsgId, \n                                     GlbMsgId,\n                                     get_attachment_text(MsgType, BinNet), \n                                     rowid, \n                                     TTL\n                                     FROM ChatContent\n                                     WHERE " + AbstractC23149n0.m118861i("MsgType", m131505m) + "\n                          ");
                        if (z13) {
                            m42610A = null;
                        } else {
                            m42610A = m42610A();
                        }
                        Iterator it2 = C7956b.Companion.m41573b().m41568z().iterator();
                        z12 = false;
                        boolean z17 = true;
                        while (it2.hasNext()) {
                            try {
                                C24860q c24860q = (C24860q) it2.next();
                                int intValue = ((Number) c24860q.m129213a()).intValue();
                                int intValue2 = ((Number) c24860q.m129214b()).intValue();
                                if (AbstractC0924m0.m3251Mb()) {
                                    map = m42610A;
                                    str3 = m127098f;
                                    it = it2;
                                    z12 = true;
                                } else {
                                    if (intValue2 == i11) {
                                        str2 = "group_";
                                    } else {
                                        str2 = "";
                                    }
                                    String str6 = str2 + intValue;
                                    ZdbApiCode zdbApiCode = new ZdbApiCode();
                                    if (m42610A != null && (num = (Integer) m42610A.get(str6)) != null) {
                                        map = m42610A;
                                        int intValue3 = num.intValue();
                                        it = it2;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(m127098f);
                                        str3 = m127098f;
                                        sb2.append(" AND rowid > ");
                                        sb2.append(intValue3);
                                        String sb3 = sb2.toString();
                                        if (sb3 != null) {
                                            str4 = sb3;
                                            int parseInt = Integer.parseInt(str5);
                                            if (intValue2 != 1) {
                                                z16 = true;
                                            } else {
                                                z16 = false;
                                            }
                                            interfaceC0947y = this.f43278c;
                                            if (interfaceC0947y == null) {
                                                AbstractC19074t.m100223u("db");
                                                interfaceC0947y = null;
                                            }
                                            Zadb.m42755j(parseInt, intValue, z16, str4, interfaceC0947y.mo2856w(), zdbApiCode);
                                            if (zdbApiCode.error_code == 0) {
                                                C7967l.Companion.m42751f(zdbApiCode, "generateSearchChatFromDBAPI", str5, str6);
                                                z17 = false;
                                            }
                                        }
                                    } else {
                                        map = m42610A;
                                        str3 = m127098f;
                                        it = it2;
                                    }
                                    str4 = str3;
                                    int parseInt2 = Integer.parseInt(str5);
                                    if (intValue2 != 1) {
                                    }
                                    interfaceC0947y = this.f43278c;
                                    if (interfaceC0947y == null) {
                                    }
                                    Zadb.m42755j(parseInt2, intValue, z16, str4, interfaceC0947y.mo2856w(), zdbApiCode);
                                    if (zdbApiCode.error_code == 0) {
                                    }
                                }
                                m42610A = map;
                                it2 = it;
                                m127098f = str3;
                                i11 = 1;
                            } catch (Exception e12) {
                                e = e12;
                                z11 = true;
                                try {
                                    AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e);
                                    AbstractC20887g.m109238p(17521, currentTimeMillis);
                                    String str7 = CoreUtility.f89233i;
                                    AbstractC19074t.m100207e(str7, "currentUserUid");
                                    AbstractC20887g.m109231i(str7, 17521, e.toString(), 0L, 17500, CoreUtility.f89236l);
                                    this.f43282g.set(false);
                                    if (!z11 || z12) {
                                        return;
                                    }
                                    AbstractC20887g.m109214A(17521, "{\"type\": \"reIndex\"}", currentTimeMillis);
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    this.f43282g.set(false);
                                    if (z11 && !z12) {
                                        AbstractC20887g.m109214A(17521, "{\"type\": \"reIndex\"}", currentTimeMillis);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                z11 = true;
                                this.f43282g.set(false);
                                if (z11) {
                                    AbstractC20887g.m109214A(17521, "{\"type\": \"reIndex\"}", currentTimeMillis);
                                }
                                throw th;
                            }
                        }
                        if (z12) {
                            AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104551d("Create DB SEARCH interrupted by restoring msg", new Object[0]);
                        } else {
                            if (AbstractC19074t.m100204b(CoreUtility.f89233i, str5)) {
                                AbstractC0924m0.m4237tl(false);
                            }
                            AbstractC20110a.b m104564x = AbstractC20110a.f98889a.m104564x("DatabaseSearch");
                            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                            if (z17) {
                                str = "SUCCESS";
                            } else {
                                str = "FAIL";
                            }
                            m104564x.mo104551d("Create DB SEARCH in " + currentTimeMillis2 + "ms - " + str, new Object[0]);
                        }
                        z14 = true;
                        z15 = true;
                    } catch (Exception e13) {
                        e = e13;
                        z11 = true;
                        z12 = false;
                        AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e);
                        AbstractC20887g.m109238p(17521, currentTimeMillis);
                        String str72 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str72, "currentUserUid");
                        AbstractC20887g.m109231i(str72, 17521, e.toString(), 0L, 17500, CoreUtility.f89236l);
                        this.f43282g.set(false);
                        if (!z11) {
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z11 = true;
                        z12 = false;
                        this.f43282g.set(false);
                        if (z11) {
                        }
                        throw th;
                    }
                } else {
                    z14 = true;
                    z12 = false;
                    z15 = false;
                }
                this.f43280e = z14;
                this.f43282g.set(false);
                if (z15 || z12) {
                }
                AbstractC20887g.m109214A(17521, "{\"type\": \"reIndex\"}", currentTimeMillis);
                return;
            }
            InterfaceC0947y interfaceC0947y2 = this.f43278c;
            if (interfaceC0947y2 == null) {
                AbstractC19074t.m100223u("db");
                interfaceC0947y2 = null;
            }
            interfaceC0947y2.mo2857x("drop table if exists " + m42611B());
            m42642x(m42611B());
            AbstractC0924m0.m4237tl(true);
            AbstractC0924m0.m4266ul(false);
            z13 = true;
            if (!AbstractC0924m0.m4227tb()) {
            }
            this.f43280e = z14;
            this.f43282g.set(false);
            if (z15) {
            }
        }
    }

    /* renamed from: y */
    public final String m42655y() {
        return this.f43277b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:            r3.f43279d = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:            if (r3.f43278c == null) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:            if (r3.f43278c != null) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:            r0 = true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C7961f(Context context, String str) {
        InterfaceC24854k m129210a;
        this.f43276a = context;
        this.f43277b = str;
        m129210a = AbstractC24856m.m129210a(new d());
        this.f43281f = m129210a;
        this.f43282g = new AtomicBoolean(false);
        try {
            try {
                C0896a c0896a = new C0896a(context, "zalo_search.db");
                if (m42614E(c0896a)) {
                    this.f43278c = c0896a;
                } else {
                    c0896a.mo2840A();
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("DatabaseSearch").mo104552e(e11);
            }
        } catch (Throwable th2) {
            this.f43279d = this.f43278c != null;
            throw th2;
        }
    }
}
