package p363nh;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC1364q;
import androidx.core.app.C1347i1;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import ho0.AbstractC20110a;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import me0.AbstractC23006a0;
import me0.AbstractC23034c6;
import me0.AbstractC23088h5;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.EnumC25629a;
import pw.C24913b;
import vg.C28023b6;

/* renamed from: nh.d */
/* loaded from: classes3.dex */
public class C23750d extends AbstractC1364q.f {

    /* renamed from: t0 */
    static final Map f114879t0 = m124144e0(25);

    /* renamed from: u0 */
    static int f114880u0 = 100;

    /* renamed from: v0 */
    static int f114881v0 = 200;

    /* renamed from: w0 */
    static int f114882w0 = 400;

    /* renamed from: x0 */
    static long[] f114883x0 = {0, 100, 200, 100, 200, 100, 400};

    /* renamed from: X */
    final Context f114884X;

    /* renamed from: Y */
    int f114885Y;

    /* renamed from: Z */
    int f114886Z;

    /* renamed from: a0 */
    private boolean f114887a0;

    /* renamed from: b0 */
    private boolean f114888b0;

    /* renamed from: c0 */
    boolean f114889c0;

    /* renamed from: d0 */
    boolean f114890d0;

    /* renamed from: e0 */
    private int f114891e0;

    /* renamed from: f0 */
    CharSequence f114892f0;

    /* renamed from: g0 */
    String f114893g0;

    /* renamed from: h0 */
    String f114894h0;

    /* renamed from: i0 */
    protected EnumC23747b0 f114895i0;

    /* renamed from: j0 */
    final C23528a f114896j0;

    /* renamed from: k0 */
    String f114897k0;

    /* renamed from: l0 */
    String f114898l0;

    /* renamed from: m0 */
    long f114899m0;

    /* renamed from: n0 */
    HashSet f114900n0;

    /* renamed from: o0 */
    List f114901o0;

    /* renamed from: p0 */
    RemoteViews f114902p0;

    /* renamed from: q0 */
    Bitmap f114903q0;

    /* renamed from: r0 */
    CharSequence f114904r0;

    /* renamed from: s0 */
    String f114905s0;

    /* renamed from: nh.d$a */
    /* loaded from: classes3.dex */
    public class a extends LinkedHashMap {

        /* renamed from: p */
        final /* synthetic */ int f114906p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, float f11, boolean z11, int i12) {
            super(i11, f11, z11);
            this.f114906p = i12;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            if (size() > this.f114906p) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: nh.d$b */
    /* loaded from: classes3.dex */
    public class b extends C23999j {
        b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                C23750d.this.f114900n0.remove(interfaceC3968a);
                if (interfaceC3968a instanceof RecyclingImageView) {
                    interfaceC3968a.setImageInfo(c3979l, false);
                }
                if (c3979l != null && c3979l.m18839c() != null && C23750d.this.f114897k0.equals(str)) {
                    AbstractC1364q.c cVar = new AbstractC1364q.c(C23750d.this);
                    cVar.m6818i(c3979l.m18839c());
                    CharSequence charSequence = C23750d.this.f114892f0;
                    if (charSequence != null) {
                        cVar.m6820k(charSequence);
                    }
                    C23750d c23750d = C23750d.this;
                    c23750d.f114898l0 = c23750d.f114897k0;
                    AbstractC23775p0.m124214s(c23750d);
                    C28023b6.m141262r2();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C23750d(Context context, String str, String str2) {
        this(context);
        m124165v0(str);
        m124164u0(str2);
    }

    /* renamed from: B0 */
    private void m124143B0() {
        RemoteViews remoteViews = this.f114902p0;
        if (remoteViews == null) {
            return;
        }
        Bitmap bitmap = this.f114903q0;
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(AbstractC6918a0.icon, bitmap);
        }
        CharSequence charSequence = this.f114904r0;
        if (charSequence != null) {
            this.f114902p0.setTextViewText(AbstractC6918a0.title, charSequence);
        }
        CharSequence charSequence2 = this.f114892f0;
        if (charSequence2 != null) {
            this.f114902p0.setTextViewText(AbstractC6918a0.description, charSequence2);
        }
    }

    /* renamed from: e0 */
    static Map m124144e0(int i11) {
        return new a((int) ((i11 * 10.0f) / 7.0f), 0.7f, true, i11);
    }

    /* renamed from: n0 */
    private void m124145n0() {
        if (!TextUtils.isEmpty(this.f114897k0) && !TextUtils.equals(this.f114897k0, this.f114898l0)) {
            C3979l m125676A2 = C23999j.m125676A2(this.f114897k0, 0, EnumC25629a.DEFAULT);
            if (m125676A2 != null && m125676A2.m18839c() != null) {
                AbstractC20110a.m104535d("loadPicture: cache %s", this.f114897k0);
                AbstractC1364q.c cVar = new AbstractC1364q.c(this);
                cVar.m6818i(m125676A2.m18839c());
                CharSequence charSequence = this.f114892f0;
                if (charSequence != null) {
                    cVar.m6820k(charSequence);
                }
                this.f114898l0 = this.f114897k0;
                return;
            }
            AbstractC20110a.m104535d("loadPicture: ajax %s", this.f114897k0);
            RecyclingImageView recyclingImageView = new RecyclingImageView(this.f114884X);
            this.f114900n0.add(recyclingImageView);
            b bVar = new b();
            bVar.m125757D3(AbstractC23006a0.m117871A());
            bVar.m125596P0(true);
            bVar.m125602Z(true);
            bVar.m125635v1(this.f114897k0);
            ((C23528a) this.f114896j0.m123612r(recyclingImageView)).m123587K(bVar);
        }
    }

    /* renamed from: A0 */
    protected void m124146A0(Notification notification) {
        String channelId;
        if (Build.VERSION.SDK_INT >= 26) {
            if (notification != null) {
                channelId = notification.getChannelId();
                if (!TextUtils.isEmpty(channelId)) {
                    return;
                }
            }
            try {
                AbstractC20110a.m104539h(new IllegalStateException("push notification without channel"));
                CoreUtility.m93148a().mo100074a(new IllegalStateException("push notification without channel"));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: C0 */
    public void mo124122C0() {
        mo6894v(this.f114892f0);
        Bundle m6884j = m6884j();
        if (m6884j == null) {
            m6884j = new Bundle();
            m6851C(m6884j);
        }
        long j11 = 0;
        if (this.f114899m0 > 0 && !m124156l0()) {
            m6884j.putLong("EXTRA_KEY_EXPIRED_UPTIME", SystemClock.elapsedRealtime() + this.f114899m0);
        }
        m6884j.putString("EXTRA_KEY_TYPE", this.f114894h0);
        m6884j.putString("EXTRA_KEY_SUB_TYPE", this.f114893g0);
        m6884j.putInt("EXTRA_KEY_TYPE_QOS_CODE", m124154j0());
        m124145n0();
        EnumC23747b0 enumC23747b0 = this.f114895i0;
        if (enumC23747b0 == null) {
            enumC23747b0 = m124153i0();
        }
        AbstractC1364q.e m6882h = m6882h();
        boolean z11 = true;
        if (((AbstractC23775p0.m124196a() && (m6882h == null || !m6882h.m6830a())) || this.f114885Y == 0) && (enumC23747b0 == null || (enumC23747b0.m124136u() && ((enumC23747b0.m124129h() >= 4 || !AbstractC23775p0.m124213r()) && EnumC23747b0.f114858E.m124129h() > 0)))) {
            EnumC23747b0 enumC23747b02 = EnumC23747b0.f114858E;
            mo6889q(enumC23747b02.m124128g());
            m124159p0(enumC23747b02.m124128g());
            m6862O(0);
            if (AbstractC23775p0.m124213r() && enumC23747b02.m124138w() && enumC23747b02.m124130i() != null) {
                m6868U(enumC23747b02.m124130i(), 5);
            }
        } else {
            int i11 = this.f114885Y;
            if (i11 != 1 && (i11 != -1 || !enumC23747b0.m124134s())) {
                m6862O(0);
            } else {
                m6862O(2);
                m6872Y(new long[]{0, 0});
            }
            mo6889q(enumC23747b0.m124128g());
            m124159p0(enumC23747b0.m124128g());
            if (AbstractC23775p0.m124213r() && enumC23747b0.m124138w() && enumC23747b0.m124130i() != null) {
                m6868U(enumC23747b0.m124130i(), 5);
            }
        }
        boolean m118125K = AbstractC23034c6.m118125K();
        if (this.f114887a0) {
            m6872Y(null);
            m6868U(null, 5);
            if (!m118125K) {
                m6862O(-1);
                if (enumC23747b0 != null && enumC23747b0.m124129h() != 0) {
                    mo6889q(EnumC23747b0.f114857D.m124128g());
                }
            } else {
                m124166w0(true);
            }
        }
        if (enumC23747b0 != null && !enumC23747b0.m124137v()) {
            m6856I(0, 0, 0);
        }
        int m124151g0 = m124151g0();
        Map map = f114879t0;
        if (map.containsKey(Integer.valueOf(m124151g0)) && map.get(Integer.valueOf(m124151g0)) != null) {
            j11 = ((Long) map.get(Integer.valueOf(m124151g0))).longValue();
        }
        int i12 = this.f114886Z;
        if (i12 != -1) {
            if (i12 != 1) {
                z11 = false;
            }
            super.mo6861N(z11);
            if (this.f114886Z == 0) {
                map.put(Integer.valueOf(m124151g0), Long.valueOf(SystemClock.elapsedRealtime()));
            }
        } else if (enumC23747b0 != null && enumC23747b0.m124129h() >= 0 && !this.f114887a0) {
            if (Math.abs(SystemClock.elapsedRealtime() - j11) < 1000) {
                super.mo6861N(true);
            } else {
                map.put(Integer.valueOf(m124151g0), Long.valueOf(SystemClock.elapsedRealtime()));
            }
        } else {
            map.put(Integer.valueOf(m124151g0), Long.valueOf(SystemClock.elapsedRealtime()));
        }
        List<C28023b6.n> list = this.f114901o0;
        if (list != null) {
            for (C28023b6.n nVar : list) {
                if (nVar != null && nVar.f130759c != null) {
                    if (nVar.f130760d == C28023b6.n.f130754f) {
                        m6876b(new AbstractC1364q.b.a(AbstractC16803z.ic_reply_icon, nVar.m141400a(AbstractC1388a.m6961c(CoreUtility.getAppContext(), AbstractC16801x.notification_app_icon_background_color)), nVar.f130759c).m6810a(new C1347i1.d("com.zing.zalo.intent.action.EXTRA_MESSAGE_QUICK_REPLY").m6770b(CoreUtility.getAppContext().getResources().getString(AbstractC8020f0.chat_default_text)).m6769a()).m6812d(false).m6811b());
                    } else {
                        m6874a(nVar.f130758b, nVar.m141400a(AbstractC1388a.m6961c(CoreUtility.getAppContext(), AbstractC16801x.notification_app_icon_background_color)), nVar.f130759c);
                    }
                }
            }
        }
    }

    @Override // androidx.core.app.AbstractC1364q.f
    /* renamed from: H */
    public AbstractC1364q.f mo6855H(Bitmap bitmap) {
        this.f114903q0 = bitmap;
        return super.mo6855H(bitmap);
    }

    @Override // androidx.core.app.AbstractC1364q.f
    /* renamed from: M */
    public AbstractC1364q.f mo6860M(boolean z11) {
        this.f114890d0 = z11;
        return super.mo6860M(z11);
    }

    @Override // androidx.core.app.AbstractC1364q.f
    /* renamed from: N */
    public AbstractC1364q.f mo6861N(boolean z11) {
        this.f114886Z = z11 ? 1 : 0;
        return super.mo6861N(z11);
    }

    /* renamed from: b0 */
    public void m124147b0() {
        AbstractC23775p0.m124214s(this);
    }

    /* renamed from: c0 */
    public void m124148c0(Service service) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            m124149d0(service, ZVideoUtilMetadata.FF_PROFILE_H264_INTRA);
        } else if (i11 >= 29) {
            m124149d0(service, 0);
        } else {
            m124149d0(service, 0);
        }
    }

    /* renamed from: d0 */
    public void m124149d0(Service service, int i11) {
        AbstractC23775p0.m124215t(this, service, i11);
    }

    @Override // androidx.core.app.AbstractC1364q.f
    /* renamed from: e */
    public Notification mo6879e() {
        mo124122C0();
        m124143B0();
        Notification mo6879e = super.mo6879e();
        m124146A0(mo6879e);
        return mo6879e;
    }

    /* renamed from: f0 */
    public String m124150f0() {
        return this.f114905s0;
    }

    /* renamed from: g0 */
    public int m124151g0() {
        return AbstractC23088h5.m118423d(this.f114894h0, this.f114893g0);
    }

    /* renamed from: h0 */
    public String m124152h0() {
        return this.f114894h0;
    }

    /* renamed from: i0 */
    public EnumC23747b0 m124153i0() {
        String str = this.f114894h0;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2117383672:
                if (str.equals("chat_urgent")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1348026953:
                if (str.equals("like_comment")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1328149800:
                if (str.equals("chat_group")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1227369520:
                if (str.equals("message_error")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1217487446:
                if (str.equals("hidden")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1184273149:
                if (str.equals("incall")) {
                    c11 = 5;
                    break;
                }
                break;
            case -1159380439:
                if (str.equals("retry_call_not_online")) {
                    c11 = 6;
                    break;
                }
                break;
            case -1080030040:
                if (str.equals("miss_call_zalo")) {
                    c11 = 7;
                    break;
                }
                break;
            case -1077756671:
                if (str.equals("memory")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -889772562:
                if (str.equals("friend_request")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -822844713:
                if (str.equals("incoming_call")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -750409329:
                if (str.equals("chat_download")) {
                    c11 = 11;
                    break;
                }
                break;
            case -701864814:
                if (str.equals("zinder")) {
                    c11 = '\f';
                    break;
                }
                break;
            case -660708009:
                if (str.equals("video_processing")) {
                    c11 = '\r';
                    break;
                }
                break;
            case -591995975:
                if (str.equals("suggest_friend")) {
                    c11 = 14;
                    break;
                }
                break;
            case -542676707:
                if (str.equals("change_background")) {
                    c11 = 15;
                    break;
                }
                break;
            case -518602638:
                if (str.equals("reminder")) {
                    c11 = 16;
                    break;
                }
                break;
            case -493687518:
                if (str.equals("create_poll")) {
                    c11 = 17;
                    break;
                }
                break;
            case -341571307:
                if (str.equals("miss_call_stranger_zalo")) {
                    c11 = 18;
                    break;
                }
                break;
            case -253014634:
                if (str.equals("new_story")) {
                    c11 = 19;
                    break;
                }
                break;
            case -201079190:
                if (str.equals("miss_call_retry_reject_or_busy")) {
                    c11 = 20;
                    break;
                }
                break;
            case -143971953:
                if (str.equals("music_profile")) {
                    c11 = 21;
                    break;
                }
                break;
            case -77635740:
                if (str.equals("message_warning")) {
                    c11 = 22;
                    break;
                }
                break;
            case 3198:
                if (str.equals("db")) {
                    c11 = 23;
                    break;
                }
                break;
            case 3059615:
                if (str.equals("core")) {
                    c11 = 24;
                    break;
                }
                break;
            case 3321751:
                if (str.equals("like")) {
                    c11 = 25;
                    break;
                }
                break;
            case 76353254:
                if (str.equals("zalo_video")) {
                    c11 = 26;
                    break;
                }
                break;
            case 106069776:
                if (str.equals("other")) {
                    c11 = 27;
                    break;
                }
                break;
            case 326576084:
                if (str.equals("chat_group_mention_me")) {
                    c11 = 28;
                    break;
                }
                break;
            case 372263453:
                if (str.equals("new_friend")) {
                    c11 = 29;
                    break;
                }
                break;
            case 720565225:
                if (str.equals("group_reaction")) {
                    c11 = 30;
                    break;
                }
                break;
            case 740521524:
                if (str.equals("core_undefine")) {
                    c11 = 31;
                    break;
                }
                break;
            case 805455424:
                if (str.equals("mini_chat")) {
                    c11 = ' ';
                    break;
                }
                break;
            case 915001650:
                if (str.equals("set_admin")) {
                    c11 = '!';
                    break;
                }
                break;
            case 918905406:
                if (str.equals("retry_call_unsupport_vid")) {
                    c11 = '\"';
                    break;
                }
                break;
            case 950398559:
                if (str.equals("comment")) {
                    c11 = '#';
                    break;
                }
                break;
            case 1069376125:
                if (str.equals("birthday")) {
                    c11 = '$';
                    break;
                }
                break;
            case 1077701032:
                if (str.equals("live_location")) {
                    c11 = '%';
                    break;
                }
                break;
            case 1109388773:
                if (str.equals("download_apk")) {
                    c11 = '&';
                    break;
                }
                break;
            case 1129903701:
                if (str.equals("miss_call_native")) {
                    c11 = '\'';
                    break;
                }
                break;
            case 1249229616:
                if (str.equals("chat_reaction")) {
                    c11 = '(';
                    break;
                }
                break;
            case 1304186912:
                if (str.equals("miss_call_retry_401")) {
                    c11 = ')';
                    break;
                }
                break;
            case 1376909533:
                if (str.equals("new_feed")) {
                    c11 = '*';
                    break;
                }
                break;
            case 1437669948:
                if (str.equals("chat_1_1")) {
                    c11 = '+';
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c11 = ',';
                    break;
                }
                break;
            case 1750351177:
                if (str.equals("miss_multiple_feeds")) {
                    c11 = '-';
                    break;
                }
                break;
            case 1837742968:
                if (str.equals("story_archive")) {
                    c11 = '.';
                    break;
                }
                break;
            case 1874282488:
                if (str.equals("add_member")) {
                    c11 = '/';
                    break;
                }
                break;
            case 1984255539:
                if (str.equals("story_reaction")) {
                    c11 = '0';
                    break;
                }
                break;
            case 2031157527:
                if (str.equals("pc_request_sync")) {
                    c11 = '1';
                    break;
                }
                break;
            case 2050342814:
                if (str.equals("suggest_profile_from_phone_number")) {
                    c11 = '2';
                    break;
                }
                break;
            case 2071687773:
                if (str.equals("change_group_info")) {
                    c11 = '3';
                    break;
                }
                break;
            case 2114722249:
                if (str.equals("friend_accept")) {
                    c11 = '4';
                    break;
                }
                break;
            case 2119142274:
                if (str.equals("miss_call_stranger_native")) {
                    c11 = '5';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case '1':
            case '2':
                return EnumC23747b0.f114859F;
            case 1:
            case '\b':
            case '\f':
            case 19:
            case 21:
            case 25:
            case 26:
            case '#':
            case '*':
            case '-':
            case '.':
            case '0':
                return EnumC23747b0.f114856C;
            case 2:
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
            case 17:
            case 28:
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
            case '!':
            case '/':
            case '3':
                return EnumC23747b0.f114854A;
            case 3:
            case 22:
            case 27:
            case '&':
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                return EnumC23747b0.f114860G;
            case 4:
            case 7:
            case 11:
            case 15:
            case 18:
            case '\'':
            case '(':
            case '+':
            case '5':
                return EnumC23747b0.f114867z;
            case 5:
                return EnumC23747b0.f114862I;
            case 6:
            case '\n':
            case 20:
            case '\"':
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                return EnumC23747b0.f114855B;
            case '\t':
            case 14:
            case 24:
            case 29:
            case 31:
            case '$':
            case '4':
                return EnumC23747b0.f114860G;
            case '\r':
                return EnumC23747b0.f114864K;
            case 23:
                return EnumC23747b0.f114863J;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                return EnumC23747b0.f114861H;
            case '%':
                return EnumC23747b0.f114865L;
            default:
                return EnumC23747b0.f114860G;
        }
    }

    /* renamed from: j0 */
    public int m124154j0() {
        String str = this.f114894h0;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -2117383672:
                if (str.equals("chat_urgent")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1348026953:
                if (str.equals("like_comment")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1328149800:
                if (str.equals("chat_group")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1227369520:
                if (str.equals("message_error")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1217487446:
                if (str.equals("hidden")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1184273149:
                if (str.equals("incall")) {
                    c11 = 5;
                    break;
                }
                break;
            case -1159380439:
                if (str.equals("retry_call_not_online")) {
                    c11 = 6;
                    break;
                }
                break;
            case -1080030040:
                if (str.equals("miss_call_zalo")) {
                    c11 = 7;
                    break;
                }
                break;
            case -1077756671:
                if (str.equals("memory")) {
                    c11 = '\b';
                    break;
                }
                break;
            case -889772562:
                if (str.equals("friend_request")) {
                    c11 = '\t';
                    break;
                }
                break;
            case -822844713:
                if (str.equals("incoming_call")) {
                    c11 = '\n';
                    break;
                }
                break;
            case -750409329:
                if (str.equals("chat_download")) {
                    c11 = 11;
                    break;
                }
                break;
            case -701864814:
                if (str.equals("zinder")) {
                    c11 = '\f';
                    break;
                }
                break;
            case -660708009:
                if (str.equals("video_processing")) {
                    c11 = '\r';
                    break;
                }
                break;
            case -591995975:
                if (str.equals("suggest_friend")) {
                    c11 = 14;
                    break;
                }
                break;
            case -542676707:
                if (str.equals("change_background")) {
                    c11 = 15;
                    break;
                }
                break;
            case -518602638:
                if (str.equals("reminder")) {
                    c11 = 16;
                    break;
                }
                break;
            case -493687518:
                if (str.equals("create_poll")) {
                    c11 = 17;
                    break;
                }
                break;
            case -341571307:
                if (str.equals("miss_call_stranger_zalo")) {
                    c11 = 18;
                    break;
                }
                break;
            case -253014634:
                if (str.equals("new_story")) {
                    c11 = 19;
                    break;
                }
                break;
            case -201079190:
                if (str.equals("miss_call_retry_reject_or_busy")) {
                    c11 = 20;
                    break;
                }
                break;
            case -143971953:
                if (str.equals("music_profile")) {
                    c11 = 21;
                    break;
                }
                break;
            case -77635740:
                if (str.equals("message_warning")) {
                    c11 = 22;
                    break;
                }
                break;
            case 3198:
                if (str.equals("db")) {
                    c11 = 23;
                    break;
                }
                break;
            case 3059615:
                if (str.equals("core")) {
                    c11 = 24;
                    break;
                }
                break;
            case 3321751:
                if (str.equals("like")) {
                    c11 = 25;
                    break;
                }
                break;
            case 106069776:
                if (str.equals("other")) {
                    c11 = 26;
                    break;
                }
                break;
            case 326576084:
                if (str.equals("chat_group_mention_me")) {
                    c11 = 27;
                    break;
                }
                break;
            case 372263453:
                if (str.equals("new_friend")) {
                    c11 = 28;
                    break;
                }
                break;
            case 720565225:
                if (str.equals("group_reaction")) {
                    c11 = 29;
                    break;
                }
                break;
            case 740521524:
                if (str.equals("core_undefine")) {
                    c11 = 30;
                    break;
                }
                break;
            case 805455424:
                if (str.equals("mini_chat")) {
                    c11 = 31;
                    break;
                }
                break;
            case 915001650:
                if (str.equals("set_admin")) {
                    c11 = ' ';
                    break;
                }
                break;
            case 918905406:
                if (str.equals("retry_call_unsupport_vid")) {
                    c11 = '!';
                    break;
                }
                break;
            case 950398559:
                if (str.equals("comment")) {
                    c11 = '\"';
                    break;
                }
                break;
            case 1069376125:
                if (str.equals("birthday")) {
                    c11 = '#';
                    break;
                }
                break;
            case 1077701032:
                if (str.equals("live_location")) {
                    c11 = '$';
                    break;
                }
                break;
            case 1109388773:
                if (str.equals("download_apk")) {
                    c11 = '%';
                    break;
                }
                break;
            case 1129903701:
                if (str.equals("miss_call_native")) {
                    c11 = '&';
                    break;
                }
                break;
            case 1249229616:
                if (str.equals("chat_reaction")) {
                    c11 = '\'';
                    break;
                }
                break;
            case 1304186912:
                if (str.equals("miss_call_retry_401")) {
                    c11 = '(';
                    break;
                }
                break;
            case 1376909533:
                if (str.equals("new_feed")) {
                    c11 = ')';
                    break;
                }
                break;
            case 1437669948:
                if (str.equals("chat_1_1")) {
                    c11 = '*';
                    break;
                }
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c11 = '+';
                    break;
                }
                break;
            case 1750351177:
                if (str.equals("miss_multiple_feeds")) {
                    c11 = ',';
                    break;
                }
                break;
            case 1837742968:
                if (str.equals("story_archive")) {
                    c11 = '-';
                    break;
                }
                break;
            case 1874282488:
                if (str.equals("add_member")) {
                    c11 = '.';
                    break;
                }
                break;
            case 1984255539:
                if (str.equals("story_reaction")) {
                    c11 = '/';
                    break;
                }
                break;
            case 2031157527:
                if (str.equals("pc_request_sync")) {
                    c11 = '0';
                    break;
                }
                break;
            case 2050342814:
                if (str.equals("suggest_profile_from_phone_number")) {
                    c11 = '1';
                    break;
                }
                break;
            case 2071687773:
                if (str.equals("change_group_info")) {
                    c11 = '2';
                    break;
                }
                break;
            case 2114722249:
                if (str.equals("friend_accept")) {
                    c11 = '3';
                    break;
                }
                break;
            case 2119142274:
                if (str.equals("miss_call_stranger_native")) {
                    c11 = '4';
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return 53;
            case 1:
                return 29;
            case 2:
                return 5;
            case 3:
                return 50;
            case 4:
                return 15;
            case 5:
                return 45;
            case 6:
                return 43;
            case 7:
                return 22;
            case '\b':
                return 57;
            case '\t':
                return 11;
            case '\n':
                return 44;
            case 11:
                return 3;
            case '\f':
                return 33;
            case '\r':
                return 48;
            case 14:
                return 12;
            case 15:
                return 16;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return 18;
            case 17:
                return 19;
            case 18:
                return 24;
            case 19:
                return 27;
            case 20:
                return 41;
            case 21:
                return 32;
            case 22:
                return 49;
            case 23:
                return 37;
            case 24:
                return 36;
            case 25:
                return 28;
            case 26:
                return 38;
            case 27:
                return 6;
            case 28:
                return 10;
            case 29:
                return 8;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                return 14;
            case 31:
                return 46;
            case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                return 21;
            case '!':
                return 42;
            case '\"':
                return 30;
            case '#':
                return 9;
            case '$':
                return 47;
            case '%':
                return 39;
            case '&':
                return 23;
            case '\'':
                return 7;
            case '(':
                return 40;
            case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_41 /* 41 */:
                return 26;
            case '*':
                return 4;
            case '+':
                return 2;
            case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                return 31;
            case '-':
                return 34;
            case '.':
                return 20;
            case '/':
                return 35;
            case '0':
                return 56;
            case '1':
                return 54;
            case '2':
                return 17;
            case '3':
                return 13;
            case '4':
                return 25;
            default:
                return 1;
        }
    }

    /* renamed from: k0 */
    public boolean m124155k0() {
        return this.f114888b0;
    }

    /* renamed from: l0 */
    public boolean m124156l0() {
        return this.f114890d0;
    }

    /* renamed from: m0 */
    public boolean m124157m0() {
        return this.f114891e0 == 0;
    }

    /* renamed from: o0 */
    public void m124158o0(List list) {
        this.f114901o0 = list;
    }

    /* renamed from: p0 */
    public C23750d m124159p0(String str) {
        if (!this.f114889c0) {
            return this;
        }
        super.m6853F(str);
        return this;
    }

    @Override // androidx.core.app.AbstractC1364q.f
    /* renamed from: q */
    public AbstractC1364q.f mo6889q(String str) {
        this.f114905s0 = str;
        return super.mo6889q(str);
    }

    /* renamed from: q0 */
    public C23750d m124160q0(boolean z11) {
        this.f114885Y = z11 ? 1 : 0;
        return this;
    }

    /* renamed from: r0 */
    public C23750d m124161r0(boolean z11) {
        this.f114887a0 = z11;
        return this;
    }

    /* renamed from: s0 */
    public C23750d m124162s0(int i11) {
        this.f114891e0 = i11;
        return this;
    }

    /* renamed from: t0 */
    public void m124163t0(EnumC23747b0 enumC23747b0) {
        this.f114895i0 = enumC23747b0;
    }

    /* renamed from: u0 */
    public void m124164u0(String str) {
        this.f114893g0 = str;
    }

    @Override // androidx.core.app.AbstractC1364q.f
    /* renamed from: v */
    public AbstractC1364q.f mo6894v(CharSequence charSequence) {
        this.f114892f0 = charSequence;
        return super.mo6894v(charSequence);
    }

    /* renamed from: v0 */
    public void m124165v0(String str) {
        this.f114894h0 = str;
        this.f114899m0 = AbstractC23775p0.m124210o(str);
    }

    @Override // androidx.core.app.AbstractC1364q.f
    /* renamed from: w */
    public AbstractC1364q.f mo6895w(CharSequence charSequence) {
        this.f114904r0 = charSequence;
        return super.mo6895w(charSequence);
    }

    /* renamed from: w0 */
    public void m124166w0(boolean z11) {
        this.f114888b0 = z11;
    }

    /* renamed from: x0 */
    public void m124167x0(String str) {
        this.f114897k0 = str;
        this.f114898l0 = null;
    }

    /* renamed from: y0 */
    public void m124168y0(long j11) {
        this.f114899m0 = j11;
    }

    /* renamed from: z0 */
    public void m124169z0() {
        int i11;
        String packageName = CoreUtility.getAppContext().getPackageName();
        if (C24913b.m129583c().mo129582b(this.f114884X) == 0) {
            i11 = AbstractC7409c0.noti_custom_basic_content_white_bg;
        } else {
            i11 = AbstractC7409c0.noti_custom_basic_content_black_bg;
        }
        RemoteViews remoteViews = new RemoteViews(packageName, i11);
        this.f114902p0 = remoteViews;
        m6897y(remoteViews);
        m6896x(this.f114902p0);
        m6898z(this.f114902p0);
        Bitmap bitmap = this.f114903q0;
        if (bitmap != null) {
            this.f114902p0.setImageViewBitmap(AbstractC6918a0.icon, bitmap);
        }
    }

    public C23750d(Context context) {
        super(context, EnumC23747b0.f114860G.m124128g());
        this.f114885Y = -1;
        this.f114886Z = -1;
        this.f114887a0 = false;
        this.f114888b0 = false;
        this.f114889c0 = false;
        this.f114890d0 = false;
        this.f114891e0 = 0;
        this.f114893g0 = "default";
        this.f114894h0 = "default";
        this.f114895i0 = null;
        this.f114899m0 = 0L;
        this.f114900n0 = new LinkedHashSet();
        this.f114884X = context;
        this.f114896j0 = new C23528a(context);
        m6866S(AbstractC16803z.ic_stat_notify_zalo);
        m6856I(AbstractC1388a.m6961c(CoreUtility.getAppContext(), AbstractC16801x.led_light_color), CoreUtility.getAppContext().getResources().getInteger(AbstractC7307b0.onMs_led_light), CoreUtility.getAppContext().getResources().getInteger(AbstractC7307b0.offMs_led_light));
        m6865R(true);
        mo6860M(false);
        m6890r(context.getResources().getColor(AbstractC16801x.notification_app_icon_background_color));
        m6886n(true);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24 && AbstractC23309i.m122416t2() == 1) {
            this.f114889c0 = true;
            m124159p0(this.f114885Y != 0 ? "zalo_notify_alert" : "zalo_notify");
            m6854G(false);
        }
        m6862O(this.f114885Y != 0 ? 2 : 0);
        m6888p("msg");
        if (i11 >= 29) {
            m6885m(false);
        }
    }
}
