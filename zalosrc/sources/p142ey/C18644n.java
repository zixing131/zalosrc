package p142ey;

import ae.C0766k;
import af0.AbstractC0777e;
import ag0.AbstractC0837p0;
import ag0.AbstractC0852x;
import ag0.C0824j;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.text.TextUtils;
import androidx.core.util.C1483e;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalocore.CoreUtility;
import d60.C17793b;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23006a0;
import me0.AbstractC23028c0;
import me0.AbstractC23056e6;
import me0.AbstractC23088h5;
import me0.AbstractC23262x6;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p248iy.AbstractC20887g;
import p304ks.C21923i;
import p304ks.C21927m;
import p304ks.C21928n;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p401or.C24417g;
import p461qu.AbstractC25495a;
import p645xh.C29628e;
import p716zh.C31849b1;
import p716zh.C31901e8;
import rw.C25982c;
import rw.C25983d;
import rw.C25985f;

/* renamed from: ey.n */
/* loaded from: classes.dex */
public class C18644n implements InterfaceC18632b {

    /* renamed from: m */
    static final C18644n f93819m = new C18644n();

    /* renamed from: n */
    public static int f93820n = 0;

    /* renamed from: a */
    private final C18635e f93821a;

    /* renamed from: b */
    private final C18636f f93822b;

    /* renamed from: c */
    int f93823c;

    /* renamed from: d */
    boolean f93824d;

    /* renamed from: e */
    final AtomicBoolean f93825e;

    /* renamed from: f */
    final AtomicBoolean f93826f;

    /* renamed from: g */
    public final AtomicBoolean f93827g;

    /* renamed from: h */
    public final AtomicBoolean f93828h;

    /* renamed from: i */
    final C25982c f93829i;

    /* renamed from: j */
    private final C25982c.a f93830j;

    /* renamed from: k */
    private boolean f93831k;

    /* renamed from: l */
    e f93832l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ey.n$a */
    /* loaded from: classes.dex */
    public class a implements C25982c.a {
        a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x007f, code lost:            return false;     */
        @Override // rw.C25982c.a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo98562a(C25985f c25985f) {
            switch (c25985f.f123961a) {
                case 1001:
                    C18644n.this.f93829i.removeMessages(1001);
                    C18644n.this.m98548j();
                    break;
                case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                    C18644n.this.f93829i.removeMessages(ZAbstractBase.ZVU_BLEND_PERCENTAGE);
                    C18644n.this.m98549k();
                    break;
                case ZAbstractBase.ZVU_BLEND_GEN_THUMB /* 1003 */:
                    C18644n.this.m98542M();
                    break;
                case 1004:
                    C18644n.this.f93829i.removeMessages(1004);
                    C17793b.m93923d().m93935p();
                    C18644n.this.m98561z();
                    C17793b.m93923d().m93934o();
                    C18644n.this.f93829i.sendEmptyMessage(1008);
                    break;
                case 1005:
                    C18644n.this.m98546h();
                    break;
                case 1006:
                    C18644n.this.m98545g((ContactProfile) c25985f.f123964d);
                    break;
                case 1007:
                    C18644n.this.m98541J((String) c25985f.f123964d);
                    break;
                case 1008:
                    C18644n.this.m98560y(false);
                    break;
                case 1009:
                    Object obj = c25985f.f123964d;
                    if (obj instanceof List) {
                        C18644n.this.m98526K((List) obj);
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: ey.n$b */
    /* loaded from: classes4.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ List f93834a;

        b(List list) {
            this.f93834a = list;
        }

        /* renamed from: e */
        public /* synthetic */ void m98565e(List list, Object obj) {
            try {
                try {
                    C7960e.m41971c6().m42297Vc(list);
                    C18644n.this.m98535B(obj);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                AbstractC20887g.m109232j(CoreUtility.f89233i, 80018, "", 0L, 80010, CoreUtility.f89236l);
                C18644n.this.f93824d = false;
            }
        }

        /* renamed from: f */
        public /* synthetic */ void m98566f(List list) {
            try {
                try {
                    C7960e.m41971c6().m42297Vc(list);
                    AbstractC20887g.m109232j(CoreUtility.f89233i, 80017, "", 0L, 80010, CoreUtility.f89236l);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C18644n.this.f93824d = false;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                AbstractC20110a.m104535d("updateZaloFriendProfileInternal: %s", c20096c);
                C25982c c25982c = C18644n.this.f93829i;
                if (c25982c != null) {
                    c25982c.m133826j(new Runnable() { // from class: ey.o

                        /* renamed from: q */
                        public final /* synthetic */ List f93844q;

                        public /* synthetic */ RunnableC18645o(List list) {
                            r2 = list;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C18644n.b.this.m98566f(r2);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C25982c c25982c = C18644n.this.f93829i;
                if (c25982c != null) {
                    c25982c.m133826j(new Runnable() { // from class: ey.p

                        /* renamed from: q */
                        public final /* synthetic */ List f93846q;

                        /* renamed from: r */
                        public final /* synthetic */ Object f93847r;

                        public /* synthetic */ RunnableC18646p(List list, Object obj2) {
                            r2 = list;
                            r3 = obj2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C18644n.b.this.m98565e(r2, r3);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: ey.n$c */
    /* loaded from: classes4.dex */
    public class c implements InterfaceC20094a {
        c() {
        }

        /* renamed from: d */
        public /* synthetic */ void m98568d(Object obj) {
            C18644n.this.m98537D(obj);
            AbstractC20887g.m109232j(CoreUtility.f89233i, 80015, "", 0L, 80010, CoreUtility.f89236l);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC20110a.m104535d("fetchZaloFriendFromServerSocketInternal: %s", c20096c);
            AbstractC23309i.m121728as(System.currentTimeMillis() - 43200000);
            AbstractC20887g.m109232j(CoreUtility.f89233i, 80014, "", 0L, 80010, CoreUtility.f89236l);
            C18644n.this.f93828h.set(false);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    AbstractC20110a.m104535d("fetchZaloFriendFromServerSocketInternal: %s", obj);
                    C18644n.this.f93829i.m133826j(new Runnable() { // from class: ey.q

                        /* renamed from: q */
                        public final /* synthetic */ Object f93849q;

                        public /* synthetic */ RunnableC18647q(Object obj2) {
                            r2 = obj2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C18644n.c.this.m98568d(r2);
                        }
                    });
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                C18644n.this.f93828h.set(false);
            }
        }
    }

    /* renamed from: ey.n$d */
    /* loaded from: classes4.dex */
    public class d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ String f93837a;

        d(String str) {
            this.f93837a = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void m98570d(String str, Object obj) {
            boolean z11;
            StringBuilder sb2 = new StringBuilder();
            try {
                try {
                    C18644n.this.f93823c = 0;
                    if (!TextUtils.equals(str, CoreUtility.f89233i)) {
                        C21923i.m114291c("Interrupt by uid, uidRequest=" + str + ", currentUserUid=" + CoreUtility.f89233i);
                    } else {
                        z11 = C18644n.this.m98536C(str, obj);
                        if (z11) {
                            try {
                                C18644n.this.f93829i.sendEmptyMessage(1008);
                                AbstractC0852x.m2330G();
                            } catch (Exception e11) {
                                e = e11;
                                C21923i.m114289a(e);
                                sb2.append(e);
                                if (z11) {
                                    if (!AbstractC23304d.f113427q1.get() && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                                        AbstractC23309i.m121728as(System.currentTimeMillis());
                                    }
                                    C18644n.m98524E();
                                    AbstractC23088h5.m118426g();
                                    C19669z.m103146Y().m103198O0();
                                    C23744a.m124114c().m124116d(6078, new Object[0]);
                                    PrivacyInfo.m45121B(true);
                                    PrivacyInfo.m45135z(true);
                                    C24417g c24417g = C24417g.f117907a;
                                    c24417g.m127704f(2, true);
                                    c24417g.m127704f(3, true);
                                    AbstractC0924m0.m3518Vh(false);
                                }
                                AbstractC20887g.m109232j(str, 80012, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                                C18644n.this.f93827g.set(false);
                            }
                        }
                        if (z11) {
                            if (!AbstractC23304d.f113427q1.get() && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                                AbstractC23309i.m121728as(System.currentTimeMillis());
                            }
                            C18644n.m98524E();
                            AbstractC23088h5.m118426g();
                            C19669z.m103146Y().m103198O0();
                            C23744a.m124114c().m124116d(6078, new Object[0]);
                            PrivacyInfo.m45121B(true);
                            PrivacyInfo.m45135z(true);
                            C24417g c24417g2 = C24417g.f117907a;
                            c24417g2.m127704f(2, true);
                            c24417g2.m127704f(3, true);
                            AbstractC0924m0.m3518Vh(false);
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    z11 = true;
                } catch (Throwable th2) {
                    th = th2;
                    if (1 != 0) {
                    }
                    AbstractC20887g.m109232j(str, 80012, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                    C18644n.this.f93827g.set(false);
                    throw th;
                }
                AbstractC20887g.m109232j(str, 80012, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                C18644n.this.f93827g.set(false);
            } catch (Throwable th3) {
                th = th3;
                if (1 != 0) {
                    if (!AbstractC23304d.f113427q1.get() && !TextUtils.isEmpty(CoreUtility.f89233i)) {
                        AbstractC23309i.m121728as(System.currentTimeMillis());
                    }
                    C18644n.m98524E();
                    AbstractC23088h5.m118426g();
                    C19669z.m103146Y().m103198O0();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                    PrivacyInfo.m45121B(true);
                    PrivacyInfo.m45135z(true);
                    C24417g c24417g3 = C24417g.f117907a;
                    c24417g3.m127704f(2, true);
                    c24417g3.m127704f(3, true);
                    AbstractC0924m0.m3518Vh(false);
                }
                AbstractC20887g.m109232j(str, 80012, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                C18644n.this.f93827g.set(false);
                throw th;
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(17:2|(3:94|95|(14:97|(1:99)(1:100)|9|10|(1:12)|(1:16)|18|(1:27)|28|(1:34)|35|(1:37)|38|39))|4|(2:6|(13:8|9|10|(0)|(2:14|16)|18|(3:20|22|27)|28|(3:30|32|34)|35|(0)|38|39))|93|9|10|(0)|(0)|18|(0)|28|(0)|35|(0)|38|39) */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:            r3.append(r0);        r3.append(" - ");     */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x016e, code lost:            r5 = r3.toString();     */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x0065, code lost:            r0 = e;     */
        /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[Catch: all -> 0x0062, Exception -> 0x0065, TryCatch #0 {all -> 0x0062, blocks: (B:10:0x0053, B:12:0x005f, B:14:0x006a, B:16:0x0074, B:44:0x00fc, B:46:0x0109), top: B:2:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[Catch: all -> 0x0062, Exception -> 0x0065, TryCatch #0 {all -> 0x0062, blocks: (B:10:0x0053, B:12:0x005f, B:14:0x006a, B:16:0x0074, B:44:0x00fc, B:46:0x0109), top: B:2:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0109 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:10:0x0053, B:12:0x005f, B:14:0x006a, B:16:0x0074, B:44:0x00fc, B:46:0x0109), top: B:2:0x0019 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x016e  */
        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo926a(C20096c c20096c) {
            long j11;
            String str;
            int i11;
            int i12;
            AbstractC20110a.m104538g("getZaloFriend: %s", c20096c);
            StringBuilder sb2 = new StringBuilder();
            String str2 = "";
            try {
                if (c20096c != null) {
                    try {
                    } catch (Exception e11) {
                        Exception e12 = e11;
                        j11 = 86400000;
                        C21923i.m114289a(e12);
                        if (!TextUtils.isEmpty(e12.toString())) {
                        }
                        if (!AbstractC23304d.f113427q1.get()) {
                            AbstractC23309i.m121728as((System.currentTimeMillis() - 86400000) + j11);
                        }
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            AbstractC23309i.m121659Yy(1);
                            C19669z.m103146Y().m103198O0();
                        }
                        C18644n.m98524E();
                        str = this.f93837a;
                        i11 = 80011;
                        if (!TextUtils.isEmpty(sb2.toString())) {
                        }
                        AbstractC20887g.m109232j(str, i11, str2, 0L, 80010, CoreUtility.f89236l);
                        C18644n.this.f93827g.set(false);
                    } catch (Throwable th2) {
                        th = th2;
                        if (!AbstractC23304d.f113427q1.get() && !TextUtils.isEmpty(CoreUtility.f89233i) && (TextUtils.equals(this.f93837a, CoreUtility.f89233i) || (c20096c != null && c20096c.m104491c() == -69))) {
                            AbstractC23309i.m121728as((System.currentTimeMillis() - 86400000) + 86400000);
                        }
                        if (!TextUtils.isEmpty(CoreUtility.f89233i) && TextUtils.equals(this.f93837a, CoreUtility.f89233i) && AbstractC23309i.m120824Cd() == 0) {
                            AbstractC23309i.m121659Yy(1);
                            C19669z.m103146Y().m103198O0();
                        }
                        C18644n.m98524E();
                        String str3 = this.f93837a;
                        if (!TextUtils.isEmpty(sb2.toString())) {
                            str2 = sb2.toString();
                        }
                        AbstractC20887g.m109232j(str3, 80011, str2, 0L, 80010, CoreUtility.f89236l);
                        C18644n.this.f93827g.set(false);
                        throw th;
                    }
                    if (c20096c.m104491c() == -69) {
                        if (C18644n.this.m98559v()) {
                            j11 = AbstractC23304d.m120542m(AbstractC23304d.f113397j.length - 1);
                        } else {
                            j11 = 86400000;
                        }
                        C18644n c18644n = C18644n.this;
                        i12 = c18644n.f93823c + 1;
                        c18644n.f93823c = i12;
                        if (i12 == AbstractC23304d.f113397j.length) {
                            c18644n.f93823c = 0;
                        }
                        if (c20096c != null && !TextUtils.isEmpty(c20096c.m104492d())) {
                            sb2.append(c20096c.m104491c());
                            sb2.append(" - ");
                            sb2.append(c20096c.m104492d());
                        }
                        if (!AbstractC23304d.f113427q1.get() && !TextUtils.isEmpty(CoreUtility.f89233i) && (TextUtils.equals(this.f93837a, CoreUtility.f89233i) || (c20096c != null && c20096c.m104491c() == -69))) {
                            AbstractC23309i.m121728as((System.currentTimeMillis() - 86400000) + j11);
                        }
                        if (!TextUtils.isEmpty(CoreUtility.f89233i) && TextUtils.equals(this.f93837a, CoreUtility.f89233i) && AbstractC23309i.m120824Cd() == 0) {
                            AbstractC23309i.m121659Yy(1);
                            C19669z.m103146Y().m103198O0();
                        }
                        C18644n.m98524E();
                        str = this.f93837a;
                        i11 = 80011;
                        if (!TextUtils.isEmpty(sb2.toString())) {
                            str2 = sb2.toString();
                        }
                        AbstractC20887g.m109232j(str, i11, str2, 0L, 80010, CoreUtility.f89236l);
                        C18644n.this.f93827g.set(false);
                    }
                }
                int i13 = C18644n.this.f93823c;
                if (i13 >= 0) {
                    long[] jArr = AbstractC23304d.f113397j;
                    if (i13 < jArr.length) {
                        j11 = jArr[i13];
                        C18644n c18644n2 = C18644n.this;
                        i12 = c18644n2.f93823c + 1;
                        c18644n2.f93823c = i12;
                        if (i12 == AbstractC23304d.f113397j.length) {
                        }
                        if (c20096c != null) {
                            sb2.append(c20096c.m104491c());
                            sb2.append(" - ");
                            sb2.append(c20096c.m104492d());
                        }
                        if (!AbstractC23304d.f113427q1.get()) {
                            AbstractC23309i.m121728as((System.currentTimeMillis() - 86400000) + j11);
                        }
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            AbstractC23309i.m121659Yy(1);
                            C19669z.m103146Y().m103198O0();
                        }
                        C18644n.m98524E();
                        str = this.f93837a;
                        i11 = 80011;
                        if (!TextUtils.isEmpty(sb2.toString())) {
                        }
                        AbstractC20887g.m109232j(str, i11, str2, 0L, 80010, CoreUtility.f89236l);
                        C18644n.this.f93827g.set(false);
                    }
                }
                j11 = AbstractC23304d.m120542m(AbstractC23304d.f113397j.length - 1);
                C18644n c18644n22 = C18644n.this;
                i12 = c18644n22.f93823c + 1;
                c18644n22.f93823c = i12;
                if (i12 == AbstractC23304d.f113397j.length) {
                }
                if (c20096c != null) {
                }
                if (!AbstractC23304d.f113427q1.get()) {
                }
                if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                }
                C18644n.m98524E();
                str = this.f93837a;
                i11 = 80011;
                if (!TextUtils.isEmpty(sb2.toString())) {
                }
                AbstractC20887g.m109232j(str, i11, str2, 0L, 80010, CoreUtility.f89236l);
                C18644n.this.f93827g.set(false);
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C25982c c25982c = C18644n.this.f93829i;
            if (c25982c != null) {
                c25982c.m133826j(new Runnable() { // from class: ey.r

                    /* renamed from: q */
                    public final /* synthetic */ String f93851q;

                    /* renamed from: r */
                    public final /* synthetic */ Object f93852r;

                    public /* synthetic */ RunnableC18648r(String str, Object obj2) {
                        r2 = str;
                        r3 = obj2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C18644n.d.this.m98570d(r2, r3);
                    }
                });
            } else {
                AbstractC20887g.m109232j(CoreUtility.f89233i, 80012, "handler NULL", 0L, 80010, CoreUtility.f89236l);
            }
        }
    }

    /* renamed from: ey.n$e */
    /* loaded from: classes4.dex */
    public static class e extends Thread {

        /* renamed from: p */
        boolean f93839p;

        /* renamed from: q */
        Set f93840q;

        /* renamed from: ey.n$e$a */
        /* loaded from: classes4.dex */
        class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ List f93841a;

            a(List list) {
                this.f93841a = list;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                if (this.f93841a.size() > 0 && !e.this.f93839p) {
                    C21928n.m114372h().m114384n(this.f93841a);
                }
            }
        }

        public e(Set set) {
            super("Z:UpdateEmptyPhone");
            this.f93840q = set;
            this.f93839p = false;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f93840q != null && !this.f93839p) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.f93840q) {
                        try {
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        if (this.f93839p) {
                            return;
                        }
                        C31901e8 m2801g = AbstractC0906d0.m2801g(MainApplication.getAppContext(), str);
                        if (m2801g != null) {
                            String m153298m = m2801g.m153298m();
                            if (!TextUtils.isEmpty(m153298m) && !AbstractC23056e6.f112062a.equals(m153298m)) {
                                arrayList.add(new C1483e(str, m153298m));
                            }
                        }
                    }
                    if (arrayList.size() > 0 && !this.f93839p) {
                        C0824j.m2153b(new a(arrayList));
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    private C18644n() {
        C18635e c18635e = new C18635e();
        this.f93821a = c18635e;
        this.f93822b = new C18636f(c18635e);
        this.f93823c = 0;
        this.f93824d = false;
        this.f93825e = new AtomicBoolean(false);
        this.f93826f = new AtomicBoolean(false);
        this.f93827g = new AtomicBoolean(false);
        this.f93828h = new AtomicBoolean(false);
        a aVar = new a();
        this.f93830j = aVar;
        this.f93831k = false;
        this.f93832l = null;
        C25983d c25983d = new C25983d("ZaloFriendManager-handler");
        c25983d.start();
        C25982c c25982c = new C25982c(c25983d.m133836a(), aVar);
        this.f93829i = c25982c;
        c25982c.sendEmptyMessage(1004);
        AbstractC0777e.m1935a("friends-manager-init");
    }

    /* renamed from: E */
    public static void m98524E() {
        C21927m.m114302u().m114336h0();
        AbstractC20110a.m104535d("ZaloFriendManager refreshPhoneBookTab", new Object[0]);
    }

    /* renamed from: H */
    private boolean m98525H(List list) {
        boolean z11 = false;
        if (list == null || list.isEmpty()) {
            return false;
        }
        synchronized (this.f93821a) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ContactProfile mo98491j = this.f93821a.mo98491j((String) it.next());
                    if (mo98491j != null) {
                        this.f93821a.remove(mo98491j);
                        z11 = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:            if (r0 == null) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:            if (r3 == false) goto L93;     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m98526K(List list) {
        if (list != null && !list.isEmpty()) {
            Object[] objArr = null;
            try {
                try {
                    C21928n.m114372h().m114373b(list);
                    C23744a.m124114c().m124116d(65, new Object[0]);
                    int size = list.size();
                    int i11 = 0;
                    boolean z11 = false;
                    while (i11 < size) {
                        try {
                            String str = (String) list.get(i11);
                            if (!AbstractC25495a.m132084i(str) && AbstractC23306f.m120562A().m2529X(str) && C7959d.m41638d1().m41774b3(str, 2) > 0 && !z11) {
                                z11 = true;
                            }
                            i11++;
                            z11 = z11;
                        } catch (Exception e11) {
                            e = e11;
                            objArr = z11 ? 1 : 0;
                            e.printStackTrace();
                        } catch (Throwable th2) {
                            th = th2;
                            objArr = z11 ? 1 : 0;
                            if (objArr != null) {
                                C19669z.m103146Y().m103198O0();
                            }
                            throw th;
                        }
                    }
                    boolean m98525H = m98525H(list);
                    if (m98525H) {
                        m98524E();
                        objArr = new Object[0];
                        C23744a.m124114c().m124116d(6078, objArr);
                    }
                    if (!m98525H) {
                    }
                } catch (Exception e12) {
                    e = e12;
                }
                C19669z.m103146Y().m103198O0();
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: L */
    private void m98527L() {
        try {
            AbstractC23309i.m120791Bh(false);
            if (AbstractC23309i.m122414t0() == 0) {
                if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                    AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: ey.m

                        /* renamed from: p */
                        public final /* synthetic */ String f93818p;

                        public /* synthetic */ RunnableC18643m(String str) {
                            r1 = str;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C18644n.m98533x(r1);
                        }
                    });
                }
                AbstractC23309i.m120792Bi(2);
            }
            m98560y(true);
            if (AbstractC23309i.m120824Cd() == 0) {
                AbstractC23309i.m121659Yy(3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static C18644n m98531l() {
        return f93819m;
    }

    /* renamed from: w */
    public static /* synthetic */ int m98532w(ContactProfile contactProfile, ContactProfile contactProfile2) {
        return contactProfile.f42440t.compareToIgnoreCase(contactProfile2.f42440t);
    }

    /* renamed from: x */
    public static /* synthetic */ void m98533x(String str) {
        C7959d.m41638d1().m41771a3(2, str);
    }

    /* renamed from: A */
    public void m98534A() {
        if (!TextUtils.isEmpty(CoreUtility.f89233i) && !AbstractC23304d.f113427q1.get() && !AbstractC23304d.f113431r1.get()) {
            if (Math.abs(AbstractC23309i.m120781B7() - System.currentTimeMillis()) > 86400000 && AbstractC23309i.m121366R0() % 8 == 0 && !m98531l().f93827g.get()) {
                this.f93829i.sendEmptyMessage(1001);
                return;
            }
            if (Math.abs(AbstractC23309i.m120781B7() - System.currentTimeMillis()) > 86400000 && AbstractC23309i.m121366R0() % 8 != 0 && !m98531l().f93828h.get()) {
                this.f93829i.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_PERCENTAGE);
            } else if (AbstractC23309i.m122086k9() > 0 && !m98531l().f93824d) {
                this.f93829i.sendEmptyMessage(ZAbstractBase.ZVU_BLEND_GEN_THUMB);
            }
        }
    }

    /* renamed from: B */
    void m98535B(Object obj) {
        String str;
        int i11;
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                if (jSONArray.length() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            ContactProfile contactProfile = new ContactProfile(jSONObject.optString("userId"));
                            contactProfile.f42443u = jSONObject.optString("username");
                            contactProfile.f42437s = jSONObject.optString("displayName");
                            contactProfile.f42446v = jSONObject.optString("avatar");
                            contactProfile.f42455y = jSONObject.optString("phoneNumber");
                            contactProfile.f42336F = jSONObject.optLong("lastActionTime");
                            contactProfile.f42382U0 = jSONObject.optInt("isActive");
                            contactProfile.f42449w = jSONObject.optInt("gender", 0);
                            int optInt = jSONObject.optInt("isValid");
                            contactProfile.f42460z1 = jSONObject.optString("uname");
                            contactProfile.f42347I1 = jSONObject.optLong("lastUpdateTime");
                            contactProfile.m40407h1(jSONObject.optString("globalId"));
                            contactProfile.f42400b0 = jSONObject.optLong("dob");
                            int optInt2 = jSONObject.optInt("isFr", 0);
                            if (optInt == 1 && optInt2 == 1) {
                                contactProfile.f42330D = System.currentTimeMillis();
                                arrayList.add(contactProfile);
                            } else {
                                C21928n.m114372h().m114383m(contactProfile.f42434r);
                                C21927m.m114302u().m114350o0(contactProfile.f42434r);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            sb2.append(e11.toString());
                        }
                    }
                    C21928n.m114372h().m114380j(arrayList, false, 80024, false);
                    m98556s("fetchZaloFriendHttp");
                }
                str = CoreUtility.f89233i;
                i11 = 80019;
            } catch (Throwable th2) {
                AbstractC20887g.m109232j(CoreUtility.f89233i, 80019, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                throw th2;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            sb2.append(e12.toString());
            str = CoreUtility.f89233i;
            i11 = 80019;
        }
        AbstractC20887g.m109232j(str, i11, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    boolean m98536C(String str, Object obj) {
        long j11;
        HashMap hashMap;
        ArrayList arrayList;
        HashSet hashSet;
        int i11;
        long j12;
        String str2;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        try {
            try {
                try {
                    JSONArray jSONArray = new JSONObject(obj.toString()).getJSONArray("data");
                    hashMap = new HashMap();
                    try {
                        C31849b1.m153097n().m153117y(jSONArray);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    AbstractC20110a.m104535d("getZaloFriend New time exe 1: %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AbstractC20110a.m104535d("count: %s", Integer.valueOf(jSONArray.length()));
                    long currentTimeMillis2 = System.currentTimeMillis();
                    arrayList = new ArrayList(jSONArray.length());
                    sb2.append("dataList size: ");
                    sb2.append(String.valueOf(jSONArray.length()));
                    hashSet = new HashSet();
                    i11 = 0;
                    int i12 = 0;
                    while (i12 < jSONArray.length()) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i12);
                            ContactProfile contactProfile = new ContactProfile(jSONObject.optString("userId"));
                            contactProfile.f42443u = jSONObject.optString("username");
                            contactProfile.f42437s = jSONObject.optString("displayName");
                            contactProfile.f42446v = jSONObject.optString("avatar");
                            String optString = jSONObject.optString("phoneNumber");
                            contactProfile.f42455y = optString;
                            if (TextUtils.isEmpty(optString) && !hashSet.contains(contactProfile.f42434r)) {
                                hashSet.add(contactProfile.f42434r);
                            }
                            if (!TextUtils.isEmpty(contactProfile.f42455y)) {
                                i11++;
                            }
                            j11 = currentTimeMillis;
                            try {
                                try {
                                    contactProfile.f42336F = jSONObject.optLong("lastActionTime");
                                    contactProfile.f42382U0 = jSONObject.optInt("isActive");
                                    contactProfile.f42449w = jSONObject.optInt("gender", 0);
                                    contactProfile.f42460z1 = jSONObject.optString("uname");
                                    contactProfile.f42347I1 = jSONObject.optLong("lastUpdateTime");
                                    contactProfile.m40407h1(jSONObject.optString("globalId"));
                                    contactProfile.f42361N0 = jSONObject.optInt("account_type", 0);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("business_account");
                                    if (optJSONObject != null) {
                                        str2 = optJSONObject.toString();
                                    } else {
                                        str2 = "";
                                    }
                                    contactProfile.f42364O0 = str2;
                                    contactProfile.f42400b0 = jSONObject.optLong("dob");
                                    AbstractC20110a.m104535d("uid: " + contactProfile.f42434r + " dpn: " + contactProfile.f42437s + " phone: " + contactProfile.f42455y + " ldob: " + contactProfile.f42400b0, new Object[0]);
                                    contactProfile.f42330D = currentTimeMillis2;
                                    arrayList.add(contactProfile);
                                    String str3 = contactProfile.f42434r;
                                    hashMap.put(str3, str3);
                                } catch (Exception e12) {
                                    e = e12;
                                    try {
                                        e.printStackTrace();
                                        sb2.append(" - ");
                                        sb2.append(e.toString());
                                        i12++;
                                        currentTimeMillis = j11;
                                    } catch (Exception e13) {
                                        e = e13;
                                        C21923i.m114289a(e);
                                        sb2.append(" - ");
                                        sb2.append(e);
                                        AbstractC20887g.m109232j(str, 80026, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                                        AbstractC23309i.m121757bj(AbstractC23309i.m121366R0() + 1);
                                        C23744a.m124114c().m124116d(65, 1);
                                        AbstractC20110a.m104535d("getZaloFriend New time exe: %s", Long.valueOf(System.currentTimeMillis() - j11));
                                        return true;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                AbstractC20887g.m109232j(str, 80026, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                                try {
                                    AbstractC23309i.m121757bj(AbstractC23309i.m121366R0() + 1);
                                    C23744a.m124114c().m124116d(65, 1);
                                    AbstractC20110a.m104535d("getZaloFriend New time exe: %s", Long.valueOf(System.currentTimeMillis() - j11));
                                    throw th3;
                                } catch (Exception e14) {
                                    C21923i.m114289a(e14);
                                    throw th3;
                                }
                            }
                        } catch (Exception e15) {
                            e = e15;
                            j11 = currentTimeMillis;
                        }
                        i12++;
                        currentTimeMillis = j11;
                    }
                    j12 = currentTimeMillis;
                } catch (Throwable th4) {
                    th = th4;
                    j11 = currentTimeMillis;
                }
            } catch (Exception e16) {
                e = e16;
                j11 = currentTimeMillis;
            }
            if (!TextUtils.equals(str, CoreUtility.f89233i)) {
                C21923i.m114291c("Interrupt by uid while parsing, uidRequest=" + str + ", currentUserUid=" + CoreUtility.f89233i);
                AbstractC20887g.m109232j(str, 80026, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
                return false;
            }
            ArrayList arrayList2 = new ArrayList();
            synchronized (this.f93821a) {
                for (int i13 = 0; i13 < this.f93821a.size(); i13++) {
                    try {
                        if (!hashMap.containsKey(((ContactProfile) this.f93821a.get(i13)).f42434r)) {
                            arrayList2.add(((ContactProfile) this.f93821a.get(i13)).f42434r);
                        }
                    } finally {
                    }
                }
                this.f93821a.clear();
                this.f93821a.addAll(arrayList);
            }
            sb2.append(" Zalo memory size: ");
            sb2.append(this.f93821a.size());
            sb2.append(" Has phone number: ");
            sb2.append(i11);
            C21928n.m114372h().m114380j(arrayList, true, 80023, true);
            e eVar = this.f93832l;
            if (eVar != null) {
                eVar.f93839p = true;
            }
            e eVar2 = new e(hashSet);
            this.f93832l = eVar2;
            eVar2.start();
            m98527L();
            if (!arrayList2.isEmpty()) {
                C7960e.m41971c6().m42563v9(arrayList2, false, new ArrayList());
                AbstractC23309i.m121543Vt(System.currentTimeMillis());
            }
            C7960e.m41971c6().m42087Cc(new ArrayList(hashMap.values()));
            sb2.append(" End Add flow all friend");
            AbstractC20887g.m109232j(str, 80026, sb2.toString(), 0L, 80010, CoreUtility.f89236l);
            AbstractC23309i.m121757bj(AbstractC23309i.m121366R0() + 1);
            C23744a.m124114c().m124116d(65, 1);
            AbstractC20110a.m104535d("getZaloFriend New time exe: %s", Long.valueOf(System.currentTimeMillis() - j12));
            return true;
        } catch (Exception e17) {
            C21923i.m114289a(e17);
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    void m98537D(Object obj) {
        try {
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONObject(obj.toString()).getJSONObject("data").getJSONArray("data");
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    String string = jSONArray.getString(i11);
                    arrayList.add(string);
                    hashMap.put(string, string);
                }
                synchronized (this.f93821a) {
                    for (int i12 = 0; i12 < this.f93821a.size(); i12++) {
                        try {
                            String str = ((ContactProfile) this.f93821a.get(i12)).f42434r;
                            if (!hashMap.containsKey(str)) {
                                arrayList2.add(str);
                            }
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                }
                C7960e.m41971c6().m42563v9(arrayList, true, arrayList2);
                m98556s("fetchZaloFriendSocket");
                AbstractC23309i.m121543Vt(System.currentTimeMillis());
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            AbstractC23309i.m121757bj(AbstractC23309i.m121366R0() + 1);
        } finally {
            AbstractC23309i.m121757bj(AbstractC23309i.m121366R0() + 1);
        }
    }

    /* renamed from: F */
    public void m98538F() {
        this.f93829i.sendEmptyMessage(1008);
    }

    /* renamed from: G */
    public void m98539G(List list) {
        if (list != null && !list.isEmpty()) {
            m98525H(list);
            C25982c c25982c = this.f93829i;
            c25982c.m133832p(c25982c.m133825i(1009, list));
        }
    }

    /* renamed from: I */
    public void m98540I(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f93821a) {
            try {
                ContactProfile mo98491j = this.f93821a.mo98491j(str);
                if (mo98491j != null) {
                    this.f93821a.remove(mo98491j);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C25982c c25982c = this.f93829i;
        c25982c.m133832p(c25982c.m133825i(1007, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:            if (r7 == false) goto L101;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:            m98524E();        p363nh.C23744a.m124114c().m124116d(6078, new java.lang.Object[0]);     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:            if (r7 != false) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:            if (r2 <= 0) goto L124;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:            return;     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m98541J(String str) {
        int i11;
        boolean z11;
        boolean z12;
        try {
            try {
                C21928n.m114372h().m114383m(str);
                C23744a.m124114c().m124116d(65, new Object[0]);
                if (!AbstractC25495a.m132084i(str) && AbstractC23306f.m120562A().m2529X(str)) {
                    i11 = C7959d.m41638d1().m41774b3(str, 2);
                } else {
                    i11 = 0;
                }
            } catch (Exception e11) {
                e = e11;
                i11 = 0;
            } catch (Throwable th2) {
                th = th2;
                i11 = 0;
            }
            try {
                synchronized (this.f93821a) {
                    try {
                        ContactProfile mo98491j = this.f93821a.mo98491j(str);
                        if (mo98491j != null) {
                            this.f93821a.remove(mo98491j);
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = false;
                    }
                    try {
                    } catch (Throwable th4) {
                        z11 = z12;
                        th = th4;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                z11 = false;
                e.printStackTrace();
                if (z11) {
                }
                if (!z11) {
                    return;
                }
                C19669z.m103146Y().m103198O0();
            } catch (Throwable th6) {
                th = th6;
                if (0 != 0) {
                }
                if (0 == 0) {
                }
                C19669z.m103146Y().m103198O0();
                throw th;
            }
            try {
                break;
                throw th;
            } catch (Exception e13) {
                e = e13;
                e.printStackTrace();
                if (z11) {
                    m98524E();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                }
                if (!z11 && i11 <= 0) {
                    return;
                }
                C19669z.m103146Y().m103198O0();
            }
        } catch (Throwable th7) {
            th = th7;
            if (0 != 0) {
                m98524E();
                C23744a.m124114c().m124116d(6078, new Object[0]);
            }
            if (0 == 0 || i11 > 0) {
                C19669z.m103146Y().m103198O0();
            }
            throw th;
        }
    }

    /* renamed from: M */
    void m98542M() {
        ContactProfile mo98491j;
        long j11;
        try {
            if (!this.f93824d && !TextUtils.isEmpty(CoreUtility.f89233i) && !AbstractC23304d.f113427q1.get()) {
                int m117905e = AbstractC23006a0.m117905e();
                List m42474n7 = C7960e.m41971c6().m42474n7(200);
                if (m42474n7.size() == 0) {
                    AbstractC23309i.m121543Vt(0L);
                    return;
                }
                AbstractC20110a.m104535d("updateZaloFriendProfileInternal: %s", Integer.valueOf(m42474n7.size()));
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new b(m42474n7));
                HashMap hashMap = new HashMap();
                for (int i11 = 0; i11 < m42474n7.size(); i11++) {
                    try {
                        String valueOf = String.valueOf(m42474n7.get(i11));
                        hashMap.put(Integer.valueOf(Integer.parseInt(valueOf)), 0);
                        if (!TextUtils.isEmpty(valueOf) && (mo98491j = m98531l().m98553p().mo98491j(valueOf)) != null) {
                            Integer valueOf2 = Integer.valueOf(Integer.parseInt(valueOf));
                            if (String.valueOf(mo98491j.f42347I1).length() >= 13) {
                                j11 = mo98491j.f42347I1 / 1000;
                            } else {
                                j11 = mo98491j.f42347I1;
                            }
                            hashMap.put(valueOf2, Integer.valueOf((int) j11));
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                this.f93824d = true;
                c0766k.m1825S(m117905e, hashMap);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p142ey.InterfaceC18632b
    /* renamed from: a */
    public C18635e mo98465a(ContactProfile contactProfile, boolean z11) {
        C18635e c18635e;
        synchronized (this.f93821a) {
            f93820n++;
            c18635e = new C18635e(this.f93821a);
        }
        if (contactProfile != null) {
            c18635e.add(contactProfile);
        }
        try {
            for (int size = c18635e.size() - 1; size >= 0; size--) {
                if (!z11) {
                    try {
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    if (C21927m.m114302u().m114312J().m153137g(((ContactProfile) c18635e.get(size)).f42434r)) {
                        c18635e.remove(size);
                    }
                }
                ((ContactProfile) c18635e.get(size)).f42440t = AbstractC23262x6.m120002o(((ContactProfile) c18635e.get(size)).m40385R(true, false, C18631a.m98446i().f93755g.get())).trim();
            }
            Collections.sort(c18635e, new Comparator() { // from class: ey.l
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m98532w;
                    m98532w = C18644n.m98532w((ContactProfile) obj, (ContactProfile) obj2);
                    return m98532w;
                }
            });
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        return c18635e;
    }

    /* renamed from: e */
    public void m98543e(ContactProfile contactProfile) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            m98544f(contactProfile);
            C25982c c25982c = this.f93829i;
            c25982c.m133832p(c25982c.m133825i(1006, contactProfile));
        }
    }

    /* renamed from: f */
    public void m98544f(ContactProfile contactProfile) {
        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
            synchronized (this.f93821a) {
                try {
                    if (this.f93821a.mo98490g(contactProfile.f42434r)) {
                        this.f93821a.remove(this.f93821a.mo98491j(contactProfile.f42434r));
                    }
                    contactProfile.f42425n1 = 1;
                    this.f93821a.add(contactProfile);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:            if (r10 == false) goto L126;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:            m98524E();        p363nh.C23744a.m124114c().m124116d(6078, new java.lang.Object[0]);     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:            if (r10 != false) goto L128;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:            if (r8 <= 0) goto L203;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008c, code lost:            if (r8 <= 0) goto L203;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m98545g(ContactProfile contactProfile) {
        int i11;
        boolean z11;
        ArrayList arrayList;
        Map map;
        boolean z12;
        long j11 = contactProfile.f42374R1;
        int i12 = contactProfile.f42377S1;
        try {
            try {
                contactProfile.f42374R1 = 0L;
                contactProfile.f42377S1 = 0;
                C21928n.m114372h().m114381k(contactProfile);
                C23744a.m124114c().m124116d(65, new Object[0]);
                i11 = C7959d.m41638d1().m41774b3(contactProfile.f42434r, 1);
            } catch (Exception e11) {
                e = e11;
                i11 = 0;
            } catch (Throwable th2) {
                th = th2;
                i11 = 0;
            }
            try {
                synchronized (this.f93821a) {
                    try {
                        if (!this.f93821a.mo98490g(contactProfile.f42434r)) {
                            contactProfile.f42425n1 = 1;
                            this.f93821a.add(contactProfile);
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        try {
                        } catch (Throwable th3) {
                            z11 = z12;
                            th = th3;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        z11 = false;
                    }
                }
            } catch (Exception e12) {
                e = e12;
                z11 = false;
                e.printStackTrace();
                if (z11) {
                }
                if (!z11) {
                }
                C19669z.m103146Y().m103198O0();
                try {
                    try {
                        if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                            String str = CoreUtility.f89233i + contactProfile.f42374R1;
                            map = AbstractC23304d.f113264C2;
                            synchronized (map) {
                            }
                        }
                        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                        } else {
                            return;
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        if (!TextUtils.isEmpty(CoreUtility.f89233i) && j11 > 0) {
                            arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j11));
                            C29628e.m147249E0().m147283l1(arrayList);
                        }
                        return;
                    }
                } catch (Throwable th6) {
                    if (!TextUtils.isEmpty(CoreUtility.f89233i) && j11 > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Long.valueOf(j11));
                        C29628e.m147249E0().m147283l1(arrayList2);
                    }
                    throw th6;
                }
            } catch (Throwable th7) {
                th = th7;
                if (0 != 0) {
                }
                if (0 == 0) {
                }
                C19669z.m103146Y().m103198O0();
                throw th;
            }
            try {
                break;
                throw th;
            } catch (Exception e14) {
                e = e14;
                e.printStackTrace();
                if (z11) {
                    m98524E();
                    C23744a.m124114c().m124116d(6078, new Object[0]);
                }
                if (!z11) {
                }
                C19669z.m103146Y().m103198O0();
                if (!TextUtils.isEmpty(CoreUtility.f89233i) && j11 > 0 && i12 == 1) {
                    String str2 = CoreUtility.f89233i + contactProfile.f42374R1;
                    map = AbstractC23304d.f113264C2;
                    synchronized (map) {
                        try {
                            if (!map.containsKey(str2)) {
                                C7960e.m41971c6().m42063A8(str2);
                            }
                        } catch (Throwable th8) {
                            throw th8;
                        }
                    }
                }
                if (TextUtils.isEmpty(CoreUtility.f89233i) && j11 > 0) {
                    arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(j11));
                    C29628e.m147249E0().m147283l1(arrayList);
                }
            }
        } catch (Throwable th9) {
            th = th9;
            if (0 != 0) {
                m98524E();
                C23744a.m124114c().m124116d(6078, new Object[0]);
            }
            if (0 == 0 || i11 > 0) {
                C19669z.m103146Y().m103198O0();
            }
            throw th;
        }
    }

    /* renamed from: h */
    void m98546h() {
        try {
            C21923i.m114291c("cleanupInternal, currentUid=" + CoreUtility.f89233i);
            C21928n.m114372h().m114374c();
            synchronized (this.f93821a) {
                this.f93821a.clear();
            }
            AbstractC23309i.m121757bj(0);
            AbstractC23309i.m121728as(0L);
            C23744a.m124114c().m124116d(65, new Object[0]);
            this.f93823c = 0;
            this.f93824d = false;
            AbstractC23309i.m121543Vt(0L);
        } catch (Exception e11) {
            C21923i.m114289a(e11);
        }
    }

    /* renamed from: i */
    public void m98547i() {
        try {
            this.f93829i.m133831o(null);
            C25982c c25982c = this.f93829i;
            c25982c.m133833q(c25982c.m133824h(1005));
        } catch (Exception e11) {
            C21923i.m114289a(e11);
        }
    }

    /* renamed from: j */
    void m98548j() {
        try {
            if (Math.abs(AbstractC23309i.m120781B7() - System.currentTimeMillis()) < 86400000 || TextUtils.isEmpty(CoreUtility.f89233i) || AbstractC23304d.f113427q1.get() || this.f93827g.get()) {
                return;
            }
            String str = CoreUtility.f89233i;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new d(str));
            AbstractC23309i.m121757bj(0);
            AbstractC20887g.m109232j(CoreUtility.f89233i, 80016, "", 0L, 80010, CoreUtility.f89236l);
            this.f93827g.set(true);
            c0766k.mo1557V7(AbstractC23006a0.m117905e(), 1);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: k */
    void m98549k() {
        try {
            if (Math.abs(AbstractC23309i.m120781B7() - System.currentTimeMillis()) >= 86400000 && !TextUtils.isEmpty(CoreUtility.f89233i) && !AbstractC23304d.f113427q1.get()) {
                AbstractC23309i.m121728as(System.currentTimeMillis());
                AbstractC20110a.m104535d("fetchZaloFriendFromServerSocketInternal", new Object[0]);
                AbstractC23309i.m121543Vt(0L);
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new c());
                this.f93828h.set(true);
                c0766k.m1806E();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public AtomicBoolean m98550m() {
        return this.f93826f;
    }

    /* renamed from: n */
    public AtomicBoolean m98551n() {
        return this.f93825e;
    }

    /* renamed from: o */
    public ContactProfile m98552o(String str) {
        ContactProfile mo98491j;
        synchronized (this.f93821a) {
            mo98491j = this.f93821a.mo98491j(str);
        }
        return mo98491j;
    }

    /* renamed from: p */
    public C18635e m98553p() {
        C18637g c18637g;
        synchronized (this.f93821a) {
            f93820n++;
            c18637g = new C18637g(this.f93821a);
        }
        return c18637g;
    }

    /* renamed from: q */
    public C18635e m98554q() {
        return this.f93822b;
    }

    /* renamed from: r */
    public int m98555r() {
        int size;
        synchronized (this.f93821a) {
            size = this.f93821a.size();
        }
        return size;
    }

    /* renamed from: s */
    public void m98556s(String str) {
        C25982c c25982c = this.f93829i;
        c25982c.m133832p(c25982c.m133824h(1004));
        AbstractC0777e.m1935a("initZaloFriendFromDB-" + str);
        C21923i.m114291c("initZaloFriendFromDB-" + str);
    }

    /* renamed from: t */
    public boolean m98557t() {
        return this.f93831k;
    }

    /* renamed from: u */
    public boolean m98558u(String str) {
        boolean mo98490g;
        synchronized (this.f93821a) {
            mo98490g = this.f93821a.mo98490g(str);
        }
        return mo98490g;
    }

    /* renamed from: v */
    public boolean m98559v() {
        boolean isEmpty;
        synchronized (this.f93821a) {
            isEmpty = this.f93821a.isEmpty();
        }
        return isEmpty;
    }

    /* renamed from: y */
    void m98560y(boolean z11) {
        try {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            C18635e m98553p = m98553p();
            try {
                try {
                    arrayList = C7960e.m41971c6().m42347b6();
                    C21927m.m114302u().m114351p().clear();
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        String str = (String) arrayList.get(i11);
                        if (m98553p.mo98490g(str) && !hashMap.containsKey(str)) {
                            C21927m.m114302u().m114351p().add(str);
                            hashMap.put(str, str);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (z11 && !m98553p.isEmpty() && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        String str2 = (String) arrayList.get(i12);
                        if (!hashMap.containsKey(str2)) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
                        }
                    }
                    if (arrayList2.size() > 0) {
                        C21927m.m114302u().m114338i0(arrayList2);
                    }
                }
                C23744a.m124114c().m124116d(65, new Object[0]);
            } finally {
                m98524E();
            }
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: z */
    void m98561z() {
        try {
            try {
                this.f93831k = true;
                long currentTimeMillis = System.currentTimeMillis();
                List m114379i = C21928n.m114372h().m114379i();
                C21923i.m114291c("Load list friend from DB: size=" + m114379i.size() + ", time=" + (System.currentTimeMillis() - currentTimeMillis));
                synchronized (this.f93821a) {
                    this.f93821a.clear();
                    this.f93821a.addAll(m114379i);
                }
                AbstractC20887g.m109232j(CoreUtility.f89233i, 80028, " " + this.f93821a.size(), 0L, 80010, CoreUtility.f89236l);
                C21927m.m114302u().m114314L();
                if (!m98531l().m98551n().get()) {
                    AbstractC23028c0.m118091k(MainApplication.getAppContext());
                }
                if (!TextUtils.isEmpty(CoreUtility.f89233i)) {
                    m98531l().m98551n().set(true);
                }
                this.f93831k = false;
                C23744a.m124114c().m124116d(65, 1);
                m98524E();
                C23744a.m124114c().m124116d(6078, new Object[0]);
            } catch (Exception e11) {
                C21923i.m114289a(e11);
                this.f93831k = false;
                C23744a.m124114c().m124116d(65, 1);
                m98524E();
                C23744a.m124114c().m124116d(6078, new Object[0]);
            }
            C19669z.m103146Y().m103198O0();
        } catch (Throwable th2) {
            C23744a.m124114c().m124116d(65, 1);
            m98524E();
            C23744a.m124114c().m124116d(6078, new Object[0]);
            C19669z.m103146Y().m103198O0();
            throw th2;
        }
    }
}
