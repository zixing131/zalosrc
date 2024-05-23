package com.zing.zalo.p062db;

import ag0.AbstractC0837p0;
import ag0.C0822i;
import am.AbstractC0924m0;
import am.InterfaceC0947y;
import am.RunnableC0940u0;
import android.os.Build;
import android.os.Bundle;
import androidx.work.AbstractC2151i0;
import androidx.work.C2142e;
import androidx.work.C2256x;
import androidx.work.EnumC2242k;
import bj.AbstractC2819c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p062db.C7967l;
import com.zing.zalo.p062db.zadb.InterfaceC7968a;
import com.zing.zalo.p062db.zadb.Zadb;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalo.p077ui.zdb.ZdbMigrateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fm0.AbstractC19026c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import gm.C19505p;
import gw.C19669z;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20128b;
import java.io.File;
import java.util.concurrent.TimeUnit;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.AbstractC23138m0;
import me0.AbstractC23160o0;
import me0.AbstractC23238v2;
import oh0.C24267b;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p173fz.C19172a;
import p227i3.C20215s;
import p248iy.AbstractC20887g;
import p248iy.C20882b;
import p363nh.C23744a;
import p371nv.C23952g;
import p387oc.HandlerThreadC24218v;
import p405ov.C24559a;
import p542ub.InterfaceC27218a;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p645xh.C29628e;
import p716zh.C32034n6;
import pm0.AbstractC24845f;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;
import si.C26263i;

/* renamed from: com.zing.zalo.db.l */
/* loaded from: classes.dex */
public final class C7967l implements InterfaceC7968a {
    public static final d Companion = new d(null);

    /* renamed from: k */
    private static int f43370k = Integer.MIN_VALUE;

    /* renamed from: l */
    private static final InterfaceC29232g f43371l = AbstractC29233h.m145990a(a.f43384q);

    /* renamed from: m */
    private static final InterfaceC24854k f43372m;

    /* renamed from: n */
    private static final InterfaceC24854k f43373n;

    /* renamed from: a */
    private long f43374a;

    /* renamed from: b */
    private boolean f43375b;

    /* renamed from: c */
    private boolean f43376c;

    /* renamed from: d */
    private boolean f43377d;

    /* renamed from: e */
    private long f43378e;

    /* renamed from: f */
    private boolean f43379f;

    /* renamed from: g */
    private boolean f43380g;

    /* renamed from: h */
    private boolean f43381h;

    /* renamed from: i */
    private int f43382i;

    /* renamed from: j */
    private boolean f43383j;

    /* renamed from: com.zing.zalo.db.l$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f43384q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7967l mo12V4() {
            return new C7967l(null);
        }
    }

    /* renamed from: com.zing.zalo.db.l$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f43385q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo12V4() {
            boolean z11 = false;
            if (C19172a.m100600k("react_db@remove_old_db", 0) > 0) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: com.zing.zalo.db.l$c */
    /* loaded from: classes.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f43386q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC20130d.m104837J(null, true) + "Native/LogSocket/";
        }
    }

    /* renamed from: com.zing.zalo.db.l$d */
    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final boolean m42747e() {
            return ((Boolean) C7967l.f43372m.getValue()).booleanValue();
        }

        /* renamed from: b */
        public final C7967l m42748b() {
            return (C7967l) C7967l.f43371l.getValue();
        }

        /* renamed from: c */
        public final int m42749c() {
            return C7967l.f43370k;
        }

        /* renamed from: d */
        public final String m42750d() {
            return (String) C7967l.f43373n.getValue();
        }

        /* renamed from: f */
        public final void m42751f(ZdbApiCode zdbApiCode, String str, String... strArr) {
            String m131375W;
            AbstractC19074t.m100208f(zdbApiCode, "resultCode");
            AbstractC19074t.m100208f(str, "methodName");
            AbstractC19074t.m100208f(strArr, "params");
            if (zdbApiCode.error_code != 0) {
                m131375W = AbstractC25358n.m131375W(strArr, "|", "(", ")", 0, null, null, 56, null);
                C24559a.m127933c("[ZDB-ERROR]", str + m131375W + ": " + zdbApiCode);
            }
        }

        /* renamed from: g */
        public final void m42752g(String str, String str2) {
            AbstractC19074t.m100208f(str, "tag");
            C23952g.m125347l(4, 8, str, str2, null);
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(b.f43385q);
        f43372m = m129210a;
        m129210a2 = AbstractC24856m.m129210a(c.f43386q);
        f43373n = m129210a2;
    }

    public /* synthetic */ C7967l(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: C */
    private final boolean m42696C() {
        boolean m127120J;
        File[] listFiles = new File(Companion.m42750d()).listFiles();
        if (listFiles == null) {
            return false;
        }
        for (File file : listFiles) {
            if (file.isFile()) {
                String name = file.getName();
                AbstractC19074t.m100207e(name, "getName(...)");
                m127120J = AbstractC24341v.m127120J(name, "zdb_log_", false, 2, null);
                if (m127120J) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:            if (r0 == null) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:            r11 = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:            r11 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:            if (r0 == null) goto L32;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m42697D(int i11) {
        String str;
        File databasePath;
        String str2;
        boolean z11;
        String str3;
        String str4;
        boolean z12;
        int m116588k;
        File dataDir;
        f43370k = i11;
        this.f43382i = AbstractC0924m0.m3074G8();
        Zadb.m42754E(this);
        Zadb zadb = Zadb.f43387k;
        zadb.f43390a = 1;
        zadb.f43392c = 0;
        MainApplication.C6895a c6895a = MainApplication.Companion;
        File databasePath2 = c6895a.m35500c().getDatabasePath("zalo_x_1.db");
        if (databasePath2 != null) {
            if (!databasePath2.exists()) {
                databasePath2 = null;
            }
            if (databasePath2 != null) {
                str = databasePath2.getAbsolutePath();
                if (str == null) {
                    str = "";
                }
                databasePath = c6895a.m35500c().getDatabasePath(AbstractC2819c.m13619a(String.valueOf(i11)));
                if (databasePath != null) {
                    if (!databasePath.exists()) {
                        databasePath = null;
                    }
                    if (databasePath != null) {
                        str2 = databasePath.getAbsolutePath();
                        if (str2 == null) {
                            str2 = "";
                        }
                        z11 = !m42733H();
                        int m3016E8 = AbstractC0924m0.m3016E8();
                        if (Build.VERSION.SDK_INT >= 24) {
                            dataDir = c6895a.m35500c().getDataDir();
                            if (dataDir != null) {
                                str3 = dataDir.getAbsolutePath();
                            } else {
                                str3 = null;
                            }
                        } else {
                            File filesDir = c6895a.m35500c().getFilesDir();
                            if (filesDir != null) {
                                str3 = filesDir.getParent();
                            } else {
                                str3 = null;
                            }
                        }
                        if (C19172a.m100601l("features@databases@recover_corrupt", 0, 2, null) == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        m116588k = AbstractC22543l.m116588k(C19172a.m100600k("features@databases@recover_threshold", 50), 0, 100);
                        C24559a.m127933c("[ZDB]", "setConfig: " + i11 + ", dbChatPath=" + str + ", isCompleteMigrate=" + z11);
                        Zadb.f43387k.m42758D(i11, str, str2, AbstractC0924m0.m4229td(), AbstractC0924m0.m3045F8(), m3016E8, true, -1, AbstractC0924m0.m4403zd(), z11, str4, z12, m116588k);
                        if (z11) {
                            m42700L(i11);
                            return;
                        }
                        return;
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
                z11 = !m42733H();
                int m3016E82 = AbstractC0924m0.m3016E8();
                if (Build.VERSION.SDK_INT >= 24) {
                }
                if (C19172a.m100601l("features@databases@recover_corrupt", 0, 2, null) == 1) {
                }
                m116588k = AbstractC22543l.m116588k(C19172a.m100600k("features@databases@recover_threshold", 50), 0, 100);
                C24559a.m127933c("[ZDB]", "setConfig: " + i11 + ", dbChatPath=" + str + ", isCompleteMigrate=" + z11);
                Zadb.f43387k.m42758D(i11, str, str2, AbstractC0924m0.m4229td(), AbstractC0924m0.m3045F8(), m3016E82, true, -1, AbstractC0924m0.m4403zd(), z11, str4, z12, m116588k);
                if (z11) {
                }
            }
        }
        str = null;
        if (str == null) {
        }
        databasePath = c6895a.m35500c().getDatabasePath(AbstractC2819c.m13619a(String.valueOf(i11)));
        if (databasePath != null) {
        }
        str2 = null;
        if (str2 == null) {
        }
        z11 = !m42733H();
        int m3016E822 = AbstractC0924m0.m3016E8();
        if (Build.VERSION.SDK_INT >= 24) {
        }
        if (C19172a.m100601l("features@databases@recover_corrupt", 0, 2, null) == 1) {
        }
        m116588k = AbstractC22543l.m116588k(C19172a.m100600k("features@databases@recover_threshold", 50), 0, 100);
        C24559a.m127933c("[ZDB]", "setConfig: " + i11 + ", dbChatPath=" + str + ", isCompleteMigrate=" + z11);
        Zadb.f43387k.m42758D(i11, str, str2, AbstractC0924m0.m4229td(), AbstractC0924m0.m3045F8(), m3016E822, true, -1, AbstractC0924m0.m4403zd(), z11, str4, z12, m116588k);
        if (z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static final void m42698I() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: am.x0
            @Override // java.lang.Runnable
            public final void run() {
                C7967l.m42699J();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m42699J() {
        int i11;
        int i12;
        int i13 = -1;
        try {
            Zadb zadb = Zadb.f43387k;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            C19505p m42792w = zadb.m42792w(Integer.parseInt(str), new ZdbApiCode());
            if (m42792w != null) {
                i12 = m42792w.m101960c();
            } else {
                i12 = -1;
            }
            try {
                i13 = C19669z.Companion.m103232a().m103200Q().size();
            } catch (Exception e11) {
                i11 = i12;
                e = e11;
                try {
                    AbstractC20110a.f98889a.mo104552e(e);
                    i12 = i11;
                    AbstractC20110a.f98889a.mo104552e(new Exception("[ZDB] Migrate suspended over 3 times: " + CoreUtility.f89233i + " | numThread=" + i12 + "/" + i13));
                    AbstractC0924m0.m4184rs(true);
                } catch (Exception e12) {
                    AbstractC20110a.f98889a.mo104552e(e12);
                    return;
                }
            }
        } catch (Exception e13) {
            e = e13;
            i11 = -1;
        }
        AbstractC20110a.f98889a.mo104552e(new Exception("[ZDB] Migrate suspended over 3 times: " + CoreUtility.f89233i + " | numThread=" + i12 + "/" + i13));
        AbstractC0924m0.m4184rs(true);
    }

    /* renamed from: L */
    private final void m42700L(int i11) {
        C0822i.f2887p.m2150b(new Runnable() { // from class: am.c1
            @Override // java.lang.Runnable
            public final void run() {
                C7967l.m42701M();
            }
        });
        m42724s(i11);
        C7958c.Companion.m41593b();
        C24559a.m127933c("[ZDB]", "INITIALIZED: " + i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m42701M() {
        C7961f.b bVar = C7961f.Companion;
        bVar.m42657a();
        bVar.m42658b().m42654u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c6, code lost:            if (r13 != false) goto L18;     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m42702N(int i11, int i12, String str) {
        String str2;
        boolean z11;
        this.f43376c = false;
        long currentTimeMillis = System.currentTimeMillis() - this.f43374a;
        if (AbstractC19074t.m100204b(String.valueOf(i11), CoreUtility.f89233i)) {
            if (i12 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && i12 != 11) {
                ToastUtils.m89266n(AbstractC8020f0.str_syncmes_sync_fail, new Object[0]);
                if (!AbstractC0924m0.m4199sd()) {
                    AbstractC0924m0.m3854gs(true);
                    if (!AbstractC23238v2.m119726k()) {
                        AbstractC0924m0.m3824fs(false);
                        AbstractC0924m0.m3286Nh(false);
                        ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_full_sdcard_more_descriptive));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("MIGRATE FINISH - FORCE KILL: ");
                    sb2.append(i11);
                    sb2.append(" - result ");
                    sb2.append(i12);
                    sb2.append(" - extra: ");
                    sb2.append(str);
                    sb2.append(" - execTime: ");
                    sb2.append(currentTimeMillis / 1000);
                    str2 = C20215s.f99966b;
                    sb2.append(str2);
                    C24559a.m127933c("[ZDB]", sb2.toString());
                    AbstractC19444a.m101694b(new Runnable() { // from class: am.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7967l.m42703O();
                        }
                    }, 1000L);
                } else {
                    str2 = C20215s.f99966b;
                    C24559a.m127933c("[ZDB]", "MIGRATE FINISH - ERROR ACCEPTED: " + i11 + " - result " + i12 + " - extra: " + str + " - execTime: " + (currentTimeMillis / 1000) + str2);
                    AbstractC0924m0.m4094os(true);
                    C29628e.m147249E0().m147292u1();
                    C0822i.f2887p.m2150b(new Runnable() { // from class: am.z0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7967l.m42704P();
                        }
                    });
                    AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: am.a1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7967l.m42705Q();
                        }
                    });
                    m42700L(i11);
                }
            } else {
                str2 = C20215s.f99966b;
            }
        } else {
            str2 = C20215s.f99966b;
        }
        C23744a.Companion.m124119a().m124116d(6044, new Object[0]);
        C24559a.m127933c("[ZDB]", "MIGRATE FINISH: " + i11 + " - result " + i12 + " - execTime: " + (currentTimeMillis / 1000) + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static final void m42703O() {
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m42704P() {
        C7961f.Companion.m42661e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public static final void m42705Q() {
        C7959d.Companion.m41850e().m41822q3();
    }

    /* renamed from: R */
    private final void m42706R(int i11, boolean z11) {
        this.f43376c = true;
        this.f43374a = System.currentTimeMillis();
        this.f43381h = AbstractC0924m0.m4258ud();
        boolean m42734K = m42734K();
        if (m42734K) {
            C29628e.m147249E0().m147268V0();
        }
        AbstractC0924m0.m4266ul(true);
        AbstractC0924m0.m3974ks(true);
        AbstractC0924m0.m4034ms(z11);
        AbstractC0924m0.m4064ns(AbstractC0924m0.m3074G8() + 1);
        C24559a.m127933c("[ZDB]", "MIGRATE START " + i11 + " - show migrate screen: " + m42734K);
    }

    /* renamed from: S */
    private final void m42707S(String str, String str2, boolean z11) {
        String str3;
        if (AbstractC19074t.m100204b(str, CoreUtility.f89233i) && str2 != null) {
            if (z11) {
                str3 = "group_";
            } else {
                str3 = "";
            }
            String str4 = str3 + str2;
            C24559a.m127933c("[ZDB]", "onRenewDbByCorrupting " + str4);
            C7961f.Companion.m42658b().m42647M(str4);
        }
    }

    /* renamed from: U */
    private final void m42708U(InterfaceC0947y interfaceC0947y, boolean z11) {
        m42706R(f43370k, z11);
        Zadb.f43387k.m42759F(interfaceC0947y, C24267b.Companion.m126722a().mo126716g() + 86400000, z11);
    }

    /* renamed from: o */
    private final long m42722o(File file, String str) {
        String m129183b;
        File[] listFiles;
        long j11;
        boolean m127120J;
        try {
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return 0L;
            }
            long j12 = 0;
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.exists()) {
                    String name = file2.getName();
                    AbstractC19074t.m100207e(name, "getName(...)");
                    m127120J = AbstractC24341v.m127120J(name, str, false, 2, null);
                    if (m127120J) {
                        j11 = file2.length();
                        j12 += j11;
                    }
                }
                j11 = 0;
                j12 += j11;
            }
            return j12;
        } catch (Exception e11) {
            m129183b = AbstractC24845f.m129183b(e11);
            C24559a.m127933c("[ZDB]", "Calculate db size error " + str + ": " + m129183b);
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m42723r() {
        C23744a.Companion.m124119a().m124116d(6044, new Object[0]);
    }

    /* renamed from: s */
    private final void m42724s(final int i11) {
        if (AbstractC0924m0.m4137qb()) {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: am.t0
                @Override // java.lang.Runnable
                public final void run() {
                    C7967l.m42725t(i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m42725t(int i11) {
        boolean z11;
        try {
            try {
                z11 = HandlerThreadC24218v.Companion.m126302a();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104553f(e11, "[ZDB]", new Object[0]);
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC20887g.m109231i(str, 17553, "recovery fail: " + e11.getMessage(), 0L, 17500, CoreUtility.f89236l);
                z11 = false;
            }
            AbstractC0924m0.m4117pl(!z11);
            C24559a.m127933c("[ZDB]", "resetNewMessageData: " + i11 + " " + z11);
            if (z11) {
                AbstractC20887g.m109217D(17550, null, 2, null);
            } else {
                AbstractC20887g.m109244v(17550, null, 2, null);
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104553f(e12, "[ZDB]", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m42726x() {
        try {
            AbstractC19026c.m100084b(MainApplication.Companion.m35500c(), 0L);
            C20882b.Companion.m109143a();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: z */
    public static final C7967l m42727z() {
        return Companion.m42748b();
    }

    /* renamed from: A */
    public final boolean m42728A() {
        return this.f43379f;
    }

    /* renamed from: B */
    public final long m42729B() {
        return this.f43378e;
    }

    /* renamed from: E */
    public final void m42730E() {
        try {
            if (AbstractC23138m0.Companion.m118777d()) {
                synchronized (this) {
                    try {
                        String str = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str, "currentUserUid");
                        int parseInt = Integer.parseInt(str);
                        if (f43370k != parseInt) {
                            C7959d.Companion.m41850e();
                            m42697D(parseInt);
                            AbstractC0837p0.Companion.m2237f().mo2040a(new RunnableC0940u0(this));
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: F */
    public final boolean m42731F() {
        return this.f43375b;
    }

    /* renamed from: G */
    public final void m42732G() {
        InterfaceC29232g interfaceC29232g = f43371l;
        if (interfaceC29232g.mo9375b()) {
            d dVar = Companion;
            synchronized (dVar.m42748b()) {
                f43370k = Integer.MIN_VALUE;
                Zadb.f43387k.m42756A();
                Zadb.m42754E(null);
                interfaceC29232g.reset();
                C7956b.Companion.m41572a();
                C7958c.Companion.m41592a();
                C24559a.m127933c("[ZDB]", "logoutAPI");
                dVar.m42752g("[" + AbstractC23160o0.m119291t0(System.currentTimeMillis()) + "]", "Logout...\n");
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: H */
    public final boolean m42733H() {
        if (AbstractC23138m0.Companion.m118777d() && !AbstractC0924m0.m4345xd() && C7959d.Companion.m41850e().m41772b1()) {
            if (this.f43382i < 0) {
                this.f43382i = AbstractC0924m0.m3074G8();
            }
            if (this.f43382i < 6) {
                return true;
            }
            if (!AbstractC0924m0.m2905Ad() && !this.f43383j) {
                this.f43383j = true;
                AbstractC19444a.m101694b(new Runnable() { // from class: am.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7967l.m42698I();
                    }
                }, 1000L);
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m42734K() {
        if (m42733H() && !AbstractC0924m0.m3018Ea()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final void m42735T(InterfaceC27218a interfaceC27218a) {
        AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
        C29628e.m147249E0().m147268V0();
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        interfaceC27218a.mo35573l4(ZdbMigrateView.class, bundle, 0, true);
    }

    @Override // com.zing.zalo.p062db.zadb.InterfaceC7968a
    /* renamed from: a */
    public void mo42736a(InterfaceC7968a.a aVar, int i11, String str, int i12, int i13, int i14, String str2, long j11, long j12, int i15, String str3, boolean z11, int i16) {
        int i17;
        int i18;
        int i19;
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        if (i16 != 0) {
            if (i16 != 1) {
                return;
            }
            if (aVar == InterfaceC7968a.a.DBLOG_TYPE_QOS) {
                boolean z12 = i14 == 0;
                if (i13 == 21010) {
                    if (z12) {
                        AbstractC0924m0.m4004ls(true);
                        C7958c.Companion.m41593b().m41589p();
                    } else {
                        C24559a.m127933c("[ZDB]", "onEvent->migrate reaction errorCode=" + i14);
                    }
                }
                AbstractC20887g.m109221H(false, z12, i14, i13, 0, j12, "", j11, j11 + j12);
                if (i14 != 0 || z11) {
                    String str4 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str4, "currentUserUid");
                    AbstractC20887g.m109235m(i13, "{\"z\":" + str3 + "}", str4, i14, j12, CoreUtility.f89236l);
                    if (z11 || i13 == 21010) {
                        m42741w();
                    }
                }
            } else if (aVar == InterfaceC7968a.a.DBLOG_TYPE_LOG) {
                Companion.m42752g("Ext", "[" + i11 + "] [" + AbstractC23160o0.m119291t0(System.currentTimeMillis()) + "] " + str);
            }
        } else if (aVar == InterfaceC7968a.a.DBLOG_TYPE_QOS) {
            if (i13 == 19703) {
                if (i14 == 11) {
                    i19 = 3;
                } else if (AbstractC0924m0.m4199sd()) {
                    i19 = 2;
                } else {
                    i19 = this.f43381h ? 1 : 0;
                    i17 = i19;
                }
                i17 = i19;
            } else {
                i17 = 0;
            }
            AbstractC20887g.m109221H(false, i14 == 0, i14, i13, i17, j12, "", j11, j11 + j12);
            if (i14 != 0 || z11) {
                String str5 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str5, "currentUserUid");
                AbstractC20887g.m109235m(i13, "{\"z\":" + str3 + "}", str5, i14, j12, CoreUtility.f89236l);
                i18 = 19703;
                if (z11 || i13 == 19703) {
                    m42741w();
                }
            } else {
                i18 = 19703;
            }
            if (i13 == i18) {
                C24559a.m127933c("[ZDB]", "onEvent: qos_cmd = " + i13 + " | code: " + i14 + " | data: " + str2);
                m42702N(i12, i14, str2);
            }
        } else {
            if (aVar == InterfaceC7968a.a.DBLOG_TYPE_BACKUP_PROGRESS) {
                C26263i.m135055u().m135064B0(i15, str2);
                return;
            }
            if (aVar == InterfaceC7968a.a.DBLOG_TYPE_RENEW_ON_CORRUPT) {
                m42707S(String.valueOf(i12), str, AbstractC19074t.m100204b(str2, "1"));
                return;
            }
            if (aVar != InterfaceC7968a.a.DBLOG_TYPE_RESTORE_DECRYPT_PROGRESS && aVar != InterfaceC7968a.a.DBLOG_TYPE_RESTORE_DECOMPRESS_PROGRESS && aVar != InterfaceC7968a.a.DBLOG_TYPE_RESTORE_TO_DB_PROGRESS) {
                if (aVar == InterfaceC7968a.a.DBLOG_TYPE_LOG) {
                    Companion.m42752g("Main", "[" + i11 + "] [" + AbstractC23160o0.m119291t0(System.currentTimeMillis()) + "] " + str);
                    return;
                }
                return;
            }
            C26263i.m135055u().m135066C0(aVar, str, str2);
        }
    }

    /* renamed from: p */
    public final void m42737p() {
        C2142e m11513a;
        if (m42696C()) {
            if (Build.VERSION.SDK_INT >= 23) {
                m11513a = new C2142e.a().m11516d(true).m11513a();
            } else {
                m11513a = new C2142e.a().m11513a();
            }
            AbstractC2151i0.m11547h(MainApplication.Companion.m35500c()).m11554f("DeleteOldZdbLogFileWorker", EnumC2242k.KEEP, (C2256x) ((C2256x.a) ((C2256x.a) new C2256x.a(DeleteOldZdbLogFileWorker.class).m11872m(14L, TimeUnit.DAYS)).m11869j(m11513a)).m11863b());
            C24559a.m127933c("[ZDB]", "Schedule delete old ZDB log");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a8 A[Catch: all -> 0x00b9, Exception -> 0x01ba, TryCatch #2 {Exception -> 0x01ba, blocks: (B:36:0x0133, B:38:0x01a8, B:40:0x01c8, B:43:0x01d6, B:49:0x01bc, B:51:0x01c2), top: B:35:0x0133, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc A[Catch: all -> 0x00b9, Exception -> 0x01ba, TryCatch #2 {Exception -> 0x01ba, blocks: (B:36:0x0133, B:38:0x01a8, B:40:0x01c8, B:43:0x01d6, B:49:0x01bc, B:51:0x01c2), top: B:35:0x0133, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m42738q() {
        String num;
        Exception exc;
        boolean z11;
        boolean z12;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        String m129183b;
        long j16;
        long j17;
        long j18;
        boolean z13;
        ?? r92;
        String m129183b2;
        long j19;
        boolean m4316wd;
        boolean z14;
        boolean z15;
        long j21;
        if (m42733H() && !this.f43376c) {
            boolean z16 = !this.f43375b;
            this.f43375b = true;
            Integer valueOf = Integer.valueOf(f43370k);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            if (valueOf != null && (num = valueOf.toString()) != null) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    C23744a.Companion.m124119a().m124116d(6044, new Object[0]);
                } catch (Exception e11) {
                    exc = e11;
                    z11 = false;
                    z12 = true;
                    j11 = 0;
                }
                try {
                    if (!AbstractC0924m0.m4169rd()) {
                        File parentFile = new File(C7959d.Companion.m41850e().m41751T0().mo2856w()).getParentFile();
                        if (parentFile != null) {
                            j11 = m42722o(parentFile, "zalo_x_1.db");
                            try {
                                String m13619a = AbstractC2819c.m13619a(num);
                                AbstractC19074t.m100207e(m13619a, "getDbName(...)");
                                j12 = m42722o(parentFile, m13619a);
                                long j22 = j11 + j12 + 52428800;
                                try {
                                    long m104764k = C20128b.m104764k();
                                    long j23 = j22 - m104764k;
                                    if (j23 <= 10485760) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        try {
                                            C32034n6.Companion.m154508a().m154501e();
                                            long m104764k2 = C20128b.m104764k();
                                            long j24 = j22 - m104764k2;
                                            if (j24 > 10485760 && j12 > 262144000) {
                                                j24 -= j12;
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            if (j24 <= 10485760) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            long j25 = m104764k - m104764k2;
                                            m104764k = m104764k2;
                                            j23 = j24;
                                            j21 = j25;
                                        } catch (Exception e12) {
                                            exc = e12;
                                            j15 = j23;
                                            z11 = false;
                                            j14 = m104764k;
                                            j13 = 0;
                                            m129183b = AbstractC24845f.m129183b(exc);
                                            C24559a.m127933c("[ZDB]", "Check db storage error $: " + m129183b);
                                            j16 = j12;
                                            j17 = j15;
                                            j18 = j11;
                                            z13 = z12;
                                            r92 = z11;
                                            this.f43377d = z13;
                                            this.f43378e = j17;
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("full_storage", !this.f43377d ? 1 : 0);
                                            jSONObject.put("main_db", j18 / 1048576);
                                            jSONObject.put("extra_db", j16 / 1048576);
                                            jSONObject.put("free_storage", j14 / 1048576);
                                            jSONObject.put("skip_extra", (int) r92);
                                            jSONObject.put("cache_cleared", j13 / 1048576);
                                            jSONObject.put("resume", AbstractC0924m0.m4258ud() ? 1 : 0);
                                            jSONObject.put("retry", AbstractC0924m0.m4199sd() ? 1 : 0);
                                            String jSONObject2 = jSONObject.toString();
                                            AbstractC20887g.m109236n(19720, jSONObject2, null, 0, System.currentTimeMillis() - currentTimeMillis, 0, 44, null);
                                            C24559a.m127933c("[ZDB]", "Check migrate 19720: " + jSONObject2);
                                            if (!z13) {
                                            }
                                            this.f43375b = false;
                                            Runnable runnable = new Runnable() { // from class: am.b1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C7967l.m42723r();
                                                }
                                            };
                                            if (!z16) {
                                            }
                                            AbstractC19444a.m101694b(runnable, j19);
                                        }
                                    } else {
                                        z15 = false;
                                        j21 = 0;
                                    }
                                    j15 = j23;
                                    j14 = m104764k;
                                    j13 = j21;
                                    j16 = j12;
                                    j18 = j11;
                                    z13 = z12;
                                    z14 = z15;
                                    if (z13) {
                                        try {
                                            AbstractC0924m0.m3824fs(true);
                                        } catch (Exception e13) {
                                            exc = e13;
                                            z11 = z14 ? 1 : 0;
                                            z12 = z13;
                                            j11 = j18;
                                            j12 = j16;
                                            m129183b = AbstractC24845f.m129183b(exc);
                                            C24559a.m127933c("[ZDB]", "Check db storage error $: " + m129183b);
                                            j16 = j12;
                                            j17 = j15;
                                            j18 = j11;
                                            z13 = z12;
                                            r92 = z11;
                                            this.f43377d = z13;
                                            this.f43378e = j17;
                                            JSONObject jSONObject3 = new JSONObject();
                                            jSONObject3.put("full_storage", !this.f43377d ? 1 : 0);
                                            jSONObject3.put("main_db", j18 / 1048576);
                                            jSONObject3.put("extra_db", j16 / 1048576);
                                            jSONObject3.put("free_storage", j14 / 1048576);
                                            jSONObject3.put("skip_extra", (int) r92);
                                            jSONObject3.put("cache_cleared", j13 / 1048576);
                                            jSONObject3.put("resume", AbstractC0924m0.m4258ud() ? 1 : 0);
                                            jSONObject3.put("retry", AbstractC0924m0.m4199sd() ? 1 : 0);
                                            String jSONObject22 = jSONObject3.toString();
                                            AbstractC20887g.m109236n(19720, jSONObject22, null, 0, System.currentTimeMillis() - currentTimeMillis, 0, 44, null);
                                            C24559a.m127933c("[ZDB]", "Check migrate 19720: " + jSONObject22);
                                            if (!z13) {
                                            }
                                            this.f43375b = false;
                                            Runnable runnable2 = new Runnable() { // from class: am.b1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C7967l.m42723r();
                                                }
                                            };
                                            if (!z16) {
                                            }
                                            AbstractC19444a.m101694b(runnable2, j19);
                                        }
                                    }
                                    j17 = j15;
                                    r92 = z14;
                                } catch (Exception e14) {
                                    exc = e14;
                                    z11 = false;
                                    z12 = true;
                                    j13 = 0;
                                    j14 = 0;
                                    j15 = 0;
                                    m129183b = AbstractC24845f.m129183b(exc);
                                    C24559a.m127933c("[ZDB]", "Check db storage error $: " + m129183b);
                                    j16 = j12;
                                    j17 = j15;
                                    j18 = j11;
                                    z13 = z12;
                                    r92 = z11;
                                    this.f43377d = z13;
                                    this.f43378e = j17;
                                    JSONObject jSONObject32 = new JSONObject();
                                    jSONObject32.put("full_storage", !this.f43377d ? 1 : 0);
                                    jSONObject32.put("main_db", j18 / 1048576);
                                    jSONObject32.put("extra_db", j16 / 1048576);
                                    jSONObject32.put("free_storage", j14 / 1048576);
                                    jSONObject32.put("skip_extra", (int) r92);
                                    jSONObject32.put("cache_cleared", j13 / 1048576);
                                    jSONObject32.put("resume", AbstractC0924m0.m4258ud() ? 1 : 0);
                                    jSONObject32.put("retry", AbstractC0924m0.m4199sd() ? 1 : 0);
                                    String jSONObject222 = jSONObject32.toString();
                                    AbstractC20887g.m109236n(19720, jSONObject222, null, 0, System.currentTimeMillis() - currentTimeMillis, 0, 44, null);
                                    C24559a.m127933c("[ZDB]", "Check migrate 19720: " + jSONObject222);
                                    if (!z13) {
                                    }
                                    this.f43375b = false;
                                    Runnable runnable22 = new Runnable() { // from class: am.b1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C7967l.m42723r();
                                        }
                                    };
                                    if (!z16) {
                                    }
                                    AbstractC19444a.m101694b(runnable22, j19);
                                }
                            } catch (Exception e15) {
                                exc = e15;
                                z11 = false;
                                z12 = true;
                                j12 = 0;
                                j13 = 0;
                                j14 = 0;
                                j15 = 0;
                                m129183b = AbstractC24845f.m129183b(exc);
                                C24559a.m127933c("[ZDB]", "Check db storage error $: " + m129183b);
                                j16 = j12;
                                j17 = j15;
                                j18 = j11;
                                z13 = z12;
                                r92 = z11;
                                this.f43377d = z13;
                                this.f43378e = j17;
                                JSONObject jSONObject322 = new JSONObject();
                                jSONObject322.put("full_storage", !this.f43377d ? 1 : 0);
                                jSONObject322.put("main_db", j18 / 1048576);
                                jSONObject322.put("extra_db", j16 / 1048576);
                                jSONObject322.put("free_storage", j14 / 1048576);
                                jSONObject322.put("skip_extra", (int) r92);
                                jSONObject322.put("cache_cleared", j13 / 1048576);
                                jSONObject322.put("resume", AbstractC0924m0.m4258ud() ? 1 : 0);
                                jSONObject322.put("retry", AbstractC0924m0.m4199sd() ? 1 : 0);
                                String jSONObject2222 = jSONObject322.toString();
                                AbstractC20887g.m109236n(19720, jSONObject2222, null, 0, System.currentTimeMillis() - currentTimeMillis, 0, 44, null);
                                C24559a.m127933c("[ZDB]", "Check migrate 19720: " + jSONObject2222);
                                if (!z13) {
                                }
                                this.f43375b = false;
                                Runnable runnable222 = new Runnable() { // from class: am.b1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C7967l.m42723r();
                                    }
                                };
                                if (!z16) {
                                }
                                AbstractC19444a.m101694b(runnable222, j19);
                            }
                            this.f43377d = z13;
                            this.f43378e = j17;
                            JSONObject jSONObject3222 = new JSONObject();
                            jSONObject3222.put("full_storage", !this.f43377d ? 1 : 0);
                            jSONObject3222.put("main_db", j18 / 1048576);
                            jSONObject3222.put("extra_db", j16 / 1048576);
                            jSONObject3222.put("free_storage", j14 / 1048576);
                            jSONObject3222.put("skip_extra", (int) r92);
                            jSONObject3222.put("cache_cleared", j13 / 1048576);
                            jSONObject3222.put("resume", AbstractC0924m0.m4258ud() ? 1 : 0);
                            jSONObject3222.put("retry", AbstractC0924m0.m4199sd() ? 1 : 0);
                            String jSONObject22222 = jSONObject3222.toString();
                            AbstractC20887g.m109236n(19720, jSONObject22222, null, 0, System.currentTimeMillis() - currentTimeMillis, 0, 44, null);
                            C24559a.m127933c("[ZDB]", "Check migrate 19720: " + jSONObject22222);
                            if (!z13) {
                                this.f43379f = false;
                                m42708U(C7959d.Companion.m41850e().m41751T0(), r92);
                            } else {
                                this.f43379f = true;
                                if (!this.f43380g) {
                                    this.f43380g = true;
                                    m42741w();
                                }
                            }
                            this.f43375b = false;
                            Runnable runnable2222 = new Runnable() { // from class: am.b1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C7967l.m42723r();
                                }
                            };
                            if (!z16) {
                                j19 = 400;
                            } else {
                                j19 = 0;
                            }
                            AbstractC19444a.m101694b(runnable2222, j19);
                        } else {
                            m4316wd = false;
                        }
                    } else {
                        m4316wd = AbstractC0924m0.m4316wd();
                    }
                    this.f43377d = z13;
                    this.f43378e = j17;
                    JSONObject jSONObject32222 = new JSONObject();
                    jSONObject32222.put("full_storage", !this.f43377d ? 1 : 0);
                    jSONObject32222.put("main_db", j18 / 1048576);
                    jSONObject32222.put("extra_db", j16 / 1048576);
                    jSONObject32222.put("free_storage", j14 / 1048576);
                    jSONObject32222.put("skip_extra", (int) r92);
                    jSONObject32222.put("cache_cleared", j13 / 1048576);
                    jSONObject32222.put("resume", AbstractC0924m0.m4258ud() ? 1 : 0);
                    jSONObject32222.put("retry", AbstractC0924m0.m4199sd() ? 1 : 0);
                    String jSONObject222222 = jSONObject32222.toString();
                    AbstractC20887g.m109236n(19720, jSONObject222222, null, 0, System.currentTimeMillis() - currentTimeMillis, 0, 44, null);
                    C24559a.m127933c("[ZDB]", "Check migrate 19720: " + jSONObject222222);
                    if (!z13) {
                    }
                    this.f43375b = false;
                    Runnable runnable22222 = new Runnable() { // from class: am.b1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7967l.m42723r();
                        }
                    };
                    if (!z16) {
                    }
                    AbstractC19444a.m101694b(runnable22222, j19);
                } catch (Exception e16) {
                    m129183b2 = AbstractC24845f.m129183b(e16);
                    C24559a.m127933c("[ZDB]", "startMigrateAPI Exception " + m129183b2);
                }
                z13 = true;
                j18 = 0;
                j16 = 0;
                j13 = 0;
                j14 = 0;
                j15 = 0;
                z14 = m4316wd;
                if (z13) {
                }
                j17 = j15;
                r92 = z14;
            }
            return;
        }
        this.f43375b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m42739u() {
        int i11;
        boolean z11;
        String str;
        String str2;
        String valueOf = String.valueOf(f43370k);
        if (!AbstractC0924m0.m3161J8() && AbstractC0924m0.m4374yd() && AbstractC0924m0.m4345xd() && AbstractC19074t.m100204b(valueOf, CoreUtility.f89233i)) {
            long currentTimeMillis = System.currentTimeMillis();
            int i12 = -1;
            try {
                String str3 = "FAILED";
                if (!AbstractC0924m0.m4343xb()) {
                    C24559a.m127933c("[ZDB]", "START REMOVE OLD DB MAIN");
                    boolean m41730N2 = C7959d.Companion.m41850e().m41730N2(valueOf);
                    AbstractC0924m0.m3116Hl(m41730N2);
                    if (!m41730N2) {
                        str2 = "FAILED";
                    } else {
                        str2 = "SUCCESS";
                    }
                    C24559a.m127933c("[ZDB]", "REMOVED OLD DB MAIN: " + valueOf + " " + str2);
                }
                if (!AbstractC0924m0.m4372yb()) {
                    C24559a.m127933c("[ZDB]", "START REMOVE OLD DB STOCK");
                    boolean m42513qc = C7960e.m41971c6().m42513qc(valueOf);
                    AbstractC0924m0.m3145Il(m42513qc);
                    if (!m42513qc) {
                        str = "FAILED";
                    } else {
                        str = "SUCCESS";
                    }
                    C24559a.m127933c("[ZDB]", "REMOVED OLD DB STOCK: " + valueOf + " " + str);
                }
                if (!AbstractC0924m0.m4314wb()) {
                    C24559a.m127933c("[ZDB]", "START REMOVE OLD DB EXTRA");
                    boolean m13620b = AbstractC2819c.m13620b(valueOf);
                    AbstractC0924m0.m3087Gl(m13620b);
                    if (m13620b) {
                        str3 = "SUCCESS";
                    }
                    C24559a.m127933c("[ZDB]", "REMOVED OLD DB EXTRA: " + valueOf + " " + str3);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104553f(e11, "[ZDB]", new Object[0]);
            }
            if (AbstractC0924m0.m4343xb() && AbstractC0924m0.m4372yb() && AbstractC0924m0.m4314wb() && AbstractC19074t.m100204b(valueOf, CoreUtility.f89233i)) {
                AbstractC0924m0.m3137Id(true);
                i11 = 0;
                long currentTimeMillis2 = System.currentTimeMillis();
                if (i11 != 0) {
                }
                AbstractC20887g.m109221H(false, z11, i11, 19708, 0, currentTimeMillis2 - currentTimeMillis, "", currentTimeMillis, currentTimeMillis2);
            }
            if (!AbstractC0924m0.m4343xb()) {
                i12 = -11;
            }
            if (!AbstractC0924m0.m4372yb()) {
                i12 -= 100;
            }
            if (!AbstractC0924m0.m4314wb()) {
                i12 -= 1000;
            }
            if (!AbstractC19074t.m100204b(valueOf, CoreUtility.f89233i)) {
                i12 += ZMediaPlayer.MEDIA_ERROR_Z_PLAYER;
            }
            i11 = i12;
            long currentTimeMillis22 = System.currentTimeMillis();
            if (i11 != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC20887g.m109221H(false, z11, i11, 19708, 0, currentTimeMillis22 - currentTimeMillis, "", currentTimeMillis, currentTimeMillis22);
        }
    }

    /* renamed from: v */
    public final void m42740v(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "currentUid");
        if (Companion.m42747e() && AbstractC0924m0.m4287vd() && !AbstractC0924m0.m4109pd() && AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!AbstractC0924m0.m4139qd()) {
                boolean m42525rc = C7960e.m41971c6().m42525rc(str);
                AbstractC0924m0.m3794es(m42525rc);
                if (m42525rc) {
                    str2 = "SUCCESS";
                } else {
                    str2 = "FAILED";
                }
                C24559a.m127933c("[ZDB]", "REMOVED OLD REACTION DB: " + str + " " + str2 + " executeTime=" + (System.currentTimeMillis() - currentTimeMillis) + "msg");
            }
        }
    }

    /* renamed from: w */
    public final void m42741w() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: am.w0
            @Override // java.lang.Runnable
            public final void run() {
                C7967l.m42726x();
            }
        });
    }

    /* renamed from: y */
    public final boolean m42742y() {
        return this.f43377d;
    }

    private C7967l() {
        this.f43375b = true;
        this.f43377d = true;
        this.f43382i = -1;
    }
}
