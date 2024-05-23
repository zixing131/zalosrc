package p698yz;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b40.C2549x;
import bi0.AbstractC2807a;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17990p0;
import dj.C17997r1;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hu.C20131e;
import java.io.File;
import java.util.Calendar;
import me0.AbstractC23041d2;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23160o0;
import me0.AbstractC23238v2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p239ih.C20556f;
import p279jw.C21373a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p396ol.C24302e;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import th.AbstractC26687h;
import th.C26686g;
import vg.C28023b6;
import w50.C28770b;

/* renamed from: yz.g */
/* loaded from: classes4.dex */
public abstract class AbstractC31111g {

    /* renamed from: yz.g$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f143353a;

        static {
            int[] iArr = new int[EnumC31105a.values().length];
            try {
                iArr[EnumC31105a.f143329p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC31105a.f143330q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC31105a.f143334u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC31105a.f143331r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC31105a.f143332s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC31105a.f143333t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC31105a.f143335v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC31105a.f143336w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC31105a.f143337x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f143353a = iArr;
        }
    }

    /* renamed from: c */
    public static final void m151122c(Context context, C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c17945a0, "message");
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yz.e

            /* renamed from: q */
            public final /* synthetic */ boolean f143350q;

            /* renamed from: r */
            public final /* synthetic */ Context f143351r;

            public /* synthetic */ RunnableC31109e(boolean z112, Context context2) {
                r2 = z112;
                r3 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC31111g.m151123d(C17945a0.this, r2, r3);
            }
        });
    }

    /* renamed from: d */
    public static final void m151123d(C17945a0 c17945a0, boolean z11, Context context) {
        String str;
        AbstractC19074t.m100208f(c17945a0, "$message");
        AbstractC19074t.m100208f(context, "$context");
        try {
            C31108d m151142w = m151142w(c17945a0);
            boolean m151119b = m151142w.m151119b();
            String m151118a = m151142w.m151118a();
            if (!m151119b) {
                if (c17945a0.m95032V6()) {
                    str = "900102";
                } else {
                    str = "900101";
                }
                AbstractC23647d.m123897g(str);
                c17945a0.m95214o2(true, true);
                return;
            }
            if (c17945a0.m95147gc(m151118a, false, false)) {
                C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
            }
            if (z11) {
                try {
                    AbstractC23152n3.m119036c0(context, new C20556f(c17945a0.m94983Q3()));
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
                C28023b6.m141250h0().m141301M(c17945a0.m95029V3().m41044h());
                m151133n(c17945a0);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: e */
    private static final EnumC31105a m151124e(String str) {
        if (str.length() == 0) {
            return EnumC31105a.f143330q;
        }
        if (m151130k(str)) {
            return EnumC31105a.f143334u;
        }
        return EnumC31105a.f143333t;
    }

    /* renamed from: f */
    public static final boolean m151125f(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        if (C24302e.Companion.m126923n() || !m151135p(c17945a0)) {
            return false;
        }
        try {
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        if (c17945a0.m95043W6() && ((byte) c17945a0.m95089b4()) == 0) {
            return false;
        }
        if (c17945a0.m95306y8()) {
            String m102945X0 = AbstractC19646n0.m102945X0(c17945a0);
            AbstractC19074t.m100207e(m102945X0, "getVideoUrl(...)");
            if (TextUtils.isEmpty(m102945X0)) {
                return false;
            }
            C20556f c20556f = new C20556f(m102945X0);
            if ((!c20556f.m106830b() || c20556f.m106845r() <= 0) && ZMediaPlayer.cacheValidate(ZMediaPlayerSettings.getCacheDir(0), m102945X0) == -1) {
                c17945a0.m95165ic(6, false);
                C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
                return true;
            }
        } else if (c17945a0.m95276v6() && (TextUtils.isEmpty(c17945a0.m94983Q3()) || !AbstractC23041d2.m118194A(c17945a0.m94983Q3()))) {
            c17945a0.m95165ic(6, false);
            C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final C31106b m151126g(Context context, EnumC31107c enumC31107c, C17945a0 c17945a0, EnumC31105a enumC31105a) {
        String string;
        String string2;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(enumC31107c, "uiEntry");
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        AbstractC19074t.m100208f(enumC31105a, "fileStatus");
        int m119607o = C23212s8.m119607o(context, AbstractC2807a.text_02);
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        boolean m17495c = AbstractC3489d.m17495c(mo95039W2);
        String str = "";
        switch (a.f143353a[enumC31105a.ordinal()]) {
            case 1:
                if (enumC31107c != EnumC31107c.f143343q) {
                    str = context.getString(AbstractC8020f0.str_msg_file_status_msg_uploading, c17945a0.m95001S2() + "%");
                    AbstractC19074t.m100207e(str, "getString(...)");
                    break;
                }
                break;
            case 2:
            case 3:
                if (!m17495c) {
                    str = context.getString(AbstractC8020f0.str_msg_file_status_msg_not_downloaded);
                    AbstractC19074t.m100205c(str);
                }
                m119607o = C23212s8.m119607o(context, AbstractC2807a.link_01);
                break;
            case 4:
                str = context.getString(AbstractC8020f0.str_msg_file_status_msg_downloading, c17945a0.m94982Q2() + "%");
                AbstractC19074t.m100207e(str, "getString(...)");
                break;
            case 5:
                str = context.getString(AbstractC8020f0.str_error_download_file);
                AbstractC19074t.m100207e(str, "getString(...)");
                m119607o = C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1);
                break;
            case 6:
                if (AbstractC25495a.m132078c(c17945a0.mo95039W2())) {
                    if (AbstractC26687h.m137065f(c17945a0.mo95039W2(), c17945a0.m95238r3()) && !AbstractC26687h.m137064e(c17945a0)) {
                        String mo95039W22 = c17945a0.mo95039W2();
                        AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
                        C26686g m137060a = AbstractC26687h.m137060a(mo95039W22);
                        boolean m89809x = C16805b.Companion.m89811a().m89809x();
                        if (m137060a != null && !m89809x) {
                            long m137056d = m137060a.m137056d();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTimeInMillis(c17945a0.m94974P4() + m137056d);
                            String m119240c0 = AbstractC23160o0.m119240c0(calendar);
                            AbstractC19074t.m100207e(m119240c0, "getDdMmYyyySlashStr(...)");
                            str = context.getString(AbstractC8020f0.str_msg_file_expires_on, m119240c0);
                            AbstractC19074t.m100205c(str);
                            break;
                        }
                    }
                } else if (!m17495c) {
                    if (c17945a0.m95032V6()) {
                        string = context.getString(AbstractC8020f0.str_msg_file_status_msg_available_on_device);
                    } else {
                        string = context.getString(AbstractC8020f0.str_msg_file_status_msg_downloaded_to_device);
                    }
                    str = string;
                    AbstractC19074t.m100205c(str);
                    break;
                }
                break;
            case 7:
                if (m17495c) {
                    string2 = AbstractC31125u.m151165W(context, c17945a0);
                } else {
                    string2 = context.getString(AbstractC8020f0.str_msg_file_status_msg_unavailable_on_device);
                    AbstractC19074t.m100205c(string2);
                }
                str = string2;
                break;
            case 8:
                String mo95039W23 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W23, "getOwnerId(...)");
                C26686g m137060a2 = AbstractC26687h.m137060a(mo95039W23);
                boolean m89809x2 = C16805b.Companion.m89811a().m89809x();
                if (m137060a2 != null && !m89809x2) {
                    long m137056d2 = m137060a2.m137056d();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTimeInMillis(c17945a0.m94974P4() + m137056d2);
                    String m119240c02 = AbstractC23160o0.m119240c0(calendar2);
                    AbstractC19074t.m100207e(m119240c02, "getDdMmYyyySlashStr(...)");
                    str = context.getString(AbstractC8020f0.str_msg_file_expires_on, m119240c02);
                    AbstractC19074t.m100207e(str, "getString(...)");
                    break;
                }
                break;
            case 9:
                if (m17495c) {
                    string2 = AbstractC31125u.m151165W(context, c17945a0);
                } else {
                    string2 = context.getString(AbstractC8020f0.str_msg_file_expired);
                    AbstractC19074t.m100205c(string2);
                }
                str = string2;
                break;
        }
        return new C31106b(str, m119607o);
    }

    /* renamed from: h */
    public static final int m151127h() {
        if (AbstractC0924m0.m3360Q4() > 0) {
            return AbstractC0924m0.m3360Q4();
        }
        return 7;
    }

    /* renamed from: i */
    public static final long m151128i() {
        return C21373a.f104231a.m110803r().m137056d();
    }

    /* renamed from: j */
    public static final int m151129j() {
        if (AbstractC0924m0.m3389R4() > 0) {
            return AbstractC0924m0.m3389R4();
        }
        return 1;
    }

    /* renamed from: k */
    public static final boolean m151130k(String str) {
        boolean m127149O;
        boolean m127149O2;
        AbstractC19074t.m100208f(str, "localPath");
        m127149O = AbstractC24342w.m127149O(str, C20131e.m104912E(), false, 2, null);
        if (!m127149O) {
            m127149O2 = AbstractC24342w.m127149O(str, C20131e.m104923r(), false, 2, null);
            if (!m127149O2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private static final boolean m151131l(C17945a0 c17945a0, int i11, int i12, int i13) {
        C17990p0 c17990p0;
        long mo124314i = AbstractC23306f.m120579F1().mo124314i();
        if (c17945a0.m95276v6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17990p0) {
                c17990p0 = (C17990p0) m94929K2;
            } else {
                c17990p0 = null;
            }
            if (c17990p0 == null) {
                return false;
            }
            long j11 = c17990p0.f91113B;
            if (AbstractC25495a.m132078c(c17945a0.mo95039W2())) {
                if (AbstractC26687h.m137065f(c17945a0.mo95039W2(), j11)) {
                    boolean m151132m = m151132m(mo124314i, c17945a0.m94974P4(), i11);
                    if (m151132m) {
                        C2549x c2549x = C2549x.f10397a;
                        MessageId m95029V3 = c17945a0.m95029V3();
                        AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
                        c2549x.m12852f(m95029V3);
                    }
                    return m151132m;
                }
            } else if (j11 >= AbstractC0924m0.m3152J()) {
                if (m151132m(mo124314i, c17945a0.m94974P4(), i12)) {
                    C2549x c2549x2 = C2549x.f10397a;
                    MessageId m95029V32 = c17945a0.m95029V3();
                    AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                    c2549x2.m12852f(m95029V32);
                    return true;
                }
            } else if (m151132m(mo124314i, c17945a0.m94974P4(), i13)) {
                C2549x c2549x3 = C2549x.f10397a;
                MessageId m95029V33 = c17945a0.m95029V3();
                AbstractC19074t.m100207e(m95029V33, "getMessageId(...)");
                c2549x3.m12852f(m95029V33);
                return true;
            }
        } else if ((c17945a0.m94871D7() || c17945a0.m95120e6() || c17945a0.m95306y8() || c17945a0.m95120e6()) && !AbstractC25495a.m132078c(c17945a0.mo95039W2()) && m151132m(mo124314i, c17945a0.m94974P4(), i13)) {
            C2549x c2549x4 = C2549x.f10397a;
            MessageId m95029V34 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V34, "getMessageId(...)");
            c2549x4.m12852f(m95029V34);
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static final boolean m151132m(long j11, long j12, int i11) {
        long j13 = j12 + 25200000;
        long j14 = j13 / 86400000;
        long j15 = (j11 + 25200000) / 86400000;
        long j16 = j13 % 86400000;
        if (j16 + ((((j16 ^ 86400000) & ((-j16) | j16)) >> 63) & 86400000) > 0) {
            i11++;
        }
        if (j15 - j14 >= i11) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static final void m151133n(C17945a0 c17945a0) {
        String str;
        AbstractC19074t.m100208f(c17945a0, "message");
        if (c17945a0.m95129f3() > 0 && System.currentTimeMillis() - c17945a0.m95129f3() <= 10000) {
            AbstractC23647d.m123897g("900107");
            c17945a0.m95280va(0L);
        } else if (c17945a0.m95129f3() > 0 && System.currentTimeMillis() - c17945a0.m95129f3() <= 30000) {
            AbstractC23647d.m123897g("900109");
            c17945a0.m95280va(0L);
        } else if (c17945a0.m95129f3() > 0 && System.currentTimeMillis() - c17945a0.m95129f3() <= 300000) {
            AbstractC23647d.m123897g("900108");
            c17945a0.m95280va(0L);
        }
        if (c17945a0.m95032V6()) {
            str = "900104";
        } else {
            str = "900103";
        }
        AbstractC23647d.m123897g(str);
    }

    /* renamed from: o */
    public static final void m151134o(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "featuresJson");
        int i11 = 14;
        int optInt = jSONObject.optInt("rolled_media_threshold", 14);
        if (optInt > 0) {
            i11 = optInt;
        }
        AbstractC0924m0.m3030Em(i11);
        int i12 = 7;
        int optInt2 = jSONObject.optInt("rolled_large_media_threshold", 7);
        if (optInt2 > 0) {
            i12 = optInt2;
        }
        AbstractC0924m0.m3001Dm(i12);
        long j11 = 104857600;
        long optLong = jSONObject.optLong("large_file_size", 104857600L);
        if (optLong > 0) {
            j11 = optLong;
        }
        AbstractC0924m0.m4170re(j11);
    }

    /* renamed from: p */
    public static final boolean m151135p(C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        return m151131l(c17945a0, (int) Math.ceil((m151128i() * 1.0d) / 86400000), m151127h(), m151129j());
    }

    /* renamed from: q */
    public static final boolean m151136q(ItemAlbumMobile itemAlbumMobile) {
        AbstractC19074t.m100208f(itemAlbumMobile, "itemAlbumMobile");
        MessageId m40496C = itemAlbumMobile.m40496C();
        if (m40496C == null || itemAlbumMobile.f42564O <= 0 || TextUtils.isEmpty(itemAlbumMobile.f42579d0) || TextUtils.isEmpty(itemAlbumMobile.f42579d0) || AbstractC25495a.m132078c(itemAlbumMobile.f42579d0) || !m151132m(AbstractC23306f.m120579F1().mo124314i(), itemAlbumMobile.f42564O, m151129j())) {
            return false;
        }
        C2549x.f10397a.m12852f(m40496C);
        return true;
    }

    /* renamed from: r */
    public static final boolean m151137r(C17997r1 c17997r1) {
        AbstractC19074t.m100208f(c17997r1, "reply");
        MessageId m95689f = c17997r1.m95689f();
        AbstractC19074t.m100207e(m95689f, "getMessageId(...)");
        if (AbstractC25495a.m132078c(m95689f.m41048l())) {
            return false;
        }
        int m95687d = c17997r1.m95687d();
        if ((m95687d != 32 && m95687d != 37 && m95687d != 44) || !m151132m(AbstractC23306f.m120579F1().mo124314i(), c17997r1.m95696m(), m151129j())) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public static final EnumC31105a m151138s(MediaStoreItem mediaStoreItem) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        return m151139t(mediaStoreItem.m40599m());
    }

    /* renamed from: t */
    public static final EnumC31105a m151139t(C17945a0 c17945a0) {
        C17990p0 c17990p0;
        long j11;
        AbstractC19074t.m100208f(c17945a0, "message");
        try {
            if (!c17945a0.m95276v6()) {
                return EnumC31105a.f143330q;
            }
            byte m95107d3 = (byte) c17945a0.m95107d3();
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17990p0) {
                c17990p0 = (C17990p0) m94929K2;
            } else {
                c17990p0 = null;
            }
            if (c17990p0 != null) {
                j11 = c17990p0.f91113B;
            } else {
                j11 = 0;
            }
            C28770b m94930K3 = c17945a0.m94930K3();
            if (c17945a0.m95032V6() && c17945a0.m95089b4() == 1) {
                return EnumC31105a.f143329p;
            }
            if (m95107d3 == 4 && c17945a0.m94895G3()) {
                return EnumC31105a.f143331r;
            }
            if (m95107d3 == 5) {
                if (m94930K3 != null && !m94930K3.m143918k()) {
                    return EnumC31105a.f143330q;
                }
                String m94983Q3 = c17945a0.m94983Q3();
                AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
                return m151124e(m94983Q3);
            }
            if (AbstractC26687h.m137065f(c17945a0.mo95039W2(), j11)) {
                String mo95039W2 = c17945a0.mo95039W2();
                AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
                C26686g m137060a = AbstractC26687h.m137060a(mo95039W2);
                if (m137060a == null) {
                    return EnumC31105a.f143330q;
                }
                if (AbstractC23306f.m120579F1().mo124314i() - c17945a0.m94974P4() >= m137060a.m137056d()) {
                    return EnumC31105a.f143337x;
                }
                if (m95107d3 == 6) {
                    return EnumC31105a.f143335v;
                }
                return EnumC31105a.f143336w;
            }
            if (m95107d3 == 6) {
                return EnumC31105a.f143335v;
            }
            if (m95107d3 == 3) {
                return EnumC31105a.f143332s;
            }
            if (c17945a0.m95032V6() && !TextUtils.isEmpty(c17945a0.m94983Q3())) {
                if (m94930K3 != null && !m94930K3.m143918k()) {
                    return EnumC31105a.f143330q;
                }
                String m94983Q32 = c17945a0.m94983Q3();
                AbstractC19074t.m100207e(m94983Q32, "getLocalpath(...)");
                return m151124e(m94983Q32);
            }
            return EnumC31105a.f143330q;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return EnumC31105a.f143330q;
        }
    }

    /* renamed from: u */
    public static final void m151140u(CharSequence charSequence) {
        AbstractC19444a.m101697e(new Runnable() { // from class: yz.f

            /* renamed from: p */
            public final /* synthetic */ CharSequence f143352p;

            public /* synthetic */ RunnableC31110f(CharSequence charSequence2) {
                r1 = charSequence2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC31111g.m151141v(r1);
            }
        });
    }

    /* renamed from: v */
    public static final void m151141v(CharSequence charSequence) {
        Context context;
        TextView textView;
        ZaloBubbleActivity m57051c;
        String m118743r0;
        ZaloBubbleActivity.C10966a c10966a = ZaloBubbleActivity.Companion;
        if (c10966a.m57054h() && (m57051c = c10966a.m57051c()) != null && !m57051c.isFinishing() && !m57051c.isDestroyed()) {
            if (charSequence == null || (m118743r0 = charSequence.toString()) == null) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_file_download_error);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
            }
            m57051c.m57045H5(m118743r0, 2500L);
            return;
        }
        InterfaceC27218a m57112d = ZaloLauncherActivity.Companion.m57112d();
        if (m57112d != null) {
            context = m57112d.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            context = MainApplication.Companion.m35500c();
        }
        View inflate = LayoutInflater.from(context).inflate(AbstractC7409c0.file_download_error_toast_layout, (ViewGroup) null);
        if (charSequence != null && charSequence.length() > 0 && (textView = (TextView) inflate.findViewById(AbstractC6918a0.content)) != null) {
            textView.setText(charSequence);
        }
        ToastUtils.m89257e(inflate, 81);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:            if (r7.m94893G1(r0) != false) goto L71;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:            if (m151130k(r0) != false) goto L75;     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C31108d m151142w(C17945a0 c17945a0) {
        boolean z11;
        AbstractC19074t.m100208f(c17945a0, "message");
        String m94983Q3 = c17945a0.m94983Q3();
        AbstractC19074t.m100207e(m94983Q3, "getLocalpath(...)");
        if (!TextUtils.isEmpty(m94983Q3) && c17945a0.m94893G1(c17945a0.m94983Q3())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (Build.VERSION.SDK_INT < 29) {
            if (!z11) {
                m94983Q3 = c17945a0.m95283w2(false, false);
                AbstractC19074t.m100207e(m94983Q3, "genDownloadFilePath(...)");
                if (!TextUtils.isEmpty(m94983Q3)) {
                    if (!AbstractC19074t.m100204b(m94983Q3, c17945a0.m94983Q3())) {
                    }
                }
                z11 = false;
            } else if (m151130k(m94983Q3)) {
                String m95283w2 = c17945a0.m95283w2(false, false);
                if (!TextUtils.isEmpty(m95283w2) && !AbstractC19074t.m100204b(m95283w2, m94983Q3) && c17945a0.m94893G1(m95283w2)) {
                    AbstractC19074t.m100205c(m95283w2);
                } else {
                    if (AbstractC23238v2.m119718c(new File(c17945a0.m94983Q3()), new File(m94983Q3))) {
                        AbstractC19074t.m100205c(m95283w2);
                    }
                    z11 = false;
                }
                m94983Q3 = m95283w2;
                z11 = true;
            }
        } else if (z11) {
        }
        if (z11 && c17945a0.m95147gc(m94983Q3, false, false)) {
            C23744a.Companion.m124119a().m124116d(6, c17945a0.m95029V3(), c17945a0.mo95039W2());
        }
        return new C31108d(z11, m94983Q3);
    }
}
