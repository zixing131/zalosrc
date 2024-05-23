package com.zing.zalo.p062db.zadb;

import am.InterfaceC0947y;
import am.InterfaceC0949z;
import com.zing.zalo.p062db.SQLiteDatabase;
import com.zing.zalo.p062db.SQLiteException;
import com.zing.zalo.p062db.zadb.InterfaceC7968a;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import gm.C19490a;
import gm.C19491b;
import gm.C19493d;
import gm.C19494e;
import gm.C19496g;
import gm.C19497h;
import gm.C19498i;
import gm.C19499j;
import gm.C19505p;
import gm.C19506q;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.Vector;

/* loaded from: classes.dex */
public class Zadb {

    /* renamed from: k */
    public static Zadb f43387k;

    /* renamed from: l */
    private static InterfaceC7968a f43388l;

    /* renamed from: m */
    private static int f43389m;

    /* renamed from: d */
    private String f43393d;

    /* renamed from: e */
    private String f43394e;

    /* renamed from: f */
    private String f43395f;

    /* renamed from: j */
    private int f43399j;

    /* renamed from: a */
    public int f43390a = 1;

    /* renamed from: b */
    public int f43391b = 0;

    /* renamed from: c */
    public int f43392c = 0;

    /* renamed from: g */
    private boolean f43396g = false;

    /* renamed from: h */
    private int f43397h = 50;

    /* renamed from: i */
    private boolean f43398i = true;

    static {
        SQLiteDatabase.m41403I();
        f43387k = new Zadb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [am.y] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2, types: [am.y] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Throwable, com.zing.zalo.db.SQLiteException] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* renamed from: B */
    private void m42753B(InterfaceC0947y e11) {
        System.currentTimeMillis();
        boolean z11 = false;
        InterfaceC0949z interfaceC0949z = null;
        try {
            try {
                interfaceC0949z = e11.mo2777u(String.format("SELECT * FROM sqlite_master where type='index' and tbl_name=\"%s\" and name=\"%s\"", "chat_content", "chatContent_currentUserId_idx"));
                boolean next = interfaceC0949z.next();
                if (!next) {
                    try {
                        e11.mo2845e();
                        e11.mo2857x(String.format("CREATE INDEX IF NOT EXISTS %s ON %s (%s)", "chatContent_currentUserId_idx", "chat_content", "currentUserUid"));
                        e11.mo2857x(String.format("CREATE INDEX IF NOT EXISTS %s ON %s (%s)", "chatContent_ownerId_idx", "chat_content", "ownerId"));
                        e11.mo2849k();
                    } catch (Exception e12) {
                        e = e12;
                        z11 = next;
                        AbstractC20110a.m104539h(e);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("MAKE INDEX: FAIL - ");
                        sb2.append(e.getMessage());
                        e11 = e11;
                        if (!z11) {
                            try {
                                e11.mo2850l();
                                e11 = e11;
                            } catch (SQLiteException e13) {
                                AbstractC20110a.m104539h(e13);
                                e11 = e13;
                            }
                        }
                        if (interfaceC0949z == null) {
                            return;
                        }
                        interfaceC0949z.close();
                    } catch (Throwable th2) {
                        th = th2;
                        z11 = next;
                        if (!z11) {
                            try {
                                e11.mo2850l();
                            } catch (SQLiteException e14) {
                                AbstractC20110a.m104539h(e14);
                            }
                        }
                        if (interfaceC0949z != null) {
                            try {
                                interfaceC0949z.close();
                                throw th;
                            } catch (Exception unused) {
                                throw th;
                            }
                        }
                        throw th;
                    }
                }
                if (!next) {
                    try {
                        e11.mo2850l();
                    } catch (SQLiteException e15) {
                        e11 = e15;
                        AbstractC20110a.m104539h(e11);
                    }
                }
            } catch (Exception e16) {
                e = e16;
            }
            try {
                interfaceC0949z.close();
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: E */
    public static synchronized void m42754E(InterfaceC7968a interfaceC7968a) {
        synchronized (Zadb.class) {
            f43388l = interfaceC7968a;
        }
    }

    static native String backupDBTask(int i11, int[] iArr, boolean[] zArr, String str, String str2, String str3, int i12, long j11, float f11, float f12, long j12, long j13, ZdbApiCode zdbApiCode);

    static native boolean cleanOldMsg(int i11, boolean z11, int i12, long j11, ZdbApiCode zdbApiCode);

    static native int countMediaWithType(int i11, boolean z11, int i12, int[] iArr, int i13, long j11, long j12, ZdbApiCode zdbApiCode);

    static native int countTotalMsg(int i11, boolean z11, byte[] bArr, byte[] bArr2, ZdbApiCode zdbApiCode);

    static native int countTotalMsgLessThan(int i11, boolean z11, long j11, int i12, ZdbApiCode zdbApiCode);

    static native int countTotalMsgOfOtherUser(int i11, int i12, boolean z11, ZdbApiCode zdbApiCode);

    static native int countUnreadMsg(int i11, boolean z11, int i12, byte[] bArr, ZdbApiCode zdbApiCode);

    static native boolean delMsg(int i11, boolean z11, int i12, byte[] bArr, ZdbApiCode zdbApiCode);

    static native boolean deleteMsgs(int i11, boolean z11, int i12, byte[] bArr, ZdbApiCode zdbApiCode);

    static native int deleteThread(int i11, boolean z11, int i12, ZdbApiCode zdbApiCode);

    static native int generateSearchChatFromDB(int i11, int i12, boolean z11, String str, String str2, ZdbApiCode zdbApiCode);

    static native byte[] getAllCallSuccess(int i11, boolean z11, int i12, int i13, ZdbApiCode zdbApiCode);

    static native byte[] getAllMediaForBackupGoogle(int i11, boolean z11, ZdbApiCode zdbApiCode);

    static native byte[] getChatContent(int i11, boolean z11, byte[] bArr, byte[] bArr2, byte[] bArr3, int i12, int i13, ZdbApiCode zdbApiCode);

    static native byte[] getChatContentAroundValue(int i11, boolean z11, int i12, byte[] bArr, int i13, ZdbApiCode zdbApiCode);

    static native byte[] getChatContentByINConds(int i11, boolean z11, int i12, byte[] bArr, ZdbApiCode zdbApiCode);

    static native byte[] getChatContentByMsgIds(int i11, boolean z11, int i12, byte[] bArr, ZdbApiCode zdbApiCode);

    static native byte[] getExpireChats(int i11, boolean z11, int i12, long j11, ZdbApiCode zdbApiCode);

    static native byte[] getMediaForBackupGoogleByThread(int i11, int i12, boolean z11, int[] iArr, int[] iArr2, int i13, int i14, int i15, byte[] bArr, long j11, byte[] bArr2, byte[] bArr3, int i16, byte[] bArr4, ZdbApiCode zdbApiCode);

    static native byte[] getMediaOfOtherUser(int i11, int i12, boolean z11, long[] jArr, int i13, int i14, ZdbApiCode zdbApiCode);

    static native byte[] getMediaStatistic(int i11, boolean z11, int i12, int i13, ZdbApiCode zdbApiCode);

    static native byte[] getMediaWithType(int i11, boolean z11, int i12, int[] iArr, int i13, long j11, long j12, int i14, int i15, int i16, ZdbApiCode zdbApiCode);

    static native byte[] getMsgWithMinMaxMsgId(int i11, boolean z11, int i12, boolean z12, ZdbApiCode zdbApiCode);

    static native byte[] getNewestMsgsInAllDB(int i11, int[] iArr, boolean[] zArr, ZdbApiCode zdbApiCode);

    static native byte[] getSentMsgOlderThanMsgId(int i11, boolean z11, int i12, long j11, long j12, boolean z12, int i13, int i14, ZdbApiCode zdbApiCode);

    static native byte[] getUidThreadOfOtherUser(int i11, ZdbApiCode zdbApiCode);

    static native byte[] getUidThreads(int i11, ZdbApiCode zdbApiCode);

    static native int insertChatContent(byte[] bArr, boolean z11, ZdbApiCode zdbApiCode);

    static native byte[] insertChats(byte[] bArr, boolean z11, ZdbApiCode zdbApiCode);

    static native boolean isMigrating();

    static native int isStrangerConversation(int i11, int i12, ZdbApiCode zdbApiCode);

    /* renamed from: j */
    public static int m42755j(int i11, int i12, boolean z11, String str, String str2, ZdbApiCode zdbApiCode) {
        return generateSearchChatFromDB(i11, i12, z11, str, str2, zdbApiCode);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void logCallback(int i11, int i12, String str, int i13, int i14, int i15, String str2, long j11, long j12, int i16, String str3, boolean z11, int i17) {
        int i18;
        InterfaceC7968a interfaceC7968a;
        if (i13 == 0) {
            try {
                i18 = f43389m;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            synchronized (Zadb.class) {
                interfaceC7968a = f43388l;
            }
            if (interfaceC7968a == null) {
                return;
            }
            InterfaceC7968a.a aVar = InterfaceC7968a.a.DBLOG_TYPE_QOS;
            if (i11 == aVar.f43411p) {
                interfaceC7968a.mo42736a(aVar, i12, str, i18, i14, i15, str2, j11, j12, i16, str3, z11, i17);
                return;
            }
            if (i11 == InterfaceC7968a.a.DBLOG_TYPE_BACKUP_PROGRESS.f43411p) {
                interfaceC7968a.mo42736a(InterfaceC7968a.a.values()[i11 - 1], i12, str, i18, 19700, 0, str2, j11, 0L, i16, str3, z11, i17);
                return;
            } else if (i11 == InterfaceC7968a.a.DBLOG_TYPE_LOG.f43411p) {
                interfaceC7968a.mo42736a(InterfaceC7968a.a.values()[i11 - 1], i12, str, i18, i14, i15, str2, j11, 0L, i16, str3, z11, i17);
                return;
            } else {
                interfaceC7968a.mo42736a(InterfaceC7968a.a.values()[i11 - 1], 0, str, i18, 19700, 0, str2, j11, 0L, 0, str3, z11, i17);
                return;
            }
        }
        i18 = i13;
        synchronized (Zadb.class) {
        }
    }

    static native int logout();

    static native int migrateDB(int i11, int i12, long j11, boolean z11);

    static native int restoreDB(int i11, int[] iArr, boolean[] zArr, String str, String str2, String str3, boolean z11, ZdbApiCode zdbApiCode, boolean z12);

    static native int setDBConf(int i11, String str, String str2, String str3, int i12, int i13, int i14, int i15, boolean z11, boolean z12, String str4, boolean z13, int i16);

    static native int setLogLevel(int i11, boolean z11);

    static native boolean updateChatAttach(int i11, boolean z11, int i12, byte[] bArr, int i13, byte[] bArr2, ZdbApiCode zdbApiCode);

    static native int updateChatMessage(int i11, boolean z11, int i12, byte[] bArr, byte[] bArr2, byte[] bArr3, ZdbApiCode zdbApiCode);

    static native int updateChatMsg(byte[] bArr, byte[] bArr2, byte[] bArr3, ZdbApiCode zdbApiCode);

    static native boolean updateDLStatusRollForevertoRoll(int i11, boolean z11, ZdbApiCode zdbApiCode);

    static native int updateExtraMsgData(int i11, boolean z11, int i12, String str, byte[] bArr, ZdbApiCode zdbApiCode);

    static native int updateMsg(int i11, boolean z11, int i12, byte[] bArr, byte[] bArr2, byte[] bArr3, ZdbApiCode zdbApiCode);

    static native int updateMsgByMsgIds(int i11, boolean z11, int i12, byte[] bArr, byte[] bArr2, ZdbApiCode zdbApiCode);

    static native boolean updateMsgStatus(int i11, boolean z11, int i12, byte[] bArr, int i13, int i14, ZdbApiCode zdbApiCode);

    static native int updateProperty(int i11, boolean z11, int i12, byte[] bArr, byte[] bArr2, ZdbApiCode zdbApiCode);

    static native int updateQuote(int i11, boolean z11, int i12, byte[] bArr, byte[] bArr2, ZdbApiCode zdbApiCode);

    static native boolean updateReactionState(int i11, boolean z11, int i12, boolean z12, byte[] bArr, ZdbApiCode zdbApiCode);

    /* renamed from: A */
    public int m42756A() {
        return logout();
    }

    /* renamed from: C */
    public int m42757C(int i11, int[] iArr, boolean[] zArr, String str, String str2, String str3, boolean z11, ZdbApiCode zdbApiCode, boolean z12) {
        return restoreDB(i11, iArr, zArr, str, str2, str3, z11, zdbApiCode, z12);
    }

    /* renamed from: D */
    public void m42758D(int i11, String str, String str2, boolean z11, int i12, int i13, boolean z12, int i14, boolean z13, boolean z14, String str3, boolean z15, int i15) {
        this.f43393d = str;
        this.f43394e = new File(this.f43393d).getParent();
        this.f43395f = str2;
        this.f43398i = z12;
        f43389m = i11;
        this.f43396g = z11;
        this.f43397h = i12;
        this.f43399j = i13;
        setLogLevel(i13, true);
        int i16 = f43389m;
        String str4 = this.f43393d;
        String str5 = this.f43394e;
        String str6 = this.f43395f;
        boolean z16 = this.f43396g;
        setDBConf(i16, str4, str5, str6, z16 ? 1 : 0, this.f43397h, this.f43398i ? 1 : 0, i14, z13, z14, str3, z15, i15);
    }

    /* renamed from: F */
    public int m42759F(InterfaceC0947y interfaceC0947y, long j11, boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("enable index: ");
        sb2.append(this.f43396g);
        if (this.f43396g) {
            File file = new File(this.f43393d);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Make index: ");
            sb3.append(this.f43393d);
            if (!file.exists()) {
                return -2;
            }
            int parseInt = Integer.parseInt(String.valueOf((file.length() / 1024) / 1024));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("OldDBSize=");
            sb4.append(parseInt);
            sb4.append("MB/");
            sb4.append(this.f43397h);
            sb4.append("MB");
            if (parseInt > this.f43397h) {
                m42753B(interfaceC0947y);
            }
        }
        int migrateDB = migrateDB(this.f43391b, this.f43392c, j11, z11);
        StringBuilder sb5 = new StringBuilder();
        sb5.append("jni migrateDB=");
        sb5.append(migrateDB);
        return migrateDB;
    }

    /* renamed from: G */
    public boolean m42760G(int i11, boolean z11, int i12, Vector vector, int i13, C19497h c19497h, ZdbApiCode zdbApiCode) {
        return updateChatAttach(i11, z11, i12, C19490a.m101919e(vector), i13, c19497h.m101941a(), zdbApiCode);
    }

    /* renamed from: H */
    public int m42761H(int i11, boolean z11, int i12, C19490a c19490a, C19494e c19494e, C19494e c19494e2, ZdbApiCode zdbApiCode) {
        return updateChatMessage(i11, z11, i12, c19490a.m101923d(), c19494e.m101936b(), c19494e2.m101936b(), zdbApiCode);
    }

    /* renamed from: I */
    public int m42762I(C19490a c19490a, C19494e c19494e, C19494e c19494e2, ZdbApiCode zdbApiCode) {
        return updateChatMsg(c19490a.m101923d(), c19494e.m101936b(), c19494e2.m101936b(), zdbApiCode);
    }

    /* renamed from: J */
    public boolean m42763J(int i11, boolean z11, ZdbApiCode zdbApiCode) {
        return updateDLStatusRollForevertoRoll(i11, z11, zdbApiCode);
    }

    /* renamed from: K */
    public int m42764K(int i11, boolean z11, int i12, String str, C19497h c19497h, ZdbApiCode zdbApiCode) {
        return updateExtraMsgData(i11, z11, i12, str, c19497h.m101941a(), zdbApiCode);
    }

    /* renamed from: L */
    public int m42765L(int i11, boolean z11, int i12, C19493d c19493d, C19494e c19494e, C19494e c19494e2, ZdbApiCode zdbApiCode) {
        return updateMsg(i11, z11, i12, c19493d.m101934a(), c19494e.m101936b(), c19494e2.m101936b(), zdbApiCode);
    }

    /* renamed from: M */
    public int m42766M(int i11, boolean z11, int i12, C19493d c19493d, C19498i c19498i, ZdbApiCode zdbApiCode) {
        return updateMsgByMsgIds(i11, z11, i12, c19493d.m101934a(), c19498i.m101945d(), zdbApiCode);
    }

    /* renamed from: N */
    public boolean m42767N(int i11, boolean z11, int i12, C19498i c19498i, byte b11, byte b12, ZdbApiCode zdbApiCode) {
        return updateMsgStatus(i11, z11, i12, c19498i.m101945d(), b11, b12, zdbApiCode);
    }

    /* renamed from: O */
    public int m42768O(int i11, boolean z11, int i12, C19490a.f fVar, C19497h c19497h, ZdbApiCode zdbApiCode) {
        return updateProperty(i11, z11, i12, fVar.m101924a(), c19497h.m101941a(), zdbApiCode);
    }

    /* renamed from: P */
    public int m42769P(int i11, boolean z11, int i12, C19490a.g gVar, C19497h c19497h, ZdbApiCode zdbApiCode) {
        return updateQuote(i11, z11, i12, gVar.m101925a(), c19497h.m101941a(), zdbApiCode);
    }

    /* renamed from: Q */
    public boolean m42770Q(int i11, boolean z11, int i12, boolean z12, C19498i c19498i, ZdbApiCode zdbApiCode) {
        return updateReactionState(i11, z11, i12, z12, c19498i.m101945d(), zdbApiCode);
    }

    /* renamed from: a */
    public String m42771a(int i11, int[] iArr, boolean[] zArr, String str, String str2, String str3, int i12, long j11, float f11, float f12, long j12, long j13, ZdbApiCode zdbApiCode) {
        return backupDBTask(i11, iArr, zArr, str, str2, str3, i12, j11, f11, f12, j12, j13, zdbApiCode);
    }

    /* renamed from: b */
    public int m42772b(int i11, boolean z11, int i12, int[] iArr, int i13, long j11, long j12, ZdbApiCode zdbApiCode) {
        return countMediaWithType(i11, z11, i12, iArr, i13, j11, j12, zdbApiCode);
    }

    /* renamed from: c */
    public int m42773c(int i11, boolean z11, ZdbApiCode zdbApiCode) {
        return countTotalMsg(i11, z11, new C19494e().m101936b(), new C19494e().m101936b(), zdbApiCode);
    }

    /* renamed from: d */
    public int m42774d(int i11, boolean z11, long j11, int i12, ZdbApiCode zdbApiCode) {
        return countTotalMsgLessThan(i11, z11, j11, i12, zdbApiCode);
    }

    /* renamed from: e */
    public int m42775e(int i11, int i12, boolean z11, ZdbApiCode zdbApiCode) {
        return countTotalMsgOfOtherUser(i11, i12, z11, zdbApiCode);
    }

    /* renamed from: f */
    public int m42776f(int i11, boolean z11, int i12, C19494e c19494e, ZdbApiCode zdbApiCode) {
        return countUnreadMsg(i11, z11, i12, c19494e.m101936b(), zdbApiCode);
    }

    /* renamed from: g */
    public boolean m42777g(int i11, boolean z11, int i12, C19497h c19497h, ZdbApiCode zdbApiCode) {
        return delMsg(i11, z11, i12, c19497h.m101941a(), zdbApiCode);
    }

    /* renamed from: h */
    public boolean m42778h(int i11, boolean z11, int i12, C19498i c19498i, ZdbApiCode zdbApiCode) {
        return deleteMsgs(i11, z11, i12, c19498i.m101945d(), zdbApiCode);
    }

    /* renamed from: i */
    public int m42779i(int i11, boolean z11, int i12, ZdbApiCode zdbApiCode) {
        return deleteThread(i11, z11, i12, zdbApiCode);
    }

    /* renamed from: k */
    public C19491b m42780k(int i11, boolean z11, int i12, int i13, ZdbApiCode zdbApiCode) {
        byte[] allCallSuccess = getAllCallSuccess(i11, z11, i12, i13, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(allCallSuccess);
        return c19491b;
    }

    /* renamed from: l */
    public C19491b m42781l(int i11, boolean z11, ZdbApiCode zdbApiCode) {
        byte[] allMediaForBackupGoogle = getAllMediaForBackupGoogle(i11, z11, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(allMediaForBackupGoogle);
        return c19491b;
    }

    /* renamed from: m */
    public C19491b m42782m(int i11, boolean z11, int i12, C19498i c19498i, ZdbApiCode zdbApiCode) {
        byte[] chatContentByMsgIds = getChatContentByMsgIds(i11, z11, i12, c19498i.m101945d(), zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(chatContentByMsgIds);
        return c19491b;
    }

    /* renamed from: n */
    public C19491b m42783n(int i11, boolean z11, C19494e c19494e, C19494e c19494e2, C19499j c19499j, int i12, int i13, ZdbApiCode zdbApiCode) {
        byte[] chatContent = getChatContent(i11, z11, c19494e.m101936b(), c19494e2.m101936b(), c19499j.m101947b(), i12, i13, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(chatContent);
        return c19491b;
    }

    /* renamed from: o */
    public C19491b m42784o(int i11, boolean z11, int i12, long j11, ZdbApiCode zdbApiCode) {
        byte[] expireChats = getExpireChats(i11, z11, i12, j11, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(expireChats);
        return c19491b;
    }

    /* renamed from: p */
    public C19491b m42785p(int i11, int i12, boolean z11, int[] iArr, int[] iArr2, int i13, int i14, int i15, C19494e.a aVar, long j11, C19494e.a aVar2, C19498i c19498i, int i16, C19499j c19499j, ZdbApiCode zdbApiCode) {
        C19494e c19494e = new C19494e();
        c19494e.m101935a(aVar);
        C19494e c19494e2 = new C19494e();
        c19494e2.m101935a(aVar2);
        byte[] mediaForBackupGoogleByThread = getMediaForBackupGoogleByThread(i11, i12, z11, iArr, iArr2, i13, i14, i15, c19494e.m101936b(), j11, c19494e2.m101936b(), c19498i.m101945d(), i16, c19499j.m101947b(), zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(mediaForBackupGoogleByThread);
        return c19491b;
    }

    /* renamed from: q */
    public C19491b m42786q(int i11, int i12, boolean z11, long[] jArr, int i13, int i14, ZdbApiCode zdbApiCode) {
        byte[] mediaOfOtherUser = getMediaOfOtherUser(i11, i12, z11, jArr, i13, i14, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(mediaOfOtherUser);
        return c19491b;
    }

    /* renamed from: r */
    public C19496g m42787r(int i11, boolean z11, int i12, int i13, ZdbApiCode zdbApiCode) {
        byte[] mediaStatistic = getMediaStatistic(i11, z11, i12, i13, zdbApiCode);
        C19496g c19496g = new C19496g();
        c19496g.m101938a(mediaStatistic);
        return c19496g;
    }

    /* renamed from: s */
    public C19491b m42788s(int i11, boolean z11, int i12, int[] iArr, int i13, long j11, long j12, int i14, int i15, int i16, ZdbApiCode zdbApiCode) {
        byte[] mediaWithType = getMediaWithType(i11, z11, i12, iArr, i13, j11, j12, i14, i15, i16, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(mediaWithType);
        return c19491b;
    }

    /* renamed from: t */
    public C19490a m42789t(int i11, boolean z11, int i12, boolean z12, ZdbApiCode zdbApiCode) {
        byte[] msgWithMinMaxMsgId = getMsgWithMinMaxMsgId(i11, z11, i12, z12, zdbApiCode);
        C19490a c19490a = new C19490a();
        c19490a.m101921b(msgWithMinMaxMsgId);
        return c19490a;
    }

    /* renamed from: u */
    public C19491b m42790u(int i11, int[] iArr, boolean[] zArr, ZdbApiCode zdbApiCode) {
        byte[] newestMsgsInAllDB = getNewestMsgsInAllDB(i11, iArr, zArr, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(newestMsgsInAllDB);
        return c19491b;
    }

    /* renamed from: v */
    public C19491b m42791v(int i11, boolean z11, int i12, long j11, long j12, boolean z12, int i13, int i14, ZdbApiCode zdbApiCode) {
        byte[] sentMsgOlderThanMsgId = getSentMsgOlderThanMsgId(i11, z11, i12, j11, j12, z12, i13, i14, zdbApiCode);
        C19491b c19491b = new C19491b();
        c19491b.m101927b(sentMsgOlderThanMsgId);
        return c19491b;
    }

    /* renamed from: w */
    public C19505p m42792w(int i11, ZdbApiCode zdbApiCode) {
        byte[] uidThreads = getUidThreads(i11, zdbApiCode);
        C19505p c19505p = new C19505p();
        c19505p.m101958a(uidThreads);
        return c19505p;
    }

    /* renamed from: x */
    public int m42793x(C19490a c19490a, boolean z11, ZdbApiCode zdbApiCode) {
        return insertChatContent(c19490a.m101923d(), z11, zdbApiCode);
    }

    /* renamed from: y */
    public C19506q m42794y(C19491b c19491b, boolean z11, ZdbApiCode zdbApiCode) {
        byte[] insertChats = insertChats(c19491b.m101930e(), z11, zdbApiCode);
        C19506q c19506q = new C19506q();
        c19506q.m101961a(insertChats);
        return c19506q;
    }

    /* renamed from: z */
    public int m42795z(int i11, int i12, ZdbApiCode zdbApiCode) {
        return isStrangerConversation(i11, i12, zdbApiCode);
    }
}
