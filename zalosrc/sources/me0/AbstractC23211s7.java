package me0;

import am.C0943w;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.chat.picker.file.FileSelectView;
import com.zing.zalo.p077ui.chat.transfer.ChatOpenParam;
import com.zing.zalo.p077ui.group.leavegroup.LeaveGroupConfirmView;
import com.zing.zalo.p077ui.picker.gallerypicker.GalleryPickerView;
import com.zing.zalo.p077ui.zalocloud.migration.ZCloudDriveLoginBottomSheet;
import com.zing.zalo.p077ui.zviews.GroupBoardView;
import com.zing.zalo.p077ui.zviews.GroupPollVotingView;
import com.zing.zalo.p077ui.zviews.GroupSelectNewOwnerView;
import com.zing.zalo.p077ui.zviews.JoinGroupView;
import com.zing.zalo.p077ui.zviews.RequestFullScreenIntentPermissionView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import m90.EnumC22962a;
import mm0.AbstractC23350e;
import p161fg.C18922m;
import p172fy.C19171b;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p510sq.C26365a;
import p542ub.InterfaceC27218a;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C32002l4;
import th.AbstractC26681b;
import v50.C27870vb;
import vg.C28203u6;

/* renamed from: me0.s7 */
/* loaded from: classes4.dex */
public abstract class AbstractC23211s7 {
    /* renamed from: A */
    public static void m119561A(String str, C32002l4 c32002l4, C17487o0 c17487o0) {
        try {
            if (!TextUtils.isEmpty(str) && !str.equals("-1") && c17487o0 != null) {
                new C19171b().m101508a(new C19171b.a(c17487o0.m93021N0(), new C26365a.b(str, c32002l4).m135743b(), 0, 1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    public static void m119562B(String str, C17487o0 c17487o0, String str2, C32002l4 c32002l4) {
        TrackingSource trackingSource;
        C31973j5 m4472f = C0943w.m4462l().m4472f(str2);
        if (m4472f != null) {
            trackingSource = new TrackingSource(21);
            trackingSource.m40677a("groupVisibility", Integer.valueOf(m4472f.m153740S()));
            trackingSource.m40678b("nameHolder", m4472f.m153793y());
        } else {
            trackingSource = new TrackingSource(-1);
        }
        m119563C(str, c17487o0, c32002l4, trackingSource);
    }

    /* renamed from: C */
    public static void m119563C(String str, C17487o0 c17487o0, C32002l4 c32002l4, TrackingSource trackingSource) {
        try {
            if (!TextUtils.isEmpty(str) && c17487o0 != null) {
                if (!str.equals(AbstractC23304d.f113368c0.f42434r)) {
                    if (trackingSource == null) {
                        trackingSource = new TrackingSource(-1);
                    }
                    C21927m.m114302u().m114330e0(str, trackingSource);
                }
                new C19171b().m101508a(new C19171b.a(c17487o0.m93021N0(), new C26365a.b(str, c32002l4).m135743b(), 0, 1));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public static void m119564D(String str, InterfaceC27218a interfaceC27218a, int i11) {
        int i12;
        C31973j5 m4472f = C0943w.m4462l().m4472f(str);
        if (m4472f != null && m4472f.m153747Y()) {
            i12 = AbstractC8020f0.str_select_new_community_owner;
        } else {
            i12 = AbstractC8020f0.str_select_new_group_owner;
        }
        Bundle m80656XN = GroupSelectNewOwnerView.m80656XN(AbstractC23136l9.m118743r0(i12));
        m80656XN.putString("extra_group_id", str);
        if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
            interfaceC27218a.mo35579p().m93066i2(GroupSelectNewOwnerView.class, m80656XN, i11, 1, true);
        }
    }

    /* renamed from: E */
    public static void m119565E(InterfaceC27218a interfaceC27218a, boolean z11, String str) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_MISSED_CALL_UI", z11);
        bundle.putString("EXTRA_CALLER_ID", str);
        if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
            interfaceC27218a.mo35579p().m93066i2(RequestFullScreenIntentPermissionView.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: F */
    public static void m119566F(InterfaceC27218a interfaceC27218a, TargetBackupInfo targetBackupInfo, int i11) {
        m119567G(interfaceC27218a, targetBackupInfo, i11, false);
    }

    /* renamed from: G */
    public static void m119567G(InterfaceC27218a interfaceC27218a, TargetBackupInfo targetBackupInfo, int i11, boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        bundle.putParcelable("extra_target_backup_info", targetBackupInfo);
        bundle.putInt("JobId", i11);
        bundle.putBoolean("KEY_FROM_CLOUD_MEDIA_HOME", z11);
        if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
            interfaceC27218a.mo35579p().m93066i2(ZCloudDriveLoginBottomSheet.class, bundle, 0, 2, true);
        }
    }

    /* renamed from: c */
    public static boolean m119570c(InterfaceC27218a interfaceC27218a) {
        ComponentName componentName;
        ComponentName componentName2;
        if (Build.VERSION.SDK_INT >= 29) {
            PackageManager packageManager = MainApplication.getAppContext().getPackageManager();
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(packageManager, 0);
            if (resolveActivityInfo != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : ((ActivityManager) interfaceC27218a.getContext().getSystemService("activity")).getRunningTasks(1)) {
                    componentName = runningTaskInfo.topActivity;
                    if (componentName != null) {
                        componentName2 = runningTaskInfo.topActivity;
                        if (componentName2.getClassName().equals(resolveActivityInfo.name)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return interfaceC27218a.mo35579p().m93029Q(FileSelectView.class);
    }

    /* renamed from: d */
    public static void m119571d(String str, InterfaceC27218a interfaceC27218a, ChatOpenParam chatOpenParam) {
        if (str != null) {
            try {
                if (str.length() > 0 && !str.equalsIgnoreCase("null")) {
                    ContactProfile m141809c = C28203u6.f131407a.m141809c(str);
                    ContactProfile contactProfile = new ContactProfile(str);
                    if (m141809c != null) {
                        contactProfile.f42437s = m141809c.f42437s;
                        contactProfile.f42446v = m141809c.f42446v;
                        contactProfile.f42458z = m141809c.f42458z;
                        contactProfile.f42352K0 = m141809c.f42352K0;
                    }
                    Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
                    if (chatOpenParam != null) {
                        if (chatOpenParam.m65289a() != null) {
                            m140776b.putParcelable("STR_EXTRA_JUMP_TO_MESSAGE_ID", chatOpenParam.m65289a());
                        }
                        if (chatOpenParam.m65290b() != null) {
                            m140776b.putParcelable("extra_chat_last_chat_window_reference", chatOpenParam.m65290b());
                        }
                        if (chatOpenParam.m65293e() != null && !chatOpenParam.m65293e().isEmpty()) {
                            m140776b.putString("STR_SOURCE_START_VIEW", chatOpenParam.m65293e());
                        }
                    }
                    m119583p(interfaceC27218a, m140776b, contactProfile);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: e */
    public static void m119572e(String str, InterfaceC27218a interfaceC27218a, String str2) {
        m119571d(str, interfaceC27218a, new ChatOpenParam(false, null, null, str2, ""));
    }

    /* renamed from: f */
    public static void m119573f(String str, InterfaceC27218a interfaceC27218a, MessageId messageId) {
        m119571d(str, interfaceC27218a, new ChatOpenParam(false, messageId, null, "", ""));
    }

    /* renamed from: g */
    public static void m119574g(String str, InterfaceC27218a interfaceC27218a, ChatOpenParam chatOpenParam) {
        m119576i(C0943w.m4462l().m4472f(str), interfaceC27218a, chatOpenParam);
    }

    /* renamed from: h */
    public static void m119575h(String str, InterfaceC27218a interfaceC27218a, boolean z11) {
        m119574g(str, interfaceC27218a, new ChatOpenParam(z11, null, null, "", ""));
    }

    /* renamed from: i */
    public static void m119576i(C31973j5 c31973j5, InterfaceC27218a interfaceC27218a, ChatOpenParam chatOpenParam) {
        if (interfaceC27218a == null) {
            return;
        }
        try {
            if (c31973j5 == null) {
                ToastUtils.m89266n(AbstractC8020f0.str_group_information_not_found, new Object[0]);
                return;
            }
            ContactProfile contactProfile = new ContactProfile();
            contactProfile.f42434r = "group_" + c31973j5.m153781r();
            contactProfile.f42437s = c31973j5.m153793y();
            contactProfile.f42446v = c31973j5.m153756e();
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            m140776b.putString("groupId", c31973j5.m153781r());
            m140776b.putString("groupName", c31973j5.m153793y());
            if (chatOpenParam != null) {
                if (chatOpenParam.m65292d()) {
                    m140776b.putInt("SHOW_WITH_FLAGS", 7340032);
                }
                if (chatOpenParam.m65289a() != null) {
                    m140776b.putParcelable("STR_EXTRA_JUMP_TO_MESSAGE_ID", chatOpenParam.m65289a());
                }
                if (chatOpenParam.m65290b() != null) {
                    m140776b.putParcelable("extra_chat_last_chat_window_reference", chatOpenParam.m65290b());
                }
                if (!TextUtils.isEmpty(chatOpenParam.m65291c())) {
                    m140776b.putString("EXTRA_CSC_OPENING_SOURCE", C31944h6.m153555v(chatOpenParam.m65291c()));
                }
            }
            m119583p(interfaceC27218a, m140776b, contactProfile);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    public static void m119577j(C31973j5 c31973j5, InterfaceC27218a interfaceC27218a, boolean z11) {
        m119578k(c31973j5, interfaceC27218a, z11, "");
    }

    /* renamed from: k */
    public static void m119578k(C31973j5 c31973j5, InterfaceC27218a interfaceC27218a, boolean z11, String str) {
        m119576i(c31973j5, interfaceC27218a, new ChatOpenParam(z11, null, null, "", str));
    }

    /* renamed from: l */
    public static void m119579l(String str, InterfaceC27218a interfaceC27218a, boolean z11, MessageId messageId) {
        m119574g(str, interfaceC27218a, new ChatOpenParam(z11, messageId, null, "", ""));
    }

    /* renamed from: m */
    public static /* synthetic */ void m119580m(InterfaceC27218a interfaceC27218a, Bundle bundle, Conversation conversation, int i11, int i12) {
        try {
            if (AbstractC26681b.f126356a && interfaceC27218a.mo35576n3()) {
                C18922m.m99141t().m99149S(bundle, conversation);
            } else {
                interfaceC27218a.mo35579p().m93066i2(ChatView.class, bundle, i11, i12, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m119581n(ZaloView zaloView, InterfaceC27218a interfaceC27218a) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (zaloView == null) {
                    return;
                }
                PackageManager packageManager = MainApplication.getAppContext().getPackageManager();
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                if (intent.resolveActivityInfo(packageManager, 0) != null) {
                    zaloView.startActivityForResult(intent, 1);
                } else {
                    ToastUtils.showMess(interfaceC27218a.getResources().getString(AbstractC8020f0.unknown_error));
                }
            } else {
                interfaceC27218a.mo35579p().m93066i2(FileSelectView.class, new Bundle(), 1, 1, true);
            }
        } catch (ActivityNotFoundException unused) {
            ToastUtils.showMess(interfaceC27218a.getResources().getString(AbstractC8020f0.unknown_error));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: o */
    public static void m119582o(String str, InterfaceC27218a interfaceC27218a, int i11, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", str);
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        bundle.putString("STR_EXTRA_SILENTLY_LEAVE_GROUP_SOURCE", str2);
        if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
            interfaceC27218a.mo35579p().m93066i2(LeaveGroupConfirmView.class, bundle, i11, 2, true);
        }
    }

    /* renamed from: p */
    public static void m119583p(InterfaceC27218a interfaceC27218a, Bundle bundle, ContactProfile contactProfile) {
        m119585r(interfaceC27218a, bundle, new Conversation(contactProfile), 0, 1);
    }

    /* renamed from: q */
    public static void m119584q(InterfaceC27218a interfaceC27218a, Bundle bundle, Conversation conversation) {
        m119585r(interfaceC27218a, bundle, conversation, 0, 1);
    }

    /* renamed from: r */
    public static void m119585r(InterfaceC27218a interfaceC27218a, Bundle bundle, Conversation conversation, int i11, int i12) {
        AbstractC19444a.m101697e(new Runnable() { // from class: me0.r7

            /* renamed from: q */
            public final /* synthetic */ Bundle f112461q;

            /* renamed from: r */
            public final /* synthetic */ Conversation f112462r;

            /* renamed from: s */
            public final /* synthetic */ int f112463s;

            /* renamed from: t */
            public final /* synthetic */ int f112464t;

            public /* synthetic */ RunnableC23200r7(Bundle bundle2, Conversation conversation2, int i112, int i122) {
                r2 = bundle2;
                r3 = conversation2;
                r4 = i112;
                r5 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23211s7.m119580m(InterfaceC27218a.this, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: s */
    public static void m119586s(InterfaceC27218a interfaceC27218a, ZaloView zaloView) {
        if (interfaceC27218a == null) {
            return;
        }
        interfaceC27218a.runOnUiThread(new Runnable() { // from class: me0.q7

            /* renamed from: q */
            public final /* synthetic */ InterfaceC27218a f112428q;

            public /* synthetic */ RunnableC23189q7(InterfaceC27218a interfaceC27218a2) {
                r2 = interfaceC27218a2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23211s7.m119581n(ZaloView.this, r2);
            }
        });
    }

    /* renamed from: t */
    public static void m119587t(InterfaceC27218a interfaceC27218a, int i11, int i12) {
        m119588u(interfaceC27218a, i11, i12, true);
    }

    /* renamed from: u */
    public static void m119588u(InterfaceC27218a interfaceC27218a, int i11, int i12, boolean z11) {
        m119589v(interfaceC27218a, i11, i12, z11, null);
    }

    /* renamed from: v */
    public static void m119589v(InterfaceC27218a interfaceC27218a, int i11, int i12, boolean z11, Bundle bundle) {
        try {
            if (AbstractC23238v2.m119727l()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle bundle2 = bundle;
                bundle2.putInt("extra_photo_type", i12);
                if (i12 == 17) {
                    bundle2.putSerializable("extra_media_picker_source", EnumC22962a.f111693q);
                }
                if (interfaceC27218a != null) {
                    interfaceC27218a.mo35579p().m93066i2(GalleryPickerView.class, bundle2, i11, z11 ? 1 : 0, true);
                    return;
                }
                return;
            }
            ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: w */
    public static void m119590w(InterfaceC27218a interfaceC27218a, int i11, Bundle bundle) {
        try {
            if (AbstractC23238v2.m119727l()) {
                if (interfaceC27218a != null) {
                    interfaceC27218a.mo35579p().m93066i2(GalleryPickerView.class, bundle, i11, 1, true);
                }
            } else {
                ToastUtils.m89266n(AbstractC8020f0.error_sdcard, new Object[0]);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: x */
    public static void m119591x(String str, InterfaceC27218a interfaceC27218a, boolean z11) {
        C31973j5 m4472f = C0943w.m4462l().m4472f(str);
        if (m4472f == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", m4472f.m153781r());
        bundle.putBoolean("BOL_EXTRA_FROM_GLOBAL", z11);
        if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
            interfaceC27218a.mo35579p().m93069k2(GroupBoardView.class, bundle, 1, true);
        }
    }

    /* renamed from: y */
    public static void m119592y(String str, String str2, InterfaceC27218a interfaceC27218a, boolean z11, boolean z12) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_poll_id", str);
        bundle.putString("extra_group_id", str2);
        bundle.putBoolean("extra_shortcut_groupboard", z11);
        bundle.putBoolean("extra_show_vote_detail", z12);
        if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
            interfaceC27218a.mo35579p().m93069k2(GroupPollVotingView.class, bundle, 1, true);
        }
    }

    /* renamed from: z */
    public static void m119593z(InterfaceC27218a interfaceC27218a, C31973j5 c31973j5, int i11, int i12, String str) {
        if (c31973j5 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", c31973j5.m153781r());
        bundle.putString("STR_EXTRA_GROUP_NAME", c31973j5.m153793y());
        bundle.putString("EXTRA_QUESTION", c31973j5.m153785t());
        bundle.putInt("EXTRA_POOL_TYPE", c31973j5.m153711D());
        bundle.putInt("INT_EXTRA_JOIN_SOURCE", i11);
        bundle.putString("STR_EXTRA_GROUP_LINK_URL", str);
        bundle.putBoolean("EXTRA_IS_COMMUNITY", c31973j5.m153747Y());
        if (interfaceC27218a != null && interfaceC27218a.mo35579p() != null) {
            interfaceC27218a.mo35579p().m93066i2(JoinGroupView.class, bundle, i12, 1, true);
        }
    }
}
