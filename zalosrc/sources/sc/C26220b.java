package sc;

import ag0.C0815e1;
import am.AbstractC0924m0;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.p062db.C7955a;
import com.zing.zalo.p062db.SQLiteDatabase;
import com.zing.zalo.p062db.SQLiteException;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.File;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p248iy.AbstractC20887g;
import p297kd.C21689d;
import p297kd.C21690e;
import p320ld.C22438j;
import p320ld.C22447s;
import pm.C24830a;
import tg0.C26675a;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: sc.b */
/* loaded from: classes3.dex */
public final class C26220b {

    /* renamed from: a */
    public static final C26220b f124587a = new C26220b();

    /* renamed from: sc.b$a */
    /* loaded from: classes3.dex */
    public static final class a extends Enum {

        /* renamed from: p */
        public static final a f124588p = new a("CORE_FLOW", 0);

        /* renamed from: q */
        public static final a f124589q = new a("DEBUG", 1);

        /* renamed from: r */
        public static final a f124590r = new a("SERVER", 2);

        /* renamed from: s */
        public static final a f124591s = new a("ERROR", 3);

        /* renamed from: t */
        private static final /* synthetic */ a[] f124592t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f124593u;

        static {
            a[] m134847b = m134847b();
            f124592t = m134847b;
            f124593u = AbstractC30166b.m148796a(m134847b);
        }

        private a(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m134847b() {
            return new a[]{f124588p, f124589q, f124590r, f124591s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f124592t.clone();
        }
    }

    private C26220b() {
    }

    /* renamed from: A */
    static /* synthetic */ void m134815A(C26220b c26220b, int i11, int i12, String str, long j11, long j12, long j13, int i13, Object obj) {
        long j14;
        long j15;
        long j16;
        if ((i13 & 8) != 0) {
            j14 = System.currentTimeMillis();
        } else {
            j14 = j11;
        }
        if ((i13 & 16) != 0) {
            j15 = System.currentTimeMillis();
        } else {
            j15 = j12;
        }
        if ((i13 & 32) != 0) {
            j16 = 0;
        } else {
            j16 = j13;
        }
        c26220b.m134839z(i11, i12, str, j14, j15, j16);
    }

    /* renamed from: E */
    public static /* synthetic */ void m134816E(C26220b c26220b, boolean z11, int i11, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            str = "";
        }
        c26220b.m134842D(z11, i11, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.zing.zalo.db.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0079 -> B:16:0x008e). Please report as a decompilation issue!!! */
    /* renamed from: F */
    public static final void m134817F(String str, C21690e c21690e) {
        File file;
        AbstractC19074t.m100208f(str, "crossDbFileDecoded");
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        if (str.length() == 0) {
            return;
        }
        ?? r12 = 0;
        SQLiteDatabase sQLiteDatabase = null;
        r12 = 0;
        try {
        } catch (SQLiteException e11) {
            AbstractC23350e.m122776f("SMLBackupRestore", e11);
            r12 = r12;
        }
        try {
            try {
                file = new File(str);
            } catch (Exception e12) {
                e = e12;
            }
            if (!file.exists()) {
                return;
            }
            SQLiteDatabase sQLiteDatabase2 = new SQLiteDatabase(file);
            try {
                sQLiteDatabase2.mo2851m();
                int m41462s = C7955a.m41462s(str, sQLiteDatabase2);
                long m41459p = C7955a.m41459p(str, sQLiteDatabase2);
                r12 = 2;
                C0815e1.m2075D().m2099U(3, 2, 38, String.valueOf(m41462s), String.valueOf(C22447s.m116003H()), String.valueOf(C22447s.m116002G()), String.valueOf(m41459p), String.valueOf(AbstractC0924m0.m4246u1()), String.valueOf(c21690e.f105269f));
                sQLiteDatabase2.close();
            } catch (Exception e13) {
                e = e13;
                sQLiteDatabase = sQLiteDatabase2;
                AbstractC23350e.m122776f("SMLBackupRestore", e);
                r12 = sQLiteDatabase;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                    r12 = sQLiteDatabase;
                }
            } catch (Throwable th2) {
                th = th2;
                r12 = sQLiteDatabase2;
                if (r12 != 0) {
                    try {
                        r12.close();
                    } catch (SQLiteException e14) {
                        AbstractC23350e.m122776f("SMLBackupRestore", e14);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    private final long m134818a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m134819b(Exception exc) {
        AbstractC19074t.m100208f(exc, "exception");
        m134821d("SMLBackupRestore", exc);
    }

    /* renamed from: c */
    public static final void m134820c(String str) {
        AbstractC19074t.m100208f(str, "message");
        m134825h(str, a.f124591s);
    }

    /* renamed from: d */
    public static final void m134821d(String str, Exception exc) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(exc, "exception");
        AbstractC23350e.m122776f(str, exc);
        C24830a.m129112b(exc.toString(), a.f124591s);
    }

    /* renamed from: e */
    public static final void m134822e(String str) {
        AbstractC19074t.m100208f(str, "message");
        m134827j(str, null, 2, null);
    }

    /* renamed from: f */
    public static final void m134823f(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        m134826i(str, str2, null, 4, null);
    }

    /* renamed from: g */
    public static final void m134824g(String str, String str2, a aVar) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC20110a.f98889a.m104564x(str).mo104556o(8, "[" + AbstractC23160o0.m119291t0(f124587a.m134818a()) + "] " + str2, new Object[0]);
        C24830a.m129112b(str2, aVar);
    }

    /* renamed from: h */
    public static final void m134825h(String str, a aVar) {
        AbstractC19074t.m100208f(str, "message");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        m134824g("SMLBackupRestore", str, aVar);
    }

    /* renamed from: i */
    public static /* synthetic */ void m134826i(String str, String str2, a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            aVar = a.f124589q;
        }
        m134824g(str, str2, aVar);
    }

    /* renamed from: j */
    public static /* synthetic */ void m134827j(String str, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            aVar = a.f124589q;
        }
        m134825h(str, aVar);
    }

    /* renamed from: k */
    public static final void m134828k(String str) {
        AbstractC19074t.m100208f(str, "message");
        m134829l("SMLBackupRestore", str);
    }

    /* renamed from: l */
    public static final void m134829l(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
    }

    /* renamed from: m */
    public static final void m134830m(C21690e c21690e) {
        long currentTimeMillis;
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        try {
            long m2950C0 = AbstractC0924m0.m2950C0();
            if (!c21690e.f105270g) {
                currentTimeMillis = System.currentTimeMillis() - AbstractC0924m0.m3361Q5();
                m2950C0 += AbstractC0924m0.m2979D0();
            } else {
                currentTimeMillis = (System.currentTimeMillis() - AbstractC0924m0.m3419S5()) + 100;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("backup_time_user", currentTimeMillis);
            jSONObject.put("backup_time_real", m2950C0);
            if (c21690e.f105270g) {
                long currentTimeMillis2 = System.currentTimeMillis() - AbstractC0924m0.m3361Q5();
                long m2979D0 = AbstractC0924m0.m2979D0() + m2950C0;
                jSONObject.put("full_time_user", currentTimeMillis2);
                jSONObject.put("full_time_real", m2979D0);
            }
            AbstractC20887g.m109229g(17700, 18864, jSONObject.toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLBackupRestore", e11);
        }
    }

    /* renamed from: n */
    public static final void m134831n() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - AbstractC0924m0.m3361Q5();
            long m2979D0 = AbstractC0924m0.m2979D0();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_user", currentTimeMillis);
            jSONObject.put("time_real", m2979D0);
            AbstractC20887g.m109229g(17700, 18863, jSONObject.toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SMLBackupRestore", e11);
        }
    }

    /* renamed from: o */
    public static final void m134832o(String str) {
        AbstractC19074t.m100208f(str, "message");
        m134833p("SMLBackupRestore", str);
    }

    /* renamed from: p */
    public static final void m134833p(String str, String str2) {
        AbstractC19074t.m100208f(str, "tag");
        AbstractC19074t.m100208f(str2, "message");
        C24830a.m129112b(str2, a.f124589q);
    }

    /* renamed from: r */
    public static final void m134834r(C21690e c21690e, int i11, int i12, String str) {
        int i13;
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        if (!C22438j.m115946n(c21690e.f105269f)) {
            return;
        }
        long m111894t = c21690e.m111894t();
        long m111889o = c21690e.m111889o();
        long j11 = m111894t + m111889o;
        if (c21690e.m111899y()) {
            i13 = 18879;
        } else {
            i13 = 18878;
        }
        if (i11 == -1) {
            AbstractC20887g.m109216C(i13, null, m111894t, j11, m111889o);
            return;
        }
        if (i12 == 2006) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pos", i11);
        jSONObject.put("code", i12);
        jSONObject.put("msg", str);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        AbstractC20887g.m109243u(i13, jSONObject2, m111894t, j11, m111889o);
    }

    /* renamed from: s */
    public static /* synthetic */ void m134835s(C21690e c21690e, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = -1;
        }
        if ((i13 & 4) != 0) {
            i12 = -1;
        }
        if ((i13 & 8) != 0) {
            str = "";
        }
        m134834r(c21690e, i11, i12, str);
    }

    /* renamed from: t */
    public static final void m134836t(C21690e c21690e, long j11, long j12, Exception exc) {
        int i11;
        String message;
        int i12;
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        if (c21690e.m111899y()) {
            i11 = 18877;
        } else {
            i11 = 18876;
        }
        long j13 = j11 + j12;
        if (exc == null) {
            AbstractC20887g.m109247y(i11, j11, j13, j12);
            return;
        }
        if (exc instanceof BackupRestoreMediaException) {
            BackupRestoreMediaException backupRestoreMediaException = (BackupRestoreMediaException) exc;
            i12 = backupRestoreMediaException.m37267a();
            message = backupRestoreMediaException.m37268b();
        } else {
            message = exc.getMessage();
            i12 = ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP;
        }
        if (i12 != 2006 && i12 != 2007) {
            f124587a.m134839z(i11, i12, message, j11, j13, j12);
        }
    }

    /* renamed from: u */
    public static /* synthetic */ void m134837u(C21690e c21690e, long j11, long j12, Exception exc, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            exc = null;
        }
        m134836t(c21690e, j11, j12, exc);
    }

    /* renamed from: x */
    public static /* synthetic */ void m134838x(C26220b c26220b, int i11, boolean z11, int i12, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z11 = true;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        if ((i13 & 8) != 0) {
            str = null;
        }
        c26220b.m134845w(i11, z11, i12, str);
    }

    /* renamed from: z */
    private final void m134839z(int i11, int i12, String str, long j11, long j12, long j13) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i12);
        jSONObject.put("msg", str);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        AbstractC20887g.m109243u(i11, jSONObject2, j11, j12, j13);
    }

    /* renamed from: B */
    public final void m134840B(int i11, boolean z11, long j11) {
        int i12;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 11) {
                    i12 = -1;
                } else {
                    i12 = 18835;
                }
            } else {
                i12 = 18833;
            }
        } else {
            i12 = 18832;
        }
        if (i12 > -1) {
            long m134818a = m134818a();
            long j12 = m134818a - j11;
            if (z11) {
                AbstractC20887g.m109247y(i12, j11, m134818a, j12);
            } else {
                AbstractC20887g.m109239q(i12, j11, m134818a, j12);
            }
        }
    }

    /* renamed from: C */
    public final void m134841C(long j11, long j12, int i11) {
        long j13 = j12 - j11;
        if (i11 == 0) {
            AbstractC20887g.m109247y(18880, j11, j12, j13);
        } else {
            m134839z(18880, i11, "", j11, j12, j13);
        }
    }

    /* renamed from: D */
    public final void m134842D(boolean z11, int i11, String str) {
        int i12;
        AbstractC19074t.m100208f(str, "errorMsg");
        if (z11) {
            i12 = 17759;
        } else {
            i12 = 17758;
        }
        if (i11 == 0 && str.length() <= 0) {
            AbstractC20887g.m109217D(i12, null, 2, null);
        } else {
            m134815A(this, i12, i11, str, 0L, 0L, 0L, 56, null);
        }
    }

    /* renamed from: q */
    public final void m134843q(boolean z11) {
        int i11;
        if (z11) {
            i11 = 11724;
        } else {
            i11 = 11725;
        }
        AbstractC20887g.m109217D(i11, null, 2, null);
    }

    /* renamed from: v */
    public final void m134844v(int i11, C21690e c21690e) {
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        int i16 = 2;
        if (C22447s.m116021W(i11)) {
            if (i11 != 1) {
                if (i11 != 16) {
                    if (i11 != 19) {
                        if (i11 != 21) {
                            return;
                        } else {
                            i12 = 2;
                        }
                    } else {
                        i12 = 1;
                    }
                } else {
                    i12 = 3;
                }
            } else {
                i12 = 4;
            }
            i13 = 1504600;
        } else {
            i12 = -1;
            i13 = -1;
        }
        if (!C22447s.m116024a0(i11) && i11 != 3) {
            i14 = i13;
        } else {
            if (i11 != 3 && i11 != 17) {
                if (i11 != 18) {
                    return;
                } else {
                    i16 = 1;
                }
            }
            i12 = i16;
            i14 = 1504610;
        }
        if (i14 != -1) {
            long m3361Q5 = AbstractC0924m0.m3361Q5();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source", i12);
            if (c21690e.m143172f()) {
                C26675a.m136891O(C26675a.f126213a, i14, jSONObject.toString(), m3361Q5, 0L, 8, null);
                return;
            }
            C21689d m111895u = c21690e.m111895u();
            if (m111895u != null) {
                i15 = m111895u.m143140a();
            } else {
                i15 = -1;
            }
            C21689d m111895u2 = c21690e.m111895u();
            if (m111895u2 != null) {
                str = m111895u2.m143141b();
            } else {
                str = null;
            }
            C26675a.m136890L(C26675a.f126213a, i14, i15, str, jSONObject, m3361Q5, 0L, 32, null);
        }
    }

    /* renamed from: w */
    public final void m134845w(int i11, boolean z11, int i12, String str) {
        int i13;
        int i14;
        switch (i11) {
            case 1:
                if (z11) {
                    i13 = 18804;
                } else {
                    i13 = 18805;
                }
                i14 = i13;
                break;
            case 2:
            case 6:
            case 10:
            case 15:
            default:
                i14 = -1;
                break;
            case 3:
                if (z11) {
                    i13 = 18808;
                } else {
                    i13 = 18809;
                }
                i14 = i13;
                break;
            case 4:
                if (z11) {
                    i13 = 18810;
                } else {
                    i13 = 18811;
                }
                i14 = i13;
                break;
            case 5:
                if (z11) {
                    i13 = 18812;
                } else {
                    i13 = 18813;
                }
                i14 = i13;
                break;
            case 7:
                if (z11) {
                    i13 = 18816;
                } else {
                    i13 = 18817;
                }
                i14 = i13;
                break;
            case 8:
                if (z11) {
                    i13 = 18818;
                } else {
                    i13 = 18819;
                }
                i14 = i13;
                break;
            case 9:
                if (z11) {
                    i13 = 18820;
                } else {
                    i13 = 18821;
                }
                i14 = i13;
                break;
            case 11:
                if (z11) {
                    i13 = 18824;
                } else {
                    i13 = 18825;
                }
                i14 = i13;
                break;
            case 12:
                i14 = 18826;
                break;
            case 13:
                i14 = 18827;
                break;
            case 14:
                i14 = 18828;
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                i14 = 18831;
                break;
        }
        if (i14 > -1) {
            if (z11) {
                AbstractC20887g.m109217D(i14, null, 2, null);
            } else {
                m134815A(this, i14, i12, str, 0L, 0L, 0L, 56, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m134846y(int i11, int i12, int i13, String str) {
        int i14;
        int i15;
        if (C22447s.m116021W(i11)) {
            if (i12 != 9) {
                if (i12 == 11) {
                    i14 = 1504603;
                }
            } else {
                i14 = 1504601;
            }
            if (!C22447s.m116024a0(i11) || i11 == 3) {
                if (i12 == 3) {
                    if (i12 == 4) {
                        i15 = 1504612;
                    }
                } else {
                    i15 = 1504611;
                }
                if (i15 > -1) {
                    C26675a.m136890L(C26675a.f126213a, i15, i13, str, null, 0L, 0L, 56, null);
                    return;
                }
                return;
            }
            i15 = i14;
            if (i15 > -1) {
            }
        }
        i14 = -1;
        if (!C22447s.m116024a0(i11)) {
        }
        if (i12 == 3) {
        }
        if (i15 > -1) {
        }
    }
}
