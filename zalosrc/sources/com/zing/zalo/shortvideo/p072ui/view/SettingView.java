package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.p072ui.component.bts.BaseBottomSheetView;
import com.zing.zalo.shortvideo.p072ui.component.bts.SettingBottomSheet;
import com.zing.zalo.shortvideo.p072ui.receiver.ChannelReceiver;
import com.zing.zalo.shortvideo.p072ui.receiver.NotificationReceiver;
import com.zing.zalo.shortvideo.p072ui.view.ChannelPageView;
import com.zing.zalo.shortvideo.p072ui.widget.Divider;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import com.zing.zalo.zview.C17487o0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import g20.C19205a;
import j20.InterfaceC20907a;
import java.util.List;
import k20.C21456b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import mj0.AbstractC23322a;
import n20.AbstractC23524a;
import n20.C23527d;
import on0.AbstractC24341v;
import p021an.AbstractC0955d;
import p483rh.InterfaceC25792a;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q10.C25052s1;
import qm0.AbstractC25368s;
import s20.AbstractC26112n;
import s20.AbstractC26114p;
import t10.C26449a;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27408c;
import v00.AbstractC27410e;
import v00.AbstractC27413h;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class SettingView extends SimpleView implements C21456b.c {

    /* renamed from: B0 */
    private final InterfaceC24854k f53261B0;

    /* renamed from: C0 */
    private C25052s1 f53262C0;

    /* renamed from: D0 */
    private ChannelReceiver f53263D0;

    /* renamed from: E0 */
    private NotificationReceiver f53264E0;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$a */
    /* loaded from: classes5.dex */
    static final class C10429a extends AbstractC19075u implements InterfaceC18505l {
        C10429a() {
            super(1);
        }

        /* renamed from: a */
        public final void m54901a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54897eL().m123537A0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54901a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$b */
    /* loaded from: classes5.dex */
    static final class C10430b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53266t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$b$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ SettingView f53268p;

            /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32741a implements SettingBottomSheet.InterfaceC9513b {

                /* renamed from: a */
                final /* synthetic */ User f53269a;

                C32741a(User user) {
                    this.f53269a = user;
                }

                @Override // com.zing.zalo.shortvideo.p072ui.component.bts.SettingBottomSheet.InterfaceC9513b
                /* renamed from: a */
                public List mo51901a() {
                    List m131502j;
                    List m51231d = this.f53269a.m51231d();
                    if (m51231d == null) {
                        m131502j = AbstractC25368s.m131502j();
                        return m131502j;
                    }
                    return m51231d;
                }
            }

            a(SettingView settingView) {
                this.f53268p = settingView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(AbstractC23524a.b bVar, Continuation continuation) {
                String str;
                Channel channel;
                User user;
                String m123446b = bVar.m123446b();
                String str2 = null;
                switch (m123446b.hashCode()) {
                    case -1850794333:
                        if (m123446b.equals("open_insight")) {
                            Object m123445a = bVar.m123445a();
                            if (m123445a instanceof String) {
                                str = (String) m123445a;
                            } else {
                                str = null;
                            }
                            if (str != null) {
                                this.f53268p.m54892Bt(str);
                                C19205a c19205a = C19205a.f95429a;
                                String m92652XI = this.f53268p.m92652XI(AbstractC27413h.zch_action_key_open_analytics);
                                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                                c19205a.m100713L(m92652XI, null);
                                break;
                            } else {
                                return C24848g0.f119245a;
                            }
                        }
                        break;
                    case -1601301471:
                        if (m123446b.equals("open_following_list")) {
                            this.f53268p.m55551QK(new FollowingListView());
                            C19205a c19205a2 = C19205a.f95429a;
                            String m92652XI2 = this.f53268p.m92652XI(AbstractC27413h.zch_action_key_open_following_list);
                            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
                            c19205a2.m100713L(m92652XI2, null);
                            break;
                        }
                        break;
                    case -1474456544:
                        if (m123446b.equals("open_channel_page")) {
                            Object m123445a2 = bVar.m123445a();
                            if (m123445a2 instanceof Channel) {
                                channel = (Channel) m123445a2;
                            } else {
                                channel = null;
                            }
                            if (channel != null) {
                                SettingView settingView = this.f53268p;
                                settingView.m55551QK(ChannelPageView.C10134b.m53981c(ChannelPageView.Companion, channel, null, 2, null));
                                C19205a c19205a3 = C19205a.f95429a;
                                String m92652XI3 = settingView.m92652XI(AbstractC27413h.zch_action_key_open_my_channel);
                                AbstractC19074t.m100207e(m92652XI3, "getString(...)");
                                c19205a3.m100713L(m92652XI3, null);
                                break;
                            }
                        }
                        break;
                    case -1412966185:
                        if (m123446b.equals("open_blocked_page")) {
                            this.f53268p.m55551QK(new BlockPageView());
                            C19205a c19205a4 = C19205a.f95429a;
                            String m92652XI4 = this.f53268p.m92652XI(AbstractC27413h.zch_action_key_open_blocked_channel);
                            AbstractC19074t.m100207e(m92652XI4, "getString(...)");
                            c19205a4.m100713L(m92652XI4, null);
                            break;
                        }
                        break;
                    case -736918257:
                        if (m123446b.equals("show_view_more_bts")) {
                            Object m123445a3 = bVar.m123445a();
                            if (m123445a3 instanceof User) {
                                user = (User) m123445a3;
                            } else {
                                user = null;
                            }
                            if (user == null) {
                                return C24848g0.f119245a;
                            }
                            SettingBottomSheet m51900a = SettingBottomSheet.Companion.m51900a("8");
                            m51900a.m51899kL(new C32741a(user));
                            C17487o0 m92649TI = this.f53268p.m92649TI();
                            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
                            BaseBottomSheetView.m51747hL(m51900a, m92649TI, null, 2, null);
                            break;
                        }
                        break;
                    case 130053827:
                        if (m123446b.equals("open_bookmark_page")) {
                            this.f53268p.m55551QK(new BookmarkListView());
                            C19205a c19205a5 = C19205a.f95429a;
                            String m92652XI5 = this.f53268p.m92652XI(AbstractC27413h.zch_action_key_open_save_video);
                            AbstractC19074t.m100207e(m92652XI5, "getString(...)");
                            C19205a.m100675M(c19205a5, m92652XI5, null, 2, null);
                            break;
                        }
                        break;
                    case 172426899:
                        if (m123446b.equals("open_privacy")) {
                            SettingView settingView2 = this.f53268p;
                            Object m123445a4 = bVar.m123445a();
                            if (m123445a4 instanceof String) {
                                str2 = (String) m123445a4;
                            }
                            if (str2 != null) {
                                settingView2.m54892Bt(str2);
                                break;
                            } else {
                                return C24848g0.f119245a;
                            }
                        }
                        break;
                    case 370592527:
                        if (m123446b.equals("open_channel_notif_page")) {
                            this.f53268p.m55551QK(NotificationPageView.Companion.m54582a());
                            C19205a c19205a6 = C19205a.f95429a;
                            String m92652XI6 = this.f53268p.m92652XI(AbstractC27413h.zch_action_key_open_noti_channel_page);
                            AbstractC19074t.m100207e(m92652XI6, "getString(...)");
                            c19205a6.m100713L(m92652XI6, null);
                            break;
                        }
                        break;
                    case 1227118838:
                        if (m123446b.equals("open_liked_page")) {
                            this.f53268p.m55551QK(new LikedVideoView());
                            C19205a c19205a7 = C19205a.f95429a;
                            String m92652XI7 = this.f53268p.m92652XI(AbstractC27413h.zch_action_key_open_liked_video);
                            AbstractC19074t.m100207e(m92652XI7, "getString(...)");
                            c19205a7.m100713L(m92652XI7, null);
                            break;
                        }
                        break;
                    case 1579622205:
                        if (m123446b.equals("open_user_notif_page")) {
                            this.f53268p.m55551QK(NotificationPageView.Companion.m54583b());
                            C19205a c19205a8 = C19205a.f95429a;
                            String m92652XI8 = this.f53268p.m92652XI(AbstractC27413h.zch_action_key_open_noti_user_page);
                            AbstractC19074t.m100207e(m92652XI8, "getString(...)");
                            c19205a8.m100713L(m92652XI8, null);
                            break;
                        }
                        break;
                }
                return C24848g0.f119245a;
            }
        }

        C10430b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10430b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53266t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                SharedFlow m123442M = SettingView.this.m54897eL().m123442M();
                a aVar = new a(SettingView.this);
                this.f53266t = 1;
                if (m123442M.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10430b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$c */
    /* loaded from: classes5.dex */
    static final class C10431c extends AbstractC19075u implements InterfaceC18505l {
        C10431c() {
            super(1);
        }

        /* renamed from: a */
        public final void m54904a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54897eL().m123549u0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54904a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$d */
    /* loaded from: classes5.dex */
    static final class C10432d extends AbstractC19075u implements InterfaceC18505l {
        C10432d() {
            super(1);
        }

        /* renamed from: a */
        public final void m54905a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54897eL().m123543o0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54905a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$e */
    /* loaded from: classes5.dex */
    static final class C10433e extends AbstractC19075u implements InterfaceC18505l {
        C10433e() {
            super(1);
        }

        /* renamed from: a */
        public final void m54906a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54897eL().m123551w0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54906a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$f */
    /* loaded from: classes5.dex */
    static final class C10434f extends AbstractC19075u implements InterfaceC18505l {
        C10434f() {
            super(1);
        }

        /* renamed from: a */
        public final void m54907a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54897eL().m123544p0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54907a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$g */
    /* loaded from: classes5.dex */
    static final class C10435g extends AbstractC19075u implements InterfaceC18505l {
        C10435g() {
            super(1);
        }

        /* renamed from: a */
        public final void m54908a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54897eL().m123547s0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54908a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$h */
    /* loaded from: classes5.dex */
    static final class C10436h extends AbstractC19075u implements InterfaceC18505l {
        C10436h() {
            super(1);
        }

        /* renamed from: a */
        public final void m54909a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54897eL().m123553y0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54909a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$i */
    /* loaded from: classes5.dex */
    static final class C10437i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53276t;

        /* renamed from: v */
        final /* synthetic */ C25052s1 f53278v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$i$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ SettingView f53279p;

            /* renamed from: q */
            final /* synthetic */ C25052s1 f53280q;

            a(SettingView settingView, C25052s1 c25052s1) {
                this.f53279p = settingView;
                this.f53280q = c25052s1;
            }

            /* renamed from: a */
            public final Object m54911a(boolean z11, Continuation continuation) {
                SettingView settingView = this.f53279p;
                SimpleShadowTextView simpleShadowTextView = this.f53280q.f120271I;
                AbstractC19074t.m100207e(simpleShadowTextView, "userNotif");
                settingView.m54898fL(simpleShadowTextView, AbstractC23322a.zch_ic_user_noti_line_24, z11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m54911a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10437i(C25052s1 c25052s1, Continuation continuation) {
            super(2, continuation);
            this.f53278v = c25052s1;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10437i(this.f53278v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53276t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123542n0 = SettingView.this.m54897eL().m123542n0();
                a aVar = new a(SettingView.this, this.f53278v);
                this.f53276t = 1;
                if (m123542n0.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10437i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$j */
    /* loaded from: classes5.dex */
    static final class C10438j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53281t;

        /* renamed from: v */
        final /* synthetic */ C25052s1 f53283v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$j$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C25052s1 f53284p;

            /* renamed from: q */
            final /* synthetic */ SettingView f53285q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$j$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32742a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ SettingView f53286q;

                /* renamed from: r */
                final /* synthetic */ String f53287r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32742a(SettingView settingView, String str) {
                    super(1);
                    this.f53286q = settingView;
                    this.f53287r = str;
                }

                /* renamed from: a */
                public final void m54914a(View view) {
                    AbstractC19074t.m100208f(view, "it");
                    this.f53286q.m54897eL().m123552x0(this.f53287r);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m54914a((View) obj);
                    return C24848g0.f119245a;
                }
            }

            a(C25052s1 c25052s1, SettingView settingView) {
                this.f53284p = c25052s1;
                this.f53285q = settingView;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(InterfaceC20907a interfaceC20907a, Continuation continuation) {
                boolean m127128x;
                if (!AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.c.f102733a)) {
                    if (AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.b.f102732a) || (interfaceC20907a instanceof InterfaceC20907a.a)) {
                        SimpleShadowTextView simpleShadowTextView = this.f53284p.f120265C;
                        AbstractC19074t.m100207e(simpleShadowTextView, "privacy");
                        AbstractC26112n.m134367H(simpleShadowTextView);
                        Divider divider = this.f53284p.f120266D;
                        AbstractC19074t.m100207e(divider, "privacyDivider");
                        AbstractC26112n.m134367H(divider);
                        this.f53285q.m54900hL(this.f53284p, null);
                    } else if (interfaceC20907a instanceof InterfaceC20907a.d) {
                        InterfaceC20907a.d dVar = (InterfaceC20907a.d) interfaceC20907a;
                        String m51236i = ((User) dVar.m109379a()).m51236i();
                        SettingView settingView = this.f53285q;
                        SimpleShadowTextView simpleShadowTextView2 = this.f53284p.f120265C;
                        AbstractC19074t.m100207e(simpleShadowTextView2, "privacy");
                        SettingView.m54899gL(settingView, simpleShadowTextView2, AbstractC23322a.zds_ic_lock_line_24, false, 2, null);
                        if (m51236i != null) {
                            m127128x = AbstractC24341v.m127128x(m51236i);
                            if (!m127128x) {
                                SimpleShadowTextView simpleShadowTextView3 = this.f53284p.f120265C;
                                AbstractC19074t.m100207e(simpleShadowTextView3, "privacy");
                                AbstractC26112n.m134431w0(simpleShadowTextView3);
                                Divider divider2 = this.f53284p.f120266D;
                                AbstractC19074t.m100207e(divider2, "privacyDivider");
                                AbstractC26112n.m134431w0(divider2);
                                SimpleShadowTextView simpleShadowTextView4 = this.f53284p.f120265C;
                                AbstractC19074t.m100207e(simpleShadowTextView4, "privacy");
                                AbstractC26112n.m134407k0(simpleShadowTextView4, new C32742a(this.f53285q, m51236i));
                                if (this.f53285q.m54897eL().m123538Y().getValue() instanceof InterfaceC20907a.a) {
                                    this.f53285q.m54900hL(this.f53284p, (User) dVar.m109379a());
                                }
                            }
                        }
                        SimpleShadowTextView simpleShadowTextView5 = this.f53284p.f120265C;
                        AbstractC19074t.m100207e(simpleShadowTextView5, "privacy");
                        AbstractC26112n.m134367H(simpleShadowTextView5);
                        Divider divider3 = this.f53284p.f120266D;
                        AbstractC19074t.m100207e(divider3, "privacyDivider");
                        AbstractC26112n.m134367H(divider3);
                        if (this.f53285q.m54897eL().m123538Y().getValue() instanceof InterfaceC20907a.a) {
                        }
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10438j(C25052s1 c25052s1, Continuation continuation) {
            super(2, continuation);
            this.f53283v = c25052s1;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10438j(this.f53283v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53281t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123541l0 = SettingView.this.m54897eL().m123541l0();
                a aVar = new a(this.f53283v, SettingView.this);
                this.f53281t = 1;
                if (m123541l0.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10438j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$k */
    /* loaded from: classes5.dex */
    static final class C10439k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53288t;

        /* renamed from: v */
        final /* synthetic */ C25052s1 f53290v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$k$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ SettingView f53291p;

            /* renamed from: q */
            final /* synthetic */ C25052s1 f53292q;

            a(SettingView settingView, C25052s1 c25052s1) {
                this.f53291p = settingView;
                this.f53292q = c25052s1;
            }

            /* renamed from: a */
            public final Object m54916a(boolean z11, Continuation continuation) {
                SettingView settingView = this.f53291p;
                SimpleShadowTextView simpleShadowTextView = this.f53292q.f120277u;
                AbstractC19074t.m100207e(simpleShadowTextView, "channelNotif");
                settingView.m54898fL(simpleShadowTextView, AbstractC23322a.zds_ic_notif_line_24, z11);
                return C24848g0.f119245a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            public /* bridge */ /* synthetic */ Object mo12109b(Object obj, Continuation continuation) {
                return m54916a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10439k(C25052s1 c25052s1, Continuation continuation) {
            super(2, continuation);
            this.f53290v = c25052s1;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10439k(this.f53290v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53288t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123539a0 = SettingView.this.m54897eL().m123539a0();
                a aVar = new a(SettingView.this, this.f53290v);
                this.f53288t = 1;
                if (m123539a0.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10439k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$l */
    /* loaded from: classes5.dex */
    static final class C10440l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f53293t;

        /* renamed from: v */
        final /* synthetic */ C25052s1 f53295v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$l$a */
        /* loaded from: classes5.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ C25052s1 f53296p;

            /* renamed from: q */
            final /* synthetic */ SettingView f53297q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$l$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C32743a extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ SettingView f53298q;

                /* renamed from: r */
                final /* synthetic */ Channel f53299r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C32743a(SettingView settingView, Channel channel) {
                    super(1);
                    this.f53298q = settingView;
                    this.f53299r = channel;
                }

                /* renamed from: a */
                public final void m54919a(View view) {
                    AbstractC19074t.m100208f(view, "it");
                    this.f53298q.m54897eL().m123545q0(this.f53299r);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m54919a((View) obj);
                    return C24848g0.f119245a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$l$a$b */
            /* loaded from: classes5.dex */
            public static final class b extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                final /* synthetic */ SettingView f53300q;

                /* renamed from: r */
                final /* synthetic */ String f53301r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SettingView settingView, String str) {
                    super(1);
                    this.f53300q = settingView;
                    this.f53301r = str;
                }

                /* renamed from: a */
                public final void m54920a(View view) {
                    AbstractC19074t.m100208f(view, "it");
                    this.f53300q.m54897eL().m123550v0(this.f53301r);
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m54920a((View) obj);
                    return C24848g0.f119245a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$l$a$c */
            /* loaded from: classes5.dex */
            public static final class c extends AbstractC19075u implements InterfaceC18505l {

                /* renamed from: q */
                public static final c f53302q = new c();

                c() {
                    super(1);
                }

                /* renamed from: a */
                public final void m54921a(View view) {
                    AbstractC19074t.m100208f(view, "it");
                }

                @Override // en0.InterfaceC18505l
                /* renamed from: i9 */
                public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                    m54921a((View) obj);
                    return C24848g0.f119245a;
                }
            }

            a(C25052s1 c25052s1, SettingView settingView) {
                this.f53296p = c25052s1;
                this.f53297q = settingView;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object mo12109b(InterfaceC20907a interfaceC20907a, Continuation continuation) {
                InterfaceC20907a.d dVar;
                boolean m127128x;
                if (!AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.c.f102733a)) {
                    User user = null;
                    if (AbstractC19074t.m100204b(interfaceC20907a, InterfaceC20907a.b.f102732a) || (interfaceC20907a instanceof InterfaceC20907a.a)) {
                        LinearLayout linearLayout = this.f53296p.f120282z;
                        AbstractC19074t.m100207e(linearLayout, "llChannel");
                        AbstractC26112n.m134367H(linearLayout);
                        SettingView settingView = this.f53297q;
                        C25052s1 c25052s1 = this.f53296p;
                        Object value = settingView.m54897eL().m123541l0().getValue();
                        if (value instanceof InterfaceC20907a.d) {
                            dVar = (InterfaceC20907a.d) value;
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            user = (User) dVar.m109379a();
                        }
                        settingView.m54900hL(c25052s1, user);
                    } else if (interfaceC20907a instanceof InterfaceC20907a.d) {
                        InterfaceC20907a.d dVar2 = (InterfaceC20907a.d) interfaceC20907a;
                        Channel channel = (Channel) dVar2.m109379a();
                        if (AbstractC19074t.m100204b(channel.m50742R(), AbstractC29094b.m145339a(true))) {
                            LinearLayout linearLayout2 = this.f53296p.f120282z;
                            AbstractC19074t.m100207e(linearLayout2, "llChannel");
                            AbstractC26112n.m134367H(linearLayout2);
                            LinearLayout linearLayout3 = this.f53296p.f120264B;
                            AbstractC19074t.m100207e(linearLayout3, "llNoChannel");
                            AbstractC26112n.m134367H(linearLayout3);
                            LinearLayout linearLayout4 = this.f53296p.f120263A;
                            AbstractC19074t.m100207e(linearLayout4, "llChannelLocked");
                            AbstractC26112n.m134431w0(linearLayout4);
                            SimpleShadowTextView simpleShadowTextView = this.f53296p.f120276t;
                            Context m92689tK = this.f53297q.m92689tK();
                            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
                            simpleShadowTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C27280g.m139659b(m92689tK, AbstractC23322a.zds_ic_lock_line_24, AbstractC27406a.zch_icon_tertiary), (Drawable) null, (Drawable) null);
                        } else {
                            this.f53296p.f120280x.setAvatar(channel);
                            this.f53296p.f120270H.setText(channel.m50775o());
                            this.f53296p.f120270H.setVerifiedIcon(channel.m50725F());
                            RelativeLayout relativeLayout = this.f53296p.f120268F;
                            AbstractC19074t.m100207e(relativeLayout, "rlChannel");
                            AbstractC26112n.m134407k0(relativeLayout, new C32743a(this.f53297q, channel));
                            String m50790y = ((Channel) dVar2.m109379a()).m50790y();
                            if (m50790y != null) {
                                m127128x = AbstractC24341v.m127128x(m50790y);
                                if (!m127128x) {
                                    SettingView settingView2 = this.f53297q;
                                    SimpleShadowTextView simpleShadowTextView2 = this.f53296p.f120269G;
                                    AbstractC19074t.m100207e(simpleShadowTextView2, "tvInsight");
                                    SettingView.m54899gL(settingView2, simpleShadowTextView2, AbstractC23322a.zch_ic_analytic_line_24, false, 2, null);
                                    SimpleShadowTextView simpleShadowTextView3 = this.f53296p.f120269G;
                                    AbstractC19074t.m100207e(simpleShadowTextView3, "tvInsight");
                                    AbstractC26112n.m134407k0(simpleShadowTextView3, new b(this.f53297q, m50790y));
                                    SimpleShadowTextView simpleShadowTextView4 = this.f53296p.f120269G;
                                    AbstractC19074t.m100207e(simpleShadowTextView4, "tvInsight");
                                    AbstractC26112n.m134431w0(simpleShadowTextView4);
                                    Divider divider = this.f53296p.f120278v;
                                    AbstractC19074t.m100207e(divider, "divider");
                                    AbstractC26112n.m134431w0(divider);
                                    SettingView settingView3 = this.f53297q;
                                    SimpleShadowTextView simpleShadowTextView5 = this.f53296p.f120274r;
                                    AbstractC19074t.m100207e(simpleShadowTextView5, "blockedUser");
                                    SettingView.m54899gL(settingView3, simpleShadowTextView5, AbstractC23322a.zch_ic_user_block_line_24, false, 2, null);
                                    SimpleShadowTextView simpleShadowTextView6 = this.f53296p.f120274r;
                                    AbstractC19074t.m100207e(simpleShadowTextView6, "blockedUser");
                                    AbstractC26112n.m134407k0(simpleShadowTextView6, c.f53302q);
                                    LinearLayout linearLayout5 = this.f53296p.f120282z;
                                    AbstractC19074t.m100207e(linearLayout5, "llChannel");
                                    AbstractC26112n.m134431w0(linearLayout5);
                                    LinearLayout linearLayout6 = this.f53296p.f120264B;
                                    AbstractC19074t.m100207e(linearLayout6, "llNoChannel");
                                    AbstractC26112n.m134367H(linearLayout6);
                                    LinearLayout linearLayout7 = this.f53296p.f120263A;
                                    AbstractC19074t.m100207e(linearLayout7, "llChannelLocked");
                                    AbstractC26112n.m134367H(linearLayout7);
                                }
                            }
                            SimpleShadowTextView simpleShadowTextView7 = this.f53296p.f120269G;
                            AbstractC19074t.m100207e(simpleShadowTextView7, "tvInsight");
                            AbstractC26112n.m134367H(simpleShadowTextView7);
                            Divider divider2 = this.f53296p.f120278v;
                            AbstractC19074t.m100207e(divider2, "divider");
                            AbstractC26112n.m134367H(divider2);
                            SettingView settingView32 = this.f53297q;
                            SimpleShadowTextView simpleShadowTextView52 = this.f53296p.f120274r;
                            AbstractC19074t.m100207e(simpleShadowTextView52, "blockedUser");
                            SettingView.m54899gL(settingView32, simpleShadowTextView52, AbstractC23322a.zch_ic_user_block_line_24, false, 2, null);
                            SimpleShadowTextView simpleShadowTextView62 = this.f53296p.f120274r;
                            AbstractC19074t.m100207e(simpleShadowTextView62, "blockedUser");
                            AbstractC26112n.m134407k0(simpleShadowTextView62, c.f53302q);
                            LinearLayout linearLayout52 = this.f53296p.f120282z;
                            AbstractC19074t.m100207e(linearLayout52, "llChannel");
                            AbstractC26112n.m134431w0(linearLayout52);
                            LinearLayout linearLayout62 = this.f53296p.f120264B;
                            AbstractC19074t.m100207e(linearLayout62, "llNoChannel");
                            AbstractC26112n.m134367H(linearLayout62);
                            LinearLayout linearLayout72 = this.f53296p.f120263A;
                            AbstractC19074t.m100207e(linearLayout72, "llChannelLocked");
                            AbstractC26112n.m134367H(linearLayout72);
                        }
                    }
                }
                return C24848g0.f119245a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10440l(C25052s1 c25052s1, Continuation continuation) {
            super(2, continuation);
            this.f53295v = c25052s1;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C10440l(this.f53295v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f53293t;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                StateFlow m123538Y = SettingView.this.m54897eL().m123538Y();
                a aVar = new a(this.f53295v, SettingView.this);
                this.f53293t = 1;
                if (m123538Y.mo97893a(aVar, this) == m142578e) {
                    return m142578e;
                }
            }
            throw new KotlinNothingValueException();
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C10440l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$m */
    /* loaded from: classes5.dex */
    static final class C10441m extends AbstractC19075u implements InterfaceC18509p {
        C10441m() {
            super(2);
        }

        /* renamed from: a */
        public final void m54922a(boolean z11, boolean z12) {
            SettingView.this.m54897eL().m123548t0(z12);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54922a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$n */
    /* loaded from: classes5.dex */
    static final class C10442n extends AbstractC19075u implements InterfaceC18509p {
        C10442n() {
            super(2);
        }

        /* renamed from: a */
        public final void m54923a(boolean z11, boolean z12) {
            SettingView.this.m54897eL().m123554z0(z12);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m54923a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$o */
    /* loaded from: classes5.dex */
    static final class C10443o extends AbstractC19075u implements InterfaceC18505l {
        C10443o() {
            super(1);
        }

        /* renamed from: a */
        public final void m54924a(String str) {
            AbstractC19074t.m100208f(str, "it");
            SettingView.this.m54897eL().m123546r0();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54924a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$p */
    /* loaded from: classes5.dex */
    public static final class C10444p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f53307r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10444p(String str) {
            super(1);
            this.f53307r = str;
        }

        /* renamed from: a */
        public final void m54925a(View view) {
            AbstractC19074t.m100208f(view, "it");
            SettingView.this.m54892Bt(this.f53307r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m54925a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.view.SettingView$q */
    /* loaded from: classes5.dex */
    static final class C10445q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C10445q f53308q = new C10445q();

        C10445q() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23527d mo12V4() {
            return C26449a.f125639a.m136349n();
        }
    }

    public SettingView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C10445q.f53308q);
        this.f53261B0 = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Bt */
    public final void m54892Bt(String str) {
        InterfaceC25792a interfaceC25792a = (InterfaceC25792a) AbstractC0955d.m4496a(getContext(), AbstractC19061k0.m100169b(InterfaceC25792a.class));
        if (interfaceC25792a != null) {
            InterfaceC25792a.a.m132931a(interfaceC25792a, "action.open.inapp", 0, m92676n2(), str, this, null, null, null, null, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eL */
    public final C23527d m54897eL() {
        return (C23527d) this.f53261B0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public final void m54898fL(TextView textView, int i11, boolean z11) {
        Drawable m139659b;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        Drawable m139659b2 = C27280g.m139659b(m92689tK, i11, AbstractC27406a.zch_icon_accent_blue);
        if (z11) {
            m139659b = AbstractC26112n.m134434z(textView, AbstractC27408c.zch_ic_chevron_right_with_red_dot);
        } else {
            Context m92689tK2 = m92689tK();
            AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
            m139659b = C27280g.m139659b(m92689tK2, AbstractC23322a.zds_ic_chevron_right_line_16, AbstractC27406a.zch_icon_tertiary);
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(m139659b2, (Drawable) null, m139659b, (Drawable) null);
    }

    /* renamed from: gL */
    static /* synthetic */ void m54899gL(SettingView settingView, TextView textView, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        settingView.m54898fL(textView, i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hL */
    public final void m54900hL(C25052s1 c25052s1, User user) {
        String str;
        boolean m127128x;
        if (user != null) {
            str = user.m51237j();
        } else {
            str = null;
        }
        if (str != null) {
            m127128x = AbstractC24341v.m127128x(str);
            if (!m127128x) {
                RobotoButton robotoButton = c25052s1.f120267E;
                AbstractC19074t.m100207e(robotoButton, "register");
                AbstractC26112n.m134407k0(robotoButton, new C10444p(str));
                LinearLayout linearLayout = c25052s1.f120264B;
                AbstractC19074t.m100207e(linearLayout, "llNoChannel");
                AbstractC26112n.m134431w0(linearLayout);
                return;
            }
        }
        LinearLayout linearLayout2 = c25052s1.f120264B;
        AbstractC19074t.m100207e(linearLayout2, "llNoChannel");
        AbstractC26112n.m134367H(linearLayout2);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C25052s1 c25052s1;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        ImageView imageView = m55011UK().f120342r.f119961s;
        AbstractC19074t.m100205c(imageView);
        AbstractC26112n.m134407k0(imageView, new C10429a());
        AbstractC26112n.m134431w0(imageView);
        C25052s1 m129934a = C25052s1.m129934a(m55010SK());
        AbstractC19074t.m100207e(m129934a, "bind(...)");
        this.f53262C0 = m129934a;
        if (m129934a == null) {
            AbstractC19074t.m100223u("binding");
            c25052s1 = null;
        } else {
            c25052s1 = m129934a;
        }
        AbstractC26114p.m134444b(this, null, null, new C10430b(null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10437i(c25052s1, null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10438j(c25052s1, null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10439k(c25052s1, null), 3, null);
        AbstractC26114p.m134444b(this, null, null, new C10440l(c25052s1, null), 3, null);
        NotificationReceiver notificationReceiver = new NotificationReceiver(null, null, new C10441m(), new C10442n(), null, 19, null);
        this.f53264E0 = notificationReceiver;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        notificationReceiver.mo53685d(m92689tK);
        ChannelReceiver channelReceiver = new ChannelReceiver(new C10443o(), null, null, null, null, 30, null);
        this.f53263D0 = channelReceiver;
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        channelReceiver.mo53685d(m92689tK2);
        SimpleShadowTextView simpleShadowTextView = c25052s1.f120279w;
        AbstractC19074t.m100207e(simpleShadowTextView, "followingList");
        m54899gL(this, simpleShadowTextView, AbstractC23322a.zds_ic_check_circle_line_24, false, 2, null);
        SimpleShadowTextView simpleShadowTextView2 = c25052s1.f120279w;
        AbstractC19074t.m100207e(simpleShadowTextView2, "followingList");
        AbstractC26112n.m134407k0(simpleShadowTextView2, new C10431c());
        SimpleShadowTextView simpleShadowTextView3 = c25052s1.f120273q;
        AbstractC19074t.m100207e(simpleShadowTextView3, "blockedChannel");
        m54899gL(this, simpleShadowTextView3, AbstractC23322a.zds_ic_ban_line_24, false, 2, null);
        SimpleShadowTextView simpleShadowTextView4 = c25052s1.f120273q;
        AbstractC19074t.m100207e(simpleShadowTextView4, "blockedChannel");
        AbstractC26112n.m134407k0(simpleShadowTextView4, new C10432d());
        SimpleShadowTextView simpleShadowTextView5 = c25052s1.f120281y;
        AbstractC19074t.m100207e(simpleShadowTextView5, "likedVideo");
        m54899gL(this, simpleShadowTextView5, AbstractC23322a.zds_ic_heart_line_24, false, 2, null);
        SimpleShadowTextView simpleShadowTextView6 = c25052s1.f120281y;
        AbstractC19074t.m100207e(simpleShadowTextView6, "likedVideo");
        AbstractC26112n.m134407k0(simpleShadowTextView6, new C10433e());
        SimpleShadowTextView simpleShadowTextView7 = c25052s1.f120275s;
        AbstractC19074t.m100207e(simpleShadowTextView7, "bookmarkVideo");
        m54899gL(this, simpleShadowTextView7, AbstractC23322a.zds_ic_bookmark_line_24, false, 2, null);
        SimpleShadowTextView simpleShadowTextView8 = c25052s1.f120275s;
        AbstractC19074t.m100207e(simpleShadowTextView8, "bookmarkVideo");
        AbstractC26112n.m134407k0(simpleShadowTextView8, new C10434f());
        SimpleShadowTextView simpleShadowTextView9 = c25052s1.f120277u;
        AbstractC19074t.m100207e(simpleShadowTextView9, "channelNotif");
        AbstractC26112n.m134407k0(simpleShadowTextView9, new C10435g());
        SimpleShadowTextView simpleShadowTextView10 = c25052s1.f120271I;
        AbstractC19074t.m100207e(simpleShadowTextView10, "userNotif");
        AbstractC26112n.m134407k0(simpleShadowTextView10, new C10436h());
        m54897eL().m123540b0();
        return mo37483GJ;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        NotificationReceiver notificationReceiver = this.f53264E0;
        if (notificationReceiver != null) {
            notificationReceiver.mo53687g();
        }
        ChannelReceiver channelReceiver = this.f53263D0;
        if (channelReceiver != null) {
            channelReceiver.mo53687g();
        }
        super.mo37484JJ();
    }

    @Override // k20.C21456b.c
    /* renamed from: Mr */
    public void mo53933Mr(InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "restoration");
        interfaceC18509p.mo240pC(SettingView.class, null);
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: TK */
    public int mo54293TK() {
        return AbstractC27410e.zch_layout_setting;
    }

    @Override // com.zing.zalo.shortvideo.p072ui.view.SimpleView
    /* renamed from: VK */
    public String mo54294VK() {
        String m92652XI = m92652XI(AbstractC27413h.zch_page_setting_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        return m92652XI;
    }

    @Override // k20.C21456b.c
    /* renamed from: oH */
    public void mo53935oH(C21456b.b bVar) {
        C21456b.c.a.m111025b(this, bVar);
    }

    @Override // k20.C21456b.c
    /* renamed from: pt */
    public void mo53936pt(C21456b.b bVar) {
        C21456b.c.a.m111024a(this, bVar);
    }
}
