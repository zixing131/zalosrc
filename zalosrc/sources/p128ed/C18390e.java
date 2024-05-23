package p128ed;

import com.zing.zalo.backuprestore.media.exception.BackupRestoreMediaException;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import dj.C17945a0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gm.C19490a;
import ho0.AbstractC20110a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import me0.C23055e5;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import sc.C26220b;
import vc.EnumC27961a;
import vi.C28257c;
import vi.C28260f;
import vi.InterfaceC28256b;

/* renamed from: ed.e */
/* loaded from: classes3.dex */
public final class C18390e {

    /* renamed from: a */
    public static final C18390e f92781a = new C18390e();

    /* renamed from: b */
    private static final InterfaceC24854k f92782b;

    /* renamed from: ed.e$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f92783q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final SimpleDateFormat mo12V4() {
            return new SimpleDateFormat("yyyyMMdd");
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f92783q);
        f92782b = m129210a;
    }

    private C18390e() {
    }

    /* renamed from: f */
    public static final String m97404f(String str, MessageId messageId) {
        String str2;
        AbstractC19074t.m100208f(str, "senderId");
        if (messageId == null || (str2 = messageId.m41044h()) == null) {
            str2 = "";
        }
        return str + "_" + str2;
    }

    /* renamed from: i */
    public static final String m97405i(String str, String str2, String str3, String str4) {
        AbstractC19074t.m100208f(str, "currentUserUid");
        AbstractC19074t.m100208f(str2, "ownerId");
        AbstractC19074t.m100208f(str3, "senderId");
        AbstractC19074t.m100208f(str4, "clientMsgId");
        return str + "_" + str2 + "_" + str3 + "_" + str4;
    }

    /* renamed from: j */
    public static final String m97406j(C17945a0 c17945a0) {
        String m95176k4;
        String str;
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String m94983Q3 = c17945a0.m94983Q3();
        if (m94983Q3 != null && m94983Q3.length() != 0) {
            m95176k4 = c17945a0.m94973P3();
            str = "getLocalPathAndCheckExistDir(...)";
        } else {
            m95176k4 = c17945a0.m95176k4(c17945a0.m95090b5());
            str = "getPhotoMsgDownloadPath(...)";
        }
        AbstractC19074t.m100207e(m95176k4, str);
        return m95176k4;
    }

    /* renamed from: k */
    private final SimpleDateFormat m97407k() {
        return (SimpleDateFormat) f92782b.getValue();
    }

    /* renamed from: m */
    public static final String m97408m(int i11) {
        switch (i11) {
            case 1:
                return "GET_TOKEN";
            case 2:
                return "GET_LIST";
            case 3:
                return "ANALYZE";
            case 4:
                return "UPLOAD";
            case 5:
                return "DOWNLOAD";
            case 6:
                return "DELETE";
            case 7:
                return "UPDATE_MEDIA_INFO";
            default:
                return Image.SCALE_TYPE_NONE;
        }
    }

    /* renamed from: p */
    public static final boolean m97409p() {
        if (AbstractC23306f.m120676j().m128426v().m128445d() == 1 && m97410q()) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static final boolean m97410q() {
        if (AbstractC23306f.m120676j().m128426v().m128456o() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static final void m97411s(String str) {
        AbstractC19074t.m100208f(str, "msg");
        m97413u(str, false, 2, null);
    }

    /* renamed from: t */
    public static final void m97412t(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "msg");
    }

    /* renamed from: u */
    public static /* synthetic */ void m97413u(String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        m97412t(str, z11);
    }

    /* renamed from: a */
    public final void m97414a(int i11) {
        if (C22447s.m116049n0()) {
            if (!C23055e5.m118270e()) {
                throw new BackupRestoreMediaException(i11, ZAbstractBase.ZVU_PROCESS_HLS_TO_MP4, "[" + m97408m(i11) + "] No WIFI!");
            }
            return;
        }
        if (C23055e5.m118273h(false, 1, null)) {
            return;
        }
        throw new BackupRestoreMediaException(i11, 2006, "[" + m97408m(i11) + "] Network not available!");
    }

    /* renamed from: b */
    public final boolean m97415b() {
        if (m97410q() && AbstractC23306f.m120676j().m128426v().m128444c() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String m97416c(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            String encode = URLEncoder.encode(str, "utf-8");
            AbstractC19074t.m100207e(encode, "encode(...)");
            return encode;
        } catch (UnsupportedEncodingException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return str;
        } catch (Exception e12) {
            AbstractC20110a.f98889a.mo104552e(e12);
            return str;
        }
    }

    /* renamed from: d */
    public final String m97417d(long j11) {
        String format = m97407k().format(new Date(j11));
        AbstractC19074t.m100207e(format, "format(...)");
        return format;
    }

    /* renamed from: e */
    public final int m97418e(String str) {
        AbstractC19074t.m100208f(str, "input");
        return 93 + str.hashCode();
    }

    /* renamed from: g */
    public final int m97419g(C28260f c28260f) {
        AbstractC19074t.m100208f(c28260f, "zipFile");
        int i11 = 0;
        for (InterfaceC28256b interfaceC28256b : c28260f.m142309k().values()) {
            if ((interfaceC28256b instanceof C28257c) && ((C28257c) interfaceC28256b).m142293e() == EnumC27961a.f130361t) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: h */
    public final int m97420h(C28260f c28260f) {
        AbstractC19074t.m100208f(c28260f, "zipFile");
        int i11 = 0;
        for (InterfaceC28256b interfaceC28256b : c28260f.m142309k().values()) {
            if (!(interfaceC28256b instanceof C28257c) || ((C28257c) interfaceC28256b).m142293e() == EnumC27961a.f130358q) {
                i11++;
            }
        }
        return i11;
    }

    /* renamed from: l */
    public final String m97421l(String str) {
        boolean m127125u;
        AbstractC19074t.m100208f(str, "zipName");
        m127125u = AbstractC24341v.m127125u(str, ".zip", false, 2, null);
        if (!m127125u) {
            return str + ".zip";
        }
        return str;
    }

    /* renamed from: n */
    public final String m97422n(Vector vector) {
        if (vector != null && !vector.isEmpty()) {
            try {
                String str = ((C19490a.a) vector.get(0)).f96748h;
                AbstractC19074t.m100207e(str, "href");
                return str;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        return "";
    }

    /* renamed from: o */
    public final String m97423o(String str) {
        String m127166W0;
        AbstractC19074t.m100208f(str, "zipName");
        if (str.length() > 0) {
            m127166W0 = AbstractC24342w.m127166W0(str, "_", null, 2, null);
            return m127166W0;
        }
        return "";
    }

    /* renamed from: r */
    public final boolean m97424r(InterfaceC28256b interfaceC28256b) {
        AbstractC19074t.m100208f(interfaceC28256b, "fileMD");
        if ((interfaceC28256b instanceof C28257c) && ((C28257c) interfaceC28256b).m142293e() == EnumC27961a.f130361t) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final String m97425v(String str) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        try {
            String m122788d = AbstractC23352g.m122788d(str);
            if (m122788d == null) {
                return "";
            }
            return m122788d;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: w */
    public final String m97426w(String str) {
        AbstractC19074t.m100208f(str, "zipName");
        if (str.length() > 0) {
            List m127021i = new C24329j("_").m127021i(str, 0);
            if (m127021i.size() == 5) {
                String str2 = (String) m127021i.get(1);
                try {
                    if (Integer.parseInt((String) m127021i.get(2)) == 2) {
                        return "group_" + str2;
                    }
                    return str2;
                } catch (NumberFormatException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    return "";
                }
            }
            m97412t("parseOwnerIdFromZipName-MAX_PROPERTIES_FOR_ZIP_NAME invalid", true);
            return "";
        }
        m97412t("parseOwnerIdFromZipName-zipName empty", true);
        return "";
    }

    /* renamed from: x */
    public final int m97427x(String str) {
        Object m131216p0;
        int m127173b0;
        AbstractC19074t.m100208f(str, "zipName");
        if (str.length() > 0) {
            List m127021i = new C24329j("_").m127021i(str, 0);
            if (m127021i.size() == 5) {
                try {
                    m131216p0 = AbstractC25332a0.m131216p0(m127021i);
                    String str2 = (String) m131216p0;
                    m127173b0 = AbstractC24342w.m127173b0(str2, ".zip", 0, false, 6, null);
                    if (m127173b0 < 0) {
                        return Integer.parseInt(str2);
                    }
                    String substring = str2.substring(0, m127173b0);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    return Integer.parseInt(substring);
                } catch (NumberFormatException e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            } else {
                m97412t("parseSuffixNFromZipName-MAX_PROPERTIES_FOR_ZIP_NAME invalid", true);
            }
        } else {
            m97412t("parseSuffixNFromZipName-zipName empty", true);
        }
        return 0;
    }

    /* renamed from: y */
    public final long m97428y(String str) {
        AbstractC19074t.m100208f(str, "zipName");
        if (str.length() > 0) {
            List m127021i = new C24329j("_").m127021i(str, 0);
            if (m127021i.size() == 5) {
                String str2 = (String) m127021i.get(3);
                if (str2.length() > 0) {
                    try {
                        Date parse = m97407k().parse(str2);
                        if (parse == null) {
                            return 0L;
                        }
                        return parse.getTime();
                    } catch (ParseException e11) {
                        C26220b.m134819b(new IllegalArgumentException("Invalid backup media zip name: " + str, e11));
                    }
                } else {
                    m97412t("parseZipTimeFromZipName-zipTime is empty", true);
                }
            } else {
                m97412t("parseZipTimeFromZipName-MAX_PROPERTIES_FOR_ZIP_NAME invalid", true);
            }
        }
        return 0L;
    }
}
