package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.AbstractC1388a;
import androidx.core.os.AbstractC1438d;
import androidx.recyclerview.widget.RecyclerView;
import b20.C2498d;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Notification;
import com.zing.zalo.shortvideo.data.model.PersonalizeChannel;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.remote.common.NetworkException;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.CommentUserBottomSheet;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NotificationReceiver;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.view.VideoChannelPagerView;
import com.zing.zalo.shortvideo.p072ui.widget.LoadingLayout;
import com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import h20.InterfaceC19726j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m20.InterfaceC22798t0;
import p021an.AbstractC0955d;
import p148f3.C18711c;
import p227i3.C20218v;
import p483rh.InterfaceC25792a;
import p667y2.C30268e;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import q10.C25037n1;
import q20.C25097t;
import qm0.AbstractC25361o0;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27409d;
import v00.AbstractC27413h;
import w00.AbstractC28684a;
import z10.C31192z;

/* loaded from: classes5.dex */
public class NotificationView extends ZchBaseView implements InterfaceC22798t0, C31192z.a {
    public static final C10328a Companion = new C10328a(null);

    /* renamed from: A0 */
    protected C25037n1 f53049A0;

    /* renamed from: B0 */
    private C31192z f53050B0;

    /* renamed from: C0 */
    private NotificationReceiver f53051C0;

    /* renamed from: D0 */
    private boolean f53052D0;

    /* renamed from: E0 */
    private ChannelReceiver f53053E0;

    /* renamed from: F0 */
    private String f53054F0;

    /* renamed from: z0 */
    protected InterfaceC19726j f53055z0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$a */
    /* loaded from: classes5.dex */
    public static final class C10328a {
        private C10328a() {
        }

        public /* synthetic */ C10328a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final NotificationView m54634a(String str) {
            AbstractC19074t.m100208f(str, "id");
            NotificationView notificationView = new NotificationView();
            notificationView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("xSource", "SOURCE_CHANNEL"), AbstractC24866w.m129235a("xID", str)));
            return notificationView;
        }

        /* renamed from: b */
        public final NotificationView m54635b(String str) {
            AbstractC19074t.m100208f(str, "id");
            NotificationView notificationView = new NotificationView();
            notificationView.mo60305zK(AbstractC1438d.m7341b(AbstractC24866w.m129235a("xSource", "SOURCE_USER"), AbstractC24866w.m129235a("xID", str)));
            return notificationView;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$b */
    /* loaded from: classes5.dex */
    static final class C10329b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25037n1 f53056q;

        /* renamed from: r */
        final /* synthetic */ NotificationView f53057r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10329b(C25037n1 c25037n1, NotificationView notificationView) {
            super(0);
            this.f53056q = c25037n1;
            this.f53057r = notificationView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54636a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54636a() {
            this.f53056q.f120133r.m55786j();
            this.f53057r.m54625aL().mo53331i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$c */
    /* loaded from: classes5.dex */
    static final class C10330c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ C25037n1 f53058q;

        /* renamed from: r */
        final /* synthetic */ NotificationView f53059r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10330c(C25037n1 c25037n1, NotificationView notificationView) {
            super(0);
            this.f53058q = c25037n1;
            this.f53059r = notificationView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m54637a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m54637a() {
            this.f53058q.f120133r.m55786j();
            this.f53059r.m54625aL().mo53331i();
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$d */
    /* loaded from: classes5.dex */
    public static final class C10331d extends RecyclerView.AbstractC1887n {

        /* renamed from: a */
        private final int f53060a;

        /* renamed from: b */
        private final Paint f53061b;

        C10331d() {
            this.f53060a = NotificationView.this.m92651WI().getDimensionPixelSize(AbstractC27407b.zch_radius_8dp);
            Paint paint = new Paint();
            paint.setFlags(1);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(AbstractC1388a.m6961c(NotificationView.this.m92689tK(), AbstractC27406a.zch_layer_background_subtle));
            this.f53061b = paint;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            Integer num;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10066g(rect, view, recyclerView, c1899z);
            RecyclerView.AbstractC1880g adapter = recyclerView.getAdapter();
            if (adapter != null) {
                i11 = adapter.mo10003k();
            } else {
                i11 = 0;
            }
            int i12 = i11 - 1;
            RecyclerView.AbstractC1876c0 m9897o0 = recyclerView.m9897o0(view);
            if (m9897o0 != null) {
                num = Integer.valueOf(m9897o0.m9929A());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == -1) {
                return;
            }
            if (num != null && num.intValue() == 0) {
                rect.top = this.f53060a;
            } else if (num != null && num.intValue() == i12) {
                rect.bottom = this.f53060a;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: i */
        public void mo10068i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            AbstractC19074t.m100208f(canvas, C18711c.f94014e);
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            super.mo10068i(canvas, recyclerView, c1899z);
            if (recyclerView.getAdapter() == null) {
                return;
            }
            AbstractC19074t.m100205c(recyclerView.getAdapter());
            if (recyclerView.m9817A0(recyclerView.getChildAt(0)) == 0) {
                float offsetY = NotificationView.this.m54621XK().f120134s.getOffsetY();
                canvas.drawRect(0.0f, (r0.getTop() + offsetY) - this.f53060a, recyclerView.getWidth(), r0.getTop() + offsetY, this.f53061b);
            }
            int m9817A0 = recyclerView.m9817A0(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (m9817A0 != -1 && m9817A0 == r11.mo10003k() - 1) {
                float offsetY2 = NotificationView.this.m54621XK().f120134s.getOffsetY();
                canvas.drawRect(0.0f, r0.getBottom() + offsetY2, recyclerView.getWidth(), r0.getBottom() + offsetY2 + this.f53060a, this.f53061b);
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$e */
    /* loaded from: classes5.dex */
    static final class C10332e extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C25037n1 f53064r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10332e(C25037n1 c25037n1) {
            super(2);
            this.f53064r = c25037n1;
        }

        /* renamed from: a */
        public final void m54638a(boolean z11, String str) {
            String str2;
            AbstractC19074t.m100208f(str, "id");
            if (z11 && AbstractC19074t.m100204b(str, NotificationView.this.m54625aL().mo53328f())) {
                NotificationPageView m54605ZK = NotificationView.this.m54605ZK();
                if (m54605ZK != null) {
                    str2 = m54605ZK.m54577mL();
                } else {
                    str2 = null;
                }
                if (AbstractC19074t.m100204b(str2, NotificationView.this.m54625aL().mo53328f())) {
                    SimpleShadowTextView simpleShadowTextView = this.f53064r.f120135t;
                    AbstractC19074t.m100207e(simpleShadowTextView, "tvNewNoti");
                    AbstractC26112n.m134431w0(simpleShadowTextView);
                }
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54638a(((Boolean) obj).booleanValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$f */
    /* loaded from: classes5.dex */
    static final class C10333f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25037n1 f53066r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10333f(C25037n1 c25037n1) {
            super(1);
            this.f53066r = c25037n1;
        }

        /* renamed from: a */
        public final void m54639a(View view) {
            AbstractC19074t.m100208f(view, "it");
            NotificationView.this.f53052D0 = true;
            NotificationView.this.m54625aL().mo53331i();
            this.f53066r.f120132q.m56228c(1.0f, 1);
            this.f53066r.f120132q.m56228c(1.0f, 0);
            NotificationPageView m54605ZK = NotificationView.this.m54605ZK();
            if (m54605ZK != null) {
                m54605ZK.m54579vL(NotificationView.this.m54625aL().mo53328f(), NotificationView.this.m54625aL().mo53330h());
            }
            NotificationView.this.m54607cL();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54639a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$g */
    /* loaded from: classes5.dex */
    public static final class C10334g implements OverScrollableRecyclerView.InterfaceC10831b {

        /* renamed from: a */
        final /* synthetic */ C25037n1 f53067a;

        /* renamed from: b */
        final /* synthetic */ NotificationView f53068b;

        C10334g(C25037n1 c25037n1, NotificationView notificationView) {
            this.f53067a = c25037n1;
            this.f53068b = notificationView;
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10831b
        /* renamed from: a */
        public void mo54127a(float f11, int i11) {
            if (this.f53067a.f120132q.m56228c(f11, i11)) {
                this.f53068b.m54625aL().mo53331i();
                NotificationPageView m54605ZK = this.f53068b.m54605ZK();
                if (m54605ZK != null) {
                    m54605ZK.m54579vL(this.f53068b.m54625aL().mo53328f(), this.f53068b.m54625aL().mo53330h());
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$h */
    /* loaded from: classes5.dex */
    public static final class C10335h implements OverScrollableRecyclerView.InterfaceC10832c {
        C10335h() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10832c
        /* renamed from: a */
        public void mo53961a() {
            C31192z c31192z;
            C31192z c31192z2 = NotificationView.this.f53050B0;
            if ((c31192z2 == null || !c31192z2.m151444M()) && (c31192z = NotificationView.this.f53050B0) != null) {
                c31192z.mo151429P();
            }
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$i */
    /* loaded from: classes5.dex */
    public static final class C10336i implements OverScrollableRecyclerView.InterfaceC10830a {
        C10336i() {
        }

        @Override // com.zing.zalo.shortvideo.p072ui.widget.p075rv.OverScrollableRecyclerView.InterfaceC10830a
        /* renamed from: a */
        public void mo52660a(float f11, float f12) {
            NotificationView.this.m54621XK().f120133r.setTranslationY(f12);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.NotificationView$j */
    /* loaded from: classes5.dex */
    static final class C10337j extends AbstractC19075u implements InterfaceC18509p {
        C10337j() {
            super(2);
        }

        /* renamed from: a */
        public final void m54640a(String str, PersonalizeChannel personalizeChannel) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(personalizeChannel, "personalize");
            C31192z c31192z = NotificationView.this.f53050B0;
            if (c31192z != null) {
                c31192z.m151964Z(str, personalizeChannel.m51104c());
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54640a((String) obj, (PersonalizeChannel) obj2);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: ZK */
    public final NotificationPageView m54605ZK() {
        ZaloView m92650VI = m92650VI();
        if (m92650VI instanceof NotificationPageView) {
            return (NotificationPageView) m92650VI;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: bL */
    private final void m54606bL() {
        String m92652XI;
        String mo53328f = m54625aL().mo53328f();
        int hashCode = mo53328f.hashCode();
        if (hashCode != 1568) {
            if (hashCode != 1598) {
                if (hashCode != 1629) {
                    if (hashCode != 1630) {
                        switch (hashCode) {
                            case 1600:
                                if (mo53328f.equals("22")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_cmt_open);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            case 1601:
                                if (mo53328f.equals("23")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_like_open);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            case 1602:
                                if (mo53328f.equals("24")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_follow_open);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            default:
                                m92652XI = null;
                                break;
                        }
                    } else {
                        if (mo53328f.equals("31")) {
                            m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_like_open);
                        }
                        m92652XI = null;
                    }
                } else {
                    if (mo53328f.equals("30")) {
                        m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_cmt_open);
                    }
                    m92652XI = null;
                }
            } else {
                if (mo53328f.equals("20")) {
                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_system_open);
                }
                m92652XI = null;
            }
        } else {
            if (mo53328f.equals("11")) {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_system_open);
            }
            m92652XI = null;
        }
        if (m92652XI != null) {
            C19205a.f95429a.m100713L(m92652XI, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: cL */
    public final void m54607cL() {
        String m92652XI;
        String mo53328f = m54625aL().mo53328f();
        int hashCode = mo53328f.hashCode();
        if (hashCode != 1568) {
            if (hashCode != 1598) {
                if (hashCode != 1629) {
                    if (hashCode != 1630) {
                        switch (hashCode) {
                            case 1600:
                                if (mo53328f.equals("22")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_cmt_new);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            case 1601:
                                if (mo53328f.equals("23")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_like_new);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            case 1602:
                                if (mo53328f.equals("24")) {
                                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_follow_new);
                                    break;
                                }
                                m92652XI = null;
                                break;
                            default:
                                m92652XI = null;
                                break;
                        }
                    } else {
                        if (mo53328f.equals("31")) {
                            m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_like_new);
                        }
                        m92652XI = null;
                    }
                } else {
                    if (mo53328f.equals("30")) {
                        m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_cmt_new);
                    }
                    m92652XI = null;
                }
            } else {
                if (mo53328f.equals("20")) {
                    m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_channel_system_new);
                }
                m92652XI = null;
            }
        } else {
            if (mo53328f.equals("11")) {
                m92652XI = m92652XI(AbstractC27413h.zch_action_key_noti_user_system_new);
            }
            m92652XI = null;
        }
        if (m92652XI != null) {
            C19205a.f95429a.m100713L(m92652XI, null);
        }
    }

    /* renamed from: dL */
    private final void m54608dL(String str) {
        String str2;
        Map m131401f;
        if (AbstractC19074t.m100204b(m54625aL().mo53328f(), "30")) {
            str2 = m92652XI(AbstractC27413h.zch_action_key_noti_user_follow_cmt);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            C19205a c19205a = C19205a.f95429a;
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("channel_uid", str));
            c19205a.m100713L(str2, m131401f);
        }
    }

    /* renamed from: eL */
    private final void m54609eL(String str) {
        String str2;
        Map m131401f;
        String mo53328f = m54625aL().mo53328f();
        if (AbstractC19074t.m100204b(mo53328f, "22")) {
            str2 = m92652XI(AbstractC27413h.zch_action_key_noti_channel_like_cmt);
        } else if (AbstractC19074t.m100204b(mo53328f, "30")) {
            str2 = m92652XI(AbstractC27413h.zch_action_key_noti_user_like_cmt);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            C19205a c19205a = C19205a.f95429a;
            m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("comment_id", str));
            c19205a.m100713L(str2, m131401f);
        }
    }

    /* renamed from: fL */
    private final void m54610fL(String str, Integer num, Integer num2, String str2) {
        String str3;
        String mo53328f = m54625aL().mo53328f();
        if (AbstractC19074t.m100204b(mo53328f, "22")) {
            str3 = m92652XI(AbstractC27413h.zch_action_key_noti_channel_rep_cmt);
        } else if (AbstractC19074t.m100204b(mo53328f, "30")) {
            str3 = m92652XI(AbstractC27413h.zch_action_key_noti_user_rep_cmt);
        } else {
            str3 = null;
        }
        if (str3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("comment_id", str);
            if (num != null) {
                hashMap.put("comment_identity", Integer.valueOf(num.intValue()));
            }
            if (num2 != null) {
                hashMap.put("tagged_type", Integer.valueOf(num2.intValue()));
            }
            if (str2 != null) {
                hashMap.put("tagged_id", str2);
            }
            C19205a.f95429a.m100713L(str3, hashMap);
        }
    }

    /* renamed from: gL */
    private final void m54611gL(Channel channel) {
        Map m131401f;
        m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, channel, null, 2, null));
        C19205a c19205a = C19205a.f95429a;
        String m92652XI = m92652XI(AbstractC27413h.zch_action_key_click_channel_detail);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        m131401f = AbstractC25361o0.m131401f(AbstractC24866w.m129235a("seen_channel_uid", channel.m50769l()));
        c19205a.m100713L(m92652XI, m131401f);
    }

    /* renamed from: hL */
    private final void m54612hL(Notification.CommentPayload commentPayload) {
        m55551QK(VideoChannelPagerView.Companion.m55119g(commentPayload.m51068d(), commentPayload.m51065a(), commentPayload.m51066b()));
    }

    /* renamed from: iL */
    private final void m54613iL(Notification.LinkPayload linkPayload) {
        InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
        if (interfaceC25792a != null) {
            InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2(), linkPayload.m51073a(), this, null, null, null, null, 480, null);
        }
    }

    /* renamed from: jL */
    private final void m54614jL(Video video) {
        m55551QK(VideoChannelPagerView.C10509b.m55112h(VideoChannelPagerView.Companion, video.m52911t(), null, null, 6, null));
    }

    /* renamed from: nL */
    private final void m54615nL(User user) {
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            CommentUserBottomSheet m51879a = CommentUserBottomSheet.Companion.m51879a(user.m51229b());
            m51879a.m51757bL(true);
            BaseBottomSheetView.m51747hL(m51879a, m92662fJ, null, 2, null);
        }
    }

    @Override // m20.InterfaceC22798t0
    /* renamed from: A7 */
    public void mo54616A7(Section section) {
        AbstractC19074t.m100208f(section, "data");
        if (m54621XK().f120132q.m56227b()) {
            m54621XK().f120132q.m56226a();
        }
        m54621XK().f120133r.m55781c();
        m54621XK().f120133r.m55780b();
        C31192z c31192z = this.f53050B0;
        if (c31192z != null) {
            c31192z.m151960T();
        }
        if (!section.m51168m().isEmpty()) {
            C31192z c31192z2 = this.f53050B0;
            if (c31192z2 != null) {
                c31192z2.m151959S(section);
            }
        } else {
            LoadingLayout loadingLayout = m54621XK().f120133r;
            AbstractC19074t.m100207e(loadingLayout, "lytLoading");
            LoadingLayout.m55778e(loadingLayout, null, null, Integer.valueOf(AbstractC27413h.zch_page_notification_no_data), null, null, null, 59, null);
        }
        C31192z c31192z3 = this.f53050B0;
        if (c31192z3 != null) {
            c31192z3.m10008p();
        }
        C31192z c31192z4 = this.f53050B0;
        if (c31192z4 != null) {
            c31192z4.m151445N();
        }
        SimpleShadowTextView simpleShadowTextView = m54621XK().f120135t;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvNewNoti");
        AbstractC26112n.m134367H(simpleShadowTextView);
        if (this.f53052D0) {
            this.f53052D0 = false;
            RecyclerView.AbstractC1888o layoutManager = m54621XK().f120134s.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo9756v1(0);
            }
        }
    }

    @Override // m20.InterfaceC22798t0
    /* renamed from: CD */
    public void mo54617CD(Throwable th2) {
        AbstractC19074t.m100208f(th2, "throwable");
        C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_error_send_comment_fail);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m54629mL(AbstractC28684a.Companion.m143664A());
        m54625aL().mo52965Lb(this);
        m54625aL().mo52970uo(m92642L3());
        getLifecycle().mo9335a(m54625aL());
        this.f53050B0 = m54619WK();
    }

    @Override // m20.InterfaceC22798t0
    /* renamed from: Cm */
    public void mo54618Cm(Section section) {
        AbstractC19074t.m100208f(section, "data");
        C31192z c31192z = this.f53050B0;
        if (c31192z != null) {
            int mo10003k = c31192z.mo10003k();
            c31192z.m151959S(section);
            int mo10003k2 = c31192z.mo10003k() - mo10003k;
            c31192z.m10010r(mo10003k - 1, Boolean.TRUE);
            c31192z.m10015w(mo10003k, mo10003k2);
            c31192z.m151445N();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C25037n1 m129901c = C25037n1.m129901c(layoutInflater);
        AbstractC19074t.m100207e(m129901c, "inflate(...)");
        m54627lL(m129901c);
        C25037n1 m54621XK = m54621XK();
        NotificationReceiver notificationReceiver = new NotificationReceiver(null, null, null, null, new C10332e(m54621XK), 15, null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        notificationReceiver.mo53685d(m92689tK);
        this.f53051C0 = notificationReceiver;
        SimpleShadowTextView simpleShadowTextView = m54621XK.f120135t;
        AbstractC19074t.m100207e(simpleShadowTextView, "tvNewNoti");
        AbstractC26112n.m134407k0(simpleShadowTextView, new C10333f(m54621XK));
        OverScrollableRecyclerView overScrollableRecyclerView = m54621XK.f120134s;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        overScrollableRecyclerView.setLayoutManager(new OverScrollableRecyclerView.LinearLayoutManager(m92689tK2, 0, false, false, 14, null));
        m54621XK.f120134s.setAdapter(this.f53050B0);
        m54621XK.f120134s.m9816A(m54622YK());
        OverScrollableRecyclerView overScrollableRecyclerView2 = m54621XK.f120134s;
        Context m92689tK3 = m92689tK();
        AbstractC19074t.m100207e(m92689tK3, "requireContext(...)");
        overScrollableRecyclerView2.m9816A(new C2498d(m92689tK3));
        OverScrollableRecyclerView overScrollableRecyclerView3 = m54621XK.f120134s;
        AbstractC19074t.m100207e(overScrollableRecyclerView3, "rv");
        OverScrollableRecyclerView.m56143g2(overScrollableRecyclerView3, new C10334g(m54621XK, this), 0.0f, 2, null);
        OverScrollableRecyclerView overScrollableRecyclerView4 = m54621XK.f120134s;
        AbstractC19074t.m100207e(overScrollableRecyclerView4, "rv");
        OverScrollableRecyclerView.m56144i2(overScrollableRecyclerView4, new C10335h(), 0.0f, 2, null);
        m54621XK.f120134s.m56145b2(new C10336i());
        if (AbstractC19074t.m100204b(m54625aL().mo53328f(), "30")) {
            ChannelReceiver channelReceiver = new ChannelReceiver(null, null, null, null, new C10337j(), 15, null);
            Context m92689tK4 = m92689tK();
            AbstractC19074t.m100207e(m92689tK4, "requireContext(...)");
            channelReceiver.mo53685d(m92689tK4);
            this.f53053E0 = channelReceiver;
        }
        FrameLayout root = m54621XK().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.ZchBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        ChannelReceiver channelReceiver = this.f53053E0;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
    }

    /* renamed from: WK */
    public C31192z m54619WK() {
        C31192z c31192z = new C31192z(m54625aL().mo53328f());
        c31192z.m151963Y(this);
        return c31192z;
    }

    @Override // m20.InterfaceC22798t0
    /* renamed from: Wn */
    public void mo54620Wn(Throwable th2) {
        AbstractC19074t.m100208f(th2, C30268e.f140632a);
        C31192z c31192z = this.f53050B0;
        if (c31192z != null) {
            c31192z.m151445N();
        }
        if (m54621XK().f120132q.m56227b()) {
            m54621XK().f120132q.m56226a();
        }
        C25037n1 m54621XK = m54621XK();
        if (th2 instanceof NetworkException) {
            C31192z c31192z2 = this.f53050B0;
            if (c31192z2 != null && c31192z2.mo151443L()) {
                C25097t.f120556a.m130155r(getContext(), th2);
                return;
            } else {
                m54621XK.f120133r.m55784g(new C10329b(m54621XK, this));
                return;
            }
        }
        C31192z c31192z3 = this.f53050B0;
        if (c31192z3 == null || !c31192z3.mo151443L()) {
            m54621XK.f120133r.m55783f(new C10330c(m54621XK, this));
        }
    }

    /* renamed from: XK */
    protected final C25037n1 m54621XK() {
        C25037n1 c25037n1 = this.f53049A0;
        if (c25037n1 != null) {
            return c25037n1;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: YK */
    public RecyclerView.AbstractC1887n m54622YK() {
        return new C10331d();
    }

    @Override // z10.C31192z.a
    /* renamed from: a */
    public void mo54623a(LoadMoreInfo loadMoreInfo) {
        AbstractC19074t.m100208f(loadMoreInfo, "next");
        m54625aL().mo53326a(loadMoreInfo);
    }

    /* renamed from: aG */
    public final void m54624aG(String str, Comment comment) {
        AbstractC19074t.m100208f(comment, "comment");
        m54625aL().mo53327aG(str, comment);
    }

    /* renamed from: aL */
    protected final InterfaceC19726j m54625aL() {
        InterfaceC19726j interfaceC19726j = this.f53055z0;
        if (interfaceC19726j != null) {
            return interfaceC19726j;
        }
        AbstractC19074t.m100223u("presenter");
        return null;
    }

    /* renamed from: kL */
    public final void m54626kL(boolean z11) {
        if (!z11) {
            SimpleShadowTextView simpleShadowTextView = m54621XK().f120135t;
            AbstractC19074t.m100207e(simpleShadowTextView, "tvNewNoti");
            if (!AbstractC26112n.m134380U(simpleShadowTextView)) {
                return;
            }
        }
        m54625aL().mo53331i();
        m54621XK().f120132q.m56228c(1.0f, 1);
        m54621XK().f120132q.m56228c(1.0f, 0);
    }

    /* renamed from: lL */
    protected final void m54627lL(C25037n1 c25037n1) {
        AbstractC19074t.m100208f(c25037n1, "<set-?>");
        this.f53049A0 = c25037n1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v19, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v42, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v49, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v50, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.os.Parcelable] */
    @Override // z10.C31192z.a
    /* renamed from: m */
    public void mo54628m(View view) {
        Notification notification;
        Notification.Target target;
        Integer num;
        Notification.Payload m51085c;
        Notification notification2;
        Notification.CommentPayload commentPayload;
        Video m51067c;
        String m51065a;
        User user;
        NotificationPageView notificationPageView;
        String str;
        Channel channel;
        Notification notification3;
        String m51065a2;
        Notification notification4;
        String m50769l;
        String m50775o;
        Notification notification5;
        Notification.Payload payload;
        Integer num2;
        Notification.Target m51052d;
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        Notification.LinkPayload linkPayload = null;
        User user2 = null;
        Channel channel2 = null;
        Parcelable parcelable = null;
        Channel channel3 = null;
        Parcelable parcelable2 = null;
        Notification.CommentPayload commentPayload2 = null;
        Comment comment = null;
        User user3 = null;
        Channel channel4 = null;
        Video video = null;
        Notification.CommentPayload commentPayload3 = null;
        if (id2 == AbstractC27409d.ivLeft) {
            ?? parent = view.getParent();
            AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.View");
            Object tag = ((View) parent).getTag();
            if (tag instanceof Notification) {
                notification5 = (Notification) tag;
            } else {
                notification5 = null;
            }
            if (notification5 != null && (m51052d = notification5.m51052d()) != null) {
                payload = m51052d.m51085c();
            } else {
                payload = null;
            }
            if (payload != null) {
                num2 = Integer.valueOf(payload.m51077b());
            } else {
                num2 = null;
            }
            if (num2 != null && num2.intValue() == 1) {
                ?? m51076a = payload.m51076a();
                if (m51076a instanceof User) {
                    user2 = m51076a;
                }
                User user4 = user2;
                if (user4 != null) {
                    m54615nL(user4);
                    return;
                }
                return;
            }
            if (num2 != null && num2.intValue() == 2) {
                ?? m51076a2 = payload.m51076a();
                if (m51076a2 instanceof Channel) {
                    channel2 = m51076a2;
                }
                Channel channel5 = channel2;
                if (channel5 != null) {
                    m54611gL(channel5);
                    return;
                }
                return;
            }
            return;
        }
        if (id2 == AbstractC27409d.btnFollow) {
            ?? parent2 = view.getParent();
            AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.View");
            Object tag2 = ((View) parent2).getTag();
            if (tag2 instanceof Notification) {
                notification4 = (Notification) tag2;
            } else {
                notification4 = null;
            }
            if (notification4 == null) {
                return;
            }
            Notification.Payload m51085c2 = notification4.m51052d().m51085c();
            if (m51085c2 != null) {
                Parcelable m51076a3 = m51085c2.m51076a();
                if (m51076a3 instanceof Channel) {
                    parcelable = m51076a3;
                }
                channel3 = (Channel) parcelable;
            }
            if (channel3 == null || (m50769l = channel3.m50769l()) == null || (m50775o = channel3.m50775o()) == null) {
                return;
            }
            this.f53054F0 = notification4.m51054f();
            m54625aL().mo53332mf(m54625aL().mo53328f(), m50775o, notification4.m51054f(), m50769l);
            return;
        }
        if (id2 == AbstractC27409d.flLike) {
            ?? parent3 = view.getParent();
            AbstractC19074t.m100206d(parent3, "null cannot be cast to non-null type android.view.View");
            Object tag3 = ((View) parent3).getTag();
            if (tag3 instanceof Notification) {
                notification3 = (Notification) tag3;
            } else {
                notification3 = null;
            }
            if (notification3 == null) {
                return;
            }
            Notification.Payload m51085c3 = notification3.m51051c().m51085c();
            if (m51085c3 != null) {
                Parcelable m51076a4 = m51085c3.m51076a();
                if (m51076a4 instanceof Notification.CommentPayload) {
                    parcelable2 = m51076a4;
                }
                commentPayload2 = (Notification.CommentPayload) parcelable2;
            }
            if (commentPayload2 != null && (m51065a2 = commentPayload2.m51065a()) != null) {
                m54625aL().mo53329f6(m54625aL().mo53328f(), notification3.m51054f(), m51065a2, !AbstractC19074t.m100204b(notification3.m51060l(), Boolean.TRUE));
                return;
            }
            return;
        }
        if (id2 == AbstractC27409d.btnReply) {
            ?? parent4 = view.getParent();
            AbstractC19074t.m100206d(parent4, "null cannot be cast to non-null type android.view.View");
            Object tag4 = ((View) parent4).getTag();
            if (tag4 instanceof Notification) {
                notification2 = (Notification) tag4;
            } else {
                notification2 = null;
            }
            if (notification2 == null) {
                return;
            }
            Notification.Payload m51085c4 = notification2.m51051c().m51085c();
            if (m51085c4 != null) {
                Parcelable m51076a5 = m51085c4.m51076a();
                if (!(m51076a5 instanceof Notification.CommentPayload)) {
                    m51076a5 = null;
                }
                commentPayload = (Notification.CommentPayload) m51076a5;
            } else {
                commentPayload = null;
            }
            if (commentPayload == null || (m51067c = commentPayload.m51067c()) == null || (m51065a = commentPayload.m51065a()) == null) {
                return;
            }
            Notification.Payload m51085c5 = notification2.m51052d().m51085c();
            if (m51085c5 != null) {
                Parcelable m51076a6 = m51085c5.m51076a();
                if (!(m51076a6 instanceof User)) {
                    m51076a6 = null;
                }
                user = (User) m51076a6;
            } else {
                user = null;
            }
            ZaloView m92650VI = m92650VI();
            if (m92650VI instanceof NotificationPageView) {
                notificationPageView = (NotificationPageView) m92650VI;
            } else {
                notificationPageView = null;
            }
            if (notificationPageView != null && !notificationPageView.mo60294yp()) {
                String m51066b = commentPayload.m51066b();
                if (m51066b == null) {
                    str = m51065a;
                } else {
                    str = m51066b;
                }
                if (user != null) {
                    comment = new Comment(m51065a, new Comment.Identity(user.m51234g(), 1, user.m51235h(), user.m51230c(), (String) null, (String) null, (String) null, (String) null, m51067c.m52893i0(), 240, (AbstractC19060k) null), m51067c.m52911t(), (Comment.Identity) null, (String) null, (String) null, false, false, 0L, 0L, str, (Comment) null, (Section) null, 0L, (String) null, (Integer) null, (List) null, (Video) null, (Boolean) null, 523256, (AbstractC19060k) null);
                } else {
                    Notification.Payload m51085c6 = notification2.m51052d().m51085c();
                    if (m51085c6 != null) {
                        Parcelable m51076a7 = m51085c6.m51076a();
                        if (!(m51076a7 instanceof Channel)) {
                            m51076a7 = null;
                        }
                        channel = (Channel) m51076a7;
                    } else {
                        channel = null;
                    }
                    if (channel != null) {
                        comment = new Comment(m51065a, new Comment.Identity(channel.m50769l(), 2, channel.m50775o(), channel.m50754c(), (String) null, (String) null, (String) null, (String) null, m51067c.m52893i0(), 240, (AbstractC19060k) null), m51067c.m52911t(), (Comment.Identity) null, (String) null, (String) null, false, false, 0L, 0L, str, (Comment) null, (Section) null, 0L, (String) null, (Integer) null, (List) null, (Video) null, (Boolean) null, 523256, (AbstractC19060k) null);
                    }
                }
                if (comment == null) {
                    return;
                }
                notificationPageView.m54580yL(notification2.m51054f(), m51067c, comment);
                return;
            }
            return;
        }
        Object tag5 = view.getTag();
        if (tag5 instanceof Notification) {
            notification = (Notification) tag5;
        } else {
            notification = null;
        }
        if (notification != null) {
            target = notification.m51051c();
        } else {
            target = null;
        }
        if (target != null) {
            num = Integer.valueOf(target.m51084b());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            Notification.Payload m51085c7 = target.m51085c();
            if (m51085c7 != null) {
                ?? m51076a8 = m51085c7.m51076a();
                if (m51076a8 instanceof User) {
                    user3 = m51076a8;
                }
                User user5 = user3;
                if (user5 != null) {
                    m54615nL(user5);
                }
            }
        } else if (num != null && num.intValue() == 2) {
            Notification.Payload m51085c8 = target.m51085c();
            if (m51085c8 != null) {
                ?? m51076a9 = m51085c8.m51076a();
                if (m51076a9 instanceof Channel) {
                    channel4 = m51076a9;
                }
                Channel channel6 = channel4;
                if (channel6 != null) {
                    m54611gL(channel6);
                }
            }
        } else if (num != null && num.intValue() == 3) {
            Notification.Payload m51085c9 = target.m51085c();
            if (m51085c9 != null) {
                ?? m51076a10 = m51085c9.m51076a();
                if (m51076a10 instanceof Video) {
                    video = m51076a10;
                }
                Video video2 = video;
                if (video2 != null) {
                    m54614jL(video2);
                }
            }
        } else if (num != null && num.intValue() == 4) {
            Notification.Payload m51085c10 = target.m51085c();
            if (m51085c10 != null) {
                ?? m51076a11 = m51085c10.m51076a();
                if (m51076a11 instanceof Notification.CommentPayload) {
                    commentPayload3 = m51076a11;
                }
                Notification.CommentPayload commentPayload4 = commentPayload3;
                if (commentPayload4 != null) {
                    m54612hL(commentPayload4);
                }
            }
        } else if (num != null && num.intValue() == 10 && (m51085c = target.m51085c()) != null) {
            ?? m51076a12 = m51085c.m51076a();
            if (m51076a12 instanceof Notification.LinkPayload) {
                linkPayload = m51076a12;
            }
            Notification.LinkPayload linkPayload2 = linkPayload;
            if (linkPayload2 != null) {
                m54613iL(linkPayload2);
            }
        }
        m54606bL();
    }

    /* renamed from: mL */
    protected final void m54629mL(InterfaceC19726j interfaceC19726j) {
        AbstractC19074t.m100208f(interfaceC19726j, "<set-?>");
        this.f53055z0 = interfaceC19726j;
    }

    /* renamed from: oL */
    public final void m54630oL(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "commentId");
        C31192z c31192z = this.f53050B0;
        if (c31192z != null) {
            c31192z.m151965a0(str, z11);
        }
    }

    @Override // m20.InterfaceC22798t0
    /* renamed from: vi */
    public void mo54631vi(String str, String str2, boolean z11, Throwable th2) {
        AbstractC19074t.m100208f(str, "notifyId");
        AbstractC19074t.m100208f(str2, "commentId");
        if (th2 != null) {
            C25097t.f120556a.m130155r(getContext(), th2);
        }
        m54609eL(str2);
    }

    @Override // m20.InterfaceC22798t0
    /* renamed from: xB */
    public void mo54632xB(String str, String str2, PersonalizeChannel personalizeChannel, Throwable th2) {
        String str3;
        String m51102a;
        AbstractC19074t.m100208f(str, "notifyId");
        AbstractC19074t.m100208f(str2, "channelName");
        if (th2 != null) {
            C25097t.f120556a.m130155r(getContext(), th2);
        } else {
            C25097t c25097t = C25097t.f120556a;
            Context context = getContext();
            Context context2 = getContext();
            if (context2 != null) {
                str3 = context2.getString(AbstractC27413h.zch_page_channel_following);
            } else {
                str3 = null;
            }
            c25097t.m130154o(context, str3 + " " + str2);
        }
        if (personalizeChannel != null && (m51102a = personalizeChannel.m51102a()) != null) {
            m54608dL(m51102a);
        }
    }

    @Override // m20.InterfaceC22798t0
    /* renamed from: zo */
    public void mo54633zo(String str, Comment comment, boolean z11) {
        Integer num;
        AbstractC19074t.m100208f(comment, "comment");
        C31192z c31192z = this.f53050B0;
        if (c31192z != null) {
            c31192z.m151966b0(str);
        }
        C25097t.f120556a.m130153n(getContext(), AbstractC27413h.zch_noti_page_interacted_replied);
        String m50833g = comment.m50833g();
        Integer valueOf = Integer.valueOf(comment.m50838l().m50856f());
        Comment.Identity m50834h = comment.m50834h();
        String str2 = null;
        if (m50834h != null) {
            num = Integer.valueOf(m50834h.m50856f());
        } else {
            num = null;
        }
        Comment.Identity m50834h2 = comment.m50834h();
        if (m50834h2 != null) {
            str2 = m50834h2.m50854d();
        }
        m54610fL(m50833g, valueOf, num, str2);
    }
}
