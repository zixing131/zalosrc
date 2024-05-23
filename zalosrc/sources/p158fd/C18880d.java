package p158fd;

import ad.C0738b;
import am.AbstractC0924m0;
import am.C0943w;
import android.text.TextUtils;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.backuprestore.media.exception.DriveDownloadException;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19053g0;
import fn0.C19055h0;
import fn0.C19057i0;
import fn0.C19059j0;
import gd.C19392a;
import gd.C19395d;
import gm.C19490a;
import gm.C19491b;
import gm.C19497h;
import gm.C19498i;
import gw.AbstractC19646n0;
import gw.C19669z;
import ho0.AbstractC20110a;
import id.C20511a;
import id.C20512b;
import id.C20513c;
import id.C20514d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.zip.ZipException;
import ln0.AbstractC22543l;
import me0.AbstractC23008a2;
import me0.AbstractC23041d2;
import me0.AbstractC23238v2;
import nh0.C23793c;
import org.json.JSONObject;
import p128ed.C18388c;
import p128ed.C18390e;
import p206hd.C19999c;
import p206hd.InterfaceC20001e;
import p248iy.AbstractC20887g;
import p264jd.C21222a;
import p264jd.C21226e;
import p264jd.InterfaceC21225d;
import p297kd.C21689d;
import p297kd.C21690e;
import p304ks.AbstractC21935u;
import p320ld.C22438j;
import p348mi.AbstractC23306f;
import p421pc.C24720a;
import p461qu.AbstractC25495a;
import p543uc.AbstractC27231i;
import p543uc.C27225c;
import p543uc.C27228f;
import p543uc.C27230h;
import p543uc.InterfaceC27226d;
import p543uc.InterfaceC27227e;
import p677yc.AbstractC30897a;
import p716zh.C31973j5;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25366r;
import sc.C26220b;
import sc.C26222d;
import si.C26263i;
import su.AbstractC26389c;
import tc.C26627a;
import vc.EnumC27961a;
import vi.C28255a;
import vi.C28257c;
import vi.C28260f;
import vi.C28261g;
import vi.C28262h;
import vi.InterfaceC28256b;

/* renamed from: fd.d */
/* loaded from: classes3.dex */
public final class C18880d extends AbstractC27231i {
    public static final a Companion = new a(null);

    /* renamed from: w */
    private static final Object f94215w = new Object();

    /* renamed from: b */
    private final InterfaceC24854k f94216b;

    /* renamed from: c */
    private final HashMap f94217c;

    /* renamed from: d */
    private final ArrayList f94218d;

    /* renamed from: e */
    private int[] f94219e;

    /* renamed from: f */
    private int f94220f;

    /* renamed from: g */
    private d f94221g;

    /* renamed from: h */
    private b f94222h;

    /* renamed from: i */
    private boolean f94223i;

    /* renamed from: j */
    private boolean f94224j;

    /* renamed from: k */
    private long f94225k;

    /* renamed from: l */
    private int f94226l;

    /* renamed from: m */
    private long f94227m;

    /* renamed from: n */
    private long f94228n;

    /* renamed from: o */
    private boolean f94229o;

    /* renamed from: p */
    private final ArrayList f94230p;

    /* renamed from: q */
    private int f94231q;

    /* renamed from: r */
    private boolean f94232r;

    /* renamed from: s */
    private long f94233s;

    /* renamed from: t */
    private final ArrayList f94234t;

    /* renamed from: u */
    private final ArrayList f94235u;

    /* renamed from: v */
    private long f94236v;

    /* renamed from: fd.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: fd.d$b */
    /* loaded from: classes3.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            AbstractC19074t.m100208f(entry, "o1");
            AbstractC19074t.m100208f(entry2, "o2");
            return AbstractC19074t.m100210h(((Number) entry2.getValue()).longValue(), ((Number) entry.getValue()).longValue());
        }
    }

    /* renamed from: fd.d$c */
    /* loaded from: classes3.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C28261g c28261g, C28261g c28261g2) {
            AbstractC19074t.m100208f(c28261g, "o1");
            AbstractC19074t.m100208f(c28261g2, "o2");
            int m100210h = AbstractC19074t.m100210h(c28261g2.m142319h().m142312n(), c28261g.m142319h().m142312n());
            if (m100210h != 0) {
                return m100210h;
            }
            int m100209g = AbstractC19074t.m100209g(c28261g.m142319h().m142311m(), c28261g2.m142319h().m142311m());
            if (m100209g != 0) {
                return m100209g;
            }
            return 0;
        }
    }

    /* renamed from: fd.d$d */
    /* loaded from: classes3.dex */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C28260f c28260f, C28260f c28260f2) {
            AbstractC19074t.m100208f(c28260f, "o1");
            AbstractC19074t.m100208f(c28260f2, "o2");
            int m100210h = AbstractC19074t.m100210h(c28260f.m142312n(), c28260f2.m142312n());
            if (m100210h != 0) {
                return m100210h;
            }
            int m100209g = AbstractC19074t.m100209g(c28260f2.m142311m(), c28260f.m142311m());
            if (m100209g != 0) {
                return m100209g;
            }
            return 0;
        }
    }

    /* renamed from: fd.d$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f94237q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24720a mo12V4() {
            return AbstractC23306f.m120676j();
        }
    }

    /* renamed from: fd.d$f */
    /* loaded from: classes3.dex */
    public static final class f implements InterfaceC20001e {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f94238a;

        /* renamed from: b */
        final /* synthetic */ C19055h0 f94239b;

        f(CountDownLatch countDownLatch, C19055h0 c19055h0) {
            this.f94238a = countDownLatch;
            this.f94239b = c19055h0;
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: a */
        public void mo98994a(String str, long j11) {
            AbstractC19074t.m100208f(str, "downloadId");
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
            this.f94239b.f94931p = i11;
            this.f94238a.countDown();
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: d */
        public void mo98997d(String str) {
            AbstractC19074t.m100208f(str, "path");
            this.f94238a.countDown();
        }
    }

    /* renamed from: fd.d$g */
    /* loaded from: classes3.dex */
    public static final class g implements InterfaceC20001e {

        /* renamed from: a */
        final /* synthetic */ ArrayList f94240a;

        /* renamed from: b */
        final /* synthetic */ C28260f f94241b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f94242c;

        /* renamed from: d */
        final /* synthetic */ C19055h0 f94243d;

        /* renamed from: e */
        final /* synthetic */ C19057i0 f94244e;

        /* renamed from: f */
        final /* synthetic */ C19057i0 f94245f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC27226d f94246g;

        /* renamed from: h */
        final /* synthetic */ C18880d f94247h;

        /* renamed from: i */
        final /* synthetic */ long f94248i;

        g(ArrayList arrayList, C28260f c28260f, CountDownLatch countDownLatch, C19055h0 c19055h0, C19057i0 c19057i0, C19057i0 c19057i02, InterfaceC27226d interfaceC27226d, C18880d c18880d, long j11) {
            this.f94240a = arrayList;
            this.f94241b = c28260f;
            this.f94242c = countDownLatch;
            this.f94243d = c19055h0;
            this.f94244e = c19057i0;
            this.f94245f = c19057i02;
            this.f94246g = interfaceC27226d;
            this.f94247h = c18880d;
            this.f94248i = j11;
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: a */
        public void mo98994a(String str, long j11) {
            long j12;
            AbstractC19074t.m100208f(str, "downloadId");
            try {
                long mo142289b = this.f94241b.mo142289b();
                C19057i0 c19057i0 = this.f94244e;
                long j13 = c19057i0.f94939p;
                if (j13 == 0) {
                    j12 = (mo142289b * j11) / 100;
                    c19057i0.f94939p = j12;
                } else {
                    long j14 = (mo142289b * j11) / 100;
                    if (j14 <= j13) {
                        return;
                    }
                    c19057i0.f94939p = j14;
                    j12 = j14 - j13;
                }
                this.f94245f.f94939p += j12;
                InterfaceC27226d interfaceC27226d = this.f94246g;
                if (interfaceC27226d != null) {
                    interfaceC27226d.mo98897a(this.f94247h.f94220f, this.f94247h.m98937W(5, (int) ((this.f94245f.f94939p * 100) / this.f94248i)));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
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
            try {
                this.f94243d.f94931p = i11;
            } finally {
                this.f94242c.countDown();
            }
        }

        @Override // p206hd.InterfaceC20001e
        /* renamed from: d */
        public void mo98997d(String str) {
            AbstractC19074t.m100208f(str, "path");
            try {
                this.f94240a.add(this.f94241b);
            } finally {
                this.f94242c.countDown();
            }
        }
    }

    /* renamed from: fd.d$h */
    /* loaded from: classes3.dex */
    public static final class h implements InterfaceC21225d {

        /* renamed from: a */
        final /* synthetic */ C19053g0 f94249a;

        /* renamed from: b */
        final /* synthetic */ C19053g0 f94250b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC27226d f94251c;

        /* renamed from: d */
        final /* synthetic */ C18880d f94252d;

        /* renamed from: e */
        final /* synthetic */ C19059j0 f94253e;

        h(C19053g0 c19053g0, C19053g0 c19053g02, InterfaceC27226d interfaceC27226d, C18880d c18880d, C19059j0 c19059j0) {
            this.f94249a = c19053g0;
            this.f94250b = c19053g02;
            this.f94251c = interfaceC27226d;
            this.f94252d = c18880d;
            this.f94253e = c19059j0;
        }

        @Override // p264jd.InterfaceC21225d
        /* renamed from: a */
        public void mo98998a(C28260f c28260f, File file, String str) {
            String str2;
            AbstractC19074t.m100208f(c28260f, "zipFileMetadataUploaded");
            AbstractC19074t.m100208f(file, "zipFileUploaded");
            AbstractC19074t.m100208f(str, "strJsonRes");
            C19059j0 c19059j0 = this.f94253e;
            if (c19059j0.f94941p == null) {
                c19059j0.f94941p = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) this.f94253e.f94941p;
            if (arrayList != null) {
                arrayList.add(c28260f);
            }
            C27225c.m139327b(4);
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("id");
            String optString2 = jSONObject.optString("name");
            String m135987c = AbstractC26389c.m135987c(file);
            AbstractC19074t.m100205c(optString2);
            c28260f.m142315r(optString2);
            AbstractC19074t.m100205c(optString);
            c28260f.m142316s(optString);
            AbstractC19074t.m100205c(m135987c);
            c28260f.m142314q(m135987c);
            C7959d.Companion.m41850e().m41719K1(c28260f);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (InterfaceC28256b interfaceC28256b : c28260f.m142309k().values()) {
                if (interfaceC28256b instanceof C28257c) {
                    C28257c c28257c = (C28257c) interfaceC28256b;
                    if (c28257c.m142293e() == EnumC27961a.f130358q) {
                        Object m142294g = c28257c.m142294g();
                        AbstractC19074t.m100206d(m142294g, "null cannot be cast to non-null type com.zing.zalo.data.backuprestore.model.media.DriveFileMetadata");
                        arrayList2.add((C28255a) m142294g);
                    } else if (c28257c.m142293e() == EnumC27961a.f130361t && (c28257c.m142294g() instanceof C28262h)) {
                        arrayList3.add(c28257c.m142294g());
                    }
                }
            }
            C7959d.Companion.m41850e().m41755U2(arrayList2);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                C28262h c28262h = (C28262h) it.next();
                C7959d m41850e = C7959d.Companion.m41850e();
                String m142325C = c28262h.m142325C();
                String m142326D = c28262h.m142326D();
                MessageId m142324B = c28262h.m142324B();
                if (m142324B == null || (str2 = m142324B.m41044h()) == null) {
                    str2 = "0";
                }
                m41850e.m41697E0(m142325C, m142326D, str2, c28262h.m142327E());
            }
            this.f94250b.f94930p += this.f94249a.f94930p;
            this.f94252d.f94226l++;
            this.f94252d.f94225k += c28260f.mo142289b();
            AbstractC23041d2.m118207f(file);
            if (this.f94252d.f94227m != 0) {
                long j11 = this.f94252d.f94227m;
                long m142312n = c28260f.m142312n();
                if (1 > m142312n || m142312n >= j11) {
                    return;
                }
            }
            this.f94252d.f94227m = c28260f.m142312n();
        }

        @Override // p264jd.InterfaceC21225d
        /* renamed from: b */
        public void mo98999b(long j11, long j12) {
            int m116584g;
            int i11 = (int) (this.f94250b.f94930p + ((((float) j11) * this.f94249a.f94930p) / ((float) j12)));
            InterfaceC27226d interfaceC27226d = this.f94251c;
            if (interfaceC27226d != null) {
                int i12 = this.f94252d.f94220f;
                C18880d c18880d = this.f94252d;
                m116584g = AbstractC22543l.m116584g(i11, 100);
                interfaceC27226d.mo98897a(i12, c18880d.m98937W(4, m116584g));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18880d(InterfaceC27227e interfaceC27227e) {
        super(interfaceC27227e);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(interfaceC27227e, "wrapped");
        m129210a = AbstractC24856m.m129210a(e.f94237q);
        this.f94216b = m129210a;
        this.f94217c = new HashMap();
        this.f94218d = new ArrayList();
        this.f94219e = m98928Q().m128419n();
        this.f94220f = 1;
        this.f94228n = Long.MAX_VALUE;
        this.f94230p = new ArrayList();
        this.f94232r = true;
        this.f94234t = new ArrayList();
        this.f94235u = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x017a  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m98898A(ArrayList arrayList, C21690e c21690e) {
        int m116584g;
        String str;
        if (!TextUtils.isEmpty(mo139336e())) {
            HashMap hashMap = new HashMap(arrayList.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C28260f c28260f = (C28260f) it.next();
                String m142306h = c28260f.m142306h();
                AbstractC19074t.m100205c(c28260f);
                hashMap.put(m142306h, c28260f);
                arrayList2.add(c28260f.m142306h());
            }
            boolean z11 = true;
            if (!arrayList2.isEmpty()) {
                int i11 = 100;
                int ceil = (int) Math.ceil(arrayList2.size() / 100);
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                long j11 = 0;
                while (i12 < ceil) {
                    try {
                        m116584g = AbstractC22543l.m116584g(arrayList2.size(), i11);
                        ArrayList arrayList4 = new ArrayList(m116584g);
                        int i13 = i12 + 1;
                        int i14 = i13 * 100;
                        if (i14 > arrayList2.size()) {
                            i14 = arrayList2.size();
                        }
                        arrayList4.addAll(arrayList2.subList(i12 * 100, i14));
                        if (new C27228f(mo139336e(), arrayList4).m139339a()) {
                            String str2 = "[DELETE] Delete zip success, size=" + arrayList4.size();
                            Iterator it2 = arrayList4.iterator();
                            long j12 = j11;
                            int i15 = 0;
                            String str3 = str2;
                            while (it2.hasNext()) {
                                try {
                                    try {
                                        try {
                                            String str4 = (String) it2.next();
                                            C28260f c28260f2 = (C28260f) hashMap.get(str4);
                                            if (c28260f2 != null) {
                                                try {
                                                    arrayList3.add(c28260f2);
                                                    String mo142291d = c28260f2.mo142291d();
                                                    j12 += c28260f2.mo142289b();
                                                    C7959d.a aVar = C7959d.Companion;
                                                    aVar.m41850e().m41816p0(str4);
                                                    aVar.m41850e().m41812o0(c28260f2.mo142291d());
                                                    try {
                                                        try {
                                                            m98981y0(mo142291d);
                                                            if (i15 == 0) {
                                                                str = str3 + ", first=" + mo142291d;
                                                            } else if (i15 == arrayList4.size() - 1) {
                                                                str = str3 + ", last=" + mo142291d;
                                                            }
                                                            str3 = str;
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            try {
                                                                AbstractC20110a.f98889a.mo104552e(e);
                                                                i15++;
                                                            } catch (BackupRestoreMediaException e12) {
                                                                e = e12;
                                                                j11 = j12;
                                                                try {
                                                                    throw e;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    if (!arrayList3.isEmpty()) {
                                                                        long m133000s = AbstractC23306f.m120688m().m133000s();
                                                                        if (m133000s > 0) {
                                                                            AbstractC23306f.m120688m().m132988G(m133000s + j11);
                                                                        }
                                                                        if (c21690e.f105269f != 1) {
                                                                            z11 = false;
                                                                        }
                                                                        C26222d.f124594a.m134859h(arrayList3, z11);
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        j11 = j12;
                                                        if (!arrayList3.isEmpty()) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e13) {
                                                    e = e13;
                                                }
                                            }
                                            i15++;
                                        } catch (BackupRestoreMediaException e14) {
                                            e = e14;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (BackupRestoreMediaException e15) {
                                    e = e15;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                            try {
                                C18390e.m97413u(str3, false, 2, null);
                                j11 = j12;
                            } catch (BackupRestoreMediaException e16) {
                                e = e16;
                                j11 = j12;
                                throw e;
                            } catch (Throwable th6) {
                                th = th6;
                                j11 = j12;
                                if (!arrayList3.isEmpty()) {
                                }
                                throw th;
                            }
                        }
                        i12 = i13;
                        i11 = 100;
                    } catch (BackupRestoreMediaException e17) {
                        e = e17;
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
                if (!arrayList3.isEmpty()) {
                    long m133000s2 = AbstractC23306f.m120688m().m133000s();
                    if (m133000s2 > 0) {
                        AbstractC23306f.m120688m().m132988G(m133000s2 + j11);
                    }
                    if (c21690e.f105269f != 1) {
                        z11 = false;
                    }
                    C26222d.f124594a.m134859h(arrayList3, z11);
                    return;
                }
                return;
            }
            return;
        }
        throw new DriveAuthException(6, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, "Delete Drive failed: invalid token");
    }

    /* renamed from: A0 */
    private final void m98899A0() {
        m98903C0();
        m98901B0();
    }

    /* renamed from: B */
    private final void m98900B() {
        long j11;
        Integer num;
        int m128425u = m98928Q().m128425u();
        long j12 = 0;
        if (m128425u != -1) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, -m128425u);
            j11 = calendar.getTimeInMillis();
        } else {
            j11 = 0;
        }
        Iterator it = this.f94218d.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            C28255a c28255a = (C28255a) it.next();
            if (c28255a.m142266e().length() > 0 && c28255a.m142274n() < j11) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c28255a.m142266e());
                j12 += c28255a.m142267g();
            }
        }
        if (arrayList != null && (!arrayList.isEmpty())) {
            C18390e.m97413u("[DELETE_SINGLE] List delete: count=" + arrayList.size() + ", size=" + j12, false, 2, null);
            List<String> mo139335c = mo139335c(arrayList);
            if (mo139335c != null) {
                num = Integer.valueOf(mo139335c.size());
            } else {
                num = null;
            }
            C18390e.m97413u("[DELETE_SINGLE] Done, listDriveIdDeleted: " + num, false, 2, null);
            if (mo139335c != null && (!mo139335c.isEmpty())) {
                for (String str : mo139335c) {
                    try {
                        C7959d.Companion.m41850e().m41808n0(str);
                        Iterator it2 = this.f94218d.iterator();
                        AbstractC19074t.m100207e(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            AbstractC19074t.m100207e(next, "next(...)");
                            C28255a c28255a2 = (C28255a) next;
                            if (c28255a2.m142266e().length() > 0 && AbstractC19074t.m100204b(c28255a2.m142266e(), str)) {
                                it2.remove();
                            }
                        }
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            }
        }
    }

    /* renamed from: B0 */
    private final void m98901B0() {
        if (this.f94218d.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator it = this.f94218d.iterator();
        long j11 = Long.MIN_VALUE;
        long j12 = Long.MAX_VALUE;
        while (it.hasNext()) {
            C28255a c28255a = (C28255a) it.next();
            if (c28255a.m142274n() < j12) {
                j12 = c28255a.m142274n();
            }
            if (c28255a.m142274n() > j11) {
                j11 = c28255a.m142274n();
            }
        }
        long j13 = j12 - 1;
        C19669z.b bVar = C19669z.Companion;
        bVar.m103232a().m103229t0();
        List<Conversation> m103212Y0 = bVar.m103232a().m103212Y0();
        HashMap hashMap = new HashMap();
        Iterator it2 = this.f94218d.iterator();
        while (it2.hasNext()) {
            C28255a c28255a2 = (C28255a) it2.next();
            String mo142271k = c28255a2.mo142271k();
            AbstractC19074t.m100205c(c28255a2);
            hashMap.put(mo142271k, c28255a2);
        }
        for (Conversation conversation : m103212Y0) {
            C27225c.m139327b(3);
            if (!AbstractC25495a.m132079d(conversation.f42893q) && !AbstractC21935u.m114518H(conversation.f42893q)) {
                long j14 = Long.MAX_VALUE;
                while (j14 > Long.MIN_VALUE) {
                    long m98975v0 = m98975v0(conversation.f42893q, j13, j11, j14, hashMap);
                    conversation = conversation;
                    j14 = m98975v0;
                }
            }
        }
        C18390e.m97413u("startAnalyzeDataRestoreSinglePhoto, time=" + (System.currentTimeMillis() - currentTimeMillis) + " ms, cnt=" + this.f94235u.size(), false, 2, null);
    }

    /* renamed from: C */
    private final void m98902C(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC23041d2.m118208g(C18388c.f92779a.m97397h(((InterfaceC28256b) it.next()).mo142291d()));
        }
    }

    /* renamed from: C0 */
    private final void m98903C0() {
        MessageId m142324B;
        if (this.f94217c.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap m98934T = m98934T();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        C19498i c19498i = new C19498i();
        for (Map.Entry entry : m98934T.entrySet()) {
            String str = (String) entry.getKey();
            LinkedList linkedList = (LinkedList) entry.getValue();
            C27225c.m139327b(3);
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C28260f c28260f = (C28260f) it.next();
                String mo142291d = c28260f.mo142291d();
                for (InterfaceC28256b interfaceC28256b : c28260f.m142309k().values()) {
                    if (hashSet.contains(mo142291d)) {
                        break;
                    }
                    if ((interfaceC28256b instanceof C28262h) && (m142324B = ((C28262h) interfaceC28256b).m142324B()) != null) {
                        C19497h c19497h = new C19497h();
                        c19497h.f96812a = m142324B.m41047k();
                        c19497h.f96813b = m142324B.m41045i();
                        c19497h.f96814c = m142324B.m41051o();
                        c19498i.m101942a(c19497h);
                        String str2 = CoreUtility.f89233i;
                        AbstractC19074t.m100207e(str2, "currentUserUid");
                        hashMap.put(C18390e.m97405i(str2, str, m142324B.m41050n(), m142324B.m41044h()), mo142291d);
                    }
                    if (c19498i.m101944c() >= 200) {
                        m98977w0(str, c19498i, hashSet, hashMap);
                        c19498i = new C19498i();
                        hashMap.clear();
                    }
                }
            }
            if (c19498i.m101944c() > 0) {
                m98977w0(str, c19498i, hashSet, hashMap);
                c19498i = new C19498i();
                hashMap.clear();
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            C28260f c28260f2 = (C28260f) this.f94217c.get((String) it2.next());
            if (c28260f2 != null) {
                this.f94234t.add(c28260f2);
            }
        }
        C18390e.m97413u("startAnalyzeDataRestoreZip, time=" + (System.currentTimeMillis() - currentTimeMillis) + " ms, cnt=" + this.f94234t.size(), false, 2, null);
    }

    /* renamed from: D0 */
    private final void m98904D0(C28260f c28260f) {
        C18390e.m97413u("[UPLOAD] startDownloadFromDrive to re-update zip, zipID=" + c28260f.mo142292f(), false, 2, null);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C19055h0 c19055h0 = new C19055h0();
        c19055h0.f94931p = -1;
        C19999c.m103780v(C19999c.Companion.m103786a(), c28260f.mo142292f(), c28260f.mo142292f(), null, null, new f(countDownLatch, c19055h0), c28260f, false, 12, null);
        countDownLatch.await();
        if (c19055h0.f94931p == -1) {
            return;
        }
        throw new DriveDownloadException(c19055h0.f94931p, "Download to update Drive failed: zipId=" + c28260f.mo142292f());
    }

    /* renamed from: E0 */
    private final long m98905E0(InterfaceC27226d interfaceC27226d, long j11) {
        long j12 = 0;
        if (!this.f94235u.isEmpty()) {
            Iterator it = this.f94235u.iterator();
            while (it.hasNext()) {
                C28255a c28255a = (C28255a) it.next();
                String mo139336e = mo139336e();
                AbstractC19074t.m100205c(c28255a);
                AbstractC30897a.m150119d(new C0738b(mo139336e, c28255a), this.f94219e, null, 2, null);
                j12 += c28255a.m142267g();
                if (interfaceC27226d != null) {
                    interfaceC27226d.mo98897a(this.f94220f, m98937W(5, (int) ((100 * j12) / j11)));
                }
            }
        }
        return j12;
    }

    /* renamed from: F */
    private final void m98906F(HashMap hashMap) {
        long j11;
        int m128413h = m98928Q().m128413h();
        if (m128413h > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, -(m128413h + 1));
            j11 = calendar.getTimeInMillis();
        } else {
            j11 = 0;
        }
        if (j11 <= 0) {
            return;
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            LinkedList linkedList = (LinkedList) entry.getValue();
            int size = linkedList.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i11 = size - 1;
                    Object obj = linkedList.get(size);
                    AbstractC19074t.m100207e(obj, "get(...)");
                    if (((C28260f) obj).m142312n() < j11) {
                        break;
                    }
                    linkedList.remove(size);
                    if (i11 < 0) {
                        break;
                    } else {
                        size = i11;
                    }
                }
            }
            if (((LinkedList) entry.getValue()).isEmpty()) {
                it.remove();
            }
        }
    }

    /* renamed from: F0 */
    private final void m98907F0(InterfaceC27226d interfaceC27226d, long j11, long j12) {
        boolean z11;
        C19057i0 c19057i0 = new C19057i0();
        c19057i0.f94939p = j11;
        int i11 = 1;
        if (!this.f94234t.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    Iterator it = this.f94234t.iterator();
                    while (it.hasNext()) {
                        C28260f c28260f = (C28260f) it.next();
                        C18390e.f92781a.m97414a(5);
                        C27225c.m139327b(5);
                        CountDownLatch countDownLatch = new CountDownLatch(i11);
                        C19055h0 c19055h0 = new C19055h0();
                        c19055h0.f94931p = -1;
                        C19999c.m103780v(C19999c.Companion.m103786a(), c28260f.mo142292f(), c28260f.mo142292f(), null, null, new g(arrayList, c28260f, countDownLatch, c19055h0, new C19057i0(), c19057i0, interfaceC27226d, this, j12), c28260f, false, 12, null);
                        countDownLatch.await();
                        if (c19055h0.f94931p == -1) {
                            i11 = 1;
                        } else {
                            throw new DriveDownloadException(c19055h0.f94931p, "Download Drive failed: zipId=" + c28260f.mo142292f());
                        }
                    }
                    if (z11) {
                        return;
                    } else {
                        return;
                    }
                } catch (BackupRestoreMediaException e11) {
                    throw e11;
                }
            } finally {
                if (!arrayList.isEmpty()) {
                    C26222d.f124594a.m134857f(arrayList);
                }
            }
        }
        C18390e.m97413u("[Download] List zip file need to download empty", false, 2, null);
    }

    /* renamed from: G */
    private final long m98908G(long j11, ArrayList arrayList, HashMap hashMap) {
        C19669z.b bVar = C19669z.Companion;
        bVar.m103232a().m103229t0();
        List<Conversation> m103212Y0 = bVar.m103232a().m103212Y0();
        HashSet hashSet = new HashSet();
        for (Conversation conversation : m103212Y0) {
            if (hashMap.containsKey(conversation.f42893q)) {
                hashSet.add(conversation.f42893q);
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashSet.contains(entry.getKey())) {
                it.remove();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.addAll((Collection) entry.getValue());
            }
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            Collections.sort(arrayList2, m98947g0());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C28260f c28260f = (C28260f) it2.next();
                arrayList.add(c28260f);
                j11 -= c28260f.mo142289b();
                if (j11 <= 0) {
                    break;
                }
            }
        }
        return j11;
    }

    /* renamed from: G0 */
    private final void m98909G0(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        C26263i.m135054t0(3);
        if (this.f94223i) {
            this.f94236v = 0L;
            long currentTimeMillis = System.currentTimeMillis();
            try {
                m98983z0(interfaceC27226d, currentTimeMillis);
                C26220b.m134837u(c21690e, currentTimeMillis, this.f94236v, null, 8, null);
            } catch (Exception e11) {
                C26220b.m134836t(c21690e, currentTimeMillis, this.f94236v, e11);
                throw e11;
            }
        } else if (this.f94224j) {
            m98899A0();
            if (interfaceC27226d != null) {
                interfaceC27226d.mo98897a(this.f94220f, 100);
            }
        } else {
            C18390e.m97413u("No need to analyze data", false, 2, null);
        }
        C26263i.m135052r(3);
    }

    /* renamed from: H */
    private final long m98910H(long j11, ArrayList arrayList, HashMap hashMap) {
        C31973j5 m4472f;
        int m128446e = m98928Q().m128426v().m128446e();
        Iterator it = hashMap.entrySet().iterator();
        ArrayList arrayList2 = null;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (AbstractC25495a.m132079d(str) && ((m4472f = C0943w.f3447a.m4472f(str)) == null || m4472f.m153732O() > m128446e)) {
                it.remove();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.addAll((Collection) entry.getValue());
            }
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            Collections.sort(arrayList2, m98947g0());
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C28260f c28260f = (C28260f) it2.next();
                arrayList.add(c28260f);
                j11 -= c28260f.mo142289b();
                if (j11 <= 0) {
                    break;
                }
            }
        }
        return j11;
    }

    /* renamed from: H0 */
    private final void m98911H0(C21690e c21690e) {
        int i11;
        long m116585h;
        if (C22438j.m115948p(c21690e.f105269f)) {
            return;
        }
        boolean z11 = true;
        if (m98961o0()) {
            i11 = 1;
        } else if (m98963p0()) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            C18390e.m97413u("[DELETE] Delete source invalid", false, 2, null);
            return;
        }
        if (i11 == 1) {
            C18390e.m97413u("[DELETE] start filter delete single photo", false, 2, null);
            m98900B();
        }
        long m98946f0 = m98946f0();
        if (m98946f0 < m98928Q().m128426v().m128454m() * 1048576) {
            C18390e.m97413u("[DELETE] min storage invalid, storageUserUsed=" + m98946f0, false, 2, null);
            return;
        }
        if (i11 != 1) {
            z11 = false;
        }
        long m98939Y = m98939Y(z11);
        long m128453l = m98928Q().m128426v().m128453l() * 1048576;
        if (m98939Y != -1 && m98939Y < m128453l) {
            long j11 = m128453l - m98939Y;
            if (j11 >= m98928Q().m128426v().m128452k() * 1048576) {
                m116585h = AbstractC22543l.m116585h(j11, m98946f0 / 5);
                C18390e.m97413u("[DELETE] start filter list zip delete, bytesNeedDelete=" + m116585h + ", sourceDelete=" + i11, false, 2, null);
                m98982z(m98920M(m116585h, i11), c21690e);
                return;
            }
            C18390e.m97413u("[DELETE] bytesNeedRoll storage invalid, bytes=" + j11, false, 2, null);
            return;
        }
        C18390e.m97413u("[DELETE] remainingStorage storage invalid, remainingStorage=" + m98939Y, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long m98912I(long j11, ArrayList arrayList, HashMap hashMap, boolean z11) {
        ArrayList arrayList2 = null;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            LinkedList linkedList = (LinkedList) entry.getValue();
            boolean m132079d = AbstractC25495a.m132079d(str);
            if (z11) {
                if (m132079d) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.addAll(linkedList);
                }
            } else if (!m132079d) {
                if (arrayList2 == null) {
                }
                arrayList2.addAll(linkedList);
            }
        }
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            Collections.sort(arrayList2, m98947g0());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C28260f c28260f = (C28260f) it.next();
                arrayList.add(c28260f);
                j11 -= c28260f.mo142289b();
                if (j11 <= 0) {
                    break;
                }
            }
        }
        return j11;
    }

    /* renamed from: I0 */
    private final void m98913I0(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        if (!this.f94224j) {
            C18390e.m97413u("[DOWNLOAD] Backup only or restore CSC", false, 2, null);
        } else if (this.f94234t.isEmpty() && this.f94235u.isEmpty()) {
            C18390e.m97413u("[DOWNLOAD] Empty data", false, 2, null);
        } else {
            if (interfaceC27226d != null) {
                interfaceC27226d.mo98897a(this.f94220f, m98938X(this, 5, 0, 2, null));
            }
            c21690e.m111879Q(true);
            C26263i.m135054t0(5);
            long m98941a0 = m98941a0(this.f94234t) + m98940Z(this.f94235u);
            if (m98941a0 > 0) {
                C27225c.m139327b(5);
                m98907F0(interfaceC27226d, m98905E0(interfaceC27226d, m98941a0), m98941a0);
                C26263i.m135052r(5);
                return;
            }
            throw new BackupRestoreMediaException(5, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "[Download] Invalid totalBytesNeedDownload!");
        }
        c21690e.m111879Q(false);
    }

    /* renamed from: J */
    private final long m98914J(long j11, ArrayList arrayList, HashMap hashMap) {
        String str;
        int m128451j = m98928Q().m128426v().m128451j();
        if (m128451j <= 0) {
            return j11;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            LinkedList linkedList = (LinkedList) entry.getValue();
            if (!AbstractC25495a.m132079d(str2)) {
                hashMap2.put(str2, Long.valueOf(m98941a0(linkedList)));
            }
        }
        if (hashMap2.isEmpty()) {
            return j11;
        }
        ArrayList arrayList2 = new ArrayList(hashMap2.entrySet());
        boolean z11 = true;
        if (arrayList2.size() > 1) {
            Collections.sort(arrayList2, m98932S());
        }
        Iterator it = arrayList2.iterator();
        long j12 = j11;
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            AbstractC19074t.m100207e(key, "<get-key>(...)");
            String str3 = (String) key;
            LinkedList linkedList2 = (LinkedList) hashMap.get(str3);
            if (linkedList2 != null && (linkedList2.isEmpty() ^ z11)) {
                Object value = entry2.getValue();
                AbstractC19074t.m100207e(value, "<get-value>(...)");
                long longValue = ((Number) value).longValue();
                Iterator it2 = linkedList2.iterator();
                AbstractC19074t.m100207e(it2, "iterator(...)");
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C28260f c28260f = (C28260f) next;
                        str = str3;
                        if (longValue - c28260f.mo142289b() < m128451j * 1048576) {
                            break;
                        }
                        it2.remove();
                        arrayList.add(c28260f);
                        j12 -= c28260f.mo142289b();
                        longValue -= c28260f.mo142289b();
                        if (j12 <= 0) {
                            break;
                        }
                        str3 = str;
                    } else {
                        str = str3;
                        break;
                    }
                }
                if (linkedList2.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            if (j12 <= 0) {
                break;
            }
            z11 = true;
        }
        return j12;
    }

    /* renamed from: J0 */
    private final void m98915J0(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        if (!c21690e.m111865C()) {
            return;
        }
        if (interfaceC27226d != null) {
            interfaceC27226d.mo98897a(this.f94220f, m98938X(this, 4, 0, 2, null));
        }
        C26263i.m135054t0(4);
        c21690e.m111878P(true);
        C27225c.m139327b(4);
        m98933S0(this.f94230p, c21690e, interfaceC27226d);
        C26263i.m135052r(4);
    }

    /* renamed from: K */
    private final long m98916K(long j11, ArrayList arrayList, HashMap hashMap) {
        String str;
        int m128450i = m98928Q().m128426v().m128450i();
        if (m128450i <= 0) {
            return j11;
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            LinkedList linkedList = (LinkedList) entry.getValue();
            if (AbstractC25495a.m132079d(str2)) {
                hashMap2.put(str2, Long.valueOf(m98941a0(linkedList)));
            }
        }
        if (hashMap2.isEmpty()) {
            return j11;
        }
        ArrayList arrayList2 = new ArrayList(hashMap2.entrySet());
        boolean z11 = true;
        if (arrayList2.size() > 1) {
            Collections.sort(arrayList2, m98932S());
        }
        Iterator it = arrayList2.iterator();
        long j12 = j11;
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Object key = entry2.getKey();
            AbstractC19074t.m100207e(key, "<get-key>(...)");
            String str3 = (String) key;
            LinkedList linkedList2 = (LinkedList) hashMap.get(str3);
            if (linkedList2 != null && (linkedList2.isEmpty() ^ z11)) {
                Object value = entry2.getValue();
                AbstractC19074t.m100207e(value, "<get-value>(...)");
                long longValue = ((Number) value).longValue();
                Iterator it2 = linkedList2.iterator();
                AbstractC19074t.m100207e(it2, "iterator(...)");
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C28260f c28260f = (C28260f) next;
                        str = str3;
                        if (longValue - c28260f.mo142289b() < m128450i * 1048576) {
                            break;
                        }
                        it2.remove();
                        arrayList.add(c28260f);
                        j12 -= c28260f.mo142289b();
                        longValue -= c28260f.mo142289b();
                        if (j12 <= 0) {
                            break;
                        }
                        str3 = str;
                    } else {
                        str = str3;
                        break;
                    }
                }
                if (linkedList2.isEmpty()) {
                    hashMap.remove(str);
                }
            }
            if (j12 <= 0) {
                break;
            }
            z11 = true;
        }
        return j12;
    }

    /* renamed from: K0 */
    private final void m98917K0(C21690e c21690e, boolean z11, boolean z12, final InterfaceC27226d interfaceC27226d) {
        final int i11;
        int m116580c;
        final InterfaceC27226d interfaceC27226d2;
        int i12;
        boolean z13;
        boolean z14;
        try {
            final C19055h0 c19055h0 = new C19055h0();
            if (z11 && z12) {
                i11 = m98937W(4, 0);
            } else if (z11) {
                i11 = 100;
            } else {
                i11 = 0;
            }
            final int i13 = 100 - i11;
            InterfaceC27226d interfaceC27226d3 = null;
            if (z11) {
                if (interfaceC27226d != null) {
                    interfaceC27226d2 = new InterfaceC27226d() { // from class: fd.a
                        @Override // p543uc.InterfaceC27226d
                        /* renamed from: a */
                        public final void mo98897a(int i14, int i15) {
                            C18880d.m98919L0(C19055h0.this, i11, interfaceC27226d, i14, i15);
                        }
                    };
                } else {
                    interfaceC27226d2 = null;
                }
                this.f94219e = m98928Q().m128419n();
                if (C22438j.m115946n(c21690e.f105269f)) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                this.f94220f = i12;
                if (i12 == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f94223i = z13;
                if (!z13 && !m98928Q().m128402S()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                this.f94224j = z14;
                boolean m111890p = c21690e.m111890p();
                this.f94232r = m111890p;
                C18390e.m97413u("[Init] validBackup=" + this.f94223i + ", validRestoreDownload=" + this.f94224j + ", enableBackupE2EE=" + m111890p, false, 2, null);
                this.f94231q = 0;
                C26263i.m135054t0(2);
                if (interfaceC27226d2 != null) {
                    interfaceC27226d2.mo98897a(this.f94220f, 10);
                }
                m98985E(interfaceC27226d2);
                if (interfaceC27226d2 != null) {
                    interfaceC27226d2.mo98897a(this.f94220f, 30);
                }
                C26263i.m135052r(2);
                m98909G0(c21690e, new InterfaceC27226d() { // from class: fd.b
                    @Override // p543uc.InterfaceC27226d
                    /* renamed from: a */
                    public final void mo98897a(int i14, int i15) {
                        C18880d.m98921M0(InterfaceC27226d.this, i14, i15);
                    }
                });
                m98967r0(c21690e);
                c21690e.m111876N(this.f94233s);
                if (interfaceC27226d2 != null) {
                    interfaceC27226d2.mo98897a(this.f94220f, 100);
                }
                this.f94229o = true;
            }
            if (z12) {
                final int m98937W = m98937W(4, 0);
                final int m98937W2 = m98937W(7, 100);
                m116580c = AbstractC22543l.m116580c(m98938X(this, 7, 0, 2, null) - m98937W, 0);
                c21690e.m111883U(((int) ((m116580c / (m98937W2 - m98937W)) * i13)) + i11);
                if (interfaceC27226d != null) {
                    interfaceC27226d3 = new InterfaceC27226d() { // from class: fd.c
                        @Override // p543uc.InterfaceC27226d
                        /* renamed from: a */
                        public final void mo98897a(int i14, int i15) {
                            C18880d.m98923N0(C19055h0.this, i11, m98937W, m98937W2, i13, interfaceC27226d, i14, i15);
                        }
                    };
                }
                try {
                    m98911H0(c21690e);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    AbstractC20887g.m109240r(18875, e11.getMessage());
                }
                m98913I0(c21690e, interfaceC27226d3);
                m98915J0(c21690e, interfaceC27226d3);
                m98925O0(c21690e, interfaceC27226d3);
                if (interfaceC27226d3 != null) {
                    interfaceC27226d3.mo98897a(this.f94220f, 100);
                }
            }
        } catch (Exception e12) {
            if (e12 instanceof BackupRestoreMediaException) {
                throw e12;
            }
            throw new BackupRestoreMediaException(0, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "Backup Media failed: " + e12);
        }
    }

    /* renamed from: L */
    private final void m98918L(C19491b c19491b, HashMap hashMap) {
        String str;
        C28255a c28255a;
        int m101929d = c19491b.m101929d();
        for (int i11 = 0; i11 < m101929d; i11++) {
            C19490a m101928c = c19491b.m101928c(i11);
            if (m101928c != null) {
                C18390e c18390e = C18390e.f92781a;
                String m97422n = c18390e.m97422n(m101928c.f96732r);
                String str2 = "";
                if (m97422n.length() <= 0) {
                    str = "";
                } else {
                    str = c18390e.m97425v(m97422n);
                }
                if (str.length() > 0 && (c28255a = (C28255a) hashMap.get(str)) != null) {
                    C19490a.b bVar = m101928c.f96735u;
                    if (bVar != null) {
                        str2 = AbstractC19646n0.m103034u0(bVar.f96753a, m101928c.f96720f);
                    }
                    AbstractC19074t.m100205c(str2);
                    if (str2.length() > 0 && !C18388c.f92779a.m97398i(str2)) {
                        ArrayList arrayList = this.f94235u;
                        C28255a m142286c = C28255a.Companion.m142286c(c28255a);
                        m142286c.m142278r(str2);
                        arrayList.add(m142286c);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public static final void m98919L0(C19055h0 c19055h0, int i11, InterfaceC27226d interfaceC27226d, int i12, int i13) {
        int m116584g;
        AbstractC19074t.m100208f(c19055h0, "$currentProgress");
        AbstractC19074t.m100208f(interfaceC27226d, "$this_run");
        int i14 = (int) ((i13 * i11) / 100.0f);
        c19055h0.f94931p = i14;
        m116584g = AbstractC22543l.m116584g(i14, 100);
        interfaceC27226d.mo98897a(i12, m116584g);
    }

    /* renamed from: M */
    private final ArrayList m98920M(long j11, int i11) {
        ArrayList arrayList = new ArrayList();
        if (j11 <= 0) {
            return arrayList;
        }
        HashMap m98974v = m98974v(this.f94217c);
        long m98908G = m98908G(j11, arrayList, m98974v);
        if (m98908G > 0 && (!m98974v.isEmpty())) {
            m98908G = m98910H(m98908G, arrayList, m98974v);
        }
        m98906F(m98974v);
        if (m98908G > 0 && (!m98974v.isEmpty())) {
            m98908G = m98916K(m98908G, arrayList, m98974v);
        }
        if (m98908G > 0 && (!m98974v.isEmpty())) {
            m98908G = m98914J(m98908G, arrayList, m98974v);
        }
        long j12 = m98908G;
        if (j12 > 0 && (!m98974v.isEmpty())) {
            j12 = m98912I(j12, arrayList, m98974v, true);
        }
        if (j12 > 0 && (!m98974v.isEmpty())) {
            m98912I(j12, arrayList, m98974v, false);
        }
        C18390e.m97413u("[DELETE] End filter list zip delete, bytesNeedDelete=" + j11 + ", sourceDelete=" + i11, false, 2, null);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M0 */
    public static final void m98921M0(InterfaceC27226d interfaceC27226d, int i11, int i12) {
        if (interfaceC27226d != null) {
            interfaceC27226d.mo98897a(i11, ((int) ((i12 * 60) / 100.0f)) + 30);
        }
    }

    /* renamed from: N */
    private final List m98922N(ArrayList arrayList, HashMap hashMap) {
        EnumC27961a enumC27961a;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            C28262h c28262h = (C28262h) obj;
            String m98953k0 = m98953k0(c28262h);
            C28260f m98924O = m98924O(hashMap, m98953k0);
            EnumC27961a enumC27961a2 = EnumC27961a.f130358q;
            if (m98924O != null) {
                enumC27961a = EnumC27961a.f130359r;
            } else {
                String str = m98953k0 + "_" + m98926P(hashMap, m98953k0) + ".zip";
                C28260f m98980y = m98980y(str);
                m98931R0(hashMap, m98980y, m98953k0, str);
                enumC27961a = enumC27961a2;
                m98924O = m98980y;
            }
            if (!m98924O.m142309k().containsKey(c28262h.mo142292f())) {
                c28262h.m142328F(m98924O.mo142291d());
                m98924O.m142309k().put(c28262h.mo142292f(), new C28257c(c28262h, enumC27961a2));
                if (!hashSet.contains(m98924O.mo142291d())) {
                    arrayList2.add(new C28261g(m98924O, enumC27961a));
                    hashSet.add(m98924O.mo142291d());
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public static final void m98923N0(C19055h0 c19055h0, int i11, int i12, int i13, int i14, InterfaceC27226d interfaceC27226d, int i15, int i16) {
        int m116580c;
        int m116584g;
        AbstractC19074t.m100208f(c19055h0, "$currentProgress");
        AbstractC19074t.m100208f(interfaceC27226d, "$this_run");
        m116580c = AbstractC22543l.m116580c(i16 - i12, 0);
        int i17 = i11 + ((int) ((m116580c / (i13 - i12)) * i14));
        c19055h0.f94931p = i17;
        m116584g = AbstractC22543l.m116584g(i17, 100);
        interfaceC27226d.mo98897a(i15, m116584g);
    }

    /* renamed from: O */
    private final C28260f m98924O(HashMap hashMap, String str) {
        LinkedList linkedList;
        if (hashMap.containsKey(str) && (linkedList = (LinkedList) hashMap.get(str)) != null && (!linkedList.isEmpty())) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C28260f c28260f = (C28260f) it.next();
                AbstractC19074t.m100205c(c28260f);
                if (m98959n0(c28260f)) {
                    return c28260f;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: O0 */
    private final void m98925O0(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        if (C22438j.m115948p(c21690e.f105269f)) {
            return;
        }
        if (interfaceC27226d != null) {
            interfaceC27226d.mo98897a(this.f94220f, m98938X(this, 7, 0, 2, null));
        }
        int m98945e0 = m98945e0();
        int m98942b0 = m98942b0();
        long m98946f0 = m98946f0();
        long m98936V = m98936V();
        long j11 = this.f94227m;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total_zip", m98945e0);
        jSONObject.put("total_photo_zip", m98942b0);
        jSONObject.put("zip_size", m98946f0);
        jSONObject.put("min_time_zip_at_all", m98936V);
        jSONObject.put("num_of_drive_file_at_last_time", this.f94226l);
        jSONObject.put("zip_size_at_last_time", this.f94225k);
        jSONObject.put("min_time_zip_at_last_time", j11);
        long m98978x = m98946f0 + m98978x(jSONObject);
        jSONObject.put("media_size", m98978x);
        C18390e.m97413u("[UpdateMediaInfo] jsonMediaInfo=" + jSONObject, false, 2, null);
        mo139334b(jSONObject, m98978x);
    }

    /* renamed from: P */
    private final int m98926P(HashMap hashMap, String str) {
        LinkedList linkedList;
        int i11 = 0;
        if (hashMap.containsKey(str) && (linkedList = (LinkedList) hashMap.get(str)) != null && (!linkedList.isEmpty())) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                int m97427x = C18390e.f92781a.m97427x(((C28260f) it.next()).mo142291d());
                if (i11 < m97427x) {
                    i11 = m97427x;
                }
            }
        }
        return i11 + 1;
    }

    /* renamed from: P0 */
    private final void m98927P0(C28260f c28260f) {
        String mo142291d = c28260f.mo142291d();
        m98971t0(mo142291d, c28260f);
        C7959d.a aVar = C7959d.Companion;
        aVar.m41850e().m41719K1(c28260f);
        aVar.m41850e().m41812o0(mo142291d);
        aVar.m41850e().m41755U2(c28260f.m142305g());
    }

    /* renamed from: Q */
    private final C24720a m98928Q() {
        return (C24720a) this.f94216b.getValue();
    }

    /* renamed from: Q0 */
    private final void m98929Q0(ArrayList arrayList, HashMap hashMap) {
        try {
            C7959d.a aVar = C7959d.Companion;
            aVar.m41850e().m41755U2(arrayList);
            aVar.m41850e().m41729N1(hashMap);
            mo139338i();
            AbstractC23306f.m120688m().m132987F(false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: R */
    private final C19491b m98930R(String str, C19498i c19498i) {
        ZdbApiCode zdbApiCode = new ZdbApiCode();
        C7956b m41573b = C7956b.Companion.m41573b();
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        C19491b m41519N = m41573b.m41519N(str2, str, c19498i, zdbApiCode);
        AbstractC23008a2.m117942k(zdbApiCode, "getListChatContentFromMessageIds", "ownerId=" + str, "msgIdentifyVec.size=" + c19498i.m101944c());
        return m41519N;
    }

    /* renamed from: R0 */
    private final void m98931R0(HashMap hashMap, C28260f c28260f, String str, String str2) {
        LinkedList linkedList = (LinkedList) hashMap.get(str);
        if (linkedList == null) {
            linkedList = null;
        }
        LinkedList linkedList2 = linkedList;
        if (linkedList != null) {
            if ((linkedList2 == null || !linkedList2.contains(c28260f)) && linkedList2 != null) {
                linkedList2.add(c28260f);
            }
        } else {
            LinkedList linkedList3 = new LinkedList();
            linkedList3.add(c28260f);
            hashMap.put(str, linkedList3);
        }
        this.f94217c.put(str2, c28260f);
    }

    /* renamed from: S */
    private final b m98932S() {
        if (this.f94222h == null) {
            this.f94222h = new b();
        }
        b bVar = this.f94222h;
        AbstractC19074t.m100206d(bVar, "null cannot be cast to non-null type com.zing.zalo.backuprestore.media.zip.ZipWrapperDriveSyncHandler.MapEntryValueDecreaseComparator");
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01f5 A[Catch: all -> 0x01b2, TryCatch #7 {all -> 0x01b2, blocks: (B:36:0x01ae, B:37:0x01b4, B:39:0x01b8, B:42:0x01bf, B:43:0x01c9, B:44:0x01ca, B:46:0x01ce, B:47:0x01ec, B:48:0x01ed, B:49:0x01f2, B:29:0x01f5, B:30:0x01f8), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ae A[Catch: all -> 0x01b2, TRY_ENTER, TryCatch #7 {all -> 0x01b2, blocks: (B:36:0x01ae, B:37:0x01b4, B:39:0x01b8, B:42:0x01bf, B:43:0x01c9, B:44:0x01ca, B:46:0x01ce, B:47:0x01ec, B:48:0x01ed, B:49:0x01f2, B:29:0x01f5, B:30:0x01f8), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8 A[Catch: all -> 0x01b2, TryCatch #7 {all -> 0x01b2, blocks: (B:36:0x01ae, B:37:0x01b4, B:39:0x01b8, B:42:0x01bf, B:43:0x01c9, B:44:0x01ca, B:46:0x01ce, B:47:0x01ec, B:48:0x01ed, B:49:0x01f2, B:29:0x01f5, B:30:0x01f8), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ce A[Catch: all -> 0x01b2, TryCatch #7 {all -> 0x01b2, blocks: (B:36:0x01ae, B:37:0x01b4, B:39:0x01b8, B:42:0x01bf, B:43:0x01c9, B:44:0x01ca, B:46:0x01ce, B:47:0x01ec, B:48:0x01ed, B:49:0x01f2, B:29:0x01f5, B:30:0x01f8), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ed A[Catch: all -> 0x01b2, TryCatch #7 {all -> 0x01b2, blocks: (B:36:0x01ae, B:37:0x01b4, B:39:0x01b8, B:42:0x01bf, B:43:0x01c9, B:44:0x01ca, B:46:0x01ce, B:47:0x01ec, B:48:0x01ed, B:49:0x01f2, B:29:0x01f5, B:30:0x01f8), top: B:2:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
    /* JADX WARN: Type inference failed for: r1v3, types: [gd.d, gc.g] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [uc.d] */
    /* renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m98933S0(ArrayList arrayList, C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        C21690e c21690e2;
        C19059j0 c19059j0;
        C21690e c21690e3;
        ?? r22;
        C19059j0 c19059j02;
        Object obj;
        boolean z11;
        boolean z12;
        C19059j0 c19059j03;
        List m131496e;
        long j11;
        C21690e c21690e4 = c21690e;
        C19053g0 c19053g0 = new C19053g0();
        C19053g0 c19053g02 = new C19053g0();
        C19059j0 c19059j04 = new C19059j0();
        C21226e m120624U1 = AbstractC23306f.m120624U1();
        m120624U1.m101515f(mo139336e());
        m120624U1.m101514e(true);
        AbstractC19074t.m100207e(m120624U1, "apply(...)");
        ?? r42 = interfaceC27226d;
        h hVar = new h(c19053g0, c19053g02, r42, this, c19059j04);
        ?? c19395d = new C19395d();
        String m97392c = C18388c.f92779a.m97392c();
        boolean m97415b = C18390e.f92781a.m97415b();
        int i11 = 4;
        try {
            try {
                h hVar2 = hVar;
                C19392a c19392a = new C19392a(m120624U1, this.f94219e, null, 4, null);
                Iterator it = arrayList.iterator();
                C21222a c21222a = null;
                long j12 = -1;
                while (it.hasNext()) {
                    try {
                        Object next = it.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        C28261g c28261g = (C28261g) next;
                        C18390e c18390e = C18390e.f92781a;
                        c18390e.m97414a(i11);
                        C19392a c19392a2 = c19392a;
                        long m98944d0 = m98944d0(c28261g);
                        c19059j03 = c19059j04;
                        try {
                            c19053g0.f94930p = (((float) m98944d0) * 100.0f) / ((float) this.f94233s);
                            if (!m97415b) {
                                m131496e = AbstractC25366r.m131496e(c28261g);
                                c19395d.m101508a(new C19395d.a(m97392c, m131496e));
                                String mo142291d = c28261g.mo142291d();
                                long mo142289b = c28261g.mo142289b();
                                int m97420h = c18390e.m97420h(c28261g.m142319h());
                                int m97419g = c18390e.m97419g(c28261g.m142319h());
                                StringBuilder sb2 = new StringBuilder();
                                C19053g0 c19053g03 = c19053g0;
                                sb2.append("[Upload] Start upload: zipName=");
                                sb2.append(mo142291d);
                                sb2.append(", size=");
                                sb2.append(mo142289b);
                                sb2.append(", count upload=");
                                sb2.append(m97420h);
                                sb2.append(", count delete=");
                                sb2.append(m97419g);
                                try {
                                    C18390e.m97413u(sb2.toString(), false, 2, null);
                                    h hVar3 = hVar2;
                                    c19392a2.m101509a(new C21226e.d(c28261g, hVar3));
                                    c21690e4 = c21690e;
                                    c19392a = c19392a2;
                                    hVar2 = hVar3;
                                    c19059j04 = c19059j03;
                                    c19053g0 = c19053g03;
                                } catch (BackupRestoreMediaException e11) {
                                    e = e11;
                                    if (!m97415b) {
                                        m98902C(arrayList);
                                    }
                                    throw e;
                                } catch (Exception e12) {
                                    e = e12;
                                    if (!m97415b) {
                                        m98902C(arrayList);
                                    }
                                    if ((e instanceof IOException) && !AbstractC23238v2.m119726k()) {
                                        throw new BackupRestoreMediaException(4, 2008, "[Upload] Full device storage!");
                                    }
                                    if (e instanceof ZipException) {
                                        AbstractC20110a.f98889a.mo104552e(e);
                                        throw new BackupRestoreMediaException(4, 2012, "[Upload] " + e);
                                    }
                                    AbstractC20110a.f98889a.mo104552e(e);
                                    throw e;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c21690e3 = c21690e;
                                    c19059j02 = c19059j03;
                                    r22 = 1;
                                    obj = c19059j02.f94941p;
                                    if (obj != null) {
                                        AbstractC19074t.m100205c(obj);
                                        if (((((Collection) obj).isEmpty() ? 1 : 0) ^ r22) != 0) {
                                            if (c21690e3.f105269f == r22) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            C26222d c26222d = C26222d.f124594a;
                                            Object obj2 = c19059j02.f94941p;
                                            AbstractC19074t.m100205c(obj2);
                                            c26222d.m134856e((ArrayList) obj2, z11);
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                if (c21222a == null) {
                                    try {
                                        c21222a = C27230h.f127996a.m139347a();
                                    } catch (BackupRestoreMediaException e13) {
                                        e = e13;
                                        if (!m97415b) {
                                        }
                                        throw e;
                                    } catch (Exception e14) {
                                        e = e14;
                                        if (!m97415b) {
                                        }
                                        if (e instanceof IOException) {
                                            throw new BackupRestoreMediaException(4, 2008, "[Upload] Full device storage!");
                                        }
                                        if (e instanceof ZipException) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c21690e2 = c21690e;
                                        c19059j0 = c19059j03;
                                        r22 = 1;
                                        c19059j02 = c19059j0;
                                        c21690e3 = c21690e2;
                                        obj = c19059j02.f94941p;
                                        if (obj != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (j12 == -1) {
                                    j11 = m98928Q().m128426v().m128443b() * 1048576;
                                } else {
                                    j11 = j12;
                                }
                                c21222a.m109973g(mo139336e(), c28261g, hVar2, j11, m98944d0, m97392c);
                                c21690e4 = c21690e;
                                j12 = j11;
                                c19059j04 = c19059j03;
                                c19392a = c19392a2;
                            }
                            i11 = 4;
                        } catch (BackupRestoreMediaException e15) {
                            e = e15;
                            if (!m97415b) {
                            }
                            throw e;
                        } catch (Exception e16) {
                            e = e16;
                            if (!m97415b) {
                            }
                            if (e instanceof IOException) {
                            }
                            if (e instanceof ZipException) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            c21690e3 = c21690e;
                            c19059j02 = c19059j03;
                            r22 = 1;
                            obj = c19059j02.f94941p;
                            if (obj != null) {
                            }
                            throw th;
                        }
                    } catch (BackupRestoreMediaException e17) {
                        e = e17;
                        c19059j03 = c19059j04;
                    } catch (Exception e18) {
                        e = e18;
                        c19059j03 = c19059j04;
                    } catch (Throwable th5) {
                        th = th5;
                        c19059j03 = c19059j04;
                    }
                }
                C19059j0 c19059j05 = c19059j04;
                Object obj3 = c19059j05.f94941p;
                if (obj3 != null) {
                    AbstractC19074t.m100205c(obj3);
                    if (!((Collection) obj3).isEmpty()) {
                        if (c21690e.f105269f == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        C26222d c26222d2 = C26222d.f124594a;
                        Object obj4 = c19059j05.f94941p;
                        AbstractC19074t.m100205c(obj4);
                        c26222d2.m134856e((ArrayList) obj4, z12);
                    }
                }
            } catch (BackupRestoreMediaException e19) {
                e = e19;
            } catch (Exception e21) {
                e = e21;
            } catch (Throwable th6) {
                th = th6;
                c21690e2 = c21690e4;
                c19059j0 = c19059j04;
            }
        } catch (Throwable th7) {
            th = th7;
            c19059j02 = c19395d;
            r22 = m97392c;
            c21690e3 = r42;
        }
    }

    /* renamed from: T */
    private final HashMap m98934T() {
        HashMap hashMap = new HashMap();
        for (C28260f c28260f : this.f94217c.values()) {
            String m142310l = c28260f.m142310l();
            if (m142310l.length() != 0) {
                LinkedList linkedList = (LinkedList) hashMap.get(m142310l);
                if (linkedList == null) {
                    linkedList = new LinkedList();
                    hashMap.put(m142310l, linkedList);
                }
                linkedList.add(c28260f);
            }
        }
        return hashMap;
    }

    /* renamed from: U */
    private final long m98935U() {
        long j11;
        if (this.f94228n == Long.MAX_VALUE) {
            int m128413h = m98928Q().m128413h();
            if (m128413h > 0) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(6, -m128413h);
                j11 = calendar.getTimeInMillis();
            } else {
                j11 = 0;
            }
            this.f94228n = j11;
        }
        return this.f94228n;
    }

    /* renamed from: V */
    private final long m98936V() {
        long j11 = 0;
        for (C28260f c28260f : this.f94217c.values()) {
            if (j11 != 0) {
                long m142312n = c28260f.m142312n();
                if (1 <= m142312n && m142312n < j11) {
                }
            }
            j11 = c28260f.m142312n();
        }
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public final int m98937W(int i11, int i12) {
        int i13;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        if (i11 != 7) {
                            return 100;
                        }
                        return ((i12 * 5) / 100) + 95;
                    }
                    i13 = (i12 * 9) / 10;
                } else {
                    i13 = (i12 * 85) / 100;
                }
                return i13 + 10;
            }
            return ((i12 * 5) / 100) + 5;
        }
        return (i12 * 5) / 100;
    }

    /* renamed from: X */
    static /* synthetic */ int m98938X(C18880d c18880d, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        return c18880d.m98937W(i11, i12);
    }

    /* renamed from: Y */
    private final long m98939Y(boolean z11) {
        long m133000s = AbstractC23306f.m120688m().m133000s();
        if (m133000s != -1 && !z11 && C23793c.Companion.m124321a().mo124314i() - AbstractC0924m0.m4392z2() < m98928Q().m128426v().m128449h() * 1000) {
            C18390e.m97413u("remainingStorage=" + m133000s + ", from CACHE", false, 2, null);
            return m133000s;
        }
        C20513c.c cVar = (C20513c.c) new C20513c().m101509a(new C20513c.b(mo139336e()));
        AbstractC0924m0.m4351xj(C23793c.Companion.m124321a().mo124314i());
        if (cVar != null) {
            if (m133000s != cVar.m106574a()) {
                AbstractC23306f.m120688m().m132988G(cVar.m106574a());
            }
            C18390e.m97413u("remainingStorage=" + cVar.m106574a() + ", from SERVER", false, 2, null);
            return cVar.m106574a();
        }
        C18390e.m97413u("remainingStorage=" + m133000s + ", from CACHE!!!", false, 2, null);
        return m133000s;
    }

    /* renamed from: Z */
    private final long m98940Z(ArrayList arrayList) {
        long j11 = 0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j11 += ((C28255a) it.next()).m142267g();
            }
        }
        return j11;
    }

    /* renamed from: a0 */
    private final long m98941a0(List list) {
        long j11 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j11 += ((InterfaceC28256b) it.next()).mo142289b();
            }
        }
        return j11;
    }

    /* renamed from: b0 */
    private final int m98942b0() {
        Iterator it = this.f94217c.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Iterator it2 = ((C28260f) it.next()).m142309k().values().iterator();
            while (it2.hasNext()) {
                if (C18390e.f92781a.m97424r((InterfaceC28256b) it2.next())) {
                    i11++;
                }
            }
        }
        return i11;
    }

    /* renamed from: c0 */
    private final long m98943c0(List list) {
        Iterator it = list.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += m98944d0((C28261g) it.next());
        }
        return j11;
    }

    /* renamed from: d0 */
    private final long m98944d0(C28261g c28261g) {
        long j11 = 0;
        for (InterfaceC28256b interfaceC28256b : c28261g.m142319h().m142309k().values()) {
            if (C18390e.f92781a.m97424r(interfaceC28256b)) {
                if (interfaceC28256b.mo142289b() == 0) {
                    interfaceC28256b.mo142290c(C18388c.f92779a.m97393d(interfaceC28256b.mo142288a()));
                }
                j11 += interfaceC28256b.mo142289b();
            }
        }
        return j11;
    }

    /* renamed from: e0 */
    private final int m98945e0() {
        return this.f94217c.size();
    }

    /* renamed from: f0 */
    private final long m98946f0() {
        Iterator it = this.f94217c.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += ((C28260f) it.next()).mo142289b();
        }
        return j11;
    }

    /* renamed from: g0 */
    private final d m98947g0() {
        if (this.f94221g == null) {
            this.f94221g = new d();
        }
        d dVar = this.f94221g;
        AbstractC19074t.m100206d(dVar, "null cannot be cast to non-null type com.zing.zalo.backuprestore.media.zip.ZipWrapperDriveSyncHandler.ZipFileMDComparator");
        return dVar;
    }

    /* renamed from: h0 */
    private final C28260f m98948h0(String str) {
        return (C28260f) this.f94217c.get(str);
    }

    /* renamed from: i0 */
    private final String m98949i0(String str, String str2, int i11, String str3, int i12) {
        String str4 = str + "_" + str2 + "_" + i11 + "_" + str3;
        if (i12 > 0) {
            return str4 + "_" + i12 + ".zip";
        }
        return str4;
    }

    /* renamed from: j0 */
    static /* synthetic */ String m98951j0(C18880d c18880d, String str, String str2, int i11, String str3, int i12, int i13, Object obj) {
        int i14;
        if ((i13 & 16) != 0) {
            i14 = 0;
        } else {
            i14 = i12;
        }
        return c18880d.m98949i0(str, str2, i11, str3, i14);
    }

    /* renamed from: k0 */
    private final String m98953k0(C28262h c28262h) {
        String str;
        int i11;
        String m142325C = c28262h.m142325C();
        if (AbstractC25495a.m132079d(m142325C)) {
            str = AbstractC25495a.m132088m(m142325C);
            i11 = 2;
        } else {
            str = m142325C;
            i11 = 1;
        }
        String str2 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str2, "currentUserUid");
        return m98951j0(this, str2, str, i11, C18390e.f92781a.m97417d(c28262h.m142274n()), 0, 16, null);
    }

    /* renamed from: l0 */
    private final boolean m98955l0() {
        if (this.f94217c.isEmpty() && this.f94218d.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    private final boolean m98957m0() {
        boolean z11;
        if (m98955l0() || AbstractC23306f.m120688m().m133005x()) {
            return true;
        }
        C20512b c20512b = new C20512b();
        c20512b.m101515f(mo139336e());
        Object m101509a = new C19392a(c20512b, this.f94219e, null, 4, null).m101509a(new C20512b.b(true));
        AbstractC19074t.m100205c(m101509a);
        C20512b.c cVar = (C20512b.c) m101509a;
        if (cVar.m106571e() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            m98979x0(cVar.m106569c());
        }
        return !z11;
    }

    /* renamed from: n0 */
    private final boolean m98959n0(C28260f c28260f) {
        if (c28260f.m142309k().size() < m98928Q().m128426v().m128457p()) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    private final boolean m98961o0() {
        C21689d m111895u;
        C21690e m133053o = AbstractC23306f.m120692n().m133053o();
        if (m133053o == null || !m133053o.m111867E() || (m111895u = m133053o.m111895u()) == null || m111895u.m143140a() != 40305) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    private final boolean m98963p0() {
        if (C23793c.Companion.m124321a().mo124314i() - AbstractC0924m0.m3242M2() >= m98928Q().m128426v().m128448g() * 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    private final void m98965q0() {
        C18390e.m97413u("[Metadata] " + ("Photo single: " + this.f94218d.size() + "; Total zip: cnt=" + this.f94217c.size() + ", size=" + m98946f0() + ", cnt photo in zip=" + m98942b0()), false, 2, null);
    }

    /* renamed from: r0 */
    private final void m98967r0(C21690e c21690e) {
        if (!this.f94223i) {
            C18390e.m97413u("[UPLOAD] Restore only", false, 2, null);
        } else if (this.f94230p.isEmpty()) {
            C18390e.m97413u("[UPLOAD] Empty data", false, 2, null);
        } else {
            c21690e.m111878P(true);
            this.f94233s = m98943c0(this.f94230p);
            return;
        }
        c21690e.m111878P(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:            m98904D0(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0004, code lost:            continue;     */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m98969s0(List list, HashSet hashSet) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28261g c28261g = (C28261g) it.next();
            if (c28261g.m142293e() == EnumC27961a.f130359r) {
                C28260f m142319h = c28261g.m142319h();
                for (InterfaceC28256b interfaceC28256b : m142319h.m142309k().values()) {
                    if ((interfaceC28256b instanceof C28262h) && !hashSet.contains(interfaceC28256b.mo142292f())) {
                        m142319h.m142309k().put(interfaceC28256b.mo142292f(), new C28257c(interfaceC28256b, EnumC27961a.f130361t));
                    }
                }
                Iterator it2 = m142319h.m142309k().values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC28256b interfaceC28256b2 = (InterfaceC28256b) it2.next();
                        if ((interfaceC28256b2 instanceof C28262h) && !C18388c.f92779a.m97398i(((C28262h) interfaceC28256b2).m142269i())) {
                            try {
                                break;
                            } catch (DriveDownloadException e11) {
                                throw new BackupRestoreMediaException(4, e11.f40043p, "[Upload] " + e11);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: t0 */
    private final void m98971t0(String str, C28260f c28260f) {
        this.f94217c.put(str, c28260f);
    }

    /* renamed from: u */
    private final HashMap m98972u(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            C28260f c28260f = (C28260f) entry.getValue();
            String m97423o = C18390e.f92781a.m97423o(str);
            if (!hashMap2.containsKey(m97423o)) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(c28260f);
                hashMap2.put(m97423o, linkedList);
            } else {
                LinkedList linkedList2 = (LinkedList) hashMap2.get(m97423o);
                if (linkedList2 != null && !linkedList2.contains(c28260f)) {
                    linkedList2.add(c28260f);
                }
            }
        }
        return hashMap2;
    }

    /* renamed from: u0 */
    private final boolean m98973u0(String str, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, long j11, int i11, int i12) {
        long j12;
        HashSet hashSet;
        Object obj;
        ArrayList arrayList;
        int i13;
        boolean z11;
        boolean z12;
        long currentTimeMillis = System.currentTimeMillis();
        long m98935U = m98935U();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        long j13 = Long.MAX_VALUE;
        while (true) {
            if (j13 > Long.MIN_VALUE) {
                C27225c.m139327b(3);
                j12 = currentTimeMillis;
                hashSet = hashSet2;
                obj = null;
                arrayList = arrayList2;
                j13 = C26627a.f126082a.m136729d(str, arrayList2, hashSet2, hashMap2, hashMap3, j11, m98935U, j13, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
                int size = this.f94231q + arrayList.size();
                if (size >= i11) {
                    i13 = 2;
                    z11 = false;
                    C18390e.m97413u("queryAndAnalyzeDataBackupByPage DONE, curMediaQualifiedBackup=" + size, false, 2, null);
                    z12 = false;
                    break;
                }
                arrayList2 = arrayList;
                hashSet2 = hashSet;
                currentTimeMillis = j12;
            } else {
                j12 = currentTimeMillis;
                hashSet = hashSet2;
                obj = null;
                arrayList = arrayList2;
                i13 = 2;
                z11 = false;
                z12 = true;
                break;
            }
        }
        this.f94236v += System.currentTimeMillis() - j12;
        long currentTimeMillis2 = System.currentTimeMillis();
        if (!arrayList.isEmpty()) {
            this.f94231q += arrayList.size();
            List m98922N = m98922N(arrayList, hashMap);
            C18390e.m97413u("listZipFileMDUploadConversation=" + m98922N.size(), z11, i13, obj);
            this.f94236v = this.f94236v + (System.currentTimeMillis() - currentTimeMillis2);
            m98969s0(m98922N, hashSet);
            long currentTimeMillis3 = System.currentTimeMillis();
            if (m98922N.size() > 1) {
                Collections.sort(m98922N, new c());
            }
            Iterator it = m98922N.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                this.f94230p.add((C28261g) it.next());
                if (this.f94230p.size() >= i12) {
                    z12 = false;
                    break;
                }
            }
            this.f94236v += System.currentTimeMillis() - currentTimeMillis3;
        }
        return z12;
    }

    /* renamed from: v */
    private final HashMap m98974v(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            C28260f c28260f = (C28260f) ((Map.Entry) it.next()).getValue();
            String m142310l = c28260f.m142310l();
            LinkedList linkedList = (LinkedList) hashMap2.get(m142310l);
            if (linkedList == null) {
                linkedList = new LinkedList();
                hashMap2.put(m142310l, linkedList);
            }
            linkedList.add(c28260f);
        }
        Iterator it2 = hashMap2.values().iterator();
        while (it2.hasNext()) {
            Collections.sort((LinkedList) it2.next(), m98947g0());
        }
        return hashMap2;
    }

    /* renamed from: v0 */
    private final long m98975v0(String str, long j11, long j12, long j13, HashMap hashMap) {
        C27225c.m139327b(3);
        long j14 = Long.MIN_VALUE;
        try {
            C19491b m41521O = C7956b.Companion.m41573b().m41521O(str, j11, j13, 200, j12);
            if (m41521O != null && m41521O.m101929d() > 0) {
                if (m41521O.m101929d() >= 200) {
                    j14 = m41521O.m101928c(m41521O.m101929d() - 1).f96738x;
                }
                m98918L(m41521O, hashMap);
            }
            return j14;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(new BackupRestoreMediaException(3, 2013, "[Analyze] " + e11));
            return Long.MIN_VALUE;
        }
    }

    /* renamed from: w */
    private final void m98976w() {
        try {
            C26220b.m134826i("SyncMediaZip", "Clear cache data of sync photo, zip file from google drive", null, 4, null);
            C7959d.a aVar = C7959d.Companion;
            aVar.m41850e().m41696E();
            aVar.m41850e().m41698F();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: w0 */
    private final void m98977w0(String str, C19498i c19498i, HashSet hashSet, HashMap hashMap) {
        String str2;
        String str3;
        C27225c.m139327b(3);
        C19491b m98930R = m98930R(str, c19498i);
        if (m98930R.m101929d() > 0) {
            int m101929d = m98930R.m101929d();
            for (int i11 = 0; i11 < m101929d; i11++) {
                C19490a m101928c = m98930R.m101928c(i11);
                if (m101928c != null && (str2 = (String) hashMap.get(C18390e.m97405i(String.valueOf(m101928c.f96740z), str, String.valueOf(m101928c.f96718d), String.valueOf(m101928c.f96723i)))) != null && str2.length() != 0 && !hashSet.contains(str2)) {
                    C19490a.b bVar = m101928c.f96735u;
                    if (bVar != null) {
                        str3 = AbstractC19646n0.m103034u0(bVar.f96753a, m101928c.f96720f);
                    } else {
                        str3 = "";
                    }
                    C18388c c18388c = C18388c.f92779a;
                    AbstractC19074t.m100205c(str3);
                    if (!c18388c.m97398i(str3)) {
                        hashSet.add(str2);
                    }
                }
            }
        }
    }

    /* renamed from: x */
    private final long m98978x(JSONObject jSONObject) {
        Iterator it = this.f94218d.iterator();
        int i11 = 0;
        long j11 = 0;
        long j12 = 0;
        while (it.hasNext()) {
            C28255a c28255a = (C28255a) it.next();
            if (c28255a.m142266e().length() > 0) {
                i11++;
                j11 += c28255a.m142267g();
                if (j12 != 0) {
                    long m142274n = c28255a.m142274n();
                    if (1 <= m142274n && m142274n < j12) {
                    }
                }
                j12 = c28255a.m142274n();
            }
        }
        jSONObject.put("total_photo", i11);
        jSONObject.put("photo_size", j11);
        jSONObject.put("min_time_msg_photo_at_all", j12);
        return j11;
    }

    /* renamed from: x0 */
    private final void m98979x0(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            C28260f c28260f = (C28260f) entry.getValue();
            C28260f m98948h0 = m98948h0(str);
            if (m98948h0 == null) {
                m98927P0(c28260f);
            } else if (!m98948h0.m142313p(c28260f)) {
                m98927P0(c28260f);
            }
        }
    }

    /* renamed from: y */
    private final C28260f m98980y(String str) {
        return new C28260f(str, null, 0L, C23793c.Companion.m124321a().mo124314i(), null, 22, null);
    }

    /* renamed from: y0 */
    private final void m98981y0(String str) {
        this.f94217c.remove(str);
    }

    /* renamed from: z */
    private final void m98982z(ArrayList arrayList, C21690e c21690e) {
        if (arrayList.isEmpty()) {
            C18390e.m97413u("[DELETE] listZipFileMDDelete is empty", false, 2, null);
            return;
        }
        C18390e.m97413u("[DELETE] Size listZipFileMDDelete=" + arrayList.size(), false, 2, null);
        m98898A(arrayList, c21690e);
        AbstractC20887g.m109217D(18875, null, 2, null);
        AbstractC0924m0.m3201Kj(C23793c.Companion.m124321a().mo124314i());
    }

    /* renamed from: z0 */
    private final void m98983z0(InterfaceC27226d interfaceC27226d, long j11) {
        C18390e.m97413u("Start analyzeDataBackupMedia", false, 2, null);
        C19669z.b bVar = C19669z.Companion;
        bVar.m103232a().m103229t0();
        List<Conversation> m103212Y0 = bVar.m103232a().m103212Y0();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = this.f94218d.iterator();
        long j12 = 0;
        while (it.hasNext()) {
            C28255a c28255a = (C28255a) it.next();
            String mo142271k = c28255a.mo142271k();
            AbstractC19074t.m100205c(c28255a);
            hashMap.put(mo142271k, c28255a);
            if (c28255a.m142274n() > j12) {
                j12 = c28255a.m142274n();
            }
        }
        Iterator it2 = this.f94217c.values().iterator();
        while (it2.hasNext()) {
            for (InterfaceC28256b interfaceC28256b : ((C28260f) it2.next()).m142309k().values()) {
                if (interfaceC28256b instanceof C28262h) {
                    hashMap2.put(interfaceC28256b.mo142292f(), interfaceC28256b);
                }
            }
        }
        HashMap m98972u = m98972u(this.f94217c);
        boolean m97409p = C18390e.m97409p();
        int m128446e = m98928Q().m128426v().m128446e();
        int m128447f = m98928Q().m128426v().m128447f();
        int m128457p = m98928Q().m128426v().m128457p();
        this.f94231q = 0;
        int i11 = m128447f * m128457p;
        C18390e.m97413u("listAllConversation=" + m103212Y0.size() + ", maxCountMediaQualifiedBackup=" + i11 + ", limitMemberGroup=" + m128446e + ", enableBackupMediaGroup=" + m97409p + ", sizeMDZip=" + hashMap2.size() + ", sizeMDSingle=" + hashMap.size() + ", newestTsOnListFileMDSingle=" + j12 + ",pageSize=500, minTsMediaQuery=" + m98935U(), false, 2, null);
        if (interfaceC27226d != null) {
            interfaceC27226d.mo98897a(this.f94220f, 20);
        }
        this.f94236v += System.currentTimeMillis() - j11;
        boolean z11 = true;
        for (Conversation conversation : m103212Y0) {
            C27225c.m139327b(3);
            if (!z11) {
                break;
            }
            if (!AbstractC25495a.m132079d(conversation.f42893q) && C26627a.f126082a.m136727b(conversation.f42893q, m97409p, m128446e, this.f94232r)) {
                int i12 = i11;
                z11 = m98973u0(conversation.f42893q, m98972u, hashMap, hashMap2, j12, i12, m128447f);
                m97409p = m97409p;
                m128446e = m128446e;
                i11 = i12;
            }
        }
        int i13 = i11;
        int i14 = m128446e;
        long j13 = j12;
        boolean z12 = m97409p;
        if (interfaceC27226d != null) {
            interfaceC27226d.mo98897a(this.f94220f, 60);
        }
        for (Conversation conversation2 : m103212Y0) {
            C27225c.m139327b(3);
            if (!z11) {
                break;
            }
            if (AbstractC25495a.m132079d(conversation2.f42893q) && C26627a.f126082a.m136727b(conversation2.f42893q, z12, i14, this.f94232r)) {
                z11 = m98973u0(conversation2.f42893q, m98972u, hashMap, hashMap2, j13, i13, m128447f);
                i14 = i14;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f94230p.isEmpty()) {
            Collections.sort(this.f94230p, new c());
        }
        this.f94236v += System.currentTimeMillis() - currentTimeMillis;
        if (interfaceC27226d != null) {
            interfaceC27226d.mo98897a(this.f94220f, 100);
        }
        C18390e.m97413u("analyzeDataBackupMedia-listZipFileMDUpload=" + this.f94230p.size() + "-countMediaQualifiedUpload=" + this.f94231q, false, 2, null);
    }

    /* renamed from: D */
    public final C20512b.c m98984D(String str) {
        C20512b.c cVar;
        AbstractC19074t.m100208f(str, "token");
        synchronized (f94215w) {
            try {
                m98976w();
                C20512b c20512b = new C20512b();
                c20512b.m101515f(str);
                Object m101509a = new C19392a(c20512b, this.f94219e, null, 4, null).m101509a(new C20512b.b(false, 1, null));
                AbstractC19074t.m100205c(m101509a);
                cVar = (C20512b.c) m101509a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(cVar.m106567a());
                Iterator it = cVar.m106569c().entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((C28260f) ((Map.Entry) it.next()).getValue()).m142305g());
                }
                m98929Q0(arrayList, cVar.m106569c());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    /* renamed from: E */
    public final void m98985E(InterfaceC27226d interfaceC27226d) {
        Object m101506a = new C20511a().m101506a();
        AbstractC19074t.m100205c(m101506a);
        C20511a.a aVar = (C20511a.a) m101506a;
        this.f94218d.clear();
        this.f94218d.addAll(aVar.m106561b());
        this.f94217c.clear();
        C20514d.b bVar = (C20514d.b) new C20514d().m101509a(new C20514d.a(aVar.m106560a()));
        if (bVar != null) {
            this.f94217c.putAll(bVar.m106577a());
        }
        if (interfaceC27226d != null) {
            interfaceC27226d.mo98897a(this.f94220f, 20);
        }
        C27225c.m139327b(2);
        boolean m98957m0 = m98957m0();
        C18390e.m97413u("isNeedInvalidateCache=" + m98957m0, false, 2, null);
        if (m98957m0) {
            C26220b.m134826i("SMLZipWrapperDriveSyncHandler", "fetchDataDriveFileMetadata", null, 4, null);
            C20512b.c m98984D = m98984D(mo139336e());
            this.f94218d.clear();
            this.f94218d.addAll(m98984D.m106567a());
            this.f94217c.clear();
            this.f94217c.putAll(m98984D.m106569c());
        }
        m98965q0();
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: a */
    public List mo98986a() {
        ArrayList arrayList = new ArrayList();
        C20512b c20512b = new C20512b();
        c20512b.m101515f(mo139336e());
        Object m101509a = new C19392a(c20512b, m98928Q().m128419n(), null, 4, null).m101509a(new C20512b.b(false, 1, null));
        AbstractC19074t.m100205c(m101509a);
        C20512b.c cVar = (C20512b.c) m101509a;
        Iterator it = cVar.m106569c().entrySet().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            AbstractC19074t.m100207e(value, "<get-value>(...)");
            C28260f c28260f = (C28260f) value;
            if (c28260f.m142306h().length() > 0) {
                arrayList.add(c28260f.m142306h());
            } else {
                C18390e.m97412t("SMLZipWrapperDriveSyncHandler-getListDriveIdMetadata-mapFileZip: driveId is EMPTY", true);
            }
        }
        Iterator it2 = cVar.m106567a().iterator();
        while (it2.hasNext()) {
            C28255a c28255a = (C28255a) it2.next();
            if (c28255a.m142266e().length() > 0) {
                arrayList.add(c28255a.m142266e());
            } else {
                C18390e.m97412t("SMLZipWrapperDriveSyncHandler-getListDriveIdMetadata-listFilePhotoSingle-: driveId is EMPTY", true);
            }
        }
        ArrayList m106568b = cVar.m106568b();
        if (m106568b != null) {
            Iterator it3 = m106568b.iterator();
            while (it3.hasNext()) {
                C28260f c28260f2 = (C28260f) it3.next();
                if (c28260f2.m142306h().length() > 0) {
                    arrayList.add(c28260f2.m142306h());
                }
            }
        }
        return arrayList;
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: d */
    public void mo98987d(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        m98917K0(c21690e, !this.f94229o, true, interfaceC27226d);
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: f */
    public void mo98988f() {
        try {
            C26220b.m134826i("SMLZipWrapperDriveSyncHandler", "checkAuthenGoogleDrive", null, 4, null);
            C20512b c20512b = new C20512b();
            c20512b.m101515f(mo139336e());
            AbstractC19074t.m100205c(new C19392a(c20512b, m98928Q().m128419n(), null, 4, null).m101509a(new C20512b.b(true)));
        } catch (BackupRestoreMediaException e11) {
            if (e11.m37267a() == 2003) {
                AbstractC23306f.m120688m().m132989H(System.currentTimeMillis());
            }
        }
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: g */
    public void mo98989g(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        m98917K0(c21690e, true, false, interfaceC27226d);
    }
}
