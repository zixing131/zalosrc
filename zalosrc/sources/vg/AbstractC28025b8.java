package vg;

import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.text.AbstractC1463b;
import b40.C2520a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zalocloud.recover.C16888a;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import i70.C20379a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p055ce.AbstractC3439h;
import p162fh.C18932a;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import vg.C28212v6;

/* renamed from: vg.b8 */
/* loaded from: classes.dex */
public abstract class AbstractC28025b8 {

    /* renamed from: a */
    public static final String[] f130844a = {"tip.csc.plus", "tip.csc.fullscreensticker", "tip.csc.sticker", "tip.csc.rightmenu", "tip.csc.call", "tip.csc.addmember", "tip.csc.switch.viewmode.mycloud", "tip.csc.videocall", "tip.csc.sharedtimeline", "tip.csc.plus.hd", "tip.csc.rightmenu.groupboard", "tip.csc.grouppinbar", "tip.csc.reaction.add", "tip.csc.sticker.emoticon", "tip.csc.plus.location", "tip.csc.plus.file", "tip.csc.have.request.joingroup", "tip.csc.mention", "tip.csc.liveicon", "tip.csc.send", "tip.csc.photo", "tip.csc.voice", "tip.csc.rightmenu.setalias", "tip.csc.reaction.button", "tip.csc.rightmenu.createshortcutcall", "tip.csc.sticker.promotion", "tip.csc.nickname", "tip.csc.sticker.trending", "tip.csc.rightmenu.addmember", "tip.groupcall.csc.group", "tip.group.summary", "tip.pinboard.expand", "tip.search.bysender.entry", "tip.csc.ttl.rightmenu", "tip.mycloud.attachment.flow3.step1", "tip.mycloud.attachment.flow4.step1", "tip.mycloud.attachment.flow4.step2", "tip.attachment.promotetool", "tip.quickmessage.onboard_done", "tip.csc.sticker.gif", "tip.file_persist.download_file", "tip.file_persist.save_file", "tip.csc.voice.to.text", "tip.community.auto_upgrade", "tip.csc.sticker.ai"};

    /* renamed from: b */
    public static final String[] f130845b = {"tip.csc.sharedtimeline", "tip.csc.have.request.joingroup", "tip.csc.rightmenu.setalias", "tip.csc.rightmenu.createshortcutcall", "tip.csc.nickname", "tip.csc.rightmenu.addmember", "tip.group.summary"};

    /* renamed from: c */
    public static final String[] f130846c = {"tip.csc.sticker.store"};

    /* renamed from: d */
    public static final String[] f130847d = {"tip.csc.sticker", "tip.csc.sticker.trending", "tip.csc.fullscreensticker", "tip.csc.sticker.ai"};

    /* renamed from: e */
    public static final String[] f130848e = {"tip.csc.plus.location", "tip.csc.plus.file", "tip.attachment.promotetool"};

    /* renamed from: f */
    public static final String[] f130849f = {"tip.message.compose", "tip.message.search", "tip.message.newchat", "tip.message.compose.creategroup", "tip.message.compose.addfriend", "tip.message.compose.scanqr", "tip.message.compose.zalopc", "tip.message.compose.calendar", "tip.intro.chatlabel.feature", "tip.open.readlater.tab", "tip.groupcall.maintab", "tip.message.filter.v3", "tip.message.filter.banner"};

    /* renamed from: g */
    public static final String[] f130850g = {"tip.message.compose.creategroup", "tip.message.compose.addfriend", "tip.message.compose.scanqr", "tip.message.compose.zalopc", "tip.message.compose.calendar"};

    /* renamed from: h */
    public static final String[] f130851h = {"tip.contact.addfriend", "tip.contact.search", "tip.grouptab.leavegroup"};

    /* renamed from: i */
    public static final String[] f130852i = {"tip.timeline.notification", "tip.timeline.compose", "tip.timeline.createstory", "tip.timeline.msgfeed", "tip.pushfeed.memory", "tip.pushfeed.album", "tip.timeline.footerzaloconnect"};

    /* renamed from: j */
    public static final String[] f130853j = {"tip.more.qr_code"};

    /* renamed from: k */
    public static final String[] f130854k = {"tip.camera.capture.filter", "tip.camera.status.story", "tip.camera.status.story.thumb", "tip.camera.beauty"};

    /* renamed from: l */
    public static final String[] f130855l = {"tip.camera.preview.speed", "tip.camera.preview.sticker", "tip.camera.preview.caption", "tip.camera.preview.doodle", "tip.camera.preview.filter", "tip.camera.preview.location", "tip.camera.beauty", "tip.camera.story.privacy_setting", "tip.camera.story.music"};

    /* renamed from: m */
    public static final String[] f130856m = {"tip.story.privacy_setting", "tip.story.story_reaction", "tip.story.reshare_story_archive"};

    /* renamed from: n */
    public static final String[] f130857n = {"tip.profile.rightmenu.setalias", "tip.profile.privacyshortcut", "tip.profile.setting.noti"};

    /* renamed from: o */
    public static final String[] f130858o = {"tip.edit.bio", "tip.profile.limitfeedview", "tip.profile.avatar"};

    /* renamed from: p */
    public static final String[] f130859p = {"tip.postfeed.privacy", "tip.postfeed.video", "tip.postfeed.background", "tip.postfeed.typo", "tip.formpost.music"};

    /* renamed from: q */
    public static final String[] f130860q = {"tip.feeddetail.commentphoto", "tip.feeddetail.commentsticker"};

    /* renamed from: r */
    public static final String[] f130861r = {"tip.feeddetail.commentphoto", "tip.feeddetail.commentsticker"};

    /* renamed from: s */
    public static final String[] f130862s = {"tip.csc.viewfull.hdmode", "tip.socialviewfull.msgfeed", "tip.sharedmedia.viewfull.reaction", "tip.open_qr"};

    /* renamed from: t */
    public static final String[] f130863t = {"tip.open_qr"};

    /* renamed from: u */
    public static final String[] f130864u = {"tip.grouptab", "tip.moretab", "tip.groupcall.maintab", "tip.tabmessage.qr", "tip.discoverytab", "tip.tabme.ba.onboard", "tip.tabme.graceperiod.zcloud"};

    /* renamed from: v */
    public static final String[] f130865v = {"tip.grouptab.leavegroup", "tip.message.compose", "tip.message.compose.creategroup", "tip.message.compose.addfriend", "tip.message.compose.scanqr", "tip.message.compose.zalopc", "tip.message.compose.calendar", "tip.message.newchat"};

    /* renamed from: w */
    public static final String[] f130866w = {"tip.video.snapshot"};

    /* renamed from: x */
    public static final String[] f130867x = {"tip.csc.sharedmedia.album", "tip.csc.sharedmedia.media", "tip.csc.sharedmedia.link", "tip.csc.sharedmedia.document"};

    /* renamed from: y */
    public static final String[] f130868y = {"tip.calendar.monthcalendar", "tip.event.detail.oa", "tip.event.detail.oa.in.group"};

    /* renamed from: z */
    public static final String[] f130869z = {"tip.entry.point.new.group.from.poll"};

    /* renamed from: A */
    public static final String[] f130824A = {"tip.entry.point.new.group.from.reminder"};

    /* renamed from: B */
    public static final String[] f130825B = {"tip.sharedmedia.photo", "tip.sharedmedia.layout", "tip.sharedmedia.search", "tip.sharedmedia.datepicker", "tip.sharedmedia.multiselect"};

    /* renamed from: C */
    public static final String[] f130826C = {"tip.globalsearch.qr"};

    /* renamed from: D */
    public static final String[] f130827D = {"tip.sharedmedia.share.memory", "tip.sharedmeida.viewfullmemory.memory"};

    /* renamed from: E */
    public static final String[] f130828E = {"tip.poll_creating.advanced_options"};

    /* renamed from: F */
    public static final String[] f130829F = {"tip.tabme.businesstool.activation"};

    /* renamed from: G */
    static final List f130830G = Arrays.asList("tip.csc.rightmenu.createshortcutcall", "tip.camera.status.story", "tip.search.bysender.entry", "tip.poll_creating.advanced_options", "tip.story.reshare_story_archive");

    /* renamed from: H */
    public static final String[] f130831H = {"tip.pushfeed.avatar", "tip.pushfeed.cover", "tip.pushfeed.bio"};

    /* renamed from: I */
    public static final String[] f130832I = {"tip.call.hd.label", "tip.videocall.sticker"};

    /* renamed from: J */
    public static final String[] f130833J = {"tip.videocall.filter_skin"};

    /* renamed from: K */
    public static final String[] f130834K = {"tip.pinboard.edit"};

    /* renamed from: L */
    public static boolean f130835L = false;

    /* renamed from: M */
    public static boolean f130836M = false;

    /* renamed from: N */
    private static boolean f130837N = false;

    /* renamed from: O */
    public static boolean f130838O = false;

    /* renamed from: P */
    private static final Map f130839P = Collections.synchronizedMap(new HashMap());

    /* renamed from: Q */
    private static final Map f130840Q = Collections.synchronizedMap(new HashMap());

    /* renamed from: R */
    private static final Map f130841R = Collections.synchronizedMap(new HashMap());

    /* renamed from: S */
    public static String f130842S = "{\n\"id\":1,\n\"showTip\":1,\n\"showReddot\":1,\n\"tip\":\"Test promote noti info. Test promote noti info. Test promote noti info\",\n\"icon\":\"http:\\/\\/res.zalo.zdn.vn\\/upload\\/media\\/2016\\/11\\/28\\/filter_loc_hcm_01_1480304055118.png\",\n\"startTime\":1,\n\"endTime\":14834179651550,\n\"tipType\":1,\n\"tipIcon\":{\n\"type\":0,\n\"content\":{\n\"url\":\"http:\\/\\/res.zalo.zdn.vn\\/upload\\/media\\/2016\\/11\\/28\\/filter_loc_hcm_01_1480304055118.png\",\n\"width\":100,\n\"height\":100\n}\n},\n\"tipDuration\":300\n}";

    /* renamed from: T */
    static final int[] f130843T = new int[2];

    /* renamed from: vg.b8$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C28212v6 f130870a;

        a(C28212v6 c28212v6) {
            this.f130870a = c28212v6;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42334Zc(this.f130870a);
        }
    }

    /* renamed from: vg.b8$b */
    /* loaded from: classes.dex */
    public class b extends AbstractC0939u {
        b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00b9 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:2:0x0000, B:3:0x0014, B:5:0x001b, B:47:0x003e, B:7:0x0028, B:9:0x002c, B:11:0x0032, B:14:0x0042, B:34:0x0046, B:35:0x004a, B:44:0x0058, B:19:0x005b, B:20:0x005f, B:30:0x006d, B:54:0x006e, B:56:0x0074, B:57:0x0078, B:59:0x007e, B:61:0x008c, B:63:0x009b, B:67:0x00ab, B:69:0x00b9, B:37:0x004b, B:38:0x0054, B:22:0x0060, B:23:0x0069), top: B:1:0x0000, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo928a() {
            boolean z11;
            try {
                ArrayList m42369d7 = C7960e.m41971c6().m42369d7(new String[0]);
                ArrayList arrayList = new ArrayList();
                Iterator it = m42369d7.iterator();
                while (it.hasNext()) {
                    C28212v6 c28212v6 = (C28212v6) it.next();
                    if (!c28212v6.m142168g() && (c28212v6.f131575a != 0 || (c28212v6.m142169h() && AbstractC28025b8.m141466v(c28212v6.f131577c)))) {
                        int i11 = c28212v6.f131575a;
                        if (i11 == 1) {
                            synchronized (AbstractC28025b8.f130839P) {
                                AbstractC28025b8.f130839P.put(c28212v6.f131577c, c28212v6);
                            }
                        } else if (i11 == 0) {
                            synchronized (AbstractC28025b8.f130840Q) {
                                AbstractC28025b8.f130840Q.put(c28212v6.f131577c, c28212v6);
                            }
                        } else {
                            continue;
                        }
                    }
                    arrayList.add(c28212v6);
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C7960e.m41971c6().m42104E4((C28212v6) it2.next());
                    }
                }
                AbstractC28025b8.m141430A();
                if (!AbstractC28025b8.f130839P.containsKey("tip.csc.reaction.add") && !AbstractC28025b8.f130839P.containsKey("tip.csc.reaction.button")) {
                    z11 = false;
                    AbstractC28025b8.f130838O = z11;
                    if (!AbstractC28025b8.f130839P.containsKey("tip.grouptab")) {
                        C23744a.m124114c().m124116d(44, "tip.grouptab");
                        return;
                    }
                    return;
                }
                z11 = true;
                AbstractC28025b8.f130838O = z11;
                if (!AbstractC28025b8.f130839P.containsKey("tip.grouptab")) {
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: vg.b8$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C28212v6 f130871a;

        c(C28212v6 c28212v6) {
            this.f130871a = c28212v6;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            if (this.f130871a.m142168g()) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(this.f130871a);
                C7960e.m41971c6().m42091D4(arrayList);
                return;
            }
            C7960e.m41971c6().m42334Zc(this.f130871a);
        }
    }

    /* renamed from: A */
    static void m141430A() {
        char c11;
        C28212v6 c28212v6;
        try {
            Context appContext = MainApplication.getAppContext();
            if (!f130837N) {
                return;
            }
            for (String str : f130830G) {
                if (m141466v(str)) {
                    Map map = f130840Q;
                    if (!map.containsKey(str) && !m141450f(str)) {
                        switch (str.hashCode()) {
                            case -2021862077:
                                if (str.equals("tip.search.bysender.entry")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                            case -1042795145:
                                if (str.equals("tip.camera.status.story.thumb")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case -501534975:
                                if (str.equals("tip.csc.rightmenu.createshortcutcall")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case -95695281:
                                if (str.equals("tip.camera.status.story")) {
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 288295241:
                                if (str.equals("tip.poll_creating.advanced_options")) {
                                    c11 = 4;
                                    break;
                                }
                                break;
                        }
                        c11 = 65535;
                        if (c11 != 0) {
                            if (c11 != 1) {
                                if (c11 != 2) {
                                    if (c11 != 3) {
                                        if (c11 != 4) {
                                            c28212v6 = null;
                                        } else {
                                            c28212v6 = new C28212v6(appContext.getResources().getString(AbstractC8020f0.str_create_group_poll_advanced_options_tip));
                                            c28212v6.f131590p = 3;
                                        }
                                    } else {
                                        c28212v6 = new C28212v6(appContext.getResources().getString(AbstractC8020f0.search_by_sender_entry_tip));
                                        c28212v6.f131580f = true;
                                        c28212v6.f131590p = 0;
                                    }
                                } else {
                                    c28212v6 = new C28212v6("");
                                    c28212v6.f131580f = true;
                                    c28212v6.f131579e = false;
                                }
                            } else {
                                C28212v6.a aVar = new C28212v6.a();
                                aVar.f131596a = 0;
                                aVar.f131601f = appContext.getResources().getResourceEntryName(AbstractC16803z.icn_story_local_tip_thumb);
                                aVar.f131598c = 60;
                                aVar.f131599d = 60;
                                C28212v6 c28212v62 = new C28212v6(appContext.getResources().getString(AbstractC8020f0.str_camera_background_status_tip_local_msg));
                                c28212v62.f131584j = aVar;
                                c28212v62.f131580f = true;
                                c28212v6 = c28212v62;
                            }
                        } else {
                            c28212v6 = new C28212v6("");
                            c28212v6.f131580f = true;
                            c28212v6.f131579e = false;
                        }
                        if (c28212v6 != null) {
                            m141439J(c28212v6);
                            synchronized (map) {
                                map.put(str, c28212v6);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: B */
    public static void m141431B() {
        C0824j.m2153b(new b());
    }

    /* renamed from: C */
    public static void m141432C(String str) {
        Map map = f130840Q;
        synchronized (map) {
            map.remove(str);
        }
    }

    /* renamed from: D */
    public static void m141433D() {
        Map map = f130839P;
        synchronized (map) {
            map.clear();
        }
        Map map2 = f130840Q;
        synchronized (map2) {
            map2.clear();
        }
        Map map3 = f130841R;
        synchronized (map3) {
            map3.clear();
        }
        synchronized (AbstractC28025b8.class) {
            f130835L = false;
            f130838O = false;
        }
    }

    /* renamed from: E */
    public static void m141434E() {
        Map map = f130840Q;
        synchronized (map) {
            map.clear();
        }
        m141430A();
    }

    /* renamed from: F */
    public static void m141435F(C28212v6 c28212v6, String str) {
        if (c28212v6 != null) {
            Map map = f130840Q;
            synchronized (map) {
                map.put(str, c28212v6);
            }
        }
    }

    /* renamed from: G */
    public static void m141436G(String str, C28212v6 c28212v6) {
        Map map = f130839P;
        synchronized (map) {
            map.put(str, c28212v6);
        }
        C0824j.m2153b(new a(c28212v6));
    }

    /* renamed from: H */
    public static void m141437H(C28212v6 c28212v6) {
        String str = c28212v6.f131577c;
        int i11 = c28212v6.f131575a;
        boolean z11 = true;
        if (i11 == 1) {
            if (c28212v6.m142168g()) {
                f130839P.remove(str);
            }
            m141439J(c28212v6);
        } else if (i11 == 0) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.z7

                /* renamed from: p */
                public final /* synthetic */ String f131717p;

                /* renamed from: q */
                public final /* synthetic */ C28212v6 f131718q;

                public /* synthetic */ RunnableC28249z7(String str2, C28212v6 c28212v62) {
                    r1 = str2;
                    r2 = c28212v62;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC28025b8.m141469y(r1, r2);
                }
            });
        }
        Map map = f130839P;
        if (!map.containsKey("tip.csc.reaction.add") && !map.containsKey("tip.csc.reaction.button")) {
            z11 = false;
        }
        f130838O = z11;
    }

    /* renamed from: I */
    public static void m141438I(String str, C28212v6 c28212v6) {
        m141436G(str, c28212v6);
        C23744a.m124114c().m124116d(44, str);
    }

    /* renamed from: J */
    static void m141439J(C28212v6 c28212v6) {
        if (c28212v6 != null) {
            C0824j.m2153b(new c(c28212v6));
        }
    }

    /* renamed from: K */
    public static void m141440K(String str, boolean z11) {
        AbstractC23309i.m121692Zu("LOCAL_TIP_" + str, z11, true);
    }

    /* renamed from: L */
    public static void m141441L(String str) {
        C28212v6 m141454j = m141454j(str);
        if (m141454j != null) {
            m141454j.f131579e = false;
            m141454j.f131580f = false;
            if (f130830G.contains(str)) {
                m141439J(m141454j);
            }
        }
    }

    /* renamed from: M */
    public static void m141442M(String str) {
        m141444O(m141453i(str), true);
    }

    /* renamed from: N */
    public static void m141443N(String str, boolean z11) {
        m141444O(m141453i(str), z11);
    }

    /* renamed from: O */
    static void m141444O(C28212v6 c28212v6, boolean z11) {
        if (c28212v6 != null && c28212v6.m142167f()) {
            c28212v6.f131580f = false;
            if (z11) {
                c28212v6.f131579e = false;
            }
            m141437H(c28212v6);
        }
    }

    /* renamed from: e */
    public static boolean m141449e(View view, int i11) {
        if (view == null) {
            return false;
        }
        int[] iArr = f130843T;
        view.getLocationOnScreen(iArr);
        if (iArr[1] < i11) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m141450f(String str) {
        return AbstractC23309i.m121899fa("LOCAL_TIP_" + str, false, true);
    }

    /* renamed from: g */
    private static void m141451g(C28212v6 c28212v6) {
        C28212v6 c28212v62 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quick_picker_tip_step2_title));
        c28212v62.f131575a = 1;
        c28212v62.f131587m = c28212v6.f131587m;
        c28212v62.f131588n = c28212v6.f131588n;
        c28212v62.f131577c = "tip.mycloud.attachment.flow3.step1";
        c28212v62.f131579e = c28212v6.f131579e;
        c28212v62.f131590p = c28212v6.f131590p;
        m141438I("tip.mycloud.attachment.flow3.step1", c28212v62);
        C28212v6 c28212v63 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quick_picker_tip_step3_title));
        c28212v63.f131575a = 1;
        c28212v63.f131587m = c28212v6.f131587m;
        c28212v63.f131588n = c28212v6.f131588n;
        c28212v63.f131577c = "tip.mycloud.attachment.flow3.step2";
        c28212v63.f131579e = c28212v6.f131579e;
        c28212v63.f131590p = c28212v6.f131590p;
        m141438I("tip.mycloud.attachment.flow3.step2", c28212v63);
        AbstractC0924m0.m2967Ch(false);
    }

    /* renamed from: h */
    private static void m141452h(C28212v6 c28212v6) {
        C28212v6 c28212v62 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quick_picker_tip_step1_title));
        c28212v62.f131582h = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quick_picker_tip_step1_sub_title);
        c28212v62.f131575a = 1;
        c28212v62.f131587m = c28212v6.f131587m;
        c28212v62.f131588n = c28212v6.f131588n;
        c28212v62.f131577c = "tip.mycloud.attachment.flow4.step1";
        c28212v62.f131579e = c28212v6.f131579e;
        c28212v62.f131590p = c28212v6.f131590p;
        m141438I("tip.mycloud.attachment.flow4.step1", c28212v62);
        C28212v6 c28212v63 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quick_picker_tip_step2_title));
        c28212v63.f131575a = 1;
        c28212v63.f131587m = c28212v6.f131587m;
        c28212v63.f131588n = c28212v6.f131588n;
        c28212v63.f131577c = "tip.mycloud.attachment.flow4.step2";
        c28212v63.f131579e = c28212v6.f131579e;
        c28212v63.f131590p = c28212v6.f131590p;
        m141438I("tip.mycloud.attachment.flow4.step2", c28212v63);
        C28212v6 c28212v64 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_cloud_quick_picker_tip_step3_title));
        c28212v64.f131575a = 1;
        c28212v64.f131587m = c28212v6.f131587m;
        c28212v64.f131588n = c28212v6.f131588n;
        c28212v64.f131577c = "tip.mycloud.attachment.flow4.step3";
        c28212v64.f131579e = c28212v6.f131579e;
        c28212v64.f131590p = c28212v6.f131590p;
        m141438I("tip.mycloud.attachment.flow4.step3", c28212v64);
        AbstractC0924m0.m2996Dh(false);
    }

    /* renamed from: i */
    public static C28212v6 m141453i(String str) {
        C28212v6 m141460p = m141460p(str);
        if (m141460p != null && m141460p.m142167f()) {
            return m141460p;
        }
        return m141454j(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: j */
    public static C28212v6 m141454j(String str) {
        C28212v6 c28212v6;
        C28212v6 c28212v62;
        C28212v6 c28212v63;
        Map map = f130840Q;
        synchronized (map) {
            try {
                if (map.containsKey(str) && (c28212v63 = (C28212v6) map.get(str)) != null) {
                    return c28212v63;
                }
                Context appContext = MainApplication.getAppContext();
                str.hashCode();
                char c11 = 65535;
                switch (str.hashCode()) {
                    case -1892203953:
                        if (str.equals("tip.intro.chatlabel.feature")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -872249364:
                        if (str.equals("tip.open.readlater.tab")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case -593586600:
                        if (str.equals("tip.tabme.businesstool.activation")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case -421775901:
                        if (str.equals("tip.open_qr")) {
                            c11 = 3;
                            break;
                        }
                        break;
                    case -313636020:
                        if (str.equals("tip.tabme.ba.onboard")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case 17602701:
                        if (str.equals("tip.grouptab.leavegroup")) {
                            c11 = 5;
                            break;
                        }
                        break;
                    case 361129209:
                        if (str.equals("tip.message.filter.v3")) {
                            c11 = 6;
                            break;
                        }
                        break;
                    case 539910052:
                        if (str.equals("tip.tabme.graceperiod.zcloud")) {
                            c11 = 7;
                            break;
                        }
                        break;
                    case 1376008104:
                        if (str.equals("tip.message.filter.banner")) {
                            c11 = '\b';
                            break;
                        }
                        break;
                    case 1766828793:
                        if (str.equals("tip.story.reshare_story_archive")) {
                            c11 = '\t';
                            break;
                        }
                        break;
                }
                switch (c11) {
                    case 0:
                        if (f130837N) {
                            C18932a c18932a = C18932a.f94442a;
                            if (c18932a.m99182f() && !c18932a.m99184h() && !AbstractC0924m0.m4198sc()) {
                                c28212v62 = new C28212v6("");
                                c28212v62.f131582h = appContext.getResources().getString(AbstractC8020f0.str_tip_intro_chat_label_feature_v2);
                                c28212v62.f131580f = false;
                                c28212v6 = c28212v62;
                                break;
                            }
                        }
                        c28212v6 = null;
                        break;
                    case 1:
                        if (f130837N && C18932a.f94442a.m99182f() && C7860a.Companion.m40303b().m40282Z(1) && !AbstractC0924m0.m4228tc() && AbstractC0924m0.m4198sc()) {
                            c28212v62 = new C28212v6("");
                            c28212v62.f131582h = appContext.getResources().getString(AbstractC8020f0.str_tip_open_read_later_tab);
                            c28212v62.f131580f = false;
                            c28212v6 = c28212v62;
                            break;
                        }
                        c28212v6 = null;
                        break;
                    case 2:
                        c28212v6 = AbstractC3439h.m17283q();
                        break;
                    case 3:
                        if (!f130836M && AbstractC0924m0.m3245M5() < 5) {
                            c28212v6 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_scan_qr_button_tip));
                            c28212v6.f131580f = false;
                            break;
                        }
                        c28212v6 = null;
                        break;
                    case 4:
                        c28212v6 = AbstractC3439h.m17282p(appContext);
                        break;
                    case 5:
                        if (f130835L) {
                            c28212v62 = new C28212v6(appContext.getResources().getString(AbstractC8020f0.str_tip_long_click_leave_group));
                            c28212v62.f131580f = true;
                            c28212v6 = c28212v62;
                            break;
                        }
                        c28212v6 = null;
                        break;
                    case 6:
                        if (AbstractC0924m0.m3339Pc() && !AbstractC0924m0.m3107Hc()) {
                            c28212v62 = new C28212v6("");
                            c28212v62.f131582h = AbstractC1463b.m7440a(appContext.getResources().getString(AbstractC8020f0.str_tooltip_desc_intro_chat_filter_v3), 0);
                            c28212v6 = c28212v62;
                            break;
                        }
                        c28212v6 = null;
                        break;
                    case 7:
                        C16888a m90216h = C16888a.m90216h();
                        if (m90216h.m90244o() && !m90216h.m90245p()) {
                            c28212v6 = new C28212v6("");
                            c28212v6.f131580f = true;
                            c28212v6.f131579e = false;
                            break;
                        } else {
                            c28212v6 = new C28212v6("");
                            c28212v6.f131580f = false;
                            c28212v6.f131579e = false;
                            break;
                        }
                    case '\b':
                        if (AbstractC0924m0.m4197sb()) {
                            c28212v62 = new C28212v6("");
                            c28212v62.f131582h = appContext.getResources().getString(AbstractC8020f0.str_tap_to_filter_conversations);
                            c28212v62.f131592r = 5L;
                            c28212v62.f131593s = true;
                            c28212v6 = c28212v62;
                            break;
                        }
                        c28212v6 = null;
                        break;
                    case '\t':
                        c28212v6 = new C28212v6(AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_reshare_tip_desc));
                        c28212v6.f131580f = false;
                        break;
                    default:
                        c28212v6 = null;
                        break;
                }
                if (c28212v6 != null) {
                    c28212v6.f131577c = str;
                }
                return c28212v6;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: k */
    public static String m141455k(String str) {
        if (str.startsWith("tip.csc.rightmenu.addmember")) {
            return "tip.csc.rightmenu.addmember";
        }
        if (str.startsWith("tip.csc.addmember")) {
            return "tip.csc.addmember";
        }
        if (str.startsWith("tip.group.summary")) {
            return "tip.group.summary";
        }
        if (str.startsWith("tip.csc.rightmenu")) {
            return "tip.csc.rightmenu";
        }
        if (str.startsWith("tip.pinboard.expand")) {
            return "tip.pinboard.expand";
        }
        if (str.startsWith("tip.pinboard.edit")) {
            return "tip.pinboard.edit";
        }
        if (str.startsWith("tip.groupcall.csc.group")) {
            return "tip.groupcall.csc.group";
        }
        return str;
    }

    /* renamed from: l */
    public static C28212v6 m141456l(String[] strArr) {
        if (strArr != null) {
            for (String str : strArr) {
                C28212v6 m141453i = m141453i(str);
                if (m141453i != null && m141453i.m142167f() && m141453i.f131580f) {
                    return m141453i;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: m */
    public static ArrayList m141457m(String[] strArr) {
        return m141458n(strArr, "");
    }

    /* renamed from: n */
    public static ArrayList m141458n(String[] strArr, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (strArr != null) {
            try {
                for (String str2 : strArr) {
                    ArrayList m141459o = m141459o(str2);
                    if (m141467w(str2) && !TextUtils.isEmpty(str)) {
                        m141459o.addAll(m141459o(str2 + "." + str));
                    }
                    Iterator it = m141459o.iterator();
                    while (it.hasNext()) {
                        C28212v6 c28212v6 = (C28212v6) it.next();
                        if (c28212v6 != null && c28212v6.m142169h()) {
                            if (c28212v6.f131575a == 1) {
                                arrayList.add(c28212v6);
                            } else {
                                arrayList2.add(c28212v6);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: o */
    public static ArrayList m141459o(String str) {
        ArrayList arrayList = new ArrayList();
        C28212v6 m141460p = m141460p(str);
        if (m141460p != null && m141460p.m142167f()) {
            arrayList.add(m141460p);
        }
        C28212v6 m141454j = m141454j(str);
        if (m141454j != null && m141454j.m142167f()) {
            arrayList.add(m141454j);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C28212v6 c28212v6 = (C28212v6) it.next();
            if (c28212v6 != null) {
                c28212v6.f131577c = str;
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public static C28212v6 m141460p(String str) {
        C28212v6 c28212v6;
        Map map = f130839P;
        synchronized (map) {
            c28212v6 = (C28212v6) map.get(str);
        }
        if (c28212v6 != null) {
            c28212v6.f131577c = str;
        }
        return c28212v6;
    }

    /* renamed from: q */
    public static void m141461q(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                C28212v6 c28212v6 = new C28212v6(jSONObject);
                if ("tip.timeline.createstory".equals(c28212v6.f131577c)) {
                    return;
                }
                if (!c28212v6.m142165d()) {
                    C28212v6 m141460p = m141460p(c28212v6.f131577c);
                    if (m141460p != null && m141460p.f131578d == c28212v6.f131578d && m141460p.m142167f()) {
                        c28212v6.f131579e = m141460p.f131579e;
                        c28212v6.f131580f = m141460p.f131580f;
                        m141462r(new JSONObject(c28212v6.toString()));
                    }
                    m141462r(jSONObject);
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: r */
    public static void m141462r(JSONObject jSONObject) {
        char c11;
        if (jSONObject != null) {
            String optString = jSONObject.optString("tipCat", "");
            if (!TextUtils.isEmpty(optString)) {
                C28212v6 c28212v6 = new C28212v6(jSONObject);
                optString.hashCode();
                switch (optString.hashCode()) {
                    case -2073723775:
                        if (optString.equals("tip.sharedmedia.viewfull.reaction")) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1972461870:
                        if (optString.equals("tip.sharedmedia.share.memory")) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1690884106:
                        if (optString.equals("tip.camera.capture.filter")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1467809197:
                        if (optString.equals("tip.sharedmedia.multiselect")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1444933852:
                        if (optString.equals("tip.group.summary")) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1359334333:
                        if (optString.equals("tip.tabme.new_feature")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -985269459:
                        if (optString.equals("tip.csc.rightmenu")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -941645054:
                        if (optString.equals("tip.csc.plus.file")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -887169717:
                        if (optString.equals("tip.csc.viewfull.hdmode")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -698998559:
                        if (optString.equals("tip.postfeed.typo")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -652745900:
                        if (optString.equals("tip.pinboard.edit")) {
                            c11 = '\n';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -424999707:
                        if (optString.equals("tip.timeline.msgfeed")) {
                            c11 = 11;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -298881273:
                        if (optString.equals("tip.csc.sticker.ai")) {
                            c11 = '\f';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -210161134:
                        if (optString.equals("tip.csc.sharedmedia.album")) {
                            c11 = '\r';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -204920476:
                        if (optString.equals("tip.pinboard.expand")) {
                            c11 = 14;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -199285881:
                        if (optString.equals("tip.csc.sharedmedia.media")) {
                            c11 = 15;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -140641638:
                        if (optString.equals("tip.mycloud.attachment.onboard_flow3")) {
                            c11 = 16;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -140641637:
                        if (optString.equals("tip.mycloud.attachment.onboard_flow4")) {
                            c11 = 17;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 205094155:
                        if (optString.equals("tip.postfeed.background")) {
                            c11 = 18;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 238545312:
                        if (optString.equals("tip.groupcall.csc.group")) {
                            c11 = 19;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 306140468:
                        if (optString.equals("tip.camera.preview.filter")) {
                            c11 = 20;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 456730660:
                        if (optString.equals("tip.community.auto_upgrade")) {
                            c11 = 21;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 470461041:
                        if (optString.equals("tip.camera.preview.location")) {
                            c11 = 22;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 481711768:
                        if (optString.equals("tip.csc.sharedmedia.document")) {
                            c11 = 23;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 590881566:
                        if (optString.equals("tip.sharedmedia.datepicker")) {
                            c11 = 24;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 725827834:
                        if (optString.equals("tip.csc.rightmenu.addmember")) {
                            c11 = 25;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 820540585:
                        if (optString.equals("tip.grouptab")) {
                            c11 = 26;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1267123088:
                        if (optString.equals("tip.sharedmedia.photo")) {
                            c11 = 27;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1314314285:
                        if (optString.equals("tip.csc.addmember")) {
                            c11 = 28;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1455495739:
                        if (optString.equals("tip.csc.plus.location")) {
                            c11 = 29;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1758678989:
                        if (optString.equals("tip.tabme.critical_issue")) {
                            c11 = 30;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1981570898:
                        if (optString.equals("tip.camera.beauty")) {
                            c11 = 31;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2071755767:
                        if (optString.equals("tip.csc.sharedmedia.link")) {
                            c11 = ' ';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2081312205:
                        if (optString.equals("tip.moretab")) {
                            c11 = '!';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 2098228101:
                        if (optString.equals("tip.socialviewfull.msgfeed")) {
                            c11 = '\"';
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
                    case 3:
                    case 7:
                    case 11:
                    case 24:
                    case 27:
                    case 29:
                    case '!':
                    case '\"':
                        c28212v6.m142171k(0);
                        break;
                    case 1:
                    case 4:
                    case 6:
                    case '\n':
                    case '\r':
                    case 14:
                    case 15:
                    case 19:
                    case 23:
                    case 25:
                    case 28:
                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                        if (!TextUtils.isEmpty(c28212v6.f131586l)) {
                            m141470z(optString, c28212v6);
                            optString = optString + "." + c28212v6.f131586l;
                            c28212v6.f131577c = optString;
                            break;
                        }
                        break;
                    case 2:
                    case 20:
                    case 31:
                        AbstractC23309i.m122551wq(0L);
                        break;
                    case 5:
                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                        C28035c8 c28035c8 = (C28035c8) c28212v6.f131589o;
                        if (c28035c8 != null && c28035c8.m141475d().m108529c()) {
                            optString = optString + "." + c28035c8.m141475d().m108530d();
                            c28212v6.f131577c = optString;
                            if (MainTabView.m67645lM() != null) {
                                MainTabView.m67645lM().m67679ON();
                                break;
                            }
                        }
                        break;
                    case '\b':
                        c28212v6.f131590p = 0;
                        break;
                    case '\t':
                        AbstractC23309i.m120800Bq(0L);
                        break;
                    case '\f':
                        C2520a c2520a = C2520a.f10235a;
                        c2520a.m12626h(0);
                        c2520a.m12628j(0);
                        c2520a.m12627i(0);
                        break;
                    case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                        m141451g(c28212v6);
                        break;
                    case 17:
                        m141452h(c28212v6);
                        break;
                    case 18:
                        AbstractC23309i.m120763Aq(0L);
                        break;
                    case 21:
                        c28212v6 = C20379a.f100400a.m106161d();
                        break;
                    case 22:
                        AbstractC23309i.m121133Kq(0L);
                        AbstractC23309i.m121687Zp(-1);
                        C28193t5.m141757e().m141761d(null, true);
                        break;
                    case 26:
                        AbstractC23309i.m122184mu(1);
                        break;
                }
                if (!optString.equals("tip.mycloud.attachment.onboard_flow3") && !optString.equals("tip.mycloud.attachment.onboard_flow4")) {
                    m141438I(optString, c28212v6);
                }
            }
        }
    }

    /* renamed from: s */
    public static void m141463s(C28212v6 c28212v6, int i11, int i12) {
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            if (c28212v6.f131593s) {
                long j11 = c28212v6.f131592r - (i12 / 1000);
                c28212v6.f131592r = j11;
                if (j11 <= 0) {
                    c28212v6.f131592r = 0L;
                    c28212v6.f131579e = false;
                }
            }
        } else {
            c28212v6.f131579e = false;
            c28212v6.f131592r = 0L;
        }
        if (c28212v6.f131575a == 0) {
            c28212v6.f131579e = false;
        }
        c28212v6.f131594t = true;
        m141437H(c28212v6);
    }

    /* renamed from: t */
    public static void m141464t(int i11, int i12) {
        AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: vg.a8

            /* renamed from: p */
            public final /* synthetic */ int f130639p;

            /* renamed from: q */
            public final /* synthetic */ int f130640q;

            public /* synthetic */ RunnableC28015a8(int i122, int i112) {
                r1 = i122;
                r2 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC28025b8.m141468x(r1, r2);
            }
        });
    }

    /* renamed from: u */
    public static boolean m141465u(String str) {
        C28212v6 m141453i = m141453i(str);
        if (m141453i != null && m141453i.m142167f()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    static boolean m141466v(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2021862077:
                if (str.equals("tip.search.bysender.entry")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1042795145:
                if (str.equals("tip.camera.status.story.thumb")) {
                    c11 = 1;
                    break;
                }
                break;
            case -501534975:
                if (str.equals("tip.csc.rightmenu.createshortcutcall")) {
                    c11 = 2;
                    break;
                }
                break;
            case -95695281:
                if (str.equals("tip.camera.status.story")) {
                    c11 = 3;
                    break;
                }
                break;
            case 288295241:
                if (str.equals("tip.poll_creating.advanced_options")) {
                    c11 = 4;
                    break;
                }
                break;
            case 1766828793:
                if (str.equals("tip.story.reshare_story_archive")) {
                    c11 = 5;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
                return false;
            case 5:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: w */
    private static boolean m141467w(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1444933852:
                if (str.equals("tip.group.summary")) {
                    c11 = 0;
                    break;
                }
                break;
            case -985269459:
                if (str.equals("tip.csc.rightmenu")) {
                    c11 = 1;
                    break;
                }
                break;
            case -949129045:
                if (str.equals("tip.csc.ttl.rightmenu")) {
                    c11 = 2;
                    break;
                }
                break;
            case -652745900:
                if (str.equals("tip.pinboard.edit")) {
                    c11 = 3;
                    break;
                }
                break;
            case -204920476:
                if (str.equals("tip.pinboard.expand")) {
                    c11 = 4;
                    break;
                }
                break;
            case 238545312:
                if (str.equals("tip.groupcall.csc.group")) {
                    c11 = 5;
                    break;
                }
                break;
            case 725827834:
                if (str.equals("tip.csc.rightmenu.addmember")) {
                    c11 = 6;
                    break;
                }
                break;
            case 1314314285:
                if (str.equals("tip.csc.addmember")) {
                    c11 = 7;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m141468x(int i11, int i12) {
        if (i11 > 0 && i11 < i12) {
            try {
                f130837N = true;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return;
            }
        }
        m141431B();
    }

    /* renamed from: y */
    public static /* synthetic */ void m141469y(String str, C28212v6 c28212v6) {
        if (f130830G.contains(str)) {
            m141440K(str, true);
            m141439J(c28212v6);
        }
    }

    /* renamed from: z */
    private static void m141470z(String str, C28212v6 c28212v6) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject(AbstractC23309i.m121558W7());
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
                jSONObject = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put(str, optJSONArray);
            }
            int i11 = 0;
            while (i11 < optJSONArray.length()) {
                if (optJSONArray.get(i11).equals(c28212v6.f131586l)) {
                    optJSONArray.remove(i11);
                    i11--;
                }
                i11++;
            }
            optJSONArray.put(c28212v6.f131586l);
            while (optJSONArray.length() > 30) {
                String str2 = (String) optJSONArray.get(0);
                optJSONArray.remove(0);
                m141442M(str + "." + str2);
            }
            AbstractC23309i.m122590xs(jSONObject.toString());
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }
}
