package com.zing.zalo.feed.mvp.notificationsetting.view;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.NotificationBasicInfo;
import com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import is.AbstractC20833z;
import java.util.Arrays;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p205hc.C19964c;
import p262jb.AbstractC21196a;
import p509sp.C26359h;
import p649xl.C29729b9;
import p716zh.C32002l4;
import p724zp.C32541a;
import pm0.C24848g0;
import pm0.InterfaceC24847g;

/* loaded from: classes4.dex */
public final class SettingFeedNotificationBottomSheet extends BottomSheetZaloViewWithAnim {
    public static final C8615a Companion = new C8615a(null);

    /* renamed from: W0 */
    private C29729b9 f46390W0;

    /* renamed from: X0 */
    private C32541a f46391X0;

    /* renamed from: Y0 */
    private SettingItemLayout f46392Y0;

    /* renamed from: Z0 */
    private SettingItemLayout f46393Z0;

    /* renamed from: a1 */
    private SettingItemLayout f46394a1;

    /* renamed from: b1 */
    private C32002l4 f46395b1 = C32002l4.Companion.m154287a(10028);

    /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$a */
    /* loaded from: classes4.dex */
    public static final class C8615a {
        private C8615a() {
        }

        public /* synthetic */ C8615a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$b */
    /* loaded from: classes4.dex */
    public static final class C8616b {

        /* renamed from: a */
        private final int f46398a;

        /* renamed from: b */
        private final CharSequence f46399b;

        public C8616b(int i11, CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "title");
            this.f46398a = i11;
            this.f46399b = charSequence;
        }

        /* renamed from: a */
        public final int m45861a() {
            return this.f46398a;
        }

        /* renamed from: b */
        public final CharSequence m45862b() {
            return this.f46399b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8616b)) {
                return false;
            }
            C8616b c8616b = (C8616b) obj;
            return this.f46398a == c8616b.f46398a && AbstractC19074t.m100204b(this.f46399b, c8616b.f46399b);
        }

        public int hashCode() {
            return (this.f46398a * 31) + this.f46399b.hashCode();
        }

        public String toString() {
            return "SettingItem(iconRes=" + this.f46398a + ", title=" + ((Object) this.f46399b) + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$c */
    /* loaded from: classes4.dex */
    public static final class C8617c extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C32541a.d f46401q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C32541a.d dVar) {
                super(0);
                this.f46401q = dVar;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Receive finish state: " + this.f46401q.m157551a();
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$c$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f46402a;

            static {
                int[] iArr = new int[C32541a.b.values().length];
                try {
                    iArr[C32541a.b.f150325q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C32541a.b.f150326r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[C32541a.b.f150329u.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[C32541a.b.f150328t.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f46402a = iArr;
            }
        }

        C8617c() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m45863a(C19964c c19964c) {
            int i11;
            ZaloView m92650VI;
            C32541a.d dVar = (C32541a.d) c19964c.m103749a();
            if (dVar != null) {
                SettingFeedNotificationBottomSheet settingFeedNotificationBottomSheet = SettingFeedNotificationBottomSheet.this;
                Intent intent = new Intent();
                int i12 = b.f46402a[dVar.m157551a().ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                i11 = 0;
                                intent.putExtra("setting_notification_result", dVar.m157551a());
                                m92650VI = settingFeedNotificationBottomSheet.m92650VI();
                                if (m92650VI != null) {
                                    m92650VI.mo50035CK(i11, intent);
                                }
                                settingFeedNotificationBottomSheet.close();
                                C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_SETTING_NOTIFICATION_BOTTOM_SHEET", new a(dVar));
                            }
                        } else {
                            intent.putExtra("user_id", dVar.m157552b().m40641e());
                        }
                    } else {
                        intent.putExtra("feed_id", dVar.m157552b().m40639c());
                    }
                } else {
                    intent.putExtra("notification_id", dVar.m157552b().m40640d());
                }
                i11 = -1;
                intent.putExtra("setting_notification_result", dVar.m157551a());
                m92650VI = settingFeedNotificationBottomSheet.m92650VI();
                if (m92650VI != null) {
                }
                settingFeedNotificationBottomSheet.close();
                C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_SETTING_NOTIFICATION_BOTTOM_SHEET", new a(dVar));
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45863a((C19964c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$d */
    /* loaded from: classes4.dex */
    public static final class C8618d extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ C32541a.c f46404q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C32541a.c cVar) {
                super(0);
                this.f46404q = cVar;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Receive layout state: " + this.f46404q;
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$d$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f46405a;

            static {
                int[] iArr = new int[C32541a.c.values().length];
                try {
                    iArr[C32541a.c.f150333p.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[C32541a.c.f150334q.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f46405a = iArr;
            }
        }

        C8618d() {
            super(1);
        }

        /* renamed from: a */
        public final void m45865a(C32541a.c cVar) {
            int i11;
            if (cVar == null) {
                i11 = -1;
            } else {
                i11 = b.f46405a[cVar.ordinal()];
            }
            if (i11 == 1) {
                SettingFeedNotificationBottomSheet.this.m45846FM();
            } else if (i11 != 2) {
                SettingFeedNotificationBottomSheet.this.m45844DM();
            } else {
                SettingFeedNotificationBottomSheet.this.m45845EM();
            }
            C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_SETTING_NOTIFICATION_BOTTOM_SHEET", new a(cVar));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45865a((C32541a.c) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$e */
    /* loaded from: classes4.dex */
    public static final class C8619e extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Boolean f46407q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Boolean bool) {
                super(0);
                this.f46407q = bool;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "Receive loading state: " + this.f46407q;
            }
        }

        C8619e() {
            super(1);
        }

        /* renamed from: a */
        public final void m45867a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                SettingFeedNotificationBottomSheet.this.mo46829Y();
            } else {
                SettingFeedNotificationBottomSheet.this.mo49315c4();
            }
            C26359h.f125209a.mo135685a("SETTING_INLINE", "VIEW_SETTING_NOTIFICATION_BOTTOM_SHEET", new a(bool));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m45867a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.mvp.notificationsetting.view.SettingFeedNotificationBottomSheet$f */
    /* loaded from: classes4.dex */
    public static final class C8620f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f46408p;

        C8620f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f46408p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f46408p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f46408p.mo205i9(obj);
        }
    }

    /* renamed from: AM */
    private final void m45841AM() {
        C32541a c32541a = this.f46391X0;
        if (c32541a == null) {
            AbstractC19074t.m100223u("viewModel");
            c32541a = null;
        }
        c32541a.m157539Y().m9219j(this, new C8620f(new C8618d()));
    }

    /* renamed from: BM */
    private final void m45842BM() {
        C32541a c32541a = this.f46391X0;
        if (c32541a == null) {
            AbstractC19074t.m100223u("viewModel");
            c32541a = null;
        }
        c32541a.m157542b0().m9219j(this, new C8620f(new C8619e()));
    }

    /* renamed from: CM */
    private final void m45843CM(NotificationBasicInfo notificationBasicInfo) {
        Spanned fromHtml;
        if (notificationBasicInfo.m40641e().length() > 0) {
            String m108910o = AbstractC20833z.m108910o(notificationBasicInfo.m40641e());
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_feed_notification_stop_receive_notification_new_feed);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{m108910o}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml(format, 63);
            } else {
                fromHtml = Html.fromHtml(format);
            }
            SettingItemLayout settingItemLayout = this.f46393Z0;
            if (settingItemLayout == null) {
                AbstractC19074t.m100223u("unfollowUserNotificationItem");
                settingItemLayout = null;
            }
            int i11 = AbstractC16803z.ic_feed_noti_off;
            AbstractC19074t.m100205c(fromHtml);
            settingItemLayout.setData(new C8616b(i11, fromHtml));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final void m45844DM() {
        C29729b9 c29729b9 = this.f46390W0;
        SettingItemLayout settingItemLayout = null;
        if (c29729b9 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b9 = null;
        }
        LinearLayout linearLayout = c29729b9.f137329q;
        SettingItemLayout settingItemLayout2 = this.f46392Y0;
        if (settingItemLayout2 == null) {
            AbstractC19074t.m100223u("deleteNotificationItem");
        } else {
            settingItemLayout = settingItemLayout2;
        }
        linearLayout.addView(settingItemLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m45845EM() {
        C29729b9 c29729b9 = this.f46390W0;
        SettingItemLayout settingItemLayout = null;
        if (c29729b9 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b9 = null;
        }
        LinearLayout linearLayout = c29729b9.f137329q;
        SettingItemLayout settingItemLayout2 = this.f46392Y0;
        if (settingItemLayout2 == null) {
            AbstractC19074t.m100223u("deleteNotificationItem");
            settingItemLayout2 = null;
        }
        linearLayout.addView(settingItemLayout2);
        C29729b9 c29729b92 = this.f46390W0;
        if (c29729b92 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b92 = null;
        }
        c29729b92.f137329q.addView(m45853sM());
        C29729b9 c29729b93 = this.f46390W0;
        if (c29729b93 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b93 = null;
        }
        LinearLayout linearLayout2 = c29729b93.f137329q;
        SettingItemLayout settingItemLayout3 = this.f46394a1;
        if (settingItemLayout3 == null) {
            AbstractC19074t.m100223u("blockFeedNotificationItem");
        } else {
            settingItemLayout = settingItemLayout3;
        }
        linearLayout2.addView(settingItemLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final void m45846FM() {
        C29729b9 c29729b9 = this.f46390W0;
        SettingItemLayout settingItemLayout = null;
        if (c29729b9 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b9 = null;
        }
        LinearLayout linearLayout = c29729b9.f137329q;
        SettingItemLayout settingItemLayout2 = this.f46392Y0;
        if (settingItemLayout2 == null) {
            AbstractC19074t.m100223u("deleteNotificationItem");
            settingItemLayout2 = null;
        }
        linearLayout.addView(settingItemLayout2);
        C29729b9 c29729b92 = this.f46390W0;
        if (c29729b92 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b92 = null;
        }
        c29729b92.f137329q.addView(m45853sM());
        C29729b9 c29729b93 = this.f46390W0;
        if (c29729b93 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b93 = null;
        }
        LinearLayout linearLayout2 = c29729b93.f137329q;
        SettingItemLayout settingItemLayout3 = this.f46393Z0;
        if (settingItemLayout3 == null) {
            AbstractC19074t.m100223u("unfollowUserNotificationItem");
        } else {
            settingItemLayout = settingItemLayout3;
        }
        linearLayout2.addView(settingItemLayout);
    }

    /* renamed from: sM */
    private final View m45853sM() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC23136l9.m118742r(0.5f));
        layoutParams.leftMargin = AbstractC23136l9.m118742r(60.0f);
        layoutParams.rightMargin = AbstractC23136l9.m118742r(16.0f);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
        return view;
    }

    /* renamed from: tM */
    private final void m45854tM() {
        this.f46391X0 = (C32541a) new C1802w0(this, new C32541a.a(null, null, null, null, null, null, null, null, 255, null)).m9378a(C32541a.class);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            Object obj = m92642L3.get("notification_item");
            C32541a c32541a = null;
            if (obj instanceof NotificationBasicInfo) {
                C32541a c32541a2 = this.f46391X0;
                if (c32541a2 == null) {
                    AbstractC19074t.m100223u("viewModel");
                    c32541a2 = null;
                }
                NotificationBasicInfo notificationBasicInfo = (NotificationBasicInfo) obj;
                c32541a2.m157548n0(notificationBasicInfo);
                m45843CM(notificationBasicInfo);
            }
            if (m92642L3.containsKey("extra_entry_point_flow")) {
                this.f46395b1.m154273c(C32002l4.Companion.m154292f(m92642L3.getString("extra_entry_point_flow")));
                C32541a c32541a3 = this.f46391X0;
                if (c32541a3 == null) {
                    AbstractC19074t.m100223u("viewModel");
                } else {
                    c32541a = c32541a3;
                }
                c32541a.m157538X(this.f46395b1);
            }
        }
    }

    /* renamed from: uM */
    private final void m45855uM() {
        Context context = getContext();
        if (context != null) {
            SettingItemLayout settingItemLayout = new SettingItemLayout(context);
            int i11 = AbstractC16803z.ic_feed_delete_line;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_feed_notification_delete_notification);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            settingItemLayout.setData(new C8616b(i11, m118743r0));
            settingItemLayout.setOnClickListener(new View.OnClickListener() { // from class: yp.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingFeedNotificationBottomSheet.m45856vM(SettingFeedNotificationBottomSheet.this, view);
                }
            });
            this.f46392Y0 = settingItemLayout;
            SettingItemLayout settingItemLayout2 = new SettingItemLayout(context);
            settingItemLayout2.setOnClickListener(new View.OnClickListener() { // from class: yp.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingFeedNotificationBottomSheet.m45857wM(SettingFeedNotificationBottomSheet.this, view);
                }
            });
            this.f46393Z0 = settingItemLayout2;
            SettingItemLayout settingItemLayout3 = new SettingItemLayout(context);
            int i12 = AbstractC16803z.ic_feed_noti_off;
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_notification_turn_off_feed_notification);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            settingItemLayout3.setData(new C8616b(i12, m118743r02));
            settingItemLayout3.setOnClickListener(new View.OnClickListener() { // from class: yp.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingFeedNotificationBottomSheet.m45858xM(SettingFeedNotificationBottomSheet.this, view);
                }
            });
            this.f46394a1 = settingItemLayout3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m45856vM(SettingFeedNotificationBottomSheet settingFeedNotificationBottomSheet, View view) {
        AbstractC19074t.m100208f(settingFeedNotificationBottomSheet, "this$0");
        C32541a c32541a = settingFeedNotificationBottomSheet.f46391X0;
        if (c32541a == null) {
            AbstractC19074t.m100223u("viewModel");
            c32541a = null;
        }
        c32541a.m157543i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static final void m45857wM(SettingFeedNotificationBottomSheet settingFeedNotificationBottomSheet, View view) {
        AbstractC19074t.m100208f(settingFeedNotificationBottomSheet, "this$0");
        C32541a c32541a = settingFeedNotificationBottomSheet.f46391X0;
        if (c32541a == null) {
            AbstractC19074t.m100223u("viewModel");
            c32541a = null;
        }
        c32541a.m157546l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m45858xM(SettingFeedNotificationBottomSheet settingFeedNotificationBottomSheet, View view) {
        AbstractC19074t.m100208f(settingFeedNotificationBottomSheet, "this$0");
        C32541a c32541a = settingFeedNotificationBottomSheet.f46391X0;
        if (c32541a == null) {
            AbstractC19074t.m100223u("viewModel");
            c32541a = null;
        }
        c32541a.m157547m0();
    }

    /* renamed from: yM */
    private final void m45859yM() {
        m45841AM();
        m45842BM();
        m45860zM();
    }

    /* renamed from: zM */
    private final void m45860zM() {
        C32541a c32541a = this.f46391X0;
        if (c32541a == null) {
            AbstractC19074t.m100223u("viewModel");
            c32541a = null;
        }
        c32541a.m157540Z().m9219j(this, new C8620f(new C8617c()));
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29729b9 c29729b9 = this.f46390W0;
        if (c29729b9 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b9 = null;
        }
        LinearLayout linearLayout = c29729b9.f137329q;
        AbstractC19074t.m100207e(linearLayout, "mainView");
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: dM */
    public int mo37127dM() {
        return this.f72454M0.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        int measuredHeight = this.f72454M0.getMeasuredHeight();
        C29729b9 c29729b9 = this.f46390W0;
        if (c29729b9 == null) {
            AbstractC19074t.m100223u("binding");
            c29729b9 = null;
        }
        return measuredHeight - c29729b9.f137329q.getBottom();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29729b9 m147771c = C29729b9.m147771c(LayoutInflater.from(getContext()), this.f72454M0, true);
        AbstractC19074t.m100207e(m147771c, "inflate(...)");
        this.f46390W0 = m147771c;
        m45855uM();
        m45854tM();
        m45859yM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        this.f72454M0.setMaxTranslationY(mo37128eM());
        this.f72454M0.setMinTranslationY(mo37128eM());
        this.f72454M0.setEnableScrollY(true);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingFeedNotificationBottomSheet";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        if (this.f72454M0.getTranslationY() != mo37128eM()) {
            this.f72454M0.setViewTranslationY(mo37128eM());
        }
    }

    /* loaded from: classes4.dex */
    public static final class SettingItemLayout extends RelativeLayout {

        /* renamed from: p */
        private final AspectRatioImageView f46396p;

        /* renamed from: q */
        private final RobotoTextView f46397q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingItemLayout(Context context) {
            super(context);
            AbstractC19074t.m100208f(context, "context");
            AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(getContext());
            this.f46396p = aspectRatioImageView;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context2);
            this.f46397q = robotoTextView;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setPadding(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(16.0f));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            aspectRatioImageView.setLayoutParams(layoutParams);
            aspectRatioImageView.setId(View.generateViewId());
            aspectRatioImageView.setScaleOption(3);
            addView(aspectRatioImageView);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, aspectRatioImageView.getId());
            layoutParams2.addRule(15);
            layoutParams2.leftMargin = AbstractC23136l9.m118742r(20.0f);
            robotoTextView.setId(View.generateViewId());
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setMaxLines(2);
            robotoTextView.setLayoutParams(layoutParams2);
            addView(robotoTextView);
        }

        public final AspectRatioImageView getIcon() {
            return this.f46396p;
        }

        public final RobotoTextView getTitle() {
            return this.f46397q;
        }

        public final void setData(C8616b c8616b) {
            AbstractC19074t.m100208f(c8616b, "settingItem");
            this.f46396p.setImageResource(c8616b.m45861a());
            this.f46397q.setText(c8616b.m45862b());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingItemLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(attributeSet, "attrs");
            AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(getContext());
            this.f46396p = aspectRatioImageView;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context2);
            this.f46397q = robotoTextView;
            setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            setPadding(AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(20.0f), AbstractC23136l9.m118742r(16.0f));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(20.0f), -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            aspectRatioImageView.setLayoutParams(layoutParams);
            aspectRatioImageView.setId(View.generateViewId());
            aspectRatioImageView.setScaleOption(3);
            addView(aspectRatioImageView);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(1, aspectRatioImageView.getId());
            layoutParams2.addRule(15);
            layoutParams2.leftMargin = AbstractC23136l9.m118742r(20.0f);
            robotoTextView.setId(View.generateViewId());
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setMaxLines(2);
            robotoTextView.setLayoutParams(layoutParams2);
            addView(robotoTextView);
        }
    }
}
