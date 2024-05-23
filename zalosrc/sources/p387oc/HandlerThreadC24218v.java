package p387oc;

import ag0.C0822i;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import b50.C2556d;
import ch0.AbstractC3489d;
import com.zing.zalo.MainApplication;
import com.zing.zalo.backuprestore.encryption.DataProtectionCode;
import com.zing.zalo.backuprestore.exception.BackupRestoreException;
import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.backuprestore.media.exception.DriveAuthException;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p062db.BackupRestoreUtils;
import com.zing.zalo.p062db.C7955a;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7961f;
import com.zing.zalo.p062db.SQLiteException;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import gm.C19490a;
import gm.C19491b;
import gw.C19669z;
import hm.C20092b;
import hm.InterfaceC20091a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import me0.AbstractC23041d2;
import me0.AbstractC23195r2;
import me0.C23055e5;
import mh.C23298d;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.InterfaceC23792b;
import on0.AbstractC24341v;
import org.json.JSONException;
import org.json.JSONObject;
import p158fd.C18880d;
import p185gc.AbstractC19378b;
import p248iy.AbstractC20887g;
import p297kd.C21688c;
import p297kd.C21689d;
import p297kd.C21690e;
import p320ld.AbstractC22431c;
import p320ld.C22438j;
import p320ld.C22440l;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p387oc.HandlerThreadC24218v;
import p421pc.C24720a;
import p479rc.C25724a;
import p479rc.C25725b;
import p479rc.C25727d;
import p484ri.C25804a;
import p484ri.C25806c;
import p543uc.InterfaceC27226d;
import p543uc.InterfaceC27227e;
import p548ui.C27271a;
import p548ui.C27272b;
import p548ui.C27273c;
import p716zh.C31986k3;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import sc.C26220b;
import si.C26263i;
import wd0.C28931k;
import ws.C29210k;

/* renamed from: oc.v */
/* loaded from: classes3.dex */
public final class HandlerThreadC24218v extends HandlerThread {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private boolean f116846A;

    /* renamed from: B */
    private final List f116847B;

    /* renamed from: C */
    private TargetBackupInfo f116848C;

    /* renamed from: D */
    private int f116849D;

    /* renamed from: E */
    private long f116850E;

    /* renamed from: F */
    private long f116851F;

    /* renamed from: G */
    private int f116852G;

    /* renamed from: H */
    private JSONObject f116853H;

    /* renamed from: I */
    private final long f116854I;

    /* renamed from: J */
    private InterfaceC27227e f116855J;

    /* renamed from: K */
    private Exception f116856K;

    /* renamed from: L */
    private int f116857L;

    /* renamed from: p */
    private final String f116858p;

    /* renamed from: q */
    private Handler f116859q;

    /* renamed from: r */
    private final InterfaceC24854k f116860r;

    /* renamed from: s */
    private final InterfaceC24854k f116861s;

    /* renamed from: t */
    private final InterfaceC24854k f116862t;

    /* renamed from: u */
    private final InterfaceC24854k f116863u;

    /* renamed from: v */
    private final InterfaceC24854k f116864v;

    /* renamed from: w */
    private final InterfaceC24854k f116865w;

    /* renamed from: x */
    private final InterfaceC24854k f116866x;

    /* renamed from: y */
    private final C21690e f116867y;

    /* renamed from: z */
    private boolean f116868z;

    /* renamed from: oc.v$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized boolean m126302a() {
            try {
                ZdbApiCode zdbApiCode = new ZdbApiCode();
                C28931k m120612Q1 = AbstractC23306f.m120612Q1();
                AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
                C7956b m41573b = C7956b.Companion.m41573b();
                String str = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str, "currentUserUid");
                C19491b m41532X = m41573b.m41532X(Integer.parseInt(str), new int[0], new boolean[0], zdbApiCode);
                if (m41532X == null) {
                    return false;
                }
                int m101929d = m41532X.m101929d();
                for (int i11 = 0; i11 < m101929d; i11++) {
                    C20092b c20092b = C20092b.f98828a;
                    C19490a m101928c = m41532X.m101928c(i11);
                    AbstractC19074t.m100207e(m101928c, "get(...)");
                    C17945a0 m104483j = c20092b.m104483j(m101928c, false);
                    C19669z m103232a = C19669z.Companion.m103232a();
                    String mo95039W2 = m104483j.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                    Conversation m103201R = m103232a.m103201R(mo95039W2);
                    if (m103201R != null && m103201R.m41008l() >= m104483j.m94974P4() && m103201R.m41005i() != null) {
                    }
                    String mo95039W22 = m104483j.mo95039W2();
                    AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                    AbstractC19378b.m101499c(m120612Q1, new C28931k.b(new Conversation(mo95039W22, null, null, null, 14, null), m104483j, C28931k.d.Companion.m144587c()), null, 2, null);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.v$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f116869q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25724a mo12V4() {
            return AbstractC23306f.m120668h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.v$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f116870q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24720a mo12V4() {
            return AbstractC23306f.m120676j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.v$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f116871q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25804a mo12V4() {
            return AbstractC23306f.m120688m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.v$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final e f116872q = new e();

        e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C25806c mo12V4() {
            return AbstractC23306f.m120692n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.v$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f116873q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24213q mo12V4() {
            return AbstractC23306f.m120696o();
        }
    }

    /* renamed from: oc.v$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {
        g() {
            super(1);
        }

        /* renamed from: a */
        public final void m126308a(int i11) {
            HandlerThreadC24218v.this.m126215B0(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126308a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ File f116876r;

        /* renamed from: s */
        final /* synthetic */ long f116877s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(File file, long j11) {
            super(1);
            this.f116876r = file;
            this.f116877s = j11;
        }

        /* renamed from: a */
        public final void m126309a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            HandlerThreadC24218v.this.m126290v0(jSONObject, this.f116876r, this.f116877s);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126309a((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$i */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ long f116879r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(long j11) {
            super(2);
            this.f116879r = j11;
        }

        /* renamed from: a */
        public final void m126310a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            HandlerThreadC24218v.this.m126292w0(i11, str, this.f116879r);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m126310a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$j */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18505l {
        j() {
            super(1);
        }

        /* renamed from: c */
        public static final void m126312c(JSONObject jSONObject, HandlerThreadC24218v handlerThreadC24218v) {
            AbstractC19074t.m100208f(jSONObject, "$dataJson");
            AbstractC19074t.m100208f(handlerThreadC24218v, "this$0");
            try {
                C7924a c7924a = new C7924a(jSONObject);
                if (!c7924a.m40975d()) {
                    handlerThreadC24218v.m126294x0(-2, "Get backup info api success but data invalid");
                } else {
                    C22447s.m116065x0(jSONObject);
                    C26263i.m135055u().m135092z0(c7924a, jSONObject.toString());
                    handlerThreadC24218v.m126296y0(0, "");
                }
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupRestoreHandler", e11);
                handlerThreadC24218v.m126294x0(-3, e11.getMessage());
            }
            C26263i.m135048p(1);
        }

        /* renamed from: b */
        public final void m126313b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "dataJson");
            Handler handler = HandlerThreadC24218v.this.f116859q;
            if (handler != null) {
                handler.post(new Runnable() { // from class: oc.w

                    /* renamed from: p */
                    public final /* synthetic */ JSONObject f116903p;

                    /* renamed from: q */
                    public final /* synthetic */ HandlerThreadC24218v f116904q;

                    public /* synthetic */ RunnableC24219w(JSONObject jSONObject2, HandlerThreadC24218v handlerThreadC24218v) {
                        r1 = jSONObject2;
                        r2 = handlerThreadC24218v;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HandlerThreadC24218v.j.m126312c(r1, r2);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126313b((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$k */
    /* loaded from: classes3.dex */
    public static final class k extends AbstractC19075u implements InterfaceC18509p {
        k() {
            super(2);
        }

        /* renamed from: c */
        public static final void m126315c(int i11, HandlerThreadC24218v handlerThreadC24218v, String str) {
            AbstractC19074t.m100208f(handlerThreadC24218v, "this$0");
            AbstractC19074t.m100208f(str, "$errorMessage");
            try {
                if (i11 == 1001) {
                    handlerThreadC24218v.m126296y0(1001, str);
                } else {
                    handlerThreadC24218v.m126294x0(i11, str);
                }
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupRestoreHandler", e11);
                handlerThreadC24218v.m126294x0(-3, e11.getMessage());
            }
            C26263i.m135048p(1);
        }

        /* renamed from: b */
        public final void m126316b(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            Handler handler = HandlerThreadC24218v.this.f116859q;
            if (handler != null) {
                handler.post(new Runnable() { // from class: oc.x

                    /* renamed from: p */
                    public final /* synthetic */ int f116905p;

                    /* renamed from: q */
                    public final /* synthetic */ HandlerThreadC24218v f116906q;

                    /* renamed from: r */
                    public final /* synthetic */ String f116907r;

                    public /* synthetic */ RunnableC24220x(int i112, HandlerThreadC24218v handlerThreadC24218v, String str2) {
                        r1 = i112;
                        r2 = handlerThreadC24218v;
                        r3 = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        HandlerThreadC24218v.k.m126315c(r1, r2, r3);
                    }
                });
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m126316b(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$l */
    /* loaded from: classes3.dex */
    public static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ C27271a f116882q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC18505l f116883r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC18509p f116884s;

        /* renamed from: t */
        final /* synthetic */ InterfaceC18505l f116885t;

        /* renamed from: u */
        final /* synthetic */ HandlerThreadC24218v f116886u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C27271a c27271a, InterfaceC18505l interfaceC18505l, InterfaceC18509p interfaceC18509p, InterfaceC18505l interfaceC18505l2, HandlerThreadC24218v handlerThreadC24218v) {
            super(1);
            this.f116882q = c27271a;
            this.f116883r = interfaceC18505l;
            this.f116884s = interfaceC18509p;
            this.f116885t = interfaceC18505l2;
            this.f116886u = handlerThreadC24218v;
        }

        /* renamed from: a */
        public final void m126317a(C27272b c27272b) {
            AbstractC19074t.m100208f(c27272b, "response");
            if (c27272b.m139624a()) {
                AbstractC23306f.m120692n().m133043X(this.f116882q, c27272b.m139626c(), this.f116883r, this.f116884s, this.f116885t);
                return;
            }
            this.f116886u.m126228I().m133029I(this.f116886u.m126241Q().mo124314i() + (c27272b.m139625b() * 60000));
            C26220b.f124587a.m134843q(C26263i.m135016J(this.f116886u.f116867y.f105269f));
            HandlerThreadC24218v.m126225G0(this.f116886u, 1, -1, "Backup division error!", 0L, 8, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126317a((C27272b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$m */
    /* loaded from: classes3.dex */
    public static final class m extends AbstractC19075u implements InterfaceC18509p {
        m() {
            super(2);
        }

        /* renamed from: a */
        public final void m126318a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            HandlerThreadC24218v.this.m126228I().m133029I(HandlerThreadC24218v.this.m126241Q().mo124314i() + 1800000);
            HandlerThreadC24218v.m126225G0(HandlerThreadC24218v.this, 1, i11, str, 0L, 8, null);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m126318a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$n */
    /* loaded from: classes3.dex */
    public static final class n extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ long f116889r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j11) {
            super(2);
            this.f116889r = j11;
        }

        /* renamed from: a */
        public final void m126319a(int i11, String str) {
            AbstractC19074t.m100208f(str, "errorMessage");
            AbstractC23350e.m122774d("SMLBackupRestoreHandler", str);
            HandlerThreadC24218v.m126225G0(HandlerThreadC24218v.this, 2, i11, str, 0L, 8, null);
            C26220b.f124587a.m134840B(11, false, this.f116889r);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m126319a(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$o */
    /* loaded from: classes3.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ int f116891r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(int i11) {
            super(1);
            this.f116891r = i11;
        }

        /* renamed from: a */
        public final void m126320a(int i11) {
            int min;
            C21688c m111854a = C21688c.Companion.m111854a();
            int i12 = HandlerThreadC24218v.this.f116852G;
            if (AbstractC3489d.m17501i()) {
                min = Math.min(95, HandlerThreadC24218v.this.m126297z(this.f116891r, i11));
            } else {
                min = Math.min(95, i11);
            }
            m111854a.m111841D(11, i12, min, HandlerThreadC24218v.this.f116867y);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126320a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$p */
    /* loaded from: classes3.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ JSONObject f116892q;

        /* renamed from: r */
        final /* synthetic */ HandlerThreadC24218v f116893r;

        /* renamed from: s */
        final /* synthetic */ long f116894s;

        /* renamed from: t */
        final /* synthetic */ int f116895t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(JSONObject jSONObject, HandlerThreadC24218v handlerThreadC24218v, long j11, int i11) {
            super(1);
            this.f116892q = jSONObject;
            this.f116893r = handlerThreadC24218v;
            this.f116894s = j11;
            this.f116895t = i11;
        }

        /* renamed from: a */
        public final void m126321a(Object obj) {
            AbstractC19074t.m100208f(obj, "data");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                int i11 = jSONObject.getInt("error_code");
                if (i11 == 0) {
                    C26263i.m135055u().f124694g = "";
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("backupInfo");
                    TargetBackupInfo.C7923b c7923b = TargetBackupInfo.Companion;
                    AbstractC19074t.m100205c(jSONObject2);
                    TargetBackupInfo m40970a = c7923b.m40970a(jSONObject2);
                    if (m40970a.m40955k() == null) {
                        C26220b.m134819b(new BackupRestoreException("Invalid backup info: Server=" + jSONObject + ", Local=" + this.f116892q));
                    }
                    if (m40970a.m40949e().length() > 0 && m40970a.isValid()) {
                        try {
                            C22447s.m116065x0(jSONObject2);
                        } catch (Exception e11) {
                            C26220b.m134819b(e11);
                        }
                        this.f116893r.m126240P0(jSONObject2, m40970a);
                    }
                    HandlerThreadC24218v.m126229I0(this.f116893r, 12, null, 0L, 6, null);
                    C26220b.f124587a.m134840B(11, true, this.f116894s);
                    C26263i.m135048p(this.f116895t);
                    return;
                }
                HandlerThreadC24218v.m126225G0(this.f116893r, 2, i11, jSONObject.optString("error_message"), 0L, 8, null);
                C26220b.f124587a.m134840B(11, false, this.f116894s);
            } catch (Exception e12) {
                C26220b.m134821d("SMLBackupRestoreHandler", e12);
                HandlerThreadC24218v.m126225G0(this.f116893r, 2, -1, e12.getMessage(), 0L, 8, null);
                C26220b.f124587a.m134840B(11, false, this.f116894s);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m126321a(obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: oc.v$q */
    /* loaded from: classes3.dex */
    public static final class q implements InterfaceC20091a {

        /* renamed from: b */
        final /* synthetic */ String f116897b;

        /* renamed from: c */
        final /* synthetic */ long f116898c;

        /* renamed from: d */
        final /* synthetic */ C7955a f116899d;

        q(String str, long j11, C7955a c7955a) {
            this.f116897b = str;
            this.f116898c = j11;
            this.f116899d = c7955a;
        }

        @Override // hm.InterfaceC20091a
        /* renamed from: a */
        public void mo41472a() {
            HandlerThreadC24218v.this.m126219D0(this.f116897b, this.f116898c, this.f116899d);
        }

        @Override // hm.InterfaceC20091a
        /* renamed from: b */
        public void mo41473b(String str, int i11) {
            HandlerThreadC24218v.this.m126216C(this.f116899d);
            HandlerThreadC24218v handlerThreadC24218v = HandlerThreadC24218v.this;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format(Locale.US, "Insert data exception: %s ", Arrays.copyOf(new Object[]{str}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            HandlerThreadC24218v.m126225G0(handlerThreadC24218v, 100, i11, format, 0L, 8, null);
        }
    }

    /* renamed from: oc.v$r */
    /* loaded from: classes3.dex */
    public static final class r extends Handler {
        r(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC19074t.m100208f(message, "msg");
            HandlerThreadC24218v.this.m126278o0(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.v$s */
    /* loaded from: classes3.dex */
    public static final class s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final s f116901q = new s();

        s() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23298d mo12V4() {
            return AbstractC23306f.m120720v1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oc.v$t */
    /* loaded from: classes3.dex */
    public static final class t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final t f116902q = new t();

        t() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final InterfaceC23792b mo12V4() {
            return AbstractC23306f.m120579F1();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC24218v(String str, String str2) {
        super("Z:" + str);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        InterfaceC24854k m129210a6;
        InterfaceC24854k m129210a7;
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "currentUidSession");
        this.f116858p = str2;
        m129210a = AbstractC24856m.m129210a(e.f116872q);
        this.f116860r = m129210a;
        m129210a2 = AbstractC24856m.m129210a(d.f116871q);
        this.f116861s = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(c.f116870q);
        this.f116862t = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(b.f116869q);
        this.f116863u = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(f.f116873q);
        this.f116864v = m129210a5;
        m129210a6 = AbstractC24856m.m129210a(s.f116901q);
        this.f116865w = m129210a6;
        m129210a7 = AbstractC24856m.m129210a(t.f116902q);
        this.f116866x = m129210a7;
        this.f116847B = new ArrayList();
        this.f116867y = new C21690e(true, "");
        this.f116854I = m126224G().m128415j();
    }

    /* renamed from: A */
    private final void m126212A() {
        boolean z11;
        this.f116867y.f105269f = AbstractC23309i.m120897Ec();
        this.f116867y.m111884V(AbstractC0924m0.m4162r6());
        this.f116867y.m111875M(AbstractC0924m0.m4072o6());
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (m135087t != null) {
            this.f116848C = m135087t.m40978h();
        }
        this.f116867y.m111885W(C22447s.m116009K0(this.f116867y, this.f116848C, this.f116846A));
        C21690e c21690e = this.f116867y;
        if (!m126228I().m133023A() && C22447s.m116020V() && !C31986k3.f147083a.m154111U1()) {
            z11 = false;
        } else {
            z11 = true;
        }
        c21690e.m111873K(z11);
        this.f116867y.m111882T(this.f116846A);
        this.f116867y.m111870H();
    }

    /* renamed from: A0 */
    private final void m126213A0() {
        m126298z0(14, null);
    }

    /* renamed from: B */
    private final boolean m126214B() {
        try {
            return C7959d.Companion.m41850e().m41706H0();
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
            return false;
        }
    }

    /* renamed from: B0 */
    public final void m126215B0(int i11) {
        try {
            C21688c.Companion.m111854a().m111841D(3, 2, i11, this.f116867y);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
        }
    }

    /* renamed from: C */
    public final void m126216C(C7955a c7955a) {
        if (c7955a != null) {
            try {
                if (c7955a.m41471x()) {
                    c7955a.m41470n();
                }
            } catch (SQLiteException e11) {
                C26220b.m134821d("SMLBackupRestoreHandler", e11);
            }
        }
    }

    /* renamed from: C0 */
    private final boolean m126217C0(C7924a c7924a) {
        if (!this.f116846A || c7924a == null || !c7924a.m40975d()) {
            return false;
        }
        if (this.f116849D > 0) {
            C26220b.m134832o("Retry download > 0! Cached backup info should be clear and null");
        }
        C21690e m133053o = m126228I().m133053o();
        if (m133053o != null) {
            this.f116867y.m111887m(m133053o);
        }
        this.f116867y.m111882T(this.f116846A);
        this.f116867y.m111870H();
        if (C22438j.m115948p(this.f116867y.f105269f)) {
            m126229I0(this, 14, null, 0L, 6, null);
            return true;
        }
        m126213A0();
        return true;
    }

    /* renamed from: D */
    private final long m126218D() {
        long m121297P5 = AbstractC23309i.m121297P5();
        long mo124311f = m126241Q().mo124311f();
        if (Math.abs(mo124311f - m121297P5) > 86400000) {
            return mo124311f;
        }
        return m121297P5;
    }

    /* renamed from: D0 */
    public final void m126219D0(String str, long j11, C7955a c7955a) {
        try {
            try {
                AbstractC0924m0.m4237tl(true);
                m126229I0(this, 8, str, 0L, 4, null);
                C26263i.m135048p(7);
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupRestoreHandler", e11);
                m126225G0(this, 200, -1, e11.getMessage(), 0L, 8, null);
            }
        } finally {
            m126216C(c7955a);
        }
    }

    /* renamed from: E */
    private final C25724a m126220E() {
        return (C25724a) this.f116863u.getValue();
    }

    /* renamed from: E0 */
    private final void m126221E0(long j11, long j12, long j13, long j14) {
        JSONObject jSONObject = new JSONObject();
        this.f116853H = jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("msg_total", j11);
            jSONObject2.put("msg_thread", j12);
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("origin_db", jSONObject2);
            JSONObject jSONObject3 = this.f116853H;
            if (jSONObject3 != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("msg_total", j13);
                jSONObject4.put("msg_thread", j14);
                C24848g0 c24848g02 = C24848g0.f119245a;
                jSONObject3.put("backup_db", jSONObject4);
            }
            AbstractC23309i.m121135Ks(String.valueOf(this.f116853H));
        } catch (JSONException e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
            this.f116853H = null;
            AbstractC23309i.m121135Ks("");
        }
    }

    /* renamed from: F */
    private final int m126222F() {
        int m120897Ec = AbstractC23309i.m120897Ec();
        if (m120897Ec == 10 && this.f116867y.m111897w() == 2 && this.f116867y.m111891q() != 0) {
            return this.f116867y.m111891q();
        }
        return m120897Ec;
    }

    /* renamed from: F0 */
    private final void m126223F0(int i11, int i12, String str, long j11) {
        C26220b.m134829l("SMLBackupRestoreHandler", "sendErrorMessage(): pos=" + i11 + ", errorCode=" + i12 + ", message=" + str);
        Handler handler = this.f116859q;
        AbstractC19074t.m100205c(handler);
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = 13;
        Bundle bundle = new Bundle();
        bundle.putInt("extra_sync_error_pos", i11);
        bundle.putInt("extra_sync_error_code", i12);
        bundle.putString("extra_sync_error_mess", str);
        obtainMessage.setData(bundle);
        AbstractC19074t.m100207e(obtainMessage, "apply(...)");
        Handler handler2 = this.f116859q;
        if (handler2 != null) {
            handler2.sendMessageDelayed(obtainMessage, j11);
        }
    }

    /* renamed from: G */
    private final C24720a m126224G() {
        return (C24720a) this.f116862t.getValue();
    }

    /* renamed from: G0 */
    static /* synthetic */ void m126225G0(HandlerThreadC24218v handlerThreadC24218v, int i11, int i12, String str, long j11, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            j11 = 100;
        }
        handlerThreadC24218v.m126223F0(i11, i12, str, j11);
    }

    /* renamed from: H */
    private final C25804a m126226H() {
        return (C25804a) this.f116861s.getValue();
    }

    /* renamed from: H0 */
    private final void m126227H0(int i11, String str, long j11) {
        C26220b.m134829l("SMLBackupRestoreHandler", "sendMessageToNextPhase(): targetPhase=" + i11 + ", data=" + str);
        Handler handler = this.f116859q;
        AbstractC19074t.m100205c(handler);
        Message obtainMessage = handler.obtainMessage();
        obtainMessage.what = i11;
        if (str != null && str.length() != 0) {
            obtainMessage.obj = str;
        }
        AbstractC19074t.m100207e(obtainMessage, "apply(...)");
        Handler handler2 = this.f116859q;
        if (handler2 != null) {
            handler2.sendMessageDelayed(obtainMessage, j11);
        }
    }

    /* renamed from: I */
    public final C25806c m126228I() {
        return (C25806c) this.f116860r.getValue();
    }

    /* renamed from: I0 */
    static /* synthetic */ void m126229I0(HandlerThreadC24218v handlerThreadC24218v, int i11, String str, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        if ((i12 & 4) != 0) {
            j11 = 100;
        }
        handlerThreadC24218v.m126227H0(i11, str, j11);
    }

    /* renamed from: J */
    private final C24213q m126230J() {
        return (C24213q) this.f116864v.getValue();
    }

    /* renamed from: J0 */
    private final void m126231J0(Exception exc) {
        if (exc instanceof BackupRestoreMediaException) {
            AbstractC23350e.m122776f("SMLBackupRestoreHandler", exc);
            BackupRestoreMediaException backupRestoreMediaException = (BackupRestoreMediaException) exc;
            if (backupRestoreMediaException.m37267a() == 2003) {
                m126226H().m132984C(2);
                if (this.f116867y.f105269f == 1) {
                    m126226H().m132989H(System.currentTimeMillis());
                }
            } else if (backupRestoreMediaException.m37267a() == 2007) {
                C26220b.m134833p("SMLBackupRestoreHandler", "User cancel sync media");
                m126229I0(this, 17, null, 0L, 6, null);
                return;
            }
            Handler handler = this.f116859q;
            AbstractC19074t.m100205c(handler);
            Message obtainMessage = handler.obtainMessage();
            obtainMessage.what = 16;
            Bundle bundle = new Bundle();
            bundle.putInt("extra_sync_error_code", backupRestoreMediaException.m37267a());
            bundle.putString("extra_sync_error_mess", backupRestoreMediaException.m37268b());
            bundle.putInt("extra_sync_error_pos", backupRestoreMediaException.m37269c());
            obtainMessage.setData(bundle);
            AbstractC19074t.m100207e(obtainMessage, "apply(...)");
            Handler handler2 = this.f116859q;
            if (handler2 != null) {
                handler2.sendMessageDelayed(obtainMessage, 100L);
                return;
            }
            return;
        }
        Handler handler3 = this.f116859q;
        AbstractC19074t.m100205c(handler3);
        Message obtainMessage2 = handler3.obtainMessage();
        obtainMessage2.what = 16;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("extra_sync_error_code", ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP);
        bundle2.putString("extra_sync_error_mess", exc.getMessage());
        bundle2.putInt("extra_sync_error_pos", 0);
        obtainMessage2.setData(bundle2);
        AbstractC19074t.m100207e(obtainMessage2, "apply(...)");
        Handler handler4 = this.f116859q;
        if (handler4 != null) {
            handler4.sendMessageDelayed(obtainMessage2, 100L);
        }
    }

    /* renamed from: L */
    private final C25725b m126232L(TargetBackupInfo targetBackupInfo) {
        C25725b m132695p;
        try {
            if (!AbstractC22431c.m115870a(targetBackupInfo)) {
                return m126220E().m132695p(0);
            }
            if (C22438j.m115947o(this.f116867y.f105269f)) {
                DataProtectionCode m128526k = AbstractC23306f.m120636Y1().m128526k();
                if (m128526k == null) {
                    m126225G0(this, 1, 2, "Invalid data protection code !!!", 0L, 8, null);
                    return null;
                }
                m132695p = m126220E().m132683b(m128526k.m37261a(), m128526k.m37262b());
            } else {
                m132695p = m126220E().m132695p(targetBackupInfo.m40953i());
            }
            C26220b.m134826i("SMLBackupRestoreHandler", "getDecryptKey(): entryPoint=" + this.f116867y.f105269f + ", encryptType=" + targetBackupInfo.m40953i() + ". Key=" + m132695p, null, 4, null);
            return m132695p;
        } catch (BackupRestoreException unused) {
            m126223F0(1, -16, "Do not have password to decrypt backup type password", 1000L);
            if (AbstractC22431c.m115870a(targetBackupInfo)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("entryPoint", this.f116867y.f105269f);
                jSONObject.put("dbEncryptType", targetBackupInfo.m40953i());
                AbstractC20887g.m109240r(18849, jSONObject.toString());
            }
            return null;
        }
    }

    /* renamed from: L0 */
    private final void m126233L0(int i11) {
        m126235M0(i11, null);
    }

    /* renamed from: M */
    private final String m126234M(TargetBackupInfo targetBackupInfo) {
        return m126220E().m132666D(targetBackupInfo.m40953i());
    }

    /* renamed from: M0 */
    private final void m126235M0(int i11, String str) {
        C26220b.m134824g("SMLBackupRestoreHandler", "setSyncState(): " + C22447s.m116000F(i11), C26220b.a.f124588p);
        C26220b.m134838x(C26220b.f124587a, i11, false, 0, null, 14, null);
        C26263i.m135055u().m135081m0(i11, str);
        if (C22447s.m116039i0(i11)) {
            this.f116852G = 1;
        } else if (C22447s.m116041j0(i11)) {
            this.f116852G = 2;
        }
        C21688c.Companion.m111854a().m111842E(i11, this.f116852G, this.f116867y);
    }

    /* renamed from: N0 */
    private final Handler m126236N0() {
        return new r(getLooper());
    }

    /* renamed from: O */
    private final C23298d m126237O() {
        return (C23298d) this.f116865w.getValue();
    }

    /* renamed from: O0 */
    private final void m126238O0() {
        int m132996n = m126226H().m132996n();
        if (m132996n != 1) {
            if (m132996n != 2) {
                if (m132996n != 3) {
                    throw new DriveAuthException(1, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP, "Refresh Drive token failed (unknown error)");
                }
                throw new DriveAuthException(1, 2015, "Drive token is expired");
            }
            throw new DriveAuthException(1, ZAbstractBase.ZVU_PROCESS_VIDEO_TO_SEQUENCE_IMAGE, "Drive token is expired/revoked. Need manual refresh by user");
        }
        throw new DriveAuthException(1, 2006, "Refresh Drive token failed (network error)");
    }

    /* renamed from: P */
    private final InterfaceC27227e m126239P() {
        InterfaceC27227e interfaceC27227e = this.f116855J;
        if (interfaceC27227e != null) {
            AbstractC19074t.m100205c(interfaceC27227e);
            return interfaceC27227e;
        }
        C26263i.m135054t0(1);
        String m132993i = m126226H().m132993i();
        if (m132993i.length() != 0) {
            InterfaceC27227e m135061z = C26263i.m135061z(m132993i);
            this.f116855J = m135061z;
            if (m135061z == null) {
                m126238O0();
            }
            C26263i.m135052r(1);
            InterfaceC27227e interfaceC27227e2 = this.f116855J;
            AbstractC19074t.m100205c(interfaceC27227e2);
            return interfaceC27227e2;
        }
        throw new BackupRestoreMediaException(0, ZAbstractBase.ZVU_PROCESS_GIF_TO_MP4, "Drive email is empty");
    }

    /* renamed from: P0 */
    public final void m126240P0(JSONObject jSONObject, TargetBackupInfo targetBackupInfo) {
        JSONObject jSONObject2;
        m126228I().m133037R(targetBackupInfo.m40949e());
        try {
            String m121291P = AbstractC23309i.m121291P();
            AbstractC19074t.m100205c(m121291P);
            if (m121291P.length() == 0) {
                jSONObject2 = new JSONObject();
            } else {
                JSONObject jSONObject3 = new JSONObject(m121291P);
                jSONObject3.remove("cross");
                jSONObject2 = jSONObject3;
            }
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
            jSONObject2 = new JSONObject();
        }
        jSONObject2.put("cross", jSONObject);
        C26263i.m135055u().m135092z0(new C7924a(jSONObject2), jSONObject2.toString());
    }

    /* renamed from: Q */
    public final InterfaceC23792b m126241Q() {
        return (InterfaceC23792b) this.f116866x.getValue();
    }

    /* renamed from: R */
    private final JSONObject m126242R() {
        JSONObject jSONObject = this.f116853H;
        if (jSONObject != null) {
            AbstractC19074t.m100205c(jSONObject);
            if (jSONObject.has("origin_db")) {
                JSONObject jSONObject2 = this.f116853H;
                AbstractC19074t.m100205c(jSONObject2);
                if (jSONObject2.has("backup_db")) {
                    C26220b.m134829l("SMLBackupRestoreHandler", "Found valid infoObject in MEM");
                    JSONObject jSONObject3 = this.f116853H;
                    AbstractC19074t.m100205c(jSONObject3);
                    return jSONObject3;
                }
            }
        }
        String m122047j8 = AbstractC23309i.m122047j8();
        AbstractC19074t.m100205c(m122047j8);
        if (m122047j8.length() == 0) {
            return new JSONObject();
        }
        try {
            JSONObject jSONObject4 = new JSONObject(m122047j8);
            if (jSONObject4.has("origin_db") && jSONObject4.has("backup_db")) {
                return jSONObject4;
            }
            throw new JSONException("Saved json string not valid");
        } catch (JSONException e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
            return new JSONObject();
        }
    }

    /* renamed from: S */
    private final void m126243S(Bundle bundle) {
        int i11;
        String str;
        int i12;
        Handler handler = this.f116859q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f116867y.m111886X(false);
        this.f116868z = false;
        if (bundle != null) {
            i11 = bundle.getInt("extra_sync_error_code");
        } else {
            i11 = -1;
        }
        if (bundle == null || (str = bundle.getString("extra_sync_error_mess")) == null) {
            str = "Sync error";
        }
        if (bundle != null) {
            i12 = bundle.getInt("extra_sync_error_pos");
        } else {
            i12 = 0;
        }
        int m121889f1 = AbstractC23309i.m121889f1();
        if (AbstractC3489d.m17501i() && AbstractC3489d.m17512t()) {
            C26220b.f124587a.m134846y(this.f116857L, m121889f1, i11, str);
        } else {
            C26220b.f124587a.m134845w(m121889f1, false, i11, str);
        }
        try {
            C21689d c21689d = new C21689d(m121889f1, i12, i11, str);
            if ((m121889f1 == 3 || m121889f1 == 11 || m121889f1 == 1) && !C23055e5.m118273h(false, 1, null)) {
                c21689d.m111862j(true);
            } else if (C22447s.m116026b0()) {
                c21689d.m111861i(true);
            }
            this.f116867y.m111881S(c21689d, false);
            C26220b.m134820c("handleBackupDBError(): errorData=" + c21689d);
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
            this.f116867y.m111881S(null, false);
            C26220b.m134820c("handleBackupDBError(): errorCode=" + i11 + ", errorMes=" + str + ", errorPos=" + i12 + ", errSyncPhase=" + m121889f1);
        }
        m126228I().m133030J(m126228I().m133051l() + 1);
        m126235M0(13, null);
        m126227H0(17, null, 1000L);
        if (this.f116852G == 2) {
            C29210k.Companion.m145896a().m145894y0(false);
            m126237O().m120475h(3);
        }
    }

    /* renamed from: T */
    private final void m126244T() {
        m126233L0(12);
        this.f116868z = true;
        m126228I().m133032L(m126241Q().mo124314i());
        try {
            if (AbstractC0924m0.m4246u1() != 2) {
                AbstractC0924m0.m4024mi(2);
            }
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
        }
        m126228I().m133030J(0);
        if (this.f116867y.m111898x() && AbstractC3489d.m17505m()) {
            m126229I0(this, 14, null, 0L, 6, null);
        } else {
            m126229I0(this, 17, null, 0L, 6, null);
        }
        C26263i.m135048p(12);
        if (this.f116852G == 2) {
            C29210k.Companion.m145896a().m145894y0(true);
            m126237O().m120475h(3);
        }
        C26220b.m134830m(this.f116867y);
    }

    /* renamed from: U */
    private final void m126245U(String str) {
        m126235M0(4, str);
        m126285s(str);
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(C7959d.Companion.m41849d(MainApplication.Companion.m35500c()).getAbsolutePath() + ".temp");
        List list = this.f116847B;
        String absolutePath = file.getAbsolutePath();
        AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
        list.add(absolutePath);
        file.delete();
        TargetBackupInfo targetBackupInfo = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo);
        if (AbstractC22431c.m115870a(targetBackupInfo)) {
            AbstractC20887g.m109217D(18848, null, 2, null);
        }
        TargetBackupInfo targetBackupInfo2 = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo2);
        C25725b m126232L = m126232L(targetBackupInfo2);
        if (m126232L == null) {
            return;
        }
        TargetBackupInfo targetBackupInfo3 = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo3);
        if (!AbstractC22431c.m115870a(targetBackupInfo3) && AbstractC3489d.m17505m()) {
            m126220E().m132688g();
        }
        TargetBackupInfo targetBackupInfo4 = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo4);
        if (targetBackupInfo4.m40954j() == 1) {
            ZdbApiCode zdbApiCode = new ZdbApiCode();
            String parent = new File(str).getParent();
            List list2 = this.f116847B;
            AbstractC19074t.m100205c(parent);
            list2.add(parent);
            C21690e c21690e = this.f116867y;
            TargetBackupInfo targetBackupInfo5 = this.f116848C;
            AbstractC19074t.m100205c(targetBackupInfo5);
            C24860q m116068z = C22447s.m116068z(c21690e, targetBackupInfo5);
            int[] iArr = (int[]) m116068z.m129215c();
            boolean[] zArr = (boolean[]) m116068z.m129216d();
            TargetBackupInfo targetBackupInfo6 = this.f116848C;
            AbstractC19074t.m100205c(targetBackupInfo6);
            C7956b.Companion.m41573b().m41551o0(Integer.parseInt(CoreUtility.f89233i), iArr, zArr, str, parent, m126232L.m132704a(), zdbApiCode, false, C22447s.m116050o0(targetBackupInfo6.m40951g()));
            if (zdbApiCode.error_code == 0) {
                AbstractC0924m0.m4237tl(true);
                Companion.m126302a();
                m126229I0(this, 8, null, 0L, 6, null);
                return;
            } else {
                m126288u(zdbApiCode);
                m126225G0(this, 2, zdbApiCode.error_code, "Restore error", 0L, 8, null);
                return;
            }
        }
        TargetBackupInfo targetBackupInfo7 = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo7);
        if (targetBackupInfo7.m40954j() == 0) {
            TargetBackupInfo targetBackupInfo8 = this.f116848C;
            AbstractC19074t.m100205c(targetBackupInfo8);
            try {
                try {
                    int m41398a = BackupRestoreUtils.m41398a(str, file.getAbsolutePath(), m126234M(targetBackupInfo8));
                    AbstractC23350e.m122777g("SMLBackupRestoreHandler", "decodeBackupFile time: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    if (m41398a == 1 && file.exists()) {
                        m126229I0(this, 5, file.getAbsolutePath(), 0L, 4, null);
                        C26220b.f124587a.m134840B(4, true, currentTimeMillis);
                        C26263i.m135048p(4);
                        return;
                    }
                    C26220b.m134820c("Decode failed. Result=" + m41398a + ", exists=" + file.exists());
                    if (file.exists()) {
                        m126229I0(this, 5, file.getAbsolutePath(), 0L, 4, null);
                        C26220b.f124587a.m134840B(4, true, currentTimeMillis);
                        C26263i.m135048p(4);
                        return;
                    }
                    m126225G0(this, 2, m41398a, "Decode backup file error", 0L, 8, null);
                    C26220b.f124587a.m134840B(4, false, currentTimeMillis);
                    TargetBackupInfo targetBackupInfo9 = this.f116848C;
                    AbstractC19074t.m100205c(targetBackupInfo9);
                    if (AbstractC22431c.m115870a(targetBackupInfo9)) {
                        AbstractC20887g.m109240r(18849, "Decode file error");
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    TargetBackupInfo targetBackupInfo10 = this.f116848C;
                    AbstractC19074t.m100205c(targetBackupInfo10);
                    if (AbstractC22431c.m115870a(targetBackupInfo10)) {
                        AbstractC20887g.m109240r(18849, "Decode Backup DB failed: " + e11);
                    }
                    throw new BackupRestoreException(1, "Decode DB failed: " + e11);
                }
            } catch (Throwable th2) {
                AbstractC23350e.m122777g("SMLBackupRestoreHandler", "decodeBackupFile time: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                throw th2;
            }
        }
        TargetBackupInfo targetBackupInfo11 = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo11);
        m126225G0(this, 4, targetBackupInfo11.m40954j(), "Db format not support", 0L, 8, null);
    }

    /* renamed from: V */
    private final void m126246V() {
        m126233L0(3);
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(C26263i.m135057v() + File.separator + "zalodbbackup.zalo.crypt");
        if (file.exists()) {
            file.delete();
        } else {
            File parentFile = file.getParentFile();
            if ((!parentFile.exists() || !parentFile.isDirectory()) && !parentFile.mkdirs()) {
                throw new BackupRestoreException("Download DB failed: Can not make dir " + parentFile);
            }
        }
        List list = this.f116847B;
        String absolutePath = file.getAbsolutePath();
        AbstractC19074t.m100207e(absolutePath, "getAbsolutePath(...)");
        list.add(absolutePath);
        TargetBackupInfo targetBackupInfo = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo);
        String m40964w = targetBackupInfo.m40964w();
        int m120897Ec = AbstractC23309i.m120897Ec();
        TargetBackupInfo targetBackupInfo2 = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo2);
        m126228I().m133046e(new C27273c(m40964w, file, m120897Ec, targetBackupInfo2.m40953i(), AbstractC0924m0.m4246u1()), new g(), new h(file, currentTimeMillis), new i(currentTimeMillis));
    }

    /* renamed from: W */
    private final boolean m126247W(int i11) {
        if (i11 != 1001) {
            return false;
        }
        if (!C22438j.m115948p(this.f116867y.f105269f)) {
            C21690e c21690e = this.f116867y;
            c21690e.f105270g = false;
            if (this.f116846A && c21690e.f105269f == 0) {
                this.f116846A = false;
                c21690e.m111882T(false);
                this.f116867y.f105269f = 8;
                AbstractC23309i.m121547Vx(8);
            }
            m126293x();
            m126298z0(9, null);
            return true;
        }
        throw new IllegalStateException("Request restore while no backup before".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b2  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m126248X() {
        String str;
        String str2;
        String str3;
        ZdbApiCode zdbApiCode;
        long j11;
        File file;
        long j12;
        long optLong;
        long j13;
        AbstractC0924m0.m4269uo(System.currentTimeMillis());
        m126233L0(9);
        C26263i.m135038f0();
        File file2 = new File(C7959d.Companion.m41852g(CoreUtility.f89233i), "zdb.backup");
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        String absolutePath = file2.getAbsolutePath();
        ZdbApiCode zdbApiCode2 = new ZdbApiCode();
        C25725b m132694o = m126220E().m132694o();
        if (m132694o.m132707d() != 0) {
            AbstractC20887g.m109217D(18846, null, 2, null);
        }
        float m3590Y2 = AbstractC0924m0.m3590Y2() / 100.0f;
        float m128411f = m126224G().m128411f() / 100.0f;
        int m128412g = m126224G().m128412g();
        String absolutePath2 = parentFile.getAbsolutePath();
        C24860q m116066y = C22447s.m116066y(this.f116867y);
        int[] iArr = (int[]) m116066y.m129215c();
        boolean[] zArr = (boolean[]) m116066y.m129216d();
        C26220b.m134829l("SMLBackupRestoreHandler", "oldCompressRatio=" + m3590Y2 + ", compressLevel=" + m128412g + ", bonusCompressRatio=" + m128411f + ", limitSizeBackup=" + this.f116854I);
        C7956b m41573b = C7956b.Companion.m41573b();
        String str4 = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str4, "currentUserUid");
        String m41540g = m41573b.m41540g(Integer.parseInt(str4), iArr, zArr, absolutePath2, absolutePath, m132694o.m132704a(), m128412g, this.f116854I, m3590Y2, m128411f, 0L, 0L, zdbApiCode2);
        if (zdbApiCode2.error_code == 0) {
            AbstractC23309i.m122180mq(m126241Q().mo124311f());
            try {
                if (m41540g.length() > 0) {
                    C26220b.m134829l("SMLBackupRestoreHandler", m41540g);
                    JSONObject jSONObject = new JSONObject(m41540g);
                    long optLong2 = jSONObject.optLong("orin_noMsgs");
                    long optInt = jSONObject.optInt("orin_noUids");
                    long optLong3 = jSONObject.optLong("noMsgs");
                    long optInt2 = jSONObject.optInt("noUids");
                    try {
                        optLong = jSONObject.optLong("backupFileSize");
                    } catch (JSONException e11) {
                        e = e11;
                        zdbApiCode = zdbApiCode2;
                        str = absolutePath2;
                        str2 = "SMLBackupRestoreHandler";
                        j11 = 0;
                        str3 = absolutePath;
                    }
                    try {
                        long optLong4 = jSONObject.optLong("totalUncompressSize");
                        j11 = 0;
                        if (optLong4 > 0) {
                            j13 = optInt2;
                            try {
                                AbstractC0924m0.m3549Wj((int) Math.ceil((optLong * 100) / optLong4));
                            } catch (JSONException e12) {
                                e = e12;
                                str = absolutePath2;
                                str2 = "SMLBackupRestoreHandler";
                                str3 = absolutePath;
                                zdbApiCode = zdbApiCode2;
                                C26220b.m134821d(str2, e);
                                file = new File(str3);
                                if (!file.exists()) {
                                }
                                this.f116867y.m111877O(j12);
                                m126229I0(this, 11, str3, 0L, 4, null);
                                List list = this.f116847B;
                                AbstractC19074t.m100205c(str);
                                list.add(str);
                                C26263i.m135048p(9);
                            }
                        } else {
                            j13 = optInt2;
                        }
                        this.f116850E = jSONObject.optLong("minTime");
                        str = absolutePath2;
                        str2 = "SMLBackupRestoreHandler";
                        str3 = absolutePath;
                        zdbApiCode = zdbApiCode2;
                        try {
                            m126221E0(optLong2, optInt, optLong3, j13);
                        } catch (JSONException e13) {
                            e = e13;
                            C26220b.m134821d(str2, e);
                            file = new File(str3);
                            if (!file.exists()) {
                            }
                            this.f116867y.m111877O(j12);
                            m126229I0(this, 11, str3, 0L, 4, null);
                            List list2 = this.f116847B;
                            AbstractC19074t.m100205c(str);
                            list2.add(str);
                            C26263i.m135048p(9);
                        }
                    } catch (JSONException e14) {
                        e = e14;
                        str = absolutePath2;
                        str2 = "SMLBackupRestoreHandler";
                        str3 = absolutePath;
                        zdbApiCode = zdbApiCode2;
                        j11 = 0;
                        C26220b.m134821d(str2, e);
                        file = new File(str3);
                        if (!file.exists()) {
                        }
                        this.f116867y.m111877O(j12);
                        m126229I0(this, 11, str3, 0L, 4, null);
                        List list22 = this.f116847B;
                        AbstractC19074t.m100205c(str);
                        list22.add(str);
                        C26263i.m135048p(9);
                    }
                } else {
                    str = absolutePath2;
                    str2 = "SMLBackupRestoreHandler";
                    str3 = absolutePath;
                    zdbApiCode = zdbApiCode2;
                    j11 = 0;
                }
            } catch (JSONException e15) {
                e = e15;
                str = absolutePath2;
                str2 = "SMLBackupRestoreHandler";
                str3 = absolutePath;
                zdbApiCode = zdbApiCode2;
            }
            file = new File(str3);
            if (!file.exists()) {
                j12 = file.length();
                C26220b.m134829l(str2, "Export DB: size=" + j12 + ", path=" + str3);
            } else {
                C26220b.m134833p(str2, "File backup not exist! ErrorCode=" + zdbApiCode.error_code);
                j12 = j11;
            }
            this.f116867y.m111877O(j12);
            m126229I0(this, 11, str3, 0L, 4, null);
        } else {
            str = absolutePath2;
            this.f116867y.m111874L(true);
            m126225G0(this, 1, zdbApiCode2.error_code, "Backup db error", 0L, 8, null);
        }
        List list222 = this.f116847B;
        AbstractC19074t.m100205c(str);
        list222.add(str);
        C26263i.m135048p(9);
    }

    /* renamed from: Y */
    private final void m126249Y() {
        TargetBackupInfo targetBackupInfo = null;
        m126235M0(8, null);
        m126214B();
        AbstractC23306f.m120584H0().m2628k(false, true);
        C19669z.Companion.m103232a().m103198O0();
        C25806c m126228I = m126228I();
        TargetBackupInfo targetBackupInfo2 = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo2);
        m126228I.m133037R(targetBackupInfo2.m40949e());
        C26263i.m135048p(8);
        C26220b.m134831n();
        if (C22438j.m115948p(this.f116867y.f105269f)) {
            TargetBackupInfo targetBackupInfo3 = this.f116848C;
            if (targetBackupInfo3 != null) {
                if (targetBackupInfo3.m40954j() == 0) {
                    targetBackupInfo = targetBackupInfo3;
                }
                if (targetBackupInfo != null) {
                    Companion.m126302a();
                }
            }
            m126229I0(this, 12, null, 0L, 6, null);
            return;
        }
        m126229I0(this, 9, null, 0L, 6, null);
    }

    /* renamed from: Z */
    private final void m126250Z() {
        m126233L0(17);
        C21688c.Companion.m111854a().m111842E(17, this.f116852G, this.f116867y);
        AbstractC23309i.m121694Zw(false);
        m126291w();
        try {
            m126230J().m126199K();
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
        }
        if (this.f116868z) {
            AbstractC0924m0.m3731cp(0);
            AbstractC0924m0.m3641Zo(0);
        }
        if (this.f116867y.m143172f()) {
            AbstractC23309i.m121547Vx(1);
        }
        this.f116867y.m143174i(System.currentTimeMillis());
        if (C26263i.m135055u().m135069I()) {
            m126228I().m133036P("");
        } else {
            this.f116867y.m111886X(false);
        }
        if (m126284r0()) {
            this.f116867y.m111886X(true);
        }
        m126233L0(0);
        if (C26263i.m135055u().m135069I()) {
            C21688c.Companion.m111854a().m111850w();
        }
        this.f116850E = 0L;
        if (AbstractC3489d.m17501i()) {
            C26220b.f124587a.m134844v(this.f116857L, this.f116867y);
        }
        C26263i.m135036e0();
        try {
            Thread.sleep(1000L);
        } catch (Exception e12) {
            C26220b.m134821d("SMLBackupRestoreHandler", e12);
        }
        try {
            if (!C26263i.m135055u().m135069I()) {
                C21690e c21690e = this.f116867y;
                if (c21690e.f105269f == 1) {
                    if (C22447s.m116048n(c21690e)) {
                    }
                }
                if (!C21688c.Companion.m111854a().m111847h(C22438j.m115945l())) {
                    String str = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str, "currentUserUid");
                    if (str.length() > 0) {
                        if (m126284r0()) {
                            C22440l.f109789p.m115980b();
                        } else {
                            C22440l.f109789p.m115981j(this.f116867y);
                        }
                        C25727d.c cVar = C25727d.Companion;
                        if (cVar.m132787j() || cVar.m132784g()) {
                            C22440l.f109789p.m115981j(this.f116867y);
                        }
                    }
                }
            }
            if (this.f116868z && this.f116867y.f105269f == 10) {
                C2556d.m12981o().m13007x(2);
            }
            C26263i.m135028Z(this.f116868z);
        } catch (Exception e13) {
            C26220b.m134821d("SMLBackupRestoreHandler", e13);
        }
        C26263i.m135055u().m135076h0();
        AbstractC0924m0.m3088Gm(false);
        if (AbstractC0924m0.m4227tb()) {
            C0822i.f2887p.m2150b(new Runnable() { // from class: oc.s
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerThreadC24218v.m126252a0();
                }
            });
        }
        this.f116856K = null;
        if (AbstractC3489d.m17514v() && C22447s.m116021W(this.f116857L)) {
            C23744a.Companion.m124119a().m124116d(150809, new Object[0]);
        }
    }

    /* renamed from: a0 */
    public static final void m126252a0() {
        C7961f.Companion.m42658b().m42654u();
    }

    /* renamed from: b0 */
    private final void m126254b0(String str) {
        m126235M0(7, str);
        m126285s(str);
        C26220b.m134829l("SMLBackupRestoreHandler", "handleInsertData(): syncDbPath=" + str);
        TargetBackupInfo targetBackupInfo = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo);
        m126282q0(str, targetBackupInfo);
    }

    /* renamed from: c0 */
    private final void m126256c0() {
        C26220b.m134829l("SMLBackupRestoreHandler", "Sync start with normal flow");
        m126233L0(1);
        C21690e c21690e = this.f116867y;
        c21690e.f105270g = false;
        if (C22438j.m115948p(c21690e.f105269f)) {
            C29210k.Companion.m145896a().m145824A0();
            AbstractC0924m0.m3088Gm(true);
            m126229I0(this, 3, null, 0L, 6, null);
        } else {
            m126295y();
            m126298z0(9, null);
        }
    }

    /* renamed from: d0 */
    private final boolean m126258d0(TargetBackupInfo targetBackupInfo) {
        if (C26263i.m135017L(targetBackupInfo)) {
            return false;
        }
        m126233L0(1);
        m126223F0(2, -17, "Client not support DB format type " + targetBackupInfo.m40954j(), 1000L);
        return true;
    }

    /* renamed from: e0 */
    private final boolean m126260e0(TargetBackupInfo targetBackupInfo) {
        if (AbstractC22431c.m115871b(targetBackupInfo)) {
            return false;
        }
        m126233L0(1);
        m126223F0(2, -15, "Client not support encrypt type " + targetBackupInfo.m40953i(), 1000L);
        return true;
    }

    /* renamed from: h0 */
    private final void m126264h0(String str) {
        m126235M0(5, str);
        m126285s(str);
        String m133025D = m126228I().m133025D(str);
        C26220b.m134817F(m133025D, this.f116867y);
        m126229I0(this, 7, m133025D, 0L, 4, null);
        C26263i.m135048p(5);
    }

    /* renamed from: i0 */
    private final boolean m126266i0() {
        int m121889f1 = AbstractC23309i.m121889f1();
        if (m121889f1 <= 1 || m121889f1 >= 17 || this.f116849D != 0) {
            return false;
        }
        String str = CoreUtility.f89233i;
        AbstractC19074t.m100207e(str, "currentUserUid");
        C19067n0 c19067n0 = C19067n0.f94947a;
        String format = String.format("Resume sync phase: %d", Arrays.copyOf(new Object[]{Integer.valueOf(m121889f1)}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        AbstractC20887g.m109231i(str, 17724, format, 0L, 17720, CoreUtility.f89236l);
        String m121927g1 = AbstractC23309i.m121927g1();
        m126233L0(1);
        if (C22438j.m115948p(this.f116867y.f105269f)) {
            m126229I0(this, m121889f1, m121927g1, 0L, 4, null);
        } else {
            m126298z0(m121889f1, m121927g1);
        }
        long j11 = this.f116851F;
        if (j11 > 0) {
            AbstractC0924m0.m4347xf(j11);
        }
        return true;
    }

    /* renamed from: j0 */
    private final void m126268j0() {
        if (AbstractC3489d.m17501i() && !C22447s.f109797a.m116077t0()) {
            C26263i.m135048p(1);
            m126233L0(0);
            C26220b.m134826i("SMLBackupRestoreHandler", "Not start Sync when user Cloud and Opt Out Backup!", null, 4, null);
            return;
        }
        AbstractC0924m0.m4210so(System.currentTimeMillis());
        this.f116857L = AbstractC23309i.m120897Ec();
        if (this.f116849D == 0) {
            try {
                if (!m126230J().m126201o("SYNC_MES")) {
                    AbstractC23775p0.m124197b("db");
                }
            } catch (Exception e11) {
                C26220b.m134821d("SMLBackupRestoreHandler", e11);
            }
            this.f116851F = AbstractC0924m0.m2979D0();
            C26263i.m135040g0();
        }
        if (m126284r0()) {
            this.f116867y.m111886X(true);
        }
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (AbstractC3489d.m17505m() && m126217C0(m135087t)) {
            return;
        }
        if (C22447s.m116017S(m135087t)) {
            int i11 = this.f116849D;
            if (i11 > 0) {
                C26220b.m134832o("retryDownloadCount=" + i11 + "! Cached backup info should be clear and null");
            }
            m126296y0(0, "Backup info already valid");
            C26263i.m135048p(1);
            return;
        }
        m126228I().m133049i(new j(), new k());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064 A[Catch: Exception -> 0x0011, TryCatch #0 {Exception -> 0x0011, blocks: (B:3:0x0004, B:5:0x000a, B:8:0x0029, B:10:0x0035, B:13:0x0040, B:15:0x0041, B:17:0x0064, B:18:0x006f, B:20:0x0013, B:22:0x001d), top: B:2:0x0004 }] */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m126270k0() {
        Exception exc;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (!AbstractC3489d.m17501i()) {
                if (AbstractC3489d.m17512t()) {
                }
                this.f116852G = 0;
                m126233L0(14);
                exc = this.f116856K;
                if (exc != null && C22438j.m115946n(this.f116867y.f105269f)) {
                    throw exc;
                }
                m126239P().mo98987d(this.f116867y, new InterfaceC27226d() { // from class: oc.t
                    public /* synthetic */ C24216t() {
                    }

                    @Override // p543uc.InterfaceC27226d
                    /* renamed from: a */
                    public final void mo98897a(int i11, int i12) {
                        HandlerThreadC24218v.m126272l0(HandlerThreadC24218v.this, i11, i12);
                    }
                });
                C21690e c21690e = this.f116867y;
                c21690e.m111872J(c21690e.m111889o() + (System.currentTimeMillis() - currentTimeMillis));
                if (this.f116855J instanceof C18880d) {
                    C26220b.m134835s(this.f116867y, 0, 0, null, 14, null);
                }
                m126229I0(this, 15, null, 0L, 6, null);
            }
            if (C22438j.m115946n(this.f116867y.f105269f)) {
                m126229I0(this, 17, null, 0L, 6, null);
                return;
            }
            this.f116852G = 0;
            m126233L0(14);
            exc = this.f116856K;
            if (exc != null) {
                throw exc;
            }
            m126239P().mo98987d(this.f116867y, new InterfaceC27226d() { // from class: oc.t
                public /* synthetic */ C24216t() {
                }

                @Override // p543uc.InterfaceC27226d
                /* renamed from: a */
                public final void mo98897a(int i11, int i12) {
                    HandlerThreadC24218v.m126272l0(HandlerThreadC24218v.this, i11, i12);
                }
            });
            C21690e c21690e2 = this.f116867y;
            c21690e2.m111872J(c21690e2.m111889o() + (System.currentTimeMillis() - currentTimeMillis));
            if (this.f116855J instanceof C18880d) {
            }
            m126229I0(this, 15, null, 0L, 6, null);
        } catch (Exception e11) {
            C21690e c21690e3 = this.f116867y;
            c21690e3.m111872J(c21690e3.m111889o() + (System.currentTimeMillis() - currentTimeMillis));
            m126231J0(e11);
        }
    }

    /* renamed from: l0 */
    public static final void m126272l0(HandlerThreadC24218v handlerThreadC24218v, int i11, int i12) {
        AbstractC19074t.m100208f(handlerThreadC24218v, "this$0");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("handleSyncMedia(): actionType=");
        sb2.append(i11);
        sb2.append(", progress=");
        sb2.append(i12);
        C21688c.Companion.m111854a().m111841D(14, i11, i12, handlerThreadC24218v.f116867y);
    }

    /* renamed from: m0 */
    private final void m126274m0(Bundle bundle) {
        int i11;
        String str;
        int i12;
        if (bundle != null) {
            i11 = bundle.getInt("extra_sync_error_code");
        } else {
            i11 = ZAbstractBase.ZVU_PROCESS_VIDEO_TO_WEBP;
        }
        if (bundle == null || (str = bundle.getString("extra_sync_error_mess")) == null) {
            str = "";
        }
        if (bundle != null) {
            i12 = bundle.getInt("extra_sync_error_pos");
        } else {
            i12 = 0;
        }
        C21689d c21689d = new C21689d(14, i12, i11, str);
        if (i11 != 2004 && i11 != 2006) {
            C22447s.m116026b0();
        } else {
            c21689d.m111862j(true);
        }
        this.f116867y.m111881S(c21689d, false);
        C26220b.f124587a.m134845w(14, false, i11, str);
        C26263i.m135026X(i12, i11, str);
        if (this.f116855J instanceof C18880d) {
            C26220b.m134834r(this.f116867y, i12, i11, str);
        }
        m126233L0(16);
        m126227H0(17, null, 1000L);
    }

    /* renamed from: n0 */
    private final void m126276n0() {
        m126233L0(15);
        m126229I0(this, 17, null, 0L, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TRY_ENTER, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3 A[Catch: Exception -> 0x0019, BackupRestoreException -> 0x001c, TRY_LEAVE, TryCatch #2 {BackupRestoreException -> 0x001c, Exception -> 0x0019, blocks: (B:3:0x0002, B:5:0x000e, B:8:0x0034, B:11:0x003c, B:12:0x0052, B:14:0x0053, B:16:0x005b, B:18:0x0064, B:20:0x0069, B:22:0x006e, B:24:0x0077, B:26:0x007b, B:28:0x0086, B:30:0x008a, B:32:0x008e, B:34:0x0099, B:36:0x00a4, B:38:0x00af, B:40:0x00b3, B:49:0x002c, B:50:0x0033), top: B:2:0x0002 }] */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m126278o0(Message message) {
        try {
            int i11 = message.what;
            if (!C26263i.m135055u().m135069I()) {
                if (!AbstractC19074t.m100204b(CoreUtility.f89233i, this.f116858p)) {
                }
                C26263i.m135056u0(i11);
                switch (i11) {
                    case 1:
                        m126268j0();
                        return;
                    case 2:
                    case 6:
                    case 10:
                    default:
                        throw new BackupRestoreException("Invalid phase: " + message);
                    case 3:
                        m126246V();
                        return;
                    case 4:
                        Object obj = message.obj;
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
                        m126245U((String) obj);
                        return;
                    case 5:
                        Object obj2 = message.obj;
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
                        m126264h0((String) obj2);
                        return;
                    case 7:
                        Object obj3 = message.obj;
                        AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                        m126254b0((String) obj3);
                        return;
                    case 8:
                        m126249Y();
                        return;
                    case 9:
                        m126248X();
                        return;
                    case 11:
                        Object obj4 = message.obj;
                        AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type kotlin.String");
                        m126280p0((String) obj4, i11);
                        return;
                    case 12:
                        m126244T();
                        return;
                    case 13:
                        m126243S(message.getData());
                        return;
                    case 14:
                        m126270k0();
                        return;
                    case 15:
                        m126276n0();
                        return;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        m126274m0(message.getData());
                        return;
                    case 17:
                        m126250Z();
                        quitSafely();
                        return;
                }
            }
            if (i11 != 13 && i11 != 16 && i11 != 17) {
                throw new BackupRestoreException("Interrupt process: Current user is logout or changed");
            }
            C26263i.m135056u0(i11);
            switch (i11) {
            }
        } catch (BackupRestoreException e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
            m126225G0(this, 100, e11.m37266a(), e11.getMessage(), 0L, 8, null);
        } catch (Exception e12) {
            C26220b.m134821d("SMLBackupRestoreHandler", e12);
            m126225G0(this, 200, -1, e12.getMessage(), 0L, 8, null);
        }
    }

    /* renamed from: p0 */
    private final void m126280p0(String str, int i11) {
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        m126235M0(11, str);
        m126285s(str);
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            long length = file.length();
            if (length <= m126224G().m128415j()) {
                JSONObject m126286t = m126286t();
                p pVar = new p(m126286t, this, currentTimeMillis, i11);
                n nVar = new n(currentTimeMillis);
                o oVar = new o(C21688c.Companion.m111854a().m111848i());
                long m126218D = m126218D();
                if (C26263i.m135055u().f124694g == null) {
                    str2 = "";
                } else {
                    str2 = C26263i.m135055u().f124694g;
                }
                int m126222F = m126222F();
                int m116003H = C22447s.m116003H();
                int m116002G = C22447s.m116002G();
                int m4246u1 = AbstractC0924m0.m4246u1();
                int m128416k = m126224G().m128416k();
                AbstractC19074t.m100205c(str2);
                C27271a c27271a = new C27271a(file, m126218D, m126222F, m126286t, str2, this.f116867y.m111897w(), m116003H, m116002G, m4246u1, m128416k);
                if (m126224G().m128394K()) {
                    AbstractC23306f.m120692n().m133026E(file, m126222F, new l(c27271a, pVar, nVar, oVar, this), new m());
                    return;
                }
                C26220b.m134827j("OFF Backup Division. Use default url to upload", null, 2, null);
                C25806c m120692n = AbstractC23306f.m120692n();
                AbstractC19074t.m100207e(m120692n, "provideBackupRestoreRepo(...)");
                C25806c.m133017Y(m120692n, c27271a, null, pVar, nVar, oVar, 2, null);
                return;
            }
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("Upload DB failed: File is too large (%d > %d)", Arrays.copyOf(new Object[]{Long.valueOf(length), Long.valueOf(m126224G().m128415j())}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            throw new BackupRestoreException(2, format);
        }
        throw new BackupRestoreException(1, "Upload DB failed: File not exist or invalid");
    }

    /* renamed from: q0 */
    private final void m126282q0(String str, TargetBackupInfo targetBackupInfo) {
        C7955a c7955a;
        C7955a c7955a2 = null;
        try {
            c7955a = new C7955a(str);
        } catch (SQLiteException e11) {
            e = e11;
        } catch (Exception e12) {
            e = e12;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!c7955a.m41469A(targetBackupInfo, this.f116867y, new q(str, currentTimeMillis, c7955a), currentTimeMillis)) {
                m126219D0(str, currentTimeMillis, c7955a);
            }
        } catch (SQLiteException e13) {
            e = e13;
            c7955a2 = c7955a;
            m126216C(c7955a2);
            C19067n0 c19067n0 = C19067n0.f94947a;
            String format = String.format("Insert data from Cross DB failed: (%d, %s)", Arrays.copyOf(new Object[]{Integer.valueOf(e.m41426a()), e.m41427b()}, 2));
            AbstractC19074t.m100207e(format, "format(...)");
            throw new BackupRestoreException(2, format);
        } catch (Exception e14) {
            e = e14;
            c7955a2 = c7955a;
            m126216C(c7955a2);
            throw e;
        }
    }

    /* renamed from: r0 */
    private final boolean m126284r0() {
        if (C22447s.m116021W(this.f116857L) && !C22447s.f109797a.m116073Y(this.f116857L) && this.f116867y.m143172f()) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private final void m126285s(String str) {
        if (str.length() != 0) {
        } else {
            throw new BackupRestoreException(-1, "Invalid DB path!");
        }
    }

    /* renamed from: t */
    private final JSONObject m126286t() {
        String str;
        JSONObject m126242R = m126242R();
        try {
            m126242R.put("compress_ratio", AbstractC0924m0.m3590Y2());
            m126242R.put("db_format", 1);
            m126242R.put("min_time_msg_at_all", this.f116850E);
            C25725b m132694o = m126220E().m132694o();
            if (m132694o.m132707d() == 0) {
                m126242R.put("db_encrypt_type", 0);
            } else {
                m126242R.put("db_secret_sha256", m132694o.m132706c());
                m126242R.put("db_encrypt_type", m132694o.m132707d());
            }
            JSONObject m119520g = AbstractC23195r2.m119520g();
            AbstractC19074t.m100207e(m119520g, "getDataHiddenChat(...)");
            String jSONObject = m119520g.toString();
            AbstractC19074t.m100207e(jSONObject, "toString(...)");
            m126242R.put("hidden_chat", C22447s.m116053q(jSONObject));
            if (this.f116867y.m111890p()) {
                str = "1";
            } else {
                str = "0";
            }
            m126242R.put("allow_e2ee_chat", str);
        } catch (JSONException e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
        }
        return m126242R;
    }

    /* renamed from: t0 */
    private final void m126287t0() {
        if (!this.f116867y.m111863A() || !this.f116867y.m111898x()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
                this.f116867y.m111880R(currentTimeMillis);
                m126239P().mo98989g(this.f116867y, new InterfaceC27226d() { // from class: oc.u
                    public /* synthetic */ C24217u() {
                    }

                    @Override // p543uc.InterfaceC27226d
                    /* renamed from: a */
                    public final void mo98897a(int i11, int i12) {
                        HandlerThreadC24218v.m126289u0(HandlerThreadC24218v.this, i11, i12);
                    }
                });
            } catch (Exception e11) {
                if ((e11 instanceof BackupRestoreMediaException) && ((BackupRestoreMediaException) e11).m37267a() == 2014) {
                    this.f116867y.m111874L(true);
                    C26220b.m134821d("SMLBackupRestoreHandler", e11);
                } else {
                    C26220b.m134821d("SMLBackupRestoreHandler", e11);
                    this.f116856K = e11;
                }
            }
        } finally {
            this.f116867y.m111872J(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* renamed from: u */
    private final void m126288u(ZdbApiCode zdbApiCode) {
        if (zdbApiCode.error_code == 4 && !C26263i.m135055u().m135069I()) {
            Companion.m126302a();
        }
    }

    /* renamed from: u0 */
    public static final void m126289u0(HandlerThreadC24218v handlerThreadC24218v, int i11, int i12) {
        AbstractC19074t.m100208f(handlerThreadC24218v, "this$0");
        C21688c.Companion.m111854a().m111841D(1, i11, i12, handlerThreadC24218v.f116867y);
    }

    /* renamed from: v0 */
    public final void m126290v0(JSONObject jSONObject, File file, long j11) {
        boolean m127126v;
        if (file.exists()) {
            String m122785a = AbstractC23352g.m122785a(file);
            TargetBackupInfo targetBackupInfo = this.f116848C;
            AbstractC19074t.m100205c(targetBackupInfo);
            String m40949e = targetBackupInfo.m40949e();
            m127126v = AbstractC24341v.m127126v(m122785a, m40949e, true);
            if (m127126v) {
                m126229I0(this, 4, file.getAbsolutePath(), 0L, 4, null);
                C26220b.f124587a.m134840B(3, true, j11);
                C26263i.m135048p(3);
                return;
            }
            m126225G0(this, 1, 1, "Download file success checksum not match: downloadFileHash=" + m122785a + ", checksum=" + m40949e, 0L, 8, null);
            C26220b.f124587a.m134840B(3, false, j11);
            return;
        }
        m126225G0(this, 1, 2, "Download file success but file not exist", 0L, 8, null);
        C26220b.f124587a.m134840B(3, false, j11);
    }

    /* renamed from: w */
    private final void m126291w() {
        try {
            for (String str : this.f116847B) {
                C26220b.m134826i("SMLBackupRestoreHandler", "Delete temp file: " + str, null, 4, null);
                AbstractC23041d2.m118207f(new File(str));
            }
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
        }
    }

    /* renamed from: w0 */
    public final void m126292w0(int i11, String str, long j11) {
        if (i11 == 417) {
            int i12 = this.f116849D;
            if (i12 != 0 && i12 != 1 && i12 != 2) {
                m126225G0(this, 3, i11, "Link expired and retry to much: " + i12, 0L, 8, null);
                C26220b.f124587a.m134840B(3, false, j11);
                return;
            }
            C26263i.m135055u().m135092z0(null, null);
            this.f116849D++;
            m126229I0(this, 1, null, 0L, 6, null);
            return;
        }
        m126225G0(this, 2, i11, str, 0L, 8, null);
        C26220b.f124587a.m134840B(3, false, j11);
    }

    /* renamed from: x */
    private final void m126293x() {
    }

    /* renamed from: x0 */
    public final void m126294x0(int i11, String str) {
        C26220b.m134829l("SMLBackupRestoreHandler", "onGetBackupInfoResultFailed(): error=" + i11 + ", mes=" + str);
        m126212A();
        m126233L0(1);
        m126225G0(this, 2, i11, "Get backup info result: FAIL", 0L, 8, null);
    }

    /* renamed from: y */
    private final void m126295y() {
        if (this.f116848C == null) {
            return;
        }
        try {
            m126228I().m133058t();
        } catch (Exception e11) {
            C26220b.m134821d("SMLBackupRestoreHandler", e11);
        }
    }

    /* renamed from: y0 */
    public final void m126296y0(int i11, String str) {
        C26220b.m134829l("SMLBackupRestoreHandler", "onGetBackupInfoResultSuccess(): error=" + i11 + ", mes=" + str);
        m126212A();
        if (m126247W(i11)) {
            return;
        }
        TargetBackupInfo targetBackupInfo = this.f116848C;
        AbstractC19074t.m100205c(targetBackupInfo);
        if (m126260e0(targetBackupInfo)) {
            return;
        }
        if (C22438j.m115948p(this.f116867y.f105269f)) {
            TargetBackupInfo targetBackupInfo2 = this.f116848C;
            AbstractC19074t.m100205c(targetBackupInfo2);
            if (m126258d0(targetBackupInfo2)) {
                return;
            }
        }
        if (m126266i0()) {
            return;
        }
        m126256c0();
    }

    /* renamed from: z */
    public final int m126297z(int i11, int i12) {
        return i11 + ((i12 * 15) / 100);
    }

    /* renamed from: z0 */
    private final void m126298z0(int i11, String str) {
        C26220b.m134829l("SMLBackupRestoreHandler", "onPrepareDataAndRedirectFlowBackup: " + i11);
        m126287t0();
        m126229I0(this, i11, str, 0L, 4, null);
    }

    /* renamed from: K */
    public final String m126299K() {
        return this.f116858p;
    }

    /* renamed from: K0 */
    public final void m126300K0(boolean z11) {
        this.f116846A = z11;
    }

    /* renamed from: N */
    public final C21690e m126301N() {
        return this.f116867y;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        Handler m126236N0 = m126236N0();
        this.f116859q = m126236N0;
        if (m126236N0 != null) {
            m126236N0.sendEmptyMessageDelayed(1, 200L);
        }
    }
}
