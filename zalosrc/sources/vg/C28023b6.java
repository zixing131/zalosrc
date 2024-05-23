package vg;

import ag0.AbstractC0837p0;
import ag0.C0804b;
import am.AbstractC0906d0;
import am.AbstractC0924m0;
import am.C0943w;
import android.R;
import android.app.ActivityOptions;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.service.notification.StatusBarNotification;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.webkit.MimeTypeMap;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC1364q;
import androidx.core.app.C1335e1;
import androidx.core.app.C1341g1;
import androidx.core.app.C1347i1;
import androidx.core.content.AbstractC1388a;
import androidx.core.content.C1390c;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.IconCompat;
import bi.C2804c;
import ck.C3560a;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.C8937j0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.feed.mvp.notificationview.NotificationView;
import com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView;
import com.zing.zalo.feed.mvp.storyarchive.StoryArchiveView;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.IntentHandlerActivity;
import com.zing.zalo.p077ui.IntentHandlerInternalActivity;
import com.zing.zalo.p077ui.IntentHandlerTrampolineActivity;
import com.zing.zalo.p077ui.MessagePopupActivity;
import com.zing.zalo.p077ui.MissCallActivity;
import com.zing.zalo.p077ui.RetryMsgPopupActivity;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.group.invitation.box.GroupInvitationListView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.maintab.msg.MessagesView;
import com.zing.zalo.p077ui.settings.AboutView;
import com.zing.zalo.p077ui.widget.DumpChatImageView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.GroupEventDetailView;
import com.zing.zalo.p077ui.zviews.GroupPostDetailViewV2;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.ListContactNativeView;
import com.zing.zalo.p077ui.zviews.MyCalendarView;
import com.zing.zalo.p077ui.zviews.StickerDetailsView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.p077ui.zviews.SuggestFriendView;
import com.zing.zalo.p077ui.zviews.UserDetailsView;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.receiver.ZaloReceiver;
import com.zing.zalo.service.TaskNonStickyExecutor;
import com.zing.zalo.utils.phonenumbers.C16741a;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17949b1;
import dj.C18000s1;
import fj.C18961d;
import ge.C19411c;
import gu.AbstractC19601a;
import gw.AbstractC19646n0;
import gw.AbstractC19656s0;
import gw.C19636i1;
import ho0.AbstractC20110a;
import is.AbstractC20833z;
import is.C20817r;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import jf0.C21242e;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23041d2;
import me0.AbstractC23056e6;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23088h5;
import me0.AbstractC23121k5;
import me0.AbstractC23132l5;
import me0.AbstractC23133l6;
import me0.AbstractC23136l9;
import me0.AbstractC23152n3;
import me0.AbstractC23165o5;
import me0.AbstractC23170p;
import me0.AbstractC23178p7;
import me0.C23081g9;
import me0.C23278z2;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import mm0.AbstractC23352g;
import o70.C24099q0;
import org.json.JSONArray;
import org.json.JSONObject;
import p140ev.C18613b;
import p161fg.C18922m;
import p187gk.C19464a;
import p239ih.C20556f;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.AbstractC23775p0;
import p363nh.C23744a;
import p363nh.C23750d;
import p379o3.AbstractC24006q;
import p379o3.C23995f;
import p379o3.C23999j;
import p405ov.C24559a;
import p451qk.C25304a;
import p461qu.AbstractC25495a;
import p471r3.C25630b;
import p471r3.EnumC25629a;
import p542ub.InterfaceC27218a;
import p588vw.C28644j;
import p716zh.C31901e8;
import p716zh.C31973j5;
import p716zh.C31987k4;
import p716zh.C31991k8;
import p716zh.C32002l4;
import p716zh.C32064p7;
import p716zh.C32078q7;
import p716zh.C32079q8;
import p716zh.C32163w8;
import pw.C24913b;
import su.C26388b;
import th.AbstractC26683d;
import u00.C26939u;
import v50.C27870vb;
import vg.C28020b3;
import vg.C28023b6;
import zl0.AbstractC32232i;

/* renamed from: vg.b6 */
/* loaded from: classes.dex */
public final class C28023b6 {

    /* renamed from: A */
    static String f130671A = "ACTION_NAME_OPEN_DETAIL_REMINDER";

    /* renamed from: B */
    static String f130672B = "ACTION_NAME_OPEN_CALENDAR";

    /* renamed from: C */
    static String f130673C = "ACTION_NAME_OPEN_CHAT";

    /* renamed from: r */
    static final String f130674r = "b6";

    /* renamed from: s */
    static volatile C28023b6 f130675s;

    /* renamed from: t */
    static List f130676t;

    /* renamed from: u */
    public static List f130677u;

    /* renamed from: v */
    static Hashtable f130678v;

    /* renamed from: w */
    private static int f130679w;

    /* renamed from: x */
    static Hashtable f130680x;

    /* renamed from: y */
    static Set f130681y;

    /* renamed from: z */
    static Bitmap f130682z;

    /* renamed from: a */
    C1335e1 f130683a;

    /* renamed from: j */
    ContactProfile f130692j;

    /* renamed from: k */
    String f130693k;

    /* renamed from: l */
    String f130694l;

    /* renamed from: m */
    String f130695m;

    /* renamed from: b */
    final Map f130684b = Collections.synchronizedMap(new HashMap());

    /* renamed from: c */
    Map f130685c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d */
    public final Set f130686d = Collections.synchronizedSet(new HashSet());

    /* renamed from: e */
    public int f130687e = -1;

    /* renamed from: f */
    public int f130688f = -1;

    /* renamed from: g */
    Map f130689g = Collections.synchronizedMap(new HashMap());

    /* renamed from: h */
    final Object f130690h = new Object();

    /* renamed from: i */
    private Map f130691i = new HashMap();

    /* renamed from: n */
    MessageId f130696n = null;

    /* renamed from: o */
    Runnable f130697o = new l();

    /* renamed from: p */
    HashSet f130698p = new LinkedHashSet();

    /* renamed from: q */
    Map f130699q = Collections.synchronizedMap(new HashMap());

    /* renamed from: vg.b6$a */
    /* loaded from: classes3.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130700l1;

        /* renamed from: m1 */
        final /* synthetic */ C23750d f130701m1;

        /* renamed from: n1 */
        final /* synthetic */ String f130702n1;

        /* renamed from: o1 */
        final /* synthetic */ C23750d f130703o1;

        a(String str, C23750d c23750d, String str2, C23750d c23750d2) {
            this.f130700l1 = str;
            this.f130701m1 = c23750d;
            this.f130702n1 = str2;
            this.f130703o1 = c23750d2;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C28023b6.this.f130698p.remove(interfaceC3968a);
                interfaceC3968a.setImageInfo(c3979l, false);
                if (c3979l != null && c3979l.m18839c() != null && this.f130700l1.equals(str)) {
                    AbstractC1364q.c cVar = new AbstractC1364q.c(this.f130701m1);
                    cVar.m6818i(c3979l.m18839c());
                    cVar.m6820k(this.f130702n1);
                    this.f130703o1.m124147b0();
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$b */
    /* loaded from: classes3.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130705l1;

        /* renamed from: m1 */
        final /* synthetic */ C23750d f130706m1;

        /* renamed from: n1 */
        final /* synthetic */ ContactProfile f130707n1;

        /* renamed from: o1 */
        final /* synthetic */ int f130708o1;

        b(String str, C23750d c23750d, ContactProfile contactProfile, int i11) {
            this.f130705l1 = str;
            this.f130706m1 = c23750d;
            this.f130707n1 = contactProfile;
            this.f130708o1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                List list = C28023b6.f130677u;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("callback url:");
                sb2.append(str);
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && this.f130705l1.equals(str)) {
                    C28023b6.this.m141358l2(this.f130706m1, c3979l.m18839c(), this.f130707n1);
                    this.f130706m1.mo6855H(C28023b6.m141251i1(this.f130708o1, c3979l.m18839c()));
                    this.f130706m1.m124147b0();
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$c */
    /* loaded from: classes3.dex */
    public class c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String[] f130710l1;

        /* renamed from: m1 */
        final /* synthetic */ int f130711m1;

        /* renamed from: n1 */
        final /* synthetic */ RemoteViews f130712n1;

        /* renamed from: o1 */
        final /* synthetic */ int[] f130713o1;

        /* renamed from: p1 */
        final /* synthetic */ C23750d f130714p1;

        c(String[] strArr, int i11, RemoteViews remoteViews, int[] iArr, C23750d c23750d) {
            this.f130710l1 = strArr;
            this.f130711m1 = i11;
            this.f130712n1 = remoteViews;
            this.f130713o1 = iArr;
            this.f130714p1 = c23750d;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && this.f130710l1[this.f130711m1].equals(str)) {
                    this.f130712n1.setImageViewBitmap(this.f130713o1[this.f130711m1], c3979l.m18839c());
                    this.f130714p1.m124147b0();
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$d */
    /* loaded from: classes3.dex */
    public class d extends C23999j {

        /* renamed from: l1 */
        final RecyclingImageView f130716l1 = new RecyclingImageView(MainApplication.getAppContext());

        /* renamed from: m1 */
        final /* synthetic */ q f130717m1;

        d(q qVar) {
            this.f130717m1 = qVar;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                this.f130716l1.setImageInfo(c3979l);
                if (c3979l != null && c3979l.m18839c() != null && AbstractC23304d.f113409m.containsKey(Integer.valueOf(this.f130717m1.f130803r))) {
                    AbstractC23170p.m119345c(this.f130717m1.m141425o(), c3979l.m18839c());
                    q qVar = this.f130717m1;
                    qVar.f130810y = 1;
                    q.m141403A(qVar, false);
                    List list = C28023b6.f130677u;
                    String.format("loadBigImage callback:%s", str);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: vg.b6$e */
    /* loaded from: classes3.dex */
    public class e extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130718l1;

        /* renamed from: m1 */
        final /* synthetic */ int f130719m1;

        /* renamed from: n1 */
        final /* synthetic */ C23750d f130720n1;

        e(String str, int i11, C23750d c23750d) {
            this.f130718l1 = str;
            this.f130719m1 = i11;
            this.f130720n1 = c23750d;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && this.f130718l1.equals(str)) {
                    Bitmap m141251i1 = C28023b6.m141251i1(this.f130719m1, c3979l.m18839c());
                    this.f130720n1.m6880f();
                    this.f130720n1.mo6855H(m141251i1);
                    this.f130720n1.m124147b0();
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$f */
    /* loaded from: classes3.dex */
    public class f extends C23999j {

        /* renamed from: l1 */
        final C3977j f130722l1 = new C3977j(MainApplication.getAppContext());

        /* renamed from: m1 */
        final /* synthetic */ q f130723m1;

        f(q qVar) {
            this.f130723m1 = qVar;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                this.f130722l1.setImageInfo(c3979l, false);
                if (c3979l != null && c3979l.m18839c() != null && AbstractC23304d.f113409m.containsKey(Integer.valueOf(this.f130723m1.f130803r))) {
                    this.f130723m1.f130778C.add(c3979l.m18839c());
                    q qVar = this.f130723m1;
                    qVar.f130810y = 1;
                    q.m141403A(qVar, false);
                }
                AbstractC20110a.m104535d("%s loadImage callback: %s", C28023b6.f130674r, str);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: vg.b6$g */
    /* loaded from: classes3.dex */
    public class g extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130725l1;

        /* renamed from: m1 */
        final /* synthetic */ int f130726m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f130727n1;

        /* renamed from: o1 */
        final /* synthetic */ C23750d f130728o1;

        g(String str, int i11, boolean z11, C23750d c23750d) {
            this.f130725l1 = str;
            this.f130726m1 = i11;
            this.f130727n1 = z11;
            this.f130728o1 = c23750d;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && this.f130725l1.equals(str)) {
                    this.f130728o1.mo6855H(C28023b6.m141253j1(this.f130726m1, c3979l.m18839c(), this.f130727n1));
                    this.f130728o1.m124147b0();
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$h */
    /* loaded from: classes3.dex */
    public class h extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130730l1;

        /* renamed from: m1 */
        final /* synthetic */ int f130731m1;

        /* renamed from: n1 */
        final /* synthetic */ C23750d f130732n1;

        /* renamed from: o1 */
        final /* synthetic */ Bitmap f130733o1;

        h(String str, int i11, C23750d c23750d, Bitmap bitmap) {
            this.f130730l1 = str;
            this.f130731m1 = i11;
            this.f130732n1 = c23750d;
            this.f130733o1 = bitmap;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            Bitmap bitmap;
            try {
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && !c3979l.m18839c().isRecycled() && this.f130730l1.equals(str)) {
                    bitmap = C28023b6.m141251i1(this.f130731m1, c3979l.m18839c());
                } else {
                    bitmap = null;
                }
                C23750d c23750d = this.f130732n1;
                if (bitmap == null) {
                    bitmap = this.f130733o1;
                }
                c23750d.mo6855H(bitmap);
                this.f130732n1.m124147b0();
                C28023b6.m141262r2();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$i */
    /* loaded from: classes3.dex */
    public class i extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130735l1;

        /* renamed from: m1 */
        final /* synthetic */ C23750d f130736m1;

        /* renamed from: n1 */
        final /* synthetic */ ContactProfile f130737n1;

        /* renamed from: o1 */
        final /* synthetic */ int f130738o1;

        /* renamed from: p1 */
        final /* synthetic */ RemoteViews f130739p1;

        i(String str, C23750d c23750d, ContactProfile contactProfile, int i11, RemoteViews remoteViews) {
            this.f130735l1 = str;
            this.f130736m1 = c23750d;
            this.f130737n1 = contactProfile;
            this.f130738o1 = i11;
            this.f130739p1 = remoteViews;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                List list = C28023b6.f130677u;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("callback url:");
                sb2.append(str);
                interfaceC3968a.setImageInfo(c3979l, false);
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && this.f130735l1.equals(str)) {
                    C28023b6.this.m141358l2(this.f130736m1, c3979l.m18839c(), this.f130737n1);
                    this.f130739p1.setImageViewBitmap(AbstractC6918a0.icon, C28023b6.m141251i1(this.f130738o1, c3979l.m18839c()));
                    AbstractC23775p0.m124214s(this.f130736m1);
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$j */
    /* loaded from: classes3.dex */
    public class j extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130741l1;

        /* renamed from: m1 */
        final /* synthetic */ C23750d f130742m1;

        /* renamed from: n1 */
        final /* synthetic */ String f130743n1;

        j(String str, C23750d c23750d, String str2) {
            this.f130741l1 = str;
            this.f130742m1 = c23750d;
            this.f130743n1 = str2;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && this.f130741l1.equals(str)) {
                    AbstractC1364q.c cVar = new AbstractC1364q.c(this.f130742m1);
                    cVar.m6818i(c3979l.m18839c());
                    cVar.m6820k(this.f130743n1);
                    AbstractC23775p0.m124214s(this.f130742m1);
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$k */
    /* loaded from: classes3.dex */
    public class k extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f130745l1;

        /* renamed from: m1 */
        final /* synthetic */ C23750d f130746m1;

        /* renamed from: n1 */
        final /* synthetic */ ContactProfile f130747n1;

        /* renamed from: o1 */
        final /* synthetic */ int f130748o1;

        k(String str, C23750d c23750d, ContactProfile contactProfile, int i11) {
            this.f130745l1 = str;
            this.f130746m1 = c23750d;
            this.f130747n1 = contactProfile;
            this.f130748o1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                List list = C28023b6.f130677u;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("callback url:");
                sb2.append(str);
                C28023b6.this.f130698p.remove(interfaceC3968a);
                if (c3979l != null && c3979l.m18839c() != null && this.f130745l1.equals(str)) {
                    C28023b6.this.m141358l2(this.f130746m1, c3979l.m18839c(), this.f130747n1);
                    this.f130746m1.mo6855H(C28023b6.m141251i1(this.f130748o1, c3979l.m18839c()));
                    AbstractC23775p0.m124214s(this.f130746m1);
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vg.b6$l */
    /* loaded from: classes.dex */
    public class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if ((C21927m.m114302u().m114345m(C28023b6.this.f130692j.f42434r) && !TextUtils.isEmpty(AbstractC23309i.m122303q0())) || C11318b.m60507e().m60515j(C28023b6.this.f130692j.f42434r)) {
                return;
            }
            int m118423d = AbstractC23088h5.m118423d("message_error", C28023b6.this.f130692j.f42434r);
            ContactProfile contactProfile = new ContactProfile(C28023b6.this.f130692j.f42434r);
            contactProfile.f42437s = C28023b6.this.f130692j.m40383Q(true, false);
            contactProfile.f42446v = C28023b6.this.f130692j.f42446v;
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140781h(C28023b6.this.f130696n).m140776b();
            m140776b.putBoolean("specialToShowPassCodeScreen", true);
            m140776b.putBoolean("fromNotification", true);
            m140776b.putString("uidNotif", C28023b6.this.f130692j.f42434r);
            m140776b.putString("dpnNotif", C28023b6.this.f130692j.m40383Q(true, false));
            m140776b.putString("avtNotif", C28023b6.this.f130692j.f42446v);
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119002J(m140776b), AbstractC19601a.m102572b(134217728));
            C28023b6 c28023b6 = C28023b6.this;
            c28023b6.m141343f1(c28023b6.f130693k, c28023b6.f130694l, c28023b6.f130695m, activity, "message_error", c28023b6.f130692j.f42434r);
            if (AbstractC23349d.m122763a() < 2 && !AbstractC23165o5.m119333b() && C32163w8.m155135a().f148298k) {
                if (MessagePopupActivity.m56886u4() != null) {
                    MessagePopupActivity.m56884o5(false);
                    MessagePopupActivity.m56886u4().finish();
                }
                if (MainApplication.getAppContext() != null) {
                    C28023b6 c28023b62 = C28023b6.this;
                    RetryMsgPopupActivity.f55392m0 = c28023b62.f130696n;
                    ContactProfile contactProfile2 = c28023b62.f130692j;
                    RetryMsgPopupActivity.f55394o0 = contactProfile2.f42434r;
                    RetryMsgPopupActivity.f55393n0 = contactProfile2.m40383Q(true, false);
                    C28023b6 c28023b63 = C28023b6.this;
                    RetryMsgPopupActivity.f55395p0 = c28023b63.f130694l;
                    RetryMsgPopupActivity.f55396q0 = c28023b63.f130692j.f42446v;
                    if (RetryMsgPopupActivity.m56951e4()) {
                        C23744a.m124114c().m124116d(6067, new Object[0]);
                        return;
                    }
                    Context applicationContext = MainApplication.getAppContext().getApplicationContext();
                    Intent intent = new Intent(applicationContext, (Class<?>) RetryMsgPopupActivity.class);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    applicationContext.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: vg.b6$m */
    /* loaded from: classes3.dex */
    public class m extends C28020b3.b {

        /* renamed from: a */
        final /* synthetic */ C3979l f130751a;

        /* renamed from: b */
        final /* synthetic */ q f130752b;

        m(C3979l c3979l, q qVar) {
            this.f130751a = c3979l;
            this.f130752b = qVar;
        }

        @Override // vg.C28020b3.b
        /* renamed from: b */
        public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
            try {
                C3979l c3979l2 = this.f130751a;
                if (c3979l2 != null && c3979l2.m18839c() != null && AbstractC23304d.f113409m.containsKey(Integer.valueOf(this.f130752b.f130803r))) {
                    AbstractC23170p.m119346d(this.f130752b.m141425o(), this.f130751a.m18839c());
                    q qVar = this.f130752b;
                    qVar.f130810y = 1;
                    q.m141403A(qVar, false);
                    List list = C28023b6.f130677u;
                    String.format("loadSticker callback:%s", str);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: vg.b6$n */
    /* loaded from: classes3.dex */
    public static class n {

        /* renamed from: e */
        public static int f130753e = 0;

        /* renamed from: f */
        public static int f130754f = 1;

        /* renamed from: g */
        public static int f130755g = 2;

        /* renamed from: h */
        public static int f130756h = 3;

        /* renamed from: a */
        public String f130757a;

        /* renamed from: b */
        public int f130758b;

        /* renamed from: c */
        public PendingIntent f130759c;

        /* renamed from: d */
        public int f130760d;

        public n(String str, int i11, PendingIntent pendingIntent) {
            this(str, i11, pendingIntent, false);
        }

        /* renamed from: a */
        public CharSequence m141400a(int i11) {
            return this.f130757a;
        }

        public n(String str, int i11, PendingIntent pendingIntent, boolean z11) {
            this(str, i11, pendingIntent, f130753e);
        }

        public n(String str, int i11, PendingIntent pendingIntent, int i12) {
            this.f130757a = str;
            this.f130758b = i11;
            this.f130759c = pendingIntent;
            this.f130760d = i12;
        }
    }

    /* renamed from: vg.b6$o */
    /* loaded from: classes3.dex */
    public static class o {

        /* renamed from: a */
        public int f130761a;

        /* renamed from: b */
        public String f130762b;

        /* renamed from: c */
        public String f130763c;

        /* renamed from: d */
        public String f130764d;

        /* renamed from: e */
        public C25630b f130765e;

        /* renamed from: f */
        public boolean f130766f;

        public o(C17945a0 c17945a0) {
            this.f130761a = 0;
            this.f130761a = c17945a0.m95041W4();
            this.f130762b = c17945a0.m95119e5();
            this.f130763c = c17945a0.m95019U3();
            this.f130764d = c17945a0.m94854B4();
            if (c17945a0.m94929K2() instanceof C17949b1) {
                this.f130765e = ((C17949b1) c17945a0.m94929K2()).m95397g();
            }
            this.f130766f = c17945a0.m95144g8();
        }

        /* renamed from: b */
        public static int m141401b(int i11) {
            if (i11 == 19) {
                return 2;
            }
            if (i11 == 3 || i11 == 4) {
                return 1;
            }
            return i11 == 10 ? 3 : 0;
        }

        /* renamed from: a */
        public int m141402a() {
            return m141401b(this.f130761a);
        }
    }

    /* renamed from: vg.b6$p */
    /* loaded from: classes3.dex */
    public static class p {

        /* renamed from: a */
        public int f130767a;

        public p(int i11) {
            this.f130767a = i11;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof p)) {
                return false;
            }
            if (((p) obj).f130767a == this.f130767a) {
                return true;
            }
            return super.equals(obj);
        }
    }

    /* renamed from: vg.b6$q */
    /* loaded from: classes3.dex */
    public static class q implements Runnable {

        /* renamed from: Z */
        public static final Map f130768Z = new ConcurrentHashMap();

        /* renamed from: a0 */
        static final Map f130769a0 = m141410g(3);

        /* renamed from: b0 */
        static final Map f130770b0 = m141410g(3);

        /* renamed from: c0 */
        static final Map f130771c0 = m141411h(0);

        /* renamed from: d0 */
        static Bitmap f130772d0;

        /* renamed from: e0 */
        static Bitmap f130773e0;

        /* renamed from: f0 */
        static Bitmap f130774f0;

        /* renamed from: g0 */
        static Bitmap f130775g0;

        /* renamed from: G */
        private Bitmap f130782G;

        /* renamed from: I */
        Spannable f130784I;

        /* renamed from: M */
        o f130788M;

        /* renamed from: X */
        d f130799X;

        /* renamed from: Y */
        AbstractC1364q.j f130800Y;

        /* renamed from: p */
        C23750d f130801p;

        /* renamed from: q */
        C1335e1 f130802q;

        /* renamed from: r */
        int f130803r;

        /* renamed from: u */
        long f130806u;

        /* renamed from: v */
        ContactProfile f130807v;

        /* renamed from: s */
        boolean f130804s = true;

        /* renamed from: t */
        boolean f130805t = false;

        /* renamed from: w */
        boolean f130808w = false;

        /* renamed from: x */
        boolean f130809x = false;

        /* renamed from: y */
        int f130810y = -1;

        /* renamed from: z */
        boolean f130811z = false;

        /* renamed from: A */
        int f130776A = 0;

        /* renamed from: B */
        private int f130777B = 0;

        /* renamed from: C */
        private final List f130778C = new ArrayList();

        /* renamed from: D */
        String f130779D = "";

        /* renamed from: E */
        RecyclingImageView f130780E = null;

        /* renamed from: F */
        DumpChatImageView f130781F = null;

        /* renamed from: H */
        final Object f130783H = new Object();

        /* renamed from: J */
        String f130785J = "";

        /* renamed from: K */
        MessageId f130786K = null;

        /* renamed from: L */
        String f130787L = "";

        /* renamed from: N */
        int f130789N = 0;

        /* renamed from: O */
        boolean f130790O = true;

        /* renamed from: P */
        c f130791P = c.NORMAL;

        /* renamed from: Q */
        boolean f130792Q = true;

        /* renamed from: R */
        boolean f130793R = false;

        /* renamed from: S */
        boolean f130794S = false;

        /* renamed from: T */
        boolean f130795T = true;

        /* renamed from: U */
        String f130796U = "";

        /* renamed from: V */
        boolean f130797V = false;

        /* renamed from: W */
        long f130798W = System.currentTimeMillis();

        /* renamed from: vg.b6$q$a */
        /* loaded from: classes3.dex */
        public class a extends LinkedHashMap {

            /* renamed from: p */
            final /* synthetic */ int f130812p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, float f11, boolean z11, int i12) {
                super(i11, f11, z11);
                this.f130812p = i12;
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry entry) {
                if (size() > this.f130812p) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: vg.b6$q$b */
        /* loaded from: classes3.dex */
        public class b extends LinkedHashMap {
            b(int i11, float f11, boolean z11) {
                super(i11, f11, z11);
            }

            @Override // java.util.LinkedHashMap
            protected boolean removeEldestEntry(Map.Entry entry) {
                if (entry.getValue() == null || Math.abs(System.currentTimeMillis() - ((q) entry.getValue()).f130798W) > 300000) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: vg.b6$q$c */
        /* loaded from: classes3.dex */
        public enum c {
            NORMAL,
            INBOX,
            BIG_TEXT,
            BIG_PHOTO,
            MESSAGING
        }

        /* renamed from: vg.b6$q$d */
        /* loaded from: classes3.dex */
        public static class d {

            /* renamed from: a */
            boolean f130819a;

            /* renamed from: b */
            Bundle f130820b;

            public d(Bundle bundle, boolean z11) {
                this.f130820b = bundle;
                this.f130819a = z11;
            }
        }

        /* renamed from: A */
        static synchronized void m141403A(q qVar, boolean z11) {
            synchronized (q.class) {
                boolean z12 = false;
                if (z11) {
                    try {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        q m141418r = m141418r(qVar.f130803r);
                        if (m141418r != null) {
                            TaskNonStickyExecutor.m50450b().m50452c(m141418r);
                            long j11 = m141418r.f130806u;
                            if (elapsedRealtime - j11 < 500) {
                                qVar.f130806u = j11;
                                z12 = true;
                            } else {
                                qVar.f130806u = elapsedRealtime;
                            }
                        } else {
                            qVar.f130806u = elapsedRealtime;
                        }
                        m141421w(qVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                TaskNonStickyExecutor.m50450b().m50452c(qVar);
                if (z12) {
                    TaskNonStickyExecutor.m50450b().m50454e(qVar, 500L);
                } else if (qVar.f130804s) {
                    TaskNonStickyExecutor.m50450b().m50453d(qVar);
                } else {
                    TaskNonStickyExecutor.m50450b().m50454e(qVar, 500L);
                }
            }
        }

        /* renamed from: c */
        static /* bridge */ /* synthetic */ Bitmap m141406c() {
            return m141415l();
        }

        /* renamed from: d */
        static /* bridge */ /* synthetic */ Bitmap m141407d() {
            return m141417n();
        }

        /* renamed from: e */
        static boolean m141408e(q qVar) {
            boolean containsValue;
            Map map = f130771c0;
            synchronized (map) {
                containsValue = map.containsValue(qVar);
            }
            return containsValue;
        }

        /* renamed from: f */
        public static void m141409f(int i11) {
            Map map = f130771c0;
            synchronized (map) {
                map.remove(Integer.valueOf(i11));
            }
            Map map2 = f130768Z;
            synchronized (map2) {
                try {
                    q qVar = (q) map2.remove(Integer.valueOf(i11));
                    if (qVar != null) {
                        qVar.f130805t = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: g */
        static Map m141410g(int i11) {
            return new a((int) ((i11 * 10.0f) / 7.0f), 0.7f, true, i11);
        }

        /* renamed from: h */
        static Map m141411h(int i11) {
            return new b((int) ((i11 * 10.0f) / 7.0f), 0.7f, true);
        }

        /* renamed from: i */
        private void m141412i() {
            Icon createWithAdaptiveBitmap;
            ShortcutInfo.Builder locusId;
            ShortcutInfo.Builder longLived;
            ShortcutInfo.Builder icon;
            Person.Builder name;
            Person build;
            ShortcutInfo.Builder person;
            ShortcutInfo.Builder shortLabel;
            ShortcutInfo.Builder longLabel;
            ShortcutInfo.Builder intent;
            ShortcutInfo build2;
            Bundle bundle;
            boolean z11;
            if (Build.VERSION.SDK_INT >= 30 && C28023b6.m141250h0().m141329a0() && !TextUtils.isEmpty(this.f130784I) && C28023b6.m141250h0().m141348h1(this.f130801p.m124152h0())) {
                String m141342f0 = C28023b6.m141250h0().m141342f0(this.f130801p);
                Context appContext = MainApplication.getAppContext();
                IconCompat m7150c = IconCompat.m7150c(m141427q());
                createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(m141427q());
                AbstractC28113k6.m141600a();
                locusId = AbstractC28033c6.m141471a(MainApplication.getAppContext(), m141342f0).setLocusId(AbstractC28093i6.m141566a(m141342f0));
                boolean z12 = true;
                longLived = locusId.setLongLived(true);
                icon = longLived.setIcon(createWithAdaptiveBitmap);
                name = AbstractC28103j6.m141578a().setName(this.f130784I.toString());
                build = name.build();
                person = icon.setPerson(build);
                shortLabel = person.setShortLabel(this.f130784I.toString());
                longLabel = shortLabel.setLongLabel(this.f130784I.toString());
                intent = longLabel.setIntent(AbstractC23178p7.m119413l(CoreUtility.getAppContext(), this.f130807v.f42434r));
                C26939u m138770q = C26939u.m138770q();
                build2 = intent.build();
                m138770q.m138784y(build2);
                d dVar = this.f130799X;
                if (dVar == null || (bundle = dVar.f130820b) == null) {
                    bundle = new Bundle();
                }
                if (this.f130807v.m40374K0()) {
                    bundle.putString("groupId", this.f130807v.f42434r);
                    bundle.putString("groupName", this.f130807v.f42437s);
                }
                bundle.putString("extra_bubble_shortcut_id", m141342f0);
                bundle.putSerializable("ACTION_SHOW_ZALO_VIEW_EXTRA_CLASS", ChatView.class);
                bundle.putAll(new C27870vb(this.f130807v.mo2478b()).m140780g(this.f130807v).m140776b());
                AbstractC1364q.e.c m6844c = new AbstractC1364q.e.c(PendingIntent.getActivity(MainApplication.getAppContext(), this.f130803r, new Intent().setComponent(new ComponentName(appContext, (Class<?>) ZaloBubbleActivity.class)).setAction("android.intent.action.VIEW").putExtra("EXTRA_BUBBLE_DATA", AbstractC23132l5.m118633a(bundle)), AbstractC19601a.m102572b(134217728)), m7150c).m6844c(AbstractC23136l9.m118713h0());
                d dVar2 = this.f130799X;
                if (dVar2 != null && dVar2.f130819a) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC1364q.e.c m6845e = m6844c.m6845e(z11);
                d dVar3 = this.f130799X;
                if (dVar3 == null || !dVar3.f130819a) {
                    z12 = false;
                }
                AbstractC1364q.e.c m6843b = m6845e.m6843b(z12);
                this.f130799X = null;
                this.f130801p.m6887o(m6843b.m6842a()).m6864Q(m141342f0).m6858K(new C1390c(m141342f0)).m6878d(new C1341g1.b().m6743f(this.f130784I.toString()).m6740c(m7150c).m6738a());
            }
        }

        /* renamed from: j */
        public static void m141413j(String str, MessageId messageId, String str2) {
            c cVar;
            if (str != null && str2 != null) {
                try {
                    q m141419s = m141419s(C28023b6.m141234U(str, "msg_normal"));
                    if (m141419s != null && messageId.equals(m141419s.f130786K) && (cVar = m141419s.f130791P) != c.INBOX && cVar != c.MESSAGING && m141419s.f130792Q) {
                        C28023b6.m141228O0(m141419s, str2, new C23528a(MainApplication.getAppContext().getApplicationContext()), AbstractC23006a0.m117919o());
                        m141419s.f130810y = 1;
                        m141403A(m141419s, false);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            }
        }

        /* renamed from: k */
        private static synchronized Bitmap m141414k() {
            Bitmap bitmap;
            synchronized (q.class) {
                try {
                    if (f130773e0 == null) {
                        f130773e0 = BitmapFactory.decodeResource(MainApplication.getAppContext().getApplicationContext().getResources(), AbstractC16803z.default_avatar);
                    }
                    bitmap = f130773e0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bitmap;
        }

        /* renamed from: l */
        private static synchronized Bitmap m141415l() {
            Bitmap bitmap;
            synchronized (q.class) {
                try {
                    if (f130772d0 == null) {
                        f130772d0 = BitmapFactory.decodeResource(MainApplication.getAppContext().getApplicationContext().getResources(), AbstractC16803z.avatar_groupchat);
                    }
                    bitmap = f130772d0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bitmap;
        }

        /* renamed from: m */
        private static synchronized Bitmap m141416m() {
            Bitmap bitmap;
            synchronized (q.class) {
                try {
                    if (f130774f0 == null) {
                        f130774f0 = BitmapFactory.decodeResource(MainApplication.getAppContext().getApplicationContext().getResources(), AbstractC16803z.default_avatar_plus);
                    }
                    bitmap = f130774f0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bitmap;
        }

        /* renamed from: n */
        private static synchronized Bitmap m141417n() {
            Bitmap bitmap;
            synchronized (q.class) {
                try {
                    if (f130775g0 == null) {
                        f130775g0 = BitmapFactory.decodeResource(MainApplication.getAppContext().getApplicationContext().getResources(), AbstractC16803z.icn_avatar_default);
                    }
                    bitmap = f130775g0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bitmap;
        }

        /* renamed from: r */
        static q m141418r(int i11) {
            return (q) f130768Z.get(Integer.valueOf(i11));
        }

        /* renamed from: s */
        static q m141419s(int i11) {
            q qVar;
            Map map = f130771c0;
            synchronized (map) {
                qVar = (q) map.get(Integer.valueOf(i11));
            }
            return qVar;
        }

        /* renamed from: t */
        private void m141420t() {
            if (C28023b6.m141250h0().m141356l()) {
                C28023b6.m141250h0().m141358l2(this.f130801p, m141415l(), this.f130807v);
            }
            this.f130801p.mo6855H(m141415l());
        }

        /* renamed from: w */
        static void m141421w(q qVar) {
            f130768Z.put(Integer.valueOf(qVar.f130803r), qVar);
        }

        /* renamed from: x */
        static void m141422x(int i11, q qVar) {
            Map map = f130771c0;
            synchronized (map) {
                map.put(Integer.valueOf(i11), qVar);
            }
        }

        /* renamed from: y */
        private void m141423y() {
        }

        /* renamed from: z */
        public void m141424z(int i11) {
            this.f130777B = i11;
        }

        /* renamed from: o */
        Bitmap m141425o() {
            Bitmap bitmap;
            synchronized (this.f130783H) {
                try {
                    if (this.f130782G == null) {
                        this.f130782G = Bitmap.createBitmap(644, 360, Bitmap.Config.ARGB_8888);
                    }
                    bitmap = this.f130782G;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bitmap;
        }

        /* renamed from: p */
        Bitmap m141426p() {
            ContactProfile contactProfile = this.f130807v;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                Map map = f130770b0;
                Bitmap bitmap = (Bitmap) map.get(this.f130807v.f42434r);
                if (bitmap == null || bitmap.isRecycled()) {
                    Bitmap createBitmap = Bitmap.createBitmap(C28023b6.m141243c(), C28023b6.m141243c(), Bitmap.Config.ARGB_8888);
                    map.put(this.f130807v.f42434r, createBitmap);
                    return createBitmap;
                }
                return bitmap;
            }
            return Bitmap.createBitmap(C28023b6.m141243c(), C28023b6.m141243c(), Bitmap.Config.ARGB_8888);
        }

        /* renamed from: q */
        Bitmap m141427q() {
            ContactProfile contactProfile = this.f130807v;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                Map map = f130769a0;
                Bitmap bitmap = (Bitmap) map.get(this.f130807v.f42434r);
                if (bitmap == null || bitmap.isRecycled()) {
                    Bitmap createBitmap = Bitmap.createBitmap(C28023b6.m141243c(), C28023b6.m141243c(), Bitmap.Config.ARGB_8888);
                    map.put(this.f130807v.f42434r, createBitmap);
                    return createBitmap;
                }
                return bitmap;
            }
            return Bitmap.createBitmap(C28023b6.m141243c(), C28023b6.m141243c(), Bitmap.Config.ARGB_8888);
        }

        /* JADX WARN: Code restructure failed: missing block: B:167:0x05fe, code lost:            if (android.text.TextUtils.isEmpty(r15.f130788M.f130762b) != false) goto L688;     */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x0600, code lost:            r15.f130808w = true;        vg.C28023b6.m141228O0(r15, r15.f130788M.f130762b, r2, 0);     */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:            if (android.text.TextUtils.isEmpty(r15.f130788M.f130762b) != false) goto L410;     */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:            r15.f130808w = true;        vg.C28023b6.m141228O0(r15, r15.f130788M.f130762b, r6, 0);     */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x047a, code lost:            if (android.text.TextUtils.isEmpty(r15.f130788M.f130762b) != false) goto L620;     */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x047c, code lost:            r15.f130808w = true;        vg.C28023b6.m141228O0(r15, r15.f130788M.f130762b, r7, 0);     */
        /* JADX WARN: Removed duplicated region for block: B:139:0x042f  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x05b0 A[Catch: Exception -> 0x0010, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0013, B:10:0x0023, B:12:0x0027, B:15:0x002c, B:17:0x0030, B:19:0x0041, B:21:0x0047, B:23:0x004b, B:31:0x005b, B:33:0x0061, B:35:0x0069, B:37:0x0073, B:39:0x007c, B:42:0x0083, B:44:0x0085, B:47:0x008b, B:49:0x008f, B:51:0x00ab, B:52:0x03f2, B:54:0x03f6, B:59:0x0401, B:63:0x0415, B:66:0x041b, B:69:0x0421, B:71:0x0427, B:74:0x0430, B:77:0x0435, B:79:0x0439, B:81:0x044a, B:83:0x0450, B:85:0x0454, B:93:0x0464, B:95:0x046a, B:97:0x0472, B:99:0x047c, B:101:0x0485, B:104:0x048c, B:107:0x0493, B:110:0x0499, B:112:0x04ad, B:113:0x04b2, B:115:0x04e4, B:117:0x04f2, B:118:0x0524, B:119:0x053d, B:121:0x054d, B:122:0x0575, B:124:0x0593, B:127:0x059a, B:129:0x059f, B:130:0x05a4, B:131:0x0570, B:132:0x0528, B:134:0x052c, B:135:0x04b0, B:141:0x05b0, B:143:0x05b4, B:146:0x05b9, B:148:0x05bd, B:150:0x05ce, B:152:0x05d4, B:154:0x05d8, B:162:0x05e8, B:164:0x05ee, B:166:0x05f6, B:168:0x0600, B:170:0x0609, B:173:0x0610, B:175:0x0612, B:177:0x0616, B:179:0x0636, B:180:0x064e, B:181:0x0653, B:183:0x0678, B:186:0x067d, B:187:0x0680, B:189:0x068f, B:192:0x06ad, B:194:0x06a9, B:198:0x040a, B:200:0x00c5, B:202:0x00c9, B:204:0x00d1, B:205:0x00d6, B:206:0x00d9, B:209:0x00e3, B:213:0x00f4, B:215:0x00f8, B:217:0x00ff, B:220:0x0102, B:223:0x010e, B:224:0x011e, B:227:0x0132, B:229:0x0144, B:232:0x0158, B:236:0x0168, B:238:0x0170, B:239:0x0175, B:242:0x019e, B:244:0x01a6, B:245:0x01ab, B:246:0x01ae, B:249:0x01b8, B:253:0x01c9, B:255:0x01cd, B:257:0x01d4, B:260:0x01d7, B:263:0x01e3, B:264:0x01f3, B:267:0x020d, B:269:0x021f, B:272:0x0239, B:277:0x024a, B:279:0x0252, B:280:0x0257, B:281:0x025a, B:284:0x0264, B:288:0x0275, B:290:0x0279, B:292:0x0280, B:295:0x0283, B:298:0x028f, B:299:0x029f, B:302:0x02b5, B:304:0x02c7, B:307:0x02dd, B:311:0x02ed, B:313:0x02f5, B:314:0x02fa, B:315:0x02fd, B:318:0x0307, B:322:0x0318, B:324:0x031c, B:326:0x0323, B:329:0x0326, B:332:0x0332, B:333:0x0342, B:336:0x0353, B:338:0x0365, B:341:0x0376, B:344:0x0384, B:347:0x038d, B:349:0x0397, B:350:0x039e, B:353:0x03aa, B:354:0x03ba, B:357:0x03c7, B:359:0x03d9, B:362:0x03e6), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0678 A[Catch: Exception -> 0x0010, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0013, B:10:0x0023, B:12:0x0027, B:15:0x002c, B:17:0x0030, B:19:0x0041, B:21:0x0047, B:23:0x004b, B:31:0x005b, B:33:0x0061, B:35:0x0069, B:37:0x0073, B:39:0x007c, B:42:0x0083, B:44:0x0085, B:47:0x008b, B:49:0x008f, B:51:0x00ab, B:52:0x03f2, B:54:0x03f6, B:59:0x0401, B:63:0x0415, B:66:0x041b, B:69:0x0421, B:71:0x0427, B:74:0x0430, B:77:0x0435, B:79:0x0439, B:81:0x044a, B:83:0x0450, B:85:0x0454, B:93:0x0464, B:95:0x046a, B:97:0x0472, B:99:0x047c, B:101:0x0485, B:104:0x048c, B:107:0x0493, B:110:0x0499, B:112:0x04ad, B:113:0x04b2, B:115:0x04e4, B:117:0x04f2, B:118:0x0524, B:119:0x053d, B:121:0x054d, B:122:0x0575, B:124:0x0593, B:127:0x059a, B:129:0x059f, B:130:0x05a4, B:131:0x0570, B:132:0x0528, B:134:0x052c, B:135:0x04b0, B:141:0x05b0, B:143:0x05b4, B:146:0x05b9, B:148:0x05bd, B:150:0x05ce, B:152:0x05d4, B:154:0x05d8, B:162:0x05e8, B:164:0x05ee, B:166:0x05f6, B:168:0x0600, B:170:0x0609, B:173:0x0610, B:175:0x0612, B:177:0x0616, B:179:0x0636, B:180:0x064e, B:181:0x0653, B:183:0x0678, B:186:0x067d, B:187:0x0680, B:189:0x068f, B:192:0x06ad, B:194:0x06a9, B:198:0x040a, B:200:0x00c5, B:202:0x00c9, B:204:0x00d1, B:205:0x00d6, B:206:0x00d9, B:209:0x00e3, B:213:0x00f4, B:215:0x00f8, B:217:0x00ff, B:220:0x0102, B:223:0x010e, B:224:0x011e, B:227:0x0132, B:229:0x0144, B:232:0x0158, B:236:0x0168, B:238:0x0170, B:239:0x0175, B:242:0x019e, B:244:0x01a6, B:245:0x01ab, B:246:0x01ae, B:249:0x01b8, B:253:0x01c9, B:255:0x01cd, B:257:0x01d4, B:260:0x01d7, B:263:0x01e3, B:264:0x01f3, B:267:0x020d, B:269:0x021f, B:272:0x0239, B:277:0x024a, B:279:0x0252, B:280:0x0257, B:281:0x025a, B:284:0x0264, B:288:0x0275, B:290:0x0279, B:292:0x0280, B:295:0x0283, B:298:0x028f, B:299:0x029f, B:302:0x02b5, B:304:0x02c7, B:307:0x02dd, B:311:0x02ed, B:313:0x02f5, B:314:0x02fa, B:315:0x02fd, B:318:0x0307, B:322:0x0318, B:324:0x031c, B:326:0x0323, B:329:0x0326, B:332:0x0332, B:333:0x0342, B:336:0x0353, B:338:0x0365, B:341:0x0376, B:344:0x0384, B:347:0x038d, B:349:0x0397, B:350:0x039e, B:353:0x03aa, B:354:0x03ba, B:357:0x03c7, B:359:0x03d9, B:362:0x03e6), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:189:0x068f A[Catch: Exception -> 0x0010, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0013, B:10:0x0023, B:12:0x0027, B:15:0x002c, B:17:0x0030, B:19:0x0041, B:21:0x0047, B:23:0x004b, B:31:0x005b, B:33:0x0061, B:35:0x0069, B:37:0x0073, B:39:0x007c, B:42:0x0083, B:44:0x0085, B:47:0x008b, B:49:0x008f, B:51:0x00ab, B:52:0x03f2, B:54:0x03f6, B:59:0x0401, B:63:0x0415, B:66:0x041b, B:69:0x0421, B:71:0x0427, B:74:0x0430, B:77:0x0435, B:79:0x0439, B:81:0x044a, B:83:0x0450, B:85:0x0454, B:93:0x0464, B:95:0x046a, B:97:0x0472, B:99:0x047c, B:101:0x0485, B:104:0x048c, B:107:0x0493, B:110:0x0499, B:112:0x04ad, B:113:0x04b2, B:115:0x04e4, B:117:0x04f2, B:118:0x0524, B:119:0x053d, B:121:0x054d, B:122:0x0575, B:124:0x0593, B:127:0x059a, B:129:0x059f, B:130:0x05a4, B:131:0x0570, B:132:0x0528, B:134:0x052c, B:135:0x04b0, B:141:0x05b0, B:143:0x05b4, B:146:0x05b9, B:148:0x05bd, B:150:0x05ce, B:152:0x05d4, B:154:0x05d8, B:162:0x05e8, B:164:0x05ee, B:166:0x05f6, B:168:0x0600, B:170:0x0609, B:173:0x0610, B:175:0x0612, B:177:0x0616, B:179:0x0636, B:180:0x064e, B:181:0x0653, B:183:0x0678, B:186:0x067d, B:187:0x0680, B:189:0x068f, B:192:0x06ad, B:194:0x06a9, B:198:0x040a, B:200:0x00c5, B:202:0x00c9, B:204:0x00d1, B:205:0x00d6, B:206:0x00d9, B:209:0x00e3, B:213:0x00f4, B:215:0x00f8, B:217:0x00ff, B:220:0x0102, B:223:0x010e, B:224:0x011e, B:227:0x0132, B:229:0x0144, B:232:0x0158, B:236:0x0168, B:238:0x0170, B:239:0x0175, B:242:0x019e, B:244:0x01a6, B:245:0x01ab, B:246:0x01ae, B:249:0x01b8, B:253:0x01c9, B:255:0x01cd, B:257:0x01d4, B:260:0x01d7, B:263:0x01e3, B:264:0x01f3, B:267:0x020d, B:269:0x021f, B:272:0x0239, B:277:0x024a, B:279:0x0252, B:280:0x0257, B:281:0x025a, B:284:0x0264, B:288:0x0275, B:290:0x0279, B:292:0x0280, B:295:0x0283, B:298:0x028f, B:299:0x029f, B:302:0x02b5, B:304:0x02c7, B:307:0x02dd, B:311:0x02ed, B:313:0x02f5, B:314:0x02fa, B:315:0x02fd, B:318:0x0307, B:322:0x0318, B:324:0x031c, B:326:0x0323, B:329:0x0326, B:332:0x0332, B:333:0x0342, B:336:0x0353, B:338:0x0365, B:341:0x0376, B:344:0x0384, B:347:0x038d, B:349:0x0397, B:350:0x039e, B:353:0x03aa, B:354:0x03ba, B:357:0x03c7, B:359:0x03d9, B:362:0x03e6), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0419 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:73:0x042d  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0434 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0435 A[Catch: Exception -> 0x0010, TryCatch #0 {Exception -> 0x0010, blocks: (B:2:0x0000, B:4:0x0006, B:7:0x0013, B:10:0x0023, B:12:0x0027, B:15:0x002c, B:17:0x0030, B:19:0x0041, B:21:0x0047, B:23:0x004b, B:31:0x005b, B:33:0x0061, B:35:0x0069, B:37:0x0073, B:39:0x007c, B:42:0x0083, B:44:0x0085, B:47:0x008b, B:49:0x008f, B:51:0x00ab, B:52:0x03f2, B:54:0x03f6, B:59:0x0401, B:63:0x0415, B:66:0x041b, B:69:0x0421, B:71:0x0427, B:74:0x0430, B:77:0x0435, B:79:0x0439, B:81:0x044a, B:83:0x0450, B:85:0x0454, B:93:0x0464, B:95:0x046a, B:97:0x0472, B:99:0x047c, B:101:0x0485, B:104:0x048c, B:107:0x0493, B:110:0x0499, B:112:0x04ad, B:113:0x04b2, B:115:0x04e4, B:117:0x04f2, B:118:0x0524, B:119:0x053d, B:121:0x054d, B:122:0x0575, B:124:0x0593, B:127:0x059a, B:129:0x059f, B:130:0x05a4, B:131:0x0570, B:132:0x0528, B:134:0x052c, B:135:0x04b0, B:141:0x05b0, B:143:0x05b4, B:146:0x05b9, B:148:0x05bd, B:150:0x05ce, B:152:0x05d4, B:154:0x05d8, B:162:0x05e8, B:164:0x05ee, B:166:0x05f6, B:168:0x0600, B:170:0x0609, B:173:0x0610, B:175:0x0612, B:177:0x0616, B:179:0x0636, B:180:0x064e, B:181:0x0653, B:183:0x0678, B:186:0x067d, B:187:0x0680, B:189:0x068f, B:192:0x06ad, B:194:0x06a9, B:198:0x040a, B:200:0x00c5, B:202:0x00c9, B:204:0x00d1, B:205:0x00d6, B:206:0x00d9, B:209:0x00e3, B:213:0x00f4, B:215:0x00f8, B:217:0x00ff, B:220:0x0102, B:223:0x010e, B:224:0x011e, B:227:0x0132, B:229:0x0144, B:232:0x0158, B:236:0x0168, B:238:0x0170, B:239:0x0175, B:242:0x019e, B:244:0x01a6, B:245:0x01ab, B:246:0x01ae, B:249:0x01b8, B:253:0x01c9, B:255:0x01cd, B:257:0x01d4, B:260:0x01d7, B:263:0x01e3, B:264:0x01f3, B:267:0x020d, B:269:0x021f, B:272:0x0239, B:277:0x024a, B:279:0x0252, B:280:0x0257, B:281:0x025a, B:284:0x0264, B:288:0x0275, B:290:0x0279, B:292:0x0280, B:295:0x0283, B:298:0x028f, B:299:0x029f, B:302:0x02b5, B:304:0x02c7, B:307:0x02dd, B:311:0x02ed, B:313:0x02f5, B:314:0x02fa, B:315:0x02fd, B:318:0x0307, B:322:0x0318, B:324:0x031c, B:326:0x0323, B:329:0x0326, B:332:0x0332, B:333:0x0342, B:336:0x0353, B:338:0x0365, B:341:0x0376, B:344:0x0384, B:347:0x038d, B:349:0x0397, B:350:0x039e, B:353:0x03aa, B:354:0x03ba, B:357:0x03c7, B:359:0x03d9, B:362:0x03e6), top: B:1:0x0000 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z21;
            boolean z22;
            boolean z23;
            int i11;
            boolean z24;
            boolean z25;
            C25630b c25630b;
            c cVar;
            boolean z26;
            boolean z27;
            int i12;
            boolean z28;
            C25630b c25630b2;
            c cVar2;
            boolean z29;
            boolean z31;
            C25630b c25630b3;
            c cVar3;
            try {
                if (!m141428u()) {
                    m141409f(this.f130801p.m124151g0());
                    return;
                }
                boolean z32 = false;
                this.f130804s = false;
                int m120896Eb = AbstractC23309i.m120896Eb();
                if (this.f130792Q && m120896Eb == 1 && this.f130782G == null) {
                    if (this.f130793R) {
                        return;
                    }
                    o oVar = this.f130788M;
                    if (oVar != null) {
                        int m141402a = oVar.m141402a();
                        C23528a c23528a = new C23528a(MainApplication.getAppContext());
                        if (!this.f130808w && (cVar3 = this.f130791P) != c.INBOX && cVar3 != c.MESSAGING && this.f130782G == null) {
                            z31 = true;
                        } else {
                            z31 = false;
                        }
                        if (m141402a != 1 && m141402a != 2) {
                            if (m141402a == 3 && z31 && (c25630b3 = this.f130788M.f130765e) != null) {
                                this.f130808w = true;
                                C28023b6.m141232R0(this, c25630b3, c23528a);
                            }
                        }
                    }
                    if (this.f130782G != null) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    this.f130793R = z29;
                }
                if (this.f130792Q && m120896Eb == 1 && this.f130782G != null) {
                    AbstractC23170p.m119345c(m141427q(), this.f130782G);
                    this.f130801p.mo6855H(m141427q());
                    if (C28023b6.m141250h0().m141356l()) {
                        AbstractC23170p.m119345c(m141426p(), this.f130782G);
                        C28023b6.m141250h0().m141358l2(this.f130801p, m141426p(), this.f130807v);
                    }
                } else {
                    int i13 = this.f130777B;
                    if (i13 == 3) {
                        if (this.f130778C.isEmpty()) {
                            m141420t();
                        } else {
                            Bitmap[] bitmapArr = new Bitmap[3];
                            for (int i14 = 0; i14 < this.f130778C.size() && i14 < 3; i14++) {
                                bitmapArr[i14] = (Bitmap) this.f130778C.get(i14);
                            }
                            boolean z33 = false;
                            for (int i15 = 0; i15 < 3; i15++) {
                                if (bitmapArr[i15] == null) {
                                    bitmapArr[i15] = m141414k();
                                    z33 = true;
                                }
                            }
                            if (C28023b6.m141250h0().m141356l()) {
                                if (z33) {
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141415l(), this.f130807v);
                                } else {
                                    Bitmap m141426p = m141426p();
                                    Bitmap bitmap = bitmapArr[0];
                                    Bitmap bitmap2 = bitmapArr[1];
                                    Bitmap bitmap3 = bitmapArr[2];
                                    if (this.f130791P == c.MESSAGING) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    AbstractC23170p.m119352j(m141426p, bitmap, bitmap2, bitmap3, 1, z22);
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141426p(), this.f130807v);
                                }
                            }
                            Bitmap m141427q = m141427q();
                            Bitmap bitmap4 = bitmapArr[0];
                            Bitmap bitmap5 = bitmapArr[1];
                            Bitmap bitmap6 = bitmapArr[2];
                            if (this.f130791P == c.MESSAGING) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            AbstractC23170p.m119352j(m141427q, bitmap4, bitmap5, bitmap6, 0, z21);
                            this.f130801p.mo6855H(m141427q());
                        }
                    } else if (i13 == 1) {
                        if (this.f130778C.isEmpty()) {
                            m141420t();
                        } else {
                            C28023b6.m141250h0().m141358l2(this.f130801p, (Bitmap) this.f130778C.get(0), this.f130807v);
                            this.f130801p.mo6855H(C23999j.m125743s2((Bitmap) this.f130778C.get(0)));
                        }
                    } else if (i13 == 5) {
                        if (this.f130778C.isEmpty()) {
                            m141420t();
                        } else {
                            Bitmap[] bitmapArr2 = new Bitmap[3];
                            for (int i16 = 0; i16 < this.f130778C.size() && i16 < 3; i16++) {
                                bitmapArr2[i16] = (Bitmap) this.f130778C.get(i16);
                            }
                            boolean z34 = false;
                            for (int i17 = 0; i17 < 3; i17++) {
                                if (bitmapArr2[i17] == null) {
                                    bitmapArr2[i17] = m141414k();
                                    z34 = true;
                                }
                            }
                            if (C28023b6.m141250h0().m141356l()) {
                                if (z34) {
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141415l(), this.f130807v);
                                } else {
                                    Bitmap m141426p2 = m141426p();
                                    Bitmap bitmap7 = bitmapArr2[0];
                                    Bitmap bitmap8 = bitmapArr2[1];
                                    Bitmap bitmap9 = bitmapArr2[2];
                                    Bitmap m141416m = m141416m();
                                    String str = this.f130779D;
                                    if (this.f130791P == c.MESSAGING) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    AbstractC23170p.m119349g(m141426p2, bitmap7, bitmap8, bitmap9, m141416m, str, 1, z19);
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141426p(), this.f130807v);
                                }
                            }
                            Bitmap m141427q2 = m141427q();
                            Bitmap bitmap10 = bitmapArr2[0];
                            Bitmap bitmap11 = bitmapArr2[1];
                            Bitmap bitmap12 = bitmapArr2[2];
                            Bitmap m141416m2 = m141416m();
                            String str2 = this.f130779D;
                            if (this.f130791P == c.MESSAGING) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            AbstractC23170p.m119349g(m141427q2, bitmap10, bitmap11, bitmap12, m141416m2, str2, 0, z18);
                            this.f130801p.mo6855H(m141427q());
                        }
                    } else if (i13 == 4) {
                        if (this.f130778C.isEmpty()) {
                            m141420t();
                        } else {
                            Bitmap[] bitmapArr3 = new Bitmap[4];
                            for (int i18 = 0; i18 < this.f130778C.size() && i18 < 4; i18++) {
                                bitmapArr3[i18] = (Bitmap) this.f130778C.get(i18);
                            }
                            boolean z35 = false;
                            for (int i19 = 0; i19 < 4; i19++) {
                                if (bitmapArr3[i19] == null) {
                                    bitmapArr3[i19] = m141414k();
                                    z35 = true;
                                }
                            }
                            if (C28023b6.m141250h0().m141356l()) {
                                if (z35) {
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141415l(), this.f130807v);
                                } else {
                                    Bitmap m141426p3 = m141426p();
                                    Bitmap bitmap13 = bitmapArr3[0];
                                    Bitmap bitmap14 = bitmapArr3[1];
                                    Bitmap bitmap15 = bitmapArr3[2];
                                    Bitmap bitmap16 = bitmapArr3[3];
                                    if (this.f130791P == c.MESSAGING) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    AbstractC23170p.m119348f(m141426p3, bitmap13, bitmap14, bitmap15, bitmap16, 1, z17);
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141426p(), this.f130807v);
                                }
                            }
                            Bitmap m141427q3 = m141427q();
                            Bitmap bitmap17 = bitmapArr3[0];
                            Bitmap bitmap18 = bitmapArr3[1];
                            Bitmap bitmap19 = bitmapArr3[2];
                            Bitmap bitmap20 = bitmapArr3[3];
                            if (this.f130791P == c.MESSAGING) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            AbstractC23170p.m119348f(m141427q3, bitmap17, bitmap18, bitmap19, bitmap20, 0, z16);
                            this.f130801p.mo6855H(m141427q());
                        }
                    } else if (i13 == 2) {
                        if (this.f130778C.isEmpty()) {
                            m141420t();
                        } else {
                            Bitmap[] bitmapArr4 = new Bitmap[2];
                            for (int i21 = 0; i21 < this.f130778C.size() && i21 < 2; i21++) {
                                bitmapArr4[i21] = (Bitmap) this.f130778C.get(i21);
                            }
                            boolean z36 = false;
                            for (int i22 = 0; i22 < 2; i22++) {
                                if (bitmapArr4[i22] == null) {
                                    bitmapArr4[i22] = m141414k();
                                    z36 = true;
                                }
                            }
                            if (C28023b6.m141250h0().m141356l()) {
                                if (z36) {
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141415l(), this.f130807v);
                                } else {
                                    Bitmap m141426p4 = m141426p();
                                    Bitmap bitmap21 = bitmapArr4[0];
                                    Bitmap bitmap22 = bitmapArr4[1];
                                    if (this.f130791P == c.MESSAGING) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    AbstractC23170p.m119353k(m141426p4, bitmap21, bitmap22, 1, z15);
                                    C28023b6.m141250h0().m141358l2(this.f130801p, m141426p(), this.f130807v);
                                }
                            }
                            Bitmap m141427q4 = m141427q();
                            Bitmap bitmap23 = bitmapArr4[0];
                            Bitmap bitmap24 = bitmapArr4[1];
                            if (this.f130791P == c.MESSAGING) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            AbstractC23170p.m119353k(m141427q4, bitmap23, bitmap24, 0, z14);
                            this.f130801p.mo6855H(m141427q());
                        }
                    } else if (!this.f130778C.isEmpty()) {
                        Bitmap bitmap25 = (Bitmap) this.f130778C.get(0);
                        if (bitmap25 == null) {
                            bitmap25 = m141414k();
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (C28023b6.m141250h0().m141356l()) {
                            if (z11) {
                                C28023b6.m141250h0().m141358l2(this.f130801p, m141415l(), this.f130807v);
                            } else {
                                Bitmap m141426p5 = m141426p();
                                if (this.f130791P == c.MESSAGING) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                AbstractC23170p.m119351i(m141426p5, bitmap25, z13);
                                C28023b6.m141250h0().m141358l2(this.f130801p, m141426p(), this.f130807v);
                            }
                        }
                        Bitmap m141427q5 = m141427q();
                        if (this.f130791P == c.MESSAGING) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        AbstractC23170p.m119351i(m141427q5, bitmap25, z12);
                        this.f130801p.mo6855H(m141427q());
                    }
                }
                o oVar2 = this.f130788M;
                if (oVar2 != null) {
                    int m141402a2 = oVar2.m141402a();
                    if (m141402a2 != 1 && m141402a2 != 2) {
                        if (m141402a2 == 3 && this.f130788M.f130765e == null) {
                            z23 = false;
                            if (this.f130792Q && z23) {
                                if (this.f130790O && m120896Eb == 3 && Build.VERSION.SDK_INT < 31) {
                                    if (AbstractC23309i.m122379s2() != 1) {
                                        z26 = true;
                                    } else {
                                        z26 = false;
                                    }
                                    if (!this.f130793R) {
                                        return;
                                    }
                                    o oVar3 = this.f130788M;
                                    if (oVar3 != null) {
                                        int m141402a3 = oVar3.m141402a();
                                        C23528a c23528a2 = new C23528a(MainApplication.getAppContext());
                                        if (!this.f130808w && (cVar2 = this.f130791P) != c.INBOX && cVar2 != c.MESSAGING && this.f130782G == null) {
                                            z28 = true;
                                        } else {
                                            z28 = false;
                                        }
                                        if (m141402a3 != 1 && m141402a3 != 2) {
                                            if (m141402a3 == 3 && z28 && (c25630b2 = this.f130788M.f130765e) != null) {
                                                this.f130808w = true;
                                                C28023b6.m141232R0(this, c25630b2, c23528a2);
                                            }
                                        }
                                    }
                                    Bitmap bitmap26 = this.f130782G;
                                    if (bitmap26 != null) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    this.f130793R = z27;
                                    if (!z27) {
                                        bitmap26 = null;
                                    }
                                    if (!this.f130790O) {
                                        bitmap26 = null;
                                    }
                                    Context appContext = MainApplication.getAppContext();
                                    String packageName = appContext.getPackageName();
                                    if (C24913b.m129583c().mo129582b(appContext) == 0) {
                                        i12 = AbstractC7409c0.notification_photo_preview_light;
                                    } else {
                                        i12 = AbstractC7409c0.notification_photo_preview_dark;
                                    }
                                    RemoteViews remoteViews = new RemoteViews(packageName, i12);
                                    AbstractC1364q.k kVar = new AbstractC1364q.k();
                                    this.f130801p.m6869V(null);
                                    SpannableString spannableString = new SpannableString(this.f130785J);
                                    spannableString.setSpan(new StyleSpan(1), 0, this.f130787L.length(), 33);
                                    remoteViews.setTextViewText(AbstractC6918a0.contentText, spannableString);
                                    int i23 = 8;
                                    remoteViews.setViewVisibility(AbstractC6918a0.iconExpand, 8);
                                    if (bitmap26 != null) {
                                        this.f130794S = true;
                                        remoteViews.setImageViewBitmap(AbstractC6918a0.picture, bitmap26);
                                        remoteViews.setViewVisibility(AbstractC6918a0.iconLoading, 8);
                                        if (z26) {
                                            AbstractC1364q.c cVar4 = new AbstractC1364q.c();
                                            cVar4.m6818i(bitmap26).m6817h(m141427q()).m6819j(this.f130784I).m6820k(spannableString);
                                            this.f130801p.m6896x(null);
                                            this.f130801p.mo6855H(m141427q());
                                            this.f130801p.m6869V(cVar4);
                                            remoteViews.setViewVisibility(AbstractC6918a0.iconExpand, 0);
                                        }
                                        kVar.m6924e(bitmap26);
                                    } else if (!this.f130794S) {
                                        remoteViews.setImageViewResource(AbstractC6918a0.picture, AbstractC16801x.cLine);
                                        remoteViews.setViewVisibility(AbstractC6918a0.iconLoading, 0);
                                        this.f130801p.m6896x(remoteViews);
                                    }
                                    this.f130801p.m6881g(kVar);
                                    remoteViews.setTextViewText(AbstractC6918a0.contentTitle, this.f130784I);
                                    int i24 = this.f130789N;
                                    if (i24 > 0) {
                                        this.f130789N = Math.min(i24, 10);
                                        remoteViews.setViewVisibility(AbstractC6918a0.txtPictureCount, 0);
                                        remoteViews.setTextViewText(AbstractC6918a0.txtPictureCount, String.format("%d+", Integer.valueOf(this.f130789N)));
                                    } else {
                                        remoteViews.setViewVisibility(AbstractC6918a0.txtPictureCount, 8);
                                    }
                                    remoteViews.setTextViewText(AbstractC6918a0.contentTime, new SimpleDateFormat("HH:mm").format(Calendar.getInstance().getTime()));
                                    int i25 = AbstractC6918a0.iconVideo;
                                    o oVar4 = this.f130788M;
                                    if (oVar4 != null && oVar4.m141402a() == 2) {
                                        i23 = 0;
                                    }
                                    remoteViews.setViewVisibility(i25, i23);
                                    if (!z26) {
                                        this.f130801p.m6896x(remoteViews);
                                    }
                                    this.f130801p.m6897y(remoteViews);
                                    this.f130801p.m6898z(remoteViews);
                                }
                                if (m120896Eb == 2) {
                                    if (this.f130782G == null) {
                                        if (this.f130793R) {
                                            return;
                                        }
                                        o oVar5 = this.f130788M;
                                        if (oVar5 != null) {
                                            int m141402a4 = oVar5.m141402a();
                                            C23528a c23528a3 = new C23528a(MainApplication.getAppContext());
                                            if (!this.f130808w && (cVar = this.f130791P) != c.INBOX && cVar != c.MESSAGING && this.f130782G == null) {
                                                z25 = true;
                                            } else {
                                                z25 = false;
                                            }
                                            if (m141402a4 != 1 && m141402a4 != 2) {
                                                if (m141402a4 == 3 && z25 && (c25630b = this.f130788M.f130765e) != null) {
                                                    this.f130808w = true;
                                                    C28023b6.m141232R0(this, c25630b, c23528a3);
                                                }
                                            }
                                        }
                                        if (this.f130782G != null) {
                                            z24 = true;
                                        } else {
                                            z24 = false;
                                        }
                                        this.f130793R = z24;
                                    }
                                    if (this.f130782G != null) {
                                        AbstractC1364q.c cVar5 = new AbstractC1364q.c(this.f130801p);
                                        cVar5.m6818i(this.f130782G);
                                        cVar5.m6819j(this.f130784I);
                                        cVar5.m6820k(this.f130785J);
                                        if (C28023b6.m141250h0().m141356l()) {
                                            AbstractC23170p.m119345c(m141426p(), this.f130782G);
                                            C28023b6.m141250h0().m141358l2(this.f130801p, m141426p(), this.f130807v);
                                        }
                                        this.f130801p.m6869V(cVar5);
                                    }
                                }
                            }
                            this.f130798W = System.currentTimeMillis();
                            m141422x(this.f130803r, this);
                            this.f130801p.m124160q0(this.f130795T);
                            this.f130801p.m124161r0(this.f130809x);
                            this.f130801p.m124162s0(this.f130776A);
                            i11 = this.f130810y;
                            if (i11 != -1) {
                                C23750d c23750d = this.f130801p;
                                if (i11 == 1) {
                                    z32 = true;
                                }
                                c23750d.mo6861N(z32);
                            }
                            m141412i();
                            this.f130801p.m124147b0();
                            m141423y();
                            if (this.f130807v != null) {
                                int m102745D = C19636i1.m102737w().m102745D();
                                boolean m102765V = C19636i1.m102737w().m102765V(this.f130807v.mo2478b());
                                if ((m102745D == 0 && m102765V) || this.f130811z) {
                                    C28023b6.m141262r2();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    z23 = !TextUtils.isEmpty(this.f130788M.f130762b);
                    if (this.f130792Q) {
                        if (this.f130790O) {
                            if (AbstractC23309i.m122379s2() != 1) {
                            }
                            if (!this.f130793R) {
                            }
                        }
                        if (m120896Eb == 2) {
                        }
                    }
                    this.f130798W = System.currentTimeMillis();
                    m141422x(this.f130803r, this);
                    this.f130801p.m124160q0(this.f130795T);
                    this.f130801p.m124161r0(this.f130809x);
                    this.f130801p.m124162s0(this.f130776A);
                    i11 = this.f130810y;
                    if (i11 != -1) {
                    }
                    m141412i();
                    this.f130801p.m124147b0();
                    m141423y();
                    if (this.f130807v != null) {
                    }
                }
                z23 = true;
                if (this.f130792Q) {
                }
                this.f130798W = System.currentTimeMillis();
                m141422x(this.f130803r, this);
                this.f130801p.m124160q0(this.f130795T);
                this.f130801p.m124161r0(this.f130809x);
                this.f130801p.m124162s0(this.f130776A);
                i11 = this.f130810y;
                if (i11 != -1) {
                }
                m141412i();
                this.f130801p.m124147b0();
                m141423y();
                if (this.f130807v != null) {
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f(C28023b6.f130674r, e11);
            }
        }

        /* renamed from: u */
        boolean m141428u() {
            boolean z11 = false;
            if (this.f130805t) {
                return false;
            }
            if (!this.f130804s && !m141408e(this)) {
                return false;
            }
            if (C28023b6.m141250h0().m141348h1(this.f130801p.m124152h0()) && this.f130807v != null && C11318b.m60507e().m60515j(this.f130807v.mo2478b())) {
                z11 = true;
            }
            return !z11;
        }
    }

    C28023b6() {
        m141275C0();
    }

    /* renamed from: A */
    public static void m141222A() {
        try {
            AbstractC23775p0.m124198c("suggest_friend", String.valueOf(10));
            AbstractC23775p0.m124198c("friend_request", String.valueOf(10));
            AbstractC23775p0.m124198c("friend_accept", String.valueOf(10));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E0 */
    public static boolean m141223E0() {
        try {
            if (!AbstractC23165o5.m119333b()) {
                return true;
            }
            InterfaceC27218a m57061E5 = ZaloLauncherActivity.m57061E5();
            if (!AbstractC23304d.f113330T0 && m57061E5 != null && m57061E5.mo35579p() != null) {
                if (!m57061E5.mo35579p().m93048Y0()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return true;
        }
    }

    /* renamed from: G0 */
    private boolean m141224G0(ContactProfile contactProfile) {
        if (!AbstractC21935u.m114515E(contactProfile.f42434r) && !C0804b.m2025g().m2033i(contactProfile.f42434r)) {
            return false;
        }
        return true;
    }

    /* renamed from: L0 */
    public static boolean m141225L0(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        if (Build.VERSION.SDK_INT >= 30) {
            bubbleMetadata = notification.getBubbleMetadata();
            if (bubbleMetadata == null || (notification.flags & 8) == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: N0 */
    public static /* synthetic */ void m141227N0(ContactProfile contactProfile, q qVar) {
        Bitmap m141407d;
        try {
            if (contactProfile.m40374K0()) {
                m141407d = q.m141406c();
            } else {
                m141407d = q.m141407d();
            }
            qVar.f130778C.add(m141407d);
            qVar.f130810y = 1;
            q.m141403A(qVar, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: O0 */
    public static void m141228O0(q qVar, String str, C23528a c23528a, int i11) {
        AbstractC20110a.m104535d("loadBigImage call: %s", str);
        if (AbstractC23309i.m120896Eb() == 0) {
            AbstractC20110a.m104535d("loadBigImage skip by server setting", new Object[0]);
            return;
        }
        try {
            C3979l m123605k = c23528a.m123605k(str, i11, EnumC25629a.DEFAULT);
            if (m123605k != null && m123605k.m18839c() != null && !m123605k.m18839c().isRecycled()) {
                AbstractC23170p.m119345c(qVar.m141425o(), m123605k.m18839c());
            } else {
                d dVar = new d(qVar);
                dVar.m125611h1(99981, 0);
                ((C23528a) c23528a.m123612r(dVar.f130716l1)).m123584H(str, true, true, i11, 0, dVar);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: O1 */
    private void m141229O1(String str, String str2, String str3, PendingIntent pendingIntent, PendingIntent pendingIntent2, ContactProfile contactProfile, String str4, String str5, boolean z11, boolean z12) {
        try {
            Context applicationContext = MainApplication.getAppContext().getApplicationContext();
            int m118423d = AbstractC23088h5.m118423d(str4, str5);
            C23750d c23750d = new C23750d(applicationContext);
            c23750d.m124165v0(str4);
            c23750d.m124164u0(str5);
            c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            c23750d.m124160q0(z11);
            c23750d.m124161r0(z12);
            m141256k2(c23750d);
            c23750d.m6870W(str3).m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light)).m6865R(true).mo6860M(false).m6890r(applicationContext.getResources().getColor(AbstractC16801x.notification_app_icon_background_color)).m6886n(true).mo6895w(str).m6893u(pendingIntent).m6850B(pendingIntent2).mo6894v(str2);
            if (str2.length() > 20) {
                AbstractC1364q.d dVar = new AbstractC1364q.d();
                dVar.m6828h(str2);
                c23750d.m6869V(dVar);
            }
            q qVar = new q();
            qVar.f130802q = this.f130683a;
            qVar.f130803r = m118423d;
            qVar.f130807v = contactProfile;
            qVar.f130801p = c23750d;
            qVar.f130785J = str2;
            qVar.f130792Q = true;
            qVar.f130790O = false;
            qVar.f130795T = z11;
            qVar.f130809x = z12;
            qVar.f130811z = true;
            if (!TextUtils.isEmpty(str)) {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
                qVar.f130784I = spannableString;
            }
            m141231Q0(contactProfile, qVar);
            q.m141403A(qVar, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    /* renamed from: P0 */
    private void m141230P0(q qVar, String str, C23528a c23528a, ContactProfile contactProfile) {
        AbstractC20110a.m104535d("%s loadImage call: %s", f130674r, str);
        C3979l m123605k = c23528a.m123605k(str, 0, EnumC25629a.DEFAULT);
        if (m123605k != null && m123605k.m18839c() != null) {
            qVar.f130778C.add(m123605k.m18839c());
            return;
        }
        f fVar = new f(qVar);
        fVar.m125611h1(26005, 0);
        ((C23528a) c23528a.m123612r(fVar.f130722l1)).m123584H(str, true, true, 0, 0, fVar);
    }

    /* renamed from: Q0 */
    private void m141231Q0(ContactProfile contactProfile, q qVar) {
        C31973j5 c31973j5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C23528a c23528a = new C23528a(MainApplication.getAppContext().getApplicationContext());
        if (contactProfile != null && !AbstractC21935u.m114550q(contactProfile.mo2478b())) {
            List list = null;
            if (contactProfile.m40374K0()) {
                c31973j5 = contactProfile.m40389U();
            } else {
                c31973j5 = null;
            }
            if (c31973j5 != null) {
                list = c31973j5.m153762h();
            }
            if (c31973j5 != null && c31973j5.m153786t0()) {
                qVar.m141424z(0);
                m141230P0(qVar, c31973j5.m153756e(), c23528a, contactProfile);
                return;
            }
            if (list != null && list.size() > 0) {
                String str9 = "";
                if (list.size() == 1) {
                    qVar.m141424z(1);
                    ContactProfile m141809c = C28203u6.f131407a.m141809c((String) list.get(0));
                    if (m141809c != null) {
                        str9 = m141809c.f42446v;
                    }
                    m141230P0(qVar, str9, c23528a, contactProfile);
                    return;
                }
                if (list.size() == 2) {
                    qVar.m141424z(2);
                    C28203u6 c28203u6 = C28203u6.f131407a;
                    ContactProfile m141809c2 = c28203u6.m141809c((String) list.get(0));
                    ContactProfile m141809c3 = c28203u6.m141809c((String) list.get(1));
                    if (m141809c2 == null) {
                        str8 = "";
                    } else {
                        str8 = m141809c2.f42446v;
                    }
                    m141230P0(qVar, str8, c23528a, contactProfile);
                    if (m141809c3 != null) {
                        str9 = m141809c3.f42446v;
                    }
                    m141230P0(qVar, str9, c23528a, contactProfile);
                    return;
                }
                if (list.size() == 3) {
                    qVar.m141424z(3);
                    C28203u6 c28203u62 = C28203u6.f131407a;
                    ContactProfile m141809c4 = c28203u62.m141809c((String) list.get(0));
                    ContactProfile m141809c5 = c28203u62.m141809c((String) list.get(1));
                    ContactProfile m141809c6 = c28203u62.m141809c((String) list.get(2));
                    if (m141809c4 == null) {
                        str6 = "";
                    } else {
                        str6 = m141809c4.f42446v;
                    }
                    m141230P0(qVar, str6, c23528a, contactProfile);
                    if (m141809c5 == null) {
                        str7 = "";
                    } else {
                        str7 = m141809c5.f42446v;
                    }
                    m141230P0(qVar, str7, c23528a, contactProfile);
                    if (m141809c6 != null) {
                        str9 = m141809c6.f42446v;
                    }
                    m141230P0(qVar, str9, c23528a, contactProfile);
                    return;
                }
                if (list.size() == 4) {
                    qVar.m141424z(4);
                    C28203u6 c28203u63 = C28203u6.f131407a;
                    ContactProfile m141809c7 = c28203u63.m141809c((String) list.get(0));
                    ContactProfile m141809c8 = c28203u63.m141809c((String) list.get(1));
                    ContactProfile m141809c9 = c28203u63.m141809c((String) list.get(2));
                    ContactProfile m141809c10 = c28203u63.m141809c((String) list.get(3));
                    if (m141809c7 == null) {
                        str3 = "";
                    } else {
                        str3 = m141809c7.f42446v;
                    }
                    m141230P0(qVar, str3, c23528a, contactProfile);
                    if (m141809c8 == null) {
                        str4 = "";
                    } else {
                        str4 = m141809c8.f42446v;
                    }
                    m141230P0(qVar, str4, c23528a, contactProfile);
                    if (m141809c9 == null) {
                        str5 = "";
                    } else {
                        str5 = m141809c9.f42446v;
                    }
                    m141230P0(qVar, str5, c23528a, contactProfile);
                    if (m141809c10 != null) {
                        str9 = m141809c10.f42446v;
                    }
                    m141230P0(qVar, str9, c23528a, contactProfile);
                    return;
                }
                qVar.m141424z(5);
                C28203u6 c28203u64 = C28203u6.f131407a;
                ContactProfile m141809c11 = c28203u64.m141809c((String) list.get(0));
                ContactProfile m141809c12 = c28203u64.m141809c((String) list.get(1));
                ContactProfile m141809c13 = c28203u64.m141809c((String) list.get(2));
                if (m141809c11 == null) {
                    str = "";
                } else {
                    str = m141809c11.f42446v;
                }
                m141230P0(qVar, str, c23528a, contactProfile);
                if (m141809c12 == null) {
                    str2 = "";
                } else {
                    str2 = m141809c12.f42446v;
                }
                m141230P0(qVar, str2, c23528a, contactProfile);
                if (m141809c13 != null) {
                    str9 = m141809c13.f42446v;
                }
                m141230P0(qVar, str9, c23528a, contactProfile);
                qVar.f130779D = (String) list.get(4);
                return;
            }
            if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                qVar.m141424z(0);
                m141230P0(qVar, contactProfile.f42446v, c23528a, contactProfile);
                return;
            } else {
                qVar.m141424z(0);
                qVar.f130778C.clear();
                AbstractC0837p0.m2224e().mo2040a(new Runnable() { // from class: vg.z5

                    /* renamed from: q */
                    public final /* synthetic */ C28023b6.q f131686q;

                    public /* synthetic */ RunnableC28247z5(C28023b6.q qVar2) {
                        r2 = qVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C28023b6.m141227N0(ContactProfile.this, r2);
                    }
                });
                return;
            }
        }
        C23750d c23750d = qVar2.f130801p;
        if (c23750d != null) {
            c23750d.mo6855H(m141267y0());
        }
    }

    /* renamed from: R0 */
    public static void m141232R0(q qVar, C25630b c25630b, C23528a c23528a) {
        Bitmap m141206w;
        if (AbstractC23309i.m120896Eb() == 0) {
            AbstractC20110a.m104535d("loadSticker skip by server setting", new Object[0]);
            return;
        }
        try {
            C25630b m143282P0 = C28644j.m143233Y().m143282P0(c25630b);
            if (m143282P0.m132448z() && (m141206w = C28020b3.f130648a.m141206w(m143282P0)) != null && !m141206w.isRecycled()) {
                AbstractC23170p.m119346d(qVar.m141425o(), m141206w);
            } else {
                C3979l m125837F1 = AbstractC24006q.m125837F1(m143282P0.m132446x());
                if (m125837F1 != null && m125837F1.m18839c() != null && !m125837F1.m18839c().isRecycled()) {
                    AbstractC23170p.m119346d(qVar.m141425o(), m125837F1.m18839c());
                } else {
                    RecyclingImageView recyclingImageView = new RecyclingImageView(MainApplication.getAppContext());
                    qVar.f130780E = recyclingImageView;
                    C28020b3.f130648a.m141182F(recyclingImageView, c23528a, m143282P0, null, false, new m(m125837F1, qVar));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: T */
    public static void m141233T(String str) {
        try {
            int m118423d = AbstractC23088h5.m118423d("chat_reaction", str);
            q.m141409f(m118423d);
            Map map = AbstractC23304d.f113409m;
            map.remove(Integer.valueOf(m118423d));
            AbstractC23775p0.m124198c("chat_reaction", str);
            int m118423d2 = AbstractC23088h5.m118423d("group_reaction", str);
            q.m141409f(m118423d2);
            map.remove(Integer.valueOf(m118423d2));
            AbstractC23775p0.m124198c("group_reaction", str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    public static int m141234U(String str, String str2) {
        if (AbstractC25495a.m132079d(str)) {
            str = AbstractC25495a.m132088m(str);
        }
        return m141250h0().m141376r0(str2, str);
    }

    /* renamed from: U0 */
    private Intent m141235U0(String str, String str2, int i11, String str3, int i12) {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloReceiver.class);
        intent.setAction(str);
        intent.putExtra("EXTRA_NOTI_TYPE", str3);
        intent.putExtra("EXTRA_ACTION_TYPE", i12);
        intent.putExtra("EXTRA_UID", str2);
        intent.putExtra("EXTRA_MSG_ID", i11);
        return intent;
    }

    /* renamed from: V0 */
    private Intent m141236V0(String str, String str2, int i11, String str3, int i12) {
        Intent intent = new Intent(MainApplication.getAppContext(), (Class<?>) IntentHandlerInternalActivity.class);
        intent.setAction(str);
        intent.putExtra("EXTRA_NOTI_TYPE", str3);
        intent.putExtra("EXTRA_ACTION_TYPE", i12);
        intent.putExtra("EXTRA_UID", str2);
        intent.putExtra("EXTRA_MSG_ID", i11);
        return intent;
    }

    /* renamed from: X */
    public static boolean m141237X(StatusBarNotification statusBarNotification) {
        Notification notification;
        boolean m141268z0;
        if (statusBarNotification != null) {
            try {
                notification = statusBarNotification.getNotification();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (notification != null) {
                m141268z0 = m141268z0(notification.extras);
                AbstractC20110a.m104535d("dispatchExpiredTTLOfNotifEvent: %s", Boolean.valueOf(m141268z0));
                return m141268z0;
            }
        }
        m141268z0 = false;
        AbstractC20110a.m104535d("dispatchExpiredTTLOfNotifEvent: %s", Boolean.valueOf(m141268z0));
        return m141268z0;
    }

    /* renamed from: Y */
    private void m141238Y(String str, Bundle bundle) {
        try {
            if (!TextUtils.isEmpty(str) && bundle != null) {
                String string = bundle.getString("extra_notification_list_msg_info");
                if (!TextUtils.isEmpty(string)) {
                    JSONArray jSONArray = new JSONArray(string);
                    if (jSONArray.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i11 = 0; i11 < length; i11++) {
                            JSONObject jSONObject = (JSONObject) jSONArray.get(i11);
                            if (jSONObject != null) {
                                C17945a0 m94769j9 = C17945a0.m94769j9(jSONObject);
                                if (m94769j9 != null && m94769j9.m95029V3().m41059z()) {
                                    arrayList.add(m94769j9);
                                } else {
                                    return;
                                }
                            }
                        }
                        if (m141263s0(str) == 0) {
                            synchronized (this.f130684b) {
                                this.f130684b.put(str, arrayList);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z1 */
    private void m141239Z1(Bundle bundle, List list) {
        if (bundle != null && list != null && !list.isEmpty()) {
            try {
                int size = list.size();
                JSONArray jSONArray = new JSONArray();
                for (int i11 = 0; i11 < size; i11++) {
                    jSONArray.put(((C17945a0) list.get(i11)).m95095bc());
                }
                bundle.putString("extra_notification_list_msg_info", jSONArray.toString());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: b1 */
    private Intent m141242b1(String str, String str2, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_uid", str2);
        bundle.putString("extra_story_id", str);
        bundle.putInt("extra_view_mode", 2);
        bundle.putBoolean("extra_show_list_viewer", z11);
        bundle.putInt("srcType", 359);
        return AbstractC23152n3.m119020S(StoryDetailsView.class, bundle, true);
    }

    /* renamed from: c */
    static /* bridge */ /* synthetic */ int m141243c() {
        return m141259p0();
    }

    /* renamed from: c0 */
    private int m141244c0(String str, String str2) {
        return AbstractC23088h5.m118423d(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:            if (r0 == 1) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:            r5 = 9;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009e, code lost:            if (r0 == 1) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:            r0 = android.os.Build.MANUFACTURER;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:            if (android.text.TextUtils.isEmpty(r0) != false) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:            if (r0.toUpperCase().contains("OPPO") != false) goto L123;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:            if (r0.toUpperCase().contains("REALME") == false) goto L125;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ca, code lost:            r5 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c8, code lost:            r0 = e;     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int m141246d0() {
        int i11;
        String str;
        System.currentTimeMillis();
        int m121589X1 = AbstractC23309i.m121589X1();
        try {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                str = MainApplication.getAppContext().getPackageManager().resolveActivity(intent, 65536).activityInfo.packageName;
            } catch (Exception e11) {
                e11.printStackTrace();
                str = "";
            }
        } catch (Exception e12) {
            e = e12;
            i11 = -1;
            e.printStackTrace();
            if (i11 == -1) {
            }
        }
        if (!TextUtils.isEmpty(str)) {
            i11 = 1;
            if (!str.equals("org.adw.launcher") && !str.equals("org.adwfreak.launcher")) {
                if (str.equals("com.teslacoilsw.launcher")) {
                    i11 = 3;
                } else {
                    if (str.equals("com.sonyericsson.home")) {
                        if (m121589X1 == 1) {
                            i11 = 5;
                        }
                        i11 = 0;
                    } else if (str.equals("com.huawei.android.launcher")) {
                        if (m121589X1 == 1) {
                            i11 = 4;
                        }
                        i11 = 0;
                    } else if (str.equals("com.majeur.launcher")) {
                        if (m121589X1 == 1) {
                            i11 = 6;
                        }
                        i11 = 0;
                    } else if (str.equals("com.anddoes.launcher")) {
                        if (m121589X1 == 1) {
                            i11 = 7;
                        }
                        i11 = 0;
                    } else if (!str.equals("com.vivo.launcher")) {
                        if (str.equals("com.zui.launcher")) {
                        }
                    }
                    if (i11 == -1) {
                        return 0;
                    }
                    return i11;
                }
            }
            if (i11 == -1) {
            }
        }
        i11 = -1;
        if (i11 == -1) {
        }
    }

    /* renamed from: f2 */
    private void m141248f2(int i11) {
        try {
            List list = f130676t;
            if (list != null && list.size() > 0) {
                for (int size = f130676t.size() - 1; size >= 0; size--) {
                    if (((Integer) f130676t.get(size)).intValue() == i11) {
                        f130676t.remove(size);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037a A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03a4 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030f A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0339 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x033c A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x032e A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0135 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00e2 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144 A[Catch: Exception -> 0x00aa, TryCatch #0 {Exception -> 0x00aa, blocks: (B:3:0x001a, B:11:0x0047, B:13:0x00a6, B:15:0x00af, B:16:0x00b2, B:18:0x00b8, B:20:0x00c3, B:22:0x00c9, B:23:0x00de, B:24:0x00e9, B:26:0x011c, B:29:0x012d, B:33:0x0144, B:36:0x014f, B:38:0x0178, B:41:0x017e, B:43:0x018a, B:44:0x018d, B:46:0x01b9, B:48:0x01c3, B:50:0x01cd, B:51:0x01dc, B:53:0x01e2, B:56:0x01fd, B:58:0x0209, B:61:0x0216, B:63:0x021c, B:68:0x022d, B:70:0x0238, B:74:0x0243, B:76:0x024e, B:79:0x0256, B:81:0x025b, B:83:0x028d, B:84:0x0297, B:85:0x029b, B:87:0x02a1, B:89:0x02ba, B:90:0x02d0, B:92:0x02d4, B:95:0x02f3, B:97:0x02f9, B:103:0x0303, B:104:0x0308, B:105:0x0340, B:107:0x037a, B:109:0x0384, B:111:0x038f, B:113:0x0399, B:116:0x03a4, B:117:0x03a8, B:119:0x03ae, B:121:0x03b6, B:123:0x03ba, B:125:0x03c0, B:129:0x03e8, B:131:0x03ee, B:134:0x03f3, B:135:0x0413, B:137:0x045f, B:139:0x0463, B:143:0x046f, B:145:0x039f, B:146:0x0306, B:147:0x0292, B:150:0x030f, B:153:0x0339, B:154:0x033e, B:155:0x033c, B:156:0x032e, B:162:0x01ee, B:166:0x01f7, B:168:0x0232, B:169:0x014b, B:172:0x0352, B:173:0x0135, B:177:0x00e2), top: B:2:0x001a }] */
    /* renamed from: g1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m141249g1(String str, String str2, String str3, int i11, PendingIntent pendingIntent, PendingIntent pendingIntent2, ContactProfile contactProfile, boolean z11, MessageId messageId, int i12, String str4, boolean z12, boolean z13, boolean z14, List list, o oVar, String str5, String str6, long j11, int i13, q.d dVar) {
        boolean z15;
        boolean z16;
        int m102746E;
        q qVar;
        C23750d c23750d;
        Context context;
        int i14;
        Context context2;
        AbstractC1364q.i iVar;
        AbstractC1364q.j jVar;
        boolean z17;
        try {
            boolean m40374K0 = contactProfile.m40374K0();
            Context applicationContext = MainApplication.getAppContext().getApplicationContext();
            C23750d c23750d2 = new C23750d(applicationContext);
            c23750d2.m124165v0(str5);
            c23750d2.m124164u0(str6);
            c23750d2.m124160q0(z13);
            if (i12 != 2 && i12 != 1 && i12 != 5 && !z12) {
                z15 = false;
                c23750d2.m124161r0(z15);
                SpannableString spannableString = new SpannableString(str);
                boolean z18 = z15;
                spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
                c23750d2.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                c23750d2.m6890r(AbstractC1388a.m6961c(applicationContext, AbstractC16801x.notification_app_icon_background_color));
                c23750d2.mo6895w(spannableString);
                c23750d2.m6870W(str3);
                c23750d2.m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light));
                c23750d2.m6886n(true);
                if (pendingIntent != null) {
                    c23750d2.m6893u(pendingIntent);
                }
                if (pendingIntent2 != null) {
                    c23750d2.m6850B(pendingIntent2);
                }
                if (TextUtils.isEmpty(str2)) {
                    SpannableString spannableString2 = new SpannableString(str2);
                    if (!TextUtils.isEmpty(str4) && str2.startsWith(str4)) {
                        spannableString2.setSpan(new StyleSpan(1), 0, str4.length(), 33);
                    }
                    c23750d2.mo6894v(spannableString2);
                } else {
                    c23750d2.mo6894v(str2);
                }
                q qVar2 = new q();
                qVar2.f130802q = this.f130683a;
                qVar2.f130803r = i11;
                qVar2.f130807v = contactProfile;
                qVar2.f130801p = c23750d2;
                qVar2.f130784I = spannableString;
                qVar2.f130786K = messageId;
                qVar2.f130785J = str2;
                qVar2.f130792Q = z14;
                qVar2.f130787L = str4;
                qVar2.f130788M = oVar;
                qVar2.f130795T = z13;
                qVar2.f130809x = z18;
                qVar2.f130799X = dVar;
                qVar2.f130776A = i13;
                if (m141329a0() && m141348h1(str5)) {
                    z16 = true;
                    m102746E = !AbstractC19656s0.m103052A(m40374K0) ? 0 : C19636i1.m102737w().m102746E(contactProfile.mo2478b());
                    if (z14) {
                        qVar = qVar2;
                        c23750d = c23750d2;
                        context = applicationContext;
                        i14 = 2;
                        if (z16) {
                            AbstractC1364q.i m141257l0 = m141257l0();
                            m141257l0.m6905h(new AbstractC1364q.i.a(str2, System.currentTimeMillis(), new C1341g1.b().m6743f(str).m6738a()));
                            qVar.f130791P = q.c.MESSAGING;
                            qVar.f130800Y = m141257l0;
                            c23750d.m6869V(m141257l0);
                        }
                    } else {
                        int i15 = m102746E;
                        c23750d = c23750d2;
                        context = applicationContext;
                        int i16 = 1;
                        List<C17945a0> m141354k0 = m141354k0(contactProfile.f42434r, str2, messageId, i12, str4, z12, oVar == null ? 0 : oVar.f130761a, j11);
                        if (m141354k0.size() == 0) {
                            m141293J(contactProfile.f42434r);
                            return;
                        }
                        long m141360m0 = m141360m0(contactProfile.f42434r);
                        if (m141264t2(m141360m0)) {
                            c23750d.m124168y0(m141360m0);
                        }
                        c23750d.m6884j().putString("extra_notification_uid_sender", contactProfile.f42434r);
                        m141239Z1(c23750d.m6884j(), m141354k0);
                        C17945a0 c17945a0 = (C17945a0) m141354k0.get(m141354k0.size() - 1);
                        SpannableString spannableString3 = new SpannableString(c17945a0.m95019U3());
                        if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(c17945a0.m95019U3()) && c17945a0.m95019U3().startsWith(str4)) {
                            spannableString3.setSpan(new StyleSpan(1), 0, str4.length(), 33);
                        }
                        int m141368o0 = m141368o0(m141354k0, i11);
                        if (m141368o0 == 1 && AbstractC23309i.m122232o3() == 1) {
                            i14 = 2;
                        } else {
                            i14 = 2;
                            if ((m141368o0 != 2 || AbstractC23309i.m122306q3() != 1) && (m141368o0 != 3 || AbstractC23309i.m122269p3() != 1)) {
                                qVar = qVar2;
                                qVar.f130790O = false;
                                m102746E = i15;
                                qVar.f130789N = m102746E;
                                c23750d.m6862O((AbstractC23304d.f113330T0 || !z13) ? 0 : 2).m6888p("msg");
                                if (!z11 && m141354k0.size() > 1 && m141368o0 == 0) {
                                    c23750d.m6859L(m102746E);
                                    if (m102746E > 0) {
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannableString);
                                        spannableStringBuilder.append((CharSequence) " (").append((CharSequence) String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_summary_new_msg_count), Integer.valueOf(m102746E))).append((CharSequence) ")");
                                        c23750d.mo6895w(spannableStringBuilder);
                                    }
                                    if (z16) {
                                        jVar = m141257l0();
                                    } else {
                                        jVar = new AbstractC1364q.h();
                                    }
                                    for (C17945a0 c17945a02 : m141354k0) {
                                        SpannableString spannableString4 = new SpannableString(c17945a02.m95019U3());
                                        if (!TextUtils.isEmpty(c17945a02.m94854B4())) {
                                            spannableString4.setSpan(new StyleSpan(i16), 0, c17945a02.m94854B4().length(), 33);
                                        }
                                        if (jVar instanceof AbstractC1364q.i) {
                                            ((AbstractC1364q.i) jVar).m6905h(new AbstractC1364q.i.a(spannableString4, c17945a02.m94974P4(), new C1341g1.b().m6743f(str).m6738a()));
                                        } else if (jVar instanceof AbstractC1364q.h) {
                                            ((AbstractC1364q.h) jVar).m6900h(spannableString4);
                                        }
                                        i16 = 1;
                                    }
                                    qVar.f130791P = z16 ? q.c.MESSAGING : q.c.INBOX;
                                } else {
                                    if (!z16) {
                                        AbstractC1364q.i m141257l02 = m141257l0();
                                        m141257l02.m6905h(new AbstractC1364q.i.a(spannableString3, c17945a0.m94974P4(), new C1341g1.b().m6743f(str).m6738a()));
                                        iVar = m141257l02;
                                    } else {
                                        AbstractC1364q.d dVar2 = new AbstractC1364q.d();
                                        dVar2.m6828h(spannableString3);
                                        iVar = dVar2;
                                    }
                                    jVar = iVar;
                                    qVar.f130791P = !z16 ? q.c.MESSAGING : q.c.BIG_TEXT;
                                }
                                qVar.f130800Y = jVar;
                                c23750d.m6869V(jVar);
                                c23750d.mo6894v(spannableString3);
                            }
                        }
                        boolean z19 = C21927m.m114302u().m114345m(contactProfile.f42434r) && !TextUtils.isEmpty(AbstractC23309i.m122303q0());
                        if (!AbstractC23059e9.m118329h() || AbstractC23165o5.m119333b() || z19 || z16) {
                            qVar = qVar2;
                            z17 = false;
                        } else {
                            qVar = qVar2;
                            z17 = true;
                        }
                        qVar.f130790O = z17;
                        m102746E = i15;
                        qVar.f130789N = m102746E;
                        c23750d.m6862O((AbstractC23304d.f113330T0 || !z13) ? 0 : 2).m6888p("msg");
                        if (!z11) {
                        }
                        if (!z16) {
                        }
                        jVar = iVar;
                        qVar.f130791P = !z16 ? q.c.MESSAGING : q.c.BIG_TEXT;
                        qVar.f130800Y = jVar;
                        c23750d.m6869V(jVar);
                        c23750d.mo6894v(spannableString3);
                    }
                    if (m102746E > 0 || Objects.equals(str5, "hidden") || AbstractC21935u.m114538e(contactProfile.mo2478b()) == 1 || (AbstractC21935u.m114515E(contactProfile.mo2478b()) && !AbstractC23309i.m121567Wg())) {
                        m141256k2(c23750d);
                    }
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            n nVar = (n) it.next();
                            if (nVar == null || nVar.f130759c == null) {
                                context2 = context;
                            } else {
                                int i17 = nVar.f130760d;
                                if (i17 == n.f130755g) {
                                    context2 = context;
                                    c23750d.m6877c(new AbstractC1364q.b.a(nVar.f130758b, nVar.m141400a(AbstractC1388a.m6961c(context2, AbstractC16801x.notification_app_icon_background_color)), nVar.f130759c).m6813e(i14).m6814f(false).m6811b());
                                } else {
                                    context2 = context;
                                    if (i17 != n.f130754f && i17 != n.f130756h) {
                                        c23750d.m6876b(new AbstractC1364q.b.a(nVar.f130758b, nVar.m141400a(AbstractC1388a.m6961c(context2, AbstractC16801x.notification_app_icon_background_color)), nVar.f130759c).m6814f(false).m6811b());
                                    }
                                    AbstractC1364q.b m6811b = new AbstractC1364q.b.a(AbstractC16803z.ic_reply_icon, nVar.m141400a(AbstractC1388a.m6961c(context2, AbstractC16801x.notification_app_icon_background_color)), nVar.f130759c).m6813e(1).m6814f(false).m6810a(new C1347i1.d("com.zing.zalo.intent.action.EXTRA_MESSAGE_QUICK_REPLY").m6770b(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.chat_default_text)).m6769a()).m6812d(false).m6811b();
                                    if (nVar.f130760d == n.f130756h) {
                                        c23750d.m6877c(m6811b);
                                    } else {
                                        c23750d.m6876b(m6811b);
                                    }
                                    context = context2;
                                }
                            }
                            context = context2;
                        }
                    }
                    m141231Q0(contactProfile, qVar);
                    q.m141403A(qVar, true);
                }
                z16 = false;
                if (!AbstractC19656s0.m103052A(m40374K0)) {
                }
                if (z14) {
                }
                if (m102746E > 0) {
                }
                m141256k2(c23750d);
                if (list != null) {
                }
                m141231Q0(contactProfile, qVar);
                q.m141403A(qVar, true);
            }
            z15 = true;
            c23750d2.m124161r0(z15);
            SpannableString spannableString5 = new SpannableString(str);
            boolean z182 = z15;
            spannableString5.setSpan(new StyleSpan(1), 0, str.length(), 33);
            c23750d2.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            c23750d2.m6890r(AbstractC1388a.m6961c(applicationContext, AbstractC16801x.notification_app_icon_background_color));
            c23750d2.mo6895w(spannableString5);
            c23750d2.m6870W(str3);
            c23750d2.m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light));
            c23750d2.m6886n(true);
            if (pendingIntent != null) {
            }
            if (pendingIntent2 != null) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
            q qVar22 = new q();
            qVar22.f130802q = this.f130683a;
            qVar22.f130803r = i11;
            qVar22.f130807v = contactProfile;
            qVar22.f130801p = c23750d2;
            qVar22.f130784I = spannableString5;
            qVar22.f130786K = messageId;
            qVar22.f130785J = str2;
            qVar22.f130792Q = z14;
            qVar22.f130787L = str4;
            qVar22.f130788M = oVar;
            qVar22.f130795T = z13;
            qVar22.f130809x = z182;
            qVar22.f130799X = dVar;
            qVar22.f130776A = i13;
            if (m141329a0()) {
                z16 = true;
                if (!AbstractC19656s0.m103052A(m40374K0)) {
                }
                if (z14) {
                }
                if (m102746E > 0) {
                }
                m141256k2(c23750d);
                if (list != null) {
                }
                m141231Q0(contactProfile, qVar);
                q.m141403A(qVar, true);
            }
            z16 = false;
            if (!AbstractC19656s0.m103052A(m40374K0)) {
            }
            if (z14) {
            }
            if (m102746E > 0) {
            }
            m141256k2(c23750d);
            if (list != null) {
            }
            m141231Q0(contactProfile, qVar);
            q.m141403A(qVar, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: h0 */
    public static synchronized C28023b6 m141250h0() {
        C28023b6 c28023b6;
        synchronized (C28023b6.class) {
            try {
                if (f130675s == null) {
                    synchronized (C28023b6.class) {
                        try {
                            if (f130675s == null) {
                                f130675s = new C28023b6();
                            }
                        } finally {
                        }
                    }
                }
                c28023b6 = f130675s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c28023b6;
    }

    /* renamed from: i1 */
    public static Bitmap m141251i1(int i11, Bitmap bitmap) {
        double d11 = i11;
        if (bitmap.getWidth() * 1.1d < d11 || bitmap.getWidth() * 0.9d > d11) {
            String.format("create scaled bitmap for notification icon from %d to %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(i11));
            int i12 = (int) (d11 * 0.95d);
            bitmap = Bitmap.createScaledBitmap(bitmap, i12, i12, false);
        }
        return C23999j.m125743s2(bitmap);
    }

    /* renamed from: i2 */
    static void m141252i2(int i11) {
        boolean z11;
        try {
            m141250h0().f130688f = i11;
            m141250h0().f130687e = m141246d0();
            boolean z12 = true;
            switch (m141250h0().f130687e) {
                case 1:
                    Intent intent = new Intent();
                    intent.setAction("org.adw.launcher.counter.SEND");
                    intent.putExtra("PNAME", MainApplication.getAppContext().getPackageName());
                    intent.putExtra("COUNT", i11);
                    intent.putExtra("COLOR", 16711680);
                    MainApplication.getAppContext().sendBroadcast(intent);
                    break;
                case 2:
                    Bundle bundle = new Bundle();
                    bundle.putInt("app_badge_count", i11);
                    bundle.putString("app_badge_packageName", MainApplication.getAppContext().getPackageName());
                    MainApplication.getAppContext().getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
                    break;
                case 3:
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("tag", MainApplication.getAppContext().getPackageName() + "/" + MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
                    contentValues.put("count", Integer.valueOf(i11));
                    C26388b.m135979e(MainApplication.getAppContext(), Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues, false);
                    break;
                case 4:
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("package", MainApplication.getAppContext().getPackageName());
                    bundle2.putString("class", MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
                    bundle2.putInt("badgenumber", i11);
                    MainApplication.getAppContext().getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle2);
                    break;
                case 5:
                    if (m141258o2(MainApplication.getAppContext())) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("badge_count", Integer.valueOf(i11));
                        contentValues2.put("package_name", MainApplication.getAppContext().getPackageName());
                        contentValues2.put("activity_name", MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
                        C26388b.m135979e(MainApplication.getAppContext(), Uri.parse("content://com.sonymobile.home.resourceprovider/badge"), contentValues2, false);
                        break;
                    } else {
                        Intent intent2 = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
                        intent2.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", MainApplication.getAppContext().getPackageName());
                        intent2.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
                        intent2.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i11));
                        if (i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        intent2.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", z11);
                        MainApplication.getAppContext().sendBroadcast(intent2);
                        break;
                    }
                case 6:
                    Intent intent3 = new Intent("com.majeur.launcher.intent.action.UPDATE_BADGE");
                    intent3.putExtra("com.majeur.launcher.intent.extra.BADGE_PACKAGE", MainApplication.getAppContext().getPackageName());
                    intent3.putExtra("com.majeur.launcher.intent.extra.BADGE_COUNT", i11);
                    intent3.putExtra("com.majeur.launcher.intent.extra.BADGE_CLASS", MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
                    MainApplication.getAppContext().sendBroadcast(intent3);
                    break;
                case 7:
                    Intent intent4 = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
                    intent4.putExtra("package", MainApplication.getAppContext().getPackageName());
                    intent4.putExtra("count", i11);
                    intent4.putExtra("class", MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
                    MainApplication.getAppContext().sendBroadcast(intent4);
                    break;
                case 9:
                    Intent intent5 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
                    intent5.putExtra("packageName", MainApplication.getAppContext().getPackageName());
                    intent5.putExtra("className", MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
                    intent5.putExtra("notificationNum", i11);
                    MainApplication.getAppContext().sendBroadcast(intent5);
                    break;
                case 10:
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("app_badge_count", i11);
                    MainApplication.getAppContext().getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle3);
                    break;
            }
            Intent intent6 = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent6.putExtra("badge_count", i11);
            intent6.putExtra("badge_count_package_name", MainApplication.getAppContext().getPackageName());
            intent6.putExtra("badge_count_class_name", MainApplication.getAppContext().getPackageName() + ".ui.SplashActivity");
            MainApplication.getAppContext().sendBroadcast(intent6);
            if (AbstractC23304d.f113330T0 || i11 != 0) {
                z12 = false;
            }
            AbstractC23304d.f113447v1 = z12;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j1 */
    public static Bitmap m141253j1(int i11, Bitmap bitmap, boolean z11) {
        double d11 = i11;
        if (bitmap.getWidth() * 1.1d < d11 || bitmap.getWidth() * 0.9d > d11) {
            String.format("create scaled bitmap for notification icon from %d to %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(i11));
            int i12 = (int) (d11 * 0.95d);
            bitmap = Bitmap.createScaledBitmap(bitmap, i12, i12, false);
        }
        if (z11) {
            return C23999j.m125743s2(bitmap);
        }
        return bitmap;
    }

    /* renamed from: j2 */
    private static void m141254j2(String str, C20556f c20556f, String str2, Intent intent) {
        if (c20556f.m106844q() && Build.VERSION.SDK_INT >= 29) {
            intent.setFlags(1);
            intent.setDataAndType(Uri.parse(c20556f.m106842o()), str);
            return;
        }
        if (c20556f.m106844q()) {
            str2 = c20556f.m106831c();
        }
        File file = new File(str2);
        if (Build.VERSION.SDK_INT >= 24) {
            intent.setFlags(1);
            intent.setDataAndType(FileProvider.m6950f(MainApplication.getAppContext(), "com.zing.zalo.provider", file), str);
        } else {
            intent.setDataAndType(Uri.fromFile(file), str);
        }
    }

    /* renamed from: k */
    private void m141255k(String str, String str2, String str3, String str4, String str5, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str6, String str7, List list, int i11, int i12, boolean z11, int i13) {
        C23750d c23750d;
        try {
            c23750d = new C23750d(CoreUtility.getAppContext());
            c23750d.m124165v0(str);
            c23750d.m124164u0(str2);
            c23750d.m6870W(str4);
            c23750d.mo6894v(str5);
            c23750d.m6850B(pendingIntent2);
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            m141313S0(str6, c23750d);
            c23750d.m124158o0(list);
            c23750d.m6893u(pendingIntent);
            c23750d.mo6895w(str3);
            c23750d.m6890r(i13);
            if (i12 != -1) {
                boolean z12 = true;
                if (i12 != 1) {
                    z12 = false;
                }
                c23750d.m124160q0(z12);
            }
            if (str7 != null && !TextUtils.isEmpty(str7)) {
                c23750d.m124167x0(str7);
            }
            if (i11 > 0) {
                c23750d.m6866S(i11);
            }
            if (!z11) {
                m141256k2(c23750d);
            }
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
        } catch (Throwable th3) {
            th = th3;
            AbstractC20110a.m104539h(th);
        }
    }

    /* renamed from: k2 */
    public static void m141256k2(C23750d c23750d) {
        if (c23750d != null) {
            c23750d.m6859L(-100);
        }
    }

    /* renamed from: l0 */
    private AbstractC1364q.i m141257l0() {
        return new AbstractC1364q.i(new C1341g1.b().m6743f(AbstractC23304d.f113368c0.f42437s).m6738a()).m6907n(false);
    }

    /* renamed from: o2 */
    static boolean m141258o2(Context context) {
        try {
            try {
                if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) == null) {
                    return false;
                }
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* renamed from: p0 */
    private static int m141259p0() {
        if (f130679w <= 0) {
            f130679w = CoreUtility.getAppContext().getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width);
        }
        return f130679w;
    }

    /* renamed from: p2 */
    private static boolean m141260p2(String str, Bundle bundle) {
        C17945a0 m2635r;
        boolean z11 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (m141250h0().m141340e2(str)) {
                if (m141250h0().m141263s0(str) != 0) {
                    C17945a0 m141364n0 = m141250h0().m141364n0(str);
                    if (m141364n0 != null && (m2635r = AbstractC23306f.m120584H0().m2635r(m141364n0.m95029V3())) != null) {
                        C18961d.m99486i().m99495o(m2635r);
                    }
                } else {
                    return z11;
                }
            }
            z11 = true;
            return z11;
        } catch (Exception e11) {
            e11.printStackTrace();
            return true;
        }
    }

    /* renamed from: q0 */
    public static PendingIntent m141261q0(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        C20556f c20556f = new C20556f(str);
        String m106835h = c20556f.m106835h();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String m118221t = AbstractC23041d2.m118221t(m106835h, false);
        if (!TextUtils.isEmpty(m118221t)) {
            String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(m118221t.toLowerCase());
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = null;
            }
            if (mimeTypeFromExtension != null) {
                m141254j2(mimeTypeFromExtension, c20556f, str, intent);
            } else {
                m141254j2("text/plain", c20556f, str, intent);
            }
        } else {
            m141254j2("text/plain", c20556f, str, intent);
        }
        return PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent, AbstractC19601a.m102571a(1073741824));
    }

    /* renamed from: r2 */
    public static void m141262r2() {
        try {
            if (TextUtils.isEmpty(CoreUtility.f89233i)) {
                m141252i2(0);
            } else {
                m141252i2(C19636i1.m102737w().m102745D());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f130674r, e11);
        }
    }

    /* renamed from: s0 */
    private int m141263s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (this.f130684b) {
            try {
                if (!this.f130684b.containsKey(str) || this.f130684b.get(str) == null) {
                    return 0;
                }
                return ((List) this.f130684b.get(str)).size();
            } finally {
            }
        }
    }

    /* renamed from: t2 */
    public static boolean m141264t2(long j11) {
        return j11 > 0 && j11 != Long.MAX_VALUE;
    }

    /* renamed from: v */
    public static void m141265v(Context context) {
        if (!AbstractC23133l6.m118637b(context, ":video_processing")) {
            C1335e1.m6691e(context).m6696b(1000);
        }
    }

    /* renamed from: x0 */
    static PendingIntent m141266x0(ContactProfile contactProfile) {
        Context appContext = MainApplication.getAppContext();
        return PendingIntent.getBroadcast(appContext, (int) (System.currentTimeMillis() & 268435455), new Intent(appContext, (Class<?>) ZaloReceiver.class).putExtra("com.zing.zalo.intent.action.EXTRA_MESSAGE_WEARABLE", "Reply icon selected.").putExtra("uidNotif", contactProfile.f42434r).putExtra("dpnNotif", contactProfile.f42437s).putExtra("avtNotif", contactProfile.f42446v).setAction("com.zing.zalo.intent.action.ACTION_DEMAND_WEARABLE"), AbstractC19601a.m102572b(1207959552));
    }

    /* renamed from: y0 */
    private static synchronized Bitmap m141267y0() {
        Bitmap bitmap;
        synchronized (C28023b6.class) {
            try {
                if (f130682z == null) {
                    f130682z = BitmapFactory.decodeResource(MainApplication.getAppContext().getApplicationContext().getResources(), AbstractC16803z.icon);
                }
                bitmap = f130682z;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    /* renamed from: z0 */
    public static boolean m141268z0(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        try {
            String string = bundle.getString("extra_notification_uid_sender");
            if (TextUtils.isEmpty(string)) {
                return false;
            }
            return m141260p2(string, bundle);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: A0 */
    public boolean m141269A0(String str) {
        try {
            HashMap m101784c = C19464a.m101784c(str, 6);
            if (m101784c == null) {
                return false;
            }
            if (m101784c.isEmpty()) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: A1 */
    public void m141270A1(int i11, C32078q7 c32078q7) {
        if (i11 == 0) {
            return;
        }
        try {
            String mo17218d = c32078q7.mo17218d();
            String m154764u = c32078q7.m154764u();
            String m154740C = c32078q7.m154740C();
            C20817r m108717c = C20817r.m108717c(mo17218d, false);
            String m108911p = AbstractC20833z.m108911p("story_archive", m108717c);
            if (AbstractC20833z.m108915t("story_archive")) {
                m141347h("story_archive", m108911p);
            }
            String m108911p2 = AbstractC20833z.m108911p("story_archive", m108717c);
            CharSequence m154767x = c32078q7.m154767x();
            CharSequence m108892G = AbstractC20833z.m108892G("story_archive", m108911p2, c32078q7.m154744G(), c32078q7.m154765v().toString(), m154767x.toString());
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REQUESTED_STORY_ID", mo17218d);
            bundle.putInt("EXTRA_SOURCE_OPEN_FROM", 4);
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), (int) System.currentTimeMillis(), AbstractC23152n3.m119020S(StoryArchiveView.class, bundle, true), AbstractC19601a.m102572b(134217728));
            C23750d c23750d = new C23750d(CoreUtility.getAppContext());
            c23750d.m6870W(m108892G);
            c23750d.mo6895w("Zalo");
            c23750d.mo6894v(m108892G);
            c23750d.m6893u(activity);
            c23750d.m124165v0("story_archive");
            c23750d.m124164u0(m108911p);
            c23750d.m124167x0(m154740C);
            m141313S0(m154764u, c23750d);
            m141256k2(c23750d);
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: B */
    public void m141271B(String str, boolean z11) {
        try {
            if (!z11) {
                if (!TextUtils.isEmpty(str)) {
                    synchronized (this.f130684b) {
                        try {
                            if (this.f130684b.containsKey(str)) {
                                this.f130684b.remove(str);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            }
            synchronized (this.f130684b) {
                this.f130684b.clear();
            }
            return;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        e11.printStackTrace();
    }

    /* renamed from: B0 */
    public boolean m141272B0(String str, String str2) {
        try {
            HashMap m101784c = C19464a.m101784c(str, 6);
            if (m101784c == null) {
                return false;
            }
            return m101784c.containsKey(str2);
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: B1 */
    public void m141273B1(int i11, C32078q7 c32078q7) {
        if (i11 == 0) {
            return;
        }
        try {
            String mo17218d = c32078q7.mo17218d();
            String mo17216b = c32078q7.mo17216b();
            String m154764u = c32078q7.m154764u();
            String m154740C = c32078q7.m154740C();
            C20817r m108717c = C20817r.m108717c(mo17218d, false);
            String m108911p = AbstractC20833z.m108911p("story_reaction", m108717c);
            if (AbstractC20833z.m108915t("story_reaction")) {
                m141347h("story_reaction", m108911p);
            }
            String m108911p2 = AbstractC20833z.m108911p("story_reaction", m108717c);
            CharSequence m154767x = c32078q7.m154767x();
            CharSequence m108892G = AbstractC20833z.m108892G("story_reaction", m108911p2, c32078q7.m154744G(), c32078q7.m154765v().toString(), m154767x.toString());
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), (int) System.currentTimeMillis(), m141242b1(mo17218d, mo17216b, false), AbstractC19601a.m102572b(134217728));
            C23750d c23750d = new C23750d(CoreUtility.getAppContext());
            c23750d.m6870W(m108892G);
            c23750d.mo6895w("Zalo");
            c23750d.mo6894v(m108892G);
            c23750d.m6893u(activity);
            c23750d.m124165v0("story_reaction");
            c23750d.m124164u0(m108911p);
            c23750d.m124167x0(m154740C);
            m141313S0(m154764u, c23750d);
            m141256k2(c23750d);
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: C */
    public void m141274C() {
        try {
            this.f130683a.m6696b(7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: C0 */
    void m141275C0() {
        if (this.f130683a == null) {
            this.f130683a = C1335e1.m6691e(MainApplication.getAppContext());
        }
    }

    /* renamed from: C1 */
    public void m141276C1(int i11, String str, String str2, String str3, String str4, String[] strArr, String str5) {
        String str6;
        if (i11 == 0) {
            return;
        }
        try {
            String m108911p = AbstractC20833z.m108911p("new_story", C20817r.m108717c(str2, false));
            if (AbstractC20833z.m108915t("new_story")) {
                m141347h("new_story", m108911p);
            }
            CharSequence m108892G = AbstractC20833z.m108892G("new_story", m108911p, str3, str, str5);
            Intent m141242b1 = m141242b1(str2, str3, true);
            Context applicationContext = MainApplication.getAppContext().getApplicationContext();
            PendingIntent activity = PendingIntent.getActivity(applicationContext, (int) System.currentTimeMillis(), m141242b1, AbstractC19601a.m102572b(134217728));
            if (strArr != null && strArr.length > 0) {
                C23750d c23750d = new C23750d(CoreUtility.getAppContext());
                c23750d.m6893u(activity);
                c23750d.mo6895w("Zalo");
                c23750d.m124165v0("new_story");
                c23750d.m124164u0(m108911p);
                m141256k2(c23750d);
                RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), AbstractC7409c0.noti_story_viewers_custom_layout);
                int[] iArr = {AbstractC6918a0.list_viewers_avt_1, AbstractC6918a0.list_viewers_avt_2, AbstractC6918a0.list_viewers_avt_3, AbstractC6918a0.list_viewers_avt_4, AbstractC6918a0.list_viewers_avt_5};
                C23528a c23528a = new C23528a(applicationContext);
                int i12 = 0;
                for (int i13 = 5; i12 < i13 && i12 < strArr.length; i13 = 5) {
                    RecyclingImageView recyclingImageView = new RecyclingImageView(applicationContext);
                    this.f130698p.add(recyclingImageView);
                    int i14 = i12;
                    C23528a c23528a2 = c23528a;
                    int[] iArr2 = iArr;
                    ((C23528a) c23528a2.m123612r(recyclingImageView)).m123579C(strArr[i14], C23278z2.m120143n(), new c(strArr, i14, remoteViews, iArr2, c23750d));
                    i12 = i14 + 1;
                    c23750d = c23750d;
                    c23528a = c23528a2;
                    iArr = iArr2;
                }
                C23750d c23750d2 = c23750d;
                remoteViews.setTextViewText(AbstractC6918a0.noti_story_viewer_noti_text, m108892G);
                remoteViews.setTextViewText(AbstractC6918a0.list_viewers_tv_num, strArr[strArr.length - 1]);
                c23750d2.m6870W(m108892G);
                c23750d2.mo6894v(m108892G);
                c23750d2.m6896x(remoteViews);
                if (Build.VERSION.SDK_INT >= 24 && AbstractC23309i.m122416t2() == 1) {
                    if (AbstractC23304d.f113330T0) {
                        str6 = "zalo_notify_alert";
                    } else {
                        str6 = "zalo_notify";
                    }
                    c23750d2.m124159p0(str6);
                    c23750d2.m6854G(false);
                }
                AbstractC23775p0.m124198c("new_story", m108911p);
                m141256k2(c23750d2);
                c23750d2.m124147b0();
                m141262r2();
                return;
            }
            C23750d c23750d3 = new C23750d(CoreUtility.getAppContext());
            c23750d3.m6870W(m108892G);
            c23750d3.mo6895w("Zalo");
            c23750d3.mo6894v(m108892G);
            c23750d3.m6893u(activity);
            c23750d3.m124165v0("new_story");
            c23750d3.m124164u0(m108911p);
            m141256k2(c23750d3);
            c23750d3.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public void m141277D() {
        try {
            this.f130683a.m6696b(3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D0 */
    protected boolean m141278D0(String str) {
        boolean z11;
        try {
            if (Build.VERSION.SDK_INT >= 23 && AbstractC23034c6.m118167n(MainApplication.getAppContext(), AbstractC23034c6.f112032i) != 0) {
                z11 = false;
                boolean m141283F0 = m141283F0(str);
                if (AbstractC23309i.m121342Qd() || !z11 || m141283F0) {
                    return false;
                }
                return true;
            }
            z11 = true;
            boolean m141283F02 = m141283F0(str);
            return AbstractC23309i.m121342Qd() ? false : false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: D1 */
    public void m141279D1(ContactProfile contactProfile, String str, String str2, String str3, String str4, String str5, int i11) {
        String str6;
        boolean z11;
        int i12;
        int i13;
        try {
            if (AbstractC21935u.m114558y(contactProfile.f42434r)) {
                str6 = "miss_call_zalo";
            } else {
                str6 = "miss_call_stranger_zalo";
            }
            String str7 = contactProfile.f42434r;
            int m141244c0 = m141244c0(str6, str7);
            m141344g(str6, str7, str5);
            Intent intent = new Intent("com.zing.zalo.intent.action.CALL_DELETE_NOTIFICATION");
            intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
            intent.putExtra("notiType", str6);
            intent.putExtra("subType", str7);
            PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), m141244c0, intent, AbstractC19601a.m102572b(0));
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            m140776b.putBoolean("specialToShowPassCodeScreen", true);
            m140776b.putBoolean("fromNotification", true);
            m140776b.putString("uidNotif", contactProfile.f42434r);
            m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
            m140776b.putString("avtNotif", contactProfile.f42446v);
            if (contactProfile.m40374K0()) {
                m140776b.putString("SOURCE_ACTION", "15200");
            } else if (contactProfile.m40387S0()) {
                m140776b.putString("SOURCE_ACTION", "15300");
            } else {
                m140776b.putString("SOURCE_ACTION", "15100");
            }
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, AbstractC23152n3.m119004K(m140776b, true), AbstractC19601a.m102572b(134217728));
            n nVar = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.notification_btn_reply), AbstractC16803z.ic_callreply_notifbar, activity);
            Intent intent2 = new Intent("com.zing.zalo.action.NOTI_CALLBACK");
            intent2.setClass(MainApplication.getAppContext(), IntentHandlerActivity.class);
            intent2.putExtra("contactProfile", contactProfile);
            intent2.putExtra("notiType", str6);
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            intent2.putExtra("callType", z11);
            intent2.putExtra("subType", str7);
            n nVar2 = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.notification_btn_callback), AbstractC16803z.ic_answer_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, intent2, AbstractC19601a.m102572b(134217728)));
            ArrayList arrayList = new ArrayList();
            arrayList.add(nVar);
            arrayList.add(nVar2);
            if (i11 == 1) {
                i12 = AbstractC16803z.ic_miss_call_video;
            } else {
                i12 = AbstractC16803z.ic_miss_call_audio;
            }
            int i14 = i12;
            if (!m141224G0(contactProfile) && (!C18922m.m99141t().m99164y() || !AbstractC32232i.m155459g(MainApplication.getAppContext().getApplicationContext()))) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            m141255k(str6, str7, str, str3, str2, activity, broadcast, str4, null, arrayList, i14, i13, true, Color.parseColor("#DB342E"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public void m141280E() {
        try {
            this.f130683a.m6696b(17);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E1 */
    public void m141281E1(ContactProfile contactProfile, String str, String str2, String str3, String str4, MessageId messageId, boolean z11, boolean z12, int i11, String str5, boolean z13, boolean z14, o oVar, String str6, int i12) {
        try {
            int m118423d = AbstractC23088h5.m118423d(str6, contactProfile.f42434r);
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
            bundle.putBoolean("specialToShowPassCodeScreen", true);
            bundle.putInt("TAB_ID", C24099q0.m125958k().m125971o());
            bundle.putBoolean(MessagesView.f63531l3, true);
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119012O(MainTabView.class, bundle), AbstractC19601a.m102572b(134217728));
            AbstractC23304d.f113409m.put(Integer.valueOf(m118423d), messageId.m41046j());
            Intent intent = new Intent("com.zing.zalo.intent.action.DELETE_NOTIFICATION");
            intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
            intent.putExtra("msgId", m118423d);
            m141249g1(str, str2, str3, m118423d, activity, PendingIntent.getBroadcast(MainApplication.getAppContext(), m118423d, intent, AbstractC19601a.m102572b(0)), contactProfile, z12, messageId, i11, str5, z13, z14, z11, null, oVar, str6, contactProfile.f42434r, 0L, i12, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: F */
    public void m141282F() {
        C2804c.f11236a.m13565u();
        AbstractC23775p0.m124197b("new_group_invitation");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0077, code lost:            if (r12 != null) goto L59;     */
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean m141283F0(String str) {
        SensitiveData sensitiveData = new SensitiveData("phonebook_read_contact_on_missed_call", "comm_call");
        try {
            try {
                if (!C8937j0.m47663l(sensitiveData.m35528c())) {
                    return false;
                }
                C8937j0.m47661j().m50393d(sensitiveData);
                Cursor m135984j = C26388b.m135984j(MainApplication.getAppContext(), Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"_id", "number", "display_name"}, null, null, null, false);
                if (m135984j != null) {
                    try {
                        try {
                            if (m135984j.moveToFirst()) {
                                return true;
                            }
                        } finally {
                            m135984j.close();
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        m135984j.close();
                        return false;
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                C8937j0.m47661j().m50392b(sensitiveData.m35528c(), false);
            }
        } finally {
            C8937j0.m47661j().m50392b(sensitiveData.m35528c(), true);
        }
    }

    /* renamed from: F1 */
    public void m141284F1(C3560a c3560a) {
        String obj;
        Intent intent;
        if (c3560a != null) {
            try {
                if (!TextUtils.isEmpty(c3560a.m18087a())) {
                    obj = Html.fromHtml(c3560a.m18087a()).toString();
                    String str = obj;
                    intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloLauncherActivity.class);
                    intent.setFlags(67108864);
                    if (c3560a != null && !TextUtils.isEmpty(c3560a.m18087a())) {
                        intent.putExtra("EXTRA_KICK_OUT_DATA", c3560a.m18092f().toString());
                    }
                    m141336d1("Zalo", str, str, 3, PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent, AbstractC19601a.m102572b(1073741824)), null, null, null, null, null, true, null, "default");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        obj = MainApplication.getAppContext().getString(AbstractC8020f0.str_kickout_warning);
        String str2 = obj;
        intent = new Intent(MainApplication.getAppContext(), (Class<?>) ZaloLauncherActivity.class);
        intent.setFlags(67108864);
        if (c3560a != null) {
            intent.putExtra("EXTRA_KICK_OUT_DATA", c3560a.m18092f().toString());
        }
        m141336d1("Zalo", str2, str2, 3, PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent, AbstractC19601a.m102572b(1073741824)), null, null, null, null, null, true, null, "default");
    }

    /* renamed from: G */
    public void m141285G(String str, boolean z11) {
        int m118423d = AbstractC23088h5.m118423d("chat_1_1", str);
        if (!m141250h0().m141352j(m141250h0().m141338e0(m118423d)) || z11) {
            q.m141409f(m118423d);
            AbstractC23304d.f113409m.remove(Integer.valueOf(m118423d));
            AbstractC23775p0.m124198c("chat_1_1", str);
        }
        int m118423d2 = AbstractC23088h5.m118423d("chat_group", str);
        if (!m141250h0().m141352j(m141250h0().m141338e0(m118423d2)) || z11) {
            q.m141409f(m118423d2);
            AbstractC23304d.f113409m.remove(Integer.valueOf(m118423d2));
            AbstractC23775p0.m124198c("chat_group", str);
        }
    }

    /* renamed from: G1 */
    public void m141286G1(ContactProfile contactProfile, String str, String str2, String str3, String str4, MessageId messageId, boolean z11, boolean z12, int i11, String str5, boolean z13, boolean z14, C18000s1 c18000s1, boolean z15, o oVar, String str6, long j11, int i12) {
        try {
            C24559a.m127933c("[Message]", String.format("pushNotifMsg messageId=%s", messageId.m41046j()));
            int m118423d = AbstractC23088h5.m118423d(str6, contactProfile.f42434r);
            PendingIntent m141334c1 = m141334c1(contactProfile, contactProfile.m40374K0() ? "16021%02d" : "16000%02d", 0, m118423d);
            if (!z12) {
                m141250h0().m141271B(contactProfile.f42434r, false);
            }
            List m141353j0 = (z15 && m141223E0()) ? m141353j0(contactProfile, m118423d, messageId.m41046j(), oVar) : null;
            AbstractC23304d.f113409m.put(Integer.valueOf(m118423d), messageId.m41046j());
            Intent intent = new Intent("com.zing.zalo.intent.action.DELETE_NOTIFICATION");
            intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
            intent.putExtra("msgId", m118423d);
            PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), m118423d, intent, AbstractC19601a.m102572b(0));
            if (c18000s1 != null && c18000s1.f91174a == 0) {
                m141339e1(str, str2, str3, m118423d, m141334c1, broadcast, str4, null, contactProfile, null, false, z14, c18000s1, str6, contactProfile.f42434r);
                return;
            }
            m141249g1(str, str2, str3, m118423d, m141334c1, broadcast, contactProfile, z12, messageId, i11, str5, z13, z14, z11, m141353j0, oVar, str6, contactProfile.f42434r, j11, i12, null);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: H */
    public void m141287H(String str, boolean z11, List list) {
        int m118423d = AbstractC23088h5.m118423d("chat_1_1", str);
        if (!m141250h0().m141352j(m141250h0().m141338e0(m118423d)) || z11) {
            q.m141409f(m118423d);
            AbstractC23304d.f113409m.remove(Integer.valueOf(m118423d));
            list.add(new C25304a("chat_1_1", str));
        }
        int m118423d2 = AbstractC23088h5.m118423d("chat_group", str);
        if (!m141250h0().m141352j(m141250h0().m141338e0(m118423d2)) || z11) {
            q.m141409f(m118423d2);
            AbstractC23304d.f113409m.remove(Integer.valueOf(m118423d2));
            list.add(new C25304a("chat_group", str));
        }
    }

    /* renamed from: H0 */
    public boolean m141288H0(String str, MessageId messageId) {
        if (m141294J0(str, messageId, "miss_call_zalo") || m141294J0(str, messageId, "miss_call_stranger_zalo") || m141294J0(str, messageId, "miss_call_native")) {
            return true;
        }
        return m141294J0(str, messageId, "miss_call_stranger_native");
    }

    /* renamed from: H1 */
    public void m141289H1(ContactProfile contactProfile, String str, String str2, String str3, MessageId messageId, boolean z11) {
        try {
            String m103043x0 = AbstractC19646n0.m103043x0(contactProfile.f42434r);
            int m118423d = AbstractC23088h5.m118423d(m103043x0, contactProfile.f42434r);
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140781h(messageId).m140776b();
            m140776b.putBoolean("specialToShowPassCodeScreen", true);
            m140776b.putBoolean("fromNotification", true);
            m140776b.putString("uidNotif", contactProfile.f42434r);
            m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
            m140776b.putString("avtNotif", contactProfile.f42446v);
            if (contactProfile.m40374K0()) {
                m140776b.putString("SOURCE_ACTION", "15200");
            } else if (contactProfile.m40387S0()) {
                m140776b.putString("SOURCE_ACTION", "15300");
            } else {
                m140776b.putString("SOURCE_ACTION", "15100");
            }
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119004K(m140776b, true), AbstractC19601a.m102572b(134217728));
            AbstractC23304d.f113409m.put(Integer.valueOf(m118423d), String.valueOf(messageId.m41044h()));
            Intent intent = new Intent("com.zing.zalo.intent.action.DELETE_NOTIFICATION");
            intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
            intent.putExtra("msgId", m118423d);
            m141249g1(str, str2, str3, m118423d, activity, PendingIntent.getBroadcast(MainApplication.getAppContext(), m118423d, intent, AbstractC19601a.m102572b(0)), contactProfile, true, messageId, 0, "", false, true, z11, null, null, m103043x0, contactProfile.f42434r, 0L, 0, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: I */
    public void m141290I(int i11) {
        C1335e1 c1335e1 = this.f130683a;
        if (c1335e1 != null) {
            c1335e1.m6696b(i11);
        }
    }

    /* renamed from: I0 */
    public boolean m141291I0(String str, MessageId messageId) {
        if (m141294J0(str, messageId, "chat_1_1") || m141294J0(str, messageId, "chat_group")) {
            return true;
        }
        return m141294J0(str, messageId, "hidden");
    }

    /* renamed from: I1 */
    public void m141292I1(int i11, String str, String str2) {
        if (i11 == 0) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean("specialToShowPassCodeScreen", true);
            m141336d1("Zalo", str, str, 6, PendingIntent.getActivity(MainApplication.getAppContext(), 6, AbstractC23152n3.m119012O(NotificationView.class, bundle), AbstractC19601a.m102572b(134217728)), null, str2, null, null, null, true, null, "core_undefine");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: J */
    public void m141293J(String str) {
        m141310R(str, false, false, false);
    }

    /* renamed from: J0 */
    public boolean m141294J0(String str, MessageId messageId, String str2) {
        List list;
        int m118423d = AbstractC23088h5.m118423d(str2, str);
        synchronized (this.f130684b) {
            try {
                boolean z11 = false;
                if (this.f130684b.containsKey(str) && (list = (List) this.f130684b.get(str)) != null && !list.isEmpty()) {
                    if (str2.equals("chat_group_mention_me")) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((C17945a0) it.next()).m95135f9(messageId)) {
                                return true;
                            }
                        }
                    } else {
                        Map map = AbstractC23304d.f113409m;
                        if (map.containsKey(Integer.valueOf(m118423d)) && map.get(Integer.valueOf(m118423d)) != null) {
                            z11 = true;
                        }
                        return z11;
                    }
                }
                String str3 = (String) AbstractC23304d.f113409m.get(Integer.valueOf(m118423d));
                if (str3 == null || !messageId.m41041B(str, "", "", str3)) {
                    return false;
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: J1 */
    public synchronized void m141295J1(ContactProfile contactProfile, MessageId messageId, String str, String str2, String str3) {
        try {
            this.f130692j = contactProfile;
            this.f130693k = str;
            this.f130694l = str2;
            this.f130695m = str3;
            this.f130696n = messageId;
            TaskNonStickyExecutor.m50450b().m50452c(this.f130697o);
            TaskNonStickyExecutor.m50450b().m50454e(this.f130697o, 500L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K */
    public void m141296K(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                AbstractC23775p0.m124197b(str);
            } else {
                AbstractC23775p0.m124198c(str, str2);
            }
            m141320W(str, str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: K0 */
    public boolean m141297K0(String str) {
        if (!TextUtils.isEmpty(str) && (TextUtils.equals("miss_call_native", str) || TextUtils.equals("miss_call_stranger_native", str))) {
            return true;
        }
        return false;
    }

    /* renamed from: K1 */
    public void m141298K1(String str, String str2, String str3) {
        try {
            int m118423d = AbstractC23088h5.m118423d("message_warning", "");
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
            bundle.putBoolean("specialToShowPassCodeScreen", true);
            bundle.putInt("TAB_ID", C24099q0.m125958k().m125971o());
            m141343f1(str, str2, str3, PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119012O(MainTabView.class, bundle), AbstractC19601a.m102572b(134217728)), "message_warning", "");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: L */
    public void m141299L(List list) {
        AbstractC23775p0.m124200e(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25304a c25304a = (C25304a) it.next();
            m141320W(c25304a.m130961b(), c25304a.m130960a());
        }
    }

    /* renamed from: L1 */
    public void m141300L1(ContactProfile contactProfile, String str, String str2, JSONObject jSONObject, String str3) {
        try {
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            m140776b.putBoolean("specialToShowPassCodeScreen", true);
            m140776b.putBoolean("fromNotification", true);
            m140776b.putString("uidNotif", contactProfile.f42434r);
            m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
            m140776b.putString("avtNotif", contactProfile.f42446v);
            m140776b.putString("STR_EXTRA_NOTI_TYPE", "16010%02d");
            m140776b.putInt("INT_EXTRA_NOTI_ACTION_TYPE", 0);
            if (C21927m.m114302u().m114320R(contactProfile.f42434r)) {
                C21927m.m114302u().m114344l0(contactProfile.f42434r);
                return;
            }
            if (f130676t == null) {
                f130676t = new ArrayList();
            }
            m141363n();
            int m141392w0 = m141392w0(contactProfile.f42434r);
            int m118423d = AbstractC23088h5.m118423d(str3, String.valueOf(m141392w0));
            f130676t.add(Integer.valueOf(m118423d));
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119002J(m140776b), AbstractC19601a.m102572b(134217728));
            Bundle bundle = new Bundle(m140776b);
            bundle.remove("INT_EXTRA_NOTI_ACTION_TYPE");
            bundle.putInt("INT_EXTRA_NOTI_ACTION_TYPE", 2);
            m141336d1("Zalo", str, str, m141392w0, activity, null, str2, null, null, m141351i0(m118423d, 3, jSONObject, PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119002J(bundle), AbstractC19601a.m102572b(134217728)), null), true, null, str3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    public void m141301M(String str) {
        Hashtable hashtable;
        try {
            if (!TextUtils.isEmpty(str) && (hashtable = f130680x) != null && hashtable.size() != 0 && f130680x.containsKey(str)) {
                this.f130683a.m6696b(((Integer) f130680x.get(str)).intValue());
                f130680x.remove(str);
                m141337d2(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M1 */
    public void m141302M1(String str, String str2, String str3) {
        try {
            int m118607e = AbstractC23121k5.m118607e(Long.parseLong(str2), 6);
            Bundle bundle = new Bundle();
            bundle.putString("fid", str2);
            bundle.putString("ownerId", str3);
            bundle.putInt("fromSrc", 10);
            bundle.putBoolean("specialToShowPassCodeScreen", true);
            bundle.putInt("SHOW_WITH_FLAGS", 134217728);
            m141336d1("Zalo", str, str, m118607e, PendingIntent.getActivity(MainApplication.getAppContext(), m118607e, AbstractC23152n3.m119020S(FeedDetailsView.class, bundle, true), AbstractC19601a.m102572b(134217728)), null, "", null, null, null, true, null, "new_feed");
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N */
    public void m141303N(String str) {
        try {
            C19464a.m101790i(str, new HashMap(), 6);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N1 */
    public void m141304N1(ContactProfile contactProfile, String str, String str2, String str3, String str4, MessageId messageId, boolean z11) {
        String str5;
        boolean z12;
        String str6;
        int i11;
        try {
            if (!contactProfile.m40374K0()) {
                str5 = "chat_reaction";
            } else {
                str5 = "group_reaction";
            }
            int m118423d = AbstractC23088h5.m118423d(str5, contactProfile.f42434r);
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140781h(messageId).m140776b();
            m140776b.putBoolean("specialToShowPassCodeScreen", true);
            m140776b.putBoolean("fromNotification", true);
            m140776b.putString("uidNotif", contactProfile.f42434r);
            m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
            m140776b.putString("avtNotif", contactProfile.f42446v);
            String str7 = "";
            if (contactProfile.m40374K0()) {
                m140776b.putString("SOURCE_ACTION", "15200");
                Context appContext = MainApplication.getAppContext();
                if (contactProfile.m40363E0()) {
                    i11 = AbstractC8020f0.str_prefix_community_dpn;
                } else {
                    i11 = AbstractC8020f0.str_prefix_group_dpn;
                }
                str7 = appContext.getString(i11);
            } else if (contactProfile.m40387S0()) {
                m140776b.putString("SOURCE_ACTION", "15300");
            } else {
                m140776b.putString("SOURCE_ACTION", "15100");
            }
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119004K(m140776b, true), AbstractC19601a.m102572b(134217728));
            AbstractC23304d.f113409m.put(Integer.valueOf(m118423d), String.valueOf(m118423d));
            Intent intent = new Intent("com.zing.zalo.intent.action.DELETE_NOTIFICATION");
            intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
            intent.putExtra("msgId", m118423d);
            PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), m118423d, intent, AbstractC19601a.m102572b(0));
            if (!m141224G0(contactProfile) && !C18922m.m99141t().m99164y()) {
                z12 = true;
            } else {
                z12 = false;
            }
            String str8 = str7 + str;
            if (!contactProfile.m40374K0()) {
                str6 = "chat_reaction";
            } else {
                str6 = "group_reaction";
            }
            m141229O1(str8, str2, str3, activity, broadcast, contactProfile, str6, contactProfile.f42434r, z12, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: O */
    public void m141305O() {
        try {
            AbstractC23775p0.m124197b("memory");
            m141303N("memory");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public void m141306P() {
        try {
            AbstractC23775p0.m124197b("message_warning");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P1 */
    public void m141307P1(int i11, String str) {
        try {
            if (MainApplication.getAppContext() != null) {
                Intent m119014P = AbstractC23152n3.m119014P(ZaloWebView.class, ZaloWebView.m87089QR("market://details?id=" + MainApplication.getAppContext().getPackageName()), true);
                if (m119014P != null) {
                    m141336d1("Zalo", str, str, 5, PendingIntent.getActivity(MainApplication.getAppContext(), 5, m119014P, AbstractC19601a.m102572b(134217728)), null, null, null, null, null, true, null, "core_undefine");
                    return;
                }
                throw new Exception();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q */
    public void m141308Q(String str) {
        try {
            AbstractC23775p0.m124198c("new_feed", String.valueOf(AbstractC23121k5.m118607e(Long.parseLong(str), 6)));
        } catch (NumberFormatException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Q1 */
    public void m141309Q1(int i11, String str, String str2, String str3, String str4, PendingIntent pendingIntent) {
        if (i11 == 0) {
            return;
        }
        try {
            C23750d c23750d = new C23750d(CoreUtility.getAppContext());
            c23750d.mo6895w("Zalo");
            c23750d.mo6894v(str3);
            c23750d.m6893u(pendingIntent);
            c23750d.m124165v0(str);
            c23750d.m124164u0(str2);
            m141313S0(str4, c23750d);
            m141256k2(c23750d);
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: R */
    public void m141310R(String str, boolean z11, boolean z12, boolean z13) {
        String str2;
        try {
            C24559a.m127933c(f130674r, String.format("clearNotificationByUser uid=%s, forceClearAll=%s, clearFriendNotification=%s, clearCallNotification=%s", str, Boolean.valueOf(z11), Boolean.valueOf(z12), Boolean.valueOf(z13)));
            ArrayList arrayList = new ArrayList();
            if (AbstractC23309i.m120850D2()) {
                int m118423d = AbstractC23088h5.m118423d("chat_group_mention_me", str);
                q.m141409f(m118423d);
                AbstractC23304d.f113409m.remove(Integer.valueOf(m118423d));
                arrayList.add(new C25304a("chat_group_mention_me", str));
            }
            m141287H(str, z11, arrayList);
            int m118423d2 = AbstractC23088h5.m118423d("chat_urgent", str);
            q.m141409f(m118423d2);
            Map map = AbstractC23304d.f113409m;
            map.remove(Integer.valueOf(m118423d2));
            arrayList.add(new C25304a("chat_urgent", str));
            int m118423d3 = AbstractC23088h5.m118423d("hidden", str);
            q.m141409f(m118423d3);
            map.remove(Integer.valueOf(m118423d3));
            arrayList.add(new C25304a("hidden", str));
            int m118423d4 = AbstractC23088h5.m118423d("message_error", str);
            q.m141409f(m118423d4);
            map.remove(Integer.valueOf(m118423d4));
            arrayList.add(new C25304a("message_error", str));
            int m118423d5 = AbstractC23088h5.m118423d("chat_reaction", str);
            q.m141409f(m118423d5);
            map.remove(Integer.valueOf(m118423d5));
            arrayList.add(new C25304a("chat_reaction", str));
            int m118423d6 = AbstractC23088h5.m118423d("group_reaction", str);
            q.m141409f(m118423d6);
            map.remove(Integer.valueOf(m118423d6));
            arrayList.add(new C25304a("group_reaction", str));
            int m118423d7 = AbstractC23088h5.m118423d("miss_call_zalo", str);
            q.m141409f(m118423d7);
            map.remove(Integer.valueOf(m118423d7));
            arrayList.add(new C25304a("miss_call_zalo", str));
            int m118423d8 = AbstractC23088h5.m118423d("miss_call_stranger_zalo", str);
            q.m141409f(m118423d8);
            map.remove(Integer.valueOf(m118423d8));
            arrayList.add(new C25304a("miss_call_stranger_zalo", str));
            int m118423d9 = AbstractC23088h5.m118423d("miss_call_native", str);
            q.m141409f(m118423d9);
            map.remove(Integer.valueOf(m118423d9));
            arrayList.add(new C25304a("miss_call_native", str));
            int m118423d10 = AbstractC23088h5.m118423d("miss_call_stranger_native", str);
            q.m141409f(m118423d10);
            map.remove(Integer.valueOf(m118423d10));
            arrayList.add(new C25304a("miss_call_stranger_native", str));
            if (z12 && !TextUtils.isEmpty(str)) {
                int m141392w0 = m141392w0(str);
                arrayList.add(new C25304a("new_friend", String.valueOf(m141392w0)));
                arrayList.add(new C25304a("friend_accept", String.valueOf(m141392w0)));
                m141248f2(AbstractC23088h5.m118423d("new_friend", String.valueOf(m141392w0)));
                m141248f2(AbstractC23088h5.m118423d("friend_accept", String.valueOf(m141392w0)));
            }
            if (z13) {
                if (TextUtils.isEmpty(str)) {
                    str2 = null;
                } else {
                    str2 = str;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C25304a("miss_call_zalo", str2));
                arrayList2.add(new C25304a("miss_call_native", str2));
                arrayList2.add(new C25304a("miss_call_retry_401", str2));
                arrayList2.add(new C25304a("miss_call_retry_reject_or_busy", str2));
                arrayList2.add(new C25304a("retry_call_unsupport_vid", str2));
                arrayList2.add(new C25304a("retry_call_not_online", str2));
                m141299L(arrayList2);
                arrayList.addAll(arrayList2);
            }
            AbstractC23775p0.m124200e(arrayList);
            m141271B(str, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: R1 */
    public void m141311R1(ContactProfile contactProfile, String str, long j11) {
        String str2;
        if (contactProfile != null) {
            try {
                if (!TextUtils.isEmpty(contactProfile.f42434r) && !TextUtils.equals(contactProfile.f42434r, CoreUtility.f89233i)) {
                    String str3 = contactProfile.f42434r;
                    SpannableString m118429j = AbstractC23088h5.m118429j(str, 0, new StyleSpan(1));
                    Bundle bundle = new Bundle();
                    bundle.putString("userID", contactProfile.f42434r);
                    bundle.putBoolean("extra_from_noti_friend_update_profile_music", true);
                    PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), 0, AbstractC23152n3.m119020S(UserDetailsView.class, bundle, true), AbstractC19601a.m102572b(134217728));
                    Context appContext = MainApplication.getAppContext();
                    C23750d c23750d = new C23750d(CoreUtility.getAppContext());
                    c23750d.m124165v0("music_profile");
                    c23750d.m124164u0(str3);
                    if (Build.VERSION.SDK_INT >= 24 && AbstractC23309i.m122416t2() == 1) {
                        if (AbstractC23304d.f113330T0) {
                            str2 = "zalo_notify_alert";
                        } else {
                            str2 = "zalo_notify";
                        }
                        c23750d.m124159p0(str2);
                        c23750d.m6854G(false);
                    }
                    if (m118429j.length() > 20) {
                        AbstractC1364q.d dVar = new AbstractC1364q.d();
                        dVar.m6828h(m118429j);
                        c23750d.m6869V(dVar);
                    }
                    if (AbstractC23309i.m121790cf() == 1) {
                        c23750d.m6872Y(new long[]{0, 0});
                    }
                    c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                    c23750d.m6870W(m118429j);
                    c23750d.mo6895w(appContext.getString(AbstractC8020f0.app_name));
                    c23750d.mo6894v(m118429j);
                    c23750d.m6875a0(j11);
                    c23750d.m6893u(activity);
                    m141256k2(c23750d);
                    Bitmap decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.default_avatar);
                    if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                        C23528a c23528a = new C23528a(appContext);
                        int dimensionPixelSize = appContext.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width);
                        C3979l m123605k = c23528a.m123605k(contactProfile.f42446v, 0, EnumC25629a.DEFAULT);
                        if (m123605k != null && m123605k.m18839c() != null && !m123605k.m18839c().isRecycled()) {
                            c23750d.mo6855H(m141251i1(dimensionPixelSize, m123605k.m18839c()));
                            c23750d.m124147b0();
                            m141262r2();
                            return;
                        }
                        String str4 = contactProfile.f42446v;
                        c23750d.mo6855H(decodeResource);
                        RecyclingImageView recyclingImageView = new RecyclingImageView(appContext);
                        this.f130698p.add(recyclingImageView);
                        h hVar = new h(str4, dimensionPixelSize, c23750d, decodeResource);
                        hVar.m125757D3(dimensionPixelSize);
                        hVar.m125596P0(true);
                        hVar.m125602Z(true);
                        hVar.m125635v1(str4);
                        ((C23528a) c23528a.m123612r(recyclingImageView)).m123587K(hVar);
                        return;
                    }
                    c23750d.mo6855H(decodeResource);
                    c23750d.m124147b0();
                    m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: S */
    public boolean m141312S(String str) {
        boolean z11 = false;
        try {
            boolean z12 = false;
            for (String str2 : Arrays.asList("new_story", "story_reaction")) {
                try {
                    C20817r m108717c = C20817r.m108717c(str, false);
                    String m108911p = AbstractC20833z.m108911p(str2, m108717c);
                    if (m141250h0().m141272B0(str2, m108911p)) {
                        m141250h0().m141349h2(str2, m108911p);
                        z12 = true;
                    }
                    AbstractC20833z.m108904i(str2, m108717c);
                } catch (Exception e11) {
                    e = e11;
                    z11 = z12;
                    AbstractC23350e.m122778h(e);
                    return z11;
                }
            }
            return z12;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: S0 */
    public void m141313S0(String str, C23750d c23750d) {
        if (!TextUtils.isEmpty(str)) {
            Context appContext = MainApplication.getAppContext();
            C23528a c23528a = new C23528a(appContext);
            int m118659K = AbstractC23136l9.m118659K(R.dimen.notification_large_icon_width);
            C3979l m123605k = c23528a.m123605k(str, 0, EnumC25629a.DEFAULT);
            if (m123605k != null && m123605k.m18839c() != null) {
                c23750d.mo6855H(m141251i1(m118659K, m123605k.m18839c()));
                return;
            }
            c23750d.mo6855H(BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.icon));
            RecyclingImageView recyclingImageView = new RecyclingImageView(appContext);
            this.f130698p.add(recyclingImageView);
            e eVar = new e(str, m118659K, c23750d);
            eVar.m125757D3(m118659K);
            eVar.m125596P0(true);
            eVar.m125602Z(true);
            eVar.m125635v1(str);
            ((C23528a) c23528a.m123612r(recyclingImageView)).m123587K(eVar);
        }
    }

    /* renamed from: S1 */
    public void m141314S1(String str, String str2, String str3, JSONObject jSONObject, int i11, String str4) {
        Class cls;
        String str5;
        String str6 = "core_undefine";
        if (i11 == 1) {
            str6 = "suggest_friend";
        } else if (i11 == 2) {
            str6 = "friend_request";
        } else if (i11 == 3) {
            str6 = "friend_accept";
        }
        String str7 = str6;
        try {
            String[] strArr = new String[1];
            int m118423d = AbstractC23088h5.m118423d(str7, String.valueOf(10));
            List m141351i0 = m141351i0(m118423d, i11, jSONObject, null, strArr);
            Bundle bundle = new Bundle();
            bundle.putBoolean("specialToShowPassCodeScreen", true);
            bundle.putString("STR_EXTRA_NOTI_TYPE", strArr[0]);
            bundle.putInt("INT_EXTRA_NOTI_ACTION_TYPE", 0);
            if (i11 == 1) {
                cls = ListContactNativeView.class;
            } else {
                cls = SuggestFriendView.class;
            }
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119012O(cls, bundle), AbstractC19601a.m102572b(134217728));
            C32064p7 c32064p7 = new C32064p7();
            c32064p7.f147638a = true;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - AbstractC23309i.m120965G6() <= AbstractC23309i.m121788cd()) {
                c32064p7.f147638a = false;
            } else {
                AbstractC23309i.m121878er(currentTimeMillis);
            }
            if (!TextUtils.isEmpty(str4)) {
                str5 = str4;
            } else {
                str5 = "Zalo";
            }
            m141336d1(str5, str2, str2, 10, activity, null, str3, null, null, m141351i0, true, c32064p7, str7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: T0 */
    public void m141315T0(String str, C23750d c23750d, boolean z11) {
        if (!TextUtils.isEmpty(str)) {
            Context appContext = MainApplication.getAppContext();
            C23528a c23528a = new C23528a(appContext);
            int m118659K = AbstractC23136l9.m118659K(R.dimen.notification_large_icon_width);
            C3979l m123605k = c23528a.m123605k(str, 0, EnumC25629a.DEFAULT);
            if (m123605k != null && m123605k.m18839c() != null) {
                c23750d.mo6855H(m141253j1(m118659K, m123605k.m18839c(), z11));
                return;
            }
            c23750d.mo6855H(BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.icon));
            RecyclingImageView recyclingImageView = new RecyclingImageView(appContext);
            this.f130698p.add(recyclingImageView);
            g gVar = new g(str, m118659K, z11, c23750d);
            gVar.m125757D3(m118659K);
            gVar.m125596P0(true);
            gVar.m125602Z(true);
            gVar.m125635v1(str);
            ((C23528a) c23528a.m123612r(recyclingImageView)).m123587K(gVar);
        }
    }

    /* renamed from: T1 */
    public void m141316T1(String str) {
        try {
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), 0, AbstractC23152n3.m119020S(AboutView.class, null, true), AbstractC19601a.m102572b(134217728));
            C23750d c23750d = new C23750d(CoreUtility.getAppContext());
            c23750d.mo6895w(CoreUtility.getAppContext().getString(AbstractC8020f0.str_title_notify_update_version));
            c23750d.m6893u(activity);
            c23750d.mo6894v(CoreUtility.getAppContext().getString(AbstractC8020f0.str_des_notify_update_version, str));
            c23750d.m6870W(CoreUtility.getAppContext().getString(AbstractC8020f0.str_des_notify_update_version, str));
            m141256k2(c23750d);
            c23750d.m124147b0();
            m141262r2();
            AbstractC0924m0.m2975Cp(System.currentTimeMillis());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U1 */
    public void m141317U1(long j11, String str, String str2, String str3, PendingIntent pendingIntent, boolean z11) {
        if (pendingIntent != null) {
            try {
                C32064p7 c32064p7 = new C32064p7();
                c32064p7.f147641d = j11;
                c32064p7.f147642e = z11;
                m141336d1(str, str2, str, 6, pendingIntent, null, str3, null, null, null, true, c32064p7, "core_undefine");
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: V */
    String m141318V(String str, String str2) {
        return str + "_" + str2;
    }

    /* renamed from: V1 */
    public void m141319V1(String str, String str2, PendingIntent pendingIntent, String str3, String str4) {
        C23750d c23750d = new C23750d(MainApplication.getAppContext());
        c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
        c23750d.m6870W(MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_title));
        c23750d.m6875a0(System.currentTimeMillis());
        c23750d.m6886n(true);
        c23750d.mo6895w(str);
        c23750d.mo6894v(str2);
        c23750d.m6890r(AbstractC23136l9.m118639A(AbstractC16801x.notification_app_icon_background_color));
        c23750d.m124165v0(str3);
        c23750d.m124164u0(str4);
        c23750d.m6893u(pendingIntent);
        if (Build.VERSION.SDK_INT >= 24 && AbstractC23309i.m122416t2() == 1) {
            c23750d.m124159p0("zalo_notify");
            c23750d.m6854G(false);
        }
        c23750d.m124147b0();
    }

    /* renamed from: W */
    public void m141320W(String str, String str2) {
        try {
            synchronized (this.f130690h) {
                try {
                    Map map = this.f130699q;
                    if (map != null && !map.isEmpty()) {
                        if (!this.f130699q.containsKey(str)) {
                            return;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            this.f130699q.remove(str);
                        } else if (((HashSet) this.f130699q.get(str)).contains(str2)) {
                            ((HashSet) this.f130699q.get(str)).remove(str2);
                        }
                        AbstractC23304d.f113409m.remove(Integer.valueOf(AbstractC23088h5.m118423d(str, str2)));
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W0 */
    public PendingIntent m141321W0(ContactProfile contactProfile, String str, int i11, int i12) {
        return PendingIntent.getBroadcast(MainApplication.getAppContext(), i11, m141235U0("android.intent.action.ACTION_QUICK_MARK_AS_READ", contactProfile.f42434r, i11, str, 5), AbstractC19601a.m102572b(i12));
    }

    /* renamed from: W1 */
    public int m141322W1(int i11, String str) {
        if (f130680x == null) {
            f130680x = new Hashtable();
        }
        if (i11 == -1) {
            if (f130680x.containsKey(str)) {
                return ((Integer) f130680x.get(str)).intValue();
            }
            int hashCode = UUID.randomUUID().hashCode();
            f130680x.put(str, Integer.valueOf(hashCode));
            return hashCode;
        }
        f130680x.put(str, Integer.valueOf(i11));
        return i11;
    }

    /* renamed from: X0 */
    Bundle m141323X0() {
        ActivityOptions makeBasic;
        makeBasic = ActivityOptions.makeBasic();
        makeBasic.setPendingIntentBackgroundActivityStartMode(1);
        return makeBasic.toBundle();
    }

    /* renamed from: X1 */
    public void m141324X1(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (f130681y == null) {
                f130681y = Collections.synchronizedSet(new HashSet());
            }
            f130681y.add(str);
        }
    }

    /* renamed from: Y0 */
    public PendingIntent m141325Y0(ContactProfile contactProfile, String str, int i11, String str2, int i12, C32079q8 c32079q8) {
        Intent m141236V0 = m141236V0("android.intent.action.ACTION_QUICK_REACT_MESSAGE", contactProfile.f42434r, i11, str, 3);
        m141236V0.putExtra("EXTRA_REACT_TYPE", c32079q8.f147783b);
        m141236V0.putExtra("EXTRA_REACT_ICON", c32079q8.f147784c);
        m141236V0.putExtra("EXTRA_GLOBAL_MSG_ID", str2);
        if (Build.VERSION.SDK_INT >= 34) {
            return PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(i12), m141323X0());
        }
        return PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(i12));
    }

    /* renamed from: Y1 */
    public void m141326Y1(int i11, Bundle bundle) {
        boolean containsKey;
        JSONArray jSONArray;
        int length;
        try {
            String string = bundle.getString("extra_notification_uid_sender");
            synchronized (this.f130684b) {
                containsKey = this.f130684b.containsKey(string);
            }
            if (!containsKey) {
                m141238Y(string, bundle);
                String string2 = bundle.getString("extra_notification_list_msg_info");
                if (TextUtils.isEmpty(string2) || (length = (jSONArray = new JSONArray(string2)).length()) <= 0) {
                    return;
                }
                AbstractC23304d.f113409m.put(Integer.valueOf(i11), ((JSONObject) jSONArray.get(length - 1)).getString("id"));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: Z */
    public boolean m141327Z() {
        return this.f130686d.isEmpty();
    }

    /* renamed from: Z0 */
    public PendingIntent m141328Z0(ContactProfile contactProfile, String str, int i11, int i12, C32079q8 c32079q8) {
        Intent m141236V0 = m141236V0("android.intent.action.ACTION_QUICK_REPLY_EMOJI_MESSAGE", contactProfile.f42434r, i11, str, 4);
        m141236V0.putExtra("EXTRA_REPLY_EMOJI_TEXT", c32079q8.f147785d);
        if (Build.VERSION.SDK_INT >= 34) {
            return PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(i12), m141323X0());
        }
        return PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(i12));
    }

    /* renamed from: a0 */
    public boolean m141329a0() {
        if (AbstractC26683d.f126391B && !AbstractC23165o5.m119333b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a1 */
    public PendingIntent m141330a1(ContactProfile contactProfile, String str, int i11, int i12) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 24) {
            Intent m141236V0 = m141236V0("android.intent.action.QUICK_REPLY_MESSAGE", contactProfile.f42434r, i11, str, 2);
            if (i13 >= 34) {
                return PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(i12), m141323X0());
            }
            return PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(i12));
        }
        return m141334c1(contactProfile, str, 2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x015f A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:13:0x0036, B:16:0x009d, B:17:0x00b4, B:20:0x00c8, B:22:0x0153, B:23:0x0159, B:25:0x015f, B:27:0x016e, B:29:0x01ea, B:31:0x01f2, B:34:0x0198, B:36:0x01a9, B:39:0x01fa, B:43:0x00e9, B:45:0x00f1, B:46:0x0103, B:50:0x010e, B:52:0x0116, B:53:0x00a3, B:55:0x00a9, B:56:0x00af), top: B:12:0x0036 }] */
    /* renamed from: a2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m141331a2(ContactProfile contactProfile, int i11, String str, String str2, boolean z11, String str3, List list) {
        String str4;
        PendingIntent pendingIntent;
        PendingIntent activity;
        PendingIntent activity2;
        int i12;
        ArrayList arrayList;
        Bundle bundle;
        n nVar;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4) {
                if (i11 == 5) {
                    str4 = "retry_call_unsupport_vid";
                } else {
                    if (i11 != 6) {
                        return false;
                    }
                    str4 = "retry_call_not_online";
                }
            } else {
                str4 = "miss_call_retry_reject_or_busy";
            }
        } else {
            str4 = "miss_call_retry_401";
        }
        String str5 = str4;
        try {
            String str6 = contactProfile.f42434r;
            m141296K("miss_call_zalo", str6);
            int m141244c0 = m141244c0(str5, str6);
            Intent intent = new Intent("com.zing.zalo.intent.action.CALL_DELETE_NOTIFICATION");
            intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
            intent.putExtra("notifyType", str5);
            intent.putExtra("subType", str6);
            PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), m141244c0, intent, AbstractC19601a.m102572b(0));
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            m140776b.putBoolean("specialToShowPassCodeScreen", true);
            m140776b.putBoolean("fromNotification", true);
            m140776b.putString("uidNotif", contactProfile.f42434r);
            m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
            m140776b.putString("avtNotif", contactProfile.f42446v);
            if (contactProfile.m40374K0()) {
                m140776b.putString("SOURCE_ACTION", "15200");
            } else if (contactProfile.m40387S0()) {
                m140776b.putString("SOURCE_ACTION", "15300");
            } else {
                m140776b.putString("SOURCE_ACTION", "15100");
            }
            if ("action.open.callback".equalsIgnoreCase(str3)) {
                Intent intent2 = new Intent("com.zing.zalo.action.NOTI_CALLBACK");
                intent2.putExtra("contactProfile", contactProfile);
                intent2.putExtra("notiType", str5);
                intent2.putExtra("subType", str6);
                intent2.putExtra("callType", z11);
                activity2 = PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, intent2, AbstractC19601a.m102571a(134217728));
            } else if ("action.open.chat".equalsIgnoreCase(str3)) {
                activity2 = PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, AbstractC23152n3.m119004K(m140776b, true), AbstractC19601a.m102572b(134217728));
            } else {
                if ("action.open.tab.call".equalsIgnoreCase(str3) || !"action.open.tab.message".equalsIgnoreCase(str3)) {
                    pendingIntent = broadcast;
                    activity = null;
                } else {
                    Bundle bundle2 = new Bundle();
                    pendingIntent = broadcast;
                    bundle2.putInt("SHOW_WITH_FLAGS", 16777216);
                    bundle2.putBoolean("specialToShowPassCodeScreen", true);
                    bundle2.putInt("TAB_ID", C24099q0.m125958k().m125971o());
                    bundle2.putBoolean(MessagesView.f63531l3, true);
                    activity = PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, AbstractC23152n3.m119012O(MainTabView.class, bundle2), AbstractC19601a.m102572b(1073741824));
                }
                ArrayList arrayList2 = new ArrayList();
                i12 = 0;
                while (i12 < list.size()) {
                    PendingIntent pendingIntent2 = activity;
                    if (((Integer) list.get(i12)).intValue() == 1) {
                        bundle = m140776b;
                        arrayList = arrayList2;
                        nVar = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.notification_btn_reply), AbstractC16803z.ic_callreply_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, AbstractC23152n3.m119004K(m140776b, true), AbstractC19601a.m102572b(134217728)));
                    } else {
                        arrayList = arrayList2;
                        bundle = m140776b;
                        if (((Integer) list.get(i12)).intValue() == 2) {
                            Intent intent3 = new Intent("com.zing.zalo.action.NOTI_CALLBACK");
                            intent3.setClass(MainApplication.getAppContext(), IntentHandlerActivity.class);
                            intent3.putExtra("contactProfile", contactProfile);
                            intent3.putExtra("notiType", str5);
                            intent3.putExtra("subType", str6);
                            intent3.putExtra("callType", z11);
                            nVar = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.notification_btn_callback), AbstractC16803z.ic_answer_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, intent3, AbstractC19601a.m102572b(134217728)));
                        } else {
                            nVar = null;
                        }
                    }
                    if (nVar != null) {
                        arrayList2 = arrayList;
                        arrayList2.add(nVar);
                    } else {
                        arrayList2 = arrayList;
                    }
                    i12++;
                    activity = pendingIntent2;
                    m140776b = bundle;
                }
                m141387u2(str5, str6, str, str2, str2, activity, pendingIntent, contactProfile.f42446v, null, arrayList2, AbstractC16803z.ic_miss_call_audio);
                return true;
            }
            activity = activity2;
            pendingIntent = broadcast;
            ArrayList arrayList22 = new ArrayList();
            i12 = 0;
            while (i12 < list.size()) {
            }
            m141387u2(str5, str6, str, str2, str2, activity, pendingIntent, contactProfile.f42446v, null, arrayList22, AbstractC16803z.ic_miss_call_audio);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: b0 */
    public void m141332b0(String str, MessageId messageId, String str2) {
        TaskNonStickyExecutor.m50450b().m50453d(new Runnable() { // from class: vg.a6

            /* renamed from: p */
            public final /* synthetic */ String f130633p;

            /* renamed from: q */
            public final /* synthetic */ MessageId f130634q;

            /* renamed from: r */
            public final /* synthetic */ String f130635r;

            public /* synthetic */ RunnableC28013a6(String str3, MessageId messageId2, String str22) {
                r1 = str3;
                r2 = messageId2;
                r3 = str22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C28023b6.q.m141413j(r1, r2, r3);
            }
        });
    }

    /* renamed from: b2 */
    public void m141333b2() {
        try {
            Map map = this.f130691i;
            if (map != null) {
                for (String str : map.keySet()) {
                    Iterator it = ((HashMap) this.f130691i.get(str)).keySet().iterator();
                    while (it.hasNext()) {
                        m141347h(str, (String) it.next());
                    }
                }
                this.f130691i.clear();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c1 */
    public PendingIntent m141334c1(ContactProfile contactProfile, String str, int i11, int i12) {
        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
        m140776b.putBoolean("specialToShowPassCodeScreen", true);
        m140776b.putBoolean("fromNotification", true);
        m140776b.putString("uidNotif", contactProfile.f42434r);
        m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
        m140776b.putString("avtNotif", contactProfile.f42446v);
        if (contactProfile.m40374K0()) {
            m140776b.putString("SOURCE_ACTION", "15200");
        } else if (contactProfile.m40387S0()) {
            m140776b.putString("SOURCE_ACTION", "15300");
        } else {
            m140776b.putString("SOURCE_ACTION", "15100");
        }
        m140776b.putString("STR_EXTRA_NOTI_TYPE", str);
        m140776b.putInt("INT_EXTRA_NOTI_ACTION_TYPE", i11);
        Intent m119004K = AbstractC23152n3.m119004K(m140776b, true);
        if (Build.VERSION.SDK_INT >= 34) {
            PendingIntent.getActivity(MainApplication.getAppContext(), i12 + i11, m119004K, AbstractC19601a.m102572b(134217728), m141323X0());
        }
        return PendingIntent.getActivity(MainApplication.getAppContext(), i12 + i11, m119004K, AbstractC19601a.m102572b(134217728));
    }

    /* renamed from: c2 */
    public void m141335c2(String str) {
        AbstractC23350e.m122772b("BubbleNotificationSet.remove " + str + " - contains " + this.f130686d.contains(str), new Object[0]);
        this.f130686d.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016b A[Catch: all -> 0x0025, Exception -> 0x0028, TryCatch #2 {Exception -> 0x0028, all -> 0x0025, blocks: (B:3:0x000e, B:8:0x002e, B:11:0x0035, B:13:0x0051, B:15:0x0055, B:17:0x0061, B:19:0x00c1, B:20:0x00c4, B:22:0x00ca, B:25:0x00d2, B:27:0x00da, B:29:0x00ec, B:32:0x00e8, B:34:0x00ef, B:36:0x00fd, B:37:0x0108, B:39:0x010e, B:41:0x011c, B:43:0x0122, B:44:0x0134, B:46:0x016b, B:47:0x016f, B:49:0x0175, B:51:0x017d, B:53:0x0181, B:55:0x0187, B:58:0x01c5, B:63:0x01de, B:65:0x01e6, B:67:0x01ff, B:69:0x0205, B:70:0x0218, B:72:0x0227, B:73:0x0231, B:75:0x0264, B:77:0x026c, B:78:0x026f, B:83:0x005b, B:86:0x001f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e6 A[Catch: all -> 0x0025, Exception -> 0x0028, TryCatch #2 {Exception -> 0x0028, all -> 0x0025, blocks: (B:3:0x000e, B:8:0x002e, B:11:0x0035, B:13:0x0051, B:15:0x0055, B:17:0x0061, B:19:0x00c1, B:20:0x00c4, B:22:0x00ca, B:25:0x00d2, B:27:0x00da, B:29:0x00ec, B:32:0x00e8, B:34:0x00ef, B:36:0x00fd, B:37:0x0108, B:39:0x010e, B:41:0x011c, B:43:0x0122, B:44:0x0134, B:46:0x016b, B:47:0x016f, B:49:0x0175, B:51:0x017d, B:53:0x0181, B:55:0x0187, B:58:0x01c5, B:63:0x01de, B:65:0x01e6, B:67:0x01ff, B:69:0x0205, B:70:0x0218, B:72:0x0227, B:73:0x0231, B:75:0x0264, B:77:0x026c, B:78:0x026f, B:83:0x005b, B:86:0x001f), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0264 A[Catch: all -> 0x0025, Exception -> 0x0028, TryCatch #2 {Exception -> 0x0028, all -> 0x0025, blocks: (B:3:0x000e, B:8:0x002e, B:11:0x0035, B:13:0x0051, B:15:0x0055, B:17:0x0061, B:19:0x00c1, B:20:0x00c4, B:22:0x00ca, B:25:0x00d2, B:27:0x00da, B:29:0x00ec, B:32:0x00e8, B:34:0x00ef, B:36:0x00fd, B:37:0x0108, B:39:0x010e, B:41:0x011c, B:43:0x0122, B:44:0x0134, B:46:0x016b, B:47:0x016f, B:49:0x0175, B:51:0x017d, B:53:0x0181, B:55:0x0187, B:58:0x01c5, B:63:0x01de, B:65:0x01e6, B:67:0x01ff, B:69:0x0205, B:70:0x0218, B:72:0x0227, B:73:0x0231, B:75:0x0264, B:77:0x026c, B:78:0x026f, B:83:0x005b, B:86:0x001f), top: B:2:0x000e }] */
    /* renamed from: d1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m141336d1(String str, String str2, String str3, int i11, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str4, String str5, ContactProfile contactProfile, List list, boolean z11, C32064p7 c32064p7, String str6) {
        C23750d c23750d;
        C23750d c23750d2;
        int i12;
        try {
            Context applicationContext = MainApplication.getAppContext().getApplicationContext();
            boolean z12 = (AbstractC23304d.f113330T0 && z11) || (c32064p7 != null && c32064p7.f147638a);
            boolean z13 = c32064p7 != null && c32064p7.f147642e;
            C23750d c23750d3 = new C23750d(CoreUtility.getAppContext());
            m141244c0(str6, String.valueOf(i11));
            c23750d3.m124165v0(str6);
            c23750d3.m124164u0(String.valueOf(i11));
            if (c32064p7 != null && (i12 = c32064p7.f147639b) > 0) {
                c23750d3.m6866S(i12);
            } else {
                c23750d3.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            }
            c23750d3.m6870W(str3).m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light)).m6865R(true).mo6860M(false).m6890r(applicationContext.getResources().getColor(AbstractC16801x.notification_app_icon_background_color)).m6850B(pendingIntent2).m6886n(true).mo6895w(str).m6893u(pendingIntent).mo6894v(str2);
            if (z13) {
                c23750d3.m124169z0();
            }
            if (Build.VERSION.SDK_INT >= 24 && AbstractC23309i.m122416t2() == 1) {
                if (c32064p7 != null && !TextUtils.isEmpty(c32064p7.f147640c)) {
                    c23750d3.m124159p0(c32064p7.f147640c);
                } else {
                    c23750d3.m124159p0(z12 ? "zalo_notify_alert" : "zalo_notify");
                }
                c23750d3.m6854G(false);
            }
            c23750d3.m124160q0(z12);
            m141256k2(c23750d3);
            if (str2.length() > 20) {
                AbstractC1364q.d dVar = new AbstractC1364q.d();
                dVar.m6828h(str2);
                c23750d3.m6869V(dVar);
            }
            if (!TextUtils.isEmpty(str5)) {
                C23528a c23528a = new C23528a(applicationContext);
                C3979l m123605k = c23528a.m123605k(str5, 0, EnumC25629a.DEFAULT);
                if (m123605k != null && m123605k.m18839c() != null) {
                    AbstractC1364q.c cVar = new AbstractC1364q.c(c23750d3);
                    cVar.m6818i(m123605k.m18839c());
                    cVar.m6820k(str2);
                } else {
                    RecyclingImageView recyclingImageView = new RecyclingImageView(applicationContext);
                    this.f130698p.add(recyclingImageView);
                    c23750d = c23750d3;
                    a aVar = new a(str5, c23750d3, str2, c23750d3);
                    aVar.m125757D3(AbstractC23006a0.m117871A());
                    aVar.m125596P0(true);
                    aVar.m125602Z(true);
                    aVar.m125635v1(str5);
                    ((C23528a) c23528a.m123612r(recyclingImageView)).m123587K(aVar);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            n nVar = (n) it.next();
                            if (nVar == null || nVar.f130759c == null) {
                                c23750d2 = c23750d;
                            } else if (nVar.f130760d == n.f130754f) {
                                c23750d2 = c23750d;
                                c23750d2.m6876b(new AbstractC1364q.b.a(AbstractC16803z.ic_reply_icon, nVar.m141400a(AbstractC1388a.m6961c(applicationContext, AbstractC16801x.notification_app_icon_background_color)), nVar.f130759c).m6810a(new C1347i1.d("com.zing.zalo.intent.action.EXTRA_MESSAGE_QUICK_REPLY").m6770b(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.chat_default_text)).m6769a()).m6811b());
                            } else {
                                c23750d2 = c23750d;
                                c23750d2.m6874a(nVar.f130758b, nVar.m141400a(AbstractC1388a.m6961c(applicationContext, AbstractC16801x.notification_app_icon_background_color)), nVar.f130759c);
                            }
                            c23750d = c23750d2;
                        }
                    }
                    C23750d c23750d4 = c23750d;
                    if (!TextUtils.isEmpty(str4)) {
                        C23528a c23528a2 = new C23528a(applicationContext);
                        int dimensionPixelSize = applicationContext.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width);
                        C3979l m123605k2 = c23528a2.m123605k(str4, 0, EnumC25629a.DEFAULT);
                        if (m123605k2 != null && m123605k2.m18839c() != null) {
                            m141358l2(c23750d4, m123605k2.m18839c(), contactProfile);
                            c23750d4.mo6855H(m141251i1(dimensionPixelSize, m123605k2.m18839c()));
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("load url:");
                            sb2.append(str4);
                            if (!z13) {
                                Bitmap m141267y0 = m141267y0();
                                m141358l2(c23750d4, m141267y0, contactProfile);
                                c23750d4.mo6855H(m141267y0);
                            }
                            RecyclingImageView recyclingImageView2 = new RecyclingImageView(applicationContext);
                            this.f130698p.add(recyclingImageView2);
                            b bVar = new b(str4, c23750d4, contactProfile, dimensionPixelSize);
                            bVar.m125757D3(dimensionPixelSize);
                            bVar.m125596P0(true);
                            bVar.m125602Z(true);
                            bVar.m125635v1(str4);
                            ((C23528a) c23528a2.m123612r(recyclingImageView2)).m123587K(bVar);
                        }
                    }
                    if (c32064p7 != null) {
                        long j11 = c32064p7.f147641d;
                        if (j11 > 0) {
                            c23750d4.m124168y0(j11);
                        }
                    }
                    c23750d4.m124147b0();
                    m141262r2();
                }
            }
            c23750d = c23750d3;
            if (list != null) {
            }
            C23750d c23750d42 = c23750d;
            if (!TextUtils.isEmpty(str4)) {
            }
            if (c32064p7 != null) {
            }
            c23750d42.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            e11.printStackTrace();
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    /* renamed from: d2 */
    public void m141337d2(String str) {
        Set set;
        if (!TextUtils.isEmpty(str) && (set = f130681y) != null) {
            set.remove(str);
        }
    }

    /* renamed from: e0 */
    public String m141338e0(int i11) {
        return i11 + "_" + CoreUtility.f89233i;
    }

    /* renamed from: e1 */
    void m141339e1(String str, String str2, String str3, int i11, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str4, String str5, ContactProfile contactProfile, n[] nVarArr, boolean z11, boolean z12, C18000s1 c18000s1, String str6, String str7) {
        PendingIntent pendingIntent3;
        try {
            Context applicationContext = MainApplication.getAppContext().getApplicationContext();
            C23750d c23750d = new C23750d(applicationContext);
            c23750d.m124165v0(str6);
            c23750d.m124164u0(str7);
            c23750d.m124160q0(z12);
            if (z11) {
                c23750d.m6866S(AbstractC16803z.ic_miss_call_audio);
            } else {
                c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            }
            m141256k2(c23750d);
            if (c18000s1 != null) {
                c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo).m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light)).m6865R(true).mo6860M(false).m6890r(applicationContext.getResources().getColor(AbstractC16801x.notification_app_icon_background_color)).m6850B(pendingIntent2).m6886n(true).mo6895w(c18000s1.f91177d).m6893u(pendingIntent).mo6894v(c18000s1.f91179f);
                if (AbstractC23309i.m121790cf() == 1) {
                    c23750d.m6872Y(new long[]{0, 0});
                }
                RemoteViews remoteViews = new RemoteViews(MainApplication.getAppContext().getPackageName(), C24913b.m129583c().mo129582b(applicationContext) == 0 ? AbstractC7409c0.noti_custom_weather_rich_content_white_bg : AbstractC7409c0.noti_custom_weather_rich_content_black_bg);
                remoteViews.setViewVisibility(AbstractC6918a0.description, !TextUtils.isEmpty(c18000s1.f91179f) ? 0 : 8);
                remoteViews.setViewVisibility(AbstractC6918a0.dateTime, TextUtils.isEmpty(c18000s1.f91178e) ? 8 : 0);
                remoteViews.setTextViewText(AbstractC6918a0.celsius, String.valueOf(c18000s1.f91175b));
                remoteViews.setTextViewText(AbstractC6918a0.title, c18000s1.f91177d);
                remoteViews.setTextViewText(AbstractC6918a0.dateTime, c18000s1.f91178e);
                remoteViews.setTextViewText(AbstractC6918a0.description, c18000s1.f91179f);
                remoteViews.setTextViewText(AbstractC6918a0.txtNotiTime, new SimpleDateFormat("h:mm a").format(Calendar.getInstance().getTime()));
                String str8 = !TextUtils.isEmpty(c18000s1.f91176c) ? c18000s1.f91176c : str4;
                if (!TextUtils.isEmpty(str8)) {
                    C23528a c23528a = new C23528a(applicationContext);
                    int dimensionPixelSize = applicationContext.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width);
                    C3979l m123605k = c23528a.m123605k(str8, 0, EnumC25629a.DEFAULT);
                    if (m123605k != null && m123605k.m18839c() != null) {
                        m141358l2(c23750d, m123605k.m18839c(), contactProfile);
                        remoteViews.setImageViewBitmap(AbstractC6918a0.icon, m141251i1(dimensionPixelSize, m123605k.m18839c()));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("load url:");
                        sb2.append(str8);
                        Bitmap decodeResource = BitmapFactory.decodeResource(applicationContext.getResources(), AbstractC25495a.m132085j(contactProfile.f42434r) ? AbstractC16803z.icn_weather_empty : AbstractC16803z.icon);
                        m141358l2(c23750d, decodeResource, contactProfile);
                        remoteViews.setImageViewBitmap(AbstractC6918a0.icon, decodeResource);
                        RecyclingImageView recyclingImageView = new RecyclingImageView(applicationContext);
                        this.f130698p.add(recyclingImageView);
                        i iVar = new i(str8, c23750d, contactProfile, dimensionPixelSize, remoteViews);
                        iVar.m125757D3(dimensionPixelSize);
                        iVar.m125596P0(true);
                        iVar.m125602Z(true);
                        iVar.m125635v1(str8);
                        ((C23528a) c23528a.m123612r(recyclingImageView)).m123587K(iVar);
                    }
                } else {
                    remoteViews.setImageViewBitmap(AbstractC6918a0.icon, BitmapFactory.decodeResource(applicationContext.getResources(), AbstractC25495a.m132085j(contactProfile.f42434r) ? AbstractC16803z.icn_weather_empty : AbstractC16803z.icon));
                }
                c23750d.m6897y(remoteViews);
                c23750d.m6896x(remoteViews);
                c23750d.m6898z(remoteViews);
            } else {
                c23750d.m6870W(str3).m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light)).m6865R(true).mo6860M(false).m6890r(applicationContext.getResources().getColor(AbstractC16801x.notification_app_icon_background_color)).m6850B(pendingIntent2).m6886n(true).mo6895w(str).m6893u(pendingIntent).mo6894v(str2);
                if (str2.length() > 20) {
                    AbstractC1364q.d dVar = new AbstractC1364q.d();
                    dVar.m6828h(str2);
                    c23750d.m6869V(dVar);
                }
                if (!TextUtils.isEmpty(str5)) {
                    C23528a c23528a2 = new C23528a(applicationContext);
                    C3979l m123605k2 = c23528a2.m123605k(str5, 0, EnumC25629a.DEFAULT);
                    if (m123605k2 != null && m123605k2.m18839c() != null) {
                        AbstractC1364q.c cVar = new AbstractC1364q.c(c23750d);
                        cVar.m6818i(m123605k2.m18839c());
                        cVar.m6820k(str2);
                    } else {
                        RecyclingImageView recyclingImageView2 = new RecyclingImageView(applicationContext);
                        this.f130698p.add(recyclingImageView2);
                        j jVar = new j(str5, c23750d, str2);
                        jVar.m125757D3(AbstractC23006a0.m117871A());
                        jVar.m125596P0(true);
                        jVar.m125602Z(true);
                        jVar.m125635v1(str5);
                        ((C23528a) c23528a2.m123612r(recyclingImageView2)).m123587K(jVar);
                    }
                }
                if (AbstractC23309i.m121790cf() == 1) {
                    c23750d.m6872Y(new long[]{0, 0});
                }
                if (nVarArr != null) {
                    for (n nVar : nVarArr) {
                        if (nVar != null && (pendingIntent3 = nVar.f130759c) != null) {
                            c23750d.m6874a(nVar.f130758b, nVar.f130757a, pendingIntent3);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str4)) {
                    C23528a c23528a3 = new C23528a(applicationContext);
                    int dimensionPixelSize2 = applicationContext.getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width);
                    C3979l m123605k3 = c23528a3.m123605k(str4, 0, EnumC25629a.DEFAULT);
                    if (m123605k3 != null && m123605k3.m18839c() != null) {
                        m141358l2(c23750d, m123605k3.m18839c(), contactProfile);
                        c23750d.mo6855H(m141251i1(dimensionPixelSize2, m123605k3.m18839c()));
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("load url:");
                        sb3.append(str4);
                        Bitmap m141267y0 = m141267y0();
                        m141358l2(c23750d, m141267y0, contactProfile);
                        c23750d.mo6855H(m141267y0);
                        RecyclingImageView recyclingImageView3 = new RecyclingImageView(applicationContext);
                        this.f130698p.add(recyclingImageView3);
                        k kVar = new k(str4, c23750d, contactProfile, dimensionPixelSize2);
                        kVar.m125757D3(dimensionPixelSize2);
                        kVar.m125596P0(true);
                        kVar.m125602Z(true);
                        kVar.m125635v1(str4);
                        ((C23528a) c23528a3.m123612r(recyclingImageView3)).m123587K(kVar);
                    }
                }
            }
            AbstractC23775p0.m124214s(c23750d);
            m141262r2();
        } catch (Exception e11) {
            e11.printStackTrace();
        } catch (OutOfMemoryError e12) {
            e12.printStackTrace();
        }
    }

    /* renamed from: e2 */
    boolean m141340e2(String str) {
        List list;
        boolean z11 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            synchronized (this.f130684b) {
                try {
                    if (this.f130684b.containsKey(str) && (list = (List) this.f130684b.get(str)) != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C17945a0 c17945a0 = (C17945a0) it.next();
                            if (m141264t2(c17945a0.m95141g4()) && c17945a0.m95141g4() <= SystemClock.elapsedRealtime()) {
                                it.remove();
                                z11 = true;
                            }
                        }
                    }
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return z11;
    }

    /* renamed from: f */
    public void m141341f(String str) {
        AbstractC23350e.m122772b("BubbleNotificationSet.add " + str + " - contains " + this.f130686d.contains(str), new Object[0]);
        this.f130686d.add(str);
    }

    /* renamed from: f0 */
    public String m141342f0(C23750d c23750d) {
        return m141338e0(c23750d.m124151g0());
    }

    /* renamed from: f1 */
    void m141343f1(String str, String str2, String str3, PendingIntent pendingIntent, String str4, String str5) {
        try {
            Context applicationContext = MainApplication.getAppContext().getApplicationContext();
            C23750d c23750d = new C23750d(applicationContext);
            c23750d.m124165v0(str4);
            c23750d.m124164u0(str5);
            c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
            c23750d.m6870W(str3).m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light)).m6865R(true).mo6860M(false).m6890r(applicationContext.getResources().getColor(AbstractC16801x.notification_app_icon_background_color)).m6886n(true).mo6895w(str).m6893u(pendingIntent).mo6894v(str2);
            if (str2.length() > 20) {
                AbstractC1364q.d dVar = new AbstractC1364q.d();
                dVar.m6828h(str2);
                c23750d.m6869V(dVar);
            }
            if (AbstractC23309i.m121790cf() == 1) {
                c23750d.m6872Y(new long[]{0, 0});
            }
            m141256k2(c23750d);
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            e11.printStackTrace();
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    /* renamed from: g */
    public void m141344g(String str, String str2, String str3) {
        try {
            synchronized (this.f130690h) {
                try {
                    if (this.f130699q == null) {
                        this.f130699q = new HashMap();
                    }
                    if (!this.f130699q.containsKey(str)) {
                        this.f130699q.put(str, new HashSet());
                    }
                    if (!((HashSet) this.f130699q.get(str)).contains(str2)) {
                        ((HashSet) this.f130699q.get(str)).add(str2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(str3)) {
                AbstractC23304d.f113409m.put(Integer.valueOf(AbstractC23088h5.m118423d(str, str2)), str3);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g0 */
    public HashMap m141345g0(String str) {
        try {
            if (C19464a.m101787f(6)) {
                HashMap m101784c = C19464a.m101784c(str, 6);
                if (m101784c == null) {
                    return new HashMap();
                }
                return m101784c;
            }
            return m141382t0(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            return new HashMap();
        }
    }

    /* renamed from: g2 */
    public void m141346g2(long j11, String str) {
        C17945a0 m141364n0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f130684b) {
            try {
                if (!this.f130684b.containsKey(str)) {
                    return;
                }
                List list = (List) this.f130684b.get(str);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    boolean z11 = false;
                    while (it.hasNext()) {
                        if (((C17945a0) it.next()).m95029V3().m41047k() <= j11) {
                            it.remove();
                            z11 = true;
                        }
                    }
                    if (z11 && list.size() > 0 && (m141364n0 = m141250h0().m141364n0(str)) != null) {
                        C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(m141364n0.m95029V3());
                        ContactProfile m141815l = C28203u6.f131407a.m141815l(str, true);
                        if (m2635r != null && m141815l != null) {
                            C18961d.m99486i().m99491d(m2635r, m141815l, 5);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: h */
    public void m141347h(String str, String str2) {
        try {
            if (C19464a.m101787f(6)) {
                HashMap m101784c = C19464a.m101784c(str, 6);
                if (m101784c == null) {
                    m101784c = new HashMap();
                }
                m101784c.put(str2, Boolean.TRUE);
                C19464a.m101790i(str, m101784c, 6);
                return;
            }
            m141350i(str, str2);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h1 */
    public boolean m141348h1(String str) {
        if (!Objects.equals(str, "chat_1_1") && !Objects.equals(str, "chat_group")) {
            return false;
        }
        return true;
    }

    /* renamed from: h2 */
    public void m141349h2(String str, String str2) {
        try {
            HashMap m101784c = C19464a.m101784c(str, 6);
            m101784c.remove(str2);
            C19464a.m101790i(str, m101784c, 6);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public void m141350i(String str, String str2) {
        try {
            if (!this.f130691i.containsKey(str)) {
                this.f130691i.put(str, new HashMap());
            }
            if (!((HashMap) this.f130691i.get(str)).containsKey(str2)) {
                ((HashMap) this.f130691i.get(str)).put(str2, Boolean.TRUE);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i0 */
    public List m141351i0(int i11, int i12, JSONObject jSONObject, PendingIntent pendingIntent, String[] strArr) {
        JSONObject optJSONObject;
        int i13;
        PendingIntent activity;
        PendingIntent activity2;
        PendingIntent activity3;
        PendingIntent activity4;
        boolean z11;
        PendingIntent pendingIntent2;
        int i14;
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        Context appContext = MainApplication.getAppContext();
        try {
            optJSONObject = jSONObject.optJSONObject("item");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (optJSONObject == null) {
            return arrayList;
        }
        String optString = optJSONObject.optString("uid");
        String optString2 = optJSONObject.optString("dpn");
        String optString3 = optJSONObject.optString("avt");
        int optInt = optJSONObject.optInt("ranking", 0);
        String optString4 = optJSONObject.optString("phone");
        if (TextUtils.isEmpty(optString)) {
            return arrayList;
        }
        if (i12 == 1) {
            i13 = AbstractC23309i.m122497v9();
        } else if (i12 == 2) {
            i13 = AbstractC23309i.m122460u9();
        } else if (i12 == 3) {
            i13 = AbstractC23309i.m122423t9();
        } else {
            i13 = 0;
        }
        if (i13 != 3) {
            if (i13 != 4) {
                if (i13 == 5) {
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 24) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Intent m141236V0 = m141236V0("android.intent.action.QUICK_REPLY_MESSAGE", optString, i11, "16010%02d", 2);
                        if (i15 >= 34) {
                            pendingIntent2 = PendingIntent.getActivity(MainApplication.getAppContext(), 2, m141236V0, AbstractC19601a.m102572b(134217728), m141323X0());
                        } else {
                            pendingIntent2 = PendingIntent.getActivity(MainApplication.getAppContext(), 2, m141236V0, AbstractC19601a.m102572b(134217728));
                        }
                    } else {
                        pendingIntent2 = pendingIntent;
                    }
                    if (pendingIntent2 != null) {
                        String string = appContext.getString(AbstractC8020f0.str_sub_noti_send_message);
                        int i16 = AbstractC16803z.icn_notification_action_message;
                        if (z11) {
                            i14 = n.f130754f;
                        } else {
                            i14 = n.f130753e;
                        }
                        arrayList.add(new n(string, i16, pendingIntent2, i14));
                    }
                    if (strArr != null && strArr.length > 0) {
                        strArr[0] = "16010%02d";
                    }
                }
            } else {
                Intent m141236V02 = m141236V0("android.intent.action.REQUEST_FRIEND", optString, i11, "16011%02d", 1);
                m141236V02.putExtra("EXTRA_DPN", optString2);
                m141236V02.putExtra("EXTRA_AVT", optString3);
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 34) {
                    activity3 = PendingIntent.getActivity(MainApplication.getAppContext(), 1, m141236V02, AbstractC19601a.m102572b(134217728), m141323X0());
                } else {
                    activity3 = PendingIntent.getActivity(MainApplication.getAppContext(), 1, m141236V02, AbstractC19601a.m102572b(134217728));
                }
                arrayList.add(new n(appContext.getString(AbstractC8020f0.str_sub_noti_add_friend), AbstractC16803z.icn_notification_action_addfriend, activity3, true));
                Intent m141236V03 = m141236V0("android.intent.action.VIEW_PROFILE", optString, i11, "16011%02d", 2);
                if (i17 >= 34) {
                    activity4 = PendingIntent.getActivity(MainApplication.getAppContext(), 2, m141236V03, AbstractC19601a.m102572b(134217728), m141323X0());
                } else {
                    activity4 = PendingIntent.getActivity(MainApplication.getAppContext(), 2, m141236V03, AbstractC19601a.m102572b(134217728));
                }
                arrayList.add(new n(appContext.getString(AbstractC8020f0.str_sub_noti_view_profile), AbstractC16803z.icn_notification_action_profile, activity4, true));
                if (strArr != null && strArr.length > 0) {
                    strArr[0] = "16011%02d";
                }
            }
        } else {
            ContactProfile mo98491j = AbstractC23063f2.m118350b(false).mo98491j(optString);
            if (mo98491j != null) {
                mo98491j.f42369Q = optInt;
                mo98491j.f42455y = optString4;
            }
            C7960e.m41971c6().m42566vd(optString, optInt);
            Intent m141236V04 = m141236V0("android.intent.action.ACCEPT_REQUEST_FRIEND", optString, i11, "16013%02d", 1);
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 34) {
                activity = PendingIntent.getActivity(MainApplication.getAppContext(), 1, m141236V04, AbstractC19601a.m102572b(134217728), m141323X0());
            } else {
                activity = PendingIntent.getActivity(MainApplication.getAppContext(), 1, m141236V04, AbstractC19601a.m102572b(134217728));
            }
            arrayList.add(new n(appContext.getString(AbstractC8020f0.str_sub_noti_accept_request_friend), AbstractC16803z.icn_notification_action_accept, activity, true));
            Intent m141236V05 = m141236V0("android.intent.action.VIEW_PROFILE", optString, i11, "16013%02d", 2);
            if (i18 >= 34) {
                activity2 = PendingIntent.getActivity(MainApplication.getAppContext(), 2, m141236V05, AbstractC19601a.m102572b(134217728), m141323X0());
            } else {
                activity2 = PendingIntent.getActivity(MainApplication.getAppContext(), 2, m141236V05, AbstractC19601a.m102572b(134217728));
            }
            arrayList.add(new n(appContext.getString(AbstractC8020f0.str_sub_noti_view_profile), AbstractC16803z.icn_notification_action_profile, activity2, true));
            if (strArr != null && strArr.length > 0) {
                strArr[0] = "16013%02d";
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public boolean m141352j(String str) {
        return this.f130686d.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:3:0x0013, B:5:0x001b, B:9:0x0032, B:13:0x0050, B:15:0x0056, B:19:0x005e, B:22:0x0064, B:24:0x007a, B:25:0x00b4, B:27:0x00ba, B:30:0x00bf, B:32:0x00cb, B:33:0x00d0, B:34:0x00ce, B:35:0x0164, B:37:0x0168, B:43:0x0094, B:45:0x00a4, B:47:0x003d, B:52:0x00dc, B:56:0x00e3, B:58:0x00f5, B:59:0x0117, B:61:0x0123, B:62:0x0128, B:64:0x013a, B:65:0x0126, B:66:0x0106, B:67:0x0113, B:68:0x0026), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List m141353j0(ContactProfile contactProfile, int i11, String str, o oVar) {
        int m122386s9;
        PendingIntent m141334c1;
        int i12;
        boolean z11;
        C32079q8 m120540k;
        PendingIntent m141330a1;
        int i13;
        int i14;
        PendingIntent m141328Z0;
        ArrayList arrayList = new ArrayList();
        Context appContext = MainApplication.getAppContext();
        try {
            String str2 = "16000%02d";
            if (contactProfile.m40374K0()) {
                str2 = "16021%02d";
                m122386s9 = AbstractC23309i.m122349r9();
            } else {
                m122386s9 = AbstractC23309i.m122386s9();
            }
            String str3 = str2;
            boolean z12 = false;
            if (m122386s9 == 1) {
                if (this.f130684b.get(contactProfile.f42434r) != null && ((List) this.f130684b.get(contactProfile.f42434r)).size() != 0) {
                    z11 = false;
                    m120540k = AbstractC23304d.m120540k();
                    if (m120540k != null && (i14 = m120540k.f147782a) != 0) {
                        if (i14 != 1) {
                            if (oVar != null && oVar.f130766f && z11) {
                                PendingIntent m141325Y0 = m141325Y0(contactProfile, str3, i11, str, 1207959552, m120540k);
                                if (m141325Y0 != null) {
                                    arrayList.add(new n(appContext.getString(AbstractC8020f0.str_sub_noti_like_msg), AbstractC16803z.btn_foto_like, m141325Y0));
                                }
                            }
                        } else if (i14 == 2 && (m141328Z0 = m141328Z0(contactProfile, str3, i11, 1207959552, m120540k)) != null) {
                            arrayList.add(new n(appContext.getString(AbstractC8020f0.str_sub_noti_like_msg), AbstractC16803z.btn_foto_like, m141328Z0));
                        }
                        m141330a1 = m141330a1(contactProfile, str3, i11, 1207959552);
                        if (m141330a1 != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                z12 = true;
                            }
                            String string = appContext.getString(AbstractC8020f0.str_sub_noti_reply_msg);
                            int i15 = AbstractC16803z.icn_notification_action_reply;
                            if (z12) {
                                i13 = n.f130754f;
                            } else {
                                i13 = n.f130753e;
                            }
                            arrayList.add(new n(string, i15, m141330a1, i13));
                        }
                    }
                    m141330a1 = m141330a1(contactProfile, str3, i11, 1207959552);
                    if (m141330a1 != null) {
                    }
                }
                z11 = true;
                m120540k = AbstractC23304d.m120540k();
                if (m120540k != null) {
                    if (i14 != 1) {
                    }
                    m141330a1 = m141330a1(contactProfile, str3, i11, 1207959552);
                    if (m141330a1 != null) {
                    }
                }
                m141330a1 = m141330a1(contactProfile, str3, i11, 1207959552);
                if (m141330a1 != null) {
                }
            } else if (m122386s9 == 2) {
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 24) {
                    z12 = true;
                }
                if (z12) {
                    Intent m141236V0 = m141236V0("android.intent.action.QUICK_REPLY_MESSAGE", contactProfile.f42434r, i11, str3, 2);
                    if (i16 >= 34) {
                        m141334c1 = PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(1207959552), m141323X0());
                    } else {
                        m141334c1 = PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0, AbstractC19601a.m102572b(1207959552));
                    }
                } else {
                    m141334c1 = m141334c1(contactProfile, str3, 2, i11);
                }
                String string2 = appContext.getString(AbstractC8020f0.str_sub_noti_reply_msg);
                int i17 = AbstractC16803z.icn_notification_action_reply;
                if (z12) {
                    i12 = n.f130754f;
                } else {
                    i12 = n.f130753e;
                }
                arrayList.add(new n(string2, i17, m141334c1, i12));
                if (!C0804b.m2025g().m2033i(contactProfile.f42434r)) {
                    arrayList.add(new n(appContext.getString(AbstractC8020f0.mute_for_an_hour_short_str), AbstractC16803z.icn_notification_action_mute, PendingIntent.getActivity(MainApplication.getAppContext(), i11, m141236V0("android.intent.action.MUTE_IN_AN_HOUR", contactProfile.f42434r, i11, str3, 3), AbstractC19601a.m102572b(1207959552))));
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                arrayList.add(new n(appContext.getString(AbstractC8020f0.str_close), AbstractC16803z.close, m141321W0(contactProfile, str3, i11, AbstractC19601a.m102572b(134217728)), n.f130755g));
                arrayList.add(new n(appContext.getString(AbstractC8020f0.str_sub_noti_reply_msg), AbstractC16803z.icn_notification_action_reply, PendingIntent.getBroadcast(MainApplication.getAppContext(), i11, m141235U0("android.intent.action.QUICK_REPLY_MESSAGE_CAR", contactProfile.f42434r, i11, str3, 2), AbstractC19601a.m102572b(134217728)), n.f130756h));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: k0 */
    List m141354k0(String str, String str2, MessageId messageId, int i11, String str3, boolean z11, int i12, long j11) {
        ArrayList arrayList = new ArrayList();
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (this.f130684b) {
            try {
                if (this.f130684b.containsKey(str)) {
                    List list = (List) this.f130684b.get(str);
                    if (list == null) {
                        return new ArrayList();
                    }
                    if (i11 > 0) {
                        int size = list.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            if (((C17945a0) list.get(size)).m95135f9(messageId)) {
                                if (i11 == 1) {
                                    ((C17945a0) list.get(size)).m94961Na(str2);
                                    ((C17945a0) list.get(size)).m95164ib(str3);
                                    ((C17945a0) list.get(size)).m94851Ab(i12);
                                } else {
                                    if (i11 == 2) {
                                        list.remove(size);
                                        break;
                                    }
                                    if (i11 == 3) {
                                        ((C17945a0) list.get(size)).m94961Na(str2);
                                        ((C17945a0) list.get(size)).m95164ib(str3);
                                        ((C17945a0) list.get(size)).m94851Ab(i12);
                                        break;
                                    }
                                    if (i11 == 4) {
                                        break;
                                    }
                                }
                            }
                            size--;
                        }
                    } else if (z11) {
                        boolean z12 = false;
                        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                            if (((C17945a0) list.get(size2)).m95135f9(messageId)) {
                                ((C17945a0) list.get(size2)).m94961Na(str2);
                                ((C17945a0) list.get(size2)).m94851Ab(i12);
                                z12 = true;
                            }
                        }
                        if (!z12) {
                            C17945a0.w m95382r = new C17945a0.w(messageId, i12).m95359K(System.currentTimeMillis()).m95382r(str2);
                            if (m141264t2(j11)) {
                                m95382r.m95388x(SystemClock.elapsedRealtime() + j11);
                            }
                            list.add(m95382r.m95365a());
                            if (list.size() > 6) {
                                list.remove(0);
                            }
                        }
                    } else {
                        C17945a0.w m95354F = new C17945a0.w(messageId, i12).m95389y(str).m95359K(System.currentTimeMillis()).m95382r(str2).m95354F(str3);
                        if (m141264t2(j11)) {
                            m95354F.m95388x(SystemClock.elapsedRealtime() + j11);
                        }
                        list.add(m95354F.m95365a());
                        if (list.size() > 6) {
                            list.remove(0);
                        }
                    }
                } else {
                    C17945a0.w m95354F2 = new C17945a0.w(messageId, i12).m95389y(str).m95359K(System.currentTimeMillis()).m95382r(str2).m95354F(str3);
                    if (m141264t2(j11)) {
                        m95354F2.m95388x(SystemClock.elapsedRealtime() + j11);
                    }
                    arrayList.add(m95354F2.m95365a());
                    this.f130684b.put(str, arrayList);
                }
                if (this.f130684b.containsKey(str) && this.f130684b.get(str) != null) {
                    return (List) this.f130684b.get(str);
                }
                return new ArrayList();
            } finally {
            }
        }
    }

    /* renamed from: k1 */
    public void m141355k1(String str) {
        try {
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), 0, new Intent("android.intent.action.VIEW", Uri.parse(str)), AbstractC19601a.m102571a(134217728));
            String string = MainApplication.getAppContext().getString(AbstractC8020f0.captive_portal_notify_msg);
            C23750d c23750d = new C23750d(MainApplication.getAppContext(), "other", "captive_portal");
            c23750d.mo6894v(string);
            c23750d.m6870W(string);
            c23750d.m6893u(activity);
            m141256k2(c23750d);
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public boolean m141356l() {
        try {
            try {
                MainApplication.getAppContext().getPackageManager().getPackageInfo("com.google.android.wearable.app", 128);
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null) {
                    return false;
                }
                return defaultAdapter.isEnabled();
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                return false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: l1 */
    public void m141357l1(Bundle bundle, ContactProfile contactProfile) {
        String str;
        String str2;
        int i11;
        String m103043x0 = AbstractC19646n0.m103043x0(contactProfile.mo2478b());
        int m118423d = AbstractC23088h5.m118423d(m103043x0, contactProfile.f42434r);
        if (contactProfile.m40374K0()) {
            str = "16021%02d";
        } else {
            str = "16000%02d";
        }
        PendingIntent m141334c1 = m141334c1(contactProfile, str, 0, m118423d);
        StringBuilder sb2 = new StringBuilder();
        if (!contactProfile.m40374K0()) {
            str2 = "";
        } else {
            Context appContext = MainApplication.getAppContext();
            if (contactProfile.m40363E0()) {
                i11 = AbstractC8020f0.str_prefix_community_dpn;
            } else {
                i11 = AbstractC8020f0.str_prefix_group_dpn;
            }
            str2 = appContext.getString(i11);
        }
        sb2.append(str2);
        sb2.append(contactProfile.m40383Q(true, false));
        String sb3 = sb2.toString();
        Map map = AbstractC23304d.f113409m;
        if (!map.containsKey(Integer.valueOf(m118423d))) {
            map.put(Integer.valueOf(m118423d), "");
        }
        if (TextUtils.isEmpty(sb3)) {
            sb3 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_notice_bubble_chat);
        }
        m141249g1(sb3, "", "", m118423d, m141334c1, null, contactProfile, false, MessageId.m41039f(), 0, "", false, true, true, null, null, m103043x0, contactProfile.mo2478b(), 0L, 0, new q.d(bundle, true));
    }

    /* renamed from: l2 */
    public void m141358l2(AbstractC1364q.f fVar, Bitmap bitmap, ContactProfile contactProfile) {
        String str;
        PendingIntent m141266x0;
        try {
            if (!m141223E0()) {
                return;
            }
            AbstractC1364q.k m6925g = new AbstractC1364q.k().m6925g(false);
            if (bitmap != null) {
                m6925g.m6924e(bitmap);
            }
            if (contactProfile != null && (str = contactProfile.f42434r) != null && !str.equals("") && (m141266x0 = m141266x0(contactProfile)) != null) {
                m6925g.m6922b(new AbstractC1364q.b.a(AbstractC16803z.ic_reply_icon, MainApplication.getAppContext().getString(AbstractC8020f0.str_sub_noti_reply_msg), m141266x0).m6810a(new C1347i1.d("com.zing.zalo.intent.action.EXTRA_VOICE_REPLY_WEARABLE").m6770b(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.app_name)).m6769a()).m6812d(true).m6811b());
            }
            fVar.m6881g(m6925g);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void m141359m() {
        Set set;
        try {
            Hashtable hashtable = f130680x;
            if (hashtable != null && hashtable.size() != 0 && (set = f130681y) != null && set.size() != 0) {
                Iterator it = f130681y.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (f130680x.containsKey(str)) {
                        this.f130683a.m6696b(((Integer) f130680x.get(str)).intValue());
                    }
                    it.remove();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0048 -> B:33:0x0063). Please report as a decompilation issue!!! */
    /* renamed from: m0 */
    long m141360m0(String str) {
        long j11;
        List list;
        long j12 = Long.MAX_VALUE;
        try {
        } catch (Exception e11) {
            e = e11;
        }
        synchronized (this.f130684b) {
            try {
                if (this.f130684b.containsKey(str) && (list = (List) this.f130684b.get(str)) != null && !list.isEmpty()) {
                    int size = list.size();
                    j11 = Long.MAX_VALUE;
                    for (int i11 = 0; i11 < size; i11++) {
                        try {
                            C17945a0 c17945a0 = (C17945a0) list.get(i11);
                            if (m141264t2(c17945a0.m95141g4())) {
                                j11 = Math.min(j11, c17945a0.m95141g4());
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (j11 == Long.MAX_VALUE) {
                    return 0L;
                }
                try {
                    j12 = j11 - SystemClock.elapsedRealtime();
                    if (!m141264t2(j12)) {
                        return 0L;
                    }
                } catch (Exception e12) {
                    e = e12;
                    j12 = j11;
                    e.printStackTrace();
                    return j12;
                }
                return j12;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: m1 */
    public void m141361m1(ContactProfile contactProfile) {
        m141357l1(null, contactProfile);
    }

    /* renamed from: m2 */
    void m141362m2(int i11, String str, PendingIntent pendingIntent, String str2, String str3, String str4, int i12, boolean z11, boolean z12, boolean z13, int i13) {
        try {
            Context applicationContext = MainApplication.getAppContext().getApplicationContext();
            C23750d c23750d = new C23750d(applicationContext);
            c23750d.m124165v0("chat_download");
            c23750d.m124164u0(String.valueOf(i11));
            if (i12 == 100 && !z11) {
                c23750d.m6866S(AbstractC16803z.icn_anim_download_done);
            } else if (i12 == 0 && !z11) {
                c23750d.m6866S(AbstractC16803z.icn_anim_download_error);
            } else {
                c23750d.m6866S(AbstractC16803z.stat_sys_download);
            }
            c23750d.m6870W(applicationContext.getString(AbstractC8020f0.chat_file_download_noti_title));
            c23750d.m6893u(pendingIntent);
            c23750d.m6875a0(System.currentTimeMillis());
            c23750d.mo6895w(str2);
            c23750d.mo6894v(str3);
            c23750d.m6890r(applicationContext.getResources().getColor(AbstractC16801x.notification_download_file_color));
            if (!TextUtils.isEmpty(str4)) {
                c23750d.m6892t(str4);
            } else {
                c23750d.m6892t("");
            }
            if (z11) {
                c23750d.m6863P(100, i12, z12);
            } else {
                c23750d.m6863P(0, 0, false);
            }
            if (Build.VERSION.SDK_INT >= 24 && AbstractC23309i.m122416t2() == 1) {
                c23750d.m124159p0("zalo_notify");
                c23750d.m6854G(false);
            }
            c23750d.m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light));
            c23750d.m124161r0(!z13);
            if (z13) {
                c23750d.m124161r0(false);
                c23750d.m124160q0(!C18922m.m99141t().m99164y());
            } else {
                c23750d.m124161r0(true);
                c23750d.m124160q0(false);
            }
            m141256k2(c23750d);
            int m141322W1 = m141322W1(i11, str);
            Notification mo6879e = c23750d.mo6879e();
            if (i13 >= 0) {
                mo6879e.flags = i13;
            }
            try {
                this.f130683a.m6699g(m141322W1, mo6879e);
                m141262r2();
            } catch (Exception e11) {
                e = e11;
                e.printStackTrace();
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: n */
    public void m141363n() {
        List list = f130676t;
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < f130676t.size(); i11++) {
                this.f130683a.m6696b(((Integer) f130676t.get(i11)).intValue());
            }
            f130676t.clear();
        }
    }

    /* renamed from: n0 */
    C17945a0 m141364n0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        synchronized (this.f130684b) {
            try {
                if (!this.f130684b.containsKey(str) || this.f130684b.get(str) == null || ((List) this.f130684b.get(str)).isEmpty()) {
                    return null;
                }
                return (C17945a0) ((List) this.f130684b.get(str)).get(((List) this.f130684b.get(str)).size() - 1);
            } finally {
            }
        }
    }

    /* renamed from: n1 */
    public void m141365n1(String str, String str2, String str3, C19411c c19411c, boolean z11) {
        PendingIntent activity;
        String str4;
        C19411c.a.c cVar;
        StringBuilder sb2;
        String str5;
        C19411c.a.c cVar2;
        String str6;
        String str7;
        String str8;
        StringBuilder sb3;
        String str9;
        C19411c.a.e eVar;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        C19411c.a.c cVar3;
        String str15;
        String str16;
        StringBuilder sb4;
        try {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            new C32064p7().f147643f = true;
            if (z11) {
                int i11 = c19411c.f96279s;
                if (i11 == 1) {
                    String str17 = c19411c.f96278r;
                    C31973j5 m4472f = C0943w.m4462l().m4472f(str17);
                    if (m4472f != null) {
                        str4 = m4472f.m153793y();
                    } else {
                        C19411c.a aVar = c19411c.f96281u;
                        str4 = (aVar == null || (cVar = aVar.f96288b) == null || TextUtils.isEmpty(cVar.f96302b)) ? "" : c19411c.f96281u.f96288b.f96302b;
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        if (!TextUtils.isEmpty(str2)) {
                            sb5.append(" • ");
                        }
                        sb5.append(str4);
                    }
                    int m141376r0 = m141376r0("calendar", c19411c.f96261a);
                    ArrayList arrayList = new ArrayList();
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_group_id", str17);
                    bundle.putString("extra_topic_id", c19411c.f96281u.f96287a);
                    bundle.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                    bundle.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                    PendingIntent activity2 = PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130671A, m141376r0 + ""), AbstractC23152n3.m119012O(GroupPostDetailViewV2.class, bundle), AbstractC19601a.m102572b(134217728));
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 3);
                    bundle2.putLong("LONG_EXTRA_DATE_TO_JUMP_CALENDAR", c19411c.f96262b);
                    bundle2.putString("STR_EXTRA_EID_TO_JUMP_CALENDAR", c19411c.f96261a);
                    arrayList.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_zalo_calendar), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130672B, m141376r0 + ""), AbstractC23152n3.m119012O(MyCalendarView.class, bundle2), AbstractC19601a.m102572b(134217728)), true));
                    String str18 = "group_" + str17;
                    Bundle m140776b = new C27870vb(str18).m140776b();
                    m140776b.putBoolean("specialToShowPassCodeScreen", true);
                    m140776b.putBoolean("fromNotification", true);
                    m140776b.putString("uidNotif", str18);
                    arrayList.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_group_chat), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130673C, m141376r0 + ""), AbstractC23152n3.m119004K(m140776b, true), AbstractC19601a.m102572b(134217728)), true));
                    m141387u2("reminder", c19411c.f96261a + c19411c.f96262b, str, str, sb5.toString(), activity2, null, str3, "", arrayList, 0);
                    return;
                }
                if (i11 == 2) {
                    int m141376r02 = m141376r0("calendar", c19411c.f96261a);
                    ArrayList arrayList2 = new ArrayList();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("extra_event_id", c19411c.f96261a);
                    bundle3.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                    bundle3.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                    bundle3.putBoolean("extra_shortcut_calendar", true);
                    PendingIntent activity3 = PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130671A, m141376r02 + ""), AbstractC23152n3.m119012O(GroupEventDetailView.class, bundle3), AbstractC19601a.m102572b(134217728));
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 3);
                    bundle4.putLong("LONG_EXTRA_DATE_TO_JUMP_CALENDAR", c19411c.f96262b);
                    bundle4.putString("STR_EXTRA_EID_TO_JUMP_CALENDAR", c19411c.f96261a);
                    arrayList2.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_zalo_calendar), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130672B, m141376r02 + ""), AbstractC23152n3.m119012O(MyCalendarView.class, bundle4), AbstractC19601a.m102572b(134217728)), true));
                    if (c19411c.f96277q == 2) {
                        String str19 = c19411c.f96278r;
                        C31973j5 m4472f2 = C0943w.m4462l().m4472f(str19);
                        if (m4472f2 != null) {
                            str5 = m4472f2.m153793y();
                        } else {
                            C19411c.a aVar2 = c19411c.f96281u;
                            str5 = (aVar2 == null || (cVar2 = aVar2.f96288b) == null || TextUtils.isEmpty(cVar2.f96302b)) ? "" : c19411c.f96281u.f96288b.f96302b;
                        }
                        if (TextUtils.isEmpty(str5)) {
                            sb2 = sb5;
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                sb2 = sb5;
                            } else {
                                sb2 = sb5;
                                sb2.append(" • ");
                            }
                            sb2.append(str5);
                        }
                        String str20 = "group_" + str19;
                        Bundle m140776b2 = new C27870vb(str20).m140776b();
                        m140776b2.putBoolean("specialToShowPassCodeScreen", true);
                        m140776b2.putBoolean("fromNotification", true);
                        m140776b2.putString("uidNotif", str20);
                        arrayList2.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_group_chat), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130673C, m141376r02 + ""), AbstractC23152n3.m119004K(m140776b2, true), AbstractC19601a.m102572b(134217728)), true));
                    } else {
                        sb2 = sb5;
                    }
                    m141387u2("reminder", c19411c.f96261a + c19411c.f96262b, str, str, sb2.toString(), activity3, null, str3, "", arrayList2, 0);
                    return;
                }
                if (i11 == 3) {
                    C19411c.a aVar3 = c19411c.f96281u;
                    if (aVar3 == null || (eVar = aVar3.f96289c) == null) {
                        str6 = "INT_EXTRA_SOURCE_OPEN_CALENDAR";
                        str7 = "LONG_EXTRA_DATE_TO_JUMP_CALENDAR";
                        str8 = "STR_EXTRA_EID_TO_JUMP_CALENDAR";
                        sb3 = sb5;
                        str9 = "";
                    } else {
                        str8 = "STR_EXTRA_EID_TO_JUMP_CALENDAR";
                        if (CoreUtility.f89233i.equals(eVar.f96308c)) {
                            C19411c.a.e eVar2 = c19411c.f96281u.f96289c;
                            str10 = eVar2.f96310e;
                            str11 = eVar2.f96309d;
                        } else {
                            C19411c.a.e eVar3 = c19411c.f96281u.f96289c;
                            str10 = eVar3.f96308c;
                            str11 = eVar3.f96307b;
                        }
                        String str21 = str11;
                        ContactProfile m141811g = C28203u6.f131407a.m141811g(str10);
                        if (m141811g != null) {
                            str12 = str10;
                            str7 = "LONG_EXTRA_DATE_TO_JUMP_CALENDAR";
                            str13 = m141811g.m40383Q(true, false);
                        } else {
                            str7 = "LONG_EXTRA_DATE_TO_JUMP_CALENDAR";
                            str12 = str10;
                            str13 = str21;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            sb3 = sb5;
                        } else {
                            sb3 = sb5;
                            sb3.append(" • ");
                        }
                        str6 = "INT_EXTRA_SOURCE_OPEN_CALENDAR";
                        sb3.append(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_with_sb), str13));
                        str9 = str12;
                    }
                    int m141376r03 = m141376r0("calendar", c19411c.f96261a);
                    ArrayList arrayList3 = new ArrayList();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("extra_event_id", c19411c.f96261a);
                    bundle5.putBoolean("extra_shortcut_csc", true);
                    bundle5.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                    bundle5.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                    bundle5.putBoolean("extra_shortcut_calendar", true);
                    PendingIntent activity4 = PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130671A, m141376r03 + ""), AbstractC23152n3.m119012O(GroupEventDetailView.class, bundle5), AbstractC19601a.m102572b(134217728));
                    Bundle bundle6 = new Bundle();
                    bundle6.putInt(str6, 3);
                    bundle6.putLong(str7, c19411c.f96262b);
                    bundle6.putString(str8, c19411c.f96261a);
                    arrayList3.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_zalo_calendar), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130672B, m141376r03 + ""), AbstractC23152n3.m119012O(MyCalendarView.class, bundle6), AbstractC19601a.m102572b(134217728)), true));
                    Bundle m140776b3 = new C27870vb(str9).m140776b();
                    m140776b3.putBoolean("specialToShowPassCodeScreen", true);
                    m140776b3.putBoolean("fromNotification", true);
                    m140776b3.putString("uidNotif", str9);
                    arrayList3.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_chat_11), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130673C, m141376r03 + ""), AbstractC23152n3.m119004K(m140776b3, true), AbstractC19601a.m102572b(134217728)), true));
                    m141387u2("reminder", c19411c.f96261a + c19411c.f96262b, str, str, sb3.toString(), activity4, null, str3, "", arrayList3, 0);
                    return;
                }
                if (i11 != 4 && i11 != 5) {
                    int m141376r04 = m141376r0("calendar", c19411c.f96261a);
                    ArrayList arrayList4 = new ArrayList();
                    Bundle bundle7 = new Bundle();
                    bundle7.putString("extra_event_id", c19411c.f96261a);
                    bundle7.putString("extra_group_id", c19411c.f96278r);
                    bundle7.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                    bundle7.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                    bundle7.putBoolean("extra_shortcut_calendar", true);
                    PendingIntent activity5 = PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130671A, m141376r04 + ""), AbstractC23152n3.m119012O(GroupEventDetailView.class, bundle7), AbstractC19601a.m102572b(134217728));
                    Bundle bundle8 = new Bundle();
                    bundle8.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 3);
                    bundle8.putLong("LONG_EXTRA_DATE_TO_JUMP_CALENDAR", c19411c.f96262b);
                    bundle8.putString("STR_EXTRA_EID_TO_JUMP_CALENDAR", c19411c.f96261a);
                    arrayList4.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_zalo_calendar), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130672B, m141376r04 + ""), AbstractC23152n3.m119012O(MyCalendarView.class, bundle8), AbstractC19601a.m102572b(134217728)), true));
                    m141387u2("reminder", c19411c.f96261a + c19411c.f96262b, str, str, sb5.toString(), activity5, null, str3, "", arrayList4, 0);
                    return;
                }
                String str22 = c19411c.f96278r;
                C31973j5 m4472f3 = C0943w.m4462l().m4472f(str22);
                if (m4472f3 != null) {
                    str14 = m4472f3.m153793y();
                } else {
                    C19411c.a aVar4 = c19411c.f96281u;
                    str14 = (aVar4 == null || (cVar3 = aVar4.f96288b) == null || TextUtils.isEmpty(cVar3.f96302b)) ? "" : c19411c.f96281u.f96288b.f96302b;
                }
                if (TextUtils.isEmpty(str14)) {
                    str15 = str22;
                    str16 = "STR_EXTRA_EID_TO_JUMP_CALENDAR";
                    sb4 = sb5;
                } else {
                    if (TextUtils.isEmpty(str2)) {
                        str15 = str22;
                        str16 = "STR_EXTRA_EID_TO_JUMP_CALENDAR";
                        sb4 = sb5;
                    } else {
                        str15 = str22;
                        sb4 = sb5;
                        str16 = "STR_EXTRA_EID_TO_JUMP_CALENDAR";
                        sb4.append(" • ");
                    }
                    sb4.append(str14);
                }
                int m141376r05 = m141376r0("calendar", c19411c.f96261a);
                ArrayList arrayList5 = new ArrayList();
                Bundle bundle9 = new Bundle();
                StringBuilder sb6 = sb4;
                bundle9.putString("extra_event_id", c19411c.f96261a);
                bundle9.putString("extra_group_id", c19411c.f96278r);
                bundle9.putBoolean("extra_shortcut_csc", true);
                bundle9.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                bundle9.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                bundle9.putBoolean("extra_shortcut_calendar", true);
                PendingIntent activity6 = PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130671A, m141376r05 + ""), AbstractC23152n3.m119012O(GroupEventDetailView.class, bundle9), AbstractC19601a.m102572b(134217728));
                Bundle bundle10 = new Bundle();
                bundle10.putInt("INT_EXTRA_SOURCE_OPEN_CALENDAR", 3);
                bundle10.putLong("LONG_EXTRA_DATE_TO_JUMP_CALENDAR", c19411c.f96262b);
                bundle10.putString(str16, c19411c.f96261a);
                arrayList5.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_zalo_calendar), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130672B, m141376r05 + ""), AbstractC23152n3.m119012O(MyCalendarView.class, bundle10), AbstractC19601a.m102572b(134217728)), true));
                String str23 = "group_" + str15;
                Bundle m140776b4 = new C27870vb(str23).m140776b();
                m140776b4.putBoolean("specialToShowPassCodeScreen", true);
                m140776b4.putBoolean("fromNotification", true);
                m140776b4.putString("uidNotif", str23);
                arrayList5.add(new n(MainApplication.getAppContext().getString(AbstractC8020f0.str_open_group_chat), AbstractC16803z.icn_notification_action_reply, PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130673C, m141376r05 + ""), AbstractC23152n3.m119004K(m140776b4, true), AbstractC19601a.m102572b(134217728)), true));
                m141387u2("reminder", c19411c.f96261a + c19411c.f96262b, str, str, sb6.toString(), activity6, null, str3, "", arrayList5, 0);
                return;
            }
            int m141376r06 = m141376r0("calendar", c19411c.f96261a);
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.zalo);
            List arrayList6 = new ArrayList();
            if (c19411c.f96279s == 1) {
                Bundle bundle11 = new Bundle();
                bundle11.putString("extra_group_id", c19411c.f96278r);
                bundle11.putString("extra_topic_id", c19411c.f96281u.f96287a);
                bundle11.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                bundle11.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                activity = PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130671A, m141376r06 + ""), AbstractC23152n3.m119012O(GroupPostDetailViewV2.class, bundle11), AbstractC19601a.m102572b(134217728));
            } else {
                Bundle bundle12 = new Bundle();
                bundle12.putString("extra_event_id", c19411c.f96261a);
                bundle12.putString("extra_group_id", c19411c.f96278r);
                bundle12.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                bundle12.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                bundle12.putBoolean("extra_shortcut_calendar", true);
                activity = PendingIntent.getActivity(MainApplication.getAppContext(), m141385u0(f130671A, m141376r06 + ""), AbstractC23152n3.m119012O(GroupEventDetailView.class, bundle12), AbstractC19601a.m102572b(134217728));
            }
            m141387u2("reminder", c19411c.f96261a + c19411c.f96262b, m118743r0, m118743r0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_hidden_notification_event), activity, null, str3, "", arrayList6, 0);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: Exception -> 0x0040, TRY_ENTER, TryCatch #0 {Exception -> 0x0040, blocks: (B:4:0x000e, B:9:0x0016, B:12:0x002d, B:14:0x0039, B:17:0x0044, B:20:0x0054, B:21:0x005a, B:24:0x0066, B:29:0x00b6, B:32:0x0128, B:33:0x013f, B:35:0x01f7, B:36:0x01fa, B:38:0x0200, B:39:0x0203, B:41:0x025a, B:44:0x0267, B:48:0x012e, B:50:0x0134, B:51:0x013a, B:53:0x0080, B:56:0x00a7, B:57:0x0091, B:58:0x0062), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128 A[Catch: Exception -> 0x0040, TRY_ENTER, TryCatch #0 {Exception -> 0x0040, blocks: (B:4:0x000e, B:9:0x0016, B:12:0x002d, B:14:0x0039, B:17:0x0044, B:20:0x0054, B:21:0x005a, B:24:0x0066, B:29:0x00b6, B:32:0x0128, B:33:0x013f, B:35:0x01f7, B:36:0x01fa, B:38:0x0200, B:39:0x0203, B:41:0x025a, B:44:0x0267, B:48:0x012e, B:50:0x0134, B:51:0x013a, B:53:0x0080, B:56:0x00a7, B:57:0x0091, B:58:0x0062), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:4:0x000e, B:9:0x0016, B:12:0x002d, B:14:0x0039, B:17:0x0044, B:20:0x0054, B:21:0x005a, B:24:0x0066, B:29:0x00b6, B:32:0x0128, B:33:0x013f, B:35:0x01f7, B:36:0x01fa, B:38:0x0200, B:39:0x0203, B:41:0x025a, B:44:0x0267, B:48:0x012e, B:50:0x0134, B:51:0x013a, B:53:0x0080, B:56:0x00a7, B:57:0x0091, B:58:0x0062), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0200 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:4:0x000e, B:9:0x0016, B:12:0x002d, B:14:0x0039, B:17:0x0044, B:20:0x0054, B:21:0x005a, B:24:0x0066, B:29:0x00b6, B:32:0x0128, B:33:0x013f, B:35:0x01f7, B:36:0x01fa, B:38:0x0200, B:39:0x0203, B:41:0x025a, B:44:0x0267, B:48:0x012e, B:50:0x0134, B:51:0x013a, B:53:0x0080, B:56:0x00a7, B:57:0x0091, B:58:0x0062), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:4:0x000e, B:9:0x0016, B:12:0x002d, B:14:0x0039, B:17:0x0044, B:20:0x0054, B:21:0x005a, B:24:0x0066, B:29:0x00b6, B:32:0x0128, B:33:0x013f, B:35:0x01f7, B:36:0x01fa, B:38:0x0200, B:39:0x0203, B:41:0x025a, B:44:0x0267, B:48:0x012e, B:50:0x0134, B:51:0x013a, B:53:0x0080, B:56:0x00a7, B:57:0x0091, B:58:0x0062), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:4:0x000e, B:9:0x0016, B:12:0x002d, B:14:0x0039, B:17:0x0044, B:20:0x0054, B:21:0x005a, B:24:0x0066, B:29:0x00b6, B:32:0x0128, B:33:0x013f, B:35:0x01f7, B:36:0x01fa, B:38:0x0200, B:39:0x0203, B:41:0x025a, B:44:0x0267, B:48:0x012e, B:50:0x0134, B:51:0x013a, B:53:0x0080, B:56:0x00a7, B:57:0x0091, B:58:0x0062), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0062 A[Catch: Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:4:0x000e, B:9:0x0016, B:12:0x002d, B:14:0x0039, B:17:0x0044, B:20:0x0054, B:21:0x005a, B:24:0x0066, B:29:0x00b6, B:32:0x0128, B:33:0x013f, B:35:0x01f7, B:36:0x01fa, B:38:0x0200, B:39:0x0203, B:41:0x025a, B:44:0x0267, B:48:0x012e, B:50:0x0134, B:51:0x013a, B:53:0x0080, B:56:0x00a7, B:57:0x0091, B:58:0x0062), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0059  */
    /* renamed from: n2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m141366n2(ContactProfile contactProfile, long j11, String str) {
        C31901e8 m2800f;
        String str2;
        String mo2475c;
        boolean m114558y;
        String format;
        String sb2;
        String str3;
        int i11;
        if (contactProfile != null) {
            try {
                if (AbstractC23309i.m121342Qd()) {
                    String m121704a5 = AbstractC23309i.m121704a5();
                    if (!C16741a.m89329r().m89337H(C16741a.m89329r().m89345W(str, m121704a5))) {
                        return;
                    }
                    String m118278d = AbstractC23056e6.m118278d(str, m121704a5);
                    if (!m118278d.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
                        if (m118278d.isEmpty()) {
                        }
                        m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), AbstractC23056e6.m118285k(str));
                        if (m2800f != null) {
                            str2 = "";
                        } else {
                            str2 = m2800f.m153295h();
                        }
                        if (TextUtils.isEmpty(str2)) {
                            mo2475c = str2;
                        } else {
                            mo2475c = contactProfile.mo2475c();
                        }
                        String string = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_title_missCall);
                        m114558y = AbstractC21935u.m114558y(contactProfile.f42434r);
                        if (m2800f == null) {
                            sb2 = str2;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m118278d);
                            sb3.append(" - ");
                            if (m114558y) {
                                format = mo2475c;
                            } else {
                                format = String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_dpn_miss_call_stranger), mo2475c);
                            }
                            sb3.append(format);
                            sb2 = sb3.toString();
                        }
                        if (!m114558y) {
                            str3 = "miss_call_native";
                        } else {
                            str3 = "miss_call_stranger_native";
                        }
                        String str4 = contactProfile.f42434r;
                        int m141244c0 = m141244c0(str3, str4);
                        m141344g(str3, str4, "");
                        Intent intent = new Intent("com.zing.zalo.intent.action.CALL_DELETE_NOTIFICATION");
                        intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
                        intent.putExtra("notiType", str3);
                        intent.putExtra("subType", str4);
                        intent.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
                        PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), m141244c0, intent, AbstractC19601a.m102572b(0));
                        Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                        m140776b.putBoolean("specialToShowPassCodeScreen", true);
                        m140776b.putBoolean("fromNotification", true);
                        m140776b.putString("uidNotif", contactProfile.f42434r);
                        m140776b.putString("dpnNotif", contactProfile.m40383Q(true, false));
                        m140776b.putString("avtNotif", contactProfile.f42446v);
                        m140776b.putBoolean("fromMissedCallNotification", true);
                        if (!contactProfile.m40374K0()) {
                            m140776b.putString("SOURCE_ACTION", "15200");
                        } else if (contactProfile.m40387S0()) {
                            m140776b.putString("SOURCE_ACTION", "15300");
                        } else {
                            m140776b.putString("SOURCE_ACTION", "15100");
                        }
                        Intent intent2 = new Intent("com.zing.zalo.intent.action.SAVE_CONTACT_NOTIFICATION");
                        intent2.setClass(MainApplication.getAppContext(), IntentHandlerTrampolineActivity.class);
                        intent2.putExtra("displayName", mo2475c);
                        intent2.putExtra("phoneNumber", str);
                        intent2.putExtra("notiType", str3);
                        intent2.putExtra("subType", str4);
                        String str5 = sb2;
                        n nVar = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_save_to_phonebook), AbstractC16803z.ic_save_contact_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, intent2, AbstractC19601a.m102572b(134217728)), true);
                        n nVar2 = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.send_msg_zalouser), AbstractC16803z.ic_callreply_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, AbstractC23152n3.m119004K(m140776b, true), AbstractC19601a.m102572b(134217728)), true);
                        Intent intent3 = new Intent("com.zing.zalo.action.NOTI_CALLBACK");
                        intent3.setClass(MainApplication.getAppContext(), IntentHandlerActivity.class);
                        intent3.putExtra("contactProfile", contactProfile);
                        intent3.putExtra("notiType", str3);
                        intent3.putExtra("subType", str4);
                        n nVar3 = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.call_zalouser), AbstractC16803z.ic_answer_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c0, intent3, AbstractC19601a.m102572b(134217728)), true);
                        ArrayList arrayList = new ArrayList();
                        if (m141278D0(str)) {
                            arrayList.add(nVar);
                        }
                        if (m141283F0(str)) {
                            arrayList.add(nVar2);
                        }
                        arrayList.add(nVar3);
                        Intent intent4 = new Intent(MainApplication.getAppContext(), (Class<?>) MissCallActivity.class);
                        intent4.putExtra("extra_uid", contactProfile.f42434r);
                        intent4.putExtra("extra_avt", contactProfile.f42446v);
                        intent4.putExtra("extra_cover", contactProfile.f42324B);
                        intent4.putExtra("extra_dpn", mo2475c);
                        intent4.putExtra("extra_status", contactProfile.f42458z);
                        intent4.putExtra("extra_time_miss_call", j11);
                        intent4.putExtra("extra_from_missed_call_notification", true);
                        PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent4, AbstractC19601a.m102572b(134217728));
                        String str6 = contactProfile.f42446v;
                        int i12 = AbstractC16803z.ic_call_miss;
                        if (m141224G0(contactProfile) && !C18922m.m99141t().m99164y()) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        m141255k(str3, str4, string, str5, str5, activity, broadcast, str6, "", arrayList, i12, i11, false, Color.parseColor("#DB342E"));
                    }
                    m118278d = str;
                    m2800f = AbstractC0906d0.m2800f(MainApplication.getAppContext(), AbstractC23056e6.m118285k(str));
                    if (m2800f != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String string2 = MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_title_missCall);
                    m114558y = AbstractC21935u.m114558y(contactProfile.f42434r);
                    if (m2800f == null) {
                    }
                    if (!m114558y) {
                    }
                    String str42 = contactProfile.f42434r;
                    int m141244c02 = m141244c0(str3, str42);
                    m141344g(str3, str42, "");
                    Intent intent5 = new Intent("com.zing.zalo.intent.action.CALL_DELETE_NOTIFICATION");
                    intent5.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
                    intent5.putExtra("notiType", str3);
                    intent5.putExtra("subType", str42);
                    intent5.setClass(MainApplication.getAppContext(), ZaloReceiver.class);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(MainApplication.getAppContext(), m141244c02, intent5, AbstractC19601a.m102572b(0));
                    Bundle m140776b2 = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                    m140776b2.putBoolean("specialToShowPassCodeScreen", true);
                    m140776b2.putBoolean("fromNotification", true);
                    m140776b2.putString("uidNotif", contactProfile.f42434r);
                    m140776b2.putString("dpnNotif", contactProfile.m40383Q(true, false));
                    m140776b2.putString("avtNotif", contactProfile.f42446v);
                    m140776b2.putBoolean("fromMissedCallNotification", true);
                    if (!contactProfile.m40374K0()) {
                    }
                    Intent intent22 = new Intent("com.zing.zalo.intent.action.SAVE_CONTACT_NOTIFICATION");
                    intent22.setClass(MainApplication.getAppContext(), IntentHandlerTrampolineActivity.class);
                    intent22.putExtra("displayName", mo2475c);
                    intent22.putExtra("phoneNumber", str);
                    intent22.putExtra("notiType", str3);
                    intent22.putExtra("subType", str42);
                    String str52 = sb2;
                    n nVar4 = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_save_to_phonebook), AbstractC16803z.ic_save_contact_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c02, intent22, AbstractC19601a.m102572b(134217728)), true);
                    n nVar22 = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.send_msg_zalouser), AbstractC16803z.ic_callreply_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c02, AbstractC23152n3.m119004K(m140776b2, true), AbstractC19601a.m102572b(134217728)), true);
                    Intent intent32 = new Intent("com.zing.zalo.action.NOTI_CALLBACK");
                    intent32.setClass(MainApplication.getAppContext(), IntentHandlerActivity.class);
                    intent32.putExtra("contactProfile", contactProfile);
                    intent32.putExtra("notiType", str3);
                    intent32.putExtra("subType", str42);
                    n nVar32 = new n(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.call_zalouser), AbstractC16803z.ic_answer_notifbar, PendingIntent.getActivity(MainApplication.getAppContext(), m141244c02, intent32, AbstractC19601a.m102572b(134217728)), true);
                    ArrayList arrayList2 = new ArrayList();
                    if (m141278D0(str)) {
                    }
                    if (m141283F0(str)) {
                    }
                    arrayList2.add(nVar32);
                    Intent intent42 = new Intent(MainApplication.getAppContext(), (Class<?>) MissCallActivity.class);
                    intent42.putExtra("extra_uid", contactProfile.f42434r);
                    intent42.putExtra("extra_avt", contactProfile.f42446v);
                    intent42.putExtra("extra_cover", contactProfile.f42324B);
                    intent42.putExtra("extra_dpn", mo2475c);
                    intent42.putExtra("extra_status", contactProfile.f42458z);
                    intent42.putExtra("extra_time_miss_call", j11);
                    intent42.putExtra("extra_from_missed_call_notification", true);
                    PendingIntent activity2 = PendingIntent.getActivity(MainApplication.getAppContext(), 0, intent42, AbstractC19601a.m102572b(134217728));
                    String str62 = contactProfile.f42446v;
                    int i122 = AbstractC16803z.ic_call_miss;
                    if (m141224G0(contactProfile)) {
                    }
                    i11 = 0;
                    m141255k(str3, str42, string2, str52, str52, activity2, broadcast2, str62, "", arrayList2, i122, i11, false, Color.parseColor("#DB342E"));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: o */
    public void m141367o(String str, boolean z11) {
        try {
            if (AbstractC23309i.m120850D2()) {
                int m118423d = AbstractC23088h5.m118423d("chat_group_mention_me", str);
                q.m141409f(m118423d);
                AbstractC23304d.f113409m.remove(Integer.valueOf(m118423d));
                AbstractC23775p0.m124198c("chat_group_mention_me", str);
            }
            m141285G(str, z11);
            int m118423d2 = AbstractC23088h5.m118423d("chat_urgent", str);
            q.m141409f(m118423d2);
            Map map = AbstractC23304d.f113409m;
            map.remove(Integer.valueOf(m118423d2));
            AbstractC23775p0.m124198c("chat_urgent", str);
            int m118423d3 = AbstractC23088h5.m118423d("hidden", str);
            q.m141409f(m118423d3);
            map.remove(Integer.valueOf(m118423d3));
            AbstractC23775p0.m124198c("hidden", str);
            int m118423d4 = AbstractC23088h5.m118423d("miss_call_zalo", str);
            q.m141409f(m118423d4);
            map.remove(Integer.valueOf(m118423d4));
            AbstractC23775p0.m124198c("miss_call_zalo", str);
            int m118423d5 = AbstractC23088h5.m118423d("miss_call_stranger_zalo", str);
            q.m141409f(m118423d5);
            map.remove(Integer.valueOf(m118423d5));
            AbstractC23775p0.m124198c("miss_call_stranger_zalo", str);
            int m118423d6 = AbstractC23088h5.m118423d("miss_call_native", str);
            q.m141409f(m118423d6);
            map.remove(Integer.valueOf(m118423d6));
            AbstractC23775p0.m124198c("miss_call_native", str);
            int m118423d7 = AbstractC23088h5.m118423d("miss_call_stranger_native", str);
            q.m141409f(m118423d7);
            map.remove(Integer.valueOf(m118423d7));
            AbstractC23775p0.m124198c("miss_call_stranger_native", str);
            m141271B(str, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: o0 */
    int m141368o0(List list, int i11) {
        boolean z11;
        Map map;
        if (list != null && list.size() >= 1) {
            if (list.size() < 6 && (map = this.f130685c) != null && map.containsKey(Integer.valueOf(i11))) {
                this.f130685c.remove(Integer.valueOf(i11));
            }
            C17945a0 c17945a0 = (C17945a0) list.get(0);
            boolean z12 = true;
            for (int i12 = 1; i12 < list.size(); i12++) {
                if (o.m141401b(c17945a0.m95041W4()) == o.m141401b(((C17945a0) list.get(i12)).m95041W4())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 &= z11;
            }
            Map map2 = this.f130685c;
            if (map2 != null && map2.containsKey(Integer.valueOf(i11))) {
                z12 &= ((Boolean) this.f130685c.get(Integer.valueOf(i11))).booleanValue();
            } else if (this.f130685c == null) {
                this.f130685c = Collections.synchronizedMap(new HashMap());
            }
            this.f130685c.put(Integer.valueOf(i11), Boolean.valueOf(z12));
            if (!z12) {
                return 0;
            }
            return o.m141401b(c17945a0.m95041W4());
        }
        Map map3 = this.f130685c;
        if (map3 != null && map3.containsKey(Integer.valueOf(i11))) {
            this.f130685c.remove(Integer.valueOf(i11));
        }
        return 0;
    }

    /* renamed from: o1 */
    public void m141369o1(int i11, String str, PendingIntent pendingIntent, String str2) {
        Hashtable hashtable;
        String string;
        try {
            if (!TextUtils.isEmpty(str) && (hashtable = f130680x) != null && hashtable.size() != 0 && f130680x.containsKey(str)) {
                this.f130683a.m6696b(i11);
                if (!TextUtils.isEmpty(str2)) {
                    string = str2;
                } else {
                    string = MainApplication.getAppContext().getString(AbstractC8020f0.app_name);
                }
                String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_error);
                m141337d2(str);
                m141362m2(i11, str, pendingIntent, string, string2, "", 0, false, true, false, 16);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p */
    public void m141370p() {
        try {
            this.f130683a.m6698d();
            List list = f130676t;
            if (list != null) {
                list.clear();
                f130676t = null;
            }
            Hashtable hashtable = f130678v;
            if (hashtable != null) {
                hashtable.clear();
                f130678v = null;
            }
            Hashtable hashtable2 = f130680x;
            if (hashtable2 != null) {
                hashtable2.clear();
                f130680x = null;
            }
            m141271B("", true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p1 */
    public void m141371p1(ContactProfile contactProfile, int i11, String str, PendingIntent pendingIntent, String str2, long j11) {
        Hashtable hashtable;
        String string;
        try {
            if (!TextUtils.isEmpty(str) && (hashtable = f130680x) != null && hashtable.size() != 0 && f130680x.containsKey(str)) {
                this.f130683a.m6696b(i11);
                if (!TextUtils.isEmpty(str2)) {
                    string = str2;
                } else {
                    string = MainApplication.getAppContext().getString(AbstractC8020f0.app_name);
                }
                String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_finish);
                if (j11 > 0) {
                    String m118226y = AbstractC23041d2.m118226y(j11);
                    if (!TextUtils.isEmpty(m118226y)) {
                        string2 = string2 + ", " + m118226y;
                    }
                }
                String str3 = string2;
                m141337d2(str);
                m141362m2(i11, str, pendingIntent, string, str3, "", 100, false, true, true, 16);
                C23081g9.m118409f(contactProfile);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public void m141372q(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        arrayList.add(new C25304a("miss_call_zalo", str));
        arrayList.add(new C25304a("miss_call_native", str));
        arrayList.add(new C25304a("miss_call_retry_401", str));
        arrayList.add(new C25304a("miss_call_retry_reject_or_busy", str));
        arrayList.add(new C25304a("retry_call_unsupport_vid", str));
        arrayList.add(new C25304a("retry_call_not_online", str));
        m141299L(arrayList);
    }

    /* renamed from: q1 */
    public void m141373q1(int i11, String str, PendingIntent pendingIntent, String str2, long j11) {
        Hashtable hashtable;
        String string;
        try {
            if (!TextUtils.isEmpty(str) && (hashtable = f130680x) != null && hashtable.size() != 0 && f130680x.containsKey(str)) {
                this.f130683a.m6696b(i11);
                if (!TextUtils.isEmpty(str2)) {
                    string = str2;
                } else {
                    string = MainApplication.getAppContext().getString(AbstractC8020f0.app_name);
                }
                String string2 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_finish);
                if (j11 > 0) {
                    String m118226y = AbstractC23041d2.m118226y(j11);
                    if (!TextUtils.isEmpty(m118226y)) {
                        string2 = string2 + ", " + m118226y;
                    }
                }
                String str3 = string2;
                m141337d2(str);
                m141362m2(i11, str, pendingIntent, string, str3, "", 100, false, true, true, 16);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q2 */
    public void m141374q2(int i11, String str, PendingIntent pendingIntent, String str2, String str3, int i12) {
        Hashtable hashtable;
        String string;
        String string2;
        try {
            if (!TextUtils.isEmpty(str) && (hashtable = f130680x) != null && hashtable.size() != 0 && f130680x.containsKey(str)) {
                Hashtable hashtable2 = f130680x;
                if (hashtable2 != null && hashtable2.size() > 0 && f130680x.containsKey(str)) {
                    if (!TextUtils.isEmpty(str3)) {
                        string = str3;
                    } else {
                        string = MainApplication.getAppContext().getString(AbstractC8020f0.app_name);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        string2 = str2;
                    } else {
                        string2 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_content);
                    }
                    String str4 = i12 + "%";
                    try {
                        m141324X1(str);
                        m141362m2(i11, str, pendingIntent, string, string2, str4, i12, true, false, false, 32);
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: r */
    public void m141375r() {
        try {
            List list = f130677u;
            if (list != null && list.size() > 0) {
                Iterator it = f130677u.iterator();
                while (it.hasNext()) {
                    this.f130683a.m6696b(((Integer) it.next()).intValue());
                }
                f130677u.clear();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r0 */
    int m141376r0(String str, String str2) {
        p pVar;
        String m141318V = m141318V(str, str2);
        synchronized (this.f130690h) {
            try {
                if (this.f130689g.containsKey(m141318V) && (pVar = (p) this.f130689g.get(m141318V)) != null) {
                    return pVar.f130767a;
                }
                int m141388v0 = m141388v0(m141318V);
                this.f130689g.put(m141318V, new p(m141388v0));
                return m141388v0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: r1 */
    public void m141377r1(int i11, String str, int i12, String str2, String str3, String str4, String str5, String str6, int i13, String str7, String str8, boolean z11, int i14) {
        Bundle bundle;
        Intent intent;
        if (i11 == 0) {
            return;
        }
        try {
            if (i12 == 1) {
                bundle = new Bundle();
                bundle.putString("fid", str2);
                bundle.putString("ownerId", str3);
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("extra_highlight_comment_id", str4);
                }
                bundle.putBoolean("specialToShowPassCodeScreen", true);
                bundle.putString("SOURCE_ACTION", "15400");
                C31987k4 c31987k4 = new C31987k4(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO);
                c31987k4.m154202a("appID", str6);
                c31987k4.m154202a("actID", Integer.valueOf(i13));
                c31987k4.m154202a("feedSrcNotification", Integer.valueOf(i14));
                bundle.putString("extra_entry_point_flow", C32002l4.m154266i(c31987k4).m154277l());
                bundle.putInt("SHOW_WITH_FLAGS", 134217728);
                intent = AbstractC23152n3.m119020S(FeedDetailsView.class, bundle, true);
            } else if (i12 == 2) {
                bundle = new Bundle();
                bundle.putString("userId", str3);
                bundle.putString("picid", str2);
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("extra_highlight_comment_id", str4);
                }
                bundle.putBoolean("specialToShowPassCodeScreen", true);
                C31987k4 c31987k42 = new C31987k4(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO);
                c31987k42.m154202a("appID", str6);
                c31987k42.m154202a("actID", Integer.valueOf(i13));
                c31987k42.m154202a("feedSrcNotification", Integer.valueOf(i14));
                bundle.putString("extra_entry_point_flow", C32002l4.m154266i(c31987k42).m154277l());
                bundle.putString("SOURCE_ACTION", "15400");
                intent = AbstractC23152n3.m119020S(ImageCommentView.class, bundle, true);
            } else {
                bundle = null;
                intent = null;
            }
            if (bundle != null) {
                String m108912q = AbstractC20833z.m108912q(i13);
                String m108911p = AbstractC20833z.m108911p(m108912q, C20817r.m108716b(str2, str7, str4));
                CharSequence m108892G = AbstractC20833z.m108892G(m108912q, m108911p, str7, str, str8);
                if (AbstractC20833z.m108915t(m108912q)) {
                    m141347h(m108912q, m108911p);
                }
                PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), (int) System.currentTimeMillis(), intent, AbstractC19601a.m102572b(134217728));
                C23750d c23750d = new C23750d(CoreUtility.getAppContext());
                if (m108892G.length() > 20) {
                    AbstractC1364q.d dVar = new AbstractC1364q.d();
                    dVar.m6828h(m108892G);
                    c23750d.m6869V(dVar);
                }
                c23750d.m6870W(m108892G);
                c23750d.mo6895w("Zalo");
                c23750d.mo6894v(m108892G);
                c23750d.m6893u(activity);
                c23750d.m124165v0(m108912q);
                c23750d.m124164u0(m108911p);
                m141315T0(str5, c23750d, z11);
                m141256k2(c23750d);
                c23750d.m124147b0();
                m141262r2();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s */
    public void m141378s(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        arrayList.add(new C25304a("miss_call_retry_401", str));
        arrayList.add(new C25304a("miss_call_retry_reject_or_busy", str));
        arrayList.add(new C25304a("retry_call_unsupport_vid", str));
        arrayList.add(new C25304a("retry_call_not_online", str));
        m141299L(arrayList);
    }

    /* renamed from: s1 */
    public void m141379s1(int i11, String str, String str2) {
        try {
            if (f130677u == null) {
                f130677u = new ArrayList();
            }
            f130677u.add(Integer.valueOf(i11));
            m141336d1("Zalo", str, str, i11, PendingIntent.getActivity(MainApplication.getAppContext(), i11, AbstractC23152n3.m119020S(NotificationView.class, null, true), AbstractC19601a.m102572b(134217728)), null, str2, null, null, null, true, null, "core_undefine");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: s2 */
    public void m141380s2(int i11, String str, PendingIntent pendingIntent, String str2, String str3, int i12) {
        Hashtable hashtable;
        String string;
        String string2;
        try {
            if (!TextUtils.isEmpty(str) && (hashtable = f130680x) != null && hashtable.size() != 0 && f130680x.containsKey(str)) {
                Hashtable hashtable2 = f130680x;
                if (hashtable2 != null && hashtable2.size() > 0 && f130680x.containsKey(str)) {
                    if (!TextUtils.isEmpty(str3)) {
                        string = str3;
                    } else {
                        string = MainApplication.getAppContext().getString(AbstractC8020f0.app_name);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        string2 = str2;
                    } else {
                        string2 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_content);
                    }
                    String str4 = i12 + "%";
                    try {
                        m141324X1(str);
                        m141362m2(i11, str, pendingIntent, string, string2, str4, i12, true, false, false, 16);
                    } catch (Exception e11) {
                        e = e11;
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: t */
    public void m141381t() {
        try {
            AbstractC23775p0.m124197b("story_archive");
            m141303N("story_archive");
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: t0 */
    public HashMap m141382t0(String str) {
        try {
            HashMap hashMap = (HashMap) this.f130691i.get(str);
            if (hashMap == null) {
                return new HashMap();
            }
            return hashMap;
        } catch (Exception e11) {
            e11.printStackTrace();
            return new HashMap();
        }
    }

    /* renamed from: t1 */
    public void m141383t1(C32078q7 c32078q7) {
        try {
            C31987k4 c31987k4 = new C31987k4(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO);
            c31987k4.m154202a("appID", c32078q7.m154763t());
            c31987k4.m154202a("actID", Integer.valueOf(c32078q7.m154749L()));
            c31987k4.m154202a("feedSrcNotification", Integer.valueOf(c32078q7.m154746I()));
            Intent m118998H = AbstractC23152n3.m118998H(new C31991k8(c32078q7.m154744G(), false, C32002l4.m154266i(c31987k4)));
            if (m118998H != null) {
                String m108912q = AbstractC20833z.m108912q(c32078q7.m154749L());
                String m108911p = AbstractC20833z.m108911p(m108912q, C20817r.m108718d(c32078q7.m154744G(), c32078q7.m154738A()));
                String m154764u = c32078q7.m154764u();
                CharSequence m154767x = c32078q7.m154767x();
                CharSequence m154765v = c32078q7.m154765v();
                boolean z11 = !TextUtils.isEmpty(m154764u);
                CharSequence m108892G = AbstractC20833z.m108892G(m108912q, m108911p, c32078q7.m154744G(), m154765v.toString(), m154767x.toString());
                if (AbstractC20833z.m108915t(m108912q)) {
                    m141347h(m108912q, m108911p);
                }
                PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), (int) System.currentTimeMillis(), m118998H, AbstractC19601a.m102572b(134217728));
                C23750d c23750d = new C23750d(CoreUtility.getAppContext());
                if (m108892G.length() > 20) {
                    AbstractC1364q.d dVar = new AbstractC1364q.d();
                    dVar.m6828h(m108892G);
                    c23750d.m6869V(dVar);
                }
                c23750d.m6870W(m108892G);
                c23750d.mo6895w("Zalo");
                c23750d.mo6894v(m108892G);
                c23750d.m6893u(activity);
                c23750d.m124165v0(m108912q);
                c23750d.m124164u0(m108911p);
                m141256k2(c23750d);
                m141315T0(m154764u, c23750d, z11);
                c23750d.m124147b0();
                m141262r2();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u */
    public void m141384u() {
        try {
            AbstractC23775p0.m124197b("zalo_video");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: u0 */
    public int m141385u0(String str, String str2) {
        return m141318V(str, str2).hashCode();
    }

    /* renamed from: u1 */
    public void m141386u1(String str, List list) {
        int i11;
        if (list.size() != 0 && AbstractC23309i.m120961G2()) {
            try {
                GroupInvitationInfo groupInvitationInfo = (GroupInvitationInfo) list.get(list.size() - 1);
                if (groupInvitationInfo != null) {
                    int m118423d = AbstractC23088h5.m118423d("new_group_invitation", CoreUtility.f89233i);
                    Context applicationContext = MainApplication.getAppContext().getApplicationContext();
                    C23750d c23750d = new C23750d(applicationContext);
                    c23750d.m124165v0("new_group_invitation");
                    c23750d.m124164u0(m118423d + "");
                    c23750d.m124160q0(false);
                    c23750d.m124161r0(false);
                    c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
                    c23750d.m6890r(AbstractC1388a.m6961c(applicationContext, AbstractC16801x.notification_app_icon_background_color));
                    c23750d.m6856I(AbstractC1388a.m6961c(MainApplication.getAppContext(), AbstractC16801x.led_light_color), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), MainApplication.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light));
                    c23750d.m6886n(true);
                    c23750d.m6893u(PendingIntent.getActivity(MainApplication.getAppContext(), m118423d, AbstractC23152n3.m119012O(GroupInvitationListView.class, null), AbstractC19601a.m102572b(0)));
                    if (groupInvitationInfo.m40898p()) {
                        i11 = AbstractC8020f0.str_community_invitation_noti_title;
                    } else {
                        i11 = AbstractC8020f0.str_new_invitation_noti_title;
                    }
                    String m118746s0 = AbstractC23136l9.m118746s0(i11, groupInvitationInfo.m40887e());
                    SpannableString spannableString = new SpannableString(m118746s0);
                    spannableString.setSpan(new StyleSpan(1), 0, m118746s0.length(), 33);
                    c23750d.mo6895w(spannableString);
                    c23750d.mo6894v(new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_new_invitation_noti_message, groupInvitationInfo.m40892j().m40383Q(true, false).trim())));
                    if (list.size() > 1) {
                        c23750d.m6862O(2).m6888p("msg").m6859L(list.size());
                        AbstractC1364q.h hVar = new AbstractC1364q.h();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            GroupInvitationInfo groupInvitationInfo2 = (GroupInvitationInfo) it.next();
                            hVar.m6900h(new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_new_invitation_noti_message, groupInvitationInfo2.m40892j().m40383Q(true, false).trim(), groupInvitationInfo2.m40887e())));
                        }
                        c23750d.m6869V(hVar);
                    }
                    c23750d.m124147b0();
                    m141262r2();
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("", e11);
            }
        }
    }

    /* renamed from: u2 */
    void m141387u2(String str, String str2, String str3, String str4, String str5, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str6, String str7, List list, int i11) {
        m141390v2(str, str2, str3, str4, str5, pendingIntent, pendingIntent2, str6, str7, list, i11, -1, false);
    }

    /* renamed from: v0 */
    int m141388v0(String str) {
        return str.hashCode();
    }

    /* renamed from: v1 */
    public void m141389v1(String str, int i11) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("entry_point_chain", C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_FIND_STREAM_INFO).m154277l());
            Intent m119020S = AbstractC23152n3.m119020S(SocialMemoryView.class, bundle, true);
            String m108912q = AbstractC20833z.m108912q(i11);
            String m108911p = AbstractC20833z.m108911p(m108912q, null);
            PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), (int) System.currentTimeMillis(), m119020S, AbstractC19601a.m102572b(134217728));
            C23750d c23750d = new C23750d(CoreUtility.getAppContext());
            c23750d.m6870W(str);
            c23750d.mo6895w("Zalo");
            c23750d.mo6894v(str);
            c23750d.m6893u(activity);
            c23750d.m124165v0(m108912q);
            c23750d.m124164u0(m108911p);
            m141256k2(c23750d);
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v2 */
    void m141390v2(String str, String str2, String str3, String str4, String str5, PendingIntent pendingIntent, PendingIntent pendingIntent2, String str6, String str7, List list, int i11, int i12, boolean z11) {
        try {
            C23750d c23750d = new C23750d(CoreUtility.getAppContext());
            c23750d.m124165v0(str);
            c23750d.m124164u0(str2);
            c23750d.m6870W(str4);
            c23750d.mo6894v(str5);
            c23750d.m6850B(pendingIntent2);
            m141313S0(str6, c23750d);
            c23750d.m124158o0(list);
            c23750d.m6893u(pendingIntent);
            c23750d.mo6895w(str3);
            if (i12 != -1) {
                boolean z12 = true;
                if (i12 != 1) {
                    z12 = false;
                }
                c23750d.m124160q0(z12);
            }
            if (str7 != null && !TextUtils.isEmpty(str7)) {
                c23750d.m124167x0(str7);
            }
            if (i11 > 0) {
                c23750d.m6866S(i11);
            }
            if (!z11) {
                m141256k2(c23750d);
            }
            c23750d.m124147b0();
            m141262r2();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
        }
    }

    /* renamed from: w */
    public void m141391w() {
        try {
            AbstractC23775p0.m124198c("other", "captive_portal");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w0 */
    public int m141392w0(String str) {
        return AbstractC23352g.m122788d(9 + str).hashCode();
    }

    /* renamed from: w1 */
    public void m141393w1(int i11, String str, PendingIntent pendingIntent, String str2, String str3) {
        String string;
        String string2;
        try {
            if (!TextUtils.isEmpty(str2)) {
                string = str2;
            } else {
                string = MainApplication.getAppContext().getString(AbstractC8020f0.app_name);
            }
            if (!TextUtils.isEmpty(str3)) {
                string2 = str3;
            } else {
                string2 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_content);
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            m141324X1(str);
            m141362m2(i11, str, pendingIntent, string, string2, "", 0, true, false, false, 32);
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
        }
    }

    /* renamed from: x */
    public void m141394x(String str) {
        Hashtable hashtable;
        try {
            if (!TextUtils.isEmpty(str) && (hashtable = f130678v) != null) {
                this.f130683a.m6696b(((Integer) hashtable.get(str)).intValue());
                f130678v.remove(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x1 */
    public void m141395x1(int i11, String str, PendingIntent pendingIntent, String str2, String str3) {
        String string;
        String string2;
        try {
            if (!TextUtils.isEmpty(str2)) {
                string = str2;
            } else {
                string = MainApplication.getAppContext().getString(AbstractC8020f0.app_name);
            }
            if (!TextUtils.isEmpty(str3)) {
                string2 = str3;
            } else {
                string2 = MainApplication.getAppContext().getString(AbstractC8020f0.chat_file_download_noti_content);
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            m141324X1(str);
            m141362m2(i11, str, pendingIntent, string, string2, "", 0, true, false, false, 16);
        } catch (Exception e12) {
            e = e12;
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    public void m141396y() {
        try {
            this.f130683a.m6696b(6);
            AbstractC23775p0.m124197b("new_feed");
            AbstractC23775p0.m124197b("comment");
            AbstractC23775p0.m124197b("like");
            AbstractC23775p0.m124197b("like_comment");
            AbstractC23775p0.m124197b("new_story");
            AbstractC23775p0.m124197b("miss_multiple_feeds");
            m141303N("new_feed");
            m141303N("new_story");
            m141303N("miss_multiple_feeds");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y1 */
    public void m141397y1(String str, int i11, String str2, int i12) {
        Intent m119012O;
        boolean m110048i = C21242e.m110039d().m110048i(C18613b.f93601t);
        Bundle m119055m = AbstractC23152n3.m119055m(m110048i, i11, "", "", 261, "", i12);
        if (!m110048i) {
            m119012O = AbstractC23152n3.m119012O(StickerDetailsView.class, m119055m);
        } else {
            m119012O = AbstractC23152n3.m119012O(ZaloWebView.class, m119055m);
        }
        m119012O.setFlags(67108864);
        m141336d1("Zalo", str, str, i11, PendingIntent.getActivity(MainApplication.getAppContext(), i11, m119012O, AbstractC19601a.m102572b(134217728)), null, str2, null, null, null, true, null, "default");
    }

    /* renamed from: z */
    public void m141398z(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int m141392w0 = m141392w0(str);
        ArrayList arrayList = new ArrayList();
        m141248f2(AbstractC23088h5.m118423d("new_friend", String.valueOf(m141392w0)));
        arrayList.add(new C25304a("new_friend", String.valueOf(m141392w0)));
        m141248f2(AbstractC23088h5.m118423d("friend_accept", String.valueOf(m141392w0)));
        arrayList.add(new C25304a("friend_accept", String.valueOf(m141392w0)));
        AbstractC23775p0.m124200e(arrayList);
    }

    /* renamed from: z1 */
    public void m141399z1(int i11, String str, String str2, String str3, String str4, String str5, boolean z11, boolean z12, String str6) {
        if (i11 == 0) {
            return;
        }
        if (z12) {
            try {
                AbstractC20833z.m108903h();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        Intent m141242b1 = m141242b1(str2, str3, z11);
        String m108911p = AbstractC20833z.m108911p("new_story", C20817r.m108717c(str2, z12));
        if (AbstractC20833z.m108915t("new_story")) {
            m141347h("new_story", m108911p);
        }
        CharSequence m108892G = AbstractC20833z.m108892G("new_story", m108911p, str3, str, str6);
        PendingIntent activity = PendingIntent.getActivity(MainApplication.getAppContext(), (int) System.currentTimeMillis(), m141242b1, AbstractC19601a.m102572b(134217728));
        C23750d c23750d = new C23750d(CoreUtility.getAppContext());
        c23750d.m6870W(m108892G);
        c23750d.mo6895w("Zalo");
        c23750d.mo6894v(m108892G);
        c23750d.m6893u(activity);
        c23750d.m124165v0("new_story");
        c23750d.m124164u0(m108911p);
        c23750d.m124167x0(str5);
        m141313S0(str4, c23750d);
        m141256k2(c23750d);
        c23750d.m124147b0();
        m141262r2();
    }
}
