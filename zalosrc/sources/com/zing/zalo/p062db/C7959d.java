package com.zing.zalo.p062db;

import af0.AbstractC0777e;
import ag0.C0824j;
import ag0.C0827k0;
import ag0.C0833n0;
import am.AbstractC0924m0;
import am.AbstractC0937t;
import am.AbstractC0939u;
import am.C0896a;
import am.C0916i0;
import am.C0941v;
import am.InterfaceC0947y;
import am.InterfaceC0949z;
import android.content.ContentValues;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import cn0.AbstractC3601a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.control.C7908f;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import com.zing.zalo.data.entity.chat.message.LastDeliveredSeenData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import fn0.C19067n0;
import gm.C19497h;
import gm.C19498i;
import gm0.AbstractC19512f;
import gm0.AbstractC19513g;
import gw.C19636i1;
import gw.C19669z;
import hm.C20092b;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Semaphore;
import me0.AbstractC23008a2;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23193r0;
import me0.AbstractC23204s0;
import me0.AbstractC23238v2;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import mm0.AbstractC23355j;
import on0.AbstractC24334o;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24321d;
import org.json.JSONException;
import org.json.JSONObject;
import p019aj.C0872f;
import p056cj.C3533a;
import p056cj.C3556x;
import p132ej.C18446h;
import p241ij.C20567d;
import p248iy.AbstractC20887g;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p363nh.C23750d;
import p371nv.C23952g;
import p392oh.C24261h;
import p405ov.C24559a;
import p423pi.C24761c;
import p423pi.C24764f;
import p424pj.C24774a;
import p461qu.AbstractC25495a;
import p577vj.C28266a;
import p585vs.C28609a;
import p585vs.C28611c;
import p585vs.C28615g;
import p586vt.AbstractC28617b;
import p586vt.AbstractC28626k;
import p586vt.C28629n;
import p620wt.AbstractC29239n;
import p667y2.C30268e;
import p716zh.C31909f1;
import p716zh.C31924g1;
import p716zh.C31954i1;
import p716zh.C32070q;
import pk.C24799c;
import pk.C24800d;
import pk.C24801e;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import tj.C26710b;
import tj.C26711c;
import vi.C28255a;
import vi.C28259e;
import vi.C28260f;
import vi.C28262h;

/* renamed from: com.zing.zalo.db.d */
/* loaded from: classes.dex */
public final class C7959d {
    public static final a Companion = new a(null);

    /* renamed from: h */
    private static volatile C7959d f43230h;

    /* renamed from: a */
    private final InterfaceC0947y f43231a;

    /* renamed from: b */
    private final C0872f f43232b;

    /* renamed from: c */
    private final File f43233c;

    /* renamed from: d */
    private boolean f43234d;

    /* renamed from: e */
    private final Semaphore f43235e;

    /* renamed from: f */
    private boolean f43236f;

    /* renamed from: g */
    private final b f43237g;

    /* renamed from: com.zing.zalo.db.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Finally extract failed */
        /* renamed from: b */
        private final synchronized C7959d m41846b() {
            try {
                if (C7959d.f43230h == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    b bVar = null;
                    try {
                        try {
                            synchronized (C7959d.class) {
                                try {
                                    if (C7959d.f43230h == null) {
                                        Context m35500c = MainApplication.Companion.m35500c();
                                        C0872f m120562A = AbstractC23306f.m120562A();
                                        AbstractC19074t.m100207e(m120562A, "provideChatRepo(...)");
                                        C7959d.f43230h = new C7959d(m35500c, m120562A, null);
                                    }
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                } finally {
                                }
                            }
                            C7959d c7959d = C7959d.f43230h;
                            if (c7959d != null) {
                                try {
                                    c7959d.m41751T0().mo2854s();
                                } catch (Exception e11) {
                                    AbstractC20887g.m109244v(17529, null, 2, null);
                                    AbstractC20110a.f98889a.mo104552e(e11);
                                    File file = c7959d.f43233c;
                                    if (file != null) {
                                        SQLiteDatabase.m41410d(file);
                                    }
                                }
                                try {
                                    c7959d.m41751T0().mo2841D(AbstractC0924m0.m3332P5());
                                    AbstractC20110a.f98889a.mo104548a("Limit soft heap success: %d", Integer.valueOf(AbstractC0924m0.m3332P5()));
                                } catch (SQLiteException e12) {
                                    AbstractC20110a.f98889a.mo104551d("Limit soft heap fail. %s", e12.m41427b());
                                    AbstractC20887g.m109244v(17526, null, 2, null);
                                }
                                c7959d.m41759W2(c7959d.m41773b2("chat_content"));
                                c7959d.m41613N();
                                c7959d.m41717K();
                                c7959d.m41742R();
                                c7959d.m41620S();
                                c7959d.m41609J();
                                c7959d.m41750T();
                                c7959d.m41731O();
                                c7959d.m41709I();
                                c7959d.m41703G0();
                                c7959d.m41635c0();
                                c7959d.m41627X();
                                c7959d.m41640e0();
                                c7959d.m41633b0();
                                c7959d.m41637d0();
                                c7959d.m41617P();
                                c7959d.m41623V();
                                c7959d.m41625W();
                                c7959d.m41628Z();
                                c7959d.m41630a0();
                                c7959d.m41621U();
                                c7959d.m41611M();
                                c7959d.m41610L();
                                c7959d.m41763Y();
                                c7959d.f43236f = !c7959d.m41773b2("e2ee_sent_messages");
                                int m41624V0 = c7959d.m41624V0();
                                if (86 > m41624V0) {
                                    c7959d.m41671u2(m41624V0);
                                }
                            }
                            AbstractC20887g.m109246x(16003, currentTimeMillis);
                            C7959d c7959d2 = C7959d.f43230h;
                            if (c7959d2 != null) {
                                bVar = c7959d2.m41770a1();
                            }
                            if (bVar != null) {
                                bVar.m41859f(false);
                            }
                        } catch (Exception e13) {
                            AbstractC23350e.m122776f("DatabaseChatHelper", e13);
                            AbstractC20887g.m109238p(16001, currentTimeMillis);
                            AbstractC20887g.m109230h(16001, e13.toString());
                            throw e13;
                        }
                    } catch (Throwable th2) {
                        C7959d c7959d3 = C7959d.f43230h;
                        if (c7959d3 != null) {
                            bVar = c7959d3.m41770a1();
                        }
                        if (bVar != null) {
                            bVar.m41859f(false);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
            return C7959d.f43230h;
        }

        /* renamed from: c */
        private final String m41847c() {
            return m41849d(MainApplication.Companion.m35500c()).getAbsolutePath() + ".temp";
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m41848a() {
            C7959d c7959d;
            Exception e11;
            C7959d c7959d2;
            synchronized (C7959d.class) {
                c7959d = null;
                if (C7959d.f43230h != null) {
                    try {
                        c7959d2 = C7959d.f43230h;
                        try {
                            C7959d.f43230h = null;
                        } catch (Exception e12) {
                            e11 = e12;
                            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                            c7959d = c7959d2;
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            synchronized (C7959d.class) {
                            }
                        }
                    } catch (Exception e13) {
                        e11 = e13;
                        c7959d2 = null;
                    }
                    c7959d = c7959d2;
                }
                C24848g0 c24848g02 = C24848g0.f119245a;
            }
            synchronized (C7959d.class) {
                if (c7959d != null) {
                    try {
                        c7959d.m41770a1().m41859f(true);
                        c7959d.m41702G();
                        SQLiteDatabase.m41411f(new File(C7959d.Companion.m41847c()));
                    } catch (Exception e14) {
                        AbstractC23350e.m122776f("DatabaseChatHelper", e14);
                    }
                }
            }
        }

        /* renamed from: d */
        public final File m41849d(Context context) {
            AbstractC19074t.m100208f(context, "context");
            File databasePath = context.getDatabasePath("zalo_x_1.db");
            AbstractC19074t.m100207e(databasePath, "getDatabasePath(...)");
            return databasePath;
        }

        /* renamed from: e */
        public final synchronized C7959d m41850e() {
            C7959d c7959d;
            try {
                if (C7959d.f43230h == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        C7959d.f43230h = m41846b();
                        AbstractC20887g.m109246x(16003, currentTimeMillis);
                    } catch (Throwable th2) {
                        AbstractC23350e.m122776f("DatabaseChatHelper", th2);
                        AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                        boolean z11 = false;
                        aVar.mo104559s("full storage", new Object[0]);
                        MainApplication.C6895a c6895a = MainApplication.Companion;
                        if (AbstractC23238v2.m119722g(c6895a.m35500c().getFilesDir().getPath()) < 10485760) {
                            AbstractC20887g.m109244v(16076, null, 2, null);
                        }
                        AbstractC20887g.m109238p(16003, currentTimeMillis);
                        AbstractC20887g.m109230h(16003, th2.toString());
                        long m119722g = AbstractC23238v2.m119722g(c6895a.m35500c().getFilesDir().getPath());
                        aVar.mo104559s("full storage - freeSize %d", Long.valueOf(m119722g));
                        if (m119722g < 10485760) {
                            C23750d c23750d = new C23750d(c6895a.m35500c());
                            c23750d.m124165v0("other");
                            c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo).m6870W(c6895a.m35500c().getText(AbstractC8020f0.str_error_full_sdcard_more_descriptive)).mo6894v(c6895a.m35500c().getText(AbstractC8020f0.str_error_full_sdcard_more_descriptive)).m6892t("").mo6860M(false).mo6895w(c6895a.m35500c().getText(AbstractC8020f0.app_name));
                            c23750d.m124147b0();
                        }
                        try {
                            aVar.mo104551d("chat-db file is exist(%b)", Boolean.valueOf(c6895a.m35500c().getDatabasePath("zalo_x_1.db").exists()));
                            C7959d.f43230h = m41846b();
                        } catch (Throwable th3) {
                            AbstractC20887g.m109244v(16078, null, 2, null);
                            AbstractC20887g.m109230h(16078, th3.toString());
                        }
                        AbstractC23355j.m122793a("free-storage", String.valueOf(m119722g));
                        if (C7959d.f43230h == null) {
                            z11 = true;
                        }
                        AbstractC23355j.m122793a("db-interface", String.valueOf(z11));
                        AbstractC23355j.m122794b(th2);
                        if (C7959d.f43230h == null) {
                            AbstractC23193r0.m119508q();
                        }
                    }
                }
                c7959d = C7959d.f43230h;
                if (c7959d == null) {
                    throw new IllegalStateException("DatabaseChat Error");
                }
            } catch (Throwable th4) {
                throw th4;
            }
            return c7959d;
        }

        /* renamed from: f */
        public final String m41851f() {
            return AbstractC23204s0.m119554e().getPath() + "/zalo/backup";
        }

        /* renamed from: g */
        public final String m41852g(String str) {
            String m101985d = AbstractC19512f.m101985d(AESUtils.m39916b(CoreUtility.f89225a, AbstractC19513g.m101988b(str)));
            AbstractC19074t.m100207e(m101985d, "toHex(...)");
            Locale locale = Locale.getDefault();
            AbstractC19074t.m100207e(locale, "getDefault(...)");
            String lowerCase = m101985d.toLowerCase(locale);
            AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
            return MainApplication.Companion.m35500c().getFilesDir().getPath() + "/zalo/backup/" + lowerCase;
        }

        /* renamed from: h */
        public final String m41853h() {
            String absolutePath = MainApplication.Companion.m35500c().getCacheDir().getAbsolutePath();
            AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
    }

    /* renamed from: com.zing.zalo.db.d$b */
    /* loaded from: classes.dex */
    public final class b extends C0941v {

        /* renamed from: a */
        private boolean f43238a;

        public b() {
        }

        /* renamed from: c */
        private final void m41854c(String str) {
            boolean m127126v;
            CharSequence m127168X0;
            m127126v = AbstractC24341v.m127126v(str, ":memory:", true);
            if (!m127126v) {
                m127168X0 = AbstractC24342w.m127168X0(str);
                if (m127168X0.toString().length() != 0) {
                    AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                    aVar.m104564x("DatabaseChatHelper").mo104551d("deleting the database file: %s", str);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104551d("deleting the database file result: %b", Boolean.valueOf(SQLiteDatabase.m41411f(new File(str))));
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.m104564x("DatabaseChatHelper").mo104551d("delete failed: %s", e11.getMessage());
                    }
                }
            }
        }

        /* renamed from: e */
        private final void m41856e(InterfaceC0947y interfaceC0947y) {
            AbstractC20110a.f98889a.m104564x("DatabaseChatHelper").mo104551d("Corruption reported by sqlite-custom on database: %s", interfaceC0947y.mo2856w());
            if (!interfaceC0947y.isOpen()) {
                String mo2856w = interfaceC0947y.mo2856w();
                AbstractC19074t.m100207e(mo2856w, "getDatabasePath(...)");
                m41854c(mo2856w);
                return;
            }
            List list = null;
            try {
                try {
                    list = interfaceC0947y.mo2846g();
                } catch (SQLiteException unused) {
                }
                try {
                    interfaceC0947y.close();
                } catch (SQLiteException unused2) {
                }
            } finally {
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        m41854c((String) it.next());
                    }
                } else {
                    String mo2856w2 = interfaceC0947y.mo2856w();
                    AbstractC19074t.m100207e(mo2856w2, "getDatabasePath(...)");
                    m41854c(mo2856w2);
                }
            }
        }

        /* renamed from: g */
        private final boolean m41857g(File file) {
            boolean z11;
            if (file.exists()) {
                AbstractC20110a.f98889a.mo104556o(8, "file exist (%d): %s", Long.valueOf(file.length()), file);
                z11 = false;
            } else {
                z11 = true;
            }
            File file2 = new File(file.getPath() + "-journal");
            if (file2.exists()) {
                AbstractC20110a.f98889a.mo104556o(8, "file exist (%d): %s", Long.valueOf(file2.length()), file2);
                z11 = false;
            }
            File file3 = new File(file.getPath() + "-shm");
            if (file3.exists()) {
                AbstractC20110a.f98889a.mo104556o(8, "file exist (%d): %s", Long.valueOf(file3.length()), file3);
                z11 = false;
            }
            File file4 = new File(file.getPath() + "-wal");
            if (file4.exists()) {
                AbstractC20110a.f98889a.mo104556o(8, "file exist (%d): %s", Long.valueOf(file4.length()), file4);
                z11 = false;
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                File[] listFiles = parentFile.listFiles(new FileFilter() { // from class: am.f

                    /* renamed from: a */
                    public final /* synthetic */ String f3401a;

                    public /* synthetic */ C0909f(String str) {
                        r1 = str;
                    }

                    @Override // java.io.FileFilter
                    public final boolean accept(File file5) {
                        boolean m41858h;
                        m41858h = C7959d.b.m41858h(r1, file5);
                        return m41858h;
                    }
                });
                if (listFiles != null) {
                    for (File file5 : listFiles) {
                        if (file5.exists()) {
                            AbstractC20110a.f98889a.mo104556o(8, "file exist (%d): %s", Long.valueOf(file4.length()), file4);
                            z11 = false;
                        }
                    }
                }
            }
            return z11;
        }

        /* renamed from: h */
        public static final boolean m41858h(String str, File file) {
            boolean m127120J;
            AbstractC19074t.m100208f(str, "$prefix");
            String name = file.getName();
            AbstractC19074t.m100207e(name, "getName(...)");
            m127120J = AbstractC24341v.m127120J(name, str, false, 2, null);
            return m127120J;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00de, code lost:            me0.AbstractC23152n3.m118985A0(null);        me0.AbstractC23193r0.m119508q();     */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00e4, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00db, code lost:            if (m41857g(new java.io.File(r13.mo2856w())) != false) goto L45;     */
        @Override // am.C0941v, am.InterfaceC0911g
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo2831a(InterfaceC0947y interfaceC0947y, SQLiteException sQLiteException) {
            AbstractC19074t.m100208f(interfaceC0947y, "dbObj");
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.mo104556o(8, "corrupt db: " + interfaceC0947y.mo2856w(), new Object[0]);
            AbstractC20887g.m109217D(17501, null, 2, null);
            if (sQLiteException != null) {
                aVar.mo104552e(sQLiteException);
            }
            File file = new File(interfaceC0947y.mo2856w());
            File databasePath = CoreUtility.getAppContext().getDatabasePath("zalo");
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "Corruption: %d (stock %d) - %s", Arrays.copyOf(new Object[]{Long.valueOf(file.length()), Long.valueOf(databasePath.length()), interfaceC0947y.mo2856w()}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC20887g.m109231i(str, 17501, format, 0L, 17500, CoreUtility.f89236l);
            AbstractC0924m0.m4117pl(true);
            C7959d.this.m41751T0().mo2859z(new C0941v());
            try {
                try {
                    m41856e(interfaceC0947y);
                } catch (Exception e11) {
                    AbstractC20887g.m109244v(17516, null, 2, null);
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    AbstractC20887g.m109231i(str2, 17516, "super.onCorruption fail", 0L, 17500, CoreUtility.f89236l);
                    AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                }
            } finally {
                if (!m41857g(new File(interfaceC0947y.mo2856w()))) {
                    AbstractC20887g.m109244v(17528, null, 2, null);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f3, code lost:            if (r3 != false) goto L135;     */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01c5, code lost:            if (r0 != false) goto L165;     */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
        @Override // am.C0941v, am.InterfaceC0911g
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo2832b(InterfaceC0947y interfaceC0947y, SQLiteException sQLiteException) {
            String str;
            boolean m127120J;
            boolean m127149O;
            boolean m127126v;
            String m127098f;
            boolean m127120J2;
            boolean m127149O2;
            boolean m127126v2;
            String m127098f2;
            AbstractC19074t.m100208f(interfaceC0947y, "db");
            AbstractC19074t.m100208f(sQLiteException, C30268e.f140632a);
            super.mo2832b(interfaceC0947y, sQLiteException);
            AbstractC20887g.m109244v(17503, null, 2, null);
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109231i(str2, 17503, sQLiteException.toString(), 0L, 17500, CoreUtility.f89236l);
            if (this.f43238a) {
                return;
            }
            int m122015ic = AbstractC23309i.m122015ic();
            boolean z11 = true;
            if (m122015ic != 0) {
                if (m122015ic != 1) {
                    if (m122015ic != 2) {
                        AbstractC20887g.m109244v(17520, null, 2, null);
                        String str3 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str3, "currentUserUid");
                        AbstractC20887g.m109231i(str3, 17520, "", 0L, 17500, CoreUtility.f89236l);
                        return;
                    }
                    if (sQLiteException.m41427b() != null && (sQLiteException.m41426a() == 5 || sQLiteException.m41426a() == 6)) {
                        m127126v2 = AbstractC24341v.m127126v("database is locked", sQLiteException.m41427b(), true);
                        if (m127126v2) {
                            try {
                                int mo2852o = interfaceC0947y.mo2852o();
                                C7959d c7959d = C7959d.this;
                                String mo2856w = interfaceC0947y.mo2856w();
                                AbstractC19074t.m100207e(mo2856w, "getDatabasePath(...)");
                                m127098f2 = AbstractC24334o.m127098f("\n                            " + c7959d.m41622U0(mo2856w) + "\n                            locking_mode: " + mo2852o + "\n                            ");
                                C23952g.m125345j("SQLITE_BUSY", m127098f2);
                            } catch (Exception e11) {
                                AbstractC20110a.f98889a.mo104552e(e11);
                            }
                            AbstractC23152n3.m118985A0(null);
                            AbstractC23193r0.m119508q();
                            return;
                        }
                    }
                    if (sQLiteException.m41426a() == 1) {
                        String m41427b = sQLiteException.m41427b();
                        AbstractC19074t.m100207e(m41427b, "getErrorMessage(...)");
                        m127120J2 = AbstractC24341v.m127120J(m41427b, "no such column:", false, 2, null);
                        if (!m127120J2) {
                            String m41427b2 = sQLiteException.m41427b();
                            AbstractC19074t.m100207e(m41427b2, "getErrorMessage(...)");
                            m127149O2 = AbstractC24342w.m127149O(m41427b2, " has no column named ", false, 2, null);
                        }
                        AbstractC20887g.m109244v(17527, null, 2, null);
                        try {
                            C7959d.this.m41782e3(0);
                            C7959d.this.m41671u2(0);
                            AbstractC20110a.f98889a.m104564x("DatabaseChatHelper").mo104556o(8, "reset db-version to execute migrate function 2", new Object[0]);
                            return;
                        } catch (Exception e12) {
                            AbstractC20110a.f98889a.mo104552e(e12);
                            return;
                        }
                    }
                    AbstractC20887g.m109244v(17520, null, 2, null);
                    return;
                }
                if (!interfaceC0947y.isOpen()) {
                    C7959d.Companion.m41848a();
                }
                AbstractC20887g.m109244v(17519, null, 2, null);
                String str4 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str4, "currentUserUid");
                AbstractC20887g.m109231i(str4, 17519, "", 0L, 17500, CoreUtility.f89236l);
                return;
            }
            if (sQLiteException.m41427b() != null) {
                if (sQLiteException.m41426a() == 5) {
                    m127126v = AbstractC24341v.m127126v("database is locked", sQLiteException.m41427b(), true);
                    if (m127126v) {
                        try {
                            int mo2852o2 = interfaceC0947y.mo2852o();
                            C7959d c7959d2 = C7959d.this;
                            String mo2856w2 = interfaceC0947y.mo2856w();
                            AbstractC19074t.m100207e(mo2856w2, "getDatabasePath(...)");
                            m127098f = AbstractC24334o.m127098f("\n                                " + c7959d2.m41622U0(mo2856w2) + "\n                                locking_mode: " + mo2852o2 + "\n                                ");
                            C23952g.m125345j("SQLITE_BUSY", m127098f);
                        } catch (Exception e13) {
                            AbstractC20110a.f98889a.mo104552e(e13);
                        }
                        str = null;
                        AbstractC23152n3.m118985A0(null);
                        AbstractC23193r0.m119508q();
                        if (sQLiteException.m41426a() == 1) {
                            String m41427b3 = sQLiteException.m41427b();
                            AbstractC19074t.m100207e(m41427b3, "getErrorMessage(...)");
                            m127120J = AbstractC24341v.m127120J(m41427b3, "no such column:", false, 2, str);
                            if (!m127120J) {
                                String m41427b4 = sQLiteException.m41427b();
                                AbstractC19074t.m100207e(m41427b4, "getErrorMessage(...)");
                                m127149O = AbstractC24342w.m127149O(m41427b4, " has no column named ", false, 2, str);
                            }
                            AbstractC20887g.m109244v(17527, str, 2, str);
                            try {
                                C7959d.this.m41782e3(0);
                                C7959d.this.m41671u2(0);
                                AbstractC20110a.f98889a.m104564x("DatabaseChatHelper").mo104556o(8, "reset db-version to execute migrate function 1", new Object[0]);
                            } catch (Exception e14) {
                                AbstractC20110a.f98889a.mo104552e(e14);
                            }
                            if (C7959d.f43230h == null) {
                                if (interfaceC0947y.isOpen()) {
                                    if (interfaceC0947y.mo2840A() && interfaceC0947y.mo2858y()) {
                                        AbstractC20887g.m109244v(17517, null, 2, null);
                                        String str5 = CoreUtility.f89233i;
                                        AbstractC19074t.m100207e(str5, "currentUserUid");
                                        AbstractC20887g.m109231i(str5, 17517, "", 0L, 17500, CoreUtility.f89236l);
                                        z11 = false;
                                    }
                                    if (interfaceC0947y.isOpen() && z11) {
                                        C7959d.Companion.m41848a();
                                        return;
                                    }
                                    return;
                                }
                                if (interfaceC0947y.mo2858y()) {
                                    AbstractC20887g.m109244v(17518, null, 2, null);
                                    String str6 = CoreUtility.f89233i;
                                    AbstractC19074t.m100207e(str6, "currentUserUid");
                                    AbstractC20887g.m109231i(str6, 17518, "", 0L, 17500, CoreUtility.f89236l);
                                    z11 = false;
                                }
                                if (interfaceC0947y.isOpen()) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
                str = null;
                if (sQLiteException.m41426a() == 1) {
                }
            }
            if (C7959d.f43230h == null) {
            }
        }

        /* renamed from: f */
        public final void m41859f(boolean z11) {
            this.f43238a = z11;
        }
    }

    /* renamed from: com.zing.zalo.db.d$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ String f43241b;

        /* renamed from: c */
        final /* synthetic */ long f43242c;

        c(String str, long j11) {
            this.f43241b = str;
            this.f43242c = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                InterfaceC0947y m41751T0 = C7959d.this.m41751T0();
                C19067n0 c19067n0 = C19067n0.f94947a;
                Locale locale = Locale.US;
                String format = String.format(locale, " DELETE FROM %s WHERE %s = ?;", Arrays.copyOf(new Object[]{"send_seen_reaction", "conversationId"}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                m41751T0.mo2778v(format, this.f43241b);
                InterfaceC0947y m41751T02 = C7959d.this.m41751T0();
                String format2 = String.format(locale, "INSERT INTO %s (%s, %s) VALUES (?, ?)", Arrays.copyOf(new Object[]{"send_seen_reaction", "conversationId", "reactionId"}, 3));
                AbstractC19074t.m100207e(format2, "format(...)");
                long j11 = this.f43242c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j11);
                m41751T02.mo2778v(format2, this.f43241b, sb2.toString());
                AbstractC20110a.f98889a.mo104554k("ReactionSendSeen addSendSeenReactionAsync-> " + this.f43241b + " " + this.f43242c, new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.db.d$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC0939u {

        /* renamed from: b */
        final /* synthetic */ String f43244b;

        /* renamed from: c */
        final /* synthetic */ long f43245c;

        d(String str, long j11) {
            this.f43244b = str;
            this.f43245c = j11;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            try {
                InterfaceC0947y m41751T0 = C7959d.this.m41751T0();
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, " DELETE FROM %s WHERE %s = ? and %s <= ?", Arrays.copyOf(new Object[]{"send_seen_reaction", "conversationId", "reactionId"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                m41751T0.mo2778v(format, this.f43244b, Long.valueOf(this.f43245c));
                AbstractC20110a.f98889a.mo104554k("ReactionSendSeen removeSendSeenReactionAsync-> " + this.f43244b + " " + this.f43245c, new Object[0]);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            }
        }
    }

    public /* synthetic */ C7959d(Context context, C0872f c0872f, AbstractC19060k abstractC19060k) {
        this(context, c0872f);
    }

    /* renamed from: A */
    private final String m41594A(String str, int i11, ArrayList arrayList) {
        return "SELECT * FROM daily_download_res_thread_info WHERE " + ("current_uid = '" + str + "' AND log_type = " + i11 + m41680y(arrayList));
    }

    /* renamed from: A3 */
    private final void m41595A3(String str, int i11, String str2, String str3, C24764f c24764f) {
        m41597B3(str, i11, str2, str3, c24764f);
        List m128727a = c24764f.m128727a();
        AbstractC19074t.m100205c(m128727a);
        Iterator it = m128727a.iterator();
        while (it.hasNext()) {
            try {
                m41682z3(str, i11, str2, str3, (C24761c) it.next());
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(5:(2:7|(10:9|10|11|12|13|14|15|(1:17)(1:22)|18|19))|15|(0)(0)|18|19)|10|11|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:            r11 = e;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063 A[Catch: Exception -> 0x0075, TRY_ENTER, TryCatch #2 {Exception -> 0x0075, blocks: (B:17:0x0063, B:22:0x0077), top: B:15:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: Exception -> 0x0075, TRY_LEAVE, TryCatch #2 {Exception -> 0x0075, blocks: (B:17:0x0063, B:22:0x0077), top: B:15:0x0061 }] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m41596B(String str) {
        boolean z11;
        InterfaceC0949z mo2775p;
        boolean z12;
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select count(*) from %s where %s <> ? limit 1", Arrays.copyOf(new Object[]{"chat_content", "currentUserUid"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            mo2775p = interfaceC0947y.mo2775p(format, str);
            try {
            } catch (Throwable th2) {
                th = th2;
                z12 = false;
            }
        } catch (Exception e11) {
            e = e11;
            z11 = false;
        }
        try {
            try {
                if (mo2775p.next()) {
                    if (mo2775p.getInt(0) > 0) {
                        z11 = true;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                        AbstractC3601a.m18219a(mo2775p, null);
                        if (z11) {
                            C24559a.m127933c("[ZDB]", "Drop old table chat_content ");
                            this.f43231a.mo2774n("drop table if exists chat_content");
                            C24559a.m127933c("[ZDB]", "Drop old table chat_content SUCCESS");
                        } else {
                            C24559a.m127933c("[ZDB]", "Drop old table chat_content: skip - exists other user");
                        }
                        return;
                    }
                }
                if (z11) {
                }
                return;
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104553f(e12, "%s Drop old table chat_content FAILED ", "[ZDB]");
                return;
            }
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (Throwable th3) {
            z12 = z11;
            th = th3;
            try {
                throw th;
            } catch (Throwable th4) {
                try {
                    AbstractC3601a.m18219a(mo2775p, th);
                    throw th4;
                } catch (Exception e13) {
                    e = e13;
                    z11 = z12;
                    AbstractC20110a.f98889a.mo104553f(e, "%s Check exists other user old db FAILED", "[ZDB]");
                    if (z11) {
                    }
                    return;
                }
            }
        }
        z11 = false;
    }

    /* renamed from: B3 */
    private final void m41597B3(String str, int i11, String str2, String str3, C24764f c24764f) {
        if (!m41615N3(this, str, i11, str2, str3, c24764f, null, 32, null)) {
            m41631a2(str, i11, str2, str3, c24764f);
        }
    }

    /* renamed from: C1 */
    private final long m41598C1(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return new JSONObject(str).optLong("lastMsgTtl");
        } catch (JSONException e11) {
            e11.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: D1 */
    private final JSONObject m41599D1(C17945a0 c17945a0) {
        if (c17945a0 == null) {
            return null;
        }
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cmi", m95029V3.m41045i());
        jSONObject.put("gmi", m95029V3.m41047k());
        jSONObject.put("ownerId", m95029V3.m41048l());
        jSONObject.put("senderId", m95029V3.m41050n());
        jSONObject.put("ts", c17945a0.m94974P4());
        return jSONObject;
    }

    /* renamed from: D3 */
    private final void m41600D3(String str, int i11, String str2, String str3, C24764f c24764f) {
        m41615N3(this, str, i11, str2, str3, c24764f, null, 32, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_newly_received = 1");
        arrayList.add("queued_type = 0");
        List m128727a = c24764f.m128727a();
        AbstractC19074t.m100205c(m128727a);
        Iterator it = m128727a.iterator();
        while (it.hasNext()) {
            try {
                m41672u3(str, i11, str2, str3, (C24761c) it.next(), arrayList);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: E1 */
    private final C17945a0 m41601E1(String str) {
        JSONObject optJSONObject;
        if (str == null || str.length() == 0 || (optJSONObject = new JSONObject(str).optJSONObject("unreadMention")) == null) {
            return null;
        }
        long optLong = optJSONObject.optLong("cmi");
        long optLong2 = optJSONObject.optLong("gmi");
        String optString = optJSONObject.optString("ownerId");
        String optString2 = optJSONObject.optString("senderId");
        long optLong3 = optJSONObject.optLong("ts");
        MessageId.C7932a c7932a = MessageId.Companion;
        AbstractC19074t.m100205c(optString);
        AbstractC19074t.m100205c(optString2);
        MessageId m41065d = c7932a.m41065d(optLong, optLong2, optString, optString2);
        if (m41065d == null) {
            return null;
        }
        return new C17945a0.w(m41065d, 0).m95359K(optLong3).m95365a();
    }

    /* renamed from: E2 */
    private final void m41602E2(InterfaceC0947y interfaceC0947y) {
        AbstractC0937t.m4450a(interfaceC0947y, "sync_photo_cache", "zipParentName");
        AbstractC0937t.m4450a(interfaceC0947y, "sync_photo_cache", "senderId");
        AbstractC0937t.m4450a(interfaceC0947y, "sync_photo_cache", "clientMsgId");
        AbstractC0937t.m4450a(interfaceC0947y, "sync_photo_cache", "ownerId");
    }

    /* renamed from: E3 */
    private final void m41603E3(String str, int i11, String str2, String str3, C24764f c24764f) {
        m41615N3(this, str, i11, str2, str3, c24764f, null, 32, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add("dl_result_type = 0");
        List m128727a = c24764f.m128727a();
        AbstractC19074t.m100205c(m128727a);
        Iterator it = m128727a.iterator();
        while (it.hasNext()) {
            try {
                m41672u3(str, i11, str2, str3, (C24761c) it.next(), arrayList);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: F2 */
    private final void m41604F2(InterfaceC0947y interfaceC0947y) {
        AbstractC0937t.m4450a(interfaceC0947y, "pull_msg_offline", "needDelete");
    }

    /* renamed from: G1 */
    private final boolean m41605G1(String str, String str2, int i11) {
        boolean z11;
        try {
            InterfaceC0949z mo2777u = this.f43231a.mo2777u("SELECT 1 FROM " + str + " " + str2 + " LIMIT 1 OFFSET " + i11);
            if (mo2777u != null) {
                try {
                    if (mo2777u.next()) {
                        z11 = true;
                        AbstractC3601a.m18219a(mo2777u, null);
                        return z11;
                    }
                } finally {
                }
            }
            z11 = false;
            AbstractC3601a.m18219a(mo2777u, null);
            return z11;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: G2 */
    private final void m41606G2(int i11, String str, Map map) {
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str2);
        try {
            if (str2.length() == 0) {
                return;
            }
            try {
                try {
                } catch (Throwable th2) {
                    try {
                        if (this.f43231a.isOpen()) {
                            this.f43231a.mo2850l();
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                if (this.f43231a.isOpen()) {
                    this.f43231a.mo2850l();
                }
            }
            if (!this.f43231a.isOpen()) {
                try {
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    AbstractC20110a.f98889a.mo104552e(e13);
                    return;
                }
            }
            this.f43231a.mo2845e();
            for (Map.Entry entry : map.entrySet()) {
                try {
                    String str3 = (String) entry.getKey();
                    C24764f c24764f = (C24764f) entry.getValue();
                    List m128727a = c24764f.m128727a();
                    if (m128727a != null && !m128727a.isEmpty()) {
                        m41595A3(str2, i11, str, str3, c24764f);
                    }
                } catch (Exception e14) {
                    AbstractC20110a.f98889a.mo104552e(e14);
                }
            }
            if (!this.f43231a.isOpen()) {
                try {
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                        return;
                    }
                    return;
                } catch (Exception e15) {
                    AbstractC20110a.f98889a.mo104552e(e15);
                    return;
                }
            }
            this.f43231a.mo2849k();
            if (this.f43231a.isOpen()) {
                this.f43231a.mo2850l();
            }
        } catch (Exception e16) {
            AbstractC20110a.f98889a.mo104552e(e16);
        }
    }

    /* renamed from: H2 */
    private final void m41607H2(ContentValues contentValues, C20567d c20567d) {
        String str;
        String str2;
        String m40877g;
        String str3 = "";
        if (c20567d.m107000h() == null) {
            str = "";
        } else {
            str = c20567d.m107000h().m41044h();
        }
        contentValues.put("clientMsgId", str);
        contentValues.put("timestamp", String.valueOf(c20567d.m107006n()));
        String str4 = "0";
        if (!c20567d.m107013u()) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        contentValues.put("isMine", str2);
        contentValues.put("unreadMessages", Integer.valueOf(c20567d.m107010r()));
        int m106995c = c20567d.m106995c();
        if (m106995c != -1) {
            contentValues.put("lastMsgCountUnread", Integer.valueOf(m106995c));
        }
        FirstUnreadMsg m106998f = c20567d.m106998f();
        if (m106998f != null) {
            contentValues.put("timestampFirstNew", m106998f.m41024c());
        } else {
            contentValues.put("timestampFirstNew", "");
        }
        LastDeliveredSeenData m106999g = c20567d.m106999g();
        if (m106999g != null) {
            contentValues.put("lastSeenDelivered", m106999g.m41030c());
        }
        if (c20567d.m107012t()) {
            str4 = "1";
        }
        contentValues.put("isDraftMsg", str4);
        contentValues.put("iTypeMsg", String.valueOf(c20567d.m107009q()));
        contentValues.put("state", "");
        contentValues.put("msg_state", Integer.valueOf(c20567d.m107001i()));
        int m106993a = c20567d.m106993a();
        if (m106993a > 0) {
            contentValues.put("cateMsg", String.valueOf(m106993a));
        }
        C7908f m107007o = c20567d.m107007o();
        if (m107007o != null && (m40877g = m107007o.m40877g()) != null) {
            str3 = m40877g;
        }
        contentValues.put("param1", str3);
        contentValues.put("param3", c20567d.m107002j());
        contentValues.put("newMessages", c20567d.m107004l());
        contentValues.put("conversationData", C31954i1.m153654g(c20567d.m106994b()));
        if (!TextUtils.isEmpty(c20567d.m107005m())) {
            contentValues.put("senderUid", c20567d.m107005m());
        }
        C3533a m106996d = c20567d.m106996d();
        if (m106996d != null) {
            contentValues.put("lastCientMsgIdSeen", m106996d.m17931z());
        }
        contentValues.put("lastMsgExtra", m41619Q(c20567d.m107008p()));
        contentValues.put("ex_data_1", c20567d.m107011s());
    }

    /* renamed from: I2 */
    private final String m41608I2(String str) {
        boolean m127120J;
        boolean m127125u;
        if (str == null || str.length() == 0) {
            return "";
        }
        m127120J = AbstractC24341v.m127120J(str, "{", false, 2, null);
        if (!m127120J) {
            m127125u = AbstractC24341v.m127125u(str, "}", false, 2, null);
            if (!m127125u) {
                return "";
            }
        }
        return str;
    }

    /* renamed from: J */
    public final void m41609J() {
        if (!m41773b2("clientmsgids")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s, %s, %s, %s, %s)", Arrays.copyOf(new Object[]{"clientmsgids", "uid_clientmsgids", "globalMsgId", "current_uid", "chat_id", "ack_data"}, 6));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* renamed from: L */
    public final void m41610L() {
        try {
            if (m41773b2("daily_download_res_msg_detail")) {
                return;
            }
            this.f43231a.mo2857x("CREATE TABLE daily_download_res_msg_detail ( current_uid, log_type INTEGER, date, thread_id, msg_type, hash INTEGER, is_sync INTEGER DEFAULT 0, is_newly_received INTEGER DEFAULT 0, queued_type INTEGER, dl_result_type INTEGER, is_roll_cleaned INTEGER DEFAULT 0)");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: M */
    public final void m41611M() {
        try {
            if (m41773b2("daily_download_res_thread_info")) {
                return;
            }
            this.f43231a.mo2857x("CREATE TABLE daily_download_res_thread_info ( current_uid, log_type INTEGER, date, thread_id, thread_size INTEGER DEFAULT 0, thread_type, rqc)");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: M3 */
    private final boolean m41612M3(String str, int i11, String str2, String str3, C24764f c24764f, List list) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("thread_size", Integer.valueOf(c24764f.m128729c()));
            contentValues.put("rqc", c24764f.m128728b());
            if (this.f43231a.mo2776q("daily_download_res_thread_info", contentValues, "current_uid = '" + str + "' AND log_type = " + i11 + " AND date = '" + str2 + "' AND thread_id = '" + str3 + "'" + m41680y(list), null) == 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: N */
    public final void m41613N() {
        if (!m41773b2("db_version")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            Locale locale = Locale.US;
            String format = String.format(locale, "create table %s (%s)", Arrays.copyOf(new Object[]{"db_version", "version"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
            InterfaceC0947y interfaceC0947y2 = this.f43231a;
            String format2 = String.format(locale, "insert into %s values (0)", Arrays.copyOf(new Object[]{"db_version"}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            interfaceC0947y2.mo2857x(format2);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: N0 */
    private final HashMap m41614N0(String str, int i11, String str2) {
        C7959d c7959d = this;
        HashMap hashMap = new HashMap();
        try {
            String str3 = "WHERE current_uid = '" + str + "' AND log_type = " + i11 + " AND date != '" + str2 + "'";
            int i12 = 0;
            while (c7959d.m41605G1("daily_download_res_msg_detail", str3, i12)) {
                InterfaceC0949z mo2777u = c7959d.f43231a.mo2777u("SELECT * FROM daily_download_res_msg_detail " + str3 + " LIMIT 500 OFFSET " + i12);
                if (mo2777u != null) {
                    while (mo2777u.next()) {
                        try {
                            try {
                                String string = mo2777u.getString(mo2777u.getColumnIndex("date"));
                                String string2 = mo2777u.getString(mo2777u.getColumnIndex("thread_id"));
                                HashMap hashMap2 = (HashMap) hashMap.get(string);
                                if (hashMap2 == null) {
                                    hashMap2 = new HashMap();
                                } else {
                                    AbstractC19074t.m100205c(hashMap2);
                                }
                                ArrayList arrayList = (ArrayList) hashMap2.get(string2);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                } else {
                                    AbstractC19074t.m100205c(arrayList);
                                }
                                String string3 = mo2777u.getString(mo2777u.getColumnIndex("thread_id"));
                                AbstractC19074t.m100207e(string3, "getString(...)");
                                String string4 = mo2777u.getString(mo2777u.getColumnIndex("msg_type"));
                                AbstractC19074t.m100207e(string4, "getString(...)");
                                arrayList.add(new C24761c(string3, string4, mo2777u.getInt(mo2777u.getColumnIndex("hash")), mo2777u.getInt(mo2777u.getColumnIndex("is_sync")), Integer.valueOf(mo2777u.getInt(mo2777u.getColumnIndex("queued_type"))), Integer.valueOf(mo2777u.getInt(mo2777u.getColumnIndex("dl_result_type"))), Integer.valueOf(mo2777u.getInt(mo2777u.getColumnIndex("is_newly_received"))), Integer.valueOf(mo2777u.getInt(mo2777u.getColumnIndex("is_roll_cleaned")))));
                                AbstractC19074t.m100205c(string2);
                                hashMap2.put(string2, arrayList);
                                AbstractC19074t.m100205c(string);
                                hashMap.put(string, hashMap2);
                            } catch (Exception e11) {
                                AbstractC20110a.f98889a.mo104552e(e11);
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2777u, null);
                i12 += ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                c7959d = this;
            }
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
        return hashMap;
    }

    /* renamed from: N3 */
    static /* synthetic */ boolean m41615N3(C7959d c7959d, String str, int i11, String str2, String str3, C24764f c24764f, List list, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            list = null;
        }
        return c7959d.m41612M3(str, i11, str2, str3, c24764f, list);
    }

    /* renamed from: O1 */
    private final void m41616O1(String str, int i11, String str2, String str3, C24761c c24761c) {
        InterfaceC0947y interfaceC0947y = this.f43231a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_uid", str);
        contentValues.put("log_type", Integer.valueOf(i11));
        contentValues.put("date", str2);
        contentValues.put("thread_id", str3);
        contentValues.put("msg_type", c24761c.m128703b());
        contentValues.put("hash", Integer.valueOf(c24761c.m128704c()));
        contentValues.put("is_sync", Integer.valueOf(c24761c.m128708g()));
        Integer m128706e = c24761c.m128706e();
        if (m128706e != null) {
            contentValues.put("is_newly_received", Integer.valueOf(m128706e.intValue()));
        }
        Integer m128705d = c24761c.m128705d();
        if (m128705d != null) {
            contentValues.put("queued_type", Integer.valueOf(m128705d.intValue()));
        }
        Integer m128702a = c24761c.m128702a();
        if (m128702a != null) {
            contentValues.put("dl_result_type", Integer.valueOf(m128702a.intValue()));
        }
        Integer m128707f = c24761c.m128707f();
        if (m128707f != null) {
            contentValues.put("is_roll_cleaned", Integer.valueOf(m128707f.intValue()));
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        interfaceC0947y.mo2771C("daily_download_res_msg_detail", null, contentValues);
    }

    /* renamed from: P */
    public final void m41617P() {
        try {
            if (!m41773b2("job_manager")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "CREATE TABLE %s (%s TEXT, %s TEXT, %s TEXT, %s TEXT, %s INTEGER DEFAULT 0 ,%s TEXT ,%s INTEGER  DEFAULT 0, %s INTEGER, %s INTEGER, %s TEXT, %s INTEGER, %s INTEGER ,%s INTEGER)", Arrays.copyOf(new Object[]{"job_manager", "job_id", "queue", "factory", "param", "result", "output_data", "show_result", "status", "ts", "userid", "resume_count", "retry_count", "auto_retry_count"}, 14));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC20110a.f98889a.mo104548a("createJobManagerTable: %s", format);
                this.f43231a.mo2857x(format);
            } else {
                AbstractC0937t.m4451b(this.f43231a, "job_manager", "userid", "TEXT", "''");
                AbstractC0937t.m4451b(this.f43231a, "job_manager", "resume_count", "INTEGER", "0");
                AbstractC0937t.m4451b(this.f43231a, "job_manager", "retry_count", "INTEGER", "0");
                AbstractC0937t.m4451b(this.f43231a, "job_manager", "auto_retry_count", "INTEGER", "0");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: P0 */
    private final HashMap m41618P0(String str, int i11, String str2, HashMap hashMap) {
        ArrayList arrayList;
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("date != '" + str2 + "'");
        try {
            InterfaceC0949z mo2777u = this.f43231a.mo2777u(m41594A(str, i11, arrayList2));
            if (mo2777u != null) {
                while (mo2777u.next()) {
                    try {
                        try {
                            String string = mo2777u.getString(mo2777u.getColumnIndex("date"));
                            String string2 = mo2777u.getString(mo2777u.getColumnIndex("thread_id"));
                            HashMap hashMap3 = (HashMap) hashMap2.get(string);
                            if (hashMap3 == null) {
                                hashMap3 = new HashMap();
                            } else {
                                AbstractC19074t.m100205c(hashMap3);
                            }
                            AbstractC19074t.m100205c(string2);
                            String string3 = mo2777u.getString(mo2777u.getColumnIndex("thread_type"));
                            AbstractC19074t.m100207e(string3, "getString(...)");
                            int i12 = mo2777u.getInt(mo2777u.getColumnIndex("thread_size"));
                            String string4 = mo2777u.getString(mo2777u.getColumnIndex("rqc"));
                            AbstractC19074t.m100207e(string4, "getString(...)");
                            HashMap hashMap4 = (HashMap) hashMap.get(string);
                            if (hashMap4 != null) {
                                arrayList = (ArrayList) hashMap4.get(string2);
                            } else {
                                arrayList = null;
                            }
                            hashMap3.put(string2, new C24764f(string3, i12, string4, arrayList));
                            AbstractC19074t.m100205c(string);
                            hashMap2.put(string, hashMap3);
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
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
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2777u, null);
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
        return hashMap2;
    }

    /* renamed from: Q */
    private final String m41619Q(long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastMsgTtl", j11);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: S */
    public final void m41620S() {
        if (!m41773b2("new_messages_2")) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s,%s integer default -1)", Arrays.copyOf(new Object[]{"new_messages_2", "currentUserUid", "uid", "clientMsgId", "displayName", "avatarUrl", "newMessages", "timestamp", "isMine", "unreadMessages", "lastMsgCountUnread", "isDraftMsg", "iTypeMsg", "state", "cateMsg", "param1", "param2", "param3", "timestampFirstNew", "lastSeenDelivered", "send_counter", "receive_counter", "ex_data_1", "lastCientMsgIdSeen", "senderUid", "conversationData", "conversationExtInfo", "lastMsgExtra", "msg_state"}, 29));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2857x(format);
        }
    }

    /* renamed from: U */
    public final void m41621U() {
        try {
            if (!m41773b2("TABLE_SENDING_MESSAGE")) {
                InterfaceC0947y interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "create table TABLE_SENDING_MESSAGE ( currentUserId,  clientMsgId INTEGER DEFAULT 0,  ts INTEGER DEFAULT 0,  ownerId)", Arrays.copyOf(new Object[0], 0));
                AbstractC19074t.m100207e(format, "format(...)");
                interfaceC0947y.mo2857x(format);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: U0 */
    public final String m41622U0(String str) {
        long j11;
        long j12;
        long j13;
        File file = new File(str);
        File parentFile = file.getParentFile();
        long j14 = -1;
        if (file.exists() && parentFile != null) {
            j11 = AbstractC23238v2.m119721f(parentFile.getPath());
        } else {
            j11 = -1;
        }
        if (file.exists()) {
            j12 = file.length();
        } else {
            j12 = -1;
        }
        String str2 = str + "-shm";
        File file2 = new File(str2);
        File file3 = new File(str + "-wal");
        if (file2.exists()) {
            j13 = file2.length();
        } else {
            j13 = -1;
        }
        if (file3.exists()) {
            j14 = file3.length();
        }
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "freeSpace: %d = fileSize: %d = shmSize: %d = walSize: %d", Arrays.copyOf(new Object[]{Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14)}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: V */
    public final void m41623V() {
        try {
            if (!m41773b2("sync_media_zip_metadata")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "CREATE TABLE %s (%s TEXT, %s TEXT, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT)", Arrays.copyOf(new Object[]{"sync_media_zip_metadata", "userId", "name", "gId", "size", "ts", "checksumMd5"}, 7));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC20110a.f98889a.mo104548a("createSyncMediaZipMetadataTable: %s", format);
                this.f43231a.mo2857x(format);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: V0 */
    public final int m41624V0() {
        InterfaceC0947y interfaceC0947y = this.f43231a;
        C19067n0 c19067n0 = C19067n0.f94947a;
        int i11 = 0;
        String format = String.format(Locale.US, "select version from %s", Arrays.copyOf(new Object[]{"db_version"}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        InterfaceC0949z mo2777u = interfaceC0947y.mo2777u(format);
        if (mo2777u.next()) {
            i11 = mo2777u.getInt(mo2777u.getColumnIndex("version"));
        }
        mo2777u.close();
        return i11;
    }

    /* renamed from: W */
    public final void m41625W() {
        try {
            if (!m41773b2("sync_session_resumable")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "CREATE TABLE %s (%s TEXT, %s TEXT, %s TEXT, %s TEXT, %s INTEGER)", Arrays.copyOf(new Object[]{"sync_session_resumable", "userId", "name", "checksumMd5", "sessionURL", "ts"}, 6));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC20110a.f98889a.mo104548a("createSyncSessionResumableTable: %s", format);
                this.f43231a.mo2857x(format);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: W0 */
    private final String m41626W0(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!z11) {
                sb2.append(", ");
            } else {
                z11 = false;
            }
            sb2.append("'" + str + "'");
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: X */
    public final void m41627X() {
        try {
            if (!m41773b2("sync_signature")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "CREATE TABLE %s (%s TEXT PRIMARY KEY, %s TEXT)", Arrays.copyOf(new Object[]{"sync_signature", "userId", "signature"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                this.f43231a.mo2857x(format);
            }
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Z */
    public final void m41628Z() {
        if (!m41773b2("my_cloud_collection_info")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s TEXT NOT NULL, %s LONG NOT NULL, %s, %s INTEGER, %s LONG, %s, %s LONG, %s, %s LONG, %s, %s INTEGER)", Arrays.copyOf(new Object[]{"my_cloud_collection_info", "user_id", "collection_id", "collection_name", "size", "created_time", "thumb", "last_modified_time", "description", "last_modified_item_time", "state_load_item", "is_pin"}, 12));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* renamed from: a0 */
    public final void m41630a0() {
        if (!m41773b2("my_cloud_collection_item")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s TEXT NOT NULL, %s LONG NOT NULL, %s, %s, %s LONG)", Arrays.copyOf(new Object[]{"my_cloud_collection_item", "user_id", "collection_id", "client_msg_id", "global_msg_id", "add_time"}, 6));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* renamed from: a2 */
    private final void m41631a2(String str, int i11, String str2, String str3, C24764f c24764f) {
        InterfaceC0947y interfaceC0947y = this.f43231a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_uid", str);
        contentValues.put("log_type", Integer.valueOf(i11));
        contentValues.put("date", str2);
        contentValues.put("thread_id", str3);
        contentValues.put("thread_type", c24764f.m128730d());
        contentValues.put("thread_size", Integer.valueOf(c24764f.m128729c()));
        contentValues.put("rqc", c24764f.m128728b());
        C24848g0 c24848g0 = C24848g0.f119245a;
        interfaceC0947y.mo2771C("daily_download_res_thread_info", null, contentValues);
    }

    /* renamed from: b0 */
    public final void m41633b0() {
        if (!m41773b2("pull_msg_offline")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s TEXT NOT NULL, %s, %s integer, %s integer, %s integer, %s integer)", Arrays.copyOf(new Object[]{"pull_msg_offline", "userId", "ownerId", "fromMsgId", "toGlobalMsgId", "toClientMsgId", "needDelete"}, 7));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* renamed from: c0 */
    public final void m41635c0() {
        if (!m41773b2("send_seen_reaction")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s TEXT NOT NULL, %s LONG)", Arrays.copyOf(new Object[]{"send_seen_reaction", "conversationId", "reactionId"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* renamed from: d0 */
    public final void m41637d0() {
        if (!m41773b2("sync_cloud_msg_info")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s TEXT NOT NULL, %s, %s integer, %s integer, %s integer, %s integer, %s integer, %s integer, %s integer, %s integer, %s)", Arrays.copyOf(new Object[]{"sync_cloud_msg_info", "userId", "ownerId", "numMember", "totalSessionLoad", "startTimeSync", "endTimeSync", "totalMsgStartSync", "totalMsgEndSync", "numMsgLoaded", "stateLoad", "sessionId"}, 12));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* renamed from: d1 */
    public static final synchronized C7959d m41638d1() {
        C7959d m41850e;
        synchronized (C7959d.class) {
            m41850e = Companion.m41850e();
        }
        return m41850e;
    }

    /* renamed from: e0 */
    public final void m41640e0() {
        try {
            if (!m41773b2("sync_photo_cache")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "CREATE TABLE %s (%s TEXT, %s INTEGER, %s TEXT, %s TEXT, %s TEXT, %s INTEGER, %s INTEGER, %s TEXT, %s TEXT, %s TEXT, %s TEXT)", Arrays.copyOf(new Object[]{"sync_photo_cache", "userId", "sequenseId", "md5", "gid", "mime_type", "size", "ts", "zipParentName", "senderId", "clientMsgId", "ownerId"}, 12));
                AbstractC19074t.m100207e(format, "format(...)");
                AbstractC20110a.f98889a.mo104548a("createTableSyncPhotoCache: %s", format);
                this.f43231a.mo2857x(format);
            } else {
                AbstractC0937t.m4450a(this.f43231a, "sync_photo_cache", "zipParentName");
                AbstractC0937t.m4450a(this.f43231a, "sync_photo_cache", "senderId");
                AbstractC0937t.m4450a(this.f43231a, "sync_photo_cache", "clientMsgId");
                AbstractC0937t.m4450a(this.f43231a, "sync_photo_cache", "ownerId");
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f2 */
    private final void m41642f2(InterfaceC0949z interfaceC0949z, C3556x c3556x) {
        if (interfaceC0949z != null) {
            try {
                if (interfaceC0949z.next()) {
                    HashMap hashMap = new HashMap();
                    do {
                        Conversation m41647h2 = m41647h2(interfaceC0949z, c3556x);
                        if (m41647h2 != null) {
                            String str = m41647h2.f42893q;
                            long m41008l = m41647h2.m41008l();
                            if (hashMap.get(str) != null) {
                                Object obj = hashMap.get(str);
                                AbstractC19074t.m100205c(obj);
                                if (((Conversation) obj).m41008l() < m41008l) {
                                }
                            }
                            hashMap.put(str, m41647h2);
                        }
                    } while (interfaceC0949z.next());
                    c3556x.m18068a(new ArrayList(hashMap.values()));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: f3 */
    private final void m41643f3(InterfaceC0947y interfaceC0947y, int i11) {
        AbstractC20110a.f98889a.mo104556o(8, "updateDbVersion(). New version: " + i11, new Object[0]);
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "update %s set %s = %s where 1", Arrays.copyOf(new Object[]{"db_version", "version", Integer.valueOf(i11)}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        interfaceC0947y.mo2774n(format);
    }

    /* renamed from: g1 */
    private final Map m41645g1() {
        HashMap hashMap = new HashMap();
        try {
            InterfaceC0949z mo2777u = this.f43231a.mo2777u("SELECT currentUserId, ownerId, clientMsgId, globalMsgId, senderUid, ttl, MAX(ts) mts FROM TABLE_MESSAGE_TTL_V2 GROUP BY currentUserId, ownerId");
            if (mo2777u != null) {
                try {
                    int columnIndex = mo2777u.getColumnIndex("currentUserId");
                    int columnIndex2 = mo2777u.getColumnIndex("ownerId");
                    int columnIndex3 = mo2777u.getColumnIndex("senderUid");
                    int columnIndex4 = mo2777u.getColumnIndex("clientMsgId");
                    int columnIndex5 = mo2777u.getColumnIndex("globalMsgId");
                    int columnIndex6 = mo2777u.getColumnIndex("ttl");
                    int columnIndex7 = mo2777u.getColumnIndex("mts");
                    while (mo2777u.next()) {
                        String string = mo2777u.getString(columnIndex);
                        String string2 = mo2777u.getString(columnIndex2);
                        String string3 = mo2777u.getString(columnIndex3);
                        String string4 = mo2777u.getString(columnIndex4);
                        String string5 = mo2777u.getString(columnIndex5);
                        int i11 = columnIndex2;
                        int i12 = columnIndex3;
                        long j11 = mo2777u.getLong(columnIndex6);
                        int i13 = columnIndex4;
                        int i14 = columnIndex5;
                        long j12 = mo2777u.getLong(columnIndex7);
                        int i15 = columnIndex;
                        MessageId.C7932a c7932a = MessageId.Companion;
                        AbstractC19074t.m100205c(string2);
                        AbstractC19074t.m100205c(string3);
                        MessageId m41066e = c7932a.m41066e(string4, string5, string2, string3);
                        if (m41066e != null) {
                            C17945a0 m95365a = new C17945a0.w(m41066e, 0).m95359K(j12).m95361M(j11).m95365a();
                            AbstractC19074t.m100207e(m95365a, "build(...)");
                            List list = (List) hashMap.get(string);
                            if (list == null) {
                                list = new ArrayList();
                                AbstractC19074t.m100205c(string);
                                hashMap.put(string, list);
                            }
                            list.add(m95365a);
                        }
                        columnIndex2 = i11;
                        columnIndex3 = i12;
                        columnIndex4 = i13;
                        columnIndex5 = i14;
                        columnIndex = i15;
                    }
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2777u, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e6 A[Catch: Exception -> 0x011a, TryCatch #4 {Exception -> 0x011a, blocks: (B:5:0x00e5, B:8:0x00f9, B:9:0x011f, B:11:0x0125, B:23:0x0176, B:26:0x017f, B:28:0x01a8, B:30:0x01ac, B:32:0x01b5, B:33:0x01bd, B:36:0x01e2, B:38:0x01e6, B:41:0x01f4, B:43:0x0209, B:44:0x020c, B:46:0x021e, B:47:0x0227, B:49:0x022b, B:50:0x0232, B:56:0x0246, B:61:0x0248, B:62:0x0249, B:64:0x024a, B:87:0x01dc, B:93:0x016b, B:52:0x0233, B:54:0x0239, B:55:0x0244, B:14:0x0146, B:16:0x0156, B:18:0x0161), top: B:4:0x00e5, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f4 A[Catch: Exception -> 0x011a, TryCatch #4 {Exception -> 0x011a, blocks: (B:5:0x00e5, B:8:0x00f9, B:9:0x011f, B:11:0x0125, B:23:0x0176, B:26:0x017f, B:28:0x01a8, B:30:0x01ac, B:32:0x01b5, B:33:0x01bd, B:36:0x01e2, B:38:0x01e6, B:41:0x01f4, B:43:0x0209, B:44:0x020c, B:46:0x021e, B:47:0x0227, B:49:0x022b, B:50:0x0232, B:56:0x0246, B:61:0x0248, B:62:0x0249, B:64:0x024a, B:87:0x01dc, B:93:0x016b, B:52:0x0233, B:54:0x0239, B:55:0x0244, B:14:0x0146, B:16:0x0156, B:18:0x0161), top: B:4:0x00e5, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021e A[Catch: Exception -> 0x011a, TryCatch #4 {Exception -> 0x011a, blocks: (B:5:0x00e5, B:8:0x00f9, B:9:0x011f, B:11:0x0125, B:23:0x0176, B:26:0x017f, B:28:0x01a8, B:30:0x01ac, B:32:0x01b5, B:33:0x01bd, B:36:0x01e2, B:38:0x01e6, B:41:0x01f4, B:43:0x0209, B:44:0x020c, B:46:0x021e, B:47:0x0227, B:49:0x022b, B:50:0x0232, B:56:0x0246, B:61:0x0248, B:62:0x0249, B:64:0x024a, B:87:0x01dc, B:93:0x016b, B:52:0x0233, B:54:0x0239, B:55:0x0244, B:14:0x0146, B:16:0x0156, B:18:0x0161), top: B:4:0x00e5, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022b A[Catch: Exception -> 0x011a, TryCatch #4 {Exception -> 0x011a, blocks: (B:5:0x00e5, B:8:0x00f9, B:9:0x011f, B:11:0x0125, B:23:0x0176, B:26:0x017f, B:28:0x01a8, B:30:0x01ac, B:32:0x01b5, B:33:0x01bd, B:36:0x01e2, B:38:0x01e6, B:41:0x01f4, B:43:0x0209, B:44:0x020c, B:46:0x021e, B:47:0x0227, B:49:0x022b, B:50:0x0232, B:56:0x0246, B:61:0x0248, B:62:0x0249, B:64:0x024a, B:87:0x01dc, B:93:0x016b, B:52:0x0233, B:54:0x0239, B:55:0x0244, B:14:0x0146, B:16:0x0156, B:18:0x0161), top: B:4:0x00e5, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0252 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dc A[Catch: Exception -> 0x011a, TryCatch #4 {Exception -> 0x011a, blocks: (B:5:0x00e5, B:8:0x00f9, B:9:0x011f, B:11:0x0125, B:23:0x0176, B:26:0x017f, B:28:0x01a8, B:30:0x01ac, B:32:0x01b5, B:33:0x01bd, B:36:0x01e2, B:38:0x01e6, B:41:0x01f4, B:43:0x0209, B:44:0x020c, B:46:0x021e, B:47:0x0227, B:49:0x022b, B:50:0x0232, B:56:0x0246, B:61:0x0248, B:62:0x0249, B:64:0x024a, B:87:0x01dc, B:93:0x016b, B:52:0x0233, B:54:0x0239, B:55:0x0244, B:14:0x0146, B:16:0x0156, B:18:0x0161), top: B:4:0x00e5, inners: #1, #3 }] */
    /* renamed from: h2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Conversation m41647h2(InterfaceC0949z interfaceC0949z, C3556x c3556x) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        long j11;
        boolean z11;
        int i11;
        int m4458i;
        int i12;
        int i13;
        String string7;
        int i14;
        int i15;
        String string8;
        String string9;
        String m41608I2;
        long m41598C1;
        MessageId.C7932a c7932a;
        int i16;
        int i17;
        boolean z12;
        boolean z13;
        C31924g1 c31924g1;
        Conversation conversation;
        JSONObject m117932a;
        C7908f m40878a;
        C3556x c3556x2;
        LastDeliveredSeenData m41031a;
        int columnIndex;
        String str;
        try {
            string = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("uid"));
            string2 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("senderUid"));
            string3 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("clientMsgId"));
            string4 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("displayName"));
            string5 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("avatarUrl"));
            string6 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("param3"));
            j11 = interfaceC0949z.getLong(interfaceC0949z.getColumnIndex("timestamp"));
            z11 = !interfaceC0949z.getString(interfaceC0949z.getColumnIndex("isMine")).equals("0");
            i11 = interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("unreadMessages"));
            m4458i = AbstractC0937t.m4458i(interfaceC0949z, "lastMsgCountUnread", -1);
            i12 = interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("isDraftMsg"));
            i13 = interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("iTypeMsg"));
            string7 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("state"));
            i14 = interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("msg_state"));
            i15 = interfaceC0949z.getInt(interfaceC0949z.getColumnIndex("cateMsg"));
            string8 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("param1"));
            string9 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("newMessages"));
            m41608I2 = m41608I2(interfaceC0949z.getString(interfaceC0949z.getColumnIndex("ex_data_1")));
            String string10 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("lastMsgExtra"));
            AbstractC19074t.m100207e(string10, "getString(...)");
            m41598C1 = m41598C1(string10);
            c7932a = MessageId.Companion;
        } catch (Exception e11) {
            e = e11;
        }
        try {
            AbstractC19074t.m100205c(string);
            AbstractC19074t.m100205c(string2);
            MessageId m41066e = c7932a.m41066e(string3, "", string, string2);
            if (m41598C1 != 0 && m41066e != null) {
                C17945a0 m95365a = new C17945a0.w(m41066e, 0).m95361M(m41598C1).m95377m(true).m95359K(j11).m95365a();
                C0833n0 c0833n0 = C0833n0.f2934p;
                AbstractC19074t.m100205c(m95365a);
                c0833n0.m2208g(m95365a, false);
            }
            if (!TextUtils.isEmpty(string7)) {
                C20092b c20092b = C20092b.f98828a;
                int intValue = ((Number) c20092b.m104480g(AbstractC29239n.m146002a(string7, 0), -1, false).m129213a()).intValue();
                i13 = c20092b.m104479f(i13);
                i16 = intValue;
            } else {
                i16 = i14;
            }
            try {
                String string11 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("lastCientMsgIdSeen"));
                if (!TextUtils.isEmpty(string11)) {
                    C3533a.a aVar = C3533a.Companion;
                    AbstractC19074t.m100205c(string11);
                    C3533a m17932a = aVar.m17932a(string11, string);
                    if (m17932a != null) {
                        AbstractC23306f.m120584H0().m2617U(string, m17932a);
                    }
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e12);
            }
            if (i15 < 1) {
                i17 = 1;
            } else {
                i17 = i15;
            }
            if (i12 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            C18446h c18446h = new C18446h(i13, m41066e, j11, z12, z11, i16, -1, m41598C1, m41608I2);
            AbstractC19074t.m100205c(string6);
            c18446h.m97761z(string6);
            AbstractC19074t.m100205c(string9);
            c18446h.m97742C(string9);
            C31954i1 m153652d = C31954i1.m153652d(interfaceC0949z.getBlob(interfaceC0949z.getColumnIndex("conversationData")));
            if (m153652d != null && (str = m153652d.f146855a) != null) {
                z13 = false;
                JSONObject m117933b = AbstractC23008a2.m117933b(str, false, 1, null);
                if (m117933b != null) {
                    c31924g1 = new C31924g1(m117933b);
                    c18446h.m97741B(c31924g1);
                    AbstractC19074t.m100205c(string4);
                    AbstractC19074t.m100205c(string5);
                    conversation = new Conversation(string, string4, string5, c18446h);
                    conversation.f42897u = i17;
                    m117932a = AbstractC23008a2.m117932a(string8, true);
                    if (m117932a != null) {
                        m40878a = null;
                    } else {
                        m40878a = C7908f.Companion.m40878a(m117932a);
                    }
                    conversation.f42898v = m40878a;
                    if (i11 <= 0) {
                        c3556x2 = c3556x;
                        c3556x2.m18077j(string, i11);
                    } else {
                        c3556x2 = c3556x;
                    }
                    if (m4458i != -1) {
                        c3556x2.m18076i(string, m4458i);
                        FirstUnreadMsg m41025a = FirstUnreadMsg.Companion.m41025a(interfaceC0949z.getString(interfaceC0949z.getColumnIndex("timestampFirstNew")));
                        if (m41025a != null) {
                            c3556x2.m18075h(string, m41025a);
                        }
                    }
                    m41031a = LastDeliveredSeenData.Companion.m41031a(interfaceC0949z.getString(interfaceC0949z.getColumnIndex("lastSeenDelivered")));
                    if (m41031a != null) {
                        C19636i1.Companion.m102800a().m102769f0(string, m41031a);
                    }
                    if (conversation.f42898v != null) {
                        Map map = AbstractC23304d.f113417o;
                        AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                        synchronized (map) {
                            try {
                                if (!map.containsKey(string)) {
                                    AbstractC19074t.m100207e(map, "mMsgSrcTypePageMap");
                                    map.put(string, string);
                                }
                                C24848g0 c24848g0 = C24848g0.f119245a;
                            } finally {
                            }
                        }
                    }
                    columnIndex = interfaceC0949z.getColumnIndex("conversationExtInfo");
                    if (columnIndex < 0) {
                        try {
                            String string12 = interfaceC0949z.getString(columnIndex);
                            C28266a m142390a = C28266a.Companion.m142390a(string12, string);
                            if (m142390a != null) {
                                C24261h.Companion.m126656b().m126642Q(string, m142390a, z13);
                                c3556x2.m18079l(string, m142390a);
                            }
                            try {
                                c3556x2.m18078k(string, m41601E1(string12));
                            } catch (Exception e13) {
                                e = e13;
                                try {
                                    AbstractC20110a.f98889a.mo104552e(e);
                                    return conversation;
                                } catch (Exception e14) {
                                    e = e14;
                                    AbstractC20110a.f98889a.mo104552e(e);
                                    return null;
                                }
                            }
                        } catch (Exception e15) {
                            e = e15;
                        }
                    }
                    return conversation;
                }
            } else {
                z13 = false;
            }
            c31924g1 = null;
            c18446h.m97741B(c31924g1);
            AbstractC19074t.m100205c(string4);
            AbstractC19074t.m100205c(string5);
            conversation = new Conversation(string, string4, string5, c18446h);
            conversation.f42897u = i17;
            m117932a = AbstractC23008a2.m117932a(string8, true);
            if (m117932a != null) {
            }
            conversation.f42898v = m40878a;
            if (i11 <= 0) {
            }
            if (m4458i != -1) {
            }
            m41031a = LastDeliveredSeenData.Companion.m41031a(interfaceC0949z.getString(interfaceC0949z.getColumnIndex("lastSeenDelivered")));
            if (m41031a != null) {
            }
            if (conversation.f42898v != null) {
            }
            columnIndex = interfaceC0949z.getColumnIndex("conversationExtInfo");
            if (columnIndex < 0) {
            }
            return conversation;
        } catch (Exception e16) {
            e = e16;
            AbstractC20110a.f98889a.mo104552e(e);
            return null;
        }
    }

    /* renamed from: k2 */
    private final void m41651k2(InterfaceC0947y interfaceC0947y, int i11) {
        if (i11 != 0) {
            AbstractC0924m0.m2910Ai(AbstractC23160o0.m119227X(AbstractC23306f.m120579F1().mo124314i()));
        }
    }

    /* renamed from: l3 */
    private final int m41653l3(String str, ContentValues contentValues) {
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        return m41655m3(str2, str, contentValues);
    }

    /* renamed from: m3 */
    private final int m41655m3(String str, String str2, ContentValues contentValues) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, " %s = ? AND %s = ? ", Arrays.copyOf(new Object[]{"currentUserUid", "uid"}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        return this.f43231a.mo2776q("new_messages_2", contentValues, format, new String[]{str, str2});
    }

    /* renamed from: p3 */
    private final void m41659p3(String str, C17945a0 c17945a0) {
        try {
            try {
                this.f43235e.acquire();
                ContentValues contentValues = new ContentValues();
                contentValues.put("lastMsgExtra", m41619Q(c17945a0.m95030V4()));
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                m41655m3(str, mo95039W2, contentValues);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: r0 */
    private final int m41662r0(String str, String str2) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, " %s = ? AND %s = ? ", Arrays.copyOf(new Object[]{"currentUserUid", "uid"}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        return this.f43231a.mo2770B("new_messages_2", format, new String[]{str, str2});
    }

    /* renamed from: r1 */
    private final ContentValues m41663r1(Conversation conversation) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentUserUid", CoreUtility.f89233i);
        contentValues.put("uid", conversation.f42893q);
        contentValues.put("displayName", conversation.f42894r);
        contentValues.put("avatarUrl", conversation.f42895s);
        return contentValues;
    }

    /* renamed from: r2 */
    private final void m41664r2(InterfaceC0947y interfaceC0947y) {
        if (!this.f43234d) {
            return;
        }
        AbstractC0937t.m4452c(interfaceC0947y, "chat_content", "sequenseId");
    }

    /* renamed from: s2 */
    private final void m41666s2(InterfaceC0947y interfaceC0947y, int i11) {
        if (i11 != 0) {
            AbstractC0937t.m4450a(interfaceC0947y, "clientmsgids", "ack_data");
        }
    }

    /* renamed from: t1 */
    public static final String m41668t1() {
        return Companion.m41851f();
    }

    /* renamed from: u1 */
    public static final String m41670u1() {
        return Companion.m41853h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x0406, code lost:            if (r4 < 86) goto L404;     */
    /* renamed from: u2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41671u2(int i11) {
        int i12;
        Throwable th2;
        int i13;
        Exception e11;
        AbstractC20110a.a aVar;
        try {
            try {
                aVar = AbstractC20110a.f98889a;
                aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Old version: " + i11 + ". Start...", new Object[0]);
                i13 = 15;
                if (i11 < 15) {
                    m41804l2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 15", new Object[0]);
                    } catch (Exception e12) {
                        e11 = e12;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    }
                } else {
                    i13 = i11;
                }
                if (i13 < 20) {
                    m41807m2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 20", new Object[0]);
                        i13 = 20;
                    } catch (Exception e13) {
                        e11 = e13;
                        i13 = 20;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i12 = 20;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 21) {
                    m41845z2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 21", new Object[0]);
                        i13 = 21;
                    } catch (Exception e14) {
                        e11 = e14;
                        i13 = 21;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th4) {
                        th2 = th4;
                        i12 = 21;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 34) {
                    m41810n2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 34", new Object[0]);
                        i13 = 34;
                    } catch (Exception e15) {
                        e11 = e15;
                        i13 = 34;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th5) {
                        th2 = th5;
                        i12 = 34;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 35) {
                    m41814o2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 35", new Object[0]);
                        i13 = 35;
                    } catch (Exception e16) {
                        e11 = e16;
                        i13 = 35;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th6) {
                        th2 = th6;
                        i12 = 35;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 38) {
                    m41685A2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 38", new Object[0]);
                        i13 = 38;
                    } catch (Exception e17) {
                        e11 = e17;
                        i13 = 38;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th7) {
                        th2 = th7;
                        i12 = 38;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 40) {
                    m41688B2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 40", new Object[0]);
                        i13 = 40;
                    } catch (Exception e18) {
                        e11 = e18;
                        i13 = 40;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th8) {
                        th2 = th8;
                        i12 = 40;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 42) {
                    AbstractC0937t.m4450a(this.f43231a, "new_messages_2", "conversationData");
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 42", new Object[0]);
                        i13 = 42;
                    } catch (Exception e19) {
                        e11 = e19;
                        i13 = 42;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th9) {
                        th2 = th9;
                        i12 = 42;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 45) {
                    AbstractC0937t.m4450a(this.f43231a, "new_messages_2", "conversationExtInfo");
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 45", new Object[0]);
                        i13 = 45;
                    } catch (Exception e21) {
                        e11 = e21;
                        i13 = 45;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th10) {
                        th2 = th10;
                        i12 = 45;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 49) {
                    m41818p2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 49", new Object[0]);
                        i13 = 49;
                    } catch (Exception e22) {
                        e11 = e22;
                        i13 = 49;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th11) {
                        th2 = th11;
                        i12 = 49;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 52) {
                    m41821q2(this.f43231a);
                    m41828t2(this.f43231a);
                    m41695D2(this.f43231a);
                    m41841y2(this.f43231a);
                    m41691C2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 52", new Object[0]);
                        i13 = 52;
                    } catch (Exception e23) {
                        e11 = e23;
                        i13 = 52;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th12) {
                        th2 = th12;
                        i12 = 52;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 55) {
                    m41640e0();
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 55", new Object[0]);
                        i13 = 55;
                    } catch (Exception e24) {
                        e11 = e24;
                        i13 = 55;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th13) {
                        th2 = th13;
                        i12 = 55;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 56) {
                    if (!AbstractC0937t.m4454e(this.f43231a, "deletemessages_v1", "msgType")) {
                        AbstractC0937t.m4451b(this.f43231a, "deletemessages_v1", "msgType", "INTEGER", "0");
                    }
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 56", new Object[0]);
                        i13 = 56;
                    } catch (Exception e25) {
                        e11 = e25;
                        i13 = 56;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th14) {
                        th2 = th14;
                        i12 = 56;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 59) {
                    m41664r2(this.f43231a);
                    try {
                        aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 59", new Object[0]);
                        i13 = 59;
                    } catch (Exception e26) {
                        e11 = e26;
                        i13 = 59;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th15) {
                        th2 = th15;
                        i12 = 59;
                        m41782e3(i12);
                        throw th2;
                    }
                }
                if (i13 < 60) {
                    m41617P();
                    i13 = 60;
                }
                if (i13 < 65) {
                    m41695D2(this.f43231a);
                    m41841y2(this.f43231a);
                    i13 = 65;
                    aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 65", new Object[0]);
                }
                if (i13 < 68) {
                    m41674v2(this.f43231a);
                    i13 = 68;
                    aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 68", new Object[0]);
                }
                if (i13 < 70) {
                    this.f43231a.mo2857x("drop table if exists chat_search_v2_text");
                    this.f43231a.mo2857x("drop table if exists chat_search_v2_other");
                    i13 = 70;
                    aVar.mo104556o(8, "migrateDB(). Migrated version: 70", new Object[0]);
                }
                if (i13 < 73) {
                    m41623V();
                    m41602E2(this.f43231a);
                    i13 = 73;
                    aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 73", new Object[0]);
                }
                if (i13 < 78) {
                    m41604F2(this.f43231a);
                    i13 = 78;
                    aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). Migrated version: 78", new Object[0]);
                }
                if (i13 < 79) {
                    i13 = 79;
                    m41677w2(this.f43231a);
                    aVar.mo104556o(8, "migrateDB(). Migrated version: 79", new Object[0]);
                }
                if (i13 < 84) {
                    i13 = 84;
                    m41838x2(this.f43231a);
                    aVar.mo104556o(8, "migrateDB(). Migrated version: 84", new Object[0]);
                }
                if (i13 < 85) {
                    try {
                        m41651k2(this.f43231a, i11);
                        aVar.mo104556o(8, "migrateDB(). Migrated version: 85", new Object[0]);
                    } catch (Exception e27) {
                        e11 = e27;
                        i13 = 85;
                        AbstractC20110a.f98889a.mo104552e(e11);
                        m41782e3(i13);
                    } catch (Throwable th16) {
                        th2 = th16;
                        i12 = 85;
                        m41782e3(i12);
                        throw th2;
                    }
                }
            } catch (Exception e28) {
                i13 = i11;
                e11 = e28;
            } catch (Throwable th17) {
                i12 = i11;
                th2 = th17;
            }
            try {
                m41666s2(this.f43231a, i11);
                aVar.mo104556o(8, "migrateDB(). Migrated version: 86", new Object[0]);
                aVar.m104564x("DatabaseChatHelper").mo104556o(8, "migrateDB(). New version: 86. Finish...", new Object[0]);
                m41782e3(86);
            } catch (Exception e29) {
                e11 = e29;
                i13 = 86;
                AbstractC20110a.f98889a.mo104552e(e11);
                m41782e3(i13);
            } catch (Throwable th18) {
                th2 = th18;
                i12 = 86;
                m41782e3(i12);
                throw th2;
            }
        } catch (Throwable th19) {
            th2 = th19;
        }
    }

    /* renamed from: u3 */
    private final boolean m41672u3(String str, int i11, String str2, String str3, C24761c c24761c, List list) {
        try {
            ContentValues contentValues = new ContentValues();
            Integer m128705d = c24761c.m128705d();
            if (m128705d != null) {
                contentValues.put("queued_type", Integer.valueOf(m128705d.intValue()));
            }
            Integer m128702a = c24761c.m128702a();
            if (m128702a != null) {
                contentValues.put("dl_result_type", Integer.valueOf(m128702a.intValue()));
            }
            Integer m128706e = c24761c.m128706e();
            if (m128706e != null) {
                contentValues.put("is_newly_received", Integer.valueOf(m128706e.intValue()));
            }
            Integer m128707f = c24761c.m128707f();
            if (m128707f != null) {
                contentValues.put("is_roll_cleaned", Integer.valueOf(m128707f.intValue()));
            }
            if (contentValues.size() == 0) {
                return false;
            }
            if (this.f43231a.mo2776q("daily_download_res_msg_detail", contentValues, "current_uid = '" + str + "' AND log_type = " + i11 + " AND date = '" + str2 + "' AND thread_id = '" + str3 + "' AND hash = " + c24761c.m128704c() + m41680y(list), null) == 0) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:            if (r1.next() != false) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:            r3 = r1.getString(r1.getColumnIndex("uid"));        r4 = ck.C3562c.Companion;        r6 = r1.getString(r1.getColumnIndex("conversationExtInfo"));        fn0.AbstractC19074t.m100205c(r3);        r4 = r4.m18096a(r6, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:            if (r4 == null) goto L57;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:            m41811n3(r3, r4.f15088a);     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:            r3 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:            mm0.AbstractC23350e.m122776f("DatabaseChatHelper", r3);     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m41674v2(InterfaceC0947y interfaceC0947y) {
        InterfaceC0949z mo2775p;
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "lastMsgCountUnread");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("SELECT %s, %s FROM %s WHERE %s = ?", Arrays.copyOf(new Object[]{"uid", "conversationExtInfo", "new_messages_2", "currentUserUid"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            mo2775p = interfaceC0947y.mo2775p(format, CoreUtility.f89233i);
            if (mo2775p != null) {
                try {
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC3601a.m18219a(mo2775p, th2);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
        AbstractC0937t.m4452c(interfaceC0947y, "new_messages_2", "uid");
        if (!this.f43234d) {
            AbstractC0937t.m4452c(interfaceC0947y, "chat_content", "receiverUid");
            AbstractC0937t.m4452c(interfaceC0947y, "chat_content", "metadata_2");
            return;
        }
        return;
        if (!mo2775p.next()) {
            C24848g0 c24848g02 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
            AbstractC0937t.m4452c(interfaceC0947y, "new_messages_2", "uid");
            if (!this.f43234d) {
            }
        }
    }

    /* renamed from: v3 */
    static /* synthetic */ boolean m41675v3(C7959d c7959d, String str, int i11, String str2, String str3, C24761c c24761c, List list, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            list = null;
        }
        return c7959d.m41672u3(str, i11, str2, str3, c24761c, list);
    }

    /* renamed from: w2 */
    private final void m41677w2(InterfaceC0947y interfaceC0947y) {
        AbstractC0937t.m4451b(interfaceC0947y, "new_messages_2", "msg_state", "INTEGER", "-1");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "lastMsgExtra");
    }

    /* renamed from: w3 */
    private final void m41678w3(String str, int i11, String str2, HashMap hashMap) {
        try {
            try {
                try {
                    if (!this.f43231a.isOpen()) {
                        try {
                            if (this.f43231a.isOpen()) {
                                this.f43231a.mo2850l();
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                            return;
                        }
                    }
                    this.f43231a.mo2845e();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        try {
                            String str3 = (String) entry.getKey();
                            C24764f c24764f = (C24764f) entry.getValue();
                            List m128727a = c24764f.m128727a();
                            if (m128727a != null && !m128727a.isEmpty()) {
                                m41600D3(str, i11, str2, str3, c24764f);
                            }
                        } catch (Exception e12) {
                            AbstractC20110a.f98889a.mo104552e(e12);
                        }
                    }
                    if (!this.f43231a.isOpen()) {
                        try {
                            if (this.f43231a.isOpen()) {
                                this.f43231a.mo2850l();
                                return;
                            }
                            return;
                        } catch (Exception e13) {
                            AbstractC20110a.f98889a.mo104552e(e13);
                            return;
                        }
                    }
                    this.f43231a.mo2849k();
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                    }
                } catch (Exception e14) {
                    AbstractC20110a.f98889a.mo104552e(e14);
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                    }
                }
            } catch (Exception e15) {
                AbstractC20110a.f98889a.mo104552e(e15);
            }
        } catch (Throwable th2) {
            try {
                if (this.f43231a.isOpen()) {
                    this.f43231a.mo2850l();
                }
            } catch (Exception e16) {
                AbstractC20110a.f98889a.mo104552e(e16);
            }
            throw th2;
        }
    }

    /* renamed from: x3 */
    private final void m41679x3(String str, int i11, String str2, Map map) {
        try {
            try {
                try {
                    if (!this.f43231a.isOpen()) {
                        try {
                            if (this.f43231a.isOpen()) {
                                this.f43231a.mo2850l();
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                            return;
                        }
                    }
                    this.f43231a.mo2845e();
                    for (Map.Entry entry : map.entrySet()) {
                        try {
                            String str3 = (String) entry.getKey();
                            C24764f c24764f = (C24764f) entry.getValue();
                            List m128727a = c24764f.m128727a();
                            if (m128727a != null && !m128727a.isEmpty()) {
                                m41603E3(str, i11, str2, str3, c24764f);
                            }
                        } catch (Exception e12) {
                            AbstractC20110a.f98889a.mo104552e(e12);
                        }
                    }
                    if (!this.f43231a.isOpen()) {
                        try {
                            if (this.f43231a.isOpen()) {
                                this.f43231a.mo2850l();
                                return;
                            }
                            return;
                        } catch (Exception e13) {
                            AbstractC20110a.f98889a.mo104552e(e13);
                            return;
                        }
                    }
                    this.f43231a.mo2849k();
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                    }
                } catch (Exception e14) {
                    AbstractC20110a.f98889a.mo104552e(e14);
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                    }
                }
            } catch (Exception e15) {
                AbstractC20110a.f98889a.mo104552e(e15);
            }
        } catch (Throwable th2) {
            try {
                if (this.f43231a.isOpen()) {
                    this.f43231a.mo2850l();
                }
            } catch (Exception e16) {
                AbstractC20110a.f98889a.mo104552e(e16);
            }
            throw th2;
        }
    }

    /* renamed from: y */
    private final String m41680y(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() > 0) {
                sb2.append(" AND " + str);
            }
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: z */
    private final String m41681z(String str) {
        C19636i1.b bVar = C19636i1.Companion;
        C28266a m102752J = bVar.m102800a().m102752J(str);
        C17945a0 m102749H = bVar.m102800a().m102749H(str);
        JSONObject jSONObject = new JSONObject();
        if (m102752J != null) {
            jSONObject.put("reactionInfo", m102752J.m142389h());
        }
        if (m102749H != null) {
            jSONObject.put("unreadMention", m41599D1(m102749H));
        }
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* renamed from: z3 */
    private final void m41682z3(String str, int i11, String str2, String str3, C24761c c24761c) {
        if (!m41675v3(this, str, i11, str2, str3, c24761c, null, 32, null)) {
            m41616O1(str, i11, str2, str3, c24761c);
        }
    }

    /* renamed from: A0 */
    public final int m41683A0(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        try {
            return this.f43231a.mo2770B("TABLE_SENDING_MESSAGE", "currentUserId = '" + CoreUtility.f89233i + "' AND ownerId = '" + str + "' AND clientMsgId = " + j11, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x010a A[Catch: SQLiteException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x00f2, blocks: (B:20:0x00ee, B:27:0x010a), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
    /* renamed from: A1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C28615g m41684A1(String str) {
        InterfaceC0949z interfaceC0949z;
        String format;
        int[] iArr;
        InterfaceC0949z interfaceC0949z2 = null;
        try {
            try {
                C19067n0 c19067n0 = C19067n0.f94947a;
                format = String.format(Locale.US, "select * from %s where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"sync_cloud_msg_info", "userId", "ownerId"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
            } catch (Exception e11) {
                e = e11;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                interfaceC0949z = this.f43231a.mo2775p(format, CoreUtility.f89233i, str);
            } catch (Exception e12) {
                e = e12;
                interfaceC0949z = null;
                e.printStackTrace();
                if (interfaceC0949z != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                Throwable th4 = th;
                if (interfaceC0949z2 == null) {
                }
            }
        } catch (SQLiteException e13) {
            e13.printStackTrace();
        }
        try {
            try {
                iArr = new int[]{interfaceC0949z.getColumnIndex("ownerId"), interfaceC0949z.getColumnIndex("numMember"), interfaceC0949z.getColumnIndex("totalSessionLoad"), interfaceC0949z.getColumnIndex("startTimeSync"), interfaceC0949z.getColumnIndex("endTimeSync"), interfaceC0949z.getColumnIndex("totalMsgStartSync"), interfaceC0949z.getColumnIndex("totalMsgEndSync"), interfaceC0949z.getColumnIndex("numMsgLoaded"), interfaceC0949z.getColumnIndex("stateLoad"), interfaceC0949z.getColumnIndex("sessionId")};
            } catch (Throwable th5) {
                th = th5;
                interfaceC0949z2 = interfaceC0949z;
                Throwable th42 = th;
                if (interfaceC0949z2 == null) {
                    try {
                        interfaceC0949z2.close();
                        throw th42;
                    } catch (SQLiteException e14) {
                        e14.printStackTrace();
                        throw th42;
                    }
                }
                throw th42;
            }
        } catch (Exception e15) {
            e = e15;
            e.printStackTrace();
            if (interfaceC0949z != null) {
                interfaceC0949z.close();
            }
            return null;
        }
        if (interfaceC0949z.next()) {
            String string = interfaceC0949z.getString(iArr[0]);
            int i11 = interfaceC0949z.getInt(iArr[1]);
            int i12 = interfaceC0949z.getInt(iArr[2]);
            long j11 = interfaceC0949z.getLong(iArr[3]);
            long j12 = interfaceC0949z.getLong(iArr[4]);
            int i13 = interfaceC0949z.getInt(iArr[5]);
            int i14 = interfaceC0949z.getInt(iArr[6]);
            int i15 = interfaceC0949z.getInt(iArr[7]);
            int i16 = interfaceC0949z.getInt(iArr[8]);
            String string2 = interfaceC0949z.getString(iArr[9]);
            AbstractC19074t.m100205c(string);
            AbstractC19074t.m100205c(string2);
            C28615g c28615g = new C28615g(string, i11, i12, j11, j12, i13, i14, i15, i16, string2);
            try {
                interfaceC0949z.close();
            } catch (SQLiteException e16) {
                e16.printStackTrace();
            }
            return c28615g;
        }
        interfaceC0949z.close();
        return null;
    }

    /* renamed from: A2 */
    public final void m41685A2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "lastCientMsgIdSeen");
    }

    /* renamed from: B0 */
    public final int m41686B0(String str, String str2) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "cliMsgIdSet");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "currentUserId = '" + CoreUtility.f89233i + "' AND ownerId = '" + str + "' AND clientMsgId IN (" + str2 + ")", Arrays.copyOf(new Object[0], 0));
            AbstractC19074t.m100207e(format, "format(...)");
            return interfaceC0947y.mo2770B("TABLE_SENDING_MESSAGE", format, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* renamed from: B1 */
    public final String m41687B1() {
        try {
            if (m41773b2("sync_signature")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "SELECT %s FROM %s WHERE %s = '%s'", Arrays.copyOf(new Object[]{"signature", "sync_signature", "userId", CoreUtility.f89233i}, 4));
                AbstractC19074t.m100207e(format, "format(...)");
                InterfaceC0949z mo2777u = this.f43231a.mo2777u(format);
                if (mo2777u != null && mo2777u.next()) {
                    String string = mo2777u.getString(mo2777u.getColumnIndex("signature"));
                    AbstractC19074t.m100207e(string, "getString(...)");
                    return string;
                }
            }
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return "";
    }

    /* renamed from: B2 */
    public final void m41688B2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "senderUid");
    }

    /* renamed from: C */
    public final void m41689C() {
    }

    /* renamed from: C0 */
    public final void m41690C0(String str) {
        if (!TextUtils.isEmpty(str)) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s = ?", Arrays.copyOf(new Object[]{"name"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2770B("sync_session_resumable", format, new String[]{str});
            return;
        }
        throw new IllegalArgumentException("name is invalid".toString());
    }

    /* renamed from: C2 */
    public final void m41691C2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "send_counter");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "receive_counter");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "ex_data_1");
    }

    /* renamed from: C3 */
    public final void m41692C3(String str, long j11, long j12, long j13) {
        AbstractC19074t.m100208f(str, "threadId");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("fromMsgId", Long.valueOf(j11));
            contentValues.put("toGlobalMsgId", Long.valueOf(j12));
            contentValues.put("toClientMsgId", Long.valueOf(j13));
            contentValues.put("needDelete", Integer.valueOf(C28611c.f132657m));
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%1$s = ? and %2$s = ? and (%3$s = ? or ( %4$s > 0 and %4$s = ?) or (%4$s <= 0 and %5$s = ?))", Arrays.copyOf(new Object[]{"userId", "ownerId", "fromMsgId", "toGlobalMsgId", "toClientMsgId"}, 5));
            AbstractC19074t.m100207e(format, "format(...)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j13);
            try {
                int mo2776q = this.f43231a.mo2776q("pull_msg_offline", contentValues, format, new String[]{CoreUtility.f89233i, str, sb2.toString(), sb3.toString(), sb4.toString()});
                AbstractC20110a.f98889a.mo104554k("PullMsgOffline UPDATE: " + str + " " + j11 + " " + j12 + " " + j13 + " result: " + mo2776q, new Object[0]);
            } catch (SQLiteException e11) {
                e = e11;
                AbstractC23350e.m122778h(e);
            }
        } catch (SQLiteException e12) {
            e = e12;
        }
    }

    /* renamed from: D */
    public final int m41693D(long j11) {
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "currentUserId = 'currentUserId' AND ts <= " + j11, Arrays.copyOf(new Object[0], 0));
            AbstractC19074t.m100207e(format, "format(...)");
            return interfaceC0947y.mo2770B("TABLE_SENDING_MESSAGE", format, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* renamed from: D0 */
    public final void m41694D0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ?", Arrays.copyOf(new Object[]{"userId", "ownerId"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2770B("sync_cloud_msg_info", format, new String[]{CoreUtility.f89233i, str});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: D2 */
    public final void m41695D2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "seenmessagestatus_v2", "cliMsgID");
        AbstractC0937t.m4450a(interfaceC0947y, "seenmessagestatus_v2", "senderID");
        AbstractC0937t.m4450a(interfaceC0947y, "seenmessagestatus_v2", "destID");
        AbstractC0937t.m4450a(interfaceC0947y, "seenmessagestatus_v2", "msgType");
        AbstractC0937t.m4450a(interfaceC0947y, "seenmessagestatus_v2", "msgCmd");
        AbstractC0937t.m4450a(interfaceC0947y, "seenmessagestatus_v2", "srcType");
    }

    /* renamed from: E */
    public final void m41696E() {
        try {
            this.f43231a.mo2774n("DELETE FROM sync_photo_cache");
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: E0 */
    public final void m41697E0(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "senderId");
        AbstractC19074t.m100208f(str3, "clientMessageId");
        AbstractC19074t.m100208f(str4, "zipParentName");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ? and %s = ? and %s = ? and %s = ?", Arrays.copyOf(new Object[]{"userId", "ownerId", "senderId", "clientMsgId", "zipParentName"}, 5));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2770B("sync_photo_cache", format, new String[]{CoreUtility.f89233i, str, str2, str3, str4});
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: F */
    public final void m41698F() {
        try {
            this.f43231a.mo2774n("DELETE FROM sync_media_zip_metadata");
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: F0 */
    public final int m41699F0(String str) {
        AbstractC19074t.m100208f(str, "uid");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                return m41662r0(str2, str);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                AbstractC20887g.m109232j(str3, 16017, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                this.f43235e.release();
                return -1;
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: F1 */
    public final boolean m41700F1(MessageId messageId, String str) {
        AbstractC19074t.m100208f(messageId, "messageId");
        AbstractC19074t.m100208f(str, "retryKey");
        if (this.f43236f) {
            return false;
        }
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select * from %s where %s = ? and %s = ? and %s = ? and (? = '' or %s = '' or %s = ?) and %s = ? and %s > ?", Arrays.copyOf(new Object[]{"e2ee_sent_messages", "current_uid", "client_message_id", "owner_id", "sender_id", "sender_id", "retry_key", "ts"}, 8));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, messageId.m41044h(), messageId.m41048l(), messageId.m41050n(), messageId.m41050n(), str, Long.valueOf(AbstractC23306f.m120579F1().mo124314i() - 1209600000));
            if (mo2775p != null) {
                try {
                    boolean next = mo2775p.next();
                    AbstractC3601a.m18219a(mo2775p, null);
                    return next;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return false;
    }

    /* renamed from: F3 */
    public final void m41701F3(AbstractC28617b abstractC28617b, AbstractC28626k abstractC28626k, long j11) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(abstractC28617b, "job");
        AbstractC19074t.m100208f(abstractC28626k, "jobResult");
        ContentValues contentValues = new ContentValues();
        if (abstractC28626k.mo96995c()) {
            i11 = 2;
        } else {
            i11 = 4;
        }
        contentValues.put("status", Integer.valueOf(i11));
        if (abstractC28626k.mo96995c() || !abstractC28626k.m143172f()) {
            i12 = 0;
        } else {
            i12 = 1;
        }
        contentValues.put("result", Integer.valueOf(i12));
        if (abstractC28626k.mo96995c()) {
            contentValues.put("show_result", (Integer) 0);
        }
        contentValues.put("output_data", abstractC28626k.mo96996g());
        contentValues.put("ts", Long.valueOf(j11));
        this.f43231a.mo2776q("job_manager", contentValues, "job_id = ?", new String[]{abstractC28617b.m143125c()});
    }

    /* renamed from: G */
    public final void m41702G() {
        synchronized (this.f43231a) {
            this.f43231a.close();
        }
    }

    /* renamed from: G0 */
    public final void m41703G0() {
        try {
            this.f43231a.mo2857x("drop table if exists TABLE_REACTION_MESSAGE_STATE");
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: G3 */
    public final boolean m41704G3(long j11, C24801e c24801e) {
        long j12;
        AbstractC19074t.m100208f(c24801e, "stateLoad");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state_load_item", C24801e.Companion.m128867b(c24801e));
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%1$s = ? and %2$s = ?", Arrays.copyOf(new Object[]{"user_id", "collection_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j11);
            j12 = this.f43231a.mo2776q("my_cloud_collection_info", contentValues, format, new String[]{CoreUtility.f89233i, sb2.toString()});
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            j12 = 0;
        }
        if (j12 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final int m41705H(String str) {
        AbstractC19074t.m100208f(str, "zipName");
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "SELECT COUNT(*) as count FROM %s WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"sync_photo_cache", "zipParentName", "userId"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, str, CoreUtility.f89233i);
            if (mo2775p != null && mo2775p.next()) {
                return mo2775p.getInt(0);
            }
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return 0;
    }

    /* renamed from: H0 */
    public final boolean m41706H0() {
        return true;
    }

    /* renamed from: H1 */
    public final boolean m41707H1(String str, long j11, String str2, String str3) {
        AbstractC19074t.m100208f(str3, "ackData");
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "INSERT INTO %s (%s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?)", Arrays.copyOf(new Object[]{"clientmsgids", "current_uid", "uid_clientmsgids", "globalMsgId", "chat_id", "ack_data"}, 6));
            AbstractC19074t.m100207e(format, "format(...)");
            try {
                return this.f43231a.mo2778v(format, CoreUtility.f89233i, str, Long.valueOf(j11), str2, str3);
            } catch (SQLiteException e11) {
                e = e11;
                AbstractC23350e.m122776f("DatabaseChatHelper", e);
                return false;
            }
        } catch (SQLiteException e12) {
            e = e12;
        }
    }

    /* renamed from: H3 */
    public final void m41708H3(AbstractC28617b abstractC28617b, int i11) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i11));
        this.f43231a.mo2776q("job_manager", contentValues, "job_id = ?", new String[]{abstractC28617b.m143125c()});
    }

    /* renamed from: I */
    public final void m41709I() {
        if (!m41773b2("chat_group_state")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s, %s, %s)", Arrays.copyOf(new Object[]{"chat_group_state", "clientMsgId UNIQUE ON CONFLICT REPLACE", "groupId", "states"}, 4));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:            if (r1.next() != false) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:            if (r1.next() != false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:            r3 = r1.getString(r1.getColumnIndex("currentUserUid"));        fn0.AbstractC19074t.m100205c(r3);        r2.add(r3);     */
    /* renamed from: I0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m41710I0() {
        List m131502j;
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "SELECT DISTINCT %s FROM %s WHERE %s != ? ", Arrays.copyOf(new Object[]{"currentUserUid", "new_messages_2", "currentUserUid"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2775p = interfaceC0947y.mo2775p(format, CoreUtility.f89233i);
            try {
                ArrayList arrayList = new ArrayList();
                if (mo2775p != null) {
                }
                AbstractC3601a.m18219a(mo2775p, null);
                return arrayList;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC3601a.m18219a(mo2775p, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: I1 */
    public final void m41711I1(String str, MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "lastDeletedMsgId");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_uid", CoreUtility.f89233i);
            contentValues.put("chat_id", str);
            long m41047k = messageId.m41047k();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m41047k);
            contentValues.put("last_deleted_msg_id", sb2.toString());
            long m41045i = messageId.m41045i();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m41045i);
            contentValues.put("last_deleted_msg_ts", sb3.toString());
            this.f43231a.mo2771C("conversation_info_extra", null, contentValues);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: I3 */
    public final void m41712I3(C17945a0 c17945a0, int i11, int i12) {
        Semaphore semaphore;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                try {
                    try {
                        this.f43235e.acquire();
                        if (i11 != -1) {
                            C19067n0 c19067n0 = C19067n0.f94947a;
                            String format = String.format(Locale.US, "update %s set %s=? where %s=? AND %s = ? and %s <> ?", Arrays.copyOf(new Object[]{"new_messages_2", "msg_state", "currentUserUid", "clientMsgId", "msg_state"}, 5));
                            AbstractC19074t.m100207e(format, "format(...)");
                            InterfaceC0947y interfaceC0947y = this.f43231a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i11);
                            interfaceC0947y.mo2778v(format, sb2.toString(), CoreUtility.f89233i, c17945a0.m95029V3().m41044h(), "4");
                        }
                        C19669z m103232a = C19669z.Companion.m103232a();
                        MessageId m95029V3 = c17945a0.m95029V3();
                        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                        Conversation m103204T = m103232a.m103204T(m95029V3);
                        if (m103204T != null) {
                            if (i11 != -1 && m103204T.m41007k() != 4) {
                                m103204T.m40993D(i11);
                            }
                            if (i12 != -1) {
                                m103204T.m40991B(i12);
                            }
                        }
                        semaphore = this.f43235e;
                    } catch (Exception e11) {
                        AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                        AbstractC20887g.m109246x(16073, currentTimeMillis);
                    }
                } catch (Exception e12) {
                    AbstractC23350e.m122776f("DatabaseChatHelper", e12);
                    AbstractC20887g.m109246x(16072, currentTimeMillis);
                    semaphore = this.f43235e;
                }
                semaphore.release();
            } finally {
                C19669z.Companion.m103232a().m103198O0();
            }
        } catch (Throwable th2) {
            this.f43235e.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:            if (r11.next() != false) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:            if (r11.next() != false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:            r2 = r11.getString(r11.getColumnIndex("uid"));        fn0.AbstractC19074t.m100205c(r2);        r1.add(r2);     */
    /* renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m41713J0(String str) {
        List m131502j;
        AbstractC19074t.m100208f(str, "currentUserUid");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "SELECT %s FROM %s WHERE %s = ?", Arrays.copyOf(new Object[]{"uid", "new_messages_2", "currentUserUid"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2775p = interfaceC0947y.mo2775p(format, str);
            try {
                ArrayList arrayList = new ArrayList();
                if (mo2775p != null) {
                }
                AbstractC3601a.m18219a(mo2775p, null);
                return arrayList;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    AbstractC3601a.m18219a(mo2775p, th2);
                    throw th3;
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
    }

    /* renamed from: J1 */
    public final void m41714J1(C26711c c26711c) {
        String str;
        AbstractC19074t.m100208f(c26711c, "messageDelete");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "insert into %s (%s, %s, %s, %s, %s, %s, %s, %s, %s) values (?, ?, ?, ?, ?, ?, ?, ?, ?)", Arrays.copyOf(new Object[]{"deletemessages_v1", "cUid", "msgId", "cliMsgId", "senderUid", "ownerId", "globalMsgId", "timestamp", ZinstantMetaConstant.IMPRESSION_META_TYPE, "msgType"}, 10));
            AbstractC19074t.m100207e(format, "format(...)");
            Object[] objArr = new Object[9];
            objArr[0] = CoreUtility.f89233i;
            objArr[1] = c26711c.f126653a;
            MessageId messageId = c26711c.f126654b;
            String str2 = "";
            if (messageId == null) {
                str = "";
            } else {
                str = messageId.m41044h();
            }
            objArr[2] = str;
            objArr[3] = c26711c.f126656d;
            objArr[4] = c26711c.f126657e;
            MessageId messageId2 = c26711c.f126654b;
            if (messageId2 != null) {
                str2 = messageId2.m41046j();
            }
            objArr[5] = str2;
            long j11 = c26711c.f126658f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j11);
            objArr[6] = sb2.toString();
            int i11 = c26711c.f126659g;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i11);
            objArr[7] = sb3.toString();
            int i12 = c26711c.f126655c;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(i12);
            objArr[8] = sb4.toString();
            interfaceC0947y.mo2778v(format, objArr);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: J2 */
    public final void m41715J2() {
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "delete from %s", Arrays.copyOf(new Object[]{"deletemessages_v1"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2774n(format);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: J3 */
    public final void m41716J3(String str, int i11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                this.f43231a.mo2845e();
                if (i11 != -1) {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format(Locale.US, "update %s set %s = ? where %s = ? and %s IN (%s) and %s <> ? ", Arrays.copyOf(new Object[]{"new_messages_2", "msg_state", "currentUserUid", "clientMsgId", str, "msg_state"}, 6));
                    AbstractC19074t.m100207e(format, "format(...)");
                    InterfaceC0947y interfaceC0947y = this.f43231a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i11);
                    interfaceC0947y.mo2778v(format, sb2.toString(), CoreUtility.f89233i, "4");
                }
                this.f43231a.mo2849k();
                try {
                    this.f43231a.mo2850l();
                } catch (Exception e11) {
                    e = e11;
                    AbstractC20110a.f98889a.mo104552e(e);
                    this.f43235e.release();
                    C19669z.Companion.m103232a().m103198O0();
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e12);
                AbstractC20887g.m109246x(16057, currentTimeMillis);
                try {
                    this.f43231a.mo2850l();
                } catch (Exception e13) {
                    e = e13;
                    AbstractC20110a.f98889a.mo104552e(e);
                    this.f43235e.release();
                    C19669z.Companion.m103232a().m103198O0();
                }
            }
            this.f43235e.release();
            C19669z.Companion.m103232a().m103198O0();
        } catch (Throwable th2) {
            try {
                this.f43231a.mo2850l();
            } catch (Exception e14) {
                AbstractC20110a.f98889a.mo104552e(e14);
            }
            this.f43235e.release();
            C19669z.Companion.m103232a().m103198O0();
            throw th2;
        }
    }

    /* renamed from: K */
    public final void m41717K() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!m41773b2("conversation_info_extra")) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s, %s, %s, %s integer)", Arrays.copyOf(new Object[]{"conversation_info_extra", "current_uid", "chat_id", "last_deleted_msg_id", "last_deleted_msg_ts"}, 5));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2857x(format);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("create chat tracking log table:");
        sb2.append(currentTimeMillis2);
    }

    /* renamed from: K0 */
    public final Map m41718K0(String str, int i11, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "currentDate");
        HashMap hashMap = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    try {
                        if (this.f43231a.isOpen()) {
                            this.f43231a.mo2850l();
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                if (this.f43231a.isOpen()) {
                    this.f43231a.mo2850l();
                }
            }
        } catch (Exception e13) {
            AbstractC20110a.f98889a.mo104552e(e13);
        }
        if (!this.f43231a.isOpen()) {
            HashMap hashMap2 = new HashMap();
            try {
                if (this.f43231a.isOpen()) {
                    this.f43231a.mo2850l();
                }
            } catch (Exception e14) {
                AbstractC20110a.f98889a.mo104552e(e14);
            }
            return hashMap2;
        }
        this.f43231a.mo2845e();
        hashMap = m41618P0(str, i11, str2, m41614N0(str, i11, str2));
        if (!this.f43231a.isOpen()) {
            try {
                if (this.f43231a.isOpen()) {
                    this.f43231a.mo2850l();
                }
            } catch (Exception e15) {
                AbstractC20110a.f98889a.mo104552e(e15);
            }
            return hashMap;
        }
        this.f43231a.mo2849k();
        if (this.f43231a.isOpen()) {
            this.f43231a.mo2850l();
        }
        if (hashMap == null) {
            return new HashMap();
        }
        return hashMap;
    }

    /* renamed from: K1 */
    public final void m41719K1(C28260f c28260f) {
        AbstractC19074t.m100208f(c28260f, "driveZipFile");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s = ? and %s = ?", Arrays.copyOf(new Object[]{"userId", "name"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2770B("sync_media_zip_metadata", format, new String[]{CoreUtility.f89233i, c28260f.mo142291d()});
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("userId", CoreUtility.f89233i);
        contentValues.put("name", c28260f.mo142291d());
        contentValues.put("gId", c28260f.m142306h());
        contentValues.put("size", Long.valueOf(c28260f.mo142289b()));
        contentValues.put("ts", Long.valueOf(c28260f.m142308j()));
        contentValues.put("checksumMd5", c28260f.m142304e());
        this.f43231a.mo2771C("sync_media_zip_metadata", null, contentValues);
    }

    /* renamed from: K2 */
    public final void m41720K2(String str, int i11, String str2) {
        AbstractC19074t.m100208f(str, "currentUserId");
        AbstractC19074t.m100208f(str2, "currentDate");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("date != '" + str2 + "'");
            this.f43231a.mo2770B("daily_download_res_thread_info", "current_uid = '" + str + "' AND log_type = " + i11 + m41680y(arrayList), null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("date != '" + str2 + "'");
            this.f43231a.mo2770B("daily_download_res_msg_detail", "current_uid = '" + str + "' AND log_type = " + i11 + m41680y(arrayList2), null);
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
        }
    }

    /* renamed from: K3 */
    public final void m41721K3(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "queue");
        ContentValues contentValues = new ContentValues();
        contentValues.put("show_result", Integer.valueOf(z11 ? 1 : 0));
        this.f43231a.mo2776q("job_manager", contentValues, "queue = ? AND userid = ?", new String[]{str, CoreUtility.f89233i});
    }

    /* renamed from: L0 */
    public final List m41722L0() {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("SELECT * FROM %s WHERE %s = ? AND (%s = ? OR %s = ?)", Arrays.copyOf(new Object[]{"seenmessagestatus_v2", "cUid", "status", "status"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, "0", "1");
            if (mo2775p != null) {
                try {
                    if (mo2775p.next()) {
                        int columnIndex = mo2775p.getColumnIndex("uid");
                        int columnIndex2 = mo2775p.getColumnIndex("gbmsgid");
                        int columnIndex3 = mo2775p.getColumnIndex("cliMsgID");
                        int columnIndex4 = mo2775p.getColumnIndex("senderID");
                        int columnIndex5 = mo2775p.getColumnIndex("destID");
                        int columnIndex6 = mo2775p.getColumnIndex("msgType");
                        int columnIndex7 = mo2775p.getColumnIndex("msgCmd");
                        int columnIndex8 = mo2775p.getColumnIndex("srcType");
                        do {
                            try {
                                String string = mo2775p.getString(columnIndex);
                                long j11 = mo2775p.getLong(columnIndex3);
                                long j12 = mo2775p.getLong(columnIndex2);
                                long j13 = mo2775p.getLong(columnIndex4);
                                AbstractC19074t.m100205c(string);
                                C3533a c3533a = new C3533a(j11, j12, j13, string, mo2775p.getLong(columnIndex5), mo2775p.getInt(columnIndex6), mo2775p.getInt(columnIndex7), mo2775p.getInt(columnIndex8));
                                c3533a.m17929x(0);
                                arrayList.add(c3533a);
                            } catch (Exception e11) {
                                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                            }
                        } while (mo2775p.next());
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC3601a.m18219a(mo2775p, null);
                } finally {
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e12);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16022, e12.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return arrayList;
    }

    /* renamed from: L1 */
    public final void m41723L1(String str, MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("cur_uid", CoreUtility.f89233i);
            contentValues.put("thread_id", str);
            long m41047k = messageId.m41047k();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m41047k);
            contentValues.put("last_global_msg_id", sb2.toString());
            long m41045i = messageId.m41045i();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m41045i);
            contentValues.put("last_client_msg_id", sb3.toString());
            this.f43231a.mo2771C("last_msg_id", null, contentValues);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: L2 */
    public final void m41724L2(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                InterfaceC0947y interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "delete from %s where %s = ? and %s = ? ", Arrays.copyOf(new Object[]{"new_messages_2", "currentUserUid", "cateMsg"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                interfaceC0947y.mo2778v(format, CoreUtility.f89233i, sb2.toString());
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC20887g.m109232j(str, 16037, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: L3 */
    public final void m41725L3(C28615g c28615g) {
        AbstractC19074t.m100208f(c28615g, "syncCloudMsgInfo");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("totalSessionLoad", Integer.valueOf(c28615g.m143110k()));
            contentValues.put("startTimeSync", Long.valueOf(c28615g.m143105f()));
            contentValues.put("endTimeSync", Long.valueOf(c28615g.m143101b()));
            contentValues.put("totalMsgStartSync", Integer.valueOf(c28615g.m143109j()));
            contentValues.put("totalMsgEndSync", Integer.valueOf(c28615g.m143108i()));
            contentValues.put("stateLoad", Integer.valueOf(c28615g.m143106g()));
            contentValues.put("numMsgLoaded", Integer.valueOf(c28615g.m143103d()));
            contentValues.put("sessionId", c28615g.m143104e());
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%1$s = ? and %2$s = ?", Arrays.copyOf(new Object[]{"userId", "ownerId"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2776q("sync_cloud_msg_info", contentValues, format, new String[]{CoreUtility.f89233i, c28615g.m143107h()});
        } catch (SQLiteException e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: M0 */
    public final List m41726M0() {
        ArrayList arrayList = new ArrayList();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ?", Arrays.copyOf(new Object[]{"mark_as_unread_info", "current_user_uid"}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i);
            if (mo2775p != null && mo2775p.next()) {
                while (mo2775p.next()) {
                    String string = mo2775p.getString(mo2775p.getColumnIndex("thread_id"));
                    int i11 = mo2775p.getInt(mo2775p.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE));
                    long j11 = mo2775p.getLong(mo2775p.getColumnIndex("ts"));
                    int i12 = mo2775p.getInt(mo2775p.getColumnIndex("sync_status"));
                    AbstractC19074t.m100205c(string);
                    arrayList.add(new C24774a(string, i11, j11, i12));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
        return arrayList;
    }

    /* renamed from: M1 */
    public final void m41727M1(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("cur_uid", CoreUtility.f89233i);
            contentValues.put("thread_id", str);
            long m41047k = messageId.m41047k();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m41047k);
            contentValues.put("last_global_msg_id", sb2.toString());
            long m41045i = messageId.m41045i();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m41045i);
            contentValues.put("last_client_msg_id", sb3.toString());
            long m41047k2 = messageId.m41047k();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m41047k2);
            contentValues.put("last_read_global_msg_id", sb4.toString());
            long m41045i2 = messageId.m41045i();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m41045i2);
            contentValues.put("last_read_client_msg_id", sb5.toString());
            AbstractC23350e.m122772b("PullMsgManager insertLastReadMsgId messageId=" + messageId + " threadId=" + str + " result=" + this.f43231a.mo2771C("last_msg_id", null, contentValues), new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: M2 */
    public final void m41728M2(C26711c c26711c) {
        MessageId messageId;
        if (c26711c != null) {
            messageId = c26711c.f126654b;
        } else {
            messageId = null;
        }
        if (messageId == null) {
            return;
        }
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "delete from %s where %s = ? and %s = ? ", Arrays.copyOf(new Object[]{"deletemessages_v1", "cUid", "cliMsgId"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2778v(format, CoreUtility.f89233i, c26711c.f126654b.m41044h());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: N1 */
    public final void m41729N1(Map map) {
        AbstractC19074t.m100208f(map, "mapDriveZipFile");
        if (map.isEmpty()) {
            return;
        }
        C23952g.m125345j("SyncMediaZip", "Update list file zip metadata get from google drive to db. Size: " + map.size());
        try {
            try {
                try {
                    this.f43231a.mo2845e();
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        C28260f c28260f = (C28260f) ((Map.Entry) it.next()).getValue();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("userId", CoreUtility.f89233i);
                        contentValues.put("name", c28260f.mo142291d());
                        contentValues.put("gId", c28260f.m142306h());
                        contentValues.put("size", Long.valueOf(c28260f.mo142289b()));
                        contentValues.put("ts", Long.valueOf(c28260f.m142308j()));
                        contentValues.put("checksumMd5", c28260f.m142304e());
                        this.f43231a.mo2771C("sync_media_zip_metadata", null, contentValues);
                    }
                    this.f43231a.mo2849k();
                    this.f43231a.mo2850l();
                } catch (Throwable th2) {
                    try {
                        this.f43231a.mo2850l();
                    } catch (SQLiteException e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    throw th2;
                }
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                this.f43231a.mo2850l();
            }
        } catch (SQLiteException e13) {
            AbstractC20110a.f98889a.mo104552e(e13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:            if (r3 != Integer.MIN_VALUE) goto L48;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:            java.lang.Thread.sleep(50);        r4 = ln0.AbstractC22543l.m116584g(r3, r4 + s00.AbstractC26080o.a.f124275b);        r5 = r11.f43231a;        r6 = fn0.C19067n0.f94947a;        r6 = java.lang.String.format(java.util.Locale.US, "delete from %s where %s = ? and rowId <= ?", java.util.Arrays.copyOf(new java.lang.Object[]{"chat_content", "currentUserUid"}, 2));        fn0.AbstractC19074t.m100207e(r6, "format(...)");        r5.mo2778v(r6, r12, java.lang.Integer.valueOf(r4));     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a9, code lost:            if (r4 < r3) goto L63;     */
    /* renamed from: N2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m41730N2(String str) {
        if (!this.f43234d || TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            C24860q m41775c1 = m41775c1(str);
            int intValue = ((Number) m41775c1.m129215c()).intValue();
            int intValue2 = ((Number) m41775c1.m129216d()).intValue();
            try {
                AbstractC0937t.m4453d(this.f43231a, "timestamp");
                AbstractC0937t.m4453d(this.f43231a, "sequenseId");
                AbstractC0937t.m4453d(this.f43231a, "receiverUid");
                AbstractC0937t.m4453d(this.f43231a, "metadata_2");
            } catch (Exception e11) {
                AbstractC20110a.f98889a.m104564x("[ZDB]").mo104552e(e11);
            }
            C24559a.m127933c("[ZDB]", "removeOldDBChat: " + intValue + " - " + intValue2);
            if (intValue != Integer.MIN_VALUE) {
            }
            m41596B(str);
            return true;
        } catch (Exception e12) {
            AbstractC20110a.f98889a.m104564x("[ZDB]").mo104552e(e12);
            return false;
        }
    }

    /* renamed from: O */
    public final void m41731O() {
        if (!m41773b2("deletemessages_v1")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s LONG, %s INTEGER, %s INTEGER)", Arrays.copyOf(new Object[]{"deletemessages_v1", "cUid", "msgId", "cliMsgId", "senderUid", "ownerId", "globalMsgId", "timestamp", ZinstantMetaConstant.IMPRESSION_META_TYPE, "msgType"}, 10));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[SYNTHETIC] */
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m41732O0() {
        String format;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        InterfaceC0949z interfaceC0949z = null;
        try {
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
        try {
            try {
                C19067n0 c19067n0 = C19067n0.f94947a;
                format = String.format(Locale.US, "select * from %s where %s = ?", Arrays.copyOf(new Object[]{"my_cloud_collection_info", "user_id"}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (0 == 0) {
                }
            }
            try {
                interfaceC0949z = this.f43231a.mo2775p(format, CoreUtility.f89233i);
                int[] iArr = {interfaceC0949z.getColumnIndex("collection_id"), interfaceC0949z.getColumnIndex("collection_name"), interfaceC0949z.getColumnIndex("size"), interfaceC0949z.getColumnIndex("created_time"), interfaceC0949z.getColumnIndex("thumb"), interfaceC0949z.getColumnIndex("last_modified_time"), interfaceC0949z.getColumnIndex("description"), interfaceC0949z.getColumnIndex("last_modified_item_time"), interfaceC0949z.getColumnIndex("state_load_item"), interfaceC0949z.getColumnIndex("is_pin")};
                while (interfaceC0949z.next()) {
                    long j11 = interfaceC0949z.getLong(iArr[0]);
                    String string = interfaceC0949z.getString(iArr[1]);
                    int i11 = interfaceC0949z.getInt(iArr[2]);
                    long j12 = interfaceC0949z.getLong(iArr[3]);
                    String string2 = interfaceC0949z.getString(iArr[4]);
                    long j13 = interfaceC0949z.getLong(iArr[5]);
                    String string3 = interfaceC0949z.getString(iArr[6]);
                    long j14 = interfaceC0949z.getLong(iArr[7]);
                    String string4 = interfaceC0949z.getString(iArr[8]);
                    if (interfaceC0949z.getInt(iArr[9]) > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC19074t.m100205c(string);
                    AbstractC19074t.m100205c(string2);
                    AbstractC19074t.m100205c(string3);
                    AbstractC19074t.m100205c(string4);
                    arrayList.add(new C24799c(j11, string, i11, j12, string2, j13, string3, j14, string4, z11, false));
                }
                interfaceC0949z.close();
            } catch (Exception e13) {
                e = e13;
                e.printStackTrace();
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                }
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            if (0 == 0) {
                try {
                    interfaceC0949z.close();
                    throw th32;
                } catch (SQLiteException e14) {
                    e14.printStackTrace();
                    throw th32;
                }
            }
            throw th32;
        }
    }

    /* renamed from: O2 */
    public final void m41733O2(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "delete from %s where %s = ? and %s = ? ", Arrays.copyOf(new Object[]{"seenmessagestatus_v2", "uid", "cUid"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2778v(format, str, CoreUtility.f89233i);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 16021, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: O3 */
    public final void m41734O3(String str, C7908f c7908f) {
        Conversation m103202S;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c7908f, "topOutInfo");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                ContentValues contentValues = new ContentValues();
                contentValues.put("param1", c7908f.m40877g());
                if (m41653l3(str, contentValues) > 0 && (m103202S = C19669z.Companion.m103232a().m103202S(str)) != null) {
                    m103202S.f42898v = c7908f;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                AbstractC20887g.m109232j(str2, 16044, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: P1 */
    public final void m41735P1(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "jobs");
        try {
            try {
                try {
                    this.f43231a.mo2845e();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C28611c c28611c = (C28611c) it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("userId", CoreUtility.f89233i);
                        contentValues.put("ownerId", c28611c.f132658a);
                        contentValues.put("fromMsgId", Long.valueOf(c28611c.f132659b));
                        contentValues.put("toGlobalMsgId", Long.valueOf(c28611c.f132661d));
                        contentValues.put("toClientMsgId", Long.valueOf(c28611c.f132662e));
                        contentValues.put("needDelete", Integer.valueOf(c28611c.f132665h));
                        this.f43231a.mo2771C("pull_msg_offline", null, contentValues);
                        AbstractC20110a.f98889a.mo104554k("PullMsgOfflineINSERT: " + c28611c.f132658a + " " + c28611c.f132659b + " " + c28611c.f132661d + " " + c28611c.f132662e + " " + c28611c.f132665h, new Object[0]);
                    }
                    this.f43231a.mo2849k();
                    this.f43231a.mo2850l();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    this.f43231a.mo2850l();
                }
            } catch (Throwable th2) {
                try {
                    this.f43231a.mo2850l();
                } catch (SQLiteException e12) {
                    e12.printStackTrace();
                }
                throw th2;
            }
        } catch (SQLiteException e13) {
            e13.printStackTrace();
        }
    }

    /* renamed from: P2 */
    public final void m41736P2(long j11) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "delete from %s where %s = ? and %s = ? ", Arrays.copyOf(new Object[]{"seenmessagestatus_v2", "gbmsgid", "cUid"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j11);
            interfaceC0947y.mo2778v(format, sb2.toString(), CoreUtility.f89233i);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16021, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: P3 */
    public final void m41737P3(String str, int i11, String str2) {
        C19669z m103232a;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "customMsg");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                InterfaceC0947y interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "update %s set %s = ? , %s = ? where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "iTypeMsg", "param3", "uid", "currentUserUid"}, 5));
                AbstractC19074t.m100207e(format, "format(...)");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                interfaceC0947y.mo2778v(format, sb2.toString(), str2, str, CoreUtility.f89233i);
                C19669z.b bVar = C19669z.Companion;
                Conversation m103202S = bVar.m103232a().m103202S(str);
                if (m103202S != null) {
                    m103202S.m40994F(i11);
                    m103202S.m40992C(str2);
                }
                this.f43235e.release();
                m103232a = bVar.m103232a();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                AbstractC20887g.m109232j(str3, 16030, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                this.f43235e.release();
                m103232a = C19669z.Companion.m103232a();
            }
            m103232a.m103198O0();
        } catch (Throwable th2) {
            this.f43235e.release();
            C19669z.Companion.m103232a().m103198O0();
            throw th2;
        }
    }

    /* renamed from: Q0 */
    public final C32070q m41738Q0(long j11) {
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select * from %s where %s = ? ", Arrays.copyOf(new Object[]{"chat_group_state", "clientMsgId"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2775p = interfaceC0947y.mo2775p(format, Long.valueOf(j11));
            if (mo2775p != null) {
                try {
                    if (mo2775p.next()) {
                        int columnIndex = mo2775p.getColumnIndex("clientMsgId");
                        int columnIndex2 = mo2775p.getColumnIndex("groupId");
                        byte[] blob = mo2775p.getBlob(mo2775p.getColumnIndex("states"));
                        C32070q c32070q = new C32070q();
                        c32070q.f147663b = mo2775p.getLong(columnIndex);
                        c32070q.f147664c = mo2775p.getString(columnIndex2);
                        c32070q.m154705a(blob);
                        AbstractC3601a.m18219a(mo2775p, null);
                        return c32070q;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC3601a.m18219a(mo2775p, th2);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return null;
    }

    /* renamed from: Q1 */
    public final void m41739Q1(int i11, String str, Map map) {
        Object m131204d0;
        AbstractC19074t.m100208f(str, "currentDate");
        AbstractC19074t.m100208f(map, "threadListMap");
        if (map.isEmpty()) {
            return;
        }
        if (map.size() == 1) {
            m131204d0 = AbstractC25332a0.m131204d0(map.entrySet());
            Map.Entry entry = (Map.Entry) m131204d0;
            m41765Y1(i11, str, (String) entry.getKey(), (C24764f) entry.getValue());
            return;
        }
        m41606G2(i11, str, map);
    }

    /* renamed from: Q2 */
    public final void m41740Q2(String str, long j11) {
        C0824j.m2153b(new d(str, j11));
    }

    /* renamed from: Q3 */
    public final void m41741Q3(String str, int i11) {
        C19669z m103232a;
        AbstractC19074t.m100208f(str, "uid");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                InterfaceC0947y interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "update %s set %s = ? where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "iTypeMsg", "uid", "currentUserUid"}, 4));
                AbstractC19074t.m100207e(format, "format(...)");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i11);
                interfaceC0947y.mo2778v(format, sb2.toString(), str, CoreUtility.f89233i);
                C19669z.b bVar = C19669z.Companion;
                Conversation m103202S = bVar.m103232a().m103202S(str);
                if (m103202S != null) {
                    m103202S.m40994F(i11);
                }
                this.f43235e.release();
                m103232a = bVar.m103232a();
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                AbstractC20887g.m109232j(str2, 16030, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                this.f43235e.release();
                m103232a = C19669z.Companion.m103232a();
            }
            m103232a.m103198O0();
        } catch (Throwable th2) {
            this.f43235e.release();
            C19669z.Companion.m103232a().m103198O0();
            throw th2;
        }
    }

    /* renamed from: R */
    public final void m41742R() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!m41773b2("last_msg_id")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "create table %s (%s, %s, %s, %s, %s, %s)", Arrays.copyOf(new Object[]{"last_msg_id", "cur_uid", "thread_id", "last_global_msg_id", "last_client_msg_id", "last_read_global_msg_id", "last_read_client_msg_id"}, 7));
                AbstractC19074t.m100207e(format, "format(...)");
                this.f43231a.mo2857x(format);
            }
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("create last global id table:");
        sb2.append(currentTimeMillis2);
    }

    /* renamed from: R0 */
    public final C31909f1 m41743R0(String str) {
        Throwable th2;
        InterfaceC0949z interfaceC0949z;
        C31909f1 c31909f1;
        InterfaceC0949z interfaceC0949z2 = null;
        r1 = null;
        C31909f1 c31909f12 = null;
        interfaceC0949z2 = null;
        try {
            try {
                InterfaceC0947y interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "select * from %s where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"conversation_info_extra", "current_uid", "chat_id"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                interfaceC0949z = interfaceC0947y.mo2775p(format, CoreUtility.f89233i, str);
                if (interfaceC0949z != null) {
                    while (interfaceC0949z.next()) {
                        try {
                            c31909f12 = new C31909f1(interfaceC0949z);
                        } catch (Exception e11) {
                            e = e11;
                            C31909f1 c31909f13 = c31909f12;
                            interfaceC0949z2 = interfaceC0949z;
                            c31909f1 = c31909f13;
                            AbstractC23350e.m122776f("DatabaseChatHelper", e);
                            if (interfaceC0949z2 != null) {
                                try {
                                    interfaceC0949z2.close();
                                } catch (SQLiteException e12) {
                                    AbstractC23350e.m122776f("DatabaseChatHelper", e12);
                                }
                            }
                            return c31909f1;
                        } catch (Throwable th3) {
                            th2 = th3;
                            if (interfaceC0949z != null) {
                                try {
                                    interfaceC0949z.close();
                                } catch (SQLiteException e13) {
                                    AbstractC23350e.m122776f("DatabaseChatHelper", e13);
                                }
                            }
                            throw th2;
                        }
                    }
                }
                if (interfaceC0949z != null) {
                    try {
                        interfaceC0949z.close();
                        return c31909f12;
                    } catch (SQLiteException e14) {
                        AbstractC23350e.m122776f("DatabaseChatHelper", e14);
                        return c31909f12;
                    }
                }
                return c31909f12;
            } catch (Throwable th4) {
                InterfaceC0949z interfaceC0949z3 = interfaceC0949z2;
                th2 = th4;
                interfaceC0949z = interfaceC0949z3;
            }
        } catch (Exception e15) {
            e = e15;
            c31909f1 = null;
        }
    }

    /* renamed from: R1 */
    public final boolean m41744R1(C24799c c24799c) {
        long j11;
        AbstractC19074t.m100208f(c24799c, "myCloudCollectionInfo");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("user_id", CoreUtility.f89233i);
            contentValues.put("collection_id", Long.valueOf(c24799c.m128824d()));
            contentValues.put("collection_name", c24799c.m128827g());
            contentValues.put("size", Integer.valueOf(c24799c.m128828h()));
            contentValues.put("created_time", Long.valueOf(c24799c.m128822b()));
            contentValues.put("thumb", c24799c.m128830j());
            contentValues.put("last_modified_time", Long.valueOf(c24799c.m128826f()));
            contentValues.put("description", c24799c.m128823c());
            contentValues.put("last_modified_item_time", Long.valueOf(c24799c.m128825e()));
            contentValues.put("state_load_item", c24799c.m128829i());
            contentValues.put("is_pin", Integer.valueOf(c24799c.m128832l() ? 1 : 0));
            j11 = this.f43231a.mo2771C("my_cloud_collection_info", null, contentValues);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            j11 = -1;
        }
        if (j11 < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: R2 */
    public final int m41745R2(long j11) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f43235e.acquire();
            ContentValues contentValues = new ContentValues();
            contentValues.put("unreadMessages", (Integer) 0);
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, " %s = ? AND %s = ? AND (? > CAST(%s as number)) AND (%s > ?)", Arrays.copyOf(new Object[]{"currentUserUid", "cateMsg", "timestamp", "unreadMessages"}, 4));
            AbstractC19074t.m100207e(format, "format(...)");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j11);
            return this.f43231a.mo2776q("new_messages_2", contentValues, format, new String[]{CoreUtility.f89233i, "3", sb2.toString(), "0"});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16040, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            return 0;
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: R3 */
    public final void m41746R3(String str, int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "update %s set %s = ? where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "unreadMessages", "uid", "currentUserUid"}, 4));
                AbstractC19074t.m100207e(format, "format(...)");
                this.f43231a.mo2778v(format, String.valueOf(i11), str, CoreUtility.f89233i);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                AbstractC20887g.m109232j(str2, 16015, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x006f -> B:10:0x00a4). Please report as a decompilation issue!!! */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m41747S0(int i11) {
        InterfaceC0949z interfaceC0949z;
        Throwable th2;
        C3556x c3556x;
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (SQLiteException e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
        try {
            try {
                this.f43235e.acquire();
                c3556x = new C3556x();
                InterfaceC0947y interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ? AND %s = ? ", Arrays.copyOf(new Object[]{"new_messages_2", "currentUserUid", "cateMsg"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                interfaceC0949z = interfaceC0947y.mo2775p(format, CoreUtility.f89233i, String.valueOf(i11));
            } catch (Exception e12) {
                e = e12;
                interfaceC0949z = null;
            } catch (Throwable th3) {
                th2 = th3;
                interfaceC0949z = null;
                this.f43235e.release();
                if (interfaceC0949z == null) {
                }
            }
            try {
                m41642f2(interfaceC0949z, c3556x);
                arrayList.addAll(c3556x.m18069b());
                C19669z.Companion.m103232a().m103215a1(arrayList);
                this.f43235e.release();
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                }
            } catch (Exception e13) {
                e = e13;
                AbstractC23350e.m122776f("DatabaseChatHelper", e);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                AbstractC20887g.m109232j(str, 16034, e.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                this.f43235e.release();
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                }
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th4) {
            th2 = th4;
            this.f43235e.release();
            if (interfaceC0949z == null) {
                try {
                    interfaceC0949z.close();
                    throw th2;
                } catch (SQLiteException e14) {
                    AbstractC23350e.m122776f("DatabaseChatHelper", e14);
                    throw th2;
                }
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x000f A[SYNTHETIC] */
    /* renamed from: S1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m41748S1(ArrayList arrayList) {
        String str;
        String l11;
        AbstractC19074t.m100208f(arrayList, "listItem");
        int i11 = 0;
        try {
            try {
                try {
                    this.f43231a.mo2845e();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C24800d c24800d = (C24800d) it.next();
                        long m128848a = c24800d.m128848a();
                        MessageId m128849b = c24800d.m128849b();
                        long m128850c = c24800d.m128850c();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("user_id", CoreUtility.f89233i);
                        contentValues.put("collection_id", Long.valueOf(m128848a));
                        String str2 = "0";
                        if (m128849b != null) {
                            str = Long.valueOf(m128849b.m41045i()).toString();
                            if (str == null) {
                            }
                            contentValues.put("client_msg_id", str);
                            if (m128849b != null && (l11 = Long.valueOf(m128849b.m41047k()).toString()) != null) {
                                str2 = l11;
                            }
                            contentValues.put("global_msg_id", str2);
                            contentValues.put("add_time", Long.valueOf(m128850c));
                            if (this.f43231a.mo2771C("my_cloud_collection_item", null, contentValues) < 0) {
                                i11++;
                            }
                        }
                        str = "0";
                        contentValues.put("client_msg_id", str);
                        if (m128849b != null) {
                            str2 = l11;
                        }
                        contentValues.put("global_msg_id", str2);
                        contentValues.put("add_time", Long.valueOf(m128850c));
                        if (this.f43231a.mo2771C("my_cloud_collection_item", null, contentValues) < 0) {
                        }
                    }
                    this.f43231a.mo2849k();
                    this.f43231a.mo2850l();
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    this.f43231a.mo2850l();
                }
            } catch (SQLiteException e12) {
                e12.printStackTrace();
            }
            return i11;
        } catch (Throwable th2) {
            try {
                this.f43231a.mo2850l();
            } catch (SQLiteException e13) {
                e13.printStackTrace();
            }
            throw th2;
        }
    }

    /* renamed from: S2 */
    public final void m41749S2(int i11, String str, Map map) {
        AbstractC19074t.m100208f(str, "currentDate");
        AbstractC19074t.m100208f(map, "threadListMap");
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str2);
        if (str2.length() == 0 || map.isEmpty()) {
            return;
        }
        m41679x3(str2, i11, str, map);
    }

    /* renamed from: T */
    public final void m41750T() {
        if (!m41773b2("seenmessagestatus_v2")) {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER, %s, %s, %s, %s, %s, %s, %s)", Arrays.copyOf(new Object[]{"seenmessagestatus_v2", "cUid", "uid", "status", "gbmsgid", "cliMsgID", "senderID", "destID", "msgType", "msgCmd", "srcType"}, 11));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2857x(format);
        }
    }

    /* renamed from: T0 */
    public final InterfaceC0947y m41751T0() {
        return this.f43231a;
    }

    /* renamed from: T1 */
    public final void m41752T1(String str, C28255a c28255a) {
        AbstractC19074t.m100208f(str, "responseString");
        AbstractC19074t.m100208f(c28255a, "driveFileLocal");
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("name");
        ContentValues contentValues = new ContentValues();
        contentValues.put("userId", CoreUtility.f89233i);
        contentValues.put("md5", optString2);
        contentValues.put("gid", optString);
        contentValues.put("size", Long.valueOf(c28255a.m142267g()));
        contentValues.put("ts", Long.valueOf(c28255a.m142274n()));
        this.f43231a.mo2771C("sync_photo_cache", null, contentValues);
    }

    /* renamed from: T2 */
    public final boolean m41753T2(AbstractC28617b abstractC28617b) {
        AbstractC19074t.m100208f(abstractC28617b, "job");
        try {
            this.f43231a.mo2770B("job_manager", "job_id = ?", new String[]{abstractC28617b.m143125c()});
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("job_id", abstractC28617b.m143125c());
        contentValues.put("queue", abstractC28617b.mo96987d());
        contentValues.put("param", abstractC28617b.mo96989m());
        contentValues.put("factory", abstractC28617b.mo96986b());
        contentValues.put("show_result", Integer.valueOf(abstractC28617b.m143131j() ? 1 : 0));
        contentValues.put("userid", abstractC28617b.m143129h());
        if (this.f43231a.mo2771C("job_manager", null, contentValues) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: U1 */
    public final void m41754U1(C32070q... c32070qArr) {
        AbstractC19074t.m100208f(c32070qArr, "chatGroupStates");
        if (c32070qArr.length == 0) {
            return;
        }
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "insert into %s (%s, %s, %s) values (?, ?, ?)", Arrays.copyOf(new Object[]{"chat_group_state", "clientMsgId", "groupId", "states"}, 4));
            AbstractC19074t.m100207e(format, "format(...)");
            for (C32070q c32070q : c32070qArr) {
                if (c32070q != null) {
                    this.f43231a.mo2778v(format, Long.valueOf(c32070q.f147663b), c32070q.f147664c, c32070q.m154706b());
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: U2 */
    public final void m41755U2(List list) {
        String str;
        AbstractC19074t.m100208f(list, "listDriveFile");
        if (list.isEmpty()) {
            return;
        }
        C23952g.m125345j("SyncMediaZip", "Update list metadata get from google drive to db cache. Size: " + list.size());
        try {
            try {
                try {
                    this.f43231a.mo2845e();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C28255a c28255a = (C28255a) it.next();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("userId", CoreUtility.f89233i);
                        contentValues.put("gid", c28255a.m142266e());
                        contentValues.put("size", Long.valueOf(c28255a.m142267g()));
                        contentValues.put("ts", Long.valueOf(c28255a.m142274n()));
                        if (c28255a instanceof C28262h) {
                            contentValues.put("zipParentName", ((C28262h) c28255a).m142327E());
                            contentValues.put("senderId", ((C28262h) c28255a).m142326D());
                            MessageId m142324B = ((C28262h) c28255a).m142324B();
                            if (m142324B != null) {
                                str = m142324B.m41044h();
                                if (str == null) {
                                }
                                contentValues.put("clientMsgId", str);
                                contentValues.put("ownerId", ((C28262h) c28255a).m142325C());
                            }
                            str = "0";
                            contentValues.put("clientMsgId", str);
                            contentValues.put("ownerId", ((C28262h) c28255a).m142325C());
                        } else {
                            contentValues.put("md5", c28255a.mo142271k());
                        }
                        this.f43231a.mo2771C("sync_photo_cache", null, contentValues);
                    }
                    this.f43231a.mo2849k();
                    this.f43231a.mo2850l();
                } catch (Throwable th2) {
                    try {
                        this.f43231a.mo2850l();
                    } catch (SQLiteException e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                    throw th2;
                }
            } catch (SQLiteException e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                this.f43231a.mo2850l();
            }
        } catch (SQLiteException e13) {
            AbstractC20110a.f98889a.mo104552e(e13);
        }
    }

    /* renamed from: V1 */
    public final void m41756V1(C3533a c3533a) {
        AbstractC19074t.m100208f(c3533a, "ackMsgStatus");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (c3533a.m17906a()) {
                m41736P2(c3533a.m17912g());
            } else {
                m41733O2(c3533a.m17915j());
            }
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "insert into %s (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Arrays.copyOf(new Object[]{"seenmessagestatus_v2", "cUid", "uid", "status", "gbmsgid", "cliMsgID", "senderID", "destID", "msgType", "msgCmd", "srcType"}, 11));
            AbstractC19074t.m100207e(format, "format(...)");
            int m17919n = c3533a.m17919n();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m17919n);
            long m17912g = c3533a.m17912g();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m17912g);
            long m17908c = c3533a.m17908c();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m17908c);
            long m17917l = c3533a.m17917l();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(m17917l);
            long m17909d = c3533a.m17909d();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(m17909d);
            int m17914i = c3533a.m17914i();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(m17914i);
            int m17913h = c3533a.m17913h();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(m17913h);
            int m17918m = c3533a.m17918m();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(m17918m);
            interfaceC0947y.mo2778v(format, CoreUtility.f89233i, c3533a.m17915j(), sb2.toString(), sb3.toString(), sb4.toString(), sb5.toString(), sb6.toString(), sb7.toString(), sb8.toString(), sb9.toString());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16019, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: V2 */
    public final void m41757V2(String str) {
        AbstractC19074t.m100208f(str, "signature");
        try {
            if (m41773b2("sync_signature")) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("userId", CoreUtility.f89233i);
                contentValues.put("signature", str);
                this.f43231a.mo2855t("sync_signature", null, contentValues, 5);
            }
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: W1 */
    public final long m41758W1(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            ContentValues contentValues = new ContentValues();
            contentValues.put("currentUserId", CoreUtility.f89233i);
            contentValues.put("clientMsgId", Long.valueOf(c17945a0.m95029V3().m41045i()));
            contentValues.put("ts", Long.valueOf(c17945a0.m94974P4()));
            contentValues.put("ownerId", c17945a0.mo95039W2());
            C24848g0 c24848g0 = C24848g0.f119245a;
            return interfaceC0947y.mo2771C("TABLE_SENDING_MESSAGE", null, contentValues);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1L;
        }
    }

    /* renamed from: W2 */
    public final void m41759W2(boolean z11) {
        this.f43234d = z11;
    }

    /* renamed from: X0 */
    public final C28255a m41760X0(String str, String str2, String str3, String str4) {
        InterfaceC0949z mo2775p;
        Throwable th2;
        Throwable th3;
        AbstractC19074t.m100208f(str, "md5");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %3$s WHERE ((%4$s = ? AND %4$s NOT NULL AND %4$s != '') OR (%5$s = ? AND %6$s = ? AND %7$s = ?)) AND %8$s = ? ORDER BY %9$s DESC LIMIT 1", Arrays.copyOf(new Object[]{"gid", "zipParentName", "sync_photo_cache", "md5", "ownerId", "senderId", "clientMsgId", "userId", "zipParentName"}, 9));
        AbstractC19074t.m100207e(format, "format(...)");
        C28255a c28255a = null;
        try {
            mo2775p = this.f43231a.mo2775p(format, str, str2, str3, str4, CoreUtility.f89233i);
        } catch (SQLiteException e11) {
            e = e11;
        }
        try {
        } catch (SQLiteException e12) {
            e = e12;
            AbstractC20110a.f98889a.mo104552e(e);
            return c28255a;
        }
        if (mo2775p != null) {
            try {
                if (mo2775p.next()) {
                    String m119736F = AbstractC23244v8.m119736F(mo2775p.getString(mo2775p.getColumnIndex("md5")));
                    AbstractC19074t.m100207e(m119736F, "wrapNonNull(...)");
                    String m119736F2 = AbstractC23244v8.m119736F(mo2775p.getString(mo2775p.getColumnIndex("gid")));
                    AbstractC19074t.m100207e(m119736F2, "wrapNonNull(...)");
                    long j11 = mo2775p.getInt(mo2775p.getColumnIndex("size"));
                    long j12 = mo2775p.getLong(mo2775p.getColumnIndex("ts"));
                    String string = mo2775p.getString(mo2775p.getColumnIndex("zipParentName"));
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            String string2 = mo2775p.getString(mo2775p.getColumnIndex("senderId"));
                            String string3 = mo2775p.getString(mo2775p.getColumnIndex("clientMsgId"));
                            String string4 = mo2775p.getString(mo2775p.getColumnIndex("ownerId"));
                            MessageId.C7932a c7932a = MessageId.Companion;
                            AbstractC19074t.m100205c(string4);
                            AbstractC19074t.m100205c(string2);
                            MessageId m41066e = c7932a.m41066e(string3, "", string4, string2);
                            if (m41066e != null) {
                                C28262h.a aVar = C28262h.Companion;
                                AbstractC19074t.m100205c(string);
                                String m119736F3 = AbstractC23244v8.m119736F(string4);
                                AbstractC19074t.m100207e(m119736F3, "wrapNonNull(...)");
                                String m119736F4 = AbstractC23244v8.m119736F(string2);
                                AbstractC19074t.m100207e(m119736F4, "wrapNonNull(...)");
                                th2 = null;
                                c28255a = aVar.m142329a(m119736F, m119736F2, j12, j11, string, m119736F3, m119736F4, m41066e);
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                AbstractC3601a.m18219a(mo2775p, th2);
                                return c28255a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            th3 = th;
                            try {
                                throw th3;
                            } catch (Throwable th5) {
                                AbstractC3601a.m18219a(mo2775p, th3);
                                throw th5;
                            }
                        }
                    } else if (!TextUtils.isEmpty(m119736F2) && !TextUtils.isEmpty(m119736F)) {
                        th2 = null;
                        try {
                            c28255a = C28255a.Companion.m142284a(str, m119736F2, j12, j11);
                            C24848g0 c24848g02 = C24848g0.f119245a;
                            AbstractC3601a.m18219a(mo2775p, th2);
                            return c28255a;
                        } catch (Throwable th6) {
                            th3 = th6;
                            c28255a = null;
                            throw th3;
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                th3 = th;
                throw th3;
            }
        }
        th2 = null;
        c28255a = null;
        C24848g0 c24848g022 = C24848g0.f119245a;
        AbstractC3601a.m18219a(mo2775p, th2);
        return c28255a;
    }

    /* renamed from: X1 */
    public final void m41761X1(C28259e c28259e) {
        AbstractC19074t.m100208f(c28259e, "sessionResumableInfo");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s = ? and %s = ?", Arrays.copyOf(new Object[]{"userId", "name"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2770B("sync_session_resumable", format, new String[]{CoreUtility.f89233i, c28259e.m142299b()});
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("userId", CoreUtility.f89233i);
        contentValues.put("name", c28259e.m142299b());
        contentValues.put("checksumMd5", c28259e.m142298a());
        contentValues.put("sessionURL", c28259e.m142300c());
        contentValues.put("ts", Long.valueOf(c28259e.m142301d()));
        this.f43231a.mo2771C("sync_session_resumable", null, contentValues);
    }

    /* renamed from: X2 */
    public final void m41762X2(List list) {
        String m127114D;
        String m127114D2;
        AbstractC19074t.m100208f(list, "listThreadIdHaveMsgOffline");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("needDelete", Integer.valueOf(C28611c.f132657m));
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add("'" + ((String) it.next()) + "'");
            }
            String obj = arrayList.toString();
            AbstractC19074t.m100207e(obj, "toString(...)");
            m127114D = AbstractC24341v.m127114D(obj, "[", "", false, 4, null);
            m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
            C19067n0 c19067n0 = C19067n0.f94947a;
            Locale locale = Locale.US;
            String format = String.format(locale, "%1$s = ? and %2$s in (%3$s) and cast(%4$s as integer) = ?", Arrays.copyOf(new Object[]{"userId", "ownerId", m127114D2, "needDelete"}, 4));
            AbstractC19074t.m100207e(format, "format(...)");
            int i11 = C28611c.f132656l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            int mo2776q = this.f43231a.mo2776q("pull_msg_offline", contentValues, format, new String[]{CoreUtility.f89233i, sb2.toString()});
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.mo104554k("PullMsgOffline UPDATE column needDelete=0: " + m127114D2 + " result: " + mo2776q, new Object[0]);
            String format2 = String.format(locale, "%1$s = ? and %2$s not in (%3$s) and cast(%4$s as integer) = ?", Arrays.copyOf(new Object[]{"userId", "ownerId", m127114D2, "needDelete"}, 4));
            AbstractC19074t.m100207e(format2, "format(...)");
            int i12 = C28611c.f132656l;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i12);
            aVar.mo104554k("PullMsgOffline DELETE: result =%s", Integer.valueOf(this.f43231a.mo2770B("pull_msg_offline", format2, new String[]{CoreUtility.f89233i, sb3.toString()})));
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: Y */
    public final void m41763Y() {
        if (!m41773b2("mark_as_unread_info")) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "create table %s (%s, %s, %s, %s, %s)", Arrays.copyOf(new Object[]{"mark_as_unread_info", "current_user_uid", "thread_id", ZinstantMetaConstant.IMPRESSION_META_TYPE, "ts", "sync_status"}, 6));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2857x(format);
        }
    }

    /* renamed from: Y0 */
    public final String m41764Y0(String str) {
        AbstractC19074t.m100208f(str, "md5");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT %s FROM %s WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"gid", "sync_photo_cache", "md5", "userId"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, str, CoreUtility.f89233i);
            if (mo2775p != null && mo2775p.next()) {
                return mo2775p.getString(mo2775p.getColumnIndex("gid"));
            }
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return null;
    }

    /* renamed from: Y1 */
    public final void m41765Y1(int i11, String str, String str2, C24764f c24764f) {
        List m128727a;
        AbstractC19074t.m100208f(str, "currentDate");
        AbstractC19074t.m100208f(str2, "threadId");
        AbstractC19074t.m100208f(c24764f, "threadInfoLog");
        String str3 = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str3);
        if (str3.length() != 0 && (m128727a = c24764f.m128727a()) != null && !m128727a.isEmpty()) {
            try {
                try {
                    try {
                    } catch (Throwable th2) {
                        try {
                            if (this.f43231a.isOpen()) {
                                this.f43231a.mo2850l();
                            }
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    AbstractC20110a.f98889a.mo104552e(e12);
                    return;
                }
            } catch (Exception e13) {
                AbstractC20110a.f98889a.mo104552e(e13);
                if (this.f43231a.isOpen()) {
                    this.f43231a.mo2850l();
                }
            }
            if (!this.f43231a.isOpen()) {
                try {
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    AbstractC20110a.f98889a.mo104552e(e14);
                    return;
                }
            }
            this.f43231a.mo2845e();
            m41595A3(str3, i11, str, str2, c24764f);
            if (!this.f43231a.isOpen()) {
                try {
                    if (this.f43231a.isOpen()) {
                        this.f43231a.mo2850l();
                        return;
                    }
                    return;
                } catch (Exception e15) {
                    AbstractC20110a.f98889a.mo104552e(e15);
                    return;
                }
            }
            this.f43231a.mo2849k();
            if (this.f43231a.isOpen()) {
                this.f43231a.mo2850l();
            }
        }
    }

    /* renamed from: Y2 */
    public final int m41766Y2(String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "avatarUrl");
        AbstractC19074t.m100208f(str3, "displayName");
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        try {
            try {
                this.f43235e.acquire();
                ContentValues contentValues = new ContentValues();
                contentValues.put("avatarUrl", str2);
                contentValues.put("displayName", str3);
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, " %s = ? AND %s = ? AND (%s <> ? OR %s <> ? )", Arrays.copyOf(new Object[]{"currentUserUid", "uid", "avatarUrl", "displayName"}, 4));
                AbstractC19074t.m100207e(format, "format(...)");
                int mo2776q = this.f43231a.mo2776q("new_messages_2", contentValues, format, new String[]{CoreUtility.f89233i, str, str2, str3});
                if (mo2776q > 0) {
                    try {
                        Conversation m103202S = C19669z.Companion.m103232a().m103202S(str);
                        if (m103202S != null) {
                            m103202S.f42895s = str2;
                            m103202S.f42894r = str3;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        i11 = mo2776q;
                        AbstractC23350e.m122776f("DatabaseChatHelper", e);
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        String str4 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str4, "currentUserUid");
                        AbstractC20887g.m109232j(str4, 16041, e.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                        this.f43235e.release();
                        return i11;
                    }
                }
                C23744a.b bVar = C23744a.Companion;
                bVar.m124119a().m124116d(36, new Object[0]);
                bVar.m124119a().m124116d(6064, new Object[0]);
                this.f43235e.release();
                return mo2776q;
            } catch (Throwable th2) {
                this.f43235e.release();
                throw th2;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: Z0 */
    public final C28260f m41767Z0(String str) {
        AbstractC19074t.m100208f(str, "zipFileName");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"sync_media_zip_metadata", "userId", "name"}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, str);
            if (mo2775p != null) {
                try {
                    if (mo2775p.next()) {
                        String string = mo2775p.getString(mo2775p.getColumnIndex("name"));
                        String string2 = mo2775p.getString(mo2775p.getColumnIndex("gId"));
                        long j11 = mo2775p.getLong(mo2775p.getColumnIndex("size"));
                        long j12 = mo2775p.getLong(mo2775p.getColumnIndex("ts"));
                        String string3 = mo2775p.getString(mo2775p.getColumnIndex("checksumMd5"));
                        String m119736F = AbstractC23244v8.m119736F(string);
                        AbstractC19074t.m100207e(m119736F, "wrapNonNull(...)");
                        String m119736F2 = AbstractC23244v8.m119736F(string2);
                        AbstractC19074t.m100207e(m119736F2, "wrapNonNull(...)");
                        String m119736F3 = AbstractC23244v8.m119736F(string3);
                        AbstractC19074t.m100207e(m119736F3, "wrapNonNull(...)");
                        C28260f c28260f = new C28260f(m119736F, m119736F2, j11, j12, m119736F3);
                        AbstractC3601a.m18219a(mo2775p, null);
                        return c28260f;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC3601a.m18219a(mo2775p, th2);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return null;
    }

    /* renamed from: Z1 */
    public final void m41768Z1(C28615g c28615g) {
        AbstractC19074t.m100208f(c28615g, "syncCloudMsgInfo");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("userId", CoreUtility.f89233i);
            contentValues.put("ownerId", c28615g.m143107h());
            contentValues.put("numMember", Integer.valueOf(c28615g.m143102c()));
            contentValues.put("totalSessionLoad", Integer.valueOf(c28615g.m143110k()));
            contentValues.put("startTimeSync", Long.valueOf(c28615g.m143105f()));
            contentValues.put("endTimeSync", Long.valueOf(c28615g.m143101b()));
            contentValues.put("totalMsgStartSync", Integer.valueOf(c28615g.m143109j()));
            contentValues.put("totalMsgEndSync", Integer.valueOf(c28615g.m143108i()));
            contentValues.put("stateLoad", Integer.valueOf(c28615g.m143106g()));
            contentValues.put("numMsgLoaded", Integer.valueOf(c28615g.m143103d()));
            contentValues.put("sessionId", c28615g.m143104e());
            this.f43231a.mo2771C("sync_cloud_msg_info", null, contentValues);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: Z2 */
    public final void m41769Z2(String str, String str2) {
        Conversation m103202S;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "avatarUrl");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                ContentValues contentValues = new ContentValues();
                contentValues.put("avatarUrl", str2);
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, " %s = ? AND %s = ? AND %s <> ? ", Arrays.copyOf(new Object[]{"currentUserUid", "uid", "avatarUrl"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                if (this.f43231a.mo2776q("new_messages_2", contentValues, format, new String[]{CoreUtility.f89233i, str, str2}) > 0 && (m103202S = C19669z.Companion.m103232a().m103202S(str)) != null) {
                    m103202S.f42895s = str2;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                AbstractC20887g.m109232j(str3, 16042, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: a1 */
    public final b m41770a1() {
        return this.f43237g;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:19|(2:58|59)(1:21)|(1:23)(1:57)|24|(1:56)(3:(2:31|(6:33|34|35|(1:37)|(1:39)|40))|50|(6:54|34|35|(0)|(0)|40))|55|34|35|(0)|(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:            r0 = e;     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6 A[Catch: all -> 0x0075, Exception -> 0x00b9, TRY_LEAVE, TryCatch #4 {all -> 0x0075, blocks: (B:16:0x005f, B:18:0x0065, B:59:0x0070, B:23:0x0082, B:24:0x0088, B:26:0x0092, B:28:0x0098, B:31:0x00a0, B:35:0x00bd, B:39:0x00c6, B:40:0x00ee, B:44:0x00f4, B:52:0x00b1, B:49:0x00eb), top: B:15:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m41771a3(int i11, String str) {
        Throwable th2;
        InterfaceC0949z interfaceC0949z;
        long currentTimeMillis;
        StringBuilder sb2;
        String string;
        int i12;
        int i13;
        long currentTimeMillis2 = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select %s, %s, %s from %s where %s = ? and %s = ? ", Arrays.copyOf(new Object[]{"currentUserUid", "uid", "cateMsg", "new_messages_2", "currentUserUid", "cateMsg"}, 6));
            AbstractC19074t.m100207e(format, "format(...)");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i11);
            InterfaceC0949z mo2775p = interfaceC0947y.mo2775p(format, str, sb3.toString());
            if (mo2775p != null) {
                try {
                    try {
                        if (mo2775p.next()) {
                            int columnIndex = mo2775p.getColumnIndex("uid");
                            int columnIndex2 = mo2775p.getColumnIndex("cateMsg");
                            do {
                                if (columnIndex != -1) {
                                    try {
                                        string = mo2775p.getString(columnIndex);
                                    } catch (Exception e11) {
                                        e = e11;
                                        AbstractC23350e.m122776f("DatabaseChatHelper", e);
                                    }
                                } else {
                                    string = "";
                                }
                                if (columnIndex2 != -1) {
                                    i12 = mo2775p.getInt(columnIndex2);
                                } else {
                                    i12 = 1;
                                }
                                int m114538e = AbstractC21935u.m114538e(string);
                                if (!AbstractC25495a.m132084i(string) && !AbstractC25495a.m132081f(string) && !AbstractC25495a.m132086k(string)) {
                                    if (m114538e == 0) {
                                        C0872f c0872f = this.f43232b;
                                        AbstractC19074t.m100205c(string);
                                        if (c0872f.m2529X(string)) {
                                            i13 = 2;
                                            if (AbstractC25495a.m132086k(string)) {
                                                i13 = 1;
                                            }
                                            if (i13 != i12) {
                                                hashMap.remove(string);
                                                Integer valueOf = Integer.valueOf(i13);
                                                AbstractC19074t.m100205c(string);
                                                hashMap.put(string, valueOf);
                                                ContentValues contentValues = new ContentValues();
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append(i13);
                                                contentValues.put("cateMsg", sb4.toString());
                                                m41653l3(string, contentValues);
                                            }
                                        }
                                    }
                                    if (m114538e == 1 && AbstractC21935u.m114559z(string) == 1) {
                                        i13 = 3;
                                        if (AbstractC25495a.m132086k(string)) {
                                        }
                                        if (i13 != i12) {
                                        }
                                    }
                                }
                                i13 = 1;
                                if (AbstractC25495a.m132086k(string)) {
                                }
                                if (i13 != i12) {
                                }
                            } while (mo2775p.next());
                            C19669z.Companion.m103232a().m103219d1(hashMap);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC0949z = mo2775p;
                        if (interfaceC0949z != null) {
                            try {
                                interfaceC0949z.close();
                            } catch (SQLiteException e12) {
                                AbstractC23350e.m122776f("DatabaseChatHelper", e12);
                            }
                        }
                        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("update Cate: ");
                        sb5.append(currentTimeMillis3);
                        throw th2;
                    }
                } catch (Exception e13) {
                    e = e13;
                    interfaceC0949z = mo2775p;
                    try {
                        AbstractC23350e.m122776f("DatabaseChatHelper", e);
                        long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis2;
                        String str2 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str2, "currentUserUid");
                        AbstractC20887g.m109232j(str2, 16026, e.toString(), currentTimeMillis4, 16000, CoreUtility.f89236l);
                        if (interfaceC0949z != null) {
                            try {
                                interfaceC0949z.close();
                            } catch (SQLiteException e14) {
                                AbstractC23350e.m122776f("DatabaseChatHelper", e14);
                            }
                        }
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
                        sb2 = new StringBuilder();
                        sb2.append("update Cate: ");
                        sb2.append(currentTimeMillis);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (interfaceC0949z != null) {
                        }
                        long currentTimeMillis32 = System.currentTimeMillis() - currentTimeMillis2;
                        StringBuilder sb52 = new StringBuilder();
                        sb52.append("update Cate: ");
                        sb52.append(currentTimeMillis32);
                        throw th2;
                    }
                }
            }
            if (mo2775p != null) {
                try {
                    mo2775p.close();
                } catch (SQLiteException e15) {
                    AbstractC23350e.m122776f("DatabaseChatHelper", e15);
                }
            }
            currentTimeMillis = System.currentTimeMillis() - currentTimeMillis2;
            sb2 = new StringBuilder();
        } catch (Exception e16) {
            e = e16;
            interfaceC0949z = null;
        } catch (Throwable th5) {
            th2 = th5;
            interfaceC0949z = null;
        }
        sb2.append("update Cate: ");
        sb2.append(currentTimeMillis);
    }

    /* renamed from: b1 */
    public final boolean m41772b1() {
        return this.f43234d;
    }

    /* renamed from: b2 */
    public final boolean m41773b2(String str) {
        InterfaceC0949z mo2777u;
        AbstractC19074t.m100208f(str, "tableName");
        long currentTimeMillis = System.currentTimeMillis();
        boolean z11 = true;
        try {
            mo2777u = this.f43231a.mo2777u("SELECT * FROM SQLITE_MASTER WHERE NAME = '" + str + "'");
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 16071, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        if (mo2777u != null) {
            try {
                if (!mo2777u.next()) {
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2777u, null);
                return z11;
            } finally {
            }
        }
        z11 = false;
        C24848g0 c24848g02 = C24848g0.f119245a;
        AbstractC3601a.m18219a(mo2777u, null);
        return z11;
    }

    /* renamed from: b3 */
    public final int m41774b3(String str, int i11) {
        Conversation m103202S;
        AbstractC19074t.m100208f(str, "uid");
        long currentTimeMillis = System.currentTimeMillis();
        int i12 = 0;
        try {
            ContentValues contentValues = new ContentValues();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i11);
            contentValues.put("cateMsg", sb2.toString());
            i12 = m41653l3(str, contentValues);
            if (i12 > 0 && (m103202S = C19669z.Companion.m103232a().m103202S(str)) != null) {
                m103202S.f42897u = i11;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 16032, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return i12;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:12|13|(2:15|16)|18|19|20|21|(1:23)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:            r15 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:            ho0.AbstractC20110a.f98889a.mo104553f(r15, "[ZDB]", new java.lang.Object[0]);        r15.printStackTrace();     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:21:0x0084, B:23:0x008a, B:24:0x0091), top: B:20:0x0084, outer: #6 }] */
    /* renamed from: c1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C24860q m41775c1(String str) {
        int i11;
        int i12;
        InterfaceC0949z mo2775p;
        InterfaceC0949z mo2775p2;
        int i13;
        int i14 = Integer.MIN_VALUE;
        if (this.f43234d && !TextUtils.isEmpty(str)) {
            try {
                InterfaceC0947y interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "select rowid from %s where %s = ? order by rowId limit 1", Arrays.copyOf(new Object[]{"chat_content", "currentUserUid"}, 2));
                AbstractC19074t.m100207e(format, "format(...)");
                mo2775p2 = interfaceC0947y.mo2775p(format, str);
                try {
                    if (mo2775p2.next()) {
                        i12 = mo2775p2.getInt(0);
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i13 = Integer.MIN_VALUE;
                }
            } catch (Exception e11) {
                e = e11;
                i12 = Integer.MIN_VALUE;
            }
            try {
                C24848g0 c24848g0 = C24848g0.f119245a;
                try {
                    try {
                        AbstractC3601a.m18219a(mo2775p2, null);
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        InterfaceC0947y interfaceC0947y2 = this.f43231a;
                        C19067n0 c19067n02 = C19067n0.f94947a;
                        String format2 = String.format(Locale.US, "select rowid from %s where %s = ? order by rowId desc limit 1", Arrays.copyOf(new Object[]{"chat_content", "currentUserUid"}, 2));
                        AbstractC19074t.m100207e(format2, "format(...)");
                        mo2775p = interfaceC0947y2.mo2775p(format2, str);
                        if (mo2775p.next()) {
                        }
                        C24848g0 c24848g02 = C24848g0.f119245a;
                        AbstractC3601a.m18219a(mo2775p, null);
                        i11 = i14;
                        i14 = i12;
                        return new C24860q(Integer.valueOf(i14), Integer.valueOf(i11));
                    }
                    if (mo2775p.next()) {
                        i14 = mo2775p.getInt(0);
                    }
                    C24848g0 c24848g022 = C24848g0.f119245a;
                    AbstractC3601a.m18219a(mo2775p, null);
                    i11 = i14;
                    i14 = i12;
                } finally {
                }
                InterfaceC0947y interfaceC0947y22 = this.f43231a;
                C19067n0 c19067n022 = C19067n0.f94947a;
                String format22 = String.format(Locale.US, "select rowid from %s where %s = ? order by rowId desc limit 1", Arrays.copyOf(new Object[]{"chat_content", "currentUserUid"}, 2));
                AbstractC19074t.m100207e(format22, "format(...)");
                mo2775p = interfaceC0947y22.mo2775p(format22, str);
            } catch (Throwable th3) {
                i13 = i12;
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    try {
                        AbstractC3601a.m18219a(mo2775p2, th);
                        throw th4;
                    } catch (Exception e13) {
                        e = e13;
                        i12 = i13;
                        e.printStackTrace();
                        InterfaceC0947y interfaceC0947y222 = this.f43231a;
                        C19067n0 c19067n0222 = C19067n0.f94947a;
                        String format222 = String.format(Locale.US, "select rowid from %s where %s = ? order by rowId desc limit 1", Arrays.copyOf(new Object[]{"chat_content", "currentUserUid"}, 2));
                        AbstractC19074t.m100207e(format222, "format(...)");
                        mo2775p = interfaceC0947y222.mo2775p(format222, str);
                        if (mo2775p.next()) {
                        }
                        C24848g0 c24848g0222 = C24848g0.f119245a;
                        AbstractC3601a.m18219a(mo2775p, null);
                        i11 = i14;
                        i14 = i12;
                        return new C24860q(Integer.valueOf(i14), Integer.valueOf(i11));
                    }
                }
            }
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return new C24860q(Integer.valueOf(i14), Integer.valueOf(i11));
    }

    /* renamed from: c2 */
    public final void m41776c2(long j11) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "UPDATE %s SET %s = ? WHERE cast(%s as INTEGER) > ?", Arrays.copyOf(new Object[]{"new_messages_2", "timestamp", "timestamp"}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        this.f43231a.mo2778v(format, String.valueOf(j11), Long.valueOf(j11));
    }

    /* renamed from: c3 */
    public final void m41777c3(String str) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            try {
                this.f43235e.acquire();
                ContentValues contentValues = new ContentValues();
                contentValues.put("conversationExtInfo", m41681z(str));
                m41653l3(str, contentValues);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: d2 */
    public final C3556x m41778d2() {
        long currentTimeMillis = System.currentTimeMillis();
        C3556x c3556x = new C3556x();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "currentUserUid"}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i);
            try {
                m41642f2(mo2775p, c3556x);
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2775p, null);
            } finally {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16031, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return c3556x;
    }

    /* renamed from: d3 */
    public final int m41779d3(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "chatId");
        AbstractC19074t.m100208f(messageId, "lastDeletedMsgId");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_uid", CoreUtility.f89233i);
            contentValues.put("chat_id", str);
            long m41047k = messageId.m41047k();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m41047k);
            contentValues.put("last_deleted_msg_id", sb2.toString());
            long m41045i = messageId.m41045i();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m41045i);
            contentValues.put("last_deleted_msg_ts", sb3.toString());
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ? ", Arrays.copyOf(new Object[]{"current_uid", "chat_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            return this.f43231a.mo2776q("conversation_info_extra", contentValues, format, new String[]{CoreUtility.f89233i, str});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            return 0;
        }
    }

    /* renamed from: e1 */
    public final AbstractC28617b m41780e1(String str) {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ? AND %s = ? ORDER BY %s DESC LIMIT 1", Arrays.copyOf(new Object[]{"job_manager", "queue", "userid", "ts"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, str, CoreUtility.f89233i);
            if (mo2775p != null) {
                try {
                    if (mo2775p.next()) {
                        AbstractC28617b m143189a = C28629n.m143189a(mo2775p);
                        AbstractC3601a.m18219a(mo2775p, null);
                        return m143189a;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC3601a.m18219a(mo2775p, th2);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return null;
    }

    /* renamed from: e2 */
    public final void m41781e2() {
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select * from %s", Arrays.copyOf(new Object[]{"send_seen_reaction"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2777u = interfaceC0947y.mo2777u(format);
            if (mo2777u != null) {
                while (mo2777u.next()) {
                    try {
                        int columnIndex = mo2777u.getColumnIndex("conversationId");
                        int columnIndex2 = mo2777u.getColumnIndex("reactionId");
                        String string = mo2777u.getString(columnIndex);
                        long j11 = mo2777u.getLong(columnIndex2);
                        if (string != null && string.length() != 0 && j11 > 0) {
                            C0827k0.a aVar = C0827k0.Companion;
                            AbstractC19074t.m100205c(string);
                            aVar.m2168c(string, j11, false);
                            AbstractC20110a.f98889a.mo104554k("ReactionSendSeen addSendSeenReactionAsync->queueRequest " + string + " " + j11, new Object[0]);
                        }
                    } finally {
                    }
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2777u, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: e3 */
    public final void m41782e3(int i11) {
        m41643f3(this.f43231a, i11);
    }

    /* renamed from: f0 */
    public final int m41783f0() {
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ?", Arrays.copyOf(new Object[]{"user_id"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return this.f43231a.mo2770B("my_cloud_collection_info", format, new String[]{CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            return 0;
        }
    }

    /* renamed from: f1 */
    public final C28609a m41784f1(String str) {
        C28609a m41514K;
        AbstractC19074t.m100208f(str, "threadId");
        C28609a c28609a = new C28609a(str, 0L, 0L);
        AutoCloseable autoCloseable = null;
        try {
            try {
                try {
                    InterfaceC0947y interfaceC0947y = this.f43231a;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format(Locale.US, "select * from %s where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"last_msg_id", "cur_uid", "thread_id"}, 3));
                    AbstractC19074t.m100207e(format, "format(...)");
                    InterfaceC0949z mo2775p = interfaceC0947y.mo2775p(format, CoreUtility.f89233i, str);
                    if (mo2775p != null) {
                        if (mo2775p.next()) {
                            m41514K = new C28609a(mo2775p);
                        } else {
                            m41514K = C7956b.Companion.m41573b().m41514K(str);
                        }
                        c28609a = m41514K;
                    }
                    if (mo2775p != null) {
                        mo2775p.close();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                    if (0 != 0) {
                        autoCloseable.close();
                    }
                }
            } catch (SQLiteException e12) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e12);
            }
            return c28609a;
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    autoCloseable.close();
                } catch (SQLiteException e13) {
                    AbstractC23350e.m122776f("DatabaseChatHelper", e13);
                }
            }
            throw th2;
        }
    }

    /* renamed from: g0 */
    public final void m41785g0(String str, long j11, boolean z11) {
        String format;
        StringBuilder sb2;
        AbstractC19074t.m100208f(str, "threadId");
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            Locale locale = Locale.US;
            format = String.format(locale, "%s = ? and %s = ? and cast(%s as integer) > 0 and cast(%s as integer) < ?", Arrays.copyOf(new Object[]{"userId", "ownerId", "fromMsgId", "fromMsgId"}, 4));
            AbstractC19074t.m100207e(format, "format(...)");
            if (z11) {
                format = String.format(locale, "%s = ? and %s = ? and cast(%s as integer) > 0 and cast(%s as integer) <= ?", Arrays.copyOf(new Object[]{"userId", "ownerId", "fromMsgId", "fromMsgId"}, 4));
                AbstractC19074t.m100207e(format, "format(...)");
            }
            sb2 = new StringBuilder();
            sb2.append(j11);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            int mo2770B = this.f43231a.mo2770B("pull_msg_offline", format, new String[]{CoreUtility.f89233i, str, sb2.toString()});
            AbstractC20110a.f98889a.mo104554k("PullMsgOffline DELETE: " + str + " result=" + mo2770B, new Object[0]);
        } catch (Exception e12) {
            e = e12;
            AbstractC23350e.m122776f("DatabaseChatHelper", e);
        }
    }

    /* renamed from: g2 */
    public final Map m41786g2(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT %s, %s, %s, %s FROM %s ORDER BY rowid DESC LIMIT ?", Arrays.copyOf(new Object[]{"uid_clientmsgids", "globalMsgId", "chat_id", "ack_data", "clientmsgids"}, 5));
        AbstractC19074t.m100207e(format, "format(...)");
        HashMap hashMap = new HashMap();
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, Integer.valueOf(i11));
            try {
                if (mo2775p.next()) {
                    int columnIndex = mo2775p.getColumnIndex("uid_clientmsgids");
                    int columnIndex2 = mo2775p.getColumnIndex("globalMsgId");
                    int columnIndex3 = mo2775p.getColumnIndex("chat_id");
                    int columnIndex4 = mo2775p.getColumnIndex("ack_data");
                    while (true) {
                        String string = mo2775p.getString(columnIndex);
                        long j11 = mo2775p.getLong(columnIndex2);
                        String string2 = mo2775p.getString(columnIndex3);
                        String string3 = mo2775p.getString(columnIndex4);
                        AbstractC19074t.m100205c(string);
                        AbstractC19074t.m100205c(string2);
                        int i12 = columnIndex;
                        hashMap.put(string, new C26710b(string, j11, string2, string3));
                        if (!mo2775p.next()) {
                            break;
                        }
                        columnIndex = i12;
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2775p, null);
            } finally {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16007, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
        return hashMap;
    }

    /* renamed from: g3 */
    public final void m41787g3(String str, String str2) {
        Conversation m103202S;
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "displayName");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f43235e.acquire();
                ContentValues contentValues = new ContentValues();
                contentValues.put("displayName", str2);
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, " %s = ? AND %s = ? AND %s <> ? ", Arrays.copyOf(new Object[]{"currentUserUid", "uid", "displayName"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
                if (this.f43231a.mo2776q("new_messages_2", contentValues, format, new String[]{CoreUtility.f89233i, str, str2}) > 0 && (m103202S = C19669z.Companion.m103232a().m103202S(str)) != null) {
                    m103202S.f42894r = str2;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                AbstractC20887g.m109232j(str3, 16043, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: h0 */
    public final void m41788h0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ?", Arrays.copyOf(new Object[]{"userId", "ownerId"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2770B("pull_msg_offline", format, new String[]{CoreUtility.f89233i, str});
            AbstractC20110a.f98889a.mo104554k("PullMsgOffline DELETE: " + str + " ", new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: h1 */
    public final List m41789h1(ArrayList arrayList) {
        String m127114D;
        String m127114D2;
        AbstractC19074t.m100208f(arrayList, "listThreadId");
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        InterfaceC0949z interfaceC0949z = null;
        try {
            try {
                try {
                    this.f43231a.mo2845e();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add("'" + ((String) it.next()) + "'");
                    }
                    String obj = arrayList3.toString();
                    AbstractC19074t.m100207e(obj, "toString(...)");
                    m127114D = AbstractC24341v.m127114D(obj, "[", "", false, 4, null);
                    m127114D2 = AbstractC24341v.m127114D(m127114D, "]", "", false, 4, null);
                    InterfaceC0947y interfaceC0947y = this.f43231a;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format(Locale.US, "select * from %s where %s = ? and %s in (%s)", Arrays.copyOf(new Object[]{"last_msg_id", "cur_uid", "thread_id", m127114D2}, 4));
                    AbstractC19074t.m100207e(format, "format(...)");
                    interfaceC0949z = interfaceC0947y.mo2775p(format, CoreUtility.f89233i);
                    if (interfaceC0949z != null) {
                        while (interfaceC0949z.next()) {
                            C28609a c28609a = new C28609a(interfaceC0949z);
                            hashMap.put(c28609a.f132634a, c28609a);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        if (!hashMap.containsKey(str)) {
                            arrayList4.add(str);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        AbstractC23350e.m122772b("PullMsgOffline listThreadIdNoResult = " + arrayList4, new Object[0]);
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            String str2 = (String) it3.next();
                            C7956b m41573b = C7956b.Companion.m41573b();
                            AbstractC19074t.m100205c(str2);
                            hashMap.put(str2, m41573b.m41514K(str2));
                        }
                    }
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        String str3 = (String) it4.next();
                        C28609a c28609a2 = (C28609a) hashMap.get(str3);
                        if (c28609a2 == null) {
                            AbstractC19074t.m100205c(str3);
                            c28609a2 = new C28609a(str3, 0L, 0L);
                        }
                        arrayList2.add(c28609a2);
                    }
                    this.f43231a.mo2849k();
                    if (interfaceC0949z != null) {
                        try {
                            interfaceC0949z.close();
                        } catch (SQLiteException e11) {
                            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                        }
                    }
                    this.f43231a.mo2850l();
                } finally {
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e12);
                if (interfaceC0949z != null) {
                    try {
                        interfaceC0949z.close();
                    } catch (SQLiteException e13) {
                        AbstractC23350e.m122776f("DatabaseChatHelper", e13);
                    }
                }
                this.f43231a.mo2850l();
            }
        } catch (SQLiteException e14) {
            e14.printStackTrace();
        }
        return arrayList2;
    }

    /* renamed from: h3 */
    public final void m41790h3(int i11, String str, HashMap hashMap) {
        AbstractC19074t.m100208f(str, "date");
        AbstractC19074t.m100208f(hashMap, "threadListMap");
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100205c(str2);
        if (str2.length() == 0 || hashMap.isEmpty()) {
            return;
        }
        m41678w3(str2, i11, str, hashMap);
    }

    /* renamed from: i0 */
    public final void m41791i0() {
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ?", Arrays.copyOf(new Object[]{"userId"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2770B("sync_cloud_msg_info", format, new String[]{CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: i1 */
    public final List m41792i1() {
        ArrayList arrayList = new ArrayList();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ? AND (%s IS NULL OR %s == '')", Arrays.copyOf(new Object[]{"sync_photo_cache", "userId", "zipParentName", "zipParentName"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        InterfaceC0949z interfaceC0949z = null;
        try {
            try {
                try {
                    interfaceC0949z = this.f43231a.mo2775p(format, CoreUtility.f89233i);
                    if (interfaceC0949z != null) {
                        int columnIndex = interfaceC0949z.getColumnIndex("md5");
                        int columnIndex2 = interfaceC0949z.getColumnIndex("gid");
                        int columnIndex3 = interfaceC0949z.getColumnIndex("size");
                        int columnIndex4 = interfaceC0949z.getColumnIndex("ts");
                        while (interfaceC0949z.next()) {
                            String m119736F = AbstractC23244v8.m119736F(interfaceC0949z.getString(columnIndex));
                            AbstractC19074t.m100207e(m119736F, "wrapNonNull(...)");
                            String m119736F2 = AbstractC23244v8.m119736F(interfaceC0949z.getString(columnIndex2));
                            AbstractC19074t.m100207e(m119736F2, "wrapNonNull(...)");
                            arrayList.add(C28255a.Companion.m142284a(m119736F, m119736F2, interfaceC0949z.getLong(columnIndex4), interfaceC0949z.getLong(columnIndex3)));
                        }
                    }
                    if (interfaceC0949z != null) {
                        interfaceC0949z.close();
                    }
                } catch (Throwable th2) {
                    if (interfaceC0949z != null) {
                        try {
                            interfaceC0949z.close();
                        } catch (Exception e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                    }
                    throw th2;
                }
            } catch (SQLiteException e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                }
            }
        } catch (Exception e13) {
            AbstractC20110a.f98889a.mo104552e(e13);
        }
        return arrayList;
    }

    /* renamed from: i2 */
    public final C3556x m41793i2(String str) {
        AbstractC19074t.m100208f(str, "uid");
        C3556x c3556x = new C3556x();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "currentUserUid", "uid"}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, str);
            try {
                m41642f2(mo2775p, c3556x);
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2775p, null);
            } finally {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
        return c3556x;
    }

    /* renamed from: i3 */
    public final void m41794i3(String str, FirstUnreadMsg firstUnreadMsg) {
        String m41024c;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("UPDATE %s SET %s = ? WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "timestampFirstNew", "currentUserUid", "uid"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        if (firstUnreadMsg != null) {
            try {
                m41024c = firstUnreadMsg.m41024c();
                if (m41024c == null) {
                }
                this.f43231a.mo2778v(format, m41024c, CoreUtility.f89233i, str);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                return;
            }
        }
        m41024c = "";
        this.f43231a.mo2778v(format, m41024c, CoreUtility.f89233i, str);
    }

    /* renamed from: j0 */
    public final void m41795j0(long j11) {
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "delete from %s where %s = ? ", Arrays.copyOf(new Object[]{"chat_group_state", "clientMsgId"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2778v(format, Long.valueOf(j11));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: j1 */
    public final List m41796j1() {
        String str;
        int i11;
        int i12;
        C28255a c28255a;
        String str2 = "wrapNonNull(...)";
        ArrayList arrayList = new ArrayList();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ?", Arrays.copyOf(new Object[]{"sync_photo_cache", "userId"}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i);
            if (mo2775p != null) {
                try {
                    int columnIndex = mo2775p.getColumnIndex("md5");
                    int columnIndex2 = mo2775p.getColumnIndex("gid");
                    int columnIndex3 = mo2775p.getColumnIndex("size");
                    int columnIndex4 = mo2775p.getColumnIndex("ts");
                    int columnIndex5 = mo2775p.getColumnIndex("zipParentName");
                    int columnIndex6 = mo2775p.getColumnIndex("senderId");
                    int columnIndex7 = mo2775p.getColumnIndex("clientMsgId");
                    int columnIndex8 = mo2775p.getColumnIndex("ownerId");
                    while (mo2775p.next()) {
                        String m119736F = AbstractC23244v8.m119736F(mo2775p.getString(columnIndex));
                        AbstractC19074t.m100207e(m119736F, str2);
                        String m119736F2 = AbstractC23244v8.m119736F(mo2775p.getString(columnIndex2));
                        AbstractC19074t.m100207e(m119736F2, str2);
                        long j11 = mo2775p.getLong(columnIndex3);
                        long j12 = mo2775p.getLong(columnIndex4);
                        String m119736F3 = AbstractC23244v8.m119736F(mo2775p.getString(columnIndex5));
                        AbstractC19074t.m100207e(m119736F3, str2);
                        if (TextUtils.isEmpty(m119736F3)) {
                            c28255a = C28255a.Companion.m142284a(m119736F, m119736F2, j12, j11);
                            str = str2;
                            i11 = columnIndex;
                            i12 = columnIndex2;
                        } else {
                            String string = mo2775p.getString(columnIndex6);
                            str = str2;
                            String string2 = mo2775p.getString(columnIndex7);
                            String string3 = mo2775p.getString(columnIndex8);
                            i11 = columnIndex;
                            MessageId.C7932a c7932a = MessageId.Companion;
                            i12 = columnIndex2;
                            AbstractC19074t.m100205c(string3);
                            AbstractC19074t.m100205c(string);
                            MessageId m41066e = c7932a.m41066e(string2, "", string3, string);
                            if (m41066e != null) {
                                c28255a = C28262h.Companion.m142329a(m119736F, m119736F2, j12, j11, m119736F3, string3, string, m41066e);
                            } else {
                                c28255a = null;
                            }
                        }
                        if (c28255a != null) {
                            arrayList.add(c28255a);
                        }
                        str2 = str;
                        columnIndex = i11;
                        columnIndex2 = i12;
                    }
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* renamed from: j2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m41797j2(Long l11) {
        char c11;
        char c12;
        String format;
        ArrayList arrayList = new ArrayList();
        InterfaceC0949z interfaceC0949z = null;
        try {
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
        try {
            try {
                C19067n0 c19067n0 = C19067n0.f94947a;
                c11 = 3;
                c12 = 2;
                format = String.format(Locale.US, "select * from %s where %s = ? and %s = ? ", Arrays.copyOf(new Object[]{"my_cloud_collection_item", "user_id", "collection_id"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (0 == 0) {
                }
            }
            try {
                interfaceC0949z = this.f43231a.mo2775p(format, CoreUtility.f89233i, l11);
                int[] iArr = {interfaceC0949z.getColumnIndex("collection_id"), interfaceC0949z.getColumnIndex("client_msg_id"), interfaceC0949z.getColumnIndex("global_msg_id"), interfaceC0949z.getColumnIndex("add_time")};
                while (interfaceC0949z.next()) {
                    arrayList.add(new C24800d(interfaceC0949z.getLong(iArr[0]), MessageId.Companion.m41066e(interfaceC0949z.getString(iArr[1]), interfaceC0949z.getString(iArr[c12]), "204278670", ""), interfaceC0949z.getLong(iArr[c11])));
                    c11 = 3;
                    c12 = 2;
                }
                interfaceC0949z.close();
            } catch (Exception e13) {
                e = e13;
                e.printStackTrace();
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                }
                return arrayList;
            }
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            if (0 == 0) {
                try {
                    interfaceC0949z.close();
                    throw th32;
                } catch (SQLiteException e14) {
                    e14.printStackTrace();
                    throw th32;
                }
            }
            throw th32;
        }
    }

    /* renamed from: j3 */
    public final void m41798j3(String str, LastDeliveredSeenData lastDeliveredSeenData) {
        String m41030c;
        AbstractC19074t.m100208f(str, "uid");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("UPDATE %s SET %s = ? WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "lastSeenDelivered", "currentUserUid", "uid"}, 4));
        AbstractC19074t.m100207e(format, "format(...)");
        if (lastDeliveredSeenData != null) {
            try {
                m41030c = lastDeliveredSeenData.m41030c();
                if (m41030c == null) {
                }
                this.f43231a.mo2778v(format, m41030c, CoreUtility.f89233i, str);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                return;
            }
        }
        m41030c = "";
        this.f43231a.mo2778v(format, m41030c, CoreUtility.f89233i, str);
    }

    /* renamed from: k0 */
    public final void m41799k0(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "DELETE FROM %s WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"clientmsgids", "current_uid", "chat_id"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2778v(format, CoreUtility.f89233i, str);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str2 = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str2, "currentUserUid");
            AbstractC20887g.m109232j(str2, 16005, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: k1 */
    public final Map m41800k1() {
        HashMap hashMap = new HashMap();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ?", Arrays.copyOf(new Object[]{"sync_media_zip_metadata", "userId"}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i);
            if (mo2775p != null) {
                try {
                    int columnIndex = mo2775p.getColumnIndex("name");
                    int columnIndex2 = mo2775p.getColumnIndex("gId");
                    int columnIndex3 = mo2775p.getColumnIndex("size");
                    int columnIndex4 = mo2775p.getColumnIndex("ts");
                    int columnIndex5 = mo2775p.getColumnIndex("checksumMd5");
                    while (mo2775p.next()) {
                        String m119736F = AbstractC23244v8.m119736F(mo2775p.getString(columnIndex));
                        AbstractC19074t.m100207e(m119736F, "wrapNonNull(...)");
                        String m119736F2 = AbstractC23244v8.m119736F(mo2775p.getString(columnIndex2));
                        AbstractC19074t.m100207e(m119736F2, "wrapNonNull(...)");
                        long j11 = mo2775p.getLong(columnIndex3);
                        long j12 = mo2775p.getLong(columnIndex4);
                        String m119736F3 = AbstractC23244v8.m119736F(mo2775p.getString(columnIndex5));
                        AbstractC19074t.m100207e(m119736F3, "wrapNonNull(...)");
                        hashMap.put(m119736F, new C28260f(m119736F, m119736F2, j11, j12, m119736F3));
                    }
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return hashMap;
    }

    /* renamed from: k3 */
    public final boolean m41801k3(Conversation conversation, C20567d c20567d) {
        int i11;
        AbstractC19074t.m100208f(conversation, "conversation");
        AbstractC19074t.m100208f(c20567d, "lastMsgData");
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        String str = conversation.f42893q;
        try {
            try {
                this.f43235e.acquire();
                ContentValues m41663r1 = m41663r1(conversation);
                m41607H2(m41663r1, c20567d);
                int m41653l3 = m41653l3(str, m41663r1);
                if (m41653l3 > 1) {
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    i11 = m41662r0(str2, str);
                } else {
                    i11 = 0;
                }
                if (m41653l3 == 0 || i11 > 0) {
                    this.f43231a.mo2771C("new_messages_2", null, m41663r1);
                }
                this.f43235e.release();
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
                String str3 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str3, "currentUserUid");
                AbstractC20887g.m109232j(str3, 16014, e11.toString(), currentThreadTimeMillis2, 16000, CoreUtility.f89236l);
                this.f43235e.release();
                return false;
            }
        } catch (Throwable th2) {
            this.f43235e.release();
            throw th2;
        }
    }

    /* renamed from: l0 */
    public final void m41802l0() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "delete from %s where %s = ? and %s like '%s' ", Arrays.copyOf(new Object[]{"clientmsgids", "current_uid", "chat_id", "group_%"}, 4));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2778v(format, CoreUtility.f89233i);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16005, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* renamed from: l1 */
    public final long m41803l1() {
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT max(%s) FROM %s", Arrays.copyOf(new Object[]{"timestamp", "new_messages_2"}, 2));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2777u = this.f43231a.mo2777u(format);
            try {
                if (mo2777u.next()) {
                    long j11 = mo2777u.getLong(0);
                    AbstractC3601a.m18219a(mo2777u, null);
                    return j11;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2777u, null);
                return -1L;
            } finally {
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1L;
        }
    }

    /* renamed from: l2 */
    public final void m41804l2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        if (!this.f43234d) {
            return;
        }
        AbstractC0937t.m4451b(interfaceC0947y, "chat_content", "header", "TEXT", "''");
        AbstractC0937t.m4451b(interfaceC0947y, "chat_content", "footer", "TEXT", "''");
        AbstractC0937t.m4451b(interfaceC0947y, "chat_content", "secret", "TEXT", "''");
        AbstractC0937t.m4451b(interfaceC0947y, "chat_content", "metadata_1", "TEXT", "''");
        AbstractC0937t.m4451b(interfaceC0947y, "chat_content", "metadata_2", "TEXT", "''");
        AbstractC0937t.m4451b(interfaceC0947y, "chat_content", "state_sync", "TEXT", "''");
    }

    /* renamed from: m0 */
    public final void m41805m0(String str) {
        AbstractC19074t.m100208f(str, "chatId");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ?", Arrays.copyOf(new Object[]{"current_uid", "chat_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2770B("conversation_info_extra", format, new String[]{CoreUtility.f89233i, str});
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: m1 */
    public final ArrayList m41806m1() {
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select * from %s where %s = ?", Arrays.copyOf(new Object[]{"deletemessages_v1", "cUid"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2775p = interfaceC0947y.mo2775p(format, CoreUtility.f89233i);
            if (mo2775p != null) {
                try {
                    if (mo2775p.next()) {
                        int columnIndex = mo2775p.getColumnIndex("msgId");
                        int columnIndex2 = mo2775p.getColumnIndex("cliMsgId");
                        int columnIndex3 = mo2775p.getColumnIndex("senderUid");
                        int columnIndex4 = mo2775p.getColumnIndex("ownerId");
                        int columnIndex5 = mo2775p.getColumnIndex("globalMsgId");
                        int columnIndex6 = mo2775p.getColumnIndex("timestamp");
                        int columnIndex7 = mo2775p.getColumnIndex(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                        int columnIndex8 = mo2775p.getColumnIndex("msgType");
                        while (true) {
                            C26711c c26711c = new C26711c();
                            c26711c.f126653a = mo2775p.getString(columnIndex);
                            String string = mo2775p.getString(columnIndex2);
                            String string2 = mo2775p.getString(columnIndex5);
                            String string3 = mo2775p.getString(columnIndex4);
                            String string4 = mo2775p.getString(columnIndex3);
                            int i11 = columnIndex;
                            MessageId.C7932a c7932a = MessageId.Companion;
                            AbstractC19074t.m100205c(string3);
                            AbstractC19074t.m100205c(string4);
                            c26711c.f126654b = c7932a.m41066e(string, string2, string3, string4);
                            c26711c.f126656d = string4;
                            c26711c.f126657e = string3;
                            c26711c.f126658f = mo2775p.getLong(columnIndex6);
                            c26711c.f126659g = mo2775p.getInt(columnIndex7);
                            c26711c.f126655c = mo2775p.getInt(columnIndex8);
                            arrayList.add(c26711c);
                            if (!mo2775p.next()) {
                                break;
                            }
                            columnIndex = i11;
                        }
                    }
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
        return arrayList;
    }

    /* renamed from: m2 */
    public final void m41807m2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        if (!this.f43234d) {
            return;
        }
        AbstractC0937t.m4450a(interfaceC0947y, "chat_content", "cliMsgIdReply");
        AbstractC0937t.m4450a(interfaceC0947y, "chat_content", "data1");
        AbstractC0937t.m4450a(interfaceC0947y, "chat_content", "data2");
        AbstractC0937t.m4450a(interfaceC0947y, "chat_content", "data3");
    }

    /* renamed from: n0 */
    public final void m41808n0(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s = ?", Arrays.copyOf(new Object[]{"gid"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2770B("sync_photo_cache", format, new String[]{str});
            return;
        }
        throw new Exception("File is null or file id is invalid");
    }

    /* renamed from: n1 */
    public final long m41809n1() {
        InterfaceC0949z interfaceC0949z = null;
        try {
            try {
                try {
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format(Locale.US, "select * from %s where %s = ? order by %s limit 1 ", Arrays.copyOf(new Object[]{"my_cloud_collection_info", "user_id", "collection_id"}, 3));
                    AbstractC19074t.m100207e(format, "format(...)");
                    interfaceC0949z = this.f43231a.mo2775p(format, CoreUtility.f89233i);
                    int[] iArr = {interfaceC0949z.getColumnIndex("collection_id")};
                    if (interfaceC0949z.next()) {
                        long j11 = interfaceC0949z.getLong(iArr[0]);
                        try {
                            interfaceC0949z.close();
                        } catch (SQLiteException e11) {
                            e11.printStackTrace();
                        }
                        return j11;
                    }
                    interfaceC0949z.close();
                    return 0L;
                } catch (Throwable th2) {
                    if (interfaceC0949z != null) {
                        try {
                            interfaceC0949z.close();
                        } catch (SQLiteException e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th2;
                }
            } catch (Exception e13) {
                e13.printStackTrace();
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                    return 0L;
                }
                return 0L;
            }
        } catch (SQLiteException e14) {
            e14.printStackTrace();
            return 0L;
        }
    }

    /* renamed from: n2 */
    public final void m41810n2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        if (!this.f43234d) {
            return;
        }
        AbstractC0937t.m4450a(interfaceC0947y, "chat_content", "reaction_state");
    }

    /* renamed from: n3 */
    public final void m41811n3(String str, int i11) {
        AbstractC19074t.m100208f(str, "uid");
        try {
            try {
                this.f43235e.acquire();
                ContentValues contentValues = new ContentValues();
                contentValues.put("lastMsgCountUnread", Integer.valueOf(i11));
                m41653l3(str, contentValues);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: o0 */
    public final void m41812o0(String str) {
        if (!TextUtils.isEmpty(str)) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s = ?", Arrays.copyOf(new Object[]{"zipParentName"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2770B("sync_photo_cache", format, new String[]{str});
            return;
        }
        throw new IllegalArgumentException("zipParentName is invalid".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[SYNTHETIC] */
    /* renamed from: o1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m41813o1() {
        String format;
        ArrayList arrayList = new ArrayList();
        InterfaceC0949z interfaceC0949z = null;
        try {
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
        try {
            try {
                C19067n0 c19067n0 = C19067n0.f94947a;
                format = String.format(Locale.US, "select * from %s where %s = ? and %s <= 0", Arrays.copyOf(new Object[]{"pull_msg_offline", "userId", "fromMsgId"}, 3));
                AbstractC19074t.m100207e(format, "format(...)");
            } catch (Exception e12) {
                e = e12;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (0 == 0) {
                }
            }
            try {
                interfaceC0949z = this.f43231a.mo2775p(format, CoreUtility.f89233i);
                int[] iArr = {interfaceC0949z.getColumnIndex("ownerId"), interfaceC0949z.getColumnIndex("fromMsgId"), interfaceC0949z.getColumnIndex("toGlobalMsgId"), interfaceC0949z.getColumnIndex("toClientMsgId"), interfaceC0949z.getColumnIndex("needDelete")};
                while (interfaceC0949z.next()) {
                    String string = interfaceC0949z.getString(iArr[0]);
                    long j11 = interfaceC0949z.getLong(iArr[1]);
                    long j12 = interfaceC0949z.getLong(iArr[2]);
                    long j13 = interfaceC0949z.getLong(iArr[3]);
                    int i11 = interfaceC0949z.getInt(iArr[4]);
                    AbstractC19074t.m100205c(string);
                    arrayList.add(new C28611c(string, j11, 0L, j12, j13, i11));
                }
                interfaceC0949z.close();
            } catch (Exception e13) {
                e = e13;
                e.printStackTrace();
                arrayList.clear();
                if (interfaceC0949z != null) {
                    interfaceC0949z.close();
                }
                AbstractC20110a.f98889a.mo104554k("PullMsgOffline LOAD getMsgOfflineJobNeedFetchPreview: %s", Integer.valueOf(arrayList.size()));
                return arrayList;
            }
            AbstractC20110a.f98889a.mo104554k("PullMsgOffline LOAD getMsgOfflineJobNeedFetchPreview: %s", Integer.valueOf(arrayList.size()));
            return arrayList;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            if (0 == 0) {
                try {
                    interfaceC0949z.close();
                    throw th32;
                } catch (SQLiteException e14) {
                    e14.printStackTrace();
                    throw th32;
                }
            }
            throw th32;
        }
    }

    /* renamed from: o2 */
    public final void m41814o2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        if (!this.f43234d) {
            return;
        }
        AbstractC0937t.m4450a(interfaceC0947y, "chat_content", "ttl");
    }

    /* renamed from: o3 */
    public final void m41815o3(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("cur_uid", CoreUtility.f89233i);
            contentValues.put("thread_id", str);
            if (messageId.m41047k() > 0) {
                long m41047k = messageId.m41047k();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m41047k);
                contentValues.put("last_global_msg_id", sb2.toString());
            }
            long m41045i = messageId.m41045i();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m41045i);
            contentValues.put("last_client_msg_id", sb3.toString());
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ? ", Arrays.copyOf(new Object[]{"cur_uid", "thread_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2776q("last_msg_id", contentValues, format, new String[]{CoreUtility.f89233i, str});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: p0 */
    public final void m41816p0(String str) {
        if (!TextUtils.isEmpty(str)) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("%s = ?", Arrays.copyOf(new Object[]{"gId"}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2770B("sync_media_zip_metadata", format, new String[]{str});
            return;
        }
        throw new IllegalArgumentException("driveId is invalid".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [am.z] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* renamed from: p1 */
    public final List m41817p1(String str) {
        Throwable th2;
        ?? r32;
        InterfaceC0949z interfaceC0949z;
        ArrayList arrayList;
        String str2 = "\t";
        ?? r22 = "fromMsgId";
        AbstractC19074t.m100208f(str, "threadId");
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb2 = new StringBuilder(str);
        Object[] objArr = null;
        InterfaceC0949z interfaceC0949z2 = null;
        try {
        } catch (SQLiteException e11) {
            e11.printStackTrace();
        }
        try {
            try {
                C19067n0 c19067n0 = C19067n0.f94947a;
                char c11 = 2;
                String format = String.format(Locale.US, "select * from %s where %s = ? and %s = ? and %s > 0 order by %s", Arrays.copyOf(new Object[]{"pull_msg_offline", "userId", "ownerId", "fromMsgId", "fromMsgId"}, 5));
                AbstractC19074t.m100207e(format, "format(...)");
                InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, str);
                try {
                    int[] iArr = {mo2775p.getColumnIndex("ownerId"), mo2775p.getColumnIndex("fromMsgId"), mo2775p.getColumnIndex("toGlobalMsgId"), mo2775p.getColumnIndex("toClientMsgId"), mo2775p.getColumnIndex("needDelete")};
                    while (mo2775p.next()) {
                        long j11 = mo2775p.getLong(iArr[1]);
                        long j12 = mo2775p.getLong(iArr[c11]);
                        long j13 = mo2775p.getLong(iArr[3]);
                        int i11 = mo2775p.getInt(iArr[4]);
                        String str3 = str2;
                        ArrayList arrayList3 = arrayList2;
                        int[] iArr2 = iArr;
                        interfaceC0949z = mo2775p;
                        try {
                            try {
                                C28611c c28611c = new C28611c(str, j11, 0L, j12, j13, i11);
                                sb2.append("\n");
                                sb2.append(j11);
                                sb2.append(str3);
                                sb2.append(j12);
                                sb2.append(str3);
                                sb2.append(j13);
                                sb2.append(str3);
                                sb2.append(i11);
                                arrayList = arrayList3;
                                try {
                                    arrayList.add(c28611c);
                                    str2 = str3;
                                    arrayList2 = arrayList;
                                    iArr = iArr2;
                                    mo2775p = interfaceC0949z;
                                    c11 = 2;
                                } catch (Exception e12) {
                                    e = e12;
                                    interfaceC0949z2 = interfaceC0949z;
                                    r22 = arrayList;
                                    e.printStackTrace();
                                    r22.clear();
                                    if (interfaceC0949z2 != null) {
                                        interfaceC0949z2.close();
                                        r22 = r22;
                                    }
                                    objArr = new Object[0];
                                    AbstractC20110a.f98889a.mo104554k("PullMsgOffline LOAD getMsgOffline in ChAT: " + r22.size() + " " + ((Object) sb2), objArr);
                                    return r22;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th2 = th;
                                r32 = interfaceC0949z;
                                if (r32 != 0) {
                                    try {
                                        r32.close();
                                        throw th2;
                                    } catch (SQLiteException e13) {
                                        e13.printStackTrace();
                                        throw th2;
                                    }
                                }
                                throw th2;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            arrayList = arrayList3;
                        }
                    }
                    r22 = arrayList2;
                    mo2775p.close();
                } catch (Exception e15) {
                    e = e15;
                    interfaceC0949z = mo2775p;
                    arrayList = arrayList2;
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC0949z = mo2775p;
                }
            } catch (Exception e16) {
                e = e16;
                r22 = arrayList2;
            }
            objArr = new Object[0];
            AbstractC20110a.f98889a.mo104554k("PullMsgOffline LOAD getMsgOffline in ChAT: " + r22.size() + " " + ((Object) sb2), objArr);
            return r22;
        } catch (Throwable th5) {
            th2 = th5;
            r32 = objArr;
        }
    }

    /* renamed from: p2 */
    public final void m41818p2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        if (this.f43234d && !AbstractC0937t.m4454e(interfaceC0947y, "chat_content", "sequenseId")) {
            AbstractC0937t.m4451b(interfaceC0947y, "chat_content", "sequenseId", "INTEGER", "0");
            AbstractC20887g.m109217D(18801, null, 2, null);
        }
    }

    /* renamed from: q0 */
    public final void m41819q0() {
        if (this.f43236f) {
            return;
        }
        try {
            if (m41773b2("e2ee_sent_messages")) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format("%s < ? ", Arrays.copyOf(new Object[]{"ts"}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                this.f43231a.mo2770B("e2ee_sent_messages", format, new String[]{String.valueOf(AbstractC23306f.m120579F1().mo124314i() - 1209600000)});
                InterfaceC0949z mo2777u = this.f43231a.mo2777u("select * from e2ee_sent_messages");
                try {
                    if (!mo2777u.next()) {
                        this.f43231a.mo2857x("drop table e2ee_sent_messages");
                        this.f43236f = true;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                    AbstractC3601a.m18219a(mo2777u, null);
                } finally {
                }
            } else {
                this.f43236f = true;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: q1 */
    public final C24799c m41820q1(long j11) {
        boolean z11;
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select * from %s where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"my_cloud_collection_info", "user_id", "collection_id"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            try {
                InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, Long.valueOf(j11));
                AbstractC19074t.m100207e(mo2775p, "executeQuery(...)");
                int[] iArr = {mo2775p.getColumnIndex("collection_id"), mo2775p.getColumnIndex("collection_name"), mo2775p.getColumnIndex("size"), mo2775p.getColumnIndex("created_time"), mo2775p.getColumnIndex("thumb"), mo2775p.getColumnIndex("last_modified_time"), mo2775p.getColumnIndex("description"), mo2775p.getColumnIndex("last_modified_item_time"), mo2775p.getColumnIndex("state_load_item"), mo2775p.getColumnIndex("is_pin")};
                if (mo2775p.next()) {
                    long j12 = mo2775p.getLong(iArr[0]);
                    String string = mo2775p.getString(iArr[1]);
                    int i11 = mo2775p.getInt(iArr[2]);
                    long j13 = mo2775p.getLong(iArr[3]);
                    String string2 = mo2775p.getString(iArr[4]);
                    long j14 = mo2775p.getLong(iArr[5]);
                    String string3 = mo2775p.getString(iArr[6]);
                    long j15 = mo2775p.getLong(iArr[7]);
                    String string4 = mo2775p.getString(iArr[8]);
                    if (mo2775p.getInt(iArr[9]) > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    AbstractC19074t.m100205c(string);
                    AbstractC19074t.m100205c(string2);
                    AbstractC19074t.m100205c(string3);
                    AbstractC19074t.m100205c(string4);
                    return new C24799c(j12, string, i11, j13, string2, j14, string3, j15, string4, z11, false);
                }
                return null;
            } catch (Exception e11) {
                e = e11;
                AbstractC23350e.m122778h(e);
                return null;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: q2 */
    public final void m41821q2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        if (!this.f43234d) {
            return;
        }
        AbstractC0937t.m4452c(interfaceC0947y, "chat_content", "timestamp");
    }

    /* renamed from: q3 */
    public final void m41822q3() {
        if (!m41773b2("TABLE_MESSAGE_TTL_V2")) {
            return;
        }
        Map m41645g1 = m41645g1();
        for (String str : m41645g1.keySet()) {
            List<C17945a0> list = (List) m41645g1.get(str);
            if (list != null) {
                for (C17945a0 c17945a0 : list) {
                    m41659p3(str, c17945a0);
                    if (AbstractC19074t.m100204b(str, CoreUtility.f89233i)) {
                        C0833n0.f2934p.m2208g(c17945a0, true);
                    }
                }
            }
        }
        try {
            this.f43231a.mo2857x("delete from TABLE_MESSAGE_TTL_V2");
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r3 */
    public final void m41823r3(String str, MessageId messageId) {
        AbstractC19074t.m100208f(str, "threadId");
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            ContentValues contentValues = new ContentValues();
            if (messageId.m41053q()) {
                long m41047k = messageId.m41047k();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m41047k);
                contentValues.put("last_read_global_msg_id", sb2.toString());
            }
            if (messageId.m41052p()) {
                long m41045i = messageId.m41045i();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m41045i);
                contentValues.put("last_read_client_msg_id", sb3.toString());
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ? ", Arrays.copyOf(new Object[]{"cur_uid", "thread_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            AbstractC23350e.m122772b("PullMsgManager updateLastReadMsgId messageId=" + messageId + " threadId=" + str + " result=" + this.f43231a.mo2776q("last_msg_id", contentValues, format, new String[]{CoreUtility.f89233i, str}), new Object[0]);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: s0 */
    public final void m41824s0(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%s = ? and %s = ?", Arrays.copyOf(new Object[]{"cur_uid", "thread_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0947y.mo2770B("last_msg_id", format, new String[]{CoreUtility.f89233i, str});
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: s1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContactProfile m41825s1(String str) {
        Throwable th2;
        InterfaceC0949z interfaceC0949z;
        ContactProfile contactProfile;
        int i11;
        boolean z11;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f43235e.acquire();
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            int i12 = 1;
            String format = String.format(Locale.US, "select %s, %s, %s from %s where %s = ? and %s = ? ", Arrays.copyOf(new Object[]{"uid", "avatarUrl", "displayName", "new_messages_2", "currentUserUid", "uid"}, 6));
            AbstractC19074t.m100207e(format, "format(...)");
            interfaceC0949z = interfaceC0947y.mo2775p(format, CoreUtility.f89233i, str);
            if (interfaceC0949z != null) {
                try {
                    try {
                        if (interfaceC0949z.next()) {
                            ContactProfile contactProfile2 = null;
                            while (true) {
                                try {
                                    String string = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("uid"));
                                    String str2 = "";
                                    try {
                                        String string2 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("displayName"));
                                        AbstractC19074t.m100207e(string2, "getString(...)");
                                        byte[] bytes = string2.getBytes(C24321d.f117408b);
                                        AbstractC19074t.m100207e(bytes, "getBytes(...)");
                                        Charset charset = StandardCharsets.UTF_8;
                                        AbstractC19074t.m100207e(charset, "UTF_8");
                                        String str3 = new String(bytes, charset);
                                        int length = str3.length() - i12;
                                        int i13 = 0;
                                        boolean z12 = false;
                                        while (i13 <= length) {
                                            if (!z12) {
                                                i11 = i13;
                                            } else {
                                                i11 = length;
                                            }
                                            if (AbstractC19074t.m100209g(str3.charAt(i11), 32) <= 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            if (!z12) {
                                                if (!z11) {
                                                    z12 = true;
                                                } else {
                                                    i13++;
                                                }
                                            } else {
                                                if (!z11) {
                                                    break;
                                                }
                                                length--;
                                            }
                                        }
                                        str2 = str3.subSequence(i13, length + 1).toString();
                                        if (!AbstractC19074t.m100204b(string, CoreUtility.f89233i) && !AbstractC25495a.m132079d(string)) {
                                            str2 = AbstractC21935u.m114542i(string, str2);
                                        }
                                    } catch (Exception e11) {
                                        AbstractC23350e.m122776f("DatabaseChatHelper", e11);
                                    }
                                    String string3 = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("avatarUrl"));
                                    ContactProfile contactProfile3 = new ContactProfile(string);
                                    try {
                                        contactProfile3.f42437s = str2;
                                        contactProfile3.f42446v = string3;
                                        if (!interfaceC0949z.next()) {
                                            this.f43235e.release();
                                            try {
                                                interfaceC0949z.close();
                                                return contactProfile3;
                                            } catch (SQLiteException e12) {
                                                AbstractC23350e.m122776f("DatabaseChatHelper", e12);
                                                return contactProfile3;
                                            }
                                        }
                                        contactProfile2 = contactProfile3;
                                        i12 = 1;
                                    } catch (Exception e13) {
                                        e = e13;
                                        contactProfile = contactProfile3;
                                        AbstractC23350e.m122776f("DatabaseChatHelper", e);
                                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                        String str4 = CoreUtility.f89233i;
                                        AbstractC19074t.m100207e(str4, "currentUserUid");
                                        AbstractC20887g.m109232j(str4, 16035, e.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                                        this.f43235e.release();
                                        if (interfaceC0949z != null) {
                                            try {
                                                interfaceC0949z.close();
                                            } catch (SQLiteException e14) {
                                                AbstractC23350e.m122776f("DatabaseChatHelper", e14);
                                            }
                                        }
                                        return contactProfile;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    contactProfile = contactProfile2;
                                }
                            }
                        }
                    } catch (Exception e16) {
                        e = e16;
                        contactProfile = null;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f43235e.release();
                    if (interfaceC0949z == null) {
                        try {
                            interfaceC0949z.close();
                            throw th2;
                        } catch (SQLiteException e17) {
                            AbstractC23350e.m122776f("DatabaseChatHelper", e17);
                            throw th2;
                        }
                    }
                    throw th2;
                }
            }
            this.f43235e.release();
            if (interfaceC0949z != null) {
                try {
                    interfaceC0949z.close();
                    return null;
                } catch (SQLiteException e18) {
                    AbstractC23350e.m122776f("DatabaseChatHelper", e18);
                    return null;
                }
            }
            return null;
        } catch (Exception e19) {
            e = e19;
            contactProfile = null;
            interfaceC0949z = null;
        } catch (Throwable th4) {
            th2 = th4;
            interfaceC0949z = null;
            this.f43235e.release();
            if (interfaceC0949z == null) {
            }
        }
    }

    /* renamed from: s3 */
    public final void m41826s3(String str, C3533a c3533a) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(c3533a, "status");
        try {
            try {
                this.f43235e.acquire();
                C19067n0 c19067n0 = C19067n0.f94947a;
                String format = String.format(Locale.US, "update %s set %s = ? where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"new_messages_2", "lastCientMsgIdSeen", "uid", "currentUserUid"}, 4));
                AbstractC19074t.m100207e(format, "format(...)");
                this.f43231a.mo2778v(format, c3533a.m17931z(), str, CoreUtility.f89233i);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            }
        } finally {
            this.f43235e.release();
        }
    }

    /* renamed from: t0 */
    public final void m41827t0(List list) {
        AbstractC19074t.m100208f(list, "uids");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, " %s = ? AND %s IN (%s)", Arrays.copyOf(new Object[]{"current_user_uid", "thread_id", m41626W0(list)}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            this.f43231a.mo2770B("mark_as_unread_info", format, new String[]{CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: t2 */
    public final void m41828t2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "clientmsgids", "globalMsgId");
        AbstractC0937t.m4450a(interfaceC0947y, "clientmsgids", "current_uid");
        AbstractC0937t.m4450a(interfaceC0947y, "clientmsgids", "chat_id");
    }

    /* renamed from: t3 */
    public final void m41829t3(C24774a c24774a) {
        AbstractC19074t.m100208f(c24774a, "info");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_user_uid", CoreUtility.f89233i);
            contentValues.put("thread_id", c24774a.m128763d());
            contentValues.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, Integer.valueOf(c24774a.m128762c()));
            contentValues.put("ts", Long.valueOf(c24774a.m128761b()));
            contentValues.put("sync_status", Integer.valueOf(c24774a.m128760a()));
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, " %s = ? AND %s = ? ", Arrays.copyOf(new Object[]{"current_user_uid", "thread_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            if (this.f43231a.mo2776q("mark_as_unread_info", contentValues, format, new String[]{CoreUtility.f89233i, c24774a.m128763d()}) == 0) {
                this.f43231a.mo2771C("mark_as_unread_info", null, contentValues);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
        }
    }

    /* renamed from: u0 */
    public final int m41830u0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listCollectionId");
        try {
            String str = "('" + TextUtils.join("','", arrayList) + "')";
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%1$s = ? and %2$s IN %3$s", Arrays.copyOf(new Object[]{"user_id", "collection_id", str}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            return this.f43231a.mo2770B("my_cloud_collection_info", format, new String[]{CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            return 0;
        }
    }

    /* renamed from: v0 */
    public final int m41831v0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "listCollectionId");
        try {
            String str = "('" + TextUtils.join("','", arrayList) + "')";
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%1$s = ? and %2$s IN %3$s", Arrays.copyOf(new Object[]{"user_id", "collection_id", str}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            return this.f43231a.mo2770B("my_cloud_collection_item", format, new String[]{CoreUtility.f89233i});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            return 0;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:23|24|25|(3:241|242|243)(1:27)|28|29|30|31|32|33|34|35|36|(2:224|225)(1:38)|(1:40)(1:223)|(2:42|43)(1:222)|44|45|46|47|48|49|50|51|52|53|(10:54|55|56|(2:201|202)(1:58)|59|(9:178|179|180|181|182|183|184|185|186)(1:61)|62|63|(3:64|65|(5:67|68|(2:69|(2:169|170)(11:(1:72)(1:168)|73|74|75|76|77|(1:79)(1:154)|(1:(4:87|88|89|86)(2:82|83))(2:90|(2:93|94)(1:92))|84|85|86))|95|96)(1:171))|97)|(3:142|143|(3:147|108|(1:111)(1:110)))|99|100|101|102|103|104|105|106|(1:133)|108|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0360, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0363, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0364, code lost:            r2 = r20;     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f0 A[LOOP:0: B:23:0x0137->B:110:0x03f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0422 A[EDGE_INSN: B:111:0x0422->B:11:0x0422 BREAK  A[LOOP:0: B:23:0x0137->B:110:0x03f0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0479 A[Catch: SQLiteException -> 0x042d, TRY_ENTER, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x042d, blocks: (B:13:0x0429, B:119:0x0479), top: B:2:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0487 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0422 A[EDGE_INSN: B:133:0x0422->B:11:0x0422 BREAK  A[LOOP:0: B:23:0x0137->B:110:0x03f0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0429 A[Catch: SQLiteException -> 0x042d, TRY_ENTER, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x042d, blocks: (B:13:0x0429, B:119:0x0479), top: B:2:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m41832v1(int i11, int i12) {
        C7959d c7959d;
        InterfaceC0947y interfaceC0947y;
        String str;
        InterfaceC0949z mo2775p;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        String string;
        String string2;
        String string3;
        String string4;
        long j11;
        String string5;
        int i27;
        int i28;
        String string6;
        int i29;
        int i31;
        String str2;
        String str3;
        String string7;
        String string8;
        long m41598C1;
        String string9;
        String m41608I2;
        C20092b c20092b;
        int i32;
        int m104479f;
        int i33;
        int i34;
        String str4;
        int i35;
        String str5;
        int i36;
        boolean z11;
        String str6 = "state";
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC0949z interfaceC0949z = null;
        ArrayList arrayList2 = arrayList;
        try {
            try {
                this.f43235e.acquire();
                interfaceC0947y = this.f43231a;
                C19067n0 c19067n0 = C19067n0.f94947a;
            } catch (Exception e11) {
                e = e11;
                c7959d = this;
            } catch (Throwable th2) {
                th = th2;
                c7959d = this;
            }
            try {
                String format = String.format(Locale.US, "SELECT %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s FROM %s WHERE %s = ? AND %s = ? ORDER BY cast(%s as number) DESC LIMIT ?", Arrays.copyOf(new Object[]{"uid", "clientMsgId", "displayName", "avatarUrl", "newMessages", "timestamp", "isMine", "unreadMessages", "isDraftMsg", "iTypeMsg", "state", "msg_state", "cateMsg", "param1", "param3", "senderUid", "lastMsgExtra", "new_messages_2", "currentUserUid", "cateMsg", "timestamp"}, 21));
                AbstractC19074t.m100207e(format, "format(...)");
                Object[] objArr = new Object[3];
                objArr[0] = CoreUtility.f89233i;
                objArr[1] = String.valueOf(i11);
                str = "DatabaseChatHelper";
                try {
                    objArr[2] = String.valueOf(i12 + 5);
                    mo2775p = interfaceC0947y.mo2775p(format, objArr);
                } catch (Exception e12) {
                    e = e12;
                    c7959d = this;
                    arrayList = arrayList2;
                    str6 = str;
                } catch (Throwable th3) {
                    th = th3;
                    c7959d = this;
                }
            } catch (Exception e13) {
                e = e13;
                c7959d = this;
                str6 = "DatabaseChatHelper";
                arrayList = arrayList2;
                try {
                    AbstractC23350e.m122776f(str6, e);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    String str7 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str7, "currentUserUid");
                    AbstractC20887g.m109232j(str7, 16031, e.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                    c7959d.f43235e.release();
                    if (interfaceC0949z != null) {
                    }
                    return arrayList;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    c7959d.f43235e.release();
                    if (interfaceC0949z == null) {
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                c7959d = this;
                str6 = "DatabaseChatHelper";
                Throwable th52 = th;
                c7959d.f43235e.release();
                if (interfaceC0949z == null) {
                }
            }
        } catch (SQLiteException e14) {
            AbstractC23350e.m122776f(str6, e14);
        }
        if (mo2775p != null) {
            try {
                try {
                } catch (Exception e15) {
                    e = e15;
                    c7959d = this;
                    arrayList = arrayList2;
                    str6 = str;
                }
                if (mo2775p.next()) {
                    int columnIndex = mo2775p.getColumnIndex("uid");
                    int columnIndex2 = mo2775p.getColumnIndex("clientMsgId");
                    int columnIndex3 = mo2775p.getColumnIndex("avatarUrl");
                    int columnIndex4 = mo2775p.getColumnIndex("param3");
                    int columnIndex5 = mo2775p.getColumnIndex("timestamp");
                    int columnIndex6 = mo2775p.getColumnIndex("isMine");
                    int columnIndex7 = mo2775p.getColumnIndex("isDraftMsg");
                    int columnIndex8 = mo2775p.getColumnIndex("iTypeMsg");
                    int columnIndex9 = mo2775p.getColumnIndex("state");
                    int columnIndex10 = mo2775p.getColumnIndex("msg_state");
                    int columnIndex11 = mo2775p.getColumnIndex("displayName");
                    int columnIndex12 = mo2775p.getColumnIndex("cateMsg");
                    int columnIndex13 = mo2775p.getColumnIndex("param1");
                    int columnIndex14 = mo2775p.getColumnIndex("senderUid");
                    int i37 = columnIndex11;
                    int columnIndex15 = mo2775p.getColumnIndex("newMessages");
                    int i38 = columnIndex14;
                    int columnIndex16 = mo2775p.getColumnIndex("lastMsgExtra");
                    int columnIndex17 = mo2775p.getColumnIndex("ex_data_1");
                    while (true) {
                        try {
                            string = mo2775p.getString(columnIndex);
                            i13 = columnIndex;
                            if (columnIndex2 != -1) {
                                try {
                                    try {
                                        i17 = columnIndex2;
                                        string2 = mo2775p.getString(columnIndex2);
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c7959d = this;
                                        interfaceC0949z = mo2775p;
                                        str6 = str;
                                        Throwable th522 = th;
                                        c7959d.f43235e.release();
                                        if (interfaceC0949z == null) {
                                        }
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    i14 = columnIndex10;
                                    i15 = columnIndex8;
                                    i16 = columnIndex6;
                                    i17 = columnIndex2;
                                    i18 = columnIndex3;
                                    i19 = i37;
                                    i21 = i38;
                                    arrayList = arrayList2;
                                    i22 = columnIndex16;
                                    i23 = columnIndex17;
                                    c7959d = this;
                                    i24 = columnIndex13;
                                    i25 = columnIndex9;
                                    i26 = columnIndex7;
                                    str6 = str;
                                    try {
                                        AbstractC23350e.m122776f(str6, e);
                                        if (!mo2775p.next()) {
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        interfaceC0949z = mo2775p;
                                        AbstractC23350e.m122776f(str6, e);
                                        long currentTimeMillis22 = System.currentTimeMillis() - currentTimeMillis;
                                        String str72 = CoreUtility.f89233i;
                                        AbstractC19074t.m100207e(str72, "currentUserUid");
                                        AbstractC20887g.m109232j(str72, 16031, e.toString(), currentTimeMillis22, 16000, CoreUtility.f89236l);
                                        c7959d.f43235e.release();
                                        if (interfaceC0949z != null) {
                                            interfaceC0949z.close();
                                        }
                                        return arrayList;
                                    }
                                }
                            } else {
                                i17 = columnIndex2;
                                string2 = "";
                            }
                            try {
                                string3 = mo2775p.getString(columnIndex3);
                                string4 = mo2775p.getString(columnIndex4);
                                j11 = mo2775p.getLong(columnIndex5);
                                i18 = columnIndex3;
                            } catch (Exception e18) {
                                e = e18;
                                i14 = columnIndex10;
                                i15 = columnIndex8;
                                i16 = columnIndex6;
                                i18 = columnIndex3;
                                i19 = i37;
                                i21 = i38;
                                arrayList = arrayList2;
                                i22 = columnIndex16;
                                i23 = columnIndex17;
                                c7959d = this;
                                i24 = columnIndex13;
                                i25 = columnIndex9;
                                i26 = columnIndex7;
                                str6 = str;
                                AbstractC23350e.m122776f(str6, e);
                                if (!mo2775p.next()) {
                                }
                            }
                            try {
                                string5 = mo2775p.getString(columnIndex6);
                                i27 = mo2775p.getInt(columnIndex7);
                                i28 = mo2775p.getInt(columnIndex8);
                                i15 = columnIndex8;
                                try {
                                    string6 = mo2775p.getString(columnIndex9);
                                    i29 = mo2775p.getInt(columnIndex10);
                                    i14 = columnIndex10;
                                    if (columnIndex12 != -1) {
                                        try {
                                            i31 = mo2775p.getInt(columnIndex12);
                                        } catch (Exception e19) {
                                            e = e19;
                                            c7959d = this;
                                            i16 = columnIndex6;
                                            i19 = i37;
                                            i21 = i38;
                                            arrayList = arrayList2;
                                            i22 = columnIndex16;
                                            i23 = columnIndex17;
                                            i24 = columnIndex13;
                                            i25 = columnIndex9;
                                            i26 = columnIndex7;
                                            str6 = str;
                                            AbstractC23350e.m122776f(str6, e);
                                            if (!mo2775p.next()) {
                                            }
                                        }
                                    } else {
                                        i31 = 1;
                                    }
                                    if (columnIndex13 == -1) {
                                        str2 = "";
                                    } else {
                                        str2 = mo2775p.getString(columnIndex13);
                                    }
                                    if (columnIndex15 == -1) {
                                        str3 = "";
                                    } else {
                                        str3 = mo2775p.getString(columnIndex15);
                                    }
                                    int i39 = i38;
                                    i24 = columnIndex13;
                                    try {
                                        string7 = mo2775p.getString(i39);
                                        i21 = i39;
                                        int i41 = columnIndex16;
                                        i25 = columnIndex9;
                                        try {
                                            string8 = mo2775p.getString(i41);
                                            i22 = i41;
                                            try {
                                                AbstractC19074t.m100207e(string8, "getString(...)");
                                                c7959d = this;
                                            } catch (Exception e21) {
                                                e = e21;
                                                c7959d = this;
                                            }
                                        } catch (Exception e22) {
                                            e = e22;
                                            i22 = i41;
                                            i16 = columnIndex6;
                                            i19 = i37;
                                            arrayList = arrayList2;
                                            i23 = columnIndex17;
                                            str6 = str;
                                            c7959d = this;
                                        }
                                    } catch (Exception e23) {
                                        e = e23;
                                        i21 = i39;
                                        i16 = columnIndex6;
                                        i19 = i37;
                                        arrayList = arrayList2;
                                        i22 = columnIndex16;
                                        i23 = columnIndex17;
                                        c7959d = this;
                                        i25 = columnIndex9;
                                        i26 = columnIndex7;
                                    }
                                } catch (Exception e24) {
                                    e = e24;
                                    i14 = columnIndex10;
                                    i16 = columnIndex6;
                                    i19 = i37;
                                    i21 = i38;
                                    arrayList = arrayList2;
                                    i22 = columnIndex16;
                                    i23 = columnIndex17;
                                    c7959d = this;
                                }
                            } catch (Exception e25) {
                                e = e25;
                                i14 = columnIndex10;
                                i15 = columnIndex8;
                                i16 = columnIndex6;
                                i19 = i37;
                                i21 = i38;
                                arrayList = arrayList2;
                                i22 = columnIndex16;
                                i23 = columnIndex17;
                                c7959d = this;
                                i24 = columnIndex13;
                                i25 = columnIndex9;
                                i26 = columnIndex7;
                                str6 = str;
                                AbstractC23350e.m122776f(str6, e);
                                if (!mo2775p.next()) {
                                }
                            }
                        } catch (Exception e26) {
                            e = e26;
                            i13 = columnIndex;
                        }
                        try {
                            try {
                                m41598C1 = c7959d.m41598C1(string8);
                                int i42 = columnIndex17;
                                i26 = columnIndex7;
                                if (i42 == -1) {
                                    string9 = "";
                                } else {
                                    try {
                                        try {
                                            string9 = mo2775p.getString(i42);
                                        } catch (Exception e27) {
                                            e = e27;
                                            i23 = i42;
                                            i16 = columnIndex6;
                                            i19 = i37;
                                            arrayList = arrayList2;
                                            str6 = str;
                                            AbstractC23350e.m122776f(str6, e);
                                            if (!mo2775p.next()) {
                                            }
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        interfaceC0949z = mo2775p;
                                        str6 = str;
                                        Throwable th5222 = th;
                                        c7959d.f43235e.release();
                                        if (interfaceC0949z == null) {
                                        }
                                    }
                                }
                                m41608I2 = c7959d.m41608I2(string9);
                                if (!TextUtils.isEmpty(string6)) {
                                    try {
                                        c20092b = C20092b.f98828a;
                                        i23 = i42;
                                        i32 = 0;
                                        try {
                                            i16 = columnIndex6;
                                        } catch (Exception e28) {
                                            e = e28;
                                            i16 = columnIndex6;
                                        }
                                    } catch (Exception e29) {
                                        e = e29;
                                        i23 = i42;
                                        i16 = columnIndex6;
                                    }
                                    try {
                                        int intValue = ((Number) c20092b.m104480g(AbstractC29239n.m146002a(string6, 0), -1, false).m129213a()).intValue();
                                        m104479f = c20092b.m104479f(i28);
                                        i33 = intValue;
                                        i34 = i37;
                                    } catch (Exception e31) {
                                        e = e31;
                                        i19 = i37;
                                        arrayList = arrayList2;
                                        str6 = str;
                                        AbstractC23350e.m122776f(str6, e);
                                        if (!mo2775p.next()) {
                                        }
                                    }
                                } else {
                                    i23 = i42;
                                    i16 = columnIndex6;
                                    i32 = 0;
                                    m104479f = i28;
                                    i34 = i37;
                                    i33 = i29;
                                }
                                try {
                                    String string10 = mo2775p.getString(i34);
                                    AbstractC19074t.m100207e(string10, "getString(...)");
                                    byte[] bytes = string10.getBytes(C24321d.f117408b);
                                    AbstractC19074t.m100207e(bytes, "getBytes(...)");
                                    Charset charset = StandardCharsets.UTF_8;
                                    AbstractC19074t.m100207e(charset, "UTF_8");
                                    str4 = new String(bytes, charset);
                                    try {
                                        if (!AbstractC25495a.m132079d(string)) {
                                            String m114542i = AbstractC21935u.m114542i(string, str4);
                                            AbstractC19074t.m100207e(m114542i, "convertZingNameToPhoneName(...)");
                                            int length = m114542i.length() - 1;
                                            boolean z12 = false;
                                            while (true) {
                                                i19 = i34;
                                                if (i32 > length) {
                                                    break;
                                                }
                                                if (!z12) {
                                                    i36 = i32;
                                                } else {
                                                    i36 = length;
                                                }
                                                try {
                                                    String str8 = str4;
                                                    try {
                                                        if (AbstractC19074t.m100209g(m114542i.charAt(i36), 32) <= 0) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        if (!z12) {
                                                            if (!z11) {
                                                                str4 = str8;
                                                                i34 = i19;
                                                                z12 = true;
                                                            } else {
                                                                i32++;
                                                            }
                                                        } else {
                                                            if (!z11) {
                                                                break;
                                                            }
                                                            length--;
                                                        }
                                                        str4 = str8;
                                                        i34 = i19;
                                                    } catch (Exception e32) {
                                                        e = e32;
                                                        str6 = str;
                                                        str4 = str8;
                                                        try {
                                                            AbstractC23350e.m122776f(str6, e);
                                                            i35 = i11;
                                                            str5 = str4;
                                                            if (i35 == 1) {
                                                            }
                                                            boolean z13 = !AbstractC19074t.m100204b(string5, "0");
                                                            MessageId.C7932a c7932a = MessageId.Companion;
                                                            AbstractC19074t.m100205c(string);
                                                            AbstractC19074t.m100205c(string7);
                                                            ContactProfile m40351Y0 = ContactProfile.m40351Y0(string, str5, string3, c7932a.m41066e(string2, "", string, string7), j11, string4, z13, i31, i33, -1, i27, m104479f, str2, str3, m41598C1, m41608I2);
                                                            AbstractC19074t.m100207e(m40351Y0, "newConversationContact(...)");
                                                            arrayList = arrayList2;
                                                            arrayList.add(m40351Y0);
                                                            if (arrayList.size() >= i12) {
                                                            }
                                                        } catch (Exception e33) {
                                                            e = e33;
                                                            arrayList = arrayList2;
                                                            AbstractC23350e.m122776f(str6, e);
                                                            if (!mo2775p.next()) {
                                                            }
                                                        }
                                                        if (!mo2775p.next()) {
                                                        }
                                                    }
                                                } catch (Exception e34) {
                                                    e = e34;
                                                    str6 = str;
                                                    AbstractC23350e.m122776f(str6, e);
                                                    i35 = i11;
                                                    str5 = str4;
                                                    if (i35 == 1) {
                                                    }
                                                    boolean z132 = !AbstractC19074t.m100204b(string5, "0");
                                                    MessageId.C7932a c7932a2 = MessageId.Companion;
                                                    AbstractC19074t.m100205c(string);
                                                    AbstractC19074t.m100205c(string7);
                                                    ContactProfile m40351Y02 = ContactProfile.m40351Y0(string, str5, string3, c7932a2.m41066e(string2, "", string, string7), j11, string4, z132, i31, i33, -1, i27, m104479f, str2, str3, m41598C1, m41608I2);
                                                    AbstractC19074t.m100207e(m40351Y02, "newConversationContact(...)");
                                                    arrayList = arrayList2;
                                                    arrayList.add(m40351Y02);
                                                    if (arrayList.size() >= i12) {
                                                    }
                                                    if (!mo2775p.next()) {
                                                    }
                                                }
                                            }
                                            i35 = i11;
                                            str5 = m114542i.subSequence(i32, length + 1).toString();
                                            str6 = str;
                                        } else {
                                            i19 = i34;
                                            i35 = i11;
                                            str6 = str;
                                            str5 = str4;
                                        }
                                    } catch (Exception e35) {
                                        e = e35;
                                        i19 = i34;
                                    }
                                } catch (Exception e36) {
                                    e = e36;
                                    i19 = i34;
                                    str4 = "";
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                str6 = str;
                                interfaceC0949z = mo2775p;
                                Throwable th52222 = th;
                                c7959d.f43235e.release();
                                if (interfaceC0949z == null) {
                                }
                            }
                        } catch (Exception e37) {
                            e = e37;
                            i16 = columnIndex6;
                            i19 = i37;
                            arrayList = arrayList2;
                            i23 = columnIndex17;
                            str6 = str;
                            i26 = columnIndex7;
                            AbstractC23350e.m122776f(str6, e);
                            if (!mo2775p.next()) {
                            }
                        }
                        if (i35 == 1) {
                            try {
                                try {
                                } catch (Exception e38) {
                                    e = e38;
                                    arrayList = arrayList2;
                                    AbstractC23350e.m122776f(str6, e);
                                    if (!mo2775p.next()) {
                                    }
                                }
                                if (AbstractC25495a.m132084i(string) || AbstractC25495a.m132081f(string)) {
                                    arrayList = arrayList2;
                                    if (!mo2775p.next()) {
                                        break;
                                    }
                                    arrayList2 = arrayList;
                                    str = str6;
                                    columnIndex13 = i24;
                                    columnIndex9 = i25;
                                    columnIndex7 = i26;
                                    columnIndex = i13;
                                    columnIndex2 = i17;
                                    columnIndex6 = i16;
                                    columnIndex3 = i18;
                                    columnIndex8 = i15;
                                    columnIndex10 = i14;
                                    i38 = i21;
                                    columnIndex16 = i22;
                                    columnIndex17 = i23;
                                    i37 = i19;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                interfaceC0949z = mo2775p;
                                Throwable th522222 = th;
                                c7959d.f43235e.release();
                                if (interfaceC0949z == null) {
                                    try {
                                        interfaceC0949z.close();
                                        throw th522222;
                                    } catch (SQLiteException e39) {
                                        AbstractC23350e.m122776f(str6, e39);
                                        throw th522222;
                                    }
                                }
                                throw th522222;
                            }
                        }
                        boolean z1322 = !AbstractC19074t.m100204b(string5, "0");
                        MessageId.C7932a c7932a22 = MessageId.Companion;
                        AbstractC19074t.m100205c(string);
                        AbstractC19074t.m100205c(string7);
                        ContactProfile m40351Y022 = ContactProfile.m40351Y0(string, str5, string3, c7932a22.m41066e(string2, "", string, string7), j11, string4, z1322, i31, i33, -1, i27, m104479f, str2, str3, m41598C1, m41608I2);
                        AbstractC19074t.m100207e(m40351Y022, "newConversationContact(...)");
                        arrayList = arrayList2;
                        arrayList.add(m40351Y022);
                        if (arrayList.size() >= i12) {
                            break;
                        }
                        if (!mo2775p.next()) {
                        }
                    }
                    c7959d.f43235e.release();
                    if (mo2775p != null) {
                        mo2775p.close();
                    }
                    return arrayList;
                }
            } catch (Throwable th11) {
                th = th11;
                c7959d = this;
            }
        }
        c7959d = this;
        arrayList = arrayList2;
        str6 = str;
        c7959d.f43235e.release();
        if (mo2775p != null) {
        }
        return arrayList;
    }

    /* renamed from: w0 */
    public final int m41833w0(long j11, ArrayList arrayList) {
        String str;
        AbstractC19074t.m100208f(arrayList, "listItem");
        try {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MessageId m128849b = ((C24800d) it.next()).m128849b();
                if (m128849b != null) {
                    if (sb2.length() == 0) {
                        str = "(";
                    } else {
                        str = ",";
                    }
                    sb2.append(str);
                    sb2.append("'");
                    sb2.append(m128849b.m41045i());
                    sb2.append("'");
                }
            }
            if (sb2.length() > 0) {
                sb2.append(")");
            }
            if (sb2.length() <= 0) {
                return 0;
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%1$s = ? and %2$s = ? and %3$s IN %4$s", Arrays.copyOf(new Object[]{"user_id", "collection_id", "client_msg_id", sb2}, 4));
            AbstractC19074t.m100207e(format, "format(...)");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j11);
            return this.f43231a.mo2770B("my_cloud_collection_item", format, new String[]{CoreUtility.f89233i, sb3.toString()});
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:            if (r1.next() != false) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:            r2 = p586vt.C28629n.m143189a(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:            if (r2 == null) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:            r0.add(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:            if (r1.next() != false) goto L65;     */
    /* renamed from: w1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m41834w1() {
        ArrayList arrayList = new ArrayList();
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %1$s WHERE %3$s = ? AND (%2$s = ? OR %2$s = ? OR %2$s = ?)", Arrays.copyOf(new Object[]{"job_manager", "status", "userid"}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, 1, 3, 5);
            if (mo2775p != null) {
                try {
                } finally {
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (SQLiteException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return arrayList;
    }

    /* renamed from: x */
    public final void m41835x(String str, long j11) {
        if (str != null && str.length() != 0 && j11 > 0) {
            C0824j.m2153b(new c(str, j11));
        }
    }

    /* renamed from: x0 */
    public final void m41836x0(int i11) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "DELETE FROM %s WHERE rowid < (SELECT rowid FROM %s ORDER BY rowid DESC LIMIT 1 OFFSET %s)", Arrays.copyOf(new Object[]{"clientmsgids", "clientmsgids", Integer.valueOf(i11)}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            this.f43231a.mo2774n(format);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DatabaseChatHelper", e11);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = CoreUtility.f89233i;
            AbstractC19074t.m100207e(str, "currentUserUid");
            AbstractC20887g.m109232j(str, 16069, e11.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [fn0.j0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v5, types: [am.y] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3533a m41837x1(String str) {
        ?? r12;
        C19059j0 c19059j0;
        C3533a c3533a;
        InterfaceC0949z mo2775p;
        InterfaceC0949z interfaceC0949z;
        Throwable th2;
        AbstractC19074t.m100208f(str, "uid");
        C19059j0 c19059j02 = new C19059j0();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            r12 = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "select * from %s where %s = ? and %s = ?", Arrays.copyOf(new Object[]{"seenmessagestatus_v2", "cUid", "uid"}, 3));
            AbstractC19074t.m100207e(format, "format(...)");
            mo2775p = r12.mo2775p(format, CoreUtility.f89233i, str);
            try {
            } catch (Exception e11) {
                e = e11;
                AbstractC23350e.m122776f("DatabaseChatHelper", e);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                AbstractC20887g.m109232j(str2, 16020, e.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                c19059j0 = r12;
                c3533a = (C3533a) c19059j0.f94941p;
                if (c3533a == null) {
                }
            }
        } catch (Exception e12) {
            e = e12;
            r12 = c19059j02;
        }
        if (mo2775p != null) {
            try {
                if (mo2775p.next()) {
                    int columnIndex = mo2775p.getColumnIndex("status");
                    interfaceC0949z = mo2775p;
                    try {
                        C3533a c3533a2 = new C3533a(mo2775p.getLong(mo2775p.getColumnIndex("cliMsgID")), mo2775p.getLong(mo2775p.getColumnIndex("gbmsgid")), mo2775p.getLong(mo2775p.getColumnIndex("senderID")), str, mo2775p.getLong(mo2775p.getColumnIndex("destID")), mo2775p.getInt(mo2775p.getColumnIndex("msgType")), mo2775p.getInt(mo2775p.getColumnIndex("msgCmd")), mo2775p.getInt(mo2775p.getColumnIndex("srcType")));
                        c3533a2.m17929x(interfaceC0949z.getInt(columnIndex));
                        r12 = c19059j02;
                        try {
                            r12.f94941p = c3533a2;
                            r12 = r12;
                            C24848g0 c24848g0 = C24848g0.f119245a;
                            AbstractC3601a.m18219a(interfaceC0949z, null);
                            c19059j0 = r12;
                            c3533a = (C3533a) c19059j0.f94941p;
                            if (c3533a == null) {
                                C3533a c3533a3 = new C3533a(0L, 0L, 0L, str, 0L, 0, 0, 0);
                                c3533a3.m17929x(2);
                                return c3533a3;
                            }
                            return c3533a;
                        } catch (Throwable th3) {
                            th = th3;
                            th2 = th;
                            try {
                                throw th2;
                            } catch (Throwable th4) {
                                AbstractC3601a.m18219a(interfaceC0949z, th2);
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r12 = c19059j02;
                        th2 = th;
                        throw th2;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                r12 = c19059j02;
                interfaceC0949z = mo2775p;
            }
        }
        r12 = c19059j02;
        interfaceC0949z = mo2775p;
        C24848g0 c24848g02 = C24848g0.f119245a;
        AbstractC3601a.m18219a(interfaceC0949z, null);
        c19059j0 = r12;
        c3533a = (C3533a) c19059j0.f94941p;
        if (c3533a == null) {
        }
    }

    /* renamed from: x2 */
    public final void m41838x2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "lastSeenDelivered");
    }

    /* renamed from: y0 */
    public final void m41839y0(String str, long j11, long j12, long j13) {
        String format;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        AbstractC19074t.m100208f(str, "threadId");
        try {
            C19067n0 c19067n0 = C19067n0.f94947a;
            format = String.format(Locale.US, "%1$s = ? and %2$s = ? and (%3$s = ? or ( %4$s > 0 and %4$s = ?) or (%4$s <= 0 and %5$s = ?))", Arrays.copyOf(new Object[]{"userId", "ownerId", "fromMsgId", "toGlobalMsgId", "toClientMsgId"}, 5));
            AbstractC19074t.m100207e(format, "format(...)");
            sb2 = new StringBuilder();
            sb2.append(j11);
            sb3 = new StringBuilder();
            sb3.append(j12);
            sb4 = new StringBuilder();
            sb4.append(j13);
        } catch (Exception e11) {
            e = e11;
        }
        try {
            int mo2770B = this.f43231a.mo2770B("pull_msg_offline", format, new String[]{CoreUtility.f89233i, str, sb2.toString(), sb3.toString(), sb4.toString()});
            AbstractC20110a.f98889a.mo104554k("PullMsgOffline DELETE: " + str + " " + j11 + " " + j12 + " " + j13 + " result: " + mo2770B, new Object[0]);
        } catch (Exception e12) {
            e = e12;
            AbstractC23350e.m122776f("DatabaseChatHelper", e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0009, code lost:            r1 = on0.AbstractC24340u.m127107m(r1);     */
    /* renamed from: y1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map m41840y1(int i11, long j11) {
        String str;
        Integer m127107m;
        String str2;
        HashMap hashMap = new HashMap();
        try {
            str = CoreUtility.f89233i;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (str != null && m127107m != null) {
            int intValue = m127107m.intValue();
            if (j11 > 0) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                str2 = String.format(Locale.US, " and ts >= " + j11, Arrays.copyOf(new Object[0], 0));
                AbstractC19074t.m100207e(str2, "format(...)");
            } else {
                str2 = "";
            }
            C19067n0 c19067n02 = C19067n0.f94947a;
            String format = String.format(Locale.US, "SELECT * FROM TABLE_SENDING_MESSAGE WHERE (currentUserId = '" + intValue + "' " + str2 + ") ORDER BY ts DESC LIMIT " + i11, Arrays.copyOf(new Object[0], 0));
            AbstractC19074t.m100207e(format, "format(...)");
            InterfaceC0949z mo2777u = this.f43231a.mo2777u(format);
            if (mo2777u != null) {
                while (mo2777u.next()) {
                    try {
                        long j12 = mo2777u.getLong(mo2777u.getColumnIndex("clientMsgId"));
                        String string = mo2777u.getString(mo2777u.getColumnIndex("ownerId"));
                        AbstractC19074t.m100205c(string);
                        Object obj = hashMap.get(string);
                        if (obj == null) {
                            obj = new C19498i();
                            hashMap.put(string, obj);
                        }
                        C19497h c19497h = new C19497h();
                        c19497h.f96813b = j12;
                        c19497h.f96812a = 0L;
                        c19497h.f96814c = intValue;
                        ((C19498i) obj).m101942a(c19497h);
                    } finally {
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC3601a.m18219a(mo2777u, null);
            }
            return hashMap;
        }
        return hashMap;
    }

    /* renamed from: y2 */
    public final void m41841y2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "deletemessages_v1", "msgId");
    }

    /* renamed from: y3 */
    public final boolean m41842y3(C24799c c24799c) {
        long j11;
        AbstractC19074t.m100208f(c24799c, "myCloudCollectionInfo");
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("collection_name", c24799c.m128827g());
            contentValues.put("size", Integer.valueOf(c24799c.m128828h()));
            contentValues.put("thumb", c24799c.m128830j());
            contentValues.put("last_modified_time", Long.valueOf(c24799c.m128826f()));
            contentValues.put("description", c24799c.m128823c());
            contentValues.put("last_modified_item_time", Long.valueOf(c24799c.m128825e()));
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "%1$s = ? and %2$s = ?", Arrays.copyOf(new Object[]{"user_id", "collection_id"}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            long m128824d = c24799c.m128824d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m128824d);
            j11 = this.f43231a.mo2776q("my_cloud_collection_info", contentValues, format, new String[]{CoreUtility.f89233i, sb2.toString()});
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            j11 = 0;
        }
        if (j11 > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    public final int m41843z0(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        try {
            InterfaceC0947y interfaceC0947y = this.f43231a;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "currentUserId = '" + CoreUtility.f89233i + "' AND ownerId = '" + str + "'", Arrays.copyOf(new Object[0], 0));
            AbstractC19074t.m100207e(format, "format(...)");
            return interfaceC0947y.mo2770B("TABLE_SENDING_MESSAGE", format, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* renamed from: z1 */
    public final C28259e m41844z1(String str) {
        AbstractC19074t.m100208f(str, "name");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format(Locale.US, "SELECT * FROM %s WHERE %s = ? AND %s = ?", Arrays.copyOf(new Object[]{"sync_session_resumable", "userId", "name"}, 3));
        AbstractC19074t.m100207e(format, "format(...)");
        try {
            InterfaceC0949z mo2775p = this.f43231a.mo2775p(format, CoreUtility.f89233i, str);
            if (mo2775p != null) {
                try {
                    if (mo2775p.next()) {
                        String string = mo2775p.getString(mo2775p.getColumnIndex("checksumMd5"));
                        String string2 = mo2775p.getString(mo2775p.getColumnIndex("sessionURL"));
                        long j11 = mo2775p.getLong(mo2775p.getColumnIndex("ts"));
                        AbstractC19074t.m100205c(string);
                        AbstractC19074t.m100205c(string2);
                        C28259e c28259e = new C28259e(str, string, string2, j11);
                        AbstractC3601a.m18219a(mo2775p, null);
                        return c28259e;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC3601a.m18219a(mo2775p, th2);
                        throw th3;
                    }
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
            AbstractC3601a.m18219a(mo2775p, null);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return null;
    }

    /* renamed from: z2 */
    public final void m41845z2(InterfaceC0947y interfaceC0947y) {
        AbstractC19074t.m100208f(interfaceC0947y, "db");
        AbstractC0937t.m4450a(interfaceC0947y, "new_messages_2", "timestampFirstNew");
    }

    private C7959d(Context context, C0872f c0872f) {
        SQLiteException sQLiteException;
        InterfaceC0947y interfaceC0947y;
        C7966k mo2777u;
        boolean z11 = true;
        this.f43235e = new Semaphore(1);
        b bVar = new b();
        this.f43237g = bVar;
        boolean z12 = false;
        AbstractC20110a.f98889a.mo104548a("New DatabaseChatHelper instance created", new Object[0]);
        long currentTimeMillis = System.currentTimeMillis();
        this.f43232b = c0872f;
        bVar.m41859f(true);
        this.f43233c = context.getDatabasePath("zalo_x_1.db");
        AbstractC0777e.m1935a("db-chat");
        InterfaceC0947y interfaceC0947y2 = null;
        try {
            interfaceC0947y = new C0896a(context, "zalo_x_1.db", bVar);
        } catch (Throwable th2) {
            sQLiteException = th2;
            interfaceC0947y = null;
        }
        try {
            interfaceC0947y.mo2851m();
            mo2777u = interfaceC0947y.mo2777u("select 1");
        } catch (Throwable th3) {
            sQLiteException = th3;
            if (sQLiteException instanceof SQLiteException) {
                SQLiteException sQLiteException2 = sQLiteException;
                AbstractC20110a.f98889a.mo104551d("Exception when open custom Db. Error code: %d - error mes: %s", Integer.valueOf(sQLiteException2.m41426a()), sQLiteException2.m41427b());
            } else {
                AbstractC20110a.f98889a.mo104551d("Exception when open custom Db. Error mes: %s", sQLiteException.getMessage());
            }
            if (AbstractC23309i.m121736b()) {
                AbstractC20110a.f98889a.mo104548a("Open DB by Stock Wrapper", new Object[0]);
                InterfaceC0947y c0916i0 = new C0916i0(context, "zalo_x_1.db", this.f43237g);
                try {
                    c0916i0.mo2851m();
                    InterfaceC0949z mo2777u2 = c0916i0.mo2777u("select 1");
                    if (mo2777u2 != null && mo2777u2.getColumnCount() > 0) {
                        try {
                            mo2777u2.close();
                        } catch (SQLiteException e11) {
                            AbstractC20110a.f98889a.mo104552e(e11);
                        }
                        this.f43237g.m41859f(false);
                        AbstractC20887g.m109217D(17524, null, 2, null);
                        interfaceC0947y2 = c0916i0;
                        z11 = false;
                        z12 = true;
                        if (!z11) {
                        }
                        if (z12) {
                        }
                        throw new IllegalStateException("DatabaseChatHelper create Error");
                    }
                    throw new SQLiteException(-1, "Worst case: can not open db file by stock & custom wrapper");
                } catch (Exception e12) {
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    String str = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str, "currentUserUid");
                    AbstractC20887g.m109232j(str, 16002, sQLiteException.toString(), currentTimeMillis2, 16000, CoreUtility.f89236l);
                    if (AbstractC23309i.m121736b()) {
                        AbstractC20887g.m109244v(17524, null, 2, null);
                    }
                    this.f43237g.m41859f(false);
                    throw e12;
                }
            }
            AbstractC20110a.f98889a.mo104548a("Can't use Stock Wrapper to open db", new Object[0]);
            throw sQLiteException;
        }
        if (mo2777u != null && mo2777u.getColumnCount() > 0) {
            try {
                mo2777u.close();
            } catch (SQLiteException e13) {
                AbstractC20110a.f98889a.mo104552e(e13);
            }
            this.f43237g.m41859f(false);
            if (!z11 && interfaceC0947y != null) {
                interfaceC0947y2 = interfaceC0947y;
            } else if (z12 || interfaceC0947y2 == null) {
                throw new IllegalStateException("DatabaseChatHelper create Error");
            }
            this.f43231a = interfaceC0947y2;
            return;
        }
        throw new SQLiteException(-1, "Worst case: can not open db file by stock/custom wrapper");
    }
}
