package com.zing.zalo.utils;

import android.R;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import gg0.AbstractC19444a;
import gw.C19637j;
import hm0.AbstractC20095b;
import hm0.C20096c;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import me0.AbstractC23136l9;
import me0.AbstractC23161o1;
import me0.AbstractC23258x2;
import mj0.AbstractC23322a;
import mm0.AbstractC23349d;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p161fg.C18922m;
import p161fg.C18926q;
import th.AbstractC26681b;
import ui0.C27280g;
import vl0.AbstractC28291a;

@Keep
/* loaded from: classes.dex */
public class ToastUtils {

    /* renamed from: a */
    static long f84851a = 0;

    /* renamed from: b */
    static boolean f84852b = false;

    /* renamed from: c */
    private static WeakReference f84853c;

    /* renamed from: com.zing.zalo.utils.ToastUtils$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C16737a {

        /* renamed from: a */
        static final /* synthetic */ int[] f84854a;

        static {
            int[] iArr = new int[EnumC16738b.values().length];
            f84854a = iArr;
            try {
                iArr[EnumC16738b.RESENT_OTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f84854a[EnumC16738b.DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.zing.zalo.utils.ToastUtils$b */
    /* loaded from: classes4.dex */
    public enum EnumC16738b {
        DISCONNECTED,
        RESENT_OTP
    }

    /* renamed from: c */
    public static /* synthetic */ void m89255c(int i11, CharSequence charSequence, int i12, boolean z11) {
        WeakReference weakReference;
        ZaloBubbleActivity m57028V4;
        String str;
        long j11;
        try {
            View inflate = LayoutInflater.from(MainApplication.getAppContext()).inflate(i11, (ViewGroup) null);
            ((TextView) inflate.findViewById(AbstractC6918a0.text)).setText(charSequence);
            if (AbstractC26681b.f126356a && C18922m.m99141t().m99163x()) {
                C18926q c18926q = new C18926q(MainApplication.getAppContext());
                c18926q.m99170c(inflate);
                c18926q.m99171d();
                return;
            }
            if (ZaloBubbleActivity.m57017B5() && (m57028V4 = ZaloBubbleActivity.m57028V4()) != null && !m57028V4.isFinishing() && !m57028V4.isDestroyed()) {
                AbstractC23350e.m122772b("Utils#ShowMessZalo " + m57028V4.isFinishing() + " " + m57028V4.isDestroyed(), new Object[0]);
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = "";
                }
                if (i12 == 1) {
                    j11 = 3500;
                } else {
                    j11 = 2500;
                }
                m57028V4.m57045H5(str, j11);
                return;
            }
            Context appContext = MainApplication.getAppContext();
            if (z11 && (weakReference = f84853c) != null && weakReference.get() != null) {
                ((Toast) f84853c.get()).cancel();
            }
            Toast toast = new Toast(appContext);
            f84853c = new WeakReference(toast);
            toast.setGravity(17, 0, 0);
            toast.setDuration(i12);
            toast.setView(inflate);
            toast.show();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m89257e(View view, int i11) {
        if (view == null) {
            return;
        }
        if (AbstractC26681b.f126356a && C18922m.m99141t().m99163x()) {
            C18926q c18926q = new C18926q(view.getContext());
            c18926q.m99170c(view);
            c18926q.m99168a(i11);
            c18926q.m99169b(0, AbstractC23136l9.m118737p0());
            c18926q.m99171d();
            return;
        }
        Toast toast = new Toast(view.getContext());
        toast.setGravity(i11, 0, 0);
        toast.setDuration(0);
        toast.setView(view);
        toast.show();
    }

    /* renamed from: f */
    public static void m89258f() {
        try {
            m89266n(AbstractC8020f0.ERROR_ERROR_BANNED, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m89259g(int i11) {
        try {
            if (i11 != -50) {
                if (i11 != 50001) {
                    if (i11 != -21) {
                        if (i11 != -20) {
                            switch (i11) {
                                case -44:
                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.BLOCK_REQUEST_FRIEND_GROUP_MSG), -44));
                                    break;
                                case -43:
                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.BLOCK_REQUEST_FRIEND_ECARD_MSG), -43));
                                    break;
                                case -42:
                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.BLOCK_REQUEST_FRIEND_QR_MSG), -42));
                                    break;
                                case -41:
                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.BLOCK_REQUEST_FRIEND_UNAME_MSG_NEW), -41));
                                    break;
                                case -40:
                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.BLOCK_REQUEST_FRIEND_PHONE_MSG_NEW), -40));
                                    break;
                                default:
                                    switch (i11) {
                                        case -35:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_NOT_EXIST_REQUEST_NEW), -35));
                                            break;
                                        case -34:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_EMPTY_REQUEST_DESC), -34));
                                            break;
                                        case -33:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_IS_REQUESTED), -33));
                                            break;
                                        case -32:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_LIMIT_REQUEST_NEW), -32));
                                            break;
                                        case -31:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_FULL_REQUESTED_NEW), -31));
                                            break;
                                        case -30:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_FULL_REQUESTING_NEW), -30));
                                            break;
                                        default:
                                            switch (i11) {
                                                case -6:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_FULL_FRIEND2_NEW), -6));
                                                    break;
                                                case -5:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_FULL_FRIEND), -5));
                                                    break;
                                                case -4:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_IS_FRIEND), -4));
                                                    break;
                                                case -3:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_BLOCKED), -3));
                                                    break;
                                                case -2:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_INVALID_USERID), -2));
                                                    break;
                                                case -1:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_INTERNAL_FAIL), -1));
                                                    break;
                                                default:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.error_message_with_code), Integer.valueOf(i11)));
                                                    break;
                                            }
                                    }
                            }
                        } else {
                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_EMPTY_DATA_SUBMIT), -20));
                        }
                    } else {
                        showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_INVALID_DATA_SUBMIT), -21));
                    }
                } else {
                    showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.NETWORK_ERROR_MSG));
                }
            } else {
                showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.BLOCK_REQUEST_FRIEND_DATA_MINING_SCR_NEW), Integer.valueOf(i11)));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m89260h(int i11, boolean z11) {
        int i12;
        try {
            if (i11 != 17029) {
                if (i11 != 17030) {
                    if (i11 != 17034) {
                        if (i11 != 18008) {
                            if (i11 != 50001) {
                                if (i11 != 50003) {
                                    switch (i11) {
                                        case 17001:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_INVALID_INPUT_DATA), 17001));
                                            return;
                                        case 17002:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_error_group_not_existed), 17002));
                                            return;
                                        case 17003:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_INVALID_GROUP_TYPE), 17003));
                                            return;
                                        case 17004:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_GENERATE_GROUP_ID), 17004));
                                            return;
                                        case 17005:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_NOT_BELONG_TO_GROUP), 17005));
                                            return;
                                        case 17006:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_GROUUP_DO_NOT_HAVE_MEMBER), 17006));
                                            return;
                                        case 17007:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_NOT_AUTHORIZED_ACTION), 17007));
                                            return;
                                        case 17008:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_LEAVE_GROUP), 17008));
                                            return;
                                        case 17009:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_UPDATE_GROUP_INFO), 17009));
                                            return;
                                        case 17010:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_CREATE_GROUP), 17010));
                                            return;
                                        case 17011:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_NOT_IN_INVITED_LIST), 17011));
                                            return;
                                        case 17012:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_SAME_GROUP_INFO_UPDATE), 17012));
                                            return;
                                        case 17013:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_error_group_full_members), new Object[0]));
                                            return;
                                        case 17014:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_ALL_INVITED_MEMBER_OVER_MAXIMUM_GROUP), 17014));
                                            return;
                                        case 17015:
                                            if (z11) {
                                                i12 = AbstractC8020f0.str_dialog_message_join_over_max_groups_join_community;
                                            } else {
                                                i12 = AbstractC8020f0.str_dialog_message_join_over_max_groups_join_group;
                                            }
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(i12), Integer.valueOf(C19637j.f97466a.m102831L())));
                                            return;
                                        case 17016:
                                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_ALL_MEMBERS_BLOCK_YOU), 17016));
                                            return;
                                        default:
                                            switch (i11) {
                                                case 17023:
                                                    showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_ADD_BLOCK_MEMBER_GROUP));
                                                    return;
                                                case 17024:
                                                    showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_REMOVE_BLOCK_MEMBER_GROUP));
                                                    return;
                                                case 17025:
                                                    showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_UPDATE_GROUP_SETTING));
                                                    return;
                                                case 17026:
                                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_error_cannot_add_admin_group), new Object[0]));
                                                    return;
                                                case 17027:
                                                    showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_REMOVE_ADMIN_GROUP));
                                                    return;
                                                default:
                                                    showMess(AbstractC23161o1.m119318c(i11, ""));
                                                    return;
                                            }
                                    }
                                }
                                showMess(AbstractC20095b.f98830b);
                                return;
                            }
                            showMess(AbstractC20095b.f98829a);
                            return;
                        }
                        showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_error_prohibited_send_ecard_invite), new Object[0]));
                        return;
                    }
                    m89266n(AbstractC8020f0.str_error_topic_is_deleted, new Object[0]);
                    return;
                }
                showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_CANNOT_JOIN_GROUP));
                return;
            }
            showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.str_error_assign_member_not_exist));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: i */
    public static void m89261i(C20096c c20096c, boolean z11) {
        if (c20096c != null) {
            try {
                int m104491c = c20096c.m104491c();
                int i11 = 100;
                try {
                    JSONObject jSONObject = new JSONObject(c20096c.m104490b());
                    if (jSONObject.has("maxUsers")) {
                        i11 = jSONObject.optInt("maxUsers");
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (m104491c != 17002 && m104491c != 17003 && m104491c != 17005 && m104491c != 17006 && m104491c != 17008 && m104491c != 17009) {
                    if (m104491c != 17017) {
                        if (m104491c != 17018) {
                            if (m104491c != 17026) {
                                if (m104491c != 17028) {
                                    if (m104491c != 17032) {
                                        if (m104491c != 18008) {
                                            switch (m104491c) {
                                                case 17013:
                                                case 17014:
                                                case 17015:
                                                    break;
                                                default:
                                                    m89260h(m104491c, z11);
                                                    return;
                                            }
                                        }
                                    } else {
                                        showMess(MainApplication.getAppContext().getString(AbstractC8020f0.str_already_send_request_join));
                                        return;
                                    }
                                } else {
                                    showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_OVER_NUMBER_INVITED_LIST_PER_USER_V2), Integer.valueOf(i11), 17028));
                                    return;
                                }
                            }
                        } else {
                            showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_OVER_NUMBER_OWNED_GROUP_PER_USER), Integer.valueOf(i11), 17018));
                            return;
                        }
                    } else {
                        showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.ERROR_OVER_NUMBER_INVITED_LIST_PER_USER), Integer.valueOf(i11), 17017));
                        return;
                    }
                }
                AbstractC23161o1.m119320e(c20096c, z11);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public static void m89262j() {
        try {
            m89266n(AbstractC8020f0.NETWORK_ERROR_MSG, new Object[0]);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static void m89263k(C20096c c20096c) {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (c20096c.m104491c() == 2030) {
                sb2.append(c20096c.m104492d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        showMess(AbstractC23161o1.m119318c(c20096c.m104491c(), sb2.toString()));
    }

    /* renamed from: l */
    public static void m89264l(C20096c c20096c) {
        try {
            int m104491c = c20096c.m104491c();
            if (m104491c != 5001 && m104491c != 50001) {
                switch (m104491c) {
                    case 17001:
                    case 17002:
                    case 17003:
                    case 17004:
                    case 17005:
                    case 17006:
                    case 17007:
                    case 17008:
                    case 17009:
                    case 17010:
                    case 17011:
                        break;
                    default:
                        showMess(String.format(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.error_message_with_code), Integer.valueOf(c20096c.m104491c())));
                        break;
                }
            }
            showMess(c20096c.m104492d());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m89265m(C20096c c20096c) {
        if (c20096c != null) {
            try {
                if (!TextUtils.isEmpty(c20096c.m104492d())) {
                    showMess(c20096c.m104492d());
                } else {
                    showMess(MainApplication.getAppContext().getResources().getString(AbstractC8020f0.error_message));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: n */
    public static void m89266n(int i11, Object... objArr) {
        try {
            showMess(MainApplication.getAppContext().getResources().getString(i11, objArr));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:            if (r0 != false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:            return;     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m89267o(boolean z11, CharSequence charSequence, boolean z12, boolean z13, boolean z14, int i11, int i12) {
        if (!z11) {
            try {
                if (SystemClock.elapsedRealtime() - f84851a <= 2000) {
                    if (!z14) {
                        if (!f84852b) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        if (charSequence != null && charSequence.equals("")) {
            return;
        }
        boolean z15 = true;
        if (CoreUtility.f89235k.get() && AbstractC23349d.m122768f() != 1 && (!AbstractC26681b.f126356a || !C18922m.m99141t().m99163x())) {
            z15 = false;
        }
        f84852b = z14;
        AbstractC19444a.m101695c(new Runnable() { // from class: me0.t8

            /* renamed from: p */
            public final /* synthetic */ int f112600p;

            /* renamed from: q */
            public final /* synthetic */ CharSequence f112601q;

            /* renamed from: r */
            public final /* synthetic */ int f112602r;

            /* renamed from: s */
            public final /* synthetic */ boolean f112603s;

            public /* synthetic */ RunnableC23223t8(int i122, CharSequence charSequence2, int i112, boolean z132) {
                r1 = i122;
                r2 = charSequence2;
                r3 = i112;
                r4 = z132;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ToastUtils.m89255c(r1, r2, r3, r4);
            }
        });
        f84851a = SystemClock.elapsedRealtime();
    }

    /* renamed from: p */
    public static void m89268p(String str) {
        showMess(true, str, false, true, 1, AbstractC7409c0.toast_layout);
    }

    /* renamed from: q */
    public static void m89269q(String str) {
    }

    /* renamed from: r */
    public static void m89270r(String str) {
        showMess(true, str, false, false, 1, AbstractC7409c0.toast_layout);
    }

    /* renamed from: s */
    public static void m89271s(String str, long j11) {
        if (j11 > 0) {
            AbstractC19444a.m101694b(new Runnable() { // from class: me0.u8

                /* renamed from: p */
                public final /* synthetic */ String f112618p;

                public /* synthetic */ RunnableC23234u8(String str2) {
                    r1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ToastUtils.m89270r(r1);
                }
            }, j11);
        } else {
            m89270r(str2);
        }
    }

    @Keep
    public static void showMess(String str) {
        showMess(false, str);
    }

    /* renamed from: t */
    public static void m89272t(String str) {
        m89267o(false, str, true, false, true, 1, AbstractC7409c0.toast_layout);
    }

    /* renamed from: u */
    public static void m89273u() {
        int i11;
        if (AbstractC23258x2.f112740a) {
            i11 = AbstractC8020f0.str_support_file_with_heic;
        } else {
            i11 = AbstractC8020f0.str_support_file_without_heic;
        }
        m89266n(i11, new Object[0]);
    }

    /* renamed from: v */
    public static void m89274v(ZaloView zaloView, EnumC16738b enumC16738b) {
        m89275w(zaloView, enumC16738b, null);
    }

    /* renamed from: w */
    public static void m89275w(ZaloView zaloView, EnumC16738b enumC16738b, String str) {
        Snackbar m90634w;
        Snackbar m90634w2;
        int i11 = C16737a.f84854a[enumC16738b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (str != null) {
                    m90634w2 = Snackbar.m90634w(zaloView.m92691vK(), AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error) + " (" + str + ")", -1);
                } else {
                    m90634w2 = Snackbar.m90634w(zaloView.m92691vK(), AbstractC23136l9.m118743r0(AbstractC8020f0.unknown_error), -1);
                }
                m90634w2.m90642H(3000);
                m90634w2.m90648N();
                return;
            }
            if (str != null) {
                m90634w = Snackbar.m90634w(zaloView.m92691vK(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_verification_code_network_error_message) + " (" + str + ")", -1);
            } else {
                m90634w = Snackbar.m90634w(zaloView.m92691vK(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_verification_code_network_error_message), -1);
            }
            m90634w.m90644J(C27280g.m139660c(zaloView.m92689tK(), AbstractC23322a.zds_ic_wifi_off_line_24, AbstractC28291a.snackbar_icon));
            m90634w.m90642H(3000);
            m90634w.m90648N();
            return;
        }
        Snackbar m90634w3 = Snackbar.m90634w(zaloView.m92691vK(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_register_enter_verification_code_requested_resend_otp), -1);
        m90634w3.m90644J(C27280g.m139660c(zaloView.m92689tK(), AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC28291a.snackbar_custom_color_green));
        m90634w3.m90642H(3000);
        m90634w3.m90648N();
    }

    /* renamed from: x */
    public static void m89276x(ZaloView zaloView, String str) {
        try {
            View findViewById = zaloView.m92676n2().getWindow().getDecorView().findViewById(R.id.content);
            if (findViewById != null) {
                Snackbar.m90634w(findViewById, str, -1).m90648N();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: y */
    public static void m89277y(ZaloView zaloView, String str, boolean z11) {
        Snackbar m90634w;
        try {
            View findViewById = zaloView.m92676n2().getWindow().getDecorView().findViewById(R.id.content);
            if (findViewById != null) {
                if (z11) {
                    m90634w = Snackbar.m90634w(findViewById, str, -1);
                    m90634w.m90644J(C27280g.m139659b(zaloView.m92689tK(), AbstractC2810d.zds_ic_check_circle_solid_24, AbstractC2808b.gr60));
                } else {
                    m90634w = Snackbar.m90634w(findViewById, str, -1);
                    m90634w.m90644J(C27280g.m139659b(zaloView.m92689tK(), AbstractC2810d.zds_ic_warning_solid_24, AbstractC2808b.f150830r60));
                }
                m90634w.m90645K(AbstractC17484n.Companion.m92930a()).m90648N();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Keep
    public static void showMess(boolean z11, String str) {
        showMess(z11, str, true, false, 1, AbstractC7409c0.toast_layout);
    }

    @Keep
    public static void showMess(boolean z11, CharSequence charSequence) {
        showMess(z11, charSequence, true, false, 1, AbstractC7409c0.toast_layout);
    }

    @Keep
    public static void showMess(boolean z11, CharSequence charSequence, boolean z12, boolean z13, int i11, int i12) {
        m89267o(z11, charSequence, z12, z13, false, i11, i12);
    }
}
