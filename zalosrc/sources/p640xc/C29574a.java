package p640xc;

import ad.C0738b;
import am.AbstractC0924m0;
import android.text.TextUtils;
import bd.C2768a;
import bd.C2769b;
import cd.C3421a;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import cu.AbstractC17574a;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19051f0;
import fn0.C19055h0;
import fn0.C19057i0;
import fn0.C19059j0;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import ln0.AbstractC22543l;
import me0.AbstractC23193r0;
import me0.C23055e5;
import org.json.JSONObject;
import p056cj.C3535c;
import p128ed.C18388c;
import p248iy.AbstractC20887g;
import p297kd.C21690e;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p443qc.C25217a;
import p543uc.C27228f;
import p543uc.InterfaceC27226d;
import p543uc.InterfaceC27227e;
import p677yc.AbstractC30897a;
import p711zc.C31782a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sc.C26220b;
import sc.C26222d;
import si.C26263i;
import vi.C28255a;

/* renamed from: xc.a */
/* loaded from: classes3.dex */
public final class C29574a implements InterfaceC27227e {
    public static final b Companion = new b(null);

    /* renamed from: b */
    private static int[] f136495b = C25217a.f120971a.m130480a();

    /* renamed from: c */
    private static final InterfaceC24854k f136496c;

    /* renamed from: a */
    private String f136497a = "";

    /* renamed from: xc.a$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f136498q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C29574a mo12V4() {
            return c.f136499a.m146973a();
        }
    }

    /* renamed from: xc.a$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final JSONObject m146971b(int i11, int i12) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("uploadedCount", i11);
                jSONObject.put("totalCount", i12);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
            return jSONObject;
        }

        /* renamed from: c */
        public final C29574a m146972c() {
            return (C29574a) C29574a.f136496c.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xc.a$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public static final c f136499a = new c();

        /* renamed from: b */
        private static final C29574a f136500b = new C29574a();

        private c() {
        }

        /* renamed from: a */
        public final C29574a m146973a() {
            return f136500b;
        }
    }

    /* renamed from: xc.a$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo146974a(boolean z11, int i11, String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.a$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ JSONObject f136501q;

        /* renamed from: r */
        final /* synthetic */ C7924a f136502r;

        /* renamed from: s */
        final /* synthetic */ String f136503s;

        /* renamed from: t */
        final /* synthetic */ C19057i0 f136504t;

        /* renamed from: u */
        final /* synthetic */ long f136505u;

        /* renamed from: v */
        final /* synthetic */ d f136506v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JSONObject jSONObject, C7924a c7924a, String str, C19057i0 c19057i0, long j11, d dVar) {
            super(1);
            this.f136501q = jSONObject;
            this.f136502r = c7924a;
            this.f136503s = str;
            this.f136504t = c19057i0;
            this.f136505u = j11;
            this.f136506v = dVar;
        }

        /* renamed from: a */
        public final void m146975a(C24848g0 c24848g0) {
            d dVar;
            AbstractC19074t.m100208f(c24848g0, "it");
            try {
                try {
                    if (AbstractC0924m0.m4217t1() != 2) {
                        AbstractC0924m0.m3994li(2);
                    }
                    AbstractC0924m0.m3845gj(System.currentTimeMillis());
                    C26263i.m135055u().m135062A0(this.f136502r, this.f136503s, this.f136504t.f94939p, this.f136505u, this.f136501q.optInt("total_photo_zip"));
                    dVar = this.f136506v;
                    if (dVar == null) {
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    dVar = this.f136506v;
                    if (dVar == null) {
                        return;
                    }
                }
                dVar.mo146974a(true, 0, "");
            } catch (Throwable th2) {
                d dVar2 = this.f136506v;
                if (dVar2 != null) {
                    dVar2.mo146974a(true, 0, "");
                }
                throw th2;
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146975a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.a$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ d f136507q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(2);
            this.f136507q = dVar;
        }

        /* renamed from: a */
        public final void m146976a(int i11, String str) {
            int i12;
            AbstractC19074t.m100208f(str, "errorMessage");
            if (i11 == 50001) {
                i12 = 2006;
            } else {
                i12 = ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP;
            }
            d dVar = this.f136507q;
            if (dVar != null) {
                dVar.mo146974a(false, i12, "[" + i11 + "]" + str);
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m146976a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: xc.a$g */
    /* loaded from: classes3.dex */
    public static final class g implements d {

        /* renamed from: a */
        final /* synthetic */ C19051f0 f136508a;

        /* renamed from: b */
        final /* synthetic */ C19055h0 f136509b;

        /* renamed from: c */
        final /* synthetic */ C19059j0 f136510c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f136511d;

        g(C19051f0 c19051f0, C19055h0 c19055h0, C19059j0 c19059j0, CountDownLatch countDownLatch) {
            this.f136508a = c19051f0;
            this.f136509b = c19055h0;
            this.f136510c = c19059j0;
            this.f136511d = countDownLatch;
        }

        @Override // p640xc.C29574a.d
        /* renamed from: a */
        public void mo146974a(boolean z11, int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMsg");
            this.f136508a.f94928p = z11;
            this.f136509b.f94931p = i11;
            this.f136510c.f94941p = str;
            this.f136511d.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final h f136512q = new h();

        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m146977a(C3535c c3535c) {
            AbstractC19074t.m100208f(c3535c, "chat");
            for (C17945a0 c17945a0 : c3535c.m17941F0()) {
                if (c17945a0.m94880E7()) {
                    c17945a0.m95264ta(6);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m146977a((C3535c) obj);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f136498q);
        f136496c = m129210a;
    }

    /* renamed from: k */
    private final JSONObject m146960k(int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("downloadedCount", i11);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    /* renamed from: l */
    private final void m146961l() {
        try {
            C26220b.m134827j("Clear cache data of sync photo to google drive", null, 2, null);
            C7959d.Companion.m41850e().m41696E();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: m */
    private final List m146962m() {
        List m13306a = new C2768a().m13306a();
        if (m146963n(m13306a)) {
            AbstractC20110a.f98889a.mo104559s("needUpdateCache", new Object[0]);
            m146961l();
            ArrayList m13309b = new C2769b(this.f136497a).m13309b();
            m146966s(m13309b);
            return m13309b;
        }
        AbstractC20110a.f98889a.mo104559s("NO needUpdateCache!!! Use list file from cache: " + m13306a.size(), new Object[0]);
        return m13306a;
    }

    /* renamed from: n */
    private final boolean m146963n(List list) {
        boolean z11;
        if (list.isEmpty() || AbstractC23306f.m120688m().m133005x()) {
            return true;
        }
        if (new C2769b(this.f136497a, true).m13309b().size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return !z11;
    }

    /* renamed from: q */
    private final void m146964q(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            Iterator it = arrayList.iterator();
            long j11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC19074t.m100207e(next, "next(...)");
                C28255a c28255a = (C28255a) next;
                if (j11 != 0) {
                    if (c28255a.m142274n() != 0 && c28255a.m142274n() < j11) {
                    }
                }
                j11 = c28255a.m142274n();
            }
            C22447s.m116006I0(arrayList.size(), C22447s.m116003H(), C22447s.m116002G(), j11, AbstractC0924m0.m4217t1(), AbstractC23309i.m120897Ec());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: r */
    private final void m146965r(JSONObject jSONObject, d dVar, long j11) {
        C7924a m135087t = C26263i.m135055u().m135087t();
        String m132993i = AbstractC23306f.m120688m().m132993i();
        C19057i0 c19057i0 = new C19057i0();
        if (m135087t != null && m135087t.m40975d()) {
            TargetBackupInfo targetBackupInfo = m135087t.f42886u;
            AbstractC19074t.m100205c(targetBackupInfo);
            c19057i0.f94939p = targetBackupInfo.m40950f();
            targetBackupInfo.m40942B(m132993i);
            targetBackupInfo.m40943C(c19057i0.f94939p);
        }
        int m120897Ec = AbstractC23309i.m120897Ec();
        int m116003H = C22447s.m116003H();
        int m116002G = C22447s.m116002G();
        int m4217t1 = AbstractC0924m0.m4217t1();
        jSONObject.put("email", m132993i);
        jSONObject.put("time", c19057i0.f94939p);
        jSONObject.put("device_name", AbstractC23193r0.m119497f());
        jSONObject.put("device_type", "1");
        jSONObject.put("client_version", String.valueOf(CoreUtility.f89236l));
        jSONObject.put("backup_type", String.valueOf(m120897Ec));
        jSONObject.put("network_type", String.valueOf(m116003H));
        jSONObject.put("fresh_install", String.valueOf(m116002G));
        jSONObject.put("imei_status", String.valueOf(m4217t1));
        AbstractC23306f.m120692n().m133041V(jSONObject, new e(jSONObject, m135087t, m132993i, c19057i0, j11, dVar), new f(dVar));
    }

    /* renamed from: s */
    private final void m146966s(List list) {
        try {
            C7959d.Companion.m41850e().m41755U2(list);
            mo139338i();
            AbstractC23306f.m120688m().m132987F(false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: a */
    public List mo98986a() {
        ArrayList arrayList = new ArrayList();
        ArrayList m13309b = new C2769b(this.f136497a).m13309b();
        if (!m13309b.isEmpty()) {
            Iterator it = m13309b.iterator();
            while (it.hasNext()) {
                C28255a c28255a = (C28255a) it.next();
                if (c28255a.m142266e().length() > 0) {
                    arrayList.add(c28255a.m142266e());
                }
            }
        }
        return arrayList;
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: b */
    public void mo139334b(JSONObject jSONObject, long j11) {
        AbstractC19074t.m100208f(jSONObject, "jsonMediaInfo");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C19051f0 c19051f0 = new C19051f0();
        c19051f0.f94928p = true;
        C19055h0 c19055h0 = new C19055h0();
        C19059j0 c19059j0 = new C19059j0();
        c19059j0.f94941p = "";
        m146965r(jSONObject, new g(c19051f0, c19055h0, c19059j0, countDownLatch), j11);
        countDownLatch.await();
        if (c19051f0.f94928p) {
        } else {
            throw new BackupRestoreMediaException(7, c19055h0.f94931p, (String) c19059j0.f94941p);
        }
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: c */
    public List mo139335c(List list) {
        int m116584g;
        AbstractC19074t.m100208f(list, "listDriveIdNeedDelete");
        if (!TextUtils.isEmpty(this.f136497a)) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                int ceil = (int) Math.ceil(list.size() / 100);
                int i11 = 0;
                while (i11 < ceil) {
                    m116584g = AbstractC22543l.m116584g(list.size(), 100);
                    ArrayList arrayList2 = new ArrayList(m116584g);
                    int i12 = i11 + 1;
                    int i13 = i12 * 100;
                    if (i13 > list.size()) {
                        i13 = list.size();
                    }
                    arrayList2.addAll(list.subList(i11 * 100, i13));
                    if (new C27228f(this.f136497a, arrayList2).m139339a()) {
                        arrayList.addAll(arrayList2);
                    }
                    i11 = i12;
                }
                return arrayList;
            }
            return null;
        }
        throw new DriveAuthException(6, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, "Delete Drive failed: invalid token");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0382 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:3:0x0011, B:6:0x0042, B:8:0x0053, B:10:0x006c, B:12:0x0073, B:16:0x0076, B:19:0x00bb, B:22:0x00cc, B:23:0x0181, B:27:0x018a, B:28:0x0196, B:30:0x019e, B:32:0x01b0, B:34:0x01be, B:35:0x01c3, B:36:0x01ff, B:42:0x0216, B:65:0x0225, B:66:0x022f, B:86:0x02f8, B:116:0x037e, B:118:0x0382, B:119:0x0394, B:155:0x0437, B:167:0x00d8, B:169:0x00e0, B:172:0x00ed, B:173:0x00f5, B:175:0x00fb, B:177:0x010a, B:180:0x0126, B:182:0x0138, B:187:0x0113, B:188:0x011a, B:189:0x011b, B:192:0x0149, B:193:0x0153, B:195:0x0154), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03a8 A[Catch: Exception -> 0x0277, TryCatch #2 {Exception -> 0x0277, blocks: (B:40:0x0207, B:45:0x0241, B:47:0x0266, B:49:0x026e, B:58:0x0290, B:60:0x029b, B:63:0x027f, B:68:0x023b, B:71:0x02aa, B:72:0x02b4, B:81:0x02b5, B:84:0x02c4, B:121:0x039a, B:122:0x03a2, B:124:0x03a8, B:126:0x03b3, B:128:0x03bd, B:134:0x03d0, B:137:0x03d8, B:140:0x03e0, B:153:0x03e5), top: B:39:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0290 A[Catch: Exception -> 0x0277, TryCatch #2 {Exception -> 0x0277, blocks: (B:40:0x0207, B:45:0x0241, B:47:0x0266, B:49:0x026e, B:58:0x0290, B:60:0x029b, B:63:0x027f, B:68:0x023b, B:71:0x02aa, B:72:0x02b4, B:81:0x02b5, B:84:0x02c4, B:121:0x039a, B:122:0x03a2, B:124:0x03a8, B:126:0x03b3, B:128:0x03bd, B:134:0x03d0, B:137:0x03d8, B:140:0x03e0, B:153:0x03e5), top: B:39:0x0207 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029b A[SYNTHETIC] */
    @Override // p543uc.InterfaceC27227e
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo98987d(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        boolean z11;
        boolean z12;
        Iterator it;
        boolean z13;
        String str;
        ArrayList arrayList;
        Iterator it2;
        long j11;
        Iterator it3;
        String str2;
        String str3;
        C29574a c29574a = this;
        String str4 = "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.backuprestore.model.media.DriveFileMetadata>";
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        try {
            C26263i.m135054t0(2);
            ArrayList arrayList2 = new ArrayList(m146962m());
            List m41560u = C7956b.Companion.m41573b().m41560u();
            Collection m93599f = AbstractC17574a.m93599f(arrayList2, m41560u);
            AbstractC19074t.m100206d(m93599f, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.backuprestore.model.media.DriveFileMetadata>");
            ArrayList arrayList3 = (ArrayList) m93599f;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList3.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList3.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                C28255a c28255a = (C28255a) obj;
                int indexOf = m41560u.indexOf(c28255a);
                if (indexOf > -1) {
                    c28255a.m142278r(((C28255a) m41560u.get(indexOf)).m142269i());
                    if (!C18388c.f92779a.m97398i(c28255a.m142269i())) {
                        arrayList4.add(c28255a);
                    }
                }
            }
            C26263i.m135052r(2);
            f136495b = AbstractC23306f.m120676j().m128419n();
            AbstractC20110a.a aVar = AbstractC20110a.f98889a;
            aVar.m104564x("SMLGoogleRestHandler").mo104548a("Need DOWNLOAD (%d) files", Integer.valueOf(arrayList4.size()));
            Collection m93603j = AbstractC17574a.m93603j(m41560u, arrayList3);
            AbstractC19074t.m100206d(m93603j, "null cannot be cast to non-null type java.util.ArrayList<com.zing.zalo.data.backuprestore.model.media.DriveFileMetadata>");
            ArrayList arrayList5 = (ArrayList) m93603j;
            c29574a.m146968p(arrayList5, "List Media need add");
            int size2 = arrayList5.size();
            c29574a.m146967o(arrayList5);
            if (arrayList5.size() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            c21690e.m111878P(z11);
            boolean m128402S = AbstractC23306f.m120676j().m128402S();
            int i12 = ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4;
            String str5 = "next(...)";
            if (m128402S) {
                aVar.mo104548a("Restore photo in CSC. Nothing to do", new Object[0]);
                c29574a.m146964q(arrayList4);
            } else if (!C22438j.m115946n(c21690e.f105269f)) {
                int i13 = 5;
                C26263i.m135054t0(5);
                if (arrayList4.size() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                c21690e.m111879Q(z12);
                Iterator it4 = arrayList4.iterator();
                int i14 = 0;
                while (it4.hasNext()) {
                    Object next = it4.next();
                    AbstractC19074t.m100207e(next, "next(...)");
                    C28255a c28255a2 = (C28255a) next;
                    if (C22447s.m116049n0()) {
                        if (C23055e5.m118270e()) {
                            it = it4;
                        } else {
                            throw new BackupRestoreMediaException(i13, i12, "[Download] No WIFI!");
                        }
                    } else {
                        it = it4;
                        if (!C23055e5.m118273h(false, 1, null)) {
                            throw new BackupRestoreMediaException(5, 2006, "[Download] Network not available!");
                        }
                    }
                    AbstractC30897a.m150119d(new C0738b(c29574a.f136497a, c28255a2), f136495b, null, 2, null);
                    i14++;
                    if (interfaceC27226d != null) {
                        interfaceC27226d.mo98897a(2, (i14 * 100) / arrayList4.size());
                    }
                    it4 = it;
                    i13 = 5;
                    i12 = ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4;
                }
                AbstractC23647d.m123898h("5801081", c29574a.m146960k(arrayList4.size()).toString());
                long m135052r = C26263i.m135052r(5);
                String str6 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str6, "currentUserUid");
                AbstractC20887g.m109231i(str6, 18865, "", m135052r, 17700, CoreUtility.f89236l);
                c29574a.m146964q(arrayList4);
            }
            if (C22438j.m115948p(c21690e.f105269f)) {
                return;
            }
            C26263i.m135054t0(4);
            Iterator it5 = arrayList2.iterator();
            long j12 = 0;
            long j13 = 0;
            while (it5.hasNext()) {
                Object next2 = it5.next();
                AbstractC19074t.m100207e(next2, "next(...)");
                j12 += ((C28255a) next2).m142267g();
                j13++;
            }
            int size3 = arrayList5.size();
            if (!AbstractC23306f.m120676j().m128402S()) {
                size3 += arrayList4.size();
            }
            AbstractC20110a.b m104564x = AbstractC20110a.f98889a.m104564x("SMLGoogleRestHandler");
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("Need UPLOAD (%d) files", Arrays.copyOf(new Object[]{Integer.valueOf(arrayList5.size())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            m104564x.mo104548a(format, new Object[0]);
            Iterator it6 = arrayList5.iterator();
            ArrayList arrayList6 = arrayList3;
            int i15 = size3;
            int i16 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            while (it6.hasNext()) {
                ArrayList arrayList7 = arrayList6;
                try {
                    Object next3 = it6.next();
                    AbstractC19074t.m100207e(next3, str5);
                    C28255a c28255a3 = (C28255a) next3;
                    if (C22447s.m116049n0()) {
                        if (C23055e5.m118270e()) {
                            it3 = it6;
                            str2 = str4;
                            str3 = str5;
                        } else {
                            throw new BackupRestoreMediaException(4, ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, "[Upload] No WIFI!");
                        }
                    } else {
                        it3 = it6;
                        str2 = str4;
                        str3 = str5;
                        if (!C23055e5.m118273h(false, 1, null)) {
                            throw new BackupRestoreMediaException(4, 2006, "[Upload] Network not available!");
                        }
                    }
                    AbstractC30897a.m150119d(new C3421a(c29574a.f136497a, c28255a3), f136495b, null, 2, null);
                    i16++;
                    j13++;
                    j16++;
                    j12 += c28255a3.m142267g();
                    j14 += c28255a3.m142267g();
                    if (j15 != 0) {
                        if (c28255a3.m142274n() != 0 && c28255a3.m142274n() < j15) {
                        }
                        if (j17 != 0 || j15 < j17) {
                            j17 = j15;
                        }
                        if (interfaceC27226d == null) {
                            interfaceC27226d.mo98897a(1, (i16 * 100) / arrayList5.size());
                        }
                        c28255a3.m142267g();
                        c29574a = this;
                        it6 = it3;
                        arrayList6 = arrayList7;
                        str5 = str3;
                        str4 = str2;
                    }
                    j15 = c28255a3.m142274n();
                    if (j17 != 0) {
                    }
                    j17 = j15;
                    if (interfaceC27226d == null) {
                    }
                    c28255a3.m142267g();
                    c29574a = this;
                    it6 = it3;
                    arrayList6 = arrayList7;
                    str5 = str3;
                    str4 = str2;
                } catch (Exception e11) {
                    e = e11;
                    if (e instanceof BackupRestoreMediaException) {
                        throw e;
                    }
                    throw new BackupRestoreMediaException(0, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "Backup Media failed: " + e);
                }
            }
            String str7 = str4;
            String str8 = str5;
            ArrayList arrayList8 = arrayList6;
            if (c21690e.f105269f == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            C26222d.f124594a.m134861n((int) j16, z13);
            AbstractC23647d.m123898h("5801071", Companion.m146971b(i15, size2).toString());
            long m135052r2 = C26263i.m135052r(4);
            C26263i.m135054t0(6);
            Collection m93603j2 = AbstractC17574a.m93603j(arrayList2, arrayList8);
            AbstractC19074t.m100206d(m93603j2, str7);
            ArrayList arrayList9 = (ArrayList) m93603j2;
            ArrayList arrayList10 = null;
            m146968p(arrayList9, "List media need del");
            try {
                if (arrayList9.size() > 0) {
                    Calendar calendar = Calendar.getInstance();
                    int m128425u = AbstractC23306f.m120676j().m128425u();
                    if (m128425u != -1) {
                        try {
                            calendar.add(6, -m128425u);
                            j11 = calendar.getTimeInMillis();
                        } catch (Exception e12) {
                            e = e12;
                            arrayList = null;
                            str = str8;
                            if (e instanceof BackupRestoreMediaException) {
                                C26263i.m135026X(6, ((BackupRestoreMediaException) e).m37267a(), ((BackupRestoreMediaException) e).m37268b());
                            }
                            AbstractC20110a.f98889a.mo104552e(e);
                            long j18 = j12;
                            long j19 = j13;
                            it2 = arrayList2.iterator();
                            long j21 = j15;
                            long j22 = j17;
                            while (it2.hasNext()) {
                            }
                            C26263i.m135052r(6);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("backup_time", m135052r2);
                            jSONObject.put("total_time", AbstractC0924m0.m3008E0());
                            AbstractC20887g.m109229g(17700, 18866, jSONObject.toString());
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("photo_size", j18);
                            jSONObject2.put("total_photo", j19);
                            jSONObject2.put("num_of_photo_at_last_time", j16);
                            jSONObject2.put("size_of_photo_at_last_time", j14);
                            jSONObject2.put("min_time_msg_photo_at_all", j22);
                            jSONObject2.put("min_time_msg_media_at_last_time", j21);
                            jSONObject2.put("media_size", j18);
                            mo139334b(jSONObject2, j18);
                            AbstractC20110a.f98889a.mo104551d("updateBackupMediaInfo AWAIT", new Object[0]);
                        }
                    } else {
                        j11 = 0;
                    }
                    Iterator it7 = arrayList9.iterator();
                    while (it7.hasNext()) {
                        Object next4 = it7.next();
                        str = str8;
                        try {
                            AbstractC19074t.m100207e(next4, str);
                            C28255a c28255a4 = (C28255a) next4;
                            if (c28255a4.m142274n() < j11) {
                                Iterator it8 = it7;
                                long j23 = j11;
                                new C31782a(this.f136497a, c28255a4).m152807a();
                                j13--;
                                j12 -= c28255a4.m142267g();
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList(arrayList9.size());
                                }
                                arrayList10.add(c28255a4);
                                it7 = it8;
                                str8 = str;
                                j11 = j23;
                            } else {
                                str8 = str;
                            }
                        } catch (Exception e13) {
                            e = e13;
                            arrayList = arrayList10;
                            if (e instanceof BackupRestoreMediaException) {
                            }
                            AbstractC20110a.f98889a.mo104552e(e);
                            long j182 = j12;
                            long j192 = j13;
                            it2 = arrayList2.iterator();
                            long j212 = j15;
                            long j222 = j17;
                            while (it2.hasNext()) {
                            }
                            C26263i.m135052r(6);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("backup_time", m135052r2);
                            jSONObject3.put("total_time", AbstractC0924m0.m3008E0());
                            AbstractC20887g.m109229g(17700, 18866, jSONObject3.toString());
                            JSONObject jSONObject22 = new JSONObject();
                            jSONObject22.put("photo_size", j182);
                            jSONObject22.put("total_photo", j192);
                            jSONObject22.put("num_of_photo_at_last_time", j16);
                            jSONObject22.put("size_of_photo_at_last_time", j14);
                            jSONObject22.put("min_time_msg_photo_at_all", j222);
                            jSONObject22.put("min_time_msg_media_at_last_time", j212);
                            jSONObject22.put("media_size", j182);
                            mo139334b(jSONObject22, j182);
                            AbstractC20110a.f98889a.mo104551d("updateBackupMediaInfo AWAIT", new Object[0]);
                        }
                    }
                }
                str = str8;
                arrayList = arrayList10;
            } catch (Exception e14) {
                e = e14;
                str = str8;
            }
            long j1822 = j12;
            long j1922 = j13;
            it2 = arrayList2.iterator();
            long j2122 = j15;
            long j2222 = j17;
            while (it2.hasNext()) {
                Object next5 = it2.next();
                AbstractC19074t.m100207e(next5, str);
                C28255a c28255a5 = (C28255a) next5;
                if (arrayList != null && (!arrayList.isEmpty()) && arrayList.contains(c28255a5)) {
                }
                if (j2222 == 0 || (c28255a5.m142274n() != 0 && c28255a5.m142274n() < j2222)) {
                    j2222 = c28255a5.m142274n();
                }
            }
            C26263i.m135052r(6);
            JSONObject jSONObject32 = new JSONObject();
            jSONObject32.put("backup_time", m135052r2);
            jSONObject32.put("total_time", AbstractC0924m0.m3008E0());
            AbstractC20887g.m109229g(17700, 18866, jSONObject32.toString());
            JSONObject jSONObject222 = new JSONObject();
            jSONObject222.put("photo_size", j1822);
            jSONObject222.put("total_photo", j1922);
            jSONObject222.put("num_of_photo_at_last_time", j16);
            jSONObject222.put("size_of_photo_at_last_time", j14);
            jSONObject222.put("min_time_msg_photo_at_all", j2222);
            jSONObject222.put("min_time_msg_media_at_last_time", j2122);
            jSONObject222.put("media_size", j1822);
            mo139334b(jSONObject222, j1822);
            AbstractC20110a.f98889a.mo104551d("updateBackupMediaInfo AWAIT", new Object[0]);
        } catch (Exception e15) {
            e = e15;
        }
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: e */
    public String mo139336e() {
        return this.f136497a;
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: f */
    public void mo98988f() {
        try {
            C26220b.m134826i("SMLGoogleRestHandler", "checkAuthenGoogleDrive", null, 4, null);
            new C2769b(this.f136497a, true).m13309b();
            AbstractC20110a.f98889a.mo104548a("Token valid. NO need to remind", new Object[0]);
        } catch (BackupRestoreMediaException e11) {
            if (e11.m37267a() == 2003) {
                AbstractC20110a.f98889a.mo104548a("Token invalid. Need reauthen", new Object[0]);
                AbstractC23306f.m120688m().m132989H(System.currentTimeMillis());
            }
        }
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: g */
    public void mo98989g(C21690e c21690e, InterfaceC27226d interfaceC27226d) {
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        throw new BackupRestoreMediaException(0, 2014, "Prepare Backup Media failed: not support legacy");
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: h */
    public void mo139337h(String str) {
        AbstractC19074t.m100208f(str, "token");
        this.f136497a = str;
    }

    @Override // p543uc.InterfaceC27227e
    /* renamed from: i */
    public void mo139338i() {
        C7956b.Companion.m41573b().m41518M0();
        AbstractC23306f.m120584H0().m2637t(h.f136512q);
    }

    /* renamed from: o */
    public void m146967o(ArrayList arrayList) {
        long j11;
        AbstractC19074t.m100208f(arrayList, "listFileUpload");
        int m128413h = AbstractC23306f.m120676j().m128413h();
        if (m128413h > 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, -m128413h);
            j11 = calendar.getTimeInMillis();
        } else {
            j11 = 0;
        }
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            if (((C28255a) arrayList.get(size)).m142274n() < j11) {
                arrayList.remove(size);
            } else if (!C18388c.f92779a.m97398i(((C28255a) arrayList.get(size)).m142269i())) {
                arrayList.remove(size);
            }
            if (i11 >= 0) {
                size = i11;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public final void m146968p(ArrayList arrayList, String str) {
        AbstractC19074t.m100208f(arrayList, "list");
        AbstractC19074t.m100208f(str, "name");
    }
}
