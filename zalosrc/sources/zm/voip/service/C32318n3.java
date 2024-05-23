package zm.voip.service;

import android.R;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC1364q;
import bp0.AbstractC3082b0;
import bp0.AbstractC3096i0;
import bp0.AbstractC3103o;
import bp0.AbstractC3108t;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import com.zing.zalocore.CoreUtility;
import gp0.C19577z;
import gu.AbstractC19601a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import lo0.C22621q0;
import me0.AbstractC23104j;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.AbstractC23171p0;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.AbstractC23775p0;
import p363nh.C23750d;
import p363nh.EnumC23747b0;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.EnumC25629a;
import ro0.C25942f;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: zm.voip.service.n3 */
/* loaded from: classes7.dex */
public class C32318n3 {

    /* renamed from: a */
    private final C23528a f149165a;

    /* renamed from: b */
    private Bitmap f149166b;

    /* renamed from: c */
    private RecyclingImageView f149167c;

    /* renamed from: d */
    private C23750d f149168d;

    /* renamed from: e */
    private RemoteViews f149169e;

    /* renamed from: f */
    private RemoteViews f149170f;

    /* renamed from: g */
    private final List f149171g;

    /* renamed from: h */
    private Bitmap f149172h;

    /* renamed from: i */
    private Bitmap f149173i;

    /* renamed from: j */
    private C23750d f149174j;

    /* renamed from: k */
    private volatile boolean f149175k;

    /* renamed from: l */
    private volatile boolean f149176l;

    /* renamed from: m */
    private volatile boolean f149177m;

    /* renamed from: n */
    private volatile boolean f149178n;

    /* renamed from: o */
    private volatile boolean f149179o;

    /* renamed from: p */
    private volatile boolean f149180p;

    /* renamed from: q */
    private volatile boolean f149181q;

    /* renamed from: r */
    private String f149182r;

    /* renamed from: s */
    private int f149183s;

    /* renamed from: t */
    private final Handler f149184t;

    /* renamed from: u */
    private final Runnable f149185u;

    /* renamed from: v */
    private int f149186v;

    /* renamed from: zm.voip.service.n3$a */
    /* loaded from: classes7.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 1) {
                C32318n3.this.m156229a0();
                return;
            }
            if (i11 == 2) {
                C32318n3.this.m156229a0();
                C32318n3.this.m156255N();
            } else if (i11 == 3) {
                C32318n3.this.m156249w();
            } else if (i11 == 4) {
                C32318n3.this.m156248v();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.n3$b */
    /* loaded from: classes7.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final RecyclingImageView f149188l1 = new RecyclingImageView(MainApplication.getAppContext());

        b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                this.f149188l1.setImageInfo(c3979l, false);
                if (c3979l != null && c3979l.m18839c() != null) {
                    C32318n3.this.f149171g.add(c3979l.m18839c());
                    C32318n3.this.f149184t.post(C32318n3.this.f149185u);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zm.voip.service.n3$c */
    /* loaded from: classes7.dex */
    public class c extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f149190l1;

        /* renamed from: m1 */
        final /* synthetic */ int f149191m1;

        c(String str, int i11) {
            this.f149190l1 = str;
            this.f149191m1 = i11;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                AbstractC3082b0.m15421c("VoIPNotifications", "callback url:" + str);
                C32318n3.this.f149167c.setImageInfo(c3979l, false);
                if (c3979l != null && c3979l.m18839c() != null && this.f149190l1.equals(str)) {
                    Bitmap m156221O = C32318n3.m156221O(this.f149191m1, c3979l.m18839c());
                    C32318n3.this.m156224T(m156221O);
                    C32318n3.this.f149166b = m156221O;
                    C32318n3.this.f149168d.m124147b0();
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VoIPNotifications", "prepareCallNotification : " + e11.getMessage(), e11);
            }
        }
    }

    /* renamed from: zm.voip.service.n3$d */
    /* loaded from: classes7.dex */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C32318n3.this.f149183s == -1) {
                return;
            }
            if (!C32318n3.this.f149171g.isEmpty()) {
                int i11 = C32318n3.this.f149183s;
                Bitmap[] bitmapArr = new Bitmap[i11];
                for (int i12 = 0; i12 < C32318n3.this.f149171g.size() && i12 < i11; i12++) {
                    bitmapArr[i12] = (Bitmap) C32318n3.this.f149171g.get(i12);
                }
                if (C32318n3.this.f149173i == null) {
                    C32318n3.this.f149173i = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.default_avatar);
                }
                for (int i13 = 0; i13 < i11; i13++) {
                    if (bitmapArr[i13] == null) {
                        bitmapArr[i13] = C32318n3.this.f149173i;
                    }
                }
                if (C32318n3.this.f149183s == 1) {
                    AbstractC23170p.m119351i(C32318n3.this.m156250x(), bitmapArr[0], false);
                } else if (C32318n3.this.f149183s == 2) {
                    AbstractC23170p.m119353k(C32318n3.this.m156250x(), bitmapArr[0], bitmapArr[1], 0, false);
                } else if (C32318n3.this.f149183s == 3) {
                    AbstractC23170p.m119352j(C32318n3.this.m156250x(), bitmapArr[0], bitmapArr[1], bitmapArr[2], 0, false);
                } else if (C32318n3.this.f149183s == 4) {
                    AbstractC23170p.m119348f(C32318n3.this.m156250x(), bitmapArr[0], bitmapArr[1], bitmapArr[2], bitmapArr[3], 0, false);
                } else {
                    AbstractC23170p.m119349g(C32318n3.this.m156250x(), bitmapArr[0], bitmapArr[1], bitmapArr[2], BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.default_avatar_plus), C32318n3.this.f149182r, 0, false);
                }
                C32318n3 c32318n3 = C32318n3.this;
                c32318n3.m156224T(c32318n3.m156250x());
                return;
            }
            if (C32318n3.this.f149172h == null) {
                C32318n3.this.f149172h = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.avatar_groupchat);
            }
            C32318n3 c32318n32 = C32318n3.this;
            c32318n32.m156224T(c32318n32.f149172h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zm.voip.service.n3$e */
    /* loaded from: classes7.dex */
    public static class e {

        /* renamed from: a */
        public static final C32318n3 f149194a = new C32318n3();
    }

    /* renamed from: A */
    private String m156210A(C22621q0 c22621q0) {
        if (c22621q0 != null) {
            if (AbstractC23309i.m121109K2() == 1) {
                return c22621q0.m116991n();
            }
            return c22621q0.m116983f();
        }
        return "";
    }

    /* renamed from: B */
    private int m156211B(boolean z11) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            if (z11 && AbstractC3096i0.m15507P(AbstractC3096i0.m15574y()).booleanValue()) {
                return 192;
            }
            return 128;
        }
        if (i11 >= 29) {
            return -1;
        }
        return 0;
    }

    /* renamed from: C */
    private int m156212C(boolean z11, boolean z12) {
        return z11 ? z12 ? AbstractC16803z.ic_video_call_incoming_white : AbstractC16803z.ic_video_call_incoming_blue : z12 ? AbstractC16803z.ic_call_incoming_white : AbstractC16803z.ic_call_incoming_blue;
    }

    /* renamed from: D */
    private int m156213D(boolean z11, boolean z12) {
        return z11 ? z12 ? AbstractC16803z.ic_video_call_outgoing_white : AbstractC16803z.ic_video_call_outgoing_blue : z12 ? AbstractC16803z.ic_call_outgoing_white : AbstractC16803z.ic_call_outgoing_blue;
    }

    /* renamed from: E */
    public static C32318n3 m156214E() {
        return e.f149194a;
    }

    /* renamed from: F */
    private int m156215F() {
        if (this.f149186v <= 0) {
            this.f149186v = CoreUtility.getAppContext().getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width);
        }
        return this.f149186v;
    }

    /* renamed from: G */
    private int m156216G(C22621q0 c22621q0) {
        if (c22621q0.m116995r()) {
            return m156213D(c22621q0.m116975A(), m156218J(c22621q0));
        }
        return m156212C(c22621q0.m116975A(), m156218J(c22621q0));
    }

    /* renamed from: H */
    private void m156217H(C22621q0 c22621q0) {
        String m156252z;
        String m156210A;
        if (c22621q0.m117000w()) {
            m156252z = m156251y(c22621q0);
        } else {
            m156252z = m156252z(c22621q0);
        }
        if (c22621q0.m117000w()) {
            if (c22621q0.m116999v()) {
                m156210A = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ongoing_noti_title);
            } else if (c22621q0.m116994q()) {
                if (!c22621q0.m117002y() && !c22621q0.m116995r()) {
                    m156210A = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_incoming_noti_title);
                } else {
                    m156210A = AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_outgoing_noti_title);
                }
            } else {
                m156210A = "";
            }
        } else {
            m156210A = m156210A(c22621q0);
        }
        if (m156219K()) {
            int i11 = AbstractC3096i0.m15574y().getResources().getConfiguration().uiMode & 48;
            this.f149168d.m6866S(m156216G(c22621q0));
            if (!c22621q0.m116999v() && (!c22621q0.m116994q() || !c22621q0.m116995r())) {
                if (c22621q0.m116994q()) {
                    this.f149169e = new RemoteViews(AbstractC3096i0.m15574y().getPackageName(), AbstractC7409c0.noti_custom_call_collap);
                    if (AbstractC23171p0.m119375g()) {
                        this.f149169e.setInt(AbstractC6918a0.mainContainer, "setBackgroundResource", AbstractC16803z.res_call_bg_noti_collap_white);
                    } else {
                        this.f149169e.setInt(AbstractC6918a0.mainContainer, "setBackgroundResource", R.color.white);
                    }
                    this.f149169e.setImageViewResource(AbstractC6918a0.icon_zalo_blue, m156216G(c22621q0));
                    m156225U(false);
                    this.f149169e.setTextViewText(AbstractC6918a0.tv_title, m156210A);
                    this.f149169e.setTextViewText(AbstractC6918a0.tv_content, m156252z);
                    if (this.f149178n) {
                        this.f149169e.setViewVisibility(AbstractC6918a0.elapse_time, 0);
                        this.f149169e.setViewVisibility(AbstractC6918a0.tv_open, 0);
                        this.f149169e.setViewVisibility(AbstractC6918a0.tv_close, 0);
                        this.f149169e.setChronometer(AbstractC6918a0.elapse_time, c22621q0.m116982e(), null, true);
                    }
                    this.f149169e.setTextColor(AbstractC6918a0.tv_title, Color.parseColor("#000000"));
                    this.f149169e.setTextColor(AbstractC6918a0.tv_content, Color.parseColor("#5e6265"));
                    this.f149169e.setTextColor(AbstractC6918a0.title_branch, Color.parseColor("#0068FF"));
                    if (i11 == 32) {
                        this.f149170f = new RemoteViews(AbstractC3096i0.m15574y().getPackageName(), AbstractC7409c0.noti_custom_call_expand_darkmode);
                    } else {
                        this.f149170f = new RemoteViews(AbstractC3096i0.m15574y().getPackageName(), AbstractC7409c0.noti_custom_call_expand);
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        this.f149170f.setViewVisibility(AbstractC6918a0.branch_area, 8);
                        this.f149170f.setViewPadding(AbstractC6918a0.mainContainer, 0, AbstractC23136l9.m118742r(16.0f), 0, 0);
                    } else {
                        this.f149170f.setViewVisibility(AbstractC6918a0.branch_area, 0);
                    }
                    this.f149170f.setImageViewResource(AbstractC6918a0.icon_zalo_blue, m156216G(c22621q0));
                    this.f149170f.setTextViewText(AbstractC6918a0.tv_btn_right, AbstractC3096i0.m15574y().getString(AbstractC8020f0.take_call));
                    this.f149170f.setTextViewText(AbstractC6918a0.tv_btn_left, AbstractC3096i0.m15574y().getString(AbstractC8020f0.decline_call));
                    this.f149170f.setTextViewText(AbstractC6918a0.tv_title, m156210A);
                    this.f149170f.setTextViewText(AbstractC6918a0.tv_content, m156252z);
                    if (c22621q0.m116975A()) {
                        this.f149170f.setTextViewCompoundDrawables(AbstractC6918a0.tv_btn_right, AbstractC16803z.ic_wfilled_video_call_banner, 0, 0, 0);
                    } else {
                        this.f149170f.setTextViewCompoundDrawables(AbstractC6918a0.tv_btn_right, AbstractC16803z.ic_wfilled_accept_call_banner, 0, 0, 0);
                    }
                    this.f149168d.m6896x(this.f149170f);
                    this.f149168d.m6898z(this.f149170f);
                    this.f149168d.m6897y(this.f149169e);
                }
            } else {
                this.f149169e = new RemoteViews(AbstractC3096i0.m15574y().getPackageName(), AbstractC7409c0.noti_custom_call_collap);
                if (AbstractC23171p0.m119375g()) {
                    this.f149169e.setInt(AbstractC6918a0.mainContainer, "setBackgroundResource", AbstractC16803z.res_call_bg_noti_collap_blue);
                } else {
                    this.f149169e.setInt(AbstractC6918a0.mainContainer, "setBackgroundResource", AbstractC16801x.bg_noti_custom_in_call);
                }
                this.f149169e.setImageViewResource(AbstractC6918a0.icon_zalo_blue, m156216G(c22621q0));
                m156225U(true);
                this.f149169e.setTextViewText(AbstractC6918a0.tv_title, m156210A);
                this.f149169e.setTextViewText(AbstractC6918a0.tv_content, m156252z);
                if (this.f149178n) {
                    this.f149169e.setViewVisibility(AbstractC6918a0.elapse_time, 0);
                    this.f149169e.setViewVisibility(AbstractC6918a0.tv_open, 0);
                    this.f149169e.setViewVisibility(AbstractC6918a0.tv_close, 0);
                    this.f149169e.setChronometer(AbstractC6918a0.elapse_time, c22621q0.m116982e(), null, true);
                }
                this.f149169e.setTextColor(AbstractC6918a0.tv_title, Color.parseColor("#FFFFFF"));
                this.f149169e.setTextColor(AbstractC6918a0.tv_content, Color.parseColor("#FFFFFF"));
                this.f149169e.setTextColor(AbstractC6918a0.title_branch, Color.parseColor("#FFFFFF"));
                this.f149168d.m6896x(this.f149169e);
                this.f149168d.m6897y(this.f149169e);
                this.f149168d.m6898z(this.f149169e);
            }
            Bitmap bitmap = this.f149166b;
            if (bitmap != null) {
                m156224T(bitmap);
                return;
            }
            return;
        }
        if (this.f149178n) {
            if (!this.f149180p) {
                this.f149168d = null;
                this.f149177m = false;
                m156222P(false);
            }
            this.f149180p = true;
            this.f149168d.m6866S(m156216G(c22621q0)).mo6895w(m156210A).m6871X(true).m6891s(true).m6890r(AbstractC3096i0.m15574y().getResources().getColor(AbstractC16801x.bg_noti_custom_in_call)).mo6894v(m156252z);
            return;
        }
        this.f149168d.m6866S(m156216G(c22621q0)).mo6895w(m156210A).mo6894v(m156252z);
    }

    /* renamed from: J */
    private boolean m156218J(C22621q0 c22621q0) {
        if (!c22621q0.m116999v() && (!c22621q0.m116994q() || !c22621q0.m116995r())) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    private boolean m156219K() {
        if (AbstractC23309i.m122231o2() == 1 && !AbstractC23104j.m118480b(31) && (AbstractC23171p0.m119373e() || AbstractC23171p0.m119369a() || AbstractC23171p0.m119375g() || AbstractC23171p0.m119370b() || AbstractC23171p0.m119372d())) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private void m156220L(String str, C23528a c23528a) {
        C3979l m123605k = c23528a.m123605k(str, 0, EnumC25629a.DEFAULT);
        if (m123605k != null && m123605k.m18839c() != null) {
            this.f149171g.add(m123605k.m18839c());
            this.f149184t.post(this.f149185u);
        } else {
            b bVar = new b();
            bVar.m125611h1(26005, 0);
            ((C23528a) c23528a.m123612r(bVar.f149188l1)).m123584H(str, true, true, 0, 0, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public static Bitmap m156221O(int i11, Bitmap bitmap) {
        if (!AbstractC3103o.m15619h(11)) {
            return bitmap;
        }
        double d11 = i11;
        if (bitmap.getWidth() * 1.1d < d11 || bitmap.getWidth() * 0.9d > d11) {
            AbstractC3082b0.m15421c("VoIPNotifications", String.format(Locale.getDefault(), "create scaled bitmap for notification icon from %d to %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(i11)));
            int i12 = (int) (d11 * 0.95d);
            bitmap = Bitmap.createScaledBitmap(bitmap, i12, i12, false);
        }
        return C23999j.m125743s2(bitmap);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x026d A[Catch: Exception -> 0x0112, TryCatch #1 {Exception -> 0x0112, blocks: (B:21:0x0097, B:24:0x009f, B:27:0x00e0, B:29:0x00f9, B:30:0x0126, B:32:0x0130, B:33:0x0132, B:35:0x0138, B:36:0x0141, B:38:0x0161, B:39:0x01c6, B:41:0x01f0, B:43:0x01f8, B:45:0x0220, B:47:0x0228, B:49:0x0230, B:51:0x023d, B:53:0x026d, B:55:0x0271, B:56:0x0276, B:62:0x022c, B:64:0x0233, B:65:0x0236, B:68:0x017a, B:69:0x013d, B:70:0x0115, B:71:0x018a, B:73:0x0190, B:75:0x0194, B:77:0x01ab, B:78:0x01c3), top: B:20:0x0097, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023a  */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m156222P(boolean z11) {
        Intent m15533d0;
        PendingIntent activity;
        EnumC23747b0 enumC23747b0;
        EnumC23747b0 enumC23747b02;
        Intent m15533d02;
        C22621q0 c22621q0 = new C22621q0();
        AbstractC3082b0.m15424f("VoIPNotifications", "updateCallNotification isCustomNoti: " + z11 + " enableHeadsUp: " + this.f149175k + " - shouldAddNotifyAction()" + c22621q0.m116977C());
        if (!c22621q0.m116992o() || AbstractC3096i0.f13163g) {
            return false;
        }
        EnumC23747b0 enumC23747b03 = EnumC23747b0.f114862I;
        try {
            if (this.f149168d == null) {
                this.f149168d = new C23750d(AbstractC3096i0.m15574y());
            }
            if (!this.f149179o) {
                this.f149168d.f6044b.clear();
            }
            int currentTimeMillis = (int) System.currentTimeMillis();
            if (!c22621q0.m117000w()) {
                m15533d0 = AbstractC3096i0.m15531c0();
            } else {
                m15533d0 = AbstractC3096i0.m15533d0();
            }
            m15533d0.putExtra("EXTRA_DATA_IS_SHOW_FROM_NOTI_NEED_PERMISSION", false);
            activity = PendingIntent.getActivity(AbstractC3096i0.m15574y(), currentTimeMillis, m15533d0, AbstractC19601a.m102572b(134217728));
            this.f149168d.m6893u(activity);
            C28023b6.m141256k2(this.f149168d);
            if (z11) {
                m156217H(c22621q0);
            }
            try {
            } catch (Exception e11) {
                AbstractC3082b0.m15423e("VoIPNotifications", "prepareCallNotification handle notification : " + e11.getMessage(), e11);
            }
        } catch (Exception e12) {
            AbstractC3082b0.m15422d("VoIPNotifications", "prepareCallNotification failed: " + e12.toString());
        }
        if (AbstractC3103o.m15619h(21)) {
            this.f149168d.m6888p("call");
            this.f149168d.m6852E(null, false);
            AbstractC3082b0.m15421c("VoIPNotifications", "updateCallNotification is compatible 21: " + c22621q0.m116977C() + " " + c22621q0.m116999v() + " " + this.f149179o);
            if (c22621q0.m116977C()) {
                enumC23747b0 = EnumC23747b0.f114855B;
                PendingIntent broadcast = PendingIntent.getBroadcast(AbstractC3096i0.m15574y(), 0, new Intent("m.voip.api.action.ACTION_NOTI_END_CALL"), AbstractC19601a.m102571a(268435456));
                if (m156219K()) {
                    this.f149170f.setTextViewText(AbstractC6918a0.tv_btn_left, AbstractC3096i0.m15574y().getString(AbstractC8020f0.decline_call));
                    this.f149170f.setOnClickPendingIntent(AbstractC6918a0.fl_btn_left, broadcast);
                } else {
                    this.f149168d.m6874a(AbstractC16803z.ic_callend_notifbar, AbstractC3096i0.m15574y().getString(AbstractC8020f0.decline_call), broadcast);
                }
                String[] strArr = AbstractC3108t.f13193a;
                int i11 = AbstractC16803z.ic_answer_notifbar;
                if (c22621q0.m116975A()) {
                    i11 = AbstractC16803z.ic_videocall_notifbar;
                }
                if (!c22621q0.m117000w()) {
                    m15533d02 = AbstractC3096i0.m15531c0();
                } else {
                    m15533d02 = AbstractC3096i0.m15533d0();
                }
                m15533d02.putExtra("EXTRA_DATA_IS_SHOW_FROM_NOTI", true);
                m15533d02.putExtra("EXTRA_DATA_IS_SHOW_FROM_NOTI_NEED_PERMISSION", true);
                m15533d02.putExtra("EXTRA_DATA_ACCEPT_CALL_FROM_NOTI", true);
                PendingIntent activity2 = PendingIntent.getActivity(AbstractC3096i0.m15574y(), 2, m15533d02, AbstractC19601a.m102572b(134217728));
                if (m156219K()) {
                    this.f149170f.setTextViewText(AbstractC6918a0.tv_btn_right, AbstractC3096i0.m15574y().getString(AbstractC8020f0.take_call));
                    this.f149170f.setOnClickPendingIntent(AbstractC6918a0.fl_btn_right, activity2);
                } else {
                    this.f149168d.m6874a(i11, AbstractC3096i0.m15574y().getString(AbstractC8020f0.take_call), activity2);
                }
                AbstractC3082b0.m15421c("VoIPNotifications", "updateCallNotification before create channel: " + enumC23747b0 + " " + AbstractC3096i0.f13166j + " " + AbstractC3096i0.m15540h());
                enumC23747b02 = EnumC23747b0.f114855B;
                if (enumC23747b0 != enumC23747b02 && AbstractC3103o.m15619h(26)) {
                    AbstractC3082b0.m15424f("VoIPNotifications", "canStartFromForeground " + AbstractC3096i0.m15540h() + " VoipUtils.sIsCallActOnStart " + AbstractC3096i0.f13166j);
                    if ((!AbstractC3096i0.m15540h() && AbstractC3103o.m15619h(29) && !AbstractC3096i0.f13166j) || this.f149175k) {
                        this.f149175k = true;
                        enumC23747b03 = enumC23747b0;
                        AbstractC3082b0.m15424f("VoIPNotifications", "setFullScreenIntent shouldAddNotifyAction " + c22621q0.m116977C() + " mEnableHeadsUp " + this.f149175k + " channel " + enumC23747b03);
                        if (c22621q0.m116977C()) {
                        }
                        this.f149168d.m124160q0(this.f149175k);
                        this.f149168d.mo6860M(true);
                        this.f149168d.m124163t0(enumC23747b03);
                        this.f149168d.m124165v0("incall");
                        this.f149168d.m124164u0("");
                        this.f149168d.mo6861N(true);
                        m156227Z(c22621q0.m116978a(), c22621q0);
                        return true;
                    }
                    this.f149175k = false;
                    AbstractC3082b0.m15424f("VoIPNotifications", "setFullScreenIntent shouldAddNotifyAction " + c22621q0.m116977C() + " mEnableHeadsUp " + this.f149175k + " channel " + enumC23747b03);
                    if (c22621q0.m116977C()) {
                    }
                    this.f149168d.m124160q0(this.f149175k);
                    this.f149168d.mo6860M(true);
                    this.f149168d.m124163t0(enumC23747b03);
                    this.f149168d.m124165v0("incall");
                    this.f149168d.m124164u0("");
                    this.f149168d.mo6861N(true);
                    m156227Z(c22621q0.m116978a(), c22621q0);
                    return true;
                }
                if (this.f149175k) {
                    enumC23747b03 = enumC23747b02;
                    AbstractC3082b0.m15424f("VoIPNotifications", "setFullScreenIntent shouldAddNotifyAction " + c22621q0.m116977C() + " mEnableHeadsUp " + this.f149175k + " channel " + enumC23747b03);
                    if (c22621q0.m116977C() && this.f149175k) {
                        this.f149168d.m6852E(activity, true);
                    }
                    this.f149168d.m124160q0(this.f149175k);
                    this.f149168d.mo6860M(true);
                    this.f149168d.m124163t0(enumC23747b03);
                    this.f149168d.m124165v0("incall");
                    this.f149168d.m124164u0("");
                    this.f149168d.mo6861N(true);
                    m156227Z(c22621q0.m116978a(), c22621q0);
                    return true;
                }
                enumC23747b03 = enumC23747b0;
                AbstractC3082b0.m15424f("VoIPNotifications", "setFullScreenIntent shouldAddNotifyAction " + c22621q0.m116977C() + " mEnableHeadsUp " + this.f149175k + " channel " + enumC23747b03);
                if (c22621q0.m116977C()) {
                    this.f149168d.m6852E(activity, true);
                }
                this.f149168d.m124160q0(this.f149175k);
                this.f149168d.mo6860M(true);
                this.f149168d.m124163t0(enumC23747b03);
                this.f149168d.m124165v0("incall");
                this.f149168d.m124164u0("");
                this.f149168d.mo6861N(true);
                m156227Z(c22621q0.m116978a(), c22621q0);
                return true;
            }
            if (c22621q0.m116999v() && !this.f149179o) {
                PendingIntent broadcast2 = PendingIntent.getBroadcast(AbstractC3096i0.m15574y(), 0, new Intent("m.voip.api.action.ACTION_NOTI_END_CALL"), AbstractC19601a.m102571a(268435456));
                if (AbstractC23309i.m122231o2() == 0) {
                    this.f149168d.f6044b.clear();
                    this.f149168d.m6874a(AbstractC16803z.ic_callend_notifbar, AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_end_call_status), broadcast2);
                }
                this.f149179o = true;
            }
        }
        enumC23747b0 = enumC23747b03;
        AbstractC3082b0.m15421c("VoIPNotifications", "updateCallNotification before create channel: " + enumC23747b0 + " " + AbstractC3096i0.f13166j + " " + AbstractC3096i0.m15540h());
        enumC23747b02 = EnumC23747b0.f114855B;
        if (enumC23747b0 != enumC23747b02) {
        }
        if (this.f149175k) {
        }
        enumC23747b03 = enumC23747b0;
        AbstractC3082b0.m15424f("VoIPNotifications", "setFullScreenIntent shouldAddNotifyAction " + c22621q0.m116977C() + " mEnableHeadsUp " + this.f149175k + " channel " + enumC23747b03);
        if (c22621q0.m116977C()) {
        }
        this.f149168d.m124160q0(this.f149175k);
        this.f149168d.mo6860M(true);
        this.f149168d.m124163t0(enumC23747b03);
        this.f149168d.m124165v0("incall");
        this.f149168d.m124164u0("");
        this.f149168d.mo6861N(true);
        m156227Z(c22621q0.m116978a(), c22621q0);
        return true;
    }

    /* renamed from: S */
    private void m156223S() {
        List list = this.f149171g;
        if (list != null) {
            list.clear();
        }
        this.f149166b = null;
        RemoteViews remoteViews = this.f149170f;
        if (remoteViews != null) {
            remoteViews.setImageViewBitmap(AbstractC6918a0.imv_avatar, null);
        }
        RemoteViews remoteViews2 = this.f149169e;
        if (remoteViews2 != null) {
            remoteViews2.setImageViewBitmap(AbstractC6918a0.imv_avatar, null);
        }
        C23750d c23750d = this.f149168d;
        if (c23750d != null) {
            c23750d.mo6855H(null);
            this.f149168d.m124147b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m156224T(Bitmap bitmap) {
        try {
            if (m156219K()) {
                RemoteViews remoteViews = this.f149170f;
                if (remoteViews != null) {
                    remoteViews.setImageViewBitmap(AbstractC6918a0.imv_avatar, bitmap);
                }
                RemoteViews remoteViews2 = this.f149169e;
                if (remoteViews2 != null) {
                    remoteViews2.setImageViewBitmap(AbstractC6918a0.imv_avatar, bitmap);
                    return;
                }
                return;
            }
            this.f149168d.mo6855H(bitmap);
            this.f149168d.m124147b0();
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoIPNotifications", "setBitmapAvatar : " + e11.getMessage(), e11);
        }
    }

    /* renamed from: U */
    private void m156225U(boolean z11) {
        if (AbstractC23171p0.m119373e() && Build.VERSION.SDK_INT >= 24) {
            this.f149169e.setViewVisibility(AbstractC6918a0.ll_btn_action, 8);
            this.f149169e.setViewVisibility(AbstractC6918a0.branch_area, 0);
            this.f149169e.setViewVisibility(AbstractC6918a0.imv_avatar_zalo, 8);
            this.f149169e.setViewPadding(AbstractC6918a0.mainContainer, 0, 0, 0, AbstractC23136l9.m118742r(12.0f));
            return;
        }
        this.f149169e.setViewPadding(AbstractC6918a0.mainContainer, 0, 0, 0, 0);
        this.f149169e.setViewVisibility(AbstractC6918a0.branch_area, 8);
        this.f149169e.setViewVisibility(AbstractC6918a0.imv_avatar_zalo, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m156226X() {
        try {
            m156262u();
            Service m155851U = AbstractC32273e3.m155748Q().m155851U();
            if (m155851U != null) {
                m155851U.stopForeground(true);
            }
        } catch (Throwable th2) {
            AbstractC3082b0.m15422d("VoIPNotifications", "stopForegroundService " + th2);
        }
        this.f149181q = false;
    }

    /* renamed from: Z */
    private void m156227Z(String str, C22621q0 c22621q0) {
        try {
            if (c22621q0.m117000w()) {
                List list = this.f149171g;
                if (list != null) {
                    list.clear();
                }
                this.f149166b = null;
                List m102407a0 = C19577z.m102341J().m102407a0();
                this.f149183s = m102407a0.size() + 1;
                this.f149182r = "" + this.f149183s;
                for (int i11 = 0; i11 < Math.min(m102407a0.size(), 4); i11++) {
                    m156220L(((C25942f) m102407a0.get(i11)).m133653b(), this.f149165a);
                }
                ContactProfile m141809c = C28203u6.f131407a.m141809c(CoreUtility.f89233i);
                if (m141809c != null && m102407a0.size() < 4) {
                    m156220L(m141809c.f42446v, this.f149165a);
                    return;
                }
                return;
            }
            if (!TextUtils.isEmpty(str) && !this.f149177m) {
                int dimensionPixelSize = AbstractC3096i0.m15574y().getResources().getDimensionPixelSize(R.dimen.notification_large_icon_width);
                C3979l m123605k = this.f149165a.m123605k(str, 0, EnumC25629a.DEFAULT);
                if (m123605k != null && m123605k.m18839c() != null) {
                    this.f149177m = true;
                    Bitmap m156221O = m156221O(dimensionPixelSize, m123605k.m18839c());
                    m156224T(m156221O);
                    this.f149166b = m156221O;
                    return;
                }
                this.f149177m = true;
                AbstractC3082b0.m15421c("VoIPNotifications", "load url:" + str);
                this.f149168d.mo6855H(BitmapFactory.decodeResource(AbstractC3096i0.m15574y().getResources(), AbstractC16803z.icon));
                this.f149167c = new RecyclingImageView(AbstractC3096i0.m15574y());
                c cVar = new c(str, dimensionPixelSize);
                cVar.m125757D3(dimensionPixelSize);
                cVar.m125596P0(true);
                cVar.m125602Z(true);
                cVar.m125635v1(str);
                ((C23528a) this.f149165a.m123612r(this.f149167c)).m123587K(cVar);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoIPNotifications", "prepareCallNotification handle avatar : " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public void m156229a0() {
        try {
            AbstractC3082b0.m15421c("VoIPNotifications", "updateCallNotification ");
            if (m156222P(true) && this.f149168d != null) {
                AbstractC3082b0.m15424f("VoIPNotifications", "buildAndShow ");
                this.f149168d.m124147b0();
                C28023b6.m141262r2();
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("VoIPNotifications", "updateCallNotification " + e11.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m156248v() {
        try {
            AbstractC3082b0.m15424f("VoIPNotifications", "cancelSwitchVideoCallNotification");
            AbstractC23775p0.m124198c("switch_video_call_request", "");
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoIPNotifications", "cancelSwitchVideoCallNotification: ", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m156249w() {
        Intent m15533d0;
        String m116983f;
        C22621q0 c22621q0 = new C22621q0();
        AbstractC3082b0.m15424f("VoIPNotifications", "showSwitchVideoCallNotification");
        if (!c22621q0.m116992o()) {
            return;
        }
        EnumC23747b0 enumC23747b0 = EnumC23747b0.f114855B;
        try {
            if (this.f149174j == null) {
                this.f149174j = new C23750d(AbstractC3096i0.m15574y());
            }
            int currentTimeMillis = (int) System.currentTimeMillis();
            if (!c22621q0.m117000w()) {
                m15533d0 = AbstractC3096i0.m15531c0();
            } else {
                m15533d0 = AbstractC3096i0.m15533d0();
            }
            m15533d0.putExtra("EXTRA_DATA_IS_SHOW_FROM_NOTI_NEED_PERMISSION", false);
            this.f149174j.m6893u(PendingIntent.getActivity(AbstractC3096i0.m15574y(), currentTimeMillis, m15533d0, AbstractC19601a.m102572b(134217728)));
            if (AbstractC23309i.m121109K2() == 1) {
                m116983f = c22621q0.m116991n();
            } else {
                m116983f = c22621q0.m116983f();
            }
            this.f149174j.m124160q0(true).m6869V(new AbstractC1364q.d().m6828h(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_switch_vi_incom_noti, m116983f))).mo6894v(AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_switch_vi_incom_noti, m116983f)).mo6861N(true).m6875a0(System.currentTimeMillis()).m6865R(true);
            this.f149174j.m124163t0(enumC23747b0);
            this.f149174j.m124165v0("switch_video_call_request");
            this.f149174j.m124164u0("");
            this.f149174j.m124147b0();
            this.f149184t.sendEmptyMessageDelayed(4, 30000L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public Bitmap m156250x() {
        if (this.f149166b == null) {
            this.f149166b = Bitmap.createBitmap(m156215F(), m156215F(), Bitmap.Config.ARGB_8888);
        }
        return this.f149166b;
    }

    /* renamed from: y */
    private String m156251y(C22621q0 c22621q0) {
        String string = AbstractC3096i0.m15574y().getString(AbstractC8020f0.call_noti_audio_calling);
        if (c22621q0.m116999v()) {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_ongoing_noti_subtitle);
        }
        if (c22621q0.m116994q()) {
            if (!c22621q0.m117002y() && !c22621q0.m116995r()) {
                C25942f c25942f = (C25942f) C19577z.m102341J().m102392S().get(Integer.valueOf(c22621q0.m116989l()));
                if (c25942f != null) {
                    return String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_call_incoming_noti_subtitle), c25942f.m133657g(10));
                }
                return string;
            }
            return AbstractC3096i0.m15574y().getString(AbstractC8020f0.str_call_outgoing_noti_subtitle);
        }
        return string;
    }

    /* renamed from: z */
    private String m156252z(C22621q0 c22621q0) {
        String string = AbstractC3096i0.m15574y().getString(AbstractC8020f0.call_noti_audio_calling);
        if (c22621q0.m116999v()) {
            if (c22621q0.m116975A()) {
                return AbstractC3096i0.m15574y().getString(AbstractC8020f0.call_noti_video_calling);
            }
            return string;
        }
        if (c22621q0.m116994q()) {
            if (c22621q0.m116995r()) {
                if (c22621q0.m116975A()) {
                    return AbstractC3096i0.m15574y().getString(AbstractC8020f0.call_noti_video_calling);
                }
                return AbstractC3096i0.m15574y().getString(AbstractC8020f0.call_noti_audio_calling);
            }
            if (c22621q0.m116975A()) {
                return AbstractC3096i0.m15574y().getString(AbstractC8020f0.call_noti_video_incoming);
            }
            return AbstractC3096i0.m15574y().getString(AbstractC8020f0.call_noti_audio_incoming);
        }
        return string;
    }

    /* renamed from: I */
    public void m156253I() {
        this.f149184t.removeMessages(4);
        this.f149184t.sendEmptyMessage(4);
    }

    /* renamed from: M */
    public void m156254M(boolean z11) {
        boolean z12;
        try {
            AbstractC3082b0.m15424f("VoIPNotifications", "onOffHeadsUp " + z11);
            if (this.f149176l) {
                if (AbstractC3103o.m15622k() && z11 && !ZaloLauncherActivity.m57091m6()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f149175k = z12;
                this.f149184t.removeMessages(1);
                this.f149184t.sendEmptyMessage(1);
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoIPNotifications", "onOffHeadsUp : " + e11.getMessage(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m156255N() {
        boolean z11;
        boolean z12;
        try {
            if (!this.f149181q && AbstractC3096i0.m15548l(true)) {
                Service m155851U = AbstractC32273e3.m155748Q().m155851U();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("pinCallNotificationForeground ");
                if (m155851U != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                sb2.append(z11);
                sb2.append(" ");
                if (this.f149168d != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                sb2.append(z12);
                AbstractC3082b0.m15424f("VoIPNotifications", sb2.toString());
                if (m155851U != null && this.f149168d != null) {
                    this.f149168d.m124149d0(m155851U, m156211B(new C22621q0().m116975A()));
                    C28023b6.m141262r2();
                    this.f149181q = true;
                    AbstractC20110a.m104542k(9, "startForeground: %s", m155851U.getClass().getName());
                }
            }
        } catch (Exception e11) {
            AbstractC3082b0.m15424f("VoIPNotifications", "pinCallNotificationForeground " + e11.getMessage());
        }
    }

    /* renamed from: Q */
    public void m156256Q() {
        this.f149184t.removeMessages(2);
        this.f149184t.sendEmptyMessage(2);
    }

    /* renamed from: R */
    public void m156257R() {
        try {
            AbstractC3082b0.m15421c("VoIPNotifications", "requestUpdateCallNotification ");
            this.f149184t.removeMessages(1);
            this.f149184t.sendEmptyMessage(1);
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("VoIPNotifications", "requestUpdateCallNotification " + e11.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: V */
    public synchronized void m156258V() {
        AbstractC3082b0.m15421c("VoIPNotifications", "showNotificationForCall");
        this.f149176l = true;
        this.f149175k = false;
        AbstractC32273e3.m155748Q().mo155877e2(true);
        this.f149184t.removeMessages(1);
        this.f149184t.sendEmptyMessage(1);
    }

    /* renamed from: W */
    public void m156259W() {
        this.f149184t.removeMessages(3);
        this.f149184t.sendEmptyMessage(3);
    }

    /* renamed from: Y */
    public void m156260Y() {
        try {
            AbstractC3082b0.m15424f("VoIPNotifications", "switchToConfirmed ");
            this.f149178n = true;
            this.f149184t.removeMessages(2);
            this.f149184t.sendEmptyMessage(2);
        } catch (Exception e11) {
            AbstractC3082b0.m15422d("VoIPNotifications", "switchToConfirmed " + e11.toString());
        }
    }

    /* renamed from: t */
    public final void m156261t() {
        AbstractC3082b0.m15421c("VoIPNotifications", "VoIPNotifications: cancelCalls");
        try {
            m156223S();
            this.f149184t.post(new Runnable() { // from class: zm.voip.service.m3
                @Override // java.lang.Runnable
                public final void run() {
                    C32318n3.this.m156226X();
                }
            });
            this.f149175k = false;
            C22621q0 c22621q0 = new C22621q0();
            if (!AbstractC3096i0.f13165i && !c22621q0.m117001x()) {
                AbstractC32273e3.m155748Q().mo155877e2(false);
            }
            this.f149179o = false;
            this.f149177m = false;
            this.f149176l = false;
            this.f149178n = false;
            this.f149180p = false;
            this.f149167c = null;
            this.f149168d = null;
        } catch (Exception unused) {
            AbstractC3082b0.m15422d("VoIPNotifications", "cancelCalls failed");
        }
    }

    /* renamed from: u */
    public void m156262u() {
        try {
            AbstractC3082b0.m15424f("VoIPNotifications", "cancelNotification");
            AbstractC23775p0.m124198c("incall", "");
            AbstractC23775p0.m124198c("switch_video_call_request", "");
        } catch (Exception e11) {
            AbstractC3082b0.m15423e("VoIPNotifications", "cancelNotification: ", e11);
        }
    }

    private C32318n3() {
        this.f149168d = null;
        this.f149171g = new ArrayList();
        this.f149174j = null;
        this.f149175k = false;
        this.f149176l = false;
        this.f149177m = false;
        this.f149178n = false;
        this.f149179o = false;
        this.f149180p = false;
        this.f149181q = false;
        this.f149182r = "";
        this.f149183s = -1;
        this.f149184t = new a(Looper.getMainLooper());
        this.f149185u = new d();
        this.f149165a = new C23528a(AbstractC3096i0.m15574y());
    }
}
