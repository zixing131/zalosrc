package p206hd;

import ad.C0737a;
import ag0.AbstractC0837p0;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.work.AbstractC2144f;
import com.zing.zalo.backuprestore.media.exception.DriveDownloadException;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.AbstractC20130d;
import in.AbstractC20631e;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me0.AbstractC23009a3;
import me0.AbstractC23041d2;
import me0.AbstractC23258x2;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import p128ed.C18388c;
import p128ed.C18390e;
import p206hd.C19999c;
import p206hd.InterfaceC20001e;
import p248iy.AbstractC20887g;
import p263jc.C21216s;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p620wt.AbstractC29237l;
import p716zh.C32042o;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sc.C26222d;
import su.AbstractC26389c;
import vi.C28255a;
import vi.C28260f;
import vi.C28262h;
import vi.InterfaceC28256b;

/* renamed from: hd.c */
/* loaded from: classes3.dex */
public final class C19999c {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC24854k f98314e;

    /* renamed from: a */
    private final Map f98315a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b */
    private final Map f98316b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    private final Map f98317c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private final Map f98318d = Collections.synchronizedMap(new HashMap());

    /* renamed from: hd.c$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f98319q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C19999c mo12V4() {
            return c.f98320a.m103788a();
        }
    }

    /* renamed from: hd.c$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19999c m103786a() {
            return (C19999c) C19999c.f98314e.getValue();
        }

        /* renamed from: b */
        public final String m103787b(String str, String str2, MessageId messageId) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "senderId");
            AbstractC19074t.m100208f(messageId, "messageId");
            return str + "_" + str2 + "_" + messageId.m41044h();
        }
    }

    /* renamed from: hd.c$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f98320a = new c();

        /* renamed from: b */
        private static final C19999c f98321b = new C19999c();

        private c() {
        }

        /* renamed from: a */
        public final C19999c m103788a() {
            return f98321b;
        }
    }

    /* renamed from: hd.c$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final String f98322a;

        /* renamed from: b */
        private final String f98323b;

        /* renamed from: c */
        private InterfaceC20001e f98324c;

        /* renamed from: d */
        private boolean f98325d;

        /* renamed from: e */
        private final C28260f f98326e;

        /* renamed from: f */
        private final String f98327f;

        /* renamed from: g */
        private String f98328g;

        public d(String str, String str2, InterfaceC20001e interfaceC20001e, boolean z11, C28260f c28260f, String str3, String str4) {
            AbstractC19074t.m100208f(str, "requestId");
            AbstractC19074t.m100208f(str2, "zipId");
            AbstractC19074t.m100208f(str3, "pathOut");
            AbstractC19074t.m100208f(str4, "entryNameInZip");
            this.f98322a = str;
            this.f98323b = str2;
            this.f98324c = interfaceC20001e;
            this.f98325d = z11;
            this.f98326e = c28260f;
            this.f98327f = str3;
            this.f98328g = str4;
        }

        /* renamed from: a */
        public final String m103789a() {
            return this.f98328g;
        }

        /* renamed from: b */
        public final InterfaceC20001e m103790b() {
            return this.f98324c;
        }

        /* renamed from: c */
        public final String m103791c() {
            return this.f98327f;
        }

        /* renamed from: d */
        public final String m103792d() {
            return this.f98322a;
        }

        /* renamed from: e */
        public final C28260f m103793e() {
            return this.f98326e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC19074t.m100204b(this.f98322a, dVar.f98322a) && AbstractC19074t.m100204b(this.f98323b, dVar.f98323b) && AbstractC19074t.m100204b(this.f98324c, dVar.f98324c) && this.f98325d == dVar.f98325d && AbstractC19074t.m100204b(this.f98326e, dVar.f98326e) && AbstractC19074t.m100204b(this.f98327f, dVar.f98327f) && AbstractC19074t.m100204b(this.f98328g, dVar.f98328g);
        }

        /* renamed from: f */
        public final String m103794f() {
            return this.f98323b;
        }

        /* renamed from: g */
        public final boolean m103795g() {
            return this.f98325d;
        }

        /* renamed from: h */
        public final void m103796h(InterfaceC20001e interfaceC20001e) {
            this.f98324c = interfaceC20001e;
        }

        public int hashCode() {
            int hashCode = ((this.f98322a.hashCode() * 31) + this.f98323b.hashCode()) * 31;
            InterfaceC20001e interfaceC20001e = this.f98324c;
            int hashCode2 = (((hashCode + (interfaceC20001e == null ? 0 : interfaceC20001e.hashCode())) * 31) + AbstractC2144f.m11520a(this.f98325d)) * 31;
            C28260f c28260f = this.f98326e;
            return ((((hashCode2 + (c28260f != null ? c28260f.hashCode() : 0)) * 31) + this.f98327f.hashCode()) * 31) + this.f98328g.hashCode();
        }

        public String toString() {
            return "RequestDownloadInfo(requestId=" + this.f98322a + ", zipId=" + this.f98323b + ", listener=" + this.f98324c + ", isRequestedFromCSC=" + this.f98325d + ", zipFileMD=" + this.f98326e + ", pathOut=" + this.f98327f + ", entryNameInZip=" + this.f98328g + ")";
        }

        public /* synthetic */ d(String str, String str2, InterfaceC20001e interfaceC20001e, boolean z11, C28260f c28260f, String str3, String str4, int i11, AbstractC19060k abstractC19060k) {
            this(str, str2, (i11 & 4) != 0 ? null : interfaceC20001e, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : c28260f, str3, (i11 & 64) != 0 ? "" : str4);
        }
    }

    /* renamed from: hd.c$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC20001e {

        /* renamed from: b */
        final /* synthetic */ String f98330b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC20001e f98331c;

        e(String str, InterfaceC20001e interfaceC20001e) {
            this.f98330b = str;
            this.f98331c = interfaceC20001e;
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: a */
        public void mo98994a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f98331c.mo98994a(str, j11);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: b */
        public boolean mo98995b() {
            return InterfaceC20001e.a.m103799a(this);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: c */
        public void mo98996c(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            C19999c.this.f98316b.remove(this.f98330b);
            this.f98331c.mo98996c(i11, str);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: d */
        public void mo98997d(String str) {
            AbstractC19074t.m100208f(str, "path");
            C19999c.this.f98316b.remove(this.f98330b);
            this.f98331c.mo98997d(str);
        }
    }

    /* renamed from: hd.c$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC20001e {

        /* renamed from: a */
        final /* synthetic */ boolean f98332a;

        /* renamed from: b */
        final /* synthetic */ C19999c f98333b;

        /* renamed from: c */
        final /* synthetic */ String f98334c;

        /* renamed from: d */
        final /* synthetic */ String f98335d;

        /* renamed from: e */
        final /* synthetic */ C28260f f98336e;

        f(boolean z11, C19999c c19999c, String str, String str2, C28260f c28260f) {
            this.f98332a = z11;
            this.f98333b = c19999c;
            this.f98334c = str;
            this.f98335d = str2;
            this.f98336e = c28260f;
        }

        /* renamed from: f */
        public static final void m103798f(C28260f c28260f) {
            C26222d.f124594a.m134858g(c28260f);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: a */
        public void mo98994a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
            this.f98333b.m103774n(str, j11);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: b */
        public boolean mo98995b() {
            return InterfaceC20001e.a.m103799a(this);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: c */
        public void mo98996c(int i11, String str) {
            int i12;
            AbstractC19074t.m100208f(str, "errorMsg");
            if (this.f98332a) {
                i12 = 18872;
            } else {
                i12 = 18874;
            }
            AbstractC20887g.m109240r(i12, str + "(" + i11 + ")");
            this.f98333b.m103773m(this.f98334c, i11, str, this.f98335d);
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: d */
        public void mo98997d(String str) {
            int i11;
            AbstractC19074t.m100208f(str, "path");
            try {
                if (this.f98332a) {
                    i11 = 18872;
                } else {
                    i11 = 18874;
                }
                AbstractC20887g.m109217D(i11, null, 2, null);
                if (this.f98332a) {
                    AbstractC0837p0.Companion.m2236a().mo2040a(new Runnable() { // from class: hd.d
                        public /* synthetic */ RunnableC20000d() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19999c.f.m103798f(C28260f.this);
                        }
                    });
                }
                this.f98333b.m103775o(this.f98334c, this.f98335d, this.f98336e);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f98319q);
        f98314e = m129210a;
    }

    /* renamed from: g */
    private final boolean m103767g(C28260f c28260f) {
        if (c28260f != null) {
            try {
                for (InterfaceC28256b interfaceC28256b : c28260f.m142309k().values()) {
                    if ((interfaceC28256b instanceof C28262h) && !C18388c.f92779a.m97398i(((C28262h) interfaceC28256b).m142269i())) {
                        return false;
                    }
                }
                return true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return false;
    }

    /* renamed from: h */
    private final void m103768h(String str, String str2, String str3, String str4, MessageId messageId) {
        String str5;
        if (TextUtils.isEmpty(str)) {
            str5 = "Invalid url";
        } else if (TextUtils.isEmpty(str2)) {
            str5 = "Invalid output path";
        } else if (TextUtils.isEmpty(str3)) {
            str5 = "Invalid ownerId";
        } else if (TextUtils.isEmpty(str4)) {
            str5 = "Invalid senderId";
        } else if (TextUtils.isEmpty(messageId.m41044h())) {
            str5 = "Invalid message ID";
        } else {
            str5 = "";
        }
        if (str5.length() <= 0) {
        } else {
            throw new DriveDownloadException(100, str5);
        }
    }

    /* renamed from: i */
    private final C0737a m103769i(C17945a0 c17945a0, String str, InterfaceC20001e interfaceC20001e, C21216s c21216s) {
        Object obj;
        b bVar = Companion;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        String m94862C4 = c17945a0.m94862C4();
        AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
        MessageId m95029V3 = c17945a0.m95029V3();
        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
        String m103787b = bVar.m103787b(mo95039W2, m94862C4, m95029V3);
        if (interfaceC20001e.mo98995b()) {
            obj = Long.valueOf(System.currentTimeMillis());
        } else {
            obj = "";
        }
        String str2 = m103787b + obj;
        C0737a c0737a = new C0737a();
        c0737a.m1202M(new e(str2, interfaceC20001e));
        c0737a.f101518j = c17945a0.m94964O1(c17945a0, c21216s, false);
        int m95215o4 = c17945a0.m95215o4();
        long m107511n = AbstractC20631e.Companion.m107511n();
        int m95079a3 = c17945a0.m95079a3();
        long m95070Z2 = c17945a0.m95070Z2();
        String m95117e3 = c17945a0.m95117e3();
        AbstractC19074t.m100207e(m95117e3, "getDownloadTaskId(...)");
        c0737a.m107489o(m95215o4, m107511n, m95079a3, m95070Z2, m95117e3, c17945a0.m95090b5(), str, c17945a0.mo95039W2());
        Map map = this.f98316b;
        AbstractC19074t.m100207e(map, "mapMsgIdDownloadDriveTask");
        map.put(str2, c0737a);
        return c0737a;
    }

    /* renamed from: j */
    private final void m103770j(String str, int i11, String str2) {
        try {
            C18390e.m97412t("[Download] Fail, zipId=" + str + ", code=" + i11 + ", msg=" + str2, true);
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    this.f98315a.remove(str);
                    HashSet<d> hashSet = (HashSet) this.f98317c.remove(str);
                    if (hashSet != null) {
                        for (d dVar : hashSet) {
                            this.f98318d.remove(dVar.m103792d());
                            arrayList.add(dVar);
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC20001e m103790b = ((d) it.next()).m103790b();
                if (m103790b != null) {
                    m103790b.mo98996c(i11, str2);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: k */
    private final C17945a0 m103771k(String str, String str2, String str3) {
        MessageId m41066e = MessageId.Companion.m41066e(str3, "", str, str2);
        if (m41066e == null) {
            return null;
        }
        return AbstractC23306f.m120584H0().m2635r(m41066e);
    }

    /* renamed from: l */
    private final String m103772l(String str) {
        File file = new File(C18388c.f92779a.m97391b(), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getPath() + File.separator;
    }

    /* renamed from: m */
    public final void m103773m(String str, int i11, String str2, String str3) {
        m103779s(this, str, i11, str2, str3, null, 16, null);
    }

    /* renamed from: n */
    public final void m103774n(String str, long j11) {
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                HashSet hashSet = (HashSet) this.f98317c.get(str);
                if (hashSet != null) {
                    arrayList.addAll(hashSet);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                InterfaceC20001e m103790b = ((d) it.next()).m103790b();
                if (m103790b != null) {
                    m103790b.mo98994a(str, j11);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00be: MOVE (r1 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:191), block:B:149:0x00be */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027d A[Catch: all -> 0x00bd, TryCatch #13 {all -> 0x00bd, blocks: (B:10:0x001c, B:12:0x0031, B:14:0x0040, B:17:0x004a, B:19:0x0050, B:22:0x006f, B:25:0x0075, B:27:0x0086, B:29:0x0092, B:31:0x00ae, B:33:0x00b4, B:38:0x00c6, B:39:0x00f1, B:42:0x00f2, B:43:0x0111, B:45:0x0112, B:46:0x011b, B:54:0x011c, B:56:0x013e, B:60:0x0155, B:49:0x0159, B:51:0x0183, B:67:0x019e, B:69:0x01aa, B:70:0x01ae, B:73:0x01b4, B:81:0x01d7, B:83:0x01e9, B:85:0x01ef, B:86:0x01f2, B:78:0x01cd, B:90:0x01fd, B:91:0x0206, B:103:0x0264, B:106:0x0271, B:108:0x027d, B:110:0x0283, B:113:0x028b, B:95:0x0292, B:97:0x02a4, B:99:0x02aa), top: B:4:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a4 A[Catch: all -> 0x00bd, TryCatch #13 {all -> 0x00bd, blocks: (B:10:0x001c, B:12:0x0031, B:14:0x0040, B:17:0x004a, B:19:0x0050, B:22:0x006f, B:25:0x0075, B:27:0x0086, B:29:0x0092, B:31:0x00ae, B:33:0x00b4, B:38:0x00c6, B:39:0x00f1, B:42:0x00f2, B:43:0x0111, B:45:0x0112, B:46:0x011b, B:54:0x011c, B:56:0x013e, B:60:0x0155, B:49:0x0159, B:51:0x0183, B:67:0x019e, B:69:0x01aa, B:70:0x01ae, B:73:0x01b4, B:81:0x01d7, B:83:0x01e9, B:85:0x01ef, B:86:0x01f2, B:78:0x01cd, B:90:0x01fd, B:91:0x0206, B:103:0x0264, B:106:0x0271, B:108:0x027d, B:110:0x0283, B:113:0x028b, B:95:0x0292, B:97:0x02a4, B:99:0x02aa), top: B:4:0x0008 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m103775o(String str, String str2, C28260f c28260f) {
        Closeable closeable;
        Closeable closeable2;
        String str3;
        ZipFile zipFile;
        String str4;
        d dVar;
        String message;
        InterfaceC20001e m103790b;
        String message2;
        InterfaceC20001e m103790b2;
        String m103772l;
        HashSet hashSet;
        String m97426w;
        InterfaceC20001e m103790b3;
        String str5 = null;
        try {
            try {
                this.f98315a.remove(str);
            } catch (DriveDownloadException e11) {
                e = e11;
                str4 = null;
                zipFile = null;
            } catch (Exception e12) {
                e = e12;
                str3 = null;
                zipFile = null;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = null;
                AbstractC29237l.m145996a(closeable2);
                throw th;
            }
            if (AbstractC26389c.m135985a(str2, c28260f.m142304e())) {
                zipFile = new ZipFile(str2);
                try {
                    m103772l = m103772l("unzip_" + str);
                } catch (DriveDownloadException e13) {
                    e = e13;
                    str4 = null;
                } catch (Exception e14) {
                    e = e14;
                    str3 = null;
                }
                try {
                    hashSet = new HashSet();
                    HashSet hashSet2 = (HashSet) this.f98317c.remove(str);
                    if (hashSet2 != null) {
                        Iterator it = hashSet2.iterator();
                        AbstractC19074t.m100207e(it, "iterator(...)");
                        d dVar2 = null;
                        while (it.hasNext()) {
                            try {
                                Object next = it.next();
                                AbstractC19074t.m100207e(next, "next(...)");
                                d dVar3 = (d) next;
                                it.remove();
                                this.f98318d.remove(dVar3.m103792d());
                                if (!dVar3.m103795g()) {
                                    dVar2 = dVar3;
                                } else {
                                    InterfaceC20001e m103790b4 = dVar3.m103790b();
                                    try {
                                        hashSet.add(dVar3.m103789a());
                                    } catch (DriveDownloadException e15) {
                                        AbstractC23350e.m122778h(e15);
                                        AbstractC20887g.m109240r(18851, "[Unzip] " + e15.f40044q + " (" + e15.f40043p + ")");
                                        if (m103790b4 != null) {
                                            m103790b4.mo98996c(e15.f40043p, e15.f40044q);
                                        }
                                    } catch (Exception e16) {
                                        AbstractC23350e.m122778h(e16);
                                        AbstractC20887g.m109240r(18851, "[Unzip] " + e16.getMessage() + " (105)");
                                        if (m103790b4 != null) {
                                            String message3 = e16.getMessage();
                                            if (message3 == null) {
                                                message3 = "";
                                            }
                                            m103790b4.mo98996c(105, message3);
                                        }
                                    }
                                    if (dVar3.m103791c().length() != 0) {
                                        ZipEntry entry = zipFile.getEntry(dVar3.m103789a());
                                        if (entry != null) {
                                            C18388c c18388c = C18388c.f92779a;
                                            InputStream inputStream = zipFile.getInputStream(entry);
                                            AbstractC19074t.m100207e(inputStream, "getInputStream(...)");
                                            c18388c.m97399j(inputStream, dVar3.m103791c());
                                            if (AbstractC23041d2.m118194A(dVar3.m103791c())) {
                                                AbstractC20887g.m109217D(18851, str5, 2, str5);
                                                if (m103790b4 != null) {
                                                    m103790b4.mo98997d(dVar3.m103791c());
                                                }
                                                str5 = null;
                                            } else {
                                                throw new DriveDownloadException(111, "Unzip Drive failed: output file not exist (entryNameInZip=" + dVar3.m103789a() + ", pathOut=" + dVar3.m103791c() + ")");
                                            }
                                        } else {
                                            throw new DriveDownloadException(111, "Unzip Drive failed: zip entry not found (entryNameInZip=" + dVar3.m103789a() + ")");
                                        }
                                    } else {
                                        throw new DriveDownloadException(100, "Unzip Drive failed: empty output path");
                                    }
                                }
                            } catch (DriveDownloadException e17) {
                                e = e17;
                                dVar = dVar2;
                                str4 = m103772l;
                                AbstractC23350e.m122778h(e);
                                m103778r(str, e.f40043p, e.f40044q, str2, str4);
                                if (dVar != null) {
                                }
                                AbstractC29237l.m145996a(zipFile);
                            } catch (Exception e18) {
                                e = e18;
                                dVar = dVar2;
                                str3 = m103772l;
                                AbstractC23350e.m122778h(e);
                                message = e.getMessage();
                                if (message == null) {
                                }
                                m103778r(str, 105, message, str2, str3);
                                if (dVar != null) {
                                }
                                AbstractC29237l.m145996a(zipFile);
                            }
                        }
                        dVar = dVar2;
                    } else {
                        dVar = null;
                    }
                    try {
                        m97426w = C18390e.f92781a.m97426w(str);
                    } catch (DriveDownloadException e19) {
                        e = e19;
                        str4 = m103772l;
                        AbstractC23350e.m122778h(e);
                        m103778r(str, e.f40043p, e.f40044q, str2, str4);
                        if (dVar != null) {
                            m103790b2.mo98996c(e.f40043p, e.f40044q);
                        }
                        AbstractC29237l.m145996a(zipFile);
                    } catch (Exception e21) {
                        e = e21;
                        str3 = m103772l;
                        AbstractC23350e.m122778h(e);
                        message = e.getMessage();
                        if (message == null) {
                        }
                        m103778r(str, 105, message, str2, str3);
                        if (dVar != null) {
                            message2 = e.getMessage();
                            if (message2 == null) {
                            }
                            m103790b.mo98996c(105, message2);
                        }
                        AbstractC29237l.m145996a(zipFile);
                    }
                } catch (DriveDownloadException e22) {
                    e = e22;
                    str4 = m103772l;
                    dVar = null;
                    AbstractC23350e.m122778h(e);
                    m103778r(str, e.f40043p, e.f40044q, str2, str4);
                    if (dVar != null && (m103790b2 = dVar.m103790b()) != null) {
                        m103790b2.mo98996c(e.f40043p, e.f40044q);
                    }
                    AbstractC29237l.m145996a(zipFile);
                } catch (Exception e23) {
                    e = e23;
                    str3 = m103772l;
                    dVar = null;
                    AbstractC23350e.m122778h(e);
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    m103778r(str, 105, message, str2, str3);
                    if (dVar != null && (m103790b = dVar.m103790b()) != null) {
                        message2 = e.getMessage();
                        if (message2 == null) {
                            message2 = "";
                        }
                        m103790b.mo98996c(105, message2);
                    }
                    AbstractC29237l.m145996a(zipFile);
                }
                if (m97426w.length() != 0) {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        try {
                            ZipEntry nextElement = entries.nextElement();
                            AbstractC19074t.m100207e(nextElement, "nextElement(...)");
                            m103781w(nextElement, zipFile, m103772l, hashSet, m97426w, dVar);
                        } catch (Exception e24) {
                            AbstractC23350e.m122778h(e24);
                        }
                    }
                    C23744a.Companion.m124119a().m124116d(4, m97426w);
                    if (dVar != null && (m103790b3 = dVar.m103790b()) != null) {
                        m103790b3.mo98997d(str2);
                    }
                    m103777q(str2, m103772l);
                    AbstractC29237l.m145996a(zipFile);
                } else {
                    throw new DriveDownloadException(100, "Unzip Drive failed: cannot parse ownerId from zip name");
                }
            } else {
                if (!AbstractC23041d2.m118194A(str2)) {
                    throw new DriveDownloadException(107, "Unzip Drive failed: zip not found at " + str2);
                }
                throw new DriveDownloadException(108, "Unzip Drive failed: checksum not match (checksum=" + c28260f.m142304e() + ", pathOut=" + str2 + ")");
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    /* renamed from: p */
    private final void m103776p(d dVar, String str, String str2, String str3, String str4) {
        Map map;
        if (dVar != null) {
            C28260f m103793e = dVar.m103793e();
            if (m103793e != null) {
                map = m103793e.m142309k();
            } else {
                map = null;
            }
            if (map != null) {
                String str5 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str5, "currentUserUid");
                InterfaceC28256b interfaceC28256b = (InterfaceC28256b) map.get(C18390e.m97405i(str5, str2, str3, str4));
                if (interfaceC28256b != null && (interfaceC28256b instanceof C28262h) && str.length() != 0) {
                    C28262h c28262h = (C28262h) interfaceC28256b;
                    if (c28262h.m142269i().length() == 0 || !AbstractC19074t.m100204b(c28262h.m142269i(), str)) {
                        c28262h.m142278r(str);
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private final void m103777q(String str, String str2) {
        AbstractC20130d.m104858T0(new File(str));
        if (str2 != null) {
            AbstractC20130d.m104858T0(new File(str2));
        }
    }

    /* renamed from: r */
    private final void m103778r(String str, int i11, String str2, String str3, String str4) {
        try {
            m103777q(str3, str4);
            m103770j(str, i11, str2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: s */
    static /* synthetic */ void m103779s(C19999c c19999c, String str, int i11, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            str4 = null;
        }
        c19999c.m103778r(str, i11, str2, str3, str4);
    }

    /* renamed from: v */
    public static /* synthetic */ void m103780v(C19999c c19999c, String str, String str2, String str3, String str4, InterfaceC20001e interfaceC20001e, C28260f c28260f, boolean z11, int i11, Object obj) {
        String str5;
        String str6;
        C28260f c28260f2;
        boolean z12;
        if ((i11 & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i11 & 8) != 0) {
            str6 = "";
        } else {
            str6 = str4;
        }
        if ((i11 & 32) != 0) {
            c28260f2 = null;
        } else {
            c28260f2 = c28260f;
        }
        if ((i11 & 64) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        c19999c.m103784u(str, str2, str5, str6, interfaceC20001e, c28260f2, z12);
    }

    /* renamed from: w */
    private final void m103781w(ZipEntry zipEntry, ZipFile zipFile, String str, HashSet hashSet, String str2, d dVar) {
        List list;
        Bitmap m117961l;
        if (hashSet.contains(zipEntry.getName())) {
            return;
        }
        hashSet.add(zipEntry.getName());
        String name = zipEntry.getName();
        if (name != null) {
            list = AbstractC24342w.m127132B0(name, new String[]{"_"}, false, 0, 6, null);
        } else {
            list = null;
        }
        if (list != null && list.size() == 2) {
            String str3 = (String) list.get(0);
            String str4 = (String) list.get(1);
            C17945a0 m103771k = m103771k(str2, str3, str4);
            if (m103771k != null && m103771k.m94871D7()) {
                String m97406j = C18390e.m97406j(m103771k);
                C18388c c18388c = C18388c.f92779a;
                if (c18388c.m97398i(m97406j)) {
                    m103776p(dVar, m97406j, str2, str3, str4);
                    return;
                }
                String m94983Q3 = m103771k.m94983Q3();
                AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                if (m94983Q3.length() > 0) {
                    C32042o.f147549a.m154588d(str2);
                }
                String m97395f = c18388c.m97395f(m97406j);
                if (m97395f.length() != 0) {
                    String str5 = str + m97395f;
                    InputStream inputStream = zipFile.getInputStream(zipEntry);
                    AbstractC19074t.m100207e(inputStream, "getInputStream(...)");
                    c18388c.m97399j(inputStream, str5);
                    File file = new File(str5);
                    if (file.exists()) {
                        File file2 = new File(m97406j);
                        try {
                            if (!file.renameTo(file2)) {
                                AbstractC20130d.m104858T0(file);
                                return;
                            }
                            if (file2.exists()) {
                                boolean m119958q = AbstractC23258x2.m119958q(m97406j);
                                if (!m119958q && (m117961l = AbstractC23009a3.m117961l(m97406j)) != null) {
                                    if (!m117961l.isRecycled()) {
                                        m117961l.recycle();
                                    }
                                } else if (!m119958q) {
                                    C18390e.m97412t("[Unzip] bitmapVerify fail, pathOut=" + m97406j, true);
                                    return;
                                }
                                m103776p(dVar, m97406j, str2, str3, str4);
                                if (m103771k.m95107d3() != 5) {
                                    String m94983Q32 = m103771k.m94983Q3();
                                    if (m94983Q32 != null && m94983Q32.length() != 0) {
                                        m103771k.m95165ic(5, true);
                                    } else {
                                        m103771k.m95256sc(m97406j, false);
                                        return;
                                    }
                                }
                                String m94983Q33 = m103771k.m94983Q3();
                                if (m94983Q33 == null || m94983Q33.length() == 0) {
                                    m103771k.m95256sc(m97406j, true);
                                    return;
                                }
                                return;
                            }
                            throw new DriveDownloadException(111, "Unzip Drive failed: original file not exist (senderId=" + str3 + ", cliMsgId=" + str4 + ", pathOut=" + m97406j + ")");
                        } catch (Exception unused) {
                            AbstractC20130d.m104858T0(file);
                            return;
                        }
                    }
                    throw new DriveDownloadException(111, "Unzip Drive failed: temp file not exist (senderId=" + str3 + ", cliMsgId=" + str4 + ", pathOut=" + str5 + ")");
                }
                throw new DriveDownloadException(111, "Unzip Drive failed: empty file name (senderId=" + str3 + ", cliMsgId=" + str4 + ")");
            }
            return;
        }
        throw new DriveDownloadException(111, "Unzip Drive failed: invalid splitsEntryName (" + list + ")");
    }

    /* renamed from: f */
    public final void m103782f(String str, String str2, MessageId messageId) {
        C0737a c0737a;
        HashSet hashSet;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "senderId");
        AbstractC19074t.m100208f(messageId, "messageId");
        try {
            String m103787b = Companion.m103787b(str, str2, messageId);
            synchronized (this) {
                try {
                    d dVar = (d) this.f98318d.remove(m103787b);
                    if (dVar != null && (hashSet = (HashSet) this.f98317c.get(dVar.m103794f())) != null) {
                        hashSet.remove(dVar);
                        if (hashSet.size() == 0) {
                            this.f98317c.remove(dVar.m103794f());
                            C20002f c20002f = (C20002f) this.f98315a.remove(dVar.m103794f());
                            if (c20002f != null) {
                                c20002f.mo107421i(true);
                            }
                        }
                    }
                    if (this.f98316b.containsKey(m103787b) && (c0737a = (C0737a) this.f98316b.get(m103787b)) != null) {
                        c0737a.mo107421i(true);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public final C0737a m103783t(C17945a0 c17945a0, C28255a c28255a, InterfaceC20001e interfaceC20001e, C21216s c21216s, String str) {
        String str2;
        String str3;
        C0737a c0737a;
        Object obj;
        String str4 = "";
        String str5 = "getSenderUid(...)";
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC19074t.m100208f(c28255a, "driveFileMetadata");
        AbstractC19074t.m100208f(interfaceC20001e, "listener");
        AbstractC19074t.m100208f(c21216s, "autoDownloadController");
        AbstractC19074t.m100208f(str, "pathOut");
        if (!C18390e.m97410q()) {
            return m103769i(c17945a0, str, interfaceC20001e, c21216s);
        }
        try {
            String m95090b5 = c17945a0.m95090b5();
            AbstractC19074t.m100207e(m95090b5, "getUrl(...)");
            String mo95039W2 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            String m94862C4 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            try {
                m103768h(m95090b5, str, mo95039W2, m94862C4, m95029V3);
            } catch (DriveDownloadException e11) {
                e = e11;
                str3 = null;
            } catch (Exception e12) {
                e = e12;
                str2 = null;
            }
        } catch (DriveDownloadException e13) {
            e = e13;
            str3 = null;
        } catch (Exception e14) {
            e = e14;
            str2 = null;
        }
        if (AbstractC23041d2.m118194A(str)) {
            AbstractC20887g.m109217D(18851, null, 2, null);
            interfaceC20001e.mo98997d(str);
            return null;
        }
        try {
        } catch (DriveDownloadException e15) {
            e = e15;
            str3 = str5;
            interfaceC20001e.mo98996c(e.f40043p, e.f40044q);
            c0737a = str3;
            return c0737a;
        } catch (Exception e16) {
            e = e16;
            str2 = str5;
            AbstractC23350e.m122778h(e);
            String message = e.getMessage();
            if (message != null) {
                str4 = message;
            }
            interfaceC20001e.mo98996c(105, str4);
            c0737a = str2;
            return c0737a;
        }
        if (c28255a instanceof C28262h) {
            b bVar = Companion;
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            String m94862C42 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
            MessageId m95029V32 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
            String m103787b = bVar.m103787b(mo95039W22, m94862C42, m95029V32);
            if (!interfaceC20001e.mo98995b()) {
                obj = "";
            } else {
                obj = Long.valueOf(System.currentTimeMillis());
            }
            String str6 = m103787b + obj;
            String m94862C43 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C43, "getSenderUid(...)");
            c0737a = 0;
            m103780v(this, ((C28262h) c28255a).m142327E(), str6, str, C18390e.m97404f(m94862C43, c17945a0.m95029V3()), interfaceC20001e, null, false, 96, null);
            return c0737a;
        }
        return m103769i(c17945a0, str, interfaceC20001e, c21216s);
    }

    /* renamed from: u */
    public final void m103784u(String str, String str2, String str3, String str4, InterfaceC20001e interfaceC20001e, C28260f c28260f, boolean z11) {
        InterfaceC20001e interfaceC20001e2;
        C28260f c28260f2;
        int i11;
        AbstractC19074t.m100208f(str, "zipId");
        AbstractC19074t.m100208f(str2, "requestId");
        AbstractC19074t.m100208f(str3, "pathOut");
        AbstractC19074t.m100208f(str4, "entryNameInZip");
        AbstractC19074t.m100208f(interfaceC20001e, "listener");
        if (!z11 && m103767g(c28260f)) {
            interfaceC20001e.mo98997d(str3);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f98315a.containsKey(str)) {
                    if (c28260f == null) {
                        c28260f2 = C7959d.Companion.m41850e().m41767Z0(str);
                    } else {
                        c28260f2 = c28260f;
                    }
                    if (c28260f2 != null && c28260f2.m142306h().length() != 0) {
                        String m97396g = C18388c.f92779a.m97396g(c28260f2.mo142292f());
                        C20002f c20002f = new C20002f();
                        c20002f.m103806O(new f(z11, this, str, m97396g, c28260f2));
                        c20002f.m107488m(c28260f2.m142306h(), c28260f2.mo142291d(), String.valueOf(c28260f2.mo142289b()), m97396g);
                        Map map = this.f98315a;
                        AbstractC19074t.m100207e(map, "mapZipIdDownloadZipTask");
                        map.put(str, c20002f);
                        if (z11) {
                            i11 = 18871;
                        } else {
                            i11 = 18873;
                        }
                        AbstractC20887g.m109217D(i11, null, 2, null);
                    } else {
                        throw new DriveDownloadException(104, "Drive file ID not found");
                    }
                }
                d dVar = (d) this.f98318d.get(str2);
                if (dVar == null) {
                    interfaceC20001e2 = interfaceC20001e;
                    dVar = new d(str2, str, null, z11, c28260f, str3, str4, 4, null);
                    Map map2 = this.f98318d;
                    AbstractC19074t.m100207e(map2, "mapRequestIdDownloadInfo");
                    map2.put(str2, dVar);
                } else {
                    interfaceC20001e2 = interfaceC20001e;
                }
                dVar.m103796h(interfaceC20001e2);
                HashSet hashSet = (HashSet) this.f98317c.get(str);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    Map map3 = this.f98317c;
                    AbstractC19074t.m100207e(map3, "mapZipIdRequestDownloadInfos");
                    map3.put(str, hashSet);
                }
                hashSet.add(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
