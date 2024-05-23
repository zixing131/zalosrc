package p320ld;

import ag0.AbstractC0837p0;
import ag0.C0815e1;
import am.AbstractC0924m0;
import am.C0945x;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bn0.AbstractC2933b;
import c50.C3297h;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.backuprestore.encryption.DataProtectionCode;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.data.backuprestore.model.media.BackupCloudInfo;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.p077ui.backuprestore.drive.ManageGoogleAccountView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import gm0.AbstractC19509c;
import gw.C19669z;
import ho0.AbstractC20110a;
import hu.C20128b;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import jm.AbstractC21289a;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import nh0.C23793c;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p128ed.C18389d;
import p128ed.C18390e;
import p173fz.C19172a;
import p297kd.C21689d;
import p297kd.C21690e;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.EnumC23747b0;
import p421pc.C24721b;
import p443qc.AbstractC25219c;
import p443qc.C25217a;
import p443qc.C25218b;
import p461qu.AbstractC25495a;
import p479rc.C25724a;
import p479rc.C25725b;
import p484ri.C25804a;
import p525ti.C26700a;
import p525ti.C26701b;
import p542ub.InterfaceC27218a;
import p645xh.C29628e;
import p716zh.C31986k3;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import sc.C26220b;
import si.C26263i;
import v00.AbstractC27413h;

/* renamed from: ld.s */
/* loaded from: classes3.dex */
public final class C22447s {

    /* renamed from: a */
    public static final C22447s f109797a = new C22447s();

    /* renamed from: b */
    private static final Object f109798b = new Object();

    private C22447s() {
    }

    /* renamed from: A */
    public static final int m115991A(C21690e c21690e, int i11) {
        if (c21690e != null && m116030d0(c21690e.f105269f, c21690e.m111897w()) && c21690e.m111891q() != 0) {
            return c21690e.m111891q();
        }
        return i11;
    }

    /* renamed from: A0 */
    public static final void m115992A0() {
        C29628e.m147249E0().m147269W0();
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ld.r
            @Override // java.lang.Runnable
            public final void run() {
                C22447s.m115994B0();
            }
        });
    }

    /* renamed from: B */
    public static final int m115993B(int i11) {
        if (C22438j.m115948p(i11)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: B0 */
    public static final void m115994B0() {
        try {
            AbstractC23306f.m120668h().m132688g();
            AbstractC23306f.m120688m().m132982A("", -4);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: C */
    private final int m115995C(C21689d c21689d) {
        if (c21689d.m143140a() == 2003) {
            return 9;
        }
        if (c21689d.m143140a() == 40305) {
            return 8;
        }
        if (C25218b.f120974a.m130482a(c21689d.m143140a())) {
            return 10;
        }
        return 6;
    }

    /* renamed from: C0 */
    public static final void m115996C0() {
        C29628e.m147249E0().m147269W0();
        C22436h.f109760a.m115912C();
    }

    /* renamed from: D */
    public static final int m115997D(C21690e c21690e) {
        AbstractC19074t.m100208f(c21690e, "syncSessionInfo");
        C21689d m111895u = c21690e.m111895u();
        if (m111895u == null) {
            return 0;
        }
        if (m111895u.mo97004e()) {
            return f109797a.m115998E(m111895u);
        }
        if (m111895u.m111858f()) {
            return 5;
        }
        m111895u.m143140a();
        if (c21690e.m111869G()) {
            return 1;
        }
        if (m111895u.m143140a() == 2001) {
            return 7;
        }
        if (!m111895u.m111859g()) {
            return 0;
        }
        return f109797a.m115995C(m111895u);
    }

    /* renamed from: E */
    private final int m115998E(C21689d c21689d) {
        if (c21689d.m143142c() == 14 && c21689d.m143140a() == 2004) {
            return 3;
        }
        return 2;
    }

    /* renamed from: E0 */
    public static /* synthetic */ void m115999E0(C22447s c22447s, InterfaceC27218a interfaceC27218a, InterfaceC17463d.d dVar, InterfaceC17463d.e eVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            eVar = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        c22447s.m116069D0(interfaceC27218a, dVar, eVar, z11);
    }

    /* renamed from: F */
    public static final String m116000F(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Phase: ");
        switch (i11) {
            case 0:
                sb2.append(Image.SCALE_TYPE_NONE);
                break;
            case 1:
                sb2.append("START");
                break;
            case 3:
                sb2.append("DOWNLOAD");
                break;
            case 4:
                sb2.append("DECODE");
                break;
            case 5:
                sb2.append("PRE_PROCESS_DB");
                break;
            case 7:
                sb2.append("INSERTDATA");
                break;
            case 8:
                sb2.append("FINALIZE_LOCAL_DB");
                break;
            case 9:
                sb2.append("EXPORT");
                break;
            case 11:
                sb2.append("UPLOAD");
                break;
            case 12:
                sb2.append("SUCCESS");
                break;
            case 13:
                sb2.append("ERROR");
                break;
            case 14:
                sb2.append("SYNC_MEDIA");
                break;
            case 15:
                sb2.append("SYNC_MEDIA_SUCCESS");
                break;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                sb2.append("SYNC_MEDIA_ERROR");
                break;
            case 17:
                sb2.append("FINISH");
                break;
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: F0 */
    public static final void m116001F0(InterfaceC27218a interfaceC27218a, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        f109797a.m116078v0(interfaceC27218a);
    }

    /* renamed from: G */
    public static final int m116002G() {
        m116016R();
        return AbstractC0924m0.m4315wc() ? 1 : 0;
    }

    /* renamed from: H */
    public static final int m116003H() {
        if (C23055e5.m118270e()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: H0 */
    public static final void m116004H0(InterfaceC27218a interfaceC27218a, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        f109797a.m116078v0(interfaceC27218a);
    }

    /* renamed from: I */
    public static final void m116005I(int i11, int i12, String str, InterfaceC27218a interfaceC27218a, boolean z11, boolean z12) {
        int i13;
        AbstractC19074t.m100208f(interfaceC27218a, "iZaloActivity");
        Bundle bundle = new Bundle();
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (m135087t != null && m135087t.m40975d()) {
            TargetBackupInfo targetBackupInfo = m135087t.f42886u;
            AbstractC19074t.m100205c(targetBackupInfo);
            bundle.putParcelable("extra_cloud_info", new BackupCloudInfo(targetBackupInfo.m40959o(), targetBackupInfo.m40962t(), targetBackupInfo.m40957m()));
        }
        bundle.putString("extra_acc_local_auth", str);
        if (z11) {
            bundle.putInt("EXTRA_MODE", 3);
        } else {
            bundle.putInt("EXTRA_MODE", 2);
        }
        bundle.putInt("extra_from_ep", i11);
        bundle.putInt("extra_from_pos", i12);
        if (z12) {
            if (z11) {
                i13 = 18055;
            } else {
                i13 = 18061;
            }
        } else {
            i13 = 18054;
        }
        interfaceC27218a.mo35579p().m93066i2(ManageGoogleAccountView.class, bundle, i13, !z11 ? 1 : 0, true);
    }

    /* renamed from: I0 */
    public static final void m116006I0(int i11, int i12, int i13, long j11, int i14, int i15) {
        try {
            C0815e1.m2075D().m2099U(3, 2, 37, String.valueOf(i11), String.valueOf(i12), String.valueOf(i13), String.valueOf(j11), String.valueOf(i14), String.valueOf(i15));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: J */
    public static /* synthetic */ void m116007J(int i11, int i12, String str, InterfaceC27218a interfaceC27218a, boolean z11, boolean z12, int i13, Object obj) {
        int i14;
        boolean z13;
        boolean z14;
        if ((i13 & 2) != 0) {
            i14 = 0;
        } else {
            i14 = i12;
        }
        if ((i13 & 16) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i13 & 32) != 0) {
            z14 = true;
        } else {
            z14 = z12;
        }
        m116005I(i11, i14, str, interfaceC27218a, z13, z14);
    }

    /* renamed from: K */
    public static final void m116008K(int i11) {
        int m121889f1;
        int i12 = 2;
        if (i11 > 0) {
            int i13 = 0;
            try {
                try {
                    int m3920j4 = AbstractC0924m0.m3920j4();
                    try {
                        Integer num = null;
                        C26220b.m134827j("oldVersionCode=" + i11 + ", oldVersionSync=" + m3920j4 + ", VERSION_SYNC_MIGRATION=2", null, 2, null);
                        if (m3920j4 == 0) {
                            if (AbstractC23306f.m120692n().m133053o() != null) {
                                AbstractC23306f.m120692n().m133036P("");
                            }
                            if (!C26263i.m135055u().m135071M() && (m121889f1 = AbstractC23309i.m121889f1()) > 0 && m121889f1 < 17) {
                                AbstractC23309i.m122285pj(0);
                            }
                            if (!C26263i.m135055u().m135071M() && m116047m0(C26263i.m135058w(), false, 2, null)) {
                                AbstractC23306f.m120692n().m133035O(C23793c.Companion.m124321a().mo124314i() - ((C24721b.f118742a.m128436a() + 10) * 1000));
                                AbstractC23306f.m120692n().m133038S(0);
                                C22436h.f109760a.m115918n().mo13474a(new Runnable() { // from class: ld.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C22447s.m116010L();
                                    }
                                });
                            }
                            i13 = 1;
                        } else {
                            i13 = m3920j4;
                        }
                        if (i13 < 2) {
                            C21690e m133053o = AbstractC23306f.m120692n().m133053o();
                            if (m133053o != null && m133053o.m111869G()) {
                                C21689d m111895u = m133053o.m111895u();
                                if (m111895u != null) {
                                    num = Integer.valueOf(m111895u.m143140a());
                                }
                                if (num != null && num.intValue() == -17) {
                                    AbstractC23306f.m120692n().m133036P("");
                                }
                            }
                        } else {
                            i12 = i13;
                        }
                        AbstractC0924m0.m3174Jl(i12);
                    } catch (Exception e11) {
                        e = e11;
                        i13 = m3920j4;
                        AbstractC20110a.f98889a.mo104552e(e);
                        AbstractC0924m0.m3174Jl(i13);
                    } catch (Throwable th2) {
                        th = th2;
                        i13 = m3920j4;
                        AbstractC0924m0.m3174Jl(i13);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e12) {
                e = e12;
            }
        } else {
            AbstractC0924m0.m3174Jl(2);
        }
    }

    /* renamed from: K0 */
    public static final boolean m116009K0(C21690e c21690e, TargetBackupInfo targetBackupInfo, boolean z11) {
        AbstractC19074t.m100208f(c21690e, "syncSessionInfo");
        if (!AbstractC23306f.m120676j().m128395L()) {
            return false;
        }
        int m115991A = m115991A(c21690e, c21690e.f105269f);
        if (C26263i.m135015H(m115991A)) {
            return false;
        }
        C25804a m120688m = AbstractC23306f.m120688m();
        AbstractC19074t.m100207e(m120688m, "provideBackupRestoreMediaRepo(...)");
        String m132993i = m120688m.m132993i();
        if (TextUtils.isEmpty(m132993i)) {
            return false;
        }
        if (m115993B(m115991A) == 1) {
            if (AbstractC3489d.m17513u()) {
                return false;
            }
            if (AbstractC23306f.m120676j().m128393J() && (m120688m.m133001t() instanceof AbstractC25219c.b)) {
                return false;
            }
        }
        if (!z11 && c21690e.f105269f == 1 && C18390e.m97410q() && AbstractC23306f.m120676j().m128426v().m128442a() > 0 && System.currentTimeMillis() - AbstractC0924m0.m3858h2() < AbstractC23306f.m120676j().m128426v().m128442a() * 1000) {
            return false;
        }
        boolean m115948p = C22438j.m115948p(m115991A);
        if (m116057s(targetBackupInfo)) {
            AbstractC19074t.m100205c(targetBackupInfo);
            if (!targetBackupInfo.m40959o().equals(m132993i) && m115948p) {
                return false;
            }
        } else if (m115948p) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public static final void m116010L() {
        C22436h.f109760a.m115921q();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0099 -> B:33:0x00ba). Please report as a decompilation issue!!! */
    /* renamed from: M */
    public static final void m116011M(int i11, InterfaceC27218a interfaceC27218a, int i12, int i13) {
        C21690e m133053o;
        int m116062w;
        C26220b.m134827j("handleSyncActionCommon action=" + i11, null, 2, null);
        if (i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                if (i11 != 5) {
                    if (i11 != 6) {
                        if (i11 == 8) {
                            try {
                                MainApplication.C6895a c6895a = MainApplication.Companion;
                                AbstractC23152n3.m119044g0(c6895a.m35500c(), c6895a.m35500c().getPackageName());
                                return;
                            } catch (Exception e11) {
                                AbstractC20110a.f98889a.mo104552e(e11);
                                return;
                            }
                        }
                        return;
                    }
                    if (interfaceC27218a == null) {
                        return;
                    }
                    m116005I(i12, i13, AbstractC23306f.m120688m().m132993i(), interfaceC27218a, true, true);
                    return;
                }
                if (interfaceC27218a == null) {
                    return;
                }
                m116005I(i12, i13, AbstractC23306f.m120688m().m132993i(), interfaceC27218a, true, false);
                return;
            }
            try {
                m133053o = AbstractC23306f.m120692n().m133053o();
                m116062w = m116062w(AbstractC23309i.m120897Ec());
            } catch (Exception e12) {
                AbstractC20110a.f98889a.mo104552e(e12);
            }
            if (m133053o != null && m133053o.m111867E()) {
                C26263i.m135055u().m135086s0(m116062w, true);
                return;
            }
            C26263i.m135055u().m135085r0(m116062w);
            return;
        }
        f109797a.m116079z0("handleSyncActionCommon ADD_OR_UPDATE_ACCOUNT_GGDRIVE SyncObserverEntryPoint " + i12 + " ");
    }

    /* renamed from: N */
    public static /* synthetic */ void m116012N(int i11, InterfaceC27218a interfaceC27218a, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        m116011M(i11, interfaceC27218a, i12, i13);
    }

    /* renamed from: O */
    public static final int m116013O(ImageView imageView, List list) {
        AbstractC19074t.m100208f(imageView, "ivReddotRemind");
        AbstractC19074t.m100208f(list, "viewsRedDotExist");
        int m116034g = m116034g(imageView, false, true);
        if (m116034g >= 0) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) list.get(i11);
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            return m116034g;
        }
        return -1;
    }

    /* renamed from: P */
    public static final int m116014P(ImageView imageView, List list) {
        AbstractC19074t.m100208f(imageView, "badgeWarning");
        AbstractC19074t.m100208f(list, "viewsRedDotExist");
        int m116038i = m116038i(imageView, false, true);
        if (m116038i >= 0) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) list.get(i11);
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            return m116038i;
        }
        return -1;
    }

    /* renamed from: Q */
    public static final void m116015Q() {
        if (AbstractC0924m0.m4315wc()) {
            AbstractC0924m0.m4298vo(false);
        }
    }

    /* renamed from: R */
    public static final void m116016R() {
        int m121079J9 = AbstractC23309i.m121079J9();
        if (CoreUtility.f89236l > m121079J9) {
            if (m121079J9 == 0) {
                if (!AbstractC0924m0.m4315wc()) {
                    AbstractC0924m0.m4298vo(true);
                }
            } else if (AbstractC0924m0.m4315wc()) {
                AbstractC0924m0.m4298vo(false);
            }
        }
    }

    /* renamed from: S */
    public static final boolean m116017S(C7924a c7924a) {
        if (c7924a != null && c7924a.m40975d() && c7924a.m40974c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static final boolean m116018T() {
        return false;
    }

    /* renamed from: U */
    public static final boolean m116019U(int i11) {
        return i11 >= 18 && i11 <= 22;
    }

    /* renamed from: V */
    public static final boolean m116020V() {
        if (!AbstractC0924m0.m4254u9() && !AbstractC0924m0.m4341x9()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static final boolean m116021W(int i11) {
        return i11 == 16 || i11 == 19 || i11 == 21;
    }

    /* renamed from: Z */
    public static final boolean m116022Z(int i11) {
        return i11 == 18 || i11 == 19;
    }

    /* renamed from: a0 */
    public static final boolean m116024a0(int i11) {
        return i11 == 17 || i11 == 18;
    }

    /* renamed from: b0 */
    public static final boolean m116026b0() {
        try {
            long m104764k = C20128b.m104764k();
            if (m104764k < 5242880) {
                C26220b.m134820c("Full Storage! freeStorage=" + m104764k + ", fullThreshold=5242880");
                return true;
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: c0 */
    public static final boolean m116028c0(int i11) {
        return i11 != 0;
    }

    /* renamed from: d0 */
    public static final boolean m116030d0(int i11, int i12) {
        return i11 == 10 && i12 == 2;
    }

    /* renamed from: e0 */
    public static final boolean m116031e0(int i11) {
        return i11 >= 14 && i11 <= 16;
    }

    /* renamed from: f */
    public static final void m116032f(TargetBackupInfo targetBackupInfo, C26701b c26701b) {
        boolean m127149O;
        C26700a m133052m;
        boolean m127149O2;
        int i11;
        boolean z11;
        AbstractC19074t.m100208f(c26701b, "syncBackupInfoContent");
        if (targetBackupInfo != null) {
            String m40957m = targetBackupInfo.m40957m();
            int length = m40957m.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(m40957m.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            c26701b.m137268d(m40957m.subSequence(i12, length + 1).toString());
            m127149O = AbstractC24342w.m127149O(targetBackupInfo.m40957m(), targetBackupInfo.m40963u(), false, 2, null);
            if (m127149O && (m133052m = AbstractC23306f.m120692n().m133052m(targetBackupInfo.m40963u())) != null && m133052m.m137263a().length() > 0) {
                m127149O2 = AbstractC24342w.m127149O(m133052m.m137263a(), targetBackupInfo.m40963u(), false, 2, null);
                if (!m127149O2) {
                    c26701b.m137268d(m133052m.m137263a());
                }
            }
            c26701b.m137269e(m116058t(targetBackupInfo.m40950f()));
        }
    }

    /* renamed from: f0 */
    public static final boolean m116033f0(int i11) {
        return i11 >= 1 && i11 <= 13;
    }

    /* renamed from: g */
    public static final int m116034g(ImageView imageView, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(imageView, "viewTarget");
        return m116042k(imageView, C18389d.m97402b(), 0, z11, z12);
    }

    /* renamed from: g0 */
    public static final boolean m116035g0(int i11) {
        return i11 >= 1 && i11 < 17;
    }

    /* renamed from: h */
    public static final int m116036h(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "viewContainer");
        ImageView imageView = (ImageView) viewGroup.findViewById(i11);
        if (imageView == null) {
            return -1;
        }
        return m116034g(imageView, viewGroup instanceof ActionBarMenuItem, false);
    }

    /* renamed from: h0 */
    public static final boolean m116037h0(boolean z11, int i11) {
        return z11 && i11 >= 1 && i11 <= 9;
    }

    /* renamed from: i */
    public static final int m116038i(ImageView imageView, boolean z11, boolean z12) {
        AbstractC19074t.m100208f(imageView, "badgeWarning");
        C22436h c22436h = C22436h.f109760a;
        return m116042k(imageView, c22436h.m115923s(), c22436h.m115916H(), z11, z12);
    }

    /* renamed from: i0 */
    public static final boolean m116039i0(int i11) {
        return i11 >= 9 && i11 <= 11;
    }

    /* renamed from: j */
    public static final int m116040j(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "viewContainer");
        ImageView imageView = (ImageView) viewGroup.findViewById(i11);
        if (imageView == null) {
            return -1;
        }
        return m116038i(imageView, viewGroup instanceof ActionBarMenuItem, false);
    }

    /* renamed from: j0 */
    public static final boolean m116041j0(int i11) {
        return i11 >= 3 && i11 <= 8;
    }

    /* renamed from: k */
    public static final int m116042k(ImageView imageView, boolean z11, int i11, boolean z12, boolean z13) {
        int i12;
        AbstractC19074t.m100208f(imageView, "viewTarget");
        try {
            if (z11) {
                if (i11 >= 0) {
                    C25217a c25217a = C25217a.f120971a;
                    if (i11 < c25217a.m130481b().length) {
                        if (z13 && i11 != 1) {
                            imageView.setVisibility(8);
                            return i11;
                        }
                        imageView.setImageResource(c25217a.m130481b()[i11]);
                        imageView.setVisibility(0);
                        if (z12) {
                            if (i11 == 0) {
                                i12 = AbstractC23222t7.f112574n;
                            } else {
                                i12 = AbstractC23222t7.f112558f;
                            }
                            C3297h.m16743o(imageView, i12);
                        }
                        return i11;
                    }
                }
                imageView.setVisibility(8);
                return -1;
            }
            imageView.setVisibility(8);
            return -1;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return -1;
        }
    }

    /* renamed from: k0 */
    public static final boolean m116043k0(TargetBackupInfo targetBackupInfo) {
        return m116047m0(targetBackupInfo, false, 2, null);
    }

    /* renamed from: l */
    public static final boolean m116044l(boolean z11) {
        if (!z11 && AbstractC23306f.m120676j().m128396M() && AbstractC23306f.m120676j().m128401R() && (AbstractC21289a.Companion.m110249c() || m116002G() == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    public static final boolean m116045l0(TargetBackupInfo targetBackupInfo, boolean z11) {
        String str;
        if (targetBackupInfo != null) {
            try {
                str = AbstractC23306f.m120692n().m133058t();
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                str = "";
            }
            if (z11) {
                C26220b.m134827j("checksum: client=" + str + ", server=" + targetBackupInfo.m40949e(), null, 2, null);
            }
            if (!AbstractC19074t.m100204b(str, targetBackupInfo.m40949e())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m116046m() {
        if (!AbstractC23306f.m120676j().m128396M() || !AbstractC23306f.m120676j().m128401R() || !m116047m0(C26263i.m135058w(), false, 2, null)) {
            return false;
        }
        return true;
    }

    /* renamed from: m0 */
    public static /* synthetic */ boolean m116047m0(TargetBackupInfo targetBackupInfo, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return m116045l0(targetBackupInfo, z11);
    }

    /* renamed from: n */
    public static final boolean m116048n(C21690e c21690e) {
        AbstractC19074t.m100208f(c21690e, "syncSessionInfo");
        if (c21690e.m143172f() || m115997D(c21690e) != 9 || m115993B(c21690e.f105269f) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    public static final boolean m116049n0() {
        return false;
    }

    /* renamed from: o0 */
    public static final boolean m116050o0(long j11) {
        if (((j11 > 12100646 || j11 < 12100626) && (j11 > 478 || j11 < 466)) || C19172a.m100600k("features@databases@import_corrupt_bk", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private final byte[] m116051p(C21690e c21690e, byte[] bArr) {
        C25725b m132683b;
        C25724a m120668h = AbstractC23306f.m120668h();
        AbstractC19074t.m100207e(m120668h, "provideBackupEncryptionManager(...)");
        try {
            if (C22438j.m115947o(c21690e.f105269f)) {
                TargetBackupInfo m135058w = C26263i.m135058w();
                AbstractC19074t.m100205c(m135058w);
                if (!AbstractC22431c.m115870a(m135058w)) {
                    m132683b = m120668h.m132695p(0);
                } else {
                    DataProtectionCode m128526k = AbstractC23306f.m120636Y1().m128526k();
                    if (m128526k == null) {
                        C26220b.m134827j("decryptHiddenChatData(): Invalid data protection code !!!", null, 2, null);
                        return new byte[0];
                    }
                    m132683b = m120668h.m132683b(m128526k.m37261a(), m128526k.m37262b());
                }
                return m120668h.m132689h(bArr, m132683b);
            }
            return C25724a.m132656i(m120668h, bArr, null, 2, null);
        } catch (Exception e11) {
            C26220b.m134819b(e11);
            return new byte[0];
        }
    }

    /* renamed from: p0 */
    public static final boolean m116052p0(boolean z11) {
        try {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            String m124128g = EnumC23747b0.f114863J.m124128g();
            if (m124128g != null) {
                if (m124128g.length() != 0) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e11) {
            if (z11) {
                AbstractC23350e.m122778h(e11);
                return false;
            }
            return false;
        }
    }

    /* renamed from: q */
    public static final String m116053q(String str) {
        AbstractC19074t.m100208f(str, "hiddenChatData");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC19074t.m100207e(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            AbstractC19074t.m100207e(bytes, "getBytes(...)");
            gZIPOutputStream.write(bytes);
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AbstractC2933b.m13890a(byteArrayOutputStream, null);
            C26220b.m134828k("encodeHiddenChatData(): compressedData=" + Arrays.toString(byteArray));
            C25724a m120668h = AbstractC23306f.m120668h();
            AbstractC19074t.m100205c(byteArray);
            byte[] m132692m = m120668h.m132692m(byteArray);
            C26220b.m134828k("encodeHiddenChatData(): encryptedData=" + Arrays.toString(m132692m));
            String m101979b = AbstractC19509c.m101979b(m132692m);
            C26220b.m134828k("encodeHiddenChatData(): encodedData=" + m101979b);
            AbstractC19074t.m100205c(m101979b);
            return m101979b;
        } finally {
        }
    }

    /* renamed from: q0 */
    public static /* synthetic */ boolean m116054q0(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m116052p0(z11);
    }

    /* renamed from: r */
    public static final boolean m116055r() {
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (m135087t != null && m135087t.m40975d()) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public static final boolean m116056r0(int i11) {
        return i11 == 7;
    }

    /* renamed from: s */
    public static final boolean m116057s(TargetBackupInfo targetBackupInfo) {
        if (targetBackupInfo == null || targetBackupInfo.m40962t() == -1 || TextUtils.isEmpty(targetBackupInfo.m40959o()) || !Patterns.EMAIL_ADDRESS.matcher(targetBackupInfo.m40959o()).matches()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static final String m116058t(long j11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (j11 <= 0) {
            return "";
        }
        long m17498f = AbstractC3489d.m17498f() - j11;
        if (m17498f <= 60000) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m17498f < 3600000) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m17498f <= 86400000) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (m17498f < 172800000) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z11) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC27413h.zch_time_just_now);
            AbstractC19074t.m100205c(m118743r0);
            return m118743r0;
        }
        if (z12) {
            int i11 = (int) ((m17498f / 1000) / 60);
            String quantityString = MainApplication.Companion.m35500c().getResources().getQuantityString(AbstractC7921d0.str_title_time_mm_minutes_ago, i11, Integer.valueOf(i11));
            AbstractC19074t.m100205c(quantityString);
            return quantityString;
        }
        if (z13) {
            long j12 = 60;
            int i12 = (int) (((m17498f / 1000) / j12) / j12);
            String quantityString2 = MainApplication.Companion.m35500c().getResources().getQuantityString(AbstractC7921d0.str_title_time_hh_hours_ago, i12, Integer.valueOf(i12));
            AbstractC19074t.m100205c(quantityString2);
            return quantityString2;
        }
        if (z14) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_yesterday) + ", " + ((Object) DateFormat.format("HH:mm", j11));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy, HH:mm", Locale.getDefault());
        AbstractC23160o0.m119268l1(simpleDateFormat);
        String format = simpleDateFormat.format(new Date(j11));
        AbstractC19074t.m100205c(format);
        return format;
    }

    /* renamed from: u */
    public static final int m116059u(int i11) {
        return (i11 == 1 || i11 != 2) ? 3 : 4;
    }

    /* renamed from: u0 */
    private final boolean m116060u0(C21690e c21690e, String str) {
        if (!AbstractC25495a.m132078c(str) && (c21690e.m111890p() || !C31986k3.f147083a.m154105P1(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static final int m116061v(int i11, int i12) {
        switch (i11) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 8:
                return m116059u(i12);
            case 3:
            default:
                return m116059u(i12);
            case 4:
                return 8;
            case 7:
                if (i12 == 2) {
                    return 5;
                }
                return 2;
            case 9:
                if (i12 == 2) {
                    return 5;
                }
                return 6;
        }
    }

    /* renamed from: w */
    public static final int m116062w(int i11) {
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    /* renamed from: w0 */
    public static final void m116063w0(C17487o0 c17487o0) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        C22438j.m115953v(c17487o0, bundle);
    }

    /* renamed from: x */
    public static final String m116064x(C21689d c21689d) {
        if (c21689d != null) {
            return c21689d.m143142c() + "." + c21689d.m143143d() + "." + c21689d.m143140a();
        }
        return null;
    }

    /* renamed from: x0 */
    public static final void m116065x0(JSONObject jSONObject) {
        boolean m127149O;
        AbstractC19074t.m100208f(jSONObject, "data");
        try {
            synchronized (f109798b) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("other");
                    if (optJSONObject != null) {
                        AbstractC19074t.m100205c(optJSONObject);
                        String optString = optJSONObject.optString("device_name", "");
                        String optString2 = optJSONObject.optString("model_code", "");
                        AbstractC19074t.m100205c(optString2);
                        if (optString2.length() > 0) {
                            AbstractC19074t.m100205c(optString);
                            m127149O = AbstractC24342w.m127149O(optString, optString2, false, 2, null);
                            if (!m127149O) {
                                AbstractC23306f.m120692n().m133064z(new C26700a(optString2, optString));
                            }
                        }
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            C26220b.m134819b(e11);
        }
    }

    /* renamed from: y */
    public static final C24860q m116066y(C21690e c21690e) {
        int[] m131184L0;
        boolean[] m131181I0;
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        C19669z.b bVar = C19669z.Companion;
        bVar.m103232a().m103229t0();
        List<Conversation> m103212Y0 = bVar.m103232a().m103212Y0();
        ArrayList<String> arrayList = new ArrayList();
        for (Conversation conversation : m103212Y0) {
            if (f109797a.m116060u0(c21690e, conversation.f42893q)) {
                arrayList.add(conversation.f42893q);
            }
        }
        if (arrayList.isEmpty()) {
            return new C24860q(new int[0], new boolean[0]);
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (String str : arrayList) {
            try {
                if (AbstractC25495a.m132079d(str)) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(AbstractC25495a.m132088m(str))));
                    arrayList3.add(Boolean.TRUE);
                } else {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(str)));
                    arrayList3.add(Boolean.FALSE);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SMLBackupRestore", e11);
            }
        }
        m131184L0 = AbstractC25332a0.m131184L0(arrayList2);
        m131181I0 = AbstractC25332a0.m131181I0(arrayList3);
        return new C24860q(m131184L0, m131181I0);
    }

    /* renamed from: y0 */
    public static final C0945x m116067y0(C21690e c21690e, String str) {
        String str2;
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        AbstractC19074t.m100208f(str, "encodedString");
        try {
            try {
                str2 = f109797a.m116075o(c21690e, str);
            } catch (Exception e11) {
                C26220b.m134819b(e11);
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                C26220b.m134827j("parseHiddenChatData(): " + str2, null, 2, null);
                JSONObject jSONObject = new JSONObject(str2);
                C0945x c0945x = new C0945x();
                c0945x.m4493g(jSONObject.optInt("resetCount"));
                JSONArray optJSONArray = jSONObject.optJSONArray("threads");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                        c0945x.m4487a(jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE), jSONObject2.optString("id"));
                    }
                }
                return c0945x;
            }
            return null;
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
            return null;
        }
    }

    /* renamed from: z */
    public static final C24860q m116068z(C21690e c21690e, TargetBackupInfo targetBackupInfo) {
        String str;
        int[] m131184L0;
        boolean[] m131181I0;
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        AbstractC19074t.m100208f(targetBackupInfo, "targetBackupInfo");
        C0945x m116067y0 = m116067y0(c21690e, targetBackupInfo.m40961q());
        if (m116067y0 != null) {
            str = m116067y0.m4489c();
        } else {
            str = null;
        }
        C26220b.m134827j("getExcludedRestoreUids(): hiddenBackupInfo=" + str, null, 2, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (m116067y0 != null && !m116067y0.m4492f() && m116067y0.m4490d() != AbstractC0924m0.m3302O4()) {
            C26220b.m134827j("getExcludedRestoreUids(): (" + m116067y0.m4490d() + " - " + AbstractC0924m0.m3302O4() + ")", null, 2, null);
            Set<String> m4491e = m116067y0.m4491e();
            AbstractC19074t.m100207e(m4491e, "getSetHiddenChat(...)");
            for (String str2 : m4491e) {
                try {
                    if (AbstractC25495a.m132079d(str2)) {
                        arrayList.add(Integer.valueOf(Integer.parseInt(AbstractC25495a.m132088m(str2))));
                        arrayList2.add(Boolean.TRUE);
                    } else {
                        AbstractC19074t.m100205c(str2);
                        arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                        arrayList2.add(Boolean.FALSE);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("SMLBackupRestore", e11);
                }
            }
        }
        arrayList.add(Integer.valueOf(Integer.parseInt("204278670")));
        arrayList2.add(Boolean.FALSE);
        C26220b.m134827j("getExcludedRestoreUids(): excludeUids=" + arrayList + ", excludeGroupFlags=" + arrayList2, null, 2, null);
        m131184L0 = AbstractC25332a0.m131184L0(arrayList);
        m131181I0 = AbstractC25332a0.m131181I0(arrayList2);
        return new C24860q(m131184L0, m131181I0);
    }

    /* renamed from: D0 */
    public final void m116069D0(InterfaceC27218a interfaceC27218a, InterfaceC17463d.d dVar, InterfaceC17463d.e eVar, boolean z11) {
        AbstractC19074t.m100208f(dVar, "negativeListener");
        if (interfaceC27218a == null) {
            return;
        }
        C8009j.a aVar = new C8009j.a(interfaceC27218a.getContext());
        aVar.m43159h(4);
        aVar.m43173v(3);
        aVar.m43171t(AbstractC8020f0.str_dialog_title_guide_open_setting_permission);
        if (z11) {
            aVar.m43161j(AbstractC8020f0.str_zcloud_dialog_desc_guide_open_setting_permission_backup_key);
        } else {
            aVar.m43161j(AbstractC8020f0.str_dialog_desc_guide_open_setting_permission);
        }
        aVar.m43169r(AbstractC8020f0.str_dialog_open_setting_for_permission, new InterfaceC17463d.d() { // from class: ld.q
            public /* synthetic */ C22445q() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C22447s.m116001F0(InterfaceC27218a.this, interfaceC17463d, i11);
            }
        });
        aVar.m43164m(AbstractC8020f0.str_btn_back, dVar);
        C8009j m43152a = aVar.m43152a();
        AbstractC19074t.m100207e(m43152a, "create(...)");
        if (eVar != null) {
            m43152a.m92855F(eVar);
        }
        m43152a.mo13822K();
    }

    /* renamed from: G0 */
    public final void m116070G0(InterfaceC27218a interfaceC27218a, InterfaceC17463d.d dVar) {
        AbstractC19074t.m100208f(dVar, "listenerNegative");
        if (interfaceC27218a == null) {
            return;
        }
        C8009j.a aVar = new C8009j.a(interfaceC27218a.getContext());
        aVar.m43159h(4);
        aVar.m43173v(3);
        aVar.m43171t(AbstractC8020f0.str_dialog_title_guide_open_setting_permission);
        aVar.m43161j(AbstractC8020f0.str_dialog_desc_guide_open_setting_permission_restore_media);
        aVar.m43169r(AbstractC8020f0.str_dialog_open_setting_for_permission, new InterfaceC17463d.d() { // from class: ld.p
            public /* synthetic */ C22444p() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C22447s.m116004H0(InterfaceC27218a.this, interfaceC17463d, i11);
            }
        });
        aVar.m43164m(AbstractC8020f0.str_btn_back, dVar);
        aVar.m43152a().mo13822K();
    }

    /* renamed from: J0 */
    public final void m116071J0() {
        C29628e.m147249E0().m147293v1();
        if (AbstractC23309i.m122243oe()) {
            AbstractC23309i.m121747bA(false);
        }
    }

    /* renamed from: X */
    public final boolean m116072X(int i11) {
        return i11 == 20 || i11 == 21;
    }

    /* renamed from: Y */
    public final boolean m116073Y(int i11) {
        return i11 == 16;
    }

    /* renamed from: e */
    public final void m116074e(TargetBackupInfo targetBackupInfo, String str) {
        AbstractC19074t.m100208f(str, "source");
        if (targetBackupInfo == null || !targetBackupInfo.isValid()) {
            AbstractC23350e.m122774d(str, "Invalid backup info: " + targetBackupInfo);
        }
    }

    /* renamed from: o */
    public final String m116075o(C21690e c21690e, String str) {
        AbstractC19074t.m100208f(c21690e, "sessionInfo");
        if (str != null && str.length() != 0) {
            byte[] m101978a = AbstractC19509c.m101978a(str);
            C26220b.m134828k("decodeHiddenChatData(): decoded64String=" + Arrays.toString(m101978a));
            AbstractC19074t.m100205c(m101978a);
            byte[] m116051p = m116051p(c21690e, m101978a);
            C26220b.m134828k("decodeHiddenChatData(): decryptedData=" + Arrays.toString(m116051p));
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m116051p);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, StandardCharsets.UTF_8));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                } else {
                    bufferedReader.close();
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    String sb3 = sb2.toString();
                    AbstractC19074t.m100207e(sb3, "toString(...)");
                    C26220b.m134827j("decodeHiddenChatData(): data=" + sb3, null, 2, null);
                    return sb3;
                }
            }
        } else {
            return "";
        }
    }

    /* renamed from: s0 */
    public final boolean m116076s0() {
        int m120897Ec = AbstractC23309i.m120897Ec();
        if (m120897Ec != 19 && m120897Ec != 18) {
            return false;
        }
        return true;
    }

    /* renamed from: t0 */
    public final boolean m116077t0() {
        return C24252c.f117152a.m126600f(EnumC24251b.f117148s);
    }

    /* renamed from: v0 */
    public final void m116078v0(InterfaceC27218a interfaceC27218a) {
        if (interfaceC27218a == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + interfaceC27218a.getContext().getPackageName()));
            interfaceC27218a.startActivity(intent);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: z0 */
    public final void m116079z0(String str) {
        AbstractC19074t.m100208f(str, "mes");
        AbstractC20110a.f98889a.mo104551d(str, new Object[0]);
    }
}
