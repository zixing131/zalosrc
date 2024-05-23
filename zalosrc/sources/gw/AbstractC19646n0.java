package gw;

import ae.C0766k;
import ag0.AbstractC0826k;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0814e0;
import ag0.C0824j;
import ag0.C0843s0;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import am.C0943w;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import b40.C2546u;
import bh.C2799a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.chatrow.AbstractC11531v0;
import com.zing.zalo.p077ui.chat.chatrow.C11479h0;
import com.zing.zalo.p077ui.chat.chatrow.C11489j2;
import com.zing.zalo.p077ui.chat.chatrow.C11501m2;
import com.zing.zalo.p077ui.chat.chatrow.C11528u0;
import com.zing.zalo.p077ui.chat.chatrow.ChatRow;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowBankCardOffline;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowCallTime;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowDoodle;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowEcard;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowFile;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowGame;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowGif;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowLiveLocation;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowLocation;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMsgInfo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowMultiStickers;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowPhoto;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendContact;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLink;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkMp3;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkPage;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendLinkProductCatalog;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowRecommendSticker;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowSectionDivider;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowShortVideo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowShortVideoProfile;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowUnSupport;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowUndo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideo;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoLiveStream;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoMask;
import com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoOALink;
import com.zing.zalo.p077ui.widget.C13646i;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.C13716q;
import com.zing.zalo.uicontrol.C16660t2;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zalocloud.utils.AbstractC16893a;
import com.zing.zalo.zalocloud.utils.MediaExtInfo;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.utils.cryptology.CoreUtils;
import dj.C17945a0;
import dj.C17949b1;
import dj.C17958e1;
import dj.C17961f1;
import dj.C17987o0;
import dj.C17990p0;
import dj.C18005u0;
import dj.C18009w0;
import dj.C18011x0;
import ee.C18403k;
import eg.C18425b;
import eg0.C18427b;
import en0.InterfaceC18505l;
import gg0.AbstractC19444a;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import hu.AbstractC20130d;
import hu.C20131e;
import i60.C20350p;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me0.AbstractC23008a2;
import me0.AbstractC23028c0;
import me0.AbstractC23041d2;
import me0.AbstractC23059e9;
import me0.AbstractC23112j7;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23165o5;
import me0.AbstractC23184q2;
import me0.AbstractC23244v8;
import me0.AbstractC23262x6;
import me0.C23055e5;
import me0.C23250w4;
import mg.C23288a;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3535c;
import p056cj.C3537e;
import p111du.AbstractC18069a;
import p133ek.AbstractC18458a;
import p239ih.C20551a;
import p239ih.C20556f;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p392oh.C24261h;
import p394oj.C24275a;
import p461qu.AbstractC25495a;
import p487rl.C25821b;
import p542ub.InterfaceC27218a;
import p559uv.C27373c;
import p613wl.C29086b;
import p716zh.C31838a5;
import p716zh.C31894e1;
import p716zh.C31944h6;
import p716zh.C31961i8;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32091r6;
import p716zh.C32118t5;
import p716zh.C32163w8;
import ph.C24751d;
import ph.C24753f;
import pm0.C24848g0;
import r30.C25641k;
import sx.C26399a;
import sx.C26404f;
import sx.EnumC26407i;
import th.AbstractC26689j;
import tj.C26710b;
import tj.C26713e;
import vg.C28023b6;
import vg.C28176r6;
import vg.C28203u6;
import wd0.C28931k;
import xd0.C29590f;
import xd0.C29591g;
import xd0.C29593i;
import xd0.C29595k;

/* renamed from: gw.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC19646n0 {

    /* renamed from: a */
    public static final AtomicBoolean f97515a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final Comparator f97516b = new Comparator() { // from class: gw.f0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m102916N1;
            m102916N1 = AbstractC19646n0.m102916N1((C17945a0) obj, (C17945a0) obj2);
            return m102916N1;
        }
    };

    /* renamed from: gw.n0$a */
    /* loaded from: classes4.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Conversation f97517a;

        a(Conversation conversation) {
            this.f97517a = conversation;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            String m132088m = AbstractC25495a.m132088m(this.f97517a.f42893q);
            if (!TextUtils.isEmpty(m132088m)) {
                C31973j5 m4472f = C0943w.m4462l().m4472f(m132088m);
                if (m4472f != null && !TextUtils.isEmpty(m4472f.m153793y())) {
                    String str = this.f97517a.f42893q;
                    String m153793y = m4472f.m153793y();
                    this.f97517a.f42894r = m4472f.m153793y();
                    this.f97517a.m40998a().f42437s = m4472f.m153793y();
                    C7959d.m41638d1().m41787g3(str, m153793y);
                    return;
                }
                C0843s0.m2286r().m2294e(new AbstractC0826k.a(this.f97517a.f42893q, 0));
            }
        }
    }

    /* renamed from: gw.n0$b */
    /* loaded from: classes4.dex */
    public class b extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Conversation f97518a;

        b(Conversation conversation) {
            this.f97518a = conversation;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f97518a.f42893q);
            if (m141809c != null && !TextUtils.isEmpty(m141809c.f42437s) && !TextUtils.isEmpty(m141809c.f42446v)) {
                Conversation conversation = this.f97518a;
                String str = conversation.f42893q;
                String str2 = m141809c.f42437s;
                String str3 = m141809c.f42446v;
                conversation.f42894r = str2;
                conversation.f42895s = str3;
                conversation.m40998a().f42437s = str2;
                this.f97518a.m40998a().f42446v = str3;
                C7959d.m41638d1().m41766Y2(str, str3, str2);
                return;
            }
            C0843s0.m2286r().m2294e(new AbstractC0826k.b(this.f97518a.f42893q, new TrackingSource((short) 1001)));
        }
    }

    /* renamed from: A */
    public static void m102875A(MessageId messageId) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(messageId);
            C24261h.m126630v().m126647n(messageId.m41048l(), arrayList, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: A0 */
    public static String m102876A0(List list, int i11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i12 = 0; i12 < list.size(); i12++) {
                jSONArray.put(((InviteContactProfile) list.get(i12)).m40488x1());
            }
            jSONObject.put("contacts", jSONArray);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: A1 */
    public static boolean m102877A1(long j11, String str, String str2) {
        if (C23793c.m124316k().mo124314i() - j11 <= m102894G0(str, str2) * 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public static int m102878B(int i11, boolean z11) {
        if (i11 == 0) {
            return z11 ? 41 : 1;
        }
        if (i11 == 6) {
            return 31;
        }
        if (i11 == 10) {
            return 36;
        }
        if (i11 == 12) {
            return 38;
        }
        if (i11 == 15) {
            return 42;
        }
        if (i11 == 36) {
            return 45;
        }
        if (i11 == 2) {
            return 37;
        }
        if (i11 != 3 && i11 != 4) {
            if (i11 == 18) {
                return 43;
            }
            if (i11 == 19) {
                return 44;
            }
            switch (i11) {
                case 21:
                    return 48;
                case 22:
                    return 46;
                case 23:
                    return 49;
                case 24:
                    return 52;
                case 25:
                    return 50;
                default:
                    switch (i11) {
                        case 28:
                            return 53;
                        case 29:
                            return 54;
                        case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                            return 55;
                        case 31:
                            break;
                        case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                            return 59;
                        case 33:
                            return 47;
                        default:
                            return 1;
                    }
            }
        }
        return 32;
    }

    /* renamed from: B0 */
    public static String m102879B0(List list, int i11, long j11) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i12 = 0; i12 < list.size(); i12++) {
                jSONArray.put(((InviteContactProfile) list.get(i12)).m40488x1());
            }
            jSONObject.put("contacts", jSONArray);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
            jSONObject.put("invitedTime", j11);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: B1 */
    public static boolean m102880B1(C17945a0 c17945a0) {
        if (c17945a0 == null) {
            return false;
        }
        return m102877A1(c17945a0.m94974P4(), c17945a0.mo95039W2(), c17945a0.m94862C4());
    }

    /* renamed from: C */
    public static int m102881C(int i11) {
        if (i11 == 32) {
            return 3;
        }
        if (i11 == 38) {
            return 12;
        }
        if (i11 != 44) {
            return i11 != 46 ? -1 : 22;
        }
        return 19;
    }

    /* renamed from: C0 */
    public static List m102882C0() {
        return Arrays.asList(22);
    }

    /* renamed from: C1 */
    public static boolean m102883C1(C17945a0 c17945a0) {
        if (c17945a0 == null || C23793c.m124316k().mo124314i() - c17945a0.m94974P4() > AbstractC23309i.m121708a9() * 1000) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: D */
    public static int m102884D(String str) {
        char c11;
        str.hashCode();
        switch (str.hashCode()) {
            case -1833635285:
                if (str.equals("share.file")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1563481104:
                if (str.equals("chat.list.action")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1140042973:
                if (str.equals("chat.video.memo")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -729511816:
                if (str.equals("chat.video.msg")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -466285336:
                if (str.equals("chat.video.live.msg")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -379814913:
                if (str.equals("chat.reaction")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -267818121:
                if (str.equals("chat.livelocation")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 295048893:
                if (str.equals("chat.location.new")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 479519941:
                if (str.equals("chat.recommended")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 691947259:
                if (str.equals("chat.webcontent")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 1141024001:
                if (str.equals("chat.delete")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 1150347375:
                if (str.equals("chat.doodle")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case 1223857324:
                if (str.equals("webchat")) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case 1436262446:
                if (str.equals("chat.gif")) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case 1561681631:
                if (str.equals("chat.ecard")) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case 1566793996:
                if (str.equals("chat.sync.theme")) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case 1572002844:
                if (str.equals("chat.photo")) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 1574884794:
                if (str.equals("chat.undo")) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 1577746204:
                if (str.equals("chat.voice")) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 1866257575:
                if (str.equals("chat.sticker")) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return 46;
            case 1:
                return 42;
            case 2:
                return 53;
            case 3:
                return 44;
            case 4:
                return 50;
            case 5:
                return 55;
            case 6:
                return 59;
            case 7:
                return 43;
            case '\b':
                return 38;
            case '\t':
                return 52;
            case '\n':
                return 47;
            case 11:
                return 37;
            case '\f':
                return 1;
            case '\r':
                return 49;
            case 14:
                return 48;
            case 15:
                return 54;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return 32;
            case 17:
                return 45;
            case 18:
                return 31;
            case 19:
                return 36;
            default:
                return -1;
        }
    }

    /* renamed from: D0 */
    public static String m102885D0(List list) {
        String str;
        String str2;
        String str3;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            try {
                if (((C17945a0) list.get(i14)).m95288w8() && ((C17945a0) list.get(i14)).m95099c7()) {
                    i11++;
                } else if (((C17945a0) list.get(i14)).m94871D7()) {
                    i12++;
                } else if (((C17945a0) list.get(i14)).m95306y8()) {
                    i13++;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return "";
            }
        }
        if (i11 == 1) {
            str = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_gif), Integer.valueOf(i11));
        } else if (i11 <= 1) {
            str = "";
        } else {
            str = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_gif_multi), Integer.valueOf(i11));
        }
        if (i12 == 1) {
            str2 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_photo), Integer.valueOf(i12));
        } else if (i12 <= 1) {
            str2 = "";
        } else {
            str2 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_photo_multi), Integer.valueOf(i12));
        }
        if (i13 == 1) {
            str3 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_video), Integer.valueOf(i13));
        } else if (i13 <= 1) {
            str3 = "";
        } else {
            str3 = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_video_multi), Integer.valueOf(i13));
        }
        LinkedList linkedList = new LinkedList();
        if (!TextUtils.isEmpty(str2)) {
            linkedList.add(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            linkedList.add(str3);
        }
        if (!TextUtils.isEmpty(str)) {
            linkedList.add(str);
        }
        if (linkedList.size() == 3) {
            return ((String) linkedList.get(0)) + ", " + ((String) linkedList.get(1)) + " " + MainApplication.getAppContext().getString(AbstractC8020f0.str_and) + " " + ((String) linkedList.get(2));
        }
        if (linkedList.size() == 2) {
            return ((String) linkedList.get(0)) + " " + MainApplication.getAppContext().getString(AbstractC8020f0.str_and) + " " + ((String) linkedList.get(1));
        }
        return str2 + str3 + str;
    }

    /* renamed from: D1 */
    public static boolean m102886D1(int i11) {
        return i11 == 19;
    }

    /* renamed from: E */
    private static JSONObject m102887E(String str, C17945a0 c17945a0, boolean z11) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rType", -1);
            jSONObject.put("rIcon", str);
            JSONArray jSONArray = new JSONArray();
            if (z11) {
                List m102891F0 = m102891F0(c17945a0.mo95039W2(), c17945a0.m95029V3(), true);
                for (int i11 = 0; i11 < m102891F0.size(); i11++) {
                    C17945a0 c17945a02 = (C17945a0) m102891F0.get(i11);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("cMsgID", c17945a02.m95029V3().m41045i());
                    jSONObject2.put("gMsgID", c17945a02.m95029V3().m41047k());
                    jSONObject2.put("msgType", m102878B(c17945a0.m95041W4(), false));
                    jSONArray.put(jSONObject2);
                }
            } else {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("cMsgID", c17945a0.m95029V3().m41045i());
                jSONObject3.put("gMsgID", c17945a0.m95029V3().m41047k());
                jSONObject3.put("msgType", m102878B(c17945a0.m95041W4(), false));
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("rMsg", jSONArray);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: E0 */
    public static List m102888E0() {
        return Arrays.asList(3, 4, 2);
    }

    /* renamed from: E1 */
    public static boolean m102889E1(int i11) {
        return i11 == 6;
    }

    /* renamed from: F */
    public static String m102890F(JSONObject jSONObject, int i11) {
        if (jSONObject == null) {
            return "";
        }
        try {
            return m102928R1(jSONObject, m102925Q1(jSONObject), new C7907e(), i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: F0 */
    public static List m102891F0(String str, MessageId messageId, boolean z11) {
        C17945a0 c17945a0;
        ArrayList arrayList = new ArrayList();
        try {
            C3535c m2634q = AbstractC23306f.m120584H0().m2634q(str);
            if (m2634q != null) {
                synchronized (m2634q) {
                    try {
                        List m17941F0 = m2634q.m17941F0();
                        if (!m17941F0.isEmpty()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < m17941F0.size()) {
                                    c17945a0 = (C17945a0) m17941F0.get(i11);
                                    if (c17945a0.m95135f9(messageId)) {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    c17945a0 = null;
                                    break;
                                }
                            }
                            if (c17945a0 != null) {
                                if (!c17945a0.m94969O6() && !c17945a0.m95100c8()) {
                                    if (!z11 || !c17945a0.m95219o8()) {
                                        arrayList.add(c17945a0);
                                    }
                                }
                                for (int i12 = i11 - 1; i12 >= 0; i12--) {
                                    C17945a0 c17945a02 = (C17945a0) m17941F0.get(i12);
                                    if (m102922P1(c17945a0, c17945a02)) {
                                        break;
                                    }
                                    if (m103028s2(c17945a02, z11)) {
                                        arrayList.add(0, c17945a02);
                                    }
                                }
                                if (m103028s2(c17945a0, z11)) {
                                    arrayList.add(c17945a0);
                                }
                                while (true) {
                                    i11++;
                                    if (i11 >= m17941F0.size()) {
                                        break;
                                    }
                                    C17945a0 c17945a03 = (C17945a0) m17941F0.get(i11);
                                    if (m102922P1(c17945a0, c17945a03)) {
                                        break;
                                    }
                                    if (m103028s2(c17945a03, z11)) {
                                        arrayList.add(c17945a03);
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: F1 */
    public static /* synthetic */ void m102892F1(MessageId messageId, Runnable runnable, Runnable runnable2) {
        try {
            if (AbstractC23306f.m120584H0().m2635r(messageId) != null) {
                AbstractC19444a.m101695c(runnable);
            } else {
                AbstractC19444a.m101695c(runnable2);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: G */
    public static String m102893G() {
        String m93451f = CoreUtils.m93451f();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (sb2.length() < 16) {
            sb2.append(m93451f.charAt(i11));
            i11 += 2;
        }
        int length = m93451f.length() - 1;
        while (sb2.length() < 32) {
            sb2.append(m93451f.charAt(length));
            length -= 2;
        }
        return sb2.toString();
    }

    /* renamed from: G0 */
    public static long m102894G0(String str, String str2) {
        if (AbstractC25495a.m132079d(str) && AbstractC23184q2.m119458p(str)) {
            return AbstractC23309i.m121226N8();
        }
        return AbstractC23309i.m121263O8();
    }

    /* renamed from: G1 */
    public static /* synthetic */ void m102895G1(String str, String str2) {
        C29591g.b bVar = (C29591g.b) new C29591g(AbstractC23306f.m120584H0()).m101509a(new C29591g.a(str, str2));
        if (bVar != null) {
            AbstractC23306f.m120610Q().m101508a(new C29590f.b(str, bVar.m147045a()));
        }
    }

    /* renamed from: H */
    public static void m102896H(String str, String str2) {
        try {
            C23288a.f113033a.mo13474a(new C18427b(str, new Runnable() { // from class: gw.j0

                /* renamed from: p */
                public final /* synthetic */ String f97502p;

                /* renamed from: q */
                public final /* synthetic */ String f97503q;

                public /* synthetic */ RunnableC19638j0(String str3, String str22) {
                    r1 = str3;
                    r2 = str22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19646n0.m102895G1(r1, r2);
                }
            }));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: H0 */
    public static long[] m102897H0() {
        return new long[]{3, 4, 2, 6, 19, 22, 24, 12};
    }

    /* renamed from: H1 */
    public static /* synthetic */ void m102898H1(String str, String str2) {
        C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", str, "" + str), 20).m95382r(str2).m95387w(0).m95365a();
        m95365a.m94951M9();
        AbstractC23306f.m120681k0().m101500a(new C29593i.a(str, m95365a));
        AbstractC23306f.m120724x().m99492f(m95365a);
    }

    /* renamed from: I */
    public static void m102899I(C24753f c24753f, C17945a0 c17945a0, int i11, boolean z11) {
        try {
            if (!C23055e5.m118272g(true)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c17945a0.m95029V3());
            C23744a.m124114c().m124116d(47, new C20350p(c17945a0.mo95039W2(), arrayList, c24753f.m128595h(), true, true));
            m102956a2(c17945a0, c24753f, i11, z11);
            if (AbstractC25495a.m132079d(c17945a0.mo95039W2())) {
                AbstractC23647d.m123897g("1090105");
            } else {
                AbstractC23647d.m123897g("990105");
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: I0 */
    public static long[] m102900I0() {
        return m102897H0();
    }

    /* renamed from: I1 */
    public static /* synthetic */ void m102901I1(String str, C3020p0 c3020p0, C3537e c3537e) {
        String string;
        long m103087c;
        try {
            try {
                C17945a0 m2603B = AbstractC23306f.m120584H0().m2603B(str);
                if (m2603B != null && m2603B.m95261t6() && (m2603B.m94929K2() instanceof C17987o0)) {
                    if (((C17987o0) m2603B.m94929K2()).m95659g().m14322a0().f12057p.equals(c3020p0.f12057p)) {
                        return;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            C3020p0 m14322a0 = c3537e.f14921d.m14322a0();
            String m14465A = m14322a0.m14465A();
            C3000l0 c3000l0 = c3537e.f14921d;
            if (c3000l0 != null && !TextUtils.isEmpty(c3000l0.m14322a0().f12050d0)) {
                string = c3537e.f14921d.m14322a0().f12050d0;
            } else {
                C3025q0 c3025q0 = m14322a0.f12023C;
                if (c3025q0 != null && !TextUtils.isEmpty(c3025q0.f12110a)) {
                    String charSequence = m14322a0.f12023C.f12110a.toString();
                    string = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_feed, charSequence.substring(0, Math.min(50, charSequence.length())));
                } else {
                    string = MainApplication.getAppContext().getString(AbstractC8020f0.str_type_msg_feed_no_caption);
                }
            }
            if (c3537e.f14919b) {
                m103087c = AbstractC23306f.m120599M0().m103087c();
            } else {
                List m2604C = AbstractC23306f.m120584H0().m2604C(m14465A, 1);
                if (m2604C.size() > 0 && m2604C.get(0) != null) {
                    m103087c = ((C17945a0) m2604C.get(0)).m94974P4() + 1;
                } else {
                    m103087c = AbstractC23306f.m120599M0().m103087c();
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("params", c3537e.f14922e);
            C17945a0.w m95386v = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", m14465A, m14465A), 34).m95382r(string).m95359K(m103087c).m95368d(new C17987o0(jSONObject)).m95386v(4);
            C3047v0 c3047v0 = m14322a0.f12022B;
            if (c3047v0 != null && !TextUtils.isEmpty(c3047v0.f12282d)) {
                m95386v.m95354F(m14322a0.f12022B.f12282d);
            }
            m95386v.m95387w(c3537e.f14920c ? 1 : 0);
            C17945a0 m95365a = m95386v.m95365a();
            m95365a.m94951M9();
            AbstractC23306f.m120681k0().m101500a(new C29593i.a(m14465A, m95365a, new C28931k.d(c3537e.f14918a)));
            AbstractC23306f.m120724x().m99492f(m95365a);
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: J */
    public static void m102902J(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_invited_members_already_in_join_pending_list), "action.open.group.invitee_list", m102876A0(list, 7), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: J0 */
    public static void m102903J0(String str, ArrayList arrayList, C7907e c7907e) {
        try {
            Matcher matcher = Pattern.compile("\\%(\\d+)\\$s").matcher(str);
            int size = arrayList.size();
            int[] iArr = new int[size];
            Arrays.fill(iArr, -1);
            boolean z11 = false;
            int i11 = 0;
            while (matcher.find()) {
                z11 = true;
                int parseInt = Integer.parseInt(matcher.group(1)) - 1;
                iArr[parseInt] = matcher.start() + i11;
                String str2 = ((C32118t5) arrayList.get(parseInt)).f148055a;
                String str3 = ((C32118t5) arrayList.get(parseInt)).f148056b;
                boolean z12 = ((C32118t5) arrayList.get(parseInt)).f148057c;
                if (CoreUtility.f89233i.equals(str2)) {
                    if (iArr[parseInt] == 0) {
                        str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne);
                    } else {
                        str3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne_lowercase);
                    }
                    arrayList.set(parseInt, new C32118t5(str2, str3, z12));
                }
                i11 += str3.length() - matcher.group(0).length();
            }
            if (z11) {
                for (int i12 = 0; i12 < size; i12++) {
                    if (iArr[i12] >= 0) {
                        String str4 = ((C32118t5) arrayList.get(i12)).f148055a;
                        String str5 = ((C32118t5) arrayList.get(i12)).f148056b;
                        boolean z13 = ((C32118t5) arrayList.get(i12)).f148057c;
                        if (!CoreUtility.f89233i.equals(str4)) {
                            c7907e.m40852b(new C7907e.a(Long.parseLong(str4), iArr[i12], str5.length(), z13));
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            AbstractC23350e.m122778h(new Exception("Message: " + str));
        }
    }

    /* renamed from: J1 */
    public static /* synthetic */ void m102904J1(C17945a0 c17945a0, Conversation conversation) {
        C7956b.m41474B().m41544k(c17945a0);
        c17945a0.m95016Ta(0);
        c17945a0.m95182kb(false);
        c17945a0.m95096c1();
        c17945a0.m95007S9();
        C7956b.m41474B().m41538d0(c17945a0);
        AbstractC23306f.m120612Q1().m101500a(new C28931k.b(conversation, c17945a0));
        C0814e0.m2064j(c17945a0);
    }

    /* renamed from: K */
    public static void m102905K(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_invitees_not_in_phonebook_receive_invitation_message2), "action.open.group.invitee_list", m102876A0(list, 1), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: K0 */
    public static List m102906K0() {
        return Arrays.asList(3, 4);
    }

    /* renamed from: K1 */
    public static /* synthetic */ C24848g0 m102907K1(C3535c c3535c) {
        Iterator it = c3535c.m17941F0().iterator();
        while (it.hasNext()) {
            ((C17945a0) it.next()).m95034V9();
        }
        return C24848g0.f119245a;
    }

    /* renamed from: L */
    public static void m102908L(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_invitee_banned_group_discover_postfix), "action.open.group.invitee_list", m102876A0(list, 10), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: L0 */
    public static C24753f m102909L0(String str, MessageId messageId) {
        try {
            C24751d m126650x = C24261h.m126630v().m126650x(messageId);
            if (m126650x == null) {
                return null;
            }
            return m126650x.m128570n(Integer.parseInt(CoreUtility.f89233i));
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: L1 */
    public static /* synthetic */ void m102910L1(List list, String str) {
        int i11;
        int i12;
        boolean z11;
        int i13;
        try {
            int i14 = C32163w8.m155135a().f148293f;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            boolean z12 = true;
            int i15 = 0;
            int i16 = 0;
            int i17 = 1;
            boolean z13 = true;
            boolean z14 = false;
            long j11 = 0;
            while (i15 < list.size()) {
                C17945a0 c17945a0 = (C17945a0) list.get(i15);
                if (i16 >= arrayList4.size()) {
                    if (i17 > i14 || !z13) {
                        break;
                    }
                    i17++;
                    i11 = i14;
                    List m41545k0 = C7956b.m41474B().m41545k0(str, arrayList4.size(), 20, z12);
                    if (m41545k0.size() <= 0) {
                        break;
                    }
                    if (m41545k0.size() >= 20) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    Collections.reverse(m41545k0);
                    arrayList4.addAll(m41545k0);
                } else {
                    i11 = i14;
                }
                C17945a0 c17945a02 = (C17945a0) arrayList4.get(i16);
                if (!c17945a02.m95032V6() && !c17945a02.m95219o8()) {
                    j11 = c17945a02.m94974P4();
                    i12 = i17;
                    z11 = z13;
                    z14 = true;
                } else if (Objects.equals(c17945a0, c17945a02)) {
                    if (!z14) {
                        c17945a0.m95192lb(C32163w8.m155135a().f148290c);
                        if (c17945a0.m95270u8()) {
                            arrayList.add(c17945a0);
                        } else {
                            arrayList3.add(c17945a0);
                        }
                        i13 = i15;
                        i12 = i17;
                        z11 = z13;
                    } else {
                        i13 = i15;
                        i12 = i17;
                        z11 = z13;
                        c17945a0.m95192lb(Math.min(C32163w8.m155135a().f148290c, Math.max(0L, j11 - c17945a0.m94974P4()) + C32163w8.m155135a().f148289b));
                        if (c17945a0.m95270u8()) {
                            arrayList2.add(c17945a0);
                        } else {
                            arrayList3.add(c17945a0);
                        }
                    }
                    i15 = i13 + 1;
                } else {
                    i12 = i17;
                    z11 = z13;
                }
                i16++;
                i14 = i11;
                i17 = i12;
                z13 = z11;
                z12 = true;
            }
            for (int i18 = i15; i18 < list.size(); i18++) {
                C17945a0 c17945a03 = (C17945a0) list.get(i18);
                c17945a03.m95192lb(C32163w8.m155135a().f148289b);
                if (c17945a03.m95270u8()) {
                    arrayList2.add(c17945a03);
                } else {
                    arrayList3.add(c17945a03);
                }
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                AbstractC23647d.m123897g("91601");
                C0814e0.m2056b((C17945a0) arrayList2.get(size));
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                AbstractC23647d.m123897g("91602");
                C0814e0.m2056b((C17945a0) arrayList.get(size2));
            }
            if (arrayList3.size() > 0) {
                for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                    AbstractC23647d.m123897g("91603");
                }
                if (C32163w8.m155135a().m155140f()) {
                    m102919O1(arrayList3);
                    return;
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    m103024r2((C17945a0) it.next());
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: M */
    public static void m102911M(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_invitee_banned_from_group_postfix2), "action.open.group.invitee_list", m102876A0(list, 8), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: M0 */
    public static List m102912M0() {
        return Arrays.asList(12);
    }

    /* renamed from: M1 */
    public static /* synthetic */ void m102913M1() {
        C31986k3.f147083a.m154087D0();
        m102946X1();
        C19610a.m102633j().m102639l();
        C19666x0.m103098j().m103114p();
        C18425b.Companion.m97655a().m97647c();
        C7959d.m41638d1().m41781e2();
        C31894e1.f146524a.m153255b();
    }

    /* renamed from: N */
    public static void m102914N(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_invitee_is_existed_in_group_postfix), "action.open.group.invitee_list", m102876A0(list, 17), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: N0 */
    public static String m102915N0(List list) {
        return m102918O0(list, false);
    }

    /* renamed from: N1 */
    public static /* synthetic */ int m102916N1(C17945a0 c17945a0, C17945a0 c17945a02) {
        int i11;
        int i12;
        if (!c17945a0.m94903H2() && !c17945a02.m94903H2()) {
            return 0;
        }
        if (!c17945a02.m94903H2()) {
            return -1;
        }
        if (!c17945a0.m94903H2()) {
            return 1;
        }
        if (c17945a0.m94929K2() instanceof C17961f1) {
            i11 = ((C17961f1) c17945a0.m94929K2()).m95493o();
        } else if (c17945a0.m94929K2() instanceof C18009w0) {
            i11 = ((C18009w0) c17945a0.m94929K2()).m95788v();
        } else if (c17945a0.m94929K2() instanceof C17958e1) {
            i11 = ((C17958e1) c17945a0.m94929K2()).m95426o();
        } else {
            i11 = 0;
        }
        if (c17945a02.m94929K2() instanceof C17961f1) {
            i12 = ((C17961f1) c17945a02.m94929K2()).m95493o();
        } else if (c17945a02.m94929K2() instanceof C18009w0) {
            i12 = ((C18009w0) c17945a02.m94929K2()).m95788v();
        } else if (c17945a02.m94929K2() instanceof C17958e1) {
            i12 = ((C17958e1) c17945a02.m94929K2()).m95426o();
        } else {
            i12 = 0;
        }
        if (i11 == i12) {
            return 0;
        }
        if (i11 <= i12) {
            return -1;
        }
        return 1;
    }

    /* renamed from: O */
    public static void m102917O(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_invitee_prevent_add_group_postfix_v2), "action.open.group.invitee_list", m102876A0(list, 9), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: O0 */
    public static String m102918O0(List list, boolean z11) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            try {
                if (!((C17945a0) list.get(i13)).m95288w8()) {
                    if (((C17945a0) list.get(i13)).m94871D7()) {
                        i11++;
                    }
                    if (((C17945a0) list.get(i13)).m95306y8()) {
                        i12++;
                    }
                    if (z11 && ((C17945a0) list.get(i13)).m95120e6()) {
                        i11++;
                    }
                    if (i11 >= 1 && i12 >= 1) {
                        break;
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return "";
            }
        }
        if (i11 >= 1 && i12 >= 1) {
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_photo_and_video_group_saving_confirm);
        }
        if (i11 >= 1) {
            return MainApplication.getAppContext().getString(AbstractC8020f0.str_photo_group_saving_confirm);
        }
        if (i12 < 1) {
            return "";
        }
        return MainApplication.getAppContext().getString(AbstractC8020f0.str_video_group_saving_confirm);
    }

    /* renamed from: O1 */
    private static void m102919O1(List list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    Conversation conversation = new Conversation(((C17945a0) list.get(0)).mo95039W2());
                    conversation.m40993D(((C17945a0) list.get(0)).m95089b4());
                    conversation.m40991B(((C17945a0) list.get(0)).m95107d3());
                    for (int size = list.size() - 1; size >= 0; size--) {
                        C17945a0 c17945a0 = (C17945a0) list.get(size);
                        C23288a.f113033a.mo13474a(new C18427b(c17945a0.mo95039W2(), new Runnable() { // from class: gw.m0

                            /* renamed from: q */
                            public final /* synthetic */ Conversation f97513q;

                            public /* synthetic */ RunnableC19644m0(Conversation conversation2) {
                                r2 = conversation2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                AbstractC19646n0.m102904J1(C17945a0.this, r2);
                            }
                        }));
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: P */
    public static void m102920P(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_invitee_prevent_msg_from_stranger_msg), "action.open.group.invitee_list", m102876A0(list, 3), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: P0 */
    public static List m102921P0() {
        return Arrays.asList(0);
    }

    /* renamed from: P1 */
    private static boolean m102922P1(C17945a0 c17945a0, C17945a0 c17945a02) {
        if ((c17945a02.m94969O6() && c17945a02.mo95204n() == c17945a0.mo95204n()) || (c17945a02.m95100c8() && c17945a02.m94914I4() == c17945a0.m94914I4())) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public static void m102923Q(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_max_invite_phone_users_in_week_postfix), "action.open.group.invitee_list", m102876A0(list, 12), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: Q0 */
    public static CharSequence m102924Q0(CharSequence charSequence, C13704p1 c13704p1, int i11, int i12, int i13) {
        int i14;
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder alignment;
        StaticLayout.Builder includePad;
        float f11 = i11;
        if (c13704p1.measureText(charSequence, 0, charSequence.length()) < f11) {
            return charSequence;
        }
        if (i12 == 1) {
            i14 = Math.round(c13704p1.measureText(charSequence, 0, charSequence.length())) + 1;
        } else {
            i14 = i11;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), c13704p1, i14);
            lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
            alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            includePad = alignment.setIncludePad(false);
            staticLayout = includePad.build();
        } else {
            staticLayout = new StaticLayout(charSequence, c13704p1, i14, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        if ((i12 <= 0 || staticLayout.getLineCount() <= i12) && (i12 != 1 || staticLayout.getLineCount() != i12)) {
            return charSequence;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) "... ").append(charSequence.subSequence(Math.max(0, charSequence.length() - i13), charSequence.length()));
        float measureText = c13704p1.measureText(append, 0, append.length());
        int i15 = i12 - 1;
        float lineLeft = staticLayout.getLineLeft(i15);
        if (lineLeft != 0.0f) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence.subSequence(0, Math.max(0, staticLayout.getOffsetForHorizontal(i15, lineLeft) - 1)));
            if (spannableStringBuilder.length() > append.length()) {
                spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - append.length()));
            }
            spannableStringBuilder.append((CharSequence) append);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        float min = Math.min(f11, staticLayout.getLineWidth(i15));
        if (min > measureText) {
            spannableStringBuilder2.append(charSequence.subSequence(0, Math.max(0, staticLayout.getOffsetForHorizontal(i15, min - measureText) - 1))).append((CharSequence) append);
            return spannableStringBuilder2;
        }
        return append;
    }

    /* renamed from: Q1 */
    public static ArrayList m102925Q1(JSONObject jSONObject) {
        boolean z11;
        int i11;
        ArrayList arrayList = null;
        try {
            JSONArray m96090i = AbstractC18069a.m96090i(jSONObject, "highLightsV2");
            if (m96090i == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                int length = m96090i.length();
                int i12 = 0;
                int i13 = 0;
                while (i13 < length) {
                    JSONObject jSONObject2 = (JSONObject) m96090i.get(i13);
                    long optLong = jSONObject2.optLong("uid");
                    String optString = jSONObject2.optString("dpn");
                    if (jSONObject2.optInt("ignoreNickname", i12) == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int optInt = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE, i12);
                    if (optInt != 0) {
                        if (optInt != 1) {
                            i11 = i13;
                            optString = "";
                        } else {
                            i11 = i13;
                            long optLong2 = jSONObject2.optLong("ts", 0L);
                            if (optLong2 > 0) {
                                optString = AbstractC23160o0.m119213Q(optLong2, true);
                            } else if (optLong > 0) {
                                optString = AbstractC21935u.m114542i(optLong + "", optString);
                            }
                        }
                    } else {
                        i11 = i13;
                        if (optLong > 0) {
                            optString = AbstractC21935u.m114542i(optLong + "", optString);
                        }
                    }
                    arrayList2.add(new C32118t5(optLong + "", optString, z11));
                    i13 = i11 + 1;
                    i12 = 0;
                }
                return arrayList2;
            } catch (Exception e11) {
                e = e11;
                arrayList = arrayList2;
                AbstractC23350e.m122778h(e);
                return arrayList;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: R */
    public static void m102926R(C31973j5 c31973j5) {
        m102971e1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_no_permission_invite_phone), new C18005u0.a().m95721c(), c31973j5, true);
    }

    /* renamed from: R0 */
    public static int m102927R0(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                String lowerCase = str.toLowerCase();
                if (lowerCase.length() > 3) {
                    String m118216o = AbstractC23041d2.m118216o(lowerCase);
                    if (!m118216o.equals("png") || (!lowerCase.contains("http://file.m.zing.vn/doodle") && !lowerCase.contains("doodle.talk.zdn.vn") && !lowerCase.contains("zalo/paint"))) {
                        if (!m118216o.equals("jpg") && !m118216o.equals("jpeg") && !m118216o.equals("gif") && !m118216o.equals("png") && !m118216o.equals("jxl")) {
                            if (!m118216o.equals("3gp") && !m118216o.equals("amr") && !m118216o.equals("m4a") && !m118216o.equals("aac")) {
                                if (m118216o.equals("mp4")) {
                                    return 19;
                                }
                                int i11 = 0;
                                while (true) {
                                    String[] strArr = C20551a.f100922b;
                                    if (i11 >= strArr.length) {
                                        break;
                                    }
                                    if (m118216o.equals(strArr[i11])) {
                                        return 22;
                                    }
                                    i11++;
                                }
                            }
                            return 6;
                        }
                        return 3;
                    }
                    return 2;
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0002, B:5:0x000a, B:10:0x001f, B:15:0x0037, B:18:0x004b, B:20:0x0051, B:21:0x005e, B:23:0x0064, B:25:0x006e, B:27:0x0074, B:29:0x008b, B:33:0x0091, B:39:0x003f, B:40:0x0044, B:42:0x002a), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0044 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:3:0x0002, B:5:0x000a, B:10:0x001f, B:15:0x0037, B:18:0x004b, B:20:0x0051, B:21:0x005e, B:23:0x0064, B:25:0x006e, B:27:0x0074, B:29:0x008b, B:33:0x0091, B:39:0x003f, B:40:0x0044, B:42:0x002a), top: B:2:0x0002 }] */
    /* renamed from: R1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m102928R1(JSONObject jSONObject, ArrayList arrayList, C7907e c7907e, int i11) {
        char c11;
        String optString;
        String str;
        try {
            JSONObject m96091j = AbstractC18069a.m96091j(jSONObject, "msg");
            if (m96091j == null) {
                return "";
            }
            String str2 = AbstractC18458a.f93019a;
            int hashCode = str2.hashCode();
            if (hashCode != 3500) {
                if (hashCode == 3763 && str2.equals("vi")) {
                    c11 = 0;
                    if (c11 == 0) {
                        if (c11 != 1) {
                            optString = m96091j.optString("en");
                        } else {
                            optString = m96091j.optString("my");
                        }
                    } else {
                        optString = m96091j.optString("vi");
                    }
                    str = optString;
                    if (arrayList == null && !arrayList.isEmpty()) {
                        m102903J0(str, arrayList, c7907e);
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            String str3 = ((C32118t5) arrayList.get(i12)).f148056b;
                            if (i11 > 0 && str3.length() > i11) {
                                str3 = str3.substring(0, i11 - 3) + "...";
                            }
                            arrayList2.add(str3);
                        }
                        return String.format(AbstractC19620d0.m102688h(str), arrayList2.toArray());
                    }
                }
                c11 = 65535;
                if (c11 == 0) {
                }
                str = optString;
                return arrayList == null ? str : str;
            }
            if (str2.equals("my")) {
                c11 = 1;
                if (c11 == 0) {
                }
                str = optString;
                if (arrayList == null) {
                }
            }
            c11 = 65535;
            if (c11 == 0) {
            }
            str = optString;
            if (arrayList == null) {
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            StringBuilder sb2 = new StringBuilder("Message: ");
            if (arrayList != null) {
                sb2.append(", highlight size: ");
                sb2.append(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C32118t5 c32118t5 = (C32118t5) it.next();
                    sb2.append("\n");
                    sb2.append(c32118t5.m155008a().toString());
                }
            }
            AbstractC23350e.m122778h(new Exception(sb2.toString()));
            return "";
        }
    }

    /* renamed from: S */
    public static void m102929S(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_phone_had_invited_postfix), "action.open.group.invitee_list", m102876A0(list, 11), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: S0 */
    public static String m102930S0(String str) {
        return AbstractC20130d.m104828E0() + "CONVERT_" + AbstractC23352g.m122788d(str) + ".mp4";
    }

    /* renamed from: S1 */
    public static void m102931S1(C17945a0 c17945a0) {
        m102934T1(c17945a0, "");
    }

    /* renamed from: T */
    public static void m102932T(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_phone_receive_had_quota_postfix), "action.open.group.invitee_list", m102876A0(list, 13), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: T0 */
    public static String m102933T0(C17945a0 c17945a0) {
        return C20131e.m104920n0() + c17945a0.m94862C4() + "_" + c17945a0.m95029V3().m41044h() + ".mp4";
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x018d A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:12:0x0019, B:14:0x001f, B:17:0x0026, B:20:0x0031, B:29:0x0044, B:31:0x004a, B:35:0x00b0, B:36:0x0057, B:38:0x005b, B:41:0x0062, B:42:0x0068, B:44:0x006e, B:47:0x007a, B:56:0x0085, B:57:0x008b, B:59:0x0091, B:62:0x009f, B:71:0x00b4, B:73:0x00ba, B:77:0x012a, B:78:0x00c7, B:80:0x00cb, B:83:0x00d2, B:84:0x00d8, B:86:0x00de, B:89:0x00ea, B:98:0x00f5, B:99:0x00fb, B:101:0x0101, B:104:0x0119, B:112:0x012d, B:113:0x013a, B:115:0x0140, B:122:0x0150, B:126:0x015e, B:128:0x0162, B:131:0x0169, B:132:0x016f, B:134:0x0175, B:137:0x0181, B:147:0x018d, B:148:0x0193, B:150:0x0199, B:152:0x01ab, B:153:0x01b2, B:156:0x01be, B:158:0x01cd, B:164:0x01e9, B:166:0x01f6, B:168:0x01fe, B:169:0x0203, B:172:0x01dd), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0085 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:12:0x0019, B:14:0x001f, B:17:0x0026, B:20:0x0031, B:29:0x0044, B:31:0x004a, B:35:0x00b0, B:36:0x0057, B:38:0x005b, B:41:0x0062, B:42:0x0068, B:44:0x006e, B:47:0x007a, B:56:0x0085, B:57:0x008b, B:59:0x0091, B:62:0x009f, B:71:0x00b4, B:73:0x00ba, B:77:0x012a, B:78:0x00c7, B:80:0x00cb, B:83:0x00d2, B:84:0x00d8, B:86:0x00de, B:89:0x00ea, B:98:0x00f5, B:99:0x00fb, B:101:0x0101, B:104:0x0119, B:112:0x012d, B:113:0x013a, B:115:0x0140, B:122:0x0150, B:126:0x015e, B:128:0x0162, B:131:0x0169, B:132:0x016f, B:134:0x0175, B:137:0x0181, B:147:0x018d, B:148:0x0193, B:150:0x0199, B:152:0x01ab, B:153:0x01b2, B:156:0x01be, B:158:0x01cd, B:164:0x01e9, B:166:0x01f6, B:168:0x01fe, B:169:0x0203, B:172:0x01dd), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f5 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x000e, B:12:0x0019, B:14:0x001f, B:17:0x0026, B:20:0x0031, B:29:0x0044, B:31:0x004a, B:35:0x00b0, B:36:0x0057, B:38:0x005b, B:41:0x0062, B:42:0x0068, B:44:0x006e, B:47:0x007a, B:56:0x0085, B:57:0x008b, B:59:0x0091, B:62:0x009f, B:71:0x00b4, B:73:0x00ba, B:77:0x012a, B:78:0x00c7, B:80:0x00cb, B:83:0x00d2, B:84:0x00d8, B:86:0x00de, B:89:0x00ea, B:98:0x00f5, B:99:0x00fb, B:101:0x0101, B:104:0x0119, B:112:0x012d, B:113:0x013a, B:115:0x0140, B:122:0x0150, B:126:0x015e, B:128:0x0162, B:131:0x0169, B:132:0x016f, B:134:0x0175, B:137:0x0181, B:147:0x018d, B:148:0x0193, B:150:0x0199, B:152:0x01ab, B:153:0x01b2, B:156:0x01be, B:158:0x01cd, B:164:0x01e9, B:166:0x01f6, B:168:0x01fe, B:169:0x0203, B:172:0x01dd), top: B:2:0x0002 }] */
    /* renamed from: T1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m102934T1(C17945a0 c17945a0, String str) {
        boolean z11;
        boolean z12;
        JSONObject optJSONObject;
        String str2;
        boolean z13;
        boolean z14;
        if (c17945a0 != null) {
            try {
                if (c17945a0.m95208n8() || c17945a0.m95110d8() || c17945a0.m95314z6()) {
                    if (c17945a0.m95170j6() && !AbstractC0924m0.m3685b9()) {
                        return;
                    }
                    List m120537h = AbstractC23304d.m120537h();
                    if (m120537h.size() == 0) {
                        return;
                    }
                    int m95041W4 = c17945a0.m95041W4();
                    if (m95041W4 != 0) {
                        if (m95041W4 != 10) {
                            if (m95041W4 == 23) {
                                for (int i11 = 0; i11 < m120537h.size(); i11++) {
                                    C31838a5 c31838a5 = (C31838a5) m120537h.get(i11);
                                    if (c31838a5.f146117a == 49) {
                                        List list = c31838a5.f146122f;
                                        if (list != null && list.size() != 0) {
                                            for (C31838a5.b bVar : c31838a5.f146122f) {
                                                if (!bVar.m152965a() || !bVar.m152966b()) {
                                                }
                                            }
                                            z14 = false;
                                            if (z14) {
                                                continue;
                                            } else {
                                                Iterator it = c31838a5.f146118b.iterator();
                                                while (it.hasNext()) {
                                                    if (str.equals(((C31838a5.a) it.next()).f146125c)) {
                                                        c17945a0.m95008Sa(new C26713e(new JSONObject(c31838a5.f146119c)));
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                        z14 = true;
                                        if (z14) {
                                        }
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        for (int i12 = 0; i12 < m120537h.size(); i12++) {
                            C31838a5 c31838a52 = (C31838a5) m120537h.get(i12);
                            if (c31838a52.f146117a == 36) {
                                List list2 = c31838a52.f146122f;
                                if (list2 != null && list2.size() != 0) {
                                    for (C31838a5.b bVar2 : c31838a52.f146122f) {
                                        if (!bVar2.m152965a() || !bVar2.m152966b()) {
                                        }
                                    }
                                    z13 = false;
                                    if (z13) {
                                        continue;
                                    } else {
                                        Iterator it2 = c31838a52.f146118b.iterator();
                                        while (it2.hasNext()) {
                                            if (((C17949b1) c17945a0.m94929K2()).m95397g().m132429g() == ((C31838a5.a) it2.next()).f146124b) {
                                                c17945a0.m95008Sa(new C26713e(new JSONObject(c31838a52.f146119c)));
                                                return;
                                            }
                                        }
                                    }
                                }
                                z13 = true;
                                if (z13) {
                                }
                            }
                        }
                        return;
                    }
                    String lowerCase = c17945a0.m95019U3().toLowerCase();
                    String m120002o = AbstractC23262x6.m120002o(lowerCase);
                    for (int i13 = 0; i13 < m120537h.size(); i13++) {
                        C31838a5 c31838a53 = (C31838a5) m120537h.get(i13);
                        int i14 = c31838a53.f146117a;
                        if ((i14 == 1 || i14 == 41) && c17945a0.m95019U3().length() <= c31838a53.f146120d) {
                            List list3 = c31838a53.f146122f;
                            if (list3 != null && list3.size() != 0) {
                                for (C31838a5.b bVar3 : c31838a53.f146122f) {
                                    if (!bVar3.m152965a() || !bVar3.m152966b()) {
                                    }
                                }
                                z11 = false;
                                String str3 = null;
                                if (z11) {
                                    Iterator it3 = c31838a53.f146118b.iterator();
                                    while (it3.hasNext()) {
                                        str3 = ((C31838a5.a) it3.next()).f146123a.toLowerCase();
                                        if ((c31838a53.f146121e & 32) == 0) {
                                            str3 = AbstractC23262x6.m120002o(str3);
                                            str2 = m120002o;
                                        } else {
                                            str2 = lowerCase;
                                        }
                                        int indexOf = str2.indexOf(str3);
                                        if ((c31838a53.f146121e & 1) != 0 && indexOf > -1) {
                                            int length = str3.length() + indexOf;
                                            if (m103045y(str2.substring(0, indexOf)) && m103045y(str2.substring(length, str2.length()))) {
                                                z12 = true;
                                                break;
                                            }
                                        }
                                        if ((c31838a53.f146121e & 2) != 0 && indexOf > -1) {
                                            z12 = true;
                                            break;
                                        }
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                    JSONObject jSONObject = new JSONObject(c31838a53.f146119c);
                                    if (!TextUtils.isEmpty(str3) && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                                        optJSONObject.put("kwd", str3);
                                    }
                                    c17945a0.m95008Sa(new C26713e(jSONObject));
                                    return;
                                }
                            }
                            z11 = true;
                            String str32 = null;
                            if (z11) {
                            }
                            z12 = false;
                            if (!z12) {
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: U */
    public static void m102935U(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_failed_invitee_non_searchable_by_phonenumber_postfix), "action.open.group.invitee_list", m102876A0(list, 18), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: U0 */
    public static C27373c m102936U0(C17945a0 c17945a0) {
        int i11;
        int m95514z;
        int m95456J;
        C27373c c27373c = null;
        try {
            String m102945X0 = m102945X0(c17945a0);
            if (TextUtils.isEmpty(m102945X0)) {
                return null;
            }
            C27373c c27373c2 = new C27373c();
            try {
                c27373c2.m140250e0(m102945X0);
                c27373c2.m140237V(c17945a0.m95266u2());
                if (AbstractC25495a.m132079d(c17945a0.mo95039W2())) {
                    i11 = 5;
                } else {
                    i11 = 0;
                }
                c27373c2.m140235T(i11);
                if (c17945a0.m94929K2() instanceof C17961f1) {
                    C17961f1 c17961f1 = (C17961f1) c17945a0.m94929K2();
                    if (c17961f1.m95456J() > 0 && c17961f1.m95514z() > 0) {
                        if (c17961f1.m95452F() != 90 && c17961f1.m95452F() != 270) {
                            m95514z = c17961f1.m95456J();
                            m95456J = c17961f1.m95514z();
                            c27373c2.m140252f0(m95514z);
                            c27373c2.m140241Z(m95456J);
                        }
                        m95514z = c17961f1.m95514z();
                        m95456J = c17961f1.m95456J();
                        c27373c2.m140252f0(m95514z);
                        c27373c2.m140241Z(m95456J);
                    }
                }
                return c27373c2;
            } catch (Exception e11) {
                e = e11;
                c27373c = c27373c2;
                AbstractC23350e.m122778h(e);
                return c27373c;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: U1 */
    public static void m102937U1(C17945a0 c17945a0, String str) {
        ContactProfile contactProfile;
        String str2;
        boolean z11;
        String m118743r0;
        C31973j5 m4472f = C0943w.m4462l().m4472f(AbstractC25495a.m132089n(c17945a0.mo95039W2()));
        if (m4472f != null) {
            contactProfile = new ContactProfile(c17945a0.mo95039W2());
            contactProfile.f42446v = m4472f.m153756e();
            str2 = m4472f.m153793y();
            contactProfile.f42437s = str2;
        } else {
            contactProfile = null;
            str2 = "";
        }
        ContactProfile contactProfile2 = contactProfile;
        if (contactProfile2 != null) {
            boolean z12 = false;
            if (!TextUtils.isEmpty(AbstractC23309i.m122303q0()) && C21927m.m114302u().m114345m(c17945a0.mo95039W2())) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean m119333b = AbstractC23165o5.m119333b();
            if (AbstractC23059e9.m118329h() && !z11 && !m119333b) {
                z12 = true;
            }
            if (!z12) {
                str2 = "Zalo";
            }
            if (z12 && !TextUtils.isEmpty(str)) {
                try {
                    m118743r0 = m102890F(new JSONObject(str), 20);
                } catch (JSONException unused) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.noti_delete_message);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.noti_delete_message);
            }
            String str3 = m118743r0;
            C28023b6.m141250h0().m141289H1(contactProfile2, str2, str3, str3, c17945a0.m95029V3(), AbstractC23059e9.m118329h());
        }
    }

    /* renamed from: V */
    public static void m102938V(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_group_e2ee_max_member_postfix), "action.open.group.invitee_list", m102876A0(list, 5), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: V0 */
    public static C27373c m102939V0(C25821b c25821b) {
        String m145320e = C29086b.m145320e(c25821b);
        if (!TextUtils.isEmpty(m145320e)) {
            C27373c c27373c = new C27373c();
            c27373c.m140250e0(m145320e);
            c27373c.m140237V("");
            if (AbstractC16893a.m90326c(c25821b) instanceof MediaExtInfo.Video) {
                MediaExtInfo.Video video = (MediaExtInfo.Video) AbstractC16893a.m90326c(c25821b);
                c27373c.m140252f0(video.m90319d());
                c27373c.m140241Z(video.m90318c());
                c27373c.m140226K(video.m90317b());
            }
            return c27373c;
        }
        throw new Exception("zCloud url is empty");
    }

    /* renamed from: V1 */
    public static void m102940V1() {
        f97515a.set(true);
        try {
            C11528u0.f59384a.m62031b();
            ChatRow.f57249w5 = true;
            ChatRowPhoto.f58273n8 = true;
            ChatRowDoodle.f57698f8 = true;
            C11489j2.f59184I0 = true;
            ChatRowUndo.f58758H7 = true;
            ChatRowVideoLiveStream.f58867s7 = true;
            ChatRowVideoMask.f58899a8 = true;
            ChatRowVideoOALink.f58931j8 = true;
            ChatRowVideo.f58770u8 = true;
            C16660t2.f84464v = true;
            ChatRowCallTime.f57655u7 = true;
            ChatRowLocation.f58057h8 = true;
            ChatRowLiveLocation.f58011E7 = true;
            ChatRowRecommendContact.Companion.m61603l();
            ChatRowRecommendSticker.f58613l7 = true;
            ChatRowRecommendLink.f58425O8 = true;
            ChatRowRecommendLinkPage.f58551k8 = true;
            ChatRowRecommendLinkMp3.f58514B8 = true;
            ChatRowRecommendLinkProductCatalog.setForceRefresh(true);
            ChatRowGame.f57865A7 = true;
            ChatRowEcard.f57754a7 = true;
            ChatRowEcard.f57754a7 = true;
            ChatRowFile.setForceRefresh(true);
            ChatRowGif.f57917x7 = true;
            ChatRowUnSupport.f58755b7 = true;
            ChatRowMsgInfo.f58150f8 = true;
            C11479h0.Companion.m61943a(true);
            C17945a0.f90589G2 = null;
            C17945a0.f90590H2 = null;
            C13716q.f70992t = true;
            C17945a0.f90591I2 = null;
            C17945a0.f90593K2 = null;
            C17945a0.f90596N2 = null;
            ChatRowMultiStickers.m61518v4();
            C13646i.f70370f0 = true;
            C17945a0.f90592J2 = null;
            C17945a0.f90594L2 = null;
            C17945a0.f90595M2 = null;
            C17945a0.f90597O2 = null;
            ChatRowBankCardOffline.m61159E4();
            ChatRowSectionDivider.Companion.m61650e(true);
            ChatRowShortVideo.Companion.m61660c();
            ChatRowShortVideoProfile.Companion.m61675e();
            ChatRow.m60940x3();
            ChatView.m59276HT();
            AbstractC11531v0.m62131E1();
            AbstractC23306f.m120584H0().m2637t(new InterfaceC18505l() { // from class: gw.e0
                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public final Object mo205i9(Object obj) {
                    C24848g0 m102907K1;
                    m102907K1 = AbstractC19646n0.m102907K1((C3535c) obj);
                    return m102907K1;
                }
            });
            C11501m2.f59309W = true;
            C32091r6.m154832b().m154839h();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        f97515a.set(false);
    }

    /* renamed from: W */
    public static void m102941W(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_group_e2ee_member_version_not_supported_postfix), "action.open.group.invitee_list", m102876A0(list, 5), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: W0 */
    public static List m102942W0() {
        return Arrays.asList(19);
    }

    /* renamed from: W1 */
    private static void m102943W1(String str, List list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            C23288a.f113033a.mo13474a(new C18427b(str, new Runnable() { // from class: gw.l0

                /* renamed from: p */
                public final /* synthetic */ List f97509p;

                /* renamed from: q */
                public final /* synthetic */ String f97510q;

                public /* synthetic */ RunnableC19642l0(List list2, String str2) {
                    r1 = list2;
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19646n0.m102910L1(r1, r2);
                }
            }));
        }
    }

    /* renamed from: X */
    public static void m102944X(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_can_not_be_invited_to_group), "action.open.group.invitee_list", m102876A0(list, 5), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: X0 */
    public static String m102945X0(C17945a0 c17945a0) {
        String str = "";
        try {
            if (!c17945a0.m95306y8()) {
                return "";
            }
            C17961f1 c17961f1 = (C17961f1) c17945a0.m94929K2();
            if (!c17961f1.m95463Q() && !c17961f1.m95466T() && !TextUtils.isEmpty(c17945a0.m94983Q3())) {
                C20556f c20556f = new C20556f(c17945a0.m94983Q3());
                if (c20556f.m106830b() && c20556f.m106845r() > 0) {
                    str = c17945a0.m94983Q3();
                }
            }
            if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(c17961f1.m95483j())) {
                File file = new File(((C17961f1) c17945a0.m94929K2()).m95483j());
                if (file.exists() && file.length() > 0) {
                    str = file.getAbsolutePath();
                }
            }
            if (TextUtils.isEmpty(str) && c17945a0.m94929K2() != null) {
                return c17945a0.m94929K2().f91014s;
            }
            return str;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    /* renamed from: X1 */
    public static void m102946X1() {
        try {
            try {
                if (C32163w8.m155135a().f148288a) {
                    long mo124314i = AbstractC23306f.m120579F1().mo124314i() - C32163w8.m155135a().m155136b();
                    Map m41534Z = C7956b.m41474B().m41534Z(C32163w8.m155135a().f148292e, mo124314i);
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : m41534Z.entrySet()) {
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        if (list != null && !list.isEmpty()) {
                            arrayList.addAll(list);
                            m102943W1(str, list);
                        }
                    }
                } else {
                    for (C17945a0 c17945a0 : C7956b.m41474B().m41535a0(50)) {
                        if (c17945a0.m95270u8()) {
                            C0814e0.m2056b(c17945a0);
                        } else {
                            m103024r2(c17945a0);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
            m103048z();
        } catch (Throwable th2) {
            m103048z();
            throw th2;
        }
    }

    /* renamed from: Y */
    public static void m102947Y(List list, C31973j5 c31973j5) {
        String m102876A0;
        String str;
        if (list != null && !list.isEmpty()) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_msg_no_group_link_case_other_postfix);
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_details);
            if (c31973j5.m153778p0()) {
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_activate_group_link);
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_msg_no_group_link_case_owner_postfix);
                str = "action.group.open.linkandqr";
                m102876A0 = "";
            } else {
                m102876A0 = m102876A0(list, 4);
                str = "action.open.group.invitee_list";
            }
            m103010o0(list, c31973j5, 2, "", m118743r0, str, m102876A0, m118743r02, 0L);
        }
    }

    /* renamed from: Y0 */
    public static boolean m102948Y0(ContactProfile contactProfile) {
        if (contactProfile.m40392W() != null && contactProfile.m40392W().m97757v()) {
            return true;
        }
        return false;
    }

    /* renamed from: Y1 */
    public static void m102949Y1() {
        if (TextUtils.isEmpty(CoreUtility.f89233i)) {
            return;
        }
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: gw.i0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19646n0.m102913M1();
            }
        });
    }

    /* renamed from: Z */
    public static C17945a0 m102950Z(String str, MessageId messageId) {
        C17945a0 c17945a0 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C3535c m2634q = AbstractC23306f.m120584H0().m2634q(str);
            if (m2634q != null) {
                synchronized (m2634q) {
                    try {
                        Iterator it = m2634q.m17941F0().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C17945a0 c17945a02 = (C17945a0) it.next();
                            if (c17945a02.m95135f9(messageId)) {
                                c17945a0 = c17945a02;
                                break;
                            }
                        }
                    } finally {
                    }
                }
            }
            if (c17945a0 == null) {
                return C7956b.m41474B().m41553q(messageId);
            }
            return c17945a0;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return c17945a0;
        }
    }

    /* renamed from: Z0 */
    public static boolean m102951Z0(Conversation conversation) {
        if (conversation.m41003g() != null && conversation.m41003g().m97757v()) {
            return true;
        }
        return false;
    }

    /* renamed from: Z1 */
    public static void m102952Z1(int i11, MessageId messageId, String str, C24753f c24753f, int i12) {
        m102956a2(new C17945a0.w(messageId, i11).m95365a(), c24753f, i12, false);
    }

    /* renamed from: a0 */
    public static String m102954a0(int i11) {
        if (i11 < 0) {
            return "";
        }
        if (i11 < 1000) {
            return "" + i11;
        }
        if (i11 % 1000 == 0 && i11 <= 9000) {
            return Math.min(i11 / 1000, 9) + C18403k.f92793i;
        }
        return Math.min(i11 / 1000, 9) + "k+";
    }

    /* renamed from: a1 */
    public static boolean m102955a1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m103023r1((C17945a0) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a2 */
    public static void m102956a2(C17945a0 c17945a0, C24753f c24753f, int i11, boolean z11) {
        m102960b2(c17945a0, c24753f, i11, z11, null);
    }

    /* renamed from: b0 */
    public static boolean m102958b0(List list) {
        if (list.isEmpty()) {
            return false;
        }
        C26399a c26399a = new C26399a();
        c26399a.m136121d("204278670");
        c26399a.m136122e(list.size());
        EnumC26407i m118500J = AbstractC23112j7.m118500J();
        if (m118500J != null && m118500J == EnumC26407i.f125518t) {
            c26399a.m136123f(1);
        }
        AbstractC23112j7.m118531h(c26399a);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (!m103032t2(c17945a0)) {
                c26399a.m136122e(c26399a.m136120c() - 1);
                AbstractC23112j7.m118531h(c26399a);
            } else {
                c17945a0.m95145ga(c26399a.m136118a());
                arrayList.add(c17945a0);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        return m102962c0(arrayList);
    }

    /* renamed from: b1 */
    public static boolean m102959b1(C17945a0 c17945a0) {
        if (c17945a0 == null || !c17945a0.m94847A6()) {
            return false;
        }
        C31973j5 m4473g = C0943w.m4462l().m4473g(AbstractC25495a.m132089n(c17945a0.mo95039W2()));
        if (!m4473g.m153778p0()) {
            if (!m4473g.m153743U()) {
                return false;
            }
            if (!TextUtils.equals(CoreUtility.f89233i, c17945a0.m94862C4()) && (m4473g.m153780q0(c17945a0.m94862C4()) || m4473g.m153744V(c17945a0.m94862C4()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b2 */
    public static void m102960b2(C17945a0 c17945a0, C24753f c24753f, int i11, boolean z11, JSONObject jSONObject) {
        String str;
        List singletonList;
        try {
            if (c17945a0.m94847A6()) {
                str = "90014304";
            } else {
                str = "90014314";
            }
            AbstractC23647d.m123897g(str);
            String mo95039W2 = c17945a0.mo95039W2();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rType", c24753f.m128600m());
            jSONObject2.put("rIcon", c24753f.m128595h());
            JSONArray jSONArray = new JSONArray();
            if (z11) {
                singletonList = m102891F0(c17945a0.mo95039W2(), c17945a0.m95029V3(), true);
            } else {
                singletonList = Collections.singletonList(c17945a0);
            }
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < singletonList.size(); i12++) {
                C17945a0 c17945a02 = (C17945a0) singletonList.get(i12);
                arrayList.add(c17945a02.m95029V3());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("cMsgID", c17945a02.m95029V3().m41045i());
                jSONObject3.put("gMsgID", c17945a02.m95029V3().m41047k());
                jSONObject3.put("msgType", m102878B(c17945a0.m95041W4(), false));
                if (jSONObject != null) {
                    jSONObject3.put("insight", jSONObject);
                }
                jSONArray.put(jSONObject3);
            }
            jSONObject2.put("rMsg", jSONArray);
            jSONObject2.put("source", i11);
            String jSONObject4 = jSONObject2.toString();
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), 30).m95365a();
            m95365a.m94951M9();
            C24261h.m126630v().m126643R(arrayList, C24753f.m128591e(c24753f.m128599l(), c24753f.m128595h(), c24753f.m128601n(), C23793c.m124316k().mo124314i()), Integer.parseInt(CoreUtility.f89233i), mo95039W2, true);
            new C0766k().mo1777x8(mo95039W2, m95365a, jSONObject4);
            if (c17945a0.m95316z8()) {
                C2546u.f10363a.m12822i(c17945a0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: c0 */
    private static boolean m102962c0(List list) {
        if (AbstractC26689j.m137087N()) {
            m102964c2(list);
        }
        if (list != null && list.size() > 0) {
            C26404f c26404f = new C26404f(14);
            c26404f.m136166s(list);
            c26404f.f125461q = m103037v0(list);
            c26404f.f125460p = true;
            AbstractC23112j7.m118513W("204278670", c26404f);
            return true;
        }
        return false;
    }

    /* renamed from: c1 */
    public static void m102963c1(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_msg_invited_member_over_maximum_groups2), "action.open.group.invitee_list", m102876A0(list, 2), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: c2 */
    public static void m102964c2(List list) {
        Collections.sort(list, f97516b);
    }

    /* renamed from: d0 */
    public static void m102966d0(InterfaceC27218a interfaceC27218a, C17945a0 c17945a0, boolean z11, int i11, String str, String str2, String str3, int i12) {
        String str4;
        if (c17945a0 != null) {
            try {
                if (!c17945a0.m94954N0() || !m103032t2(c17945a0)) {
                    return;
                }
                if (c17945a0.m95276v6()) {
                    if (c17945a0.m95032V6()) {
                        str4 = "900106";
                    } else {
                        str4 = "900105";
                    }
                    AbstractC23647d.m123906p(str4);
                    AbstractC23647d.m123893c();
                }
                if (c17945a0.m95316z8()) {
                    C2546u.f10363a.m12820g(c17945a0);
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("bol_extra_is_forwarding", true);
                bundle.putParcelable("forwardMessageId", c17945a0.m95029V3());
                bundle.putString("forwardMessageOwnerUid", c17945a0.mo95039W2());
                bundle.putBoolean("bol_share_in_app", true);
                bundle.putBoolean("btn_extra_show_hide_post_feed", z11);
                bundle.putInt("extra_source_log", i11);
                bundle.putString("STR_SOURCE_START_VIEW", str2);
                bundle.putString("STR_LOG_CHAT_TYPE", str3);
                bundle.putInt("INT_LOG_MSG_INDEX", i12);
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("extra_tracking_source_feed", str);
                }
                AbstractC19656s0.m103072o(interfaceC27218a, bundle, 1048);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: d1 */
    public static void m102967d1(C31973j5 c31973j5) {
        m102975f1(c31973j5.m153724K(), new C18005u0.a().m95728j(c31973j5.m153722J()).m95725g(c31973j5.m153779q()).m95719a(c31973j5.m153720I(), "", c31973j5.m153718H()).m95721c(), c31973j5, true, 0L);
    }

    /* renamed from: d2 */
    public static JSONObject m102968d2(JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString("params", "");
            if (!TextUtils.isEmpty(optString)) {
                JSONObject jSONObject2 = new JSONObject(optString);
                String optString2 = jSONObject2.optString("convertible", "");
                AbstractC20110a.m104535d("MessageUtils -> standardizeUrlPhotoInAttachDataObject" + optString2 + " " + jSONObject, new Object[0]);
                if (!optString2.isEmpty()) {
                    jSONObject.put("href", AbstractC23008a2.m117937f(jSONObject.optString("href"), optString2));
                    jSONObject.put("thumb", AbstractC23008a2.m117937f(jSONObject.optString("thumb"), optString2));
                    jSONObject.put("params", m102980g2(jSONObject2, optString2));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:            m102962c0(r11);     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:            java.lang.Thread.sleep(10);     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:            r0.printStackTrace();     */
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m102970e0(List list, int i11, InterfaceC20094a interfaceC20094a) {
        int i12;
        LinkedList linkedList;
        C26399a c26399a = new C26399a();
        c26399a.m136121d("204278670");
        if (list != null) {
            c26399a.m136122e(list.size());
        }
        EnumC26407i m118500J = AbstractC23112j7.m118500J();
        int i13 = 1;
        if (m118500J != null && (m118500J == EnumC26407i.f125516r || m118500J == EnumC26407i.f125517s)) {
            c26399a.m136123f(1);
        }
        if (list == null) {
            interfaceC20094a.mo926a(new C20096c(-1, ""));
            return 0;
        }
        AbstractC23112j7.m118531h(c26399a);
        Iterator it = list.iterator();
        long j11 = 0;
        LinkedList linkedList2 = null;
        int i14 = 0;
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            try {
            } catch (Exception e11) {
                e = e11;
                AbstractC23350e.m122778h(e);
                i13 = 1;
            }
            if (!m103032t2(c17945a0)) {
                c26399a.m136122e(c26399a.m136120c() - i13);
                AbstractC23112j7.m118531h(c26399a);
            } else {
                c17945a0.m95145ga(c26399a.m136118a());
                if (c17945a0.m94969O6()) {
                    try {
                        if (linkedList2 != null && j11 == c17945a0.mo95204n()) {
                            linkedList2.add(c17945a0);
                            i14++;
                        }
                        linkedList.add(c17945a0);
                        j11 = c17945a0.mo95204n();
                        linkedList2 = linkedList;
                        i14++;
                    } catch (Exception e12) {
                        e = e12;
                        linkedList2 = linkedList;
                        AbstractC23350e.m122778h(e);
                        i13 = 1;
                    }
                    linkedList = new LinkedList();
                } else {
                    if (linkedList2 != null) {
                        m102962c0(linkedList2);
                        try {
                            Thread.sleep(10L);
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                        i12 = i11;
                        j11 = 0;
                        linkedList2 = null;
                    } else {
                        i12 = i11;
                    }
                    try {
                        AbstractC23112j7.m118494D(c17945a0, i12);
                        i14++;
                    } catch (Exception e14) {
                        e = e14;
                        AbstractC23350e.m122778h(e);
                        i13 = 1;
                    }
                }
                i13 = 1;
            }
        }
        if (linkedList2 != null) {
            m102962c0(linkedList2);
        }
        if (i14 > 0) {
            interfaceC20094a.mo927b(new C20096c(0, ""));
        } else {
            interfaceC20094a.mo926a(new C20096c(-1, ""));
        }
        return i14;
    }

    /* renamed from: e1 */
    public static void m102971e1(String str, C18005u0 c18005u0, C31973j5 c31973j5, boolean z11) {
        m102975f1(str, c18005u0, c31973j5, z11, 0L);
    }

    /* renamed from: e2 */
    public static String m102972e2(JSONObject jSONObject, String str) {
        String jSONObject2 = jSONObject.toString();
        try {
            String m117936e = AbstractC23008a2.m117936e(jSONObject.optString("thumb", ""), str);
            if (!m117936e.isEmpty()) {
                jSONObject.put("thumb", m117936e);
                return jSONObject.toString();
            }
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return jSONObject2;
        }
    }

    /* renamed from: f0 */
    public static String m102974f0(C17945a0 c17945a0, boolean z11) {
        String str;
        String str2;
        String str3 = "";
        if (c17945a0 == null) {
            return "";
        }
        if (c17945a0.m94929K2() != null && !TextUtils.isEmpty(c17945a0.m94929K2().f91011p)) {
            str = c17945a0.m94929K2().f91011p;
        } else {
            str = c17945a0.m95029V3().m41045i() + "";
        }
        if (!(c17945a0.m94929K2() instanceof C17990p0)) {
            str2 = "";
        } else {
            str2 = ((C17990p0) c17945a0.m94929K2()).f91115D;
        }
        if (z11 && !TextUtils.isEmpty(c17945a0.m95090b5())) {
            str3 = AbstractC23352g.m122788d(c17945a0.m95090b5());
        }
        return m102978g0(str, str2, str3);
    }

    /* renamed from: f1 */
    public static void m102975f1(String str, C18005u0 c18005u0, C31973j5 c31973j5, boolean z11, long j11) {
        AbstractC23306f.m120685l0().m101508a(new C29595k.b("group_" + c31973j5.m153781r(), str, c18005u0, j11, -1L, new C29595k.c(z11), true));
    }

    /* renamed from: f2 */
    public static String m102976f2(JSONObject jSONObject, String str) {
        String jSONObject2 = jSONObject.toString();
        try {
            String optString = jSONObject.optString("href", "");
            if (!optString.isEmpty()) {
                jSONObject.put("href", AbstractC23008a2.m117936e(optString, str));
            }
            String optString2 = jSONObject.optString("thumb", "");
            if (!optString2.isEmpty()) {
                jSONObject.put("thumb", AbstractC23008a2.m117936e(optString2, str));
            }
            String optString3 = jSONObject.optString("params", "");
            if (!optString3.isEmpty()) {
                jSONObject.put("params", m102984h2(new JSONObject(optString3), str));
            }
            jSONObject2 = jSONObject.toString();
            AbstractC20110a.m104535d("MessageUtils -> reply chat content %s", jSONObject2);
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return jSONObject2;
        }
    }

    /* renamed from: g0 */
    public static String m102978g0(String str, String str2, String str3) {
        String str4;
        try {
            if (!TextUtils.isEmpty(str)) {
                String m118217p = AbstractC23041d2.m118217p(str);
                if (!TextUtils.isEmpty(m118217p)) {
                    str = str.substring(0, (str.length() - m118217p.length()) - 1);
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = m118217p;
                }
                if (str.length() > 100) {
                    str = str.substring(0, 100);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str5 = "";
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = "_" + str3;
        }
        sb2.append(str4);
        if (!TextUtils.isEmpty(str2)) {
            str5 = "." + str2;
        }
        sb2.append(str5);
        return sb2.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: gw.k0.<init>(java.lang.String, bo.p0, cj.e):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: g1 */
    public static void m102979g1(p056cj.C3537e r5) {
        /*
            if (r5 == 0) goto L26
            bo.l0 r0 = r5.f14921d
            if (r0 == 0) goto L26
            boolean r0 = r0.m14375y0()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            bo.l0 r0 = r5.f14921d
            bo.p0 r0 = r0.m14322a0()
            java.lang.String r1 = r0.m14465A()
            mg.a r2 = mg.C23288a.f113033a
            eg0.b r3 = new eg0.b
            gw.k0 r4 = new gw.k0
            r4.<init>()
            r3.<init>(r1, r4)
            r2.mo13474a(r3)
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.AbstractC19646n0.m102979g1(cj.e):void");
    }

    /* renamed from: g2 */
    public static String m102980g2(JSONObject jSONObject, String str) {
        String jSONObject2 = jSONObject.toString();
        try {
            String m117937f = AbstractC23008a2.m117937f(jSONObject.optString("hd", ""), str);
            if (!m117937f.isEmpty()) {
                jSONObject.put("hd", m117937f);
                return jSONObject.toString();
            }
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return jSONObject2;
        }
    }

    /* renamed from: h0 */
    public static String m102982h0() {
        List list;
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        C19669z.m103146Y().m103229t0();
        List m103212Y0 = C19669z.m103146Y().m103212Y0();
        int size = m103212Y0.size();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (i11 < size) {
            Conversation conversation = (Conversation) m103212Y0.get(i11);
            String str = conversation.f42893q;
            int m102746E = C19636i1.m102737w().m102746E(str);
            if (TextUtils.isEmpty(str) || m102746E <= 0 || AbstractC25495a.m132084i(str) || AbstractC25495a.m132081f(str)) {
                list = m103212Y0;
            } else {
                if (AbstractC21935u.m114518H(str) && !AbstractC25495a.m132086k(str)) {
                    list = m103212Y0;
                    z11 = true;
                } else {
                    list = m103212Y0;
                    z11 = false;
                }
                int i21 = conversation.f42897u;
                if (i21 == 1 && !z11) {
                    i12 += m102746E;
                    i13++;
                    if (conversation.m41013q()) {
                        i14 += m102746E;
                        i15++;
                    }
                } else if (i21 == 2) {
                    i18 += m102746E;
                    i19++;
                } else if (i21 == 3 || z11) {
                    if (i21 == 3) {
                        i16 += m102746E;
                    }
                    i17++;
                }
            }
            i11++;
            m103212Y0 = list;
        }
        boolean m121525Vb = AbstractC23309i.m121525Vb();
        int m42571w6 = C7960e.m41971c6().m42571w6();
        int m132524t = C25641k.m132506o().m132524t();
        int size2 = C21927m.m114302u().m114353q().size();
        int i22 = AbstractC23304d.f113341W;
        sb2.append("{");
        sb2.append("\"unreadMsg\":");
        sb2.append(i12);
        sb2.append(",");
        sb2.append("\"unreadMsgThread\":");
        sb2.append(i13);
        sb2.append(",");
        sb2.append("\"unreadMsgGroup\":");
        sb2.append(i14);
        sb2.append(",");
        sb2.append("\"unreadMsgGroupThread\":");
        sb2.append(i15);
        sb2.append(",");
        sb2.append("\"unreadPage\":");
        sb2.append(i16);
        sb2.append(",");
        sb2.append("\"unreadPageThread\":");
        sb2.append(i17);
        sb2.append(",");
        sb2.append("\"unreadStrangeMsg\":");
        sb2.append(i18);
        sb2.append(",");
        sb2.append("\"unreadStrangeMsgThread\":");
        sb2.append(i19);
        sb2.append(",");
        sb2.append("\"unreadConnect\":");
        sb2.append(m121525Vb ? 1 : 0);
        sb2.append(",");
        sb2.append("\"unreadGame\":");
        sb2.append(0);
        sb2.append(",");
        sb2.append("\"unreadFeedNotify\":");
        sb2.append(m42571w6);
        sb2.append(",");
        sb2.append("\"unreadSuggestFriend\":");
        sb2.append(m132524t);
        sb2.append(",");
        sb2.append("\"highlightSuggestFriend\":");
        sb2.append(size2);
        sb2.append(",");
        sb2.append("\"highlightNewFriend\":");
        sb2.append(i22);
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: h1 */
    public static void m102983h1(String str, C18011x0 c18011x0, C31973j5 c31973j5, long j11) {
        if (c31973j5 == null) {
            return;
        }
        C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", "group_" + c31973j5.m153781r(), CoreUtility.f89233i), 26).m95382r(str).m95368d(c18011x0).m95361M(j11).m95365a();
        m95365a.m94951M9();
        AbstractC23306f.m120681k0().m101500a(new C29593i.a(c31973j5.m153730N(), m95365a, C28931k.d.m144581e(), null, true));
    }

    /* renamed from: h2 */
    public static String m102984h2(JSONObject jSONObject, String str) {
        String jSONObject2 = jSONObject.toString();
        try {
            String m117936e = AbstractC23008a2.m117936e(jSONObject.optString("hd", ""), str);
            if (!m117936e.isEmpty()) {
                jSONObject.put("hd", m117936e);
                return jSONObject.toString();
            }
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return jSONObject2;
        }
    }

    /* renamed from: i0 */
    public static void m102986i0(List list, C31973j5 c31973j5, int i11, String str, String str2, String str3, String str4, long j11) {
        m102990j0(list, c31973j5, i11, "", str, str2, str3, str4, j11);
    }

    /* renamed from: i1 */
    public static void m102987i1(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_invited_members_wait_admin_to_approve), "action.open.group.invitee_list", m102876A0(list, 6), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: i2 */
    public static void m102988i2(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_success_invite_stranger_via_phone_number_postfix), "action.open.group.invitee_list", m102876A0(list, 16), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: j */
    public static boolean m102989j(List list) {
        if (list.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public static void m102990j0(List list, C31973j5 c31973j5, int i11, String str, String str2, String str3, String str4, String str5, long j11) {
        if (new ArrayList(list).size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        C7907e c7907e = new C7907e();
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
            sb2.append(" ");
        }
        int length = sb2.length();
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            String str6 = (String) list.get(i13);
            ContactProfile m118084d = AbstractC23028c0.m118084d(str6);
            if (m118084d != null) {
                if (i12 < i11) {
                    if (i12 > 0) {
                        sb2.append(", ");
                        length += 2;
                    }
                    String m114542i = AbstractC21935u.m114542i(str6, m118084d.m40383Q(true, false));
                    c7907e.m40852b(new C7907e.a(Long.parseLong(str6), length, m114542i.length()));
                    length += m114542i.length();
                    sb2.append(m114542i);
                }
                if (i12 < 4) {
                    arrayList.add(m118084d);
                }
                i12++;
            }
        }
        if (list.size() > i11) {
            sb2.append(" ");
            sb2.append(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_and_num_others), Integer.valueOf(list.size() - i11)));
        }
        sb2.append(" ");
        sb2.append(str2);
        C18005u0.a m95725g = new C18005u0.a().m95723e(arrayList).m95731m(list.size()).m95725g(c7907e);
        if (!TextUtils.isEmpty(str3)) {
            m95725g = m95725g.m95719a(str3, str4, str5);
        }
        m102975f1(sb2.toString(), m95725g.m95721c(), c31973j5, false, j11);
    }

    /* renamed from: j1 */
    public static boolean m102991j1(String str) {
        C31973j5 m4473g;
        if (!AbstractC25495a.m132079d(str) || (m4473g = C0943w.m4462l().m4473g(str)) == null) {
            return false;
        }
        if (!m4473g.m153778p0() && !m4473g.m153743U()) {
            return false;
        }
        return true;
    }

    /* renamed from: j2 */
    public static void m102992j2(List list, C31973j5 c31973j5) {
        if (list != null && !list.isEmpty()) {
            m103010o0(list, c31973j5, 2, "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_success_invite_strangers_to_group2), "action.open.group.invitee_list", m102876A0(list, 0), AbstractC23136l9.m118743r0(AbstractC8020f0.str_details), 0L);
        }
    }

    /* renamed from: k */
    public static boolean m102993k(C17945a0 c17945a0) {
        try {
            if (!AbstractC23309i.m121010He()) {
                return false;
            }
            if (c17945a0 != null) {
                if (!c17945a0.m95219o8()) {
                    if (!c17945a0.m95091b6()) {
                        if (c17945a0.m94872D8()) {
                            if (c17945a0.m95037W0()) {
                            }
                        }
                        if (c17945a0.m95099c7()) {
                            return m102959b1(c17945a0);
                        }
                    }
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: k0 */
    public static void m102994k0(C31973j5 c31973j5) {
        int i11;
        C18005u0.a m95727i = new C18005u0.a().m95727i(2);
        m95727i.m95719a("action.group.open.rightmenu", "", AbstractC23136l9.m118743r0(AbstractC8020f0.str_view));
        if (c31973j5.m153747Y()) {
            i11 = AbstractC8020f0.str_notice_community_update_desc_by_me;
        } else {
            i11 = AbstractC8020f0.str_notice_group_update_desc_by_me;
        }
        m102971e1(AbstractC23136l9.m118743r0(i11), m95727i.m95721c(), c31973j5, true);
    }

    /* renamed from: k1 */
    public static boolean m102995k1(int i11) {
        return i11 == 2;
    }

    /* renamed from: k2 */
    public static void m102996k2() {
        ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_pin_successfully));
    }

    /* renamed from: l */
    public static boolean m102997l(List list) {
        if (!AbstractC23309i.m121010He() || list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (c17945a0.m95219o8() || c17945a0.m95091b6() || !m102959b1(c17945a0) || !m102880B1(c17945a0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l0 */
    public static void m102998l0(String str, ArrayList arrayList, ArrayList arrayList2) {
        String m118746s0;
        ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
        if (m141809c != null) {
            int size = arrayList.size();
            int size2 = size - arrayList2.size();
            if (size2 > 0) {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_info_invite_to_multi_group, "%1$s", Integer.valueOf(size2), Integer.valueOf(size));
            } else {
                m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_info_invite_to_multi_group_2, "%1$s");
            }
            String str2 = m118746s0;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_details);
            String m103049z0 = m103049z0(str, arrayList, 21, arrayList2);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(new C32118t5(str, m141809c.mo2475c(), false));
            C18005u0.a aVar = new C18005u0.a();
            aVar.m95730l(str2).m95726h(arrayList3);
            if (!TextUtils.isEmpty("action.open.group.invitee_list")) {
                aVar = aVar.m95719a("action.open.group.invitee_list", m103049z0, m118743r0);
            }
            AbstractC23306f.m120685l0().m101508a(new C29595k.b(m141809c.f42434r, str2, aVar.m95721c(), 0L, -1L, new C29595k.c(), true));
        }
    }

    /* renamed from: l1 */
    public static boolean m102999l1() {
        if (!TextUtils.isEmpty(AbstractC23306f.m120688m().m132993i()) && AbstractC23306f.m120676j().m128402S()) {
            return true;
        }
        return false;
    }

    /* renamed from: l2 */
    public static void m103000l2() {
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_unpin_successfully));
    }

    /* renamed from: m */
    public static boolean m103001m(List list) {
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    public static void m103002m0(C31973j5 c31973j5) {
        int i11;
        C18005u0.a m95727i = new C18005u0.a().m95727i(14);
        if (c31973j5.m153747Y()) {
            i11 = AbstractC8020f0.str_notice_community_remove_desc_by_me;
        } else {
            i11 = AbstractC8020f0.str_notice_group_remove_desc_by_me;
        }
        m102971e1(AbstractC23136l9.m118743r0(i11), m95727i.m95721c(), c31973j5, true);
    }

    /* renamed from: m1 */
    public static boolean m103003m1(int i11) {
        return i11 == 22;
    }

    /* renamed from: m2 */
    public static void m103004m2(C17945a0 c17945a0, boolean z11) {
        try {
            if (!C23055e5.m118272g(true)) {
                return;
            }
            String mo95039W2 = c17945a0.mo95039W2();
            String jSONObject = m102887E("", c17945a0, z11).toString();
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), 30).m95365a();
            m95365a.m94951M9();
            m103008n2("", c17945a0, z11);
            new C0766k().mo1777x8(mo95039W2, m95365a, jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n */
    public static boolean m103005n(List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C17945a0) it.next()).m94963O0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n0 */
    public static void m103006n0(String str, String str2, C31973j5 c31973j5) {
        int i11;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C32118t5("0", str, false));
        arrayList.add(new C32118t5("0", str2, false));
        if (c31973j5.m153747Y()) {
            i11 = AbstractC8020f0.str_msg_info_change_community_name_by_myself;
        } else {
            i11 = AbstractC8020f0.str_msg_info_change_group_name_by_myselft_v2;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        m102971e1(C2799a.m13489c(m118743r0, arrayList), new C18005u0.a().m95727i(2).m95730l(m118743r0).m95726h(arrayList).m95721c(), c31973j5, true);
    }

    /* renamed from: n1 */
    public static boolean m103007n1(String str) {
        if (str != null && C21927m.m114302u().m114345m(str) && !TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
            return true;
        }
        return false;
    }

    /* renamed from: n2 */
    public static void m103008n2(String str, C17945a0 c17945a0, boolean z11) {
        if (c17945a0 == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (z11) {
                List m102891F0 = m102891F0(c17945a0.mo95039W2(), c17945a0.m95029V3(), true);
                for (int i11 = 0; i11 < m102891F0.size(); i11++) {
                    arrayList.add(((C17945a0) m102891F0.get(i11)).m95029V3());
                }
            } else {
                arrayList.add(c17945a0.m95029V3());
            }
            C24261h.m126630v().m126641O(str, arrayList, Integer.parseInt(CoreUtility.f89233i), c17945a0.mo95039W2());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o */
    public static boolean m103009o(List list) {
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C17945a0) it.next()).m94963O0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: o0 */
    public static void m103010o0(List list, C31973j5 c31973j5, int i11, String str, String str2, String str3, String str4, String str5, long j11) {
        if (list != null && list.size() != 0) {
            ArrayList arrayList = new ArrayList();
            C7907e c7907e = new C7907e();
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
                sb2.append(" ");
            }
            int length = sb2.length();
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ContactProfile contactProfile = (ContactProfile) list.get(i13);
                if (contactProfile != null) {
                    String str6 = contactProfile.f42434r;
                    if (i12 < i11) {
                        if (i12 > 0) {
                            sb2.append(", ");
                            length += 2;
                        }
                        String m114542i = AbstractC21935u.m114542i(str6, contactProfile.m40383Q(true, false));
                        if (contactProfile.m40381O0()) {
                            c7907e.m40852b(new C7907e.a(0L, length, m114542i.length()));
                        } else {
                            c7907e.m40852b(new C7907e.a(Long.parseLong(str6), length, m114542i.length()));
                        }
                        length += m114542i.length();
                        sb2.append(m114542i);
                    }
                    if (i12 < 4) {
                        arrayList.add(contactProfile);
                    }
                    i12++;
                }
            }
            if (list.size() > i11) {
                sb2.append(" ");
                sb2.append(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_and_num_others), Integer.valueOf(list.size() - i11)));
            }
            sb2.append(" ");
            sb2.append(str2);
            C18005u0.a m95725g = new C18005u0.a().m95723e(arrayList).m95731m(list.size()).m95725g(c7907e);
            if (!TextUtils.isEmpty(str3)) {
                m95725g = m95725g.m95719a(str3, str4, str5);
            }
            m102975f1(sb2.toString(), m95725g.m95721c(), c31973j5, false, j11);
        }
    }

    /* renamed from: o1 */
    public static boolean m103011o1(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m94977P7() && c17945a0.m94929K2().f91016u.equals("recommened.link")) {
            return true;
        }
        return false;
    }

    /* renamed from: o2 */
    public static void m103012o2(String str, C17945a0 c17945a0, boolean z11) {
        try {
            if (!C23055e5.m118272g(true)) {
                return;
            }
            String mo95039W2 = c17945a0.mo95039W2();
            String jSONObject = m102887E(str, c17945a0, z11).toString();
            C17945a0 m95365a = new C17945a0.w(MessageId.m41036c(AbstractC23306f.m120599M0().m103086b(), "", c17945a0.mo95039W2(), CoreUtility.f89233i), 30).m95365a();
            m95365a.m94951M9();
            m103008n2(str, c17945a0, z11);
            new C0766k().mo1777x8(mo95039W2, m95365a, jSONObject);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: p */
    public static boolean m103013p(List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C17945a0) it.next()).m94963O0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p0 */
    public static void m103014p0(C31961i8 c31961i8, String str) {
        C28176r6.m141702d().m141711l(c31961i8);
        String m153669g = c31961i8.m153669g();
        String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_info_share_poll, AbstractC23136l9.m118743r0(AbstractC8020f0.str_identifier_mine_attach_list_name_onlyOne), m153669g);
        C7907e c7907e = new C7907e();
        c7907e.m40852b(new C7907e.a(m118746s0.lastIndexOf(m153669g), m153669g.length()));
        m102983h1(m118746s0, new C18005u0.a().m95727i(9).m95725g(c7907e).m95719a("action.groupchat.open.polldetail", C31961i8.m153663d(c31961i8.f146880a), AbstractC23136l9.m118743r0(AbstractC8020f0.str_view)).m95729k(c31961i8.f146880a, c31961i8.f146895p).m95722d("share"), C0943w.m4462l().m4472f(str), -1L);
    }

    /* renamed from: p1 */
    public static boolean m103015p1(int i11) {
        return i11 == 18 || i11 == 32;
    }

    /* renamed from: p2 */
    public static void m103016p2(ContactProfile contactProfile) {
        m103020q2(new Conversation(contactProfile));
    }

    /* renamed from: q */
    public static boolean m103017q(Conversation conversation) {
        return m103021r(conversation.m40998a());
    }

    /* renamed from: q0 */
    public static List m103018q0(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            arrayList.add(new C26710b(m103022r0(c17945a0), c17945a0.m95029V3().m41047k(), c17945a0.mo95039W2(), null));
        }
        return arrayList;
    }

    /* renamed from: q1 */
    public static boolean m103019q1(C17945a0 c17945a0) {
        if (!m103011o1(c17945a0) && (!m103044x1(c17945a0.m95041W4()) || TextUtils.isEmpty(C31944h6.m153548n(c17945a0.m95019U3())))) {
            return false;
        }
        return true;
    }

    /* renamed from: q2 */
    public static void m103020q2(Conversation conversation) {
        try {
            if (conversation.m41013q()) {
                if (TextUtils.isEmpty(conversation.f42894r)) {
                    C0824j.m2153b(new a(conversation));
                }
            } else if ((TextUtils.isEmpty(conversation.f42894r) || TextUtils.isEmpty(conversation.f42895s)) && !conversation.f42893q.isEmpty() && Long.parseLong(conversation.f42893q) > 0) {
                C0824j.m2153b(new b(conversation));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: r */
    public static boolean m103021r(ContactProfile contactProfile) {
        if ((!AbstractC23309i.m121567Wg() && contactProfile.m40382P0() && !AbstractC21935u.m114558y(contactProfile.f42434r)) || (!AbstractC23309i.m121530Vg() && C0804b.m2025g().m2033i(contactProfile.f42434r))) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public static String m103022r0(C17945a0 c17945a0) {
        String str = CoreUtility.f89233i + c17945a0.m95029V3().m41044h() + c17945a0.m94862C4();
        if (c17945a0.m94933K7()) {
            return str + "_re-e2ee";
        }
        return str;
    }

    /* renamed from: r1 */
    public static boolean m103023r1(C17945a0 c17945a0) {
        if (c17945a0 != null && C23250w4.m119795W(c17945a0)) {
            return true;
        }
        return false;
    }

    /* renamed from: r2 */
    static void m103024r2(C17945a0 c17945a0) {
        c17945a0.m95193lc(0);
        c17945a0.m95182kb(false);
        c17945a0.m95096c1();
        C0814e0.m2064j(c17945a0);
    }

    /* renamed from: s */
    public static boolean m103025s(ZaloView zaloView) {
        boolean z11;
        boolean z12;
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        if (m92676n2 != null) {
            z12 = m92676n2.mo35576n3();
            z11 = m92676n2.mo35586v2();
        } else {
            z11 = false;
            z12 = false;
        }
        if (!AbstractC23309i.m121183M2()) {
            return false;
        }
        if ((z12 && !AbstractC23309i.m121294P2()) || z11) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    public static void m103026s0(String str, String str2) {
        C23288a.f113033a.mo13474a(new C18427b(str, new Runnable() { // from class: gw.h0

            /* renamed from: p */
            public final /* synthetic */ String f97433p;

            /* renamed from: q */
            public final /* synthetic */ String f97434q;

            public /* synthetic */ RunnableC19632h0(String str3, String str22) {
                r1 = str3;
                r2 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19646n0.m102898H1(r1, r2);
            }
        }));
    }

    /* renamed from: s1 */
    public static boolean m103027s1(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m94977P7() && c17945a0.m94929K2().f91016u.equals("recommened.vip")) {
            return true;
        }
        return false;
    }

    /* renamed from: s2 */
    private static boolean m103028s2(C17945a0 c17945a0, boolean z11) {
        if (z11 && !c17945a0.m95306y8() && !c17945a0.m94871D7() && !c17945a0.m95110d8()) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m103029t(boolean z11) {
        if (AbstractC23309i.m121183M2() && (!z11 || AbstractC23309i.m121294P2())) {
            return true;
        }
        return false;
    }

    /* renamed from: t0 */
    public static String m103030t0(int i11) {
        if (i11 == 1) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_banned_user);
        }
        if (i11 == 2) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_tv_deleted_user_v2);
        }
        return "";
    }

    /* renamed from: t1 */
    public static boolean m103031t1(int i11) {
        return i11 == 3 || i11 == 4;
    }

    /* renamed from: t2 */
    private static boolean m103032t2(C17945a0 c17945a0) {
        if (c17945a0 == null || !c17945a0.m94954N0()) {
            return false;
        }
        if (!c17945a0.m94871D7() && !c17945a0.m95120e6() && !c17945a0.m95316z8()) {
            if (c17945a0.m95110d8() && !((C17949b1) c17945a0.m94929K2()).m95397g().m132400H()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_general));
                return false;
            }
            return true;
        }
        if (TextUtils.isEmpty(c17945a0.m94983Q3())) {
            if (c17945a0.m95316z8()) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_must_download_voice_before_forward));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hint_must_download_file_before_forward));
            }
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m103033u() {
        return !AbstractC0924m0.m2961Cb();
    }

    /* renamed from: u0 */
    public static String m103034u0(String str, int i11) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (m103041w1(i11) && (indexOf = str.indexOf("/zalo/")) != -1 && str.startsWith(AbstractC20130d.m104842L0())) {
            str2 = str.substring(indexOf + 1);
        } else {
            str2 = str;
        }
        if (str2.startsWith("zalo/")) {
            if (!str2.startsWith("zalo/cacheimg/") && !str2.startsWith("zalo/tm_pic/")) {
                if (!str2.startsWith("zalo/voice/") && !str2.startsWith("zalo/bg") && !str2.startsWith("zalo/paint") && !str2.startsWith("zalo/picture/") && !str2.startsWith("zalo/data/") && !str2.startsWith("zalo/download") && !str2.startsWith("zalo/zinstant/chat") && !str2.startsWith(AbstractC20130d.f99273d)) {
                    return C20131e.f99303a.m104979x().toString() + File.separator + str2;
                }
                return C20131e.f99303a.m104973t() + str2;
            }
            return C20131e.f99303a.m104977v() + str2;
        }
        return str;
    }

    /* renamed from: u1 */
    public static boolean m103035u1(int i11) {
        return i11 == 12;
    }

    /* renamed from: v */
    public static boolean m103036v() {
        if (AbstractC23309i.m121698a() && !AbstractC23309i.m121755bh()) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    private static C26399a m103037v0(List list) {
        C26399a c26399a = new C26399a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17945a0 c17945a0 = (C17945a0) it.next();
            if (c17945a0.m94876E2() != null && (c26399a.m136120c() == 0 || c26399a.m136120c() > c17945a0.m94876E2().m136120c())) {
                c26399a = c17945a0.m94876E2();
            }
        }
        return c26399a;
    }

    /* renamed from: v1 */
    public static boolean m103038v1(int i11, long j11) {
        if (C23793c.m124316k().mo124314i() - j11 <= i11 * 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m103039w(List list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((C17945a0) it.next()).m95048X0()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w0 */
    public static C24275a m103040w0(int i11, String str, boolean z11, int i12) {
        long j11;
        int i13;
        long mo124314i = C23793c.m124316k().mo124314i();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mo124314i);
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        j11 = 0;
                    } else {
                        j11 = -1;
                    }
                } else {
                    if (calendar.get(11) >= 8) {
                        calendar.setTimeInMillis(calendar.getTimeInMillis() + 86400000);
                    }
                    calendar.set(11, 8);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    j11 = calendar.getTimeInMillis() - mo124314i;
                }
            } else {
                j11 = 14400000;
            }
        } else {
            j11 = 3600000;
        }
        if (z11) {
            i13 = 2;
        } else {
            i13 = 1;
        }
        return new C24275a(str, mo124314i, j11, i13, i12);
    }

    /* renamed from: w1 */
    public static boolean m103041w1(int i11) {
        return i11 == 3 || i11 == 4 || i11 == 6 || i11 == 2 || i11 == 23 || i11 == 29;
    }

    /* renamed from: x */
    public static void m103042x(Runnable runnable, Runnable runnable2, MessageId messageId, String str) {
        if (messageId == null) {
            AbstractC19444a.m101695c(runnable2);
        } else {
            C23288a.f113033a.mo13474a(new C18427b(str, new Runnable() { // from class: gw.g0

                /* renamed from: q */
                public final /* synthetic */ Runnable f97430q;

                /* renamed from: r */
                public final /* synthetic */ Runnable f97431r;

                public /* synthetic */ RunnableC19629g0(Runnable runnable3, Runnable runnable22) {
                    r2 = runnable3;
                    r3 = runnable22;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC19646n0.m102892F1(MessageId.this, r2, r3);
                }
            }));
        }
    }

    /* renamed from: x0 */
    public static String m103043x0(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (C21927m.m114302u().m114345m(str) && !TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                return "hidden";
            }
            if (AbstractC25495a.m132079d(str)) {
                return "chat_group";
            }
            return "chat_1_1";
        }
        return "chat_1_1";
    }

    /* renamed from: x1 */
    public static boolean m103044x1(int i11) {
        return i11 == 0;
    }

    /* renamed from: y */
    private static boolean m103045y(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!AbstractC23244v8.m119751o(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y0 */
    public static ContactProfile m103046y0(C17945a0 c17945a0) {
        try {
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c17945a0.mo95039W2());
            if (m141809c == null) {
                ContactProfile contactProfile = new ContactProfile(c17945a0.m94862C4());
                contactProfile.f42437s = c17945a0.m94854B4();
                return contactProfile;
            }
            return m141809c;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: y1 */
    public static boolean m103047y1(C17945a0 c17945a0) {
        if (c17945a0 != null && c17945a0.m94977P7() && c17945a0.m94929K2().f91016u.equals("recommened.user")) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private static void m103048z() {
        long mo124314i = AbstractC23306f.m120579F1().mo124314i();
        if (AbstractC0924m0.m4128q2() + 604800000 < mo124314i) {
            C7959d.m41638d1().m41693D(mo124314i - (C32163w8.m155135a().m155136b() * 3));
            AbstractC0924m0.m4085oj(mo124314i);
        }
    }

    /* renamed from: z0 */
    public static String m103049z0(String str, List list, int i11, ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i12 = 0; i12 < list.size(); i12++) {
                jSONArray.put(((InviteContactProfile) list.get(i12)).m40488x1());
            }
            JSONArray jSONArray2 = new JSONArray();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                jSONArray2.put(arrayList.get(i13));
            }
            jSONObject.put("contacts", jSONArray);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, i11);
            jSONObject.put("groupIdsInviteFailed", jSONArray2);
            jSONObject.put("userId", str);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject.toString();
    }

    /* renamed from: z1 */
    public static boolean m103050z1(long j11) {
        return j11 > 0;
    }
}
